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

package me.piotrbuda.intellij.pony.runner;

import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.runners.DefaultProgramRunner;
import org.jetbrains.annotations.NotNull;

public class PonyRunner extends DefaultProgramRunner {

    public static final String PONY_RUNNER_ID = "Pony Runner";

    @NotNull
    @Override
    public String getRunnerId() {
        return PONY_RUNNER_ID;
    }

    @Override
    public boolean canRun(@NotNull final String s, @NotNull final RunProfile runProfile) {
        //TODO: Implement a real check
        return true;
    }
}
