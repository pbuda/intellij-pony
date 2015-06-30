// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PonyNextpostfix extends PsiElement {

  @NotNull
  List<PonyCall> getCallList();

  @NotNull
  List<PonyDot> getDotList();

  @NotNull
  PonyNextatom getNextatom();

  @NotNull
  List<PonyTilde> getTildeList();

  @NotNull
  List<PonyTypeargs> getTypeargsList();

}
