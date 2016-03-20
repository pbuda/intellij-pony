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

package me.piotrbuda.intellij.pony.sdk;

import com.intellij.openapi.projectRoots.AdditionalDataConfigurable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkAdditionalData;
import com.intellij.openapi.projectRoots.SdkModel;
import com.intellij.openapi.projectRoots.SdkModificator;
import com.intellij.openapi.projectRoots.SdkType;
import me.piotrbuda.intellij.pony.util.CommandLine;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

public class PonySdkType extends SdkType {
    public static final String PONY_SDK_TYPE_ID = "PONY_SDK";

    public static PonySdkType getInstance() {
        return SdkType.findInstance(PonySdkType.class);
    }

    public PonySdkType() {
        super(PONY_SDK_TYPE_ID);
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        //TODO: Change this based on Windows/*NIX style systems
        //TODO: find real path by using which/where
        return "/usr/local/Cellar/ponyc/0.2.1";
    }

    @Override
    public boolean isValidSdkHome(final String s) {
        //TODO: make sure to make it work with symlinks (/usr/local/bin/ponyc vs /usr/local/Cellar/ponyc/0.1.7)
        return new File(s + "/bin/ponyc").exists();
    }

    @Override
    public String suggestSdkName(final String s, final String s1) {
        return "Pony";
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(final SdkModel sdkModel,
                                                                       final SdkModificator sdkModificator) {
        return null;
    }

    @Override
    public String getPresentableName() {
        return "Pony";
    }

    @Override
    public void saveAdditionalData(@NotNull final SdkAdditionalData sdkAdditionalData, @NotNull final Element element) {

    }

    @Nullable
    @Override
    public String getVersionString(final String sdkHome) {
        return CommandLine.execute("ponyc --version");
    }

    @Override
    public void setupSdkPaths(@NotNull final Sdk sdk) {
        final SdkModificator sdkModificator = sdk.getSdkModificator();
        sdkModificator.setVersionString(getVersionString(sdk.getHomePath()));
        sdkModificator.commitChanges();
    }


}
