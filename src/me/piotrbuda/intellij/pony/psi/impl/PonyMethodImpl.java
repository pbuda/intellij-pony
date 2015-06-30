// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PonyMethodImpl extends ASTWrapperPsiElement implements PonyMethod {

    public PonyMethodImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitMethod(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyCap getCap() {
        return findChildByClass(PonyCap.class);
    }

    @Override
    @Nullable
    public PonyParams getParams() {
        return findChildByClass(PonyParams.class);
    }

    @Override
    @Nullable
    public PonyRawseq getRawseq() {
        return findChildByClass(PonyRawseq.class);
    }

    @Override
    @Nullable
    public PonyType getType() {
        return findChildByClass(PonyType.class);
    }

    @Override
    @Nullable
    public PonyTypeparams getTypeparams() {
        return findChildByClass(PonyTypeparams.class);
    }

}
