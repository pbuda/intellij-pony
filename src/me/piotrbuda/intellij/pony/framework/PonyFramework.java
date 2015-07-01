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

package me.piotrbuda.intellij.pony.framework;

import com.intellij.framework.FrameworkTypeEx;
import com.intellij.framework.addSupport.FrameworkSupportInModuleConfigurable;
import com.intellij.framework.addSupport.FrameworkSupportInModuleProvider;
import com.intellij.icons.AllIcons;
import com.intellij.ide.util.frameworkSupport.FrameworkSupportModel;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.roots.ModifiableModelsProvider;
import com.intellij.openapi.roots.ModifiableRootModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PonyFramework extends FrameworkTypeEx {
    public static final String FRAMEWORK_ID = "PONY";

    public PonyFramework() {
        super(FRAMEWORK_ID);
    }

    @NotNull
    @Override
    public FrameworkSupportInModuleProvider createProvider() {
        return new FrameworkSupportInModuleProvider() {
            @NotNull
            @Override
            public FrameworkTypeEx getFrameworkType() {
                return PonyFramework.this;
            }

            @NotNull
            @Override
            public FrameworkSupportInModuleConfigurable createConfigurable(@NotNull final FrameworkSupportModel frameworkSupportModel) {
                return new FrameworkSupportInModuleConfigurable() {
                    @Nullable
                    @Override
                    public JComponent createComponent() {
                        return new JLabel(("Extra options"));
                    }

                    @Override
                    public void addSupport(@NotNull final Module module,
                                           @NotNull final ModifiableRootModel modifiableRootModel,
                                           @NotNull final ModifiableModelsProvider modifiableModelsProvider) {
                        //TODO: setup Pony library
                    }
                };
            }

            @Override
            public boolean isEnabledForModuleType(@NotNull final ModuleType moduleType) {
                //TODO: Implement when project wizard is added with corresponding ModuleType
                return true;
            }
        };
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Pony";
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return AllIcons.General.Information;
    }
}
