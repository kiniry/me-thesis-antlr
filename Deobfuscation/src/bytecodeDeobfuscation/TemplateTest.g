grammar TemplateTest;

options {
  language = Java;
  output = AST;
}

@header {
  package bytecodeDeobfuscation;
}

@lexer::header {
  package bytecodeDeobfuscation;
}

rule1: rule2 (DOT rule2)* -> rule2+;
rule2 : (rule3|rule4|rule5)
  ;
rule3 : INT INT
  ;
rule4 : IDENTIFIER INT
  ;
rule5 : TOKEN IDENTIFIER+
  ;

//rule2: IDENTIFIER | INT;

TOKEN: 'TOKEN';

IDENTIFIER  
  : (Letter|'_'|'$') (Letter|IntDigit|'_'|'$')*;

INT
  : IntDigit+
  ;
  
WS  :   ( ' '
        | '\t'
        ) {$channel=HIDDEN;}
    ;
DOT     
  : '.'   ; 
fragment HASH       : '#';
fragment Letter : ('a'..'z'|'A'..'Z');
fragment IntDigit : '0'..'9';