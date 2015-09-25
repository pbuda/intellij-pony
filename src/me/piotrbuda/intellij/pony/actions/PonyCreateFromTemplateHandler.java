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

import com.intellij.ide.fileTemplates.DefaultCreateFromTemplateHandler;
import com.intellij.ide.fileTemplates.FileTemplate;
import me.piotrbuda.intellij.pony.PonyFileType;

import java.util.Map;

public class PonyCreateFromTemplateHandler extends DefaultCreateFromTemplateHandler {
    @Override
    public boolean handlesTemplate(final FileTemplate template) {
        return template.isTemplateOfType(PonyFileType.INSTANCE);
    }

    @Override
    public void prepareProperties(final Map<String, Object> props) {
        final String name = (String) props.get(FileTemplate.ATTRIBUTE_NAME);
        props.put(FileTemplate.ATTRIBUTE_NAME + "_PONY", Character.toUpperCase(name.charAt(0)) + name.substring(1));
    }
}
