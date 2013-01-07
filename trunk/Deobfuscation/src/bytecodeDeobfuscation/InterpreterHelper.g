grammar InterpreterHelper;

options {
  language = Java;
  output=AST; 
}

@header {
  package bytecodeDeobfuscation;
}

@lexer::header {
  package bytecodeDeobfuscation;
}

//*******************************/
//  Class files 
//*******************************/

program : class_file*;

class_file
  : class_file_header classDefinition;
  
class_file_header
  : (class_file_info
  | modified_file_info
  | checksum_file_info
  | compiled_file_info)* 
  ;
class_file_info
  : IDENTIFIER WINDOWSPATH 
  ;
  
modified_file_info
  : IDENTIFIER IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER 
  ;
  
checksum_file_info
  : IDENTIFIER IDENTIFIER (IDENTIFIER | HexDigits) 
  ;
    
compiled_file_info
  : IDENTIFIER IDENTIFIER STRINGLITERAL 
  ;
  
//*******************************/
//  type header
//*******************************/
  
type_info
  : (sourcefile_info
  | minor_major_version_info
  | flags
  | scalaSig_info 
  | runtimeVisibleAnnotations_info
  | innerclass_info
  | enclosingMethod
  | signature_info_addition
  | deprecated
  | synthetic)+
  ;

synthetic
  : Synthetic BOOLEANLITERAL 
  ;

deprecated
  : Deprecated BOOLEANLITERAL 
  ;

enclosingMethod
  : EnclosingMethod CPINDEX DOT CPINDEX ?
  ;

sourcefile_info
  : SourceFile STRINGLITERAL 
  ;

scalaSig_info
  : (ScalaSig |Scala)
    IDENTIFIER ASSIGN INTLITERAL  
    (INTLITERAL INTLITERAL INTLITERAL)?
  ;
  
//*******************************/
//  Runetime visibility
//*******************************/

runtimeVisibleAnnotations_info
  : RuntimeVisibleAnnotations 
    runtimeVisibleAnnotationsItem+
  ;
runtimeVisibleAnnotationsItem
  : pc runtimeVisibleAnnotationsValue
  ;
runtimeVisibleAnnotationsValue
  : CPINDEX LPAREN runtimeVisibleAnnotationAssignList? RPAREN 
  ;
runtimeVisibleAnnotationAssignList
  : annotationAssign (COMMA annotationAssign)* -> annotationAssign+
  ;
annotationAssign
  : CPINDEX ASSIGN (brackedAnnotationAssign | AnnotationAssign)
  ;
brackedAnnotationAssign
  : LBRACK brackedAnnotationAssignList? RBRACK
  ;
brackedAnnotationAssignList
  : brackedAnnotationAssignValue (COMMA brackedAnnotationAssignValue)* -> brackedAnnotationAssignValue+
  ;
brackedAnnotationAssignValue
  : AnnotationAssign (LPAREN runtimeVisibleAnnotationAssignList RPAREN)?
  ;
runtimeVisibleParameterAnnotations
  : RuntimeVisibleParameterAnnotations 
    parameterVisibilityInfo+
  ;
runtimeInvisibleParameterAnnotations
  : RuntimeInvisibleParameterAnnotations 
    parameterVisibilityInfo+
  ;
runtimeInvisibleParameterAnnotationsItem1
  : pc (CPINDEX LPAREN RPAREN)? 
  ;
parameterVisibilityInfo
  : IDENTIFIER? pc
    runtimeVisibleAnnotationsItem*
  ;
runtimeInvisibleAnnotations
  : RuntimeInvisibleAnnotations 
    runtimeInvisibleAnnotationsItem+
  ;
runtimeInvisibleAnnotationsItem
  : pc pc? CPINDEX LPAREN runtimeVisibleAnnotationAssignList? RPAREN 
  ;
   
signature_info_addition
  : Signature CPINDEX ?
  ;

innerclass_info
  : InnerClasses  
    innerclass_info_line+
  ;
  
innerclass_info_line
  :  method_modifier* CPINDEX ((ASSIGN CPINDEX (IDENTIFIER CPINDEX)?) | (IDENTIFIER CPINDEX))? SEMI ?
  ;
    
minor_major_version_info
  : IDENTIFIER IDENTIFIER COLON INTLITERAL 
  ;
    
//minor_version_info
//  : MINOR_VERSION INTLITERAL 
//  ;
      
flags
  : Flag accessFlagList? Marker
  ;
  
accessFlagList
  : flagType (COMMA flagType)* -> flagType+
  ;

flagType
  : IDENTIFIER | INTLITERAL
  ;

//*******************************/
//  Constant pool
//*******************************/

constant_pool
  : IDENTIFIER IDENTIFIER COLON 
    contant_pool_line*
  ;
  
contant_pool_line
  : CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE
  ;

//*******************************/
//        Class definition       /
//*******************************/

classDefinition
  : class_visual_modifier? class_modifier* javaTypeIdentifier superClass? superInterface? 
    type_info
    constant_pool
    LBRACE 
    classBody?
    RBRACE 
  ;
  
superClass
  : EXTENDS typeList
  ;
  
superInterface
  : IMPLEMENTS typeList
  ;
    
class_visual_modifier
  : PUBLIC
  ;
    
class_modifier
  : ABSTRACT | FINAL | INTERFACE | CLASS
  ;

//*******************************/
//          Code body            /
//*******************************/
  
classBody
  :
//  ( 
//    (methodDefinition) => methodDefinition
//  | (ctorDefinition) => ctorDefinition
//  | (fieldDefinition) => fieldDefinition
//  | staticCtorDefinition
//  )+
  ( 
//    fieldDefinition
//    |
    methodDefinition
  | ctorDefinition
  | fieldDefinition
  | staticCtorDefinition
  )+
  ;

//*******************************/
//        Field definition       /
//*******************************/

fieldDefinition
  : field_visual_modifier? field_modifier* aggregatedJavaType identifier (ASSIGN literals)? SEMI 
    fieldInfo
    fieldAdditionalInfo*
  ;

fieldInfo
  : Signature fieldInfoOption1 
    flags 
  ;

fieldAdditionalInfo
  : (Constant fieldInfoOption3
  | Constant fieldInfoOption4
  | Signature fieldInfoOption5
  | Deprecated fieldInfoOption6
  | Synthetic fieldInfoOption6
  | runtimeVisibleAnnotations_info
  | runtimeInvisibleAnnotations) 
  ;

fieldInfoOption1 // Minded signatures
  : bytecodeType
  ;
  
fieldInfoOption2 // Minded Flags
  : IDENTIFIER (COMMA IDENTIFIER)* -> IDENTIFIER+
  ;

fieldInfoOption3 // Minded constant values
  : primitiveType literals
  ;

fieldInfoOption4 // Minded constant values
  : CONSTANT_TYPE_ASSIGNABLE
  ;

fieldInfoOption5 // Minded signatures
  :  CPINDEX
  ;

fieldInfoOption6 // Minded deprecates
  :  BOOLEANLITERAL
  ;

field_visual_modifier
  : PUBLIC  | PRIVATE | PROTECTED
  ;
    
field_modifier
  : FINAL | STATIC  | TRANSIENT | VOLATILE
  ;
  
//*******************************/
//    Static ctor definition     /
//*******************************/

staticCtorDefinition
  : field_visual_modifier? STATIC LBRACE RBRACE SEMI 
    methodInfo
    body
  ;
  
//*******************************/
//        Ctor definition        /
//*******************************/

ctorDefinition
  : field_visual_modifier? javaType arguments throwClause? SEMI 
    methodInfo
    body
    afterMethodInfo
  ;

//*******************************/
//        Method definition      /
//*******************************/

methodDefinition
  : method_modifier* genericReturn? aggregatedJavaType javaTypeIdentifier arguments throwClauseMethod? SEMI 
    methodInfo
    body?
    afterMethodInfo
  ;

methodInfo
  : Signature methodSignatureInfo 
    flags
  ;

afterMethodInfo
  : ((Deprecated  methodDeprecatedInfo
  | Signature CPINDEX
  | runtimeInvisibleParameterAnnotations
  | runtimeVisibleAnnotations_info
  | runtimeInvisibleAnnotations
  | runtimeVisibleParameterAnnotations
  | Exceptions  throwClause
  | Synthetic BOOLEANLITERAL
  | annotationDefault) )*
  ;

annotationDefault
  : AnnotationDefault  DefaultValue (AnnotationAssign | LBRACK AnnotationAssign? RBRACK)
  ;
  
methodSignatureInfo
  : LPAREN bytecodeType* RPAREN returnDescriptor
  ;

returnDescriptor
  : bytecodeType | VoidType
  ;
  
methodDeprecatedInfo
  : BOOLEANLITERAL
  ;
    
method_modifier
  : ABSTRACT | FINAL  | STATIC  | SYNCHRONIZED  | NATIVE | PUBLIC | PRIVATE | PROTECTED
  ;

arguments
  : LPAREN typeList? (DOT DOT DOT)? RPAREN //(DOT DOT DOT)? zero or more of the last object
  ;

//*******************************/
//        Body definition      /
//*******************************/
  
body  
  : 
    (Synthetic BOOLEANLITERAL)?
    Code 
    codeBlock
    (bodyExtension)*
  ;

bodyExtension
  :  
  ( ExceptionTable  exceptionTable
  | LineNumberTable  lineNumberTable
  | LocalVariableTable  localVariableTable 
  | LocalVariableTypeTable  localVariableTable 
  | StackMapTable stackMapTable
  | StackMap stackMapTypeTable)
  ;

codeBlock
  : variables 
    (codeLine | javaSwitch)*
    codeBlockEnd
  ;

codeLine
  : pc IDENTIFIER codeValues?
  ;

codeBlockEnd
  : pc IDENTIFIER logic3? 
  ;
  
codeValues
  : logic 
  | logic2 
  | logic3
  | logic4
  | primitiveType
  ;
  
logic
  : CPINDEX COMMA INTLITERAL
  ;
  
logic2
  : CPINDEX
  ;
  
logic3
  : INTLITERAL
  ;
  
logic4
  : INTLITERAL COMMA INTLITERAL
  ;

variables
  : variable COMMA variable COMMA variable
  ;

variable
  : IDENTIFIER ASSIGN INTLITERAL
  ;

javaSwitch  
  : pc IDENTIFIER
    LBRACE 
    switchLine*
    switchDefaultLine
    RBRACE 
  ;
  
switchLine
  : pc INTLITERAL 
  ;

switchDefaultLine
  : DEFAULT COLON INTLITERAL 
  ;

//*******************************/
//        Exceptions             /
//*******************************/

throwClause
  : THROWS javaTypeList
  ;
  
throwClauseMethod
  : THROWS (INTERNALTYPE  | IDENTIFIER  | NORMALTYPE) (COMMA (INTERNALTYPE  | IDENTIFIER  | NORMALTYPE))*
  ;

exceptionTable
  : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER 
    exceptionTableEntry+
  ;

exceptionTableEntry
  : INTLITERAL INTLITERAL INTLITERAL (primitiveType  | IDENTIFIER   | CONSTANT_TYPE_ASSIGNABLE )
  ;
  
//*******************************/
//        LineNumber             /
//*******************************/

lineNumberTable
  : lineNumberTableLine*
  ;

lineNumberTableLine
  : IDENTIFIER pc INTLITERAL 
  ;
  
//*******************************/
//      localVariableTable       /
//*******************************/
  
localVariableTable
  : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER 
    localVariableTableLine*
  ;
  
localVariableTableLine
  : INTLITERAL INTLITERAL INTLITERAL (identifier | STATIC) bytecodeType ;
  
//*******************************/
//      StackMapTypeTable        /
//*******************************/

stackMapTypeTable
  : IDENTIFIER ASSIGN INTLITERAL 
    stackMapTypeTableEntry+
  ;

stackMapTypeTableEntry
  : IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL 
    IDENTIFIER ASSIGN stackMapTableTypesContainer 
    IDENTIFIER ASSIGN stackMapTableTypesContainer 
  ;

//*******************************/
//        StackMapTable          /
//*******************************/

stackMapTable
  : IDENTIFIER ASSIGN INTLITERAL 
    stackMapTableEntry+
  ;
stackMapTableEntry
  : IDENTIFIER ASSIGN (INTLITERAL | stackMapTableTypesContainer) 
  ;

stackMapTableTypesContainer
  : LBRACK stackMapTableTypes? RBRACK
  ;
  
stackMapTableTypes
  : stackMapTableType (COMMA stackMapTableType)* -> stackMapTableType+
  ;

stackMapTableType
  : (stackMapTableTypeObject|stackMapTableTypePlainObject|primitiveType|IDENTIFIER INTLITERAL?)
  ;
stackMapTableTypePlainObject
  : CLASS (INTERNALTYPE | IDENTIFIER)
  ;
stackMapTableTypeObject
  : CLASS STRINGLITERAL
  ;

//*******************************/
// Types
//*******************************/

//*******************************/
// Normal java types
//*******************************/

genericConstraintType
  : javaType genericConstraintList
  ;
  
genericConstraintList
  : LESST genericConstraints (COMMA genericConstraints)* LARGET -> genericConstraints+
  ;

genericConstraints
  : identifier EXTENDS (genericType | javaType) (AND (genericType | javaType))*
  ;

typeList
  : aggregatedJavaType (COMMA aggregatedJavaType)* -> aggregatedJavaType+
  ;
    
aggregatedJavaType
  : (javaTypeIdentifier (DOT javaTypeIdentifier)*) (LBRACK RBRACK)*
  ;
  
javaTypeIdentifier
  : javaType (genericConstraintList | genericList)?
  ;
  
genericType
  : javaType genericList
  ;
  
genericList
  : LESST (genericConstraint|genericGeneric|javaTypeArray) (COMMA (genericConstraint|genericGeneric|javaTypeArray))* LARGET
  ;
  
genericConstraint
  : QUESTION ((SUPER | EXTENDS ) javaTypeArray)?
  ;

javaTypeArray
  : javaType (LBRACK RBRACK)*
  ;

genericGeneric
  : javaType LESST (javaType) (COMMA (javaType))* LARGET
  ;

javaTypeList
  : javaType (COMMA javaType)* -> javaType+
  ;

javaType
  : identifier | NORMALTYPE
  ;
  
//*******************************/
// Generic return Type description
//*******************************/

genericReturn
  : LESST genericReturnDescriptor (COMMA genericReturnDescriptor)* LARGET -> genericReturnDescriptor+
  ;

genericReturnDescriptor
  : identifier EXTENDS bytecodeObjectTypeList
  ;
 
bytecodeObjectTypeList
  : bytecodeObjectType (AND bytecodeObjectType)* -> bytecodeObjectType+
  ;
 
bytecodeObjectType
  : (INTERNALTYPE
  | identifier
  | genericBydecodeObjectType) (DOT bytecodeObjectType)?
  ;

genericBydecodeObjectType
  : (INTERNALTYPE | IDENTIFIER) LESST (bytecodeObjectType (COMMA bytecodeObjectType)* | genericGenericReturnDescriptor) LARGET
  ;

genericGenericReturnDescriptor
  : QUESTION ((SUPER | EXTENDS ) identifier)?
  ;
  
//*******************************/
// Bytecode Types
//*******************************/

bytecodeType
  : bytecodeArrayType | bytecodeBaseType | simpleBytecodeObjectType SEMI | IDENTIFIER // More than one BaseType will instead be an IDENTIFIER
  ;

bytecodeArrayType
  : LBRACK (bytecodeType)
  ;
 
 bytecodeBaseType
  : BaseType
  ;
 
 simpleBytecodeObjectType
  : (INTERNALTYPE
  | IDENTIFIER
  | genericObjectType) (DOT simpleBytecodeObjectType)?
  ;

genericObjectType:  (INTERNALTYPE | IDENTIFIER) LESST ((MINUS|PLUS)? bytecodeType | STAR)+ LARGET;

//*******************************/
// Simple types
//*******************************/

identifier: IDENTIFIER | keywordAggregate;

keywordAggregate
  : BaseType | VoidType | primitiveType | Constant_type
  | EXTENDS | IMPLEMENTS  | DEFAULT  | CLASS  | THROWS  | SUPER | NATIVE
  ;

primitiveType
  : boolean_type
  | numeric_type
  | VOID
  ;

boolean_type
  : BOOLEAN
  ;

numeric_type
  : floating_point_type
  | integral_type
  ;

integral_type
  : BYTE
  | SHORT
  | INT
  | LONG
  | CHAR
  ;

floating_point_type
  : FLOAT
  | DOUBLE
  ;

literals
  : LONGLITERAL
  | INTLITERAL
  | FLOATLITERAL
  | DOUBLELITERAL
  | CHARLITERAL
  | STRINGLITERAL
  | BOOLEANLITERAL
  | MINUS? IDENTIFIER
  ;

pc
  : INTLITERAL COLON;
//*******************************/
// Lexer
//*******************************/

//*******************************/
// Keywords
//*******************************/

//ABSTRACT  :  'abstract' ;    CONTINUE   :  'continue'   ;    FOR        :  'for'        ;    NEW      :  'new'      ;    SWITCH       :  'switch'       ;
//ASSERT    :  'assert'   ;    GOTO       :  'goto'       ;    PACKAGE  :  'package'  ;    SYNCHRONIZED :  'synchronized' ;
//DO        :  'do'       ;    IF         :  'if'         ;    PRIVATE    :  'private'    ;    THIS     :  'this'     ;
//BREAK     :  'break'    ;    IMPLEMENTS :  'implements' ;    PROTECTED  :  'protected'  ;    THROW    :  'throw'    ;
//ELSE      :  'else'     ;    IMPORT     :  'import'     ;    PUBLIC     :  'public'     ;    THROWS   :  'throws'   ;
//CASE      :  'case'     ;    ENUM       :  'enum'       ;    INSTANCEOF :  'instanceof' ;    RETURN   :  'return'   ;    TRANSIENT    :  'transient'    ;
//CATCH     :  'catch'    ;    TRY        :  'try'        ;
//FINAL     :  'final'    ;    INTERFACE  :  'interface'  ;    STATIC     :  'static'     ;    
//CLASS     :  'class'    ;    FINALLY    :  'finally'    ;    STRICTFP   :  'strictfp'   ;    VOLATILE :  'volatile' ;
//CONST     :  'const*'   ;    NATIVE     :  'native'     ;    SUPER      :  'super'      ;    WHILE    :  'while'    ;

//*******************************/
// Captions
//*******************************/

Flag          : 'flags' COLON         ; RuntimeVisibleAnnotations : 'RuntimeVisibleAnnotations' COLON ;
Code          : 'Code' COLON          ; SourceFile                : 'SourceFile' COLON                ;
Scala         : 'Scala' COLON         ; Deprecated                : 'Deprecated' COLON                ;
Signature     : 'Signature' COLON     ; Exceptions                : 'Exceptions' COLON                ;
Constant      : 'ConstantValue' COLON ; LineNumberTable           : 'LineNumberTable' COLON           ;
StackMapTable : 'StackMapTable' COLON ; LocalVariableTable        : 'LocalVariableTable' COLON        ;
Throws        : 'Throws' COLON        ; InnerClasses              : 'InnerClasses' COLON              ;
//MAJOR_VERSION : 'major version' COLON ; MINOR_VERSION             : 'minor version' COLON             ;
ScalaSig      : 'ScalaSig' COLON      ; EnclosingMethod           : 'EnclosingMethod' COLON           ;
ExceptionTable: 'Exception table'COLON; LocalVariableTypeTable    : 'LocalVariableTypeTable' COLON    ;
Synthetic     : 'Synthetic' COLON     ; StackMap                  : 'StackMap' COLON                  ;
DefaultValue  : 'default_value' COLON ; AnnotationDefault         : 'AnnotationDefault' COLON         ;
RuntimeInvisibleParameterAnnotations  : 'RuntimeInvisibleParameterAnnotations' COLON;
RuntimeVisibleParameterAnnotations    : 'RuntimeVisibleParameterAnnotations' COLON;
RuntimeInvisibleAnnotations           : 'RuntimeInvisibleAnnotations' COLON;

Constant_type
  : 'Class'   | 'Fieldref'  | 'Methodref'
  | 'InterfaceMethodref'    | 'String'
  | 'Integer' | 'Float'     | 'Long'
  | 'Double'  | 'NameAndType'
  | 'Unicode' | 'Utf8'
  ;

EXTENDS   : 'extends'   ;   IMPLEMENTS    : 'implements'  ;   DEFAULT   : 'default'   ; // Default is a keyword though it is seen in AttrDecl.class as identifier
ABSTRACT  : 'abstract'  ;   PUBLIC        : 'public'      ;   FINAL     : 'final'     ;
STATIC    : 'static'    ;   PRIVATE       : 'private'     ;   PROTECTED : 'protected' ;
INTERFACE : 'interface' ;   SYNCHRONIZED  : 'synchronized';   NATIVE    : 'native'    ;
VOLATILE  : 'volatile'  ;   TRANSIENT     : 'transient'   ;   CLASS     : 'class'     ;
THROWS    : 'throws'    ;   SUPER         : 'super'       ;

BOOLEANLITERAL  : TRUE | FALSE;

fragment FALSE    :  'false'    ;
fragment TRUE     :  'true'     ;
  
fragment QUOTE      : '\"';
fragment SLASH      : '/';
fragment UNDERSCORE : '_';
fragment HASH       : '#';

MINUS   : '-'   ; PLUS    : '+'   ; 
COLON   : ':'   ; SEMI    : ';'   ; 
COMMA   : ','   ; DOT     : '.'   ; 
LBRACE  : '{'   ; RBRACE  : '}'   ;
LBRACK  : '['   ; RBRACK  : ']'   ;
LPAREN  : '('   ; RPAREN  : ')'   ;
LESST   : '<'   ; LARGET  : '>'   ;
ASSIGN  : '='   ; AND     : '&'   ;
QUESTION: '?'   ; STAR    : '*'   ;
Marker  : '%'   ;

//*******************************/
// Types
//*******************************/

BOOLEAN   :  'boolean'  ;
CHAR      :  'char'     ;
BYTE      :  'byte'     ;
DOUBLE    :  'double'   ;
FLOAT     :  'float'    ;
LONG      :  'long'     ;
INT       :  'int'      ;
VOID      :  'void'     ;
SHORT     :  'short'    ;


VoidType: 'V';
BaseType: 'B' | 'C' | 'D' | 'F' | 'I' | 'J' | 'S' | 'Z';

//*******************************/
// Others
//*******************************/

CONSTANT_TYPE_ASSIGNABLE
  : Constant_type (' ')+ (~('\n'|'\r'|' ')+ (' ')+)* ~('\n'|'\r'|' ')* '\r'? '\n'
  ;
CPINDEX
  : HASH INTLITERAL;
IDENTIFIER  
  : (Letter|'_'|'$') (Letter|IntDigit|'_'|'$'|'-')*;
NORMALTYPE
  : IDENTIFIER (DOT (IDENTIFIER | DOT DOT))+;
INTERNALTYPE
  : IDENTIFIER (SLASH IDENTIFIER)+ (DOT IntegerNumber)?;

WINDOWSPATH : SLASH Letter COLON (SLASH (IDENTIFIER WS*)+)+ DOT IDENTIFIER;

DATE  : IntDigit IntDigit MINUS IntDigit IntDigit MINUS IntDigit IntDigit IntDigit IntDigit;


COMMENT
    :   '//' ~('\n'|'\r')* ('\r\n'|'\n'|'\r') {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        ) {$channel=HIDDEN;}
    ;
NL
  :     ( '\r'
        | '\n'
        | '\r\n'
        ) {$channel=HIDDEN;}
  ;

AnnotationAssign
  : (BaseType | LBRACK | '@' | 'c' | 'e' | 's') CPINDEX (DOT CPINDEX)?
  ;

//*******************************/
// Literals
//*******************************/

LONGLITERAL   : INTLITERAL LongSuffix     ;
INTLITERAL  : ( PLUS | MINUS )? IntegerNumber   ;
FLOATLITERAL  : ( PLUS | MINUS )? NonIntegerNumber FloatSuffix    ;
DOUBLELITERAL   : ( PLUS | MINUS )? NonIntegerNumber DoubleSuffix?  ;
CHARLITERAL   : '\'' CharEscapeSequence '\''    ;
STRINGLITERAL   : QUOTE EscapeSequence* QUOTE     ;

HexDigits : HexDigit+;

fragment IntegerNumber : '0' | '1'..'9' IntDigit* | '0' Octal+ | HexPrefix HexDigit+ ;
fragment IntDigit : '0'..'9';
fragment HexPrefix : '0x' | '0X' ; 
fragment HexDigit : (IntDigit|('a'..'f')|('A'..'F')) ; 
fragment LongSuffix : 'l' | 'L' ; 
fragment NonIntegerNumber : IntDigit+ DOT IntDigit* Exponent? | '.' IntDigit+ Exponent? | IntDigit+ Exponent | IntDigit+ | HexPrefix HexDigit* ( () | ('.' HexDigit*) ) ( 'p' | 'P' ) ( PLUS | MINUS )? IntDigit+ ; 
fragment Exponent : ( 'e' | 'E' ) ( PLUS | MINUS )? IntDigit+ ; 
fragment FloatSuffix : 'f' | 'F' ; 
fragment DoubleSuffix : 'd' | 'D' ;
fragment Letter : ('a'..'z'|'A'..'Z');
fragment Octal  : '0'..'7';
fragment OctalEscape
    :   '\\' ('0'..'3') Octal Octal
    |   '\\' Octal Octal
    |   '\\' Octal
    ;
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'~')
    |   UnicodeEscapeSequence
    |   OctalEscape
    |   ~( '\u000D' | '\u000A' | '\u2028' | '\u2029' | '\"' )
    ;
fragment
CharEscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\\'|'\'')
    |   CharUnicodeEscapeSequence
    |   OctalEscape
    |   ~( '\u000D' | '\u000A' | '\u2028' | '\u2029' )
    ;
fragment
CharUnicodeEscapeSequence
  : '\\' (('u'   HexDigit   HexDigit   HexDigit  HexDigit)
  | ('U'   HexDigit   HexDigit   HexDigit  HexDigit  
          HexDigit   HexDigit   HexDigit  HexDigit))
  ;
fragment
UnicodeEscapeSequence
  : ('\\' 'u'   HexDigit   HexDigit   HexDigit  HexDigit)
  | ('\\' 'U'   HexDigit   HexDigit   HexDigit  HexDigit  
          HexDigit   HexDigit   HexDigit  HexDigit)
  ;