// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyClassDefImpl extends ASTWrapperPsiElement implements PonyClassDef {

    public PonyClassDefImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitClassDef(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyCap getCap() {
        return findChildByClass(PonyCap.class);
    }

    @Override
    @NotNull
    public PonyMembers getMembers() {
        return findNotNullChildByClass(PonyMembers.class);
    }

    @Override
    @Nullable
    public PonyTypeparams getTypeparams() {
        return findChildByClass(PonyTypeparams.class);
    }

    @Override
    @Nullable
    public PonyTypes getTypes() {
        return findChildByClass(PonyTypes.class);
    }

}
