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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildRootDescriptor;
import org.jetbrains.jps.builders.BuildTarget;

import java.io.File;

public class PonySourceRootDescriptor extends BuildRootDescriptor {

    private final File root;
    private final PonyTarget target;

    public PonySourceRootDescriptor(@NotNull final File root, @NotNull final PonyTarget target) {
        this.root = root;
        this.target = target;
    }

    @Override
    public String getRootId() {
        return root.getAbsolutePath();
    }

    @Override
    public File getRootFile() {
        return root;
    }

    @Override
    public BuildTarget<?> getTarget() {
        return target;
    }
}
