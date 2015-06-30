// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyUseFfiImpl extends ASTWrapperPsiElement implements PonyUseFfi {

    public PonyUseFfiImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitUseFfi(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyParams getParams() {
        return findChildByClass(PonyParams.class);
    }

    @Override
    @NotNull
    public PonyTypeargs getTypeargs() {
        return findNotNullChildByClass(PonyTypeargs.class);
    }

}
