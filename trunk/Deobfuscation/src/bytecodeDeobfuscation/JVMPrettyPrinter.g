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
    d=compiled_file_info?  ->  classFileHeader(f={$a.st},s={$b.st},t={$c.st},q={$d.st})
  
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
  : ^(Flag l=accessFlagList)  -> noformatWithspace2(f={$Flag.text},s={$l.st})
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
  | s1=runtimeVisibleAnnotations_info   -> noformat(f={$s1.st})
  | s2=runtimeInvisibleAnnotations    -> noformat(f={$s2.st})
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
  : ^(STATICCTORDECL ^(VMODIFIER svm=field_visual_modifier?) 
    ^(UNITHEADER inf=methodInfo) 
    ^(UNITBODY b=body)
  )
                          ->    statCtorDecl(vm={$svm.st},
                            info={$inf.st},
                          body={$b.st}
                          )
  ;

//*******************************/
//        Ctor definition        /
//*******************************/

ctorDefinition
  : ^(CTORDECL ^(VMODIFIER cvm=field_visual_modifier?) ^(GENERICDESC g=genericDescriptor?) ^(UNITNAME name=typeName) a=arguments ^(THROWCLAUSE t=throwClause?)
                        ^(UNITHEADER inf=methodInfo)
                        ^(UNITBODY b=body)
                        ^(UNITATTR ainfo=afterMethodInfo?)
                        )
                        ->    ctorDecl(vm={$cvm.st}, gd={$g.st}, n={$name.st}, args={$a.st}, thr={$t.st},
                          info={$inf.st},
                          body={$b.st},
                          xinf={$ainfo.st}
                          )
  ;

//*******************************/
//        Method definition      /
//*******************************/

methodDefinition
  : ^(METHODDECL ^(VMODIFIER mvm=method_visual_modifier?) ^(MODIFIER mm=method_modifier*) ^(GENERICDESC g=genericDescriptor?) ^(RETVALUE mt=type) ^(UNITNAME mn=keywordAggregate) a=arguments ^(THROWCLAUSE t=throwClauseMethod?)
                        ^(UNITHEADER inf=methodInfo)
                        ^(UNITBODY b=body?)
                        ^(UNITATTR ainfo=afterMethodInfo?)
                        )
                        ->    methDecl(vm={$mvm.st}, m={$mm.st}, gd={$g.st}, t={$mt.st}, n={$mn.st}, args={$a.st}, thr={$t.st},
                          info={$inf.st},
                          body={$b.st},
                          xinf={$ainfo.st}
                          )
  ;

methodInfo
  : ^(STANDINTOKEN ms=methodSignatureInfo fl=flags) 
              -> methodInfo(f={$ms.st},s={$fl.st})
  ;

afterMethodInfo
  : (s+=afterMethodInfoEntry)+      -> nlSeparatedList(ls={$s})
  ;

afterMethodInfoEntry
  : ^(Deprecated  BOOLEANLITERAL)   -> noformat2(f={$Deprecated.text},s={$BOOLEANLITERAL.text})
  | ^(Signature CPINDEX)      -> noformat2(f={$Signature.text},s={$CPINDEX.text})
  | s1=runtimeInvisibleParameterAnnotations -> noformat(f={$s1.st})
  | s2=runtimeVisibleAnnotations_info   -> noformat(f={$s2.st})
  | s3=runtimeInvisibleAnnotations    -> noformat(f={$s3.st})
  | s4=runtimeVisibleParameterAnnotations -> noformat(f={$s4.st})
  | ^(Exceptions  t=throwClause)    -> noformat2(f={$Exceptions.text},s={$t.st})
  | ^(Synthetic BOOLEANLITERAL)     -> noformat2(f={$Synthetic.text},s={$BOOLEANLITERAL.text})
  | s5=annotationDefault      -> noformat(f={$s5.st})
  ;

annotationDefault
  : ^(AnnotationDefault  DefaultValue v=annotationValue)
        -> noformat(f={$v.st})
  ;
  
methodSignatureInfo
  : ^(Signature ^(PARAMDESC (s+=bytecodeType)*) ^(RETDESC r=returnDescriptor))
        -> methodSign(in={$s},out={$r.st})
  ;

returnDescriptor
  : s=bytecodeType  -> noformat(f={$s.st})
  | VoidType    -> noformat(f={$VoidType.text})
  ;

method_modifier
  : ABSTRACT    -> noformat(f={$ABSTRACT.text})
  | FINAL     -> noformat(f={$FINAL.text})
  | STATIC      -> noformat(f={$STATIC.text})
  | SYNCHRONIZED    -> noformat(f={$SYNCHRONIZED.text})
  | NATIVE    -> noformat(f={$NATIVE.text})
  | STRICTFP    -> noformat(f={$STRICTFP.text})
  ;
 
method_visual_modifier
  : PUBLIC    -> noformat(f={$PUBLIC.text})
  | PRIVATE     -> noformat(f={$PRIVATE.text})
  | PROTECTED   -> noformat(f={$PROTECTED.text})
  ;

arguments//(DOT DOT DOT)? zero or more of the last object
  : ^(UNITARGUMENTS tl=typeList? (d=DOT DOT DOT)?)
        -> args(f={$tl.st},s={$d.text})
  ;

//*******************************/
//        Body definition      /
//*******************************/
  
body  
  : (Synthetic BOOLEANLITERAL)? ^(Code c=codeBlock) (e+=bodyExtension)*
          -> body(f={$BOOLEANLITERAL.text},s={$c.st},t={$e})
  ;

bodyExtension
  : ^(ExceptionTable  s1=exceptionTable)    -> bodyExt(f={$ExceptionTable.text},s={$s1.st})
  | ^(LineNumberTable  s2=lineNumberTable?)   -> bodyExt(f={$LineNumberTable.text},s={$s2.st})
  | ^(LocalVariableTable  s3=localVariableTable)  -> bodyExt(f={$LocalVariableTable.text},s={$s3.st})
  | ^(LocalVariableTypeTable s4=localVariableTable) -> bodyExt(f={$LocalVariableTypeTable.text},s={$s4.st})
  | ^(StackMapTable s5=stackMapTable)     -> bodyExt(f={$StackMapTable.text},s={$s5.st})
  | ^(StackMap s6=stackMapTypeTable)      -> bodyExt(f={$StackMap.text},s={$s6.st})
  ;

codeBlock
  : ^(VARINFO v=variables) ^(INSTRUCTION (i+=instructionSet)* e=codeBlockEnd)
          -> codeblock(f={$v.st},s={$i},t={$e.st})
  ;

instructionSet
  : s1=codeLine     -> noformat(f={$s1.st})
  | s2=javaSwitch   -> noformat(f={$s2.st})
  ;

codeLine
  : ^(IDENTIFIER p=pc ^(OPERAND o=operand1?) ^(OPERAND INTLITERAL?))
          -> codeline(f={$p.st},s={$IDENTIFIER.text},t={$o.st},q={$INTLITERAL.text})
  ;

codeBlockEnd
  : ^(IDENTIFIER p=pc INTLITERAL?)
          -> codeline(f={$p.st},s={$IDENTIFIER.text},t={$INTLITERAL.text})
  ;
  
operand1
  : CPINDEX       -> noformat(f={$CPINDEX.text})
  | INTLITERAL      -> noformat(f={$INTLITERAL.text})
  | s=primitiveType   -> noformat(f={$s.st})
  ;

variables
  : s1=variable s2=variable s3=variable 
          -> variables(f={$s1.st},s={$s2.st},t={$s3.st})
  ;

variable
  : ^(ASSIGN IDENTIFIER INTLITERAL)
        -> variable(f={$IDENTIFIER.text},s={$INTLITERAL.text})
  ;

javaSwitch  
  : ^(SWITCH ^(IDENTIFIER p=pc (s+=switchLine)* s1=switchDefaultLine))
          -> switch(f={$p.st},s={$IDENTIFIER.text},t={$s},q={$s1.st})
  ;
  
switchLine
  : p=pc INTLITERAL     -> noformatWithspace2(f={$p.st},s={$INTLITERAL.text})
  ;

switchDefaultLine
  : ^(DEFAULT INTLITERAL)   -> noformatWithspace2(f={$DEFAULT.text},s={$INTLITERAL.text})
  ;

//*******************************/
//        Exceptions             /
//*******************************/

throwClause
  : ^(THROWS s=typeList)  -> noformatWithspace2(f={$THROWS.text},s={$s.st})
  ;
  
throwClauseMethod
  : ^(THROWS (s+=throwType)+) -> throwC(f={$THROWS.text},ls={$s})
  ;

throwType
  : INTERNALTYPE      -> noformat(f={$INTERNALTYPE.text})
  | IDENTIFIER      -> noformat(f={$IDENTIFIER.text})
  | QualifiedType   -> noformat(f={$QualifiedType.text})
  ;

exceptionTable
  : ^(ETHEADER id1=IDENTIFIER id2=IDENTIFIER id3=IDENTIFIER id4=IDENTIFIER) ^(ETENTRY (s+=exceptionTableEntry)+)
          -> excTable(f={$id1.text},s={$id2.text},t={$id3.text},q={$id4.text},ls={$s})
  ;

exceptionTableEntry
  : id1=INTLITERAL id2=INTLITERAL id3=INTLITERAL s1=exceptionTableEntryValue
          -> excTableEntry(f={$id1.text},s={$id2.text},t={$id3.text},q={$s1.st})
  ;
exceptionTableEntryValue
  : s=primitiveType   -> noformat(f={$s.st})
  | IDENTIFIER      -> noformat(f={$IDENTIFIER.text})
  | CONSTANT_TYPE_ASSIGNABLE  -> noformat(f={$CONSTANT_TYPE_ASSIGNABLE.text})
  ;
  
//*******************************/
//        LineNumber             /
//*******************************/

lineNumberTable
  : (s+=lineNumberTableLine)+   -> lnTable(ls={$s})
  ;

lineNumberTableLine
  : ^(IDENTIFIER p=pc INTLITERAL) -> lnTableEntry(f={$IDENTIFIER.text},s={$p.st},t={$INTLITERAL.text})
  ;
  
//*******************************/
//      localVariableTable       /
//*******************************/
  
localVariableTable
  : ^(LVHEADER id1=IDENTIFIER id2=IDENTIFIER id3=IDENTIFIER id4=IDENTIFIER id5=IDENTIFIER) ^(LVENTRY (s+=localVariableTableLine)*)
            -> lvTable(f={$id1.text},s={$id2.text},t={$id3.text},q={$id4.text},c={$id5.text},ls={$s})
  ;
  
localVariableTableLine
  : id1=INTLITERAL id2=INTLITERAL id3=INTLITERAL s1=localVariableTableLineIdentifier s2=bytecodeType 
            -> lvTableEntry(f={$id1.text},s={$id2.text},t={$id3.text},q={$s1.st},c={$s2.st})
  ;
  
localVariableTableLineIdentifier
  : IDENTIFIER        -> noformat(f={$IDENTIFIER.text})
  ;
  
//*******************************/
//      StackMapTypeTable        /
//*******************************/

stackMapTypeTable
  : ^(SMTHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMTENTRY (s+=stackMapTypeTableEntry)+)
            -> smtTable(f={$IDENTIFIER.text},s={$INTLITERAL.text},ls={$s})
  ;

stackMapTypeTableEntry
  : id1=IDENTIFIER ASSIGN i1=INTLITERAL id2=IDENTIFIER ASSIGN i2=INTLITERAL 
    id3=IDENTIFIER ASSIGN s1=stackMapTableTypesContainer 
    id4=IDENTIFIER ASSIGN s2=stackMapTableTypesContainer
              -> smtTableEntry(a={$id1.text},b={$i1.text},c={$id2.text},d={$i2.text},e={$id3.text},f={$s1.st},g={$id4.text},h={$s2.st})
  ;

//*******************************/
//        StackMapTable          /
//*******************************/

stackMapTable
  : ^(SMHEADER IDENTIFIER ASSIGN INTLITERAL) ^(SMENTRY (s+=stackMapTableEntry)+)
            -> smTable(f={$IDENTIFIER.text},s={$INTLITERAL.text},ls={$s})
  ;
stackMapTableEntry
  : ^(ASSIGN IDENTIFIER s=stackMapTableEntryValue)
            -> smTableEntry(f={$IDENTIFIER.text},s={$s.st})
  ;
stackMapTableEntryValue
  : INTLITERAL        -> noformat(f={$INTLITERAL.text})
  | s=stackMapTableTypesContainer -> noformat(f={$s.st})
  ;
stackMapTableTypesContainer
  : s=stackMapTableTypes            -> smTableContainer(f={$s.st})
  ;
stackMapTableTypes
  : (s+=stackMapTableType)*   -> commaSeparatedList(ls={$s})
  ;
stackMapTableType
  : s1=stackMapTableTypeObject    -> noformat(f={$s1.st})
  | s2=stackMapTableTypePlainObject -> noformat(f={$s2.st})
  | s3=primitiveType      -> noformat(f={$s3.st})
  | IDENTIFIER INTLITERAL?    -> noformatWithspace2(f={$IDENTIFIER.text},s={$INTLITERAL.text})
  ;
stackMapTableTypePlainObject
  : CLASS INTERNALTYPE      -> noformatWithspace2(f={$CLASS.text},s={$INTERNALTYPE.text})
  ;
stackMapTableTypeObject
  : CLASS STRINGLITERAL     -> noformatWithspace2(f={$CLASS.text},s={$STRINGLITERAL.text})
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
  : s=combinedJavaType ^(ARRAYBRACKS (b+=LBRACK RBRACK)*)
            -> type(f={$s.st}, s={$b})
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
  : (s+=genericReturnDescriptor)+   -> genericParam(ls={$s})
  ;
genericReturnDescriptor
  : ^(EXTENDS s1=identifier s2=bytecodeReferenceTypeList)
              -> genRetDesc(f={$s1.st},s={$EXTENDS.text},t={$s2.st})
  ; 
bytecodeReferenceTypeList
  : (s+=bytecodeReferenceType)+     -> andSeparatedList(ls={$s})
  ;
bytecodeReferenceType
  : ^(UNITNAME (s+=bytecodeTypeDeclSpecifier)+) -> dotSeparatedList(ls={$s})
  ;
bytecodeTypeDeclSpecifier
  : s1=bytecodeTypeName ^(TYPEARGS s2=bytecodeTypeArguments?)
              -> noformat2(f={$s1.st}, s={$s2.st})
  ;
bytecodeTypeName
  : INTERNALTYPE        -> noformat(f={$INTERNALTYPE.text})
  ;
bytecodeTypeArguments
  : s=bytecodeTypeArgumentList      -> noformat(f={$s.st})
  ;
bytecodeTypeArgumentList 
  : (s+=bytecodeTypeArgument)+      -> genericParam(ls={$s})
  ;
bytecodeTypeArgument
  : s1=bytecodeReferenceType    -> noformat(f={$s1.st})
  | s2=bytecodeWildcard     -> noformat(f={$s2.st})
  ;
bytecodeWildcard
  : ^(QUESTION s=bytecodeWildcardBounds?) -> noformatWithspace2(f={$QUESTION.text},s={$s.st})
  ;
bytecodeWildcardBounds
  : ^(EXTENDS s1=bytecodeReferenceType)   -> noformatWithspace2(f={$EXTENDS.text},s={$s1.st})
  | ^(SUPER s2=bytecodeReferenceType)   -> noformatWithspace2(f={$SUPER.text},s={$s2.st})
  ;

//*******************************/
// Bytecode Types
//*******************************/

bytecodeType
  : s1=bytecodeArrayType    -> noformat(f={$s1.st})
  | BaseType        -> noformat(f={$BaseType.text})
  | s2=simpleBytecodeObjectType SEMI  -> noformat2(f={$s2.st},s={$SEMI.text})
  | IDENTIFIER        -> noformat(f={$IDENTIFIER.text})
  // More than one BaseType will instead be an IDENTIFIER
  ;
bytecodeArrayType
  : LBRACK s=bytecodeType   -> noformat2(f={$LBRACK.text},s={$s.st})
  ; 
simpleBytecodeObjectType
  : (s+=simpleBytecodeReferenceType)+ -> dotSeparatedList(ls={$s})
  ;
simpleBytecodeReferenceType
  : s1=simpleBytecodeReferenceTypeName ^(TYPEARGS s2=simpleBytecodeTypeArguments?)
            -> noformat2(f={$s1.st},s={$s2.st})
  ;
simpleBytecodeReferenceTypeName
  : INTERNALTYPE      -> noformat(f={$INTERNALTYPE.text})
  ;
simpleBytecodeTypeArguments
  : s=simpleBytecodeTypeArgumentList  -> noformat(f={$s.st})
  ;
simpleBytecodeTypeArgumentList
  : (s+=simpleBytecodeTypeArgument)+  -> bcGenericArgs(ls={$s})
  ;
simpleBytecodeTypeArgument
  : s1=bytecodeType     -> noformat(f={$s1.st})
  | MINUS s2=bytecodeType     -> noformat2(f={$MINUS.text},s={$s2.st})
  | PLUS s3=bytecodeType      -> noformat2(f={$PLUS.text},s={$s3.st})
  | STAR        -> noformat(f={$STAR.text})
  ;

//*******************************/
// Simple types
//*******************************/

identifier
  : IDENTIFIER    -> noformat(f={$IDENTIFIER.text})
  ;

keywordAggregate
  :  IDENTIFIER     -> noformat(f={$IDENTIFIER.text})
  ;

primitiveType
  : s1=boolean_type   -> noformat(f={$s1.st})
  | s2=numeric_type   -> noformat(f={$s2.st})
  | VOID      -> noformat(f={$VOID.text})
  ;

boolean_type
  : BOOLEAN     -> noformat(f={$BOOLEAN.text})
  ;

numeric_type
  : s1=floating_point_type  -> noformat(f={$s1.st})
  | s2=integral_type    -> noformat(f={$s2.st})
  ;

integral_type
  : BYTE    -> noformat(f={$BYTE.text})
  | SHORT   -> noformat(f={$SHORT.text})
  | INT     -> noformat(f={$INT.text})
  | LONG    -> noformat(f={$LONG.text})
  | CHAR    -> noformat(f={$CHAR.text})
  ;

floating_point_type
  : FLOAT   -> noformat(f={$FLOAT.text})
  | DOUBLE    -> noformat(f={$DOUBLE.text})
  ;

literals
  : LONGLITERAL   -> noformat(f={$LONGLITERAL.text})
  | INTLITERAL    -> noformat(f={$INTLITERAL.text})
  | FLOATLITERAL  -> noformat(f={$FLOATLITERAL.text})
  | DOUBLELITERAL -> noformat(f={$DOUBLELITERAL.text})
  | CHARLITERAL   -> noformat(f={$CHARLITERAL.text})
  | STRINGLITERAL -> noformat(f={$STRINGLITERAL.text})
  | BOOLEANLITERAL  -> noformat(f={$BOOLEANLITERAL.text})
  | MINUS? IDENTIFIER -> noformat2(f={$MINUS.text},s={$IDENTIFIER.text})
  ;

pc
  : INTLITERAL COLON  -> noformat2(f={$INTLITERAL.text},s={$COLON.text})
  ;