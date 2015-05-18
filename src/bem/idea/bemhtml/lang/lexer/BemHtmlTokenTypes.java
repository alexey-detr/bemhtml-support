package bem.idea.bemhtml.lang.lexer;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

public interface BemHtmlTokenTypes {

    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    IElementType BAD_CHARACTER = new BemHtmlElementType("BAD_CHARACTER");

    IElementType ERROR_TOO_MANY_VALUES = new BemHtmlElementType("ERROR_TOO_MANY_VALUES");
    IElementType ERROR_ONE_BEM_VALUE_EXPECTED = new BemHtmlElementType("ERROR_ONE_BEM_VALUE_EXPECTED");
    IElementType ERROR_TWO_BEM_VALUES_EXPECTED = new BemHtmlElementType("ERROR_TWO_BEM_VALUES_EXPECTED");
    IElementType ERROR_WHITESPACE_EXPECTED = new BemHtmlElementType("ERROR_WHITESPACE_EXPECTED");
    IElementType ERROR_UNEXPECTED_CHARACTER = new BemHtmlElementType("ERROR_UNEXPECTED_CHARACTER");
    IElementType ERROR_UNFINISHED_ML_COMMENT = new BemHtmlElementType("ERROR_UNFINISHED_ML_COMMENT");
    IElementType ERROR_PUNCTUATION_EXPECTED = new BemHtmlElementType("ERROR_PUNCTUATION_EXPECTED");
    IElementType ERROR_INVALID_JSON_VALUE = new BemHtmlElementType("ERROR_INVALID_JSON_VALUE");
    IElementType ERROR_BEM_OR_JS_EXPECTED = new BemHtmlElementType("ERROR_BEM_OR_JS_EXPECTED");

    IElementType KEYWORDS_DELIM = new BemHtmlElementType("KEYWORDS_DELIM");
    IElementType KEYWORDS_COLON = new BemHtmlElementType("KEYWORDS_COLON");
    IElementType KEYWORDS_VALUE = new BemHtmlElementType("KEYWORDS_VALUE");
    IElementType BEM_VALUE = new BemHtmlElementType("BEM_VALUE");
    IElementType JS_EXPRESSION = new BemHtmlElementType("JS_EXPRESSION");
    IElementType JSON_PROPERTY = new BemHtmlElementType("JSON_PROPERTY");

    IElementType KEYWORD_BLOCK = new BemHtmlElementType("KEYWORD_BLOCK");
    IElementType KEYWORD_ELEM = new BemHtmlElementType("KEYWORD_ELEM");
    IElementType KEYWORD_MOD = new BemHtmlElementType("KEYWORD_MOD");
    IElementType KEYWORD_ELEMMOD = new BemHtmlElementType("KEYWORD_ELEMMOD");

    IElementType KEYWORD_DEFAULT = new BemHtmlElementType("KEYWORD_DEFAULT");
    IElementType KEYWORD_TAG = new BemHtmlElementType("KEYWORD_TAG");
    IElementType KEYWORD_ATTRS = new BemHtmlElementType("KEYWORD_ATTRS");
    IElementType KEYWORD_CLS = new BemHtmlElementType("KEYWORD_CLS");
    IElementType KEYWORD_BEM = new BemHtmlElementType("KEYWORD_BEM");
    IElementType KEYWORD_JS = new BemHtmlElementType("KEYWORD_JS");
    IElementType KEYWORD_JSATTR = new BemHtmlElementType("KEYWORD_JSATTR");
    IElementType KEYWORD_MIX = new BemHtmlElementType("KEYWORD_MIX");
    IElementType KEYWORD_CONTENT = new BemHtmlElementType("KEYWORD_CONTENT");

    IElementType SL_COMMENT = new BemHtmlElementType("SL_COMMENT");
    IElementType ML_COMMENT = new BemHtmlElementType("ML_COMMENT");

    IElementType LEFT_BRACE = new BemHtmlElementType("LEFT_BRACE");
    IElementType RIGHT_BRACE = new BemHtmlElementType("RIGHT_BRACE");

    IElementType JAVASCRIPT_CODE = new BemHtmlElementType("JAVASCRIPT_CODE");
}
