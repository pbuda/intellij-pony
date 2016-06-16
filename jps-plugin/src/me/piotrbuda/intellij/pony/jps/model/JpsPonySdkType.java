package me.piotrbuda.intellij.pony.jps.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.JpsElementFactory;
import org.jetbrains.jps.model.JpsElementTypeWithDefaultProperties;
import org.jetbrains.jps.model.library.sdk.JpsSdkType;

public class JpsPonySdkType extends JpsSdkType<JpsDummyElement> implements JpsElementTypeWithDefaultProperties<JpsDummyElement> {

    public static final JpsPonySdkType INSTANCE = new JpsPonySdkType();

    @NotNull
    @Override
    public JpsDummyElement createDefaultProperties()
    {
        return JpsElementFactory.getInstance().createDummyElement();
    }
}
