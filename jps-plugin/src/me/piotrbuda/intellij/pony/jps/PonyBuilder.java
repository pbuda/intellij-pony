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

import com.intellij.execution.ExecutionException;
import me.piotrbuda.intellij.pony.jps.model.JpsPonyModuleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.ModuleChunk;
import org.jetbrains.jps.builders.DirtyFilesHolder;
import org.jetbrains.jps.builders.java.JavaSourceRootDescriptor;
import org.jetbrains.jps.incremental.BuilderCategory;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.incremental.ModuleBuildTarget;
import org.jetbrains.jps.incremental.ModuleLevelBuilder;
import org.jetbrains.jps.incremental.ProjectBuildException;
import org.jetbrains.jps.incremental.messages.BuildMessage;
import org.jetbrains.jps.incremental.messages.CompilerMessage;
import org.jetbrains.jps.incremental.messages.ProgressMessage;
import org.jetbrains.jps.model.module.JpsModule;

import java.io.File;
import java.io.IOException;

public class PonyBuilder extends ModuleLevelBuilder {

    public PonyBuilder() {
        super(BuilderCategory.TRANSLATOR);
    }

    @Override
    public ExitCode build(final CompileContext compileContext,
                          final ModuleChunk moduleChunk,
                          final DirtyFilesHolder<JavaSourceRootDescriptor, ModuleBuildTarget> dirtyFilesHolder,
                          final OutputConsumer outputConsumer) throws ProjectBuildException, IOException {
        try {
            for (final JpsModule jpsModule : moduleChunk.getModules()) {
                if (!jpsModule.getModuleType().equals(JpsPonyModuleType.INSTANCE)) {
                    continue;
                }

                final String moduleRoot = jpsModule.getContentRootsList().getUrls().get(0).substring("file://".length());
                final PonyJspInterface pony = new PonyJspInterface(new File(moduleRoot + "/main.pony"));
                compileContext.processMessage(new ProgressMessage("Pony build"));
                compileContext.processMessage(new CompilerMessage("Pony", BuildMessage.Kind.INFO, "Starting Pony build"));

                final Process process = pony.runBuild();
                if (process.waitFor() != 0) {
                    compileContext.processMessage(new CompilerMessage("Pony", BuildMessage.Kind.ERROR, "Compilation errors"));
                }
            }
            return ExitCode.OK;
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return ExitCode.ABORT;
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Pony builder";
    }
}
