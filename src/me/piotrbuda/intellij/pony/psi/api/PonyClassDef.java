// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PonyClassDef extends PsiElement {

  @Nullable
  PonyCap getCap();

  @NotNull
  PonyMembers getMembers();

  @Nullable
  PonyTypeparams getTypeparams();

  @Nullable
  PonyTypes getTypes();

}
