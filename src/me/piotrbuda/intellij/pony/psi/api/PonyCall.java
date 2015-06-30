// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface PonyCall extends PsiElement {

    @Nullable
    PonyNamed getNamed();

    @Nullable
    PonyPositional getPositional();

}
