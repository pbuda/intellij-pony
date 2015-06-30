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

public class PonyPositionalImpl extends ASTWrapperPsiElement implements PonyPositional {

  public PonyPositionalImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PonyVisitor) ((PonyVisitor)visitor).visitPositional(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PonyRawseq> getRawseqList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PonyRawseq.class);
  }

}
