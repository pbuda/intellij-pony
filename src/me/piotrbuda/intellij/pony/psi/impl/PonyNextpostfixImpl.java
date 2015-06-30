// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PonyNextpostfixImpl extends ASTWrapperPsiElement implements PonyNextpostfix {

    public PonyNextpostfixImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitNextpostfix(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<PonyCall> getCallList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyCall.class);
    }

    @Override
    @NotNull
    public List<PonyDot> getDotList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyDot.class);
    }

    @Override
    @NotNull
    public PonyNextatom getNextatom() {
        return findNotNullChildByClass(PonyNextatom.class);
    }

    @Override
    @NotNull
    public List<PonyTilde> getTildeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyTilde.class);
    }

    @Override
    @NotNull
    public List<PonyTypeargs> getTypeargsList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyTypeargs.class);
    }

}
