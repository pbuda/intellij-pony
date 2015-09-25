// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PonyInfixtype extends PsiElement {

  @NotNull
  List<PonyIsecttype> getIsecttypeList();

  @NotNull
  PonyType getType();

  @NotNull
  List<PonyUniontype> getUniontypeList();

}
