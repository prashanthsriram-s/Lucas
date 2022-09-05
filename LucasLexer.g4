lexer grammar LucasLexer;



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