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

import me.piotrbuda.intellij.pony.jps.model.JpsPonyModuleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.builders.BuildTargetLoader;
import org.jetbrains.jps.builders.ModuleBasedBuildTargetType;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.JpsModel;
import org.jetbrains.jps.model.module.JpsTypedModule;

import java.util.ArrayList;
import java.util.List;

public class PonyTargetType extends ModuleBasedBuildTargetType<PonyTarget> {

    public static final PonyTargetType PRODUCTION = new PonyTargetType("pony-production");
    public static final PonyTargetType TESTS = new PonyTargetType("pony-tests");

    private PonyTargetType(@NotNull final String pony) {
        super(pony);
    }

    @NotNull
    @Override
    public List<PonyTarget> computeAllTargets(@NotNull final JpsModel jpsModel) {
        List<PonyTarget> targets = new ArrayList<>();
        for (JpsTypedModule<JpsDummyElement> module : jpsModel.getProject().getModules(JpsPonyModuleType.INSTANCE)) {
            targets.add(new PonyTarget(module, this));
        }
        return targets;
    }

    @NotNull
    @Override
    public BuildTargetLoader<PonyTarget> createLoader(@NotNull final JpsModel jpsModel) {
        return new BuildTargetLoader<PonyTarget>() {
            @Nullable
            @Override
            public PonyTarget createTarget(@NotNull String targetId) {
                for (JpsTypedModule<JpsDummyElement> module : jpsModel.getProject().getModules(JpsPonyModuleType.INSTANCE)) {
                    if (module.getName().equals(targetId)) {
                        return new PonyTarget(module, PonyTargetType.this);
                    }
                }
                return null;
            }
        };
    }
}
