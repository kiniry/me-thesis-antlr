grammar IdentifierCaptionExample;

options {
  language = Java;
  output = AST;
}
//*****************************
// How come can a space be recognised in an identifier???
// Try the following:
// major version:
// major vrsion:
// major vrsion asd:
// So it will actually match "major sdfsdf" to ONE identifier.
//*****************************
rule: MAJOR_VERSION | IDENTIFIER IDENTIFIER COLON;

MAJOR_VERSION : 'major version' COLON;

IDENTIFIER  
  : Letter+;
  
COLON   : ':'   ;


WS  :   ( ' '
        | '\t'
        ) {$channel=HIDDEN;}
    ;
fragment Letter : ('a'..'z'|'A'..'Z');
IntDigit : '0'..'9';