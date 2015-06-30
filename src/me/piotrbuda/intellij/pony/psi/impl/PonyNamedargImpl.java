// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class PonyNamedargImpl extends ASTWrapperPsiElement implements PonyNamedarg {

    public PonyNamedargImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitNamedarg(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PonyRawseq getRawseq() {
        return findNotNullChildByClass(PonyRawseq.class);
    }

}
