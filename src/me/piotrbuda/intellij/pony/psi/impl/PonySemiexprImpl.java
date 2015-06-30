// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonySemiexprImpl extends ASTWrapperPsiElement implements PonySemiexpr {

    public PonySemiexprImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitSemiexpr(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyExprseq getExprseq() {
        return findChildByClass(PonyExprseq.class);
    }

    @Override
    @Nullable
    public PonyJump getJump() {
        return findChildByClass(PonyJump.class);
    }

}
