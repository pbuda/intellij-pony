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
FLOAT = [:digit:]* "." [:digit:]*
ID = (_ | [:jletter:] | [:jletterdigit:] | "\'")*
INT = [:digit:]
CLASS_DEF = "type" | "interface" | "trait" | "primitive" | "class" | "actor"
BINOP = "and" | "or" | "xor" | "is" | "isnt"
OPERATORS = "+" | "-" | "*" | "/" | "%" | "<<" | ">>" | "==" | "!=" | "<" | "<=" | ">=" | ">"
CAP = "iso" | "trn" | "ref" | "val" | "box" | "tag"
ML_STRING = \"{3}
LINE_COMMENT = "//".*?{CRLF}

%state MLSTRING

%%

<YYINITIAL> {
 {ML_STRING} {yybegin(MLSTRING); return ML_STRING;}
 "=>" {return BEGIN_RAWSEQ;}
 "=" {return PONY_EQUALS;}
 "use" {return PONY_USE;}
 "@" {return PONY_AT;}
 "?" {return PONY_QUESTION;}
 "if" {return PONY_IF;}
 "let" {return PONY_LET;}
 "var" {return PONY_VAR;}
 "fun" | "be" | "new" {return PONY_METHOD;}
 "return" {return PONY_RETURN;}
 "break" {return PONY_BREAK;}
 "continue" {return PONY_CONTINUE;}
 "error" {return PONY_ERROR;}
 "compiler_intrinsic" {return PONY_COMPILER;}
 "as" {return PONY_AS;}
 "then" {return PONY_THEN;}
 "else" {return PONY_ELSE;}
 "end" {return PONY_END;}
 "match" {return PONY_MATCH;}
 "while" {return PONY_WHILE;}
 "do" {return PONY_DO;}
 "repeat" {return PONY_REPEAT;}
 "until" {return PONY_UNTIL;}
 "for" {return PONY_FOR;}
 "in" {return PONY_IN;}
 "with" {return PONY_WITH;}
 "try" {return PONY_TRY;}
 "recover" {return PONY_RECOVER;}
 "consume" {return PONY_CONSUME;}
 "not" {return PONY_NOT;}
 "&" {return PONY_AMPERSAND;}
 "identityof" {return PONY_IDENTITYOF;}
 "where" {return PONY_WHERE;}
 "elseif" {return PONY_ELSEIF;}
 "object" {return PONY_OBJECT;}
 "lambda" {return PONY_LAMBDA;}
 "(" {return LPAREN_NEW;}
 "[" {return LSQUARE_NEW;}
 ":" {return BEGIN_TYPE;}
 ")" {return RPAREN;}
 "]" {return RSQUARE;}
 "." {return DOT;}
 \".*\" {return STRING;}
 \| {return PONY_UNION;}
 ";" {return PONY_SEMICOLON;}
 "," {return PONY_COLON;}
 {LINE_COMMENT} { return LINE_COMMENT; }
 {OPERATORS} {return PONY_OPERATOR;}
 {BINOP} {return BINOP;}
 {CAP} {return CAP;}
 {CLASS_DEF} {return PONY_CLASS_DEF;}
 {INT} {return INT;}
 {FLOAT} {return FLOAT;}
 {ID} {return ID;}
 {WHITE_SPACE}+  { return com.intellij.psi.TokenType.WHITE_SPACE; }
 . { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}

<MLSTRING> {
  {ML_STRING} {yybegin(YYINITIAL); return ML_STRING;}
  [^\"\"\"]* {return ML_STRING_CONTENT;}
}

/* error fallback */
[^] { throw new Error("Illegal character <"+yytext()+">"); }