// Generated from c:\Users\Srivatsan\Desktop\compilers-2-project-team-3-aug22\Parser\LucasGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LucasGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, Begin=21, BigInt=22, Break=23, Decl=24, 
		Expr=25, Public=26, Private=27, TypeOf=28, Vector=29, Case=30, Char=31, 
		Class=32, CharSeq=33, Continue=34, Double=35, Function=36, Else=37, End=38, 
		For=39, Int=40, If=41, Return=42, Switch=43, Void=44, While=45, TE=46, 
		LE=47, Identifier=48, Literal=49, Digit=50, StringLiteral=51, Add=52, 
		Sub=53, Mult=54, Div=55, Mod=56, Tilde=57, Exponent=58, LessThan=59, GreaterThan=60, 
		Equality=61, Inequality=62, LessThanEqual=63, GreaterThanEqual=64, LogicalAnd=65, 
		LogicalOr=66, LogicalNot=67, Dot=68, Arrow=69, ClassSpec=70, LeftParen=71, 
		RightParen=72, LeftBrac=73, RightBrac=74, SemiColon=75, Comma=76, Increment=77, 
		Decrement=78, RightShift=79, LeftShift=80, Assign=81, LeftShiftEqual=82, 
		RightShiftEqual=83, PlusEqual=84, MinusEqual=85, MultEqual=86, DivEqual=87, 
		ModEqual=88, Whitespace=89, Newline=90, BlockComment=91, LineComment=92;
	public static final int
		RULE_primaryExpression = 0, RULE_postfixExpression = 1, RULE_argumentExpressionList = 2, 
		RULE_unaryExpression = 3, RULE_unaryOperator = 4, RULE_castExpression = 5, 
		RULE_multiplicativeExpression = 6, RULE_additiveExpression = 7, RULE_relationalExpression = 8, 
		RULE_equalityExpression = 9, RULE_logicalAndExpression = 10, RULE_logicalOrExpression = 11, 
		RULE_assignmentExpression = 12, RULE_assignmentOperator = 13, RULE_expression = 14, 
		RULE_constantExpression = 15, RULE_declaration = 16, RULE_declarationSpecifiers = 17, 
		RULE_declarationSpecifiers2 = 18, RULE_declarationSpecifier = 19, RULE_initDeclaratorList = 20, 
		RULE_initDeclarator = 21, RULE_typeSpecifier = 22, RULE_structOrUnionSpecifier = 23, 
		RULE_structOrUnion = 24, RULE_structDeclarationList = 25, RULE_structDeclaration = 26, 
		RULE_specifierQualifierList = 27, RULE_structDeclaratorList = 28, RULE_structDeclarator = 29, 
		RULE_typeQualifier = 30, RULE_declarator = 31, RULE_directDeclarator = 32, 
		RULE_vcSpecificModifer = 33, RULE_nestedParenthesesBlock = 34, RULE_pointer = 35, 
		RULE_typeQualifierList = 36, RULE_parameterTypeList = 37, RULE_parameterList = 38, 
		RULE_parameterDeclaration = 39, RULE_identifierList = 40, RULE_typeName = 41, 
		RULE_abstractDeclarator = 42, RULE_directAbstractDeclarator = 43, RULE_typedefName = 44, 
		RULE_initializer = 45, RULE_initializerList = 46, RULE_designation = 47, 
		RULE_designatorList = 48, RULE_designator = 49, RULE_staticAssertDeclaration = 50, 
		RULE_statement = 51, RULE_expressionStatement = 52, RULE_selectionStatement = 53, 
		RULE_iterationStatement = 54, RULE_forCondition = 55, RULE_forDeclaration = 56, 
		RULE_forExpression = 57, RULE_jumpStatement = 58, RULE_compilationUnit = 59, 
		RULE_translationUnit = 60, RULE_externalDeclaration = 61, RULE_functionDeclaration = 62, 
		RULE_functionDefinition = 63, RULE_declarationList = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "postfixExpression", "argumentExpressionList", "unaryExpression", 
			"unaryOperator", "castExpression", "multiplicativeExpression", "additiveExpression", 
			"relationalExpression", "equalityExpression", "logicalAndExpression", 
			"logicalOrExpression", "assignmentExpression", "assignmentOperator", 
			"expression", "constantExpression", "declaration", "declarationSpecifiers", 
			"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
			"initDeclarator", "typeSpecifier", "structOrUnionSpecifier", "structOrUnion", 
			"structDeclarationList", "structDeclaration", "specifierQualifierList", 
			"structDeclaratorList", "structDeclarator", "typeQualifier", "declarator", 
			"directDeclarator", "vcSpecificModifer", "nestedParenthesesBlock", "pointer", 
			"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
			"identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator", 
			"typedefName", "initializer", "initializerList", "designation", "designatorList", 
			"designator", "staticAssertDeclaration", "statement", "expressionStatement", 
			"selectionStatement", "iterationStatement", "forCondition", "forDeclaration", 
			"forExpression", "jumpStatement", "compilationUnit", "translationUnit", 
			"externalDeclaration", "functionDeclaration", "functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'{'", "'}'", "'sizeof'", "'long'", "'float'", 
			"'boolean'", "'struct'", "'union'", "':'", "'const'", "'static'", "'__cdecl'", 
			"'__clrcall'", "'__stdcall'", "'__fastcall'", "'__thiscall'", "'__vectorcall'", 
			"'...'", "'_Static_assert'", "'begin'", "'bigint'", "'break'", "'decl'", 
			"'expr'", "'public'", "'private'", "'typeof'", "'vector'", "'case'", 
			"'char'", "'class'", "'charseq'", "'continue'", "'double'", "'function'", 
			"'else'", "'end'", "'for'", "'int'", "'if'", "'return'", "'switch'", 
			"'void'", "'while'", null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'~'", "'^'", "'<'", "'>'", "'=='", "'!='", "'<='", 
			"'>='", "'&&'", "'||'", "'!'", "'.'", "'->'", "'::'", "'('", "')'", "'['", 
			"']'", "';'", "','", "'++'", "'--'", "'>>'", "'<<'", "'='", "'<<='", 
			"'>>='", "'+='", "'-='", "'*='", "'/='", "'%='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Begin", "BigInt", 
			"Break", "Decl", "Expr", "Public", "Private", "TypeOf", "Vector", "Case", 
			"Char", "Class", "CharSeq", "Continue", "Double", "Function", "Else", 
			"End", "For", "Int", "If", "Return", "Switch", "Void", "While", "TE", 
			"LE", "Identifier", "Literal", "Digit", "StringLiteral", "Add", "Sub", 
			"Mult", "Div", "Mod", "Tilde", "Exponent", "LessThan", "GreaterThan", 
			"Equality", "Inequality", "LessThanEqual", "GreaterThanEqual", "LogicalAnd", 
			"LogicalOr", "LogicalNot", "Dot", "Arrow", "ClassSpec", "LeftParen", 
			"RightParen", "LeftBrac", "RightBrac", "SemiColon", "Comma", "Increment", 
			"Decrement", "RightShift", "LeftShift", "Assign", "LeftShiftEqual", "RightShiftEqual", 
			"PlusEqual", "MinusEqual", "MultEqual", "DivEqual", "ModEqual", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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

	@Override
	public String getGrammarFileName() { return "LucasGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LucasGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public TerminalNode Literal() { return getToken(LucasGrammarParser.Literal, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(LucasGrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(LucasGrammarParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(Identifier);
				}
				break;
			case Literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(Literal);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					match(StringLiteral);
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(LeftParen);
				setState(138);
				expression();
				setState(139);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(LucasGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(LucasGrammarParser.LeftParen, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(LucasGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(LucasGrammarParser.RightParen, i);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public List<TerminalNode> LeftBrac() { return getTokens(LucasGrammarParser.LeftBrac); }
		public TerminalNode LeftBrac(int i) {
			return getToken(LucasGrammarParser.LeftBrac, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBrac() { return getTokens(LucasGrammarParser.RightBrac); }
		public TerminalNode RightBrac(int i) {
			return getToken(LucasGrammarParser.RightBrac, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(LucasGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LucasGrammarParser.Identifier, i);
		}
		public List<TerminalNode> Dot() { return getTokens(LucasGrammarParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(LucasGrammarParser.Dot, i);
		}
		public List<TerminalNode> Arrow() { return getTokens(LucasGrammarParser.Arrow); }
		public TerminalNode Arrow(int i) {
			return getToken(LucasGrammarParser.Arrow, i);
		}
		public List<TerminalNode> Increment() { return getTokens(LucasGrammarParser.Increment); }
		public TerminalNode Increment(int i) {
			return getToken(LucasGrammarParser.Increment, i);
		}
		public List<TerminalNode> Decrement() { return getTokens(LucasGrammarParser.Decrement); }
		public TerminalNode Decrement(int i) {
			return getToken(LucasGrammarParser.Decrement, i);
		}
		public TerminalNode Comma() { return getToken(LucasGrammarParser.Comma, 0); }
		public List<ArgumentExpressionListContext> argumentExpressionList() {
			return getRuleContexts(ArgumentExpressionListContext.class);
		}
		public ArgumentExpressionListContext argumentExpressionList(int i) {
			return getRuleContext(ArgumentExpressionListContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(143);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(144);
					match(T__0);
					}
				}

				setState(147);
				match(LeftParen);
				setState(148);
				typeName();
				setState(149);
				match(RightParen);
				setState(150);
				match(T__1);
				setState(151);
				initializerList();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(152);
					match(Comma);
					}
				}

				setState(155);
				match(T__2);
				}
				break;
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Dot - 68)) | (1L << (Arrow - 68)) | (1L << (LeftParen - 68)) | (1L << (LeftBrac - 68)) | (1L << (Increment - 68)) | (1L << (Decrement - 68)))) != 0)) {
				{
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBrac:
					{
					setState(159);
					match(LeftBrac);
					setState(160);
					expression();
					setState(161);
					match(RightBrac);
					}
					break;
				case LeftParen:
					{
					setState(163);
					match(LeftParen);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
						{
						setState(164);
						argumentExpressionList();
						}
					}

					setState(167);
					match(RightParen);
					}
					break;
				case Dot:
				case Arrow:
					{
					setState(168);
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==Arrow) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(169);
					match(Identifier);
					}
					break;
				case Increment:
				case Decrement:
					{
					setState(170);
					_la = _input.LA(1);
					if ( !(_la==Increment || _la==Decrement) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			assignmentExpression();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(177);
				match(Comma);
				setState(178);
				assignmentExpression();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public TerminalNode LogicalAnd() { return getToken(LucasGrammarParser.LogicalAnd, 0); }
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public List<TerminalNode> Increment() { return getTokens(LucasGrammarParser.Increment); }
		public TerminalNode Increment(int i) {
			return getToken(LucasGrammarParser.Increment, i);
		}
		public List<TerminalNode> Decrement() { return getTokens(LucasGrammarParser.Decrement); }
		public TerminalNode Decrement(int i) {
			return getToken(LucasGrammarParser.Decrement, i);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==Increment || _la==Decrement) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Identifier:
			case Literal:
			case StringLiteral:
			case LeftParen:
				{
				setState(190);
				postfixExpression();
				}
				break;
			case Add:
			case Sub:
			case Mult:
			case Tilde:
			case LogicalNot:
				{
				setState(191);
				unaryOperator();
				setState(192);
				castExpression();
				}
				break;
			case T__3:
				{
				setState(194);
				match(T__3);
				setState(195);
				match(LeftParen);
				setState(196);
				typeName();
				setState(197);
				match(RightParen);
				}
				break;
			case LogicalAnd:
				{
				setState(199);
				match(LogicalAnd);
				setState(200);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Mult() { return getToken(LucasGrammarParser.Mult, 0); }
		public TerminalNode Add() { return getToken(LucasGrammarParser.Add, 0); }
		public TerminalNode Sub() { return getToken(LucasGrammarParser.Sub, 0); }
		public TerminalNode Tilde() { return getToken(LucasGrammarParser.Tilde, 0); }
		public TerminalNode LogicalNot() { return getToken(LucasGrammarParser.LogicalNot, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (Add - 52)) | (1L << (Sub - 52)) | (1L << (Mult - 52)) | (1L << (Tilde - 52)) | (1L << (LogicalNot - 52)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public List<TerminalNode> Digit() { return getTokens(LucasGrammarParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(LucasGrammarParser.Digit, i);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_castExpression);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(205);
					match(T__0);
					}
				}

				setState(208);
				match(LeftParen);
				setState(209);
				typeName();
				setState(210);
				match(RightParen);
				setState(211);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					match(Digit);
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Digit );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> Mult() { return getTokens(LucasGrammarParser.Mult); }
		public TerminalNode Mult(int i) {
			return getToken(LucasGrammarParser.Mult, i);
		}
		public List<TerminalNode> Div() { return getTokens(LucasGrammarParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(LucasGrammarParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(LucasGrammarParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(LucasGrammarParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			castExpression();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mult) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(222);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mult) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				castExpression();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Add() { return getTokens(LucasGrammarParser.Add); }
		public TerminalNode Add(int i) {
			return getToken(LucasGrammarParser.Add, i);
		}
		public List<TerminalNode> Sub() { return getTokens(LucasGrammarParser.Sub); }
		public TerminalNode Sub(int i) {
			return getToken(LucasGrammarParser.Sub, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			multiplicativeExpression();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Add || _la==Sub) {
				{
				{
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Sub) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				multiplicativeExpression();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LessThan() { return getTokens(LucasGrammarParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(LucasGrammarParser.LessThan, i);
		}
		public List<TerminalNode> GreaterThan() { return getTokens(LucasGrammarParser.GreaterThan); }
		public TerminalNode GreaterThan(int i) {
			return getToken(LucasGrammarParser.GreaterThan, i);
		}
		public List<TerminalNode> LessThanEqual() { return getTokens(LucasGrammarParser.LessThanEqual); }
		public TerminalNode LessThanEqual(int i) {
			return getToken(LucasGrammarParser.LessThanEqual, i);
		}
		public List<TerminalNode> GreaterThanEqual() { return getTokens(LucasGrammarParser.GreaterThanEqual); }
		public TerminalNode GreaterThanEqual(int i) {
			return getToken(LucasGrammarParser.GreaterThanEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			additiveExpression();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LessThan - 59)) | (1L << (GreaterThan - 59)) | (1L << (LessThanEqual - 59)) | (1L << (GreaterThanEqual - 59)))) != 0)) {
				{
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LessThan - 59)) | (1L << (GreaterThan - 59)) | (1L << (LessThanEqual - 59)) | (1L << (GreaterThanEqual - 59)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				additiveExpression();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equality() { return getTokens(LucasGrammarParser.Equality); }
		public TerminalNode Equality(int i) {
			return getToken(LucasGrammarParser.Equality, i);
		}
		public List<TerminalNode> Inequality() { return getTokens(LucasGrammarParser.Inequality); }
		public TerminalNode Inequality(int i) {
			return getToken(LucasGrammarParser.Inequality, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			relationalExpression();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equality || _la==Inequality) {
				{
				{
				setState(246);
				_la = _input.LA(1);
				if ( !(_la==Equality || _la==Inequality) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(247);
				relationalExpression();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> LogicalAnd() { return getTokens(LucasGrammarParser.LogicalAnd); }
		public TerminalNode LogicalAnd(int i) {
			return getToken(LucasGrammarParser.LogicalAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			equalityExpression();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalAnd) {
				{
				{
				setState(254);
				match(LogicalAnd);
				setState(255);
				equalityExpression();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> LogicalOr() { return getTokens(LucasGrammarParser.LogicalOr); }
		public TerminalNode LogicalOr(int i) {
			return getToken(LucasGrammarParser.LogicalOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			logicalAndExpression();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOr) {
				{
				{
				setState(262);
				match(LogicalOr);
				setState(263);
				logicalAndExpression();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public List<TerminalNode> Digit() { return getTokens(LucasGrammarParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(LucasGrammarParser.Digit, i);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentExpression);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				unaryExpression();
				setState(271);
				assignmentOperator();
				setState(272);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					match(Digit);
					}
					}
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Digit );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(LucasGrammarParser.Assign, 0); }
		public TerminalNode MultEqual() { return getToken(LucasGrammarParser.MultEqual, 0); }
		public TerminalNode DivEqual() { return getToken(LucasGrammarParser.DivEqual, 0); }
		public TerminalNode ModEqual() { return getToken(LucasGrammarParser.ModEqual, 0); }
		public TerminalNode PlusEqual() { return getToken(LucasGrammarParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(LucasGrammarParser.MinusEqual, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Assign - 81)) | (1L << (PlusEqual - 81)) | (1L << (MinusEqual - 81)) | (1L << (MultEqual - 81)) | (1L << (DivEqual - 81)) | (1L << (ModEqual - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			assignmentExpression();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(284);
				match(Comma);
				setState(285);
				assignmentExpression();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			logicalOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(LucasGrammarParser.SemiColon, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				declarationSpecifiers();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (T__15 - 13)) | (1L << (T__16 - 13)) | (1L << (T__17 - 13)) | (1L << (Identifier - 13)) | (1L << (Mult - 13)) | (1L << (Exponent - 13)) | (1L << (LeftParen - 13)))) != 0)) {
					{
					setState(294);
					initDeclaratorList();
					}
				}

				setState(297);
				match(SemiColon);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(302);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(305); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				declarationSpecifier();
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declarationSpecifier);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				typeSpecifier();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				typeQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			initDeclarator();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(317);
				match(Comma);
				setState(318);
				initDeclarator();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(LucasGrammarParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			declarator();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(325);
				match(Assign);
				setState(326);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(LucasGrammarParser.Void, 0); }
		public TerminalNode Char() { return getToken(LucasGrammarParser.Char, 0); }
		public TerminalNode CharSeq() { return getToken(LucasGrammarParser.CharSeq, 0); }
		public TerminalNode Int() { return getToken(LucasGrammarParser.Int, 0); }
		public TerminalNode BigInt() { return getToken(LucasGrammarParser.BigInt, 0); }
		public TerminalNode Double() { return getToken(LucasGrammarParser.Double, 0); }
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeSpecifier);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				structOrUnionSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				typedefName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				structOrUnion();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(335);
					match(Identifier);
					}
				}

				setState(338);
				match(T__1);
				setState(339);
				structDeclarationList();
				setState(340);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				structOrUnion();
				setState(343);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionContext extends ParserRuleContext {
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(349);
				structDeclaration();
				}
				}
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(LucasGrammarParser.SemiColon, 0); }
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_structDeclaration);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				specifierQualifierList();
				setState(355);
				structDeclaratorList();
				setState(356);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				specifierQualifierList();
				setState(359);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				staticAssertDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				{
				setState(364);
				typeSpecifier();
				}
				break;
			case T__10:
				{
				setState(365);
				typeQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(368);
				specifierQualifierList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			structDeclarator();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(372);
				match(Comma);
				setState(373);
				structDeclarator();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_structDeclarator);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (T__15 - 13)) | (1L << (T__16 - 13)) | (1L << (T__17 - 13)) | (1L << (Identifier - 13)) | (1L << (Mult - 13)) | (1L << (Exponent - 13)) | (1L << (LeftParen - 13)))) != 0)) {
					{
					setState(380);
					declarator();
					}
				}

				setState(383);
				match(T__9);
				setState(384);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mult || _la==Exponent) {
				{
				setState(389);
				pointer();
				}
			}

			setState(392);
			directDeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public List<TerminalNode> Digit() { return getTokens(LucasGrammarParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(LucasGrammarParser.Digit, i);
		}
		public VcSpecificModiferContext vcSpecificModifer() {
			return getRuleContext(VcSpecificModiferContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBrac() { return getToken(LucasGrammarParser.LeftBrac, 0); }
		public TerminalNode RightBrac() { return getToken(LucasGrammarParser.RightBrac, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Mult() { return getToken(LucasGrammarParser.Mult, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(395);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(396);
				match(LeftParen);
				setState(397);
				declarator();
				setState(398);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(400);
				match(Identifier);
				setState(401);
				match(T__9);
				setState(403); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(402);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(405); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				setState(407);
				vcSpecificModifer();
				setState(408);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(410);
				match(LeftParen);
				setState(411);
				vcSpecificModifer();
				setState(412);
				declarator();
				setState(413);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(417);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(418);
						match(LeftBrac);
						setState(420);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(419);
							typeQualifierList();
							}
						}

						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
							{
							setState(422);
							assignmentExpression();
							}
						}

						setState(425);
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(426);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(427);
						match(LeftBrac);
						setState(428);
						match(T__11);
						setState(430);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(429);
							typeQualifierList();
							}
						}

						setState(432);
						assignmentExpression();
						setState(433);
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(435);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(436);
						match(LeftBrac);
						setState(437);
						typeQualifierList();
						setState(438);
						match(T__11);
						setState(439);
						assignmentExpression();
						setState(440);
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(442);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(443);
						match(LeftBrac);
						setState(445);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(444);
							typeQualifierList();
							}
						}

						setState(447);
						match(Mult);
						setState(448);
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(449);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(450);
						match(LeftParen);
						setState(451);
						parameterTypeList();
						setState(452);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(454);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(455);
						match(LeftParen);
						setState(457);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(456);
							identifierList();
							}
						}

						setState(459);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VcSpecificModiferContext extends ParserRuleContext {
		public VcSpecificModiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vcSpecificModifer; }
	}

	public final VcSpecificModiferContext vcSpecificModifer() throws RecognitionException {
		VcSpecificModiferContext _localctx = new VcSpecificModiferContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_vcSpecificModifer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(LucasGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(LucasGrammarParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(LucasGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(LucasGrammarParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Function) | (1L << Else) | (1L << End) | (1L << For) | (1L << Int) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << TE) | (1L << LE) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Div) | (1L << Mod) | (1L << Tilde) | (1L << Exponent) | (1L << LessThan) | (1L << GreaterThan) | (1L << Equality) | (1L << Inequality) | (1L << LessThanEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Comma - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (DivEqual - 64)) | (1L << (ModEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(472);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case Begin:
				case BigInt:
				case Break:
				case Decl:
				case Expr:
				case Public:
				case Private:
				case TypeOf:
				case Vector:
				case Case:
				case Char:
				case Class:
				case CharSeq:
				case Continue:
				case Double:
				case Function:
				case Else:
				case End:
				case For:
				case Int:
				case If:
				case Return:
				case Switch:
				case Void:
				case While:
				case TE:
				case LE:
				case Identifier:
				case Literal:
				case Digit:
				case StringLiteral:
				case Add:
				case Sub:
				case Mult:
				case Div:
				case Mod:
				case Tilde:
				case Exponent:
				case LessThan:
				case GreaterThan:
				case Equality:
				case Inequality:
				case LessThanEqual:
				case GreaterThanEqual:
				case LogicalAnd:
				case LogicalOr:
				case LogicalNot:
				case Dot:
				case Arrow:
				case ClassSpec:
				case LeftBrac:
				case RightBrac:
				case SemiColon:
				case Comma:
				case Increment:
				case Decrement:
				case RightShift:
				case LeftShift:
				case Assign:
				case LeftShiftEqual:
				case RightShiftEqual:
				case PlusEqual:
				case MinusEqual:
				case MultEqual:
				case DivEqual:
				case ModEqual:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(467);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(468);
					match(LeftParen);
					setState(469);
					nestedParenthesesBlock();
					setState(470);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> Mult() { return getTokens(LucasGrammarParser.Mult); }
		public TerminalNode Mult(int i) {
			return getToken(LucasGrammarParser.Mult, i);
		}
		public List<TerminalNode> Exponent() { return getTokens(LucasGrammarParser.Exponent); }
		public TerminalNode Exponent(int i) {
			return getToken(LucasGrammarParser.Exponent, i);
		}
		public List<TypeQualifierListContext> typeQualifierList() {
			return getRuleContexts(TypeQualifierListContext.class);
		}
		public TypeQualifierListContext typeQualifierList(int i) {
			return getRuleContext(TypeQualifierListContext.class,i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==Mult || _la==Exponent) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(478);
					typeQualifierList();
					}
				}

				}
				}
				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Mult || _la==Exponent );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(485);
				typeQualifier();
				}
				}
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(LucasGrammarParser.Comma, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			parameterList();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(491);
				match(Comma);
				setState(492);
				match(T__18);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			parameterDeclaration();
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(496);
					match(Comma);
					setState(497);
					parameterDeclaration();
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameterDeclaration);
		int _la;
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				declarationSpecifiers();
				setState(504);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				declarationSpecifiers2();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (Mult - 54)) | (1L << (Exponent - 54)) | (1L << (LeftParen - 54)) | (1L << (LeftBrac - 54)))) != 0)) {
					{
					setState(507);
					abstractDeclarator();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(LucasGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LucasGrammarParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(Identifier);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(513);
				match(Comma);
				setState(514);
				match(Identifier);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			specifierQualifierList();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (Mult - 54)) | (1L << (Exponent - 54)) | (1L << (LeftParen - 54)) | (1L << (LeftBrac - 54)))) != 0)) {
				{
				setState(521);
				abstractDeclarator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_abstractDeclarator);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Mult || _la==Exponent) {
					{
					setState(525);
					pointer();
					}
				}

				setState(528);
				directAbstractDeclarator(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public TerminalNode LeftBrac() { return getToken(LucasGrammarParser.LeftBrac, 0); }
		public TerminalNode RightBrac() { return getToken(LucasGrammarParser.RightBrac, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Mult() { return getToken(LucasGrammarParser.Mult, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(532);
				match(LeftParen);
				setState(533);
				abstractDeclarator();
				setState(534);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(536);
				match(LeftBrac);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(537);
					typeQualifierList();
					}
				}

				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
					{
					setState(540);
					assignmentExpression();
					}
				}

				setState(543);
				match(RightBrac);
				}
				break;
			case 3:
				{
				setState(544);
				match(LeftBrac);
				setState(545);
				match(T__11);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(546);
					typeQualifierList();
					}
				}

				setState(549);
				assignmentExpression();
				setState(550);
				match(RightBrac);
				}
				break;
			case 4:
				{
				setState(552);
				match(LeftBrac);
				setState(553);
				typeQualifierList();
				setState(554);
				match(T__11);
				setState(555);
				assignmentExpression();
				setState(556);
				match(RightBrac);
				}
				break;
			case 5:
				{
				setState(558);
				match(LeftBrac);
				setState(559);
				match(Mult);
				setState(560);
				match(RightBrac);
				}
				break;
			case 6:
				{
				setState(561);
				match(LeftParen);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
					{
					setState(562);
					parameterTypeList();
					}
				}

				setState(565);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(603);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(568);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(569);
						match(LeftBrac);
						setState(571);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(570);
							typeQualifierList();
							}
						}

						setState(574);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
							{
							setState(573);
							assignmentExpression();
							}
						}

						setState(576);
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(577);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(578);
						match(LeftBrac);
						setState(579);
						match(T__11);
						setState(581);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(580);
							typeQualifierList();
							}
						}

						setState(583);
						assignmentExpression();
						setState(584);
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(586);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(587);
						match(LeftBrac);
						setState(588);
						typeQualifierList();
						setState(589);
						match(T__11);
						setState(590);
						assignmentExpression();
						setState(591);
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(593);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(594);
						match(LeftBrac);
						setState(595);
						match(Mult);
						setState(596);
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(597);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(598);
						match(LeftParen);
						setState(600);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
							{
							setState(599);
							parameterTypeList();
							}
						}

						setState(602);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(LucasGrammarParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_initializer);
		int _la;
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case Identifier:
			case Literal:
			case Digit:
			case StringLiteral:
			case Add:
			case Sub:
			case Mult:
			case Tilde:
			case LogicalAnd:
			case LogicalNot:
			case LeftParen:
			case Increment:
			case Decrement:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				assignmentExpression();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(T__1);
				setState(612);
				initializerList();
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(613);
					match(Comma);
					}
				}

				setState(616);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot || _la==LeftBrac) {
				{
				setState(620);
				designation();
				}
			}

			setState(623);
			initializer();
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(624);
					match(Comma);
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Dot || _la==LeftBrac) {
						{
						setState(625);
						designation();
						}
					}

					setState(628);
					initializer();
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(LucasGrammarParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			designatorList();
			setState(635);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorListContext extends ParserRuleContext {
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(637);
				designator();
				}
				}
				setState(640); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Dot || _la==LeftBrac );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBrac() { return getToken(LucasGrammarParser.LeftBrac, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBrac() { return getToken(LucasGrammarParser.RightBrac, 0); }
		public TerminalNode Dot() { return getToken(LucasGrammarParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_designator);
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrac:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(LeftBrac);
				setState(643);
				constantExpression();
				setState(644);
				match(RightBrac);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(Dot);
				setState(647);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(LucasGrammarParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public TerminalNode SemiColon() { return getToken(LucasGrammarParser.SemiColon, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(LucasGrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(LucasGrammarParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(T__19);
			setState(651);
			match(LeftParen);
			setState(652);
			constantExpression();
			setState(653);
			match(Comma);
			setState(655); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(654);
				match(StringLiteral);
				}
				}
				setState(657); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(659);
			match(RightParen);
			setState(660);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statement);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				selectionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				iterationStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				jumpStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(LucasGrammarParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
				{
				setState(668);
				expression();
				}
			}

			setState(671);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public List<TerminalNode> Begin() { return getTokens(LucasGrammarParser.Begin); }
		public TerminalNode Begin(int i) {
			return getToken(LucasGrammarParser.Begin, i);
		}
		public List<TerminalNode> If() { return getTokens(LucasGrammarParser.If); }
		public TerminalNode If(int i) {
			return getToken(LucasGrammarParser.If, i);
		}
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public List<TerminalNode> End() { return getTokens(LucasGrammarParser.End); }
		public TerminalNode End(int i) {
			return getToken(LucasGrammarParser.End, i);
		}
		public List<TerminalNode> LeftBrac() { return getTokens(LucasGrammarParser.LeftBrac); }
		public TerminalNode LeftBrac(int i) {
			return getToken(LucasGrammarParser.LeftBrac, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(LucasGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LucasGrammarParser.Identifier, i);
		}
		public List<TerminalNode> RightBrac() { return getTokens(LucasGrammarParser.RightBrac); }
		public TerminalNode RightBrac(int i) {
			return getToken(LucasGrammarParser.RightBrac, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(LucasGrammarParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(LucasGrammarParser.Else, i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selectionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(Begin);
			setState(674);
			match(If);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrac) {
				{
				setState(675);
				match(LeftBrac);
				setState(676);
				match(Identifier);
				setState(677);
				match(RightBrac);
				}
			}

			setState(680);
			match(LeftParen);
			setState(681);
			expression();
			setState(682);
			match(RightParen);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (SemiColon - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
				{
				setState(685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(683);
					statement();
					}
					break;
				case 2:
					{
					setState(684);
					declaration();
					}
					break;
				}
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(690);
			match(End);
			setState(691);
			match(If);
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(692);
				match(Identifier);
				}
				break;
			}
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(695);
					match(Begin);
					setState(696);
					match(Else);
					setState(697);
					match(If);
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBrac) {
						{
						setState(698);
						match(LeftBrac);
						setState(699);
						match(Identifier);
						setState(700);
						match(RightBrac);
						}
					}

					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (SemiColon - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
						{
						setState(705);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
						case 1:
							{
							setState(703);
							statement();
							}
							break;
						case 2:
							{
							setState(704);
							declaration();
							}
							break;
						}
						}
						setState(709);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(710);
					match(End);
					setState(711);
					match(Else);
					setState(712);
					match(If);
					setState(714);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(713);
						match(Identifier);
						}
						break;
					}
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(721);
				match(Begin);
				setState(722);
				match(Else);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (SemiColon - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
					{
					setState(725);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(723);
						statement();
						}
						break;
					case 2:
						{
						setState(724);
						declaration();
						}
						break;
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				match(End);
				setState(731);
				match(Else);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode Begin() { return getToken(LucasGrammarParser.Begin, 0); }
		public List<TerminalNode> While() { return getTokens(LucasGrammarParser.While); }
		public TerminalNode While(int i) {
			return getToken(LucasGrammarParser.While, i);
		}
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public TerminalNode End() { return getToken(LucasGrammarParser.End, 0); }
		public TerminalNode LeftBrac() { return getToken(LucasGrammarParser.LeftBrac, 0); }
		public List<TerminalNode> Identifier() { return getTokens(LucasGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LucasGrammarParser.Identifier, i);
		}
		public TerminalNode RightBrac() { return getToken(LucasGrammarParser.RightBrac, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> For() { return getTokens(LucasGrammarParser.For); }
		public TerminalNode For(int i) {
			return getToken(LucasGrammarParser.For, i);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_iterationStatement);
		int _la;
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(Begin);
				setState(735);
				match(While);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrac) {
					{
					setState(736);
					match(LeftBrac);
					setState(737);
					match(Identifier);
					setState(738);
					match(RightBrac);
					}
				}

				setState(741);
				match(LeftParen);
				setState(742);
				expression();
				setState(743);
				match(RightParen);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (SemiColon - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
					{
					setState(746);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						setState(744);
						statement();
						}
						break;
					case 2:
						{
						setState(745);
						declaration();
						}
						break;
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(751);
				match(End);
				setState(752);
				match(While);
				setState(754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(753);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(Begin);
				setState(757);
				match(For);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrac) {
					{
					setState(758);
					match(LeftBrac);
					setState(759);
					match(Identifier);
					setState(760);
					match(RightBrac);
					}
				}

				setState(763);
				match(LeftParen);
				setState(764);
				forCondition();
				setState(765);
				match(RightParen);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (SemiColon - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
					{
					setState(768);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						setState(766);
						statement();
						}
						break;
					case 2:
						{
						setState(767);
						declaration();
						}
						break;
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(773);
				match(End);
				setState(774);
				match(For);
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(775);
					match(Identifier);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> SemiColon() { return getTokens(LucasGrammarParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(LucasGrammarParser.SemiColon, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(780);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
					{
					setState(781);
					expression();
					}
				}

				}
				break;
			}
			setState(786);
			match(SemiColon);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
				{
				setState(787);
				forExpression();
				}
			}

			setState(790);
			match(SemiColon);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
				{
				setState(791);
				forExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			declarationSpecifiers();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (T__15 - 13)) | (1L << (T__16 - 13)) | (1L << (T__17 - 13)) | (1L << (Identifier - 13)) | (1L << (Mult - 13)) | (1L << (Exponent - 13)) | (1L << (LeftParen - 13)))) != 0)) {
				{
				setState(795);
				initDeclaratorList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			assignmentExpression();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(799);
				match(Comma);
				setState(800);
				assignmentExpression();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(LucasGrammarParser.SemiColon, 0); }
		public TerminalNode Return() { return getToken(LucasGrammarParser.Return, 0); }
		public TerminalNode Continue() { return getToken(LucasGrammarParser.Continue, 0); }
		public TerminalNode Break() { return getToken(LucasGrammarParser.Break, 0); }
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				{
				}
				break;
			case Break:
			case Continue:
				{
				setState(807);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(808);
					match(Identifier);
					}
				}

				}
				break;
			case Return:
				{
				setState(811);
				match(Return);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
					{
					setState(812);
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(817);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LucasGrammarParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon) {
				{
				setState(819);
				translationUnit();
				}
			}

			setState(822);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(824);
				externalDeclaration();
				}
				}
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(LucasGrammarParser.SemiColon, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_externalDeclaration);
		try {
			setState(833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Begin:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				functionDefinition();
				}
				break;
			case Decl:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				functionDeclaration();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__19:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				declaration();
				}
				break;
			case SemiColon:
				enterOuterAlt(_localctx, 4);
				{
				setState(832);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Decl() { return getToken(LucasGrammarParser.Decl, 0); }
		public TerminalNode Function() { return getToken(LucasGrammarParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(LucasGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(LucasGrammarParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(LucasGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(LucasGrammarParser.RightParen, i);
		}
		public TerminalNode SemiColon() { return getToken(LucasGrammarParser.SemiColon, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(LucasGrammarParser.Arrow, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(Decl);
			setState(836);
			match(Function);
			setState(837);
			match(Identifier);
			setState(838);
			match(LeftParen);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(839);
				parameterTypeList();
				}
			}

			setState(842);
			match(RightParen);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(843);
				match(Arrow);
				setState(844);
				match(LeftParen);
				setState(845);
				parameterList();
				setState(846);
				match(RightParen);
				}
			}

			setState(850);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode Begin() { return getToken(LucasGrammarParser.Begin, 0); }
		public List<TerminalNode> Function() { return getTokens(LucasGrammarParser.Function); }
		public TerminalNode Function(int i) {
			return getToken(LucasGrammarParser.Function, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(LucasGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LucasGrammarParser.Identifier, i);
		}
		public List<TerminalNode> LeftParen() { return getTokens(LucasGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(LucasGrammarParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(LucasGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(LucasGrammarParser.RightParen, i);
		}
		public TerminalNode End() { return getToken(LucasGrammarParser.End, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(LucasGrammarParser.Arrow, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(Begin);
			setState(853);
			match(Function);
			setState(854);
			match(Identifier);
			setState(855);
			match(LeftParen);
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(856);
				parameterTypeList();
				}
			}

			setState(859);
			match(RightParen);
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(860);
				match(Arrow);
				setState(861);
				match(LeftParen);
				setState(862);
				parameterList();
				setState(863);
				match(RightParen);
				}
			}

			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (SemiColon - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
				{
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(867);
					statement();
					}
					break;
				case 2:
					{
					setState(868);
					declaration();
					}
					break;
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874);
			match(End);
			setState(875);
			match(Function);
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(876);
				match(Identifier);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(879);
				declaration();
				}
				}
				setState(882); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 43:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u0377\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\6\2\u0088\n\2\r\2\16\2\u0089"+
		"\3\2\3\2\3\2\3\2\5\2\u0090\n\2\3\3\3\3\5\3\u0094\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u009c\n\3\3\3\3\3\5\3\u00a0\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\u00a8\n\3\3\3\3\3\3\3\3\3\7\3\u00ae\n\3\f\3\16\3\u00b1\13\3\3\4\3\4\3"+
		"\4\7\4\u00b6\n\4\f\4\16\4\u00b9\13\4\3\5\7\5\u00bc\n\5\f\5\16\5\u00bf"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00cc\n\5\3\6\3"+
		"\6\3\7\5\7\u00d1\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00da\n\7\r\7\16"+
		"\7\u00db\5\7\u00de\n\7\3\b\3\b\3\b\7\b\u00e3\n\b\f\b\16\b\u00e6\13\b\3"+
		"\t\3\t\3\t\7\t\u00eb\n\t\f\t\16\t\u00ee\13\t\3\n\3\n\3\n\7\n\u00f3\n\n"+
		"\f\n\16\n\u00f6\13\n\3\13\3\13\3\13\7\13\u00fb\n\13\f\13\16\13\u00fe\13"+
		"\13\3\f\3\f\3\f\7\f\u0103\n\f\f\f\16\f\u0106\13\f\3\r\3\r\3\r\7\r\u010b"+
		"\n\r\f\r\16\r\u010e\13\r\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0116\n\16"+
		"\r\16\16\16\u0117\5\16\u011a\n\16\3\17\3\17\3\20\3\20\3\20\7\20\u0121"+
		"\n\20\f\20\16\20\u0124\13\20\3\21\3\21\3\22\3\22\5\22\u012a\n\22\3\22"+
		"\3\22\3\22\5\22\u012f\n\22\3\23\6\23\u0132\n\23\r\23\16\23\u0133\3\24"+
		"\6\24\u0137\n\24\r\24\16\24\u0138\3\25\3\25\5\25\u013d\n\25\3\26\3\26"+
		"\3\26\7\26\u0142\n\26\f\26\16\26\u0145\13\26\3\27\3\27\3\27\5\27\u014a"+
		"\n\27\3\30\3\30\3\30\5\30\u014f\n\30\3\31\3\31\5\31\u0153\n\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u015c\n\31\3\32\3\32\3\33\6\33\u0161"+
		"\n\33\r\33\16\33\u0162\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016d"+
		"\n\34\3\35\3\35\5\35\u0171\n\35\3\35\5\35\u0174\n\35\3\36\3\36\3\36\7"+
		"\36\u0179\n\36\f\36\16\36\u017c\13\36\3\37\3\37\5\37\u0180\n\37\3\37\3"+
		"\37\5\37\u0184\n\37\3 \3 \3!\5!\u0189\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\6\"\u0196\n\"\r\"\16\"\u0197\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u01a2\n\"\3\"\3\"\3\"\5\"\u01a7\n\"\3\"\5\"\u01aa\n\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u01b1\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u01c0\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01cc"+
		"\n\"\3\"\7\"\u01cf\n\"\f\"\16\"\u01d2\13\"\3#\3#\3$\3$\3$\3$\3$\7$\u01db"+
		"\n$\f$\16$\u01de\13$\3%\3%\5%\u01e2\n%\6%\u01e4\n%\r%\16%\u01e5\3&\6&"+
		"\u01e9\n&\r&\16&\u01ea\3\'\3\'\3\'\5\'\u01f0\n\'\3(\3(\3(\7(\u01f5\n("+
		"\f(\16(\u01f8\13(\3)\3)\3)\3)\3)\5)\u01ff\n)\5)\u0201\n)\3*\3*\3*\7*\u0206"+
		"\n*\f*\16*\u0209\13*\3+\3+\5+\u020d\n+\3,\3,\5,\u0211\n,\3,\5,\u0214\n"+
		",\3-\3-\3-\3-\3-\3-\3-\5-\u021d\n-\3-\5-\u0220\n-\3-\3-\3-\3-\5-\u0226"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0236\n-\3-\5-\u0239"+
		"\n-\3-\3-\3-\5-\u023e\n-\3-\5-\u0241\n-\3-\3-\3-\3-\3-\5-\u0248\n-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u025b\n-\3-\7-\u025e"+
		"\n-\f-\16-\u0261\13-\3.\3.\3/\3/\3/\3/\5/\u0269\n/\3/\3/\5/\u026d\n/\3"+
		"\60\5\60\u0270\n\60\3\60\3\60\3\60\5\60\u0275\n\60\3\60\7\60\u0278\n\60"+
		"\f\60\16\60\u027b\13\60\3\61\3\61\3\61\3\62\6\62\u0281\n\62\r\62\16\62"+
		"\u0282\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u028b\n\63\3\64\3\64\3\64\3"+
		"\64\3\64\6\64\u0292\n\64\r\64\16\64\u0293\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\5\65\u029d\n\65\3\66\5\66\u02a0\n\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u02a9\n\67\3\67\3\67\3\67\3\67\3\67\7\67\u02b0\n\67\f\67"+
		"\16\67\u02b3\13\67\3\67\3\67\3\67\5\67\u02b8\n\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u02c0\n\67\3\67\3\67\7\67\u02c4\n\67\f\67\16\67\u02c7"+
		"\13\67\3\67\3\67\3\67\3\67\5\67\u02cd\n\67\7\67\u02cf\n\67\f\67\16\67"+
		"\u02d2\13\67\3\67\3\67\3\67\3\67\7\67\u02d8\n\67\f\67\16\67\u02db\13\67"+
		"\3\67\3\67\5\67\u02df\n\67\38\38\38\38\38\58\u02e6\n8\38\38\38\38\38\7"+
		"8\u02ed\n8\f8\168\u02f0\138\38\38\38\58\u02f5\n8\38\38\38\38\38\58\u02fc"+
		"\n8\38\38\38\38\38\78\u0303\n8\f8\168\u0306\138\38\38\38\58\u030b\n8\5"+
		"8\u030d\n8\39\39\59\u0311\n9\59\u0313\n9\39\39\59\u0317\n9\39\39\59\u031b"+
		"\n9\3:\3:\5:\u031f\n:\3;\3;\3;\7;\u0324\n;\f;\16;\u0327\13;\3<\3<\3<\5"+
		"<\u032c\n<\3<\3<\5<\u0330\n<\5<\u0332\n<\3<\3<\3=\5=\u0337\n=\3=\3=\3"+
		">\6>\u033c\n>\r>\16>\u033d\3?\3?\3?\3?\5?\u0344\n?\3@\3@\3@\3@\3@\5@\u034b"+
		"\n@\3@\3@\3@\3@\3@\3@\5@\u0353\n@\3@\3@\3A\3A\3A\3A\3A\5A\u035c\nA\3A"+
		"\3A\3A\3A\3A\3A\5A\u0364\nA\3A\3A\7A\u0368\nA\fA\16A\u036b\13A\3A\3A\3"+
		"A\5A\u0370\nA\3B\6B\u0373\nB\rB\16B\u0374\3B\2\4BXC\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\2\21\3\2FG\3\2OP\4\2\6\6OP\5\2\668;;EE\3\28:\3"+
		"\2\66\67\4\2=>AB\3\2?@\4\2SSVZ\t\2\7\t\30\30!!##%%**..\3\2\n\13\3\2\17"+
		"\24\3\2IJ\4\288<<\4\2\31\31$$\2\u03cf\2\u008f\3\2\2\2\4\u009f\3\2\2\2"+
		"\6\u00b2\3\2\2\2\b\u00bd\3\2\2\2\n\u00cd\3\2\2\2\f\u00dd\3\2\2\2\16\u00df"+
		"\3\2\2\2\20\u00e7\3\2\2\2\22\u00ef\3\2\2\2\24\u00f7\3\2\2\2\26\u00ff\3"+
		"\2\2\2\30\u0107\3\2\2\2\32\u0119\3\2\2\2\34\u011b\3\2\2\2\36\u011d\3\2"+
		"\2\2 \u0125\3\2\2\2\"\u012e\3\2\2\2$\u0131\3\2\2\2&\u0136\3\2\2\2(\u013c"+
		"\3\2\2\2*\u013e\3\2\2\2,\u0146\3\2\2\2.\u014e\3\2\2\2\60\u015b\3\2\2\2"+
		"\62\u015d\3\2\2\2\64\u0160\3\2\2\2\66\u016c\3\2\2\28\u0170\3\2\2\2:\u0175"+
		"\3\2\2\2<\u0183\3\2\2\2>\u0185\3\2\2\2@\u0188\3\2\2\2B\u01a1\3\2\2\2D"+
		"\u01d3\3\2\2\2F\u01dc\3\2\2\2H\u01e3\3\2\2\2J\u01e8\3\2\2\2L\u01ec\3\2"+
		"\2\2N\u01f1\3\2\2\2P\u0200\3\2\2\2R\u0202\3\2\2\2T\u020a\3\2\2\2V\u0213"+
		"\3\2\2\2X\u0238\3\2\2\2Z\u0262\3\2\2\2\\\u026c\3\2\2\2^\u026f\3\2\2\2"+
		"`\u027c\3\2\2\2b\u0280\3\2\2\2d\u028a\3\2\2\2f\u028c\3\2\2\2h\u029c\3"+
		"\2\2\2j\u029f\3\2\2\2l\u02a3\3\2\2\2n\u030c\3\2\2\2p\u0312\3\2\2\2r\u031c"+
		"\3\2\2\2t\u0320\3\2\2\2v\u0331\3\2\2\2x\u0336\3\2\2\2z\u033b\3\2\2\2|"+
		"\u0343\3\2\2\2~\u0345\3\2\2\2\u0080\u0356\3\2\2\2\u0082\u0372\3\2\2\2"+
		"\u0084\u0090\7\62\2\2\u0085\u0090\7\63\2\2\u0086\u0088\7\65\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u0090\3\2\2\2\u008b\u008c\7I\2\2\u008c\u008d\5\36\20\2\u008d"+
		"\u008e\7J\2\2\u008e\u0090\3\2\2\2\u008f\u0084\3\2\2\2\u008f\u0085\3\2"+
		"\2\2\u008f\u0087\3\2\2\2\u008f\u008b\3\2\2\2\u0090\3\3\2\2\2\u0091\u00a0"+
		"\5\2\2\2\u0092\u0094\7\3\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\7I\2\2\u0096\u0097\5T+\2\u0097\u0098\7J\2\2"+
		"\u0098\u0099\7\4\2\2\u0099\u009b\5^\60\2\u009a\u009c\7N\2\2\u009b\u009a"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\5\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u0091\3\2\2\2\u009f\u0093\3\2\2\2\u00a0\u00af\3\2"+
		"\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\5\36\20\2\u00a3\u00a4\7L\2\2\u00a4"+
		"\u00ae\3\2\2\2\u00a5\u00a7\7I\2\2\u00a6\u00a8\5\6\4\2\u00a7\u00a6\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ae\7J\2\2\u00aa"+
		"\u00ab\t\2\2\2\u00ab\u00ae\7\62\2\2\u00ac\u00ae\t\3\2\2\u00ad\u00a1\3"+
		"\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\5\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b2\u00b7\5\32\16\2\u00b3\u00b4\7N\2\2\u00b4\u00b6"+
		"\5\32\16\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\7\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\t"+
		"\4\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00cb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00cc\5\4"+
		"\3\2\u00c1\u00c2\5\n\6\2\u00c2\u00c3\5\f\7\2\u00c3\u00cc\3\2\2\2\u00c4"+
		"\u00c5\7\6\2\2\u00c5\u00c6\7I\2\2\u00c6\u00c7\5T+\2\u00c7\u00c8\7J\2\2"+
		"\u00c8\u00cc\3\2\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cc\7\62\2\2\u00cb\u00c0"+
		"\3\2\2\2\u00cb\u00c1\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\t\3\2\2\2\u00cd\u00ce\t\5\2\2\u00ce\13\3\2\2\2\u00cf\u00d1\7\3\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7I"+
		"\2\2\u00d3\u00d4\5T+\2\u00d4\u00d5\7J\2\2\u00d5\u00d6\5\f\7\2\u00d6\u00de"+
		"\3\2\2\2\u00d7\u00de\5\b\5\2\u00d8\u00da\7\64\2\2\u00d9\u00d8\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de"+
		"\3\2\2\2\u00dd\u00d0\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de"+
		"\r\3\2\2\2\u00df\u00e4\5\f\7\2\u00e0\u00e1\t\6\2\2\u00e1\u00e3\5\f\7\2"+
		"\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\17\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ec\5\16\b\2\u00e8"+
		"\u00e9\t\7\2\2\u00e9\u00eb\5\16\b\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\21\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f4\5\20\t\2\u00f0\u00f1\t\b\2\2\u00f1\u00f3\5"+
		"\20\t\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\23\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fc\5\22\n"+
		"\2\u00f8\u00f9\t\t\2\2\u00f9\u00fb\5\22\n\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\25\3\2\2"+
		"\2\u00fe\u00fc\3\2\2\2\u00ff\u0104\5\24\13\2\u0100\u0101\7C\2\2\u0101"+
		"\u0103\5\24\13\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\27\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010c\5\26\f\2\u0108\u0109\7D\2\2\u0109\u010b\5\26\f\2\u010a\u0108\3"+
		"\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\31\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u011a\5\30\r\2\u0110\u0111\5\b\5"+
		"\2\u0111\u0112\5\34\17\2\u0112\u0113\5\32\16\2\u0113\u011a\3\2\2\2\u0114"+
		"\u0116\7\64\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u010f\3\2\2\2\u0119"+
		"\u0110\3\2\2\2\u0119\u0115\3\2\2\2\u011a\33\3\2\2\2\u011b\u011c\t\n\2"+
		"\2\u011c\35\3\2\2\2\u011d\u0122\5\32\16\2\u011e\u011f\7N\2\2\u011f\u0121"+
		"\5\32\16\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\37\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126"+
		"\5\30\r\2\u0126!\3\2\2\2\u0127\u0129\5$\23\2\u0128\u012a\5*\26\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7M"+
		"\2\2\u012c\u012f\3\2\2\2\u012d\u012f\5f\64\2\u012e\u0127\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f#\3\2\2\2\u0130\u0132\5(\25\2\u0131\u0130\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134%\3"+
		"\2\2\2\u0135\u0137\5(\25\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\'\3\2\2\2\u013a\u013d\5.\30\2"+
		"\u013b\u013d\5> \2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d)\3\2"+
		"\2\2\u013e\u0143\5,\27\2\u013f\u0140\7N\2\2\u0140\u0142\5,\27\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144+\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0149\5@!\2\u0147\u0148"+
		"\7S\2\2\u0148\u014a\5\\/\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"-\3\2\2\2\u014b\u014f\t\13\2\2\u014c\u014f\5\60\31\2\u014d\u014f\5Z.\2"+
		"\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f/\3"+
		"\2\2\2\u0150\u0152\5\62\32\2\u0151\u0153\7\62\2\2\u0152\u0151\3\2\2\2"+
		"\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\4\2\2\u0155\u0156"+
		"\5\64\33\2\u0156\u0157\7\5\2\2\u0157\u015c\3\2\2\2\u0158\u0159\5\62\32"+
		"\2\u0159\u015a\7\62\2\2\u015a\u015c\3\2\2\2\u015b\u0150\3\2\2\2\u015b"+
		"\u0158\3\2\2\2\u015c\61\3\2\2\2\u015d\u015e\t\f\2\2\u015e\63\3\2\2\2\u015f"+
		"\u0161\5\66\34\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3"+
		"\2\2\2\u0162\u0163\3\2\2\2\u0163\65\3\2\2\2\u0164\u0165\58\35\2\u0165"+
		"\u0166\5:\36\2\u0166\u0167\7M\2\2\u0167\u016d\3\2\2\2\u0168\u0169\58\35"+
		"\2\u0169\u016a\7M\2\2\u016a\u016d\3\2\2\2\u016b\u016d\5f\64\2\u016c\u0164"+
		"\3\2\2\2\u016c\u0168\3\2\2\2\u016c\u016b\3\2\2\2\u016d\67\3\2\2\2\u016e"+
		"\u0171\5.\30\2\u016f\u0171\5> \2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2"+
		"\2\u0171\u0173\3\2\2\2\u0172\u0174\58\35\2\u0173\u0172\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u01749\3\2\2\2\u0175\u017a\5<\37\2\u0176\u0177\7N\2\2\u0177\u0179"+
		"\5<\37\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b;\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0184\5@!\2\u017e"+
		"\u0180\5@!\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2"+
		"\2\u0181\u0182\7\f\2\2\u0182\u0184\5 \21\2\u0183\u017d\3\2\2\2\u0183\u017f"+
		"\3\2\2\2\u0184=\3\2\2\2\u0185\u0186\7\r\2\2\u0186?\3\2\2\2\u0187\u0189"+
		"\5H%\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\5B\"\2\u018bA\3\2\2\2\u018c\u018d\b\"\1\2\u018d\u01a2\7\62\2\2"+
		"\u018e\u018f\7I\2\2\u018f\u0190\5@!\2\u0190\u0191\7J\2\2\u0191\u01a2\3"+
		"\2\2\2\u0192\u0193\7\62\2\2\u0193\u0195\7\f\2\2\u0194\u0196\7\64\2\2\u0195"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u01a2\3\2\2\2\u0199\u019a\5D#\2\u019a\u019b\7\62\2\2\u019b"+
		"\u01a2\3\2\2\2\u019c\u019d\7I\2\2\u019d\u019e\5D#\2\u019e\u019f\5@!\2"+
		"\u019f\u01a0\7J\2\2\u01a0\u01a2\3\2\2\2\u01a1\u018c\3\2\2\2\u01a1\u018e"+
		"\3\2\2\2\u01a1\u0192\3\2\2\2\u01a1\u0199\3\2\2\2\u01a1\u019c\3\2\2\2\u01a2"+
		"\u01d0\3\2\2\2\u01a3\u01a4\f\13\2\2\u01a4\u01a6\7K\2\2\u01a5\u01a7\5J"+
		"&\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01aa\5\32\16\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01ab\u01cf\7L\2\2\u01ac\u01ad\f\n\2\2\u01ad\u01ae\7K\2\2\u01ae"+
		"\u01b0\7\16\2\2\u01af\u01b1\5J&\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\5\32\16\2\u01b3\u01b4\7L\2\2\u01b4"+
		"\u01cf\3\2\2\2\u01b5\u01b6\f\t\2\2\u01b6\u01b7\7K\2\2\u01b7\u01b8\5J&"+
		"\2\u01b8\u01b9\7\16\2\2\u01b9\u01ba\5\32\16\2\u01ba\u01bb\7L\2\2\u01bb"+
		"\u01cf\3\2\2\2\u01bc\u01bd\f\b\2\2\u01bd\u01bf\7K\2\2\u01be\u01c0\5J&"+
		"\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\78\2\2\u01c2\u01cf\7L\2\2\u01c3\u01c4\f\7\2\2\u01c4\u01c5\7I\2\2\u01c5"+
		"\u01c6\5L\'\2\u01c6\u01c7\7J\2\2\u01c7\u01cf\3\2\2\2\u01c8\u01c9\f\6\2"+
		"\2\u01c9\u01cb\7I\2\2\u01ca\u01cc\5R*\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\7J\2\2\u01ce\u01a3\3\2\2\2\u01ce"+
		"\u01ac\3\2\2\2\u01ce\u01b5\3\2\2\2\u01ce\u01bc\3\2\2\2\u01ce\u01c3\3\2"+
		"\2\2\u01ce\u01c8\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1C\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\t\r\2\2"+
		"\u01d4E\3\2\2\2\u01d5\u01db\n\16\2\2\u01d6\u01d7\7I\2\2\u01d7\u01d8\5"+
		"F$\2\u01d8\u01d9\7J\2\2\u01d9\u01db\3\2\2\2\u01da\u01d5\3\2\2\2\u01da"+
		"\u01d6\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01ddG\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\t\17\2\2\u01e0\u01e2"+
		"\5J&\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01df\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6I\3\2\2\2\u01e7\u01e9\5> \2\u01e8\u01e7\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebK\3\2\2\2\u01ec"+
		"\u01ef\5N(\2\u01ed\u01ee\7N\2\2\u01ee\u01f0\7\25\2\2\u01ef\u01ed\3\2\2"+
		"\2\u01ef\u01f0\3\2\2\2\u01f0M\3\2\2\2\u01f1\u01f6\5P)\2\u01f2\u01f3\7"+
		"N\2\2\u01f3\u01f5\5P)\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7O\3\2\2\2\u01f8\u01f6\3\2\2\2"+
		"\u01f9\u01fa\5$\23\2\u01fa\u01fb\5@!\2\u01fb\u0201\3\2\2\2\u01fc\u01fe"+
		"\5&\24\2\u01fd\u01ff\5V,\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u01f9\3\2\2\2\u0200\u01fc\3\2\2\2\u0201Q\3\2\2\2"+
		"\u0202\u0207\7\62\2\2\u0203\u0204\7N\2\2\u0204\u0206\7\62\2\2\u0205\u0203"+
		"\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"S\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020c\58\35\2\u020b\u020d\5V,\2\u020c"+
		"\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020dU\3\2\2\2\u020e\u0214\5H%\2\u020f"+
		"\u0211\5H%\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2"+
		"\2\u0212\u0214\5X-\2\u0213\u020e\3\2\2\2\u0213\u0210\3\2\2\2\u0214W\3"+
		"\2\2\2\u0215\u0216\b-\1\2\u0216\u0217\7I\2\2\u0217\u0218\5V,\2\u0218\u0219"+
		"\7J\2\2\u0219\u0239\3\2\2\2\u021a\u021c\7K\2\2\u021b\u021d\5J&\2\u021c"+
		"\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u0220\5\32"+
		"\16\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0239\7L\2\2\u0222\u0223\7K\2\2\u0223\u0225\7\16\2\2\u0224\u0226\5J&"+
		"\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228"+
		"\5\32\16\2\u0228\u0229\7L\2\2\u0229\u0239\3\2\2\2\u022a\u022b\7K\2\2\u022b"+
		"\u022c\5J&\2\u022c\u022d\7\16\2\2\u022d\u022e\5\32\16\2\u022e\u022f\7"+
		"L\2\2\u022f\u0239\3\2\2\2\u0230\u0231\7K\2\2\u0231\u0232\78\2\2\u0232"+
		"\u0239\7L\2\2\u0233\u0235\7I\2\2\u0234\u0236\5L\'\2\u0235\u0234\3\2\2"+
		"\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\7J\2\2\u0238\u0215"+
		"\3\2\2\2\u0238\u021a\3\2\2\2\u0238\u0222\3\2\2\2\u0238\u022a\3\2\2\2\u0238"+
		"\u0230\3\2\2\2\u0238\u0233\3\2\2\2\u0239\u025f\3\2\2\2\u023a\u023b\f\7"+
		"\2\2\u023b\u023d\7K\2\2\u023c\u023e\5J&\2\u023d\u023c\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0241\5\32\16\2\u0240\u023f\3\2\2\2"+
		"\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u025e\7L\2\2\u0243\u0244"+
		"\f\6\2\2\u0244\u0245\7K\2\2\u0245\u0247\7\16\2\2\u0246\u0248\5J&\2\u0247"+
		"\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\5\32"+
		"\16\2\u024a\u024b\7L\2\2\u024b\u025e\3\2\2\2\u024c\u024d\f\5\2\2\u024d"+
		"\u024e\7K\2\2\u024e\u024f\5J&\2\u024f\u0250\7\16\2\2\u0250\u0251\5\32"+
		"\16\2\u0251\u0252\7L\2\2\u0252\u025e\3\2\2\2\u0253\u0254\f\4\2\2\u0254"+
		"\u0255\7K\2\2\u0255\u0256\78\2\2\u0256\u025e\7L\2\2\u0257\u0258\f\3\2"+
		"\2\u0258\u025a\7I\2\2\u0259\u025b\5L\'\2\u025a\u0259\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\7J\2\2\u025d\u023a\3\2\2\2\u025d"+
		"\u0243\3\2\2\2\u025d\u024c\3\2\2\2\u025d\u0253\3\2\2\2\u025d\u0257\3\2"+
		"\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"Y\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\7\62\2\2\u0263[\3\2\2\2\u0264"+
		"\u026d\5\32\16\2\u0265\u0266\7\4\2\2\u0266\u0268\5^\60\2\u0267\u0269\7"+
		"N\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026b\7\5\2\2\u026b\u026d\3\2\2\2\u026c\u0264\3\2\2\2\u026c\u0265\3\2"+
		"\2\2\u026d]\3\2\2\2\u026e\u0270\5`\61\2\u026f\u026e\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0279\5\\/\2\u0272\u0274\7N\2\2\u0273"+
		"\u0275\5`\61\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u0278\5\\/\2\u0277\u0272\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a_\3\2\2\2\u027b\u0279\3\2\2\2"+
		"\u027c\u027d\5b\62\2\u027d\u027e\7S\2\2\u027ea\3\2\2\2\u027f\u0281\5d"+
		"\63\2\u0280\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283c\3\2\2\2\u0284\u0285\7K\2\2\u0285\u0286\5 \21\2\u0286"+
		"\u0287\7L\2\2\u0287\u028b\3\2\2\2\u0288\u0289\7F\2\2\u0289\u028b\7\62"+
		"\2\2\u028a\u0284\3\2\2\2\u028a\u0288\3\2\2\2\u028be\3\2\2\2\u028c\u028d"+
		"\7\26\2\2\u028d\u028e\7I\2\2\u028e\u028f\5 \21\2\u028f\u0291\7N\2\2\u0290"+
		"\u0292\7\65\2\2\u0291\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0291\3"+
		"\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7J\2\2\u0296"+
		"\u0297\7M\2\2\u0297g\3\2\2\2\u0298\u029d\5j\66\2\u0299\u029d\5l\67\2\u029a"+
		"\u029d\5n8\2\u029b\u029d\5v<\2\u029c\u0298\3\2\2\2\u029c\u0299\3\2\2\2"+
		"\u029c\u029a\3\2\2\2\u029c\u029b\3\2\2\2\u029di\3\2\2\2\u029e\u02a0\5"+
		"\36\20\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a2\7M\2\2\u02a2k\3\2\2\2\u02a3\u02a4\7\27\2\2\u02a4\u02a8\7+\2\2\u02a5"+
		"\u02a6\7K\2\2\u02a6\u02a7\7\62\2\2\u02a7\u02a9\7L\2\2\u02a8\u02a5\3\2"+
		"\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7I\2\2\u02ab"+
		"\u02ac\5\36\20\2\u02ac\u02b1\7J\2\2\u02ad\u02b0\5h\65\2\u02ae\u02b0\5"+
		"\"\22\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1"+
		"\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02b1\3\2"+
		"\2\2\u02b4\u02b5\7(\2\2\u02b5\u02b7\7+\2\2\u02b6\u02b8\7\62\2\2\u02b7"+
		"\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02d0\3\2\2\2\u02b9\u02ba\7\27"+
		"\2\2\u02ba\u02bb\7\'\2\2\u02bb\u02bf\7+\2\2\u02bc\u02bd\7K\2\2\u02bd\u02be"+
		"\7\62\2\2\u02be\u02c0\7L\2\2\u02bf\u02bc\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c5\3\2\2\2\u02c1\u02c4\5h\65\2\u02c2\u02c4\5\"\22\2\u02c3\u02c1\3"+
		"\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7("+
		"\2\2\u02c9\u02ca\7\'\2\2\u02ca\u02cc\7+\2\2\u02cb\u02cd\7\62\2\2\u02cc"+
		"\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02b9\3\2"+
		"\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02de\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d4\7\27\2\2\u02d4\u02d9\7"+
		"\'\2\2\u02d5\u02d8\5h\65\2\u02d6\u02d8\5\"\22\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d6\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2"+
		"\2\2\u02da\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\7(\2\2\u02dd"+
		"\u02df\7\'\2\2\u02de\u02d3\3\2\2\2\u02de\u02df\3\2\2\2\u02dfm\3\2\2\2"+
		"\u02e0\u02e1\7\27\2\2\u02e1\u02e5\7/\2\2\u02e2\u02e3\7K\2\2\u02e3\u02e4"+
		"\7\62\2\2\u02e4\u02e6\7L\2\2\u02e5\u02e2\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e8\7I\2\2\u02e8\u02e9\5\36\20\2\u02e9\u02ee\7"+
		"J\2\2\u02ea\u02ed\5h\65\2\u02eb\u02ed\5\"\22\2\u02ec\u02ea\3\2\2\2\u02ec"+
		"\u02eb\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\7(\2\2\u02f2"+
		"\u02f4\7/\2\2\u02f3\u02f5\7\62\2\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2"+
		"\2\2\u02f5\u030d\3\2\2\2\u02f6\u02f7\7\27\2\2\u02f7\u02fb\7)\2\2\u02f8"+
		"\u02f9\7K\2\2\u02f9\u02fa\7\62\2\2\u02fa\u02fc\7L\2\2\u02fb\u02f8\3\2"+
		"\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\7I\2\2\u02fe"+
		"\u02ff\5p9\2\u02ff\u0304\7J\2\2\u0300\u0303\5h\65\2\u0301\u0303\5\"\22"+
		"\2\u0302\u0300\3\2\2\2\u0302\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307"+
		"\u0308\7(\2\2\u0308\u030a\7)\2\2\u0309\u030b\7\62\2\2\u030a\u0309\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u02e0\3\2\2\2\u030c"+
		"\u02f6\3\2\2\2\u030do\3\2\2\2\u030e\u0313\5r:\2\u030f\u0311\5\36\20\2"+
		"\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u030e"+
		"\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\7M\2\2\u0315"+
		"\u0317\5t;\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2"+
		"\2\u0318\u031a\7M\2\2\u0319\u031b\5t;\2\u031a\u0319\3\2\2\2\u031a\u031b"+
		"\3\2\2\2\u031bq\3\2\2\2\u031c\u031e\5$\23\2\u031d\u031f\5*\26\2\u031e"+
		"\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031fs\3\2\2\2\u0320\u0325\5\32\16"+
		"\2\u0321\u0322\7N\2\2\u0322\u0324\5\32\16\2\u0323\u0321\3\2\2\2\u0324"+
		"\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326u\3\2\2\2"+
		"\u0327\u0325\3\2\2\2\u0328\u0332\3\2\2\2\u0329\u032b\t\20\2\2\u032a\u032c"+
		"\7\62\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0332\3\2\2\2"+
		"\u032d\u032f\7,\2\2\u032e\u0330\5\36\20\2\u032f\u032e\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u0328\3\2\2\2\u0331\u0329\3\2\2\2\u0331"+
		"\u032d\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\7M\2\2\u0334w\3\2\2\2\u0335"+
		"\u0337\5z>\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2"+
		"\2\u0338\u0339\7\2\2\3\u0339y\3\2\2\2\u033a\u033c\5|?\2\u033b\u033a\3"+
		"\2\2\2\u033c\u033d\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"{\3\2\2\2\u033f\u0344\5\u0080A\2\u0340\u0344\5~@\2\u0341\u0344\5\"\22"+
		"\2\u0342\u0344\7M\2\2\u0343\u033f\3\2\2\2\u0343\u0340\3\2\2\2\u0343\u0341"+
		"\3\2\2\2\u0343\u0342\3\2\2\2\u0344}\3\2\2\2\u0345\u0346\7\32\2\2\u0346"+
		"\u0347\7&\2\2\u0347\u0348\7\62\2\2\u0348\u034a\7I\2\2\u0349\u034b\5L\'"+
		"\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u0352"+
		"\7J\2\2\u034d\u034e\7G\2\2\u034e\u034f\7I\2\2\u034f\u0350\5N(\2\u0350"+
		"\u0351\7J\2\2\u0351\u0353\3\2\2\2\u0352\u034d\3\2\2\2\u0352\u0353\3\2"+
		"\2\2\u0353\u0354\3\2\2\2\u0354\u0355\7M\2\2\u0355\177\3\2\2\2\u0356\u0357"+
		"\7\27\2\2\u0357\u0358\7&\2\2\u0358\u0359\7\62\2\2\u0359\u035b\7I\2\2\u035a"+
		"\u035c\5L\'\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2"+
		"\2\2\u035d\u0363\7J\2\2\u035e\u035f\7G\2\2\u035f\u0360\7I\2\2\u0360\u0361"+
		"\5N(\2\u0361\u0362\7J\2\2\u0362\u0364\3\2\2\2\u0363\u035e\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0369\3\2\2\2\u0365\u0368\5h\65\2\u0366\u0368\5\""+
		"\22\2\u0367\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368\u036b\3\2\2\2\u0369"+
		"\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u0369\3\2"+
		"\2\2\u036c\u036d\7(\2\2\u036d\u036f\7&\2\2\u036e\u0370\7\62\2\2\u036f"+
		"\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0081\3\2\2\2\u0371\u0373\5\""+
		"\22\2\u0372\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0372\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0083\3\2\2\2\177\u0089\u008f\u0093\u009b\u009f\u00a7"+
		"\u00ad\u00af\u00b7\u00bd\u00cb\u00d0\u00db\u00dd\u00e4\u00ec\u00f4\u00fc"+
		"\u0104\u010c\u0117\u0119\u0122\u0129\u012e\u0133\u0138\u013c\u0143\u0149"+
		"\u014e\u0152\u015b\u0162\u016c\u0170\u0173\u017a\u017f\u0183\u0188\u0197"+
		"\u01a1\u01a6\u01a9\u01b0\u01bf\u01cb\u01ce\u01d0\u01da\u01dc\u01e1\u01e5"+
		"\u01ea\u01ef\u01f6\u01fe\u0200\u0207\u020c\u0210\u0213\u021c\u021f\u0225"+
		"\u0235\u0238\u023d\u0240\u0247\u025a\u025d\u025f\u0268\u026c\u026f\u0274"+
		"\u0279\u0282\u028a\u0293\u029c\u029f\u02a8\u02af\u02b1\u02b7\u02bf\u02c3"+
		"\u02c5\u02cc\u02d0\u02d7\u02d9\u02de\u02e5\u02ec\u02ee\u02f4\u02fb\u0302"+
		"\u0304\u030a\u030c\u0310\u0312\u0316\u031a\u031e\u0325\u032b\u032f\u0331"+
		"\u0336\u033d\u0343\u034a\u0352\u035b\u0363\u0367\u0369\u036f\u0374";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}