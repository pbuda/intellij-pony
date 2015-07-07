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

package me.piotrbuda.intellij.pony.project;

import com.intellij.icons.AllIcons;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.ProjectJdkForModuleStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import me.piotrbuda.intellij.pony.sdk.PonySdkType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PonyModuleType extends ModuleType<PonyModuleBuilder> {

    public static final String ID = "PONY_MODULE";

    public static PonyModuleType getInstance() {
        return (PonyModuleType) ModuleTypeManager.getInstance().findByID(ID);
    }

    public PonyModuleType() {
        super(ID);
    }

    @NotNull
    @Override
    public PonyModuleBuilder createModuleBuilder() {
        return new PonyModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return "Pony";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Pony (description)";
    }

    @Override
    public Icon getBigIcon() {
        return AllIcons.General.Information;
    }

    @Override
    public Icon getNodeIcon(@Deprecated final boolean b) {
        return AllIcons.General.Information;
    }

    @NotNull
    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull final PonyModuleBuilder moduleBuilder, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{
                new ProjectJdkForModuleStep(wizardContext, PonySdkType.getInstance()) {
                    @Override
                    public void updateDataModel() {
                        moduleBuilder.setModuleJdk(getJdk());
                        super.updateDataModel();
                    }
                }
        };
    }
}
