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
RPAREN = ")"
RSQUARE = "]"
MINUS_NEW = "-"
STRING = \" .* \"
BEGIN_RAWSEQ = "=>"
BEGIN_TYPE = ":"
DOTS = "."
PONY_USE = "use"
PONY_IF = "if"
PONY_AT = "@"
PONY_QUESTION = "?"
PONY_ACTOR = "actor"

%%

<YYINITIAL> {
{PONY_ACTOR} {return PONY_ACTOR;}
 {INT} {return INT;}
 {FLOAT} {return FLOAT;}
 {ID} {return ID;}
 {LPAREN_NEW} {return LPAREN_NEW;}
 {LSQUARE_NEW} {return LSQUARE_NEW;}
 {MINUS_NEW} {return MINUS_NEW;}
 {STRING} {return STRING;}
 {BEGIN_RAWSEQ} {return BEGIN_RAWSEQ;}
 {BEGIN_TYPE} {return BEGIN_TYPE;}
 {RPAREN} {return RPAREN;}
 {RSQUARE} {return RSQUARE;}
 {DOTS} {return DOTS;}
 {WHITE_SPACE}+  { return com.intellij.psi.TokenType.WHITE_SPACE; }
 . { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}

