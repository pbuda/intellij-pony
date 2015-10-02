package me.piotrbuda.intellij.pony.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.*;
import com.intellij.psi.TokenType;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.*;

%%

%{
  public PonyLexer() {
    this((java.io.Reader)null);
  }
%}

%class PonyLexer
%implements FlexLexer
%unicode
%public
%function advance
%type IElementType
%eof{
    return;
%eof}

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f] | {CRLF}
ID = (_ | [:jletter:] | [:jletterdigit:])*
CLASS_DEF = "type" | "interface" | "trait" | "primitive" | "class" | "actor"

%%

<YYINITIAL> {CLASS_DEF} { return CLASS_DEF; }
<YYINITIAL> {ID} {return ID;}
<YYINITIAL> {WHITE_SPACE}+  { return com.intellij.psi.TokenType.WHITE_SPACE; }

<YYINITIAL> . { return com.intellij.psi.TokenType.BAD_CHARACTER; }