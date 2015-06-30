// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PonyNamedImpl extends ASTWrapperPsiElement implements PonyNamed {

    public PonyNamedImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitNamed(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<PonyNamedarg> getNamedargList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyNamedarg.class);
    }

}
