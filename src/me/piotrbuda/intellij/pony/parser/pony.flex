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
WHITE_SPACE=[\ \t\f]
FLOAT = [:digit:] "." [:digit:]
ID = (_ | [:jletter:] | [:jletterdigit:])*
INT = [:digit:]
LPAREN_NEW = "("
LSQUARE_NEW = "["
RPAREN = ")"
RSQUARE = "]"
MINUS_NEW = "-"
STRING = \".*\"
BEGIN_RAWSEQ = "=>"
BEGIN_TYPE = ":"
DOTS = "."
PONY_USE = "use"
PONY_IF = "if"
PONY_AT = "@"
PONY_QUESTION = "?"
PONY_TYPE = "type"
PONY_INTERFACE = "interface"
PONY_TRAIT = "trait"
PONY_PRIMITIVE = "primitive"
PONY_CLASS = "class"
PONY_ACTOR = "actor"
PONY_EQUALS = "="
PONY_LET = "let"
PONY_VAR = "var"
PONY_FUN = "fun"
PONY_BE = "be"
PONY_NEW = "new"
PONY_RETURN = "return"
PONY_BREAK = "break"
PONY_CONTINUE = "continue"
PONY_ERROR = "error"
PONY_COMPILER = "compiler_intrinsic"
PONY_AS = "as"
PONY_BINOP_LIT = "and" | "or" | "xor" | "is" | "isnt"
PONY_THEN = "then"
PONY_ELSE = "else"
PONY_END = "end"
PONY_MATCH = "match"
PONY_WHILE = "while"
PONY_DO = "do"
PONY_REPEAT = "repeat"
PONY_UNTIL = "until"
PONY_FOR = "for"
PONY_IN = "in"
PONY_WITH = "with"
PONY_TRY = "try"
PONY_RECOVER = "recover"
PONY_CONSUME = "consume"
PONY_NOT = "not"
PONY_AMPERSAND = "&"
PONY_IDENTITYOF = "identityof"
PONY_WHERE = "where"
PONY_ELSEIF = "elseif"
PONY_OBJECT = "object"
PONY_LAMBDA = "lambda"
PONY_ISO = "iso"
PONY_TRN = "trn"
PONY_REF = "ref"
PONY_VAL = "val"
PONY_BOX = "box"
PONY_TAG = "tag"
ML_COMMENT = \"\"\"
PONY_UNION = \|

%state YYDOC

%%

<YYINITIAL> {
{ML_COMMENT} {yybegin(YYDOC); return ML_COMMENT;}
 {BEGIN_RAWSEQ} {return BEGIN_RAWSEQ;}
 {PONY_EQUALS} {return PONY_EQUALS;}
 {PONY_USE} {return PONY_USE;}
 {PONY_AT} {return PONY_AT;}
 {PONY_QUESTION} {return PONY_QUESTION;}
 {PONY_IF} {return PONY_IF;}
 {PONY_LET} {return PONY_LET;}
 {PONY_VAR} {return PONY_VAR;}
 {PONY_FUN} {return PONY_FUN;}
 {PONY_BE} {return PONY_BE;}
 {PONY_NEW} {return PONY_NEW;}
 {PONY_RETURN} {return PONY_RETURN;}
 {PONY_BREAK} {return PONY_BREAK;}
 {PONY_CONTINUE} {return PONY_CONTINUE;}
 {PONY_ERROR} {return PONY_ERROR;}
 {PONY_COMPILER} {return PONY_COMPILER;}
 {PONY_AS} {return PONY_AS;}
 {PONY_BINOP_LIT} {return PONY_BINOP_LIT;}
 {PONY_THEN} {return PONY_THEN;}
 {PONY_ELSE} {return PONY_ELSE;}
 {PONY_END} {return PONY_END;}
 {PONY_MATCH} {return PONY_MATCH;}
 {PONY_WHILE} {return PONY_WHILE;}
 {PONY_DO} {return PONY_DO;}
 {PONY_REPEAT} {return PONY_REPEAT;}
 {PONY_UNTIL} {return PONY_UNTIL;}
 {PONY_FOR} {return PONY_FOR;}
 {PONY_IN} {return PONY_IN;}
 {PONY_WITH} {return PONY_WITH;}
 {PONY_TRY} {return PONY_TRY;}
 {PONY_RECOVER} {return PONY_RECOVER;}
 {PONY_CONSUME} {return PONY_CONSUME;}
 {PONY_NOT} {return PONY_NOT;}
 {PONY_AMPERSAND} {return PONY_AMPERSAND;}
 {PONY_IDENTITYOF} {return PONY_IDENTITYOF;}
 {PONY_WHERE} {return PONY_WHERE;}
 {PONY_ELSEIF} {return PONY_ELSEIF;}
 {PONY_OBJECT} {return PONY_OBJECT;}
 {PONY_LAMBDA} {return PONY_LAMBDA;}
 {PONY_ISO} {return PONY_ISO;}
 {PONY_TRN} {return PONY_TRN;}
 {PONY_REF} {return PONY_REF;}
 {PONY_VAL} {return PONY_VAL;}
 {PONY_BOX} {return PONY_BOX;}
 {PONY_TAG} {return PONY_TAG;}
 {PONY_TYPE} {return PONY_TYPE;}
 {PONY_INTERFACE} {return PONY_INTERFACE;}
 {PONY_TRAIT} {return PONY_TRAIT;}
 {PONY_PRIMITIVE} {return PONY_PRIMITIVE;}
 {PONY_CLASS} {return PONY_CLASS;}
 {PONY_ACTOR} {return PONY_ACTOR;}
 {INT} {return INT;}
 {FLOAT} {return FLOAT;}
 {ID} {return ID;}
 {LPAREN_NEW} {return LPAREN_NEW;}
 {LSQUARE_NEW} {return LSQUARE_NEW;}
 {MINUS_NEW} {return MINUS_NEW;}
 {BEGIN_TYPE} {return BEGIN_TYPE;}
 {RPAREN} {return RPAREN;}
 {RSQUARE} {return RSQUARE;}
 {DOTS} {return DOT;}
 {STRING} {return LITERAL;}
 {PONY_UNION} {return PONY_UNION;}
 {WHITE_SPACE}+  { return com.intellij.psi.TokenType.WHITE_SPACE; }
 {CRLF}+  { return com.intellij.psi.TokenType.WHITE_SPACE; }
 . { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}

<YYDOC> {
 {ML_COMMENT} {yybegin(YYINITIAL); return ML_COMMENT;}
 {WHITE_SPACE}+  { return com.intellij.psi.TokenType.WHITE_SPACE; }
 {CRLF}+  { return com.intellij.psi.TokenType.WHITE_SPACE; }
 .* {return ML_COMMENT_CONTENT;}
 . { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}

/* error fallback */
[^] { throw new Error("Illegal character <"+yytext()+">"); }