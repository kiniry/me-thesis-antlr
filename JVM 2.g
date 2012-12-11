grammar JVM;

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
	:	IDENTIFIER WINDOWSPATH
	;
	
modified_file_info
	:	MODIFIED DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER
	;
	
checksum_file_info
	:	CHECKSUM (IDENTIFIER | HexDigits)
	;
		
compiled_file_info
	:	COMPILED QuotedFile
	;
	
file_name
	:	 IDENTIFIER DOT IDENTIFIER
	;
	
//*******************************/
//	type header
//*******************************/
	
type_info
	:	(infoTypeCaption infoTypes)+
	;
	
infoTypes
	:	sourcefile_info
//	|	signature_info
	|	minor_major_version_info
	|	flags
	| scalaSig_info
	| runtimeVisibleAnnotations_info
	|	innerclass_info
	| enclosingMethod
	| signature_info_addition
	| deprecated
	;

infoTypeCaption
	:	(MINOR_VERSION| MAJOR_VERSION | IDENTIFIER) COLON
	;

caption
	:	IDENTIFIER COLON
	;

deprecated
	:	BOOLEANLITERAL
	;

enclosingMethod
	:	CPINDEX DOT CPINDEX
	;

sourcefile_info
	:	QuotedFile
	;

scalaSig_info
	:	IDENTIFIER ASSIGN INTLITERAL
		(INTLITERAL INTLITERAL INTLITERAL)?
	;
	
runtimeVisibleAnnotations_info
	:	PC CPINDEX LPAREN (CPINDEX ASSIGN IDENTIFIER CPINDEX)? RPAREN
  ;
		
signature_info
	:	methodDescriptor
	;
		
signature_info_addition
	:	CPINDEX
	;

innerclass_info
	: innerclass_info_line+
	;
innerclass_info_line
	:	field_visual_modifier? method_modifier* CPINDEX ((ASSIGN CPINDEX IDENTIFIER CPINDEX) | (IDENTIFIER CPINDEX))? SEMI
	;
		
minor_major_version_info
	:	INTLITERAL
	;
			
flags
	:	accessFlagList
	;
	
accessFlagList
	:	IDENTIFIER (COMMA IDENTIFIER)* -> IDENTIFIER+
	;

//*******************************/
//	Constant pool
//*******************************/

constant_pool
	:	CONSTANTPOOL COLON!
		contant_pool_line*
	;
	
contant_pool_line
	:	CPINDEX ASSIGN 
		CONSTANT_TYPE_ASSIGNABLE
	;

//*******************************/
//				Class definition       /
//*******************************/

classDefinition
	:	class_visual_modifier? class_modifier* javaTypeIdentifier superClass? superInterface?
		type_info
		constant_pool
		LBRACE
		classBody?
		RBRACE
	;
	
superClass
	:	EXTENDS typeList
	;
	
superInterface
	:	IMPLEMENTS typeList
	;
		
class_visual_modifier
	:	PUBLIC
	;
		
class_modifier
	:	ABSTRACT | FINAL | INTERFACE | CLASS
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
	:	field_visual_modifier? field_modifier* aggregatedJavaType IDENTIFIER (ASSIGN MINUS? INTLITERAL)? SEMI
		fieldInfoTypes
	;

fieldInfoTypes
	:	caption fieldInfoOption1
		caption fieldInfoOption2
		(caption fieldInfoOption3
	|	caption fieldInfoOption4)?
	;
	
fieldInfoOption1 // Minded signatures
	:	bytecodeType
	;
	
fieldInfoOption2 // Minded Flags
	:	IDENTIFIER (COMMA IDENTIFIER)* -> IDENTIFIER+
	;

fieldInfoOption3 // Minded constant values
	:	primitiveType (MINUS | PLUS)? INTLITERAL
	;

fieldInfoOption4 // Minded signatures
	:	 CPINDEX
	;

field_visual_modifier
	:	PUBLIC	|	PRIVATE |	PROTECTED
	;
		
field_modifier
	:	FINAL	|	STATIC	|	TRANSIENT	|	VOLATILE
	;
	
//*******************************/
//		Static ctor definition		 /
//*******************************/

staticCtorDefinition
	:	field_visual_modifier? STATIC LBRACE RBRACE SEMI
		methodInfo
		body
	;
	
//*******************************/
//				Ctor definition			 	 /
//*******************************/

ctorDefinition
	:	field_visual_modifier? javaType arguments throwClause? SEMI
		methodInfo
		body
		afterMethodInfo
	;

//*******************************/
//				Method definition			 /
//*******************************/

methodDefinition
	: method_visual_modifier? method_modifier* genericReturnDescriptor? aggregatedJavaType javaTypeIdentifier arguments throwClause? SEMI
		methodInfo
		body?
		afterMethodInfo
	;

methodInfo
	:	methodBeforeInfoTypes //(caption methodBeforeInfoTypes)+
	;

afterMethodInfo
	:	(caption methodAfterInfoTypes)*
	;

methodBeforeInfoTypes
	:	caption methodSignatureInfo	
		caption methodFlagList
		(caption methodExceptions)?
	;

methodAfterInfoTypes
	:	methodDeprecatedInfo
	|	methodGenericSignatureInfo
	|	runtimeVisibleAnnotations_info
	;
	
methodFlagList
	:	IDENTIFIER (COMMA IDENTIFIER)* -> IDENTIFIER+
	;
	
methodExceptions
	:	(THROWS NORMALTYPE)+
	;
	
methodSignatureInfo
	:	methodDescriptor
	;

methodDescriptor
	:	LPAREN bytecodeType* RPAREN returnDescriptor
	;

returnDescriptor
	:	bytecodeType | VoidType
	;
	
methodGenericSignatureInfo
	:	CPINDEX
	;
methodDeprecatedInfo
	:	BOOLEANLITERAL
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

//*******************************/
//				Body definition			 /
//*******************************/
	
body	
	:	caption codeBlock
		(bodyExtension)*
	;

bodyExtension
	:	 
	(EXCEPTION_TABLE COLON exceptionTable
	|	caption (	lineNumberTable
						|	localVariableTable
						|	stackMapTable
						|	throwClause))
	;

codeBlock
	:	variables
		(codeLine |	javaSwitch)*
		codeBlockEnd
	;

codeLine
	:	PC IDENTIFIER codeValues?
	;

codeBlockEnd
	:	PC IDENTIFIER logic3?
	;
	
codeValues
	:	logic 
	| logic2 
	| logic3
	|	logic4
	| primitiveType
	;
	
logic
	:	CPINDEX COMMA INTLITERAL
	;
	
logic2
	:	CPINDEX
	;
	
logic3
	:	INTLITERAL
	;
	
logic4
	:	INTLITERAL COMMA INTLITERAL
	;

variables
	:	variable COMMA variable COMMA variable
	;

variable
	:	IDENTIFIER ASSIGN INTLITERAL
	;

javaSwitch	
	:	PC IDENTIFIER
		LBRACE
		switchLine*
		switchDefaultLine
		RBRACE
	;
	
switchLine
	:	PC INTLITERAL
	;

switchDefaultLine
	:	DEFAULT COLON INTLITERAL
	;

//*******************************/
//				Exceptions						 /
//*******************************/

throwClause
	: THROWS javaType
	;

exceptionTable
	:	IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER
		exceptionTableEntry+
	;

exceptionTableEntry
	:	INTLITERAL INTLITERAL INTLITERAL (primitiveType | IDENTIFIER	|	(CONSTANT_TYPE_ASSIGNABLE))
	;
	
//*******************************/
//				LineNumber						 /
//*******************************/

lineNumberTable
	:	lineNumberTableLine*
	;

lineNumberTableLine
	:	IDENTIFIER PC INTLITERAL
	;
	
//*******************************/
//			localVariableTable			 /
//*******************************/
	
localVariableTable
	:	IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER
		localVariableTableLine+
	;
	
localVariableTableLine
	:	INTLITERAL INTLITERAL INTLITERAL IDENTIFIER bytecodeType
	;
	
//*******************************/
//				StackMapTable				 	 /
//*******************************/

stackMapTable
	:	IDENTIFIER ASSIGN INTLITERAL
		stackMapTableEntry+
	;
stackMapTableEntry
	:	IDENTIFIER ASSIGN (INTLITERAL | stackMapTableTypesContainer)
	;

stackMapTableTypesContainer
	:	LBRACK stackMapTableTypes? RBRACK
	;
	
stackMapTableTypes
	:	stackMapTableType (COMMA stackMapTableType)* -> stackMapTableType+
	;

stackMapTableType
	:	(stackMapTableTypeObject|stackMapTableTypePlainObject|primitiveType)
	;
stackMapTableTypePlainObject
	:	CLASS (INTERNALTYPE | IDENTIFIER)
	;
stackMapTableTypeObject
	:	CLASS QuotedBytecodeType
	;

//*******************************/
// Types
//*******************************/

//*******************************/
// Normal java types
//*******************************/

genericConstraintType
	:	javaType genericConstraintList
	;
	
genericConstraintList
	:	LESST genericConstraints (COMMA genericConstraints)* LARGET -> genericConstraints+
	;

genericConstraints
	:	identifier EXTENDS (genericType | javaType) (AND (genericType | javaType))*
	;

typeList
 	:	aggregatedJavaType (COMMA aggregatedJavaType)* -> aggregatedJavaType+
 	;
  	
aggregatedJavaType
	:	(primitiveType | javaTypeIdentifier) (LBRACK RBRACK)*
	;
	
javaTypeIdentifier
	:	javaType | genericConstraintType | genericType
	;
	
genericType
	:	javaType genericList
	;
	
genericList
	:	LESST ('?'|genericGeneric|javaType) (COMMA ('?'|genericGeneric|javaType))* LARGET
	;

genericGeneric
	:	javaType LESST (javaType) (COMMA (javaType))* LARGET
	;

javaType
	:	NORMALTYPE | identifier
	;
//*******************************/
// Bytecode Types
//*******************************/

genericReturn
	: genericReturnDescriptor javaTypeIdentifier
	;

genericReturnDescriptor
	:	LESST identifier EXTENDS simpleByteCodeType (AND simpleByteCodeType)* LARGET
	;

simpleByteCodeType
	:	INTERNALTYPE | identifier
	;

//*******************************/
// Simple types
//*******************************/

identifier: IDENTIFIER | BaseType | VoidType;

//genericByteCodeType
//	:	ObjectType LESST LARGET
//	;

bytecodeType
	:	BaseType
  | ObjectType
  | ArrayType
  | IDENTIFIER
  | GenericObjectType
  ;

primitiveType
	:	boolean_type
	|	numeric_type
	| VOID
	;

boolean_type
	:	BOOLEAN
	;

numeric_type
	:	floating_point_type
	|	integral_type
	;

integral_type
	:	BYTE
	|	SHORT
	|	INT
	|	LONG
	|	CHAR
	;

floating_point_type
	:	FLOAT
	|	DOUBLE
	;
//*******************************/
// Lexer
//*******************************/

//*******************************/
// Keywords
//*******************************/

//ABSTRACT	:  'abstract' ;	   CONTINUE		:  'continue' 	;	   FOR				:  'for' 				;	   NEW			:  'new' 			;	   SWITCH				:  'switch' 			;
//ASSERT		:  'assert' 	;	   GOTO				:  'goto' 			;	   PACKAGE	:  'package' 	;	   SYNCHRONIZED	:  'synchronized' ;
//DO				:  'do' 			;	   IF					:  'if' 				;	   PRIVATE		:  'private' 		;	   THIS			:  'this' 		;
//BREAK			:  'break' 		;	   IMPLEMENTS	:  'implements' ;	   PROTECTED	:  'protected'	;	   THROW		:  'throw' 		;
//ELSE			:  'else' 		;	   IMPORT			:  'import' 		;	   PUBLIC			:  'public' 		;	   THROWS		:  'throws' 	;
//CASE			:  'case' 		;	   ENUM				:  'enum'				;	   INSTANCEOF	:  'instanceof' ;	   RETURN		:  'return' 	;	   TRANSIENT		:  'transient' 		;
//CATCH			:  'catch' 		;	   TRY				:  'try' 				;
//FINAL			:  'final' 		;	   INTERFACE	:  'interface' 	;	   STATIC			:  'static' 		;	   
//CLASS			:  'class' 		;	   FINALLY		:  'finally' 		;	   STRICTFP		:  'strictfp' 	;	   VOLATILE	:  'volatile' ;
//CONST			:  'const*' 	;	   NATIVE			:  'native' 		;	   SUPER			:  'super' 			;	   WHILE		:  'while' 		;
EXCEPTION_TABLE	:	'Exception table'	; MAJOR_VERSION	:	'major version' ;	MINOR_VERSION	:	'minor version' ;
COMPILED 				: 'Compiled from'		; CONSTANTPOOL	: 'Constant pool'	;
MODIFIED 				: 'Last modified'		;	CHECKSUM 			: 'MD5 checksum'	;

Constant_type
	:	'Class'		|	'Fieldref'	|	'Methodref'
	|	'InterfaceMethodref'		|	'String'
	|	'Integer'	|	'Float'			|	'Long'
	|	'Double'	|	'NameAndType'
	|	'Unicode' | 'Utf8'
	;

EXTENDS		: 'extends'		;		IMPLEMENTS		: 'implements' 	;		DEFAULT		:  'default' 	;
ABSTRACT 	: 'abstract'	;		PUBLIC 				: 'public'			;		FINAL 		: 'final'			;
STATIC 		: 'static'		;		PRIVATE 			: 'private'			;		PROTECTED : 'protected'	;
INTERFACE : 'interface'	;		SYNCHRONIZED 	: 'synchronized';		NATIVE 		: 'native'		;
VOLATILE 	: 'volatile'	;		TRANSIENT 		: 'transient'		;		CLASS			:  'class' 		;
THROWS		:  'throws' 	;

fragment FALSE		:	 'false'		;
fragment TRUE			:	 'true'			;

BOOLEAN		:  'boolean' 	;
CHAR			:  'char' 		;
BYTE			:  'byte' 		;
DOUBLE		:  'double' 	;
FLOAT			:  'float' 		;
LONG			:  'long' 		;
INT				:  'int' 			;
VOID			:  'void' 		;
SHORT			:  'short' 		;
	
fragment QUOTE			:	'\"';
fragment SLASH			:	'/';
fragment UNDERSCORE	:	'_';
fragment HASH				:	'#';

MINUS		:	'-'		;	PLUS		:	'+'		;	
COLON		:	':'		;	SEMI		: ';'		;	
COMMA		:	','		; DOT			:	'.'		;	
LBRACE	:	'{'		;	RBRACE	:	'}'		;
LBRACK	:	'['		;	RBRACK	:	']'		;
LPAREN	:	'('		;	RPAREN	:	')'		;
LESST		:	'<'		;	LARGET	:	'>'		;
ASSIGN	:	'='		; AND			:	'&'		;


VoidType:	'V';
BaseType:	'B'	|	'C'	|	'D'	|	'F'	|	'I'	|	'J'	|	'S'	|	'Z';
BOOLEANLITERAL	:	TRUE | FALSE;

//*******************************/
// Others
//*******************************/

CONSTANT_TYPE_ASSIGNABLE
	:	Constant_type (' ')+ (~('\n'|'\r'|' ')+ (' ')+)* ~('\n'|'\r'|' ')* '\r'? '\n'
	;
PC
	:	IntDigit+ COLON;
CPINDEX
	:	HASH INTLITERAL;
IDENTIFIER  
	:	(Letter|'_'|'$') (Letter|IntDigit|'_'|'$')*;
NORMALTYPE
	: IDENTIFIER (DOT IDENTIFIER)+;
INTERNALTYPE
	: IDENTIFIER (SLASH IDENTIFIER)+;

ObjectType: BaseType* 'L' (INTERNALTYPE | IDENTIFIER) SEMI;
GenericObjectType:	'L' (INTERNALTYPE | IDENTIFIER) LESST (ObjectType) LARGET SEMI;

ArrayType:	LBRACK+ (BaseType+ | ObjectType);

WINDOWSPATH	:	SLASH Letter COLON (SLASH (IDENTIFIER WS*)+)+ DOT IDENTIFIER;

DATE	:	IntDigit IntDigit MINUS IntDigit IntDigit MINUS IntDigit IntDigit IntDigit IntDigit;


COMMENT
    :   '//' ~('\n'|'\r')* ('\r\n'|'\n'|'\r') {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

QuotedFile
	:	QUOTE IDENTIFIER DOT IDENTIFIER QUOTE
	;
QuotedBytecodeType
	:	QUOTE (ObjectType | ArrayType) QUOTE
	;

//*******************************/
// Literals
//*******************************/

LONGLITERAL : IntegerNumber LongSuffix ; 
INTLITERAL : IntegerNumber ;
FLOATLITERAL : NonIntegerNumber FloatSuffix ; 
DOUBLELITERAL : NonIntegerNumber DoubleSuffix? ;
//CHARLITERAL : '\'' EscapeSequence '\'' ;
//STRINGLITERAL : QUOTE EscapeSequence* QUOTE ;
HexDigits	:	HexDigit+;

fragment IntegerNumber : '0' | '1'..'9' IntDigit* | '0' Octal+ | HexPrefix HexDigit+ ;
fragment IntDigit	:	'0'..'9';
fragment HexPrefix : '0x' | '0X' ; 
fragment HexDigit : (IntDigit|('a'..'f')|('A'..'F')) ; 
fragment LongSuffix : 'l' | 'L' ; 
fragment NonIntegerNumber : IntDigit+ DOT IntDigit* Exponent? | '.' IntDigit+ Exponent? | IntDigit+ Exponent | IntDigit+ | HexPrefix HexDigit* ( () | ('.' HexDigit*) ) ( 'p' | 'P' ) ( PLUS | MINUS )? IntDigit+ ; 
fragment Exponent : ( 'e' | 'E' ) ( PLUS | MINUS )? IntDigit+ ; 
fragment FloatSuffix : 'f' | 'F' ; 
fragment DoubleSuffix : 'd' | 'D' ;
fragment Letter	:	('a'..'z'|'A'..'Z');
fragment Octal	:	'0'..'7';
fragment OctalEscape
    :   '\\' ('0'..'3') Octal Octal
    |   '\\' Octal Octal
    |   '\\' Octal
    ;
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscapeSequence
    |   OctalEscape
    | 	~( '\\' | '\u000D' | '\u000A' | '\u2028' | '\u2029' | '\"' )
    ;
fragment
UnicodeEscapeSequence
	:	('\\' 'u'   HexDigit   HexDigit   HexDigit  HexDigit)
	|	('\\' 'U'   HexDigit   HexDigit   HexDigit  HexDigit  
					HexDigit   HexDigit   HexDigit  HexDigit)
	;