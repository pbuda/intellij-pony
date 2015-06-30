// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PonyMembersImpl extends ASTWrapperPsiElement implements PonyMembers {

    public PonyMembersImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitMembers(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<PonyField> getFieldList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyField.class);
    }

    @Override
    @NotNull
    public List<PonyMethod> getMethodList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyMethod.class);
    }

}
