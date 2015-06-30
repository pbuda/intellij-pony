// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface PonyNextpostfix extends PsiElement {

    @NotNull
    List<PonyCall> getCallList();

    @NotNull
    List<PonyDot> getDotList();

    @NotNull
    PonyNextatom getNextatom();

    @NotNull
    List<PonyTilde> getTildeList();

    @NotNull
    List<PonyTypeargs> getTypeargsList();

}
