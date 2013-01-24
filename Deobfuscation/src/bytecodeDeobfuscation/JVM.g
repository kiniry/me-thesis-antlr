grammar JVM;

options {
  language = Java;
  output=AST; 
}

tokens  {
CLASSFILE; CFHEADER; UNITHEADER; CEXTENDS; CIMPLEMENTS;
UNITARGUMENTS; UNITATTR; UNITBODY;
VMODIFIER;  MODIFIER; 
CLASSDECL; FIELDDECL; STATICCTORDECL; CTORDECL; METHODDECL;
CPOOL;
RETVALUE; GENERICDESC; UNITNAME; RETDESC; PARAMDESC; VARINFO; INSTRUCTION;
SWITCH;
FIELDVALUE;
ETHEADER; ETENTRY; LVHEADER; LVENTRY; SMTHEADER; SMTENTRY; SMHEADER; SMENTRY;
THROWCLAUSE;
BANNOTATION;
OPERAND;
TPARAMETERS;
TYPEARGS;
ARRAYBRACKS;
INFODATA1; INFODATA2;
STANDINTOKEN;
SMTTYPES;
ANNOTATIONBRACKETS;
RIAI;
PVI;
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
  : class_file_info
    modified_file_info
    checksum_file_info
    compiled_file_info?
  ;
class_file_info
  : IDENTIFIER WINDOWSPATH -> ^(IDENTIFIER WINDOWSPATH)
  ;
  
modified_file_info
  : i1=IDENTIFIER i2=IDENTIFIER DATE SEMI i3=IDENTIFIER INTLITERAL i4=IDENTIFIER -> ^($i1 $i2 DATE $i3 INTLITERAL $i4)
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
  : class_visual_modifier? class_modifier* typeName typeParameters? (EXTENDS ls1=typeList)? (IMPLEMENTS ls2=typeList)? 
    type_info
    constant_pool
    LBRACE 
    classBody?
    RBRACE ->   ^(CLASSDECL ^(VMODIFIER class_visual_modifier?) ^(MODIFIER class_modifier*) typeName ^(TPARAMETERS typeParameters?) ^(CEXTENDS $ls1?) ^(CIMPLEMENTS $ls2?)
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
      -> ^(VMODIFIER method_visual_modifier?) ^(MODIFIER method_modifier*) innerclass_info_data
  ;

innerclass_info_data
  : CPINDEX (ASSIGN cp1=CPINDEX)? (IDENTIFIER cp2=CPINDEX)?
                                           -> ^(CPINDEX ^(INFODATA1 (ASSIGN $cp1)?) ^(INFODATA2 (IDENTIFIER $cp2)?))
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
  : IDENTIFIER | INTLITERAL // strictfp -> 0x0800 could not be convert by javap
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
  : brackedAnnotationAssign 
  | AnnotationAssign
  ;
brackedAnnotationAssign
  : LBRACK brackedAnnotationAssignList? RBRACK                            -> ^(ANNOTATIONBRACKETS brackedAnnotationAssignList?)
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
    runtimeVisibleAnnotationsItem*          -> ^(PVI pc IDENTIFIER? runtimeVisibleAnnotationsItem*)
  ;
runtimeInvisibleAnnotationsItem
  : p1=pc p2=pc? CPINDEX LPAREN runtimeVisibleAnnotationAssignList? RPAREN -> ^(RIAI $p1 $p2? ^(CPINDEX runtimeVisibleAnnotationAssignList?))
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
  : classBodyEntryDecl+
  ;
  
classBodyEntryDecl
  : (methodDefinition) => methodDefinition
  | (ctorDefinition) => ctorDefinition
  | (fieldDefinition) => fieldDefinition
  | staticCtorDefinition
  ;

//*******************************/
//        Field definition       /
//*******************************/

fieldDefinition
  : field_visual_modifier? field_modifier* type keywordAggregate (ASSIGN literals)? SEMI 
    fieldInfo
    fieldAdditionalInfo*
            -> ^(FIELDDECL ^(VMODIFIER field_visual_modifier?) ^(MODIFIER field_modifier*) ^(RETVALUE type) ^(UNITNAME keywordAggregate) ^(FIELDVALUE literals?)
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
  | Constant CONSTANT_TYPE_ASSIGNABLE -> ^(Constant CONSTANT_TYPE_ASSIGNABLE)
  | Signature CPINDEX -> ^(Signature CPINDEX)
  | Deprecated BOOLEANLITERAL -> ^(Deprecated BOOLEANLITERAL)
  | Synthetic BOOLEANLITERAL -> ^(Synthetic BOOLEANLITERAL)
  | runtimeVisibleAnnotations_info -> runtimeVisibleAnnotations_info
  | runtimeInvisibleAnnotations -> runtimeInvisibleAnnotations
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
  : field_visual_modifier? genericDescriptor? typeName arguments throwClause? SEMI 
    methodInfo
    body
    afterMethodInfo? -> ^(CTORDECL ^(VMODIFIER field_visual_modifier?) ^(GENERICDESC genericDescriptor?) ^(UNITNAME typeName) arguments ^(THROWCLAUSE throwClause?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body)
                        ^(UNITATTR afterMethodInfo?)
                        )
  ;

//*******************************/
//        Method definition      /
//*******************************/

methodDefinition
  : method_visual_modifier? method_modifier* genericDescriptor? type keywordAggregate arguments throwClauseMethod? SEMI 
    methodInfo
    body?
    afterMethodInfo? -> ^(METHODDECL ^(VMODIFIER method_visual_modifier?) ^(MODIFIER method_modifier*) ^(GENERICDESC genericDescriptor?) ^(RETVALUE type) ^(UNITNAME keywordAggregate) arguments ^(THROWCLAUSE throwClauseMethod?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body?)
                        ^(UNITATTR afterMethodInfo?)
                        )
  ;

methodInfo
  : methodSignatureInfo flags -> ^(STANDINTOKEN methodSignatureInfo flags)
  ;
  
afterMethodInfo
  : afterMethodInfoEntry+		-> afterMethodInfoEntry+
  ;

afterMethodInfoEntry
  : Deprecated  BOOLEANLITERAL   	-> ^(Deprecated  BOOLEANLITERAL)
  | Signature CPINDEX                   -> ^(Signature CPINDEX)
  | runtimeInvisibleParameterAnnotations-> runtimeInvisibleParameterAnnotations
  | runtimeVisibleAnnotations_info	-> runtimeVisibleAnnotations_info
  | runtimeInvisibleAnnotations		-> runtimeInvisibleAnnotations
  | runtimeVisibleParameterAnnotations	-> runtimeVisibleParameterAnnotations
  | Exceptions  throwClause             -> ^(Exceptions  throwClause)
  | Synthetic BOOLEANLITERAL            -> ^(Synthetic BOOLEANLITERAL)
  | annotationDefault
  ;

annotationDefault
  : AnnotationDefault  DefaultValue annotationValue -> ^(AnnotationDefault  DefaultValue annotationValue)
  ;
  
methodSignatureInfo
  : Signature LPAREN bytecodeType* RPAREN returnDescriptor  -> ^(Signature ^(PARAMDESC bytecodeType*) ^(RETDESC returnDescriptor))
  ;

returnDescriptor
  : bytecodeType | VoidType
  ;
    
method_modifier
  : ABSTRACT | FINAL  | STATIC  | SYNCHRONIZED  | NATIVE | STRICTFP
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
    bodyExtension* -> (Synthetic BOOLEANLITERAL)? ^(Code codeBlock) bodyExtension*
  ;

bodyExtension
  :  
  ( ExceptionTable  exceptionTable              -> ^(ExceptionTable  exceptionTable)
  | LineNumberTable  lineNumberTable?            -> ^(LineNumberTable  lineNumberTable?)
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
  : pc IDENTIFIER operand1? (COMMA INTLITERAL)? -> ^(IDENTIFIER pc ^(OPERAND operand1?) ^(OPERAND INTLITERAL?))
  ;

codeBlockEnd
  : pc IDENTIFIER INTLITERAL?               -> ^(IDENTIFIER pc INTLITERAL?)
  ;
  
operand1
  : CPINDEX 
  | INTLITERAL
  | primitiveType
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
  : THROWS typeList                     -> ^(THROWS typeList)
  ;
  
throwClauseMethod
  : THROWS throwType (COMMA throwType)*
                                            -> ^(THROWS throwType+)
  ;

throwType
  : INTERNALTYPE  | IDENTIFIER  | QualifiedType
  ;

exceptionTable
  : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER 
    exceptionTableEntry+    -> ^(ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER) ^(ETENTRY exceptionTableEntry+)
  ;

exceptionTableEntry
  : INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
                            -> INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
  ;
exceptionTableEntryValue
  : primitiveType
  | IDENTIFIER
  | CONSTANT_TYPE_ASSIGNABLE
  ;
  
//*******************************/
//        LineNumber             /
//*******************************/

lineNumberTable
  : lineNumberTableLine+
  ;

lineNumberTableLine
  : IDENTIFIER pc INTLITERAL -> ^(IDENTIFIER pc INTLITERAL)
  ;
  
//*******************************/
//      localVariableTable       /
//*******************************/
  
localVariableTable
  : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER 
    localVariableTableLine*           -> ^(LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER) ^(LVENTRY localVariableTableLine*)
  ;
  
localVariableTableLine
  : INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType 
  ;

localVariableTableLineIdentifier
  :
  ( id1=keywordAggregate  -> IDENTIFIER[$id1.text]//-> IDENTIFIER what would this do??
  | id2=STATIC            -> IDENTIFIER[$id2]
  )
  ;
  
//*******************************/
//      StackMapTypeTable        /
//*******************************/

stackMapTypeTable
  : IDENTIFIER ASSIGN INTLITERAL 
    stackMapTypeTableEntry+             ->  ^(SMTHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMTENTRY stackMapTypeTableEntry+)
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
    stackMapTableEntry+                         -> ^(SMHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMENTRY stackMapTableEntry+)
  ;
stackMapTableEntry
  : IDENTIFIER ASSIGN stackMapTableEntryValue   -> ^(ASSIGN IDENTIFIER stackMapTableEntryValue)
  ;
stackMapTableEntryValue
  : INTLITERAL | stackMapTableTypesContainer
  ;

stackMapTableTypesContainer
  : LBRACK stackMapTableTypes RBRACK              -> stackMapTableTypes
  ;
  
stackMapTableTypes
  : stackMapTableType? (COMMA stackMapTableType)* -> ^(SMTTYPES stackMapTableType*)
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
  : type (COMMA type)*                          -> type+
  ;
type
  : combinedJavaType (LBRACK RBRACK)*           -> combinedJavaType ^(ARRAYBRACKS (LBRACK RBRACK)*)
  ;
combinedJavaType
  : (primitiveType
  | referenceType)
  ;
referenceType
  : typeDeclSpecifier (DOT typeDeclSpecifier)*  -> ^(UNITNAME typeDeclSpecifier+)
  ;
typeDeclSpecifier
  : typeName typeArguments?                     -> ^(typeName ^(TYPEARGS typeArguments?))
  ;
typeName
  : id=identifier                               -> QualifiedType[$id.text] 
  | QualifiedType
  ;
typeArguments
  : LESST typeArgumentList LARGET               -> typeArgumentList
  ;
typeArgumentList 
  : typeArgument (COMMA typeArgument)*          -> typeArgument+
  ;
typeArgument
  : type
  | wildcard
  ;
wildcard
  : QUESTION wildcardBounds?                    -> ^(QUESTION wildcardBounds?)
  ;
wildcardBounds
  : EXTENDS type                                -> ^(EXTENDS type)
  | SUPER type                                  -> ^(SUPER type)
  ;
typeParameters
  : LESST typeParameter (COMMA typeParameter)* LARGET -> typeParameter+
  ;
typeParameter
  : identifier typeBound?                       -> ^(identifier typeBound?)
  ;
typeBound
  : EXTENDS referenceType (AND referenceType)*  -> ^(EXTENDS referenceType+)
  ;

//*******************************/
// Generic return Type description
//*******************************/
genericDescriptor
  : LESST genericReturnDescriptor (COMMA genericReturnDescriptor)* LARGET -> genericReturnDescriptor+
  ;
genericReturnDescriptor
  : identifier EXTENDS bytecodeReferenceTypeList                ->  ^(EXTENDS identifier bytecodeReferenceTypeList)
  ; 
bytecodeReferenceTypeList
  : bytecodeReferenceType (AND bytecodeReferenceType)*          -> bytecodeReferenceType+
  ;
bytecodeReferenceType
  : bytecodeTypeDeclSpecifier (DOT bytecodeTypeDeclSpecifier)*  -> ^(UNITNAME bytecodeTypeDeclSpecifier+)
  ;
bytecodeTypeDeclSpecifier
  : bytecodeTypeName bytecodeTypeArguments?                     -> bytecodeTypeName ^(TYPEARGS bytecodeTypeArguments?)
  ;
bytecodeTypeName
  : id=identifier                                               -> INTERNALTYPE[$id.text]
  | INTERNALTYPE
  ;
bytecodeTypeArguments
  : LESST bytecodeTypeArgumentList LARGET               -> bytecodeTypeArgumentList
  ;
bytecodeTypeArgumentList 
  : bytecodeTypeArgument (COMMA bytecodeTypeArgument)*  -> bytecodeTypeArgument+
  ;
bytecodeTypeArgument
  : bytecodeReferenceType
  | bytecodeWildcard
  ;
bytecodeWildcard
  : QUESTION bytecodeWildcardBounds?                    -> ^(QUESTION bytecodeWildcardBounds?)
  ;
bytecodeWildcardBounds
  : EXTENDS bytecodeReferenceType                       -> ^(EXTENDS bytecodeReferenceType)
  | SUPER bytecodeReferenceType                         -> ^(SUPER bytecodeReferenceType)
  ;
  
//*******************************/
// Bytecode Types
//*******************************/

bytecodeType
  : bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER // More than one BaseType will instead be an IDENTIFIER
  ;
bytecodeArrayType
  : LBRACK bytecodeType
  ; 
simpleBytecodeObjectType
  : simpleBytecodeReferenceType (DOT simpleBytecodeReferenceType)* -> simpleBytecodeReferenceType+
  ;
simpleBytecodeReferenceType
  : simpleBytecodeReferenceTypeName simpleBytecodeTypeArguments?  -> simpleBytecodeReferenceTypeName ^(TYPEARGS simpleBytecodeTypeArguments?)
  ;
simpleBytecodeReferenceTypeName
  : INTERNALTYPE
  | id=IDENTIFIER                                                -> INTERNALTYPE[$id]
  ;
simpleBytecodeTypeArguments
  : LESST simpleBytecodeTypeArgumentList LARGET               -> simpleBytecodeTypeArgumentList
  ;
simpleBytecodeTypeArgumentList
  : simpleBytecodeTypeArgument (simpleBytecodeTypeArgument)*  -> simpleBytecodeTypeArgument+
  ;
simpleBytecodeTypeArgument
  : bytecodeType
  | MINUS bytecodeType
  | PLUS bytecodeType
  | STAR
  ;
  
//*******************************/
// Simple types
//*******************************/

identifier
  : IDENTIFIER 
  | v1=BaseType     -> IDENTIFIER[$v1]
  | v2=VoidType     -> IDENTIFIER[$v2]
  | v3=Constant_type  -> IDENTIFIER[$v3]
  ;

keywordAggregate
  : identifier 
  | v1=primitiveType  -> IDENTIFIER[$v1.text]
  | v2=EXTENDS    -> IDENTIFIER[$v2]
  | v3=IMPLEMENTS   -> IDENTIFIER[$v3]
  | v4=DEFAULT    -> IDENTIFIER[$v4]
  | v5=CLASS      -> IDENTIFIER[$v5]
  | v6=THROWS     -> IDENTIFIER[$v6]
  | v7=SUPER    -> IDENTIFIER[$v7]
  | v8=NATIVE   -> IDENTIFIER[$v8]
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
  : INTLITERAL COLON	-> INTLITERAL COLON
  ;
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
THROWS    : 'throws'    ;   SUPER         : 'super'       ;   STRICTFP  : 'strictfp'  ;

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
QualifiedType
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
    :   
        '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\\'|'\'')
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