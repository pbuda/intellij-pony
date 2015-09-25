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

public class PonyCallImpl extends ASTWrapperPsiElement implements PonyCall {

  public PonyCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PonyVisitor) ((PonyVisitor)visitor).visitCall(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PonyNamed getNamed() {
    return findChildByClass(PonyNamed.class);
  }

  @Override
  @Nullable
  public PonyPositional getPositional() {
    return findChildByClass(PonyPositional.class);
  }

}
