grammar CharEscapeSequenceExample;

options {
  language = Java;
  output = AST;
}

rule: CHARLITERAL;

CHARLITERAL   : '\'' CharEscapeSequence '\''    ;

fragment
CharEscapeSequence
    :   ~'\''
    ;
fragment
CharUnicodeEscapeSequence
  : '\\' (('u'   HexDigit   HexDigit   HexDigit  HexDigit)
  | ('U'   HexDigit   HexDigit   HexDigit  HexDigit  
          HexDigit   HexDigit   HexDigit  HexDigit))
  ;
fragment IntDigit : '0'..'9';
fragment HexDigit : (IntDigit|('a'..'f')|('A'..'F')) ;
fragment Octal  : '0'..'7';
fragment OctalEscape
    :   '\\' ('0'..'3') Octal Octal
    |   '\\' Octal Octal
    |   '\\' Octal
    ;