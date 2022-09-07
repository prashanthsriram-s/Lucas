// Generated from /home/jatin/programming/compilers/compilers-2-project-team-3-aug22/LucasLexer.g4 by ANTLR 4.9.2
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
		Void=24, While=25, Identifier=26, Literal=27, Add=28, Sub=29, Mult=30, 
		Div=31, Mod=32, Exponent=33, LessThan=34, GreaterThan=35, Equality=36, 
		Inequality=37, LessThanEqual=38, GreaterThanEqual=39, LogicalAnd=40, LogicalOr=41, 
		LogicalNot=42, Dot=43, Arrow=44, ClassSpec=45, LeftParen=46, RightParen=47, 
		LeftBrac=48, RightBrac=49, SemiColon=50, Comma=51, Increment=52, Decrement=53, 
		RightShift=54, LeftShift=55, Assign=56, LeftShiftEqual=57, RightShiftEqual=58, 
		PlusEqual=59, MinusEqual=60, MultEqual=61, TE=62, LE=63, Whitespace=64, 
		Newline=65, BlockComment=66, LineComment=67;
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
			"Digit", "IDNonDigit", "Identifier", "Literal", "IntegerLiteral", "IntLiteral", 
			"BigIntLiteral", "IntSuffix", "FloatingLiteral", "ExponentialPart", "PositiveExponentialPart", 
			"CharacterLiteral", "CharacterLiteralBody", "SimpleEscapeSequence", "StringLiteral", 
			"StringLiteralBody", "BooleanLiteral", "Add", "Sub", "Mult", "Div", "Mod", 
			"Exponent", "LessThan", "GreaterThan", "Equality", "Inequality", "LessThanEqual", 
			"GreaterThanEqual", "LogicalAnd", "LogicalOr", "LogicalNot", "Dot", "Arrow", 
			"ClassSpec", "LeftParen", "RightParen", "LeftBrac", "RightBrac", "SemiColon", 
			"Comma", "Increment", "Decrement", "RightShift", "LeftShift", "Assign", 
			"LeftShiftEqual", "RightShiftEqual", "PlusEqual", "MinusEqual", "MultEqual", 
			"TE", "LE", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'bigint'", "'break'", "'decl'", "'expr'", "'public'", 
			"'private'", "'typeof'", "'vector'", "'case'", "'char'", "'class'", "'charseq'", 
			"'continue'", "'double'", "'function'", "'else'", "'end'", "'for'", "'int'", 
			"'if'", "'return'", "'switch'", "'void'", "'while'", null, null, "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'<'", "'>'", "'=='", "'!='", "'<='", 
			"'>='", "'&&'", "'||'", "'!'", "'.'", "'->'", "'::'", "'('", "')'", "'['", 
			"']'", "';'", "','", "'++'", "'--'", "'>>'", "'<<'", "'='", "'<<='", 
			"'>>='", "'+='", "'-='", "'*='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Begin", "BigInt", "Break", "Decl", "Expr", "Public", "Private", 
			"TypeOf", "Vector", "Case", "Char", "Class", "CharSeq", "Continue", "Double", 
			"Function", "Else", "End", "For", "Int", "If", "Return", "Switch", "Void", 
			"While", "Identifier", "Literal", "Add", "Sub", "Mult", "Div", "Mod", 
			"Exponent", "LessThan", "GreaterThan", "Equality", "Inequality", "LessThanEqual", 
			"GreaterThanEqual", "LogicalAnd", "LogicalOr", "LogicalNot", "Dot", "Arrow", 
			"ClassSpec", "LeftParen", "RightParen", "LeftBrac", "RightBrac", "SemiColon", 
			"Comma", "Increment", "Decrement", "RightShift", "LeftShift", "Assign", 
			"LeftShiftEqual", "RightShiftEqual", "PlusEqual", "MinusEqual", "MultEqual", 
			"TE", "LE", "Whitespace", "Newline", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u025a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\7\35\u0147\n\35\f\35\16\35\u014a\13\35\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0151\n\36\3\37\3\37\5\37\u0155\n\37\3 \3 \3 \3!"+
		"\6!\u015b\n!\r!\16!\u015c\3!\5!\u0160\n!\3\"\3\"\3#\6#\u0165\n#\r#\16"+
		"#\u0166\3#\3#\3#\7#\u016c\n#\f#\16#\u016f\13#\3#\3#\6#\u0173\n#\r#\16"+
		"#\u0174\3#\5#\u0178\n#\3#\6#\u017b\n#\r#\16#\u017c\3#\3#\7#\u0181\n#\f"+
		"#\16#\u0184\13#\3#\5#\u0187\n#\5#\u0189\n#\3$\3$\5$\u018d\n$\3$\6$\u0190"+
		"\n$\r$\16$\u0191\3%\3%\5%\u0196\n%\3%\6%\u0199\n%\r%\16%\u019a\3&\3&\3"+
		"&\3&\3\'\3\'\5\'\u01a3\n\'\3(\3(\3(\3)\3)\3)\3)\3*\7*\u01ad\n*\f*\16*"+
		"\u01b0\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01bb\n+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3;\3<\3"+
		"<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3E\3E\3E\3"+
		"F\3F\3F\3G\3G\3G\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3"+
		"M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5"+
		"N\u0229\nN\3O\3O\3O\3O\3O\5O\u0230\nO\3P\6P\u0233\nP\rP\16P\u0234\3P\3"+
		"P\3Q\3Q\5Q\u023b\nQ\3Q\5Q\u023e\nQ\3Q\3Q\3R\3R\3R\3R\7R\u0246\nR\fR\16"+
		"R\u0249\13R\3R\3R\3R\3R\3R\3S\3S\3S\3S\7S\u0254\nS\fS\16S\u0257\13S\3"+
		"S\3S\3\u0247\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\2\67\29\34;\35=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\36Y\37[ ]!_\""+
		"a#c$e%g&i\'k(m)o*q+s,u-w.y/{\60}\61\177\62\u0081\63\u0083\64\u0085\65"+
		"\u0087\66\u0089\67\u008b8\u008d9\u008f:\u0091;\u0093<\u0095=\u0097>\u0099"+
		"?\u009b@\u009dA\u009fB\u00a1C\u00a3D\u00a5E\3\2\13\3\2\62;\5\2C\\aac|"+
		"\4\2GGgg\4\2--//\3\2--\6\2\f\f\17\17))^^\n\2$$))AA^^ppttvvxx\4\2\13\13"+
		"\"\"\4\2\f\f\17\17\2\u026e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\3\u00a7\3\2\2\2\5\u00ad"+
		"\3\2\2\2\7\u00b4\3\2\2\2\t\u00ba\3\2\2\2\13\u00bf\3\2\2\2\r\u00c4\3\2"+
		"\2\2\17\u00cb\3\2\2\2\21\u00d3\3\2\2\2\23\u00da\3\2\2\2\25\u00e1\3\2\2"+
		"\2\27\u00e6\3\2\2\2\31\u00eb\3\2\2\2\33\u00f1\3\2\2\2\35\u00f9\3\2\2\2"+
		"\37\u0102\3\2\2\2!\u0109\3\2\2\2#\u0112\3\2\2\2%\u0117\3\2\2\2\'\u011b"+
		"\3\2\2\2)\u011f\3\2\2\2+\u0123\3\2\2\2-\u0126\3\2\2\2/\u012d\3\2\2\2\61"+
		"\u0134\3\2\2\2\63\u0139\3\2\2\2\65\u013f\3\2\2\2\67\u0141\3\2\2\29\u0143"+
		"\3\2\2\2;\u0150\3\2\2\2=\u0154\3\2\2\2?\u0156\3\2\2\2A\u015a\3\2\2\2C"+
		"\u0161\3\2\2\2E\u0188\3\2\2\2G\u018a\3\2\2\2I\u0193\3\2\2\2K\u019c\3\2"+
		"\2\2M\u01a2\3\2\2\2O\u01a4\3\2\2\2Q\u01a7\3\2\2\2S\u01ae\3\2\2\2U\u01ba"+
		"\3\2\2\2W\u01bc\3\2\2\2Y\u01be\3\2\2\2[\u01c0\3\2\2\2]\u01c2\3\2\2\2_"+
		"\u01c4\3\2\2\2a\u01c6\3\2\2\2c\u01c8\3\2\2\2e\u01ca\3\2\2\2g\u01cc\3\2"+
		"\2\2i\u01cf\3\2\2\2k\u01d2\3\2\2\2m\u01d5\3\2\2\2o\u01d8\3\2\2\2q\u01db"+
		"\3\2\2\2s\u01de\3\2\2\2u\u01e0\3\2\2\2w\u01e2\3\2\2\2y\u01e5\3\2\2\2{"+
		"\u01e8\3\2\2\2}\u01ea\3\2\2\2\177\u01ec\3\2\2\2\u0081\u01ee\3\2\2\2\u0083"+
		"\u01f0\3\2\2\2\u0085\u01f2\3\2\2\2\u0087\u01f4\3\2\2\2\u0089\u01f7\3\2"+
		"\2\2\u008b\u01fa\3\2\2\2\u008d\u01fd\3\2\2\2\u008f\u0200\3\2\2\2\u0091"+
		"\u0202\3\2\2\2\u0093\u0206\3\2\2\2\u0095\u020a\3\2\2\2\u0097\u020d\3\2"+
		"\2\2\u0099\u0210\3\2\2\2\u009b\u0228\3\2\2\2\u009d\u022f\3\2\2\2\u009f"+
		"\u0232\3\2\2\2\u00a1\u023d\3\2\2\2\u00a3\u0241\3\2\2\2\u00a5\u024f\3\2"+
		"\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab"+
		"\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\4\3\2\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\6\3\2\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7t\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7m\2\2\u00b9\b\3\2\2\2\u00ba"+
		"\u00bb\7f\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7n\2\2"+
		"\u00be\n\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7z\2\2\u00c1\u00c2\7r"+
		"\2\2\u00c2\u00c3\7t\2\2\u00c3\f\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6"+
		"\7w\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7k\2\2\u00c9"+
		"\u00ca\7e\2\2\u00ca\16\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7v\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2\20\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7"+
		"{\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9"+
		"\7h\2\2\u00d9\22\3\2\2\2\u00da\u00db\7x\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd"+
		"\7e\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\24\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\26\3\2\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7j\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7t\2\2\u00ea\30\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec"+
		"\u00ed\7n\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7u\2\2"+
		"\u00f0\32\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4\7"+
		"c\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8"+
		"\7s\2\2\u00f8\34\3\2\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc"+
		"\7p\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ff"+
		"\u0100\7w\2\2\u0100\u0101\7g\2\2\u0101\36\3\2\2\2\u0102\u0103\7f\2\2\u0103"+
		"\u0104\7q\2\2\u0104\u0105\7w\2\2\u0105\u0106\7d\2\2\u0106\u0107\7n\2\2"+
		"\u0107\u0108\7g\2\2\u0108 \3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b\7w\2"+
		"\2\u010b\u010c\7p\2\2\u010c\u010d\7e\2\2\u010d\u010e\7v\2\2\u010e\u010f"+
		"\7k\2\2\u010f\u0110\7q\2\2\u0110\u0111\7p\2\2\u0111\"\3\2\2\2\u0112\u0113"+
		"\7g\2\2\u0113\u0114\7n\2\2\u0114\u0115\7u\2\2\u0115\u0116\7g\2\2\u0116"+
		"$\3\2\2\2\u0117\u0118\7g\2\2\u0118\u0119\7p\2\2\u0119\u011a\7f\2\2\u011a"+
		"&\3\2\2\2\u011b\u011c\7h\2\2\u011c\u011d\7q\2\2\u011d\u011e\7t\2\2\u011e"+
		"(\3\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2\u0122"+
		"*\3\2\2\2\u0123\u0124\7k\2\2\u0124\u0125\7h\2\2\u0125,\3\2\2\2\u0126\u0127"+
		"\7t\2\2\u0127\u0128\7g\2\2\u0128\u0129\7v\2\2\u0129\u012a\7w\2\2\u012a"+
		"\u012b\7t\2\2\u012b\u012c\7p\2\2\u012c.\3\2\2\2\u012d\u012e\7u\2\2\u012e"+
		"\u012f\7y\2\2\u012f\u0130\7k\2\2\u0130\u0131\7v\2\2\u0131\u0132\7e\2\2"+
		"\u0132\u0133\7j\2\2\u0133\60\3\2\2\2\u0134\u0135\7x\2\2\u0135\u0136\7"+
		"q\2\2\u0136\u0137\7k\2\2\u0137\u0138\7f\2\2\u0138\62\3\2\2\2\u0139\u013a"+
		"\7y\2\2\u013a\u013b\7j\2\2\u013b\u013c\7k\2\2\u013c\u013d\7n\2\2\u013d"+
		"\u013e\7g\2\2\u013e\64\3\2\2\2\u013f\u0140\t\2\2\2\u0140\66\3\2\2\2\u0141"+
		"\u0142\t\3\2\2\u01428\3\2\2\2\u0143\u0148\5\67\34\2\u0144\u0147\5\67\34"+
		"\2\u0145\u0147\5\65\33\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149:\3\2\2\2"+
		"\u014a\u0148\3\2\2\2\u014b\u0151\5=\37\2\u014c\u0151\5E#\2\u014d\u0151"+
		"\5K&\2\u014e\u0151\5Q)\2\u014f\u0151\5U+\2\u0150\u014b\3\2\2\2\u0150\u014c"+
		"\3\2\2\2\u0150\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"<\3\2\2\2\u0152\u0155\5? \2\u0153\u0155\5A!\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155>\3\2\2\2\u0156\u0157\5A!\2\u0157\u0158\5C\"\2\u0158"+
		"@\3\2\2\2\u0159\u015b\5\65\33\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2"+
		"\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160"+
		"\5I%\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160B\3\2\2\2\u0161\u0162"+
		"\7K\2\2\u0162D\3\2\2\2\u0163\u0165\5\65\33\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\5G$\2\u0169\u0189\3\2\2\2\u016a\u016c\5\65\33\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\7\60\2\2\u0171"+
		"\u0173\5\65\33\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3"+
		"\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\5G$\2\u0177"+
		"\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0189\3\2\2\2\u0179\u017b\5\65"+
		"\33\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0182\7\60\2\2\u017f\u0181\5"+
		"\65\33\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\5G"+
		"$\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188"+
		"\u0164\3\2\2\2\u0188\u016d\3\2\2\2\u0188\u017a\3\2\2\2\u0189F\3\2\2\2"+
		"\u018a\u018c\t\4\2\2\u018b\u018d\t\5\2\2\u018c\u018b\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0190\5\65\33\2\u018f\u018e\3\2\2\2"+
		"\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192H\3"+
		"\2\2\2\u0193\u0195\t\4\2\2\u0194\u0196\t\6\2\2\u0195\u0194\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0199\5\65\33\2\u0198\u0197\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"J\3\2\2\2\u019c\u019d\7)\2\2\u019d\u019e\5M\'\2\u019e\u019f\7)\2\2\u019f"+
		"L\3\2\2\2\u01a0\u01a3\n\7\2\2\u01a1\u01a3\5O(\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3N\3\2\2\2\u01a4\u01a5\7^\2\2\u01a5\u01a6\t\b\2\2\u01a6"+
		"P\3\2\2\2\u01a7\u01a8\7$\2\2\u01a8\u01a9\5S*\2\u01a9\u01aa\7$\2\2\u01aa"+
		"R\3\2\2\2\u01ab\u01ad\5M\'\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01afT\3\2\2\2\u01b0\u01ae\3\2\2\2"+
		"\u01b1\u01b2\7v\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7w\2\2\u01b4\u01bb"+
		"\7g\2\2\u01b5\u01b6\7h\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7n\2\2\u01b8"+
		"\u01b9\7u\2\2\u01b9\u01bb\7g\2\2\u01ba\u01b1\3\2\2\2\u01ba\u01b5\3\2\2"+
		"\2\u01bbV\3\2\2\2\u01bc\u01bd\7-\2\2\u01bdX\3\2\2\2\u01be\u01bf\7/\2\2"+
		"\u01bfZ\3\2\2\2\u01c0\u01c1\7,\2\2\u01c1\\\3\2\2\2\u01c2\u01c3\7\61\2"+
		"\2\u01c3^\3\2\2\2\u01c4\u01c5\7\'\2\2\u01c5`\3\2\2\2\u01c6\u01c7\7`\2"+
		"\2\u01c7b\3\2\2\2\u01c8\u01c9\7>\2\2\u01c9d\3\2\2\2\u01ca\u01cb\7@\2\2"+
		"\u01cbf\3\2\2\2\u01cc\u01cd\7?\2\2\u01cd\u01ce\7?\2\2\u01ceh\3\2\2\2\u01cf"+
		"\u01d0\7#\2\2\u01d0\u01d1\7?\2\2\u01d1j\3\2\2\2\u01d2\u01d3\7>\2\2\u01d3"+
		"\u01d4\7?\2\2\u01d4l\3\2\2\2\u01d5\u01d6\7@\2\2\u01d6\u01d7\7?\2\2\u01d7"+
		"n\3\2\2\2\u01d8\u01d9\7(\2\2\u01d9\u01da\7(\2\2\u01dap\3\2\2\2\u01db\u01dc"+
		"\7~\2\2\u01dc\u01dd\7~\2\2\u01ddr\3\2\2\2\u01de\u01df\7#\2\2\u01dft\3"+
		"\2\2\2\u01e0\u01e1\7\60\2\2\u01e1v\3\2\2\2\u01e2\u01e3\7/\2\2\u01e3\u01e4"+
		"\7@\2\2\u01e4x\3\2\2\2\u01e5\u01e6\7<\2\2\u01e6\u01e7\7<\2\2\u01e7z\3"+
		"\2\2\2\u01e8\u01e9\7*\2\2\u01e9|\3\2\2\2\u01ea\u01eb\7+\2\2\u01eb~\3\2"+
		"\2\2\u01ec\u01ed\7]\2\2\u01ed\u0080\3\2\2\2\u01ee\u01ef\7_\2\2\u01ef\u0082"+
		"\3\2\2\2\u01f0\u01f1\7=\2\2\u01f1\u0084\3\2\2\2\u01f2\u01f3\7.\2\2\u01f3"+
		"\u0086\3\2\2\2\u01f4\u01f5\7-\2\2\u01f5\u01f6\7-\2\2\u01f6\u0088\3\2\2"+
		"\2\u01f7\u01f8\7/\2\2\u01f8\u01f9\7/\2\2\u01f9\u008a\3\2\2\2\u01fa\u01fb"+
		"\7@\2\2\u01fb\u01fc\7@\2\2\u01fc\u008c\3\2\2\2\u01fd\u01fe\7>\2\2\u01fe"+
		"\u01ff\7>\2\2\u01ff\u008e\3\2\2\2\u0200\u0201\7?\2\2\u0201\u0090\3\2\2"+
		"\2\u0202\u0203\7>\2\2\u0203\u0204\7>\2\2\u0204\u0205\7?\2\2\u0205\u0092"+
		"\3\2\2\2\u0206\u0207\7@\2\2\u0207\u0208\7@\2\2\u0208\u0209\7?\2\2\u0209"+
		"\u0094\3\2\2\2\u020a\u020b\7-\2\2\u020b\u020c\7?\2\2\u020c\u0096\3\2\2"+
		"\2\u020d\u020e\7/\2\2\u020e\u020f\7?\2\2\u020f\u0098\3\2\2\2\u0210\u0211"+
		"\7,\2\2\u0211\u0212\7?\2\2\u0212\u009a\3\2\2\2\u0213\u0214\7u\2\2\u0214"+
		"\u0215\7k\2\2\u0215\u0229\7p\2\2\u0216\u0217\7e\2\2\u0217\u0218\7q\2\2"+
		"\u0218\u0229\7u\2\2\u0219\u021a\7v\2\2\u021a\u021b\7c\2\2\u021b\u0229"+
		"\7p\2\2\u021c\u021d\7c\2\2\u021d\u021e\7u\2\2\u021e\u021f\7k\2\2\u021f"+
		"\u0229\7p\2\2\u0220\u0221\7c\2\2\u0221\u0222\7e\2\2\u0222\u0223\7q\2\2"+
		"\u0223\u0229\7u\2\2\u0224\u0225\7c\2\2\u0225\u0226\7v\2\2\u0226\u0227"+
		"\7c\2\2\u0227\u0229\7p\2\2\u0228\u0213\3\2\2\2\u0228\u0216\3\2\2\2\u0228"+
		"\u0219\3\2\2\2\u0228\u021c\3\2\2\2\u0228\u0220\3\2\2\2\u0228\u0224\3\2"+
		"\2\2\u0229\u009c\3\2\2\2\u022a\u022b\7n\2\2\u022b\u022c\7q\2\2\u022c\u0230"+
		"\7i\2\2\u022d\u022e\7n\2\2\u022e\u0230\7p\2\2\u022f\u022a\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u009e\3\2\2\2\u0231\u0233\t\t\2\2\u0232\u0231\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0237\bP\2\2\u0237\u00a0\3\2\2\2\u0238\u023a\7\17"+
		"\2\2\u0239\u023b\7\f\2\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023e\3\2\2\2\u023c\u023e\7\f\2\2\u023d\u0238\3\2\2\2\u023d\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u0240\bQ\2\2\u0240\u00a2\3\2\2\2\u0241"+
		"\u0242\7\61\2\2\u0242\u0243\7,\2\2\u0243\u0247\3\2\2\2\u0244\u0246\13"+
		"\2\2\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0248\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\7,"+
		"\2\2\u024b\u024c\7\61\2\2\u024c\u024d\3\2\2\2\u024d\u024e\bR\2\2\u024e"+
		"\u00a4\3\2\2\2\u024f\u0250\7\61\2\2\u0250\u0251\7\61\2\2\u0251\u0255\3"+
		"\2\2\2\u0252\u0254\n\n\2\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0258\u0259\bS\2\2\u0259\u00a6\3\2\2\2\37\2\u0146\u0148\u0150\u0154"+
		"\u015c\u015f\u0166\u016d\u0174\u0177\u017c\u0182\u0186\u0188\u018c\u0191"+
		"\u0195\u019a\u01a2\u01ae\u01ba\u0228\u022f\u0234\u023a\u023d\u0247\u0255"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}