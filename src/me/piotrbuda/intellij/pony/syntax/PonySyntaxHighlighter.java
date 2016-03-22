/*
 * Copyright 2015 Piotr Buda
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.piotrbuda.intellij.pony.syntax;

import com.google.common.collect.Sets;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import me.piotrbuda.intellij.pony.parser.PonyLexer;
import me.piotrbuda.intellij.pony.parser.PonyParserDefinition;
import me.piotrbuda.intellij.pony.psi.PonyTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_ACTOR;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_AS;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_AT;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_BE;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_BINOP_LIT;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_BOX;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_BREAK;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_CLASS;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_COMPILER;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_CONSUME;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_CONTINUE;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_DO;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_ELSE;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_ELSEIF;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_END;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_ERROR;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_FOR;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_FUN;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_IDENTITYOF;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_IF;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_IN;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_INTERFACE;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_ISO;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_LAMBDA;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_LET;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_MATCH;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_NEW;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_NOT;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_OBJECT;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_PRIMITIVE;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_RECOVER;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_REF;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_REPEAT;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_RETURN;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_TAG;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_THEN;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_TRAIT;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_TRN;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_TRY;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_TYPE;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_UNTIL;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_USE;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_VAL;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_VAR;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_WHERE;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_WHILE;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.PONY_WITH;

public class PonySyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey ILLEGAL = createTextAttributesKey("PONY_ILLEGAL", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
    public static final TextAttributesKey STRING = createTextAttributesKey("STRINGS", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey ID = createTextAttributesKey("ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey METHOD = createTextAttributesKey("METHOD", DefaultLanguageHighlighterColors.INSTANCE_METHOD);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT =createTextAttributesKey("ML_COMMENT_CONTENT", DefaultLanguageHighlighterColors.DOC_COMMENT);

    private static final Set<IElementType> KEYWORDS = Sets.newHashSet(PONY_TYPE, PONY_INTERFACE, PONY_TRAIT, PONY_PRIMITIVE, PONY_CLASS, PONY_ACTOR, PONY_USE, PONY_IF,
            PONY_AT, PONY_LET, PONY_VAR, PONY_FUN, PONY_BE, PONY_NEW, PONY_RETURN, PONY_BREAK, PONY_CONTINUE, PONY_ERROR, PONY_COMPILER, PONY_AS, PONY_BINOP_LIT, PONY_THEN,
            PONY_ELSE, PONY_END, PONY_MATCH, PONY_WHILE, PONY_DO, PONY_REPEAT, PONY_UNTIL, PONY_FOR, PONY_IN, PONY_WITH, PONY_TRY, PONY_RECOVER,
            PONY_CONSUME, PONY_NOT, PONY_IDENTITYOF, PONY_WHERE, PONY_ELSEIF, PONY_OBJECT, PONY_LAMBDA, PONY_ISO, PONY_TRN, PONY_REF, PONY_VAL, PONY_BOX, PONY_TAG);

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new PonyLexer());
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(final IElementType tokenType) {
        if (tokenType == TokenType.BAD_CHARACTER) {
            return pack(ILLEGAL);
        } else if (tokenType == PonyTypes.STRING) {
            return pack(STRING);
        } else if (tokenType == PonyTypes.ID) {
            return pack(ID);
        } else if (tokenType == PonyTypes.METHOD) {
            return pack(METHOD);
        } else if (KEYWORDS.contains(tokenType)) {
            return pack(KEYWORD);
        } else if (tokenType == PonyTypes.INT || tokenType == PonyTypes.FLOAT) {
            return pack(NUMBER);
        } else if (tokenType == PonyParserDefinition.ML_COMMENT || tokenType == PonyParserDefinition.ML_COMMENT_CONTENT) {
            return pack(COMMENT);
        }
        return EMPTY;
    }
}
