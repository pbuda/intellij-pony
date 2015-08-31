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
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.incremental.ProjectBuildException;

import java.io.File;

public class PonyJspInterface {

    public static final Logger LOG = Logger.getInstance(PonyJspInterface.class);

    @NotNull
    private final File rootDir;

    PonyJspInterface(@NotNull final File rootDir) {
        this.rootDir = rootDir;
    }

    public Process runBuild(@NotNull final File outputDirectory) throws ProjectBuildException {
        try {
            final GeneralCommandLine commandLine = new GeneralCommandLine();
            commandLine.withWorkDirectory(rootDir.getPath());
            commandLine.setRedirectErrorStream(true);
            commandLine.setExePath("ponyc");
            commandLine.addParameter("--output=" + outputDirectory.getPath());
            return commandLine.createProcess();
        } catch (ExecutionException e) {
            LOG.warn("Error executing Pony compiler", e);
            throw new ProjectBuildException("Failed to launch Pony compiler");
        }
    }
}
