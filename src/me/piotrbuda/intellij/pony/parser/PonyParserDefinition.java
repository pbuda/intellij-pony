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
    public static final IElementType PONY_CLASS_DEF = new PonyTokenType("PONY_CLASS_DEF");
    public static final IElementType PONY_USE = new PonyTokenType("PONY_USE");
    public static final IElementType PONY_IF = new PonyTokenType("PONY_IF");
    public static final IElementType PONY_AT = new PonyTokenType("PONY_AT");
    public static final IElementType PONY_QUESTION = new PonyTokenType("PONY_QUESTION");
    public static final IElementType PONY_EQUALS = new PonyTokenType("PONY_EQUALS");
    public static final IElementType PONY_LET = new PonyTokenType("PONY_LET");
    public static final IElementType PONY_VAR = new PonyTokenType("PONY_VAR");
    public static final IElementType PONY_METHOD = new PonyTokenType("PONY_METHOD");
    public static final IElementType PONY_RETURN = new PonyTokenType("PONY_RETURN");
    public static final IElementType PONY_BREAK = new PonyTokenType("PONY_BREAK");
    public static final IElementType PONY_CONTINUE = new PonyTokenType("PONY_CONTINUE");
    public static final IElementType PONY_ERROR = new PonyTokenType("PONY_ERROR");
    public static final IElementType PONY_COMPILER = new PonyTokenType("PONY_COMPILER");
    public static final IElementType PONY_AS = new PonyTokenType("PONY_AS");
    public static final IElementType PONY_THEN = new PonyTokenType("PONY_THEN");
    public static final IElementType PONY_ELSE = new PonyTokenType("PONY_ELSE");
    public static final IElementType PONY_END = new PonyTokenType("PONY_END");
    public static final IElementType PONY_MATCH = new PonyTokenType("PONY_MATCH");
    public static final IElementType PONY_WHILE = new PonyTokenType("PONY_WHILE");
    public static final IElementType PONY_DO = new PonyTokenType("PONY_DO");
    public static final IElementType PONY_REPEAT = new PonyTokenType("PONY_REPEAT");
    public static final IElementType PONY_UNTIL = new PonyTokenType("PONY_UNTIL");
    public static final IElementType PONY_FOR = new PonyTokenType("PONY_FOR");
    public static final IElementType PONY_IN = new PonyTokenType("PONY_IN");
    public static final IElementType PONY_WITH = new PonyTokenType("PONY_WITH");
    public static final IElementType PONY_TRY = new PonyTokenType("PONY_TRY");
    public static final IElementType PONY_RECOVER = new PonyTokenType("PONY_RECOVER");
    public static final IElementType PONY_CONSUME = new PonyTokenType("PONY_CONSUME");
    public static final IElementType PONY_NOT = new PonyTokenType("PONY_NOT");
    public static final IElementType PONY_AMPERSAND = new PonyTokenType("PONY_AMPERSAND");
    public static final IElementType PONY_IDENTITYOF = new PonyTokenType("PONY_IDENTITYOF");
    public static final IElementType PONY_WHERE = new PonyTokenType("PONY_WHERE");
    public static final IElementType PONY_ELSEIF = new PonyTokenType("PONY_ELSEIF");
    public static final IElementType PONY_OBJECT = new PonyTokenType("PONY_OBJECT");
    public static final IElementType PONY_LAMBDA = new PonyTokenType("PONY_LAMBDA");
    public static final IElementType PONY_UNION = new PonyTokenType("PONY_UNION");
    public static final IElementType PONY_OPERATOR = new PonyTokenType("PONY_OPERATOR");
    public static final IElementType PONY_SEMICOLON = new PonyTokenType("PONY_SEMICOLON");
    public static final IElementType PONY_COLON = new PonyTokenType("PONY_COLON");
    public static final IElementType ML_COMMENT = new PonyTokenType("ML_COMMENT");
    public static final IElementType ML_COMMENT_CONTENT = new PonyTokenType("ML_COMMENT_CONTENT");

    public static final TokenSet COMMENTS = TokenSet.create(ML_COMMENT, ML_COMMENT_CONTENT, LINE_COMMENT);

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
        return COMMENTS;
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
