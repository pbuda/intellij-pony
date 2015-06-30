// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyNextassignmentImpl extends ASTWrapperPsiElement implements PonyNextassignment {

    public PonyNextassignmentImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitNextassignment(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyAssignment getAssignment() {
        return findChildByClass(PonyAssignment.class);
    }

    @Override
    @NotNull
    public PonyNextinfix getNextinfix() {
        return findNotNullChildByClass(PonyNextinfix.class);
    }

}
