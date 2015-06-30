// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyNextexprseqImpl extends ASTWrapperPsiElement implements PonyNextexprseq {

    public PonyNextexprseqImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitNextexprseq(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PonyNextassignment getNextassignment() {
        return findNotNullChildByClass(PonyNextassignment.class);
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
