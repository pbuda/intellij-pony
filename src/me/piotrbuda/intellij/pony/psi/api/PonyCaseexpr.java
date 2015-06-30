// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface PonyCaseexpr extends PsiElement {

    @Nullable
    PonyInfix getInfix();

    @NotNull
    List<PonyRawseq> getRawseqList();

}
