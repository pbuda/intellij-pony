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

package me.piotrbuda.intellij.pony.actions;

import com.intellij.icons.AllIcons;
import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;

public class CreatePonyFileAction extends CreateFileFromTemplateAction implements DumbAware {

    public static final String NEW_PONY_FILE = "New Pony File";

    public CreatePonyFileAction() {
        super(NEW_PONY_FILE, "", AllIcons.FileTypes.Custom);
    }

    @Override
    protected void buildDialog(final Project project,
                               final PsiDirectory directory,
                               final CreateFileFromTemplateDialog.Builder builder) {
        builder
                .setTitle(NEW_PONY_FILE)
                .addKind("Pony Class", AllIcons.FileTypes.Custom, "Pony Class")
                .addKind("Pony Actor", AllIcons.FileTypes.Custom, "Pony Actor")
                .addKind("Pony Interface", AllIcons.FileTypes.Custom, "Pony Interface")
                .addKind("Pony Trait", AllIcons.FileTypes.Custom, "Pony Trait")
                .addKind("Pony Primitive", AllIcons.FileTypes.Custom, "Pony Primitive");
    }

    @Override
    protected String getActionName(final PsiDirectory directory, final String newName, final String templateName) {
        return NEW_PONY_FILE;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CreatePonyFileAction;
    }

}
