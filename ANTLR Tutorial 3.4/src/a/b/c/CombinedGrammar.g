grammar CombinedGrammar;

options {
  language = Java;
}

@header {
	package a.b.c;
}


//*******************************/
//	Class files
//*******************************/

program	:	class_file*;

class_file
	:	class_file_header classDefinition;
	
class_file_header
	:	(class_file_info
	|	modified_file_info
	|	checksum_file_info
	|	compiled_file_info)* 
	;
class_file_info
	:	CLASSFILE PATH
	;
	
modified_file_info
	:	MODIFIED DATE SEMI SIZE INT BYTES
	;
	
checksum_file_info
	:	CHECKSUM IDENTIFIER
	;
		
compiled_file_info
	:	COMPILED QUOTED_STRING
	;
	
file_name
	:	 IDENTIFIER JAVAFILETYPE
	;
	
//*******************************/
//	type header
//*******************************/
	
type_info
	:	(sourcefile_info
	|	signature_info
	|	minor_version_info
	|	major_version_info
	|	flags)+
	;
	
sourcefile_info
	:	SOURCEFILE COLON QUOTED_STRING
	;
		
signature_info
	:	SIGNATURE COLON typeSignature
	;
		
minor_version_info
	:	MINORVERSION COLON INT
	;
		
major_version_info
	:	MAJORVERSION COLON INT
	;
			
flags
	:	FLAGS COLON ACCESS_FLAGS (COMMA ACCESS_FLAGS)*
	;
	
typeSignature
	:	(LPAREN (typeIdentifier)? RPAREN)? typeIdentifier
	;

typeIdentifier
	:	(TypeIdentifier | IDENTIFIER) SEMI?
	;

//*******************************/
//	Constant pool
//*******************************/

constant_pool
	:	CONSTANTPOOL COLON
		contant_pool_line*
	;
	
contant_pool_line
	:	Constant_pool_index ASSIGN 
		CONSTANT_TYPE_ASSIGNABLE
		//(UTF8TYPE
		//|
		//otherType)
	;
	
otherType
	:	IDENTIFIER Constant_pool_index ((DOT | COLON) Constant_pool_index)?
	;

//*******************************/
//				Class definition       /
//*******************************/


classDefinition
	:	class_visual_modifier class_modifier* CLASS IDENTIFIER (EXTENDS type )? (IMPLEMENTS typeList )?
		type_info
		constant_pool
		LBRACE
		classBody 
		RBRACE
	;
		
class_visual_modifier
	:	PUBLIC
	;
		
class_modifier
	:	ABSTRACT | FINAL | INTERFACE
	;

typeList
 	:	type (COMMA type)*
 	; 
  	
type 
	:	(PrimitiveType | classOrInterfaceType) (LBRACK RBRACK)*
	;
 	
classOrInterfaceType 
	: 	IDENTIFIER (DOT IDENTIFIER)*
	;

//*******************************/
//					Code body			 			 /
//*******************************/
	
classBody
	:	
	(	fieldDefinition
	|	ctorDefinition
	|	methodDefinition
	)+
	;

//*******************************/
//				Field definition			 /
//*******************************/

fieldDefinition
	:	field_visual_modifier field_modifier* type typeIdentifier
	type_info
	;
		
field_visual_modifier
	:	PUBLIC	|	PRIVATE |	PROTECTED
	;
		
field_modifier
	:	FINAL	|	STATIC	|	TRANSIENT	|	VOLATILE
	;
	
//*******************************/
//				Ctor definition			 	 /
//*******************************/

ctorDefinition
	:	class_visual_modifier IDENTIFIER arguments throwClause? SEMI
		type_info
		body
	;

//*******************************/
//				Method definition			 /
//*******************************/

methodDefinition
	: 	method_visual_modifier method_modifier* type IDENTIFIER arguments throwClause? SEMI
		type_info
	( 	body
	|	';'	//Abstract method
	)
	;
		
method_visual_modifier
	:	PUBLIC	|	PRIVATE |	PROTECTED
	;
		
method_modifier
	:	ABSTRACT | FINAL	|	STATIC	|	SYNCHRONIZED	|	NATIVE
	;

arguments
	:	LPAREN (type (COMMA type)*)? RPAREN
	;
	
body	:	exceptionDeclaration?
		CODE COLON
		variables
		(codeLine |	javaSwitch)*
		exceptionTable?
		lineNumberTable
		localVariableTable
		stackMapTable?
	;

codeLine
	:	pc IDENTIFIER ((Constant_pool_index | INT | PrimitiveType) (COMMA INT)?)? 
	;

variables
	:	stacks COMMA locals COMMA args
	;

stacks
	:	STACK ASSIGN INT
	;

locals
	:	LOCALS ASSIGN INT
	;

args
	:	ARGS ASSIGN INT
	;

javaSwitch	
	:	INT COLON (TABLESWITCH | LOOKUPSWITCH)
		LBRACE
		switchLine*
		switchDefaultLine
		RBRACE
	;
	
switchLine
	:	INT COLON INT
	;

switchDefaultLine
	:	DEFAULT COLON INT
	;

pc:	INT COLON;

//*******************************/
//				Exceptions						 /
//*******************************/

exceptionDeclaration
	:	EXCEPTIONS COLON
		throwClause
	;

throwClause
	: THROWS classOrInterfaceType
	;

exceptionTable
	:	EXCEPTION_TABLE COLON
		IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER
		INT INT INT IDENTIFIER typeIdentifier
	;
	
//*******************************/
//				LineNumber						 /
//*******************************/

lineNumberTable
	:	LINENUMBERTABLE COLON
		lineNumberTableLine*
	;

lineNumberTableLine
	:	IDENTIFIER pc INT
	;
	
//*******************************/
//			localVariableTable			 /
//*******************************/
	
localVariableTable
	:	LOCALVARIABLETABLE COLON
		IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER SIGNATURE
		localVariableTableLine+
	;
	
localVariableTableLine
	:	INT INT INT IDENTIFIER typeIdentifier
	;
	
//*******************************/
//				StackMapTable				 	 /
//*******************************/

stackMapTable
	:	STACKMAPTABLE COLON NUMBER_OF_ENTRIES ASSIGN INT
	(	FRAME_TYPE ASSIGN INT
	|	OFFSET_DELTA ASSIGN INT
	|	LOCALS ASSIGN stackMapTableTypes
	|	STACK ASSIGN stackMapTableTypes
	)*
	;

stackMapTableTypes
	:	LBRACK (stackMapTableType (COMMA stackMapTableType)*)? RBRACK
	;

stackMapTableType
	:	CLASS? (typeIdentifier|QuotedTypeIdentifier|PrimitiveType)
	;
//*******************************/
//						Lexer			 				 /
//*******************************/

Constant_pool_index
	:	HASH INT;

LINENUMBERTABLE
	:	'LineNumberTable';
STACKMAPTABLE
	:	'StackMapTable';
LOCALVARIABLETABLE
	:	'LocalVariableTable';
EXCEPTION_TABLE
	:	'Exception table';
NUMBER_OF_ENTRIES
	:	'number_of_entries';
FRAME_TYPE
	:	'frame_type';
OFFSET_DELTA
	:	'offset_delta';

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
DCTOR 	: '<clinit>';
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
	
fragment
Constant_type
	:	'Class'		|	'Fieldref'	|	'Methodref'
	|	'InterfaceMethodref'			|	'String'
	|	'Integer'	|	'Float'		|	'Long'
	|	'Double'	|	'NameAndType'
	|	'Unicode' | 'Utf8'
	;

//Constant_type_UTF8
//	:'Utf8'
//	;

PrimitiveType 
	: 	Numeric_type
	| 	Boolean_type
	;

IDENTIFIER  
	:	(LETTER|'_') (LETTER|DIGIT|'_')*
    	;

INT :	DIGIT+;

//HEX_DIGITS
//	:	HEX_DIGIT+
//	;

PATH	:	SLASH LETTER COLON (SLASH (IDENTIFIER WS*)+)+ JAVABYTECODEFILE;

DATE	:	DIGIT DIGIT MINUS DIGIT DIGIT MINUS INT;

TypeIdentifier
	:	LBRACK* IDENTIFIER (SLASH IDENTIFIER)* //SEMI?
	;
	
QuotedTypeIdentifier
	:	QUOTE TypeIdentifier SEMI? QUOTE
	;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

//UTF8TYPE
//	:	Constant_type_UTF8 REGULAR_STRING_LITERAL_CHARACTER*
//	;

CONSTANT_TYPE_ASSIGNABLE
	:	Constant_type (' ')+ REGULAR_STRING_LITERAL_CHARACTER*
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
	:	 ~( '\\' | '\u000D' | '\u000A' | '\u2028' | '\u2029') //'\"' | 
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