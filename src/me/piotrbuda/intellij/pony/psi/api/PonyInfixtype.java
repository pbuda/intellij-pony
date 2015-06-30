// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface PonyInfixtype extends PsiElement {

    @NotNull
    List<PonyIsecttype> getIsecttypeList();

    @NotNull
    PonyType getType();

    @NotNull
    List<PonyUniontype> getUniontypeList();

}
