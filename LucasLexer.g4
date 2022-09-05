grammar LucasLexer;

breaksym : 'break';



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