// Generated from /home/jatin/grammarstemp/compilers-2-project-team-3-aug22/Parser/LucasGrammar.g4 by ANTLR 4.9.2
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
<<<<<<< HEAD
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
=======
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		Begin=25, BigInt=26, Break=27, Decl=28, Expr=29, Public=30, Private=31, 
		TypeOf=32, Vector=33, Case=34, Char=35, Class=36, CharSeq=37, Continue=38, 
		Double=39, Function=40, Else=41, End=42, For=43, Int=44, If=45, Return=46, 
		Switch=47, Void=48, While=49, TE=50, LE=51, Identifier=52, Literal=53, 
		Digit=54, StringLiteral=55, Add=56, Sub=57, Mult=58, Div=59, Mod=60, Tilde=61, 
		Exponent=62, LessThan=63, GreaterThan=64, Equality=65, Inequality=66, 
		LessThanEqual=67, GreaterThanEqual=68, LogicalAnd=69, LogicalOr=70, LogicalNot=71, 
		Dot=72, Arrow=73, ClassSpec=74, LeftParen=75, RightParen=76, LeftBrac=77, 
		RightBrac=78, SemiColon=79, Comma=80, Increment=81, Decrement=82, RightShift=83, 
		LeftShift=84, Colon=85, Assign=86, LeftShiftEqual=87, RightShiftEqual=88, 
		PlusEqual=89, MinusEqual=90, MultEqual=91, DivEqual=92, ModEqual=93, Whitespace=94, 
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
		RULE_initDeclarator = 24, RULE_typeSpecifier = 25, RULE_classSpecifier = 26, 
		RULE_memberDeclaration = 27, RULE_structOrUnionSpecifier = 28, RULE_structOrUnion = 29, 
		RULE_structDeclarationList = 30, RULE_structDeclaration = 31, RULE_specifierQualifierList = 32, 
		RULE_structDeclaratorList = 33, RULE_structDeclarator = 34, RULE_typeQualifier = 35, 
		RULE_declarator = 36, RULE_directDeclarator = 37, RULE_vcSpecificModifer = 38, 
		RULE_nestedParenthesesBlock = 39, RULE_pointer = 40, RULE_typeQualifierList = 41, 
		RULE_parameterTypeList = 42, RULE_parameterList = 43, RULE_parameterDeclaration = 44, 
		RULE_identifierList = 45, RULE_typeName = 46, RULE_abstractDeclarator = 47, 
		RULE_directAbstractDeclarator = 48, RULE_typedefName = 49, RULE_initializer = 50, 
		RULE_initializerList = 51, RULE_designation = 52, RULE_designatorList = 53, 
		RULE_designator = 54, RULE_staticAssertDeclaration = 55, RULE_statement = 56, 
		RULE_expressionStatement = 57, RULE_selectionStatement = 58, RULE_iterationStatement = 59, 
		RULE_forCondition = 60, RULE_forDeclaration = 61, RULE_forExpression = 62, 
		RULE_jumpStatement = 63, RULE_compilationUnit = 64, RULE_translationUnit = 65, 
		RULE_externalDeclaration = 66, RULE_functionDeclaration = 67, RULE_functionDefinition = 68, 
		RULE_declarationList = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
			"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
			"castExpression", "multiplicativeExpression", "additiveExpression", "relationalExpression", 
			"equalityExpression", "logicalAndExpression", "logicalOrExpression", 
			"assignmentExpression", "assignmentOperator", "expression", "constantExpression", 
			"declaration", "declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
			"initDeclaratorList", "initDeclarator", "typeSpecifier", "classSpecifier", 
			"memberDeclaration", "structOrUnionSpecifier", "structOrUnion", "structDeclarationList", 
			"structDeclaration", "specifierQualifierList", "structDeclaratorList", 
			"structDeclarator", "typeQualifier", "declarator", "directDeclarator", 
			"vcSpecificModifer", "nestedParenthesesBlock", "pointer", "typeQualifierList", 
			"parameterTypeList", "parameterList", "parameterDeclaration", "identifierList", 
			"typeName", "abstractDeclarator", "directAbstractDeclarator", "typedefName", 
			"initializer", "initializerList", "designation", "designatorList", "designator", 
			"staticAssertDeclaration", "statement", "expressionStatement", "selectionStatement", 
			"iterationStatement", "forCondition", "forDeclaration", "forExpression", 
			"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
			"functionDeclaration", "functionDefinition", "declarationList"
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
<<<<<<< HEAD
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
=======
			null, "'__builtin_va_arg'", "'__builtin_offsetof'", "'_Generic'", "'default'", 
			"'__extension__'", "'{'", "'}'", "'sizeof'", "'_Alignof'", "'long'", 
			"'float'", "'boolean'", "'struct'", "'union'", "'const'", "'static'", 
			"'__cdecl'", "'__clrcall'", "'__stdcall'", "'__fastcall'", "'__thiscall'", 
			"'__vectorcall'", "'...'", "'_Static_assert'", "'begin'", "'bigint'", 
			"'break'", "'decl'", "'expr'", "'public'", "'private'", "'typeof'", "'vector'", 
			"'case'", "'char'", "'class'", "'charseq'", "'continue'", "'double'", 
			"'function'", "'else'", "'end'", "'for'", "'int'", "'if'", "'return'", 
			"'switch'", "'void'", "'while'", null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'^'", "'<'", "'>'", "'=='", 
			"'!='", "'<='", "'>='", "'&&'", "'||'", "'!'", "'.'", "'->'", "'::'", 
			"'('", "')'", "'['", "']'", "';'", "','", "'++'", "'--'", "'>>'", "'<<'", 
			"':'", "'='", "'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", "'%='"
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
<<<<<<< HEAD
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
=======
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Begin", "BigInt", "Break", "Decl", "Expr", "Public", "Private", 
			"TypeOf", "Vector", "Case", "Char", "Class", "CharSeq", "Continue", "Double", 
			"Function", "Else", "End", "For", "Int", "If", "Return", "Switch", "Void", 
			"While", "TE", "LE", "Identifier", "Literal", "Digit", "StringLiteral", 
			"Add", "Sub", "Mult", "Div", "Mod", "Tilde", "Exponent", "LessThan", 
			"GreaterThan", "Equality", "Inequality", "LessThanEqual", "GreaterThanEqual", 
			"LogicalAnd", "LogicalOr", "LogicalNot", "Dot", "Arrow", "ClassSpec", 
			"LeftParen", "RightParen", "LeftBrac", "RightBrac", "SemiColon", "Comma", 
			"Increment", "Decrement", "RightShift", "LeftShift", "Colon", "Assign", 
			"LeftShiftEqual", "RightShiftEqual", "PlusEqual", "MinusEqual", "MultEqual", 
			"DivEqual", "ModEqual", "Whitespace", "Newline", "BlockComment", "LineComment"
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(141);
=======
			setState(166);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(130);
=======
				setState(140);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(Identifier);
				}
				break;
			case Literal:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(131);
=======
				setState(141);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(Literal);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(133); 
=======
				setState(143); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
<<<<<<< HEAD
					setState(132);
					match(StringLiteral);
					}
					}
					setState(135); 
=======
					setState(142);
					match(StringLiteral);
					}
					}
					setState(145); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
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
=======
				setState(147);
				match(LeftParen);
				setState(148);
				expression();
				setState(149);
				match(RightParen);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				genericSelection();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(T__0);
				setState(153);
				match(LeftParen);
				setState(154);
				unaryExpression();
				setState(155);
				match(Comma);
				setState(156);
				typeName();
				setState(157);
				match(RightParen);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				match(T__1);
				setState(160);
				match(LeftParen);
				setState(161);
				typeName();
				setState(162);
				match(Comma);
				setState(163);
				unaryExpression();
				setState(164);
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
			setState(168);
			match(T__2);
			setState(169);
			match(LeftParen);
			setState(170);
			assignmentExpression();
			setState(171);
			match(Comma);
			setState(172);
			genericAssocList();
			setState(173);
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
			setState(175);
			genericAssociation();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(176);
				match(Comma);
				setState(177);
				genericAssociation();
				}
				}
				setState(182);
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
		public TerminalNode Colon() { return getToken(LucasGrammarParser.Colon, 0); }
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case Begin:
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				{
				setState(183);
				typeName();
				}
				break;
			case T__3:
				{
				setState(184);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			match(Colon);
			setState(188);
			assignmentExpression();
			}
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		}
		catch (RecognitionException re) {
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
<<<<<<< HEAD
			setState(157);
=======
			setState(204);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(143);
=======
				setState(190);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				primaryExpression();
				}
				break;
			case 2:
				{
<<<<<<< HEAD
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
=======
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(191);
					match(T__4);
					}
				}

				setState(194);
				match(LeftParen);
				setState(195);
				typeName();
				setState(196);
				match(RightParen);
				setState(197);
				match(T__5);
				setState(198);
				initializerList();
				setState(200);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
<<<<<<< HEAD
					setState(152);
=======
					setState(199);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(Comma);
					}
				}

<<<<<<< HEAD
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
=======
				setState(202);
				match(T__6);
				}
				break;
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Dot - 72)) | (1L << (Arrow - 72)) | (1L << (LeftParen - 72)) | (1L << (LeftBrac - 72)) | (1L << (Increment - 72)) | (1L << (Decrement - 72)))) != 0)) {
				{
				setState(218);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBrac:
					{
<<<<<<< HEAD
					setState(159);
					match(LeftBrac);
					setState(160);
					expression();
					setState(161);
=======
					setState(206);
					match(LeftBrac);
					setState(207);
					expression();
					setState(208);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(RightBrac);
					}
					break;
				case LeftParen:
					{
<<<<<<< HEAD
					setState(163);
					match(LeftParen);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
						{
						setState(164);
=======
					setState(210);
					match(LeftParen);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
						{
						setState(211);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						argumentExpressionList();
						}
					}

<<<<<<< HEAD
					setState(167);
=======
					setState(214);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(RightParen);
					}
					break;
				case Dot:
				case Arrow:
					{
<<<<<<< HEAD
					setState(168);
=======
					setState(215);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==Arrow) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
<<<<<<< HEAD
					setState(169);
=======
					setState(216);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(Identifier);
					}
					break;
				case Increment:
				case Decrement:
					{
<<<<<<< HEAD
					setState(170);
=======
					setState(217);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
				setState(175);
=======
				setState(222);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(176);
			assignmentExpression();
			setState(181);
=======
			setState(223);
			assignmentExpression();
			setState(228);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
<<<<<<< HEAD
				setState(177);
				match(Comma);
				setState(178);
				assignmentExpression();
				}
				}
				setState(183);
=======
				setState(224);
				match(Comma);
				setState(225);
				assignmentExpression();
				}
				}
				setState(230);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(187);
=======
			setState(234);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(184);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==Increment || _la==Decrement) ) {
=======
					setState(231);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==Increment || _la==Decrement) ) {
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
				setState(189);
=======
				setState(236);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
<<<<<<< HEAD
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
=======
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__4:
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			case Identifier:
			case Literal:
			case StringLiteral:
			case LeftParen:
				{
<<<<<<< HEAD
				setState(190);
=======
				setState(237);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				postfixExpression();
				}
				break;
			case Add:
			case Sub:
			case Mult:
			case Tilde:
			case LogicalNot:
				{
<<<<<<< HEAD
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
=======
				setState(238);
				unaryOperator();
				setState(239);
				castExpression();
				}
				break;
			case T__7:
			case T__8:
				{
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				match(LeftParen);
				setState(243);
				typeName();
				setState(244);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightParen);
				}
				break;
			case LogicalAnd:
				{
<<<<<<< HEAD
				setState(199);
				match(LogicalAnd);
				setState(200);
=======
				setState(246);
				match(LogicalAnd);
				setState(247);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(203);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (Add - 52)) | (1L << (Sub - 52)) | (1L << (Mult - 52)) | (1L << (Tilde - 52)) | (1L << (LogicalNot - 52)))) != 0)) ) {
=======
			setState(250);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (Add - 56)) | (1L << (Sub - 56)) | (1L << (Mult - 56)) | (1L << (Tilde - 56)) | (1L << (LogicalNot - 56)))) != 0)) ) {
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(219);
=======
			setState(266);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
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
=======
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(252);
					match(T__4);
					}
				}

				setState(255);
				match(LeftParen);
				setState(256);
				typeName();
				setState(257);
				match(RightParen);
				setState(258);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(213);
=======
				setState(260);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(215); 
=======
				setState(262); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
<<<<<<< HEAD
					setState(214);
					match(Digit);
					}
					}
					setState(217); 
=======
					setState(261);
					match(Digit);
					}
					}
					setState(264); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(221);
			castExpression();
			setState(226);
=======
			setState(268);
			castExpression();
			setState(273);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mult) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
<<<<<<< HEAD
				setState(222);
=======
				setState(269);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mult) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(223);
				castExpression();
				}
				}
				setState(228);
=======
				setState(270);
				castExpression();
				}
				}
				setState(275);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(229);
			multiplicativeExpression();
			setState(234);
=======
			setState(276);
			multiplicativeExpression();
			setState(281);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Add || _la==Sub) {
				{
				{
<<<<<<< HEAD
				setState(230);
=======
				setState(277);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Sub) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(231);
				multiplicativeExpression();
				}
				}
				setState(236);
=======
				setState(278);
				multiplicativeExpression();
				}
				}
				setState(283);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
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
=======
			setState(284);
			additiveExpression();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LessThan - 63)) | (1L << (GreaterThan - 63)) | (1L << (LessThanEqual - 63)) | (1L << (GreaterThanEqual - 63)))) != 0)) {
				{
				{
				setState(285);
				_la = _input.LA(1);
				if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LessThan - 63)) | (1L << (GreaterThan - 63)) | (1L << (LessThanEqual - 63)) | (1L << (GreaterThanEqual - 63)))) != 0)) ) {
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(239);
				additiveExpression();
				}
				}
				setState(244);
=======
				setState(286);
				additiveExpression();
				}
				}
				setState(291);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(245);
			relationalExpression();
			setState(250);
=======
			setState(292);
			relationalExpression();
			setState(297);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equality || _la==Inequality) {
				{
				{
<<<<<<< HEAD
				setState(246);
=======
				setState(293);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_la = _input.LA(1);
				if ( !(_la==Equality || _la==Inequality) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(247);
				relationalExpression();
				}
				}
				setState(252);
=======
				setState(294);
				relationalExpression();
				}
				}
				setState(299);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(253);
			equalityExpression();
			setState(258);
=======
			setState(300);
			equalityExpression();
			setState(305);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalAnd) {
				{
				{
<<<<<<< HEAD
				setState(254);
				match(LogicalAnd);
				setState(255);
				equalityExpression();
				}
				}
				setState(260);
=======
				setState(301);
				match(LogicalAnd);
				setState(302);
				equalityExpression();
				}
				}
				setState(307);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(261);
			logicalAndExpression();
			setState(266);
=======
			setState(308);
			logicalAndExpression();
			setState(313);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOr) {
				{
				{
<<<<<<< HEAD
				setState(262);
				match(LogicalOr);
				setState(263);
				logicalAndExpression();
				}
				}
				setState(268);
=======
				setState(309);
				match(LogicalOr);
				setState(310);
				logicalAndExpression();
				}
				}
				setState(315);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(279);
=======
			setState(326);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(269);
=======
				setState(316);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(270);
				unaryExpression();
				setState(271);
				assignmentOperator();
				setState(272);
=======
				setState(317);
				unaryExpression();
				setState(318);
				assignmentOperator();
				setState(319);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(275); 
=======
				setState(322); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
<<<<<<< HEAD
					setState(274);
					match(Digit);
					}
					}
					setState(277); 
=======
					setState(321);
					match(Digit);
					}
					}
					setState(324); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(281);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Assign - 81)) | (1L << (PlusEqual - 81)) | (1L << (MinusEqual - 81)) | (1L << (MultEqual - 81)) | (1L << (DivEqual - 81)) | (1L << (ModEqual - 81)))) != 0)) ) {
=======
			setState(328);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (Assign - 86)) | (1L << (PlusEqual - 86)) | (1L << (MinusEqual - 86)) | (1L << (MultEqual - 86)) | (1L << (DivEqual - 86)) | (1L << (ModEqual - 86)))) != 0)) ) {
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(283);
			assignmentExpression();
			setState(288);
=======
			setState(330);
			assignmentExpression();
			setState(335);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
<<<<<<< HEAD
				setState(284);
				match(Comma);
				setState(285);
				assignmentExpression();
				}
				}
				setState(290);
=======
				setState(331);
				match(Comma);
				setState(332);
				assignmentExpression();
				}
				}
				setState(337);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(291);
=======
			setState(338);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
=======
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case Begin:
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(293);
				declarationSpecifiers();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (T__15 - 13)) | (1L << (T__16 - 13)) | (1L << (T__17 - 13)) | (1L << (Identifier - 13)) | (1L << (Mult - 13)) | (1L << (Exponent - 13)) | (1L << (LeftParen - 13)))) != 0)) {
					{
					setState(294);
=======
				setState(340);
				declarationSpecifiers();
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__18 - 17)) | (1L << (T__19 - 17)) | (1L << (T__20 - 17)) | (1L << (T__21 - 17)) | (1L << (Identifier - 17)) | (1L << (Mult - 17)) | (1L << (Exponent - 17)) | (1L << (LeftParen - 17)))) != 0)) {
					{
					setState(341);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					initDeclaratorList();
					}
				}

<<<<<<< HEAD
				setState(297);
				match(SemiColon);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
=======
				setState(344);
				match(SemiColon);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(303); 
=======
			setState(350); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
<<<<<<< HEAD
					setState(302);
=======
					setState(349);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
<<<<<<< HEAD
				setState(305); 
=======
				setState(352); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(308); 
=======
			setState(355); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
<<<<<<< HEAD
				setState(307);
				declarationSpecifier();
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
=======
				setState(354);
				declarationSpecifier();
				}
				}
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Begin) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			}
		}
		catch (RecognitionException re) {
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
<<<<<<< HEAD
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
=======
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case Begin:
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(312);
				typeSpecifier();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
=======
				setState(359);
				typeSpecifier();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(316);
			initDeclarator();
			setState(321);
=======
			setState(363);
			initDeclarator();
			setState(368);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
<<<<<<< HEAD
				setState(317);
				match(Comma);
				setState(318);
				initDeclarator();
				}
				}
				setState(323);
=======
				setState(364);
				match(Comma);
				setState(365);
				initDeclarator();
				}
				}
				setState(370);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
			setState(324);
			declarator();
			setState(327);
=======
			setState(371);
			declarator();
			setState(374);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
<<<<<<< HEAD
				setState(325);
				match(Assign);
				setState(326);
=======
				setState(372);
				match(Assign);
				setState(373);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
		public ClassSpecifierContext classSpecifier() {
			return getRuleContext(ClassSpecifierContext.class,0);
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
<<<<<<< HEAD
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
=======
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(329);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void))) != 0)) ) {
=======
				setState(376);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void))) != 0)) ) {
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
<<<<<<< HEAD
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
=======
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				structOrUnionSpecifier();
				}
				break;
			case Begin:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(331);
=======
				setState(378);
				classSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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

	public static class ClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Begin() { return getToken(LucasGrammarParser.Begin, 0); }
		public TerminalNode Class() { return getToken(LucasGrammarParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(LucasGrammarParser.Identifier, 0); }
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(LucasGrammarParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(LucasGrammarParser.Colon, i);
		}
		public ClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpecifier; }
	}

	public final ClassSpecifierContext classSpecifier() throws RecognitionException {
		ClassSpecifierContext _localctx = new ClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classSpecifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(Begin);
			setState(383);
			match(Class);
			setState(384);
			match(Identifier);
			setState(387); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(387);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__23:
					case Begin:
					case BigInt:
					case Decl:
					case Char:
					case CharSeq:
					case Double:
					case Int:
					case Void:
					case Identifier:
						{
						setState(385);
						memberDeclaration();
						}
						break;
					case Colon:
						{
						setState(386);
						match(Colon);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(389); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_memberDeclaration);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
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
<<<<<<< HEAD
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
=======
		enterRule(_localctx, 56, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				structOrUnion();
				setState(398);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
<<<<<<< HEAD
					setState(335);
=======
					setState(397);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(Identifier);
					}
				}

<<<<<<< HEAD
				setState(338);
				match(T__1);
				setState(339);
				structDeclarationList();
				setState(340);
				match(T__2);
=======
				setState(400);
				match(T__5);
				setState(401);
				structDeclarationList();
				setState(402);
				match(T__6);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(342);
				structOrUnion();
				setState(343);
=======
				setState(404);
				structOrUnion();
				setState(405);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 48, RULE_structOrUnion);
=======
		enterRule(_localctx, 58, RULE_structOrUnion);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
=======
			setState(409);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 50, RULE_structDeclarationList);
=======
		enterRule(_localctx, 60, RULE_structDeclarationList);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(350); 
=======
			setState(412); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
<<<<<<< HEAD
				setState(349);
				structDeclaration();
				}
				}
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
=======
				setState(411);
				structDeclaration();
				}
				}
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			}
		}
		catch (RecognitionException re) {
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
<<<<<<< HEAD
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
=======
		enterRule(_localctx, 62, RULE_structDeclaration);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				specifierQualifierList();
				setState(417);
				structDeclaratorList();
				setState(418);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(358);
				specifierQualifierList();
				setState(359);
=======
				setState(420);
				specifierQualifierList();
				setState(421);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(361);
=======
				setState(423);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
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
=======
		enterRule(_localctx, 64, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case Begin:
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			case BigInt:
			case Char:
			case CharSeq:
			case Double:
			case Int:
			case Void:
			case Identifier:
				{
<<<<<<< HEAD
				setState(364);
				typeSpecifier();
				}
				break;
			case T__10:
				{
				setState(365);
=======
				setState(426);
				typeSpecifier();
				}
				break;
			case T__14:
				{
				setState(427);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				typeQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
<<<<<<< HEAD
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(368);
=======
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(430);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 56, RULE_structDeclaratorList);
=======
		enterRule(_localctx, 66, RULE_structDeclaratorList);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(371);
			structDeclarator();
			setState(376);
=======
			setState(433);
			structDeclarator();
			setState(438);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
<<<<<<< HEAD
				setState(372);
				match(Comma);
				setState(373);
				structDeclarator();
				}
				}
				setState(378);
=======
				setState(434);
				match(Comma);
				setState(435);
				structDeclarator();
				}
				}
				setState(440);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
		public TerminalNode Colon() { return getToken(LucasGrammarParser.Colon, 0); }
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
<<<<<<< HEAD
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
=======
		enterRule(_localctx, 68, RULE_structDeclarator);
		int _la;
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (T__15 - 13)) | (1L << (T__16 - 13)) | (1L << (T__17 - 13)) | (1L << (Identifier - 13)) | (1L << (Mult - 13)) | (1L << (Exponent - 13)) | (1L << (LeftParen - 13)))) != 0)) {
					{
					setState(380);
=======
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__18 - 17)) | (1L << (T__19 - 17)) | (1L << (T__20 - 17)) | (1L << (T__21 - 17)) | (1L << (Identifier - 17)) | (1L << (Mult - 17)) | (1L << (Exponent - 17)) | (1L << (LeftParen - 17)))) != 0)) {
					{
					setState(442);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					declarator();
					}
				}

<<<<<<< HEAD
				setState(383);
				match(T__9);
				setState(384);
=======
				setState(445);
				match(Colon);
				setState(446);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 60, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__10);
=======
		enterRule(_localctx, 70, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__14);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			}
		}
		catch (RecognitionException re) {
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
<<<<<<< HEAD
		enterRule(_localctx, 62, RULE_declarator);
=======
		enterRule(_localctx, 72, RULE_declarator);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(390);
=======
			setState(452);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mult || _la==Exponent) {
				{
<<<<<<< HEAD
				setState(389);
=======
				setState(451);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				pointer();
				}
			}

<<<<<<< HEAD
			setState(392);
=======
			setState(454);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
		public TerminalNode Colon() { return getToken(LucasGrammarParser.Colon, 0); }
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
<<<<<<< HEAD
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_directDeclarator, _p);
=======
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_directDeclarator, _p);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(395);
=======
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(457);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(Identifier);
				}
				break;
			case 2:
				{
<<<<<<< HEAD
				setState(396);
				match(LeftParen);
				setState(397);
				declarator();
				setState(398);
=======
				setState(458);
				match(LeftParen);
				setState(459);
				declarator();
				setState(460);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightParen);
				}
				break;
			case 3:
				{
<<<<<<< HEAD
				setState(400);
				match(Identifier);
				setState(401);
				match(T__9);
				setState(403); 
=======
				setState(462);
				match(Identifier);
				setState(463);
				match(Colon);
				setState(465); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< HEAD
						setState(402);
=======
						setState(464);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< HEAD
					setState(405); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
=======
					setState(467); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
<<<<<<< HEAD
				setState(407);
				vcSpecificModifer();
				setState(408);
=======
				setState(469);
				vcSpecificModifer();
				setState(470);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(Identifier);
				}
				break;
			case 5:
				{
<<<<<<< HEAD
				setState(410);
				match(LeftParen);
				setState(411);
				vcSpecificModifer();
				setState(412);
				declarator();
				setState(413);
=======
				setState(472);
				match(LeftParen);
				setState(473);
				vcSpecificModifer();
				setState(474);
				declarator();
				setState(475);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
<<<<<<< HEAD
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
=======
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
<<<<<<< HEAD
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
=======
					setState(522);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
<<<<<<< HEAD
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
=======
						setState(479);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(480);
						match(LeftBrac);
						setState(482);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__14) {
							{
							setState(481);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							typeQualifierList();
							}
						}

<<<<<<< HEAD
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
							{
							setState(422);
=======
						setState(485);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
							{
							setState(484);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							assignmentExpression();
							}
						}

<<<<<<< HEAD
						setState(425);
=======
						setState(487);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
<<<<<<< HEAD
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
=======
						setState(488);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(489);
						match(LeftBrac);
						setState(490);
						match(T__15);
						setState(492);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__14) {
							{
							setState(491);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							typeQualifierList();
							}
						}

<<<<<<< HEAD
						setState(432);
						assignmentExpression();
						setState(433);
=======
						setState(494);
						assignmentExpression();
						setState(495);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
<<<<<<< HEAD
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
=======
						setState(497);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(498);
						match(LeftBrac);
						setState(499);
						typeQualifierList();
						setState(500);
						match(T__15);
						setState(501);
						assignmentExpression();
						setState(502);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
<<<<<<< HEAD
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
=======
						setState(504);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(505);
						match(LeftBrac);
						setState(507);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__14) {
							{
							setState(506);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							typeQualifierList();
							}
						}

<<<<<<< HEAD
						setState(447);
						match(Mult);
						setState(448);
=======
						setState(509);
						match(Mult);
						setState(510);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
<<<<<<< HEAD
						setState(449);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(450);
						match(LeftParen);
						setState(451);
						parameterTypeList();
						setState(452);
=======
						setState(511);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(512);
						match(LeftParen);
						setState(513);
						parameterTypeList();
						setState(514);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
<<<<<<< HEAD
						setState(454);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(455);
						match(LeftParen);
						setState(457);
=======
						setState(516);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(517);
						match(LeftParen);
						setState(519);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
<<<<<<< HEAD
							setState(456);
=======
							setState(518);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							identifierList();
							}
						}

<<<<<<< HEAD
						setState(459);
=======
						setState(521);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightParen);
						}
						break;
					}
					} 
				}
<<<<<<< HEAD
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
=======
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 66, RULE_vcSpecificModifer);
=======
		enterRule(_localctx, 76, RULE_vcSpecificModifer);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(465);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
=======
			setState(527);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 68, RULE_nestedParenthesesBlock);
=======
		enterRule(_localctx, 78, RULE_nestedParenthesesBlock);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Function) | (1L << Else) | (1L << End) | (1L << For) | (1L << Int) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << TE) | (1L << LE) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Div) | (1L << Mod) | (1L << Tilde) | (1L << Exponent) | (1L << LessThan) | (1L << GreaterThan) | (1L << Equality) | (1L << Inequality) | (1L << LessThanEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Comma - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (DivEqual - 64)) | (1L << (ModEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(472);
=======
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Decl) | (1L << Expr) | (1L << Public) | (1L << Private) | (1L << TypeOf) | (1L << Vector) | (1L << Case) | (1L << Char) | (1L << Class) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Function) | (1L << Else) | (1L << End) | (1L << For) | (1L << Int) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << TE) | (1L << LE) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Div) | (1L << Mod) | (1L << Tilde) | (1L << Exponent) | (1L << LessThan))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GreaterThan - 64)) | (1L << (Equality - 64)) | (1L << (Inequality - 64)) | (1L << (LessThanEqual - 64)) | (1L << (GreaterThanEqual - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalNot - 64)) | (1L << (Dot - 64)) | (1L << (Arrow - 64)) | (1L << (ClassSpec - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBrac - 64)) | (1L << (RightBrac - 64)) | (1L << (SemiColon - 64)) | (1L << (Comma - 64)) | (1L << (Increment - 64)) | (1L << (Decrement - 64)) | (1L << (RightShift - 64)) | (1L << (LeftShift - 64)) | (1L << (Colon - 64)) | (1L << (Assign - 64)) | (1L << (LeftShiftEqual - 64)) | (1L << (RightShiftEqual - 64)) | (1L << (PlusEqual - 64)) | (1L << (MinusEqual - 64)) | (1L << (MultEqual - 64)) | (1L << (DivEqual - 64)) | (1L << (ModEqual - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(534);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
=======
				case T__20:
				case T__21:
				case T__22:
				case T__23:
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
				case Colon:
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
<<<<<<< HEAD
					setState(467);
=======
					setState(529);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
					setState(468);
					match(LeftParen);
					setState(469);
					nestedParenthesesBlock();
					setState(470);
=======
					setState(530);
					match(LeftParen);
					setState(531);
					nestedParenthesesBlock();
					setState(532);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
<<<<<<< HEAD
				setState(476);
=======
				setState(538);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 70, RULE_pointer);
=======
		enterRule(_localctx, 80, RULE_pointer);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(481); 
=======
			setState(543); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
<<<<<<< HEAD
				setState(477);
=======
				setState(539);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_la = _input.LA(1);
				if ( !(_la==Mult || _la==Exponent) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(478);
=======
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(540);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					typeQualifierList();
					}
				}

				}
				}
<<<<<<< HEAD
				setState(483); 
=======
				setState(545); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 72, RULE_typeQualifierList);
=======
		enterRule(_localctx, 82, RULE_typeQualifierList);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(486); 
=======
			setState(548); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
<<<<<<< HEAD
				setState(485);
				typeQualifier();
				}
				}
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
=======
				setState(547);
				typeQualifier();
				}
				}
				setState(550); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			}
		}
		catch (RecognitionException re) {
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
<<<<<<< HEAD
		enterRule(_localctx, 74, RULE_parameterTypeList);
=======
		enterRule(_localctx, 84, RULE_parameterTypeList);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(490);
			parameterList();
			setState(493);
=======
			setState(552);
			parameterList();
			setState(555);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
<<<<<<< HEAD
				setState(491);
				match(Comma);
				setState(492);
				match(T__18);
=======
				setState(553);
				match(Comma);
				setState(554);
				match(T__22);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 76, RULE_parameterList);
=======
		enterRule(_localctx, 86, RULE_parameterList);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(495);
			parameterDeclaration();
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
=======
			setState(557);
			parameterDeclaration();
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(496);
					match(Comma);
					setState(497);
=======
					setState(558);
					match(Comma);
					setState(559);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					parameterDeclaration();
					}
					} 
				}
<<<<<<< HEAD
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
=======
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
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
=======
		enterRule(_localctx, 88, RULE_parameterDeclaration);
		int _la;
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				declarationSpecifiers();
				setState(566);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(506);
				declarationSpecifiers2();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (Mult - 54)) | (1L << (Exponent - 54)) | (1L << (LeftParen - 54)) | (1L << (LeftBrac - 54)))) != 0)) {
					{
					setState(507);
=======
				setState(568);
				declarationSpecifiers2();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (Mult - 58)) | (1L << (Exponent - 58)) | (1L << (LeftParen - 58)) | (1L << (LeftBrac - 58)))) != 0)) {
					{
					setState(569);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 80, RULE_identifierList);
=======
		enterRule(_localctx, 90, RULE_identifierList);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(512);
			match(Identifier);
			setState(517);
=======
			setState(574);
			match(Identifier);
			setState(579);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
<<<<<<< HEAD
				setState(513);
				match(Comma);
				setState(514);
				match(Identifier);
				}
				}
				setState(519);
=======
				setState(575);
				match(Comma);
				setState(576);
				match(Identifier);
				}
				}
				setState(581);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 82, RULE_typeName);
=======
		enterRule(_localctx, 92, RULE_typeName);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(520);
			specifierQualifierList();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (Mult - 54)) | (1L << (Exponent - 54)) | (1L << (LeftParen - 54)) | (1L << (LeftBrac - 54)))) != 0)) {
				{
				setState(521);
=======
			setState(582);
			specifierQualifierList();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (Mult - 58)) | (1L << (Exponent - 58)) | (1L << (LeftParen - 58)) | (1L << (LeftBrac - 58)))) != 0)) {
				{
				setState(583);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
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
=======
		enterRule(_localctx, 94, RULE_abstractDeclarator);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(526);
=======
				setState(588);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Mult || _la==Exponent) {
					{
<<<<<<< HEAD
					setState(525);
=======
					setState(587);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					pointer();
					}
				}

<<<<<<< HEAD
				setState(528);
=======
				setState(590);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_directAbstractDeclarator, _p);
=======
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_directAbstractDeclarator, _p);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
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
=======
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(594);
				match(LeftParen);
				setState(595);
				abstractDeclarator();
				setState(596);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightParen);
				}
				break;
			case 2:
				{
<<<<<<< HEAD
				setState(536);
				match(LeftBrac);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(537);
=======
				setState(598);
				match(LeftBrac);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(599);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					typeQualifierList();
					}
				}

<<<<<<< HEAD
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
					{
					setState(540);
=======
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
					{
					setState(602);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					assignmentExpression();
					}
				}

<<<<<<< HEAD
				setState(543);
=======
				setState(605);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightBrac);
				}
				break;
			case 3:
				{
<<<<<<< HEAD
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
=======
				setState(606);
				match(LeftBrac);
				setState(607);
				match(T__15);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(608);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					typeQualifierList();
					}
				}

<<<<<<< HEAD
				setState(549);
				assignmentExpression();
				setState(550);
=======
				setState(611);
				assignmentExpression();
				setState(612);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightBrac);
				}
				break;
			case 4:
				{
<<<<<<< HEAD
				setState(552);
				match(LeftBrac);
				setState(553);
				typeQualifierList();
				setState(554);
				match(T__11);
				setState(555);
				assignmentExpression();
				setState(556);
=======
				setState(614);
				match(LeftBrac);
				setState(615);
				typeQualifierList();
				setState(616);
				match(T__15);
				setState(617);
				assignmentExpression();
				setState(618);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightBrac);
				}
				break;
			case 5:
				{
<<<<<<< HEAD
				setState(558);
				match(LeftBrac);
				setState(559);
				match(Mult);
				setState(560);
=======
				setState(620);
				match(LeftBrac);
				setState(621);
				match(Mult);
				setState(622);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightBrac);
				}
				break;
			case 6:
				{
<<<<<<< HEAD
				setState(561);
				match(LeftParen);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
					{
					setState(562);
=======
				setState(623);
				match(LeftParen);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Begin) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
					{
					setState(624);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					parameterTypeList();
					}
				}

<<<<<<< HEAD
				setState(565);
=======
				setState(627);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
<<<<<<< HEAD
			setState(605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
=======
			setState(667);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
<<<<<<< HEAD
					setState(603);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
=======
					setState(665);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
<<<<<<< HEAD
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
=======
						setState(630);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(631);
						match(LeftBrac);
						setState(633);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__14) {
							{
							setState(632);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							typeQualifierList();
							}
						}

<<<<<<< HEAD
						setState(574);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
							{
							setState(573);
=======
						setState(636);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
							{
							setState(635);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							assignmentExpression();
							}
						}

<<<<<<< HEAD
						setState(576);
=======
						setState(638);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightBrac);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
<<<<<<< HEAD
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
=======
						setState(639);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(640);
						match(LeftBrac);
						setState(641);
						match(T__15);
						setState(643);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__14) {
							{
							setState(642);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							typeQualifierList();
							}
						}

<<<<<<< HEAD
						setState(583);
						assignmentExpression();
						setState(584);
=======
						setState(645);
						assignmentExpression();
						setState(646);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightBrac);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
<<<<<<< HEAD
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
=======
						setState(648);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(649);
						match(LeftBrac);
						setState(650);
						typeQualifierList();
						setState(651);
						match(T__15);
						setState(652);
						assignmentExpression();
						setState(653);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightBrac);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
<<<<<<< HEAD
						setState(593);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(594);
						match(LeftBrac);
						setState(595);
						match(Mult);
						setState(596);
=======
						setState(655);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(656);
						match(LeftBrac);
						setState(657);
						match(Mult);
						setState(658);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightBrac);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
<<<<<<< HEAD
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
=======
						setState(659);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(660);
						match(LeftParen);
						setState(662);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Begin) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
							{
							setState(661);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							parameterTypeList();
							}
						}

<<<<<<< HEAD
						setState(602);
=======
						setState(664);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightParen);
						}
						break;
					}
					} 
				}
<<<<<<< HEAD
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
=======
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 88, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
=======
		enterRule(_localctx, 98, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 90, RULE_initializer);
		int _la;
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
=======
		enterRule(_localctx, 100, RULE_initializer);
		int _la;
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__8:
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
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
=======
				setState(672);
				assignmentExpression();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(T__5);
				setState(674);
				initializerList();
				setState(676);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
<<<<<<< HEAD
					setState(613);
=======
					setState(675);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(Comma);
					}
				}

<<<<<<< HEAD
				setState(616);
				match(T__2);
=======
				setState(678);
				match(T__6);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 92, RULE_initializerList);
=======
		enterRule(_localctx, 102, RULE_initializerList);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(621);
=======
			setState(683);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot || _la==LeftBrac) {
				{
<<<<<<< HEAD
				setState(620);
=======
				setState(682);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				designation();
				}
			}

<<<<<<< HEAD
			setState(623);
			initializer();
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
=======
			setState(685);
			initializer();
			setState(693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(624);
					match(Comma);
					setState(626);
=======
					setState(686);
					match(Comma);
					setState(688);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Dot || _la==LeftBrac) {
						{
<<<<<<< HEAD
						setState(625);
=======
						setState(687);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						designation();
						}
					}

<<<<<<< HEAD
					setState(628);
=======
					setState(690);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					initializer();
					}
					} 
				}
<<<<<<< HEAD
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
=======
				setState(695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 94, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			designatorList();
			setState(635);
=======
		enterRule(_localctx, 104, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			designatorList();
			setState(697);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 96, RULE_designatorList);
=======
		enterRule(_localctx, 106, RULE_designatorList);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(638); 
=======
			setState(700); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
<<<<<<< HEAD
				setState(637);
				designator();
				}
				}
				setState(640); 
=======
				setState(699);
				designator();
				}
				}
				setState(702); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 98, RULE_designator);
		try {
			setState(648);
=======
		enterRule(_localctx, 108, RULE_designator);
		try {
			setState(710);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrac:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(642);
				match(LeftBrac);
				setState(643);
				constantExpression();
				setState(644);
=======
				setState(704);
				match(LeftBrac);
				setState(705);
				constantExpression();
				setState(706);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightBrac);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(646);
				match(Dot);
				setState(647);
=======
				setState(708);
				match(Dot);
				setState(709);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 100, RULE_staticAssertDeclaration);
=======
		enterRule(_localctx, 110, RULE_staticAssertDeclaration);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(650);
			match(T__19);
			setState(651);
			match(LeftParen);
			setState(652);
			constantExpression();
			setState(653);
			match(Comma);
			setState(655); 
=======
			setState(712);
			match(T__23);
			setState(713);
			match(LeftParen);
			setState(714);
			constantExpression();
			setState(715);
			match(Comma);
			setState(717); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
<<<<<<< HEAD
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
=======
				setState(716);
				match(StringLiteral);
				}
				}
				setState(719); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(721);
			match(RightParen);
			setState(722);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 102, RULE_statement);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
=======
		enterRule(_localctx, 112, RULE_statement);
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(663);
=======
				setState(725);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				selectionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(664);
=======
				setState(726);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				iterationStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(665);
=======
				setState(727);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 104, RULE_expressionStatement);
=======
		enterRule(_localctx, 114, RULE_expressionStatement);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
				{
				setState(668);
=======
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
				{
				setState(730);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				expression();
				}
			}

<<<<<<< HEAD
			setState(671);
=======
			setState(733);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 106, RULE_selectionStatement);
=======
		enterRule(_localctx, 116, RULE_selectionStatement);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(673);
			match(Begin);
			setState(674);
			match(If);
			setState(678);
=======
			setState(735);
			match(Begin);
			setState(736);
			match(If);
			setState(740);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrac) {
				{
<<<<<<< HEAD
				setState(675);
				match(LeftBrac);
				setState(676);
				match(Identifier);
				setState(677);
=======
				setState(737);
				match(LeftBrac);
				setState(738);
				match(Identifier);
				setState(739);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightBrac);
				}
			}

<<<<<<< HEAD
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
=======
			setState(742);
			match(LeftParen);
			setState(743);
			expression();
			setState(744);
			match(RightParen);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (SemiColon - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
				{
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(745);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					statement();
					}
					break;
				case 2:
					{
<<<<<<< HEAD
					setState(684);
=======
					setState(746);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					declaration();
					}
					break;
				}
				}
<<<<<<< HEAD
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
=======
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
			match(End);
			setState(753);
			match(If);
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(754);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(Identifier);
				}
				break;
			}
<<<<<<< HEAD
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
=======
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(695);
					match(Begin);
					setState(696);
					match(Else);
					setState(697);
					match(If);
					setState(701);
=======
					setState(757);
					match(Begin);
					setState(758);
					match(Else);
					setState(759);
					match(If);
					setState(763);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBrac) {
						{
<<<<<<< HEAD
						setState(698);
						match(LeftBrac);
						setState(699);
						match(Identifier);
						setState(700);
=======
						setState(760);
						match(LeftBrac);
						setState(761);
						match(Identifier);
						setState(762);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(RightBrac);
						}
					}

<<<<<<< HEAD
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
=======
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (SemiColon - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
						{
						setState(767);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
						case 1:
							{
							setState(765);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							statement();
							}
							break;
						case 2:
							{
<<<<<<< HEAD
							setState(704);
=======
							setState(766);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
							declaration();
							}
							break;
						}
						}
<<<<<<< HEAD
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
=======
						setState(771);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(772);
					match(End);
					setState(773);
					match(Else);
					setState(774);
					match(If);
					setState(776);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						setState(775);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						match(Identifier);
						}
						break;
					}
					}
					} 
				}
<<<<<<< HEAD
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
=======
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(783);
				match(Begin);
				setState(784);
				match(Else);
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (SemiColon - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
					{
					setState(787);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						setState(785);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						statement();
						}
						break;
					case 2:
						{
<<<<<<< HEAD
						setState(724);
=======
						setState(786);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						declaration();
						}
						break;
					}
					}
<<<<<<< HEAD
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				match(End);
				setState(731);
=======
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(792);
				match(End);
				setState(793);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
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
=======
		enterRule(_localctx, 118, RULE_iterationStatement);
		int _la;
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(Begin);
				setState(797);
				match(While);
				setState(801);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrac) {
					{
<<<<<<< HEAD
					setState(736);
					match(LeftBrac);
					setState(737);
					match(Identifier);
					setState(738);
=======
					setState(798);
					match(LeftBrac);
					setState(799);
					match(Identifier);
					setState(800);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(RightBrac);
					}
				}

<<<<<<< HEAD
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
=======
				setState(803);
				match(LeftParen);
				setState(804);
				expression();
				setState(805);
				match(RightParen);
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (SemiColon - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
					{
					setState(808);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						setState(806);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						statement();
						}
						break;
					case 2:
						{
<<<<<<< HEAD
						setState(745);
=======
						setState(807);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						declaration();
						}
						break;
					}
					}
<<<<<<< HEAD
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
=======
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(813);
				match(End);
				setState(814);
				match(While);
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(815);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(756);
				match(Begin);
				setState(757);
				match(For);
				setState(761);
=======
				setState(818);
				match(Begin);
				setState(819);
				match(For);
				setState(823);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrac) {
					{
<<<<<<< HEAD
					setState(758);
					match(LeftBrac);
					setState(759);
					match(Identifier);
					setState(760);
=======
					setState(820);
					match(LeftBrac);
					setState(821);
					match(Identifier);
					setState(822);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(RightBrac);
					}
				}

<<<<<<< HEAD
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
=======
				setState(825);
				match(LeftParen);
				setState(826);
				forCondition();
				setState(827);
				match(RightParen);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (SemiColon - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
					{
					setState(830);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						setState(828);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						statement();
						}
						break;
					case 2:
						{
<<<<<<< HEAD
						setState(767);
=======
						setState(829);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
						declaration();
						}
						break;
					}
					}
<<<<<<< HEAD
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
=======
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(835);
				match(End);
				setState(836);
				match(For);
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(837);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 110, RULE_forCondition);
=======
		enterRule(_localctx, 120, RULE_forCondition);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(780);
=======
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(842);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				forDeclaration();
				}
				break;
			case 2:
				{
<<<<<<< HEAD
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
					{
					setState(781);
=======
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
					{
					setState(843);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					expression();
					}
				}

				}
				break;
			}
<<<<<<< HEAD
			setState(786);
			match(SemiColon);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
				{
				setState(787);
=======
			setState(848);
			match(SemiColon);
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
				{
				setState(849);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				forExpression();
				}
			}

<<<<<<< HEAD
			setState(790);
			match(SemiColon);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
				{
				setState(791);
=======
			setState(852);
			match(SemiColon);
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
				{
				setState(853);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 112, RULE_forDeclaration);
=======
		enterRule(_localctx, 122, RULE_forDeclaration);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(794);
			declarationSpecifiers();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (T__15 - 13)) | (1L << (T__16 - 13)) | (1L << (T__17 - 13)) | (1L << (Identifier - 13)) | (1L << (Mult - 13)) | (1L << (Exponent - 13)) | (1L << (LeftParen - 13)))) != 0)) {
				{
				setState(795);
=======
			setState(856);
			declarationSpecifiers();
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__18 - 17)) | (1L << (T__19 - 17)) | (1L << (T__20 - 17)) | (1L << (T__21 - 17)) | (1L << (Identifier - 17)) | (1L << (Mult - 17)) | (1L << (Exponent - 17)) | (1L << (LeftParen - 17)))) != 0)) {
				{
				setState(857);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 114, RULE_forExpression);
=======
		enterRule(_localctx, 124, RULE_forExpression);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(798);
			assignmentExpression();
			setState(803);
=======
			setState(860);
			assignmentExpression();
			setState(865);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
<<<<<<< HEAD
				setState(799);
				match(Comma);
				setState(800);
				assignmentExpression();
				}
				}
				setState(805);
=======
				setState(861);
				match(Comma);
				setState(862);
				assignmentExpression();
				}
				}
				setState(867);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 116, RULE_jumpStatement);
=======
		enterRule(_localctx, 126, RULE_jumpStatement);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(815);
=======
			setState(877);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				{
				}
				break;
			case Break:
			case Continue:
				{
<<<<<<< HEAD
				setState(807);
=======
				setState(869);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(809);
=======
				setState(871);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
<<<<<<< HEAD
					setState(808);
=======
					setState(870);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					match(Identifier);
					}
				}

				}
				break;
			case Return:
				{
<<<<<<< HEAD
				setState(811);
				match(Return);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
					{
					setState(812);
=======
				setState(873);
				match(Return);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
					{
					setState(874);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
<<<<<<< HEAD
			setState(817);
=======
			setState(879);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 118, RULE_compilationUnit);
=======
		enterRule(_localctx, 128, RULE_compilationUnit);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon) {
				{
				setState(819);
=======
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon) {
				{
				setState(881);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				translationUnit();
				}
			}

<<<<<<< HEAD
			setState(822);
=======
			setState(884);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 120, RULE_translationUnit);
=======
		enterRule(_localctx, 130, RULE_translationUnit);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(825); 
=======
			setState(887); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
<<<<<<< HEAD
				setState(824);
				externalDeclaration();
				}
				}
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon );
=======
				setState(886);
				externalDeclaration();
				}
				}
				setState(889); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Decl) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) || _la==SemiColon );
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			}
		}
		catch (RecognitionException re) {
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
<<<<<<< HEAD
		enterRule(_localctx, 122, RULE_externalDeclaration);
		try {
			setState(833);
=======
		enterRule(_localctx, 132, RULE_externalDeclaration);
		try {
			setState(895);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(829);
=======
				setState(891);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
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
=======
				setState(892);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(832);
=======
				setState(894);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 124, RULE_functionDeclaration);
=======
		enterRule(_localctx, 134, RULE_functionDeclaration);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
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
=======
			setState(897);
			match(Decl);
			setState(898);
			match(Function);
			setState(899);
			match(Identifier);
			setState(900);
			match(LeftParen);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Begin) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(901);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				parameterTypeList();
				}
			}

<<<<<<< HEAD
			setState(842);
			match(RightParen);
			setState(848);
=======
			setState(904);
			match(RightParen);
			setState(910);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
<<<<<<< HEAD
				setState(843);
				match(Arrow);
				setState(844);
				match(LeftParen);
				setState(845);
				parameterList();
				setState(846);
=======
				setState(905);
				match(Arrow);
				setState(906);
				match(LeftParen);
				setState(907);
				parameterList();
				setState(908);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightParen);
				}
			}

<<<<<<< HEAD
			setState(850);
=======
			setState(912);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 126, RULE_functionDefinition);
=======
		enterRule(_localctx, 136, RULE_functionDefinition);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
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
=======
			setState(914);
			match(Begin);
			setState(915);
			match(Function);
			setState(916);
			match(Identifier);
			setState(917);
			match(LeftParen);
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Begin) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(918);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				parameterTypeList();
				}
			}

<<<<<<< HEAD
			setState(859);
			match(RightParen);
			setState(865);
=======
			setState(921);
			match(RightParen);
			setState(927);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
<<<<<<< HEAD
				setState(860);
				match(Arrow);
				setState(861);
				match(LeftParen);
				setState(862);
				parameterList();
				setState(863);
=======
				setState(922);
				match(Arrow);
				setState(923);
				match(LeftParen);
				setState(924);
				parameterList();
				setState(925);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				match(RightParen);
				}
			}

<<<<<<< HEAD
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LogicalAnd - 65)) | (1L << (LogicalNot - 65)) | (1L << (LeftParen - 65)) | (1L << (SemiColon - 65)) | (1L << (Increment - 65)) | (1L << (Decrement - 65)))) != 0)) {
				{
				setState(869);
=======
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Break) | (1L << Char) | (1L << CharSeq) | (1L << Continue) | (1L << Double) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << Identifier) | (1L << Literal) | (1L << Digit) | (1L << StringLiteral) | (1L << Add) | (1L << Sub) | (1L << Mult) | (1L << Tilde))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LogicalAnd - 69)) | (1L << (LogicalNot - 69)) | (1L << (LeftParen - 69)) | (1L << (SemiColon - 69)) | (1L << (Increment - 69)) | (1L << (Decrement - 69)))) != 0)) {
				{
				setState(931);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
<<<<<<< HEAD
					setState(867);
=======
					setState(929);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					statement();
					}
					break;
				case 2:
					{
<<<<<<< HEAD
					setState(868);
=======
					setState(930);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
					declaration();
					}
					break;
				}
				}
<<<<<<< HEAD
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874);
			match(End);
			setState(875);
			match(Function);
			setState(877);
=======
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(936);
			match(End);
			setState(937);
			match(Function);
			setState(939);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(876);
=======
				setState(938);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		enterRule(_localctx, 128, RULE_declarationList);
=======
		enterRule(_localctx, 138, RULE_declarationList);
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(880); 
=======
			setState(942); 
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
<<<<<<< HEAD
				setState(879);
				declaration();
				}
				}
				setState(882); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__19) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
=======
				setState(941);
				declaration();
				}
				}
				setState(944); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__23) | (1L << Begin) | (1L << BigInt) | (1L << Char) | (1L << CharSeq) | (1L << Double) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0) );
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
			}
		}
		catch (RecognitionException re) {
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
<<<<<<< HEAD
		case 32:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 43:
=======
		case 37:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 48:
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
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
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u0377\4\2\t\2\4"+
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3c\u03b5\4\2\t\2\4"+
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
<<<<<<< HEAD
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
=======
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\6\2\u0092\n\2\r\2\16\2\u0093\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00a9\n\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\7\4\u00b5\n\4\f\4\16\4\u00b8\13\4\3\5\3\5\5\5\u00bc"+
		"\n\5\3\5\3\5\3\5\3\6\3\6\5\6\u00c3\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cb"+
		"\n\6\3\6\3\6\5\6\u00cf\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d7\n\6\3\6\3"+
		"\6\3\6\3\6\7\6\u00dd\n\6\f\6\16\6\u00e0\13\6\3\7\3\7\3\7\7\7\u00e5\n\7"+
		"\f\7\16\7\u00e8\13\7\3\b\7\b\u00eb\n\b\f\b\16\b\u00ee\13\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fb\n\b\3\t\3\t\3\n\5\n\u0100\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0109\n\n\r\n\16\n\u010a\5\n\u010d"+
		"\n\n\3\13\3\13\3\13\7\13\u0112\n\13\f\13\16\13\u0115\13\13\3\f\3\f\3\f"+
		"\7\f\u011a\n\f\f\f\16\f\u011d\13\f\3\r\3\r\3\r\7\r\u0122\n\r\f\r\16\r"+
		"\u0125\13\r\3\16\3\16\3\16\7\16\u012a\n\16\f\16\16\16\u012d\13\16\3\17"+
		"\3\17\3\17\7\17\u0132\n\17\f\17\16\17\u0135\13\17\3\20\3\20\3\20\7\20"+
		"\u013a\n\20\f\20\16\20\u013d\13\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21"+
		"\u0145\n\21\r\21\16\21\u0146\5\21\u0149\n\21\3\22\3\22\3\23\3\23\3\23"+
		"\7\23\u0150\n\23\f\23\16\23\u0153\13\23\3\24\3\24\3\25\3\25\5\25\u0159"+
		"\n\25\3\25\3\25\3\25\5\25\u015e\n\25\3\26\6\26\u0161\n\26\r\26\16\26\u0162"+
		"\3\27\6\27\u0166\n\27\r\27\16\27\u0167\3\30\3\30\5\30\u016c\n\30\3\31"+
		"\3\31\3\31\7\31\u0171\n\31\f\31\16\31\u0174\13\31\3\32\3\32\3\32\5\32"+
		"\u0179\n\32\3\33\3\33\3\33\3\33\5\33\u017f\n\33\3\34\3\34\3\34\3\34\3"+
		"\34\6\34\u0186\n\34\r\34\16\34\u0187\3\35\3\35\3\35\5\35\u018d\n\35\3"+
		"\36\3\36\5\36\u0191\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u019a"+
		"\n\36\3\37\3\37\3 \6 \u019f\n \r \16 \u01a0\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u01ab\n!\3\"\3\"\5\"\u01af\n\"\3\"\5\"\u01b2\n\"\3#\3#\3#\7#\u01b7\n"+
		"#\f#\16#\u01ba\13#\3$\3$\5$\u01be\n$\3$\3$\5$\u01c2\n$\3%\3%\3&\5&\u01c7"+
		"\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\6\'\u01d4\n\'\r\'\16\'\u01d5"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01e0\n\'\3\'\3\'\3\'\5\'\u01e5\n"+
		"\'\3\'\5\'\u01e8\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u01ef\n\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01fe\n\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u020a\n\'\3\'\7\'\u020d\n\'\f\'\16\'\u0210\13"+
		"\'\3(\3(\3)\3)\3)\3)\3)\7)\u0219\n)\f)\16)\u021c\13)\3*\3*\5*\u0220\n"+
		"*\6*\u0222\n*\r*\16*\u0223\3+\6+\u0227\n+\r+\16+\u0228\3,\3,\3,\5,\u022e"+
		"\n,\3-\3-\3-\7-\u0233\n-\f-\16-\u0236\13-\3.\3.\3.\3.\3.\5.\u023d\n.\5"+
		".\u023f\n.\3/\3/\3/\7/\u0244\n/\f/\16/\u0247\13/\3\60\3\60\5\60\u024b"+
		"\n\60\3\61\3\61\5\61\u024f\n\61\3\61\5\61\u0252\n\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u025b\n\62\3\62\5\62\u025e\n\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0264\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u0274\n\62\3\62\5\62\u0277\n\62\3\62\3\62\3"+
		"\62\5\62\u027c\n\62\3\62\5\62\u027f\n\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u0286\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u0299\n\62\3\62\7\62\u029c\n\62\f\62\16"+
		"\62\u029f\13\62\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u02a7\n\64\3\64\3\64"+
		"\5\64\u02ab\n\64\3\65\5\65\u02ae\n\65\3\65\3\65\3\65\5\65\u02b3\n\65\3"+
		"\65\7\65\u02b6\n\65\f\65\16\65\u02b9\13\65\3\66\3\66\3\66\3\67\6\67\u02bf"+
		"\n\67\r\67\16\67\u02c0\38\38\38\38\38\38\58\u02c9\n8\39\39\39\39\39\6"+
		"9\u02d0\n9\r9\169\u02d1\39\39\39\3:\3:\3:\3:\5:\u02db\n:\3;\5;\u02de\n"+
		";\3;\3;\3<\3<\3<\3<\3<\5<\u02e7\n<\3<\3<\3<\3<\3<\7<\u02ee\n<\f<\16<\u02f1"+
		"\13<\3<\3<\3<\5<\u02f6\n<\3<\3<\3<\3<\3<\3<\5<\u02fe\n<\3<\3<\7<\u0302"+
		"\n<\f<\16<\u0305\13<\3<\3<\3<\3<\5<\u030b\n<\7<\u030d\n<\f<\16<\u0310"+
		"\13<\3<\3<\3<\3<\7<\u0316\n<\f<\16<\u0319\13<\3<\3<\5<\u031d\n<\3=\3="+
		"\3=\3=\3=\5=\u0324\n=\3=\3=\3=\3=\3=\7=\u032b\n=\f=\16=\u032e\13=\3=\3"+
		"=\3=\5=\u0333\n=\3=\3=\3=\3=\3=\5=\u033a\n=\3=\3=\3=\3=\3=\7=\u0341\n"+
		"=\f=\16=\u0344\13=\3=\3=\3=\5=\u0349\n=\5=\u034b\n=\3>\3>\5>\u034f\n>"+
		"\5>\u0351\n>\3>\3>\5>\u0355\n>\3>\3>\5>\u0359\n>\3?\3?\5?\u035d\n?\3@"+
		"\3@\3@\7@\u0362\n@\f@\16@\u0365\13@\3A\3A\3A\5A\u036a\nA\3A\3A\5A\u036e"+
		"\nA\5A\u0370\nA\3A\3A\3B\5B\u0375\nB\3B\3B\3C\6C\u037a\nC\rC\16C\u037b"+
		"\3D\3D\3D\3D\5D\u0382\nD\3E\3E\3E\3E\3E\5E\u0389\nE\3E\3E\3E\3E\3E\3E"+
		"\5E\u0391\nE\3E\3E\3F\3F\3F\3F\3F\5F\u039a\nF\3F\3F\3F\3F\3F\3F\5F\u03a2"+
		"\nF\3F\3F\7F\u03a6\nF\fF\16F\u03a9\13F\3F\3F\3F\5F\u03ae\nF\3G\6G\u03b1"+
		"\nG\rG\16G\u03b2\3G\2\4LbH\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\2\22\3\2JK\3\2ST\4\2\n\nST\3\2\n\13\5\2:<??I"+
		"I\3\2<>\3\2:;\4\2ABEF\3\2CD\4\2XX[_\t\2\f\16\34\34%%\'\'))..\62\62\3\2"+
		"\17\20\3\2\23\30\3\2MN\4\2<<@@\4\2\35\35((\2\u0412\2\u00a8\3\2\2\2\4\u00aa"+
		"\3\2\2\2\6\u00b1\3\2\2\2\b\u00bb\3\2\2\2\n\u00ce\3\2\2\2\f\u00e1\3\2\2"+
		"\2\16\u00ec\3\2\2\2\20\u00fc\3\2\2\2\22\u010c\3\2\2\2\24\u010e\3\2\2\2"+
		"\26\u0116\3\2\2\2\30\u011e\3\2\2\2\32\u0126\3\2\2\2\34\u012e\3\2\2\2\36"+
		"\u0136\3\2\2\2 \u0148\3\2\2\2\"\u014a\3\2\2\2$\u014c\3\2\2\2&\u0154\3"+
		"\2\2\2(\u015d\3\2\2\2*\u0160\3\2\2\2,\u0165\3\2\2\2.\u016b\3\2\2\2\60"+
		"\u016d\3\2\2\2\62\u0175\3\2\2\2\64\u017e\3\2\2\2\66\u0180\3\2\2\28\u018c"+
		"\3\2\2\2:\u0199\3\2\2\2<\u019b\3\2\2\2>\u019e\3\2\2\2@\u01aa\3\2\2\2B"+
		"\u01ae\3\2\2\2D\u01b3\3\2\2\2F\u01c1\3\2\2\2H\u01c3\3\2\2\2J\u01c6\3\2"+
		"\2\2L\u01df\3\2\2\2N\u0211\3\2\2\2P\u021a\3\2\2\2R\u0221\3\2\2\2T\u0226"+
		"\3\2\2\2V\u022a\3\2\2\2X\u022f\3\2\2\2Z\u023e\3\2\2\2\\\u0240\3\2\2\2"+
		"^\u0248\3\2\2\2`\u0251\3\2\2\2b\u0276\3\2\2\2d\u02a0\3\2\2\2f\u02aa\3"+
		"\2\2\2h\u02ad\3\2\2\2j\u02ba\3\2\2\2l\u02be\3\2\2\2n\u02c8\3\2\2\2p\u02ca"+
		"\3\2\2\2r\u02da\3\2\2\2t\u02dd\3\2\2\2v\u02e1\3\2\2\2x\u034a\3\2\2\2z"+
		"\u0350\3\2\2\2|\u035a\3\2\2\2~\u035e\3\2\2\2\u0080\u036f\3\2\2\2\u0082"+
		"\u0374\3\2\2\2\u0084\u0379\3\2\2\2\u0086\u0381\3\2\2\2\u0088\u0383\3\2"+
		"\2\2\u008a\u0394\3\2\2\2\u008c\u03b0\3\2\2\2\u008e\u00a9\7\66\2\2\u008f"+
		"\u00a9\7\67\2\2\u0090\u0092\79\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00a9\3\2\2\2\u0095"+
		"\u0096\7M\2\2\u0096\u0097\5$\23\2\u0097\u0098\7N\2\2\u0098\u00a9\3\2\2"+
		"\2\u0099\u00a9\5\4\3\2\u009a\u009b\7\3\2\2\u009b\u009c\7M\2\2\u009c\u009d"+
		"\5\16\b\2\u009d\u009e\7R\2\2\u009e\u009f\5^\60\2\u009f\u00a0\7N\2\2\u00a0"+
		"\u00a9\3\2\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\7M\2\2\u00a3\u00a4\5^\60"+
		"\2\u00a4\u00a5\7R\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\7N\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u008e\3\2\2\2\u00a8\u008f\3\2\2\2\u00a8\u0091\3\2\2\2\u00a8"+
		"\u0095\3\2\2\2\u00a8\u0099\3\2\2\2\u00a8\u009a\3\2\2\2\u00a8\u00a1\3\2"+
		"\2\2\u00a9\3\3\2\2\2\u00aa\u00ab\7\5\2\2\u00ab\u00ac\7M\2\2\u00ac\u00ad"+
		"\5 \21\2\u00ad\u00ae\7R\2\2\u00ae\u00af\5\6\4\2\u00af\u00b0\7N\2\2\u00b0"+
		"\5\3\2\2\2\u00b1\u00b6\5\b\5\2\u00b2\u00b3\7R\2\2\u00b3\u00b5\5\b\5\2"+
		"\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\7\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\5^\60\2\u00ba"+
		"\u00bc\7\6\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\7W\2\2\u00be\u00bf\5 \21\2\u00bf\t\3\2\2\2\u00c0\u00cf"+
		"\5\2\2\2\u00c1\u00c3\7\7\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\7M\2\2\u00c5\u00c6\5^\60\2\u00c6\u00c7\7N\2"+
		"\2\u00c7\u00c8\7\b\2\2\u00c8\u00ca\5h\65\2\u00c9\u00cb\7R\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\t\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00c0\3\2\2\2\u00ce\u00c2\3\2\2\2\u00cf\u00de\3\2"+
		"\2\2\u00d0\u00d1\7O\2\2\u00d1\u00d2\5$\23\2\u00d2\u00d3\7P\2\2\u00d3\u00dd"+
		"\3\2\2\2\u00d4\u00d6\7M\2\2\u00d5\u00d7\5\f\7\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dd\7N\2\2\u00d9\u00da\t\2"+
		"\2\2\u00da\u00dd\7\66\2\2\u00db\u00dd\t\3\2\2\u00dc\u00d0\3\2\2\2\u00dc"+
		"\u00d4\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\13\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e6\5 \21\2\u00e2\u00e3\7R\2\2\u00e3\u00e5\5 \21\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\r\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\t\4\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00fa\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00fb\5\n\6\2\u00f0\u00f1\5\20"+
		"\t\2\u00f1\u00f2\5\22\n\2\u00f2\u00fb\3\2\2\2\u00f3\u00f4\t\5\2\2\u00f4"+
		"\u00f5\7M\2\2\u00f5\u00f6\5^\60\2\u00f6\u00f7\7N\2\2\u00f7\u00fb\3\2\2"+
		"\2\u00f8\u00f9\7G\2\2\u00f9\u00fb\7\66\2\2\u00fa\u00ef\3\2\2\2\u00fa\u00f0"+
		"\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\17\3\2\2\2\u00fc"+
		"\u00fd\t\6\2\2\u00fd\21\3\2\2\2\u00fe\u0100\7\7\2\2\u00ff\u00fe\3\2\2"+
		"\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7M\2\2\u0102\u0103"+
		"\5^\60\2\u0103\u0104\7N\2\2\u0104\u0105\5\22\n\2\u0105\u010d\3\2\2\2\u0106"+
		"\u010d\5\16\b\2\u0107\u0109\78\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u00ff\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0108\3\2\2\2\u010d\23\3\2\2"+
		"\2\u010e\u0113\5\22\n\2\u010f\u0110\t\7\2\2\u0110\u0112\5\22\n\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\25\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011b\5\24\13\2\u0117"+
		"\u0118\t\b\2\2\u0118\u011a\5\24\13\2\u0119\u0117\3\2\2\2\u011a\u011d\3"+
		"\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\27\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0123\5\26\f\2\u011f\u0120\t\t\2\2\u0120\u0122\5"+
		"\26\f\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\31\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u012b\5\30\r"+
		"\2\u0127\u0128\t\n\2\2\u0128\u012a\5\30\r\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\33\3\2\2"+
		"\2\u012d\u012b\3\2\2\2\u012e\u0133\5\32\16\2\u012f\u0130\7G\2\2\u0130"+
		"\u0132\5\32\16\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\35\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u013b\5\34\17\2\u0137\u0138\7H\2\2\u0138\u013a\5\34\17\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\37\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0149\5\36\20\2\u013f\u0140\5\16"+
		"\b\2\u0140\u0141\5\"\22\2\u0141\u0142\5 \21\2\u0142\u0149\3\2\2\2\u0143"+
		"\u0145\78\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u013e\3\2\2\2\u0148"+
		"\u013f\3\2\2\2\u0148\u0144\3\2\2\2\u0149!\3\2\2\2\u014a\u014b\t\13\2\2"+
		"\u014b#\3\2\2\2\u014c\u0151\5 \21\2\u014d\u014e\7R\2\2\u014e\u0150\5 "+
		"\21\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152%\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\5\36\20"+
		"\2\u0155\'\3\2\2\2\u0156\u0158\5*\26\2\u0157\u0159\5\60\31\2\u0158\u0157"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7Q\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015e\5p9\2\u015d\u0156\3\2\2\2\u015d\u015c\3\2\2"+
		"\2\u015e)\3\2\2\2\u015f\u0161\5.\30\2\u0160\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163+\3\2\2\2\u0164"+
		"\u0166\5.\30\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168-\3\2\2\2\u0169\u016c\5\64\33\2\u016a\u016c"+
		"\5H%\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c/\3\2\2\2\u016d\u0172"+
		"\5\62\32\2\u016e\u016f\7R\2\2\u016f\u0171\5\62\32\2\u0170\u016e\3\2\2"+
		"\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\61"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0178\5J&\2\u0176\u0177\7X\2\2\u0177"+
		"\u0179\5f\64\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\63\3\2\2"+
		"\2\u017a\u017f\t\f\2\2\u017b\u017f\5:\36\2\u017c\u017f\5\66\34\2\u017d"+
		"\u017f\5d\63\2\u017e\u017a\3\2\2\2\u017e\u017b\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017e\u017d\3\2\2\2\u017f\65\3\2\2\2\u0180\u0181\7\33\2\2\u0181\u0182"+
		"\7&\2\2\u0182\u0185\7\66\2\2\u0183\u0186\58\35\2\u0184\u0186\7W\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\67\3\2\2\2\u0189\u018d\5\u0088E\2\u018a"+
		"\u018d\5\u008aF\2\u018b\u018d\5(\25\2\u018c\u0189\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018b\3\2\2\2\u018d9\3\2\2\2\u018e\u0190\5<\37\2\u018f"+
		"\u0191\7\66\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3"+
		"\2\2\2\u0192\u0193\7\b\2\2\u0193\u0194\5> \2\u0194\u0195\7\t\2\2\u0195"+
		"\u019a\3\2\2\2\u0196\u0197\5<\37\2\u0197\u0198\7\66\2\2\u0198\u019a\3"+
		"\2\2\2\u0199\u018e\3\2\2\2\u0199\u0196\3\2\2\2\u019a;\3\2\2\2\u019b\u019c"+
		"\t\r\2\2\u019c=\3\2\2\2\u019d\u019f\5@!\2\u019e\u019d\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1?\3\2\2\2\u01a2"+
		"\u01a3\5B\"\2\u01a3\u01a4\5D#\2\u01a4\u01a5\7Q\2\2\u01a5\u01ab\3\2\2\2"+
		"\u01a6\u01a7\5B\"\2\u01a7\u01a8\7Q\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01ab"+
		"\5p9\2\u01aa\u01a2\3\2\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"A\3\2\2\2\u01ac\u01af\5\64\33\2\u01ad\u01af\5H%\2\u01ae\u01ac\3\2\2\2"+
		"\u01ae\u01ad\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2\5B\"\2\u01b1\u01b0"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2C\3\2\2\2\u01b3\u01b8\5F$\2\u01b4\u01b5"+
		"\7R\2\2\u01b5\u01b7\5F$\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9E\3\2\2\2\u01ba\u01b8\3\2\2\2"+
		"\u01bb\u01c2\5J&\2\u01bc\u01be\5J&\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7W\2\2\u01c0\u01c2\5&\24\2\u01c1"+
		"\u01bb\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c2G\3\2\2\2\u01c3\u01c4\7\21\2\2"+
		"\u01c4I\3\2\2\2\u01c5\u01c7\5R*\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\5L\'\2\u01c9K\3\2\2\2\u01ca\u01cb"+
		"\b\'\1\2\u01cb\u01e0\7\66\2\2\u01cc\u01cd\7M\2\2\u01cd\u01ce\5J&\2\u01ce"+
		"\u01cf\7N\2\2\u01cf\u01e0\3\2\2\2\u01d0\u01d1\7\66\2\2\u01d1\u01d3\7W"+
		"\2\2\u01d2\u01d4\78\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01e0\3\2\2\2\u01d7\u01d8\5N"+
		"(\2\u01d8\u01d9\7\66\2\2\u01d9\u01e0\3\2\2\2\u01da\u01db\7M\2\2\u01db"+
		"\u01dc\5N(\2\u01dc\u01dd\5J&\2\u01dd\u01de\7N\2\2\u01de\u01e0\3\2\2\2"+
		"\u01df\u01ca\3\2\2\2\u01df\u01cc\3\2\2\2\u01df\u01d0\3\2\2\2\u01df\u01d7"+
		"\3\2\2\2\u01df\u01da\3\2\2\2\u01e0\u020e\3\2\2\2\u01e1\u01e2\f\13\2\2"+
		"\u01e2\u01e4\7O\2\2\u01e3\u01e5\5T+\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e8\5 \21\2\u01e7\u01e6\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u020d\7P\2\2\u01ea\u01eb\f\n"+
		"\2\2\u01eb\u01ec\7O\2\2\u01ec\u01ee\7\22\2\2\u01ed\u01ef\5T+\2\u01ee\u01ed"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\5 \21\2\u01f1"+
		"\u01f2\7P\2\2\u01f2\u020d\3\2\2\2\u01f3\u01f4\f\t\2\2\u01f4\u01f5\7O\2"+
		"\2\u01f5\u01f6\5T+\2\u01f6\u01f7\7\22\2\2\u01f7\u01f8\5 \21\2\u01f8\u01f9"+
		"\7P\2\2\u01f9\u020d\3\2\2\2\u01fa\u01fb\f\b\2\2\u01fb\u01fd\7O\2\2\u01fc"+
		"\u01fe\5T+\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2"+
		"\2\u01ff\u0200\7<\2\2\u0200\u020d\7P\2\2\u0201\u0202\f\7\2\2\u0202\u0203"+
		"\7M\2\2\u0203\u0204\5V,\2\u0204\u0205\7N\2\2\u0205\u020d\3\2\2\2\u0206"+
		"\u0207\f\6\2\2\u0207\u0209\7M\2\2\u0208\u020a\5\\/\2\u0209\u0208\3\2\2"+
		"\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\7N\2\2\u020c\u01e1"+
		"\3\2\2\2\u020c\u01ea\3\2\2\2\u020c\u01f3\3\2\2\2\u020c\u01fa\3\2\2\2\u020c"+
		"\u0201\3\2\2\2\u020c\u0206\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020fM\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212"+
		"\t\16\2\2\u0212O\3\2\2\2\u0213\u0219\n\17\2\2\u0214\u0215\7M\2\2\u0215"+
		"\u0216\5P)\2\u0216\u0217\7N\2\2\u0217\u0219\3\2\2\2\u0218\u0213\3\2\2"+
		"\2\u0218\u0214\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b"+
		"\3\2\2\2\u021bQ\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021f\t\20\2\2\u021e"+
		"\u0220\5T+\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2"+
		"\2\u0221\u021d\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224S\3\2\2\2\u0225\u0227\5H%\2\u0226\u0225\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229U\3\2\2\2\u022a"+
		"\u022d\5X-\2\u022b\u022c\7R\2\2\u022c\u022e\7\31\2\2\u022d\u022b\3\2\2"+
		"\2\u022d\u022e\3\2\2\2\u022eW\3\2\2\2\u022f\u0234\5Z.\2\u0230\u0231\7"+
		"R\2\2\u0231\u0233\5Z.\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235Y\3\2\2\2\u0236\u0234\3\2\2\2"+
		"\u0237\u0238\5*\26\2\u0238\u0239\5J&\2\u0239\u023f\3\2\2\2\u023a\u023c"+
		"\5,\27\2\u023b\u023d\5`\61\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u0237\3\2\2\2\u023e\u023a\3\2\2\2\u023f[\3\2\2\2"+
		"\u0240\u0245\7\66\2\2\u0241\u0242\7R\2\2\u0242\u0244\7\66\2\2\u0243\u0241"+
		"\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"]\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024a\5B\"\2\u0249\u024b\5`\61\2\u024a"+
		"\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b_\3\2\2\2\u024c\u0252\5R*\2\u024d"+
		"\u024f\5R*\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2"+
		"\2\u0250\u0252\5b\62\2\u0251\u024c\3\2\2\2\u0251\u024e\3\2\2\2\u0252a"+
		"\3\2\2\2\u0253\u0254\b\62\1\2\u0254\u0255\7M\2\2\u0255\u0256\5`\61\2\u0256"+
		"\u0257\7N\2\2\u0257\u0277\3\2\2\2\u0258\u025a\7O\2\2\u0259\u025b\5T+\2"+
		"\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025e"+
		"\5 \21\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0277\7P\2\2\u0260\u0261\7O\2\2\u0261\u0263\7\22\2\2\u0262\u0264\5T+"+
		"\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266"+
		"\5 \21\2\u0266\u0267\7P\2\2\u0267\u0277\3\2\2\2\u0268\u0269\7O\2\2\u0269"+
		"\u026a\5T+\2\u026a\u026b\7\22\2\2\u026b\u026c\5 \21\2\u026c\u026d\7P\2"+
		"\2\u026d\u0277\3\2\2\2\u026e\u026f\7O\2\2\u026f\u0270\7<\2\2\u0270\u0277"+
		"\7P\2\2\u0271\u0273\7M\2\2\u0272\u0274\5V,\2\u0273\u0272\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\7N\2\2\u0276\u0253\3\2"+
		"\2\2\u0276\u0258\3\2\2\2\u0276\u0260\3\2\2\2\u0276\u0268\3\2\2\2\u0276"+
		"\u026e\3\2\2\2\u0276\u0271\3\2\2\2\u0277\u029d\3\2\2\2\u0278\u0279\f\7"+
		"\2\2\u0279\u027b\7O\2\2\u027a\u027c\5T+\2\u027b\u027a\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f\5 \21\2\u027e\u027d\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u029c\7P\2\2\u0281\u0282\f\6"+
		"\2\2\u0282\u0283\7O\2\2\u0283\u0285\7\22\2\2\u0284\u0286\5T+\2\u0285\u0284"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\5 \21\2\u0288"+
		"\u0289\7P\2\2\u0289\u029c\3\2\2\2\u028a\u028b\f\5\2\2\u028b\u028c\7O\2"+
		"\2\u028c\u028d\5T+\2\u028d\u028e\7\22\2\2\u028e\u028f\5 \21\2\u028f\u0290"+
		"\7P\2\2\u0290\u029c\3\2\2\2\u0291\u0292\f\4\2\2\u0292\u0293\7O\2\2\u0293"+
		"\u0294\7<\2\2\u0294\u029c\7P\2\2\u0295\u0296\f\3\2\2\u0296\u0298\7M\2"+
		"\2\u0297\u0299\5V,\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a"+
		"\3\2\2\2\u029a\u029c\7N\2\2\u029b\u0278\3\2\2\2\u029b\u0281\3\2\2\2\u029b"+
		"\u028a\3\2\2\2\u029b\u0291\3\2\2\2\u029b\u0295\3\2\2\2\u029c\u029f\3\2"+
		"\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029ec\3\2\2\2\u029f\u029d"+
		"\3\2\2\2\u02a0\u02a1\7\66\2\2\u02a1e\3\2\2\2\u02a2\u02ab\5 \21\2\u02a3"+
		"\u02a4\7\b\2\2\u02a4\u02a6\5h\65\2\u02a5\u02a7\7R\2\2\u02a6\u02a5\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\7\t\2\2\u02a9"+
		"\u02ab\3\2\2\2\u02aa\u02a2\3\2\2\2\u02aa\u02a3\3\2\2\2\u02abg\3\2\2\2"+
		"\u02ac\u02ae\5j\66\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\u02b7\5f\64\2\u02b0\u02b2\7R\2\2\u02b1\u02b3\5j\66\2\u02b2"+
		"\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\5f"+
		"\64\2\u02b5\u02b0\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8i\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\5l\67\2"+
		"\u02bb\u02bc\7X\2\2\u02bck\3\2\2\2\u02bd\u02bf\5n8\2\u02be\u02bd\3\2\2"+
		"\2\u02bf\u02c0\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1m"+
		"\3\2\2\2\u02c2\u02c3\7O\2\2\u02c3\u02c4\5&\24\2\u02c4\u02c5\7P\2\2\u02c5"+
		"\u02c9\3\2\2\2\u02c6\u02c7\7J\2\2\u02c7\u02c9\7\66\2\2\u02c8\u02c2\3\2"+
		"\2\2\u02c8\u02c6\3\2\2\2\u02c9o\3\2\2\2\u02ca\u02cb\7\32\2\2\u02cb\u02cc"+
		"\7M\2\2\u02cc\u02cd\5&\24\2\u02cd\u02cf\7R\2\2\u02ce\u02d0\79\2\2\u02cf"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2"+
		"\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\7N\2\2\u02d4\u02d5\7Q\2\2\u02d5q"+
		"\3\2\2\2\u02d6\u02db\5t;\2\u02d7\u02db\5v<\2\u02d8\u02db\5x=\2\u02d9\u02db"+
		"\5\u0080A\2\u02da\u02d6\3\2\2\2\u02da\u02d7\3\2\2\2\u02da\u02d8\3\2\2"+
		"\2\u02da\u02d9\3\2\2\2\u02dbs\3\2\2\2\u02dc\u02de\5$\23\2\u02dd\u02dc"+
		"\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\7Q\2\2\u02e0"+
		"u\3\2\2\2\u02e1\u02e2\7\33\2\2\u02e2\u02e6\7/\2\2\u02e3\u02e4\7O\2\2\u02e4"+
		"\u02e5\7\66\2\2\u02e5\u02e7\7P\2\2\u02e6\u02e3\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\7M\2\2\u02e9\u02ea\5$\23\2\u02ea"+
		"\u02ef\7N\2\2\u02eb\u02ee\5r:\2\u02ec\u02ee\5(\25\2\u02ed\u02eb\3\2\2"+
		"\2\u02ed\u02ec\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0"+
		"\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7,\2\2\u02f3"+
		"\u02f5\7/\2\2\u02f4\u02f6\7\66\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2"+
		"\2\2\u02f6\u030e\3\2\2\2\u02f7\u02f8\7\33\2\2\u02f8\u02f9\7+\2\2\u02f9"+
		"\u02fd\7/\2\2\u02fa\u02fb\7O\2\2\u02fb\u02fc\7\66\2\2\u02fc\u02fe\7P\2"+
		"\2\u02fd\u02fa\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0303\3\2\2\2\u02ff\u0302"+
		"\5r:\2\u0300\u0302\5(\25\2\u0301\u02ff\3\2\2\2\u0301\u0300\3\2\2\2\u0302"+
		"\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\3\2"+
		"\2\2\u0305\u0303\3\2\2\2\u0306\u0307\7,\2\2\u0307\u0308\7+\2\2\u0308\u030a"+
		"\7/\2\2\u0309\u030b\7\66\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b"+
		"\u030d\3\2\2\2\u030c\u02f7\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030f\u031c\3\2\2\2\u0310\u030e\3\2\2\2\u0311"+
		"\u0312\7\33\2\2\u0312\u0317\7+\2\2\u0313\u0316\5r:\2\u0314\u0316\5(\25"+
		"\2\u0315\u0313\3\2\2\2\u0315\u0314\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315"+
		"\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\3\2\2\2\u0319\u0317\3\2\2\2\u031a"+
		"\u031b\7,\2\2\u031b\u031d\7+\2\2\u031c\u0311\3\2\2\2\u031c\u031d\3\2\2"+
		"\2\u031dw\3\2\2\2\u031e\u031f\7\33\2\2\u031f\u0323\7\63\2\2\u0320\u0321"+
		"\7O\2\2\u0321\u0322\7\66\2\2\u0322\u0324\7P\2\2\u0323\u0320\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\7M\2\2\u0326\u0327\5$\23"+
		"\2\u0327\u032c\7N\2\2\u0328\u032b\5r:\2\u0329\u032b\5(\25\2\u032a\u0328"+
		"\3\2\2\2\u032a\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0330\7,"+
		"\2\2\u0330\u0332\7\63\2\2\u0331\u0333\7\66\2\2\u0332\u0331\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u034b\3\2\2\2\u0334\u0335\7\33\2\2\u0335\u0339\7"+
		"-\2\2\u0336\u0337\7O\2\2\u0337\u0338\7\66\2\2\u0338\u033a\7P\2\2\u0339"+
		"\u0336\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\7M"+
		"\2\2\u033c\u033d\5z>\2\u033d\u0342\7N\2\2\u033e\u0341\5r:\2\u033f\u0341"+
		"\5(\25\2\u0340\u033e\3\2\2\2\u0340\u033f\3\2\2\2\u0341\u0344\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0342\3\2"+
		"\2\2\u0345\u0346\7,\2\2\u0346\u0348\7-\2\2\u0347\u0349\7\66\2\2\u0348"+
		"\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u031e\3\2"+
		"\2\2\u034a\u0334\3\2\2\2\u034by\3\2\2\2\u034c\u0351\5|?\2\u034d\u034f"+
		"\5$\23\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350"+
		"\u034c\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\7Q"+
		"\2\2\u0353\u0355\5~@\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356"+
		"\3\2\2\2\u0356\u0358\7Q\2\2\u0357\u0359\5~@\2\u0358\u0357\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359{\3\2\2\2\u035a\u035c\5*\26\2\u035b\u035d\5\60\31"+
		"\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d}\3\2\2\2\u035e\u0363"+
		"\5 \21\2\u035f\u0360\7R\2\2\u0360\u0362\5 \21\2\u0361\u035f\3\2\2\2\u0362"+
		"\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\177\3\2\2"+
		"\2\u0365\u0363\3\2\2\2\u0366\u0370\3\2\2\2\u0367\u0369\t\21\2\2\u0368"+
		"\u036a\7\66\2\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0370\3"+
		"\2\2\2\u036b\u036d\7\60\2\2\u036c\u036e\5$\23\2\u036d\u036c\3\2\2\2\u036d"+
		"\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f\u0366\3\2\2\2\u036f\u0367\3\2"+
		"\2\2\u036f\u036b\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\7Q\2\2\u0372"+
		"\u0081\3\2\2\2\u0373\u0375\5\u0084C\2\u0374\u0373\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\7\2\2\3\u0377\u0083\3\2\2\2\u0378"+
		"\u037a\5\u0086D\2\u0379\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0379"+
		"\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u0085\3\2\2\2\u037d\u0382\5\u008aF"+
		"\2\u037e\u0382\5\u0088E\2\u037f\u0382\5(\25\2\u0380\u0382\7Q\2\2\u0381"+
		"\u037d\3\2\2\2\u0381\u037e\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0380\3\2"+
		"\2\2\u0382\u0087\3\2\2\2\u0383\u0384\7\36\2\2\u0384\u0385\7*\2\2\u0385"+
		"\u0386\7\66\2\2\u0386\u0388\7M\2\2\u0387\u0389\5V,\2\u0388\u0387\3\2\2"+
		"\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u0390\7N\2\2\u038b\u038c"+
		"\7K\2\2\u038c\u038d\7M\2\2\u038d\u038e\5X-\2\u038e\u038f\7N\2\2\u038f"+
		"\u0391\3\2\2\2\u0390\u038b\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2"+
		"\2\2\u0392\u0393\7Q\2\2\u0393\u0089\3\2\2\2\u0394\u0395\7\33\2\2\u0395"+
		"\u0396\7*\2\2\u0396\u0397\7\66\2\2\u0397\u0399\7M\2\2\u0398\u039a\5V,"+
		"\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u03a1"+
		"\7N\2\2\u039c\u039d\7K\2\2\u039d\u039e\7M\2\2\u039e\u039f\5X-\2\u039f"+
		"\u03a0\7N\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039c\3\2\2\2\u03a1\u03a2\3\2"+
		"\2\2\u03a2\u03a7\3\2\2\2\u03a3\u03a6\5r:\2\u03a4\u03a6\5(\25\2\u03a5\u03a3"+
		"\3\2\2\2\u03a5\u03a4\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\7,"+
		"\2\2\u03ab\u03ad\7*\2\2\u03ac\u03ae\7\66\2\2\u03ad\u03ac\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u008b\3\2\2\2\u03af\u03b1\5(\25\2\u03b0\u03af\3\2"+
		"\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u008d\3\2\2\2\u0084\u0093\u00a8\u00b6\u00bb\u00c2\u00ca\u00ce\u00d6\u00dc"+
		"\u00de\u00e6\u00ec\u00fa\u00ff\u010a\u010c\u0113\u011b\u0123\u012b\u0133"+
		"\u013b\u0146\u0148\u0151\u0158\u015d\u0162\u0167\u016b\u0172\u0178\u017e"+
		"\u0185\u0187\u018c\u0190\u0199\u01a0\u01aa\u01ae\u01b1\u01b8\u01bd\u01c1"+
		"\u01c6\u01d5\u01df\u01e4\u01e7\u01ee\u01fd\u0209\u020c\u020e\u0218\u021a"+
		"\u021f\u0223\u0228\u022d\u0234\u023c\u023e\u0245\u024a\u024e\u0251\u025a"+
		"\u025d\u0263\u0273\u0276\u027b\u027e\u0285\u0298\u029b\u029d\u02a6\u02aa"+
		"\u02ad\u02b2\u02b7\u02c0\u02c8\u02d1\u02da\u02dd\u02e6\u02ed\u02ef\u02f5"+
		"\u02fd\u0301\u0303\u030a\u030e\u0315\u0317\u031c\u0323\u032a\u032c\u0332"+
		"\u0339\u0340\u0342\u0348\u034a\u034e\u0350\u0354\u0358\u035c\u0363\u0369"+
		"\u036d\u036f\u0374\u037b\u0381\u0388\u0390\u0399\u03a1\u03a5\u03a7\u03ad"+
		"\u03b2";
>>>>>>> 25470e96f95062fc83889212f0f05bb737b3319f
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}