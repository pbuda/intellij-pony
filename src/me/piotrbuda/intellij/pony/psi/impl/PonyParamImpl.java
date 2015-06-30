// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyParamImpl extends ASTWrapperPsiElement implements PonyParam {

    public PonyParamImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitParam(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyInfix getInfix() {
        return findChildByClass(PonyInfix.class);
    }

    @Override
    @NotNull
    public PonyType getType() {
        return findNotNullChildByClass(PonyType.class);
    }

}
