lexer grammar JVM;

options {
  language = Java;
}

@header {
	package a.b.c;
}
	
PrimitiveType 
	: 	Numeric_type
	| 	Boolean_type
	;

fragment
Boolean_type
	:	'boolean'
	;

fragment
Numeric_type
	:	Floating_point_type
	|	Integral_type
	;

fragment
Integral_type
	:	'byte'
	|	'short'
	|	'int'
	|	'long'
	|	'char'
	;

fragment
Floating_point_type
	:	'float'
	|	'double'
	;

MODIFIED : 'Last modified';	CHECKSUM : 'MD5 checksum';	CLASSFILE : 'Classfile';
SOURCEFILE : 'SourceFile';	MINORVERSION : 'minor version';	MAJORVERSION : 'major version';
FLAGS : 'flags';		SIZE : 'size';			BYTES : 'bytes';
JAVAFILETYPE : '.java';		COMPILED : 'Compiled from';	CLASS : 'class';
JAVABYTECODEFILE	:	'.class'	;
EXTENDS : 'extends';		IMPLEMENTS : 'implements';	SIGNATURE : 'Signature';
CONSTANTPOOL : 'constant pool';	THROWS : 'throws';		CODE : 'code';
TABLESWITCH : 'tableswitch';	LOOKUPSWITCH : 'lookupswitch';	EXCEPTIONS : 'Exceptions';

ABSTRACT : 'abstract';		PUBLIC : 'public';		FINAL : 'final';
STATIC : 'static';		PRIVATE : 'private';		PROTECTED : 'protected';
INTERFACE : 'interface';	SYNHRONIZED : 'synchronized';	NATIVE : 'native';
VOLATILE : 'volatile';		TRANSIENT : 'transient';

MINUS	:	'-'		;	PLUS		:	'+'		;	
COLON	:	':'		;	SEMI		: 	';'		;	
QUOTE	:	'\"'		;	COMMA		:	','		;
DOT	:	'.'		;			SLASH			: '/'		;
LBRACE	:	'{'		;	RBRACE		:	'}'		;
LBRACK	:	'['		;	RBRACK		:	']'		;
LPAREN	:	'('		;	RPAREN		:	')'		;
ASSIGN	:	'='		; 

//fragment
//UNDERSCORE: '_'		;

ACCESS_FLAGS
	:	('ACC_PUBLIC'	|	'ACC_PRIVATE'
	|	'ACC_PROTECTED'	|	'ACC_STATIC'
	|	'ACC_FINAL'	|	'ACC_SYNCHRONIZED'
	|	'ACC_VOLATILE'	|	'ACC_TRANSIENT'
	|	'ACC_NATIVE'	|	'ACC_INTERFACE'
	|	'ACC_ABSTRACT')	;
	
Constant_type
	:	'Class'		|	'Fieldref'	|	'Methodref'
	|	'InterfaceMethodref'			|	'String'
	|	'Integer'	|	'Float'		|	'Long'
	|	'Double'	|	'NameAndType'	|	'Utf8'
	|	'Unicode'
	;

PATH	:	SLASH LETTER COLON (SLASH (IDENTIFIER WS*)+)+ JAVABYTECODEFILE;

IDENTIFIER  
	:	(LETTER|'_') (ALFANUMERIC|'_')*
    	;

ALFANUMERIC
	:	(LETTER|DIGIT)
	;

DATE	:	DIGIT DIGIT MINUS DIGIT DIGIT MINUS INT;

INT :	DIGIT+
    ;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
LETTER	:	('a'..'z'|'A'..'Z');

fragment
DIGIT	:	'0'..'9';

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
RULE: ;
