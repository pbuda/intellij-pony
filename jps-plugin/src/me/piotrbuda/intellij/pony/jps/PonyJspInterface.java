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
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class PonyJspInterface {

    @NotNull
    private final File mainPony;

    PonyJspInterface(@NotNull final File mainPony) {
        this.mainPony = mainPony;
    }

    public Process runBuild() throws ExecutionException {
        return runCommand("ponyc");
    }

    private Process runCommand(@NotNull final String command) throws ExecutionException {
        return preparedCommandLine(command).createProcess();
    }

    private GeneralCommandLine preparedCommandLine(@NotNull final String command) {
        final GeneralCommandLine commandLine = new GeneralCommandLine();
        commandLine.withWorkDirectory(mainPony.getParentFile().getPath());
        commandLine.setRedirectErrorStream(true);
        commandLine.addParameter(command);
        return commandLine;
    }
}
