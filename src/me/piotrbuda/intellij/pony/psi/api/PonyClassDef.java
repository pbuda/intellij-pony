// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface PonyClassDef extends PsiElement {

    @Nullable
    PonyCap getCap();

    @NotNull
    PonyMembers getMembers();

    @Nullable
    PonyTypeparams getTypeparams();

    @Nullable
    PonyTypes getTypes();

}
