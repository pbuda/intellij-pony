// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyTypeImpl extends ASTWrapperPsiElement implements PonyType {

    public PonyTypeImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitType(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PonyAtomtype getAtomtype() {
        return findNotNullChildByClass(PonyAtomtype.class);
    }

    @Override
    @Nullable
    public PonyType getType() {
        return findChildByClass(PonyType.class);
    }

}
