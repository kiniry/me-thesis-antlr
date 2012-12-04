grammar CombinedGrammar;

options {
  language = Java;
  output=AST; 
}

@header {
	package a.b.c;
}

@lexer::header {
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
	:	IDENTIFIER PATH
	;
	
modified_file_info
	:	MODIFIED DATE SEMI IDENTIFIER INT BYTES
	;
	
checksum_file_info
	:	CHECKSUM (IDENTIFIER | HEX_DIGITS)
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
	|	minor_major_version_info
	|	flags
	| scalaSig_info
	| runtimeVisibleAnnotations_info
	|	innerclass_info
	| enclosingMethod)+
	;

enclosingMethod
	:	EnclosingMethod COLON Constant_pool_index DOT Constant_pool_index
	;

sourcefile_info
	:	SOURCEFILE COLON QUOTED_STRING
	;

scalaSig_info
	:	IDENTIFIER COLON IDENTIFIER ASSIGN HEX_DIGITS
		(INT INT INT)?
	;
runtimeVisibleAnnotations_info
	:RuntimeVisibleAnnotations COLON
	INT COLON Constant_pool_index LPAREN Constant_pool_index ASSIGN IDENTIFIER Constant_pool_index RPAREN
  ;
		
signature_info
	:	SIGNATURE COLON (typeSignature | Constant_pool_index)
	;

innerclass_info
	: IDENTIFIER COLON
		innerclass_info_line+
	;
innerclass_info_line
	:field_visual_modifier? method_modifier* Constant_pool_index (ASSIGN Constant_pool_index IDENTIFIER Constant_pool_index)? SEMI
	;
		
minor_major_version_info
	:	IDENTIFIER IDENTIFIER COLON INT
	;
			
flags
	:	FLAGS COLON accessFlagList
	;
	
accessFlagList
	:	ACCESS_FLAGS? (COMMA ACCESS_FLAGS)* -> ACCESS_FLAGS*
	;
	
typeSignature
	:	(LPAREN (typeIdentifier)* RPAREN)? typeIdentifier
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
	;
	
otherType
	:	IDENTIFIER Constant_pool_index ((DOT | COLON) Constant_pool_index)?
	;

//*******************************/
//				Class definition       /
//*******************************/


classDefinition
	:	class_visual_modifier? class_modifier* classOrInterfaceType (EXTENDS type )? (IMPLEMENTS typeList )?
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
	:	ABSTRACT | FINAL | INTERFACE | CLASS
	;

typeList
 	:	type (COMMA type)* -> type+
 	; 
  	
type 
	:	(PrimitiveType | classOrInterfaceType | genericType) (LBRACK RBRACK)*
	;

genericType
	:	classOrInterfaceType LESST classOrInterfaceTypeList LARGET
	;

classOrInterfaceType
	:	(IDENTIFIER | PACKAGETYPEIDENTIFIER)
	;
	
classOrInterfaceTypeList
	:	classOrInterfaceType (COMMA classOrInterfaceType)* -> classOrInterfaceType+
	;

//*******************************/
//					Code body			 			 /
//*******************************/
	
classBody
	:	
	(	fieldDefinition
	|	ctorDefinition
	|	methodDefinition
	|	staticCtorDefinition
	)+
	;

//*******************************/
//				Field definition			 /
//*******************************/

fieldDefinition
	:	field_visual_modifier? field_modifier* type typeIdentifier (ASSIGN MINUS? INT SEMI)?
	type_info
	constantValue?
	;

constantValue
	:	IDENTIFIER COLON type MINUS? INT
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
	:	field_visual_modifier? classOrInterfaceType arguments throwClause? SEMI
		type_info
		body?
	;
	
//*******************************/
//		Static ctor definition		 /
//*******************************/

staticCtorDefinition
	:	field_visual_modifier? STATIC LBRACE RBRACE SEMI
		type_info
		body
	;

//*******************************/
//				Method definition			 /
//*******************************/

methodDefinition
	: 	method_visual_modifier? method_modifier* type IDENTIFIER arguments throwClause? SEMI
		type_info		
		body?
		signature_info?
		deprecated?
	;
	
deprecated
	:	IDENTIFIER COLON IDENTIFIER
	;
	
method_visual_modifier
	:	PUBLIC	|	PRIVATE |	PROTECTED
	;
		
method_modifier
	:	ABSTRACT | FINAL	|	STATIC	|	SYNCHRONIZED	|	NATIVE
	;

arguments
	:	LPAREN typeList? RPAREN
	;
	
body	
	: (codeBlock
	|	exceptionTable
	|	lineNumberTable
	|	localVariableTable
	|	stackMapTable
	|	exceptionDeclaration)+
	;

codeBlock
	:	CODE COLON
		variables
		(codeLine |	javaSwitch)*
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
		INT INT INT CONSTANT_TYPE_ASSIGNABLE//IDENTIFIER typeIdentifier
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
	|	LOCALS ASSIGN stackMapTableTypesContainer
	|	STACK ASSIGN stackMapTableTypesContainer
	)*
	;

stackMapTableTypesContainer
	:	LBRACK stackMapTableTypes? RBRACK
	;
	
stackMapTableTypes
	:	stackMapTableType (COMMA stackMapTableType)* -> stackMapTableType+
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
EnclosingMethod
	:	'EnclosingMethod';

MODIFIED : 'Last modified';	CHECKSUM : 'MD5 checksum';	//CLASSFILE : 'Classfile';
SOURCEFILE : 'SourceFile';	//MINORVERSION : 'minor version';	MAJORVERSION : 'major version';
FLAGS : 'flags';		BYTES : 'bytes';	//SIZE : 'size';
JAVAFILETYPE : '.java';		COMPILED : 'Compiled from';	CLASS : 'class';
DEFAULT : 'default';	//JAVABYTECODEFILE	:	'.class'	;
EXTENDS : 'extends';		IMPLEMENTS : 'implements';	SIGNATURE : 'Signature';
CONSTANTPOOL : 'Constant pool';	THROWS : 'throws';		CODE : 'Code';
TABLESWITCH : 'tableswitch';	LOOKUPSWITCH : 'lookupswitch';	EXCEPTIONS : 'Exceptions';

ABSTRACT : 'abstract';		PUBLIC : 'public';		FINAL : 'final';
STATIC : 'static';		PRIVATE : 'private';		PROTECTED : 'protected';
INTERFACE : 'interface';	SYNCHRONIZED : 'synchronized';	NATIVE : 'native';
VOLATILE : 'volatile';		TRANSIENT : 'transient'; CTOR : '<init>';
DCTOR 	: '<clinit>';	
//SCALASIG	: 'ScalaSig'; //INNERCLASSES : 'InnerClasses';
RuntimeVisibleAnnotations: 'RuntimeVisibleAnnotations';
STACK	:	'stack';	LOCALS	:	'locals';	ARGS:	'args_size';


MINUS	:	'-'		;	PLUS		:	'+'		;	
COLON	:	':'		;	SEMI		: 	';'		;	
fragment QUOTE	:	'\"'		;	COMMA		:	','		;
DOT	:	'.'		;	
fragment SLASH		:	'/'		;
LBRACE	:	'{'		;	RBRACE		:	'}'		;
LBRACK	:	'['		;	RBRACK		:	']'		;
LPAREN	:	'('		;	RPAREN		:	')'		;
LESST		:	'<'		;	LARGET		:	'>'		;
ASSIGN	:	'='		;	fragment UNDERSCORE	:	'_'		;
HASH		:	'#'		;

QUOTED_STRING
	:
	QUOTE IDENTIFIER DOT IDENTIFIER QUOTE
	;

ACCESS_FLAGS
	:	('ACC_PUBLIC'		|	'ACC_PRIVATE'
	|	'ACC_PROTECTED'	|	'ACC_STATIC'
	|	'ACC_FINAL'			|	'ACC_SYNCHRONIZED'
	|	'ACC_VOLATILE'	|	'ACC_TRANSIENT'
	|	'ACC_NATIVE'		|	'ACC_INTERFACE'
	|	'ACC_ABSTRACT'	| 'ACC_SUPER'
	|	'ACC_SYNTHETIC'	|	'ACC_ANNOTATION'
	|	'ACC_ENUM'			|	'ACC_BRIDGE')	; // ACC_SUPER is not presented in the specification of jvm 1

fragment
Constant_type
	:	'Class'		|	'Fieldref'	|	'Methodref'
	|	'InterfaceMethodref'			|	'String'
	|	'Integer'	|	'Float'		|	'Long'
	|	'Double'	|	'NameAndType'
	|	'Unicode' | 'Utf8'
	;

PrimitiveType 
	: 	Numeric_type
	| 	Boolean_type
	;

IDENTIFIER  
	:	(LETTER|'_') (LETTER|DIGIT|'_'|'$')*
    	;
 	
PACKAGETYPEIDENTIFIER 
	: 	IDENTIFIER (DOT IDENTIFIER)+
	;

INT :	DIGIT+;

HEX_DIGITS
	:	'0x'? HEX_DIGIT+
	;

PATH	:	SLASH LETTER COLON (SLASH (IDENTIFIER WS*)+)+ DOT IDENTIFIER;

DATE	:	DIGIT DIGIT MINUS DIGIT DIGIT MINUS INT;

TypeIdentifier
	:	LBRACK* IDENTIFIER (SLASH IDENTIFIER)*
	;
	
QuotedTypeIdentifier
	:	QUOTE TypeIdentifier SEMI? QUOTE
	;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

CONSTANT_TYPE_ASSIGNABLE
	:	Constant_type (' ')+ ~(NL|'\r')* '\r'? NL
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