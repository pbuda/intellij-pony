// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface PonyMethod extends PsiElement {

    @Nullable
    PonyCap getCap();

    @Nullable
    PonyParams getParams();

    @Nullable
    PonyRawseq getRawseq();

    @Nullable
    PonyType getType();

    @Nullable
    PonyTypeparams getTypeparams();

}
