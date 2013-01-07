grammar InterpreterHelper;

options {
  language = Java;
  output=AST; 
}

tokens  {
CLASSFILE; CFHEADER; UNITHEADER;
UNITBODY; UNITARGUMENTS; UNITATTR; UNITBODY;
VMODIFIER;  MODIFIER; 
CLASSDECL; FIELDDECL; STATICCTORDECL; CTORDECL;
CPOOL; ICDATA;
ANNOTATIONVALUE;
RETVALUE; GENERICDESC; UNITNAME; ARGNAME; VARINFO; INSTRUCTION;
SWITCH;

ETHEADER; ETENTRY; LVHEADER; LVENTRY; SMTHEADER; SMTENTRY; SMHEADER; SMENTRY;
THROWCLAUSE;
BANNOTATION;
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
  : class_file_header classDefinition -> ^(CLASSFILE ^(CFHEADER class_file_header) classDefinition);
  
class_file_header
  : (class_file_info
  | modified_file_info
  | checksum_file_info
  | compiled_file_info
  )*
  ;
class_file_info
  : IDENTIFIER WINDOWSPATH -> ^(IDENTIFIER WINDOWSPATH)
  ;
  
modified_file_info
  : i1=IDENTIFIER i2=IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER -> ^($i1 $i2 DATE IDENTIFIER INTLITERAL IDENTIFIER)
  ;
  
checksum_file_info
  : IDENTIFIER IDENTIFIER 
  (id=IDENTIFIER  -> ^(IDENTIFIER IDENTIFIER HexDigits[$id]) 
  | HexDigits     -> ^(IDENTIFIER IDENTIFIER HexDigits)
  )
  ;
    
compiled_file_info
  : IDENTIFIER IDENTIFIER STRINGLITERAL -> ^(IDENTIFIER IDENTIFIER STRINGLITERAL)
  ;

//*******************************/
//        Class definition       /
//*******************************/

classDefinition
  : class_visual_modifier? class_modifier* javaTypeIdentifier (EXTENDS typeList)? (IMPLEMENTS typeList)? 
    type_info
    constant_pool
    LBRACE 
    classBody?
    RBRACE ->   ^(CLASSDECL ^(VMODIFIER class_visual_modifier?) ^(MODIFIER class_modifier*) javaTypeIdentifier ^(EXTENDS typeList?) ^(IMPLEMENTS typeList?)
                ^(UNITHEADER type_info)
                ^(CPOOL constant_pool)
                ^(UNITBODY classBody?)
                )
  ;
    
class_visual_modifier
  : PUBLIC
  ;
    
class_modifier
  : ABSTRACT | FINAL | INTERFACE | CLASS
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
  | synthetic
  | scala_info)+
  ;

synthetic
  : Synthetic BOOLEANLITERAL -> ^(Synthetic BOOLEANLITERAL)
  ;

deprecated
  : Deprecated BOOLEANLITERAL -> ^(Deprecated BOOLEANLITERAL)
  ;

enclosingMethod
  : EnclosingMethod CPINDEX DOT CPINDEX ? -> ^(EnclosingMethod CPINDEX DOT CPINDEX ?)
  ;

sourcefile_info
  : SourceFile STRINGLITERAL  -> ^(SourceFile STRINGLITERAL)
  ;

scalaSig_info
  : ScalaSig
    IDENTIFIER ASSIGN INTLITERAL  
    INTLITERAL INTLITERAL INTLITERAL 
        ->  ^(ScalaSig
            IDENTIFIER ASSIGN INTLITERAL  
            INTLITERAL INTLITERAL INTLITERAL)
  ;

scala_info
  : Scala
    IDENTIFIER ASSIGN INTLITERAL
        ->  ^(Scala IDENTIFIER ASSIGN INTLITERAL)
  ;
   
signature_info_addition
  : Signature CPINDEX? -> ^(Signature CPINDEX?)
  ;

innerclass_info
  : InnerClasses innerclass_info_line+ -> ^(InnerClasses innerclass_info_line+)
  ;
  
innerclass_info_line
  :  method_visual_modifier? method_modifier* innerclass_info_data SEMI?
      -> ^(VMODIFIER method_visual_modifier)? ^(MODIFIER method_modifier*) ^(ICDATA innerclass_info_data)
  ;

innerclass_info_data
  : CPINDEX (
    ( ASSIGN CPINDEX (IDENTIFIER CPINDEX)?) //-> ^(CPINDEX ^(ASSIGN CPINDEX (IDENTIFIER CPINDEX)?))
    | IDENTIFIER CPINDEX                    //-> ^(CPINDEX IDENTIFIER CPINDEX)
    |                                       //-> ^(CPINDEX)
    )                                       -> ^(CPINDEX ^(ASSIGN CPINDEX)? ^(IDENTIFIER CPINDEX)?)
  ;
    
minor_major_version_info
  : IDENTIFIER IDENTIFIER COLON INTLITERAL  -> ^(IDENTIFIER IDENTIFIER COLON INTLITERAL)
  ;
      
flags
  : Flag accessFlagList? Marker -> ^(Flag accessFlagList?)
  ;
  
accessFlagList
  : flagType (COMMA flagType)* -> flagType+
  ;

flagType
  : IDENTIFIER | INTLITERAL
  ;
  
//*******************************/
//  Runetime visibility
//*******************************/

runtimeVisibleAnnotations_info
  : RuntimeVisibleAnnotations 
    runtimeVisibleAnnotationsItem+ -> ^(RuntimeVisibleAnnotations runtimeVisibleAnnotationsItem+)
  ;
runtimeVisibleAnnotationsItem
  : pc CPINDEX LPAREN runtimeVisibleAnnotationAssignList? RPAREN -> ^(CPINDEX pc runtimeVisibleAnnotationAssignList?)
  ;
runtimeVisibleAnnotationAssignList
  : annotationAssign (COMMA annotationAssign)* -> annotationAssign+
  ;
annotationAssign
  : CPINDEX ASSIGN annotationValue -> ^(ASSIGN CPINDEX annotationValue)
  ;
annotationValue
  : ( brackedAnnotationAssign 
  | AnnotationAssign
  ) -> ^(BANNOTATION brackedAnnotationAssign? AnnotationAssign?)
  ;
brackedAnnotationAssign
  : LBRACK brackedAnnotationAssignList? RBRACK                            -> brackedAnnotationAssignList?
  ;
brackedAnnotationAssignList
  : brackedAnnotationAssignValue (COMMA brackedAnnotationAssignValue)*    -> brackedAnnotationAssignValue+
  ;
brackedAnnotationAssignValue
  : AnnotationAssign (LPAREN runtimeVisibleAnnotationAssignList RPAREN)?  -> ^(AnnotationAssign runtimeVisibleAnnotationAssignList?)
  ;
runtimeVisibleParameterAnnotations
  : RuntimeVisibleParameterAnnotations 
    parameterVisibilityInfo+                -> ^(RuntimeVisibleParameterAnnotations parameterVisibilityInfo+)
  ;
runtimeInvisibleParameterAnnotations
  : RuntimeInvisibleParameterAnnotations 
    parameterVisibilityInfo+                -> ^(RuntimeInvisibleParameterAnnotations parameterVisibilityInfo+)
  ;
runtimeInvisibleAnnotations
  : RuntimeInvisibleAnnotations 
    runtimeInvisibleAnnotationsItem+        -> ^(RuntimeInvisibleAnnotations runtimeInvisibleAnnotationsItem+)
  ;
parameterVisibilityInfo
  : IDENTIFIER? pc
    runtimeVisibleAnnotationsItem*          -> ^(pc IDENTIFIER? runtimeVisibleAnnotationsItem*)
  ;
runtimeInvisibleAnnotationsItem
  : pc pc? CPINDEX LPAREN runtimeVisibleAnnotationAssignList? RPAREN -> ^(pc pc? ^(CPINDEX runtimeVisibleAnnotationAssignList?))
  ;

//*******************************/
//  Constant pool
//*******************************/

constant_pool
  : IDENTIFIER IDENTIFIER COLON 
    contant_pool_line* -> ^(IDENTIFIER IDENTIFIER contant_pool_line*)
  ;
  
contant_pool_line
  : CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE -> ^(ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE)
  ;

//*******************************/
//          Code body            /
//*******************************/
  
classBody
  :
  ( 
    (methodDefinition) => methodDefinition
  | (ctorDefinition) => ctorDefinition
  | (fieldDefinition) => fieldDefinition
  | staticCtorDefinition
  )+
//  ( 
////    fieldDefinition
////    |
//    methodDefinition
//  | ctorDefinition
//  | fieldDefinition
//  | staticCtorDefinition
//  )+
  ;

//*******************************/
//        Field definition       /
//*******************************/

fieldDefinition
  : field_visual_modifier? field_modifier* aggregatedJavaType identifier (ASSIGN literals)? SEMI 
    fieldInfo
    fieldAdditionalInfo*
            -> ^(FIELDDECL ^(VMODIFIER field_visual_modifier?) ^(MODIFIER field_modifier*) ^(RETVALUE aggregatedJavaType) ^(UNITNAME identifier) ^(ASSIGN literals?)
            ^(UNITHEADER fieldInfo)
            ^(UNITATTR fieldAdditionalInfo*)
            )
  ;

fieldInfo
  : Signature bytecodeType
    flags -> ^(Signature bytecodeType) flags
  ;

fieldAdditionalInfo
  : (Constant primitiveType literals -> ^(Constant primitiveType literals)
//  | Constant CONSTANT_TYPE_ASSIGNABLE -> ^(Constant CONSTANT_TYPE_ASSIGNABLE) TEST - commented out.
  | Signature CPINDEX -> ^(Signature CPINDEX)
  | Deprecated BOOLEANLITERAL -> ^(Deprecated BOOLEANLITERAL)
  | Synthetic BOOLEANLITERAL -> ^(Synthetic BOOLEANLITERAL)
  | runtimeVisibleAnnotations_info
  | runtimeInvisibleAnnotations
  ) 
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
    body -> ^(STATICCTORDECL ^(VMODIFIER field_visual_modifier?) ^(UNITHEADER methodInfo) ^(UNITBODY body))
  ;
  
//*******************************/
//        Ctor definition        /
//*******************************/

ctorDefinition
  : field_visual_modifier? genericDescriptor? javaType arguments throwClause? SEMI 
    methodInfo
    body
    afterMethodInfo? -> ^(CTORDECL ^(VMODIFIER field_visual_modifier)? ^(GENERICDESC genericDescriptor)? ^(UNITNAME javaType) arguments ^(THROWCLAUSE throwClause?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body)
                        ^(UNITATTR afterMethodInfo?)
                        )
  ;

//*******************************/
//        Method definition      /
//*******************************/

methodDefinition
  : method_visual_modifier? method_modifier* genericDescriptor? aggregatedJavaType javaTypeIdentifier arguments throwClauseMethod? SEMI 
    methodInfo
    body?
    afterMethodInfo? -> ^(CTORDECL ^(VMODIFIER method_visual_modifier)? ^(MODIFIER method_modifier*) ^(GENERICDESC genericDescriptor)? ^(RETVALUE aggregatedJavaType) ^(UNITNAME javaTypeIdentifier) arguments ^(THROWCLAUSE throwClauseMethod?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body?)
                        ^(UNITATTR afterMethodInfo?)
                        )
  ;

methodInfo
  : methodSignatureInfo flags
  ;

afterMethodInfo
  : (Deprecated  methodDeprecatedInfo   -> ^(Deprecated  methodDeprecatedInfo)
  | Signature CPINDEX                   -> ^(Signature CPINDEX)
  | runtimeInvisibleParameterAnnotations
  | runtimeVisibleAnnotations_info
  | runtimeInvisibleAnnotations
  | runtimeVisibleParameterAnnotations
  | Exceptions  throwClause             -> ^(Exceptions  throwClause)
  | Synthetic BOOLEANLITERAL            -> ^(Synthetic BOOLEANLITERAL)
  | annotationDefault)+
  ;

annotationDefault
  : AnnotationDefault  DefaultValue annotationValue -> ^(AnnotationDefault  DefaultValue annotationValue)
  ;
  
methodSignatureInfo
  : Signature LPAREN bytecodeType* RPAREN returnDescriptor  -> ^(Signature ^(ARGNAME bytecodeType)* ^(RETVALUE returnDescriptor))
  ;

returnDescriptor
  : bytecodeType | VoidType
  ;
  
methodDeprecatedInfo
  : BOOLEANLITERAL
  ;
    
method_modifier
  : ABSTRACT | FINAL  | STATIC  | SYNCHRONIZED  | NATIVE
  ;
 
method_visual_modifier
  : PUBLIC | PRIVATE | PROTECTED
  ;

arguments//(DOT DOT DOT)? zero or more of the last object
  : LPAREN typeList? (DOT DOT DOT)? RPAREN -> ^(UNITARGUMENTS typeList? (DOT DOT DOT)?)
  ;

//*******************************/
//        Body definition      /
//*******************************/
  
body  
  : 
    (Synthetic BOOLEANLITERAL)?
    Code 
    codeBlock
    bodyExtension* -> ^(Synthetic BOOLEANLITERAL)? ^(Code codeBlock) bodyExtension*
  ;

bodyExtension
  :  
  ( ExceptionTable  exceptionTable              -> ^(ExceptionTable  exceptionTable)
  | LineNumberTable  lineNumberTable            -> ^(LineNumberTable  lineNumberTable)
  | LocalVariableTable  localVariableTable      -> ^(LocalVariableTable  localVariableTable)
  | LocalVariableTypeTable  localVariableTable  -> ^(LocalVariableTypeTable  localVariableTable)
  | StackMapTable stackMapTable                 -> ^(StackMapTable stackMapTable)
  | StackMap stackMapTypeTable                  -> ^(StackMap stackMapTypeTable)
  )
  ;

codeBlock
  : variables 
    instructionSet*
    codeBlockEnd                                -> ^(VARINFO variables) ^(INSTRUCTION instructionSet* codeBlockEnd)
  ;

instructionSet
  : codeLine | javaSwitch
  ;

codeLine
  : pc IDENTIFIER codeValue? -> ^(IDENTIFIER pc codeValue?)
  ;

codeBlockEnd
  : pc IDENTIFIER logic3?     -> ^(IDENTIFIER pc logic3?)
  ;
  
codeValue
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
  : variable COMMA variable COMMA variable -> variable variable variable
  ;

variable
  : IDENTIFIER ASSIGN INTLITERAL           -> ^(ASSIGN IDENTIFIER INTLITERAL)
  ;

javaSwitch  
  : pc IDENTIFIER
    LBRACE 
    switchLine*
    switchDefaultLine
    RBRACE                                  -> ^(SWITCH ^(IDENTIFIER pc switchLine* switchDefaultLine))
  ;
  
switchLine
  : pc INTLITERAL 
  ;

switchDefaultLine
  : DEFAULT COLON INTLITERAL                -> ^(DEFAULT INTLITERAL) 
  ;

//*******************************/
//        Exceptions             /
//*******************************/

throwClause
  : THROWS javaTypeList                     -> ^(THROWS javaTypeList)
  ;
  
throwClauseMethod
  : THROWS throwType (COMMA throwType)*
                                            -> ^(THROWS throwType+)
  ;

throwType
  : INTERNALTYPE  | IDENTIFIER  | NORMALTYPE
  ;

exceptionTable
  : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER 
    exceptionTableEntry+ -> ^(ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER) ^(ETENTRY exceptionTableEntry)+
  ;

exceptionTableEntry
  : INTLITERAL INTLITERAL INTLITERAL 
  ( primitiveType              -> INTLITERAL INTLITERAL INTLITERAL IDENTIFIER
  | IDENTIFIER                    -> INTLITERAL INTLITERAL INTLITERAL IDENTIFIER
  | cta=CONSTANT_TYPE_ASSIGNABLE  -> INTLITERAL INTLITERAL INTLITERAL IDENTIFIER[$cta]
  )
  ;
  
//*******************************/
//        LineNumber             /
//*******************************/

lineNumberTable
  : lineNumberTableLine*
  ;

lineNumberTableLine
  : IDENTIFIER pc INTLITERAL -> ^(IDENTIFIER pc INTLITERAL)
  ;
  
//*******************************/
//      localVariableTable       /
//*******************************/
  
localVariableTable
  : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER 
    localVariableTableLine*           -> ^(LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER) ^(LVENTRY localVariableTableLine)*
  ;
  
localVariableTableLine
  : INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType 
  ;

localVariableTableLineIdentifier
  :
  ( identifier
  | id2=STATIC      -> IDENTIFIER[$id2]
  )
  ;
  
//*******************************/
//      StackMapTypeTable        /
//*******************************/

stackMapTypeTable
  : IDENTIFIER ASSIGN INTLITERAL 
    stackMapTypeTableEntry+             ->  ^(SMTHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMTENTRY stackMapTypeTableEntry)+
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
    stackMapTableEntry+                         -> ^(SMHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMENTRY stackMapTableEntry)+
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
  : CLASS 
  (INTERNALTYPE     -> CLASS INTERNALTYPE
  | id=IDENTIFIER   -> CLASS INTERNALTYPE[$id]
  )
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

typeList
  : aggregatedJavaType (COMMA aggregatedJavaType)* -> aggregatedJavaType+
  ;
    
aggregatedJavaType
  : (javaTypeIdentifier (DOT javaTypeIdentifier)*) (LBRACK RBRACK)*
  ;
  
javaTypeIdentifier
  : javaType genericList?
  ;

//genericConstraintList
//  : LESST genericConstraints (COMMA genericConstraints)* LARGET -> genericConstraints+
//  ;

genericConstraints
  : identifier EXTENDS javaTypeIdentifier (AND javaTypeIdentifier)* -> ^(EXTENDS identifier javaTypeIdentifier+)
  ;
  
genericList
  : LESST (genericConstraint|aggregatedJavaType|genericConstraints) (COMMA (genericConstraint|aggregatedJavaType|genericConstraints))* LARGET
  ;
  
genericConstraint
  : QUESTION ((SUPER | EXTENDS ) aggregatedJavaType)? //XX -> two rules
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

genericDescriptor
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
  | EXTENDS | IMPLEMENTS  | DEFAULT  | CLASS  | THROWS  | SUPER
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