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

package me.piotrbuda.intellij.pony.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import me.piotrbuda.intellij.pony.PonyLanguage;
import me.piotrbuda.intellij.pony.psi.PonyFile;
import me.piotrbuda.intellij.pony.psi.PonyParser;
import me.piotrbuda.intellij.pony.psi.PonyTokenType;
import me.piotrbuda.intellij.pony.psi.PonyTypes;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

public class PonyParserDefinition implements ParserDefinition {
    public static final TokenSet WS = TokenSet.create(TokenType.WHITE_SPACE);
    public static final IElementType LINE_COMMENT = new PonyTokenType("PONY_LINE_COMMENT");

    public static final TokenSet STRINGS = TokenSet.create(PonyTypes.STRING);

    public static final IElementType BEGIN_RAWSEQ = new PonyTokenType("BEGIN_RAWSEQ");
    public static final IElementType BEGIN_TYPE = new PonyTokenType("BEGIN_TYPE");
    public static final IElementType RPAREN = new PonyTokenType("RPAREN");
    public static final IElementType RSQUARE = new PonyTokenType("RSQUARE");
    public static final IElementType DOTS = new PonyTokenType("DOTS");
    public static final IElementType PONY_ACTOR = new PonyTokenType("PONY_ACTOR");

    @NotNull
    @Override
    public Lexer createLexer(final Project project) {
        return new FlexAdapter(new PonyLexer((Reader) null));
    }

    @Override
    public PsiParser createParser(final Project project) {
        return new PonyParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return new IFileElementType(Language.<PonyLanguage>findInstance(PonyLanguage.class));
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WS;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.create(LINE_COMMENT);
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRINGS;
    }

    @NotNull
    @Override
    public PsiElement createElement(final ASTNode node) {
        return PonyTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(final FileViewProvider viewProvider) {
        return new PonyFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(final ASTNode left, final ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
