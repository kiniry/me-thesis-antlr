grammar ThreeDotsExample;

options {
  language = Java;
  output = AST;
}

rule: NORMALTYPE LIST;

LIST    : '...' ;
DOT     : '.'   ; 

NORMALTYPE
  : IDENTIFIER (DOT IDENTIFIER)+;

IDENTIFIER  
  : (Letter|'_'|'$') (Letter|IntDigit|'_'|'$')*;

fragment Letter : ('a'..'z'|'A'..'Z');
fragment IntDigit : '0'..'9';