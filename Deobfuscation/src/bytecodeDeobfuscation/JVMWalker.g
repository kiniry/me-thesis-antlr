tree grammar JVMWalker;

options {
  language = Java;
  output = AST;
  tokenVocab = JVM;
  ASTLabelType = CommonTree;
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
  : ^(CLASSFILE ^(CFHEADER class_file_header) classDefinition);
  
class_file_header
  : (class_file_info
  | modified_file_info
  | checksum_file_info
  | compiled_file_info
  )*
  ;
class_file_info
  : ^(IDENTIFIER WINDOWSPATH)
  ;
  
modified_file_info
  : ^(IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER)
  ;
  
checksum_file_info
  : ^(IDENTIFIER IDENTIFIER HexDigits)
  ;
    
compiled_file_info
  : ^(IDENTIFIER IDENTIFIER STRINGLITERAL)
  ;

//*******************************/
//        Class definition       /
//*******************************/

classDefinition
  : ^(CLASSDECL ^(VMODIFIER class_visual_modifier?) ^(MODIFIER class_modifier*) typeName ^(TPARAMETERS typeParameters?) ^(CEXTENDS typeList?) ^(CIMPLEMENTS typeList?)
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
  ;//??

synthetic
  : ^(Synthetic BOOLEANLITERAL)
  ;

deprecated
  : ^(Deprecated BOOLEANLITERAL)
  ;

enclosingMethod
  : ^(EnclosingMethod CPINDEX DOT CPINDEX ?)
  ;

sourcefile_info
  : ^(SourceFile STRINGLITERAL)
  ;

scalaSig_info
  : ^(ScalaSig
            IDENTIFIER ASSIGN INTLITERAL  
            INTLITERAL INTLITERAL INTLITERAL)
  ;

scala_info
  : ^(Scala IDENTIFIER ASSIGN INTLITERAL)
  ;
   
signature_info_addition
  : ^(Signature CPINDEX?)
  ;

innerclass_info
  : ^(InnerClasses innerclass_info_line+)
  ;
  
innerclass_info_line
  :  ^(VMODIFIER method_visual_modifier)? ^(MODIFIER method_modifier*) innerclass_info_data
  ;

innerclass_info_data
  : ( ^(CPINDEX ^(ASSIGN CPINDEX (IDENTIFIER CPINDEX)?))
    | ^(CPINDEX IDENTIFIER CPINDEX)
    | ^(CPINDEX)
    )                                       //-> ^(CPINDEX ^(INFODATA1 (ASSIGN CPINDEX)?) ^(INFODATA2 (IDENTIFIER CPINDEX)?))
  ;//??
    
minor_major_version_info
  : ^(IDENTIFIER IDENTIFIER COLON INTLITERAL)
  ;
      
flags
  : ^(Flag accessFlagList?)
  ;
  
accessFlagList
  : flagType+
  ;

flagType
  : id=IDENTIFIER {System.out.println("Id: '"+$id.text+"'");}
  | INTLITERAL // strictfp -> 0x0800 could not be convert by javap
  ;
  
//*******************************/
//  Runetime visibility
//*******************************/

runtimeVisibleAnnotations_info
  : ^(RuntimeVisibleAnnotations runtimeVisibleAnnotationsItem+)
  ;
runtimeVisibleAnnotationsItem
  : ^(CPINDEX pc runtimeVisibleAnnotationAssignList?)
  ;
runtimeVisibleAnnotationAssignList
  : annotationAssign+
  ;
annotationAssign
  : ^(ASSIGN CPINDEX annotationValue)
  ;
annotationValue
  : ^(BANNOTATION brackedAnnotationAssign? AnnotationAssign?)
  ;
brackedAnnotationAssign
  : brackedAnnotationAssignList?
  ;
brackedAnnotationAssignList
  : brackedAnnotationAssignValue+
  ;
brackedAnnotationAssignValue
  : ^(AnnotationAssign runtimeVisibleAnnotationAssignList?)
  ;
runtimeVisibleParameterAnnotations
  : ^(RuntimeVisibleParameterAnnotations parameterVisibilityInfo+)
  ;
runtimeInvisibleParameterAnnotations
  : ^(RuntimeInvisibleParameterAnnotations parameterVisibilityInfo+)
  ;
runtimeInvisibleAnnotations
  : ^(RuntimeInvisibleAnnotations runtimeInvisibleAnnotationsItem+)
  ;
parameterVisibilityInfo
  : ^(pc IDENTIFIER? runtimeVisibleAnnotationsItem*)
  ;
runtimeInvisibleAnnotationsItem
  : ^(pc pc? ^(CPINDEX runtimeVisibleAnnotationAssignList?))
  ;

//*******************************/
//  Constant pool
//*******************************/

constant_pool
  : ^(IDENTIFIER IDENTIFIER contant_pool_line*)
  ;
  
contant_pool_line
  : ^(ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE)
  ;

//*******************************/
//          Code body            /
//*******************************/
  
classBody
  : classBodyEntryDecl+
  ;
  
classBodyEntryDecl
  : methodDefinition
  | ctorDefinition
  | fieldDefinition
  | staticCtorDefinition
  ;

//*******************************/
//        Field definition       /
//*******************************/

fieldDefinition
  : ^(FIELDDECL ^(VMODIFIER field_visual_modifier?) ^(MODIFIER field_modifier*) ^(RETVALUE type) ^(UNITNAME keywordAggregate) ^(FIELDVALUE literals?)
            ^(UNITHEADER fieldInfo)
            ^(UNITATTR fieldAdditionalInfo*)
            )
  ;

fieldInfo
  : ^(Signature bytecodeType) flags
  ;

fieldAdditionalInfo
  : ^(Constant primitiveType literals)
  | ^(Constant CONSTANT_TYPE_ASSIGNABLE)
  | ^(Signature CPINDEX)
  | ^(Deprecated BOOLEANLITERAL)
  | ^(Synthetic BOOLEANLITERAL)
  | runtimeVisibleAnnotations_info
  | runtimeInvisibleAnnotations
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
  : ^(STATICCTORDECL ^(VMODIFIER field_visual_modifier?) ^(UNITHEADER methodInfo) ^(UNITBODY body))
  ;
  
//*******************************/
//        Ctor definition        /
//*******************************/

ctorDefinition
  : ^(CTORDECL ^(VMODIFIER field_visual_modifier)? ^(GENERICDESC genericDescriptor)? ^(UNITNAME typeName) arguments ^(THROWCLAUSE throwClause?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body)
                        ^(UNITATTR afterMethodInfo?)
                        )
  ;

//*******************************/
//        Method definition      /
//*******************************/

methodDefinition
  : ^(CTORDECL ^(VMODIFIER method_visual_modifier)? ^(MODIFIER method_modifier*) ^(GENERICDESC genericDescriptor?) ^(RETVALUE type) ^(UNITNAME keywordAggregate) arguments ^(THROWCLAUSE throwClauseMethod?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body?)
                        ^(UNITATTR afterMethodInfo?)
                        )
  ;

methodInfo
  : methodSignatureInfo flags
  ;

afterMethodInfo
  : ^(Deprecated  methodDeprecatedInfo)
  | ^(Signature CPINDEX)
  | runtimeInvisibleParameterAnnotations
  | runtimeVisibleAnnotations_info
  | runtimeInvisibleAnnotations
  | runtimeVisibleParameterAnnotations
  | ^(Exceptions  throwClause)
  | ^(Synthetic BOOLEANLITERAL)
  | annotationDefault)+
  ;

annotationDefault
  : ^(AnnotationDefault  DefaultValue annotationValue)
  ;
  
methodSignatureInfo
  : ^(Signature ^(PARAMDESC bytecodeType)* ^(RETDESC returnDescriptor))
  ;

returnDescriptor
  : bytecodeType | VoidType
  ;
  
methodDeprecatedInfo
  : BOOLEANLITERAL
  ;
    
method_modifier
  : ABSTRACT | FINAL  | STATIC  | SYNCHRONIZED  | NATIVE | STRICTFP
  ;
 
method_visual_modifier
  : PUBLIC | PRIVATE | PROTECTED
  ;

arguments//(DOT DOT DOT)? zero or more of the last object
  : ^(UNITARGUMENTS typeList? (DOT DOT DOT)?)
  ;

//*******************************/
//        Body definition      /
//*******************************/
  
body  
  : ^(Synthetic BOOLEANLITERAL)? ^(Code codeBlock) bodyExtension*
  ;

bodyExtension
  :  
  ( ^(ExceptionTable  exceptionTable)
  | ^(LineNumberTable  lineNumberTable?)
  | ^(LocalVariableTable  localVariableTable)
  | ^(LocalVariableTypeTable  localVariableTable)
  | ^(StackMapTable stackMapTable)
  | ^(StackMap stackMapTypeTable)
  )
  ;

codeBlock
  : ^(VARINFO variables) ^(INSTRUCTION instructionSet* codeBlockEnd)
  ;

instructionSet
  : codeLine | javaSwitch
  ;

codeLine
  : ^(IDENTIFIER pc ^(OPERAND operand1?) ^(OPERAND INTLITERAL?))
  ;

codeBlockEnd
  : ^(IDENTIFIER pc INTLITERAL?)
  ;
  
operand1
  : CPINDEX 
  | INTLITERAL
  | primitiveType
  ;

variables
  : variable variable variable
  ;

variable
  : ^(ASSIGN IDENTIFIER INTLITERAL)
  ;

javaSwitch  
  : ^(SWITCH ^(IDENTIFIER pc switchLine* switchDefaultLine))
  ;
  
switchLine
  : pc INTLITERAL 
  ;

switchDefaultLine
  : ^(DEFAULT INTLITERAL) 
  ;

//*******************************/
//        Exceptions             /
//*******************************/

throwClause
  : ^(THROWS typeList)
  ;
  
throwClauseMethod
  : ^(THROWS throwType+)
  ;

throwType
  : INTERNALTYPE  | IDENTIFIER  | QualifiedType
  ;

exceptionTable
  : ^(ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER) ^(ETENTRY exceptionTableEntry)+
  ;

exceptionTableEntry
  : INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
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
  : ^(IDENTIFIER pc INTLITERAL)
  ;
  
//*******************************/
//      localVariableTable       /
//*******************************/
  
localVariableTable
  : ^(LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER) ^(LVENTRY localVariableTableLine)*
  ;
  
localVariableTableLine
  : INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType 
  ;

localVariableTableLineIdentifier
  : IDENTIFIER
  ;
  
//*******************************/
//      StackMapTypeTable        /
//*******************************/

stackMapTypeTable
  : ^(SMTHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMTENTRY stackMapTypeTableEntry)+
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
  : ^(SMHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMENTRY stackMapTableEntry)+
  ;
stackMapTableEntry
  : ^(ASSIGN IDENTIFIER stackMapTableEntryValue)
  ;
stackMapTableEntryValue
  : INTLITERAL | stackMapTableTypesContainer
  ;
stackMapTableTypesContainer
  : stackMapTableTypes           
  ;
stackMapTableTypes
  : stackMapTableType*
  ;
stackMapTableType
  : stackMapTableTypeObject|stackMapTableTypePlainObject|primitiveType|IDENTIFIER INTLITERAL?
  ;
stackMapTableTypePlainObject
  : CLASS INTERNALTYPE
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
  : type+
  ;
type
  : ^(combinedJavaType ^(ARRAYBRACKS (LBRACK RBRACK)*))
  ;
combinedJavaType
  : primitiveType
  | referenceType
  ;
referenceType
  : typeDeclSpecifier+
  ;
typeDeclSpecifier
  : typeName ^(TYPEARGS typeArguments?)
  ;
typeName
  : identifier
  | QualifiedType
  ;
typeArguments
  : typeArgumentList
  ;
typeArgumentList 
  : typeArgument+
  ;
typeArgument
  : type
  | wildcard
  ;
wildcard
  : ^(QUESTION wildcardBounds?)
  ;
wildcardBounds
  : ^(EXTENDS type)
  | ^(SUPER type)
  ;
typeParameters
  : typeParameter+
  ;
typeParameter
  : ^(identifier typeBound?)
  ;
typeBound
  : ^(EXTENDS referenceType+)
  ;
//*******************************/
// Generic return Type description
//*******************************/
genericDescriptor
  : genericReturnDescriptor+
  ;
genericReturnDescriptor
  : ^(EXTENDS identifier bytecodeReferenceTypeList)
  ; 
bytecodeReferenceTypeList
  : bytecodeReferenceType+
  ;
bytecodeReferenceType
  : bytecodeTypeDeclSpecifier+
  ;
bytecodeTypeDeclSpecifier
  : bytecodeTypeName ^(TYPEARGS bytecodeTypeArguments?)
  ;
bytecodeTypeName
  : INTERNALTYPE
  ;
bytecodeTypeArguments
  : bytecodeTypeArgumentList
  ;
bytecodeTypeArgumentList 
  : bytecodeTypeArgument+
  ;
bytecodeTypeArgument
  : bytecodeReferenceType
  | bytecodeWildcard
  ;
bytecodeWildcard
  : ^(QUESTION bytecodeWildcardBounds?)
  ;
bytecodeWildcardBounds
  : ^(EXTENDS bytecodeReferenceType)
  | ^(SUPER bytecodeReferenceType)
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
  : simpleBytecodeReferenceType+
  ;
simpleBytecodeReferenceType
  : simpleBytecodeReferenceTypeName ^(TYPEARGS simpleBytecodeTypeArguments?)
  ;
simpleBytecodeReferenceTypeName
  : INTERNALTYPE
  ;
simpleBytecodeTypeArguments
  : simpleBytecodeTypeArgumentList
  ;
simpleBytecodeTypeArgumentList
  : simpleBytecodeTypeArgument+
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

identifier: IDENTIFIER | BaseType | VoidType | Constant_type;

keywordAggregate
  : identifier | primitiveType
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