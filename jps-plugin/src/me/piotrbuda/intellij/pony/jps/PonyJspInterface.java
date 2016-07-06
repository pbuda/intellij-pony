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
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.SystemInfo;
import me.piotrbuda.intellij.pony.jps.model.JpsPonySdkType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.incremental.ProjectBuildException;
import org.jetbrains.jps.incremental.messages.BuildMessage;
import org.jetbrains.jps.incremental.messages.CompilerMessage;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.library.sdk.JpsSdk;
import org.jetbrains.jps.model.module.JpsModule;

public class PonyJspInterface {

    public static final Logger LOG = Logger.getInstance(PonyJspInterface.class);

    @NotNull
    private final File rootDir;
    private final File compilerFileName;

    PonyJspInterface(@NotNull JpsModule module, @NotNull CompileContext context) throws ProjectBuildException {
        final String moduleRoot = module.getContentRootsList().getUrls().get(0).substring("file://".length());
        this.rootDir = new File(moduleRoot);
        JpsSdk<JpsDummyElement> sdk = module.getSdk(JpsPonySdkType.INSTANCE);
        if (sdk == null)
        {
            String errorMessage = "No SDK for module " + module.getName();
            context.processMessage(new CompilerMessage("PonyBuilder", BuildMessage.Kind.ERROR, errorMessage));
            throw new ProjectBuildException(errorMessage);
        }
        compilerFileName = new File(sdk.getHomePath(), SystemInfo.isWindows ? "\\bin\\ponyc.exe" : "/bin/ponyc");
    }

    public GeneralCommandLine buildCommandLine(@NotNull final File outputDirectory) throws ProjectBuildException {
        final GeneralCommandLine commandLine = new GeneralCommandLine();
        commandLine.withWorkDirectory(rootDir.getPath());
        commandLine.setRedirectErrorStream(true);
        commandLine.setExePath(compilerFileName.getAbsolutePath());
        commandLine.addParameter("--output=" + outputDirectory.getPath());
        return commandLine;
    }
}
