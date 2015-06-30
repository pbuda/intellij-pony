// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.piotrbuda.intellij.pony.psi.impl.*;

public interface PonyTypes {

  IElementType ASSIGNMENT = new PonyElementType("ASSIGNMENT");
  IElementType ATOM = new PonyElementType("ATOM");
  IElementType ATOMTYPE = new PonyElementType("ATOMTYPE");
  IElementType BINOP = new PonyElementType("BINOP");
  IElementType CALL = new PonyElementType("CALL");
  IElementType CAP = new PonyElementType("CAP");
  IElementType CASEEXPR = new PonyElementType("CASEEXPR");
  IElementType CLASS_DEF = new PonyElementType("CLASS_DEF");
  IElementType DOT = new PonyElementType("DOT");
  IElementType ELSEIF = new PonyElementType("ELSEIF");
  IElementType EXPRSEQ = new PonyElementType("EXPRSEQ");
  IElementType FIELD = new PonyElementType("FIELD");
  IElementType IDSEQ = new PonyElementType("IDSEQ");
  IElementType INFIX = new PonyElementType("INFIX");
  IElementType INFIXTYPE = new PonyElementType("INFIXTYPE");
  IElementType ISECTTYPE = new PonyElementType("ISECTTYPE");
  IElementType JUMP = new PonyElementType("JUMP");
  IElementType LITERAL = new PonyElementType("LITERAL");
  IElementType MEMBERS = new PonyElementType("MEMBERS");
  IElementType METHOD = new PonyElementType("METHOD");
  IElementType NAMED = new PonyElementType("NAMED");
  IElementType NAMEDARG = new PonyElementType("NAMEDARG");
  IElementType NEXTASSIGNMENT = new PonyElementType("NEXTASSIGNMENT");
  IElementType NEXTATOM = new PonyElementType("NEXTATOM");
  IElementType NEXTEXPRSEQ = new PonyElementType("NEXTEXPRSEQ");
  IElementType NEXTINFIX = new PonyElementType("NEXTINFIX");
  IElementType NEXTPOSTFIX = new PonyElementType("NEXTPOSTFIX");
  IElementType NEXTTERM = new PonyElementType("NEXTTERM");
  IElementType NOMINAL = new PonyElementType("NOMINAL");
  IElementType NOSEMI = new PonyElementType("NOSEMI");
  IElementType PARAM = new PonyElementType("PARAM");
  IElementType PARAMS = new PonyElementType("PARAMS");
  IElementType POSITIONAL = new PonyElementType("POSITIONAL");
  IElementType POSTFIX = new PonyElementType("POSTFIX");
  IElementType RAWSEQ = new PonyElementType("RAWSEQ");
  IElementType SEMIEXPR = new PonyElementType("SEMIEXPR");
  IElementType TERM = new PonyElementType("TERM");
  IElementType TILDE = new PonyElementType("TILDE");
  IElementType TUPLE = new PonyElementType("TUPLE");
  IElementType TUPLETYPE = new PonyElementType("TUPLETYPE");
  IElementType TYPE = new PonyElementType("TYPE");
  IElementType TYPEARGS = new PonyElementType("TYPEARGS");
  IElementType TYPEPARAM = new PonyElementType("TYPEPARAM");
  IElementType TYPEPARAMS = new PonyElementType("TYPEPARAMS");
  IElementType TYPES = new PonyElementType("TYPES");
  IElementType UNIONTYPE = new PonyElementType("UNIONTYPE");
  IElementType USE = new PonyElementType("USE");
  IElementType USE_FFI = new PonyElementType("USE_FFI");
  IElementType WITHELEM = new PonyElementType("WITHELEM");

  IElementType FLOAT = new PonyTokenType("FLOAT");
  IElementType ID = new PonyTokenType("ID");
  IElementType INT = new PonyTokenType("INT");
  IElementType LPAREN_NEW = new PonyTokenType("LPAREN_NEW");
  IElementType LSQUARE_NEW = new PonyTokenType("LSQUARE_NEW");
  IElementType MINUS_NEW = new PonyTokenType("MINUS_NEW");
  IElementType STRING = new PonyTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ASSIGNMENT) {
        return new PonyAssignmentImpl(node);
      }
      else if (type == ATOM) {
        return new PonyAtomImpl(node);
      }
      else if (type == ATOMTYPE) {
        return new PonyAtomtypeImpl(node);
      }
      else if (type == BINOP) {
        return new PonyBinopImpl(node);
      }
      else if (type == CALL) {
        return new PonyCallImpl(node);
      }
      else if (type == CAP) {
        return new PonyCapImpl(node);
      }
      else if (type == CASEEXPR) {
        return new PonyCaseexprImpl(node);
      }
      else if (type == CLASS_DEF) {
        return new PonyClassDefImpl(node);
      }
      else if (type == DOT) {
        return new PonyDotImpl(node);
      }
      else if (type == ELSEIF) {
        return new PonyElseifImpl(node);
      }
      else if (type == EXPRSEQ) {
        return new PonyExprseqImpl(node);
      }
      else if (type == FIELD) {
        return new PonyFieldImpl(node);
      }
      else if (type == IDSEQ) {
        return new PonyIdseqImpl(node);
      }
      else if (type == INFIX) {
        return new PonyInfixImpl(node);
      }
      else if (type == INFIXTYPE) {
        return new PonyInfixtypeImpl(node);
      }
      else if (type == ISECTTYPE) {
        return new PonyIsecttypeImpl(node);
      }
      else if (type == JUMP) {
        return new PonyJumpImpl(node);
      }
      else if (type == LITERAL) {
        return new PonyLiteralImpl(node);
      }
      else if (type == MEMBERS) {
        return new PonyMembersImpl(node);
      }
      else if (type == METHOD) {
        return new PonyMethodImpl(node);
      }
      else if (type == NAMED) {
        return new PonyNamedImpl(node);
      }
      else if (type == NAMEDARG) {
        return new PonyNamedargImpl(node);
      }
      else if (type == NEXTASSIGNMENT) {
        return new PonyNextassignmentImpl(node);
      }
      else if (type == NEXTATOM) {
        return new PonyNextatomImpl(node);
      }
      else if (type == NEXTEXPRSEQ) {
        return new PonyNextexprseqImpl(node);
      }
      else if (type == NEXTINFIX) {
        return new PonyNextinfixImpl(node);
      }
      else if (type == NEXTPOSTFIX) {
        return new PonyNextpostfixImpl(node);
      }
      else if (type == NEXTTERM) {
        return new PonyNexttermImpl(node);
      }
      else if (type == NOMINAL) {
        return new PonyNominalImpl(node);
      }
      else if (type == NOSEMI) {
        return new PonyNosemiImpl(node);
      }
      else if (type == PARAM) {
        return new PonyParamImpl(node);
      }
      else if (type == PARAMS) {
        return new PonyParamsImpl(node);
      }
      else if (type == POSITIONAL) {
        return new PonyPositionalImpl(node);
      }
      else if (type == POSTFIX) {
        return new PonyPostfixImpl(node);
      }
      else if (type == RAWSEQ) {
        return new PonyRawseqImpl(node);
      }
      else if (type == SEMIEXPR) {
        return new PonySemiexprImpl(node);
      }
      else if (type == TERM) {
        return new PonyTermImpl(node);
      }
      else if (type == TILDE) {
        return new PonyTildeImpl(node);
      }
      else if (type == TUPLE) {
        return new PonyTupleImpl(node);
      }
      else if (type == TUPLETYPE) {
        return new PonyTupletypeImpl(node);
      }
      else if (type == TYPE) {
        return new PonyTypeImpl(node);
      }
      else if (type == TYPEARGS) {
        return new PonyTypeargsImpl(node);
      }
      else if (type == TYPEPARAM) {
        return new PonyTypeparamImpl(node);
      }
      else if (type == TYPEPARAMS) {
        return new PonyTypeparamsImpl(node);
      }
      else if (type == TYPES) {
        return new PonyTypesImpl(node);
      }
      else if (type == UNIONTYPE) {
        return new PonyUniontypeImpl(node);
      }
      else if (type == USE) {
        return new PonyUseImpl(node);
      }
      else if (type == USE_FFI) {
        return new PonyUseFfiImpl(node);
      }
      else if (type == WITHELEM) {
        return new PonyWithelemImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
