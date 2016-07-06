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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import com.intellij.util.containers.ContainerUtil;
import me.piotrbuda.intellij.pony.jps.model.JpsPonyModuleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.builders.BuildRootIndex;
import org.jetbrains.jps.builders.BuildTarget;
import org.jetbrains.jps.builders.BuildTargetRegistry;
import org.jetbrains.jps.builders.ModuleBasedTarget;
import org.jetbrains.jps.builders.TargetOutputIndex;
import org.jetbrains.jps.builders.storage.BuildDataPaths;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.indices.IgnoredFileIndex;
import org.jetbrains.jps.indices.ModuleExcludeIndex;
import org.jetbrains.jps.model.JpsModel;
import org.jetbrains.jps.model.java.JavaSourceRootProperties;
import org.jetbrains.jps.model.java.JavaSourceRootType;
import org.jetbrains.jps.model.java.JpsJavaClasspathKind;
import org.jetbrains.jps.model.java.JpsJavaExtensionService;
import org.jetbrains.jps.model.module.JpsModule;
import org.jetbrains.jps.model.module.JpsTypedModuleSourceRoot;

public class PonyTarget extends ModuleBasedTarget<PonySourceRootDescriptor> {

    public PonyTarget(@NotNull final JpsModule jpsModule, @NotNull final PonyTargetType ponyTargetType) {
        super(ponyTargetType, jpsModule);
    }

    @Override
    public boolean isTests() {
        return getPonyTargetType().isTests();
    }

    @Override
    public String getId() {
        return myModule.getName();
    }

    @Override
    public Collection<BuildTarget<?>> computeDependencies(BuildTargetRegistry buildTargetRegistry, TargetOutputIndex targetOutputIndex) {
        List<BuildTarget<?>> dependencies = new ArrayList<>();
        Set<JpsModule> modules = JpsJavaExtensionService.dependencies(myModule).includedIn(JpsJavaClasspathKind.compile(isTests())).getModules();
        for (JpsModule module : modules) {
            if (module.getModuleType().equals(JpsPonyModuleType.INSTANCE)) {
                dependencies.add(new PonyTarget(module, getPonyTargetType()));
            }
        }
        if (isTests()) {
            dependencies.add(new PonyTarget(myModule, PonyTargetType.PRODUCTION));
        }
        return dependencies;
    }

    @NotNull
    private PonyTargetType getPonyTargetType() {
        return (PonyTargetType) getTargetType();
    }

    @NotNull
    @Override
    public List<PonySourceRootDescriptor> computeRootDescriptors(JpsModel jpsModel, ModuleExcludeIndex moduleExcludeIndex, IgnoredFileIndex ignoredFileIndex, BuildDataPaths buildDataPaths) {
        List<PonySourceRootDescriptor> result = new ArrayList<>();
        JavaSourceRootType type = isTests() ? JavaSourceRootType.TEST_SOURCE : JavaSourceRootType.SOURCE;
        for (JpsTypedModuleSourceRoot<JavaSourceRootProperties> root : myModule.getSourceRoots(type)) {
            result.add(new PonySourceRootDescriptor(root.getFile(), this));
        }
        return result;
    }

    @Nullable
    @Override
    public PonySourceRootDescriptor findRootDescriptor(@NotNull final String rootId, @NotNull final BuildRootIndex rootIndex) {
        return ContainerUtil.getFirstItem(rootIndex.getRootDescriptors(new File(rootId), Collections.singletonList(getPonyTargetType()), null));
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Pony";
    }

    @NotNull
    @Override
    public Collection<File> getOutputRoots(CompileContext compileContext) {
        return ContainerUtil.createMaybeSingletonList(JpsJavaExtensionService.getInstance().getOutputDirectory(myModule, isTests()));
    }
}
