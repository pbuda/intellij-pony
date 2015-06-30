// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.piotrbuda.intellij.pony.psi.api.*;

public class PonyTermImpl extends ASTWrapperPsiElement implements PonyTerm {

  public PonyTermImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PonyVisitor) ((PonyVisitor)visitor).visitTerm(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PonyCap getCap() {
    return findChildByClass(PonyCap.class);
  }

  @Override
  @NotNull
  public List<PonyCaseexpr> getCaseexprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyCaseexpr.class);
  }

  @Override
  @Nullable
  public PonyElseif getElseif() {
    return findChildByClass(PonyElseif.class);
  }

  @Override
  @Nullable
  public PonyIdseq getIdseq() {
    return findChildByClass(PonyIdseq.class);
  }

  @Override
  @Nullable
  public PonyPostfix getPostfix() {
    return findChildByClass(PonyPostfix.class);
  }

  @Override
  @NotNull
  public List<PonyRawseq> getRawseqList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyRawseq.class);
  }

  @Override
  @Nullable
  public PonyTerm getTerm() {
    return findChildByClass(PonyTerm.class);
  }

  @Override
  @Nullable
  public PonyType getType() {
    return findChildByClass(PonyType.class);
  }

  @Override
  @NotNull
  public List<PonyWithelem> getWithelemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyWithelem.class);
  }

}
