grammar LucasGrammar;


primaryExpression
    :   Identifier
    |   Literal
    |   StringLiteral+
    |   '(' expression ')'
	//| '__extension__'? '(' (statement | declaration)* ')' // Blocks (GCC extension)
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
    |   'sizeof' '(' typeName ')'
    |   '&&' Identifier // GCC extension address of label
    )
    ;

unaryOperator
    :  '*' | '+' | '-' | '~' | '!'
    ;

castExpression
    :   '__extension__'? '(' typeName ')' castExpression
    |   unaryExpression
    |   Digit+ // for
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
    :   equalityExpression ('&&' equalityExpression)*
    ;

logicalOrExpression
    :   logicalAndExpression ( '||' logicalAndExpression)*
    ;

assignmentExpression
    :   logicalOrExpression
    |   unaryExpression assignmentOperator assignmentExpression
    |   Digit+ // for
    ;

assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-='
    ;

expression
    :   assignmentExpression (',' assignmentExpression)*
    ;

constantExpression
    :   logicalOrExpression
    ;

declaration
    :   declarationSpecifiers initDeclaratorList? ';'
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
    |   'charseq'
    |   'int'
    |   'bigint' 
    |   'long'
    |   'float'
    |   'double'
    |   'boolean')
    |   structOrUnionSpecifier   //MAKE CLASSESSSSSSSSSSs
    |   classSpecifier 
    |   Identifier
    ;

classSpecifier
    : Begin Class Identifier (memberDeclaration | Colon)+ //ADD ACCESS SPECIFIER HERE ACCORDING TO THE C++ GRAMMAR
    ;

memberDeclaration
    : functionDeclaration
    | functionDefinition
    | declaration  //check this once to see if anything else is to be added
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

typeQualifier
    :   'const'
    ;

declarator
    :   pointer? directDeclarator //gccDeclaratorExtension*
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
    |   Identifier ':' Digit+  // bit field
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


// gccDeclaratorExtension
//     :   '__asm' '(' StringLiteral+ ')'
//     |   gccAttributeSpecifier
//     ;

// gccAttributeSpecifier
//     :   '__attribute__' '(' '(' gccAttributeList ')' ')'
//     ;

// gccAttributeList
//     :   gccAttribute? (',' gccAttribute?)*
//     ;

// gccAttribute
//     :   ~(',' | '(' | ')') // relaxed def for "identifier or reserved word"
//         ('(' argumentExpressionList? ')')?
//     ;

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
    |   pointer? directAbstractDeclarator //gccDeclaratorExtension*
    ;

directAbstractDeclarator
    :   '(' abstractDeclarator ')' //gccDeclaratorExtension*
    |   '[' typeQualifierList? assignmentExpression? ']'
    |   '[' 'static' typeQualifierList? assignmentExpression ']'
    |   '[' typeQualifierList 'static' assignmentExpression ']'
    |   '[' '*' ']'
    |   '(' parameterTypeList? ')' //gccDeclaratorExtension*
    |   directAbstractDeclarator '[' typeQualifierList? assignmentExpression? ']'
    |   directAbstractDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
    |   directAbstractDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
    |   directAbstractDeclarator '[' '*' ']'
    |   directAbstractDeclarator '(' parameterTypeList? ')' //gccDeclaratorExtension*
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

statement
    :   expressionStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    //|   ('__asm' | '__asm__') ('volatile' | '__volatile__') '(' (logicalOrExpression (',' logicalOrExpression)*)? (':' (logicalOrExpression (',' logicalOrExpression)*)?)* ')' ';'
    ;



expressionStatement
    :   expression? ';'
    ;

selectionStatement
    :   Begin If ('['Identifier']')? '(' expression ')' (statement|declaration)* End If (Identifier)? (Begin Else If ('['Identifier']')? (statement|declaration)* End Else If (Identifier)?)* (Begin Else (statement|declaration)* End Else)?
    ;

iterationStatement
    :   Begin While ('['Identifier']')? '(' expression ')' (statement|declaration)* End While (Identifier)?
    |   Begin For ('['Identifier']')? '(' forCondition ')' (statement|declaration)* End For (Identifier)?
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
    :   (
    |   (Continue| Break) Identifier?
    |   Return expression?
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
    |   functionDeclaration
    |   declaration
    |   ';' // stray ;
    ;

functionDeclaration
    : Decl Function Identifier '('parameterTypeList?')' (Arrow '('parameterList')')? ';'
    ;

functionDefinition
    : Begin Function Identifier '('parameterTypeList?')' (Arrow '('parameterList')')? (statement|declaration)* End Function Identifier?//declarationSpecifiers? declarator declarationList?Function Identifier '('parameterTypeList')' (Arrow '('parameterList')')?
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



fragment StringLiteralBody
    : CharacterLiteralBody*
    ;

fragment BooleanLiteral
    : 'true' | 'false'
    ;

Digit
    : [0-9]
    ;

StringLiteral
    : '"' StringLiteralBody '"'
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
Colon: ':';

//assignment operators, which include compound assignment here 
Assign : '=';
LeftShiftEqual : '<<=';
RightShiftEqual : '>>=';
PlusEqual : '+=';
MinusEqual : '-=';
MultEqual : '*=';
DivEqual : '/=';
ModEqual : '%=';





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

