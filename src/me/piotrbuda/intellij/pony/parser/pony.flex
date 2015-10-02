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
FLOAT = [:digit:] "." [:digit:]
ID = (_ | [:jletter:] | [:jletterdigit:])*
INT = [:digit:]
LPAREN_NEW = "("
LSQUARE_NEW = "["
MINUS_NEW = "-"
STRING = \"

%s IN_STRING

%%

<YYINITIAL> {
 {INT} {return INT;}
 {FLOAT} {return FLOAT;}
 {ID} {return ID;}
 {LPAREN_NEW} {return LPAREN_NEW;}
 {LSQUARE_NEW} {return LSQUARE_NEW;}
 {MINUS_NEW} {return MINUS_NEW;}
 {STRING} {yybegin(IN_STRING);}
 {WHITE_SPACE}+  { return com.intellij.psi.TokenType.WHITE_SPACE; }
 . { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}

<IN_STRING> \" {yybegin(YYINITIAL);}
