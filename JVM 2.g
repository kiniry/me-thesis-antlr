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

@members{

                private boolean newLineBeforeNextToken( int index ) {

                Token tkn;               
                input = (CommonTokenStream) input;
                while( input.size()>(index+1) && (tkn=input.get(++index)).getChannel() != Token.DEFAULT_CHANNEL ) {

                                if( tkn.getType() == NL ) return true;

                                index++;

                }
                return false;
                }
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
	:	IDENTIFIER WINDOWSPATH NL
	;
	
modified_file_info
	:	MODIFIED DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER NL
	;
	
checksum_file_info
	:	CHECKSUM (IDENTIFIER | HexDigits) NL
	;
		
compiled_file_info
	:	COMPILED QuotedFile NL
	;
	
//*******************************/
//	type header
//*******************************/
	
type_info
	:	(sourcefile_info
	|	major_version_info
	|	minor_version_info
	|	flags
	| scalaSig_info NL
	| runtimeVisibleAnnotations_info
	|	innerclass_info
	| enclosingMethod
	| signature_info_addition
	| deprecated)+
	;

deprecated
	:	Deprecated BOOLEANLITERAL NL
	;

enclosingMethod
	: EnclosingMethod	CPINDEX DOT CPINDEX NL?
	;

sourcefile_info
	: SourceFile QuotedFile NL
	;

scalaSig_info
	:	(ScalaSig |Scala)
		IDENTIFIER ASSIGN INTLITERAL  NL
		(INTLITERAL INTLITERAL INTLITERAL)?
	;
	
runtimeVisibleAnnotations_info
	:	RuntimeVisibleAnnotations NL
	 	runtimeVisibleAnnotationsItem+
  ;

runtimeVisibleAnnotationsItem
	:	PC CPINDEX LPAREN runtimeVisibleAnnotationAssignList? RPAREN NL
	;

runtimeVisibleAnnotationAssignList
	:	annotationAssign (COMMA annotationAssign)* -> annotationAssign+
	;

annotationAssign
	:	CPINDEX ASSIGN (BrackedAnnotationAssign | AnnotationAssign)
	;
		
signature_info_addition
	: Signature	CPINDEX NL?
	;

innerclass_info
	: InnerClasses  NL
		innerclass_info_line+
	;
innerclass_info_line
	:	 method_modifier* CPINDEX ((ASSIGN CPINDEX IDENTIFIER CPINDEX) | (IDENTIFIER CPINDEX))? SEMI NL?
	;
		
major_version_info
	:	MAJOR_VERSION INTLITERAL NL
	;
		
minor_version_info
	:	MINOR_VERSION INTLITERAL NL
	;
			
flags
	:	Flag accessFlagList NL+
	;
	
accessFlagList
	:	IDENTIFIER (COMMA IDENTIFIER)* -> IDENTIFIER+
	;

//*******************************/
//	Constant pool
//*******************************/

constant_pool
	:	CONSTANTPOOL COLON! NL
		contant_pool_line*
	;
	
contant_pool_line
	:	CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE
	;

//*******************************/
//				Class definition       /
//*******************************/

classDefinition
	:	class_visual_modifier? class_modifier* javaTypeIdentifier superClass? superInterface? NL
		type_info
		constant_pool
		LBRACE NL
		classBody?
		RBRACE NL
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
//	(	
//		methodDefinition
//	|	fieldDefinition
//	|	ctorDefinition
//	|	staticCtorDefinition
//	)+
	(	
		(methodDefinition) => methodDefinition
	|	(ctorDefinition) => ctorDefinition
	|	(fieldDefinition) => fieldDefinition
	|	staticCtorDefinition
	)+
	;

//*******************************/
//				Field definition			 /
//*******************************/

fieldDefinition
	:	field_visual_modifier? field_modifier* aggregatedJavaType identifier (ASSIGN literals)? SEMI NL
		fieldInfo
		fieldAdditionalInfo?
	;
	
wtf
	: identifier SEMI
	;

fieldInfo
	:	Signature fieldInfoOption1 NL
//		t=Flag { !newLineBeforeNextToken($t.getTokenIndex() ) }? accessFlagList	
		Flag accessFlagList? NL+
//		Flag flagList		
	;

fieldAdditionalInfo
	:	(Constant fieldInfoOption3
	|	Constant fieldInfoOption4
	|	Signature fieldInfoOption5
	|	Deprecated fieldInfoOption6
	|	Synthetic fieldInfoOption6) NL+
	;

fieldInfoOption1 // Minded signatures
	:	bytecodeType
	;
	
fieldInfoOption2 // Minded Flags
	:	IDENTIFIER (COMMA IDENTIFIER)* -> IDENTIFIER+
	;

fieldInfoOption3 // Minded constant values
	:	primitiveType literals
	;

fieldInfoOption4 // Minded constant values
	:	CONSTANT_TYPE_ASSIGNABLE
	;

fieldInfoOption5 // Minded signatures
	:	 CPINDEX
	;

fieldInfoOption6 // Minded deprecates
	:	 BOOLEANLITERAL
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
	:	field_visual_modifier? STATIC LBRACE RBRACE SEMI NL
		methodInfo
		body
	;
	
//*******************************/
//				Ctor definition			 	 /
//*******************************/

ctorDefinition
	:	field_visual_modifier? javaType arguments throwClause? SEMI NL
		methodInfo
		body
		afterMethodInfo
	;

//*******************************/
//				Method definition			 /
//*******************************/

methodDefinition
	:	method_modifier* genericReturn? aggregatedJavaType javaTypeIdentifier arguments throwClause? SEMI NL
		methodInfo
		body?
		afterMethodInfo
	;

methodInfo
	:	Signature methodSignatureInfo NL
		Flag accessFlagList? NL+
//		Flag flagList
	;

//flagList
//	:	{ newLineBeforeNextToken(input.LT(1).getTokenIndex()) == false}? accessFlagList
//	;

afterMethodInfo
	:	((Deprecated	methodDeprecatedInfo
	|	Signature CPINDEX
	|	runtimeVisibleAnnotations_info
	| Exceptions NL throwClause
	| Synthetic BOOLEANLITERAL
	| annotationDefault) NL*)*
	;

annotationDefault
	:	AnnotationDefault NL DefaultValue (AnnotationAssign | LBRACK RBRACK)
	;
//methodExceptions
//	:	(THROWS NORMALTYPE NL)+
//	;
	
methodSignatureInfo
	:	methodDescriptor
	;

methodDescriptor
	:	LPAREN bytecodeType* RPAREN returnDescriptor
	;

returnDescriptor
	:	bytecodeType | VoidType
	;
	
methodDeprecatedInfo
	:	BOOLEANLITERAL
	;
	
//method_visual_modifier
//	:	PUBLIC	|	PRIVATE |	PROTECTED
//	;
		
method_modifier
	:	ABSTRACT | FINAL	|	STATIC	|	SYNCHRONIZED	|	NATIVE | PUBLIC	|	PRIVATE |	PROTECTED
	;

arguments
	:	LPAREN typeList? RPAREN
	;

//*******************************/
//				Body definition			 /
//*******************************/
	
body	
	:	
//	(Exceptions NL 
//		methodExceptions)?
		Code NL
		codeBlock
		(bodyExtension)*
	;

bodyExtension
	:	 
	(	ExceptionTable NL exceptionTable
	|	LineNumberTable NL lineNumberTable
	| LocalVariableTable NL	localVariableTable
	| LocalVariableTypeTable NL	localVariableTable
	|	StackMapTable stackMapTable
	|	StackMap stackMapTypeTable)
	;

codeBlock
	:	variables NL
		(codeLine |	javaSwitch)*
		codeBlockEnd
	;

codeLine
	:	PC IDENTIFIER codeValues? NL?
	;

codeBlockEnd
	:	PC IDENTIFIER logic3? NL+
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
		LBRACE NL
		switchLine*
		switchDefaultLine
		RBRACE NL
	;
	
switchLine
	:	PC INTLITERAL NL+
	;

switchDefaultLine
	:	DEFAULT COLON INTLITERAL NL
	;

//*******************************/
//				Exceptions						 /
//*******************************/

throwClause
	: THROWS javaTypeList
	;

exceptionTable
	:	IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER NL
		exceptionTableEntry+
	;

exceptionTableEntry
	:	INTLITERAL INTLITERAL INTLITERAL (primitiveType NL | IDENTIFIER NL	|	(CONSTANT_TYPE_ASSIGNABLE))
	;
	
//*******************************/
//				LineNumber						 /
//*******************************/

lineNumberTable
	:	lineNumberTableLine*
	;

lineNumberTableLine
	:	IDENTIFIER PC INTLITERAL NL+
	;
	
//*******************************/
//			localVariableTable			 /
//*******************************/
	
localVariableTable
	:	IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER NL
		localVariableTableLine+
	;
	
localVariableTableLine
	:	INTLITERAL INTLITERAL INTLITERAL IDENTIFIER bytecodeType NL+;
	
//*******************************/
//			StackMapTypeTable				 /
//*******************************/

stackMapTypeTable
	:	IDENTIFIER ASSIGN INTLITERAL NL
		stackMapTypeTableEntry+
	;

stackMapTypeTableEntry
	:	IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL NL
		IDENTIFIER ASSIGN stackMapTableTypesContainer NL
		IDENTIFIER ASSIGN stackMapTableTypesContainer NL+
	;

//*******************************/
//				StackMapTable				 	 /
//*******************************/

stackMapTable
	:	IDENTIFIER ASSIGN INTLITERAL NL
		stackMapTableEntry+
	;
stackMapTableEntry
	:	IDENTIFIER ASSIGN (INTLITERAL | stackMapTableTypesContainer) NL+
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
	:	LESST (genericConstraint|genericType|javaType) (COMMA (genericConstraint|genericType|javaType))* LARGET
	;
	
genericConstraint
	:	QUESTION ((SUPER | EXTENDS ) (genericType | javaType))?
	;

genericGeneric
	:	javaType LESST (javaType) (COMMA (javaType))* LARGET
	;

javaTypeList
	:	javaType (COMMA javaType)* -> javaType+
	;

javaType
	:	NORMALTYPE | identifier
	;
	
//*******************************/
// Bytecode Types
//*******************************/

genericReturn
	: LESST genericReturnDescriptor (COMMA genericReturnDescriptor)* LARGET -> genericReturnDescriptor+
	;

genericReturnDescriptor
	:	identifier EXTENDS simpleByteCodeType// (AND simpleByteCodeType)*
	;

simpleByteCodeType // Used for private <T extends org/Object> returnType methodName(...);
	:	INTERNALTYPE | identifier
	;

bytecodeType
	:	bytecodeArrayType | bytecodeBaseType | bytecodeObjectType
	;

bytecodeArrayType
	:	ArrayType
  ;
 
 bytecodeBaseType
 	:	BaseType
 	;
 
 bytecodeObjectType
 	:	INTERNALTYPE SEMI
  |	VersionedInternalType SEMI
  | IDENTIFIER SEMI
  | GenericObjectType SEMI
 	;

//*******************************/
// Simple types
//*******************************/

identifier: IDENTIFIER | BaseType | VoidType;

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

literals
	:	LONGLITERAL
	|	INTLITERAL
	|	FLOATLITERAL
	|	DOUBLELITERAL
	|	CHARLITERAL
	|	STRINGLITERAL
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
 
COMPILED 				: 'Compiled from'		; CONSTANTPOOL	: 'Constant pool'	;	 
MODIFIED 				: 'Last modified'		;	CHECKSUM 			: 'MD5 checksum'	;	

//*******************************/
// Captions
//*******************************/

Flag					: 'flags' COLON					;	RuntimeVisibleAnnotations	:	'RuntimeVisibleAnnotations' COLON	;
Code					:	'Code' COLON					;	SourceFile								: 'SourceFile' COLON								;
Scala					: 'Scala' COLON					;	Deprecated								:	'Deprecated' COLON								;
Signature			: 'Signature' COLON			;	Exceptions								: 'Exceptions' COLON								;
Constant			:	'ConstantValue'	COLON	;	LineNumberTable						:	'LineNumberTable' COLON						;
StackMapTable :	'StackMapTable' COLON	;	LocalVariableTable				: 'LocalVariableTable' COLON				;
Throws				:	'Throws' COLON				;	InnerClasses							:	'InnerClasses' COLON							;
MAJOR_VERSION	:	'major version' COLON ;	MINOR_VERSION							:	'minor version' COLON							;
ScalaSig			: 'ScalaSig' COLON			; EnclosingMethod						: 'EnclosingMethod' COLON						;
ExceptionTable:	'Exception table'COLON;	LocalVariableTypeTable		: 'LocalVariableTypeTable' COLON		;
Synthetic			:	'Synthetic' COLON			;	StackMap									:	'StackMap' COLON									;
DefaultValue	: 'default_value' COLON	; AnnotationDefault					: 'AnnotationDefault' COLON					;

Constant_type
	:	'Class'		|	'Fieldref'	|	'Methodref'
	|	'InterfaceMethodref'		|	'String'
	|	'Integer'	|	'Float'			|	'Long'
	|	'Double'	|	'NameAndType'
	|	'Unicode' | 'Utf8'
	;

EXTENDS		: 'extends'		;		IMPLEMENTS		: 'implements' 	;		DEFAULT		: 'default' 	;
ABSTRACT 	: 'abstract'	;		PUBLIC 				: 'public'			;		FINAL 		: 'final'			;
STATIC 		: 'static'		;		PRIVATE 			: 'private'			;		PROTECTED : 'protected'	;
INTERFACE : 'interface'	;		SYNCHRONIZED 	: 'synchronized';		NATIVE 		: 'native'		;
VOLATILE 	: 'volatile'	;		TRANSIENT 		: 'transient'		;		CLASS			: 'class' 		;
THROWS		: 'throws' 		;		SUPER					: 'super' 			;

BOOLEANLITERAL	:	TRUE | FALSE;

fragment FALSE		:	 'false'		;
fragment TRUE			:	 'true'			;
	
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
QUESTION:	'?'		; STAR		: '*'		;

//*******************************/
// Types
//*******************************/

BOOLEAN		:  'boolean' 	;
CHAR			:  'char' 		;
BYTE			:  'byte' 		;
DOUBLE		:  'double' 	;
FLOAT			:  'float' 		;
LONG			:  'long' 		;
INT				:  'int' 			;
VOID			:  'void' 		;
SHORT			:  'short' 		;


VoidType:	'V';
BaseType:	'B'	|	'C'	|	'D'	|	'F'	|	'I'	|	'J'	|	'S'	|	'Z';

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
	: IDENTIFIER (DOT (IDENTIFIER | DOT DOT))+;
INTERNALTYPE
	: IDENTIFIER (SLASH IDENTIFIER)+;

//FIL IDENTIFIER;
//ObjectType: BaseType* 'L' (INTERNALTYPE | IDENTIFIER) (DOT IntegerNumber)? SEMI;
VersionedInternalType	:	INTERNALTYPE (DOT IntegerNumber);

GenericObjectType:	'L' (INTERNALTYPE | IDENTIFIER) LESST (((MINUS|PLUS)? (('L' INTERNALTYPE) | IDENTIFIER) SEMI)+ | STAR) LARGET;

ArrayType:	LBRACK+ (INTERNALTYPE SEMI | IDENTIFIER SEMI | BaseType);

WINDOWSPATH	:	SLASH Letter COLON (SLASH (IDENTIFIER WS*)+)+ DOT IDENTIFIER;

DATE	:	IntDigit IntDigit MINUS IntDigit IntDigit MINUS IntDigit IntDigit IntDigit IntDigit;


COMMENT
    :   '//' ~('\n'|'\r')* ('\r\n'|'\n'|'\r') {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        ) {$channel=HIDDEN;}
    ;
NL
	: 		( '\r'
        | '\n'
        | '\r\n'
        )
	;

QuotedFile
	:	QUOTE IDENTIFIER DOT IDENTIFIER QUOTE
	;
QuotedBytecodeType
	:	QUOTE (INTERNALTYPE SEMI | ArrayType) QUOTE
	;
AnnotationAssign
	: (BaseType | LBRACK | '@' | 'c' | 'e' | 's') CPINDEX (DOT CPINDEX)?
	;
BrackedAnnotationAssign
	:	LBRACK AnnotationAssign (COMMA AnnotationAssign)* RBRACK
	;
//AnnotationAssign
//	: LBRACK BrackedAnnotationAssign RBRACK
//	;
//BrackedAnnotationAssign
//	:	(BaseType | LBRACK | '@' | 'c' | 'e' | 's') CPINDEX
//	;

//*******************************/
// Literals
//*******************************/

LONGLITERAL 	: INTLITERAL LongSuffix 		;
INTLITERAL 	: ( PLUS | MINUS )? IntegerNumber 	;
FLOATLITERAL 	: NonIntegerNumber FloatSuffix 		;
DOUBLELITERAL 	: NonIntegerNumber DoubleSuffix? 	;
CHARLITERAL 	: '\'' EscapeSequence '\'' 		;
STRINGLITERAL 	: QUOTE EscapeSequence* QUOTE 		;

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