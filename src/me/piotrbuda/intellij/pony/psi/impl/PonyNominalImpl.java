// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyNominalImpl extends ASTWrapperPsiElement implements PonyNominal {

    public PonyNominalImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitNominal(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyCap getCap() {
        return findChildByClass(PonyCap.class);
    }

    @Override
    @Nullable
    public PonyTypeargs getTypeargs() {
        return findChildByClass(PonyTypeargs.class);
    }

}
