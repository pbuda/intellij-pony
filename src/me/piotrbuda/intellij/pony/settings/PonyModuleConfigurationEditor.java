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

package me.piotrbuda.intellij.pony.settings;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleConfigurationEditor;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.roots.ui.configuration.ClasspathEditor;
import com.intellij.openapi.roots.ui.configuration.DefaultModuleEditorsProvider;
import com.intellij.openapi.roots.ui.configuration.JavaContentEntriesEditor;
import com.intellij.openapi.roots.ui.configuration.ModuleConfigurationState;
import me.piotrbuda.intellij.pony.project.PonyModuleType;

public class PonyModuleConfigurationEditor extends DefaultModuleEditorsProvider {
    @Override
    public ModuleConfigurationEditor[] createEditors(final ModuleConfigurationState moduleConfigurationState) {
        Module module = moduleConfigurationState.getRootModel().getModule();
        if (!(ModuleType.get(module) instanceof PonyModuleType)) {
            return ModuleConfigurationEditor.EMPTY;
        }
        return new ModuleConfigurationEditor[]{
                new JavaContentEntriesEditor(module.getName(), moduleConfigurationState),
                new ClasspathEditor(moduleConfigurationState),
        };
    }
}
