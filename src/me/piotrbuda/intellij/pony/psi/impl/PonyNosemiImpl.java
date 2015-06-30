// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyNosemiImpl extends ASTWrapperPsiElement implements PonyNosemi {

    public PonyNosemiImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitNosemi(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyJump getJump() {
        return findChildByClass(PonyJump.class);
    }

    @Override
    @Nullable
    public PonyNextexprseq getNextexprseq() {
        return findChildByClass(PonyNextexprseq.class);
    }

}
