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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, Begin=28, BigInt=29, Break=30, Decl=31, 
		Expr=32, Public=33, Private=34, TypeOf=35, Vector=36, Case=37, Char=38, 
		Class=39, CharSeq=40, Continue=41, Double=42, Function=43, Else=44, End=45, 
		For=46, Int=47, If=48, Return=49, Switch=50, Void=51, While=52, TE=53, 
		LE=54, Identifier=55, Literal=56, Digit=57, StringLiteral=58, Add=59, 
		Sub=60, Mult=61, Div=62, Mod=63, Tilde=64, Exponent=65, LessThan=66, GreaterThan=67, 
		Equality=68, Inequality=69, LessThanEqual=70, GreaterThanEqual=71, LogicalAnd=72, 
		LogicalOr=73, LogicalNot=74, Dot=75, Arrow=76, ClassSpec=77, LeftParen=78, 
		RightParen=79, LeftBrac=80, RightBrac=81, SemiColon=82, Comma=83, Increment=84, 
		Decrement=85, RightShift=86, LeftShift=87, Assign=88, LeftShiftEqual=89, 
		RightShiftEqual=90, PlusEqual=91, MinusEqual=92, MultEqual=93, Whitespace=94, 
		Newline=95, BlockComment=96, LineComment=97;
	public static final int
		RULE_primaryExpression = 0, RULE_genericSelection = 1, RULE_genericAssocList = 2, 
		RULE_genericAssociation = 3, RULE_postfixExpression = 4, RULE_argumentExpressionList = 5, 
		RULE_unaryExpression = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_multiplicativeExpression = 9, RULE_additiveExpression = 10, RULE_relationalExpression = 11, 
		RULE_equalityExpression = 12, RULE_logicalAndExpression = 13, RULE_logicalOrExpression = 14, 
		RULE_assignmentExpression = 15, RULE_assignmentOperator = 16, RULE_expression = 17, 
		RULE_constantExpression = 18, RULE_declaration = 19, RULE_declarationSpecifiers = 20, 
		RULE_declarationSpecifiers2 = 21, RULE_declarationSpecifier = 22, RULE_initDeclaratorList = 23, 
		RULE_initDeclarator = 24, RULE_typeSpecifier = 25, RULE_structOrUnionSpecifier = 26, 
		RULE_structOrUnion = 27, RULE_structDeclarationList = 28, RULE_structDeclaration = 29, 
		RULE_specifierQualifierList = 30, RULE_structDeclaratorList = 31, RULE_structDeclarator = 32, 
		RULE_typeQualifier = 33, RULE_declarator = 34, RULE_directDeclarator = 35, 
		RULE_vcSpecificModifer = 36, RULE_nestedParenthesesBlock = 37, RULE_pointer = 38, 
		RULE_typeQualifierList = 39, RULE_parameterTypeList = 40, RULE_parameterList = 41, 
		RULE_parameterDeclaration = 42, RULE_identifierList = 43, RULE_typeName = 44, 
		RULE_abstractDeclarator = 45, RULE_directAbstractDeclarator = 46, RULE_typedefName = 47, 
		RULE_initializer = 48, RULE_initializerList = 49, RULE_designation = 50, 
		RULE_designatorList = 51, RULE_designator = 52, RULE_staticAssertDeclaration = 53, 
		RULE_statement = 54, RULE_expressionStatement = 55, RULE_selectionStatement = 56, 
		RULE_iterationStatement = 57, RULE_forCondition = 58, RULE_forDeclaration = 59, 
		RULE_forExpression = 60, RULE_jumpStatement = 61, RULE_compilationUnit = 62, 
		RULE_translationUnit = 63, RULE_externalDeclaration = 64, RULE_functionDeclaration = 65, 
		RULE_functionDefinition = 66, RULE_declarationList = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
			"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
			"castExpression", "multiplicativeExpression", "additiveExpression", "relationalExpression", 
			"equalityExpression", "logicalAndExpression", "logicalOrExpression", 
			"assignmentExpression", "assignmentOperator", "expression", "constantExpression", 
			"declaration", "declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
			"initDeclaratorList", "initDeclarator", "typeSpecifier", "structOrUnionSpecifier", 
			"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
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
			null, "'__builtin_va_arg'", "'__builtin_offsetof'", "'_Generic'", "'default'", 
			"':'", "'__extension__'", "'{'", "'}'", "'sizeof'", "'_Alignof'", "'/='", 
			"'%='", "'long'", "'float'", "'boolean'", "'struct'", "'union'", "'const'", 
			"'static'", "'__cdecl'", "'__clrcall'", "'__stdcall'", "'__fastcall'", 
			"'__thiscall'", "'__vectorcall'", "'...'", "'_Static_assert'", "'begin'", 
			"'bigint'", "'break'", "'decl'", "'expr'", "'public'", "'private'", "'typeof'", 
			"'vector'", "'case'", "'char'", "'class'", "'charseq'", "'continue'", 
			"'double'", "'function'", "'else'", "'end'", "'for'", "'int'", "'if'", 
			"'return'", "'switch'", "'void'", "'while'", null, null, null, null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'^'", "'<'", "'>'", 
			"'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'!'", "'.'", "'->'", 
			"'::'", "'('", "')'", "'['", "']'", "';'", "','", "'++'", "'--'", "'>>'", 
			"'<<'", "'='", "'<<='", "'>>='", "'+='", "'-='", "'*='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Begin", "BigInt", "Break", "Decl", "Expr", "Public", 
			"Private", "TypeOf", "Vector", "Case", "Char", "Class", "CharSeq", "Continue", 
			"Double", "Function", "Else", "End", "For", "Int", "If", "Return", "Switch", 
			"Void", "While", "TE", "LE", "Identifier", "Literal", "Digit", "StringLiteral", 
			"Add", "Sub", "Mult", "Div", "Mod", "Tilde", "Exponent", "LessThan", 
			"GreaterThan", "Equality", "Inequality", "LessThanEqual", "GreaterThanEqual", 
			"LogicalAnd", "LogicalOr", "LogicalNot", "Dot", "Arrow", "ClassSpec", 
			"LeftParen", "RightParen", "LeftBrac", "RightBrac", "SemiColon", "Comma", 
			"Increment", "Decrement", "RightShift", "LeftShift", "Assign", "LeftShiftEqual", 
			"RightShiftEqual", "PlusEqual", "MinusEqual", "MultEqual", "Whitespace", 
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
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(LucasGrammarParser.Comma, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(Identifier);
				}
				break;
			case Literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(Literal);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					match(StringLiteral);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(LeftParen);
				setState(144);
				expression();
				setState(145);
				match(RightParen);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				genericSelection();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				match(T__0);
				setState(149);
				match(LeftParen);
				setState(150);
				unaryExpression();
				setState(151);
				match(Comma);
				setState(152);
				typeName();
				setState(153);
				match(RightParen);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(T__1);
				setState(156);
				match(LeftParen);
				setState(157);
				typeName();
				setState(158);
				match(Comma);
				setState(159);
				unaryExpression();
				setState(160);
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

	public static class GenericSelectionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(LucasGrammarParser.Comma, 0); }
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__2);
			setState(165);
			match(LeftParen);
			setState(166);
			assignmentExpression();
			setState(167);
			match(Comma);
			setState(168);
			genericAssocList();
			setState(169);
			match(RightParen);
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

	public static class GenericAssocListContext extends ParserRuleContext {
		public List<GenericAssociationContext> genericAssociation() {
			return getRuleContexts(GenericAssociationContext.class);
		}
		public GenericAssociationContext genericAssociation(int i) {
			return getRuleContext(GenericAssociationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericAssocList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			genericAssociation();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(172);
				match(Comma);
				setState(173);
				genericAssociation();
				}
				}
				setState(178);
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

	public static class GenericAssociationContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericAssociation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				{
				setState(179);
				typeName();
				}
				break;
			case T__3:
				{
				setState(180);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(183);
			match(T__4);
			setState(184);
			assignmentExpression();
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
		enterRule(_localctx, 8, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(186);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(187);
					match(T__5);
					}
				}

				setState(190);
				match(LeftParen);
				setState(191);
				typeName();
				setState(192);
				match(RightParen);
				setState(193);
				match(T__6);
				setState(194);
				initializerList();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(195);
					match(Comma);
					}
				}

				setState(198);
				match(T__7);
				}
				break;
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Dot - 75)) | (1L << (Arrow - 75)) | (1L << (LeftParen - 75)) | (1L << (LeftBrac - 75)) | (1L << (Increment - 75)) | (1L << (Decrement - 75)))) != 0)) {
				{
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBrac:
					{
					setState(202);
					match(LeftBrac);
					setState(203);
					expression();
					setState(204);
					match(RightBrac);
					}
					break;
				case LeftParen:
					{
					setState(206);
					match(LeftParen);
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
						{
						setState(207);
						argumentExpressionList();
						}
					}

					setState(210);
					match(RightParen);
					}
					break;
				case Dot:
				case Arrow:
					{
					setState(211);
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==Arrow) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(212);
					match(Identifier);
					}
					break;
				case Increment:
				case Decrement:
					{
					setState(213);
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
				setState(218);
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
		enterRule(_localctx, 10, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			assignmentExpression();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(220);
				match(Comma);
				setState(221);
				assignmentExpression();
				}
				}
				setState(226);
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
		enterRule(_localctx, 12, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==Increment || _la==Decrement) ) {
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
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__5:
			case Identifier:
			case Literal:
			case StringLiteral:
			case LeftParen:
				{
				setState(233);
				postfixExpression();
				}
				break;
			case Add:
			case Sub:
			case Mult:
			case Tilde:
			case LogicalNot:
				{
				setState(234);
				unaryOperator();
				setState(235);
				castExpression();
				}
				break;
			case T__8:
			case T__9:
				{
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				match(LeftParen);
				setState(239);
				typeName();
				setState(240);
				match(RightParen);
				}
				break;
			case LogicalAnd:
				{
				setState(242);
				match(LogicalAnd);
				setState(243);
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
		enterRule(_localctx, 14, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (Add - 59)) | (1L << (Sub - 59)) | (1L << (Mult - 59)) | (1L << (Tilde - 59)) | (1L << (LogicalNot - 59)))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_castExpression);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(248);
					match(T__5);
					}
				}

				setState(251);
				match(LeftParen);
				setState(252);
				typeName();
				setState(253);
				match(RightParen);
				setState(254);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(257);
					match(Digit);
					}
					}
					setState(260); 
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
		enterRule(_localctx, 18, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			castExpression();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mult) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(265);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mult) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				castExpression();
				}
				}
				setState(271);
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
		enterRule(_localctx, 20, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			multiplicativeExpression();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Add || _la==Sub) {
				{
				{
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Sub) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				multiplicativeExpression();
				}
				}
				setState(279);
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
		enterRule(_localctx, 22, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			additiveExpression();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LessThan - 66)) | (1L << (GreaterThan - 66)) | (1L << (LessThanEqual - 66)) | (1L << (GreaterThanEqual - 66)))) != 0)) {
				{
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LessThan - 66)) | (1L << (GreaterThan - 66)) | (1L << (LessThanEqual - 66)) | (1L << (GreaterThanEqual - 66)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				additiveExpression();
				}
				}
				setState(287);
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
		enterRule(_localctx, 24, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			relationalExpression();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equality || _la==Inequality) {
				{
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==Equality || _la==Inequality) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(290);
				relationalExpression();
				}
				}
				setState(295);
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
		enterRule(_localctx, 26, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			equalityExpression();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalAnd) {
				{
				{
				setState(297);
				match(LogicalAnd);
				setState(298);
				equalityExpression();
				}
				}
				setState(303);
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
		enterRule(_localctx, 28, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			logicalAndExpression();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOr) {
				{
				{
				setState(305);
				match(LogicalOr);
				setState(306);
				logicalAndExpression();
				}
				}
				setState(311);
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
		enterRule(_localctx, 30, RULE_assignmentExpression);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				unaryExpression();
				setState(314);
				assignmentOperator();
				setState(315);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(317);
					match(Digit);
					}
					}
					setState(320); 
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
		public TerminalNode PlusEqual() { return getToken(LucasGrammarParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(LucasGrammarParser.MinusEqual, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11 || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (Assign - 88)) | (1L << (PlusEqual - 88)) | (1L << (MinusEqual - 88)) | (1L << (MultEqual - 88)))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			assignmentExpression();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(327);
				match(Comma);
				setState(328);
				assignmentExpression();
				}
				}
				setState(333);
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
		enterRule(_localctx, 36, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 38, RULE_declaration);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				declarationSpecifiers();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__20 - 20)) | (1L << (T__21 - 20)) | (1L << (T__22 - 20)) | (1L << (T__23 - 20)) | (1L << (T__24 - 20)) | (1L << (Identifier - 20)) | (1L << (Mult - 20)) | (1L << (Exponent - 20)) | (1L << (LeftParen - 20)))) != 0)) {
					{
					setState(337);
					initDeclaratorList();
					}
				}

				setState(340);
				match(SemiColon);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
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
		enterRule(_localctx, 40, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(345);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(348); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 42, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(350);
				declarationSpecifier();
				}
				}
				setState(353); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
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
		enterRule(_localctx, 44, RULE_declarationSpecifier);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				typeSpecifier();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
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
		enterRule(_localctx, 46, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			initDeclarator();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(360);
				match(Comma);
				setState(361);
				initDeclarator();
				}
				}
				setState(366);
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
		enterRule(_localctx, 48, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			declarator();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(368);
				match(Assign);
				setState(369);
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
		enterRule(_localctx, 50, RULE_typeSpecifier);
		int _la;
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				structOrUnionSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
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
		enterRule(_localctx, 52, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				structOrUnion();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(378);
					match(Identifier);
					}
				}

				setState(381);
				match(T__6);
				setState(382);
				structDeclarationList();
				setState(383);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				structOrUnion();
				setState(386);
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
		enterRule(_localctx, 54, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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
		enterRule(_localctx, 56, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				structDeclaration();
				}
				}
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
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
		enterRule(_localctx, 58, RULE_structDeclaration);
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				specifierQualifierList();
				setState(398);
				structDeclaratorList();
				setState(399);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				specifierQualifierList();
				setState(402);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
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
		enterRule(_localctx, 60, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				{
				setState(407);
				typeSpecifier();
				}
				break;
			case T__17:
				{
				setState(408);
				typeQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(411);
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
		enterRule(_localctx, 62, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			structDeclarator();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(415);
				match(Comma);
				setState(416);
				structDeclarator();
				}
				}
				setState(421);
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
		enterRule(_localctx, 64, RULE_structDeclarator);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__20 - 20)) | (1L << (T__21 - 20)) | (1L << (T__22 - 20)) | (1L << (T__23 - 20)) | (1L << (T__24 - 20)) | (1L << (Identifier - 20)) | (1L << (Mult - 20)) | (1L << (Exponent - 20)) | (1L << (LeftParen - 20)))) != 0)) {
					{
					setState(423);
					declarator();
					}
				}

				setState(426);
				match(T__4);
				setState(427);
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
		enterRule(_localctx, 66, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__17);
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
		enterRule(_localctx, 68, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mult || _la==Exponent) {
				{
				setState(432);
				pointer();
				}
			}

			setState(435);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(438);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(439);
				match(LeftParen);
				setState(440);
				declarator();
				setState(441);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(443);
				match(Identifier);
				setState(444);
				match(T__4);
				setState(446); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(445);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(448); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				setState(450);
				vcSpecificModifer();
				setState(451);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(453);
				match(LeftParen);
				setState(454);
				vcSpecificModifer();
				setState(455);
				declarator();
				setState(456);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(503);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(460);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(461);
						match(LeftBrac);
						setState(463);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(462);
							typeQualifierList();
							}
						}

						setState(466);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
							{
							setState(465);
							assignmentExpression();
							}
						}

						setState(468);
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(469);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(470);
						match(LeftBrac);
						setState(471);
						match(T__18);
						setState(473);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(472);
							typeQualifierList();
							}
						}

						setState(475);
						assignmentExpression();
						setState(476);
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(478);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(479);
						match(LeftBrac);
						setState(480);
						typeQualifierList();
						setState(481);
						match(T__18);
						setState(482);
						assignmentExpression();
						setState(483);
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(485);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(486);
						match(LeftBrac);
						setState(488);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(487);
							typeQualifierList();
							}
						}

						setState(490);
						match(Mult);
						setState(491);
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(492);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(493);
						match(LeftParen);
						setState(494);
						parameterTypeList();
						setState(495);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(497);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(498);
						match(LeftParen);
						setState(500);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(499);
							identifierList();
							}
						}

						setState(502);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 72, RULE_vcSpecificModifer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Function) | (1L << Else) | (1L << End) | (1L << For) | (1L << Int) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << TE) | (1L << LE) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Div) | (1L << Mod))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (Exponent - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (Equality - 64)) | (1L << (Inequality - 64)) | (1L << (LessThanEqual - 64)) | (1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Comma - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(515);
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
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
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
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(510);
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
					setState(511);
					match(LeftParen);
					setState(512);
					nestedParenthesesBlock();
					setState(513);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 76, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(520);
				_la = _input.LA(1);
				if ( !(_la==Mult || _la==Exponent) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(521);
					typeQualifierList();
					}
				}

				}
				}
				setState(526); 
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
		enterRule(_localctx, 78, RULE_typeQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(528);
				typeQualifier();
				}
				}
				setState(531); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
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
		enterRule(_localctx, 80, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			parameterList();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(534);
				match(Comma);
				setState(535);
				match(T__25);
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
		enterRule(_localctx, 82, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			parameterDeclaration();
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(539);
					match(Comma);
					setState(540);
					parameterDeclaration();
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		enterRule(_localctx, 84, RULE_parameterDeclaration);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				declarationSpecifiers();
				setState(547);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				declarationSpecifiers2();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (Mult - 61)) | (1L << (Exponent - 61)) | (1L << (LeftParen - 61)) | (1L << (LeftBrac - 61)))) != 0)) {
					{
					setState(550);
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
		enterRule(_localctx, 86, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(Identifier);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(556);
				match(Comma);
				setState(557);
				match(Identifier);
				}
				}
				setState(562);
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
		enterRule(_localctx, 88, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			specifierQualifierList();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (Mult - 61)) | (1L << (Exponent - 61)) | (1L << (LeftParen - 61)) | (1L << (LeftBrac - 61)))) != 0)) {
				{
				setState(564);
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
		enterRule(_localctx, 90, RULE_abstractDeclarator);
		int _la;
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Mult || _la==Exponent) {
					{
					setState(568);
					pointer();
					}
				}

				setState(571);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(575);
				match(LeftParen);
				setState(576);
				abstractDeclarator();
				setState(577);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(579);
				match(LeftBrac);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(580);
					typeQualifierList();
					}
				}

				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
					{
					setState(583);
					assignmentExpression();
					}
				}

				setState(586);
				match(RightBrac);
				}
				break;
			case 3:
				{
				setState(587);
				match(LeftBrac);
				setState(588);
				match(T__18);
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(589);
					typeQualifierList();
					}
				}

				setState(592);
				assignmentExpression();
				setState(593);
				match(RightBrac);
				}
				break;
			case 4:
				{
				setState(595);
				match(LeftBrac);
				setState(596);
				typeQualifierList();
				setState(597);
				match(T__18);
				setState(598);
				assignmentExpression();
				setState(599);
				match(RightBrac);
				}
				break;
			case 5:
				{
				setState(601);
				match(LeftBrac);
				setState(602);
				match(Mult);
				setState(603);
				match(RightBrac);
				}
				break;
			case 6:
				{
				setState(604);
				match(LeftParen);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
					{
					setState(605);
					parameterTypeList();
					}
				}

				setState(608);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(646);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(611);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(612);
						match(LeftBrac);
						setState(614);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(613);
							typeQualifierList();
							}
						}

						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
							{
							setState(616);
							assignmentExpression();
							}
						}

						setState(619);
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(620);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(621);
						match(LeftBrac);
						setState(622);
						match(T__18);
						setState(624);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(623);
							typeQualifierList();
							}
						}

						setState(626);
						assignmentExpression();
						setState(627);
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(629);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(630);
						match(LeftBrac);
						setState(631);
						typeQualifierList();
						setState(632);
						match(T__18);
						setState(633);
						assignmentExpression();
						setState(634);
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(636);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(637);
						match(LeftBrac);
						setState(638);
						match(Mult);
						setState(639);
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(640);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(641);
						match(LeftParen);
						setState(643);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
							{
							setState(642);
							parameterTypeList();
							}
						}

						setState(645);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 94, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
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
		enterRule(_localctx, 96, RULE_initializer);
		int _la;
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__5:
			case T__8:
			case T__9:
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
				setState(653);
				assignmentExpression();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(T__6);
				setState(655);
				initializerList();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(656);
					match(Comma);
					}
				}

				setState(659);
				match(T__7);
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
		enterRule(_localctx, 98, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot || _la==LeftBrac) {
				{
				setState(663);
				designation();
				}
			}

			setState(666);
			initializer();
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(667);
					match(Comma);
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Dot || _la==LeftBrac) {
						{
						setState(668);
						designation();
						}
					}

					setState(671);
					initializer();
					}
					} 
				}
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		enterRule(_localctx, 100, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			designatorList();
			setState(678);
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
		enterRule(_localctx, 102, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(680);
				designator();
				}
				}
				setState(683); 
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
		enterRule(_localctx, 104, RULE_designator);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrac:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				match(LeftBrac);
				setState(686);
				constantExpression();
				setState(687);
				match(RightBrac);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				match(Dot);
				setState(690);
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
		enterRule(_localctx, 106, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(T__26);
			setState(694);
			match(LeftParen);
			setState(695);
			constantExpression();
			setState(696);
			match(Comma);
			setState(698); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(697);
				match(StringLiteral);
				}
				}
				setState(700); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(702);
			match(RightParen);
			setState(703);
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
		enterRule(_localctx, 108, RULE_statement);
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				selectionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				iterationStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(708);
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
		enterRule(_localctx, 110, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
				{
				setState(711);
				expression();
				}
			}

			setState(714);
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
		enterRule(_localctx, 112, RULE_selectionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(Begin);
			setState(717);
			match(If);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrac) {
				{
				setState(718);
				match(LeftBrac);
				setState(719);
				match(Identifier);
				setState(720);
				match(RightBrac);
				}
			}

			setState(723);
			match(LeftParen);
			setState(724);
			expression();
			setState(725);
			match(RightParen);
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
				{
				setState(728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(726);
					statement();
					}
					break;
				case 2:
					{
					setState(727);
					declaration();
					}
					break;
				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(733);
			match(End);
			setState(734);
			match(If);
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(735);
				match(Identifier);
				}
				break;
			}
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(738);
					match(Begin);
					setState(739);
					match(Else);
					setState(740);
					match(If);
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBrac) {
						{
						setState(741);
						match(LeftBrac);
						setState(742);
						match(Identifier);
						setState(743);
						match(RightBrac);
						}
					}

					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
						{
						setState(748);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
						case 1:
							{
							setState(746);
							statement();
							}
							break;
						case 2:
							{
							setState(747);
							declaration();
							}
							break;
						}
						}
						setState(752);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(753);
					match(End);
					setState(754);
					match(Else);
					setState(755);
					match(If);
					setState(757);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(756);
						match(Identifier);
						}
						break;
					}
					}
					} 
				}
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(764);
				match(Begin);
				setState(765);
				match(Else);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
					{
					setState(768);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
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
		enterRule(_localctx, 114, RULE_iterationStatement);
		int _la;
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				match(Begin);
				setState(778);
				match(While);
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrac) {
					{
					setState(779);
					match(LeftBrac);
					setState(780);
					match(Identifier);
					setState(781);
					match(RightBrac);
					}
				}

				setState(784);
				match(LeftParen);
				setState(785);
				expression();
				setState(786);
				match(RightParen);
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
					{
					setState(789);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						setState(787);
						statement();
						}
						break;
					case 2:
						{
						setState(788);
						declaration();
						}
						break;
					}
					}
					setState(793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(794);
				match(End);
				setState(795);
				match(While);
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(796);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(Begin);
				setState(800);
				match(For);
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrac) {
					{
					setState(801);
					match(LeftBrac);
					setState(802);
					match(Identifier);
					setState(803);
					match(RightBrac);
					}
				}

				setState(806);
				match(LeftParen);
				setState(807);
				forCondition();
				setState(808);
				match(RightParen);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
					{
					setState(811);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						setState(809);
						statement();
						}
						break;
					case 2:
						{
						setState(810);
						declaration();
						}
						break;
					}
					}
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(816);
				match(End);
				setState(817);
				match(For);
				setState(819);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(818);
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
		enterRule(_localctx, 116, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(823);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
					{
					setState(824);
					expression();
					}
				}

				}
				break;
			}
			setState(829);
			match(SemiColon);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
				{
				setState(830);
				forExpression();
				}
			}

			setState(833);
			match(SemiColon);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
				{
				setState(834);
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
		enterRule(_localctx, 118, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			declarationSpecifiers();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__20 - 20)) | (1L << (T__21 - 20)) | (1L << (T__22 - 20)) | (1L << (T__23 - 20)) | (1L << (T__24 - 20)) | (1L << (Identifier - 20)) | (1L << (Mult - 20)) | (1L << (Exponent - 20)) | (1L << (LeftParen - 20)))) != 0)) {
				{
				setState(838);
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
		enterRule(_localctx, 120, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			assignmentExpression();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(842);
				match(Comma);
				setState(843);
				assignmentExpression();
				}
				}
				setState(848);
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
		enterRule(_localctx, 122, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				{
				}
				break;
			case Break:
			case Continue:
				{
				setState(850);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(851);
					match(Identifier);
					}
				}

				}
				break;
			case Return:
				{
				setState(854);
				match(Return);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
					{
					setState(855);
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(860);
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
		enterRule(_localctx, 124, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon) {
				{
				setState(862);
				translationUnit();
				}
			}

			setState(865);
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
		enterRule(_localctx, 126, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(867);
				externalDeclaration();
				}
				}
				setState(870); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon );
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
		enterRule(_localctx, 128, RULE_externalDeclaration);
		try {
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Begin:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				functionDefinition();
				}
				break;
			case Decl:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				functionDeclaration();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__26:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(874);
				declaration();
				}
				break;
			case SemiColon:
				enterOuterAlt(_localctx, 4);
				{
				setState(875);
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
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(LucasGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(LucasGrammarParser.RightParen, i);
		}
		public TerminalNode SemiColon() { return getToken(LucasGrammarParser.SemiColon, 0); }
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
		enterRule(_localctx, 130, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(Decl);
			setState(879);
			match(Function);
			setState(880);
			match(Identifier);
			setState(881);
			match(LeftParen);
			setState(882);
			parameterTypeList();
			setState(883);
			match(RightParen);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(884);
				match(Arrow);
				setState(885);
				match(LeftParen);
				setState(886);
				parameterList();
				setState(887);
				match(RightParen);
				}
			}

			setState(891);
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
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(LucasGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(LucasGrammarParser.RightParen, i);
		}
		public TerminalNode End() { return getToken(LucasGrammarParser.End, 0); }
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
		enterRule(_localctx, 132, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(Begin);
			setState(894);
			match(Function);
			setState(895);
			match(Identifier);
			setState(896);
			match(LeftParen);
			setState(897);
			parameterTypeList();
			setState(898);
			match(RightParen);
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(899);
				match(Arrow);
				setState(900);
				match(LeftParen);
				setState(901);
				parameterList();
				setState(902);
				match(RightParen);
				}
			}

			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)))) != 0)) {
				{
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(906);
					statement();
					}
					break;
				case 2:
					{
					setState(907);
					declaration();
					}
					break;
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(913);
			match(End);
			setState(914);
			match(Function);
			setState(916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(915);
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
		enterRule(_localctx, 134, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(918);
				declaration();
				}
				}
				setState(921); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
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
		case 35:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 46:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3c\u039e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\6\2\u008e"+
		"\n\2\r\2\16\2\u008f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00a5\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\4\u00b1\n\4\f\4\16\4\u00b4\13\4\3\5\3\5\5\5\u00b8\n\5\3\5"+
		"\3\5\3\5\3\6\3\6\5\6\u00bf\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c7\n\6\3"+
		"\6\3\6\5\6\u00cb\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d3\n\6\3\6\3\6\3\6"+
		"\3\6\7\6\u00d9\n\6\f\6\16\6\u00dc\13\6\3\7\3\7\3\7\7\7\u00e1\n\7\f\7\16"+
		"\7\u00e4\13\7\3\b\7\b\u00e7\n\b\f\b\16\b\u00ea\13\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f7\n\b\3\t\3\t\3\n\5\n\u00fc\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0105\n\n\r\n\16\n\u0106\5\n\u0109\n\n\3"+
		"\13\3\13\3\13\7\13\u010e\n\13\f\13\16\13\u0111\13\13\3\f\3\f\3\f\7\f\u0116"+
		"\n\f\f\f\16\f\u0119\13\f\3\r\3\r\3\r\7\r\u011e\n\r\f\r\16\r\u0121\13\r"+
		"\3\16\3\16\3\16\7\16\u0126\n\16\f\16\16\16\u0129\13\16\3\17\3\17\3\17"+
		"\7\17\u012e\n\17\f\17\16\17\u0131\13\17\3\20\3\20\3\20\7\20\u0136\n\20"+
		"\f\20\16\20\u0139\13\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0141\n\21"+
		"\r\21\16\21\u0142\5\21\u0145\n\21\3\22\3\22\3\23\3\23\3\23\7\23\u014c"+
		"\n\23\f\23\16\23\u014f\13\23\3\24\3\24\3\25\3\25\5\25\u0155\n\25\3\25"+
		"\3\25\3\25\5\25\u015a\n\25\3\26\6\26\u015d\n\26\r\26\16\26\u015e\3\27"+
		"\6\27\u0162\n\27\r\27\16\27\u0163\3\30\3\30\5\30\u0168\n\30\3\31\3\31"+
		"\3\31\7\31\u016d\n\31\f\31\16\31\u0170\13\31\3\32\3\32\3\32\5\32\u0175"+
		"\n\32\3\33\3\33\3\33\5\33\u017a\n\33\3\34\3\34\5\34\u017e\n\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u0187\n\34\3\35\3\35\3\36\6\36\u018c"+
		"\n\36\r\36\16\36\u018d\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0198"+
		"\n\37\3 \3 \5 \u019c\n \3 \5 \u019f\n \3!\3!\3!\7!\u01a4\n!\f!\16!\u01a7"+
		"\13!\3\"\3\"\5\"\u01ab\n\"\3\"\3\"\5\"\u01af\n\"\3#\3#\3$\5$\u01b4\n$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u01c1\n%\r%\16%\u01c2\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\5%\u01cd\n%\3%\3%\3%\5%\u01d2\n%\3%\5%\u01d5\n%\3%\3%\3"+
		"%\3%\3%\5%\u01dc\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01eb\n"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01f7\n%\3%\7%\u01fa\n%\f%\16%\u01fd"+
		"\13%\3&\3&\3\'\3\'\3\'\3\'\3\'\7\'\u0206\n\'\f\'\16\'\u0209\13\'\3(\3"+
		"(\5(\u020d\n(\6(\u020f\n(\r(\16(\u0210\3)\6)\u0214\n)\r)\16)\u0215\3*"+
		"\3*\3*\5*\u021b\n*\3+\3+\3+\7+\u0220\n+\f+\16+\u0223\13+\3,\3,\3,\3,\3"+
		",\5,\u022a\n,\5,\u022c\n,\3-\3-\3-\7-\u0231\n-\f-\16-\u0234\13-\3.\3."+
		"\5.\u0238\n.\3/\3/\5/\u023c\n/\3/\5/\u023f\n/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u0248\n\60\3\60\5\60\u024b\n\60\3\60\3\60\3\60\3\60\5"+
		"\60\u0251\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u0261\n\60\3\60\5\60\u0264\n\60\3\60\3\60\3\60\5"+
		"\60\u0269\n\60\3\60\5\60\u026c\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u0273"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0286\n\60\3\60\7\60\u0289\n\60\f\60\16\60\u028c"+
		"\13\60\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u0294\n\62\3\62\3\62\5\62\u0298"+
		"\n\62\3\63\5\63\u029b\n\63\3\63\3\63\3\63\5\63\u02a0\n\63\3\63\7\63\u02a3"+
		"\n\63\f\63\16\63\u02a6\13\63\3\64\3\64\3\64\3\65\6\65\u02ac\n\65\r\65"+
		"\16\65\u02ad\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02b6\n\66\3\67\3\67\3"+
		"\67\3\67\3\67\6\67\u02bd\n\67\r\67\16\67\u02be\3\67\3\67\3\67\38\38\3"+
		"8\38\58\u02c8\n8\39\59\u02cb\n9\39\39\3:\3:\3:\3:\3:\5:\u02d4\n:\3:\3"+
		":\3:\3:\3:\7:\u02db\n:\f:\16:\u02de\13:\3:\3:\3:\5:\u02e3\n:\3:\3:\3:"+
		"\3:\3:\3:\5:\u02eb\n:\3:\3:\7:\u02ef\n:\f:\16:\u02f2\13:\3:\3:\3:\3:\5"+
		":\u02f8\n:\7:\u02fa\n:\f:\16:\u02fd\13:\3:\3:\3:\3:\7:\u0303\n:\f:\16"+
		":\u0306\13:\3:\3:\5:\u030a\n:\3;\3;\3;\3;\3;\5;\u0311\n;\3;\3;\3;\3;\3"+
		";\7;\u0318\n;\f;\16;\u031b\13;\3;\3;\3;\5;\u0320\n;\3;\3;\3;\3;\3;\5;"+
		"\u0327\n;\3;\3;\3;\3;\3;\7;\u032e\n;\f;\16;\u0331\13;\3;\3;\3;\5;\u0336"+
		"\n;\5;\u0338\n;\3<\3<\5<\u033c\n<\5<\u033e\n<\3<\3<\5<\u0342\n<\3<\3<"+
		"\5<\u0346\n<\3=\3=\5=\u034a\n=\3>\3>\3>\7>\u034f\n>\f>\16>\u0352\13>\3"+
		"?\3?\3?\5?\u0357\n?\3?\3?\5?\u035b\n?\5?\u035d\n?\3?\3?\3@\5@\u0362\n"+
		"@\3@\3@\3A\6A\u0367\nA\rA\16A\u0368\3B\3B\3B\3B\5B\u036f\nB\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\5C\u037c\nC\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\5D\u038b\nD\3D\3D\7D\u038f\nD\fD\16D\u0392\13D\3D\3D\3D\5D\u0397"+
		"\nD\3E\6E\u039a\nE\rE\16E\u039b\3E\2\4H^F\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\2\22\3\2MN\3\2VW\4\2\13\13VW\3\2\13\f\5\2=?B"+
		"BLL\3\2?A\3\2=>\4\2DEHI\3\2FG\5\2\r\16ZZ]_\t\2\17\21\37\37((**,,\61\61"+
		"\65\65\3\2\22\23\3\2\26\33\3\2PQ\4\2??CC\4\2  ++\2\u03f6\2\u00a4\3\2\2"+
		"\2\4\u00a6\3\2\2\2\6\u00ad\3\2\2\2\b\u00b7\3\2\2\2\n\u00ca\3\2\2\2\f\u00dd"+
		"\3\2\2\2\16\u00e8\3\2\2\2\20\u00f8\3\2\2\2\22\u0108\3\2\2\2\24\u010a\3"+
		"\2\2\2\26\u0112\3\2\2\2\30\u011a\3\2\2\2\32\u0122\3\2\2\2\34\u012a\3\2"+
		"\2\2\36\u0132\3\2\2\2 \u0144\3\2\2\2\"\u0146\3\2\2\2$\u0148\3\2\2\2&\u0150"+
		"\3\2\2\2(\u0159\3\2\2\2*\u015c\3\2\2\2,\u0161\3\2\2\2.\u0167\3\2\2\2\60"+
		"\u0169\3\2\2\2\62\u0171\3\2\2\2\64\u0179\3\2\2\2\66\u0186\3\2\2\28\u0188"+
		"\3\2\2\2:\u018b\3\2\2\2<\u0197\3\2\2\2>\u019b\3\2\2\2@\u01a0\3\2\2\2B"+
		"\u01ae\3\2\2\2D\u01b0\3\2\2\2F\u01b3\3\2\2\2H\u01cc\3\2\2\2J\u01fe\3\2"+
		"\2\2L\u0207\3\2\2\2N\u020e\3\2\2\2P\u0213\3\2\2\2R\u0217\3\2\2\2T\u021c"+
		"\3\2\2\2V\u022b\3\2\2\2X\u022d\3\2\2\2Z\u0235\3\2\2\2\\\u023e\3\2\2\2"+
		"^\u0263\3\2\2\2`\u028d\3\2\2\2b\u0297\3\2\2\2d\u029a\3\2\2\2f\u02a7\3"+
		"\2\2\2h\u02ab\3\2\2\2j\u02b5\3\2\2\2l\u02b7\3\2\2\2n\u02c7\3\2\2\2p\u02ca"+
		"\3\2\2\2r\u02ce\3\2\2\2t\u0337\3\2\2\2v\u033d\3\2\2\2x\u0347\3\2\2\2z"+
		"\u034b\3\2\2\2|\u035c\3\2\2\2~\u0361\3\2\2\2\u0080\u0366\3\2\2\2\u0082"+
		"\u036e\3\2\2\2\u0084\u0370\3\2\2\2\u0086\u037f\3\2\2\2\u0088\u0399\3\2"+
		"\2\2\u008a\u00a5\79\2\2\u008b\u00a5\7:\2\2\u008c\u008e\7<\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u00a5\3\2\2\2\u0091\u0092\7P\2\2\u0092\u0093\5$\23\2\u0093\u0094\7Q\2"+
		"\2\u0094\u00a5\3\2\2\2\u0095\u00a5\5\4\3\2\u0096\u0097\7\3\2\2\u0097\u0098"+
		"\7P\2\2\u0098\u0099\5\16\b\2\u0099\u009a\7U\2\2\u009a\u009b\5Z.\2\u009b"+
		"\u009c\7Q\2\2\u009c\u00a5\3\2\2\2\u009d\u009e\7\4\2\2\u009e\u009f\7P\2"+
		"\2\u009f\u00a0\5Z.\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3"+
		"\7Q\2\2\u00a3\u00a5\3\2\2\2\u00a4\u008a\3\2\2\2\u00a4\u008b\3\2\2\2\u00a4"+
		"\u008d\3\2\2\2\u00a4\u0091\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u0096\3\2"+
		"\2\2\u00a4\u009d\3\2\2\2\u00a5\3\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8"+
		"\7P\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa\7U\2\2\u00aa\u00ab\5\6\4\2\u00ab"+
		"\u00ac\7Q\2\2\u00ac\5\3\2\2\2\u00ad\u00b2\5\b\5\2\u00ae\u00af\7U\2\2\u00af"+
		"\u00b1\5\b\5\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\7\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8"+
		"\5Z.\2\u00b6\u00b8\7\6\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\7\7\2\2\u00ba\u00bb\5 \21\2\u00bb\t\3\2\2\2"+
		"\u00bc\u00cb\5\2\2\2\u00bd\u00bf\7\b\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7P\2\2\u00c1\u00c2\5Z.\2\u00c2"+
		"\u00c3\7Q\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c6\5d\63\2\u00c5\u00c7\7U\2"+
		"\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\7\n\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00bc\3\2\2\2\u00ca\u00be\3\2\2\2\u00cb"+
		"\u00da\3\2\2\2\u00cc\u00cd\7R\2\2\u00cd\u00ce\5$\23\2\u00ce\u00cf\7S\2"+
		"\2\u00cf\u00d9\3\2\2\2\u00d0\u00d2\7P\2\2\u00d1\u00d3\5\f\7\2\u00d2\u00d1"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d9\7Q\2\2\u00d5"+
		"\u00d6\t\2\2\2\u00d6\u00d9\79\2\2\u00d7\u00d9\t\3\2\2\u00d8\u00cc\3\2"+
		"\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\13\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dd\u00e2\5 \21\2\u00de\u00df\7U\2\2\u00df\u00e1"+
		"\5 \21\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\r\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\t\4\2\2"+
		"\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00f6\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00f7\5\n\6\2\u00ec"+
		"\u00ed\5\20\t\2\u00ed\u00ee\5\22\n\2\u00ee\u00f7\3\2\2\2\u00ef\u00f0\t"+
		"\5\2\2\u00f0\u00f1\7P\2\2\u00f1\u00f2\5Z.\2\u00f2\u00f3\7Q\2\2\u00f3\u00f7"+
		"\3\2\2\2\u00f4\u00f5\7J\2\2\u00f5\u00f7\79\2\2\u00f6\u00eb\3\2\2\2\u00f6"+
		"\u00ec\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\17\3\2\2"+
		"\2\u00f8\u00f9\t\6\2\2\u00f9\21\3\2\2\2\u00fa\u00fc\7\b\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7P\2\2\u00fe"+
		"\u00ff\5Z.\2\u00ff\u0100\7Q\2\2\u0100\u0101\5\22\n\2\u0101\u0109\3\2\2"+
		"\2\u0102\u0109\5\16\b\2\u0103\u0105\7;\2\2\u0104\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u00fb\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0104\3\2\2\2\u0109\23\3\2\2"+
		"\2\u010a\u010f\5\22\n\2\u010b\u010c\t\7\2\2\u010c\u010e\5\22\n\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\25\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0117\5\24\13\2\u0113"+
		"\u0114\t\b\2\2\u0114\u0116\5\24\13\2\u0115\u0113\3\2\2\2\u0116\u0119\3"+
		"\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\27\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011f\5\26\f\2\u011b\u011c\t\t\2\2\u011c\u011e\5"+
		"\26\f\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\31\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0127\5\30\r"+
		"\2\u0123\u0124\t\n\2\2\u0124\u0126\5\30\r\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\33\3\2\2"+
		"\2\u0129\u0127\3\2\2\2\u012a\u012f\5\32\16\2\u012b\u012c\7J\2\2\u012c"+
		"\u012e\5\32\16\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\35\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0137\5\34\17\2\u0133\u0134\7K\2\2\u0134\u0136\5\34\17\2\u0135\u0133"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\37\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0145\5\36\20\2\u013b\u013c\5\16"+
		"\b\2\u013c\u013d\5\"\22\2\u013d\u013e\5 \21\2\u013e\u0145\3\2\2\2\u013f"+
		"\u0141\7;\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u013a\3\2\2\2\u0144"+
		"\u013b\3\2\2\2\u0144\u0140\3\2\2\2\u0145!\3\2\2\2\u0146\u0147\t\13\2\2"+
		"\u0147#\3\2\2\2\u0148\u014d\5 \21\2\u0149\u014a\7U\2\2\u014a\u014c\5 "+
		"\21\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e%\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\5\36\20"+
		"\2\u0151\'\3\2\2\2\u0152\u0154\5*\26\2\u0153\u0155\5\60\31\2\u0154\u0153"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7T\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u015a\5l\67\2\u0159\u0152\3\2\2\2\u0159\u0158\3\2"+
		"\2\2\u015a)\3\2\2\2\u015b\u015d\5.\30\2\u015c\u015b\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f+\3\2\2\2\u0160"+
		"\u0162\5.\30\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164-\3\2\2\2\u0165\u0168\5\64\33\2\u0166\u0168"+
		"\5D#\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168/\3\2\2\2\u0169\u016e"+
		"\5\62\32\2\u016a\u016b\7U\2\2\u016b\u016d\5\62\32\2\u016c\u016a\3\2\2"+
		"\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\61"+
		"\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0174\5F$\2\u0172\u0173\7Z\2\2\u0173"+
		"\u0175\5b\62\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\63\3\2\2"+
		"\2\u0176\u017a\t\f\2\2\u0177\u017a\5\66\34\2\u0178\u017a\5`\61\2\u0179"+
		"\u0176\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a\65\3\2\2"+
		"\2\u017b\u017d\58\35\2\u017c\u017e\79\2\2\u017d\u017c\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7\t\2\2\u0180\u0181\5:\36\2\u0181"+
		"\u0182\7\n\2\2\u0182\u0187\3\2\2\2\u0183\u0184\58\35\2\u0184\u0185\79"+
		"\2\2\u0185\u0187\3\2\2\2\u0186\u017b\3\2\2\2\u0186\u0183\3\2\2\2\u0187"+
		"\67\3\2\2\2\u0188\u0189\t\r\2\2\u01899\3\2\2\2\u018a\u018c\5<\37\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e;\3\2\2\2\u018f\u0190\5> \2\u0190\u0191\5@!\2\u0191\u0192\7"+
		"T\2\2\u0192\u0198\3\2\2\2\u0193\u0194\5> \2\u0194\u0195\7T\2\2\u0195\u0198"+
		"\3\2\2\2\u0196\u0198\5l\67\2\u0197\u018f\3\2\2\2\u0197\u0193\3\2\2\2\u0197"+
		"\u0196\3\2\2\2\u0198=\3\2\2\2\u0199\u019c\5\64\33\2\u019a\u019c\5D#\2"+
		"\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f"+
		"\5> \2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f?\3\2\2\2\u01a0\u01a5"+
		"\5B\"\2\u01a1\u01a2\7U\2\2\u01a2\u01a4\5B\"\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6A\3\2\2\2"+
		"\u01a7\u01a5\3\2\2\2\u01a8\u01af\5F$\2\u01a9\u01ab\5F$\2\u01aa\u01a9\3"+
		"\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7\7\2\2\u01ad"+
		"\u01af\5&\24\2\u01ae\u01a8\3\2\2\2\u01ae\u01aa\3\2\2\2\u01afC\3\2\2\2"+
		"\u01b0\u01b1\7\24\2\2\u01b1E\3\2\2\2\u01b2\u01b4\5N(\2\u01b3\u01b2\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\5H%\2\u01b6G"+
		"\3\2\2\2\u01b7\u01b8\b%\1\2\u01b8\u01cd\79\2\2\u01b9\u01ba\7P\2\2\u01ba"+
		"\u01bb\5F$\2\u01bb\u01bc\7Q\2\2\u01bc\u01cd\3\2\2\2\u01bd\u01be\79\2\2"+
		"\u01be\u01c0\7\7\2\2\u01bf\u01c1\7;\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01cd\3\2\2\2\u01c4"+
		"\u01c5\5J&\2\u01c5\u01c6\79\2\2\u01c6\u01cd\3\2\2\2\u01c7\u01c8\7P\2\2"+
		"\u01c8\u01c9\5J&\2\u01c9\u01ca\5F$\2\u01ca\u01cb\7Q\2\2\u01cb\u01cd\3"+
		"\2\2\2\u01cc\u01b7\3\2\2\2\u01cc\u01b9\3\2\2\2\u01cc\u01bd\3\2\2\2\u01cc"+
		"\u01c4\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cd\u01fb\3\2\2\2\u01ce\u01cf\f\13"+
		"\2\2\u01cf\u01d1\7R\2\2\u01d0\u01d2\5P)\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d5\5 \21\2\u01d4\u01d3\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01fa\7S\2\2\u01d7\u01d8\f\n"+
		"\2\2\u01d8\u01d9\7R\2\2\u01d9\u01db\7\25\2\2\u01da\u01dc\5P)\2\u01db\u01da"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\5 \21\2\u01de"+
		"\u01df\7S\2\2\u01df\u01fa\3\2\2\2\u01e0\u01e1\f\t\2\2\u01e1\u01e2\7R\2"+
		"\2\u01e2\u01e3\5P)\2\u01e3\u01e4\7\25\2\2\u01e4\u01e5\5 \21\2\u01e5\u01e6"+
		"\7S\2\2\u01e6\u01fa\3\2\2\2\u01e7\u01e8\f\b\2\2\u01e8\u01ea\7R\2\2\u01e9"+
		"\u01eb\5P)\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2"+
		"\2\u01ec\u01ed\7?\2\2\u01ed\u01fa\7S\2\2\u01ee\u01ef\f\7\2\2\u01ef\u01f0"+
		"\7P\2\2\u01f0\u01f1\5R*\2\u01f1\u01f2\7Q\2\2\u01f2\u01fa\3\2\2\2\u01f3"+
		"\u01f4\f\6\2\2\u01f4\u01f6\7P\2\2\u01f5\u01f7\5X-\2\u01f6\u01f5\3\2\2"+
		"\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\7Q\2\2\u01f9\u01ce"+
		"\3\2\2\2\u01f9\u01d7\3\2\2\2\u01f9\u01e0\3\2\2\2\u01f9\u01e7\3\2\2\2\u01f9"+
		"\u01ee\3\2\2\2\u01f9\u01f3\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fcI\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff"+
		"\t\16\2\2\u01ffK\3\2\2\2\u0200\u0206\n\17\2\2\u0201\u0202\7P\2\2\u0202"+
		"\u0203\5L\'\2\u0203\u0204\7Q\2\2\u0204\u0206\3\2\2\2\u0205\u0200\3\2\2"+
		"\2\u0205\u0201\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208M\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020c\t\20\2\2\u020b"+
		"\u020d\5P)\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2"+
		"\2\u020e\u020a\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211O\3\2\2\2\u0212\u0214\5D#\2\u0213\u0212\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216Q\3\2\2\2\u0217"+
		"\u021a\5T+\2\u0218\u0219\7U\2\2\u0219\u021b\7\34\2\2\u021a\u0218\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021bS\3\2\2\2\u021c\u0221\5V,\2\u021d\u021e\7"+
		"U\2\2\u021e\u0220\5V,\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222U\3\2\2\2\u0223\u0221\3\2\2\2"+
		"\u0224\u0225\5*\26\2\u0225\u0226\5F$\2\u0226\u022c\3\2\2\2\u0227\u0229"+
		"\5,\27\2\u0228\u022a\5\\/\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\3\2\2\2\u022b\u0224\3\2\2\2\u022b\u0227\3\2\2\2\u022cW\3\2\2\2"+
		"\u022d\u0232\79\2\2\u022e\u022f\7U\2\2\u022f\u0231\79\2\2\u0230\u022e"+
		"\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"Y\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0237\5> \2\u0236\u0238\5\\/\2\u0237"+
		"\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238[\3\2\2\2\u0239\u023f\5N(\2\u023a"+
		"\u023c\5N(\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2"+
		"\2\u023d\u023f\5^\60\2\u023e\u0239\3\2\2\2\u023e\u023b\3\2\2\2\u023f]"+
		"\3\2\2\2\u0240\u0241\b\60\1\2\u0241\u0242\7P\2\2\u0242\u0243\5\\/\2\u0243"+
		"\u0244\7Q\2\2\u0244\u0264\3\2\2\2\u0245\u0247\7R\2\2\u0246\u0248\5P)\2"+
		"\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u024b"+
		"\5 \21\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u0264\7S\2\2\u024d\u024e\7R\2\2\u024e\u0250\7\25\2\2\u024f\u0251\5P)"+
		"\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253"+
		"\5 \21\2\u0253\u0254\7S\2\2\u0254\u0264\3\2\2\2\u0255\u0256\7R\2\2\u0256"+
		"\u0257\5P)\2\u0257\u0258\7\25\2\2\u0258\u0259\5 \21\2\u0259\u025a\7S\2"+
		"\2\u025a\u0264\3\2\2\2\u025b\u025c\7R\2\2\u025c\u025d\7?\2\2\u025d\u0264"+
		"\7S\2\2\u025e\u0260\7P\2\2\u025f\u0261\5R*\2\u0260\u025f\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\7Q\2\2\u0263\u0240\3\2"+
		"\2\2\u0263\u0245\3\2\2\2\u0263\u024d\3\2\2\2\u0263\u0255\3\2\2\2\u0263"+
		"\u025b\3\2\2\2\u0263\u025e\3\2\2\2\u0264\u028a\3\2\2\2\u0265\u0266\f\7"+
		"\2\2\u0266\u0268\7R\2\2\u0267\u0269\5P)\2\u0268\u0267\3\2\2\2\u0268\u0269"+
		"\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u026c\5 \21\2\u026b\u026a\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0289\7S\2\2\u026e\u026f\f\6"+
		"\2\2\u026f\u0270\7R\2\2\u0270\u0272\7\25\2\2\u0271\u0273\5P)\2\u0272\u0271"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\5 \21\2\u0275"+
		"\u0276\7S\2\2\u0276\u0289\3\2\2\2\u0277\u0278\f\5\2\2\u0278\u0279\7R\2"+
		"\2\u0279\u027a\5P)\2\u027a\u027b\7\25\2\2\u027b\u027c\5 \21\2\u027c\u027d"+
		"\7S\2\2\u027d\u0289\3\2\2\2\u027e\u027f\f\4\2\2\u027f\u0280\7R\2\2\u0280"+
		"\u0281\7?\2\2\u0281\u0289\7S\2\2\u0282\u0283\f\3\2\2\u0283\u0285\7P\2"+
		"\2\u0284\u0286\5R*\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287"+
		"\3\2\2\2\u0287\u0289\7Q\2\2\u0288\u0265\3\2\2\2\u0288\u026e\3\2\2\2\u0288"+
		"\u0277\3\2\2\2\u0288\u027e\3\2\2\2\u0288\u0282\3\2\2\2\u0289\u028c\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b_\3\2\2\2\u028c\u028a"+
		"\3\2\2\2\u028d\u028e\79\2\2\u028ea\3\2\2\2\u028f\u0298\5 \21\2\u0290\u0291"+
		"\7\t\2\2\u0291\u0293\5d\63\2\u0292\u0294\7U\2\2\u0293\u0292\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7\n\2\2\u0296\u0298\3\2"+
		"\2\2\u0297\u028f\3\2\2\2\u0297\u0290\3\2\2\2\u0298c\3\2\2\2\u0299\u029b"+
		"\5f\64\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u02a4\5b\62\2\u029d\u029f\7U\2\2\u029e\u02a0\5f\64\2\u029f\u029e\3\2"+
		"\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\5b\62\2\u02a2"+
		"\u029d\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2"+
		"\2\2\u02a5e\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\5h\65\2\u02a8\u02a9"+
		"\7Z\2\2\u02a9g\3\2\2\2\u02aa\u02ac\5j\66\2\u02ab\u02aa\3\2\2\2\u02ac\u02ad"+
		"\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02aei\3\2\2\2\u02af"+
		"\u02b0\7R\2\2\u02b0\u02b1\5&\24\2\u02b1\u02b2\7S\2\2\u02b2\u02b6\3\2\2"+
		"\2\u02b3\u02b4\7M\2\2\u02b4\u02b6\79\2\2\u02b5\u02af\3\2\2\2\u02b5\u02b3"+
		"\3\2\2\2\u02b6k\3\2\2\2\u02b7\u02b8\7\35\2\2\u02b8\u02b9\7P\2\2\u02b9"+
		"\u02ba\5&\24\2\u02ba\u02bc\7U\2\2\u02bb\u02bd\7<\2\2\u02bc\u02bb\3\2\2"+
		"\2\u02bd\u02be\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0"+
		"\3\2\2\2\u02c0\u02c1\7Q\2\2\u02c1\u02c2\7T\2\2\u02c2m\3\2\2\2\u02c3\u02c8"+
		"\5p9\2\u02c4\u02c8\5r:\2\u02c5\u02c8\5t;\2\u02c6\u02c8\5|?\2\u02c7\u02c3"+
		"\3\2\2\2\u02c7\u02c4\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8"+
		"o\3\2\2\2\u02c9\u02cb\5$\23\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2"+
		"\u02cb\u02cc\3\2\2\2\u02cc\u02cd\7T\2\2\u02cdq\3\2\2\2\u02ce\u02cf\7\36"+
		"\2\2\u02cf\u02d3\7\62\2\2\u02d0\u02d1\7R\2\2\u02d1\u02d2\79\2\2\u02d2"+
		"\u02d4\7S\2\2\u02d3\u02d0\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\u02d6\7P\2\2\u02d6\u02d7\5$\23\2\u02d7\u02dc\7Q\2\2\u02d8\u02db"+
		"\5n8\2\u02d9\u02db\5(\25\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02db"+
		"\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2"+
		"\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\7/\2\2\u02e0\u02e2\7\62\2\2\u02e1"+
		"\u02e3\79\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02fb\3\2"+
		"\2\2\u02e4\u02e5\7\36\2\2\u02e5\u02e6\7.\2\2\u02e6\u02ea\7\62\2\2\u02e7"+
		"\u02e8\7R\2\2\u02e8\u02e9\79\2\2\u02e9\u02eb\7S\2\2\u02ea\u02e7\3\2\2"+
		"\2\u02ea\u02eb\3\2\2\2\u02eb\u02f0\3\2\2\2\u02ec\u02ef\5n8\2\u02ed\u02ef"+
		"\5(\25\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2"+
		"\2\2\u02f3\u02f4\7/\2\2\u02f4\u02f5\7.\2\2\u02f5\u02f7\7\62\2\2\u02f6"+
		"\u02f8\79\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2"+
		"\2\2\u02f9\u02e4\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb"+
		"\u02fc\3\2\2\2\u02fc\u0309\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02ff\7\36"+
		"\2\2\u02ff\u0304\7.\2\2\u0300\u0303\5n8\2\u0301\u0303\5(\25\2\u0302\u0300"+
		"\3\2\2\2\u0302\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0308\7/"+
		"\2\2\u0308\u030a\7.\2\2\u0309\u02fe\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"s\3\2\2\2\u030b\u030c\7\36\2\2\u030c\u0310\7\66\2\2\u030d\u030e\7R\2\2"+
		"\u030e\u030f\79\2\2\u030f\u0311\7S\2\2\u0310\u030d\3\2\2\2\u0310\u0311"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\7P\2\2\u0313\u0314\5$\23\2\u0314"+
		"\u0319\7Q\2\2\u0315\u0318\5n8\2\u0316\u0318\5(\25\2\u0317\u0315\3\2\2"+
		"\2\u0317\u0316\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a"+
		"\3\2\2\2\u031a\u031c\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u031d\7/\2\2\u031d"+
		"\u031f\7\66\2\2\u031e\u0320\79\2\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2"+
		"\2\2\u0320\u0338\3\2\2\2\u0321\u0322\7\36\2\2\u0322\u0326\7\60\2\2\u0323"+
		"\u0324\7R\2\2\u0324\u0325\79\2\2\u0325\u0327\7S\2\2\u0326\u0323\3\2\2"+
		"\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\7P\2\2\u0329\u032a"+
		"\5v<\2\u032a\u032f\7Q\2\2\u032b\u032e\5n8\2\u032c\u032e\5(\25\2\u032d"+
		"\u032b\3\2\2\2\u032d\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2"+
		"\2\2\u032f\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332"+
		"\u0333\7/\2\2\u0333\u0335\7\60\2\2\u0334\u0336\79\2\2\u0335\u0334\3\2"+
		"\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337\u030b\3\2\2\2\u0337"+
		"\u0321\3\2\2\2\u0338u\3\2\2\2\u0339\u033e\5x=\2\u033a\u033c\5$\23\2\u033b"+
		"\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u0339\3\2"+
		"\2\2\u033d\u033b\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\7T\2\2\u0340"+
		"\u0342\5z>\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2"+
		"\2\u0343\u0345\7T\2\2\u0344\u0346\5z>\2\u0345\u0344\3\2\2\2\u0345\u0346"+
		"\3\2\2\2\u0346w\3\2\2\2\u0347\u0349\5*\26\2\u0348\u034a\5\60\31\2\u0349"+
		"\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034ay\3\2\2\2\u034b\u0350\5 \21\2"+
		"\u034c\u034d\7U\2\2\u034d\u034f\5 \21\2\u034e\u034c\3\2\2\2\u034f\u0352"+
		"\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351{\3\2\2\2\u0352"+
		"\u0350\3\2\2\2\u0353\u035d\3\2\2\2\u0354\u0356\t\21\2\2\u0355\u0357\7"+
		"9\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u035d\3\2\2\2\u0358"+
		"\u035a\7\63\2\2\u0359\u035b\5$\23\2\u035a\u0359\3\2\2\2\u035a\u035b\3"+
		"\2\2\2\u035b\u035d\3\2\2\2\u035c\u0353\3\2\2\2\u035c\u0354\3\2\2\2\u035c"+
		"\u0358\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\7T\2\2\u035f}\3\2\2\2\u0360"+
		"\u0362\5\u0080A\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\u0364\7\2\2\3\u0364\177\3\2\2\2\u0365\u0367\5\u0082B\2"+
		"\u0366\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369"+
		"\3\2\2\2\u0369\u0081\3\2\2\2\u036a\u036f\5\u0086D\2\u036b\u036f\5\u0084"+
		"C\2\u036c\u036f\5(\25\2\u036d\u036f\7T\2\2\u036e\u036a\3\2\2\2\u036e\u036b"+
		"\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2\2\2\u036f\u0083\3\2\2\2\u0370"+
		"\u0371\7!\2\2\u0371\u0372\7-\2\2\u0372\u0373\79\2\2\u0373\u0374\7P\2\2"+
		"\u0374\u0375\5R*\2\u0375\u037b\7Q\2\2\u0376\u0377\7N\2\2\u0377\u0378\7"+
		"P\2\2\u0378\u0379\5T+\2\u0379\u037a\7Q\2\2\u037a\u037c\3\2\2\2\u037b\u0376"+
		"\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\7T\2\2\u037e"+
		"\u0085\3\2\2\2\u037f\u0380\7\36\2\2\u0380\u0381\7-\2\2\u0381\u0382\79"+
		"\2\2\u0382\u0383\7P\2\2\u0383\u0384\5R*\2\u0384\u038a\7Q\2\2\u0385\u0386"+
		"\7N\2\2\u0386\u0387\7P\2\2\u0387\u0388\5T+\2\u0388\u0389\7Q\2\2\u0389"+
		"\u038b\3\2\2\2\u038a\u0385\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u0390\3\2"+
		"\2\2\u038c\u038f\5n8\2\u038d\u038f\5(\25\2\u038e\u038c\3\2\2\2\u038e\u038d"+
		"\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
		"\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\7/\2\2\u0394\u0396\7-\2"+
		"\2\u0395\u0397\79\2\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0087"+
		"\3\2\2\2\u0398\u039a\5(\25\2\u0399\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u0089\3\2\2\2\177\u008f\u00a4"+
		"\u00b2\u00b7\u00be\u00c6\u00ca\u00d2\u00d8\u00da\u00e2\u00e8\u00f6\u00fb"+
		"\u0106\u0108\u010f\u0117\u011f\u0127\u012f\u0137\u0142\u0144\u014d\u0154"+
		"\u0159\u015e\u0163\u0167\u016e\u0174\u0179\u017d\u0186\u018d\u0197\u019b"+
		"\u019e\u01a5\u01aa\u01ae\u01b3\u01c2\u01cc\u01d1\u01d4\u01db\u01ea\u01f6"+
		"\u01f9\u01fb\u0205\u0207\u020c\u0210\u0215\u021a\u0221\u0229\u022b\u0232"+
		"\u0237\u023b\u023e\u0247\u024a\u0250\u0260\u0263\u0268\u026b\u0272\u0285"+
		"\u0288\u028a\u0293\u0297\u029a\u029f\u02a4\u02ad\u02b5\u02be\u02c7\u02ca"+
		"\u02d3\u02da\u02dc\u02e2\u02ea\u02ee\u02f0\u02f7\u02fb\u0302\u0304\u0309"+
		"\u0310\u0317\u0319\u031f\u0326\u032d\u032f\u0335\u0337\u033b\u033d\u0341"+
		"\u0345\u0349\u0350\u0356\u035a\u035c\u0361\u0368\u036e\u037b\u038a\u038e"+
		"\u0390\u0396\u039b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}