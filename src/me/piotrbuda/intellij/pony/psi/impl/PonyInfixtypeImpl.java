// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PonyInfixtypeImpl extends ASTWrapperPsiElement implements PonyInfixtype {

    public PonyInfixtypeImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitInfixtype(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<PonyIsecttype> getIsecttypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyIsecttype.class);
    }

    @Override
    @NotNull
    public PonyType getType() {
        return findNotNullChildByClass(PonyType.class);
    }

    @Override
    @NotNull
    public List<PonyUniontype> getUniontypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyUniontype.class);
    }

}
