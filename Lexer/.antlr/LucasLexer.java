// Generated from /home/prashanth/courses/sem5/CompilersII/project/Lexer/LucasLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LucasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Begin=1, BigInt=2, Break=3, Decl=4, Expr=5, Public=6, Private=7, TypeOf=8, 
		Vector=9, Case=10, Char=11, Class=12, CharSeq=13, Continue=14, Double=15, 
		Function=16, Else=17, End=18, For=19, Int=20, If=21, Return=22, Switch=23, 
		Void=24, While=25, TE=26, LE=27, Identifier=28, Literal=29, Add=30, Sub=31, 
		Mult=32, Div=33, Mod=34, Tilde=35, Exponent=36, LessThan=37, GreaterThan=38, 
		Equality=39, Inequality=40, LessThanEqual=41, GreaterThanEqual=42, LogicalAnd=43, 
		LogicalOr=44, LogicalNot=45, Dot=46, Arrow=47, ClassSpec=48, LeftParen=49, 
		RightParen=50, LeftBrac=51, RightBrac=52, SemiColon=53, Comma=54, Increment=55, 
		Decrement=56, RightShift=57, LeftShift=58, Assign=59, LeftShiftEqual=60, 
		RightShiftEqual=61, PlusEqual=62, MinusEqual=63, MultEqual=64, Whitespace=65, 
		Newline=66, BlockComment=67, LineComment=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Begin", "BigInt", "Break", "Decl", "Expr", "Public", "Private", "TypeOf", 
			"Vector", "Case", "Char", "Class", "CharSeq", "Continue", "Double", "Function", 
			"Else", "End", "For", "Int", "If", "Return", "Switch", "Void", "While", 
			"TE", "LE", "Digit", "IDNonDigit", "Identifier", "Literal", "IntegerLiteral", 
			"IntLiteral", "BigIntLiteral", "IntSuffix", "FloatingLiteral", "ExponentialPart", 
			"PositiveExponentialPart", "CharacterLiteral", "CharacterLiteralBody", 
			"SimpleEscapeSequence", "StringLiteral", "StringLiteralBody", "BooleanLiteral", 
			"Add", "Sub", "Mult", "Div", "Mod", "Tilde", "Exponent", "LessThan", 
			"GreaterThan", "Equality", "Inequality", "LessThanEqual", "GreaterThanEqual", 
			"LogicalAnd", "LogicalOr", "LogicalNot", "Dot", "Arrow", "ClassSpec", 
			"LeftParen", "RightParen", "LeftBrac", "RightBrac", "SemiColon", "Comma", 
			"Increment", "Decrement", "RightShift", "LeftShift", "Assign", "LeftShiftEqual", 
			"RightShiftEqual", "PlusEqual", "MinusEqual", "MultEqual", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'bigint'", "'break'", "'decl'", "'expr'", "'public'", 
			"'private'", "'typeof'", "'vector'", "'case'", "'char'", "'class'", "'charseq'", 
			"'continue'", "'double'", "'function'", "'else'", "'end'", "'for'", "'int'", 
			"'if'", "'return'", "'switch'", "'void'", "'while'", null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'^'", "'<'", "'>'", 
			"'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'!'", "'.'", "'->'", 
			"'::'", "'('", "')'", "'['", "']'", "';'", "','", "'++'", "'--'", "'>>'", 
			"'<<'", "'='", "'<<='", "'>>='", "'+='", "'-='", "'*='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Begin", "BigInt", "Break", "Decl", "Expr", "Public", "Private", 
			"TypeOf", "Vector", "Case", "Char", "Class", "CharSeq", "Continue", "Double", 
			"Function", "Else", "End", "For", "Int", "If", "Return", "Switch", "Void", 
			"While", "TE", "LE", "Identifier", "Literal", "Add", "Sub", "Mult", "Div", 
			"Mod", "Tilde", "Exponent", "LessThan", "GreaterThan", "Equality", "Inequality", 
			"LessThanEqual", "GreaterThanEqual", "LogicalAnd", "LogicalOr", "LogicalNot", 
			"Dot", "Arrow", "ClassSpec", "LeftParen", "RightParen", "LeftBrac", "RightBrac", 
			"SemiColon", "Comma", "Increment", "Decrement", "RightShift", "LeftShift", 
			"Assign", "LeftShiftEqual", "RightShiftEqual", "PlusEqual", "MinusEqual", 
			"MultEqual", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LucasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LucasLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u025e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u0157\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u015e\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37\u0167\n\37\f"+
		"\37\16\37\u016a\13\37\3 \3 \3 \3 \3 \5 \u0171\n \3!\3!\5!\u0175\n!\3\""+
		"\3\"\3\"\3#\6#\u017b\n#\r#\16#\u017c\3#\5#\u0180\n#\3$\3$\3%\6%\u0185"+
		"\n%\r%\16%\u0186\3%\3%\3%\7%\u018c\n%\f%\16%\u018f\13%\3%\3%\6%\u0193"+
		"\n%\r%\16%\u0194\3%\5%\u0198\n%\3%\6%\u019b\n%\r%\16%\u019c\3%\3%\7%\u01a1"+
		"\n%\f%\16%\u01a4\13%\3%\5%\u01a7\n%\5%\u01a9\n%\3&\3&\5&\u01ad\n&\3&\6"+
		"&\u01b0\n&\r&\16&\u01b1\3\'\3\'\5\'\u01b6\n\'\3\'\6\'\u01b9\n\'\r\'\16"+
		"\'\u01ba\3(\3(\3(\3(\3)\3)\5)\u01c3\n)\3*\3*\3*\3+\3+\3+\3+\3,\7,\u01cd"+
		"\n,\f,\16,\u01d0\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01db\n-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3H"+
		"\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3O\3O"+
		"\3O\3P\3P\3P\3Q\6Q\u0237\nQ\rQ\16Q\u0238\3Q\3Q\3R\3R\5R\u023f\nR\3R\5"+
		"R\u0242\nR\3R\3R\3S\3S\3S\3S\7S\u024a\nS\fS\16S\u024d\13S\3S\3S\3S\3S"+
		"\3S\3T\3T\3T\3T\7T\u0258\nT\fT\16T\u025b\13T\3T\3T\3\u024b\2U\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\2=\36?\37A\2"+
		"C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[ ]!_\"a#c$e%g&i\'k(m)o*q+s,u-w.y"+
		"/{\60}\61\177\62\u0081\63\u0083\64\u0085\65\u0087\66\u0089\67\u008b8\u008d"+
		"9\u008f:\u0091;\u0093<\u0095=\u0097>\u0099?\u009b@\u009dA\u009fB\u00a1"+
		"C\u00a3D\u00a5E\u00a7F\3\2\13\3\2\62;\5\2C\\aac|\4\2GGgg\4\2--//\3\2-"+
		"-\6\2\f\f\17\17))^^\n\2$$))AA^^ppttvvxx\4\2\13\13\"\"\4\2\f\f\17\17\2"+
		"\u0272\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\3\u00a9\3\2\2\2\5\u00af"+
		"\3\2\2\2\7\u00b6\3\2\2\2\t\u00bc\3\2\2\2\13\u00c1\3\2\2\2\r\u00c6\3\2"+
		"\2\2\17\u00cd\3\2\2\2\21\u00d5\3\2\2\2\23\u00dc\3\2\2\2\25\u00e3\3\2\2"+
		"\2\27\u00e8\3\2\2\2\31\u00ed\3\2\2\2\33\u00f3\3\2\2\2\35\u00fb\3\2\2\2"+
		"\37\u0104\3\2\2\2!\u010b\3\2\2\2#\u0114\3\2\2\2%\u0119\3\2\2\2\'\u011d"+
		"\3\2\2\2)\u0121\3\2\2\2+\u0125\3\2\2\2-\u0128\3\2\2\2/\u012f\3\2\2\2\61"+
		"\u0136\3\2\2\2\63\u013b\3\2\2\2\65\u0156\3\2\2\2\67\u015d\3\2\2\29\u015f"+
		"\3\2\2\2;\u0161\3\2\2\2=\u0163\3\2\2\2?\u0170\3\2\2\2A\u0174\3\2\2\2C"+
		"\u0176\3\2\2\2E\u017a\3\2\2\2G\u0181\3\2\2\2I\u01a8\3\2\2\2K\u01aa\3\2"+
		"\2\2M\u01b3\3\2\2\2O\u01bc\3\2\2\2Q\u01c2\3\2\2\2S\u01c4\3\2\2\2U\u01c7"+
		"\3\2\2\2W\u01ce\3\2\2\2Y\u01da\3\2\2\2[\u01dc\3\2\2\2]\u01de\3\2\2\2_"+
		"\u01e0\3\2\2\2a\u01e2\3\2\2\2c\u01e4\3\2\2\2e\u01e6\3\2\2\2g\u01e8\3\2"+
		"\2\2i\u01ea\3\2\2\2k\u01ec\3\2\2\2m\u01ee\3\2\2\2o\u01f1\3\2\2\2q\u01f4"+
		"\3\2\2\2s\u01f7\3\2\2\2u\u01fa\3\2\2\2w\u01fd\3\2\2\2y\u0200\3\2\2\2{"+
		"\u0202\3\2\2\2}\u0204\3\2\2\2\177\u0207\3\2\2\2\u0081\u020a\3\2\2\2\u0083"+
		"\u020c\3\2\2\2\u0085\u020e\3\2\2\2\u0087\u0210\3\2\2\2\u0089\u0212\3\2"+
		"\2\2\u008b\u0214\3\2\2\2\u008d\u0216\3\2\2\2\u008f\u0219\3\2\2\2\u0091"+
		"\u021c\3\2\2\2\u0093\u021f\3\2\2\2\u0095\u0222\3\2\2\2\u0097\u0224\3\2"+
		"\2\2\u0099\u0228\3\2\2\2\u009b\u022c\3\2\2\2\u009d\u022f\3\2\2\2\u009f"+
		"\u0232\3\2\2\2\u00a1\u0236\3\2\2\2\u00a3\u0241\3\2\2\2\u00a5\u0245\3\2"+
		"\2\2\u00a7\u0253\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7i\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\4\3\2\2\2\u00af\u00b0"+
		"\7d\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\u00b5\7v\2\2\u00b5\6\3\2\2\2\u00b6\u00b7\7d\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7m\2\2"+
		"\u00bb\b\3\2\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7e"+
		"\2\2\u00bf\u00c0\7n\2\2\u00c0\n\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7z\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7t\2\2\u00c5\f\3\2\2\2\u00c6\u00c7"+
		"\7r\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7e\2\2\u00cc\16\3\2\2\2\u00cd\u00ce\7r\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7x\2\2\u00d1\u00d2\7c\2\2"+
		"\u00d2\u00d3\7v\2\2\u00d3\u00d4\7g\2\2\u00d4\20\3\2\2\2\u00d5\u00d6\7"+
		"v\2\2\u00d6\u00d7\7{\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da"+
		"\7q\2\2\u00da\u00db\7h\2\2\u00db\22\3\2\2\2\u00dc\u00dd\7x\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7q\2\2\u00e1"+
		"\u00e2\7t\2\2\u00e2\24\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7\26\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9"+
		"\u00ea\7j\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7t\2\2\u00ec\30\3\2\2\2\u00ed"+
		"\u00ee\7e\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7u\2\2"+
		"\u00f1\u00f2\7u\2\2\u00f2\32\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7"+
		"j\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9"+
		"\7g\2\2\u00f9\u00fa\7s\2\2\u00fa\34\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd"+
		"\7q\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7k\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7w\2\2\u0102\u0103\7g\2\2\u0103\36\3\2\2\2\u0104"+
		"\u0105\7f\2\2\u0105\u0106\7q\2\2\u0106\u0107\7w\2\2\u0107\u0108\7d\2\2"+
		"\u0108\u0109\7n\2\2\u0109\u010a\7g\2\2\u010a \3\2\2\2\u010b\u010c\7h\2"+
		"\2\u010c\u010d\7w\2\2\u010d\u010e\7p\2\2\u010e\u010f\7e\2\2\u010f\u0110"+
		"\7v\2\2\u0110\u0111\7k\2\2\u0111\u0112\7q\2\2\u0112\u0113\7p\2\2\u0113"+
		"\"\3\2\2\2\u0114\u0115\7g\2\2\u0115\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117"+
		"\u0118\7g\2\2\u0118$\3\2\2\2\u0119\u011a\7g\2\2\u011a\u011b\7p\2\2\u011b"+
		"\u011c\7f\2\2\u011c&\3\2\2\2\u011d\u011e\7h\2\2\u011e\u011f\7q\2\2\u011f"+
		"\u0120\7t\2\2\u0120(\3\2\2\2\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123"+
		"\u0124\7v\2\2\u0124*\3\2\2\2\u0125\u0126\7k\2\2\u0126\u0127\7h\2\2\u0127"+
		",\3\2\2\2\u0128\u0129\7t\2\2\u0129\u012a\7g\2\2\u012a\u012b\7v\2\2\u012b"+
		"\u012c\7w\2\2\u012c\u012d\7t\2\2\u012d\u012e\7p\2\2\u012e.\3\2\2\2\u012f"+
		"\u0130\7u\2\2\u0130\u0131\7y\2\2\u0131\u0132\7k\2\2\u0132\u0133\7v\2\2"+
		"\u0133\u0134\7e\2\2\u0134\u0135\7j\2\2\u0135\60\3\2\2\2\u0136\u0137\7"+
		"x\2\2\u0137\u0138\7q\2\2\u0138\u0139\7k\2\2\u0139\u013a\7f\2\2\u013a\62"+
		"\3\2\2\2\u013b\u013c\7y\2\2\u013c\u013d\7j\2\2\u013d\u013e\7k\2\2\u013e"+
		"\u013f\7n\2\2\u013f\u0140\7g\2\2\u0140\64\3\2\2\2\u0141\u0142\7u\2\2\u0142"+
		"\u0143\7k\2\2\u0143\u0157\7p\2\2\u0144\u0145\7e\2\2\u0145\u0146\7q\2\2"+
		"\u0146\u0157\7u\2\2\u0147\u0148\7v\2\2\u0148\u0149\7c\2\2\u0149\u0157"+
		"\7p\2\2\u014a\u014b\7c\2\2\u014b\u014c\7u\2\2\u014c\u014d\7k\2\2\u014d"+
		"\u0157\7p\2\2\u014e\u014f\7c\2\2\u014f\u0150\7e\2\2\u0150\u0151\7q\2\2"+
		"\u0151\u0157\7u\2\2\u0152\u0153\7c\2\2\u0153\u0154\7v\2\2\u0154\u0155"+
		"\7c\2\2\u0155\u0157\7p\2\2\u0156\u0141\3\2\2\2\u0156\u0144\3\2\2\2\u0156"+
		"\u0147\3\2\2\2\u0156\u014a\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0152\3\2"+
		"\2\2\u0157\66\3\2\2\2\u0158\u0159\7n\2\2\u0159\u015a\7q\2\2\u015a\u015e"+
		"\7i\2\2\u015b\u015c\7n\2\2\u015c\u015e\7p\2\2\u015d\u0158\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e8\3\2\2\2\u015f\u0160\t\2\2\2\u0160:\3\2\2\2\u0161"+
		"\u0162\t\3\2\2\u0162<\3\2\2\2\u0163\u0168\5;\36\2\u0164\u0167\5;\36\2"+
		"\u0165\u0167\59\35\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u016a"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169>\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u0171\5A!\2\u016c\u0171\5I%\2\u016d\u0171\5O(\2\u016e"+
		"\u0171\5U+\2\u016f\u0171\5Y-\2\u0170\u016b\3\2\2\2\u0170\u016c\3\2\2\2"+
		"\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171@\3"+
		"\2\2\2\u0172\u0175\5C\"\2\u0173\u0175\5E#\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0173\3\2\2\2\u0175B\3\2\2\2\u0176\u0177\5E#\2\u0177\u0178\5G$\2\u0178"+
		"D\3\2\2\2\u0179\u017b\59\35\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2"+
		"\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180"+
		"\5M\'\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180F\3\2\2\2\u0181\u0182"+
		"\7K\2\2\u0182H\3\2\2\2\u0183\u0185\59\35\2\u0184\u0183\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\5K&\2\u0189\u01a9\3\2\2\2\u018a\u018c\59\35\2\u018b\u018a\3\2\2"+
		"\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\7\60\2\2\u0191\u0193\59\35\2"+
		"\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0198\5K&\2\u0197\u0196\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u01a9\3\2\2\2\u0199\u019b\59\35\2\u019a\u0199\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a2\7\60\2\2\u019f\u01a1\59\35\2\u01a0\u019f\3"+
		"\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\5K&\2\u01a6\u01a5\3\2\2"+
		"\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u0184\3\2\2\2\u01a8\u018d"+
		"\3\2\2\2\u01a8\u019a\3\2\2\2\u01a9J\3\2\2\2\u01aa\u01ac\t\4\2\2\u01ab"+
		"\u01ad\t\5\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01b0\59\35\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2L\3\2\2\2\u01b3\u01b5\t\4\2\2"+
		"\u01b4\u01b6\t\6\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8"+
		"\3\2\2\2\u01b7\u01b9\59\35\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbN\3\2\2\2\u01bc\u01bd\7)\2\2\u01bd"+
		"\u01be\5Q)\2\u01be\u01bf\7)\2\2\u01bfP\3\2\2\2\u01c0\u01c3\n\7\2\2\u01c1"+
		"\u01c3\5S*\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3R\3\2\2\2\u01c4"+
		"\u01c5\7^\2\2\u01c5\u01c6\t\b\2\2\u01c6T\3\2\2\2\u01c7\u01c8\7$\2\2\u01c8"+
		"\u01c9\5W,\2\u01c9\u01ca\7$\2\2\u01caV\3\2\2\2\u01cb\u01cd\5Q)\2\u01cc"+
		"\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cfX\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3"+
		"\7t\2\2\u01d3\u01d4\7w\2\2\u01d4\u01db\7g\2\2\u01d5\u01d6\7h\2\2\u01d6"+
		"\u01d7\7c\2\2\u01d7\u01d8\7n\2\2\u01d8\u01d9\7u\2\2\u01d9\u01db\7g\2\2"+
		"\u01da\u01d1\3\2\2\2\u01da\u01d5\3\2\2\2\u01dbZ\3\2\2\2\u01dc\u01dd\7"+
		"-\2\2\u01dd\\\3\2\2\2\u01de\u01df\7/\2\2\u01df^\3\2\2\2\u01e0\u01e1\7"+
		",\2\2\u01e1`\3\2\2\2\u01e2\u01e3\7\61\2\2\u01e3b\3\2\2\2\u01e4\u01e5\7"+
		"\'\2\2\u01e5d\3\2\2\2\u01e6\u01e7\7\u0080\2\2\u01e7f\3\2\2\2\u01e8\u01e9"+
		"\7`\2\2\u01e9h\3\2\2\2\u01ea\u01eb\7>\2\2\u01ebj\3\2\2\2\u01ec\u01ed\7"+
		"@\2\2\u01edl\3\2\2\2\u01ee\u01ef\7?\2\2\u01ef\u01f0\7?\2\2\u01f0n\3\2"+
		"\2\2\u01f1\u01f2\7#\2\2\u01f2\u01f3\7?\2\2\u01f3p\3\2\2\2\u01f4\u01f5"+
		"\7>\2\2\u01f5\u01f6\7?\2\2\u01f6r\3\2\2\2\u01f7\u01f8\7@\2\2\u01f8\u01f9"+
		"\7?\2\2\u01f9t\3\2\2\2\u01fa\u01fb\7(\2\2\u01fb\u01fc\7(\2\2\u01fcv\3"+
		"\2\2\2\u01fd\u01fe\7~\2\2\u01fe\u01ff\7~\2\2\u01ffx\3\2\2\2\u0200\u0201"+
		"\7#\2\2\u0201z\3\2\2\2\u0202\u0203\7\60\2\2\u0203|\3\2\2\2\u0204\u0205"+
		"\7/\2\2\u0205\u0206\7@\2\2\u0206~\3\2\2\2\u0207\u0208\7<\2\2\u0208\u0209"+
		"\7<\2\2\u0209\u0080\3\2\2\2\u020a\u020b\7*\2\2\u020b\u0082\3\2\2\2\u020c"+
		"\u020d\7+\2\2\u020d\u0084\3\2\2\2\u020e\u020f\7]\2\2\u020f\u0086\3\2\2"+
		"\2\u0210\u0211\7_\2\2\u0211\u0088\3\2\2\2\u0212\u0213\7=\2\2\u0213\u008a"+
		"\3\2\2\2\u0214\u0215\7.\2\2\u0215\u008c\3\2\2\2\u0216\u0217\7-\2\2\u0217"+
		"\u0218\7-\2\2\u0218\u008e\3\2\2\2\u0219\u021a\7/\2\2\u021a\u021b\7/\2"+
		"\2\u021b\u0090\3\2\2\2\u021c\u021d\7@\2\2\u021d\u021e\7@\2\2\u021e\u0092"+
		"\3\2\2\2\u021f\u0220\7>\2\2\u0220\u0221\7>\2\2\u0221\u0094\3\2\2\2\u0222"+
		"\u0223\7?\2\2\u0223\u0096\3\2\2\2\u0224\u0225\7>\2\2\u0225\u0226\7>\2"+
		"\2\u0226\u0227\7?\2\2\u0227\u0098\3\2\2\2\u0228\u0229\7@\2\2\u0229\u022a"+
		"\7@\2\2\u022a\u022b\7?\2\2\u022b\u009a\3\2\2\2\u022c\u022d\7-\2\2\u022d"+
		"\u022e\7?\2\2\u022e\u009c\3\2\2\2\u022f\u0230\7/\2\2\u0230\u0231\7?\2"+
		"\2\u0231\u009e\3\2\2\2\u0232\u0233\7,\2\2\u0233\u0234\7?\2\2\u0234\u00a0"+
		"\3\2\2\2\u0235\u0237\t\t\2\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\bQ"+
		"\2\2\u023b\u00a2\3\2\2\2\u023c\u023e\7\17\2\2\u023d\u023f\7\f\2\2\u023e"+
		"\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u0242\7\f"+
		"\2\2\u0241\u023c\3\2\2\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0244\bR\2\2\u0244\u00a4\3\2\2\2\u0245\u0246\7\61\2\2\u0246\u0247\7,"+
		"\2\2\u0247\u024b\3\2\2\2\u0248\u024a\13\2\2\2\u0249\u0248\3\2\2\2\u024a"+
		"\u024d\3\2\2\2\u024b\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024e\3\2"+
		"\2\2\u024d\u024b\3\2\2\2\u024e\u024f\7,\2\2\u024f\u0250\7\61\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0252\bS\2\2\u0252\u00a6\3\2\2\2\u0253\u0254\7\61"+
		"\2\2\u0254\u0255\7\61\2\2\u0255\u0259\3\2\2\2\u0256\u0258\n\n\2\2\u0257"+
		"\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\bT\2\2\u025d"+
		"\u00a8\3\2\2\2\37\2\u0156\u015d\u0166\u0168\u0170\u0174\u017c\u017f\u0186"+
		"\u018d\u0194\u0197\u019c\u01a2\u01a6\u01a8\u01ac\u01b1\u01b5\u01ba\u01c2"+
		"\u01ce\u01da\u0238\u023e\u0241\u024b\u0259\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}