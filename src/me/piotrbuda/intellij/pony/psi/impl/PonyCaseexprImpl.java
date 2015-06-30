// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PonyCaseexprImpl extends ASTWrapperPsiElement implements PonyCaseexpr {

    public PonyCaseexprImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PonyVisitor) ((PonyVisitor) visitor).visitCaseexpr(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PonyInfix getInfix() {
        return findChildByClass(PonyInfix.class);
    }

    @Override
    @NotNull
    public List<PonyRawseq> getRawseqList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyRawseq.class);
    }

}
