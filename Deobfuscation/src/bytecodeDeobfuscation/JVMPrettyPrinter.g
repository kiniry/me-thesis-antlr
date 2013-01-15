tree grammar JVMPrettyPrinter;

options {
  output = template;
  tokenVocab = JVM;
  ASTLabelType = CommonTree;
}


@header {
  package bytecodeDeobfuscation;
}

//*******************************/
//  Class files 
//*******************************/

program : (s+=class_file)*  ->  prog(cs={$s})
  ;

class_file
  : ^(CLASSFILE ^(CFHEADER ch=class_file_header) cd=classDefinition)
          ->  classFile(header={$ch.st},body={$cd.st})
  ;
  
class_file_header
  : a=class_file_info
  b=modified_file_info
    c=checksum_file_info
    d=compiled_file_info  ->  classFileHeader(f={$a.st},s={$b.st},t={$c.st},q={$d.st})
  
  ;
class_file_info
  : ^(IDENTIFIER WINDOWSPATH)   ->  classFileInfo(desc={$IDENTIFIER.text}, path={$WINDOWSPATH.text})
  ;
  
modified_file_info
  : ^(id1=IDENTIFIER id2=IDENTIFIER date=DATE id3=IDENTIFIER int1=INTLITERAL id4=IDENTIFIER)
          ->  modifiedFileInfo(id1={$id1.text},id2={$id2.text},date={$date.text},id3={$id3.text},int1={$int1.text},id4={$id4.text})
  ;
  
checksum_file_info
  : ^(IDENTIFIER IDENTIFIER HexDigits)
          ->  checksumFileInfo(hexNumber={$HexDigits.text})
  ;
    
compiled_file_info
  : ^(IDENTIFIER IDENTIFIER STRINGLITERAL)
            ->  compiledFileInfo(fileName={$STRINGLITERAL.text})
  ;

//*******************************/
//        Class definition       /
//*******************************/

classDefinition
  : ^(CLASSDECL  ^(VMODIFIER cvm=class_visual_modifier?) ^(MODIFIER (cm+=class_modifier)*) n=typeName ^(TPARAMETERS typeParams=typeParameters?) ^(CEXTENDS ex=typeList?) ^(CIMPLEMENTS impl=typeList?)
                ^(UNITHEADER inf=type_info1)
                ^(CPOOL c=constant_pool)
                ^(UNITBODY bodyPrint=classBody?)
                ) ->    classDecl(vm={$cvm.st}, m={$cm}, cn={$n.st}, typeParams={$typeParams.st}, ext={$ex.st}, impl={$impl.st},
                          info={$inf.st},
                          cp={$c.st},
                          body={$bodyPrint.st}
                          )
  ;
    
class_visual_modifier
  : PUBLIC      -> noformat(f={$PUBLIC.text})
  ;
    
class_modifier
  : ABSTRACT      -> noformat(f={$ABSTRACT.text})
  | FINAL     -> noformat(f={$FINAL.text})
  | INTERFACE     -> noformat(f={$INTERFACE.text})
  | CLASS     -> noformat(f={$CLASS.text})
  ;

//*******************************/
//  type header
//*******************************/
type_info1
  : (s+=type_info2)+    -> nlSeparatedList(ls={$s})
  ;

type_info2
  : s1=sourcefile_info      -> noformat(f={$s1.st})
  | s2=minor_major_version_info   -> noformat(f={$s2.st})
  | s3=flags        -> noformat(f={$s3.st})
  | s4=scalaSig_info      -> noformat(f={$s4.st})
  | s5=runtimeVisibleAnnotations_info -> noformat(f={$s5.st})
  | s6=innerclass_info      -> noformat(f={$s6.st})
  | s7=enclosingMethod      -> noformat(f={$s7.st})
  | s8=signature_info_addition    -> noformat(f={$s8.st})
  | s9=deprecated     -> noformat(f={$s9.st})
  | s10=synthetic     -> noformat(f={$s10.st})
  | s11=scala_info      -> noformat(f={$s11.st})
  ;

synthetic
  : ^(Synthetic BOOLEANLITERAL) -> synt(b={$BOOLEANLITERAL.text})
  ;

deprecated
  : ^(Deprecated BOOLEANLITERAL)-> depr(b={$BOOLEANLITERAL.text})
  ;

enclosingMethod
  : ^(EnclosingMethod c1=CPINDEX DOT c2=CPINDEX)
          -> encl(cpin1={$c1.text}, cpin2={$c2.text})
  ;

sourcefile_info
  : ^(SourceFile STRINGLITERAL)
            -> srcFile(file={$STRINGLITERAL.text})
  ;

scalaSig_info
  : ^(ScalaSig
            IDENTIFIER ASSIGN i1=INTLITERAL  
            i2=INTLITERAL i3=INTLITERAL i4=INTLITERAL)
                    -> scalaSig(id1={$IDENTIFIER.text}, int1={$i1.text}, int2={$i2.text}, int3={$i3.text}, int4={$i4.text})
  ;

scala_info
  : ^(Scala IDENTIFIER ASSIGN INTLITERAL)
                      -> scala(id1={$IDENTIFIER.text}, int1={$INTLITERAL.text})
  ;
   
signature_info_addition
  : ^(Signature CPINDEX?) -> sign(v={$CPINDEX.text})
  ;

innerclass_info
  : ^(InnerClasses (s+=innerclass_info_line)+)
                        -> innerC(l={$s})
  ;
  
innerclass_info_line
  :  ^(VMODIFIER s=method_visual_modifier?) ^(MODIFIER (m+=method_modifier)*) i=innerclass_info_data
          -> innerCIL(vm={$s.st},m={$m},iid={$i.st})
  ;

innerclass_info_data
  : ^(cp1=CPINDEX ^(INFODATA1 (ASSIGN cp2=CPINDEX)?) ^(INFODATA2 (IDENTIFIER cp3=CPINDEX)?))
          -> innerCID(f={$cp1.text},s={$cp2.text},t={$cp3.text})
  ;
    
minor_major_version_info
  : ^(id1=IDENTIFIER id2=IDENTIFIER COLON INTLITERAL)
          -> version(f={$id1.text},s={$id2.text},t={$INTLITERAL.text})
  ;
      
flags
  : ^(Flag l=accessFlagList)  -> noformat2(f={$Flag.text},s={$l.st})
  ;
  
accessFlagList
  : (s+=flagType)*    -> flags(ls={$s})
  ;

flagType
  : IDENTIFIER      -> noformat(f={$IDENTIFIER.text})
  | INTLITERAL      -> noformat(f={$INTLITERAL.text})
  // strictfp -> 0x0800 could not be convert by javap
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
  : brackedAnnotationAssign 
  | AnnotationAssign
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
  : ^(id1=IDENTIFIER id2=IDENTIFIER (s+=contant_pool_line)*)
          -> cpool(f={$id1.text},s={$id2.text},t={$s})
  ;
  
contant_pool_line
  : ^(ASSIGN cp1=CPINDEX cta=CONSTANT_TYPE_ASSIGNABLE)
            -> cpoolline(f={$cp1.text},s={$cta.text})
  ;

//*******************************/
//          Code body            /
//*******************************/
  
classBody
  : (s+=classBodyEntryDecl)+  -> nlSeparatedList(ls={$s})
  ;
  
classBodyEntryDecl
  : s1=methodDefinition   -> noformat(f={$s1.st})
  | s2=ctorDefinition   -> noformat(f={$s2.st})
  | s3=fieldDefinition    -> noformat(f={$s3.st})
  | s4=staticCtorDefinition -> noformat(f={$s4.st})
  ;

//*******************************/
//        Field definition       /
//*******************************/

fieldDefinition
  : ^(FIELDDECL ^(VMODIFIER fvm=field_visual_modifier?) ^(MODIFIER (fm+=field_modifier)*) ^(RETVALUE ft=type) ^(UNITNAME fn=keywordAggregate) ^(FIELDVALUE lit=literals?)
            ^(UNITHEADER inf=fieldInfo)
            ^(UNITATTR ainfo=fieldAdditionalInfo*)
            )
            ->    fieldDecl(vm={$fvm.st}, m={$fm}, t={$ft.st}, n={$fn.st}, v={$lit.st},
                          info={$inf.st},
                          xinf={$ainfo.st}
                          )
  ;

fieldInfo
  : ^(sig=Signature s1=bytecodeType) s2=flags -> fieldInf(f={$sig.text}, s={$s1.st}, t={$s2.st})
  ;

fieldAdditionalInfo
  : ^(Constant pt=primitiveType l=literals) -> noformat3(f={$Constant.text},s={$pt.st},t={$l.st})
  | ^(Constant CONSTANT_TYPE_ASSIGNABLE)  -> noformat2(f={$Constant.text},s={$CONSTANT_TYPE_ASSIGNABLE.text})
  | ^(Signature CPINDEX)      -> noformat2(f={$Signature.text},s={$CPINDEX.text})
  | ^(Deprecated BOOLEANLITERAL)    -> noformat2(f={$Deprecated.text},s={$BOOLEANLITERAL.text})
  | ^(Synthetic BOOLEANLITERAL)     -> noformat2(f={$Synthetic.text},s={$BOOLEANLITERAL.text})
  | s=runtimeVisibleAnnotations_info    -> noformat(f={$s.st})
  | s=runtimeInvisibleAnnotations   -> noformat(f={$s.st})
  ;

field_visual_modifier
  : PUBLIC        -> noformat(f={$PUBLIC.text})
  | PRIVATE       -> noformat(f={$PRIVATE.text})
  | PROTECTED     -> noformat(f={$PROTECTED.text})
  ;
    
field_modifier
  : FINAL       -> noformat(f={$FINAL.text})
  | STATIC        -> noformat(f={$STATIC.text})
  | TRANSIENT       -> noformat(f={$TRANSIENT.text})
  | VOLATILE      -> noformat(f={$VOLATILE.text})
  ;
  
//*******************************/
//    Static ctor definition     /
//*******************************/

staticCtorDefinition
  : ^(STATICCTORDECL ^(VMODIFIER field_visual_modifier?) ^(UNITHEADER methodInfo) ^(UNITBODY body)
  )
  ;

//*******************************/
//        Ctor definition        /
//*******************************/

ctorDefinition
  : ^(CTORDECL ^(VMODIFIER field_visual_modifier?) ^(GENERICDESC genericDescriptor?) ^(UNITNAME typeName) arguments ^(THROWCLAUSE throwClause?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body)
                        ^(UNITATTR afterMethodInfo?)
                        )
  ;

//*******************************/
//        Method definition      /
//*******************************/

methodDefinition
  : ^(METHODDECL ^(VMODIFIER method_visual_modifier?) ^(MODIFIER method_modifier*) ^(GENERICDESC genericDescriptor?) ^(RETVALUE type) ^(UNITNAME keywordAggregate) arguments ^(THROWCLAUSE throwClauseMethod?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body?)
                        ^(UNITATTR afterMethodInfo?)
                        )
  ;

methodInfo
  : ^(STANDINTOKEN methodSignatureInfo flags)
  ;

afterMethodInfo
  : (^(Deprecated  BOOLEANLITERAL)
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
  : ^(Signature ^(PARAMDESC bytecodeType*) ^(RETDESC returnDescriptor))
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
  : ^(UNITARGUMENTS typeList? (DOT DOT DOT)?)
  ;

//*******************************/
//        Body definition      /
//*******************************/
  
body  
  : (Synthetic BOOLEANLITERAL)? ^(Code codeBlock) bodyExtension*
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
  : ^(ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER) ^(ETENTRY exceptionTableEntry+)
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
  : ^(LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER) ^(LVENTRY localVariableTableLine*)
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
  : ^(SMTHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMTENTRY stackMapTypeTableEntry+)
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
  : ^(SMHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMENTRY stackMapTableEntry+)
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
  : (s+=type)+        -> commaSeparatedList(ls={$s})
  ;
type
  : s=combinedJavaType ^(ARRAYBRACKS ((b+=LBRACK RBRACK))*)
            -> type(body={s.st}, ext={$b})
  ;
combinedJavaType
  : s1=primitiveType      -> noformat(f={$s1.st})
  | s2=referenceType      -> noformat(f={$s2.st})
  ;
referenceType
  : ^(UNITNAME (s+=typeDeclSpecifier)+) -> dotSeparatedList(ls={$s})
  ;
typeDeclSpecifier
  : ^(s1=typeName ^(TYPEARGS s2=typeArguments?))
            -> noformat2(f={$s1.st}, s={$s2.st})
  ;
typeName
  : QualifiedType     -> noformat(f={$QualifiedType.text})
  ;
typeArguments
  : (s+=typeArgument)+      -> genericParam(ls={$s})
  ;
typeArgument
  : s1=type       -> noformat(f={$s1.st})
  | s2=wildcard       -> noformat(f={$s2.st})
  ;
wildcard
  : ^(QUESTION s1=wildcardBounds?)  -> wildT(f={$s1.st})
  ;
wildcardBounds
  : ^(EXTENDS s1=type)      -> wildBoundsT(f={$EXTENDS.text}, f={$s1.st})
  | ^(SUPER s2=type)      -> wildBoundsT(f={$SUPER.text}, f={$s2.st})
  ;
typeParameters
  : (s+=typeParameter)+     -> genericParam(ls={$s})
  ;
typeParameter
  : ^(id=identifier tb=typeBound?)  -> noformat2(f={$id.st}, s={$tb.st})
  ;
typeBound
  : ^(EXTENDS (s+=referenceType)+)  -> tBound(f={$EXTENDS.text}, ls={$s})
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
  : ^(UNITNAME bytecodeTypeDeclSpecifier+)
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
  : INTLITERAL COLON
  ;