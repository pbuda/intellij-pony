// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyExprseqImpl extends ASTWrapperPsiElement implements PonyExprseq {

    public PonyExprseqImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitExprseq(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PonyAssignment getAssignment() {
        return findNotNullChildByClass(PonyAssignment.class);
    }

    @Override
    @Nullable
    public PonyNosemi getNosemi() {
        return findChildByClass(PonyNosemi.class);
    }

    @Override
    @Nullable
    public PonySemiexpr getSemiexpr() {
        return findChildByClass(PonySemiexpr.class);
    }

}
