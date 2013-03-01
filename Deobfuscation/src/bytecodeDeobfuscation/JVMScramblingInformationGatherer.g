tree grammar JVMScramblingInformationGatherer;

options {
  language = Java;
  output = AST;
  tokenVocab = JVM;
  ASTLabelType = CommonTree;
}


@header {
  package bytecodeDeobfuscation;
  import java.util.HashMap;
  import java.util.regex.*;
}


@members{
	public HashMap<String, ConstantPoolLine> codeblocks = new HashMap<String, ConstantPoolLine>();
	public HashMap<String, ConstantPoolLine> valueLineMapping = new HashMap<String, ConstantPoolLine>();
    	
       	private void rename(String originalName, String newName){
       		if(valueLineMapping.containsKey(originalName)){
       			ConstantPoolLine changingLine = valueLineMapping.get(originalName).constantPoolLine2.constantPoolLine1;
       			CommonTree tokenToReplace = changingLine.token;

			Object o = adaptor.create(JVMScramblingInformationGatherer.CONSTANT_TYPE_ASSIGNABLE, tokenToReplace.getText().replace(changingLine.value, newName));
			tokenToReplace.parent.replaceChildren(tokenToReplace.childIndex, tokenToReplace.childIndex, o);
       		}
       	}

    	private String getValue(String text)
    	{
    		int commentIndex = text.indexOf(" ");
    		return text.substring(commentIndex, text.length()).trim();
    	}

    	private String getType(String text)
    	{
    		int commentIndex = text.indexOf(" ");
    		return text.substring(0, commentIndex);
    	}
    	
       	private void setConstantPool(HashMap<String, CommonTree> lines){
       		for(String key : lines.keySet()){
       			if(!codeblocks.containsKey(key))
       				codeblocks.put(key, setTokens(lines, lines.get(key)));
       		}
       		MapValueLine();
       	}
       	
       	private void MapValueLine(){
       		for(ConstantPoolLine cpl : codeblocks.values()){
       			valueLineMapping.put(cpl.value, cpl);
       		}
       	}
    	
    	private ConstantPoolLine getConstantPoolLine(String key, HashMap<String, CommonTree> lines){
			if(codeblocks.containsKey(key))
				return codeblocks.get(key);
			ConstantPoolLine ret = setTokens(lines, lines.get(key));
			codeblocks.put(key, ret);
			return ret;
    	}
    	
    	private ConstantPoolLine setTokens(HashMap<String, CommonTree> lines, CommonTree token)
    	{
    		String text = token.getText();
    		String value = getValue(text);
    		String type = getType(text);
    		ConstantPoolLine line;
    		String[] refs = getReferences(value);
    		ConstantPoolLine ref1;
    		ConstantPoolLine ref2;
    		switch(type){
    			case "Class":
    			case "String":
    				ConstantPoolLine ref = getConstantPoolLine(refs[0], lines);
    				line = new ConstantPoolLine(type, ref.value, ref, null, token);
    				break;
    			case "NameAndType":
    				ref1 = getConstantPoolLine(refs[0], lines);
    				ref2 = getConstantPoolLine(refs[1], lines);
    				value =  ref1.value + ":" + ref2.value;
    				line = new ConstantPoolLine(type, value, codeblocks.get(refs[0]), codeblocks.get(refs[1]), token);
    				break;
    			case "Methodref":
    			case "Fieldref":
    			case "InterfaceMethodref":
    			        ref1 = getConstantPoolLine(refs[0], lines);
        			ref2 = getConstantPoolLine(refs[1], lines);
    				value =  ref1.value + "." + ref2.value;
    				line = new ConstantPoolLine(type, value, codeblocks.get(refs[0]), codeblocks.get(refs[1]), token);
    				break;
    			default:
    				return new ConstantPoolLine(type, value, null, null, token);
    		}
    		return line;
    	}

      	public class ConstantPoolLine {
    	  public String type;
    	  public String value;
    	  public ConstantPoolLine constantPoolLine1;
    	  public ConstantPoolLine constantPoolLine2;
    	  public CommonTree token;
    	  
    	  public ConstantPoolLine(String type, String value, ConstantPoolLine ref1, ConstantPoolLine ref2, CommonTree token){
    		  this.type = type;
    		  this.value = value;
    		  this.constantPoolLine1 = ref1;
    		  this.constantPoolLine2 = ref2;
    		  this.token = token;
    	  }
    	}
    	private String[] getReferences(String value)
    	{
    		String[] ret = new String[2];
    		
    	      // String to be scanned to find the pattern.
    	      String pattern = "#\\d+";

    	      // Create a Pattern object
    	      Pattern r = Pattern.compile(pattern);

    	      // Now create matcher object.
    	      Matcher m = r.matcher(value);
    	      int index = 0;
    	      while(m.find()){
    	    	  ret[index++] = m.group();
    	      }
    	      return ret;
    	}
}

//*******************************/
//  Class files 
//*******************************/

program : class_file*;

class_file
  : ^(CLASSFILE ^(CFHEADER class_file_header) classDefinition
  )
  ;
  
  class_file_header
    : class_file_info
    modified_file_info
    checksum_file_info
    compiled_file_info?
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
scope{
	String className;
}
  : ^(CLASSDECL  ^(VMODIFIER class_visual_modifier?) ^(MODIFIER class_modifier*) typeName {$classDefinition::className = $typeName.text;} ^(TPARAMETERS typeParameters?) ^(CEXTENDS typeList?) ^(CIMPLEMENTS typeList?)
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
  :  ^(VMODIFIER method_visual_modifier?) ^(MODIFIER method_modifier*) innerclass_info_data
  ;

innerclass_info_data
  : ^(CPINDEX ^(INFODATA1 (ASSIGN CPINDEX)?) ^(INFODATA2 (IDENTIFIER CPINDEX)?))
  ;
    
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
  : id=IDENTIFIER
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
  : brackedAnnotationAssign 
  | AnnotationAssign
  ;
brackedAnnotationAssign
  : ^(ANNOTATIONBRACKETS brackedAnnotationAssignList?)
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
  : ^(PVI pc IDENTIFIER? runtimeVisibleAnnotationsItem*)
  ;
runtimeInvisibleAnnotationsItem
  : ^(RIAI pc pc? ^(CPINDEX runtimeVisibleAnnotationAssignList?))
  ;

//*******************************/
//  Constant pool
//*******************************/

constant_pool
scope{
	private HashMap<String, CommonTree> lines;
}
@init{
	$constant_pool::lines = new HashMap<String, CommonTree>();
}
@after{
	setConstantPool($constant_pool::lines);
}
  : ^(IDENTIFIER IDENTIFIER contant_pool_line*)
  ;
  
contant_pool_line
@after{
	$constant_pool::lines.put($cpi.text, (CommonTree)$tree.getChild(1));
}
  : ^(ASSIGN cpi=CPINDEX cta=CONSTANT_TYPE_ASSIGNABLE)
  -> ^(ASSIGN $cpi $cta)
  ;

//*******************************/
//          Code body            /
//*******************************/
  
classBody
scope{
	int fieldCount;
	int methodCount;
	int ctorCount;
}
@init{
	$classBody::fieldCount = 0;
	$classBody::methodCount = 0;
	$classBody::ctorCount = 0;
}
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
@after{
	$classBody::fieldCount++;
}
  : ^(FIELDDECL ^(VMODIFIER field_visual_modifier?) ^(MODIFIER field_modifier*) ^(RETVALUE type) ^(UNITNAME IDENTIFIER) ^(FIELDVALUE literals?)
            ^(UNITHEADER fieldInfo)
            ^(UNITATTR fieldAdditionalInfo*)
            )
            {rename($classDefinition::className + "." + $IDENTIFIER.text + ":" + $fieldInfo.value, "field" + $classBody::fieldCount);} 
            -> ^(FIELDDECL ^(VMODIFIER field_visual_modifier?) ^(MODIFIER field_modifier*) ^(RETVALUE type) ^(UNITNAME IDENTIFIER["datField" + $classBody::fieldCount]) ^(FIELDVALUE literals?)
            ^(UNITHEADER fieldInfo)
            ^(UNITATTR fieldAdditionalInfo*)
            )
  ;

fieldInfo returns [String value]
  : ^(Signature bytecodeType) flags {$value = $bytecodeType.value;}
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
  : ^(STATICCTORDECL ^(VMODIFIER field_visual_modifier?) ^(UNITHEADER methodInfo) ^(UNITBODY body)
  )
  ;

//*******************************/
//        Ctor definition        /
//*******************************/

ctorDefinition
@after{
	$classBody::ctorCount++;
}
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
@after{
	$classBody::methodCount++;
}
  : ^(METHODDECL ^(VMODIFIER method_visual_modifier?) ^(MODIFIER method_modifier*) ^(GENERICDESC genericDescriptor?) ^(RETVALUE type) ^(UNITNAME IDENTIFIER) arguments ^(THROWCLAUSE throwClauseMethod?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body?)
                        ^(UNITATTR afterMethodInfo?)
                        )
                        {rename($classDefinition::className + "." + $IDENTIFIER.text + ":" + $methodInfo.value, "method" + $classBody::methodCount);} 
                        -> ^(METHODDECL ^(VMODIFIER method_visual_modifier?) ^(MODIFIER method_modifier*) ^(GENERICDESC genericDescriptor?) ^(RETVALUE type) ^(UNITNAME IDENTIFIER["method" + $classBody::ctorCount]) arguments ^(THROWCLAUSE throwClauseMethod?)
                        ^(UNITHEADER methodInfo)
                        ^(UNITBODY body?)
                        ^(UNITATTR afterMethodInfo?)
                        )
                        
  ;

methodInfo returns [String value]
  : ^(STANDINTOKEN methodSignatureInfo flags) {$value = $methodSignatureInfo.value;}
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
  
methodSignatureInfo returns [String value]
  : ^(Signature ^(PARAMDESC bytecodeType*) ^(RETDESC returnDescriptor))
  	{$value = "(" + (($bytecodeType.value == null) ? "" : $bytecodeType.value) + ")" + $returnDescriptor.text;}
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
  : ^(SMTTYPES stackMapTableType*)
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
  : combinedJavaType ^(ARRAYBRACKS (LBRACK RBRACK)*)
  ;
combinedJavaType
  : primitiveType
  | referenceType
  ;
referenceType
  : ^(UNITNAME typeDeclSpecifier+)
  ;
typeDeclSpecifier
  : ^(typeName ^(TYPEARGS typeArguments?))
  ;
typeName
  : QualifiedType
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

bytecodeType returns [String value]
  : bytecodeArrayType {$value = $bytecodeArrayType.text;}
  | BaseType {$value = $BaseType.text;}
  | simpleBytecodeObjectType SEMI {$value = $simpleBytecodeObjectType.text + $SEMI.text;}
  | IDENTIFIER {$value = $IDENTIFIER.text;} // More than one BaseType will instead be an IDENTIFIER
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

identifier: IDENTIFIER;

keywordAggregate
  : IDENTIFIER
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