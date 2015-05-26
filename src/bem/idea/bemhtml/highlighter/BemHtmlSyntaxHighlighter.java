package bem.idea.bemhtml.highlighter;

import bem.idea.bemhtml.lang.lexer.BemHtmlTokenTypes;
import bem.idea.bemhtml.lang.lexer.custom.BemHtmlTokenizer;
import bem.idea.bemhtml.lang.lexer.custom.CustomLexer;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.EffectType;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BemHtmlSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();

    @NotNull
    public Lexer getHighlightingLexer() {
        return new CustomLexer(new BemHtmlTokenizer());
    }

    static final TextAttributesKey BAD_CHARACTER = TextAttributesKey.createTextAttributesKey(
            "bemhtml.bem.error", HighlighterColors.BAD_CHARACTER);

    static final TextAttributesKey KEYWORDS_DELIM = TextAttributesKey.createTextAttributesKey(
            "bemhtml.keywords.delim", HighlighterColors.TEXT);

    static final TextAttributesKey KEYWORDS_COLON = TextAttributesKey.createTextAttributesKey(
            "bemhtml.keywords.colon", HighlighterColors.TEXT);

    static final TextAttributesKey BEM_VALUE = TextAttributesKey.createTextAttributesKey(
            "bemhtml.bem.value", HighlighterColors.TEXT);

    static final TextAttributesKey BEM_SL_COMMENT = TextAttributesKey.createTextAttributesKey(
            "bemhtml.bem.slcomment", DefaultLanguageHighlighterColors.LINE_COMMENT);

    static final TextAttributesKey BEM_ML_COMMENT = TextAttributesKey.createTextAttributesKey(
            "bemhtml.bem.mlcomment", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    static final TextAttributesKey JSON_PROPERTY = TextAttributesKey.createTextAttributesKey(
            "bemhtml.json.property", DefaultLanguageHighlighterColors.KEYWORD);

    static final TextAttributesKey KEYWORD_ENTITY = TextAttributesKey.createTextAttributesKey(
            "bemhtml.keyword.entity", DefaultLanguageHighlighterColors.KEYWORD);

    static final TextAttributesKey KEYWORD_MOD = TextAttributesKey.createTextAttributesKey(
            "bemhtml.keyword.mod", DefaultLanguageHighlighterColors.KEYWORD);

    static final TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey(
            "bemhtml.braces", DefaultLanguageHighlighterColors.BRACES);

    static {
        fillMap(ATTRIBUTES, BAD_CHARACTER,
                BemHtmlTokenTypes.BAD_CHARACTER,
                BemHtmlTokenTypes.ERROR_ONE_BEM_VALUE_EXPECTED,
                BemHtmlTokenTypes.ERROR_TWO_BEM_VALUES_EXPECTED,
                BemHtmlTokenTypes.ERROR_UNEXPECTED_CHARACTER,
                BemHtmlTokenTypes.ERROR_WHITESPACE_EXPECTED,
                BemHtmlTokenTypes.ERROR_TOO_MANY_VALUES,
                BemHtmlTokenTypes.ERROR_UNFINISHED_ML_COMMENT,
                BemHtmlTokenTypes.ERROR_PUNCTUATION_EXPECTED,
                BemHtmlTokenTypes.ERROR_INVALID_JSON_VALUE,
                BemHtmlTokenTypes.ERROR_BEM_OR_JS_EXPECTED
        );

        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORDS_DELIM, KEYWORDS_DELIM);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORDS_COLON, KEYWORDS_COLON);
        ATTRIBUTES.put(BemHtmlTokenTypes.BEM_VALUE, BEM_VALUE);
        ATTRIBUTES.put(BemHtmlTokenTypes.JSON_PROPERTY, JSON_PROPERTY);

        ATTRIBUTES.put(BemHtmlTokenTypes.SL_COMMENT, BEM_SL_COMMENT);
        ATTRIBUTES.put(BemHtmlTokenTypes.ML_COMMENT, BEM_ML_COMMENT);

        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_BLOCK, KEYWORD_ENTITY);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_ELEM, KEYWORD_ENTITY);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_MOD, KEYWORD_ENTITY);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_ELEMMOD, KEYWORD_ENTITY);

        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_DEFAULT, KEYWORD_MOD);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_TAG, KEYWORD_MOD);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_ATTRS, KEYWORD_MOD);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_CLS, KEYWORD_MOD);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_BEM, KEYWORD_MOD);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_JS, KEYWORD_MOD);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_JSATTR, KEYWORD_MOD);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_MIX, KEYWORD_MOD);
        ATTRIBUTES.put(BemHtmlTokenTypes.KEYWORD_CONTENT, KEYWORD_MOD);

        ATTRIBUTES.put(BemHtmlTokenTypes.LEFT_BRACE, BRACES);
        ATTRIBUTES.put(BemHtmlTokenTypes.RIGHT_BRACE, BRACES);
    }

    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }

}
