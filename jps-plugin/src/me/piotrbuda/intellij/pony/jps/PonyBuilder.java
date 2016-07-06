/*
 * Copyright 2015 Piotr Buda
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.piotrbuda.intellij.pony.jps;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.BaseOSProcessHandler;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.execution.process.ProcessListener;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.io.FileUtil;
import me.piotrbuda.intellij.pony.jps.model.JpsPonyModuleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildOutputConsumer;
import org.jetbrains.jps.builders.DirtyFilesHolder;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.incremental.ProjectBuildException;
import org.jetbrains.jps.incremental.TargetBuilder;
import org.jetbrains.jps.incremental.messages.BuildMessage;
import org.jetbrains.jps.incremental.messages.CompilerMessage;
import org.jetbrains.jps.incremental.messages.ProgressMessage;
import org.jetbrains.jps.incremental.resources.ResourcesBuilder;
import org.jetbrains.jps.incremental.resources.StandardResourceBuilderEnabler;
import org.jetbrains.jps.model.java.JpsJavaExtensionService;
import org.jetbrains.jps.model.module.JpsModule;

public class PonyBuilder extends TargetBuilder<PonySourceRootDescriptor, PonyTarget> {

    public static final Logger LOG = Logger.getInstance(PonyBuilder.class);

    public PonyBuilder() {
        super(Arrays.asList(PonyTargetType.PRODUCTION, PonyTargetType.TESTS));
        ResourcesBuilder.registerEnabler(new StandardResourceBuilderEnabler() {
            @Override
            public boolean isResourceProcessingEnabled(@NotNull JpsModule module) {
                return !(module.getModuleType() instanceof JpsPonyModuleType);
            }
        });
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Pony builder";
    }

    @Override
    public void build(@NotNull PonyTarget target,
                      @NotNull DirtyFilesHolder<PonySourceRootDescriptor, PonyTarget> dirtyFilesHolder,
                      @NotNull BuildOutputConsumer buildOutputConsumer,
                      @NotNull CompileContext compileContext) throws ProjectBuildException, IOException {
        System.out.println(target.getOutputRoots(compileContext));
        File outputDirectory = getBuildOutputDirectory(target.getModule(), false, compileContext);
        compileContext.processMessage(new ProgressMessage("Compiling Pony sources"));
        runPonyc(target.getModule(), outputDirectory, compileContext);
        compileContext.checkCanceled();
        compileContext.processMessage(new ProgressMessage(""));
    }

    private void runPonyc(@NotNull final JpsModule module, @NotNull final File outputDirectory, @NotNull CompileContext compileContext) throws ProjectBuildException
    {

        final PonyJspInterface pony = new PonyJspInterface(module, compileContext);
        GeneralCommandLine commandLine = pony.buildCommandLine(outputDirectory);
        Process process = null;
        try {
            process = commandLine.createProcess();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        BaseOSProcessHandler handler = new BaseOSProcessHandler(process, commandLine.getCommandLineString(), Charset.defaultCharset());
        handler.addProcessListener(new PonyCProcessListener(compileContext));
        handler.startNotify();
        handler.waitFor();
    }

    @NotNull
    private static File getBuildOutputDirectory(@NotNull JpsModule module,
                                                boolean forTests,
                                                @NotNull CompileContext context) throws ProjectBuildException {
        JpsJavaExtensionService instance = JpsJavaExtensionService.getInstance();
        File outputDirectory = instance.getOutputDirectory(module, forTests);
        if (outputDirectory == null) {
            String errorMessage = "No output dir for module " + module.getName();
            context.processMessage(new CompilerMessage("ponyc", BuildMessage.Kind.ERROR, errorMessage));
            throw new ProjectBuildException(errorMessage);
        }
        if (!outputDirectory.exists()) {
            FileUtil.createDirectory(outputDirectory);
        }
        return outputDirectory;
    }

    private static class PonyCProcessListener implements ProcessListener {

        private static final Pattern ERROR_LOCATION_PATTERN = Pattern.compile("(.*):(\\d+):(\\d+): (.*)");

        enum ParsingState {
            START,
            ERROR_FOUND,
            ERROR_LOCATION,
            ERROR_LINE_QUOTE,
        }

        private final CompileContext compileContext;
        private ParsingState parsingState = ParsingState.START;

        public PonyCProcessListener(@NotNull CompileContext compileContext) {
            this.compileContext = compileContext;
        }

        @Override
        public void startNotified(@NotNull ProcessEvent event) {
            parsingState = ParsingState.START;
        }

        @Override
        public void processTerminated(@NotNull ProcessEvent event) {
            parsingState = ParsingState.START;
        }

        @Override
        public void processWillTerminate(@NotNull ProcessEvent event, boolean b) {
        }

        @Override
        public void onTextAvailable(@NotNull ProcessEvent event, @NotNull Key key) {
            String line = event.getText();
            switch (parsingState) {
                case START:
                    if (line.startsWith("Error:")) {
                        parsingState = ParsingState.ERROR_FOUND;
                    }
                    break;
                case ERROR_FOUND:
                    Matcher matcher = ERROR_LOCATION_PATTERN.matcher(line);
                    if (matcher.find()) {
                        String sourcePath = matcher.group(1);
                        long lineNo = Long.parseLong(matcher.group(2));
                        long columnNo = Long.parseLong(matcher.group(3));
                        String errorMessage = matcher.group(4);
                        compileContext.processMessage(new CompilerMessage("ponyc", BuildMessage.Kind.ERROR, errorMessage, sourcePath, -1, -1, -1, lineNo, columnNo));
                        parsingState = ParsingState.ERROR_LOCATION;
                    }
                    break;
                case ERROR_LOCATION:
                    parsingState = ParsingState.ERROR_LINE_QUOTE;
                    break;
                case ERROR_LINE_QUOTE:
                    if (line.contains("^")) {
                        parsingState = ParsingState.START;
                    }
                    break;
            }
        }
    }
}
