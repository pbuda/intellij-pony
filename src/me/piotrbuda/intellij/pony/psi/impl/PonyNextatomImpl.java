// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyNextatomImpl extends ASTWrapperPsiElement implements PonyNextatom {

    public PonyNextatomImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitNextatom(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyLiteral getLiteral() {
        return findChildByClass(PonyLiteral.class);
    }

    @Override
    @Nullable
    public PonyMembers getMembers() {
        return findChildByClass(PonyMembers.class);
    }

    @Override
    @Nullable
    public PonyNamed getNamed() {
        return findChildByClass(PonyNamed.class);
    }

    @Override
    @Nullable
    public PonyParams getParams() {
        return findChildByClass(PonyParams.class);
    }

    @Override
    @Nullable
    public PonyPositional getPositional() {
        return findChildByClass(PonyPositional.class);
    }

    @Override
    @Nullable
    public PonyRawseq getRawseq() {
        return findChildByClass(PonyRawseq.class);
    }

    @Override
    @Nullable
    public PonyTuple getTuple() {
        return findChildByClass(PonyTuple.class);
    }

    @Override
    @Nullable
    public PonyType getType() {
        return findChildByClass(PonyType.class);
    }

    @Override
    @Nullable
    public PonyTypeargs getTypeargs() {
        return findChildByClass(PonyTypeargs.class);
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
