// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class PonyBinopImpl extends ASTWrapperPsiElement implements PonyBinop {

    public PonyBinopImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitBinop(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PonyTerm getTerm() {
        return findNotNullChildByClass(PonyTerm.class);
    }

}
