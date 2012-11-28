grammar Sample;

options {
  language = Java;
}

@header {
	package a.b.c;
}

checksum_file_info
	:	CHECKSUM HEX_DIGITS
	;
//*******************************/
//						Lexer			 				 /
//*******************************/

Constant_pool_index
	:	HASH INT;

MODIFIED : 'Last modified';	CHECKSUM : 'MD5 checksum';	CLASSFILE : 'Classfile';
SOURCEFILE : 'SourceFile';	MINORVERSION : 'minor version';	MAJORVERSION : 'major version';
FLAGS : 'flags';		SIZE : 'size';			BYTES : 'bytes';
JAVAFILETYPE : '.java';		COMPILED : 'Compiled from';	CLASS : 'class';
JAVABYTECODEFILE	:	'.class'	;	DEFAULT : 'default';
EXTENDS : 'extends';		IMPLEMENTS : 'implements';	SIGNATURE : 'Signature';
CONSTANTPOOL : 'Constant pool';	THROWS : 'throws';		CODE : 'Code';
TABLESWITCH : 'tableswitch';	LOOKUPSWITCH : 'lookupswitch';	EXCEPTIONS : 'Exceptions';

ABSTRACT : 'abstract';		PUBLIC : 'public';		FINAL : 'final';
STATIC : 'static';		PRIVATE : 'private';		PROTECTED : 'protected';
INTERFACE : 'interface';	SYNCHRONIZED : 'synchronized';	NATIVE : 'native';
VOLATILE : 'volatile';		TRANSIENT : 'transient'; CTOR : '<init>';
DCTOR 	: '<clinit>';		RETURN : 'return';
STACK	:	'stack';	LOCALS	:	'locals';	ARGS:	'args_size';


MINUS	:	'-'		;	PLUS		:	'+'		;	
COLON	:	':'		;	SEMI		: 	';'		;	
fragment QUOTE	:	'\"'		;	COMMA		:	','		;
DOT	:	'.'		;	
fragment SLASH		:	'/'		;
LBRACE	:	'{'		;	RBRACE		:	'}'		;
LBRACK	:	'['		;	RBRACK		:	']'		;
LPAREN	:	'('		;	RPAREN		:	')'		;
ASSIGN	:	'='		;	fragment UNDERSCORE	:	'_'		;
HASH		:	'#'		;

QUOTED_STRING
	:
	QUOTE IDENTIFIER JAVAFILETYPE QUOTE
	;

ACCESS_FLAGS
	:	('ACC_PUBLIC'	|	'ACC_PRIVATE'
	|	'ACC_PROTECTED'	|	'ACC_STATIC'
	|	'ACC_FINAL'	|	'ACC_SYNCHRONIZED'
	|	'ACC_VOLATILE'	|	'ACC_TRANSIENT'
	|	'ACC_NATIVE'	|	'ACC_INTERFACE'
	|	'ACC_ABSTRACT'	| 'ACC_SUPER')	; // ACC_SUPER is not presented in the specification of jvm 1
	
//Constant_type
//	:	'Class'		|	'Fieldref'	|	'Methodref'
//	|	'InterfaceMethodref'			|	'String'
//	|	'Integer'	|	'Float'		|	'Long'
//	|	'Double'	|	'NameAndType'
//	|	'Unicode'
//	;


Constant_type_UTF8
	:'Utf8'
	;

PrimitiveType 
	: 	Numeric_type
	| 	Boolean_type
	;


INT :	DIGIT+;

HEX_DIGITS
:HEX_DIGIT+
;

IDENTIFIER  
	:	(LETTER|'_') (LETTER|DIGIT|'_')*
    	;

PATH	:	SLASH LETTER COLON (SLASH (IDENTIFIER WS*)+)+ JAVABYTECODEFILE;

DATE	:	DIGIT DIGIT MINUS DIGIT DIGIT MINUS INT;
	
TypeIdentifier
	:	LBRACK* IDENTIFIER (SLASH IDENTIFIER)* SEMI?
	;
	
QuotedTypeIdentifier
	:	QUOTE LBRACK* IDENTIFIER (SLASH IDENTIFIER)* SEMI? QUOTE
	;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

UTF8TYPE
	:	Constant_type_UTF8 REGULAR_STRING_LITERAL_CHARACTER*
	;

COMMENT
    :   '//' ~(NL|'\r')* '\r'? NL {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | NL
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;
fragment
LETTER	:	('a'..'z'|'A'..'Z');

fragment NL : '\n';

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
DIGIT	:	'0'..'9';

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESCAPE_SEQUENCE
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
REGULAR_STRING_LITERAL_CHARACTER
	:	SINGLE_REGULAR_STRING_LITERAL_CHARACTER
	|	SIMPLE_ESCAPE_SEQUENCE
	|	UNICODE_ESCAPE_SEQUENCE
	;
	
fragment	
SINGLE_REGULAR_STRING_LITERAL_CHARACTER
	:	 ~( '\"' | '\\' | '\u000D' | '\u000A' | '\u2028' | '\u2029')
	;
	
fragment
SIMPLE_ESCAPE_SEQUENCE
	:	'\\\'' | '\\\"' | '\\\\' | '\\0' | '\\a'  
	|	'\\b' | '\\f'  | '\\n'  | '\\r' | '\\t' | '\\v'
	;

fragment
UNICODE_ESCAPE_SEQUENCE
	:	('\\' 'u'   HEX_DIGIT   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT)
	|	('\\' 'U'   HEX_DIGIT   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT  
					HEX_DIGIT   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT)
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