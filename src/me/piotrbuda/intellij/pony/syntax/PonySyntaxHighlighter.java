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
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.*;

public class PonySyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey ILLEGAL = createTextAttributesKey("PONY_ILLEGAL", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
    public static final TextAttributesKey STRING = createTextAttributesKey("STRINGS", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey ID = createTextAttributesKey("ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey ML_COMMENT =createTextAttributesKey("ML_COMMENT_CONTENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey SL_COMMENT =createTextAttributesKey("SL_COMMENT_CONTENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey CAP =createTextAttributesKey("CAP", DefaultLanguageHighlighterColors.KEYWORD);

    private static final Set<IElementType> KEYWORDS = Sets.newHashSet(PONY_CLASS_DEF, PONY_USE, PONY_IF,
            PONY_AT, PONY_LET, PONY_VAR, PONY_METHOD, PONY_RETURN, PONY_BREAK, PONY_CONTINUE, PONY_ERROR, PONY_COMPILER, PONY_AS, PonyTypes.BINOP, PONY_THEN,
            PONY_ELSE, PONY_END, PONY_MATCH, PONY_WHILE, PONY_DO, PONY_REPEAT, PONY_UNTIL, PONY_FOR, PONY_IN, PONY_WITH, PONY_TRY, PONY_RECOVER,
            PONY_CONSUME, PONY_NOT, PONY_IDENTITYOF, PONY_WHERE, PONY_ELSEIF, PONY_OBJECT, PONY_LAMBDA);

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
        } else if (KEYWORDS.contains(tokenType)) {
            return pack(KEYWORD);
        } else if (tokenType == PonyTypes.INT || tokenType == PonyTypes.FLOAT) {
            return pack(NUMBER);
        } else if (tokenType == PonyParserDefinition.ML_COMMENT || tokenType == PonyParserDefinition.ML_COMMENT_CONTENT) {
            return pack(ML_COMMENT);
        } else if(tokenType == PonyParserDefinition.LINE_COMMENT) {
            return pack(SL_COMMENT);
        } else if(tokenType == PonyTypes.CAP) {
            return pack(CAP);
        }
        return EMPTY;
    }
}
