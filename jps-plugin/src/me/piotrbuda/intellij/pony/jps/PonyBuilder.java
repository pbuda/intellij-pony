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

import com.intellij.openapi.diagnostic.Logger;
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
import org.jetbrains.jps.incremental.resources.ResourcesBuilder;
import org.jetbrains.jps.incremental.resources.StandardResourceBuilderEnabler;
import org.jetbrains.jps.model.java.JpsJavaExtensionService;
import org.jetbrains.jps.model.module.JpsModule;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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
        runPonyc(target.getModule(), outputDirectory);
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

    private void runPonyc(@NotNull final JpsModule module, @NotNull final File outputDirectory) throws ProjectBuildException {
        final String moduleRoot = module.getContentRootsList().getUrls().get(0).substring("file://".length());
        final PonyJspInterface pony = new PonyJspInterface(new File(moduleRoot));
        pony.runBuild(outputDirectory);
    }
}
