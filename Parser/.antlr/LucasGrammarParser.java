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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, Begin=50, BigInt=51, Break=52, 
		Decl=53, Expr=54, Public=55, Private=56, TypeOf=57, Vector=58, Case=59, 
		Char=60, Class=61, CharSeq=62, Continue=63, Double=64, Function=65, Else=66, 
		End=67, For=68, Int=69, If=70, Return=71, Switch=72, Void=73, While=74, 
		TE=75, LE=76, Identifier=77, Literal=78, Add=79, Sub=80, Mult=81, Div=82, 
		Mod=83, Tilde=84, Exponent=85, LessThan=86, GreaterThan=87, Equality=88, 
		Inequality=89, LessThanEqual=90, GreaterThanEqual=91, LogicalAnd=92, LogicalOr=93, 
		LogicalNot=94, Dot=95, Arrow=96, ClassSpec=97, LeftParen=98, RightParen=99, 
		LeftBrac=100, RightBrac=101, SemiColon=102, Comma=103, Increment=104, 
		Decrement=105, RightShift=106, LeftShift=107, Assign=108, LeftShiftEqual=109, 
		RightShiftEqual=110, PlusEqual=111, MinusEqual=112, MultEqual=113, Whitespace=114, 
		Newline=115, BlockComment=116, LineComment=117, StringLiteral=118, Digit=119;
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
		RULE_enumSpecifier = 33, RULE_enumeratorList = 34, RULE_enumerator = 35, 
		RULE_enumerationConstant = 36, RULE_atomicTypeSpecifier = 37, RULE_typeQualifier = 38, 
		RULE_functionSpecifier = 39, RULE_alignmentSpecifier = 40, RULE_declarator = 41, 
		RULE_directDeclarator = 42, RULE_vcSpecificModifer = 43, RULE_gccDeclaratorExtension = 44, 
		RULE_gccAttributeSpecifier = 45, RULE_gccAttributeList = 46, RULE_gccAttribute = 47, 
		RULE_nestedParenthesesBlock = 48, RULE_pointer = 49, RULE_typeQualifierList = 50, 
		RULE_parameterTypeList = 51, RULE_parameterList = 52, RULE_parameterDeclaration = 53, 
		RULE_identifierList = 54, RULE_typeName = 55, RULE_abstractDeclarator = 56, 
		RULE_directAbstractDeclarator = 57, RULE_typedefName = 58, RULE_initializer = 59, 
		RULE_initializerList = 60, RULE_designation = 61, RULE_designatorList = 62, 
		RULE_designator = 63, RULE_staticAssertDeclaration = 64, RULE_statement = 65, 
		RULE_labeledStatement = 66, RULE_compoundStatement = 67, RULE_blockItemList = 68, 
		RULE_blockItem = 69, RULE_expressionStatement = 70, RULE_selectionStatement = 71, 
		RULE_iterationStatement = 72, RULE_forCondition = 73, RULE_forDeclaration = 74, 
		RULE_forExpression = 75, RULE_jumpStatement = 76, RULE_compilationUnit = 77, 
		RULE_translationUnit = 78, RULE_externalDeclaration = 79, RULE_functionDefinition = 80, 
		RULE_declarationList = 81;
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
			"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
			"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
			"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
			"vcSpecificModifer", "gccDeclaratorExtension", "gccAttributeSpecifier", 
			"gccAttributeList", "gccAttribute", "nestedParenthesesBlock", "pointer", 
			"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
			"identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator", 
			"typedefName", "initializer", "initializerList", "designation", "designatorList", 
			"designator", "staticAssertDeclaration", "statement", "labeledStatement", 
			"compoundStatement", "blockItemList", "blockItem", "expressionStatement", 
			"selectionStatement", "iterationStatement", "forCondition", "forDeclaration", 
			"forExpression", "jumpStatement", "compilationUnit", "translationUnit", 
			"externalDeclaration", "functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
			"'_Generic'", "'default'", "':'", "'{'", "'}'", "'sizeof'", "'_Alignof'", 
			"'/='", "'%='", "'short'", "'long'", "'float'", "'signed'", "'unsigned'", 
			"'_Bool'", "'_Complex'", "'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", 
			"'struct'", "'union'", "'enum'", "'_Atomic'", "'const'", "'restrict'", 
			"'volatile'", "'inline'", "'_Noreturn'", "'__inline__'", "'__stdcall'", 
			"'__declspec'", "'_Alignas'", "'static'", "'__cdecl'", "'__clrcall'", 
			"'__fastcall'", "'__thiscall'", "'__vectorcall'", "'__asm'", "'__attribute__'", 
			"'...'", "'_Static_assert'", "'__asm__'", "'__volatile__'", "'goto'", 
			"'begin'", "'bigint'", "'break'", "'decl'", "'expr'", "'public'", "'private'", 
			"'typeof'", "'vector'", "'case'", "'char'", "'class'", "'charseq'", "'continue'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Begin", "BigInt", "Break", "Decl", "Expr", "Public", "Private", 
			"TypeOf", "Vector", "Case", "Char", "Class", "CharSeq", "Continue", "Double", 
			"Function", "Else", "End", "For", "Int", "If", "Return", "Switch", "Void", 
			"While", "TE", "LE", "Identifier", "Literal", "Add", "Sub", "Mult", "Div", 
			"Mod", "Tilde", "Exponent", "LessThan", "GreaterThan", "Equality", "Inequality", 
			"LessThanEqual", "GreaterThanEqual", "LogicalAnd", "LogicalOr", "LogicalNot", 
			"Dot", "Arrow", "ClassSpec", "LeftParen", "RightParen", "LeftBrac", "RightBrac", 
			"SemiColon", "Comma", "Increment", "Decrement", "RightShift", "LeftShift", 
			"Assign", "LeftShiftEqual", "RightShiftEqual", "PlusEqual", "MinusEqual", 
			"MultEqual", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"StringLiteral", "Digit"
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(Literal);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					match(StringLiteral);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(LeftParen);
				setState(172);
				expression();
				setState(173);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(176);
					match(T__0);
					}
				}

				setState(179);
				match(LeftParen);
				setState(180);
				compoundStatement();
				setState(181);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				match(T__1);
				setState(184);
				match(LeftParen);
				setState(185);
				unaryExpression();
				setState(186);
				match(Comma);
				setState(187);
				typeName();
				setState(188);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				match(T__2);
				setState(191);
				match(LeftParen);
				setState(192);
				typeName();
				setState(193);
				match(Comma);
				setState(194);
				unaryExpression();
				setState(195);
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
			setState(199);
			match(T__3);
			setState(200);
			match(LeftParen);
			setState(201);
			assignmentExpression();
			setState(202);
			match(Comma);
			setState(203);
			genericAssocList();
			setState(204);
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
			setState(206);
			genericAssociation();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(207);
				match(Comma);
				setState(208);
				genericAssociation();
				}
				}
				setState(213);
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
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
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
			case Char:
			case Double:
			case Int:
			case Void:
			case Identifier:
				{
				setState(214);
				typeName();
				}
				break;
			case T__4:
				{
				setState(215);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(218);
			match(T__5);
			setState(219);
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
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(221);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(222);
					match(T__0);
					}
				}

				setState(225);
				match(LeftParen);
				setState(226);
				typeName();
				setState(227);
				match(RightParen);
				setState(228);
				match(T__6);
				setState(229);
				initializerList();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(230);
					match(Comma);
					}
				}

				setState(233);
				match(T__7);
				}
				break;
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Dot - 95)) | (1L << (Arrow - 95)) | (1L << (LeftParen - 95)) | (1L << (LeftBrac - 95)) | (1L << (Increment - 95)) | (1L << (Decrement - 95)))) != 0)) {
				{
				setState(249);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBrac:
					{
					setState(237);
					match(LeftBrac);
					setState(238);
					expression();
					setState(239);
					match(RightBrac);
					}
					break;
				case LeftParen:
					{
					setState(241);
					match(LeftParen);
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
						{
						setState(242);
						argumentExpressionList();
						}
					}

					setState(245);
					match(RightParen);
					}
					break;
				case Dot:
				case Arrow:
					{
					setState(246);
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==Arrow) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(247);
					match(Identifier);
					}
					break;
				case Increment:
				case Decrement:
					{
					setState(248);
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
				setState(253);
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
			setState(254);
			assignmentExpression();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(255);
				match(Comma);
				setState(256);
				assignmentExpression();
				}
				}
				setState(261);
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
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
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
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(279);
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
				setState(268);
				postfixExpression();
				}
				break;
			case Add:
			case Sub:
			case Mult:
			case Tilde:
			case LogicalNot:
				{
				setState(269);
				unaryOperator();
				setState(270);
				castExpression();
				}
				break;
			case T__8:
			case T__9:
				{
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				match(LeftParen);
				setState(274);
				typeName();
				setState(275);
				match(RightParen);
				}
				break;
			case LogicalAnd:
				{
				setState(277);
				match(LogicalAnd);
				setState(278);
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
			setState(281);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Add - 79)) | (1L << (Sub - 79)) | (1L << (Mult - 79)) | (1L << (Tilde - 79)) | (1L << (LogicalNot - 79)))) != 0)) ) {
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(283);
					match(T__0);
					}
				}

				setState(286);
				match(LeftParen);
				setState(287);
				typeName();
				setState(288);
				match(RightParen);
				setState(289);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(292);
					match(Digit);
					}
					}
					setState(295); 
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
			setState(299);
			castExpression();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Mult - 81)) | (1L << (Div - 81)) | (1L << (Mod - 81)))) != 0)) {
				{
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Mult - 81)) | (1L << (Div - 81)) | (1L << (Mod - 81)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				castExpression();
				}
				}
				setState(306);
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
			setState(307);
			multiplicativeExpression();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Add || _la==Sub) {
				{
				{
				setState(308);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Sub) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				multiplicativeExpression();
				}
				}
				setState(314);
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
			setState(315);
			additiveExpression();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LessThan - 86)) | (1L << (GreaterThan - 86)) | (1L << (LessThanEqual - 86)) | (1L << (GreaterThanEqual - 86)))) != 0)) {
				{
				{
				setState(316);
				_la = _input.LA(1);
				if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LessThan - 86)) | (1L << (GreaterThan - 86)) | (1L << (LessThanEqual - 86)) | (1L << (GreaterThanEqual - 86)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(317);
				additiveExpression();
				}
				}
				setState(322);
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
			setState(323);
			relationalExpression();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equality || _la==Inequality) {
				{
				{
				setState(324);
				_la = _input.LA(1);
				if ( !(_la==Equality || _la==Inequality) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
				relationalExpression();
				}
				}
				setState(330);
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
			setState(331);
			equalityExpression();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalAnd) {
				{
				{
				setState(332);
				match(LogicalAnd);
				setState(333);
				equalityExpression();
				}
				}
				setState(338);
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
			setState(339);
			logicalAndExpression();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOr) {
				{
				{
				setState(340);
				match(LogicalOr);
				setState(341);
				logicalAndExpression();
				}
				}
				setState(346);
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
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				unaryExpression();
				setState(349);
				assignmentOperator();
				setState(350);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(352);
					match(Digit);
					}
					}
					setState(355); 
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
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11 || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Assign - 108)) | (1L << (PlusEqual - 108)) | (1L << (MinusEqual - 108)) | (1L << (MultEqual - 108)))) != 0)) ) {
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
			setState(361);
			assignmentExpression();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(362);
				match(Comma);
				setState(363);
				assignmentExpression();
				}
				}
				setState(368);
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
			setState(369);
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
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
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
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__43:
			case Char:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				declarationSpecifiers();
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Mult - 77)) | (1L << (Exponent - 77)) | (1L << (LeftParen - 77)))) != 0)) {
					{
					setState(372);
					initDeclaratorList();
					}
				}

				setState(375);
				match(SemiColon);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
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
			setState(381); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(380);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(383); 
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
			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(385);
				declarationSpecifier();
				}
				}
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__43) | (1L << Char))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Int - 64)) | (1L << (Void - 64)) | (1L << (Identifier - 64)))) != 0) );
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
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
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
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				typeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				typeQualifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				functionSpecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				alignmentSpecifier();
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
			setState(396);
			initDeclarator();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(397);
				match(Comma);
				setState(398);
				initDeclarator();
				}
				}
				setState(403);
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
			setState(404);
			declarator();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(405);
				match(Assign);
				setState(406);
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
		public TerminalNode Int() { return getToken(LucasGrammarParser.Int, 0); }
		public TerminalNode Double() { return getToken(LucasGrammarParser.Double, 0); }
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
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
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case Char:
			case Double:
			case Int:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				_la = _input.LA(1);
				if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (T__15 - 13)) | (1L << (T__16 - 13)) | (1L << (T__17 - 13)) | (1L << (T__18 - 13)) | (1L << (T__19 - 13)) | (1L << (T__20 - 13)) | (1L << (T__21 - 13)) | (1L << (Char - 13)) | (1L << (Double - 13)) | (1L << (Int - 13)) | (1L << (Void - 13)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(T__0);
				setState(411);
				match(LeftParen);
				setState(412);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(413);
				match(RightParen);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				atomicTypeSpecifier();
				}
				break;
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				structOrUnionSpecifier();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				enumSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				typedefName();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(418);
				match(T__22);
				setState(419);
				match(LeftParen);
				setState(420);
				constantExpression();
				setState(421);
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
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				structOrUnion();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(426);
					match(Identifier);
					}
				}

				setState(429);
				match(T__6);
				setState(430);
				structDeclarationList();
				setState(431);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				structOrUnion();
				setState(434);
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
			setState(438);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
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
			setState(441); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(440);
				structDeclaration();
				}
				}
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__45) | (1L << Char))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Int - 64)) | (1L << (Void - 64)) | (1L << (Identifier - 64)))) != 0) );
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
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				specifierQualifierList();
				setState(446);
				structDeclaratorList();
				setState(447);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				specifierQualifierList();
				setState(450);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
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
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(455);
				typeSpecifier();
				}
				break;
			case 2:
				{
				setState(456);
				typeQualifier();
				}
				break;
			}
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(459);
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
			setState(462);
			structDeclarator();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(463);
				match(Comma);
				setState(464);
				structDeclarator();
				}
				}
				setState(469);
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
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Mult - 77)) | (1L << (Exponent - 77)) | (1L << (LeftParen - 77)))) != 0)) {
					{
					setState(471);
					declarator();
					}
				}

				setState(474);
				match(T__5);
				setState(475);
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(LucasGrammarParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumSpecifier);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(T__25);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(479);
					match(Identifier);
					}
				}

				setState(482);
				match(T__6);
				setState(483);
				enumeratorList();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(484);
					match(Comma);
					}
				}

				setState(487);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(T__25);
				setState(490);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(LucasGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(LucasGrammarParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			enumerator();
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					match(Comma);
					setState(495);
					enumerator();
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(LucasGrammarParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			enumerationConstant();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(502);
				match(Assign);
				setState(503);
				constantExpression();
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(T__26);
			setState(509);
			match(LeftParen);
			setState(510);
			typeName();
			setState(511);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionSpecifier);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				gccAttributeSpecifier();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				match(T__34);
				setState(518);
				match(LeftParen);
				setState(519);
				match(Identifier);
				setState(520);
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

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(LucasGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(LucasGrammarParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_alignmentSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__35);
			setState(524);
			match(LeftParen);
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(525);
				typeName();
				}
				break;
			case 2:
				{
				setState(526);
				constantExpression();
				}
				break;
			}
			setState(529);
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
		enterRule(_localctx, 82, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mult || _la==Exponent) {
				{
				setState(531);
				pointer();
				}
			}

			setState(534);
			directDeclarator(0);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(540);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(542);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(543);
				match(LeftParen);
				setState(544);
				declarator();
				setState(545);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(547);
				match(Identifier);
				setState(548);
				match(T__5);
				setState(550); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(549);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(552); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				setState(554);
				vcSpecificModifer();
				setState(555);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(557);
				match(LeftParen);
				setState(558);
				vcSpecificModifer();
				setState(559);
				declarator();
				setState(560);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(607);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(564);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(565);
						match(LeftBrac);
						setState(567);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
							{
							setState(566);
							typeQualifierList();
							}
						}

						setState(570);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
							{
							setState(569);
							assignmentExpression();
							}
						}

						setState(572);
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(573);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(574);
						match(LeftBrac);
						setState(575);
						match(T__36);
						setState(577);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
							{
							setState(576);
							typeQualifierList();
							}
						}

						setState(579);
						assignmentExpression();
						setState(580);
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(582);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(583);
						match(LeftBrac);
						setState(584);
						typeQualifierList();
						setState(585);
						match(T__36);
						setState(586);
						assignmentExpression();
						setState(587);
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(589);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(590);
						match(LeftBrac);
						setState(592);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
							{
							setState(591);
							typeQualifierList();
							}
						}

						setState(594);
						match(Mult);
						setState(595);
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(596);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(597);
						match(LeftParen);
						setState(598);
						parameterTypeList();
						setState(599);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(601);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(602);
						match(LeftParen);
						setState(604);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(603);
							identifierList();
							}
						}

						setState(606);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		enterRule(_localctx, 86, RULE_vcSpecificModifer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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
		enterRule(_localctx, 88, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				match(T__42);
				setState(615);
				match(LeftParen);
				setState(617); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(616);
					match(StringLiteral);
					}
					}
					setState(619); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(621);
				match(RightParen);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
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
		enterRule(_localctx, 90, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(T__43);
			setState(626);
			match(LeftParen);
			setState(627);
			match(LeftParen);
			setState(628);
			gccAttributeList();
			setState(629);
			match(RightParen);
			setState(630);
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
		enterRule(_localctx, 92, RULE_gccAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Function - 64)) | (1L << (Else - 64)) | (1L << (End - 64)) | (1L << (For - 64)) | (1L << (Int - 64)) | (1L << (If - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Void - 64)) | (1L << (While - 64)) | (1L << (TE - 64)) | (1L << (LE - 64)) | (1L << (Identifier - 64)) | (1L << (Literal - 64)) | (1L << (Add - 64)) | (1L << (Sub - 64)) | (1L << (Mult - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Tilde - 64)) | (1L << (Exponent - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (Equality - 64)) | (1L << (Inequality - 64)) | (1L << (LessThanEqual - 64)) | (1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
				{
				setState(632);
				gccAttribute();
				}
			}

			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(635);
				match(Comma);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Function - 64)) | (1L << (Else - 64)) | (1L << (End - 64)) | (1L << (For - 64)) | (1L << (Int - 64)) | (1L << (If - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Void - 64)) | (1L << (While - 64)) | (1L << (TE - 64)) | (1L << (LE - 64)) | (1L << (Identifier - 64)) | (1L << (Literal - 64)) | (1L << (Add - 64)) | (1L << (Sub - 64)) | (1L << (Mult - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Tilde - 64)) | (1L << (Exponent - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (Equality - 64)) | (1L << (Inequality - 64)) | (1L << (LessThanEqual - 64)) | (1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
					{
					setState(636);
					gccAttribute();
					}
				}

				}
				}
				setState(643);
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
		enterRule(_localctx, 94, RULE_gccAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (LeftParen - 98)) | (1L << (RightParen - 98)) | (1L << (Comma - 98)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(645);
				match(LeftParen);
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
					{
					setState(646);
					argumentExpressionList();
					}
				}

				setState(649);
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
		enterRule(_localctx, 96, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Function - 64)) | (1L << (Else - 64)) | (1L << (End - 64)) | (1L << (For - 64)) | (1L << (Int - 64)) | (1L << (If - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Void - 64)) | (1L << (While - 64)) | (1L << (TE - 64)) | (1L << (LE - 64)) | (1L << (Identifier - 64)) | (1L << (Literal - 64)) | (1L << (Add - 64)) | (1L << (Sub - 64)) | (1L << (Mult - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Tilde - 64)) | (1L << (Exponent - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (Equality - 64)) | (1L << (Inequality - 64)) | (1L << (LessThanEqual - 64)) | (1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Comma - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
				{
				setState(657);
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
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
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
					{
					setState(652);
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
					setState(653);
					match(LeftParen);
					setState(654);
					nestedParenthesesBlock();
					setState(655);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(661);
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
		enterRule(_localctx, 98, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(662);
				_la = _input.LA(1);
				if ( !(_la==Mult || _la==Exponent) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
					{
					setState(663);
					typeQualifierList();
					}
				}

				}
				}
				setState(668); 
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
		enterRule(_localctx, 100, RULE_typeQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(670);
				typeQualifier();
				}
				}
				setState(673); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) );
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
		enterRule(_localctx, 102, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			parameterList();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(676);
				match(Comma);
				setState(677);
				match(T__44);
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
		enterRule(_localctx, 104, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			parameterDeclaration();
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(681);
					match(Comma);
					setState(682);
					parameterDeclaration();
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		enterRule(_localctx, 106, RULE_parameterDeclaration);
		int _la;
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				declarationSpecifiers();
				setState(689);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				declarationSpecifiers2();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Mult - 81)) | (1L << (Exponent - 81)) | (1L << (LeftParen - 81)) | (1L << (LeftBrac - 81)))) != 0)) {
					{
					setState(692);
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
		enterRule(_localctx, 108, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(Identifier);
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(698);
				match(Comma);
				setState(699);
				match(Identifier);
				}
				}
				setState(704);
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
		enterRule(_localctx, 110, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			specifierQualifierList();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Mult - 81)) | (1L << (Exponent - 81)) | (1L << (LeftParen - 81)) | (1L << (LeftBrac - 81)))) != 0)) {
				{
				setState(706);
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
		enterRule(_localctx, 112, RULE_abstractDeclarator);
		int _la;
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Mult || _la==Exponent) {
					{
					setState(710);
					pointer();
					}
				}

				setState(713);
				directAbstractDeclarator(0);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__42 || _la==T__43) {
					{
					{
					setState(714);
					gccDeclaratorExtension();
					}
					}
					setState(719);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(723);
				match(LeftParen);
				setState(724);
				abstractDeclarator();
				setState(725);
				match(RightParen);
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(726);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(732);
				match(LeftBrac);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
					{
					setState(733);
					typeQualifierList();
					}
				}

				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
					{
					setState(736);
					assignmentExpression();
					}
				}

				setState(739);
				match(RightBrac);
				}
				break;
			case 3:
				{
				setState(740);
				match(LeftBrac);
				setState(741);
				match(T__36);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
					{
					setState(742);
					typeQualifierList();
					}
				}

				setState(745);
				assignmentExpression();
				setState(746);
				match(RightBrac);
				}
				break;
			case 4:
				{
				setState(748);
				match(LeftBrac);
				setState(749);
				typeQualifierList();
				setState(750);
				match(T__36);
				setState(751);
				assignmentExpression();
				setState(752);
				match(RightBrac);
				}
				break;
			case 5:
				{
				setState(754);
				match(LeftBrac);
				setState(755);
				match(Mult);
				setState(756);
				match(RightBrac);
				}
				break;
			case 6:
				{
				setState(757);
				match(LeftParen);
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__43) | (1L << Char))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Int - 64)) | (1L << (Void - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(758);
					parameterTypeList();
					}
				}

				setState(761);
				match(RightParen);
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(762);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(767);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(811);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(770);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(771);
						match(LeftBrac);
						setState(773);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
							{
							setState(772);
							typeQualifierList();
							}
						}

						setState(776);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
							{
							setState(775);
							assignmentExpression();
							}
						}

						setState(778);
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(779);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(780);
						match(LeftBrac);
						setState(781);
						match(T__36);
						setState(783);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
							{
							setState(782);
							typeQualifierList();
							}
						}

						setState(785);
						assignmentExpression();
						setState(786);
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(788);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(789);
						match(LeftBrac);
						setState(790);
						typeQualifierList();
						setState(791);
						match(T__36);
						setState(792);
						assignmentExpression();
						setState(793);
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(795);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(796);
						match(LeftBrac);
						setState(797);
						match(Mult);
						setState(798);
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(799);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(800);
						match(LeftParen);
						setState(802);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__43) | (1L << Char))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Int - 64)) | (1L << (Void - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(801);
							parameterTypeList();
							}
						}

						setState(804);
						match(RightParen);
						setState(808);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(805);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(810);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		enterRule(_localctx, 116, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
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
		enterRule(_localctx, 118, RULE_initializer);
		int _la;
		try {
			setState(826);
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
				setState(818);
				assignmentExpression();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(T__6);
				setState(820);
				initializerList();
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(821);
					match(Comma);
					}
				}

				setState(824);
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
		enterRule(_localctx, 120, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot || _la==LeftBrac) {
				{
				setState(828);
				designation();
				}
			}

			setState(831);
			initializer();
			setState(839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(832);
					match(Comma);
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Dot || _la==LeftBrac) {
						{
						setState(833);
						designation();
						}
					}

					setState(836);
					initializer();
					}
					} 
				}
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
		enterRule(_localctx, 122, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			designatorList();
			setState(843);
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
		enterRule(_localctx, 124, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(845);
				designator();
				}
				}
				setState(848); 
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
		enterRule(_localctx, 126, RULE_designator);
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrac:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				match(LeftBrac);
				setState(851);
				constantExpression();
				setState(852);
				match(RightBrac);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				match(Dot);
				setState(855);
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
		enterRule(_localctx, 128, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(T__45);
			setState(859);
			match(LeftParen);
			setState(860);
			constantExpression();
			setState(861);
			match(Comma);
			setState(863); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(862);
				match(StringLiteral);
				}
				}
				setState(865); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(867);
			match(RightParen);
			setState(868);
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
		enterRule(_localctx, 130, RULE_statement);
		int _la;
		try {
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(873);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(874);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(875);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(876);
				_la = _input.LA(1);
				if ( !(_la==T__42 || _la==T__46) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(877);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__47) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(878);
				match(LeftParen);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
					{
					setState(879);
					logicalOrExpression();
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(880);
						match(Comma);
						setState(881);
						logicalOrExpression();
						}
						}
						setState(886);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(889);
					match(T__5);
					setState(898);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
						{
						setState(890);
						logicalOrExpression();
						setState(895);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(891);
							match(Comma);
							setState(892);
							logicalOrExpression();
							}
							}
							setState(897);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(904);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(905);
				match(RightParen);
				setState(906);
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
		enterRule(_localctx, 132, RULE_labeledStatement);
		try {
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				match(Identifier);
				setState(910);
				match(T__5);
				setState(911);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(Case);
				setState(913);
				constantExpression();
				setState(914);
				match(T__5);
				setState(915);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				match(T__4);
				setState(918);
				match(T__5);
				setState(919);
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
		enterRule(_localctx, 134, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(T__6);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Continue))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (For - 64)) | (1L << (Int - 64)) | (1L << (If - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Void - 64)) | (1L << (While - 64)) | (1L << (Identifier - 64)) | (1L << (Literal - 64)) | (1L << (Add - 64)) | (1L << (Sub - 64)) | (1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0)) {
				{
				setState(923);
				blockItemList();
				}
			}

			setState(926);
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
		enterRule(_localctx, 136, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(928);
				blockItem();
				}
				}
				setState(931); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Continue))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (For - 64)) | (1L << (Int - 64)) | (1L << (If - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Void - 64)) | (1L << (While - 64)) | (1L << (Identifier - 64)) | (1L << (Literal - 64)) | (1L << (Add - 64)) | (1L << (Sub - 64)) | (1L << (Mult - 64)) | (1L << (Tilde - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalNot - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (StringLiteral - 64)) | (1L << (Digit - 64)))) != 0) );
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
		enterRule(_localctx, 138, RULE_blockItem);
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
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
		enterRule(_localctx, 140, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
				{
				setState(937);
				expression();
				}
			}

			setState(940);
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
		enterRule(_localctx, 142, RULE_selectionStatement);
		try {
			setState(957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				match(If);
				setState(943);
				match(LeftParen);
				setState(944);
				expression();
				setState(945);
				match(RightParen);
				setState(946);
				statement();
				setState(949);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(947);
					match(Else);
					setState(948);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(Switch);
				setState(952);
				match(LeftParen);
				setState(953);
				expression();
				setState(954);
				match(RightParen);
				setState(955);
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
		enterRule(_localctx, 144, RULE_iterationStatement);
		try {
			setState(971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				match(While);
				setState(960);
				match(LeftParen);
				setState(961);
				expression();
				setState(962);
				match(RightParen);
				setState(963);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				match(For);
				setState(966);
				match(LeftParen);
				setState(967);
				forCondition();
				setState(968);
				match(RightParen);
				setState(969);
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
		enterRule(_localctx, 146, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(973);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
					{
					setState(974);
					expression();
					}
				}

				}
				break;
			}
			setState(979);
			match(SemiColon);
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
				{
				setState(980);
				forExpression();
				}
			}

			setState(983);
			match(SemiColon);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
				{
				setState(984);
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
		enterRule(_localctx, 148, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			declarationSpecifiers();
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Mult - 77)) | (1L << (Exponent - 77)) | (1L << (LeftParen - 77)))) != 0)) {
				{
				setState(988);
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
		enterRule(_localctx, 150, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			assignmentExpression();
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(992);
				match(Comma);
				setState(993);
				assignmentExpression();
				}
				}
				setState(998);
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
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public TerminalNode Return() { return getToken(LucasGrammarParser.Return, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Continue() { return getToken(LucasGrammarParser.Continue, 0); }
		public TerminalNode Break() { return getToken(LucasGrammarParser.Break, 0); }
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
		enterRule(_localctx, 152, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(999);
				match(T__48);
				setState(1000);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1001);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(1002);
				match(Return);
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Identifier - 77)) | (1L << (Literal - 77)) | (1L << (Add - 77)) | (1L << (Sub - 77)) | (1L << (Mult - 77)) | (1L << (Tilde - 77)) | (1L << (LogicalAnd - 77)) | (1L << (LogicalNot - 77)) | (1L << (LeftParen - 77)) | (1L << (Increment - 77)) | (1L << (Decrement - 77)) | (1L << (StringLiteral - 77)) | (1L << (Digit - 77)))) != 0)) {
					{
					setState(1003);
					expression();
					}
				}

				}
				break;
			case 4:
				{
				setState(1006);
				match(T__48);
				setState(1007);
				unaryExpression();
				}
				break;
			}
			setState(1010);
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
		enterRule(_localctx, 154, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__45) | (1L << Char))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Int - 64)) | (1L << (Void - 64)) | (1L << (Identifier - 64)) | (1L << (Mult - 64)) | (1L << (Exponent - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)))) != 0)) {
				{
				setState(1012);
				translationUnit();
				}
			}

			setState(1015);
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
		enterRule(_localctx, 156, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1017);
				externalDeclaration();
				}
				}
				setState(1020); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__45) | (1L << Char))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Int - 64)) | (1L << (Void - 64)) | (1L << (Identifier - 64)) | (1L << (Mult - 64)) | (1L << (Exponent - 64)) | (1L << (LeftParen - 64)) | (1L << (SemiColon - 64)))) != 0) );
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
		enterRule(_localctx, 158, RULE_externalDeclaration);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1024);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1027);
				declarationSpecifiers();
				}
				break;
			}
			setState(1030);
			declarator();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__43) | (1L << T__45) | (1L << Char))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Int - 64)) | (1L << (Void - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1031);
				declarationList();
				}
			}

			setState(1034);
			compoundStatement();
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
		enterRule(_localctx, 162, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1036);
				declaration();
				}
				}
				setState(1039); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__43) | (1L << T__45) | (1L << Char))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Double - 64)) | (1L << (Int - 64)) | (1L << (Void - 64)) | (1L << (Identifier - 64)))) != 0) );
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
		case 42:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 57:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u0414\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\6\2\u00aa\n\2\r\2\16\2\u00ab\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b4"+
		"\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\u00c8\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\u00d4"+
		"\n\4\f\4\16\4\u00d7\13\4\3\5\3\5\5\5\u00db\n\5\3\5\3\5\3\5\3\6\3\6\5\6"+
		"\u00e2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ea\n\6\3\6\3\6\5\6\u00ee\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f6\n\6\3\6\3\6\3\6\3\6\7\6\u00fc\n\6\f"+
		"\6\16\6\u00ff\13\6\3\7\3\7\3\7\7\7\u0104\n\7\f\7\16\7\u0107\13\7\3\b\7"+
		"\b\u010a\n\b\f\b\16\b\u010d\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u011a\n\b\3\t\3\t\3\n\5\n\u011f\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\6\n\u0128\n\n\r\n\16\n\u0129\5\n\u012c\n\n\3\13\3\13\3\13\7\13\u0131"+
		"\n\13\f\13\16\13\u0134\13\13\3\f\3\f\3\f\7\f\u0139\n\f\f\f\16\f\u013c"+
		"\13\f\3\r\3\r\3\r\7\r\u0141\n\r\f\r\16\r\u0144\13\r\3\16\3\16\3\16\7\16"+
		"\u0149\n\16\f\16\16\16\u014c\13\16\3\17\3\17\3\17\7\17\u0151\n\17\f\17"+
		"\16\17\u0154\13\17\3\20\3\20\3\20\7\20\u0159\n\20\f\20\16\20\u015c\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0164\n\21\r\21\16\21\u0165\5\21"+
		"\u0168\n\21\3\22\3\22\3\23\3\23\3\23\7\23\u016f\n\23\f\23\16\23\u0172"+
		"\13\23\3\24\3\24\3\25\3\25\5\25\u0178\n\25\3\25\3\25\3\25\5\25\u017d\n"+
		"\25\3\26\6\26\u0180\n\26\r\26\16\26\u0181\3\27\6\27\u0185\n\27\r\27\16"+
		"\27\u0186\3\30\3\30\3\30\3\30\5\30\u018d\n\30\3\31\3\31\3\31\7\31\u0192"+
		"\n\31\f\31\16\31\u0195\13\31\3\32\3\32\3\32\5\32\u019a\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01aa"+
		"\n\33\3\34\3\34\5\34\u01ae\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01b7\n\34\3\35\3\35\3\36\6\36\u01bc\n\36\r\36\16\36\u01bd\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01c8\n\37\3 \3 \5 \u01cc\n \3 \5"+
		" \u01cf\n \3!\3!\3!\7!\u01d4\n!\f!\16!\u01d7\13!\3\"\3\"\5\"\u01db\n\""+
		"\3\"\3\"\5\"\u01df\n\"\3#\3#\5#\u01e3\n#\3#\3#\3#\5#\u01e8\n#\3#\3#\3"+
		"#\3#\5#\u01ee\n#\3$\3$\3$\7$\u01f3\n$\f$\16$\u01f6\13$\3%\3%\3%\5%\u01fb"+
		"\n%\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\5)\u020c\n)\3*\3"+
		"*\3*\3*\5*\u0212\n*\3*\3*\3+\5+\u0217\n+\3+\3+\7+\u021b\n+\f+\16+\u021e"+
		"\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\6,\u0229\n,\r,\16,\u022a\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u0235\n,\3,\3,\3,\5,\u023a\n,\3,\5,\u023d\n,\3,\3,\3,\3"+
		",\3,\5,\u0244\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0253\n,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u025f\n,\3,\7,\u0262\n,\f,\16,\u0265\13"+
		",\3-\3-\3.\3.\3.\6.\u026c\n.\r.\16.\u026d\3.\3.\5.\u0272\n.\3/\3/\3/\3"+
		"/\3/\3/\3/\3\60\5\60\u027c\n\60\3\60\3\60\5\60\u0280\n\60\7\60\u0282\n"+
		"\60\f\60\16\60\u0285\13\60\3\61\3\61\3\61\5\61\u028a\n\61\3\61\5\61\u028d"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\7\62\u0294\n\62\f\62\16\62\u0297\13\62"+
		"\3\63\3\63\5\63\u029b\n\63\6\63\u029d\n\63\r\63\16\63\u029e\3\64\6\64"+
		"\u02a2\n\64\r\64\16\64\u02a3\3\65\3\65\3\65\5\65\u02a9\n\65\3\66\3\66"+
		"\3\66\7\66\u02ae\n\66\f\66\16\66\u02b1\13\66\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u02b8\n\67\5\67\u02ba\n\67\38\38\38\78\u02bf\n8\f8\168\u02c2\13"+
		"8\39\39\59\u02c6\n9\3:\3:\5:\u02ca\n:\3:\3:\7:\u02ce\n:\f:\16:\u02d1\13"+
		":\5:\u02d3\n:\3;\3;\3;\3;\3;\7;\u02da\n;\f;\16;\u02dd\13;\3;\3;\5;\u02e1"+
		"\n;\3;\5;\u02e4\n;\3;\3;\3;\3;\5;\u02ea\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\5;\u02fa\n;\3;\3;\7;\u02fe\n;\f;\16;\u0301\13;\5;\u0303"+
		"\n;\3;\3;\3;\5;\u0308\n;\3;\5;\u030b\n;\3;\3;\3;\3;\3;\5;\u0312\n;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0325\n;\3;\3;\7;"+
		"\u0329\n;\f;\16;\u032c\13;\7;\u032e\n;\f;\16;\u0331\13;\3<\3<\3=\3=\3"+
		"=\3=\5=\u0339\n=\3=\3=\5=\u033d\n=\3>\5>\u0340\n>\3>\3>\3>\5>\u0345\n"+
		">\3>\7>\u0348\n>\f>\16>\u034b\13>\3?\3?\3?\3@\6@\u0351\n@\r@\16@\u0352"+
		"\3A\3A\3A\3A\3A\3A\5A\u035b\nA\3B\3B\3B\3B\3B\6B\u0362\nB\rB\16B\u0363"+
		"\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\7C\u0375\nC\fC\16C\u0378"+
		"\13C\5C\u037a\nC\3C\3C\3C\3C\7C\u0380\nC\fC\16C\u0383\13C\5C\u0385\nC"+
		"\7C\u0387\nC\fC\16C\u038a\13C\3C\3C\5C\u038e\nC\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\5D\u039b\nD\3E\3E\5E\u039f\nE\3E\3E\3F\6F\u03a4\nF\rF\16F\u03a5"+
		"\3G\3G\5G\u03aa\nG\3H\5H\u03ad\nH\3H\3H\3I\3I\3I\3I\3I\3I\3I\5I\u03b8"+
		"\nI\3I\3I\3I\3I\3I\3I\5I\u03c0\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\5J\u03ce\nJ\3K\3K\5K\u03d2\nK\5K\u03d4\nK\3K\3K\5K\u03d8\nK\3K\3K\5K"+
		"\u03dc\nK\3L\3L\5L\u03e0\nL\3M\3M\3M\7M\u03e5\nM\fM\16M\u03e8\13M\3N\3"+
		"N\3N\3N\3N\5N\u03ef\nN\3N\3N\5N\u03f3\nN\3N\3N\3O\5O\u03f8\nO\3O\3O\3"+
		"P\6P\u03fd\nP\rP\16P\u03fe\3Q\3Q\3Q\5Q\u0404\nQ\3R\5R\u0407\nR\3R\3R\5"+
		"R\u040b\nR\3R\3R\3S\6S\u0410\nS\rS\16S\u0411\3S\2\4VtT\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\2\30\3\2ab\3\2"+
		"jk\4\2\13\13jk\3\2\13\f\5\2QSVV``\3\2SU\3\2QR\4\2XY\\]\3\2Z[\5\2\r\16"+
		"nnqs\7\2\17\30>>BBGGKK\3\2\26\30\3\2\32\33\3\2\35 \3\2!$\4\2$$(,\4\2d"+
		"eii\3\2de\4\2SSWW\4\2--\61\61\4\2  \62\62\4\2\66\66AA\2\u0471\2\u00c7"+
		"\3\2\2\2\4\u00c9\3\2\2\2\6\u00d0\3\2\2\2\b\u00da\3\2\2\2\n\u00ed\3\2\2"+
		"\2\f\u0100\3\2\2\2\16\u010b\3\2\2\2\20\u011b\3\2\2\2\22\u012b\3\2\2\2"+
		"\24\u012d\3\2\2\2\26\u0135\3\2\2\2\30\u013d\3\2\2\2\32\u0145\3\2\2\2\34"+
		"\u014d\3\2\2\2\36\u0155\3\2\2\2 \u0167\3\2\2\2\"\u0169\3\2\2\2$\u016b"+
		"\3\2\2\2&\u0173\3\2\2\2(\u017c\3\2\2\2*\u017f\3\2\2\2,\u0184\3\2\2\2."+
		"\u018c\3\2\2\2\60\u018e\3\2\2\2\62\u0196\3\2\2\2\64\u01a9\3\2\2\2\66\u01b6"+
		"\3\2\2\28\u01b8\3\2\2\2:\u01bb\3\2\2\2<\u01c7\3\2\2\2>\u01cb\3\2\2\2@"+
		"\u01d0\3\2\2\2B\u01de\3\2\2\2D\u01ed\3\2\2\2F\u01ef\3\2\2\2H\u01f7\3\2"+
		"\2\2J\u01fc\3\2\2\2L\u01fe\3\2\2\2N\u0203\3\2\2\2P\u020b\3\2\2\2R\u020d"+
		"\3\2\2\2T\u0216\3\2\2\2V\u0234\3\2\2\2X\u0266\3\2\2\2Z\u0271\3\2\2\2\\"+
		"\u0273\3\2\2\2^\u027b\3\2\2\2`\u0286\3\2\2\2b\u0295\3\2\2\2d\u029c\3\2"+
		"\2\2f\u02a1\3\2\2\2h\u02a5\3\2\2\2j\u02aa\3\2\2\2l\u02b9\3\2\2\2n\u02bb"+
		"\3\2\2\2p\u02c3\3\2\2\2r\u02d2\3\2\2\2t\u0302\3\2\2\2v\u0332\3\2\2\2x"+
		"\u033c\3\2\2\2z\u033f\3\2\2\2|\u034c\3\2\2\2~\u0350\3\2\2\2\u0080\u035a"+
		"\3\2\2\2\u0082\u035c\3\2\2\2\u0084\u038d\3\2\2\2\u0086\u039a\3\2\2\2\u0088"+
		"\u039c\3\2\2\2\u008a\u03a3\3\2\2\2\u008c\u03a9\3\2\2\2\u008e\u03ac\3\2"+
		"\2\2\u0090\u03bf\3\2\2\2\u0092\u03cd\3\2\2\2\u0094\u03d3\3\2\2\2\u0096"+
		"\u03dd\3\2\2\2\u0098\u03e1\3\2\2\2\u009a\u03f2\3\2\2\2\u009c\u03f7\3\2"+
		"\2\2\u009e\u03fc\3\2\2\2\u00a0\u0403\3\2\2\2\u00a2\u0406\3\2\2\2\u00a4"+
		"\u040f\3\2\2\2\u00a6\u00c8\7O\2\2\u00a7\u00c8\7P\2\2\u00a8\u00aa\7x\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00c8\3\2\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\5$\23\2\u00af"+
		"\u00b0\7e\2\2\u00b0\u00c8\3\2\2\2\u00b1\u00c8\5\4\3\2\u00b2\u00b4\7\3"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\7d\2\2\u00b6\u00b7\5\u0088E\2\u00b7\u00b8\7e\2\2\u00b8\u00c8\3"+
		"\2\2\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\5\16\b\2\u00bc"+
		"\u00bd\7i\2\2\u00bd\u00be\5p9\2\u00be\u00bf\7e\2\2\u00bf\u00c8\3\2\2\2"+
		"\u00c0\u00c1\7\5\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\5p9\2\u00c3\u00c4"+
		"\7i\2\2\u00c4\u00c5\5\16\b\2\u00c5\u00c6\7e\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00a6\3\2\2\2\u00c7\u00a7\3\2\2\2\u00c7\u00a9\3\2\2\2\u00c7\u00ad\3\2"+
		"\2\2\u00c7\u00b1\3\2\2\2\u00c7\u00b3\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7"+
		"\u00c0\3\2\2\2\u00c8\3\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb\7d\2\2"+
		"\u00cb\u00cc\5 \21\2\u00cc\u00cd\7i\2\2\u00cd\u00ce\5\6\4\2\u00ce\u00cf"+
		"\7e\2\2\u00cf\5\3\2\2\2\u00d0\u00d5\5\b\5\2\u00d1\u00d2\7i\2\2\u00d2\u00d4"+
		"\5\b\5\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\5p9\2\u00d9"+
		"\u00db\7\7\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00de\5 \21\2\u00de\t\3\2\2\2\u00df\u00ee"+
		"\5\2\2\2\u00e0\u00e2\7\3\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\7d\2\2\u00e4\u00e5\5p9\2\u00e5\u00e6\7e\2\2"+
		"\u00e6\u00e7\7\t\2\2\u00e7\u00e9\5z>\2\u00e8\u00ea\7i\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\n\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00df\3\2\2\2\u00ed\u00e1\3\2\2\2\u00ee\u00fd\3\2"+
		"\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\5$\23\2\u00f1\u00f2\7g\2\2\u00f2\u00fc"+
		"\3\2\2\2\u00f3\u00f5\7d\2\2\u00f4\u00f6\5\f\7\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fc\7e\2\2\u00f8\u00f9\t\2"+
		"\2\2\u00f9\u00fc\7O\2\2\u00fa\u00fc\t\3\2\2\u00fb\u00ef\3\2\2\2\u00fb"+
		"\u00f3\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\13\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0105\5 \21\2\u0101\u0102\7i\2\2\u0102\u0104\5 \21\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\r\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\t\4\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u0119\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u011a\5\n\6\2\u010f\u0110\5\20"+
		"\t\2\u0110\u0111\5\22\n\2\u0111\u011a\3\2\2\2\u0112\u0113\t\5\2\2\u0113"+
		"\u0114\7d\2\2\u0114\u0115\5p9\2\u0115\u0116\7e\2\2\u0116\u011a\3\2\2\2"+
		"\u0117\u0118\7^\2\2\u0118\u011a\7O\2\2\u0119\u010e\3\2\2\2\u0119\u010f"+
		"\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0117\3\2\2\2\u011a\17\3\2\2\2\u011b"+
		"\u011c\t\6\2\2\u011c\21\3\2\2\2\u011d\u011f\7\3\2\2\u011e\u011d\3\2\2"+
		"\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7d\2\2\u0121\u0122"+
		"\5p9\2\u0122\u0123\7e\2\2\u0123\u0124\5\22\n\2\u0124\u012c\3\2\2\2\u0125"+
		"\u012c\5\16\b\2\u0126\u0128\7y\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u011e\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0127\3\2\2\2\u012c\23\3\2\2"+
		"\2\u012d\u0132\5\22\n\2\u012e\u012f\t\7\2\2\u012f\u0131\5\22\n\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\25\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u013a\5\24\13\2\u0136"+
		"\u0137\t\b\2\2\u0137\u0139\5\24\13\2\u0138\u0136\3\2\2\2\u0139\u013c\3"+
		"\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\27\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u0142\5\26\f\2\u013e\u013f\t\t\2\2\u013f\u0141\5"+
		"\26\f\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\31\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u014a\5\30\r"+
		"\2\u0146\u0147\t\n\2\2\u0147\u0149\5\30\r\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\33\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014d\u0152\5\32\16\2\u014e\u014f\7^\2\2\u014f"+
		"\u0151\5\32\16\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\35\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u015a\5\34\17\2\u0156\u0157\7_\2\2\u0157\u0159\5\34\17\2\u0158\u0156"+
		"\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\37\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0168\5\36\20\2\u015e\u015f\5\16"+
		"\b\2\u015f\u0160\5\"\22\2\u0160\u0161\5 \21\2\u0161\u0168\3\2\2\2\u0162"+
		"\u0164\7y\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u015d\3\2\2\2\u0167"+
		"\u015e\3\2\2\2\u0167\u0163\3\2\2\2\u0168!\3\2\2\2\u0169\u016a\t\13\2\2"+
		"\u016a#\3\2\2\2\u016b\u0170\5 \21\2\u016c\u016d\7i\2\2\u016d\u016f\5 "+
		"\21\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171%\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\5\36\20"+
		"\2\u0174\'\3\2\2\2\u0175\u0177\5*\26\2\u0176\u0178\5\60\31\2\u0177\u0176"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7h\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u017d\5\u0082B\2\u017c\u0175\3\2\2\2\u017c\u017b"+
		"\3\2\2\2\u017d)\3\2\2\2\u017e\u0180\5.\30\2\u017f\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182+\3\2\2\2"+
		"\u0183\u0185\5.\30\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187-\3\2\2\2\u0188\u018d\5\64\33\2\u0189"+
		"\u018d\5N(\2\u018a\u018d\5P)\2\u018b\u018d\5R*\2\u018c\u0188\3\2\2\2\u018c"+
		"\u0189\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d/\3\2\2\2"+
		"\u018e\u0193\5\62\32\2\u018f\u0190\7i\2\2\u0190\u0192\5\62\32\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\61\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0199\5T+\2\u0197\u0198"+
		"\7n\2\2\u0198\u019a\5x=\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\63\3\2\2\2\u019b\u01aa\t\f\2\2\u019c\u019d\7\3\2\2\u019d\u019e\7d\2\2"+
		"\u019e\u019f\t\r\2\2\u019f\u01aa\7e\2\2\u01a0\u01aa\5L\'\2\u01a1\u01aa"+
		"\5\66\34\2\u01a2\u01aa\5D#\2\u01a3\u01aa\5v<\2\u01a4\u01a5\7\31\2\2\u01a5"+
		"\u01a6\7d\2\2\u01a6\u01a7\5&\24\2\u01a7\u01a8\7e\2\2\u01a8\u01aa\3\2\2"+
		"\2\u01a9\u019b\3\2\2\2\u01a9\u019c\3\2\2\2\u01a9\u01a0\3\2\2\2\u01a9\u01a1"+
		"\3\2\2\2\u01a9\u01a2\3\2\2\2\u01a9\u01a3\3\2\2\2\u01a9\u01a4\3\2\2\2\u01aa"+
		"\65\3\2\2\2\u01ab\u01ad\58\35\2\u01ac\u01ae\7O\2\2\u01ad\u01ac\3\2\2\2"+
		"\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7\t\2\2\u01b0\u01b1"+
		"\5:\36\2\u01b1\u01b2\7\n\2\2\u01b2\u01b7\3\2\2\2\u01b3\u01b4\58\35\2\u01b4"+
		"\u01b5\7O\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01ab\3\2\2\2\u01b6\u01b3\3\2"+
		"\2\2\u01b7\67\3\2\2\2\u01b8\u01b9\t\16\2\2\u01b99\3\2\2\2\u01ba\u01bc"+
		"\5<\37\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be;\3\2\2\2\u01bf\u01c0\5> \2\u01c0\u01c1\5@!\2\u01c1"+
		"\u01c2\7h\2\2\u01c2\u01c8\3\2\2\2\u01c3\u01c4\5> \2\u01c4\u01c5\7h\2\2"+
		"\u01c5\u01c8\3\2\2\2\u01c6\u01c8\5\u0082B\2\u01c7\u01bf\3\2\2\2\u01c7"+
		"\u01c3\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8=\3\2\2\2\u01c9\u01cc\5\64\33"+
		"\2\u01ca\u01cc\5N(\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01ce"+
		"\3\2\2\2\u01cd\u01cf\5> \2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"?\3\2\2\2\u01d0\u01d5\5B\"\2\u01d1\u01d2\7i\2\2\u01d2\u01d4\5B\"\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6A\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01df\5T+\2\u01d9\u01db"+
		"\5T+\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01dd\7\b\2\2\u01dd\u01df\5&\24\2\u01de\u01d8\3\2\2\2\u01de\u01da\3\2"+
		"\2\2\u01dfC\3\2\2\2\u01e0\u01e2\7\34\2\2\u01e1\u01e3\7O\2\2\u01e2\u01e1"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7\t\2\2\u01e5"+
		"\u01e7\5F$\2\u01e6\u01e8\7i\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2"+
		"\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7\n\2\2\u01ea\u01ee\3\2\2\2\u01eb\u01ec"+
		"\7\34\2\2\u01ec\u01ee\7O\2\2\u01ed\u01e0\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"E\3\2\2\2\u01ef\u01f4\5H%\2\u01f0\u01f1\7i\2\2\u01f1\u01f3\5H%\2\u01f2"+
		"\u01f0\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5G\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\5J&\2\u01f8\u01f9"+
		"\7n\2\2\u01f9\u01fb\5&\24\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"I\3\2\2\2\u01fc\u01fd\7O\2\2\u01fdK\3\2\2\2\u01fe\u01ff\7\35\2\2\u01ff"+
		"\u0200\7d\2\2\u0200\u0201\5p9\2\u0201\u0202\7e\2\2\u0202M\3\2\2\2\u0203"+
		"\u0204\t\17\2\2\u0204O\3\2\2\2\u0205\u020c\t\20\2\2\u0206\u020c\5\\/\2"+
		"\u0207\u0208\7%\2\2\u0208\u0209\7d\2\2\u0209\u020a\7O\2\2\u020a\u020c"+
		"\7e\2\2\u020b\u0205\3\2\2\2\u020b\u0206\3\2\2\2\u020b\u0207\3\2\2\2\u020c"+
		"Q\3\2\2\2\u020d\u020e\7&\2\2\u020e\u0211\7d\2\2\u020f\u0212\5p9\2\u0210"+
		"\u0212\5&\24\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0214\7e\2\2\u0214S\3\2\2\2\u0215\u0217\5d\63\2\u0216\u0215"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021c\5V,\2\u0219"+
		"\u021b\5Z.\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2"+
		"\2\u021c\u021d\3\2\2\2\u021dU\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220"+
		"\b,\1\2\u0220\u0235\7O\2\2\u0221\u0222\7d\2\2\u0222\u0223\5T+\2\u0223"+
		"\u0224\7e\2\2\u0224\u0235\3\2\2\2\u0225\u0226\7O\2\2\u0226\u0228\7\b\2"+
		"\2\u0227\u0229\7y\2\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0228"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0235\3\2\2\2\u022c\u022d\5X-\2\u022d"+
		"\u022e\7O\2\2\u022e\u0235\3\2\2\2\u022f\u0230\7d\2\2\u0230\u0231\5X-\2"+
		"\u0231\u0232\5T+\2\u0232\u0233\7e\2\2\u0233\u0235\3\2\2\2\u0234\u021f"+
		"\3\2\2\2\u0234\u0221\3\2\2\2\u0234\u0225\3\2\2\2\u0234\u022c\3\2\2\2\u0234"+
		"\u022f\3\2\2\2\u0235\u0263\3\2\2\2\u0236\u0237\f\13\2\2\u0237\u0239\7"+
		"f\2\2\u0238\u023a\5f\64\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023c\3\2\2\2\u023b\u023d\5 \21\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u0262\7g\2\2\u023f\u0240\f\n\2\2\u0240"+
		"\u0241\7f\2\2\u0241\u0243\7\'\2\2\u0242\u0244\5f\64\2\u0243\u0242\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\5 \21\2\u0246"+
		"\u0247\7g\2\2\u0247\u0262\3\2\2\2\u0248\u0249\f\t\2\2\u0249\u024a\7f\2"+
		"\2\u024a\u024b\5f\64\2\u024b\u024c\7\'\2\2\u024c\u024d\5 \21\2\u024d\u024e"+
		"\7g\2\2\u024e\u0262\3\2\2\2\u024f\u0250\f\b\2\2\u0250\u0252\7f\2\2\u0251"+
		"\u0253\5f\64\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0255\7S\2\2\u0255\u0262\7g\2\2\u0256\u0257\f\7\2\2\u0257\u0258"+
		"\7d\2\2\u0258\u0259\5h\65\2\u0259\u025a\7e\2\2\u025a\u0262\3\2\2\2\u025b"+
		"\u025c\f\6\2\2\u025c\u025e\7d\2\2\u025d\u025f\5n8\2\u025e\u025d\3\2\2"+
		"\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262\7e\2\2\u0261\u0236"+
		"\3\2\2\2\u0261\u023f\3\2\2\2\u0261\u0248\3\2\2\2\u0261\u024f\3\2\2\2\u0261"+
		"\u0256\3\2\2\2\u0261\u025b\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2"+
		"\2\2\u0263\u0264\3\2\2\2\u0264W\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267"+
		"\t\21\2\2\u0267Y\3\2\2\2\u0268\u0269\7-\2\2\u0269\u026b\7d\2\2\u026a\u026c"+
		"\7x\2\2\u026b\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0272\7e\2\2\u0270\u0272\5\\"+
		"/\2\u0271\u0268\3\2\2\2\u0271\u0270\3\2\2\2\u0272[\3\2\2\2\u0273\u0274"+
		"\7.\2\2\u0274\u0275\7d\2\2\u0275\u0276\7d\2\2\u0276\u0277\5^\60\2\u0277"+
		"\u0278\7e\2\2\u0278\u0279\7e\2\2\u0279]\3\2\2\2\u027a\u027c\5`\61\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0283\3\2\2\2\u027d\u027f\7i"+
		"\2\2\u027e\u0280\5`\61\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0282\3\2\2\2\u0281\u027d\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2"+
		"\2\2\u0283\u0284\3\2\2\2\u0284_\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u028c"+
		"\n\22\2\2\u0287\u0289\7d\2\2\u0288\u028a\5\f\7\2\u0289\u0288\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\7e\2\2\u028c\u0287\3\2"+
		"\2\2\u028c\u028d\3\2\2\2\u028da\3\2\2\2\u028e\u0294\n\23\2\2\u028f\u0290"+
		"\7d\2\2\u0290\u0291\5b\62\2\u0291\u0292\7e\2\2\u0292\u0294\3\2\2\2\u0293"+
		"\u028e\3\2\2\2\u0293\u028f\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2"+
		"\2\2\u0295\u0296\3\2\2\2\u0296c\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u029a"+
		"\t\24\2\2\u0299\u029b\5f\64\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2"+
		"\u029b\u029d\3\2\2\2\u029c\u0298\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029c"+
		"\3\2\2\2\u029e\u029f\3\2\2\2\u029fe\3\2\2\2\u02a0\u02a2\5N(\2\u02a1\u02a0"+
		"\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"g\3\2\2\2\u02a5\u02a8\5j\66\2\u02a6\u02a7\7i\2\2\u02a7\u02a9\7/\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9i\3\2\2\2\u02aa\u02af\5l\67\2"+
		"\u02ab\u02ac\7i\2\2\u02ac\u02ae\5l\67\2\u02ad\u02ab\3\2\2\2\u02ae\u02b1"+
		"\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0k\3\2\2\2\u02b1"+
		"\u02af\3\2\2\2\u02b2\u02b3\5*\26\2\u02b3\u02b4\5T+\2\u02b4\u02ba\3\2\2"+
		"\2\u02b5\u02b7\5,\27\2\u02b6\u02b8\5r:\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8"+
		"\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b2\3\2\2\2\u02b9\u02b5\3\2\2\2\u02ba"+
		"m\3\2\2\2\u02bb\u02c0\7O\2\2\u02bc\u02bd\7i\2\2\u02bd\u02bf\7O\2\2\u02be"+
		"\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1o\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\5> \2\u02c4\u02c6"+
		"\5r:\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6q\3\2\2\2\u02c7\u02d3"+
		"\5d\63\2\u02c8\u02ca\5d\63\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02cf\5t;\2\u02cc\u02ce\5Z.\2\u02cd\u02cc\3\2\2\2"+
		"\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3"+
		"\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02c7\3\2\2\2\u02d2\u02c9\3\2\2\2\u02d3"+
		"s\3\2\2\2\u02d4\u02d5\b;\1\2\u02d5\u02d6\7d\2\2\u02d6\u02d7\5r:\2\u02d7"+
		"\u02db\7e\2\2\u02d8\u02da\5Z.\2\u02d9\u02d8\3\2\2\2\u02da\u02dd\3\2\2"+
		"\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u0303\3\2\2\2\u02dd\u02db"+
		"\3\2\2\2\u02de\u02e0\7f\2\2\u02df\u02e1\5f\64\2\u02e0\u02df\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02e4\5 \21\2\u02e3\u02e2\3\2"+
		"\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u0303\7g\2\2\u02e6"+
		"\u02e7\7f\2\2\u02e7\u02e9\7\'\2\2\u02e8\u02ea\5f\64\2\u02e9\u02e8\3\2"+
		"\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\5 \21\2\u02ec"+
		"\u02ed\7g\2\2\u02ed\u0303\3\2\2\2\u02ee\u02ef\7f\2\2\u02ef\u02f0\5f\64"+
		"\2\u02f0\u02f1\7\'\2\2\u02f1\u02f2\5 \21\2\u02f2\u02f3\7g\2\2\u02f3\u0303"+
		"\3\2\2\2\u02f4\u02f5\7f\2\2\u02f5\u02f6\7S\2\2\u02f6\u0303\7g\2\2\u02f7"+
		"\u02f9\7d\2\2\u02f8\u02fa\5h\65\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2"+
		"\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02ff\7e\2\2\u02fc\u02fe\5Z.\2\u02fd\u02fc"+
		"\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u02d4\3\2\2\2\u0302\u02de\3\2"+
		"\2\2\u0302\u02e6\3\2\2\2\u0302\u02ee\3\2\2\2\u0302\u02f4\3\2\2\2\u0302"+
		"\u02f7\3\2\2\2\u0303\u032f\3\2\2\2\u0304\u0305\f\7\2\2\u0305\u0307\7f"+
		"\2\2\u0306\u0308\5f\64\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u030a\3\2\2\2\u0309\u030b\5 \21\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2"+
		"\2\2\u030b\u030c\3\2\2\2\u030c\u032e\7g\2\2\u030d\u030e\f\6\2\2\u030e"+
		"\u030f\7f\2\2\u030f\u0311\7\'\2\2\u0310\u0312\5f\64\2\u0311\u0310\3\2"+
		"\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\5 \21\2\u0314"+
		"\u0315\7g\2\2\u0315\u032e\3\2\2\2\u0316\u0317\f\5\2\2\u0317\u0318\7f\2"+
		"\2\u0318\u0319\5f\64\2\u0319\u031a\7\'\2\2\u031a\u031b\5 \21\2\u031b\u031c"+
		"\7g\2\2\u031c\u032e\3\2\2\2\u031d\u031e\f\4\2\2\u031e\u031f\7f\2\2\u031f"+
		"\u0320\7S\2\2\u0320\u032e\7g\2\2\u0321\u0322\f\3\2\2\u0322\u0324\7d\2"+
		"\2\u0323\u0325\5h\65\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u032a\7e\2\2\u0327\u0329\5Z.\2\u0328\u0327\3\2\2\2\u0329"+
		"\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032e\3\2"+
		"\2\2\u032c\u032a\3\2\2\2\u032d\u0304\3\2\2\2\u032d\u030d\3\2\2\2\u032d"+
		"\u0316\3\2\2\2\u032d\u031d\3\2\2\2\u032d\u0321\3\2\2\2\u032e\u0331\3\2"+
		"\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330u\3\2\2\2\u0331\u032f"+
		"\3\2\2\2\u0332\u0333\7O\2\2\u0333w\3\2\2\2\u0334\u033d\5 \21\2\u0335\u0336"+
		"\7\t\2\2\u0336\u0338\5z>\2\u0337\u0339\7i\2\2\u0338\u0337\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\7\n\2\2\u033b\u033d\3\2"+
		"\2\2\u033c\u0334\3\2\2\2\u033c\u0335\3\2\2\2\u033dy\3\2\2\2\u033e\u0340"+
		"\5|?\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0349\5x=\2\u0342\u0344\7i\2\2\u0343\u0345\5|?\2\u0344\u0343\3\2\2\2"+
		"\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\5x=\2\u0347\u0342"+
		"\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"{\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u034d\5~@\2\u034d\u034e\7n\2\2\u034e"+
		"}\3\2\2\2\u034f\u0351\5\u0080A\2\u0350\u034f\3\2\2\2\u0351\u0352\3\2\2"+
		"\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\177\3\2\2\2\u0354\u0355"+
		"\7f\2\2\u0355\u0356\5&\24\2\u0356\u0357\7g\2\2\u0357\u035b\3\2\2\2\u0358"+
		"\u0359\7a\2\2\u0359\u035b\7O\2\2\u035a\u0354\3\2\2\2\u035a\u0358\3\2\2"+
		"\2\u035b\u0081\3\2\2\2\u035c\u035d\7\60\2\2\u035d\u035e\7d\2\2\u035e\u035f"+
		"\5&\24\2\u035f\u0361\7i\2\2\u0360\u0362\7x\2\2\u0361\u0360\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2"+
		"\2\2\u0365\u0366\7e\2\2\u0366\u0367\7h\2\2\u0367\u0083\3\2\2\2\u0368\u038e"+
		"\5\u0086D\2\u0369\u038e\5\u0088E\2\u036a\u038e\5\u008eH\2\u036b\u038e"+
		"\5\u0090I\2\u036c\u038e\5\u0092J\2\u036d\u038e\5\u009aN\2\u036e\u036f"+
		"\t\25\2\2\u036f\u0370\t\26\2\2\u0370\u0379\7d\2\2\u0371\u0376\5\36\20"+
		"\2\u0372\u0373\7i\2\2\u0373\u0375\5\36\20\2\u0374\u0372\3\2\2\2\u0375"+
		"\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037a\3\2"+
		"\2\2\u0378\u0376\3\2\2\2\u0379\u0371\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u0388\3\2\2\2\u037b\u0384\7\b\2\2\u037c\u0381\5\36\20\2\u037d\u037e\7"+
		"i\2\2\u037e\u0380\5\36\20\2\u037f\u037d\3\2\2\2\u0380\u0383\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2"+
		"\2\2\u0384\u037c\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386"+
		"\u037b\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2"+
		"\2\2\u0389\u038b\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038c\7e\2\2\u038c"+
		"\u038e\7h\2\2\u038d\u0368\3\2\2\2\u038d\u0369\3\2\2\2\u038d\u036a\3\2"+
		"\2\2\u038d\u036b\3\2\2\2\u038d\u036c\3\2\2\2\u038d\u036d\3\2\2\2\u038d"+
		"\u036e\3\2\2\2\u038e\u0085\3\2\2\2\u038f\u0390\7O\2\2\u0390\u0391\7\b"+
		"\2\2\u0391\u039b\5\u0084C\2\u0392\u0393\7=\2\2\u0393\u0394\5&\24\2\u0394"+
		"\u0395\7\b\2\2\u0395\u0396\5\u0084C\2\u0396\u039b\3\2\2\2\u0397\u0398"+
		"\7\7\2\2\u0398\u0399\7\b\2\2\u0399\u039b\5\u0084C\2\u039a\u038f\3\2\2"+
		"\2\u039a\u0392\3\2\2\2\u039a\u0397\3\2\2\2\u039b\u0087\3\2\2\2\u039c\u039e"+
		"\7\t\2\2\u039d\u039f\5\u008aF\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2"+
		"\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\7\n\2\2\u03a1\u0089\3\2\2\2\u03a2\u03a4"+
		"\5\u008cG\2\u03a3\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a3\3\2\2"+
		"\2\u03a5\u03a6\3\2\2\2\u03a6\u008b\3\2\2\2\u03a7\u03aa\5\u0084C\2\u03a8"+
		"\u03aa\5(\25\2\u03a9\u03a7\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u008d\3\2"+
		"\2\2\u03ab\u03ad\5$\23\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03af\7h\2\2\u03af\u008f\3\2\2\2\u03b0\u03b1\7H\2"+
		"\2\u03b1\u03b2\7d\2\2\u03b2\u03b3\5$\23\2\u03b3\u03b4\7e\2\2\u03b4\u03b7"+
		"\5\u0084C\2\u03b5\u03b6\7D\2\2\u03b6\u03b8\5\u0084C\2\u03b7\u03b5\3\2"+
		"\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03c0\3\2\2\2\u03b9\u03ba\7J\2\2\u03ba"+
		"\u03bb\7d\2\2\u03bb\u03bc\5$\23\2\u03bc\u03bd\7e\2\2\u03bd\u03be\5\u0084"+
		"C\2\u03be\u03c0\3\2\2\2\u03bf\u03b0\3\2\2\2\u03bf\u03b9\3\2\2\2\u03c0"+
		"\u0091\3\2\2\2\u03c1\u03c2\7L\2\2\u03c2\u03c3\7d\2\2\u03c3\u03c4\5$\23"+
		"\2\u03c4\u03c5\7e\2\2\u03c5\u03c6\5\u0084C\2\u03c6\u03ce\3\2\2\2\u03c7"+
		"\u03c8\7F\2\2\u03c8\u03c9\7d\2\2\u03c9\u03ca\5\u0094K\2\u03ca\u03cb\7"+
		"e\2\2\u03cb\u03cc\5\u0084C\2\u03cc\u03ce\3\2\2\2\u03cd\u03c1\3\2\2\2\u03cd"+
		"\u03c7\3\2\2\2\u03ce\u0093\3\2\2\2\u03cf\u03d4\5\u0096L\2\u03d0\u03d2"+
		"\5$\23\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3"+
		"\u03cf\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\7h"+
		"\2\2\u03d6\u03d8\5\u0098M\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03db\7h\2\2\u03da\u03dc\5\u0098M\2\u03db\u03da\3"+
		"\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u0095\3\2\2\2\u03dd\u03df\5*\26\2\u03de"+
		"\u03e0\5\60\31\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u0097\3"+
		"\2\2\2\u03e1\u03e6\5 \21\2\u03e2\u03e3\7i\2\2\u03e3\u03e5\5 \21\2\u03e4"+
		"\u03e2\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2"+
		"\2\2\u03e7\u0099\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ea\7\63\2\2\u03ea"+
		"\u03f3\7O\2\2\u03eb\u03f3\t\27\2\2\u03ec\u03ee\7I\2\2\u03ed\u03ef\5$\23"+
		"\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f3\3\2\2\2\u03f0\u03f1"+
		"\7\63\2\2\u03f1\u03f3\5\16\b\2\u03f2\u03e9\3\2\2\2\u03f2\u03eb\3\2\2\2"+
		"\u03f2\u03ec\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5"+
		"\7h\2\2\u03f5\u009b\3\2\2\2\u03f6\u03f8\5\u009eP\2\u03f7\u03f6\3\2\2\2"+
		"\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\7\2\2\3\u03fa\u009d"+
		"\3\2\2\2\u03fb\u03fd\5\u00a0Q\2\u03fc\u03fb\3\2\2\2\u03fd\u03fe\3\2\2"+
		"\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u009f\3\2\2\2\u0400\u0404"+
		"\5\u00a2R\2\u0401\u0404\5(\25\2\u0402\u0404\7h\2\2\u0403\u0400\3\2\2\2"+
		"\u0403\u0401\3\2\2\2\u0403\u0402\3\2\2\2\u0404\u00a1\3\2\2\2\u0405\u0407"+
		"\5*\26\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u040a\5T+\2\u0409\u040b\5\u00a4S\2\u040a\u0409\3\2\2\2\u040a\u040b\3"+
		"\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\5\u0088E\2\u040d\u00a3\3\2\2\2"+
		"\u040e\u0410\5(\25\2\u040f\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u040f"+
		"\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u00a5\3\2\2\2\u0086\u00ab\u00b3\u00c7"+
		"\u00d5\u00da\u00e1\u00e9\u00ed\u00f5\u00fb\u00fd\u0105\u010b\u0119\u011e"+
		"\u0129\u012b\u0132\u013a\u0142\u014a\u0152\u015a\u0165\u0167\u0170\u0177"+
		"\u017c\u0181\u0186\u018c\u0193\u0199\u01a9\u01ad\u01b6\u01bd\u01c7\u01cb"+
		"\u01ce\u01d5\u01da\u01de\u01e2\u01e7\u01ed\u01f4\u01fa\u020b\u0211\u0216"+
		"\u021c\u022a\u0234\u0239\u023c\u0243\u0252\u025e\u0261\u0263\u026d\u0271"+
		"\u027b\u027f\u0283\u0289\u028c\u0293\u0295\u029a\u029e\u02a3\u02a8\u02af"+
		"\u02b7\u02b9\u02c0\u02c5\u02c9\u02cf\u02d2\u02db\u02e0\u02e3\u02e9\u02f9"+
		"\u02ff\u0302\u0307\u030a\u0311\u0324\u032a\u032d\u032f\u0338\u033c\u033f"+
		"\u0344\u0349\u0352\u035a\u0363\u0376\u0379\u0381\u0384\u0388\u038d\u039a"+
		"\u039e\u03a5\u03a9\u03ac\u03b7\u03bf\u03cd\u03d1\u03d3\u03d7\u03db\u03df"+
		"\u03e6\u03ee\u03f2\u03f7\u03fe\u0403\u0406\u040a\u0411";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}