lexer grammar LucasLexer;


//1. Keywords
Break : 'break';


fragment 
Digit
    : [0-9]
    ;

fragment
IDNonDigit
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

fragment StringLiteral
    : '\"' StringLiteralBody '\"'
    ;

fragment StringLiteralBody
    : CharacterLiteralBody+
    ;

fragment BooleanLiteral
    : 'true' | 'false'
    ;

// 3. Operators
Add : ‘+’;
Sub : ‘-’;
Mult : ‘*’;
Div : ‘/’;
Mod : ‘%’;
Exponent : ‘^’;
LessThan : ‘<’;
GreaterThan : ‘>’;
Equality : ‘==’; //We can change the name of the token later on maybe?
Inequality : ‘!=’;
LessThanEqual : ‘<=’;
GreaterThanEqual : ‘>=’;
LogicalAnd : ‘&&’;
LogicalOr : ‘||’;
LogicalNot : ‘!’;
Dot : ‘.’;             //Change if needed
Arrow : ‘->’;
Assign : ‘=’;
ClassSpec : ‘::’;
LeftParen : ‘(‘ ;
RightParen : ‘)’ ;
LeftBrac : ‘[‘ ;
RightBrac : ‘]’ ;
SemiColon : ‘;’ ;
Comma : ‘,’ ;




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

