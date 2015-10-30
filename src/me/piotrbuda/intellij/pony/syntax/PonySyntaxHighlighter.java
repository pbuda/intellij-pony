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

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PonySyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey ILLEGAL = createTextAttributesKey("PONY_ILLEGAL", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
    public static final TextAttributesKey STRING = createTextAttributesKey("STRINGS", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey ID = createTextAttributesKey("ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey METHOD = createTextAttributesKey("METHOD", DefaultLanguageHighlighterColors.INSTANCE_METHOD);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);

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
        } else if (tokenType == PonyParserDefinition.PONY_ACTOR) {
            return pack(KEYWORD);
        }
        return EMPTY;
    }
}
