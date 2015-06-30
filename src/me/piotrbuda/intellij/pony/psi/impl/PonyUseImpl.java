// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyUseImpl extends ASTWrapperPsiElement implements PonyUse {

    public PonyUseImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitUse(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyInfix getInfix() {
        return findChildByClass(PonyInfix.class);
    }

    @Override
    @Nullable
    public PonyUseFfi getUseFfi() {
        return findChildByClass(PonyUseFfi.class);
    }

}
