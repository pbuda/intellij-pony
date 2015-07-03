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
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.builders.*;
import org.jetbrains.jps.builders.storage.BuildDataPaths;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.indices.IgnoredFileIndex;
import org.jetbrains.jps.indices.ModuleExcludeIndex;
import org.jetbrains.jps.model.JpsModel;
import org.jetbrains.jps.model.module.JpsModule;

import java.io.File;
import java.util.Collection;
import java.util.List;

public class PonyTarget extends ModuleBasedTarget<PonySourceRootDescriptor> {

    public PonyTarget(@NotNull final JpsModule jpsModule, @NotNull final PonyTargetType ponyTargetType) {
        super(ponyTargetType, jpsModule);
    }

    @Override
    public boolean isTests() {
        return false;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public Collection<BuildTarget<?>> computeDependencies(BuildTargetRegistry buildTargetRegistry, TargetOutputIndex targetOutputIndex) {
        return null;
    }

    @NotNull
    @Override
    public List<PonySourceRootDescriptor> computeRootDescriptors(JpsModel jpsModel, ModuleExcludeIndex moduleExcludeIndex, IgnoredFileIndex ignoredFileIndex, BuildDataPaths buildDataPaths) {
        return null;
    }

    @Nullable
    @Override
    public PonySourceRootDescriptor findRootDescriptor(String s, BuildRootIndex buildRootIndex) {
        return null;
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return null;
    }

    @NotNull
    @Override
    public Collection<File> getOutputRoots(CompileContext compileContext) {
        return null;
    }
}
