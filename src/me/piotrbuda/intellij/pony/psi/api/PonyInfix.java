// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PonyInfix extends PsiElement {

  @NotNull
  List<PonyBinop> getBinopList();

  @NotNull
  PonyTerm getTerm();

  @NotNull
  List<PonyType> getTypeList();

}
