// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.parser.GeneratedParserUtilBase.TRUE_CONDITION;
import static com.intellij.lang.parser.GeneratedParserUtilBase._COLLAPSE_;
import static com.intellij.lang.parser.GeneratedParserUtilBase._NONE_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.adapt_builder_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.consumeToken;
import static com.intellij.lang.parser.GeneratedParserUtilBase.current_position_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.empty_element_parsed_guard_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.enter_section_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.exit_section_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.nextTokenIs;
import static com.intellij.lang.parser.GeneratedParserUtilBase.recursion_guard_;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.ASSIGNMENT;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.ATOM;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.ATOMTYPE;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.BINOP;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.CALL;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.CAP;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.CASEEXPR;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.CLASS_DEF;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.DOT;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.ELSEIF;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.EXPRSEQ;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.FIELD;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.FLOAT;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.ID;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.IDSEQ;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.INFIX;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.INFIXTYPE;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.INT;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.ISECTTYPE;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.JUMP;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.LITERAL;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.LPAREN_NEW;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.LSQUARE_NEW;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.MEMBERS;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.METHOD;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.MINUS_NEW;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NAMED;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NAMEDARG;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NEXTASSIGNMENT;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NEXTATOM;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NEXTEXPRSEQ;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NEXTINFIX;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NEXTPOSTFIX;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NEXTTERM;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NOMINAL;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.NOSEMI;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.PARAM;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.PARAMS;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.POSITIONAL;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.POSTFIX;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.RAWSEQ;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.SEMIEXPR;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.STRING;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.TERM;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.TILDE;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.TUPLE;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.TUPLETYPE;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.TYPE;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.TYPEARGS;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.TYPEPARAM;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.TYPEPARAMS;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.TYPES;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.UNIONTYPE;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.USE;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.USE_FFI;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.WITHELEM;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PonyParser implements PsiParser {

    public ASTNode parse(IElementType t, PsiBuilder b) {
        parseLight(t, b);
        return b.getTreeBuilt();
    }

    public void parseLight(IElementType t, PsiBuilder b) {
        boolean r;
        b = adapt_builder_(t, b, this, null);
        Marker m = enter_section_(b, 0, _COLLAPSE_, null);
        if (t == ASSIGNMENT) {
            r = assignment(b, 0);
        } else if (t == ATOM) {
            r = atom(b, 0);
        } else if (t == ATOMTYPE) {
            r = atomtype(b, 0);
        } else if (t == BINOP) {
            r = binop(b, 0);
        } else if (t == CALL) {
            r = call(b, 0);
        } else if (t == CAP) {
            r = cap(b, 0);
        } else if (t == CASEEXPR) {
            r = caseexpr(b, 0);
        } else if (t == CLASS_DEF) {
            r = class_def(b, 0);
        } else if (t == DOT) {
            r = dot(b, 0);
        } else if (t == ELSEIF) {
            r = elseif(b, 0);
        } else if (t == EXPRSEQ) {
            r = exprseq(b, 0);
        } else if (t == FIELD) {
            r = field(b, 0);
        } else if (t == IDSEQ) {
            r = idseq(b, 0);
        } else if (t == INFIX) {
            r = infix(b, 0);
        } else if (t == INFIXTYPE) {
            r = infixtype(b, 0);
        } else if (t == ISECTTYPE) {
            r = isecttype(b, 0);
        } else if (t == JUMP) {
            r = jump(b, 0);
        } else if (t == LITERAL) {
            r = literal(b, 0);
        } else if (t == MEMBERS) {
            r = members(b, 0);
        } else if (t == METHOD) {
            r = method(b, 0);
        } else if (t == NAMED) {
            r = named(b, 0);
        } else if (t == NAMEDARG) {
            r = namedarg(b, 0);
        } else if (t == NEXTASSIGNMENT) {
            r = nextassignment(b, 0);
        } else if (t == NEXTATOM) {
            r = nextatom(b, 0);
        } else if (t == NEXTEXPRSEQ) {
            r = nextexprseq(b, 0);
        } else if (t == NEXTINFIX) {
            r = nextinfix(b, 0);
        } else if (t == NEXTPOSTFIX) {
            r = nextpostfix(b, 0);
        } else if (t == NEXTTERM) {
            r = nextterm(b, 0);
        } else if (t == NOMINAL) {
            r = nominal(b, 0);
        } else if (t == NOSEMI) {
            r = nosemi(b, 0);
        } else if (t == PARAM) {
            r = param(b, 0);
        } else if (t == PARAMS) {
            r = params(b, 0);
        } else if (t == POSITIONAL) {
            r = positional(b, 0);
        } else if (t == POSTFIX) {
            r = postfix(b, 0);
        } else if (t == RAWSEQ) {
            r = rawseq(b, 0);
        } else if (t == SEMIEXPR) {
            r = semiexpr(b, 0);
        } else if (t == TERM) {
            r = term(b, 0);
        } else if (t == TILDE) {
            r = tilde(b, 0);
        } else if (t == TUPLE) {
            r = tuple(b, 0);
        } else if (t == TUPLETYPE) {
            r = tupletype(b, 0);
        } else if (t == TYPE) {
            r = type(b, 0);
        } else if (t == TYPEARGS) {
            r = typeargs(b, 0);
        } else if (t == TYPEPARAM) {
            r = typeparam(b, 0);
        } else if (t == TYPEPARAMS) {
            r = typeparams(b, 0);
        } else if (t == TYPES) {
            r = types(b, 0);
        } else if (t == UNIONTYPE) {
            r = uniontype(b, 0);
        } else if (t == USE) {
            r = use(b, 0);
        } else if (t == USE_FFI) {
            r = use_ffi(b, 0);
        } else if (t == WITHELEM) {
            r = withelem(b, 0);
        } else {
            r = parse_root_(t, b, 0);
        }
        exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
    }

    protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
        return module(b, l + 1);
    }

    /* ********************************************************** */
    // infix ('=' assignment)?
    public static boolean assignment(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "assignment")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<assignment>");
        r = infix(b, l + 1);
        r = r && assignment_1(b, l + 1);
        exit_section_(b, l, m, ASSIGNMENT, r, false, null);
        return r;
    }

    // ('=' assignment)?
    private static boolean assignment_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "assignment_1")) return false;
        assignment_1_0(b, l + 1);
        return true;
    }

    // '=' assignment
    private static boolean assignment_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "assignment_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "=");
        r = r && assignment(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ID
    //   | literal
    //   | ('(' | LPAREN_NEW) (rawseq | '_') tuple? ')'
    //   | ('[' | LSQUARE_NEW) ('as' type ':')? rawseq (',' rawseq)* ']'
    //   | 'object' ('is' types)? members 'end'
    //   | 'lambda' typeparams? ('(' | LPAREN_NEW) params? ')' (':' type)? '?'? '=>' rawseq 'end'
    //   | '@' (ID | STRING) typeargs? ('(' | LPAREN_NEW) positional? named? ')' '?'?
    public static boolean atom(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<atom>");
        r = consumeToken(b, ID);
        if (!r) r = literal(b, l + 1);
        if (!r) r = atom_2(b, l + 1);
        if (!r) r = atom_3(b, l + 1);
        if (!r) r = atom_4(b, l + 1);
        if (!r) r = atom_5(b, l + 1);
        if (!r) r = atom_6(b, l + 1);
        exit_section_(b, l, m, ATOM, r, false, null);
        return r;
    }

    // ('(' | LPAREN_NEW) (rawseq | '_') tuple? ')'
    private static boolean atom_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = atom_2_0(b, l + 1);
        r = r && atom_2_1(b, l + 1);
        r = r && atom_2_2(b, l + 1);
        r = r && consumeToken(b, ")");
        exit_section_(b, m, null, r);
        return r;
    }

    // '(' | LPAREN_NEW
    private static boolean atom_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "(");
        if (!r) r = consumeToken(b, LPAREN_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // rawseq | '_'
    private static boolean atom_2_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_2_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = rawseq(b, l + 1);
        if (!r) r = consumeToken(b, "_");
        exit_section_(b, m, null, r);
        return r;
    }

    // tuple?
    private static boolean atom_2_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_2_2")) return false;
        tuple(b, l + 1);
        return true;
    }

    // ('[' | LSQUARE_NEW) ('as' type ':')? rawseq (',' rawseq)* ']'
    private static boolean atom_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_3")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = atom_3_0(b, l + 1);
        r = r && atom_3_1(b, l + 1);
        r = r && rawseq(b, l + 1);
        r = r && atom_3_3(b, l + 1);
        r = r && consumeToken(b, "]");
        exit_section_(b, m, null, r);
        return r;
    }

    // '[' | LSQUARE_NEW
    private static boolean atom_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "[");
        if (!r) r = consumeToken(b, LSQUARE_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // ('as' type ':')?
    private static boolean atom_3_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_3_1")) return false;
        atom_3_1_0(b, l + 1);
        return true;
    }

    // 'as' type ':'
    private static boolean atom_3_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_3_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "as");
        r = r && type(b, l + 1);
        r = r && consumeToken(b, ":");
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' rawseq)*
    private static boolean atom_3_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_3_3")) return false;
        int c = current_position_(b);
        while (true) {
            if (!atom_3_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "atom_3_3", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' rawseq
    private static boolean atom_3_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_3_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'object' ('is' types)? members 'end'
    private static boolean atom_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_4")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "object");
        r = r && atom_4_1(b, l + 1);
        r = r && members(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('is' types)?
    private static boolean atom_4_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_4_1")) return false;
        atom_4_1_0(b, l + 1);
        return true;
    }

    // 'is' types
    private static boolean atom_4_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_4_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "is");
        r = r && types(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'lambda' typeparams? ('(' | LPAREN_NEW) params? ')' (':' type)? '?'? '=>' rawseq 'end'
    private static boolean atom_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_5")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "lambda");
        r = r && atom_5_1(b, l + 1);
        r = r && atom_5_2(b, l + 1);
        r = r && atom_5_3(b, l + 1);
        r = r && consumeToken(b, ")");
        r = r && atom_5_5(b, l + 1);
        r = r && atom_5_6(b, l + 1);
        r = r && consumeToken(b, "=>");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // typeparams?
    private static boolean atom_5_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_5_1")) return false;
        typeparams(b, l + 1);
        return true;
    }

    // '(' | LPAREN_NEW
    private static boolean atom_5_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_5_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "(");
        if (!r) r = consumeToken(b, LPAREN_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // params?
    private static boolean atom_5_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_5_3")) return false;
        params(b, l + 1);
        return true;
    }

    // (':' type)?
    private static boolean atom_5_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_5_5")) return false;
        atom_5_5_0(b, l + 1);
        return true;
    }

    // ':' type
    private static boolean atom_5_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_5_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ":");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // '?'?
    private static boolean atom_5_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_5_6")) return false;
        consumeToken(b, "?");
        return true;
    }

    // '@' (ID | STRING) typeargs? ('(' | LPAREN_NEW) positional? named? ')' '?'?
    private static boolean atom_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_6")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "@");
        r = r && atom_6_1(b, l + 1);
        r = r && atom_6_2(b, l + 1);
        r = r && atom_6_3(b, l + 1);
        r = r && atom_6_4(b, l + 1);
        r = r && atom_6_5(b, l + 1);
        r = r && consumeToken(b, ")");
        r = r && atom_6_7(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ID | STRING
    private static boolean atom_6_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_6_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        if (!r) r = consumeToken(b, STRING);
        exit_section_(b, m, null, r);
        return r;
    }

    // typeargs?
    private static boolean atom_6_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_6_2")) return false;
        typeargs(b, l + 1);
        return true;
    }

    // '(' | LPAREN_NEW
    private static boolean atom_6_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_6_3")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "(");
        if (!r) r = consumeToken(b, LPAREN_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // positional?
    private static boolean atom_6_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_6_4")) return false;
        positional(b, l + 1);
        return true;
    }

    // named?
    private static boolean atom_6_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_6_5")) return false;
        named(b, l + 1);
        return true;
    }

    // '?'?
    private static boolean atom_6_7(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atom_6_7")) return false;
        consumeToken(b, "?");
        return true;
    }

    /* ********************************************************** */
    // 'this'
    //   | 'box'
    //   | ('(' | LPAREN_NEW) (infixtype | '_') tupletype? ')'
    //   | nominal
    public static boolean atomtype(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atomtype")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<atomtype>");
        r = consumeToken(b, "this");
        if (!r) r = consumeToken(b, "box");
        if (!r) r = atomtype_2(b, l + 1);
        if (!r) r = nominal(b, l + 1);
        exit_section_(b, l, m, ATOMTYPE, r, false, null);
        return r;
    }

    // ('(' | LPAREN_NEW) (infixtype | '_') tupletype? ')'
    private static boolean atomtype_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atomtype_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = atomtype_2_0(b, l + 1);
        r = r && atomtype_2_1(b, l + 1);
        r = r && atomtype_2_2(b, l + 1);
        r = r && consumeToken(b, ")");
        exit_section_(b, m, null, r);
        return r;
    }

    // '(' | LPAREN_NEW
    private static boolean atomtype_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atomtype_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "(");
        if (!r) r = consumeToken(b, LPAREN_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // infixtype | '_'
    private static boolean atomtype_2_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atomtype_2_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = infixtype(b, l + 1);
        if (!r) r = consumeToken(b, "_");
        exit_section_(b, m, null, r);
        return r;
    }

    // tupletype?
    private static boolean atomtype_2_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "atomtype_2_2")) return false;
        tupletype(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // ('and' | 'or' | 'xor' | '+' | '-' | '*' | '/' | '%' | '<<' | '>>' | 'is' | 'isnt' | '==' | '!=' | '<' | '<=' | '>=' | '>') term
    public static boolean binop(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "binop")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<binop>");
        r = binop_0(b, l + 1);
        r = r && term(b, l + 1);
        exit_section_(b, l, m, BINOP, r, false, null);
        return r;
    }

    // 'and' | 'or' | 'xor' | '+' | '-' | '*' | '/' | '%' | '<<' | '>>' | 'is' | 'isnt' | '==' | '!=' | '<' | '<=' | '>=' | '>'
    private static boolean binop_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "binop_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "and");
        if (!r) r = consumeToken(b, "or");
        if (!r) r = consumeToken(b, "xor");
        if (!r) r = consumeToken(b, "+");
        if (!r) r = consumeToken(b, "-");
        if (!r) r = consumeToken(b, "*");
        if (!r) r = consumeToken(b, "/");
        if (!r) r = consumeToken(b, "%");
        if (!r) r = consumeToken(b, "<<");
        if (!r) r = consumeToken(b, ">>");
        if (!r) r = consumeToken(b, "is");
        if (!r) r = consumeToken(b, "isnt");
        if (!r) r = consumeToken(b, "==");
        if (!r) r = consumeToken(b, "!=");
        if (!r) r = consumeToken(b, "<");
        if (!r) r = consumeToken(b, "<=");
        if (!r) r = consumeToken(b, ">=");
        if (!r) r = consumeToken(b, ">");
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // '(' positional? named? ')'
    public static boolean call(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "call")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<call>");
        r = consumeToken(b, "(");
        r = r && call_1(b, l + 1);
        r = r && call_2(b, l + 1);
        r = r && consumeToken(b, ")");
        exit_section_(b, l, m, CALL, r, false, null);
        return r;
    }

    // positional?
    private static boolean call_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "call_1")) return false;
        positional(b, l + 1);
        return true;
    }

    // named?
    private static boolean call_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "call_2")) return false;
        named(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // 'iso'
    //   | 'trn'
    //   | 'ref'
    //   | 'val'
    //   | 'box'
    //   | 'tag'
    public static boolean cap(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "cap")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<cap>");
        r = consumeToken(b, "iso");
        if (!r) r = consumeToken(b, "trn");
        if (!r) r = consumeToken(b, "ref");
        if (!r) r = consumeToken(b, "val");
        if (!r) r = consumeToken(b, "box");
        if (!r) r = consumeToken(b, "tag");
        exit_section_(b, l, m, CAP, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // '|' infix? ('where' rawseq)? ('=>' rawseq)?
    public static boolean caseexpr(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "caseexpr")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<caseexpr>");
        r = consumeToken(b, "|");
        r = r && caseexpr_1(b, l + 1);
        r = r && caseexpr_2(b, l + 1);
        r = r && caseexpr_3(b, l + 1);
        exit_section_(b, l, m, CASEEXPR, r, false, null);
        return r;
    }

    // infix?
    private static boolean caseexpr_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "caseexpr_1")) return false;
        infix(b, l + 1);
        return true;
    }

    // ('where' rawseq)?
    private static boolean caseexpr_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "caseexpr_2")) return false;
        caseexpr_2_0(b, l + 1);
        return true;
    }

    // 'where' rawseq
    private static boolean caseexpr_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "caseexpr_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "where");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ('=>' rawseq)?
    private static boolean caseexpr_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "caseexpr_3")) return false;
        caseexpr_3_0(b, l + 1);
        return true;
    }

    // '=>' rawseq
    private static boolean caseexpr_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "caseexpr_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "=>");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ('type' | 'interface' | 'trait' | 'primitive' | 'class' | 'actor') '@'? ID typeparams? cap? ('is' types)? STRING? members
    public static boolean class_def(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "class_def")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<class def>");
        r = class_def_0(b, l + 1);
        r = r && class_def_1(b, l + 1);
        r = r && consumeToken(b, ID);
        r = r && class_def_3(b, l + 1);
        r = r && class_def_4(b, l + 1);
        r = r && class_def_5(b, l + 1);
        r = r && class_def_6(b, l + 1);
        r = r && members(b, l + 1);
        exit_section_(b, l, m, CLASS_DEF, r, false, null);
        return r;
    }

    // 'type' | 'interface' | 'trait' | 'primitive' | 'class' | 'actor'
    private static boolean class_def_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "class_def_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "type");
        if (!r) r = consumeToken(b, "interface");
        if (!r) r = consumeToken(b, "trait");
        if (!r) r = consumeToken(b, "primitive");
        if (!r) r = consumeToken(b, "class");
        if (!r) r = consumeToken(b, "actor");
        exit_section_(b, m, null, r);
        return r;
    }

    // '@'?
    private static boolean class_def_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "class_def_1")) return false;
        consumeToken(b, "@");
        return true;
    }

    // typeparams?
    private static boolean class_def_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "class_def_3")) return false;
        typeparams(b, l + 1);
        return true;
    }

    // cap?
    private static boolean class_def_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "class_def_4")) return false;
        cap(b, l + 1);
        return true;
    }

    // ('is' types)?
    private static boolean class_def_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "class_def_5")) return false;
        class_def_5_0(b, l + 1);
        return true;
    }

    // 'is' types
    private static boolean class_def_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "class_def_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "is");
        r = r && types(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // STRING?
    private static boolean class_def_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "class_def_6")) return false;
        consumeToken(b, STRING);
        return true;
    }

    /* ********************************************************** */
    // '.' ID
    public static boolean dot(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "dot")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<dot>");
        r = consumeToken(b, ".");
        r = r && consumeToken(b, ID);
        exit_section_(b, l, m, DOT, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // 'elseif' rawseq 'then' rawseq (elseif | ('else' rawseq))?
    public static boolean elseif(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "elseif")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<elseif>");
        r = consumeToken(b, "elseif");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "then");
        r = r && rawseq(b, l + 1);
        r = r && elseif_4(b, l + 1);
        exit_section_(b, l, m, ELSEIF, r, false, null);
        return r;
    }

    // (elseif | ('else' rawseq))?
    private static boolean elseif_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "elseif_4")) return false;
        elseif_4_0(b, l + 1);
        return true;
    }

    // elseif | ('else' rawseq)
    private static boolean elseif_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "elseif_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = elseif(b, l + 1);
        if (!r) r = elseif_4_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'else' rawseq
    private static boolean elseif_4_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "elseif_4_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // assignment (semiexpr | nosemi)?
    public static boolean exprseq(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "exprseq")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<exprseq>");
        r = assignment(b, l + 1);
        r = r && exprseq_1(b, l + 1);
        exit_section_(b, l, m, EXPRSEQ, r, false, null);
        return r;
    }

    // (semiexpr | nosemi)?
    private static boolean exprseq_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "exprseq_1")) return false;
        exprseq_1_0(b, l + 1);
        return true;
    }

    // semiexpr | nosemi
    private static boolean exprseq_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "exprseq_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = semiexpr(b, l + 1);
        if (!r) r = nosemi(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ('var' | 'let') ID ':' type ('=' infix)?
    public static boolean field(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "field")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<field>");
        r = field_0(b, l + 1);
        r = r && consumeToken(b, ID);
        r = r && consumeToken(b, ":");
        r = r && type(b, l + 1);
        r = r && field_4(b, l + 1);
        exit_section_(b, l, m, FIELD, r, false, null);
        return r;
    }

    // 'var' | 'let'
    private static boolean field_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "field_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "var");
        if (!r) r = consumeToken(b, "let");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('=' infix)?
    private static boolean field_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "field_4")) return false;
        field_4_0(b, l + 1);
        return true;
    }

    // '=' infix
    private static boolean field_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "field_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "=");
        r = r && infix(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ID
    //   | '_'
    //   | ('(' | LPAREN_NEW) idseq (',' idseq)* ')'
    public static boolean idseq(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "idseq")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<idseq>");
        r = consumeToken(b, ID);
        if (!r) r = consumeToken(b, "_");
        if (!r) r = idseq_2(b, l + 1);
        exit_section_(b, l, m, IDSEQ, r, false, null);
        return r;
    }

    // ('(' | LPAREN_NEW) idseq (',' idseq)* ')'
    private static boolean idseq_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "idseq_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = idseq_2_0(b, l + 1);
        r = r && idseq(b, l + 1);
        r = r && idseq_2_2(b, l + 1);
        r = r && consumeToken(b, ")");
        exit_section_(b, m, null, r);
        return r;
    }

    // '(' | LPAREN_NEW
    private static boolean idseq_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "idseq_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "(");
        if (!r) r = consumeToken(b, LPAREN_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' idseq)*
    private static boolean idseq_2_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "idseq_2_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!idseq_2_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "idseq_2_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' idseq
    private static boolean idseq_2_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "idseq_2_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && idseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // term (binop | ('as' type))*
    public static boolean infix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "infix")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<infix>");
        r = term(b, l + 1);
        r = r && infix_1(b, l + 1);
        exit_section_(b, l, m, INFIX, r, false, null);
        return r;
    }

    // (binop | ('as' type))*
    private static boolean infix_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "infix_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!infix_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "infix_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // binop | ('as' type)
    private static boolean infix_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "infix_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = binop(b, l + 1);
        if (!r) r = infix_1_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'as' type
    private static boolean infix_1_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "infix_1_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "as");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // type (uniontype | isecttype)*
    public static boolean infixtype(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "infixtype")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<infixtype>");
        r = type(b, l + 1);
        r = r && infixtype_1(b, l + 1);
        exit_section_(b, l, m, INFIXTYPE, r, false, null);
        return r;
    }

    // (uniontype | isecttype)*
    private static boolean infixtype_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "infixtype_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!infixtype_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "infixtype_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // uniontype | isecttype
    private static boolean infixtype_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "infixtype_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = uniontype(b, l + 1);
        if (!r) r = isecttype(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // '&' type
    public static boolean isecttype(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "isecttype")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<isecttype>");
        r = consumeToken(b, "&");
        r = r && type(b, l + 1);
        exit_section_(b, l, m, ISECTTYPE, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // ('return' | 'break' | 'continue' | 'error' | 'compiler_intrinsic') rawseq?
    public static boolean jump(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "jump")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<jump>");
        r = jump_0(b, l + 1);
        r = r && jump_1(b, l + 1);
        exit_section_(b, l, m, JUMP, r, false, null);
        return r;
    }

    // 'return' | 'break' | 'continue' | 'error' | 'compiler_intrinsic'
    private static boolean jump_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "jump_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "return");
        if (!r) r = consumeToken(b, "break");
        if (!r) r = consumeToken(b, "continue");
        if (!r) r = consumeToken(b, "error");
        if (!r) r = consumeToken(b, "compiler_intrinsic");
        exit_section_(b, m, null, r);
        return r;
    }

    // rawseq?
    private static boolean jump_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "jump_1")) return false;
        rawseq(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // 'this'
    //   | 'true'
    //   | 'false'
    //   | INT
    //   | FLOAT
    //   | STRING
    public static boolean literal(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "literal")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<literal>");
        r = consumeToken(b, "this");
        if (!r) r = consumeToken(b, "true");
        if (!r) r = consumeToken(b, "false");
        if (!r) r = consumeToken(b, INT);
        if (!r) r = consumeToken(b, FLOAT);
        if (!r) r = consumeToken(b, STRING);
        exit_section_(b, l, m, LITERAL, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // field* method*
    public static boolean members(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "members")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<members>");
        r = members_0(b, l + 1);
        r = r && members_1(b, l + 1);
        exit_section_(b, l, m, MEMBERS, r, false, null);
        return r;
    }

    // field*
    private static boolean members_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "members_0")) return false;
        int c = current_position_(b);
        while (true) {
            if (!field(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "members_0", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // method*
    private static boolean members_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "members_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!method(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "members_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    /* ********************************************************** */
    // ('fun' | 'be' | 'new') cap? ID typeparams? ('(' | LPAREN_NEW) params? ')' (':' type)? '?'? STRING? ('=>' rawseq)?
    public static boolean method(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<method>");
        r = method_0(b, l + 1);
        r = r && method_1(b, l + 1);
        r = r && consumeToken(b, ID);
        r = r && method_3(b, l + 1);
        r = r && method_4(b, l + 1);
        r = r && method_5(b, l + 1);
        r = r && consumeToken(b, ")");
        r = r && method_7(b, l + 1);
        r = r && method_8(b, l + 1);
        r = r && method_9(b, l + 1);
        r = r && method_10(b, l + 1);
        exit_section_(b, l, m, METHOD, r, false, null);
        return r;
    }

    // 'fun' | 'be' | 'new'
    private static boolean method_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "fun");
        if (!r) r = consumeToken(b, "be");
        if (!r) r = consumeToken(b, "new");
        exit_section_(b, m, null, r);
        return r;
    }

    // cap?
    private static boolean method_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_1")) return false;
        cap(b, l + 1);
        return true;
    }

    // typeparams?
    private static boolean method_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_3")) return false;
        typeparams(b, l + 1);
        return true;
    }

    // '(' | LPAREN_NEW
    private static boolean method_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_4")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "(");
        if (!r) r = consumeToken(b, LPAREN_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // params?
    private static boolean method_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_5")) return false;
        params(b, l + 1);
        return true;
    }

    // (':' type)?
    private static boolean method_7(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_7")) return false;
        method_7_0(b, l + 1);
        return true;
    }

    // ':' type
    private static boolean method_7_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_7_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ":");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // '?'?
    private static boolean method_8(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_8")) return false;
        consumeToken(b, "?");
        return true;
    }

    // STRING?
    private static boolean method_9(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_9")) return false;
        consumeToken(b, STRING);
        return true;
    }

    // ('=>' rawseq)?
    private static boolean method_10(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_10")) return false;
        method_10_0(b, l + 1);
        return true;
    }

    // '=>' rawseq
    private static boolean method_10_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "method_10_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "=>");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // STRING? use* class_def*
    static boolean module(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "module")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = module_0(b, l + 1);
        r = r && module_1(b, l + 1);
        r = r && module_2(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // STRING?
    private static boolean module_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "module_0")) return false;
        consumeToken(b, STRING);
        return true;
    }

    // use*
    private static boolean module_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "module_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!use(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "module_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // class_def*
    private static boolean module_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "module_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!class_def(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "module_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    /* ********************************************************** */
    // 'where' namedarg (',' namedarg)*
    public static boolean named(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "named")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<named>");
        r = consumeToken(b, "where");
        r = r && namedarg(b, l + 1);
        r = r && named_2(b, l + 1);
        exit_section_(b, l, m, NAMED, r, false, null);
        return r;
    }

    // (',' namedarg)*
    private static boolean named_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "named_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!named_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "named_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' namedarg
    private static boolean named_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "named_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && namedarg(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ID '=' rawseq
    public static boolean namedarg(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "namedarg")) return false;
        if (!nextTokenIs(b, ID)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        r = r && consumeToken(b, "=");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, NAMEDARG, r);
        return r;
    }

    /* ********************************************************** */
    // nextinfix ('=' assignment)?
    public static boolean nextassignment(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextassignment")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<nextassignment>");
        r = nextinfix(b, l + 1);
        r = r && nextassignment_1(b, l + 1);
        exit_section_(b, l, m, NEXTASSIGNMENT, r, false, null);
        return r;
    }

    // ('=' assignment)?
    private static boolean nextassignment_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextassignment_1")) return false;
        nextassignment_1_0(b, l + 1);
        return true;
    }

    // '=' assignment
    private static boolean nextassignment_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextassignment_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "=");
        r = r && assignment(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ID
    //   | literal
    //   | LPAREN_NEW (rawseq | '_') tuple? ')'
    //   | LSQUARE_NEW ('as' type ':')? rawseq (',' rawseq)* ']'
    //   | 'object' ('is' types)? members 'end'
    //   | 'lambda' typeparams? ('(' | LPAREN_NEW) params? ')' (':' type)? '?'? '=>' rawseq 'end'
    //   | '@' (ID | STRING) typeargs? ('(' | LPAREN_NEW) positional? named? ')' '?'?
    public static boolean nextatom(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<nextatom>");
        r = consumeToken(b, ID);
        if (!r) r = literal(b, l + 1);
        if (!r) r = nextatom_2(b, l + 1);
        if (!r) r = nextatom_3(b, l + 1);
        if (!r) r = nextatom_4(b, l + 1);
        if (!r) r = nextatom_5(b, l + 1);
        if (!r) r = nextatom_6(b, l + 1);
        exit_section_(b, l, m, NEXTATOM, r, false, null);
        return r;
    }

    // LPAREN_NEW (rawseq | '_') tuple? ')'
    private static boolean nextatom_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, LPAREN_NEW);
        r = r && nextatom_2_1(b, l + 1);
        r = r && nextatom_2_2(b, l + 1);
        r = r && consumeToken(b, ")");
        exit_section_(b, m, null, r);
        return r;
    }

    // rawseq | '_'
    private static boolean nextatom_2_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_2_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = rawseq(b, l + 1);
        if (!r) r = consumeToken(b, "_");
        exit_section_(b, m, null, r);
        return r;
    }

    // tuple?
    private static boolean nextatom_2_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_2_2")) return false;
        tuple(b, l + 1);
        return true;
    }

    // LSQUARE_NEW ('as' type ':')? rawseq (',' rawseq)* ']'
    private static boolean nextatom_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_3")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, LSQUARE_NEW);
        r = r && nextatom_3_1(b, l + 1);
        r = r && rawseq(b, l + 1);
        r = r && nextatom_3_3(b, l + 1);
        r = r && consumeToken(b, "]");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('as' type ':')?
    private static boolean nextatom_3_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_3_1")) return false;
        nextatom_3_1_0(b, l + 1);
        return true;
    }

    // 'as' type ':'
    private static boolean nextatom_3_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_3_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "as");
        r = r && type(b, l + 1);
        r = r && consumeToken(b, ":");
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' rawseq)*
    private static boolean nextatom_3_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_3_3")) return false;
        int c = current_position_(b);
        while (true) {
            if (!nextatom_3_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "nextatom_3_3", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' rawseq
    private static boolean nextatom_3_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_3_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'object' ('is' types)? members 'end'
    private static boolean nextatom_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_4")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "object");
        r = r && nextatom_4_1(b, l + 1);
        r = r && members(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('is' types)?
    private static boolean nextatom_4_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_4_1")) return false;
        nextatom_4_1_0(b, l + 1);
        return true;
    }

    // 'is' types
    private static boolean nextatom_4_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_4_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "is");
        r = r && types(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'lambda' typeparams? ('(' | LPAREN_NEW) params? ')' (':' type)? '?'? '=>' rawseq 'end'
    private static boolean nextatom_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_5")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "lambda");
        r = r && nextatom_5_1(b, l + 1);
        r = r && nextatom_5_2(b, l + 1);
        r = r && nextatom_5_3(b, l + 1);
        r = r && consumeToken(b, ")");
        r = r && nextatom_5_5(b, l + 1);
        r = r && nextatom_5_6(b, l + 1);
        r = r && consumeToken(b, "=>");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // typeparams?
    private static boolean nextatom_5_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_5_1")) return false;
        typeparams(b, l + 1);
        return true;
    }

    // '(' | LPAREN_NEW
    private static boolean nextatom_5_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_5_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "(");
        if (!r) r = consumeToken(b, LPAREN_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // params?
    private static boolean nextatom_5_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_5_3")) return false;
        params(b, l + 1);
        return true;
    }

    // (':' type)?
    private static boolean nextatom_5_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_5_5")) return false;
        nextatom_5_5_0(b, l + 1);
        return true;
    }

    // ':' type
    private static boolean nextatom_5_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_5_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ":");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // '?'?
    private static boolean nextatom_5_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_5_6")) return false;
        consumeToken(b, "?");
        return true;
    }

    // '@' (ID | STRING) typeargs? ('(' | LPAREN_NEW) positional? named? ')' '?'?
    private static boolean nextatom_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_6")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "@");
        r = r && nextatom_6_1(b, l + 1);
        r = r && nextatom_6_2(b, l + 1);
        r = r && nextatom_6_3(b, l + 1);
        r = r && nextatom_6_4(b, l + 1);
        r = r && nextatom_6_5(b, l + 1);
        r = r && consumeToken(b, ")");
        r = r && nextatom_6_7(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ID | STRING
    private static boolean nextatom_6_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_6_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        if (!r) r = consumeToken(b, STRING);
        exit_section_(b, m, null, r);
        return r;
    }

    // typeargs?
    private static boolean nextatom_6_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_6_2")) return false;
        typeargs(b, l + 1);
        return true;
    }

    // '(' | LPAREN_NEW
    private static boolean nextatom_6_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_6_3")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "(");
        if (!r) r = consumeToken(b, LPAREN_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // positional?
    private static boolean nextatom_6_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_6_4")) return false;
        positional(b, l + 1);
        return true;
    }

    // named?
    private static boolean nextatom_6_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_6_5")) return false;
        named(b, l + 1);
        return true;
    }

    // '?'?
    private static boolean nextatom_6_7(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextatom_6_7")) return false;
        consumeToken(b, "?");
        return true;
    }

    /* ********************************************************** */
    // nextassignment (semiexpr | nosemi)?
    public static boolean nextexprseq(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextexprseq")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<nextexprseq>");
        r = nextassignment(b, l + 1);
        r = r && nextexprseq_1(b, l + 1);
        exit_section_(b, l, m, NEXTEXPRSEQ, r, false, null);
        return r;
    }

    // (semiexpr | nosemi)?
    private static boolean nextexprseq_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextexprseq_1")) return false;
        nextexprseq_1_0(b, l + 1);
        return true;
    }

    // semiexpr | nosemi
    private static boolean nextexprseq_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextexprseq_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = semiexpr(b, l + 1);
        if (!r) r = nosemi(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // nextterm (binop | ('as' type))*
    public static boolean nextinfix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextinfix")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<nextinfix>");
        r = nextterm(b, l + 1);
        r = r && nextinfix_1(b, l + 1);
        exit_section_(b, l, m, NEXTINFIX, r, false, null);
        return r;
    }

    // (binop | ('as' type))*
    private static boolean nextinfix_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextinfix_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!nextinfix_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "nextinfix_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // binop | ('as' type)
    private static boolean nextinfix_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextinfix_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = binop(b, l + 1);
        if (!r) r = nextinfix_1_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'as' type
    private static boolean nextinfix_1_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextinfix_1_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "as");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // nextatom (dot | tilde | typeargs | call)*
    public static boolean nextpostfix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextpostfix")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<nextpostfix>");
        r = nextatom(b, l + 1);
        r = r && nextpostfix_1(b, l + 1);
        exit_section_(b, l, m, NEXTPOSTFIX, r, false, null);
        return r;
    }

    // (dot | tilde | typeargs | call)*
    private static boolean nextpostfix_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextpostfix_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!nextpostfix_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "nextpostfix_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // dot | tilde | typeargs | call
    private static boolean nextpostfix_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextpostfix_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = dot(b, l + 1);
        if (!r) r = tilde(b, l + 1);
        if (!r) r = typeargs(b, l + 1);
        if (!r) r = call(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ('var' | 'let') ID (':' type)?
    //   | 'if' rawseq 'then' rawseq (elseif | ('else' rawseq))? 'end'
    //   | 'match' rawseq caseexpr* ('else' rawseq)? 'end'
    //   | 'while' rawseq 'do' rawseq ('else' rawseq)? 'end'
    //   | 'repeat' rawseq 'until' rawseq ('else' rawseq)? 'end'
    //   | 'for' idseq 'in' rawseq 'do' rawseq ('else' rawseq)? 'end'
    //   | 'with' (withelem (',' withelem)*) 'do' rawseq ('else' rawseq)? 'end'
    //   | 'try' rawseq ('else' rawseq)? ('then' rawseq)? 'end'
    //   | 'recover' cap? rawseq 'end'
    //   | 'consume' cap? term
    //   | ('not' | '&' | MINUS_NEW | 'identityof') term
    //   | nextpostfix
    public static boolean nextterm(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<nextterm>");
        r = nextterm_0(b, l + 1);
        if (!r) r = nextterm_1(b, l + 1);
        if (!r) r = nextterm_2(b, l + 1);
        if (!r) r = nextterm_3(b, l + 1);
        if (!r) r = nextterm_4(b, l + 1);
        if (!r) r = nextterm_5(b, l + 1);
        if (!r) r = nextterm_6(b, l + 1);
        if (!r) r = nextterm_7(b, l + 1);
        if (!r) r = nextterm_8(b, l + 1);
        if (!r) r = nextterm_9(b, l + 1);
        if (!r) r = nextterm_10(b, l + 1);
        if (!r) r = nextpostfix(b, l + 1);
        exit_section_(b, l, m, NEXTTERM, r, false, null);
        return r;
    }

    // ('var' | 'let') ID (':' type)?
    private static boolean nextterm_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = nextterm_0_0(b, l + 1);
        r = r && consumeToken(b, ID);
        r = r && nextterm_0_2(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'var' | 'let'
    private static boolean nextterm_0_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_0_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "var");
        if (!r) r = consumeToken(b, "let");
        exit_section_(b, m, null, r);
        return r;
    }

    // (':' type)?
    private static boolean nextterm_0_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_0_2")) return false;
        nextterm_0_2_0(b, l + 1);
        return true;
    }

    // ':' type
    private static boolean nextterm_0_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_0_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ":");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'if' rawseq 'then' rawseq (elseif | ('else' rawseq))? 'end'
    private static boolean nextterm_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "if");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "then");
        r = r && rawseq(b, l + 1);
        r = r && nextterm_1_4(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // (elseif | ('else' rawseq))?
    private static boolean nextterm_1_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_1_4")) return false;
        nextterm_1_4_0(b, l + 1);
        return true;
    }

    // elseif | ('else' rawseq)
    private static boolean nextterm_1_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_1_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = elseif(b, l + 1);
        if (!r) r = nextterm_1_4_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'else' rawseq
    private static boolean nextterm_1_4_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_1_4_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'match' rawseq caseexpr* ('else' rawseq)? 'end'
    private static boolean nextterm_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "match");
        r = r && rawseq(b, l + 1);
        r = r && nextterm_2_2(b, l + 1);
        r = r && nextterm_2_3(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // caseexpr*
    private static boolean nextterm_2_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_2_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!caseexpr(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "nextterm_2_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ('else' rawseq)?
    private static boolean nextterm_2_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_2_3")) return false;
        nextterm_2_3_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean nextterm_2_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_2_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'while' rawseq 'do' rawseq ('else' rawseq)? 'end'
    private static boolean nextterm_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_3")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "while");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "do");
        r = r && rawseq(b, l + 1);
        r = r && nextterm_3_4(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean nextterm_3_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_3_4")) return false;
        nextterm_3_4_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean nextterm_3_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_3_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'repeat' rawseq 'until' rawseq ('else' rawseq)? 'end'
    private static boolean nextterm_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_4")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "repeat");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "until");
        r = r && rawseq(b, l + 1);
        r = r && nextterm_4_4(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean nextterm_4_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_4_4")) return false;
        nextterm_4_4_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean nextterm_4_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_4_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'for' idseq 'in' rawseq 'do' rawseq ('else' rawseq)? 'end'
    private static boolean nextterm_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_5")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "for");
        r = r && idseq(b, l + 1);
        r = r && consumeToken(b, "in");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "do");
        r = r && rawseq(b, l + 1);
        r = r && nextterm_5_6(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean nextterm_5_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_5_6")) return false;
        nextterm_5_6_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean nextterm_5_6_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_5_6_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'with' (withelem (',' withelem)*) 'do' rawseq ('else' rawseq)? 'end'
    private static boolean nextterm_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_6")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "with");
        r = r && nextterm_6_1(b, l + 1);
        r = r && consumeToken(b, "do");
        r = r && rawseq(b, l + 1);
        r = r && nextterm_6_4(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // withelem (',' withelem)*
    private static boolean nextterm_6_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_6_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = withelem(b, l + 1);
        r = r && nextterm_6_1_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' withelem)*
    private static boolean nextterm_6_1_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_6_1_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!nextterm_6_1_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "nextterm_6_1_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' withelem
    private static boolean nextterm_6_1_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_6_1_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && withelem(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean nextterm_6_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_6_4")) return false;
        nextterm_6_4_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean nextterm_6_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_6_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'try' rawseq ('else' rawseq)? ('then' rawseq)? 'end'
    private static boolean nextterm_7(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_7")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "try");
        r = r && rawseq(b, l + 1);
        r = r && nextterm_7_2(b, l + 1);
        r = r && nextterm_7_3(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean nextterm_7_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_7_2")) return false;
        nextterm_7_2_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean nextterm_7_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_7_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ('then' rawseq)?
    private static boolean nextterm_7_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_7_3")) return false;
        nextterm_7_3_0(b, l + 1);
        return true;
    }

    // 'then' rawseq
    private static boolean nextterm_7_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_7_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "then");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'recover' cap? rawseq 'end'
    private static boolean nextterm_8(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_8")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "recover");
        r = r && nextterm_8_1(b, l + 1);
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // cap?
    private static boolean nextterm_8_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_8_1")) return false;
        cap(b, l + 1);
        return true;
    }

    // 'consume' cap? term
    private static boolean nextterm_9(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_9")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "consume");
        r = r && nextterm_9_1(b, l + 1);
        r = r && term(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // cap?
    private static boolean nextterm_9_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_9_1")) return false;
        cap(b, l + 1);
        return true;
    }

    // ('not' | '&' | MINUS_NEW | 'identityof') term
    private static boolean nextterm_10(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_10")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = nextterm_10_0(b, l + 1);
        r = r && term(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'not' | '&' | MINUS_NEW | 'identityof'
    private static boolean nextterm_10_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nextterm_10_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "not");
        if (!r) r = consumeToken(b, "&");
        if (!r) r = consumeToken(b, MINUS_NEW);
        if (!r) r = consumeToken(b, "identityof");
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ID ('.' ID)? typeargs? cap? ('^' | '!')?
    public static boolean nominal(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nominal")) return false;
        if (!nextTokenIs(b, ID)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        r = r && nominal_1(b, l + 1);
        r = r && nominal_2(b, l + 1);
        r = r && nominal_3(b, l + 1);
        r = r && nominal_4(b, l + 1);
        exit_section_(b, m, NOMINAL, r);
        return r;
    }

    // ('.' ID)?
    private static boolean nominal_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nominal_1")) return false;
        nominal_1_0(b, l + 1);
        return true;
    }

    // '.' ID
    private static boolean nominal_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nominal_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ".");
        r = r && consumeToken(b, ID);
        exit_section_(b, m, null, r);
        return r;
    }

    // typeargs?
    private static boolean nominal_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nominal_2")) return false;
        typeargs(b, l + 1);
        return true;
    }

    // cap?
    private static boolean nominal_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nominal_3")) return false;
        cap(b, l + 1);
        return true;
    }

    // ('^' | '!')?
    private static boolean nominal_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nominal_4")) return false;
        nominal_4_0(b, l + 1);
        return true;
    }

    // '^' | '!'
    private static boolean nominal_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nominal_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "^");
        if (!r) r = consumeToken(b, "!");
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // nextexprseq | jump
    public static boolean nosemi(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "nosemi")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<nosemi>");
        r = nextexprseq(b, l + 1);
        if (!r) r = jump(b, l + 1);
        exit_section_(b, l, m, NOSEMI, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // ID ':' type ('=' infix)?
    public static boolean param(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "param")) return false;
        if (!nextTokenIs(b, ID)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        r = r && consumeToken(b, ":");
        r = r && type(b, l + 1);
        r = r && param_3(b, l + 1);
        exit_section_(b, m, PARAM, r);
        return r;
    }

    // ('=' infix)?
    private static boolean param_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "param_3")) return false;
        param_3_0(b, l + 1);
        return true;
    }

    // '=' infix
    private static boolean param_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "param_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "=");
        r = r && infix(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // (param | '...') (',' (param | '...'))*
    public static boolean params(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "params")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<params>");
        r = params_0(b, l + 1);
        r = r && params_1(b, l + 1);
        exit_section_(b, l, m, PARAMS, r, false, null);
        return r;
    }

    // param | '...'
    private static boolean params_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "params_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = param(b, l + 1);
        if (!r) r = consumeToken(b, "...");
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' (param | '...'))*
    private static boolean params_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "params_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!params_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "params_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' (param | '...')
    private static boolean params_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "params_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && params_1_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // param | '...'
    private static boolean params_1_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "params_1_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = param(b, l + 1);
        if (!r) r = consumeToken(b, "...");
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // rawseq (',' rawseq)*
    public static boolean positional(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "positional")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<positional>");
        r = rawseq(b, l + 1);
        r = r && positional_1(b, l + 1);
        exit_section_(b, l, m, POSITIONAL, r, false, null);
        return r;
    }

    // (',' rawseq)*
    private static boolean positional_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "positional_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!positional_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "positional_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' rawseq
    private static boolean positional_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "positional_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // atom (dot | tilde | typeargs | call)*
    public static boolean postfix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "postfix")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<postfix>");
        r = atom(b, l + 1);
        r = r && postfix_1(b, l + 1);
        exit_section_(b, l, m, POSTFIX, r, false, null);
        return r;
    }

    // (dot | tilde | typeargs | call)*
    private static boolean postfix_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "postfix_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!postfix_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "postfix_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // dot | tilde | typeargs | call
    private static boolean postfix_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "postfix_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = dot(b, l + 1);
        if (!r) r = tilde(b, l + 1);
        if (!r) r = typeargs(b, l + 1);
        if (!r) r = call(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // exprseq | jump
    public static boolean rawseq(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "rawseq")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<rawseq>");
        r = exprseq(b, l + 1);
        if (!r) r = jump(b, l + 1);
        exit_section_(b, l, m, RAWSEQ, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // ';' (exprseq | jump)
    public static boolean semiexpr(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "semiexpr")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<semiexpr>");
        r = consumeToken(b, ";");
        r = r && semiexpr_1(b, l + 1);
        exit_section_(b, l, m, SEMIEXPR, r, false, null);
        return r;
    }

    // exprseq | jump
    private static boolean semiexpr_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "semiexpr_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = exprseq(b, l + 1);
        if (!r) r = jump(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ('var' | 'let') ID (':' type)?
    //   | 'if' rawseq 'then' rawseq (elseif | ('else' rawseq))? 'end'
    //   | 'match' rawseq caseexpr* ('else' rawseq)? 'end'
    //   | 'while' rawseq 'do' rawseq ('else' rawseq)? 'end'
    //   | 'repeat' rawseq 'until' rawseq ('else' rawseq)? 'end'
    //   | 'for' idseq 'in' rawseq 'do' rawseq ('else' rawseq)? 'end'
    //   | 'with' (withelem (',' withelem)*) 'do' rawseq ('else' rawseq)? 'end'
    //   | 'try' rawseq ('else' rawseq)? ('then' rawseq)? 'end'
    //   | 'recover' cap? rawseq 'end'
    //   | 'consume' cap? term
    //   | ('not' | '&' | '-' | MINUS_NEW | 'identityof') term
    //   | postfix
    public static boolean term(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _COLLAPSE_, "<term>");
        r = term_0(b, l + 1);
        if (!r) r = term_1(b, l + 1);
        if (!r) r = term_2(b, l + 1);
        if (!r) r = term_3(b, l + 1);
        if (!r) r = term_4(b, l + 1);
        if (!r) r = term_5(b, l + 1);
        if (!r) r = term_6(b, l + 1);
        if (!r) r = term_7(b, l + 1);
        if (!r) r = term_8(b, l + 1);
        if (!r) r = term_9(b, l + 1);
        if (!r) r = term_10(b, l + 1);
        if (!r) r = postfix(b, l + 1);
        exit_section_(b, l, m, TERM, r, false, null);
        return r;
    }

    // ('var' | 'let') ID (':' type)?
    private static boolean term_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = term_0_0(b, l + 1);
        r = r && consumeToken(b, ID);
        r = r && term_0_2(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'var' | 'let'
    private static boolean term_0_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_0_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "var");
        if (!r) r = consumeToken(b, "let");
        exit_section_(b, m, null, r);
        return r;
    }

    // (':' type)?
    private static boolean term_0_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_0_2")) return false;
        term_0_2_0(b, l + 1);
        return true;
    }

    // ':' type
    private static boolean term_0_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_0_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ":");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'if' rawseq 'then' rawseq (elseif | ('else' rawseq))? 'end'
    private static boolean term_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "if");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "then");
        r = r && rawseq(b, l + 1);
        r = r && term_1_4(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // (elseif | ('else' rawseq))?
    private static boolean term_1_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_1_4")) return false;
        term_1_4_0(b, l + 1);
        return true;
    }

    // elseif | ('else' rawseq)
    private static boolean term_1_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_1_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = elseif(b, l + 1);
        if (!r) r = term_1_4_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'else' rawseq
    private static boolean term_1_4_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_1_4_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'match' rawseq caseexpr* ('else' rawseq)? 'end'
    private static boolean term_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "match");
        r = r && rawseq(b, l + 1);
        r = r && term_2_2(b, l + 1);
        r = r && term_2_3(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // caseexpr*
    private static boolean term_2_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_2_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!caseexpr(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "term_2_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ('else' rawseq)?
    private static boolean term_2_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_2_3")) return false;
        term_2_3_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean term_2_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_2_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'while' rawseq 'do' rawseq ('else' rawseq)? 'end'
    private static boolean term_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_3")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "while");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "do");
        r = r && rawseq(b, l + 1);
        r = r && term_3_4(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean term_3_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_3_4")) return false;
        term_3_4_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean term_3_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_3_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'repeat' rawseq 'until' rawseq ('else' rawseq)? 'end'
    private static boolean term_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_4")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "repeat");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "until");
        r = r && rawseq(b, l + 1);
        r = r && term_4_4(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean term_4_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_4_4")) return false;
        term_4_4_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean term_4_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_4_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'for' idseq 'in' rawseq 'do' rawseq ('else' rawseq)? 'end'
    private static boolean term_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_5")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "for");
        r = r && idseq(b, l + 1);
        r = r && consumeToken(b, "in");
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "do");
        r = r && rawseq(b, l + 1);
        r = r && term_5_6(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean term_5_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_5_6")) return false;
        term_5_6_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean term_5_6_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_5_6_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'with' (withelem (',' withelem)*) 'do' rawseq ('else' rawseq)? 'end'
    private static boolean term_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_6")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "with");
        r = r && term_6_1(b, l + 1);
        r = r && consumeToken(b, "do");
        r = r && rawseq(b, l + 1);
        r = r && term_6_4(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // withelem (',' withelem)*
    private static boolean term_6_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_6_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = withelem(b, l + 1);
        r = r && term_6_1_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' withelem)*
    private static boolean term_6_1_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_6_1_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!term_6_1_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "term_6_1_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' withelem
    private static boolean term_6_1_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_6_1_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && withelem(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean term_6_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_6_4")) return false;
        term_6_4_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean term_6_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_6_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'try' rawseq ('else' rawseq)? ('then' rawseq)? 'end'
    private static boolean term_7(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_7")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "try");
        r = r && rawseq(b, l + 1);
        r = r && term_7_2(b, l + 1);
        r = r && term_7_3(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // ('else' rawseq)?
    private static boolean term_7_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_7_2")) return false;
        term_7_2_0(b, l + 1);
        return true;
    }

    // 'else' rawseq
    private static boolean term_7_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_7_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "else");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ('then' rawseq)?
    private static boolean term_7_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_7_3")) return false;
        term_7_3_0(b, l + 1);
        return true;
    }

    // 'then' rawseq
    private static boolean term_7_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_7_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "then");
        r = r && rawseq(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'recover' cap? rawseq 'end'
    private static boolean term_8(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_8")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "recover");
        r = r && term_8_1(b, l + 1);
        r = r && rawseq(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, m, null, r);
        return r;
    }

    // cap?
    private static boolean term_8_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_8_1")) return false;
        cap(b, l + 1);
        return true;
    }

    // 'consume' cap? term
    private static boolean term_9(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_9")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "consume");
        r = r && term_9_1(b, l + 1);
        r = r && term(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // cap?
    private static boolean term_9_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_9_1")) return false;
        cap(b, l + 1);
        return true;
    }

    // ('not' | '&' | '-' | MINUS_NEW | 'identityof') term
    private static boolean term_10(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_10")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = term_10_0(b, l + 1);
        r = r && term(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'not' | '&' | '-' | MINUS_NEW | 'identityof'
    private static boolean term_10_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_10_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "not");
        if (!r) r = consumeToken(b, "&");
        if (!r) r = consumeToken(b, "-");
        if (!r) r = consumeToken(b, MINUS_NEW);
        if (!r) r = consumeToken(b, "identityof");
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // '~' ID
    public static boolean tilde(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tilde")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<tilde>");
        r = consumeToken(b, "~");
        r = r && consumeToken(b, ID);
        exit_section_(b, l, m, TILDE, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // ',' (rawseq | '_') (',' (rawseq | '_'))*
    public static boolean tuple(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tuple")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<tuple>");
        r = consumeToken(b, ",");
        r = r && tuple_1(b, l + 1);
        r = r && tuple_2(b, l + 1);
        exit_section_(b, l, m, TUPLE, r, false, null);
        return r;
    }

    // rawseq | '_'
    private static boolean tuple_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tuple_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = rawseq(b, l + 1);
        if (!r) r = consumeToken(b, "_");
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' (rawseq | '_'))*
    private static boolean tuple_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tuple_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!tuple_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "tuple_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' (rawseq | '_')
    private static boolean tuple_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tuple_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && tuple_2_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // rawseq | '_'
    private static boolean tuple_2_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tuple_2_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = rawseq(b, l + 1);
        if (!r) r = consumeToken(b, "_");
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ',' (infixtype | '_') (',' (infixtype | '_'))*
    public static boolean tupletype(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tupletype")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<tupletype>");
        r = consumeToken(b, ",");
        r = r && tupletype_1(b, l + 1);
        r = r && tupletype_2(b, l + 1);
        exit_section_(b, l, m, TUPLETYPE, r, false, null);
        return r;
    }

    // infixtype | '_'
    private static boolean tupletype_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tupletype_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = infixtype(b, l + 1);
        if (!r) r = consumeToken(b, "_");
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' (infixtype | '_'))*
    private static boolean tupletype_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tupletype_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!tupletype_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "tupletype_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' (infixtype | '_')
    private static boolean tupletype_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tupletype_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && tupletype_2_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // infixtype | '_'
    private static boolean tupletype_2_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "tupletype_2_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = infixtype(b, l + 1);
        if (!r) r = consumeToken(b, "_");
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // atomtype ('->' type)?
    public static boolean type(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<type>");
        r = atomtype(b, l + 1);
        r = r && type_1(b, l + 1);
        exit_section_(b, l, m, TYPE, r, false, null);
        return r;
    }

    // ('->' type)?
    private static boolean type_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_1")) return false;
        type_1_0(b, l + 1);
        return true;
    }

    // '->' type
    private static boolean type_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "->");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // '[' type (',' type)* ']'
    public static boolean typeargs(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeargs")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<typeargs>");
        r = consumeToken(b, "[");
        r = r && type(b, l + 1);
        r = r && typeargs_2(b, l + 1);
        r = r && consumeToken(b, "]");
        exit_section_(b, l, m, TYPEARGS, r, false, null);
        return r;
    }

    // (',' type)*
    private static boolean typeargs_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeargs_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!typeargs_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "typeargs_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' type
    private static boolean typeargs_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeargs_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ID (':' type)? ('=' type)?
    public static boolean typeparam(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeparam")) return false;
        if (!nextTokenIs(b, ID)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        r = r && typeparam_1(b, l + 1);
        r = r && typeparam_2(b, l + 1);
        exit_section_(b, m, TYPEPARAM, r);
        return r;
    }

    // (':' type)?
    private static boolean typeparam_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeparam_1")) return false;
        typeparam_1_0(b, l + 1);
        return true;
    }

    // ':' type
    private static boolean typeparam_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeparam_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ":");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ('=' type)?
    private static boolean typeparam_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeparam_2")) return false;
        typeparam_2_0(b, l + 1);
        return true;
    }

    // '=' type
    private static boolean typeparam_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeparam_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "=");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // ('[' | LSQUARE_NEW) typeparam (',' typeparam)* ']'
    public static boolean typeparams(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeparams")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<typeparams>");
        r = typeparams_0(b, l + 1);
        r = r && typeparam(b, l + 1);
        r = r && typeparams_2(b, l + 1);
        r = r && consumeToken(b, "]");
        exit_section_(b, l, m, TYPEPARAMS, r, false, null);
        return r;
    }

    // '[' | LSQUARE_NEW
    private static boolean typeparams_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeparams_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "[");
        if (!r) r = consumeToken(b, LSQUARE_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' typeparam)*
    private static boolean typeparams_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeparams_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!typeparams_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "typeparams_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' typeparam
    private static boolean typeparams_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "typeparams_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && typeparam(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // type (',' type)*
    public static boolean types(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "types")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<types>");
        r = type(b, l + 1);
        r = r && types_1(b, l + 1);
        exit_section_(b, l, m, TYPES, r, false, null);
        return r;
    }

    // (',' type)*
    private static boolean types_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "types_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!types_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "types_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' type
    private static boolean types_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "types_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ",");
        r = r && type(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // '|' type
    public static boolean uniontype(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "uniontype")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<uniontype>");
        r = consumeToken(b, "|");
        r = r && type(b, l + 1);
        exit_section_(b, l, m, UNIONTYPE, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // 'use' (ID '=')? (STRING | use_ffi) ('if' infix)?
    public static boolean use(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<use>");
        r = consumeToken(b, "use");
        r = r && use_1(b, l + 1);
        r = r && use_2(b, l + 1);
        r = r && use_3(b, l + 1);
        exit_section_(b, l, m, USE, r, false, null);
        return r;
    }

    // (ID '=')?
    private static boolean use_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_1")) return false;
        use_1_0(b, l + 1);
        return true;
    }

    // ID '='
    private static boolean use_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        r = r && consumeToken(b, "=");
        exit_section_(b, m, null, r);
        return r;
    }

    // STRING | use_ffi
    private static boolean use_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, STRING);
        if (!r) r = use_ffi(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ('if' infix)?
    private static boolean use_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_3")) return false;
        use_3_0(b, l + 1);
        return true;
    }

    // 'if' infix
    private static boolean use_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "if");
        r = r && infix(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // '@' (ID | STRING) typeargs ('(' | LPAREN_NEW) params? ')' '?'?
    public static boolean use_ffi(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_ffi")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<use ffi>");
        r = consumeToken(b, "@");
        r = r && use_ffi_1(b, l + 1);
        r = r && typeargs(b, l + 1);
        r = r && use_ffi_3(b, l + 1);
        r = r && use_ffi_4(b, l + 1);
        r = r && consumeToken(b, ")");
        r = r && use_ffi_6(b, l + 1);
        exit_section_(b, l, m, USE_FFI, r, false, null);
        return r;
    }

    // ID | STRING
    private static boolean use_ffi_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_ffi_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        if (!r) r = consumeToken(b, STRING);
        exit_section_(b, m, null, r);
        return r;
    }

    // '(' | LPAREN_NEW
    private static boolean use_ffi_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_ffi_3")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "(");
        if (!r) r = consumeToken(b, LPAREN_NEW);
        exit_section_(b, m, null, r);
        return r;
    }

    // params?
    private static boolean use_ffi_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_ffi_4")) return false;
        params(b, l + 1);
        return true;
    }

    // '?'?
    private static boolean use_ffi_6(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "use_ffi_6")) return false;
        consumeToken(b, "?");
        return true;
    }

    /* ********************************************************** */
    // idseq '=' rawseq
    public static boolean withelem(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "withelem")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<withelem>");
        r = idseq(b, l + 1);
        r = r && consumeToken(b, "=");
        r = r && rawseq(b, l + 1);
        exit_section_(b, l, m, WITHELEM, r, false, null);
        return r;
    }

}
