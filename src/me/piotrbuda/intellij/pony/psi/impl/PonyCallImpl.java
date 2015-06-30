// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyCallImpl extends ASTWrapperPsiElement implements PonyCall {

    public PonyCallImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitCall(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyNamed getNamed() {
        return findChildByClass(PonyNamed.class);
    }

    @Override
    @Nullable
    public PonyPositional getPositional() {
        return findChildByClass(PonyPositional.class);
    }

}
