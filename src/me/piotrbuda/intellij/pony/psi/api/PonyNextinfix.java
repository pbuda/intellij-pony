// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface PonyNextinfix extends PsiElement {

    @NotNull
    List<PonyBinop> getBinopList();

    @NotNull
    PonyNextterm getNextterm();

    @NotNull
    List<PonyType> getTypeList();

}
