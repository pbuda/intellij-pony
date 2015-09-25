// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PonyTerm extends PsiElement {

  @Nullable
  PonyCap getCap();

  @NotNull
  List<PonyCaseexpr> getCaseexprList();

  @Nullable
  PonyElseif getElseif();

  @Nullable
  PonyIdseq getIdseq();

  @Nullable
  PonyPostfix getPostfix();

  @NotNull
  List<PonyRawseq> getRawseqList();

  @Nullable
  PonyTerm getTerm();

  @Nullable
  PonyType getType();

  @NotNull
  List<PonyWithelem> getWithelemList();

}
