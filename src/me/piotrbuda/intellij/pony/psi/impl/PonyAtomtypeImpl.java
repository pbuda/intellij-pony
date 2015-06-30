// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyAtomtypeImpl extends ASTWrapperPsiElement implements PonyAtomtype {

    public PonyAtomtypeImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitAtomtype(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyInfixtype getInfixtype() {
        return findChildByClass(PonyInfixtype.class);
    }

    @Override
    @Nullable
    public PonyNominal getNominal() {
        return findChildByClass(PonyNominal.class);
    }

    @Override
    @Nullable
    public PonyTupletype getTupletype() {
        return findChildByClass(PonyTupletype.class);
    }

}
