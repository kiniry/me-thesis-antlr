grammar TreeConstructor;

options {
  language = Java;
  output = AST;
}

tokens{
THEONERULE; ANNOTATIONVALUE;
}

@header {
  package bytecodeDeobfuscation;
}

@lexer::header {
  package bytecodeDeobfuscation;
}

rule1
  : a1=AnnotationAssign i1=IDENTIFIER i2=IDENTIFIER INT extendsRule? ->^(IDENTIFIER[i1.getText() + " " + i2.getText()] ANNOTATIONVALUE[a1.getText()] ^(THEONERULE INT extendsRule?))
  ;

extendsRule
  : d1=EXTENDS v1=somerule listRule -> ^(IDENTIFIER[$d1] IDENTIFIER["d" + v1.getTree().toString()] listRule)
  ;

somerule
  : INT
  ;

listRule: IDENTIFIER (',' IDENTIFIER)* -> IDENTIFIER+
  ;

EXTENDS
  : 'extends'
  ;

IDENTIFIER  
  : (Letter|'_'|'$') (Letter|IntDigit|'_'|'$')*;

INT
  : IntDigit+
  ;
  
WS  :   ( ' '
        | '\t'
        ) {$channel=HIDDEN;}
    ;

CPINDEX
  : HASH INT;
AnnotationAssign
  : ('e'|'s') CPINDEX (DOT CPINDEX)?
  ;
 DOT     
  : '.'   ; 
fragment HASH       : '#';
fragment Letter : ('a'..'z'|'A'..'Z');
fragment IntDigit : '0'..'9';