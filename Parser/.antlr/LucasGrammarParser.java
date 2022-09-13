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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Begin=33, BigInt=34, Break=35, Decl=36, Expr=37, Public=38, 
		Private=39, TypeOf=40, Vector=41, Case=42, Char=43, Class=44, CharSeq=45, 
		Continue=46, Double=47, Function=48, Else=49, End=50, For=51, Int=52, 
		If=53, Return=54, Switch=55, Void=56, While=57, TE=58, LE=59, Identifier=60, 
		Literal=61, Add=62, Sub=63, Mult=64, Div=65, Mod=66, Tilde=67, Exponent=68, 
		LessThan=69, GreaterThan=70, Equality=71, Inequality=72, LessThanEqual=73, 
		GreaterThanEqual=74, LogicalAnd=75, LogicalOr=76, LogicalNot=77, Dot=78, 
		Arrow=79, ClassSpec=80, LeftParen=81, RightParen=82, LeftBrac=83, RightBrac=84, 
		SemiColon=85, Comma=86, Increment=87, Decrement=88, RightShift=89, LeftShift=90, 
		Assign=91, LeftShiftEqual=92, RightShiftEqual=93, PlusEqual=94, MinusEqual=95, 
		MultEqual=96, Whitespace=97, Newline=98, BlockComment=99, LineComment=100, 
		StringLiteral=101, Digit=102, MAKE=103, CLASSESSSSSSSSSSs=104;
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
		RULE_vcSpecificModifer = 36, RULE_gccDeclaratorExtension = 37, RULE_gccAttributeSpecifier = 38, 
		RULE_gccAttributeList = 39, RULE_gccAttribute = 40, RULE_nestedParenthesesBlock = 41, 
		RULE_pointer = 42, RULE_typeQualifierList = 43, RULE_parameterTypeList = 44, 
		RULE_parameterList = 45, RULE_parameterDeclaration = 46, RULE_identifierList = 47, 
		RULE_typeName = 48, RULE_abstractDeclarator = 49, RULE_directAbstractDeclarator = 50, 
		RULE_typedefName = 51, RULE_initializer = 52, RULE_initializerList = 53, 
		RULE_designation = 54, RULE_designatorList = 55, RULE_designator = 56, 
		RULE_staticAssertDeclaration = 57, RULE_statement = 58, RULE_labeledStatement = 59, 
		RULE_compoundStatement = 60, RULE_blockItemList = 61, RULE_blockItem = 62, 
		RULE_expressionStatement = 63, RULE_selectionStatement = 64, RULE_iterationStatement = 65, 
		RULE_forCondition = 66, RULE_forDeclaration = 67, RULE_forExpression = 68, 
		RULE_jumpStatement = 69, RULE_compilationUnit = 70, RULE_translationUnit = 71, 
		RULE_externalDeclaration = 72, RULE_functionDeclaration = 73, RULE_functionDefinition = 74, 
		RULE_declarationList = 75;
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
			"directDeclarator", "vcSpecificModifer", "gccDeclaratorExtension", "gccAttributeSpecifier", 
			"gccAttributeList", "gccAttribute", "nestedParenthesesBlock", "pointer", 
			"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
			"identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator", 
			"typedefName", "initializer", "initializerList", "designation", "designatorList", 
			"designator", "staticAssertDeclaration", "statement", "labeledStatement", 
			"compoundStatement", "blockItemList", "blockItem", "expressionStatement", 
			"selectionStatement", "iterationStatement", "forCondition", "forDeclaration", 
			"forExpression", "jumpStatement", "compilationUnit", "translationUnit", 
			"externalDeclaration", "functionDeclaration", "functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
			"'_Generic'", "'default'", "':'", "'{'", "'}'", "'sizeof'", "'_Alignof'", 
			"'/='", "'%='", "'long'", "'float'", "'boolean'", "'struct'", "'union'", 
			"'const'", "'static'", "'__cdecl'", "'__clrcall'", "'__stdcall'", "'__fastcall'", 
			"'__thiscall'", "'__vectorcall'", "'__asm'", "'__attribute__'", "'...'", 
			"'_Static_assert'", "'__asm__'", "'volatile'", "'__volatile__'", "'begin'", 
			"'bigint'", "'break'", "'decl'", "'expr'", "'public'", "'private'", "'typeof'", 
			"'vector'", "'case'", "'char'", "'class'", "'charseq'", "'continue'", 
			"'double'", "'function'", "'else'", "'end'", "'for'", "'int'", "'if'", 
			"'return'", "'switch'", "'void'", "'while'", null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'^'", "'<'", "'>'", "'=='", 
			"'!='", "'<='", "'>='", "'&&'", "'||'", "'!'", "'.'", "'->'", "'::'", 
			"'('", "')'", "'['", "']'", "';'", "','", "'++'", "'--'", "'>>'", "'<<'", 
			"'='", "'<<='", "'>>='", "'+='", "'-='", "'*='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Begin", "BigInt", 
			"Break", "Decl", "Expr", "Public", "Private", "TypeOf", "Vector", "Case", 
			"Char", "Class", "CharSeq", "Continue", "Double", "Function", "Else", 
			"End", "For", "Int", "If", "Return", "Switch", "Void", "While", "TE", 
			"LE", "Identifier", "Literal", "Add", "Sub", "Mult", "Div", "Mod", "Tilde", 
			"Exponent", "LessThan", "GreaterThan", "Equality", "Inequality", "LessThanEqual", 
			"GreaterThanEqual", "LogicalAnd", "LogicalOr", "LogicalNot", "Dot", "Arrow", 
			"ClassSpec", "LeftParen", "RightParen", "LeftBrac", "RightBrac", "SemiColon", 
			"Comma", "Increment", "Decrement", "RightShift", "LeftShift", "Assign", 
			"LeftShiftEqual", "RightShiftEqual", "PlusEqual", "MinusEqual", "MultEqual", 
			"Whitespace", "Newline", "BlockComment", "LineComment", "StringLiteral", 
			"Digit", "MAKE", "CLASSESSSSSSSSSSs"
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
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
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
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(Literal);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					match(StringLiteral);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(LeftParen);
				setState(160);
				expression();
				setState(161);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(164);
					match(T__0);
					}
				}

				setState(167);
				match(LeftParen);
				setState(168);
				compoundStatement();
				setState(169);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(T__1);
				setState(172);
				match(LeftParen);
				setState(173);
				unaryExpression();
				setState(174);
				match(Comma);
				setState(175);
				typeName();
				setState(176);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				match(T__2);
				setState(179);
				match(LeftParen);
				setState(180);
				typeName();
				setState(181);
				match(Comma);
				setState(182);
				unaryExpression();
				setState(183);
				match(RightParen);
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
			setState(187);
			match(T__3);
			setState(188);
			match(LeftParen);
			setState(189);
			assignmentExpression();
			setState(190);
			match(Comma);
			setState(191);
			genericAssocList();
			setState(192);
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
			setState(194);
			genericAssociation();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(195);
				match(Comma);
				setState(196);
				genericAssociation();
				}
				}
				setState(201);
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
			setState(204);
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
				setState(202);
				typeName();
				}
				break;
			case T__4:
				{
				setState(203);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206);
			match(T__5);
			setState(207);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(209);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(210);
					match(T__0);
					}
				}

				setState(213);
				match(LeftParen);
				setState(214);
				typeName();
				setState(215);
				match(RightParen);
				setState(216);
				match(T__6);
				setState(217);
				initializerList();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(218);
					match(Comma);
					}
				}

				setState(221);
				match(T__7);
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Dot - 78)) | (1L << (Arrow - 78)) | (1L << (LeftParen - 78)) | (1L << (LeftBrac - 78)) | (1L << (Increment - 78)) | (1L << (Decrement - 78)))) != 0)) {
				{
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBrac:
					{
					setState(225);
					match(LeftBrac);
					setState(226);
					expression();
					setState(227);
					match(RightBrac);
					}
					break;
				case LeftParen:
					{
					setState(229);
					match(LeftParen);
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
						{
						setState(230);
						argumentExpressionList();
						}
					}

					setState(233);
					match(RightParen);
					}
					break;
				case Dot:
				case Arrow:
					{
					setState(234);
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==Arrow) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(235);
					match(Identifier);
					}
					break;
				case Increment:
				case Decrement:
					{
					setState(236);
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
				setState(241);
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
			setState(242);
			assignmentExpression();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(243);
				match(Comma);
				setState(244);
				assignmentExpression();
				}
				}
				setState(249);
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
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
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
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case Identifier:
			case Literal:
			case LeftParen:
			case StringLiteral:
				{
				setState(256);
				postfixExpression();
				}
				break;
			case Add:
			case Sub:
			case Mult:
			case Tilde:
			case LogicalNot:
				{
				setState(257);
				unaryOperator();
				setState(258);
				castExpression();
				}
				break;
			case T__8:
			case T__9:
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				match(LeftParen);
				setState(262);
				typeName();
				setState(263);
				match(RightParen);
				}
				break;
			case LogicalAnd:
				{
				setState(265);
				match(LogicalAnd);
				setState(266);
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
			setState(269);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (Add - 62)) | (1L << (Sub - 62)) | (1L << (Mult - 62)) | (1L << (Tilde - 62)) | (1L << (LogicalNot - 62)))) != 0)) ) {
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
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(271);
					match(T__0);
					}
				}

				setState(274);
				match(LeftParen);
				setState(275);
				typeName();
				setState(276);
				match(RightParen);
				setState(277);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(280);
					match(Digit);
					}
					}
					setState(283); 
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
			setState(287);
			castExpression();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)))) != 0)) {
				{
				{
				setState(288);
				_la = _input.LA(1);
				if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				castExpression();
				}
				}
				setState(294);
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
			setState(295);
			multiplicativeExpression();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Add || _la==Sub) {
				{
				{
				setState(296);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Sub) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(297);
				multiplicativeExpression();
				}
				}
				setState(302);
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
			setState(303);
			additiveExpression();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LessThan - 69)) | (1L << (GreaterThan - 69)) | (1L << (LessThanEqual - 69)) | (1L << (GreaterThanEqual - 69)))) != 0)) {
				{
				{
				setState(304);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LessThan - 69)) | (1L << (GreaterThan - 69)) | (1L << (LessThanEqual - 69)) | (1L << (GreaterThanEqual - 69)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
				additiveExpression();
				}
				}
				setState(310);
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
			setState(311);
			relationalExpression();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equality || _la==Inequality) {
				{
				{
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==Equality || _la==Inequality) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				relationalExpression();
				}
				}
				setState(318);
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
			setState(319);
			equalityExpression();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalAnd) {
				{
				{
				setState(320);
				match(LogicalAnd);
				setState(321);
				equalityExpression();
				}
				}
				setState(326);
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
			setState(327);
			logicalAndExpression();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOr) {
				{
				{
				setState(328);
				match(LogicalOr);
				setState(329);
				logicalAndExpression();
				}
				}
				setState(334);
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				unaryExpression();
				setState(337);
				assignmentOperator();
				setState(338);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(340);
					match(Digit);
					}
					}
					setState(343); 
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
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11 || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (Assign - 91)) | (1L << (PlusEqual - 91)) | (1L << (MinusEqual - 91)) | (1L << (MultEqual - 91)))) != 0)) ) {
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
			setState(349);
			assignmentExpression();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(350);
				match(Comma);
				setState(351);
				assignmentExpression();
				}
				}
				setState(356);
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
			setState(357);
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
			setState(366);
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
				setState(359);
				declarationSpecifiers();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__20 - 20)) | (1L << (T__21 - 20)) | (1L << (T__22 - 20)) | (1L << (T__23 - 20)) | (1L << (T__24 - 20)) | (1L << (Identifier - 20)) | (1L << (Mult - 20)) | (1L << (Exponent - 20)) | (1L << (LeftParen - 20)))) != 0)) {
					{
					setState(360);
					initDeclaratorList();
					}
				}

				setState(363);
				match(SemiColon);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
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
			setState(369); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(368);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(371); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
			setState(374); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(373);
				declarationSpecifier();
				}
				}
				setState(376); 
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
			setState(380);
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
				setState(378);
				typeSpecifier();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
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
			setState(382);
			initDeclarator();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(383);
				match(Comma);
				setState(384);
				initDeclarator();
				}
				}
				setState(389);
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
			setState(390);
			declarator();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(391);
				match(Assign);
				setState(392);
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
		public TerminalNode MAKE() { return getToken(LucasGrammarParser.MAKE, 0); }
		public TerminalNode CLASSESSSSSSSSSSs() { return getToken(LucasGrammarParser.CLASSESSSSSSSSSSs, 0); }
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
			setState(401);
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
				setState(395);
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
				setState(396);
				structOrUnionSpecifier();
				setState(397);
				match(MAKE);
				setState(398);
				match(CLASSESSSSSSSSSSs);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
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
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				structOrUnion();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(404);
					match(Identifier);
					}
				}

				setState(407);
				match(T__6);
				setState(408);
				structDeclarationList();
				setState(409);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				structOrUnion();
				setState(412);
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
			setState(416);
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
			setState(419); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(418);
				structDeclaration();
				}
				}
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
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
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				specifierQualifierList();
				setState(424);
				structDeclaratorList();
				setState(425);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				specifierQualifierList();
				setState(428);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
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
			setState(435);
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
				setState(433);
				typeSpecifier();
				}
				break;
			case T__17:
				{
				setState(434);
				typeQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(437);
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
			setState(440);
			structDeclarator();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(441);
				match(Comma);
				setState(442);
				structDeclarator();
				}
				}
				setState(447);
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
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__20 - 20)) | (1L << (T__21 - 20)) | (1L << (T__22 - 20)) | (1L << (T__23 - 20)) | (1L << (T__24 - 20)) | (1L << (Identifier - 20)) | (1L << (Mult - 20)) | (1L << (Exponent - 20)) | (1L << (LeftParen - 20)))) != 0)) {
					{
					setState(449);
					declarator();
					}
				}

				setState(452);
				match(T__5);
				setState(453);
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
			setState(456);
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
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
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
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mult || _la==Exponent) {
				{
				setState(458);
				pointer();
				}
			}

			setState(461);
			directDeclarator(0);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25 || _la==T__26) {
				{
				{
				setState(462);
				gccDeclaratorExtension();
				}
				}
				setState(467);
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
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(469);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(470);
				match(LeftParen);
				setState(471);
				declarator();
				setState(472);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(474);
				match(Identifier);
				setState(475);
				match(T__5);
				setState(477); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(476);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(479); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				setState(481);
				vcSpecificModifer();
				setState(482);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(484);
				match(LeftParen);
				setState(485);
				vcSpecificModifer();
				setState(486);
				declarator();
				setState(487);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(534);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(491);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(492);
						match(LeftBrac);
						setState(494);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(493);
							typeQualifierList();
							}
						}

						setState(497);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
							{
							setState(496);
							assignmentExpression();
							}
						}

						setState(499);
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(500);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(501);
						match(LeftBrac);
						setState(502);
						match(T__18);
						setState(504);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(503);
							typeQualifierList();
							}
						}

						setState(506);
						assignmentExpression();
						setState(507);
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(509);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(510);
						match(LeftBrac);
						setState(511);
						typeQualifierList();
						setState(512);
						match(T__18);
						setState(513);
						assignmentExpression();
						setState(514);
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(516);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(517);
						match(LeftBrac);
						setState(519);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(518);
							typeQualifierList();
							}
						}

						setState(521);
						match(Mult);
						setState(522);
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(523);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(524);
						match(LeftParen);
						setState(525);
						parameterTypeList();
						setState(526);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(528);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(529);
						match(LeftParen);
						setState(531);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(530);
							identifierList();
							}
						}

						setState(533);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
			setState(539);
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

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(LucasGrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(LucasGrammarParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(T__25);
				setState(542);
				match(LeftParen);
				setState(544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(543);
					match(StringLiteral);
					}
					}
					setState(546); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(548);
				match(RightParen);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				gccAttributeSpecifier();
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

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(LucasGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(LucasGrammarParser.LeftParen, i);
		}
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(LucasGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(LucasGrammarParser.RightParen, i);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__26);
			setState(553);
			match(LeftParen);
			setState(554);
			match(LeftParen);
			setState(555);
			gccAttributeList();
			setState(556);
			match(RightParen);
			setState(557);
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

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_gccAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Function) | (1L << Else) | (1L << End) | (1L << For) | (1L << Int) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << TE) | (1L << LE) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Tilde - 64)) | (1L << (Exponent - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (Equality - 64)) | (1L << (Inequality - 64)) | (1L << (LessThanEqual - 64)) | (1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)) | (1L << (MAKE - 64)) | (1L << (CLASSESSSSSSSSSSs - 64)))) != 0)) {
				{
				setState(559);
				gccAttribute();
				}
			}

			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(562);
				match(Comma);
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Function) | (1L << Else) | (1L << End) | (1L << For) | (1L << Int) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << TE) | (1L << LE) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Tilde - 64)) | (1L << (Exponent - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (Equality - 64)) | (1L << (Inequality - 64)) | (1L << (LessThanEqual - 64)) | (1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)) | (1L << (MAKE - 64)) | (1L << (CLASSESSSSSSSSSSs - 64)))) != 0)) {
					{
					setState(563);
					gccAttribute();
					}
				}

				}
				}
				setState(570);
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

	public static class GccAttributeContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(LucasGrammarParser.Comma, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(LucasGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(LucasGrammarParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(LucasGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(LucasGrammarParser.RightParen, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_gccAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LeftParen - 81)) | (1L << (RightParen - 81)) | (1L << (Comma - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(572);
				match(LeftParen);
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
					{
					setState(573);
					argumentExpressionList();
					}
				}

				setState(576);
				match(RightParen);
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
		enterRule(_localctx, 82, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Function) | (1L << Else) | (1L << End) | (1L << For) | (1L << Int) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << TE) | (1L << LE) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Tilde - 64)) | (1L << (Exponent - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (Equality - 64)) | (1L << (Inequality - 64)) | (1L << (LessThanEqual - 64)) | (1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Comma - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)) | (1L << (MAKE - 64)) | (1L << (CLASSESSSSSSSSSSs - 64)))) != 0)) {
				{
				setState(584);
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
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
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
				case StringLiteral:
				case Digit:
				case MAKE:
				case CLASSESSSSSSSSSSs:
					{
					setState(579);
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
					setState(580);
					match(LeftParen);
					setState(581);
					nestedParenthesesBlock();
					setState(582);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(588);
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
		enterRule(_localctx, 84, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(589);
				_la = _input.LA(1);
				if ( !(_la==Mult || _la==Exponent) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(590);
					typeQualifierList();
					}
				}

				}
				}
				setState(595); 
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
		enterRule(_localctx, 86, RULE_typeQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(597);
				typeQualifier();
				}
				}
				setState(600); 
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
		enterRule(_localctx, 88, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			parameterList();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(603);
				match(Comma);
				setState(604);
				match(T__27);
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
		enterRule(_localctx, 90, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			parameterDeclaration();
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					match(Comma);
					setState(609);
					parameterDeclaration();
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 92, RULE_parameterDeclaration);
		int _la;
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				declarationSpecifiers();
				setState(616);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				declarationSpecifiers2();
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Exponent - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBrac - 64)))) != 0)) {
					{
					setState(619);
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
		enterRule(_localctx, 94, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(Identifier);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(625);
				match(Comma);
				setState(626);
				match(Identifier);
				}
				}
				setState(631);
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
		enterRule(_localctx, 96, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			specifierQualifierList();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Exponent - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBrac - 64)))) != 0)) {
				{
				setState(633);
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
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_abstractDeclarator);
		int _la;
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Mult || _la==Exponent) {
					{
					setState(637);
					pointer();
					}
				}

				setState(640);
				directAbstractDeclarator(0);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25 || _la==T__26) {
					{
					{
					setState(641);
					gccDeclaratorExtension();
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(650);
				match(LeftParen);
				setState(651);
				abstractDeclarator();
				setState(652);
				match(RightParen);
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(653);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(658);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(659);
				match(LeftBrac);
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(660);
					typeQualifierList();
					}
				}

				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
					{
					setState(663);
					assignmentExpression();
					}
				}

				setState(666);
				match(RightBrac);
				}
				break;
			case 3:
				{
				setState(667);
				match(LeftBrac);
				setState(668);
				match(T__18);
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(669);
					typeQualifierList();
					}
				}

				setState(672);
				assignmentExpression();
				setState(673);
				match(RightBrac);
				}
				break;
			case 4:
				{
				setState(675);
				match(LeftBrac);
				setState(676);
				typeQualifierList();
				setState(677);
				match(T__18);
				setState(678);
				assignmentExpression();
				setState(679);
				match(RightBrac);
				}
				break;
			case 5:
				{
				setState(681);
				match(LeftBrac);
				setState(682);
				match(Mult);
				setState(683);
				match(RightBrac);
				}
				break;
			case 6:
				{
				setState(684);
				match(LeftParen);
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
					{
					setState(685);
					parameterTypeList();
					}
				}

				setState(688);
				match(RightParen);
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(689);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(694);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(740);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(738);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(697);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(698);
						match(LeftBrac);
						setState(700);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(699);
							typeQualifierList();
							}
						}

						setState(703);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
							{
							setState(702);
							assignmentExpression();
							}
						}

						setState(705);
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(706);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(707);
						match(LeftBrac);
						setState(708);
						match(T__18);
						setState(710);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(709);
							typeQualifierList();
							}
						}

						setState(712);
						assignmentExpression();
						setState(713);
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(715);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(716);
						match(LeftBrac);
						setState(717);
						typeQualifierList();
						setState(718);
						match(T__18);
						setState(719);
						assignmentExpression();
						setState(720);
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(722);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(723);
						match(LeftBrac);
						setState(724);
						match(Mult);
						setState(725);
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(726);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(727);
						match(LeftParen);
						setState(729);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
							{
							setState(728);
							parameterTypeList();
							}
						}

						setState(731);
						match(RightParen);
						setState(735);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(732);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(737);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(742);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		enterRule(_localctx, 102, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
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
		enterRule(_localctx, 104, RULE_initializer);
		int _la;
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__8:
			case T__9:
			case Identifier:
			case Literal:
			case Add:
			case Sub:
			case Mult:
			case Tilde:
			case LogicalAnd:
			case LogicalNot:
			case LeftParen:
			case Increment:
			case Decrement:
			case StringLiteral:
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				assignmentExpression();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(T__6);
				setState(747);
				initializerList();
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(748);
					match(Comma);
					}
				}

				setState(751);
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
		enterRule(_localctx, 106, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot || _la==LeftBrac) {
				{
				setState(755);
				designation();
				}
			}

			setState(758);
			initializer();
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(759);
					match(Comma);
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Dot || _la==LeftBrac) {
						{
						setState(760);
						designation();
						}
					}

					setState(763);
					initializer();
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
		enterRule(_localctx, 108, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			designatorList();
			setState(770);
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
		enterRule(_localctx, 110, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(772);
				designator();
				}
				}
				setState(775); 
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
		enterRule(_localctx, 112, RULE_designator);
		try {
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrac:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				match(LeftBrac);
				setState(778);
				constantExpression();
				setState(779);
				match(RightBrac);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(Dot);
				setState(782);
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
		enterRule(_localctx, 114, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(T__28);
			setState(786);
			match(LeftParen);
			setState(787);
			constantExpression();
			setState(788);
			match(Comma);
			setState(790); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(789);
				match(StringLiteral);
				}
				}
				setState(792); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(794);
			match(RightParen);
			setState(795);
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
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
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
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public TerminalNode SemiColon() { return getToken(LucasGrammarParser.SemiColon, 0); }
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_statement);
		int _la;
		try {
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(800);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(801);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(802);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(803);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(804);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(805);
				match(LeftParen);
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
					{
					setState(806);
					logicalOrExpression();
					setState(811);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(807);
						match(Comma);
						setState(808);
						logicalOrExpression();
						}
						}
						setState(813);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(816);
					match(T__5);
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
						{
						setState(817);
						logicalOrExpression();
						setState(822);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(818);
							match(Comma);
							setState(819);
							logicalOrExpression();
							}
							}
							setState(824);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(832);
				match(RightParen);
				setState(833);
				match(SemiColon);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(LucasGrammarParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_labeledStatement);
		try {
			setState(847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				match(Identifier);
				setState(837);
				match(T__5);
				setState(838);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(Case);
				setState(840);
				constantExpression();
				setState(841);
				match(T__5);
				setState(842);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				match(T__4);
				setState(845);
				match(T__5);
				setState(846);
				statement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(T__6);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << BigInt) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << For) | (1L << Int) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
				{
				setState(850);
				blockItemList();
				}
			}

			setState(853);
			match(T__7);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(855);
				blockItem();
				}
				}
				setState(858); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << BigInt) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << For) | (1L << Int) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0) );
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

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_blockItem);
		try {
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				declaration();
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
		enterRule(_localctx, 126, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
				{
				setState(864);
				expression();
				}
			}

			setState(867);
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
		public TerminalNode If() { return getToken(LucasGrammarParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(LucasGrammarParser.Else, 0); }
		public TerminalNode Switch() { return getToken(LucasGrammarParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_selectionStatement);
		try {
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				match(If);
				setState(870);
				match(LeftParen);
				setState(871);
				expression();
				setState(872);
				match(RightParen);
				setState(873);
				statement();
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(874);
					match(Else);
					setState(875);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				match(Switch);
				setState(879);
				match(LeftParen);
				setState(880);
				expression();
				setState(881);
				match(RightParen);
				setState(882);
				statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(LucasGrammarParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode For() { return getToken(LucasGrammarParser.For, 0); }
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
		enterRule(_localctx, 130, RULE_iterationStatement);
		try {
			setState(898);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				match(While);
				setState(887);
				match(LeftParen);
				setState(888);
				expression();
				setState(889);
				match(RightParen);
				setState(890);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(For);
				setState(893);
				match(LeftParen);
				setState(894);
				forCondition();
				setState(895);
				match(RightParen);
				setState(896);
				statement();
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
		enterRule(_localctx, 132, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(900);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
					{
					setState(901);
					expression();
					}
				}

				}
				break;
			}
			setState(906);
			match(SemiColon);
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
				{
				setState(907);
				forExpression();
				}
			}

			setState(910);
			match(SemiColon);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
				{
				setState(911);
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
		enterRule(_localctx, 134, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			declarationSpecifiers();
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__20 - 20)) | (1L << (T__21 - 20)) | (1L << (T__22 - 20)) | (1L << (T__23 - 20)) | (1L << (T__24 - 20)) | (1L << (Identifier - 20)) | (1L << (Mult - 20)) | (1L << (Exponent - 20)) | (1L << (LeftParen - 20)))) != 0)) {
				{
				setState(915);
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
		enterRule(_localctx, 136, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			assignmentExpression();
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(919);
				match(Comma);
				setState(920);
				assignmentExpression();
				}
				}
				setState(925);
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
		enterRule(_localctx, 138, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				{
				}
				break;
			case Break:
			case Continue:
				{
				setState(927);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(928);
					match(Identifier);
					}
				}

				}
				break;
			case Return:
				{
				setState(931);
				match(Return);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << Identifier) | (1L << Literal) | (1L << Add) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
					{
					setState(932);
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(937);
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
		enterRule(_localctx, 140, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon) {
				{
				setState(939);
				translationUnit();
				}
			}

			setState(942);
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
		enterRule(_localctx, 142, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(944);
				externalDeclaration();
				}
				}
				setState(947); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon );
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
		enterRule(_localctx, 144, RULE_externalDeclaration);
		try {
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Begin:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				functionDefinition();
				}
				break;
			case Decl:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				functionDeclaration();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__28:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				declaration();
				}
				break;
			case SemiColon:
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
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
		enterRule(_localctx, 146, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(Decl);
			setState(956);
			match(Function);
			setState(957);
			match(Identifier);
			setState(958);
			match(LeftParen);
			setState(959);
			parameterTypeList();
			setState(960);
			match(RightParen);
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(961);
				match(Arrow);
				setState(962);
				match(LeftParen);
				setState(963);
				parameterList();
				setState(964);
				match(RightParen);
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
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode End() { return getToken(LucasGrammarParser.End, 0); }
		public TerminalNode Arrow() { return getToken(LucasGrammarParser.Arrow, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(Begin);
			setState(969);
			match(Function);
			setState(970);
			match(Identifier);
			setState(971);
			match(LeftParen);
			setState(972);
			parameterTypeList();
			setState(973);
			match(RightParen);
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(974);
				match(Arrow);
				setState(975);
				match(LeftParen);
				setState(976);
				parameterList();
				setState(977);
				match(RightParen);
				}
			}

			setState(981);
			compoundStatement();
			setState(982);
			match(End);
			setState(983);
			match(Function);
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(984);
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
		enterRule(_localctx, 150, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(987);
				declaration();
				}
				}
				setState(990); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
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
		case 50:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3j\u03e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\6\2\u009e\n\2\r\2\16\2\u009f\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\u00a8\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00bc\n\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\7\4\u00c8\n\4\f\4\16\4\u00cb\13\4\3\5\3\5\5\5\u00cf"+
		"\n\5\3\5\3\5\3\5\3\6\3\6\5\6\u00d6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00de"+
		"\n\6\3\6\3\6\5\6\u00e2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ea\n\6\3\6\3"+
		"\6\3\6\3\6\7\6\u00f0\n\6\f\6\16\6\u00f3\13\6\3\7\3\7\3\7\7\7\u00f8\n\7"+
		"\f\7\16\7\u00fb\13\7\3\b\7\b\u00fe\n\b\f\b\16\b\u0101\13\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010e\n\b\3\t\3\t\3\n\5\n\u0113\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u011c\n\n\r\n\16\n\u011d\5\n\u0120"+
		"\n\n\3\13\3\13\3\13\7\13\u0125\n\13\f\13\16\13\u0128\13\13\3\f\3\f\3\f"+
		"\7\f\u012d\n\f\f\f\16\f\u0130\13\f\3\r\3\r\3\r\7\r\u0135\n\r\f\r\16\r"+
		"\u0138\13\r\3\16\3\16\3\16\7\16\u013d\n\16\f\16\16\16\u0140\13\16\3\17"+
		"\3\17\3\17\7\17\u0145\n\17\f\17\16\17\u0148\13\17\3\20\3\20\3\20\7\20"+
		"\u014d\n\20\f\20\16\20\u0150\13\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21"+
		"\u0158\n\21\r\21\16\21\u0159\5\21\u015c\n\21\3\22\3\22\3\23\3\23\3\23"+
		"\7\23\u0163\n\23\f\23\16\23\u0166\13\23\3\24\3\24\3\25\3\25\5\25\u016c"+
		"\n\25\3\25\3\25\3\25\5\25\u0171\n\25\3\26\6\26\u0174\n\26\r\26\16\26\u0175"+
		"\3\27\6\27\u0179\n\27\r\27\16\27\u017a\3\30\3\30\5\30\u017f\n\30\3\31"+
		"\3\31\3\31\7\31\u0184\n\31\f\31\16\31\u0187\13\31\3\32\3\32\3\32\5\32"+
		"\u018c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0194\n\33\3\34\3\34\5"+
		"\34\u0198\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01a1\n\34\3\35"+
		"\3\35\3\36\6\36\u01a6\n\36\r\36\16\36\u01a7\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u01b2\n\37\3 \3 \5 \u01b6\n \3 \5 \u01b9\n \3!\3!\3"+
		"!\7!\u01be\n!\f!\16!\u01c1\13!\3\"\3\"\5\"\u01c5\n\"\3\"\3\"\5\"\u01c9"+
		"\n\"\3#\3#\3$\5$\u01ce\n$\3$\3$\7$\u01d2\n$\f$\16$\u01d5\13$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\6%\u01e0\n%\r%\16%\u01e1\3%\3%\3%\3%\3%\3%\3%\3%\5"+
		"%\u01ec\n%\3%\3%\3%\5%\u01f1\n%\3%\5%\u01f4\n%\3%\3%\3%\3%\3%\5%\u01fb"+
		"\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u020a\n%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u0216\n%\3%\7%\u0219\n%\f%\16%\u021c\13%\3&\3&\3\'"+
		"\3\'\3\'\6\'\u0223\n\'\r\'\16\'\u0224\3\'\3\'\5\'\u0229\n\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\5)\u0233\n)\3)\3)\5)\u0237\n)\7)\u0239\n)\f)\16)\u023c\13"+
		")\3*\3*\3*\5*\u0241\n*\3*\5*\u0244\n*\3+\3+\3+\3+\3+\7+\u024b\n+\f+\16"+
		"+\u024e\13+\3,\3,\5,\u0252\n,\6,\u0254\n,\r,\16,\u0255\3-\6-\u0259\n-"+
		"\r-\16-\u025a\3.\3.\3.\5.\u0260\n.\3/\3/\3/\7/\u0265\n/\f/\16/\u0268\13"+
		"/\3\60\3\60\3\60\3\60\3\60\5\60\u026f\n\60\5\60\u0271\n\60\3\61\3\61\3"+
		"\61\7\61\u0276\n\61\f\61\16\61\u0279\13\61\3\62\3\62\5\62\u027d\n\62\3"+
		"\63\3\63\5\63\u0281\n\63\3\63\3\63\7\63\u0285\n\63\f\63\16\63\u0288\13"+
		"\63\5\63\u028a\n\63\3\64\3\64\3\64\3\64\3\64\7\64\u0291\n\64\f\64\16\64"+
		"\u0294\13\64\3\64\3\64\5\64\u0298\n\64\3\64\5\64\u029b\n\64\3\64\3\64"+
		"\3\64\3\64\5\64\u02a1\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\5\64\u02b1\n\64\3\64\3\64\7\64\u02b5\n\64\f"+
		"\64\16\64\u02b8\13\64\5\64\u02ba\n\64\3\64\3\64\3\64\5\64\u02bf\n\64\3"+
		"\64\5\64\u02c2\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u02c9\n\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u02dc\n\64\3\64\3\64\7\64\u02e0\n\64\f\64\16\64\u02e3\13\64"+
		"\7\64\u02e5\n\64\f\64\16\64\u02e8\13\64\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\5\66\u02f0\n\66\3\66\3\66\5\66\u02f4\n\66\3\67\5\67\u02f7\n\67\3\67\3"+
		"\67\3\67\5\67\u02fc\n\67\3\67\7\67\u02ff\n\67\f\67\16\67\u0302\13\67\3"+
		"8\38\38\39\69\u0308\n9\r9\169\u0309\3:\3:\3:\3:\3:\3:\5:\u0312\n:\3;\3"+
		";\3;\3;\3;\6;\u0319\n;\r;\16;\u031a\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\7<\u032c\n<\f<\16<\u032f\13<\5<\u0331\n<\3<\3<\3<\3<\7<\u0337"+
		"\n<\f<\16<\u033a\13<\5<\u033c\n<\7<\u033e\n<\f<\16<\u0341\13<\3<\3<\5"+
		"<\u0345\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0352\n=\3>\3>\5>\u0356"+
		"\n>\3>\3>\3?\6?\u035b\n?\r?\16?\u035c\3@\3@\5@\u0361\n@\3A\5A\u0364\n"+
		"A\3A\3A\3B\3B\3B\3B\3B\3B\3B\5B\u036f\nB\3B\3B\3B\3B\3B\3B\5B\u0377\n"+
		"B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0385\nC\3D\3D\5D\u0389\nD\5"+
		"D\u038b\nD\3D\3D\5D\u038f\nD\3D\3D\5D\u0393\nD\3E\3E\5E\u0397\nE\3F\3"+
		"F\3F\7F\u039c\nF\fF\16F\u039f\13F\3G\3G\3G\5G\u03a4\nG\3G\3G\5G\u03a8"+
		"\nG\5G\u03aa\nG\3G\3G\3H\5H\u03af\nH\3H\3H\3I\6I\u03b4\nI\rI\16I\u03b5"+
		"\3J\3J\3J\3J\5J\u03bc\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03c9\nK"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u03d6\nL\3L\3L\3L\3L\5L\u03dc\nL"+
		"\3M\6M\u03df\nM\rM\16M\u03e0\3M\2\4HfN\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\2\25\3\2PQ\3\2YZ\4\2\13\13YZ\3\2\13\f\5\2@BEEOO\3\2BD\3\2@A\4\2GHKL\3"+
		"\2IJ\5\2\r\16]]`b\t\2\17\21$$--//\61\61\66\66::\3\2\22\23\3\2\26\33\4"+
		"\2STXX\3\2ST\4\2BBFF\4\2\34\34  \3\2!\"\4\2%%\60\60\2\u043a\2\u00bb\3"+
		"\2\2\2\4\u00bd\3\2\2\2\6\u00c4\3\2\2\2\b\u00ce\3\2\2\2\n\u00e1\3\2\2\2"+
		"\f\u00f4\3\2\2\2\16\u00ff\3\2\2\2\20\u010f\3\2\2\2\22\u011f\3\2\2\2\24"+
		"\u0121\3\2\2\2\26\u0129\3\2\2\2\30\u0131\3\2\2\2\32\u0139\3\2\2\2\34\u0141"+
		"\3\2\2\2\36\u0149\3\2\2\2 \u015b\3\2\2\2\"\u015d\3\2\2\2$\u015f\3\2\2"+
		"\2&\u0167\3\2\2\2(\u0170\3\2\2\2*\u0173\3\2\2\2,\u0178\3\2\2\2.\u017e"+
		"\3\2\2\2\60\u0180\3\2\2\2\62\u0188\3\2\2\2\64\u0193\3\2\2\2\66\u01a0\3"+
		"\2\2\28\u01a2\3\2\2\2:\u01a5\3\2\2\2<\u01b1\3\2\2\2>\u01b5\3\2\2\2@\u01ba"+
		"\3\2\2\2B\u01c8\3\2\2\2D\u01ca\3\2\2\2F\u01cd\3\2\2\2H\u01eb\3\2\2\2J"+
		"\u021d\3\2\2\2L\u0228\3\2\2\2N\u022a\3\2\2\2P\u0232\3\2\2\2R\u023d\3\2"+
		"\2\2T\u024c\3\2\2\2V\u0253\3\2\2\2X\u0258\3\2\2\2Z\u025c\3\2\2\2\\\u0261"+
		"\3\2\2\2^\u0270\3\2\2\2`\u0272\3\2\2\2b\u027a\3\2\2\2d\u0289\3\2\2\2f"+
		"\u02b9\3\2\2\2h\u02e9\3\2\2\2j\u02f3\3\2\2\2l\u02f6\3\2\2\2n\u0303\3\2"+
		"\2\2p\u0307\3\2\2\2r\u0311\3\2\2\2t\u0313\3\2\2\2v\u0344\3\2\2\2x\u0351"+
		"\3\2\2\2z\u0353\3\2\2\2|\u035a\3\2\2\2~\u0360\3\2\2\2\u0080\u0363\3\2"+
		"\2\2\u0082\u0376\3\2\2\2\u0084\u0384\3\2\2\2\u0086\u038a\3\2\2\2\u0088"+
		"\u0394\3\2\2\2\u008a\u0398\3\2\2\2\u008c\u03a9\3\2\2\2\u008e\u03ae\3\2"+
		"\2\2\u0090\u03b3\3\2\2\2\u0092\u03bb\3\2\2\2\u0094\u03bd\3\2\2\2\u0096"+
		"\u03ca\3\2\2\2\u0098\u03de\3\2\2\2\u009a\u00bc\7>\2\2\u009b\u00bc\7?\2"+
		"\2\u009c\u009e\7g\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00bc\3\2\2\2\u00a1\u00a2\7S\2\2\u00a2"+
		"\u00a3\5$\23\2\u00a3\u00a4\7T\2\2\u00a4\u00bc\3\2\2\2\u00a5\u00bc\5\4"+
		"\3\2\u00a6\u00a8\7\3\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7S\2\2\u00aa\u00ab\5z>\2\u00ab\u00ac\7T\2\2"+
		"\u00ac\u00bc\3\2\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\7S\2\2\u00af\u00b0"+
		"\5\16\b\2\u00b0\u00b1\7X\2\2\u00b1\u00b2\5b\62\2\u00b2\u00b3\7T\2\2\u00b3"+
		"\u00bc\3\2\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\7S\2\2\u00b6\u00b7\5b\62"+
		"\2\u00b7\u00b8\7X\2\2\u00b8\u00b9\5\16\b\2\u00b9\u00ba\7T\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb\u009a\3\2\2\2\u00bb\u009b\3\2\2\2\u00bb\u009d\3\2\2\2\u00bb"+
		"\u00a1\3\2\2\2\u00bb\u00a5\3\2\2\2\u00bb\u00a7\3\2\2\2\u00bb\u00ad\3\2"+
		"\2\2\u00bb\u00b4\3\2\2\2\u00bc\3\3\2\2\2\u00bd\u00be\7\6\2\2\u00be\u00bf"+
		"\7S\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1\7X\2\2\u00c1\u00c2\5\6\4\2\u00c2"+
		"\u00c3\7T\2\2\u00c3\5\3\2\2\2\u00c4\u00c9\5\b\5\2\u00c5\u00c6\7X\2\2\u00c6"+
		"\u00c8\5\b\5\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\7\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf"+
		"\5b\62\2\u00cd\u00cf\7\7\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\5 \21\2\u00d2\t\3\2\2\2"+
		"\u00d3\u00e2\5\2\2\2\u00d4\u00d6\7\3\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7S\2\2\u00d8\u00d9\5b\62\2\u00d9"+
		"\u00da\7T\2\2\u00da\u00db\7\t\2\2\u00db\u00dd\5l\67\2\u00dc\u00de\7X\2"+
		"\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\7\n\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e2"+
		"\u00f1\3\2\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\5$\23\2\u00e5\u00e6\7V\2"+
		"\2\u00e6\u00f0\3\2\2\2\u00e7\u00e9\7S\2\2\u00e8\u00ea\5\f\7\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f0\7T\2\2\u00ec"+
		"\u00ed\t\2\2\2\u00ed\u00f0\7>\2\2\u00ee\u00f0\t\3\2\2\u00ef\u00e3\3\2"+
		"\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\13\3\2\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f4\u00f9\5 \21\2\u00f5\u00f6\7X\2\2\u00f6\u00f8"+
		"\5 \21\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\r\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\t\4\2\2"+
		"\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u010d\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u010e\5\n\6\2\u0103"+
		"\u0104\5\20\t\2\u0104\u0105\5\22\n\2\u0105\u010e\3\2\2\2\u0106\u0107\t"+
		"\5\2\2\u0107\u0108\7S\2\2\u0108\u0109\5b\62\2\u0109\u010a\7T\2\2\u010a"+
		"\u010e\3\2\2\2\u010b\u010c\7M\2\2\u010c\u010e\7>\2\2\u010d\u0102\3\2\2"+
		"\2\u010d\u0103\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u010b\3\2\2\2\u010e\17"+
		"\3\2\2\2\u010f\u0110\t\6\2\2\u0110\21\3\2\2\2\u0111\u0113\7\3\2\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7S"+
		"\2\2\u0115\u0116\5b\62\2\u0116\u0117\7T\2\2\u0117\u0118\5\22\n\2\u0118"+
		"\u0120\3\2\2\2\u0119\u0120\5\16\b\2\u011a\u011c\7h\2\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u0112\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011b\3\2"+
		"\2\2\u0120\23\3\2\2\2\u0121\u0126\5\22\n\2\u0122\u0123\t\7\2\2\u0123\u0125"+
		"\5\22\n\2\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2"+
		"\u0126\u0127\3\2\2\2\u0127\25\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012e"+
		"\5\24\13\2\u012a\u012b\t\b\2\2\u012b\u012d\5\24\13\2\u012c\u012a\3\2\2"+
		"\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\27"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0136\5\26\f\2\u0132\u0133\t\t\2\2"+
		"\u0133\u0135\5\26\f\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\31\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013e\5\30\r\2\u013a\u013b\t\n\2\2\u013b\u013d\5\30\r\2\u013c\u013a\3"+
		"\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\33\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0146\5\32\16\2\u0142\u0143\7M\2"+
		"\2\u0143\u0145\5\32\16\2\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\35\3\2\2\2\u0148\u0146\3\2\2"+
		"\2\u0149\u014e\5\34\17\2\u014a\u014b\7N\2\2\u014b\u014d\5\34\17\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\37\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u015c\5\36\20\2\u0152"+
		"\u0153\5\16\b\2\u0153\u0154\5\"\22\2\u0154\u0155\5 \21\2\u0155\u015c\3"+
		"\2\2\2\u0156\u0158\7h\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0151\3\2"+
		"\2\2\u015b\u0152\3\2\2\2\u015b\u0157\3\2\2\2\u015c!\3\2\2\2\u015d\u015e"+
		"\t\13\2\2\u015e#\3\2\2\2\u015f\u0164\5 \21\2\u0160\u0161\7X\2\2\u0161"+
		"\u0163\5 \21\2\u0162\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165%\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168"+
		"\5\36\20\2\u0168\'\3\2\2\2\u0169\u016b\5*\26\2\u016a\u016c\5\60\31\2\u016b"+
		"\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7W"+
		"\2\2\u016e\u0171\3\2\2\2\u016f\u0171\5t;\2\u0170\u0169\3\2\2\2\u0170\u016f"+
		"\3\2\2\2\u0171)\3\2\2\2\u0172\u0174\5.\30\2\u0173\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176+\3\2\2\2"+
		"\u0177\u0179\5.\30\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b-\3\2\2\2\u017c\u017f\5\64\33\2\u017d"+
		"\u017f\5D#\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f/\3\2\2\2\u0180"+
		"\u0185\5\62\32\2\u0181\u0182\7X\2\2\u0182\u0184\5\62\32\2\u0183\u0181"+
		"\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\61\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018b\5F$\2\u0189\u018a\7]\2\2\u018a"+
		"\u018c\5j\66\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\63\3\2\2"+
		"\2\u018d\u0194\t\f\2\2\u018e\u018f\5\66\34\2\u018f\u0190\7i\2\2\u0190"+
		"\u0191\7j\2\2\u0191\u0194\3\2\2\2\u0192\u0194\5h\65\2\u0193\u018d\3\2"+
		"\2\2\u0193\u018e\3\2\2\2\u0193\u0192\3\2\2\2\u0194\65\3\2\2\2\u0195\u0197"+
		"\58\35\2\u0196\u0198\7>\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\7\t\2\2\u019a\u019b\5:\36\2\u019b\u019c\7\n"+
		"\2\2\u019c\u01a1\3\2\2\2\u019d\u019e\58\35\2\u019e\u019f\7>\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u0195\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1\67\3\2\2"+
		"\2\u01a2\u01a3\t\r\2\2\u01a39\3\2\2\2\u01a4\u01a6\5<\37\2\u01a5\u01a4"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		";\3\2\2\2\u01a9\u01aa\5> \2\u01aa\u01ab\5@!\2\u01ab\u01ac\7W\2\2\u01ac"+
		"\u01b2\3\2\2\2\u01ad\u01ae\5> \2\u01ae\u01af\7W\2\2\u01af\u01b2\3\2\2"+
		"\2\u01b0\u01b2\5t;\2\u01b1\u01a9\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01b0"+
		"\3\2\2\2\u01b2=\3\2\2\2\u01b3\u01b6\5\64\33\2\u01b4\u01b6\5D#\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b9\5>"+
		" \2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9?\3\2\2\2\u01ba\u01bf"+
		"\5B\"\2\u01bb\u01bc\7X\2\2\u01bc\u01be\5B\"\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0A\3\2\2\2"+
		"\u01c1\u01bf\3\2\2\2\u01c2\u01c9\5F$\2\u01c3\u01c5\5F$\2\u01c4\u01c3\3"+
		"\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\b\2\2\u01c7"+
		"\u01c9\5&\24\2\u01c8\u01c2\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c9C\3\2\2\2"+
		"\u01ca\u01cb\7\24\2\2\u01cbE\3\2\2\2\u01cc\u01ce\5V,\2\u01cd\u01cc\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d3\5H%\2\u01d0\u01d2"+
		"\5L\'\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4G\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\b%\1\2\u01d7"+
		"\u01ec\7>\2\2\u01d8\u01d9\7S\2\2\u01d9\u01da\5F$\2\u01da\u01db\7T\2\2"+
		"\u01db\u01ec\3\2\2\2\u01dc\u01dd\7>\2\2\u01dd\u01df\7\b\2\2\u01de\u01e0"+
		"\7h\2\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01ec\3\2\2\2\u01e3\u01e4\5J&\2\u01e4\u01e5\7>\2"+
		"\2\u01e5\u01ec\3\2\2\2\u01e6\u01e7\7S\2\2\u01e7\u01e8\5J&\2\u01e8\u01e9"+
		"\5F$\2\u01e9\u01ea\7T\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01d6\3\2\2\2\u01eb"+
		"\u01d8\3\2\2\2\u01eb\u01dc\3\2\2\2\u01eb\u01e3\3\2\2\2\u01eb\u01e6\3\2"+
		"\2\2\u01ec\u021a\3\2\2\2\u01ed\u01ee\f\13\2\2\u01ee\u01f0\7U\2\2\u01ef"+
		"\u01f1\5X-\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2"+
		"\2\u01f2\u01f4\5 \21\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5"+
		"\3\2\2\2\u01f5\u0219\7V\2\2\u01f6\u01f7\f\n\2\2\u01f7\u01f8\7U\2\2\u01f8"+
		"\u01fa\7\25\2\2\u01f9\u01fb\5X-\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\5 \21\2\u01fd\u01fe\7V\2\2\u01fe"+
		"\u0219\3\2\2\2\u01ff\u0200\f\t\2\2\u0200\u0201\7U\2\2\u0201\u0202\5X-"+
		"\2\u0202\u0203\7\25\2\2\u0203\u0204\5 \21\2\u0204\u0205\7V\2\2\u0205\u0219"+
		"\3\2\2\2\u0206\u0207\f\b\2\2\u0207\u0209\7U\2\2\u0208\u020a\5X-\2\u0209"+
		"\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\7B"+
		"\2\2\u020c\u0219\7V\2\2\u020d\u020e\f\7\2\2\u020e\u020f\7S\2\2\u020f\u0210"+
		"\5Z.\2\u0210\u0211\7T\2\2\u0211\u0219\3\2\2\2\u0212\u0213\f\6\2\2\u0213"+
		"\u0215\7S\2\2\u0214\u0216\5`\61\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0219\7T\2\2\u0218\u01ed\3\2\2\2\u0218"+
		"\u01f6\3\2\2\2\u0218\u01ff\3\2\2\2\u0218\u0206\3\2\2\2\u0218\u020d\3\2"+
		"\2\2\u0218\u0212\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021bI\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\t\16\2\2"+
		"\u021eK\3\2\2\2\u021f\u0220\7\34\2\2\u0220\u0222\7S\2\2\u0221\u0223\7"+
		"g\2\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0229\7T\2\2\u0227\u0229\5N("+
		"\2\u0228\u021f\3\2\2\2\u0228\u0227\3\2\2\2\u0229M\3\2\2\2\u022a\u022b"+
		"\7\35\2\2\u022b\u022c\7S\2\2\u022c\u022d\7S\2\2\u022d\u022e\5P)\2\u022e"+
		"\u022f\7T\2\2\u022f\u0230\7T\2\2\u0230O\3\2\2\2\u0231\u0233\5R*\2\u0232"+
		"\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u023a\3\2\2\2\u0234\u0236\7X"+
		"\2\2\u0235\u0237\5R*\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239"+
		"\3\2\2\2\u0238\u0234\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023bQ\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u0243\n\17\2\2"+
		"\u023e\u0240\7S\2\2\u023f\u0241\5\f\7\2\u0240\u023f\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\7T\2\2\u0243\u023e\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244S\3\2\2\2\u0245\u024b\n\20\2\2\u0246\u0247\7S\2\2"+
		"\u0247\u0248\5T+\2\u0248\u0249\7T\2\2\u0249\u024b\3\2\2\2\u024a\u0245"+
		"\3\2\2\2\u024a\u0246\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024dU\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0251\t\21\2\2"+
		"\u0250\u0252\5X-\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254"+
		"\3\2\2\2\u0253\u024f\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256W\3\2\2\2\u0257\u0259\5D#\2\u0258\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025bY\3\2\2\2"+
		"\u025c\u025f\5\\/\2\u025d\u025e\7X\2\2\u025e\u0260\7\36\2\2\u025f\u025d"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260[\3\2\2\2\u0261\u0266\5^\60\2\u0262"+
		"\u0263\7X\2\2\u0263\u0265\5^\60\2\u0264\u0262\3\2\2\2\u0265\u0268\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267]\3\2\2\2\u0268\u0266"+
		"\3\2\2\2\u0269\u026a\5*\26\2\u026a\u026b\5F$\2\u026b\u0271\3\2\2\2\u026c"+
		"\u026e\5,\27\2\u026d\u026f\5d\63\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2"+
		"\2\2\u026f\u0271\3\2\2\2\u0270\u0269\3\2\2\2\u0270\u026c\3\2\2\2\u0271"+
		"_\3\2\2\2\u0272\u0277\7>\2\2\u0273\u0274\7X\2\2\u0274\u0276\7>\2\2\u0275"+
		"\u0273\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2"+
		"\2\2\u0278a\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027c\5> \2\u027b\u027d"+
		"\5d\63\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027dc\3\2\2\2\u027e"+
		"\u028a\5V,\2\u027f\u0281\5V,\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2"+
		"\u0281\u0282\3\2\2\2\u0282\u0286\5f\64\2\u0283\u0285\5L\'\2\u0284\u0283"+
		"\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u027e\3\2\2\2\u0289\u0280\3\2"+
		"\2\2\u028ae\3\2\2\2\u028b\u028c\b\64\1\2\u028c\u028d\7S\2\2\u028d\u028e"+
		"\5d\63\2\u028e\u0292\7T\2\2\u028f\u0291\5L\'\2\u0290\u028f\3\2\2\2\u0291"+
		"\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u02ba\3\2"+
		"\2\2\u0294\u0292\3\2\2\2\u0295\u0297\7U\2\2\u0296\u0298\5X-\2\u0297\u0296"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u029b\5 \21\2\u029a"+
		"\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02ba\7V"+
		"\2\2\u029d\u029e\7U\2\2\u029e\u02a0\7\25\2\2\u029f\u02a1\5X-\2\u02a0\u029f"+
		"\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\5 \21\2\u02a3"+
		"\u02a4\7V\2\2\u02a4\u02ba\3\2\2\2\u02a5\u02a6\7U\2\2\u02a6\u02a7\5X-\2"+
		"\u02a7\u02a8\7\25\2\2\u02a8\u02a9\5 \21\2\u02a9\u02aa\7V\2\2\u02aa\u02ba"+
		"\3\2\2\2\u02ab\u02ac\7U\2\2\u02ac\u02ad\7B\2\2\u02ad\u02ba\7V\2\2\u02ae"+
		"\u02b0\7S\2\2\u02af\u02b1\5Z.\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2"+
		"\2\u02b1\u02b2\3\2\2\2\u02b2\u02b6\7T\2\2\u02b3\u02b5\5L\'\2\u02b4\u02b3"+
		"\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u028b\3\2\2\2\u02b9\u0295\3\2"+
		"\2\2\u02b9\u029d\3\2\2\2\u02b9\u02a5\3\2\2\2\u02b9\u02ab\3\2\2\2\u02b9"+
		"\u02ae\3\2\2\2\u02ba\u02e6\3\2\2\2\u02bb\u02bc\f\7\2\2\u02bc\u02be\7U"+
		"\2\2\u02bd\u02bf\5X-\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1"+
		"\3\2\2\2\u02c0\u02c2\5 \21\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02e5\7V\2\2\u02c4\u02c5\f\6\2\2\u02c5\u02c6\7U\2"+
		"\2\u02c6\u02c8\7\25\2\2\u02c7\u02c9\5X-\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\5 \21\2\u02cb\u02cc\7V\2\2\u02cc"+
		"\u02e5\3\2\2\2\u02cd\u02ce\f\5\2\2\u02ce\u02cf\7U\2\2\u02cf\u02d0\5X-"+
		"\2\u02d0\u02d1\7\25\2\2\u02d1\u02d2\5 \21\2\u02d2\u02d3\7V\2\2\u02d3\u02e5"+
		"\3\2\2\2\u02d4\u02d5\f\4\2\2\u02d5\u02d6\7U\2\2\u02d6\u02d7\7B\2\2\u02d7"+
		"\u02e5\7V\2\2\u02d8\u02d9\f\3\2\2\u02d9\u02db\7S\2\2\u02da\u02dc\5Z.\2"+
		"\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e1"+
		"\7T\2\2\u02de\u02e0\5L\'\2\u02df\u02de\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1"+
		"\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2"+
		"\2\2\u02e4\u02bb\3\2\2\2\u02e4\u02c4\3\2\2\2\u02e4\u02cd\3\2\2\2\u02e4"+
		"\u02d4\3\2\2\2\u02e4\u02d8\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2"+
		"\2\2\u02e6\u02e7\3\2\2\2\u02e7g\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02ea"+
		"\7>\2\2\u02eai\3\2\2\2\u02eb\u02f4\5 \21\2\u02ec\u02ed\7\t\2\2\u02ed\u02ef"+
		"\5l\67\2\u02ee\u02f0\7X\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\7\n\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02eb\3\2"+
		"\2\2\u02f3\u02ec\3\2\2\2\u02f4k\3\2\2\2\u02f5\u02f7\5n8\2\u02f6\u02f5"+
		"\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u0300\5j\66\2\u02f9"+
		"\u02fb\7X\2\2\u02fa\u02fc\5n8\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2"+
		"\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\5j\66\2\u02fe\u02f9\3\2\2\2\u02ff\u0302"+
		"\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301m\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0303\u0304\5p9\2\u0304\u0305\7]\2\2\u0305o\3\2\2\2\u0306"+
		"\u0308\5r:\2\u0307\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0307\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030aq\3\2\2\2\u030b\u030c\7U\2\2\u030c\u030d\5"+
		"&\24\2\u030d\u030e\7V\2\2\u030e\u0312\3\2\2\2\u030f\u0310\7P\2\2\u0310"+
		"\u0312\7>\2\2\u0311\u030b\3\2\2\2\u0311\u030f\3\2\2\2\u0312s\3\2\2\2\u0313"+
		"\u0314\7\37\2\2\u0314\u0315\7S\2\2\u0315\u0316\5&\24\2\u0316\u0318\7X"+
		"\2\2\u0317\u0319\7g\2\2\u0318\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\7T"+
		"\2\2\u031d\u031e\7W\2\2\u031eu\3\2\2\2\u031f\u0345\5x=\2\u0320\u0345\5"+
		"z>\2\u0321\u0345\5\u0080A\2\u0322\u0345\5\u0082B\2\u0323\u0345\5\u0084"+
		"C\2\u0324\u0345\5\u008cG\2\u0325\u0326\t\22\2\2\u0326\u0327\t\23\2\2\u0327"+
		"\u0330\7S\2\2\u0328\u032d\5\36\20\2\u0329\u032a\7X\2\2\u032a\u032c\5\36"+
		"\20\2\u032b\u0329\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0328\3\2"+
		"\2\2\u0330\u0331\3\2\2\2\u0331\u033f\3\2\2\2\u0332\u033b\7\b\2\2\u0333"+
		"\u0338\5\36\20\2\u0334\u0335\7X\2\2\u0335\u0337\5\36\20\2\u0336\u0334"+
		"\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u0333\3\2\2\2\u033b\u033c\3\2"+
		"\2\2\u033c\u033e\3\2\2\2\u033d\u0332\3\2\2\2\u033e\u0341\3\2\2\2\u033f"+
		"\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341\u033f\3\2"+
		"\2\2\u0342\u0343\7T\2\2\u0343\u0345\7W\2\2\u0344\u031f\3\2\2\2\u0344\u0320"+
		"\3\2\2\2\u0344\u0321\3\2\2\2\u0344\u0322\3\2\2\2\u0344\u0323\3\2\2\2\u0344"+
		"\u0324\3\2\2\2\u0344\u0325\3\2\2\2\u0345w\3\2\2\2\u0346\u0347\7>\2\2\u0347"+
		"\u0348\7\b\2\2\u0348\u0352\5v<\2\u0349\u034a\7,\2\2\u034a\u034b\5&\24"+
		"\2\u034b\u034c\7\b\2\2\u034c\u034d\5v<\2\u034d\u0352\3\2\2\2\u034e\u034f"+
		"\7\7\2\2\u034f\u0350\7\b\2\2\u0350\u0352\5v<\2\u0351\u0346\3\2\2\2\u0351"+
		"\u0349\3\2\2\2\u0351\u034e\3\2\2\2\u0352y\3\2\2\2\u0353\u0355\7\t\2\2"+
		"\u0354\u0356\5|?\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357"+
		"\3\2\2\2\u0357\u0358\7\n\2\2\u0358{\3\2\2\2\u0359\u035b\5~@\2\u035a\u0359"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"}\3\2\2\2\u035e\u0361\5v<\2\u035f\u0361\5(\25\2\u0360\u035e\3\2\2\2\u0360"+
		"\u035f\3\2\2\2\u0361\177\3\2\2\2\u0362\u0364\5$\23\2\u0363\u0362\3\2\2"+
		"\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\7W\2\2\u0366\u0081"+
		"\3\2\2\2\u0367\u0368\7\67\2\2\u0368\u0369\7S\2\2\u0369\u036a\5$\23\2\u036a"+
		"\u036b\7T\2\2\u036b\u036e\5v<\2\u036c\u036d\7\63\2\2\u036d\u036f\5v<\2"+
		"\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0377\3\2\2\2\u0370\u0371"+
		"\79\2\2\u0371\u0372\7S\2\2\u0372\u0373\5$\23\2\u0373\u0374\7T\2\2\u0374"+
		"\u0375\5v<\2\u0375\u0377\3\2\2\2\u0376\u0367\3\2\2\2\u0376\u0370\3\2\2"+
		"\2\u0377\u0083\3\2\2\2\u0378\u0379\7;\2\2\u0379\u037a\7S\2\2\u037a\u037b"+
		"\5$\23\2\u037b\u037c\7T\2\2\u037c\u037d\5v<\2\u037d\u0385\3\2\2\2\u037e"+
		"\u037f\7\65\2\2\u037f\u0380\7S\2\2\u0380\u0381\5\u0086D\2\u0381\u0382"+
		"\7T\2\2\u0382\u0383\5v<\2\u0383\u0385\3\2\2\2\u0384\u0378\3\2\2\2\u0384"+
		"\u037e\3\2\2\2\u0385\u0085\3\2\2\2\u0386\u038b\5\u0088E\2\u0387\u0389"+
		"\5$\23\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a"+
		"\u0386\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\7W"+
		"\2\2\u038d\u038f\5\u008aF\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0392\7W\2\2\u0391\u0393\5\u008aF\2\u0392\u0391\3"+
		"\2\2\2\u0392\u0393\3\2\2\2\u0393\u0087\3\2\2\2\u0394\u0396\5*\26\2\u0395"+
		"\u0397\5\60\31\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0089\3"+
		"\2\2\2\u0398\u039d\5 \21\2\u0399\u039a\7X\2\2\u039a\u039c\5 \21\2\u039b"+
		"\u0399\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2"+
		"\2\2\u039e\u008b\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03aa\3\2\2\2\u03a1"+
		"\u03a3\t\24\2\2\u03a2\u03a4\7>\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03aa\3\2\2\2\u03a5\u03a7\78\2\2\u03a6\u03a8\5$\23\2\u03a7"+
		"\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a0\3\2"+
		"\2\2\u03a9\u03a1\3\2\2\2\u03a9\u03a5\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ac\7W\2\2\u03ac\u008d\3\2\2\2\u03ad\u03af\5\u0090I\2\u03ae\u03ad\3"+
		"\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\7\2\2\3\u03b1"+
		"\u008f\3\2\2\2\u03b2\u03b4\5\u0092J\2\u03b3\u03b2\3\2\2\2\u03b4\u03b5"+
		"\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u0091\3\2\2\2\u03b7"+
		"\u03bc\5\u0096L\2\u03b8\u03bc\5\u0094K\2\u03b9\u03bc\5(\25\2\u03ba\u03bc"+
		"\7W\2\2\u03bb\u03b7\3\2\2\2\u03bb\u03b8\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb"+
		"\u03ba\3\2\2\2\u03bc\u0093\3\2\2\2\u03bd\u03be\7&\2\2\u03be\u03bf\7\62"+
		"\2\2\u03bf\u03c0\7>\2\2\u03c0\u03c1\7S\2\2\u03c1\u03c2\5Z.\2\u03c2\u03c8"+
		"\7T\2\2\u03c3\u03c4\7Q\2\2\u03c4\u03c5\7S\2\2\u03c5\u03c6\5\\/\2\u03c6"+
		"\u03c7\7T\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03c3\3\2\2\2\u03c8\u03c9\3\2"+
		"\2\2\u03c9\u0095\3\2\2\2\u03ca\u03cb\7#\2\2\u03cb\u03cc\7\62\2\2\u03cc"+
		"\u03cd\7>\2\2\u03cd\u03ce\7S\2\2\u03ce\u03cf\5Z.\2\u03cf\u03d5\7T\2\2"+
		"\u03d0\u03d1\7Q\2\2\u03d1\u03d2\7S\2\2\u03d2\u03d3\5\\/\2\u03d3\u03d4"+
		"\7T\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03d0\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03d8\5z>\2\u03d8\u03d9\7\64\2\2\u03d9\u03db\7\62"+
		"\2\2\u03da\u03dc\7>\2\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc"+
		"\u0097\3\2\2\2\u03dd\u03df\5(\25\2\u03de\u03dd\3\2\2\2\u03df\u03e0\3\2"+
		"\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u0099\3\2\2\2\u0081"+
		"\u009f\u00a7\u00bb\u00c9\u00ce\u00d5\u00dd\u00e1\u00e9\u00ef\u00f1\u00f9"+
		"\u00ff\u010d\u0112\u011d\u011f\u0126\u012e\u0136\u013e\u0146\u014e\u0159"+
		"\u015b\u0164\u016b\u0170\u0175\u017a\u017e\u0185\u018b\u0193\u0197\u01a0"+
		"\u01a7\u01b1\u01b5\u01b8\u01bf\u01c4\u01c8\u01cd\u01d3\u01e1\u01eb\u01f0"+
		"\u01f3\u01fa\u0209\u0215\u0218\u021a\u0224\u0228\u0232\u0236\u023a\u0240"+
		"\u0243\u024a\u024c\u0251\u0255\u025a\u025f\u0266\u026e\u0270\u0277\u027c"+
		"\u0280\u0286\u0289\u0292\u0297\u029a\u02a0\u02b0\u02b6\u02b9\u02be\u02c1"+
		"\u02c8\u02db\u02e1\u02e4\u02e6\u02ef\u02f3\u02f6\u02fb\u0300\u0309\u0311"+
		"\u031a\u032d\u0330\u0338\u033b\u033f\u0344\u0351\u0355\u035c\u0360\u0363"+
		"\u036e\u0376\u0384\u0388\u038a\u038e\u0392\u0396\u039d\u03a3\u03a7\u03a9"+
		"\u03ae\u03b5\u03bb\u03c8\u03d5\u03db\u03e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}