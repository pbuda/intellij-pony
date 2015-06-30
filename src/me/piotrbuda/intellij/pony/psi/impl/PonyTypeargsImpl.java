// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PonyTypeargsImpl extends ASTWrapperPsiElement implements PonyTypeargs {

    public PonyTypeargsImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitTypeargs(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<PonyType> getTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyType.class);
    }

}
