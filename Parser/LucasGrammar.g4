grammar LucasGrammar;


primaryExpression
    :   Identifier
    |   Constant
    |   StringLiteral+
    |   '(' expression ')'
    |   genericSelection
    |   '__extension__'? '(' compoundStatement ')' // Blocks (GCC extension)
    |   '__builtin_va_arg' '(' unaryExpression ',' typeName ')'
    |   '__builtin_offsetof' '(' typeName ',' unaryExpression ')'
    ;

genericSelection
    :   '_Generic' '(' assignmentExpression ',' genericAssocList ')'
    ;

genericAssocList
    :   genericAssociation (',' genericAssociation)*
    ;

genericAssociation
    :   (typeName | 'default') ':' assignmentExpression
    ;

postfixExpression
    :
    (   primaryExpression
    |   '__extension__'? '(' typeName ')' '{' initializerList ','? '}'
    )
    ('[' expression ']'
    | '(' argumentExpressionList? ')'
    | ('.' | '->') Identifier
    | ('++' | '--')
    )*
    ;

argumentExpressionList
    :   assignmentExpression (',' assignmentExpression)*
    ;

unaryExpression
    :
    ('++' |  '--' |  'sizeof')*
    (postfixExpression
    |   unaryOperator castExpression
    |   ('sizeof' | '_Alignof') '(' typeName ')'
    |   '&&' Identifier // GCC extension address of label
    )
    ;

unaryOperator
    :  '*' | '+' | '-' | '~' | '!'
    ;

castExpression
    :   '__extension__'? '(' typeName ')' castExpression
    |   unaryExpression
    |   DigitSequence // for
    ;

multiplicativeExpression
    :   castExpression (('*'|'/'|'%') castExpression)*
    ;

additiveExpression
    :   multiplicativeExpression (('+'|'-') multiplicativeExpression)*
    ;


relationalExpression
    :   additiveExpression (('<'|'>'|'<='|'>=') additiveExpression)*
    ;

equalityExpression
    :   relationalExpression (('=='| '!=') relationalExpression)*
    ;


logicalAndExpression
    :   inclusiveOrExpression ('&&' inclusiveOrExpression)*
    ;

logicalOrExpression
    :   logicalAndExpression ( '||' logicalAndExpression)*
    ;

assignmentExpression
    :   conditionalExpression
    |   unaryExpression assignmentOperator assignmentExpression
    |   DigitSequence // for
    ;

assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-='
    ;

expression
    :   assignmentExpression (',' assignmentExpression)*
    ;

constantExpression
    :   conditionalExpression
    ;

declaration
    :   declarationSpecifiers initDeclaratorList? ';'
    |   staticAssertDeclaration
    ;

declarationSpecifiers
    :   declarationSpecifier+
    ;

declarationSpecifiers2
    :   declarationSpecifier+
    ;

declarationSpecifier
    :   typeSpecifier
    |   typeQualifier
    |   functionSpecifier
    |   alignmentSpecifier
    ;

initDeclaratorList
    :   initDeclarator (',' initDeclarator)*
    ;

initDeclarator
    :   declarator ('=' initializer)?
    ;

typeSpecifier
    :   ('void'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    |   'signed'
    |   'unsigned'
    |   '_Bool'
    |   '_Complex'
    |   '__m128'
    |   '__m128d'
    |   '__m128i')
    |   '__extension__' '(' ('__m128' | '__m128d' | '__m128i') ')'
    |   atomicTypeSpecifier
    |   structOrUnionSpecifier
    |   enumSpecifier
    |   typedefName
    |   '__typeof__' '(' constantExpression ')' // GCC extension
    ;

structOrUnionSpecifier
    :   structOrUnion Identifier? '{' structDeclarationList '}'
    |   structOrUnion Identifier
    ;

structOrUnion
    :   'struct'
    |   'union'
    ;

structDeclarationList
    :   structDeclaration+
    ;

structDeclaration // The first two rules have priority order and cannot be simplified to one expression.
    :   specifierQualifierList structDeclaratorList ';'
    |   specifierQualifierList ';'
    |   staticAssertDeclaration
    ;

specifierQualifierList
    :   (typeSpecifier| typeQualifier) specifierQualifierList?
    ;

structDeclaratorList
    :   structDeclarator (',' structDeclarator)*
    ;

structDeclarator
    :   declarator
    |   declarator? ':' constantExpression
    ;

enumSpecifier
    :   'enum' Identifier? '{' enumeratorList ','? '}'
    |   'enum' Identifier
    ;

enumeratorList
    :   enumerator (',' enumerator)*
    ;

enumerator
    :   enumerationConstant ('=' constantExpression)?
    ;

enumerationConstant
    :   Identifier
    ;

atomicTypeSpecifier
    :   '_Atomic' '(' typeName ')'
    ;

typeQualifier
    :   'const'
    |   'restrict'
    |   'volatile'
    |   '_Atomic'
    ;

functionSpecifier
    :   ('inline'
    |   '_Noreturn'
    |   '__inline__' // GCC extension
    |   '__stdcall')
    |   gccAttributeSpecifier
    |   '__declspec' '(' Identifier ')'
    ;

alignmentSpecifier
    :   '_Alignas' '(' (typeName | constantExpression) ')'
    ;

declarator
    :   pointer? directDeclarator gccDeclaratorExtension*
    ;

directDeclarator
    :   Identifier
    |   '(' declarator ')'
    |   directDeclarator '[' typeQualifierList? assignmentExpression? ']'
    |   directDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
    |   directDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
    |   directDeclarator '[' typeQualifierList? '*' ']'
    |   directDeclarator '(' parameterTypeList ')'
    |   directDeclarator '(' identifierList? ')'
    |   Identifier ':' DigitSequence  // bit field
    |   vcSpecificModifer Identifier // Visual C Extension
    |   '(' vcSpecificModifer declarator ')' // Visual C Extension
    ;

vcSpecificModifer
    :   ('__cdecl' 
    |   '__clrcall' 
    |   '__stdcall' 
    |   '__fastcall' 
    |   '__thiscall' 
    |   '__vectorcall') 
    ;


gccDeclaratorExtension
    :   '__asm' '(' StringLiteral+ ')'
    |   gccAttributeSpecifier
    ;

gccAttributeSpecifier
    :   '__attribute__' '(' '(' gccAttributeList ')' ')'
    ;

gccAttributeList
    :   gccAttribute? (',' gccAttribute?)*
    ;

gccAttribute
    :   ~(',' | '(' | ')') // relaxed def for "identifier or reserved word"
        ('(' argumentExpressionList? ')')?
    ;

nestedParenthesesBlock
    :   (   ~('(' | ')')
        |   '(' nestedParenthesesBlock ')'
        )*
    ;

pointer
    :  (('*'|'^') typeQualifierList?)+ // ^ - Blocks language extension
    ;

typeQualifierList
    :   typeQualifier+
    ;

parameterTypeList
    :   parameterList (',' '...')?
    ;

parameterList
    :   parameterDeclaration (',' parameterDeclaration)*
    ;

parameterDeclaration
    :   declarationSpecifiers declarator
    |   declarationSpecifiers2 abstractDeclarator?
    ;

identifierList
    :   Identifier (',' Identifier)*
    ;

typeName
    :   specifierQualifierList abstractDeclarator?
    ;

abstractDeclarator
    :   pointer
    |   pointer? directAbstractDeclarator gccDeclaratorExtension*
    ;

directAbstractDeclarator
    :   '(' abstractDeclarator ')' gccDeclaratorExtension*
    |   '[' typeQualifierList? assignmentExpression? ']'
    |   '[' 'static' typeQualifierList? assignmentExpression ']'
    |   '[' typeQualifierList 'static' assignmentExpression ']'
    |   '[' '*' ']'
    |   '(' parameterTypeList? ')' gccDeclaratorExtension*
    |   directAbstractDeclarator '[' typeQualifierList? assignmentExpression? ']'
    |   directAbstractDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
    |   directAbstractDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
    |   directAbstractDeclarator '[' '*' ']'
    |   directAbstractDeclarator '(' parameterTypeList? ')' gccDeclaratorExtension*
    ;

typedefName
    :   Identifier
    ;

initializer
    :   assignmentExpression
    |   '{' initializerList ','? '}'
    ;

initializerList
    :   designation? initializer (',' designation? initializer)*
    ;

designation
    :   designatorList '='
    ;

designatorList
    :   designator+
    ;

designator
    :   '[' constantExpression ']'
    |   '.' Identifier
    ;

staticAssertDeclaration
    :   '_Static_assert' '(' constantExpression ',' StringLiteral+ ')' ';'
    ;

statement
    :   labeledStatement
    |   compoundStatement
    |   expressionStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    |   ('__asm' | '__asm__') ('volatile' | '__volatile__') '(' (logicalOrExpression (',' logicalOrExpression)*)? (':' (logicalOrExpression (',' logicalOrExpression)*)?)* ')' ';'
    ;

labeledStatement
    :   Identifier ':' statement
    |   'case' constantExpression ':' statement
    |   'default' ':' statement
    ;

compoundStatement
    :   '{' blockItemList? '}'
    ;

blockItemList
    :   blockItem+
    ;

blockItem
    :   statement
    |   declaration
    ;

expressionStatement
    :   expression? ';'
    ;

selectionStatement
    :   'if' '(' expression ')' statement ('else' statement)?
    |   'switch' '(' expression ')' statement
    ;

iterationStatement
    :   While '(' expression ')' statement
    |   Do statement While '(' expression ')' ';'
    |   For '(' forCondition ')' statement
    ;

//    |   'for' '(' expression? ';' expression?  ';' forUpdate? ')' statement
//    |   For '(' declaration  expression? ';' expression? ')' statement

forCondition
	:   (forDeclaration | expression?) ';' forExpression? ';' forExpression?
	;

forDeclaration
    :   declarationSpecifiers initDeclaratorList?
    ;

forExpression
    :   assignmentExpression (',' assignmentExpression)*
    ;

jumpStatement
    :   ('goto' Identifier
    |   ('continue'| 'break')
    |   'return' expression?
    |   'goto' unaryExpression // GCC extension
    )
    ';'
    ;

compilationUnit
    :   translationUnit? EOF
    ;

translationUnit
    :   externalDeclaration+
    ;

externalDeclaration
    :   functionDefinition
    |   declaration
    |   ';' // stray ;
    ;

functionDefinition
    :   declarationSpecifiers? declarator declarationList? compoundStatement
    ;

declarationList
    :   declaration+
    ;

//1. Keywords
Begin : 'begin';
BigInt : 'bigint';
Break : 'break';
Decl: 'decl';
Expr: 'expr';
Public: 'public';
Private: 'private';
TypeOf: 'typeof';
Vector: 'vector';
Case : 'case';
Char : 'char';
Class : 'class';
CharSeq : 'charseq';
Continue : 'continue';
Double : 'double';
Function: 'function';
Else : 'else';
End : 'end';
For : 'for';
Int : 'int';
If : 'if';
Return : 'return';
Switch : 'switch';
Void : 'void';
While: 'while';

//trig expression, this will be used in the grammar later to define the expression whose <TE> must
// be taken.
TE: 'sin' | 'cos' | 'tan' | 'asin' | 'acos' | 'atan';

//logarithmic expression, similar applications to TE (trig expression) above.
LE: 'log' | 'ln';

//fragments so that defining things like identifier naming conventions becomes a lot cleaner
//and human readable


fragment Digit
    : [0-9]
    ;

fragment IDNonDigit
    : [a-zA-Z_]
    ;

Identifier
    :   IDNonDigit
        (   IDNonDigit
        |   Digit
        )*
    ;

// 2.Literals
Literal
    : IntegerLiteral
    | FloatingLiteral
    | CharacterLiteral
    | StringLiteral
    | BooleanLiteral
    ;

fragment IntegerLiteral
    : IntLiteral
    | BigIntLiteral
    ;

// All BigIntLiteral ending with suffix 'I' will be treated as an IntLiteral token
fragment IntLiteral
    : BigIntLiteral IntSuffix
    ;

// BigIntLiteral can be of the form 25 or 365e7 or 41E22, but not 2e-3,
// negative exponents are not allowed for bigint literals, only allowed for FloatingLiterals.
fragment BigIntLiteral
    : Digit+ PositiveExponentialPart?
    ;

fragment IntSuffix
    : 'I'
    ;

fragment FloatingLiteral
    : Digit+ ExponentialPart
    | Digit* '.' Digit+ ExponentialPart?
    | Digit+ '.' Digit* ExponentialPart?
    ;

fragment ExponentialPart
    : [eE] [+-]? Digit+
    ;

fragment PositiveExponentialPart
    : [eE] [+]? Digit+
    ;

// Unicode characters or wide characters are not supported in Lucas
fragment CharacterLiteral
    : '\'' CharacterLiteralBody '\''
    ;

fragment CharacterLiteralBody
    : ~['\\\r\n] 
    | SimpleEscapeSequence
    ;

fragment SimpleEscapeSequence
    :   '\\' ['"?nrtv\\]
    ;

fragment StringLiteral
    : '"' StringLiteralBody '"'
    ;

fragment StringLiteralBody
    : CharacterLiteralBody*
    ;

fragment BooleanLiteral
    : 'true' | 'false'
    ;

// 3. Operators
Add : '+';
Sub : '-';
Mult : '*';
Div : '/';
Mod : '%';
Tilde: '~';
Exponent : '^';
LessThan : '<';
GreaterThan : '>';
Equality : '==';    
Inequality : '!=';
LessThanEqual : '<=';
GreaterThanEqual : '>=';
LogicalAnd : '&&';
LogicalOr : '||';
LogicalNot : '!';
Dot : '.';             
Arrow : '->';
ClassSpec : '::';
LeftParen : '(' ;
RightParen : ')' ;
LeftBrac : '[' ;
RightBrac : ']' ;
SemiColon : ';' ;
Comma : ',' ;
Increment: '++';
Decrement: '--';
RightShift: '>>';
LeftShift: '<<';

//assignment operators, which include compound assignment here 
Assign : '=';
LeftShiftEqual : '<<=';
RightShiftEqual : '>>=';
PlusEqual : '+=';
MinusEqual : '-=';
MultEqual : '*=';





// Comments and Whitespaces
Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

