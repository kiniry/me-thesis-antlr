// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g 2013-01-28 14:57:44

  package bytecodeDeobfuscation;
  import java.util.HashMap;
  import java.util.regex.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JVMScramblingInformationGatherer extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AND", "ANNOTATIONBRACKETS", "ARRAYBRACKS", "ASSIGN", "AnnotationAssign", "AnnotationDefault", "BANNOTATION", "BOOLEAN", "BOOLEANLITERAL", "BYTE", "BaseType", "CEXTENDS", "CFHEADER", "CHAR", "CHARLITERAL", "CIMPLEMENTS", "CLASS", "CLASSDECL", "CLASSFILE", "COLON", "COMMA", "COMMENT", "CONSTANT_TYPE_ASSIGNABLE", "CPINDEX", "CPOOL", "CTORDECL", "CharEscapeSequence", "CharUnicodeEscapeSequence", "Code", "Constant", "Constant_type", "DATE", "DEFAULT", "DOT", "DOUBLE", "DOUBLELITERAL", "DefaultValue", "Deprecated", "DoubleSuffix", "ETENTRY", "ETHEADER", "EXTENDS", "EnclosingMethod", "EscapeSequence", "ExceptionTable", "Exceptions", "Exponent", "FALSE", "FIELDDECL", "FIELDVALUE", "FINAL", "FLOAT", "FLOATLITERAL", "Flag", "FloatSuffix", "GENERICDESC", "HASH", "HexDigit", "HexDigits", "HexPrefix", "IDENTIFIER", "IMPLEMENTS", "INFODATA1", "INFODATA2", "INSTRUCTION", "INT", "INTERFACE", "INTERNALTYPE", "INTLITERAL", "InnerClasses", "IntDigit", "IntegerNumber", "LARGET", "LBRACE", "LBRACK", "LESST", "LONG", "LONGLITERAL", "LPAREN", "LVENTRY", "LVHEADER", "Letter", "LineNumberTable", "LocalVariableTable", "LocalVariableTypeTable", "LongSuffix", "METHODDECL", "MINUS", "MODIFIER", "Marker", "NATIVE", "NL", "NonIntegerNumber", "OPERAND", "Octal", "OctalEscape", "PARAMDESC", "PLUS", "PRIVATE", "PROTECTED", "PUBLIC", "PVI", "QUESTION", "QUOTE", "QualifiedType", "RBRACE", "RBRACK", "RETDESC", "RETVALUE", "RIAI", "RPAREN", "RuntimeInvisibleAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleParameterAnnotations", "SEMI", "SHORT", "SLASH", "SMENTRY", "SMHEADER", "SMTENTRY", "SMTHEADER", "SMTTYPES", "STANDINTOKEN", "STAR", "STATIC", "STATICCTORDECL", "STRICTFP", "STRINGLITERAL", "SUPER", "SWITCH", "SYNCHRONIZED", "Scala", "ScalaSig", "Signature", "SourceFile", "StackMap", "StackMapTable", "Synthetic", "THROWCLAUSE", "THROWS", "TPARAMETERS", "TRANSIENT", "TRUE", "TYPEARGS", "Throws", "UNDERSCORE", "UNITARGUMENTS", "UNITATTR", "UNITBODY", "UNITHEADER", "UNITNAME", "UnicodeEscapeSequence", "VARINFO", "VMODIFIER", "VOID", "VOLATILE", "VoidType", "WINDOWSPATH", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AND=5;
    public static final int ANNOTATIONBRACKETS=6;
    public static final int ARRAYBRACKS=7;
    public static final int ASSIGN=8;
    public static final int AnnotationAssign=9;
    public static final int AnnotationDefault=10;
    public static final int BANNOTATION=11;
    public static final int BOOLEAN=12;
    public static final int BOOLEANLITERAL=13;
    public static final int BYTE=14;
    public static final int BaseType=15;
    public static final int CEXTENDS=16;
    public static final int CFHEADER=17;
    public static final int CHAR=18;
    public static final int CHARLITERAL=19;
    public static final int CIMPLEMENTS=20;
    public static final int CLASS=21;
    public static final int CLASSDECL=22;
    public static final int CLASSFILE=23;
    public static final int COLON=24;
    public static final int COMMA=25;
    public static final int COMMENT=26;
    public static final int CONSTANT_TYPE_ASSIGNABLE=27;
    public static final int CPINDEX=28;
    public static final int CPOOL=29;
    public static final int CTORDECL=30;
    public static final int CharEscapeSequence=31;
    public static final int CharUnicodeEscapeSequence=32;
    public static final int Code=33;
    public static final int Constant=34;
    public static final int Constant_type=35;
    public static final int DATE=36;
    public static final int DEFAULT=37;
    public static final int DOT=38;
    public static final int DOUBLE=39;
    public static final int DOUBLELITERAL=40;
    public static final int DefaultValue=41;
    public static final int Deprecated=42;
    public static final int DoubleSuffix=43;
    public static final int ETENTRY=44;
    public static final int ETHEADER=45;
    public static final int EXTENDS=46;
    public static final int EnclosingMethod=47;
    public static final int EscapeSequence=48;
    public static final int ExceptionTable=49;
    public static final int Exceptions=50;
    public static final int Exponent=51;
    public static final int FALSE=52;
    public static final int FIELDDECL=53;
    public static final int FIELDVALUE=54;
    public static final int FINAL=55;
    public static final int FLOAT=56;
    public static final int FLOATLITERAL=57;
    public static final int Flag=58;
    public static final int FloatSuffix=59;
    public static final int GENERICDESC=60;
    public static final int HASH=61;
    public static final int HexDigit=62;
    public static final int HexDigits=63;
    public static final int HexPrefix=64;
    public static final int IDENTIFIER=65;
    public static final int IMPLEMENTS=66;
    public static final int INFODATA1=67;
    public static final int INFODATA2=68;
    public static final int INSTRUCTION=69;
    public static final int INT=70;
    public static final int INTERFACE=71;
    public static final int INTERNALTYPE=72;
    public static final int INTLITERAL=73;
    public static final int InnerClasses=74;
    public static final int IntDigit=75;
    public static final int IntegerNumber=76;
    public static final int LARGET=77;
    public static final int LBRACE=78;
    public static final int LBRACK=79;
    public static final int LESST=80;
    public static final int LONG=81;
    public static final int LONGLITERAL=82;
    public static final int LPAREN=83;
    public static final int LVENTRY=84;
    public static final int LVHEADER=85;
    public static final int Letter=86;
    public static final int LineNumberTable=87;
    public static final int LocalVariableTable=88;
    public static final int LocalVariableTypeTable=89;
    public static final int LongSuffix=90;
    public static final int METHODDECL=91;
    public static final int MINUS=92;
    public static final int MODIFIER=93;
    public static final int Marker=94;
    public static final int NATIVE=95;
    public static final int NL=96;
    public static final int NonIntegerNumber=97;
    public static final int OPERAND=98;
    public static final int Octal=99;
    public static final int OctalEscape=100;
    public static final int PARAMDESC=101;
    public static final int PLUS=102;
    public static final int PRIVATE=103;
    public static final int PROTECTED=104;
    public static final int PUBLIC=105;
    public static final int PVI=106;
    public static final int QUESTION=107;
    public static final int QUOTE=108;
    public static final int QualifiedType=109;
    public static final int RBRACE=110;
    public static final int RBRACK=111;
    public static final int RETDESC=112;
    public static final int RETVALUE=113;
    public static final int RIAI=114;
    public static final int RPAREN=115;
    public static final int RuntimeInvisibleAnnotations=116;
    public static final int RuntimeInvisibleParameterAnnotations=117;
    public static final int RuntimeVisibleAnnotations=118;
    public static final int RuntimeVisibleParameterAnnotations=119;
    public static final int SEMI=120;
    public static final int SHORT=121;
    public static final int SLASH=122;
    public static final int SMENTRY=123;
    public static final int SMHEADER=124;
    public static final int SMTENTRY=125;
    public static final int SMTHEADER=126;
    public static final int SMTTYPES=127;
    public static final int STANDINTOKEN=128;
    public static final int STAR=129;
    public static final int STATIC=130;
    public static final int STATICCTORDECL=131;
    public static final int STRICTFP=132;
    public static final int STRINGLITERAL=133;
    public static final int SUPER=134;
    public static final int SWITCH=135;
    public static final int SYNCHRONIZED=136;
    public static final int Scala=137;
    public static final int ScalaSig=138;
    public static final int Signature=139;
    public static final int SourceFile=140;
    public static final int StackMap=141;
    public static final int StackMapTable=142;
    public static final int Synthetic=143;
    public static final int THROWCLAUSE=144;
    public static final int THROWS=145;
    public static final int TPARAMETERS=146;
    public static final int TRANSIENT=147;
    public static final int TRUE=148;
    public static final int TYPEARGS=149;
    public static final int Throws=150;
    public static final int UNDERSCORE=151;
    public static final int UNITARGUMENTS=152;
    public static final int UNITATTR=153;
    public static final int UNITBODY=154;
    public static final int UNITHEADER=155;
    public static final int UNITNAME=156;
    public static final int UnicodeEscapeSequence=157;
    public static final int VARINFO=158;
    public static final int VMODIFIER=159;
    public static final int VOID=160;
    public static final int VOLATILE=161;
    public static final int VoidType=162;
    public static final int WINDOWSPATH=163;
    public static final int WS=164;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public JVMScramblingInformationGatherer(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public JVMScramblingInformationGatherer(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return JVMScramblingInformationGatherer.tokenNames; }
    public String getGrammarFileName() { return "D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g"; }


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


    public static class program_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:140:1: program : ( class_file )* ;
    public final JVMScramblingInformationGatherer.program_return program() throws RecognitionException {
        JVMScramblingInformationGatherer.program_return retval = new JVMScramblingInformationGatherer.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.class_file_return class_file1 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:140:9: ( ( class_file )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:140:11: ( class_file )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:140:11: ( class_file )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CLASSFILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:140:11: class_file
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_class_file_in_program70);
            	    class_file1=class_file();

            	    state._fsp--;

            	    adaptor.addChild(root_0, class_file1.getTree());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class class_file_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_file"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:142:1: class_file : ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) ;
    public final JVMScramblingInformationGatherer.class_file_return class_file() throws RecognitionException {
        JVMScramblingInformationGatherer.class_file_return retval = new JVMScramblingInformationGatherer.class_file_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASSFILE2=null;
        CommonTree CFHEADER3=null;
        JVMScramblingInformationGatherer.class_file_header_return class_file_header4 =null;

        JVMScramblingInformationGatherer.classDefinition_return classDefinition5 =null;


        CommonTree CLASSFILE2_tree=null;
        CommonTree CFHEADER3_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:143:3: ( ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:143:5: ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CLASSFILE2=(CommonTree)match(input,CLASSFILE,FOLLOW_CLASSFILE_in_class_file82); 
            CLASSFILE2_tree = (CommonTree)adaptor.dupNode(CLASSFILE2);


            root_1 = (CommonTree)adaptor.becomeRoot(CLASSFILE2_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CFHEADER3=(CommonTree)match(input,CFHEADER,FOLLOW_CFHEADER_in_class_file85); 
            CFHEADER3_tree = (CommonTree)adaptor.dupNode(CFHEADER3);


            root_2 = (CommonTree)adaptor.becomeRoot(CFHEADER3_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_class_file_header_in_class_file87);
            class_file_header4=class_file_header();

            state._fsp--;

            adaptor.addChild(root_2, class_file_header4.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_classDefinition_in_class_file90);
            classDefinition5=classDefinition();

            state._fsp--;

            adaptor.addChild(root_1, classDefinition5.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_file"


    public static class class_file_header_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_file_header"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:147:3: class_file_header : class_file_info modified_file_info checksum_file_info ( compiled_file_info )? ;
    public final JVMScramblingInformationGatherer.class_file_header_return class_file_header() throws RecognitionException {
        JVMScramblingInformationGatherer.class_file_header_return retval = new JVMScramblingInformationGatherer.class_file_header_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.class_file_info_return class_file_info6 =null;

        JVMScramblingInformationGatherer.modified_file_info_return modified_file_info7 =null;

        JVMScramblingInformationGatherer.checksum_file_info_return checksum_file_info8 =null;

        JVMScramblingInformationGatherer.compiled_file_info_return compiled_file_info9 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:148:5: ( class_file_info modified_file_info checksum_file_info ( compiled_file_info )? )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:148:7: class_file_info modified_file_info checksum_file_info ( compiled_file_info )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_class_file_info_in_class_file_header113);
            class_file_info6=class_file_info();

            state._fsp--;

            adaptor.addChild(root_0, class_file_info6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_modified_file_info_in_class_file_header119);
            modified_file_info7=modified_file_info();

            state._fsp--;

            adaptor.addChild(root_0, modified_file_info7.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_checksum_file_info_in_class_file_header125);
            checksum_file_info8=checksum_file_info();

            state._fsp--;

            adaptor.addChild(root_0, checksum_file_info8.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:151:5: ( compiled_file_info )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:151:5: compiled_file_info
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_compiled_file_info_in_class_file_header131);
                    compiled_file_info9=compiled_file_info();

                    state._fsp--;

                    adaptor.addChild(root_0, compiled_file_info9.getTree());


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_file_header"


    public static class class_file_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:153:1: class_file_info : ^( IDENTIFIER WINDOWSPATH ) ;
    public final JVMScramblingInformationGatherer.class_file_info_return class_file_info() throws RecognitionException {
        JVMScramblingInformationGatherer.class_file_info_return retval = new JVMScramblingInformationGatherer.class_file_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER10=null;
        CommonTree WINDOWSPATH11=null;

        CommonTree IDENTIFIER10_tree=null;
        CommonTree WINDOWSPATH11_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:154:3: ( ^( IDENTIFIER WINDOWSPATH ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:154:5: ^( IDENTIFIER WINDOWSPATH )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER10=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_file_info145); 
            IDENTIFIER10_tree = (CommonTree)adaptor.dupNode(IDENTIFIER10);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER10_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            WINDOWSPATH11=(CommonTree)match(input,WINDOWSPATH,FOLLOW_WINDOWSPATH_in_class_file_info147); 
            WINDOWSPATH11_tree = (CommonTree)adaptor.dupNode(WINDOWSPATH11);


            adaptor.addChild(root_1, WINDOWSPATH11_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_file_info"


    public static class modified_file_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modified_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:157:1: modified_file_info : ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER ) ;
    public final JVMScramblingInformationGatherer.modified_file_info_return modified_file_info() throws RecognitionException {
        JVMScramblingInformationGatherer.modified_file_info_return retval = new JVMScramblingInformationGatherer.modified_file_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER12=null;
        CommonTree IDENTIFIER13=null;
        CommonTree DATE14=null;
        CommonTree IDENTIFIER15=null;
        CommonTree INTLITERAL16=null;
        CommonTree IDENTIFIER17=null;

        CommonTree IDENTIFIER12_tree=null;
        CommonTree IDENTIFIER13_tree=null;
        CommonTree DATE14_tree=null;
        CommonTree IDENTIFIER15_tree=null;
        CommonTree INTLITERAL16_tree=null;
        CommonTree IDENTIFIER17_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:158:3: ( ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:158:5: ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER12=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info164); 
            IDENTIFIER12_tree = (CommonTree)adaptor.dupNode(IDENTIFIER12);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER12_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER13=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info166); 
            IDENTIFIER13_tree = (CommonTree)adaptor.dupNode(IDENTIFIER13);


            adaptor.addChild(root_1, IDENTIFIER13_tree);


            _last = (CommonTree)input.LT(1);
            DATE14=(CommonTree)match(input,DATE,FOLLOW_DATE_in_modified_file_info168); 
            DATE14_tree = (CommonTree)adaptor.dupNode(DATE14);


            adaptor.addChild(root_1, DATE14_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER15=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info170); 
            IDENTIFIER15_tree = (CommonTree)adaptor.dupNode(IDENTIFIER15);


            adaptor.addChild(root_1, IDENTIFIER15_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL16=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_modified_file_info172); 
            INTLITERAL16_tree = (CommonTree)adaptor.dupNode(INTLITERAL16);


            adaptor.addChild(root_1, INTLITERAL16_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER17=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info174); 
            IDENTIFIER17_tree = (CommonTree)adaptor.dupNode(IDENTIFIER17);


            adaptor.addChild(root_1, IDENTIFIER17_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modified_file_info"


    public static class checksum_file_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "checksum_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:161:1: checksum_file_info : ^( IDENTIFIER IDENTIFIER HexDigits ) ;
    public final JVMScramblingInformationGatherer.checksum_file_info_return checksum_file_info() throws RecognitionException {
        JVMScramblingInformationGatherer.checksum_file_info_return retval = new JVMScramblingInformationGatherer.checksum_file_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER18=null;
        CommonTree IDENTIFIER19=null;
        CommonTree HexDigits20=null;

        CommonTree IDENTIFIER18_tree=null;
        CommonTree IDENTIFIER19_tree=null;
        CommonTree HexDigits20_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:162:3: ( ^( IDENTIFIER IDENTIFIER HexDigits ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:162:5: ^( IDENTIFIER IDENTIFIER HexDigits )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER18=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info191); 
            IDENTIFIER18_tree = (CommonTree)adaptor.dupNode(IDENTIFIER18);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER18_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER19=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info193); 
            IDENTIFIER19_tree = (CommonTree)adaptor.dupNode(IDENTIFIER19);


            adaptor.addChild(root_1, IDENTIFIER19_tree);


            _last = (CommonTree)input.LT(1);
            HexDigits20=(CommonTree)match(input,HexDigits,FOLLOW_HexDigits_in_checksum_file_info195); 
            HexDigits20_tree = (CommonTree)adaptor.dupNode(HexDigits20);


            adaptor.addChild(root_1, HexDigits20_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "checksum_file_info"


    public static class compiled_file_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compiled_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:165:1: compiled_file_info : ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) ;
    public final JVMScramblingInformationGatherer.compiled_file_info_return compiled_file_info() throws RecognitionException {
        JVMScramblingInformationGatherer.compiled_file_info_return retval = new JVMScramblingInformationGatherer.compiled_file_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER21=null;
        CommonTree IDENTIFIER22=null;
        CommonTree STRINGLITERAL23=null;

        CommonTree IDENTIFIER21_tree=null;
        CommonTree IDENTIFIER22_tree=null;
        CommonTree STRINGLITERAL23_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:166:3: ( ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:166:5: ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER21=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info214); 
            IDENTIFIER21_tree = (CommonTree)adaptor.dupNode(IDENTIFIER21);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER21_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER22=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info216); 
            IDENTIFIER22_tree = (CommonTree)adaptor.dupNode(IDENTIFIER22);


            adaptor.addChild(root_1, IDENTIFIER22_tree);


            _last = (CommonTree)input.LT(1);
            STRINGLITERAL23=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_compiled_file_info218); 
            STRINGLITERAL23_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL23);


            adaptor.addChild(root_1, STRINGLITERAL23_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compiled_file_info"


    protected static class classDefinition_scope {
        String className;
    }
    protected Stack classDefinition_stack = new Stack();


    public static class classDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:173:1: classDefinition : ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) ;
    public final JVMScramblingInformationGatherer.classDefinition_return classDefinition() throws RecognitionException {
        classDefinition_stack.push(new classDefinition_scope());
        JVMScramblingInformationGatherer.classDefinition_return retval = new JVMScramblingInformationGatherer.classDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASSDECL24=null;
        CommonTree VMODIFIER25=null;
        CommonTree MODIFIER27=null;
        CommonTree TPARAMETERS30=null;
        CommonTree CEXTENDS32=null;
        CommonTree CIMPLEMENTS34=null;
        CommonTree UNITHEADER36=null;
        CommonTree CPOOL38=null;
        CommonTree UNITBODY40=null;
        JVMScramblingInformationGatherer.class_visual_modifier_return class_visual_modifier26 =null;

        JVMScramblingInformationGatherer.class_modifier_return class_modifier28 =null;

        JVMScramblingInformationGatherer.typeName_return typeName29 =null;

        JVMScramblingInformationGatherer.typeParameters_return typeParameters31 =null;

        JVMScramblingInformationGatherer.typeList_return typeList33 =null;

        JVMScramblingInformationGatherer.typeList_return typeList35 =null;

        JVMScramblingInformationGatherer.type_info_return type_info37 =null;

        JVMScramblingInformationGatherer.constant_pool_return constant_pool39 =null;

        JVMScramblingInformationGatherer.classBody_return classBody41 =null;


        CommonTree CLASSDECL24_tree=null;
        CommonTree VMODIFIER25_tree=null;
        CommonTree MODIFIER27_tree=null;
        CommonTree TPARAMETERS30_tree=null;
        CommonTree CEXTENDS32_tree=null;
        CommonTree CIMPLEMENTS34_tree=null;
        CommonTree UNITHEADER36_tree=null;
        CommonTree CPOOL38_tree=null;
        CommonTree UNITBODY40_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:3: ( ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:5: ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CLASSDECL24=(CommonTree)match(input,CLASSDECL,FOLLOW_CLASSDECL_in_classDefinition240); 
            CLASSDECL24_tree = (CommonTree)adaptor.dupNode(CLASSDECL24);


            root_1 = (CommonTree)adaptor.becomeRoot(CLASSDECL24_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER25=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_classDefinition244); 
            VMODIFIER25_tree = (CommonTree)adaptor.dupNode(VMODIFIER25);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER25_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:30: ( class_visual_modifier )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:30: class_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_class_visual_modifier_in_classDefinition246);
                        class_visual_modifier26=class_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, class_visual_modifier26.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MODIFIER27=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_classDefinition251); 
            MODIFIER27_tree = (CommonTree)adaptor.dupNode(MODIFIER27);


            root_2 = (CommonTree)adaptor.becomeRoot(MODIFIER27_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:65: ( class_modifier )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ABSTRACT||LA4_0==CLASS||LA4_0==FINAL||LA4_0==INTERFACE) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:65: class_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_class_modifier_in_classDefinition253);
                	    class_modifier28=class_modifier();

                	    state._fsp--;

                	    adaptor.addChild(root_2, class_modifier28.getTree());


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeName_in_classDefinition257);
            typeName29=typeName();

            state._fsp--;

            adaptor.addChild(root_1, typeName29.getTree());


            ((classDefinition_scope)classDefinition_stack.peek()).className = (typeName29!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(typeName29.start),input.getTreeAdaptor().getTokenStopIndex(typeName29.start))):null);

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TPARAMETERS30=(CommonTree)match(input,TPARAMETERS,FOLLOW_TPARAMETERS_in_classDefinition262); 
            TPARAMETERS30_tree = (CommonTree)adaptor.dupNode(TPARAMETERS30);


            root_2 = (CommonTree)adaptor.becomeRoot(TPARAMETERS30_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:153: ( typeParameters )?
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENTIFIER) ) {
                    alt5=1;
                }
                switch (alt5) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:153: typeParameters
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeParameters_in_classDefinition264);
                        typeParameters31=typeParameters();

                        state._fsp--;

                        adaptor.addChild(root_2, typeParameters31.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CEXTENDS32=(CommonTree)match(input,CEXTENDS,FOLLOW_CEXTENDS_in_classDefinition269); 
            CEXTENDS32_tree = (CommonTree)adaptor.dupNode(CEXTENDS32);


            root_2 = (CommonTree)adaptor.becomeRoot(CEXTENDS32_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:181: ( typeList )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOLEAN||LA6_0==BYTE||LA6_0==CHAR||LA6_0==DOUBLE||LA6_0==FLOAT||LA6_0==INT||LA6_0==LONG||LA6_0==SHORT||LA6_0==UNITNAME||LA6_0==VOID) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:181: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_classDefinition271);
                        typeList33=typeList();

                        state._fsp--;

                        adaptor.addChild(root_2, typeList33.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CIMPLEMENTS34=(CommonTree)match(input,CIMPLEMENTS,FOLLOW_CIMPLEMENTS_in_classDefinition276); 
            CIMPLEMENTS34_tree = (CommonTree)adaptor.dupNode(CIMPLEMENTS34);


            root_2 = (CommonTree)adaptor.becomeRoot(CIMPLEMENTS34_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:206: ( typeList )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLEAN||LA7_0==BYTE||LA7_0==CHAR||LA7_0==DOUBLE||LA7_0==FLOAT||LA7_0==INT||LA7_0==LONG||LA7_0==SHORT||LA7_0==UNITNAME||LA7_0==VOID) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:177:206: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_classDefinition278);
                        typeList35=typeList();

                        state._fsp--;

                        adaptor.addChild(root_2, typeList35.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITHEADER36=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_classDefinition299); 
            UNITHEADER36_tree = (CommonTree)adaptor.dupNode(UNITHEADER36);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER36_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_info_in_classDefinition301);
            type_info37=type_info();

            state._fsp--;

            adaptor.addChild(root_2, type_info37.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPOOL38=(CommonTree)match(input,CPOOL,FOLLOW_CPOOL_in_classDefinition321); 
            CPOOL38_tree = (CommonTree)adaptor.dupNode(CPOOL38);


            root_2 = (CommonTree)adaptor.becomeRoot(CPOOL38_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_constant_pool_in_classDefinition323);
            constant_pool39=constant_pool();

            state._fsp--;

            adaptor.addChild(root_2, constant_pool39.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITBODY40=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_classDefinition343); 
            UNITBODY40_tree = (CommonTree)adaptor.dupNode(UNITBODY40);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY40_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:180:28: ( classBody )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CTORDECL||LA8_0==FIELDDECL||LA8_0==METHODDECL||LA8_0==STATICCTORDECL) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:180:28: classBody
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_classBody_in_classDefinition345);
                        classBody41=classBody();

                        state._fsp--;

                        adaptor.addChild(root_2, classBody41.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            classDefinition_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "classDefinition"


    public static class class_visual_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:184:1: class_visual_modifier : PUBLIC ;
    public final JVMScramblingInformationGatherer.class_visual_modifier_return class_visual_modifier() throws RecognitionException {
        JVMScramblingInformationGatherer.class_visual_modifier_return retval = new JVMScramblingInformationGatherer.class_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PUBLIC42=null;

        CommonTree PUBLIC42_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:185:3: ( PUBLIC )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:185:5: PUBLIC
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            PUBLIC42=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier382); 
            PUBLIC42_tree = (CommonTree)adaptor.dupNode(PUBLIC42);


            adaptor.addChild(root_0, PUBLIC42_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_visual_modifier"


    public static class class_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:188:1: class_modifier : ( ABSTRACT | FINAL | INTERFACE | CLASS );
    public final JVMScramblingInformationGatherer.class_modifier_return class_modifier() throws RecognitionException {
        JVMScramblingInformationGatherer.class_modifier_return retval = new JVMScramblingInformationGatherer.class_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set43=null;

        CommonTree set43_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:189:3: ( ABSTRACT | FINAL | INTERFACE | CLASS )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set43=(CommonTree)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==CLASS||input.LA(1)==FINAL||input.LA(1)==INTERFACE ) {
                input.consume();
                set43_tree = (CommonTree)adaptor.dupNode(set43);


                adaptor.addChild(root_0, set43_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_modifier"


    public static class type_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:196:1: type_info : ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ ;
    public final JVMScramblingInformationGatherer.type_info_return type_info() throws RecognitionException {
        JVMScramblingInformationGatherer.type_info_return retval = new JVMScramblingInformationGatherer.type_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.sourcefile_info_return sourcefile_info44 =null;

        JVMScramblingInformationGatherer.minor_major_version_info_return minor_major_version_info45 =null;

        JVMScramblingInformationGatherer.flags_return flags46 =null;

        JVMScramblingInformationGatherer.scalaSig_info_return scalaSig_info47 =null;

        JVMScramblingInformationGatherer.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info48 =null;

        JVMScramblingInformationGatherer.innerclass_info_return innerclass_info49 =null;

        JVMScramblingInformationGatherer.enclosingMethod_return enclosingMethod50 =null;

        JVMScramblingInformationGatherer.signature_info_addition_return signature_info_addition51 =null;

        JVMScramblingInformationGatherer.deprecated_return deprecated52 =null;

        JVMScramblingInformationGatherer.synthetic_return synthetic53 =null;

        JVMScramblingInformationGatherer.scala_info_return scala_info54 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:197:3: ( ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:197:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:197:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            int cnt9=0;
            loop9:
            do {
                int alt9=12;
                switch ( input.LA(1) ) {
                case SourceFile:
                    {
                    alt9=1;
                    }
                    break;
                case IDENTIFIER:
                    {
                    alt9=2;
                    }
                    break;
                case Flag:
                    {
                    alt9=3;
                    }
                    break;
                case ScalaSig:
                    {
                    alt9=4;
                    }
                    break;
                case RuntimeVisibleAnnotations:
                    {
                    alt9=5;
                    }
                    break;
                case InnerClasses:
                    {
                    alt9=6;
                    }
                    break;
                case EnclosingMethod:
                    {
                    alt9=7;
                    }
                    break;
                case Signature:
                    {
                    alt9=8;
                    }
                    break;
                case Deprecated:
                    {
                    alt9=9;
                    }
                    break;
                case Synthetic:
                    {
                    alt9=10;
                    }
                    break;
                case Scala:
                    {
                    alt9=11;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:197:6: sourcefile_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sourcefile_info_in_type_info429);
            	    sourcefile_info44=sourcefile_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sourcefile_info44.getTree());


            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:198:5: minor_major_version_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_minor_major_version_info_in_type_info435);
            	    minor_major_version_info45=minor_major_version_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minor_major_version_info45.getTree());


            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:199:5: flags
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_flags_in_type_info441);
            	    flags46=flags();

            	    state._fsp--;

            	    adaptor.addChild(root_0, flags46.getTree());


            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:200:5: scalaSig_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_scalaSig_info_in_type_info447);
            	    scalaSig_info47=scalaSig_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, scalaSig_info47.getTree());


            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:201:5: runtimeVisibleAnnotations_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_type_info454);
            	    runtimeVisibleAnnotations_info48=runtimeVisibleAnnotations_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleAnnotations_info48.getTree());


            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:202:5: innerclass_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_innerclass_info_in_type_info460);
            	    innerclass_info49=innerclass_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, innerclass_info49.getTree());


            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:203:5: enclosingMethod
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_enclosingMethod_in_type_info466);
            	    enclosingMethod50=enclosingMethod();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enclosingMethod50.getTree());


            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:204:5: signature_info_addition
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_signature_info_addition_in_type_info472);
            	    signature_info_addition51=signature_info_addition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signature_info_addition51.getTree());


            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:205:5: deprecated
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_deprecated_in_type_info478);
            	    deprecated52=deprecated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, deprecated52.getTree());


            	    }
            	    break;
            	case 10 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:206:5: synthetic
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_synthetic_in_type_info484);
            	    synthetic53=synthetic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, synthetic53.getTree());


            	    }
            	    break;
            	case 11 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:207:5: scala_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_scala_info_in_type_info490);
            	    scala_info54=scala_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, scala_info54.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_info"


    public static class synthetic_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "synthetic"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:210:1: synthetic : ^( Synthetic BOOLEANLITERAL ) ;
    public final JVMScramblingInformationGatherer.synthetic_return synthetic() throws RecognitionException {
        JVMScramblingInformationGatherer.synthetic_return retval = new JVMScramblingInformationGatherer.synthetic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Synthetic55=null;
        CommonTree BOOLEANLITERAL56=null;

        CommonTree Synthetic55_tree=null;
        CommonTree BOOLEANLITERAL56_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:211:3: ( ^( Synthetic BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:211:5: ^( Synthetic BOOLEANLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Synthetic55=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_synthetic506); 
            Synthetic55_tree = (CommonTree)adaptor.dupNode(Synthetic55);


            root_1 = (CommonTree)adaptor.becomeRoot(Synthetic55_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            BOOLEANLITERAL56=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_synthetic508); 
            BOOLEANLITERAL56_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL56);


            adaptor.addChild(root_1, BOOLEANLITERAL56_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "synthetic"


    public static class deprecated_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deprecated"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:214:1: deprecated : ^( Deprecated BOOLEANLITERAL ) ;
    public final JVMScramblingInformationGatherer.deprecated_return deprecated() throws RecognitionException {
        JVMScramblingInformationGatherer.deprecated_return retval = new JVMScramblingInformationGatherer.deprecated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Deprecated57=null;
        CommonTree BOOLEANLITERAL58=null;

        CommonTree Deprecated57_tree=null;
        CommonTree BOOLEANLITERAL58_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:215:3: ( ^( Deprecated BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:215:5: ^( Deprecated BOOLEANLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Deprecated57=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_deprecated523); 
            Deprecated57_tree = (CommonTree)adaptor.dupNode(Deprecated57);


            root_1 = (CommonTree)adaptor.becomeRoot(Deprecated57_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            BOOLEANLITERAL58=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_deprecated525); 
            BOOLEANLITERAL58_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL58);


            adaptor.addChild(root_1, BOOLEANLITERAL58_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "deprecated"


    public static class enclosingMethod_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enclosingMethod"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:218:1: enclosingMethod : ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) ;
    public final JVMScramblingInformationGatherer.enclosingMethod_return enclosingMethod() throws RecognitionException {
        JVMScramblingInformationGatherer.enclosingMethod_return retval = new JVMScramblingInformationGatherer.enclosingMethod_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EnclosingMethod59=null;
        CommonTree CPINDEX60=null;
        CommonTree DOT61=null;
        CommonTree CPINDEX62=null;

        CommonTree EnclosingMethod59_tree=null;
        CommonTree CPINDEX60_tree=null;
        CommonTree DOT61_tree=null;
        CommonTree CPINDEX62_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:219:3: ( ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:219:5: ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EnclosingMethod59=(CommonTree)match(input,EnclosingMethod,FOLLOW_EnclosingMethod_in_enclosingMethod540); 
            EnclosingMethod59_tree = (CommonTree)adaptor.dupNode(EnclosingMethod59);


            root_1 = (CommonTree)adaptor.becomeRoot(EnclosingMethod59_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX60=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod542); 
            CPINDEX60_tree = (CommonTree)adaptor.dupNode(CPINDEX60);


            adaptor.addChild(root_1, CPINDEX60_tree);


            _last = (CommonTree)input.LT(1);
            DOT61=(CommonTree)match(input,DOT,FOLLOW_DOT_in_enclosingMethod544); 
            DOT61_tree = (CommonTree)adaptor.dupNode(DOT61);


            adaptor.addChild(root_1, DOT61_tree);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:219:35: ( CPINDEX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CPINDEX) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:219:35: CPINDEX
                    {
                    _last = (CommonTree)input.LT(1);
                    CPINDEX62=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod546); 
                    CPINDEX62_tree = (CommonTree)adaptor.dupNode(CPINDEX62);


                    adaptor.addChild(root_1, CPINDEX62_tree);


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enclosingMethod"


    public static class sourcefile_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sourcefile_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:222:1: sourcefile_info : ^( SourceFile STRINGLITERAL ) ;
    public final JVMScramblingInformationGatherer.sourcefile_info_return sourcefile_info() throws RecognitionException {
        JVMScramblingInformationGatherer.sourcefile_info_return retval = new JVMScramblingInformationGatherer.sourcefile_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SourceFile63=null;
        CommonTree STRINGLITERAL64=null;

        CommonTree SourceFile63_tree=null;
        CommonTree STRINGLITERAL64_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:223:3: ( ^( SourceFile STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:223:5: ^( SourceFile STRINGLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SourceFile63=(CommonTree)match(input,SourceFile,FOLLOW_SourceFile_in_sourcefile_info563); 
            SourceFile63_tree = (CommonTree)adaptor.dupNode(SourceFile63);


            root_1 = (CommonTree)adaptor.becomeRoot(SourceFile63_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            STRINGLITERAL64=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_sourcefile_info565); 
            STRINGLITERAL64_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL64);


            adaptor.addChild(root_1, STRINGLITERAL64_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sourcefile_info"


    public static class scalaSig_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scalaSig_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:226:1: scalaSig_info : ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) ;
    public final JVMScramblingInformationGatherer.scalaSig_info_return scalaSig_info() throws RecognitionException {
        JVMScramblingInformationGatherer.scalaSig_info_return retval = new JVMScramblingInformationGatherer.scalaSig_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ScalaSig65=null;
        CommonTree IDENTIFIER66=null;
        CommonTree ASSIGN67=null;
        CommonTree INTLITERAL68=null;
        CommonTree INTLITERAL69=null;
        CommonTree INTLITERAL70=null;
        CommonTree INTLITERAL71=null;

        CommonTree ScalaSig65_tree=null;
        CommonTree IDENTIFIER66_tree=null;
        CommonTree ASSIGN67_tree=null;
        CommonTree INTLITERAL68_tree=null;
        CommonTree INTLITERAL69_tree=null;
        CommonTree INTLITERAL70_tree=null;
        CommonTree INTLITERAL71_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:227:3: ( ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:227:5: ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ScalaSig65=(CommonTree)match(input,ScalaSig,FOLLOW_ScalaSig_in_scalaSig_info580); 
            ScalaSig65_tree = (CommonTree)adaptor.dupNode(ScalaSig65);


            root_1 = (CommonTree)adaptor.becomeRoot(ScalaSig65_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER66=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scalaSig_info594); 
            IDENTIFIER66_tree = (CommonTree)adaptor.dupNode(IDENTIFIER66);


            adaptor.addChild(root_1, IDENTIFIER66_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN67=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_scalaSig_info596); 
            ASSIGN67_tree = (CommonTree)adaptor.dupNode(ASSIGN67);


            adaptor.addChild(root_1, ASSIGN67_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL68=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info598); 
            INTLITERAL68_tree = (CommonTree)adaptor.dupNode(INTLITERAL68);


            adaptor.addChild(root_1, INTLITERAL68_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL69=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info614); 
            INTLITERAL69_tree = (CommonTree)adaptor.dupNode(INTLITERAL69);


            adaptor.addChild(root_1, INTLITERAL69_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL70=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info616); 
            INTLITERAL70_tree = (CommonTree)adaptor.dupNode(INTLITERAL70);


            adaptor.addChild(root_1, INTLITERAL70_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL71=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info618); 
            INTLITERAL71_tree = (CommonTree)adaptor.dupNode(INTLITERAL71);


            adaptor.addChild(root_1, INTLITERAL71_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scalaSig_info"


    public static class scala_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scala_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:232:1: scala_info : ^( Scala IDENTIFIER ASSIGN INTLITERAL ) ;
    public final JVMScramblingInformationGatherer.scala_info_return scala_info() throws RecognitionException {
        JVMScramblingInformationGatherer.scala_info_return retval = new JVMScramblingInformationGatherer.scala_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Scala72=null;
        CommonTree IDENTIFIER73=null;
        CommonTree ASSIGN74=null;
        CommonTree INTLITERAL75=null;

        CommonTree Scala72_tree=null;
        CommonTree IDENTIFIER73_tree=null;
        CommonTree ASSIGN74_tree=null;
        CommonTree INTLITERAL75_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:233:3: ( ^( Scala IDENTIFIER ASSIGN INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:233:5: ^( Scala IDENTIFIER ASSIGN INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Scala72=(CommonTree)match(input,Scala,FOLLOW_Scala_in_scala_info633); 
            Scala72_tree = (CommonTree)adaptor.dupNode(Scala72);


            root_1 = (CommonTree)adaptor.becomeRoot(Scala72_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER73=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scala_info635); 
            IDENTIFIER73_tree = (CommonTree)adaptor.dupNode(IDENTIFIER73);


            adaptor.addChild(root_1, IDENTIFIER73_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN74=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_scala_info637); 
            ASSIGN74_tree = (CommonTree)adaptor.dupNode(ASSIGN74);


            adaptor.addChild(root_1, ASSIGN74_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL75=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scala_info639); 
            INTLITERAL75_tree = (CommonTree)adaptor.dupNode(INTLITERAL75);


            adaptor.addChild(root_1, INTLITERAL75_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scala_info"


    public static class signature_info_addition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signature_info_addition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:236:1: signature_info_addition : ^( Signature ( CPINDEX )? ) ;
    public final JVMScramblingInformationGatherer.signature_info_addition_return signature_info_addition() throws RecognitionException {
        JVMScramblingInformationGatherer.signature_info_addition_return retval = new JVMScramblingInformationGatherer.signature_info_addition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature76=null;
        CommonTree CPINDEX77=null;

        CommonTree Signature76_tree=null;
        CommonTree CPINDEX77_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:237:3: ( ^( Signature ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:237:5: ^( Signature ( CPINDEX )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature76=(CommonTree)match(input,Signature,FOLLOW_Signature_in_signature_info_addition657); 
            Signature76_tree = (CommonTree)adaptor.dupNode(Signature76);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature76_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:237:17: ( CPINDEX )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CPINDEX) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:237:17: CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        CPINDEX77=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_signature_info_addition659); 
                        CPINDEX77_tree = (CommonTree)adaptor.dupNode(CPINDEX77);


                        adaptor.addChild(root_1, CPINDEX77_tree);


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signature_info_addition"


    public static class innerclass_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "innerclass_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:240:1: innerclass_info : ^( InnerClasses ( innerclass_info_line )+ ) ;
    public final JVMScramblingInformationGatherer.innerclass_info_return innerclass_info() throws RecognitionException {
        JVMScramblingInformationGatherer.innerclass_info_return retval = new JVMScramblingInformationGatherer.innerclass_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree InnerClasses78=null;
        JVMScramblingInformationGatherer.innerclass_info_line_return innerclass_info_line79 =null;


        CommonTree InnerClasses78_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:241:3: ( ^( InnerClasses ( innerclass_info_line )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:241:5: ^( InnerClasses ( innerclass_info_line )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            InnerClasses78=(CommonTree)match(input,InnerClasses,FOLLOW_InnerClasses_in_innerclass_info675); 
            InnerClasses78_tree = (CommonTree)adaptor.dupNode(InnerClasses78);


            root_1 = (CommonTree)adaptor.becomeRoot(InnerClasses78_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:241:20: ( innerclass_info_line )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==VMODIFIER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:241:20: innerclass_info_line
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_innerclass_info_line_in_innerclass_info677);
            	    innerclass_info_line79=innerclass_info_line();

            	    state._fsp--;

            	    adaptor.addChild(root_1, innerclass_info_line79.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "innerclass_info"


    public static class innerclass_info_line_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "innerclass_info_line"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:244:1: innerclass_info_line : ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data ;
    public final JVMScramblingInformationGatherer.innerclass_info_line_return innerclass_info_line() throws RecognitionException {
        JVMScramblingInformationGatherer.innerclass_info_line_return retval = new JVMScramblingInformationGatherer.innerclass_info_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VMODIFIER80=null;
        CommonTree MODIFIER82=null;
        JVMScramblingInformationGatherer.method_visual_modifier_return method_visual_modifier81 =null;

        JVMScramblingInformationGatherer.method_modifier_return method_modifier83 =null;

        JVMScramblingInformationGatherer.innerclass_info_data_return innerclass_info_data84 =null;


        CommonTree VMODIFIER80_tree=null;
        CommonTree MODIFIER82_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:245:3: ( ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:245:6: ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER80=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_innerclass_info_line696); 
            VMODIFIER80_tree = (CommonTree)adaptor.dupNode(VMODIFIER80);


            root_1 = (CommonTree)adaptor.becomeRoot(VMODIFIER80_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:245:18: ( method_visual_modifier )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= PRIVATE && LA13_0 <= PUBLIC)) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:245:18: method_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_method_visual_modifier_in_innerclass_info_line698);
                        method_visual_modifier81=method_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_1, method_visual_modifier81.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MODIFIER82=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_innerclass_info_line703); 
            MODIFIER82_tree = (CommonTree)adaptor.dupNode(MODIFIER82);


            root_1 = (CommonTree)adaptor.becomeRoot(MODIFIER82_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:245:54: ( method_modifier )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ABSTRACT||LA14_0==FINAL||LA14_0==NATIVE||LA14_0==STATIC||LA14_0==STRICTFP||LA14_0==SYNCHRONIZED) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:245:54: method_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_method_modifier_in_innerclass_info_line705);
                	    method_modifier83=method_modifier();

                	    state._fsp--;

                	    adaptor.addChild(root_1, method_modifier83.getTree());


                	    }
                	    break;

                	default :
                	    break loop14;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_innerclass_info_data_in_innerclass_info_line709);
            innerclass_info_data84=innerclass_info_data();

            state._fsp--;

            adaptor.addChild(root_0, innerclass_info_data84.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "innerclass_info_line"


    public static class innerclass_info_data_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "innerclass_info_data"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:248:1: innerclass_info_data : ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) ) ;
    public final JVMScramblingInformationGatherer.innerclass_info_data_return innerclass_info_data() throws RecognitionException {
        JVMScramblingInformationGatherer.innerclass_info_data_return retval = new JVMScramblingInformationGatherer.innerclass_info_data_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX85=null;
        CommonTree INFODATA186=null;
        CommonTree ASSIGN87=null;
        CommonTree CPINDEX88=null;
        CommonTree INFODATA289=null;
        CommonTree IDENTIFIER90=null;
        CommonTree CPINDEX91=null;

        CommonTree CPINDEX85_tree=null;
        CommonTree INFODATA186_tree=null;
        CommonTree ASSIGN87_tree=null;
        CommonTree CPINDEX88_tree=null;
        CommonTree INFODATA289_tree=null;
        CommonTree IDENTIFIER90_tree=null;
        CommonTree CPINDEX91_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:249:3: ( ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:249:5: ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX85=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data723); 
            CPINDEX85_tree = (CommonTree)adaptor.dupNode(CPINDEX85);


            root_1 = (CommonTree)adaptor.becomeRoot(CPINDEX85_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INFODATA186=(CommonTree)match(input,INFODATA1,FOLLOW_INFODATA1_in_innerclass_info_data726); 
            INFODATA186_tree = (CommonTree)adaptor.dupNode(INFODATA186);


            root_2 = (CommonTree)adaptor.becomeRoot(INFODATA186_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:249:27: ( ASSIGN CPINDEX )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ASSIGN) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:249:28: ASSIGN CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        ASSIGN87=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_innerclass_info_data729); 
                        ASSIGN87_tree = (CommonTree)adaptor.dupNode(ASSIGN87);


                        adaptor.addChild(root_2, ASSIGN87_tree);


                        _last = (CommonTree)input.LT(1);
                        CPINDEX88=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data731); 
                        CPINDEX88_tree = (CommonTree)adaptor.dupNode(CPINDEX88);


                        adaptor.addChild(root_2, CPINDEX88_tree);


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INFODATA289=(CommonTree)match(input,INFODATA2,FOLLOW_INFODATA2_in_innerclass_info_data737); 
            INFODATA289_tree = (CommonTree)adaptor.dupNode(INFODATA289);


            root_2 = (CommonTree)adaptor.becomeRoot(INFODATA289_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:249:58: ( IDENTIFIER CPINDEX )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==IDENTIFIER) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:249:59: IDENTIFIER CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        IDENTIFIER90=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_data740); 
                        IDENTIFIER90_tree = (CommonTree)adaptor.dupNode(IDENTIFIER90);


                        adaptor.addChild(root_2, IDENTIFIER90_tree);


                        _last = (CommonTree)input.LT(1);
                        CPINDEX91=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data742); 
                        CPINDEX91_tree = (CommonTree)adaptor.dupNode(CPINDEX91);


                        adaptor.addChild(root_2, CPINDEX91_tree);


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "innerclass_info_data"


    public static class minor_major_version_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minor_major_version_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:252:1: minor_major_version_info : ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) ;
    public final JVMScramblingInformationGatherer.minor_major_version_info_return minor_major_version_info() throws RecognitionException {
        JVMScramblingInformationGatherer.minor_major_version_info_return retval = new JVMScramblingInformationGatherer.minor_major_version_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER92=null;
        CommonTree IDENTIFIER93=null;
        CommonTree COLON94=null;
        CommonTree INTLITERAL95=null;

        CommonTree IDENTIFIER92_tree=null;
        CommonTree IDENTIFIER93_tree=null;
        CommonTree COLON94_tree=null;
        CommonTree INTLITERAL95_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:253:3: ( ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:253:5: ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER92=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info764); 
            IDENTIFIER92_tree = (CommonTree)adaptor.dupNode(IDENTIFIER92);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER92_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER93=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info766); 
            IDENTIFIER93_tree = (CommonTree)adaptor.dupNode(IDENTIFIER93);


            adaptor.addChild(root_1, IDENTIFIER93_tree);


            _last = (CommonTree)input.LT(1);
            COLON94=(CommonTree)match(input,COLON,FOLLOW_COLON_in_minor_major_version_info768); 
            COLON94_tree = (CommonTree)adaptor.dupNode(COLON94);


            adaptor.addChild(root_1, COLON94_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL95=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_minor_major_version_info770); 
            INTLITERAL95_tree = (CommonTree)adaptor.dupNode(INTLITERAL95);


            adaptor.addChild(root_1, INTLITERAL95_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "minor_major_version_info"


    public static class flags_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flags"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:256:1: flags : ^( Flag ( accessFlagList )? ) ;
    public final JVMScramblingInformationGatherer.flags_return flags() throws RecognitionException {
        JVMScramblingInformationGatherer.flags_return retval = new JVMScramblingInformationGatherer.flags_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Flag96=null;
        JVMScramblingInformationGatherer.accessFlagList_return accessFlagList97 =null;


        CommonTree Flag96_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:257:3: ( ^( Flag ( accessFlagList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:257:5: ^( Flag ( accessFlagList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Flag96=(CommonTree)match(input,Flag,FOLLOW_Flag_in_flags791); 
            Flag96_tree = (CommonTree)adaptor.dupNode(Flag96);


            root_1 = (CommonTree)adaptor.becomeRoot(Flag96_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:257:12: ( accessFlagList )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IDENTIFIER||LA17_0==INTLITERAL) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:257:12: accessFlagList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_accessFlagList_in_flags793);
                        accessFlagList97=accessFlagList();

                        state._fsp--;

                        adaptor.addChild(root_1, accessFlagList97.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "flags"


    public static class accessFlagList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "accessFlagList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:260:1: accessFlagList : ( flagType )+ ;
    public final JVMScramblingInformationGatherer.accessFlagList_return accessFlagList() throws RecognitionException {
        JVMScramblingInformationGatherer.accessFlagList_return retval = new JVMScramblingInformationGatherer.accessFlagList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.flagType_return flagType98 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:261:3: ( ( flagType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:261:5: ( flagType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:261:5: ( flagType )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENTIFIER||LA18_0==INTLITERAL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:261:5: flagType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_flagType_in_accessFlagList810);
            	    flagType98=flagType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, flagType98.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "accessFlagList"


    public static class flagType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flagType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:264:1: flagType : (id= IDENTIFIER | INTLITERAL );
    public final JVMScramblingInformationGatherer.flagType_return flagType() throws RecognitionException {
        JVMScramblingInformationGatherer.flagType_return retval = new JVMScramblingInformationGatherer.flagType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree id=null;
        CommonTree INTLITERAL99=null;

        CommonTree id_tree=null;
        CommonTree INTLITERAL99_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:265:3: (id= IDENTIFIER | INTLITERAL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER) ) {
                alt19=1;
            }
            else if ( (LA19_0==INTLITERAL) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:265:5: id= IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_flagType826); 
                    id_tree = (CommonTree)adaptor.dupNode(id);


                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:266:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL99=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_flagType832); 
                    INTLITERAL99_tree = (CommonTree)adaptor.dupNode(INTLITERAL99);


                    adaptor.addChild(root_0, INTLITERAL99_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "flagType"


    public static class runtimeVisibleAnnotations_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleAnnotations_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:273:1: runtimeVisibleAnnotations_info : ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) ;
    public final JVMScramblingInformationGatherer.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        JVMScramblingInformationGatherer.runtimeVisibleAnnotations_info_return retval = new JVMScramblingInformationGatherer.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeVisibleAnnotations100=null;
        JVMScramblingInformationGatherer.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem101 =null;


        CommonTree RuntimeVisibleAnnotations100_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:274:3: ( ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:274:5: ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeVisibleAnnotations100=(CommonTree)match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info853); 
            RuntimeVisibleAnnotations100_tree = (CommonTree)adaptor.dupNode(RuntimeVisibleAnnotations100);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeVisibleAnnotations100_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:274:33: ( runtimeVisibleAnnotationsItem )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==CPINDEX) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:274:33: runtimeVisibleAnnotationsItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info855);
            	    runtimeVisibleAnnotationsItem101=runtimeVisibleAnnotationsItem();

            	    state._fsp--;

            	    adaptor.addChild(root_1, runtimeVisibleAnnotationsItem101.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeVisibleAnnotations_info"


    public static class runtimeVisibleAnnotationsItem_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleAnnotationsItem"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:276:1: runtimeVisibleAnnotationsItem : ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMScramblingInformationGatherer.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        JVMScramblingInformationGatherer.runtimeVisibleAnnotationsItem_return retval = new JVMScramblingInformationGatherer.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX102=null;
        JVMScramblingInformationGatherer.pc_return pc103 =null;

        JVMScramblingInformationGatherer.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList104 =null;


        CommonTree CPINDEX102_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:277:3: ( ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:277:5: ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX102=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem870); 
            CPINDEX102_tree = (CommonTree)adaptor.dupNode(CPINDEX102);


            root_1 = (CommonTree)adaptor.becomeRoot(CPINDEX102_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem872);
            pc103=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc103.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:277:18: ( runtimeVisibleAnnotationAssignList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ASSIGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:277:18: runtimeVisibleAnnotationAssignList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem874);
                    runtimeVisibleAnnotationAssignList104=runtimeVisibleAnnotationAssignList();

                    state._fsp--;

                    adaptor.addChild(root_1, runtimeVisibleAnnotationAssignList104.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeVisibleAnnotationsItem"


    public static class runtimeVisibleAnnotationAssignList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleAnnotationAssignList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:279:1: runtimeVisibleAnnotationAssignList : ( annotationAssign )+ ;
    public final JVMScramblingInformationGatherer.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        JVMScramblingInformationGatherer.runtimeVisibleAnnotationAssignList_return retval = new JVMScramblingInformationGatherer.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.annotationAssign_return annotationAssign105 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:280:3: ( ( annotationAssign )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:280:5: ( annotationAssign )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:280:5: ( annotationAssign )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ASSIGN) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:280:5: annotationAssign
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList888);
            	    annotationAssign105=annotationAssign();

            	    state._fsp--;

            	    adaptor.addChild(root_0, annotationAssign105.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeVisibleAnnotationAssignList"


    public static class annotationAssign_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationAssign"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:282:1: annotationAssign : ^( ASSIGN CPINDEX annotationValue ) ;
    public final JVMScramblingInformationGatherer.annotationAssign_return annotationAssign() throws RecognitionException {
        JVMScramblingInformationGatherer.annotationAssign_return retval = new JVMScramblingInformationGatherer.annotationAssign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN106=null;
        CommonTree CPINDEX107=null;
        JVMScramblingInformationGatherer.annotationValue_return annotationValue108 =null;


        CommonTree ASSIGN106_tree=null;
        CommonTree CPINDEX107_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:283:3: ( ^( ASSIGN CPINDEX annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:283:5: ^( ASSIGN CPINDEX annotationValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN106=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign902); 
            ASSIGN106_tree = (CommonTree)adaptor.dupNode(ASSIGN106);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN106_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX107=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign904); 
            CPINDEX107_tree = (CommonTree)adaptor.dupNode(CPINDEX107);


            adaptor.addChild(root_1, CPINDEX107_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationValue_in_annotationAssign906);
            annotationValue108=annotationValue();

            state._fsp--;

            adaptor.addChild(root_1, annotationValue108.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationAssign"


    public static class annotationValue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:285:1: annotationValue : ( brackedAnnotationAssign | AnnotationAssign );
    public final JVMScramblingInformationGatherer.annotationValue_return annotationValue() throws RecognitionException {
        JVMScramblingInformationGatherer.annotationValue_return retval = new JVMScramblingInformationGatherer.annotationValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationAssign110=null;
        JVMScramblingInformationGatherer.brackedAnnotationAssign_return brackedAnnotationAssign109 =null;


        CommonTree AnnotationAssign110_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:286:3: ( brackedAnnotationAssign | AnnotationAssign )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ANNOTATIONBRACKETS) ) {
                alt23=1;
            }
            else if ( (LA23_0==AnnotationAssign) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:286:5: brackedAnnotationAssign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationValue919);
                    brackedAnnotationAssign109=brackedAnnotationAssign();

                    state._fsp--;

                    adaptor.addChild(root_0, brackedAnnotationAssign109.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:287:5: AnnotationAssign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    AnnotationAssign110=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationValue926); 
                    AnnotationAssign110_tree = (CommonTree)adaptor.dupNode(AnnotationAssign110);


                    adaptor.addChild(root_0, AnnotationAssign110_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationValue"


    public static class brackedAnnotationAssign_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackedAnnotationAssign"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:289:1: brackedAnnotationAssign : ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? ) ;
    public final JVMScramblingInformationGatherer.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        JVMScramblingInformationGatherer.brackedAnnotationAssign_return retval = new JVMScramblingInformationGatherer.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ANNOTATIONBRACKETS111=null;
        JVMScramblingInformationGatherer.brackedAnnotationAssignList_return brackedAnnotationAssignList112 =null;


        CommonTree ANNOTATIONBRACKETS111_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:290:3: ( ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:290:5: ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ANNOTATIONBRACKETS111=(CommonTree)match(input,ANNOTATIONBRACKETS,FOLLOW_ANNOTATIONBRACKETS_in_brackedAnnotationAssign939); 
            ANNOTATIONBRACKETS111_tree = (CommonTree)adaptor.dupNode(ANNOTATIONBRACKETS111);


            root_1 = (CommonTree)adaptor.becomeRoot(ANNOTATIONBRACKETS111_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:290:26: ( brackedAnnotationAssignList )?
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AnnotationAssign) ) {
                    alt24=1;
                }
                switch (alt24) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:290:26: brackedAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign941);
                        brackedAnnotationAssignList112=brackedAnnotationAssignList();

                        state._fsp--;

                        adaptor.addChild(root_1, brackedAnnotationAssignList112.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "brackedAnnotationAssign"


    public static class brackedAnnotationAssignList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackedAnnotationAssignList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:292:1: brackedAnnotationAssignList : ( brackedAnnotationAssignValue )+ ;
    public final JVMScramblingInformationGatherer.brackedAnnotationAssignList_return brackedAnnotationAssignList() throws RecognitionException {
        JVMScramblingInformationGatherer.brackedAnnotationAssignList_return retval = new JVMScramblingInformationGatherer.brackedAnnotationAssignList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.brackedAnnotationAssignValue_return brackedAnnotationAssignValue113 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:293:3: ( ( brackedAnnotationAssignValue )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:293:5: ( brackedAnnotationAssignValue )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:293:5: ( brackedAnnotationAssignValue )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AnnotationAssign) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:293:5: brackedAnnotationAssignValue
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList955);
            	    brackedAnnotationAssignValue113=brackedAnnotationAssignValue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, brackedAnnotationAssignValue113.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "brackedAnnotationAssignList"


    public static class brackedAnnotationAssignValue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackedAnnotationAssignValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:295:1: brackedAnnotationAssignValue : ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMScramblingInformationGatherer.brackedAnnotationAssignValue_return brackedAnnotationAssignValue() throws RecognitionException {
        JVMScramblingInformationGatherer.brackedAnnotationAssignValue_return retval = new JVMScramblingInformationGatherer.brackedAnnotationAssignValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationAssign114=null;
        JVMScramblingInformationGatherer.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList115 =null;


        CommonTree AnnotationAssign114_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:296:3: ( ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:296:5: ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AnnotationAssign114=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue969); 
            AnnotationAssign114_tree = (CommonTree)adaptor.dupNode(AnnotationAssign114);


            root_1 = (CommonTree)adaptor.becomeRoot(AnnotationAssign114_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:296:24: ( runtimeVisibleAnnotationAssignList )?
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ASSIGN) ) {
                    alt26=1;
                }
                switch (alt26) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:296:24: runtimeVisibleAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue971);
                        runtimeVisibleAnnotationAssignList115=runtimeVisibleAnnotationAssignList();

                        state._fsp--;

                        adaptor.addChild(root_1, runtimeVisibleAnnotationAssignList115.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "brackedAnnotationAssignValue"


    public static class runtimeVisibleParameterAnnotations_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleParameterAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:298:1: runtimeVisibleParameterAnnotations : ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMScramblingInformationGatherer.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations() throws RecognitionException {
        JVMScramblingInformationGatherer.runtimeVisibleParameterAnnotations_return retval = new JVMScramblingInformationGatherer.runtimeVisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeVisibleParameterAnnotations116=null;
        JVMScramblingInformationGatherer.parameterVisibilityInfo_return parameterVisibilityInfo117 =null;


        CommonTree RuntimeVisibleParameterAnnotations116_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:299:3: ( ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:299:5: ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeVisibleParameterAnnotations116=(CommonTree)match(input,RuntimeVisibleParameterAnnotations,FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations986); 
            RuntimeVisibleParameterAnnotations116_tree = (CommonTree)adaptor.dupNode(RuntimeVisibleParameterAnnotations116);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeVisibleParameterAnnotations116_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:299:42: ( parameterVisibilityInfo )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==PVI) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:299:42: parameterVisibilityInfo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations988);
            	    parameterVisibilityInfo117=parameterVisibilityInfo();

            	    state._fsp--;

            	    adaptor.addChild(root_1, parameterVisibilityInfo117.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeVisibleParameterAnnotations"


    public static class runtimeInvisibleParameterAnnotations_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeInvisibleParameterAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:301:1: runtimeInvisibleParameterAnnotations : ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMScramblingInformationGatherer.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations() throws RecognitionException {
        JVMScramblingInformationGatherer.runtimeInvisibleParameterAnnotations_return retval = new JVMScramblingInformationGatherer.runtimeInvisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeInvisibleParameterAnnotations118=null;
        JVMScramblingInformationGatherer.parameterVisibilityInfo_return parameterVisibilityInfo119 =null;


        CommonTree RuntimeInvisibleParameterAnnotations118_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:302:3: ( ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:302:5: ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeInvisibleParameterAnnotations118=(CommonTree)match(input,RuntimeInvisibleParameterAnnotations,FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1003); 
            RuntimeInvisibleParameterAnnotations118_tree = (CommonTree)adaptor.dupNode(RuntimeInvisibleParameterAnnotations118);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeInvisibleParameterAnnotations118_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:302:44: ( parameterVisibilityInfo )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==PVI) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:302:44: parameterVisibilityInfo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1005);
            	    parameterVisibilityInfo119=parameterVisibilityInfo();

            	    state._fsp--;

            	    adaptor.addChild(root_1, parameterVisibilityInfo119.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeInvisibleParameterAnnotations"


    public static class runtimeInvisibleAnnotations_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeInvisibleAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:304:1: runtimeInvisibleAnnotations : ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) ;
    public final JVMScramblingInformationGatherer.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations() throws RecognitionException {
        JVMScramblingInformationGatherer.runtimeInvisibleAnnotations_return retval = new JVMScramblingInformationGatherer.runtimeInvisibleAnnotations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeInvisibleAnnotations120=null;
        JVMScramblingInformationGatherer.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem121 =null;


        CommonTree RuntimeInvisibleAnnotations120_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:305:3: ( ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:305:5: ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeInvisibleAnnotations120=(CommonTree)match(input,RuntimeInvisibleAnnotations,FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1020); 
            RuntimeInvisibleAnnotations120_tree = (CommonTree)adaptor.dupNode(RuntimeInvisibleAnnotations120);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeInvisibleAnnotations120_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:305:35: ( runtimeInvisibleAnnotationsItem )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RIAI) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:305:35: runtimeInvisibleAnnotationsItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1022);
            	    runtimeInvisibleAnnotationsItem121=runtimeInvisibleAnnotationsItem();

            	    state._fsp--;

            	    adaptor.addChild(root_1, runtimeInvisibleAnnotationsItem121.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeInvisibleAnnotations"


    public static class parameterVisibilityInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameterVisibilityInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:307:1: parameterVisibilityInfo : ^( PVI pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) ;
    public final JVMScramblingInformationGatherer.parameterVisibilityInfo_return parameterVisibilityInfo() throws RecognitionException {
        JVMScramblingInformationGatherer.parameterVisibilityInfo_return retval = new JVMScramblingInformationGatherer.parameterVisibilityInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PVI122=null;
        CommonTree IDENTIFIER124=null;
        JVMScramblingInformationGatherer.pc_return pc123 =null;

        JVMScramblingInformationGatherer.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem125 =null;


        CommonTree PVI122_tree=null;
        CommonTree IDENTIFIER124_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:308:3: ( ^( PVI pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:308:5: ^( PVI pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PVI122=(CommonTree)match(input,PVI,FOLLOW_PVI_in_parameterVisibilityInfo1037); 
            PVI122_tree = (CommonTree)adaptor.dupNode(PVI122);


            root_1 = (CommonTree)adaptor.becomeRoot(PVI122_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_parameterVisibilityInfo1039);
            pc123=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc123.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:308:14: ( IDENTIFIER )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENTIFIER) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:308:14: IDENTIFIER
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER124=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1041); 
                    IDENTIFIER124_tree = (CommonTree)adaptor.dupNode(IDENTIFIER124);


                    adaptor.addChild(root_1, IDENTIFIER124_tree);


                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:308:26: ( runtimeVisibleAnnotationsItem )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==CPINDEX) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:308:26: runtimeVisibleAnnotationsItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1044);
            	    runtimeVisibleAnnotationsItem125=runtimeVisibleAnnotationsItem();

            	    state._fsp--;

            	    adaptor.addChild(root_1, runtimeVisibleAnnotationsItem125.getTree());


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameterVisibilityInfo"


    public static class runtimeInvisibleAnnotationsItem_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeInvisibleAnnotationsItem"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:310:1: runtimeInvisibleAnnotationsItem : ^( RIAI pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) ;
    public final JVMScramblingInformationGatherer.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem() throws RecognitionException {
        JVMScramblingInformationGatherer.runtimeInvisibleAnnotationsItem_return retval = new JVMScramblingInformationGatherer.runtimeInvisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RIAI126=null;
        CommonTree CPINDEX129=null;
        JVMScramblingInformationGatherer.pc_return pc127 =null;

        JVMScramblingInformationGatherer.pc_return pc128 =null;

        JVMScramblingInformationGatherer.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList130 =null;


        CommonTree RIAI126_tree=null;
        CommonTree CPINDEX129_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:311:3: ( ^( RIAI pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:311:5: ^( RIAI pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RIAI126=(CommonTree)match(input,RIAI,FOLLOW_RIAI_in_runtimeInvisibleAnnotationsItem1059); 
            RIAI126_tree = (CommonTree)adaptor.dupNode(RIAI126);


            root_1 = (CommonTree)adaptor.becomeRoot(RIAI126_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1061);
            pc127=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc127.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:311:15: ( pc )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INTLITERAL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:311:15: pc
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1063);
                    pc128=pc();

                    state._fsp--;

                    adaptor.addChild(root_1, pc128.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX129=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1067); 
            CPINDEX129_tree = (CommonTree)adaptor.dupNode(CPINDEX129);


            root_2 = (CommonTree)adaptor.becomeRoot(CPINDEX129_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:311:29: ( runtimeVisibleAnnotationAssignList )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ASSIGN) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:311:29: runtimeVisibleAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1069);
                        runtimeVisibleAnnotationAssignList130=runtimeVisibleAnnotationAssignList();

                        state._fsp--;

                        adaptor.addChild(root_2, runtimeVisibleAnnotationAssignList130.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeInvisibleAnnotationsItem"


    protected static class constant_pool_scope {
        private HashMap<String, CommonTree> lines;
    }
    protected Stack constant_pool_stack = new Stack();


    public static class constant_pool_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_pool"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:318:1: constant_pool : ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) ;
    public final JVMScramblingInformationGatherer.constant_pool_return constant_pool() throws RecognitionException {
        constant_pool_stack.push(new constant_pool_scope());
        JVMScramblingInformationGatherer.constant_pool_return retval = new JVMScramblingInformationGatherer.constant_pool_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER131=null;
        CommonTree IDENTIFIER132=null;
        JVMScramblingInformationGatherer.contant_pool_line_return contant_pool_line133 =null;


        CommonTree IDENTIFIER131_tree=null;
        CommonTree IDENTIFIER132_tree=null;


        	((constant_pool_scope)constant_pool_stack.peek()).lines = new HashMap<String, CommonTree>();

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:328:3: ( ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:328:5: ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER131=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1101); 
            IDENTIFIER131_tree = (CommonTree)adaptor.dupNode(IDENTIFIER131);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER131_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER132=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1103); 
            IDENTIFIER132_tree = (CommonTree)adaptor.dupNode(IDENTIFIER132);


            adaptor.addChild(root_1, IDENTIFIER132_tree);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:328:29: ( contant_pool_line )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ASSIGN) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:328:29: contant_pool_line
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool1105);
            	    contant_pool_line133=contant_pool_line();

            	    state._fsp--;

            	    adaptor.addChild(root_1, contant_pool_line133.getTree());


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            	setConstantPool(((constant_pool_scope)constant_pool_stack.peek()).lines);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            constant_pool_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "constant_pool"


    public static class contant_pool_line_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "contant_pool_line"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:331:1: contant_pool_line : ^( ASSIGN cpi= CPINDEX cta= CONSTANT_TYPE_ASSIGNABLE ) -> ^( ASSIGN $cpi $cta) ;
    public final JVMScramblingInformationGatherer.contant_pool_line_return contant_pool_line() throws RecognitionException {
        JVMScramblingInformationGatherer.contant_pool_line_return retval = new JVMScramblingInformationGatherer.contant_pool_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree cpi=null;
        CommonTree cta=null;
        CommonTree ASSIGN134=null;

        CommonTree cpi_tree=null;
        CommonTree cta_tree=null;
        CommonTree ASSIGN134_tree=null;
        RewriteRuleNodeStream stream_CPINDEX=new RewriteRuleNodeStream(adaptor,"token CPINDEX");
        RewriteRuleNodeStream stream_ASSIGN=new RewriteRuleNodeStream(adaptor,"token ASSIGN");
        RewriteRuleNodeStream stream_CONSTANT_TYPE_ASSIGNABLE=new RewriteRuleNodeStream(adaptor,"token CONSTANT_TYPE_ASSIGNABLE");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:335:3: ( ^( ASSIGN cpi= CPINDEX cta= CONSTANT_TYPE_ASSIGNABLE ) -> ^( ASSIGN $cpi $cta) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:335:5: ^( ASSIGN cpi= CPINDEX cta= CONSTANT_TYPE_ASSIGNABLE )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN134=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line1127);  
            stream_ASSIGN.add(ASSIGN134);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            cpi=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line1131);  
            stream_CPINDEX.add(cpi);


            _last = (CommonTree)input.LT(1);
            cta=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1135);  
            stream_CONSTANT_TYPE_ASSIGNABLE.add(cta);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: cpi, cta, ASSIGN
            // token labels: cta, cpi
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleNodeStream stream_cta=new RewriteRuleNodeStream(adaptor,"token cta",cta);
            RewriteRuleNodeStream stream_cpi=new RewriteRuleNodeStream(adaptor,"token cpi",cpi);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 336:3: -> ^( ASSIGN $cpi $cta)
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:336:6: ^( ASSIGN $cpi $cta)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_ASSIGN.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_cpi.nextNode());

                adaptor.addChild(root_1, stream_cta.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            	((constant_pool_scope)constant_pool_stack.peek()).lines.put((cpi!=null?cpi.getText():null), (CommonTree)((CommonTree)retval.tree).getChild(1));

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "contant_pool_line"


    protected static class classBody_scope {
        int fieldCount;
        int methodCount;
        int ctorCount;
    }
    protected Stack classBody_stack = new Stack();


    public static class classBody_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBody"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:343:1: classBody : ( classBodyEntryDecl )+ ;
    public final JVMScramblingInformationGatherer.classBody_return classBody() throws RecognitionException {
        classBody_stack.push(new classBody_scope());
        JVMScramblingInformationGatherer.classBody_return retval = new JVMScramblingInformationGatherer.classBody_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.classBodyEntryDecl_return classBodyEntryDecl135 =null;




        	((classBody_scope)classBody_stack.peek()).fieldCount = 0;
        	((classBody_scope)classBody_stack.peek()).methodCount = 0;
        	((classBody_scope)classBody_stack.peek()).ctorCount = 0;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:354:3: ( ( classBodyEntryDecl )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:354:5: ( classBodyEntryDecl )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:354:5: ( classBodyEntryDecl )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==CTORDECL||LA35_0==FIELDDECL||LA35_0==METHODDECL||LA35_0==STATICCTORDECL) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:354:5: classBodyEntryDecl
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_classBodyEntryDecl_in_classBody1176);
            	    classBodyEntryDecl135=classBodyEntryDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classBodyEntryDecl135.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            classBody_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "classBody"


    public static class classBodyEntryDecl_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyEntryDecl"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:357:1: classBodyEntryDecl : ( methodDefinition | ctorDefinition | fieldDefinition | staticCtorDefinition );
    public final JVMScramblingInformationGatherer.classBodyEntryDecl_return classBodyEntryDecl() throws RecognitionException {
        JVMScramblingInformationGatherer.classBodyEntryDecl_return retval = new JVMScramblingInformationGatherer.classBodyEntryDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.methodDefinition_return methodDefinition136 =null;

        JVMScramblingInformationGatherer.ctorDefinition_return ctorDefinition137 =null;

        JVMScramblingInformationGatherer.fieldDefinition_return fieldDefinition138 =null;

        JVMScramblingInformationGatherer.staticCtorDefinition_return staticCtorDefinition139 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:358:3: ( methodDefinition | ctorDefinition | fieldDefinition | staticCtorDefinition )
            int alt36=4;
            switch ( input.LA(1) ) {
            case METHODDECL:
                {
                alt36=1;
                }
                break;
            case CTORDECL:
                {
                alt36=2;
                }
                break;
            case FIELDDECL:
                {
                alt36=3;
                }
                break;
            case STATICCTORDECL:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:358:5: methodDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_methodDefinition_in_classBodyEntryDecl1192);
                    methodDefinition136=methodDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, methodDefinition136.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:359:5: ctorDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ctorDefinition_in_classBodyEntryDecl1198);
                    ctorDefinition137=ctorDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, ctorDefinition137.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:360:5: fieldDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_fieldDefinition_in_classBodyEntryDecl1204);
                    fieldDefinition138=fieldDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, fieldDefinition138.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:361:5: staticCtorDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1210);
                    staticCtorDefinition139=staticCtorDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, staticCtorDefinition139.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classBodyEntryDecl"


    public static class fieldDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:368:1: fieldDefinition : ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) -> ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[\"datField\" + $classBody::fieldCount] ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) ;
    public final JVMScramblingInformationGatherer.fieldDefinition_return fieldDefinition() throws RecognitionException {
        JVMScramblingInformationGatherer.fieldDefinition_return retval = new JVMScramblingInformationGatherer.fieldDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FIELDDECL140=null;
        CommonTree VMODIFIER141=null;
        CommonTree MODIFIER143=null;
        CommonTree RETVALUE145=null;
        CommonTree UNITNAME147=null;
        CommonTree IDENTIFIER148=null;
        CommonTree FIELDVALUE149=null;
        CommonTree UNITHEADER151=null;
        CommonTree UNITATTR153=null;
        JVMScramblingInformationGatherer.field_visual_modifier_return field_visual_modifier142 =null;

        JVMScramblingInformationGatherer.field_modifier_return field_modifier144 =null;

        JVMScramblingInformationGatherer.type_return type146 =null;

        JVMScramblingInformationGatherer.literals_return literals150 =null;

        JVMScramblingInformationGatherer.fieldInfo_return fieldInfo152 =null;

        JVMScramblingInformationGatherer.fieldAdditionalInfo_return fieldAdditionalInfo154 =null;


        CommonTree FIELDDECL140_tree=null;
        CommonTree VMODIFIER141_tree=null;
        CommonTree MODIFIER143_tree=null;
        CommonTree RETVALUE145_tree=null;
        CommonTree UNITNAME147_tree=null;
        CommonTree IDENTIFIER148_tree=null;
        CommonTree FIELDVALUE149_tree=null;
        CommonTree UNITHEADER151_tree=null;
        CommonTree UNITATTR153_tree=null;
        RewriteRuleNodeStream stream_UNITNAME=new RewriteRuleNodeStream(adaptor,"token UNITNAME");
        RewriteRuleNodeStream stream_UNITATTR=new RewriteRuleNodeStream(adaptor,"token UNITATTR");
        RewriteRuleNodeStream stream_UNITHEADER=new RewriteRuleNodeStream(adaptor,"token UNITHEADER");
        RewriteRuleNodeStream stream_VMODIFIER=new RewriteRuleNodeStream(adaptor,"token VMODIFIER");
        RewriteRuleNodeStream stream_RETVALUE=new RewriteRuleNodeStream(adaptor,"token RETVALUE");
        RewriteRuleNodeStream stream_FIELDDECL=new RewriteRuleNodeStream(adaptor,"token FIELDDECL");
        RewriteRuleNodeStream stream_IDENTIFIER=new RewriteRuleNodeStream(adaptor,"token IDENTIFIER");
        RewriteRuleNodeStream stream_MODIFIER=new RewriteRuleNodeStream(adaptor,"token MODIFIER");
        RewriteRuleNodeStream stream_FIELDVALUE=new RewriteRuleNodeStream(adaptor,"token FIELDVALUE");
        RewriteRuleSubtreeStream stream_field_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_visual_modifier");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_fieldInfo=new RewriteRuleSubtreeStream(adaptor,"rule fieldInfo");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_fieldAdditionalInfo=new RewriteRuleSubtreeStream(adaptor,"rule fieldAdditionalInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:372:3: ( ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) -> ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[\"datField\" + $classBody::fieldCount] ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:372:5: ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FIELDDECL140=(CommonTree)match(input,FIELDDECL,FOLLOW_FIELDDECL_in_fieldDefinition1232);  
            stream_FIELDDECL.add(FIELDDECL140);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER141=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_fieldDefinition1235);  
            stream_VMODIFIER.add(VMODIFIER141);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:372:29: ( field_visual_modifier )?
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= PRIVATE && LA37_0 <= PUBLIC)) ) {
                    alt37=1;
                }
                switch (alt37) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:372:29: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition1237);
                        field_visual_modifier142=field_visual_modifier();

                        state._fsp--;

                        stream_field_visual_modifier.add(field_visual_modifier142.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MODIFIER143=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_fieldDefinition1242);  
            stream_MODIFIER.add(MODIFIER143);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:372:64: ( field_modifier )*
                loop38:
                do {
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==FINAL||LA38_0==STATIC||LA38_0==TRANSIENT||LA38_0==VOLATILE) ) {
                        alt38=1;
                    }


                    switch (alt38) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:372:64: field_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition1244);
                	    field_modifier144=field_modifier();

                	    state._fsp--;

                	    stream_field_modifier.add(field_modifier144.getTree());

                	    }
                	    break;

                	default :
                	    break loop38;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RETVALUE145=(CommonTree)match(input,RETVALUE,FOLLOW_RETVALUE_in_fieldDefinition1249);  
            stream_RETVALUE.add(RETVALUE145);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_fieldDefinition1251);
            type146=type();

            state._fsp--;

            stream_type.add(type146.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME147=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_fieldDefinition1255);  
            stream_UNITNAME.add(UNITNAME147);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER148=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldDefinition1257);  
            stream_IDENTIFIER.add(IDENTIFIER148);


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FIELDVALUE149=(CommonTree)match(input,FIELDVALUE,FOLLOW_FIELDVALUE_in_fieldDefinition1261);  
            stream_FIELDVALUE.add(FIELDVALUE149);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:372:134: ( literals )?
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==BOOLEANLITERAL||LA39_0==CHARLITERAL||LA39_0==DOUBLELITERAL||LA39_0==FLOATLITERAL||LA39_0==IDENTIFIER||LA39_0==INTLITERAL||LA39_0==LONGLITERAL||LA39_0==MINUS||LA39_0==STRINGLITERAL) ) {
                    alt39=1;
                }
                switch (alt39) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:372:134: literals
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_literals_in_fieldDefinition1263);
                        literals150=literals();

                        state._fsp--;

                        stream_literals.add(literals150.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITHEADER151=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_fieldDefinition1280);  
            stream_UNITHEADER.add(UNITHEADER151);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition1282);
            fieldInfo152=fieldInfo();

            state._fsp--;

            stream_fieldInfo.add(fieldInfo152.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITATTR153=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_fieldDefinition1298);  
            stream_UNITATTR.add(UNITATTR153);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:374:24: ( fieldAdditionalInfo )*
                loop40:
                do {
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Constant||LA40_0==Deprecated||LA40_0==RuntimeInvisibleAnnotations||LA40_0==RuntimeVisibleAnnotations||LA40_0==Signature||LA40_0==Synthetic) ) {
                        alt40=1;
                    }


                    switch (alt40) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:374:24: fieldAdditionalInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition1300);
                	    fieldAdditionalInfo154=fieldAdditionalInfo();

                	    state._fsp--;

                	    stream_fieldAdditionalInfo.add(fieldAdditionalInfo154.getTree());

                	    }
                	    break;

                	default :
                	    break loop40;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            rename(((classDefinition_scope)classDefinition_stack.peek()).className + "." + (IDENTIFIER148!=null?IDENTIFIER148.getText():null) + ":" + (fieldInfo152!=null?fieldInfo152.value:null), "datField" + ((classBody_scope)classBody_stack.peek()).fieldCount);

            // AST REWRITE
            // elements: fieldInfo, field_modifier, fieldAdditionalInfo, literals, type, VMODIFIER, UNITATTR, MODIFIER, FIELDVALUE, field_visual_modifier, RETVALUE, FIELDDECL, UNITNAME, IDENTIFIER, UNITHEADER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 377:13: -> ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[\"datField\" + $classBody::fieldCount] ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:377:16: ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[\"datField\" + $classBody::fieldCount] ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FIELDDECL.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:377:28: ^( VMODIFIER ( field_visual_modifier )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_VMODIFIER.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:377:40: ( field_visual_modifier )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                }
                stream_field_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:377:64: ^( MODIFIER ( field_modifier )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_MODIFIER.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:377:75: ( field_modifier )*
                while ( stream_field_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_modifier.nextTree());

                }
                stream_field_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:377:92: ^( RETVALUE type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_RETVALUE.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:377:109: ^( UNITNAME IDENTIFIER[\"datField\" + $classBody::fieldCount] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_UNITNAME.nextNode()
                , root_2);

                adaptor.addChild(root_2, 
                (CommonTree)adaptor.create(IDENTIFIER, "datField" + ((classBody_scope)classBody_stack.peek()).fieldCount)
                );

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:377:169: ^( FIELDVALUE ( literals )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_FIELDVALUE.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:377:182: ( literals )?
                if ( stream_literals.hasNext() ) {
                    adaptor.addChild(root_2, stream_literals.nextTree());

                }
                stream_literals.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:378:13: ^( UNITHEADER fieldInfo )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_UNITHEADER.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_fieldInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:379:13: ^( UNITATTR ( fieldAdditionalInfo )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_UNITATTR.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:379:24: ( fieldAdditionalInfo )*
                while ( stream_fieldAdditionalInfo.hasNext() ) {
                    adaptor.addChild(root_2, stream_fieldAdditionalInfo.nextTree());

                }
                stream_fieldAdditionalInfo.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            	((classBody_scope)classBody_stack.peek()).fieldCount++;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldDefinition"


    public static class fieldInfo_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:383:1: fieldInfo returns [String value] : ^( Signature bytecodeType ) flags ;
    public final JVMScramblingInformationGatherer.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMScramblingInformationGatherer.fieldInfo_return retval = new JVMScramblingInformationGatherer.fieldInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature155=null;
        JVMScramblingInformationGatherer.bytecodeType_return bytecodeType156 =null;

        JVMScramblingInformationGatherer.flags_return flags157 =null;


        CommonTree Signature155_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:384:3: ( ^( Signature bytecodeType ) flags )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:384:5: ^( Signature bytecodeType ) flags
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature155=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldInfo1451); 
            Signature155_tree = (CommonTree)adaptor.dupNode(Signature155);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature155_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_fieldInfo1453);
            bytecodeType156=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_1, bytecodeType156.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flags_in_fieldInfo1456);
            flags157=flags();

            state._fsp--;

            adaptor.addChild(root_0, flags157.getTree());


            retval.value = (bytecodeType156!=null?bytecodeType156.value:null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldInfo"


    public static class fieldAdditionalInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldAdditionalInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:387:1: fieldAdditionalInfo : ( ^( Constant primitiveType literals ) | ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | ^( Signature CPINDEX ) | ^( Deprecated BOOLEANLITERAL ) | ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations );
    public final JVMScramblingInformationGatherer.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        JVMScramblingInformationGatherer.fieldAdditionalInfo_return retval = new JVMScramblingInformationGatherer.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Constant158=null;
        CommonTree Constant161=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE162=null;
        CommonTree Signature163=null;
        CommonTree CPINDEX164=null;
        CommonTree Deprecated165=null;
        CommonTree BOOLEANLITERAL166=null;
        CommonTree Synthetic167=null;
        CommonTree BOOLEANLITERAL168=null;
        JVMScramblingInformationGatherer.primitiveType_return primitiveType159 =null;

        JVMScramblingInformationGatherer.literals_return literals160 =null;

        JVMScramblingInformationGatherer.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info169 =null;

        JVMScramblingInformationGatherer.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations170 =null;


        CommonTree Constant158_tree=null;
        CommonTree Constant161_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE162_tree=null;
        CommonTree Signature163_tree=null;
        CommonTree CPINDEX164_tree=null;
        CommonTree Deprecated165_tree=null;
        CommonTree BOOLEANLITERAL166_tree=null;
        CommonTree Synthetic167_tree=null;
        CommonTree BOOLEANLITERAL168_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:388:3: ( ^( Constant primitiveType literals ) | ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | ^( Signature CPINDEX ) | ^( Deprecated BOOLEANLITERAL ) | ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations )
            int alt41=7;
            switch ( input.LA(1) ) {
            case Constant:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==DOWN) ) {
                    int LA41_7 = input.LA(3);

                    if ( (LA41_7==CONSTANT_TYPE_ASSIGNABLE) ) {
                        alt41=2;
                    }
                    else if ( (LA41_7==BOOLEAN||LA41_7==BYTE||LA41_7==CHAR||LA41_7==DOUBLE||LA41_7==FLOAT||LA41_7==INT||LA41_7==LONG||LA41_7==SHORT||LA41_7==VOID) ) {
                        alt41=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }
                }
                break;
            case Signature:
                {
                alt41=3;
                }
                break;
            case Deprecated:
                {
                alt41=4;
                }
                break;
            case Synthetic:
                {
                alt41=5;
                }
                break;
            case RuntimeVisibleAnnotations:
                {
                alt41=6;
                }
                break;
            case RuntimeInvisibleAnnotations:
                {
                alt41=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:388:5: ^( Constant primitiveType literals )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Constant158=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1472); 
                    Constant158_tree = (CommonTree)adaptor.dupNode(Constant158);


                    root_1 = (CommonTree)adaptor.becomeRoot(Constant158_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_fieldAdditionalInfo1474);
                    primitiveType159=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_1, primitiveType159.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_literals_in_fieldAdditionalInfo1476);
                    literals160=literals();

                    state._fsp--;

                    adaptor.addChild(root_1, literals160.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:389:5: ^( Constant CONSTANT_TYPE_ASSIGNABLE )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Constant161=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1484); 
                    Constant161_tree = (CommonTree)adaptor.dupNode(Constant161);


                    root_1 = (CommonTree)adaptor.becomeRoot(Constant161_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    CONSTANT_TYPE_ASSIGNABLE162=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo1486); 
                    CONSTANT_TYPE_ASSIGNABLE162_tree = (CommonTree)adaptor.dupNode(CONSTANT_TYPE_ASSIGNABLE162);


                    adaptor.addChild(root_1, CONSTANT_TYPE_ASSIGNABLE162_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:390:5: ^( Signature CPINDEX )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Signature163=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo1494); 
                    Signature163_tree = (CommonTree)adaptor.dupNode(Signature163);


                    root_1 = (CommonTree)adaptor.becomeRoot(Signature163_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    CPINDEX164=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldAdditionalInfo1496); 
                    CPINDEX164_tree = (CommonTree)adaptor.dupNode(CPINDEX164);


                    adaptor.addChild(root_1, CPINDEX164_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:391:5: ^( Deprecated BOOLEANLITERAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Deprecated165=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo1504); 
                    Deprecated165_tree = (CommonTree)adaptor.dupNode(Deprecated165);


                    root_1 = (CommonTree)adaptor.becomeRoot(Deprecated165_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL166=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1506); 
                    BOOLEANLITERAL166_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL166);


                    adaptor.addChild(root_1, BOOLEANLITERAL166_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:392:5: ^( Synthetic BOOLEANLITERAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Synthetic167=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo1514); 
                    Synthetic167_tree = (CommonTree)adaptor.dupNode(Synthetic167);


                    root_1 = (CommonTree)adaptor.becomeRoot(Synthetic167_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL168=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1516); 
                    BOOLEANLITERAL168_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL168);


                    adaptor.addChild(root_1, BOOLEANLITERAL168_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:393:5: runtimeVisibleAnnotations_info
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo1523);
                    runtimeVisibleAnnotations_info169=runtimeVisibleAnnotations_info();

                    state._fsp--;

                    adaptor.addChild(root_0, runtimeVisibleAnnotations_info169.getTree());


                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:394:5: runtimeInvisibleAnnotations
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo1529);
                    runtimeInvisibleAnnotations170=runtimeInvisibleAnnotations();

                    state._fsp--;

                    adaptor.addChild(root_0, runtimeInvisibleAnnotations170.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldAdditionalInfo"


    public static class field_visual_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:397:1: field_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMScramblingInformationGatherer.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        JVMScramblingInformationGatherer.field_visual_modifier_return retval = new JVMScramblingInformationGatherer.field_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set171=null;

        CommonTree set171_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:398:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set171=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                set171_tree = (CommonTree)adaptor.dupNode(set171);


                adaptor.addChild(root_0, set171_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_visual_modifier"


    public static class field_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:401:1: field_modifier : ( FINAL | STATIC | TRANSIENT | VOLATILE );
    public final JVMScramblingInformationGatherer.field_modifier_return field_modifier() throws RecognitionException {
        JVMScramblingInformationGatherer.field_modifier_return retval = new JVMScramblingInformationGatherer.field_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set172=null;

        CommonTree set172_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:402:3: ( FINAL | STATIC | TRANSIENT | VOLATILE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set172=(CommonTree)input.LT(1);

            if ( input.LA(1)==FINAL||input.LA(1)==STATIC||input.LA(1)==TRANSIENT||input.LA(1)==VOLATILE ) {
                input.consume();
                set172_tree = (CommonTree)adaptor.dupNode(set172);


                adaptor.addChild(root_0, set172_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_modifier"


    public static class staticCtorDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "staticCtorDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:409:1: staticCtorDefinition : ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) ;
    public final JVMScramblingInformationGatherer.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        JVMScramblingInformationGatherer.staticCtorDefinition_return retval = new JVMScramblingInformationGatherer.staticCtorDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STATICCTORDECL173=null;
        CommonTree VMODIFIER174=null;
        CommonTree UNITHEADER176=null;
        CommonTree UNITBODY178=null;
        JVMScramblingInformationGatherer.field_visual_modifier_return field_visual_modifier175 =null;

        JVMScramblingInformationGatherer.methodInfo_return methodInfo177 =null;

        JVMScramblingInformationGatherer.body_return body179 =null;


        CommonTree STATICCTORDECL173_tree=null;
        CommonTree VMODIFIER174_tree=null;
        CommonTree UNITHEADER176_tree=null;
        CommonTree UNITBODY178_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:410:3: ( ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:410:5: ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STATICCTORDECL173=(CommonTree)match(input,STATICCTORDECL,FOLLOW_STATICCTORDECL_in_staticCtorDefinition1601); 
            STATICCTORDECL173_tree = (CommonTree)adaptor.dupNode(STATICCTORDECL173);


            root_1 = (CommonTree)adaptor.becomeRoot(STATICCTORDECL173_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER174=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_staticCtorDefinition1604); 
            VMODIFIER174_tree = (CommonTree)adaptor.dupNode(VMODIFIER174);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER174_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:410:34: ( field_visual_modifier )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0 >= PRIVATE && LA42_0 <= PUBLIC)) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:410:34: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition1606);
                        field_visual_modifier175=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier175.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITHEADER176=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_staticCtorDefinition1611); 
            UNITHEADER176_tree = (CommonTree)adaptor.dupNode(UNITHEADER176);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER176_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition1613);
            methodInfo177=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo177.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITBODY178=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_staticCtorDefinition1617); 
            UNITBODY178_tree = (CommonTree)adaptor.dupNode(UNITBODY178);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY178_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_body_in_staticCtorDefinition1619);
            body179=body();

            state._fsp--;

            adaptor.addChild(root_2, body179.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "staticCtorDefinition"


    public static class ctorDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctorDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:418:1: ctorDefinition : ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMScramblingInformationGatherer.ctorDefinition_return ctorDefinition() throws RecognitionException {
        JVMScramblingInformationGatherer.ctorDefinition_return retval = new JVMScramblingInformationGatherer.ctorDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CTORDECL180=null;
        CommonTree VMODIFIER181=null;
        CommonTree GENERICDESC183=null;
        CommonTree UNITNAME185=null;
        CommonTree THROWCLAUSE188=null;
        CommonTree UNITHEADER190=null;
        CommonTree UNITBODY192=null;
        CommonTree UNITATTR194=null;
        JVMScramblingInformationGatherer.field_visual_modifier_return field_visual_modifier182 =null;

        JVMScramblingInformationGatherer.genericDescriptor_return genericDescriptor184 =null;

        JVMScramblingInformationGatherer.typeName_return typeName186 =null;

        JVMScramblingInformationGatherer.arguments_return arguments187 =null;

        JVMScramblingInformationGatherer.throwClause_return throwClause189 =null;

        JVMScramblingInformationGatherer.methodInfo_return methodInfo191 =null;

        JVMScramblingInformationGatherer.body_return body193 =null;

        JVMScramblingInformationGatherer.afterMethodInfo_return afterMethodInfo195 =null;


        CommonTree CTORDECL180_tree=null;
        CommonTree VMODIFIER181_tree=null;
        CommonTree GENERICDESC183_tree=null;
        CommonTree UNITNAME185_tree=null;
        CommonTree THROWCLAUSE188_tree=null;
        CommonTree UNITHEADER190_tree=null;
        CommonTree UNITBODY192_tree=null;
        CommonTree UNITATTR194_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:422:3: ( ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:422:5: ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CTORDECL180=(CommonTree)match(input,CTORDECL,FOLLOW_CTORDECL_in_ctorDefinition1646); 
            CTORDECL180_tree = (CommonTree)adaptor.dupNode(CTORDECL180);


            root_1 = (CommonTree)adaptor.becomeRoot(CTORDECL180_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER181=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_ctorDefinition1649); 
            VMODIFIER181_tree = (CommonTree)adaptor.dupNode(VMODIFIER181);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER181_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:422:28: ( field_visual_modifier )?
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0 >= PRIVATE && LA43_0 <= PUBLIC)) ) {
                    alt43=1;
                }
                switch (alt43) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:422:28: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition1651);
                        field_visual_modifier182=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier182.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            GENERICDESC183=(CommonTree)match(input,GENERICDESC,FOLLOW_GENERICDESC_in_ctorDefinition1656); 
            GENERICDESC183_tree = (CommonTree)adaptor.dupNode(GENERICDESC183);


            root_2 = (CommonTree)adaptor.becomeRoot(GENERICDESC183_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:422:66: ( genericDescriptor )?
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==EXTENDS) ) {
                    alt44=1;
                }
                switch (alt44) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:422:66: genericDescriptor
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_genericDescriptor_in_ctorDefinition1658);
                        genericDescriptor184=genericDescriptor();

                        state._fsp--;

                        adaptor.addChild(root_2, genericDescriptor184.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME185=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_ctorDefinition1663); 
            UNITNAME185_tree = (CommonTree)adaptor.dupNode(UNITNAME185);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME185_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeName_in_ctorDefinition1665);
            typeName186=typeName();

            state._fsp--;

            adaptor.addChild(root_2, typeName186.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arguments_in_ctorDefinition1668);
            arguments187=arguments();

            state._fsp--;

            adaptor.addChild(root_1, arguments187.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWCLAUSE188=(CommonTree)match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_ctorDefinition1671); 
            THROWCLAUSE188_tree = (CommonTree)adaptor.dupNode(THROWCLAUSE188);


            root_2 = (CommonTree)adaptor.becomeRoot(THROWCLAUSE188_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:422:131: ( throwClause )?
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==THROWS) ) {
                    alt45=1;
                }
                switch (alt45) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:422:131: throwClause
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_throwClause_in_ctorDefinition1673);
                        throwClause189=throwClause();

                        state._fsp--;

                        adaptor.addChild(root_2, throwClause189.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITHEADER190=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_ctorDefinition1702); 
            UNITHEADER190_tree = (CommonTree)adaptor.dupNode(UNITHEADER190);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER190_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_ctorDefinition1704);
            methodInfo191=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo191.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITBODY192=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_ctorDefinition1732); 
            UNITBODY192_tree = (CommonTree)adaptor.dupNode(UNITBODY192);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY192_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_body_in_ctorDefinition1734);
            body193=body();

            state._fsp--;

            adaptor.addChild(root_2, body193.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITATTR194=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_ctorDefinition1762); 
            UNITATTR194_tree = (CommonTree)adaptor.dupNode(UNITATTR194);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR194_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:425:36: ( afterMethodInfo )?
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AnnotationDefault||LA46_0==Deprecated||LA46_0==Exceptions||(LA46_0 >= RuntimeInvisibleAnnotations && LA46_0 <= RuntimeVisibleParameterAnnotations)||LA46_0==Signature||LA46_0==Synthetic) ) {
                    alt46=1;
                }
                switch (alt46) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:425:36: afterMethodInfo
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition1764);
                        afterMethodInfo195=afterMethodInfo();

                        state._fsp--;

                        adaptor.addChild(root_2, afterMethodInfo195.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            	((classBody_scope)classBody_stack.peek()).ctorCount++;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctorDefinition"


    public static class methodDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:433:1: methodDefinition : ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) -> ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[\"method\" + $classBody::ctorCount] ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMScramblingInformationGatherer.methodDefinition_return methodDefinition() throws RecognitionException {
        JVMScramblingInformationGatherer.methodDefinition_return retval = new JVMScramblingInformationGatherer.methodDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree METHODDECL196=null;
        CommonTree VMODIFIER197=null;
        CommonTree MODIFIER199=null;
        CommonTree GENERICDESC201=null;
        CommonTree RETVALUE203=null;
        CommonTree UNITNAME205=null;
        CommonTree IDENTIFIER206=null;
        CommonTree THROWCLAUSE208=null;
        CommonTree UNITHEADER210=null;
        CommonTree UNITBODY212=null;
        CommonTree UNITATTR214=null;
        JVMScramblingInformationGatherer.method_visual_modifier_return method_visual_modifier198 =null;

        JVMScramblingInformationGatherer.method_modifier_return method_modifier200 =null;

        JVMScramblingInformationGatherer.genericDescriptor_return genericDescriptor202 =null;

        JVMScramblingInformationGatherer.type_return type204 =null;

        JVMScramblingInformationGatherer.arguments_return arguments207 =null;

        JVMScramblingInformationGatherer.throwClauseMethod_return throwClauseMethod209 =null;

        JVMScramblingInformationGatherer.methodInfo_return methodInfo211 =null;

        JVMScramblingInformationGatherer.body_return body213 =null;

        JVMScramblingInformationGatherer.afterMethodInfo_return afterMethodInfo215 =null;


        CommonTree METHODDECL196_tree=null;
        CommonTree VMODIFIER197_tree=null;
        CommonTree MODIFIER199_tree=null;
        CommonTree GENERICDESC201_tree=null;
        CommonTree RETVALUE203_tree=null;
        CommonTree UNITNAME205_tree=null;
        CommonTree IDENTIFIER206_tree=null;
        CommonTree THROWCLAUSE208_tree=null;
        CommonTree UNITHEADER210_tree=null;
        CommonTree UNITBODY212_tree=null;
        CommonTree UNITATTR214_tree=null;
        RewriteRuleNodeStream stream_UNITNAME=new RewriteRuleNodeStream(adaptor,"token UNITNAME");
        RewriteRuleNodeStream stream_UNITATTR=new RewriteRuleNodeStream(adaptor,"token UNITATTR");
        RewriteRuleNodeStream stream_UNITHEADER=new RewriteRuleNodeStream(adaptor,"token UNITHEADER");
        RewriteRuleNodeStream stream_VMODIFIER=new RewriteRuleNodeStream(adaptor,"token VMODIFIER");
        RewriteRuleNodeStream stream_GENERICDESC=new RewriteRuleNodeStream(adaptor,"token GENERICDESC");
        RewriteRuleNodeStream stream_THROWCLAUSE=new RewriteRuleNodeStream(adaptor,"token THROWCLAUSE");
        RewriteRuleNodeStream stream_RETVALUE=new RewriteRuleNodeStream(adaptor,"token RETVALUE");
        RewriteRuleNodeStream stream_IDENTIFIER=new RewriteRuleNodeStream(adaptor,"token IDENTIFIER");
        RewriteRuleNodeStream stream_MODIFIER=new RewriteRuleNodeStream(adaptor,"token MODIFIER");
        RewriteRuleNodeStream stream_UNITBODY=new RewriteRuleNodeStream(adaptor,"token UNITBODY");
        RewriteRuleNodeStream stream_METHODDECL=new RewriteRuleNodeStream(adaptor,"token METHODDECL");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_genericDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule genericDescriptor");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_afterMethodInfo=new RewriteRuleSubtreeStream(adaptor,"rule afterMethodInfo");
        RewriteRuleSubtreeStream stream_methodInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodInfo");
        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        RewriteRuleSubtreeStream stream_throwClauseMethod=new RewriteRuleSubtreeStream(adaptor,"rule throwClauseMethod");
        RewriteRuleSubtreeStream stream_method_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_visual_modifier");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:3: ( ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) -> ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[\"method\" + $classBody::ctorCount] ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:5: ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            METHODDECL196=(CommonTree)match(input,METHODDECL,FOLLOW_METHODDECL_in_methodDefinition1814);  
            stream_METHODDECL.add(METHODDECL196);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER197=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_methodDefinition1817);  
            stream_VMODIFIER.add(VMODIFIER197);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:30: ( method_visual_modifier )?
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0 >= PRIVATE && LA47_0 <= PUBLIC)) ) {
                    alt47=1;
                }
                switch (alt47) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:30: method_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_method_visual_modifier_in_methodDefinition1819);
                        method_visual_modifier198=method_visual_modifier();

                        state._fsp--;

                        stream_method_visual_modifier.add(method_visual_modifier198.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MODIFIER199=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_methodDefinition1824);  
            stream_MODIFIER.add(MODIFIER199);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:66: ( method_modifier )*
                loop48:
                do {
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==ABSTRACT||LA48_0==FINAL||LA48_0==NATIVE||LA48_0==STATIC||LA48_0==STRICTFP||LA48_0==SYNCHRONIZED) ) {
                        alt48=1;
                    }


                    switch (alt48) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:66: method_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_method_modifier_in_methodDefinition1826);
                	    method_modifier200=method_modifier();

                	    state._fsp--;

                	    stream_method_modifier.add(method_modifier200.getTree());

                	    }
                	    break;

                	default :
                	    break loop48;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            GENERICDESC201=(CommonTree)match(input,GENERICDESC,FOLLOW_GENERICDESC_in_methodDefinition1831);  
            stream_GENERICDESC.add(GENERICDESC201);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:98: ( genericDescriptor )?
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==EXTENDS) ) {
                    alt49=1;
                }
                switch (alt49) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:98: genericDescriptor
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_genericDescriptor_in_methodDefinition1833);
                        genericDescriptor202=genericDescriptor();

                        state._fsp--;

                        stream_genericDescriptor.add(genericDescriptor202.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RETVALUE203=(CommonTree)match(input,RETVALUE,FOLLOW_RETVALUE_in_methodDefinition1838);  
            stream_RETVALUE.add(RETVALUE203);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_methodDefinition1840);
            type204=type();

            state._fsp--;

            stream_type.add(type204.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME205=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_methodDefinition1844);  
            stream_UNITNAME.add(UNITNAME205);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER206=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDefinition1846);  
            stream_IDENTIFIER.add(IDENTIFIER206);


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arguments_in_methodDefinition1849);
            arguments207=arguments();

            state._fsp--;

            stream_arguments.add(arguments207.getTree());

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWCLAUSE208=(CommonTree)match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_methodDefinition1852);  
            stream_THROWCLAUSE.add(THROWCLAUSE208);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:182: ( throwClauseMethod )?
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==THROWS) ) {
                    alt50=1;
                }
                switch (alt50) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:437:182: throwClauseMethod
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_throwClauseMethod_in_methodDefinition1854);
                        throwClauseMethod209=throwClauseMethod();

                        state._fsp--;

                        stream_throwClauseMethod.add(throwClauseMethod209.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITHEADER210=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_methodDefinition1883);  
            stream_UNITHEADER.add(UNITHEADER210);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_methodDefinition1885);
            methodInfo211=methodInfo();

            state._fsp--;

            stream_methodInfo.add(methodInfo211.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITBODY212=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_methodDefinition1913);  
            stream_UNITBODY.add(UNITBODY212);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:439:36: ( body )?
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Code||LA51_0==Synthetic) ) {
                    alt51=1;
                }
                switch (alt51) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:439:36: body
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_body_in_methodDefinition1915);
                        body213=body();

                        state._fsp--;

                        stream_body.add(body213.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITATTR214=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_methodDefinition1944);  
            stream_UNITATTR.add(UNITATTR214);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:440:36: ( afterMethodInfo )?
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==AnnotationDefault||LA52_0==Deprecated||LA52_0==Exceptions||(LA52_0 >= RuntimeInvisibleAnnotations && LA52_0 <= RuntimeVisibleParameterAnnotations)||LA52_0==Signature||LA52_0==Synthetic) ) {
                    alt52=1;
                }
                switch (alt52) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:440:36: afterMethodInfo
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition1946);
                        afterMethodInfo215=afterMethodInfo();

                        state._fsp--;

                        stream_afterMethodInfo.add(afterMethodInfo215.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            rename(((classDefinition_scope)classDefinition_stack.peek()).className + "." + (IDENTIFIER206!=null?IDENTIFIER206.getText():null) + ":" + (methodInfo211!=null?methodInfo211.value:null), "method" + ((classBody_scope)classBody_stack.peek()).methodCount);

            // AST REWRITE
            // elements: method_modifier, MODIFIER, THROWCLAUSE, arguments, RETVALUE, throwClauseMethod, body, UNITHEADER, type, methodInfo, genericDescriptor, UNITATTR, UNITBODY, IDENTIFIER, UNITNAME, METHODDECL, VMODIFIER, method_visual_modifier, GENERICDESC, afterMethodInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 443:25: -> ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[\"method\" + $classBody::ctorCount] ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:28: ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[\"method\" + $classBody::ctorCount] ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_METHODDECL.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:41: ^( VMODIFIER ( method_visual_modifier )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_VMODIFIER.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:53: ( method_visual_modifier )?
                if ( stream_method_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_method_visual_modifier.nextTree());

                }
                stream_method_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:78: ^( MODIFIER ( method_modifier )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_MODIFIER.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:89: ( method_modifier )*
                while ( stream_method_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_method_modifier.nextTree());

                }
                stream_method_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:107: ^( GENERICDESC ( genericDescriptor )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_GENERICDESC.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:121: ( genericDescriptor )?
                if ( stream_genericDescriptor.hasNext() ) {
                    adaptor.addChild(root_2, stream_genericDescriptor.nextTree());

                }
                stream_genericDescriptor.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:141: ^( RETVALUE type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_RETVALUE.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:158: ^( UNITNAME IDENTIFIER[\"method\" + $classBody::ctorCount] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_UNITNAME.nextNode()
                , root_2);

                adaptor.addChild(root_2, 
                (CommonTree)adaptor.create(IDENTIFIER, "method" + ((classBody_scope)classBody_stack.peek()).ctorCount)
                );

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_arguments.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:225: ^( THROWCLAUSE ( throwClauseMethod )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_THROWCLAUSE.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:443:239: ( throwClauseMethod )?
                if ( stream_throwClauseMethod.hasNext() ) {
                    adaptor.addChild(root_2, stream_throwClauseMethod.nextTree());

                }
                stream_throwClauseMethod.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:444:25: ^( UNITHEADER methodInfo )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_UNITHEADER.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:445:25: ^( UNITBODY ( body )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_UNITBODY.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:445:36: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_2, stream_body.nextTree());

                }
                stream_body.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:446:25: ^( UNITATTR ( afterMethodInfo )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_UNITATTR.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:446:36: ( afterMethodInfo )?
                if ( stream_afterMethodInfo.hasNext() ) {
                    adaptor.addChild(root_2, stream_afterMethodInfo.nextTree());

                }
                stream_afterMethodInfo.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            	((classBody_scope)classBody_stack.peek()).methodCount++;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDefinition"


    public static class methodInfo_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:451:1: methodInfo returns [String value] : ^( STANDINTOKEN methodSignatureInfo flags ) ;
    public final JVMScramblingInformationGatherer.methodInfo_return methodInfo() throws RecognitionException {
        JVMScramblingInformationGatherer.methodInfo_return retval = new JVMScramblingInformationGatherer.methodInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STANDINTOKEN216=null;
        JVMScramblingInformationGatherer.methodSignatureInfo_return methodSignatureInfo217 =null;

        JVMScramblingInformationGatherer.flags_return flags218 =null;


        CommonTree STANDINTOKEN216_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:452:3: ( ^( STANDINTOKEN methodSignatureInfo flags ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:452:5: ^( STANDINTOKEN methodSignatureInfo flags )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STANDINTOKEN216=(CommonTree)match(input,STANDINTOKEN,FOLLOW_STANDINTOKEN_in_methodInfo2234); 
            STANDINTOKEN216_tree = (CommonTree)adaptor.dupNode(STANDINTOKEN216);


            root_1 = (CommonTree)adaptor.becomeRoot(STANDINTOKEN216_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo2236);
            methodSignatureInfo217=methodSignatureInfo();

            state._fsp--;

            adaptor.addChild(root_1, methodSignatureInfo217.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flags_in_methodInfo2238);
            flags218=flags();

            state._fsp--;

            adaptor.addChild(root_1, flags218.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            retval.value = (methodSignatureInfo217!=null?methodSignatureInfo217.value:null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodInfo"


    public static class afterMethodInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "afterMethodInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:455:1: afterMethodInfo : ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ ;
    public final JVMScramblingInformationGatherer.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        JVMScramblingInformationGatherer.afterMethodInfo_return retval = new JVMScramblingInformationGatherer.afterMethodInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Deprecated219=null;
        CommonTree BOOLEANLITERAL220=null;
        CommonTree Signature221=null;
        CommonTree CPINDEX222=null;
        CommonTree Exceptions227=null;
        CommonTree Synthetic229=null;
        CommonTree BOOLEANLITERAL230=null;
        JVMScramblingInformationGatherer.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations223 =null;

        JVMScramblingInformationGatherer.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info224 =null;

        JVMScramblingInformationGatherer.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations225 =null;

        JVMScramblingInformationGatherer.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations226 =null;

        JVMScramblingInformationGatherer.throwClause_return throwClause228 =null;

        JVMScramblingInformationGatherer.annotationDefault_return annotationDefault231 =null;


        CommonTree Deprecated219_tree=null;
        CommonTree BOOLEANLITERAL220_tree=null;
        CommonTree Signature221_tree=null;
        CommonTree CPINDEX222_tree=null;
        CommonTree Exceptions227_tree=null;
        CommonTree Synthetic229_tree=null;
        CommonTree BOOLEANLITERAL230_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:456:3: ( ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:456:5: ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:456:5: ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
            int cnt53=0;
            loop53:
            do {
                int alt53=10;
                switch ( input.LA(1) ) {
                case Deprecated:
                    {
                    alt53=1;
                    }
                    break;
                case Signature:
                    {
                    alt53=2;
                    }
                    break;
                case RuntimeInvisibleParameterAnnotations:
                    {
                    alt53=3;
                    }
                    break;
                case RuntimeVisibleAnnotations:
                    {
                    alt53=4;
                    }
                    break;
                case RuntimeInvisibleAnnotations:
                    {
                    alt53=5;
                    }
                    break;
                case RuntimeVisibleParameterAnnotations:
                    {
                    alt53=6;
                    }
                    break;
                case Exceptions:
                    {
                    alt53=7;
                    }
                    break;
                case Synthetic:
                    {
                    alt53=8;
                    }
                    break;
                case AnnotationDefault:
                    {
                    alt53=9;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:456:6: ^( Deprecated BOOLEANLITERAL )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Deprecated219=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfo2256); 
            	    Deprecated219_tree = (CommonTree)adaptor.dupNode(Deprecated219);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Deprecated219_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    BOOLEANLITERAL220=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2259); 
            	    BOOLEANLITERAL220_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL220);


            	    adaptor.addChild(root_1, BOOLEANLITERAL220_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:457:5: ^( Signature CPINDEX )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Signature221=(CommonTree)match(input,Signature,FOLLOW_Signature_in_afterMethodInfo2267); 
            	    Signature221_tree = (CommonTree)adaptor.dupNode(Signature221);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Signature221_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    CPINDEX222=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfo2269); 
            	    CPINDEX222_tree = (CommonTree)adaptor.dupNode(CPINDEX222);


            	    adaptor.addChild(root_1, CPINDEX222_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:458:5: runtimeInvisibleParameterAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo2276);
            	    runtimeInvisibleParameterAnnotations223=runtimeInvisibleParameterAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeInvisibleParameterAnnotations223.getTree());


            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:459:5: runtimeVisibleAnnotations_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo2282);
            	    runtimeVisibleAnnotations_info224=runtimeVisibleAnnotations_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleAnnotations_info224.getTree());


            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:460:5: runtimeInvisibleAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo2288);
            	    runtimeInvisibleAnnotations225=runtimeInvisibleAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeInvisibleAnnotations225.getTree());


            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:461:5: runtimeVisibleParameterAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo2294);
            	    runtimeVisibleParameterAnnotations226=runtimeVisibleParameterAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleParameterAnnotations226.getTree());


            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:462:5: ^( Exceptions throwClause )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Exceptions227=(CommonTree)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfo2301); 
            	    Exceptions227_tree = (CommonTree)adaptor.dupNode(Exceptions227);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Exceptions227_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_throwClause_in_afterMethodInfo2304);
            	    throwClause228=throwClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, throwClause228.getTree());


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:463:5: ^( Synthetic BOOLEANLITERAL )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Synthetic229=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfo2312); 
            	    Synthetic229_tree = (CommonTree)adaptor.dupNode(Synthetic229);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Synthetic229_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    BOOLEANLITERAL230=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2314); 
            	    BOOLEANLITERAL230_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL230);


            	    adaptor.addChild(root_1, BOOLEANLITERAL230_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:464:5: annotationDefault
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_annotationDefault_in_afterMethodInfo2321);
            	    annotationDefault231=annotationDefault();

            	    state._fsp--;

            	    adaptor.addChild(root_0, annotationDefault231.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "afterMethodInfo"


    public static class annotationDefault_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationDefault"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:467:1: annotationDefault : ^( AnnotationDefault DefaultValue annotationValue ) ;
    public final JVMScramblingInformationGatherer.annotationDefault_return annotationDefault() throws RecognitionException {
        JVMScramblingInformationGatherer.annotationDefault_return retval = new JVMScramblingInformationGatherer.annotationDefault_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationDefault232=null;
        CommonTree DefaultValue233=null;
        JVMScramblingInformationGatherer.annotationValue_return annotationValue234 =null;


        CommonTree AnnotationDefault232_tree=null;
        CommonTree DefaultValue233_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:468:3: ( ^( AnnotationDefault DefaultValue annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:468:5: ^( AnnotationDefault DefaultValue annotationValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AnnotationDefault232=(CommonTree)match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault2337); 
            AnnotationDefault232_tree = (CommonTree)adaptor.dupNode(AnnotationDefault232);


            root_1 = (CommonTree)adaptor.becomeRoot(AnnotationDefault232_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            DefaultValue233=(CommonTree)match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault2340); 
            DefaultValue233_tree = (CommonTree)adaptor.dupNode(DefaultValue233);


            adaptor.addChild(root_1, DefaultValue233_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationValue_in_annotationDefault2342);
            annotationValue234=annotationValue();

            state._fsp--;

            adaptor.addChild(root_1, annotationValue234.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationDefault"


    public static class methodSignatureInfo_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodSignatureInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:471:1: methodSignatureInfo returns [String value] : ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) ;
    public final JVMScramblingInformationGatherer.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        JVMScramblingInformationGatherer.methodSignatureInfo_return retval = new JVMScramblingInformationGatherer.methodSignatureInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature235=null;
        CommonTree PARAMDESC236=null;
        CommonTree RETDESC238=null;
        JVMScramblingInformationGatherer.bytecodeType_return bytecodeType237 =null;

        JVMScramblingInformationGatherer.returnDescriptor_return returnDescriptor239 =null;


        CommonTree Signature235_tree=null;
        CommonTree PARAMDESC236_tree=null;
        CommonTree RETDESC238_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:472:3: ( ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:472:5: ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature235=(CommonTree)match(input,Signature,FOLLOW_Signature_in_methodSignatureInfo2363); 
            Signature235_tree = (CommonTree)adaptor.dupNode(Signature235);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature235_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PARAMDESC236=(CommonTree)match(input,PARAMDESC,FOLLOW_PARAMDESC_in_methodSignatureInfo2366); 
            PARAMDESC236_tree = (CommonTree)adaptor.dupNode(PARAMDESC236);


            root_2 = (CommonTree)adaptor.becomeRoot(PARAMDESC236_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:472:29: ( bytecodeType )*
                loop54:
                do {
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==BaseType||LA54_0==IDENTIFIER||LA54_0==INTERNALTYPE||LA54_0==LBRACK) ) {
                        alt54=1;
                    }


                    switch (alt54) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:472:29: bytecodeType
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo2368);
                	    bytecodeType237=bytecodeType();

                	    state._fsp--;

                	    adaptor.addChild(root_2, bytecodeType237.getTree());


                	    }
                	    break;

                	default :
                	    break loop54;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RETDESC238=(CommonTree)match(input,RETDESC,FOLLOW_RETDESC_in_methodSignatureInfo2373); 
            RETDESC238_tree = (CommonTree)adaptor.dupNode(RETDESC238);


            root_2 = (CommonTree)adaptor.becomeRoot(RETDESC238_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo2375);
            returnDescriptor239=returnDescriptor();

            state._fsp--;

            adaptor.addChild(root_2, returnDescriptor239.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            retval.value = "(" + (((bytecodeType237!=null?bytecodeType237.value:null) == null) ? "" : (bytecodeType237!=null?bytecodeType237.value:null)) + ")" + (returnDescriptor239!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(returnDescriptor239.start),input.getTreeAdaptor().getTokenStopIndex(returnDescriptor239.start))):null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodSignatureInfo"


    public static class returnDescriptor_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:476:1: returnDescriptor : ( bytecodeType | VoidType );
    public final JVMScramblingInformationGatherer.returnDescriptor_return returnDescriptor() throws RecognitionException {
        JVMScramblingInformationGatherer.returnDescriptor_return retval = new JVMScramblingInformationGatherer.returnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VoidType241=null;
        JVMScramblingInformationGatherer.bytecodeType_return bytecodeType240 =null;


        CommonTree VoidType241_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:477:3: ( bytecodeType | VoidType )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==BaseType||LA55_0==IDENTIFIER||LA55_0==INTERNALTYPE||LA55_0==LBRACK) ) {
                alt55=1;
            }
            else if ( (LA55_0==VoidType) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:477:5: bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor2395);
                    bytecodeType240=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType240.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:477:20: VoidType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VoidType241=(CommonTree)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor2399); 
                    VoidType241_tree = (CommonTree)adaptor.dupNode(VoidType241);


                    adaptor.addChild(root_0, VoidType241_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnDescriptor"


    public static class method_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:480:1: method_modifier : ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP );
    public final JVMScramblingInformationGatherer.method_modifier_return method_modifier() throws RecognitionException {
        JVMScramblingInformationGatherer.method_modifier_return retval = new JVMScramblingInformationGatherer.method_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set242=null;

        CommonTree set242_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:481:3: ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set242=(CommonTree)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL||input.LA(1)==NATIVE||input.LA(1)==STATIC||input.LA(1)==STRICTFP||input.LA(1)==SYNCHRONIZED ) {
                input.consume();
                set242_tree = (CommonTree)adaptor.dupNode(set242);


                adaptor.addChild(root_0, set242_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_modifier"


    public static class method_visual_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:484:1: method_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMScramblingInformationGatherer.method_visual_modifier_return method_visual_modifier() throws RecognitionException {
        JVMScramblingInformationGatherer.method_visual_modifier_return retval = new JVMScramblingInformationGatherer.method_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set243=null;

        CommonTree set243_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:485:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set243=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                set243_tree = (CommonTree)adaptor.dupNode(set243);


                adaptor.addChild(root_0, set243_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_visual_modifier"


    public static class arguments_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:488:1: arguments : ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) ;
    public final JVMScramblingInformationGatherer.arguments_return arguments() throws RecognitionException {
        JVMScramblingInformationGatherer.arguments_return retval = new JVMScramblingInformationGatherer.arguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITARGUMENTS244=null;
        CommonTree DOT246=null;
        CommonTree DOT247=null;
        CommonTree DOT248=null;
        JVMScramblingInformationGatherer.typeList_return typeList245 =null;


        CommonTree UNITARGUMENTS244_tree=null;
        CommonTree DOT246_tree=null;
        CommonTree DOT247_tree=null;
        CommonTree DOT248_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:489:3: ( ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:489:5: ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITARGUMENTS244=(CommonTree)match(input,UNITARGUMENTS,FOLLOW_UNITARGUMENTS_in_arguments2471); 
            UNITARGUMENTS244_tree = (CommonTree)adaptor.dupNode(UNITARGUMENTS244);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITARGUMENTS244_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:489:21: ( typeList )?
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==BOOLEAN||LA56_0==BYTE||LA56_0==CHAR||LA56_0==DOUBLE||LA56_0==FLOAT||LA56_0==INT||LA56_0==LONG||LA56_0==SHORT||LA56_0==UNITNAME||LA56_0==VOID) ) {
                    alt56=1;
                }
                switch (alt56) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:489:21: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_arguments2473);
                        typeList245=typeList();

                        state._fsp--;

                        adaptor.addChild(root_1, typeList245.getTree());


                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:489:31: ( DOT DOT DOT )?
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==DOT) ) {
                    alt57=1;
                }
                switch (alt57) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:489:32: DOT DOT DOT
                        {
                        _last = (CommonTree)input.LT(1);
                        DOT246=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2477); 
                        DOT246_tree = (CommonTree)adaptor.dupNode(DOT246);


                        adaptor.addChild(root_1, DOT246_tree);


                        _last = (CommonTree)input.LT(1);
                        DOT247=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2479); 
                        DOT247_tree = (CommonTree)adaptor.dupNode(DOT247);


                        adaptor.addChild(root_1, DOT247_tree);


                        _last = (CommonTree)input.LT(1);
                        DOT248=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2481); 
                        DOT248_tree = (CommonTree)adaptor.dupNode(DOT248);


                        adaptor.addChild(root_1, DOT248_tree);


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class body_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:496:1: body : ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* ;
    public final JVMScramblingInformationGatherer.body_return body() throws RecognitionException {
        JVMScramblingInformationGatherer.body_return retval = new JVMScramblingInformationGatherer.body_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Synthetic249=null;
        CommonTree BOOLEANLITERAL250=null;
        CommonTree Code251=null;
        JVMScramblingInformationGatherer.codeBlock_return codeBlock252 =null;

        JVMScramblingInformationGatherer.bodyExtension_return bodyExtension253 =null;


        CommonTree Synthetic249_tree=null;
        CommonTree BOOLEANLITERAL250_tree=null;
        CommonTree Code251_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:497:3: ( ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:497:5: ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:497:5: ( Synthetic BOOLEANLITERAL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Synthetic) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:497:6: Synthetic BOOLEANLITERAL
                    {
                    _last = (CommonTree)input.LT(1);
                    Synthetic249=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_body2506); 
                    Synthetic249_tree = (CommonTree)adaptor.dupNode(Synthetic249);


                    adaptor.addChild(root_0, Synthetic249_tree);


                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL250=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_body2508); 
                    BOOLEANLITERAL250_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL250);


                    adaptor.addChild(root_0, BOOLEANLITERAL250_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Code251=(CommonTree)match(input,Code,FOLLOW_Code_in_body2513); 
            Code251_tree = (CommonTree)adaptor.dupNode(Code251);


            root_1 = (CommonTree)adaptor.becomeRoot(Code251_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_body2515);
            codeBlock252=codeBlock();

            state._fsp--;

            adaptor.addChild(root_1, codeBlock252.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:497:51: ( bodyExtension )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==ExceptionTable||(LA59_0 >= LineNumberTable && LA59_0 <= LocalVariableTypeTable)||(LA59_0 >= StackMap && LA59_0 <= StackMapTable)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:497:51: bodyExtension
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bodyExtension_in_body2518);
            	    bodyExtension253=bodyExtension();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bodyExtension253.getTree());


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "body"


    public static class bodyExtension_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bodyExtension"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:500:1: bodyExtension : ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) ) ;
    public final JVMScramblingInformationGatherer.bodyExtension_return bodyExtension() throws RecognitionException {
        JVMScramblingInformationGatherer.bodyExtension_return retval = new JVMScramblingInformationGatherer.bodyExtension_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ExceptionTable254=null;
        CommonTree LineNumberTable256=null;
        CommonTree LocalVariableTable258=null;
        CommonTree LocalVariableTypeTable260=null;
        CommonTree StackMapTable262=null;
        CommonTree StackMap264=null;
        JVMScramblingInformationGatherer.exceptionTable_return exceptionTable255 =null;

        JVMScramblingInformationGatherer.lineNumberTable_return lineNumberTable257 =null;

        JVMScramblingInformationGatherer.localVariableTable_return localVariableTable259 =null;

        JVMScramblingInformationGatherer.localVariableTable_return localVariableTable261 =null;

        JVMScramblingInformationGatherer.stackMapTable_return stackMapTable263 =null;

        JVMScramblingInformationGatherer.stackMapTypeTable_return stackMapTypeTable265 =null;


        CommonTree ExceptionTable254_tree=null;
        CommonTree LineNumberTable256_tree=null;
        CommonTree LocalVariableTable258_tree=null;
        CommonTree LocalVariableTypeTable260_tree=null;
        CommonTree StackMapTable262_tree=null;
        CommonTree StackMap264_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:501:3: ( ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:502:3: ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:502:3: ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) )
            int alt61=6;
            switch ( input.LA(1) ) {
            case ExceptionTable:
                {
                alt61=1;
                }
                break;
            case LineNumberTable:
                {
                alt61=2;
                }
                break;
            case LocalVariableTable:
                {
                alt61=3;
                }
                break;
            case LocalVariableTypeTable:
                {
                alt61=4;
                }
                break;
            case StackMapTable:
                {
                alt61=5;
                }
                break;
            case StackMap:
                {
                alt61=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:502:5: ^( ExceptionTable exceptionTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ExceptionTable254=(CommonTree)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension2539); 
                    ExceptionTable254_tree = (CommonTree)adaptor.dupNode(ExceptionTable254);


                    root_1 = (CommonTree)adaptor.becomeRoot(ExceptionTable254_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension2542);
                    exceptionTable255=exceptionTable();

                    state._fsp--;

                    adaptor.addChild(root_1, exceptionTable255.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:503:5: ^( LineNumberTable ( lineNumberTable )? )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LineNumberTable256=(CommonTree)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension2550); 
                    LineNumberTable256_tree = (CommonTree)adaptor.dupNode(LineNumberTable256);


                    root_1 = (CommonTree)adaptor.becomeRoot(LineNumberTable256_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:503:24: ( lineNumberTable )?
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==IDENTIFIER) ) {
                            alt60=1;
                        }
                        switch (alt60) {
                            case 1 :
                                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:503:24: lineNumberTable
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_lineNumberTable_in_bodyExtension2553);
                                lineNumberTable257=lineNumberTable();

                                state._fsp--;

                                adaptor.addChild(root_1, lineNumberTable257.getTree());


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:504:5: ^( LocalVariableTable localVariableTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LocalVariableTable258=(CommonTree)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension2562); 
                    LocalVariableTable258_tree = (CommonTree)adaptor.dupNode(LocalVariableTable258);


                    root_1 = (CommonTree)adaptor.becomeRoot(LocalVariableTable258_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension2565);
                    localVariableTable259=localVariableTable();

                    state._fsp--;

                    adaptor.addChild(root_1, localVariableTable259.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:505:5: ^( LocalVariableTypeTable localVariableTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LocalVariableTypeTable260=(CommonTree)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension2573); 
                    LocalVariableTypeTable260_tree = (CommonTree)adaptor.dupNode(LocalVariableTypeTable260);


                    root_1 = (CommonTree)adaptor.becomeRoot(LocalVariableTypeTable260_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension2576);
                    localVariableTable261=localVariableTable();

                    state._fsp--;

                    adaptor.addChild(root_1, localVariableTable261.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:506:5: ^( StackMapTable stackMapTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    StackMapTable262=(CommonTree)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension2584); 
                    StackMapTable262_tree = (CommonTree)adaptor.dupNode(StackMapTable262);


                    root_1 = (CommonTree)adaptor.becomeRoot(StackMapTable262_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension2586);
                    stackMapTable263=stackMapTable();

                    state._fsp--;

                    adaptor.addChild(root_1, stackMapTable263.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:507:5: ^( StackMap stackMapTypeTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    StackMap264=(CommonTree)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension2594); 
                    StackMap264_tree = (CommonTree)adaptor.dupNode(StackMap264);


                    root_1 = (CommonTree)adaptor.becomeRoot(StackMap264_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension2596);
                    stackMapTypeTable265=stackMapTypeTable();

                    state._fsp--;

                    adaptor.addChild(root_1, stackMapTypeTable265.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bodyExtension"


    public static class codeBlock_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeBlock"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:511:1: codeBlock : ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) ;
    public final JVMScramblingInformationGatherer.codeBlock_return codeBlock() throws RecognitionException {
        JVMScramblingInformationGatherer.codeBlock_return retval = new JVMScramblingInformationGatherer.codeBlock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VARINFO266=null;
        CommonTree INSTRUCTION268=null;
        JVMScramblingInformationGatherer.variables_return variables267 =null;

        JVMScramblingInformationGatherer.instructionSet_return instructionSet269 =null;

        JVMScramblingInformationGatherer.codeBlockEnd_return codeBlockEnd270 =null;


        CommonTree VARINFO266_tree=null;
        CommonTree INSTRUCTION268_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:512:3: ( ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:512:5: ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VARINFO266=(CommonTree)match(input,VARINFO,FOLLOW_VARINFO_in_codeBlock2615); 
            VARINFO266_tree = (CommonTree)adaptor.dupNode(VARINFO266);


            root_1 = (CommonTree)adaptor.becomeRoot(VARINFO266_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variables_in_codeBlock2617);
            variables267=variables();

            state._fsp--;

            adaptor.addChild(root_1, variables267.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INSTRUCTION268=(CommonTree)match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_codeBlock2621); 
            INSTRUCTION268_tree = (CommonTree)adaptor.dupNode(INSTRUCTION268);


            root_1 = (CommonTree)adaptor.becomeRoot(INSTRUCTION268_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:512:40: ( instructionSet )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==IDENTIFIER) ) {
                    int LA62_1 = input.LA(2);

                    if ( (LA62_1==DOWN) ) {
                        int LA62_3 = input.LA(3);

                        if ( (LA62_3==INTLITERAL) ) {
                            int LA62_4 = input.LA(4);

                            if ( (LA62_4==COLON) ) {
                                int LA62_5 = input.LA(5);

                                if ( (LA62_5==OPERAND) ) {
                                    alt62=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA62_0==SWITCH) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:512:40: instructionSet
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_instructionSet_in_codeBlock2623);
            	    instructionSet269=instructionSet();

            	    state._fsp--;

            	    adaptor.addChild(root_1, instructionSet269.getTree());


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock2626);
            codeBlockEnd270=codeBlockEnd();

            state._fsp--;

            adaptor.addChild(root_1, codeBlockEnd270.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "codeBlock"


    public static class instructionSet_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instructionSet"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:515:1: instructionSet : ( codeLine | javaSwitch );
    public final JVMScramblingInformationGatherer.instructionSet_return instructionSet() throws RecognitionException {
        JVMScramblingInformationGatherer.instructionSet_return retval = new JVMScramblingInformationGatherer.instructionSet_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.codeLine_return codeLine271 =null;

        JVMScramblingInformationGatherer.javaSwitch_return javaSwitch272 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:516:3: ( codeLine | javaSwitch )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==IDENTIFIER) ) {
                alt63=1;
            }
            else if ( (LA63_0==SWITCH) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:516:5: codeLine
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_codeLine_in_instructionSet2640);
                    codeLine271=codeLine();

                    state._fsp--;

                    adaptor.addChild(root_0, codeLine271.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:516:16: javaSwitch
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_javaSwitch_in_instructionSet2644);
                    javaSwitch272=javaSwitch();

                    state._fsp--;

                    adaptor.addChild(root_0, javaSwitch272.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instructionSet"


    public static class codeLine_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:519:1: codeLine : ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) ;
    public final JVMScramblingInformationGatherer.codeLine_return codeLine() throws RecognitionException {
        JVMScramblingInformationGatherer.codeLine_return retval = new JVMScramblingInformationGatherer.codeLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER273=null;
        CommonTree OPERAND275=null;
        CommonTree OPERAND277=null;
        CommonTree INTLITERAL278=null;
        JVMScramblingInformationGatherer.pc_return pc274 =null;

        JVMScramblingInformationGatherer.operand1_return operand1276 =null;


        CommonTree IDENTIFIER273_tree=null;
        CommonTree OPERAND275_tree=null;
        CommonTree OPERAND277_tree=null;
        CommonTree INTLITERAL278_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:520:3: ( ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:520:5: ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER273=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine2658); 
            IDENTIFIER273_tree = (CommonTree)adaptor.dupNode(IDENTIFIER273);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER273_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_codeLine2660);
            pc274=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc274.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OPERAND275=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_codeLine2663); 
            OPERAND275_tree = (CommonTree)adaptor.dupNode(OPERAND275);


            root_2 = (CommonTree)adaptor.becomeRoot(OPERAND275_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:520:31: ( operand1 )?
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==BOOLEAN||LA64_0==BYTE||LA64_0==CHAR||LA64_0==CPINDEX||LA64_0==DOUBLE||LA64_0==FLOAT||LA64_0==INT||LA64_0==INTLITERAL||LA64_0==LONG||LA64_0==SHORT||LA64_0==VOID) ) {
                    alt64=1;
                }
                switch (alt64) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:520:31: operand1
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_operand1_in_codeLine2665);
                        operand1276=operand1();

                        state._fsp--;

                        adaptor.addChild(root_2, operand1276.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OPERAND277=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_codeLine2670); 
            OPERAND277_tree = (CommonTree)adaptor.dupNode(OPERAND277);


            root_2 = (CommonTree)adaptor.becomeRoot(OPERAND277_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:520:52: ( INTLITERAL )?
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==INTLITERAL) ) {
                    alt65=1;
                }
                switch (alt65) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:520:52: INTLITERAL
                        {
                        _last = (CommonTree)input.LT(1);
                        INTLITERAL278=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeLine2672); 
                        INTLITERAL278_tree = (CommonTree)adaptor.dupNode(INTLITERAL278);


                        adaptor.addChild(root_2, INTLITERAL278_tree);


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "codeLine"


    public static class codeBlockEnd_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeBlockEnd"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:523:1: codeBlockEnd : ^( IDENTIFIER pc ( INTLITERAL )? ) ;
    public final JVMScramblingInformationGatherer.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        JVMScramblingInformationGatherer.codeBlockEnd_return retval = new JVMScramblingInformationGatherer.codeBlockEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER279=null;
        CommonTree INTLITERAL281=null;
        JVMScramblingInformationGatherer.pc_return pc280 =null;


        CommonTree IDENTIFIER279_tree=null;
        CommonTree INTLITERAL281_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:524:3: ( ^( IDENTIFIER pc ( INTLITERAL )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:524:5: ^( IDENTIFIER pc ( INTLITERAL )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER279=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd2689); 
            IDENTIFIER279_tree = (CommonTree)adaptor.dupNode(IDENTIFIER279);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER279_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_codeBlockEnd2691);
            pc280=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc280.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:524:21: ( INTLITERAL )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==INTLITERAL) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:524:21: INTLITERAL
                    {
                    _last = (CommonTree)input.LT(1);
                    INTLITERAL281=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeBlockEnd2693); 
                    INTLITERAL281_tree = (CommonTree)adaptor.dupNode(INTLITERAL281);


                    adaptor.addChild(root_1, INTLITERAL281_tree);


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "codeBlockEnd"


    public static class operand1_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operand1"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:527:1: operand1 : ( CPINDEX | INTLITERAL | primitiveType );
    public final JVMScramblingInformationGatherer.operand1_return operand1() throws RecognitionException {
        JVMScramblingInformationGatherer.operand1_return retval = new JVMScramblingInformationGatherer.operand1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX282=null;
        CommonTree INTLITERAL283=null;
        JVMScramblingInformationGatherer.primitiveType_return primitiveType284 =null;


        CommonTree CPINDEX282_tree=null;
        CommonTree INTLITERAL283_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:528:3: ( CPINDEX | INTLITERAL | primitiveType )
            int alt67=3;
            switch ( input.LA(1) ) {
            case CPINDEX:
                {
                alt67=1;
                }
                break;
            case INTLITERAL:
                {
                alt67=2;
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
            case VOID:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }

            switch (alt67) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:528:5: CPINDEX
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CPINDEX282=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_operand12710); 
                    CPINDEX282_tree = (CommonTree)adaptor.dupNode(CPINDEX282);


                    adaptor.addChild(root_0, CPINDEX282_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:529:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL283=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_operand12717); 
                    INTLITERAL283_tree = (CommonTree)adaptor.dupNode(INTLITERAL283);


                    adaptor.addChild(root_0, INTLITERAL283_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:530:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_operand12723);
                    primitiveType284=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType284.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operand1"


    public static class variables_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variables"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:533:1: variables : variable variable variable ;
    public final JVMScramblingInformationGatherer.variables_return variables() throws RecognitionException {
        JVMScramblingInformationGatherer.variables_return retval = new JVMScramblingInformationGatherer.variables_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.variable_return variable285 =null;

        JVMScramblingInformationGatherer.variable_return variable286 =null;

        JVMScramblingInformationGatherer.variable_return variable287 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:534:3: ( variable variable variable )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:534:5: variable variable variable
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2736);
            variable285=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable285.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2738);
            variable286=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable286.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2740);
            variable287=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable287.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variables"


    public static class variable_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:537:1: variable : ^( ASSIGN IDENTIFIER INTLITERAL ) ;
    public final JVMScramblingInformationGatherer.variable_return variable() throws RecognitionException {
        JVMScramblingInformationGatherer.variable_return retval = new JVMScramblingInformationGatherer.variable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN288=null;
        CommonTree IDENTIFIER289=null;
        CommonTree INTLITERAL290=null;

        CommonTree ASSIGN288_tree=null;
        CommonTree IDENTIFIER289_tree=null;
        CommonTree INTLITERAL290_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:538:3: ( ^( ASSIGN IDENTIFIER INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:538:5: ^( ASSIGN IDENTIFIER INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN288=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable2754); 
            ASSIGN288_tree = (CommonTree)adaptor.dupNode(ASSIGN288);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN288_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER289=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable2756); 
            IDENTIFIER289_tree = (CommonTree)adaptor.dupNode(IDENTIFIER289);


            adaptor.addChild(root_1, IDENTIFIER289_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL290=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable2758); 
            INTLITERAL290_tree = (CommonTree)adaptor.dupNode(INTLITERAL290);


            adaptor.addChild(root_1, INTLITERAL290_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class javaSwitch_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "javaSwitch"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:541:1: javaSwitch : ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) ;
    public final JVMScramblingInformationGatherer.javaSwitch_return javaSwitch() throws RecognitionException {
        JVMScramblingInformationGatherer.javaSwitch_return retval = new JVMScramblingInformationGatherer.javaSwitch_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SWITCH291=null;
        CommonTree IDENTIFIER292=null;
        JVMScramblingInformationGatherer.pc_return pc293 =null;

        JVMScramblingInformationGatherer.switchLine_return switchLine294 =null;

        JVMScramblingInformationGatherer.switchDefaultLine_return switchDefaultLine295 =null;


        CommonTree SWITCH291_tree=null;
        CommonTree IDENTIFIER292_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:542:3: ( ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:542:5: ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SWITCH291=(CommonTree)match(input,SWITCH,FOLLOW_SWITCH_in_javaSwitch2775); 
            SWITCH291_tree = (CommonTree)adaptor.dupNode(SWITCH291);


            root_1 = (CommonTree)adaptor.becomeRoot(SWITCH291_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER292=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch2778); 
            IDENTIFIER292_tree = (CommonTree)adaptor.dupNode(IDENTIFIER292);


            root_2 = (CommonTree)adaptor.becomeRoot(IDENTIFIER292_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_javaSwitch2780);
            pc293=pc();

            state._fsp--;

            adaptor.addChild(root_2, pc293.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:542:30: ( switchLine )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==INTLITERAL) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:542:30: switchLine
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch2782);
            	    switchLine294=switchLine();

            	    state._fsp--;

            	    adaptor.addChild(root_2, switchLine294.getTree());


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch2785);
            switchDefaultLine295=switchDefaultLine();

            state._fsp--;

            adaptor.addChild(root_2, switchDefaultLine295.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "javaSwitch"


    public static class switchLine_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:545:1: switchLine : pc INTLITERAL ;
    public final JVMScramblingInformationGatherer.switchLine_return switchLine() throws RecognitionException {
        JVMScramblingInformationGatherer.switchLine_return retval = new JVMScramblingInformationGatherer.switchLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL297=null;
        JVMScramblingInformationGatherer.pc_return pc296 =null;


        CommonTree INTLITERAL297_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:546:3: ( pc INTLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:546:5: pc INTLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_switchLine2802);
            pc296=pc();

            state._fsp--;

            adaptor.addChild(root_0, pc296.getTree());


            _last = (CommonTree)input.LT(1);
            INTLITERAL297=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine2804); 
            INTLITERAL297_tree = (CommonTree)adaptor.dupNode(INTLITERAL297);


            adaptor.addChild(root_0, INTLITERAL297_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switchLine"


    public static class switchDefaultLine_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchDefaultLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:549:1: switchDefaultLine : ^( DEFAULT INTLITERAL ) ;
    public final JVMScramblingInformationGatherer.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        JVMScramblingInformationGatherer.switchDefaultLine_return retval = new JVMScramblingInformationGatherer.switchDefaultLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT298=null;
        CommonTree INTLITERAL299=null;

        CommonTree DEFAULT298_tree=null;
        CommonTree INTLITERAL299_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:550:3: ( ^( DEFAULT INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:550:5: ^( DEFAULT INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DEFAULT298=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine2819); 
            DEFAULT298_tree = (CommonTree)adaptor.dupNode(DEFAULT298);


            root_1 = (CommonTree)adaptor.becomeRoot(DEFAULT298_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INTLITERAL299=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine2821); 
            INTLITERAL299_tree = (CommonTree)adaptor.dupNode(INTLITERAL299);


            adaptor.addChild(root_1, INTLITERAL299_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switchDefaultLine"


    public static class throwClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "throwClause"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:557:1: throwClause : ^( THROWS typeList ) ;
    public final JVMScramblingInformationGatherer.throwClause_return throwClause() throws RecognitionException {
        JVMScramblingInformationGatherer.throwClause_return retval = new JVMScramblingInformationGatherer.throwClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROWS300=null;
        JVMScramblingInformationGatherer.typeList_return typeList301 =null;


        CommonTree THROWS300_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:558:3: ( ^( THROWS typeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:558:5: ^( THROWS typeList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWS300=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClause2841); 
            THROWS300_tree = (CommonTree)adaptor.dupNode(THROWS300);


            root_1 = (CommonTree)adaptor.becomeRoot(THROWS300_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeList_in_throwClause2843);
            typeList301=typeList();

            state._fsp--;

            adaptor.addChild(root_1, typeList301.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "throwClause"


    public static class throwClauseMethod_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "throwClauseMethod"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:561:1: throwClauseMethod : ^( THROWS ( throwType )+ ) ;
    public final JVMScramblingInformationGatherer.throwClauseMethod_return throwClauseMethod() throws RecognitionException {
        JVMScramblingInformationGatherer.throwClauseMethod_return retval = new JVMScramblingInformationGatherer.throwClauseMethod_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROWS302=null;
        JVMScramblingInformationGatherer.throwType_return throwType303 =null;


        CommonTree THROWS302_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:562:3: ( ^( THROWS ( throwType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:562:5: ^( THROWS ( throwType )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWS302=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClauseMethod2860); 
            THROWS302_tree = (CommonTree)adaptor.dupNode(THROWS302);


            root_1 = (CommonTree)adaptor.becomeRoot(THROWS302_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:562:14: ( throwType )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==IDENTIFIER||LA69_0==INTERNALTYPE||LA69_0==QualifiedType) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:562:14: throwType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_throwType_in_throwClauseMethod2862);
            	    throwType303=throwType();

            	    state._fsp--;

            	    adaptor.addChild(root_1, throwType303.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "throwClauseMethod"


    public static class throwType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "throwType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:565:1: throwType : ( INTERNALTYPE | IDENTIFIER | QualifiedType );
    public final JVMScramblingInformationGatherer.throwType_return throwType() throws RecognitionException {
        JVMScramblingInformationGatherer.throwType_return retval = new JVMScramblingInformationGatherer.throwType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set304=null;

        CommonTree set304_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:566:3: ( INTERNALTYPE | IDENTIFIER | QualifiedType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set304=(CommonTree)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE||input.LA(1)==QualifiedType ) {
                input.consume();
                set304_tree = (CommonTree)adaptor.dupNode(set304);


                adaptor.addChild(root_0, set304_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "throwType"


    public static class exceptionTable_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exceptionTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:569:1: exceptionTable : ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) ;
    public final JVMScramblingInformationGatherer.exceptionTable_return exceptionTable() throws RecognitionException {
        JVMScramblingInformationGatherer.exceptionTable_return retval = new JVMScramblingInformationGatherer.exceptionTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ETHEADER305=null;
        CommonTree IDENTIFIER306=null;
        CommonTree IDENTIFIER307=null;
        CommonTree IDENTIFIER308=null;
        CommonTree IDENTIFIER309=null;
        CommonTree ETENTRY310=null;
        JVMScramblingInformationGatherer.exceptionTableEntry_return exceptionTableEntry311 =null;


        CommonTree ETHEADER305_tree=null;
        CommonTree IDENTIFIER306_tree=null;
        CommonTree IDENTIFIER307_tree=null;
        CommonTree IDENTIFIER308_tree=null;
        CommonTree IDENTIFIER309_tree=null;
        CommonTree ETENTRY310_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:570:3: ( ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:570:5: ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ETHEADER305=(CommonTree)match(input,ETHEADER,FOLLOW_ETHEADER_in_exceptionTable2901); 
            ETHEADER305_tree = (CommonTree)adaptor.dupNode(ETHEADER305);


            root_1 = (CommonTree)adaptor.becomeRoot(ETHEADER305_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER306=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2903); 
            IDENTIFIER306_tree = (CommonTree)adaptor.dupNode(IDENTIFIER306);


            adaptor.addChild(root_1, IDENTIFIER306_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER307=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2905); 
            IDENTIFIER307_tree = (CommonTree)adaptor.dupNode(IDENTIFIER307);


            adaptor.addChild(root_1, IDENTIFIER307_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER308=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2907); 
            IDENTIFIER308_tree = (CommonTree)adaptor.dupNode(IDENTIFIER308);


            adaptor.addChild(root_1, IDENTIFIER308_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER309=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2909); 
            IDENTIFIER309_tree = (CommonTree)adaptor.dupNode(IDENTIFIER309);


            adaptor.addChild(root_1, IDENTIFIER309_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ETENTRY310=(CommonTree)match(input,ETENTRY,FOLLOW_ETENTRY_in_exceptionTable2913); 
            ETENTRY310_tree = (CommonTree)adaptor.dupNode(ETENTRY310);


            root_1 = (CommonTree)adaptor.becomeRoot(ETENTRY310_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:570:71: ( exceptionTableEntry )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==INTLITERAL) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:570:71: exceptionTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable2915);
            	    exceptionTableEntry311=exceptionTableEntry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, exceptionTableEntry311.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exceptionTable"


    public static class exceptionTableEntry_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exceptionTableEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:573:1: exceptionTableEntry : INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue ;
    public final JVMScramblingInformationGatherer.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        JVMScramblingInformationGatherer.exceptionTableEntry_return retval = new JVMScramblingInformationGatherer.exceptionTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL312=null;
        CommonTree INTLITERAL313=null;
        CommonTree INTLITERAL314=null;
        JVMScramblingInformationGatherer.exceptionTableEntryValue_return exceptionTableEntryValue315 =null;


        CommonTree INTLITERAL312_tree=null;
        CommonTree INTLITERAL313_tree=null;
        CommonTree INTLITERAL314_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:574:3: ( INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:574:5: INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL312=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2930); 
            INTLITERAL312_tree = (CommonTree)adaptor.dupNode(INTLITERAL312);


            adaptor.addChild(root_0, INTLITERAL312_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL313=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2932); 
            INTLITERAL313_tree = (CommonTree)adaptor.dupNode(INTLITERAL313);


            adaptor.addChild(root_0, INTLITERAL313_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL314=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2934); 
            INTLITERAL314_tree = (CommonTree)adaptor.dupNode(INTLITERAL314);


            adaptor.addChild(root_0, INTLITERAL314_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry2936);
            exceptionTableEntryValue315=exceptionTableEntryValue();

            state._fsp--;

            adaptor.addChild(root_0, exceptionTableEntryValue315.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exceptionTableEntry"


    public static class exceptionTableEntryValue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exceptionTableEntryValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:576:1: exceptionTableEntryValue : ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE );
    public final JVMScramblingInformationGatherer.exceptionTableEntryValue_return exceptionTableEntryValue() throws RecognitionException {
        JVMScramblingInformationGatherer.exceptionTableEntryValue_return retval = new JVMScramblingInformationGatherer.exceptionTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER317=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE318=null;
        JVMScramblingInformationGatherer.primitiveType_return primitiveType316 =null;


        CommonTree IDENTIFIER317_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE318_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:577:3: ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
            int alt71=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
            case VOID:
                {
                alt71=1;
                }
                break;
            case IDENTIFIER:
                {
                alt71=2;
                }
                break;
            case CONSTANT_TYPE_ASSIGNABLE:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }

            switch (alt71) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:577:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntryValue2948);
                    primitiveType316=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType316.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:578:5: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER317=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntryValue2954); 
                    IDENTIFIER317_tree = (CommonTree)adaptor.dupNode(IDENTIFIER317);


                    adaptor.addChild(root_0, IDENTIFIER317_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:579:5: CONSTANT_TYPE_ASSIGNABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CONSTANT_TYPE_ASSIGNABLE318=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue2960); 
                    CONSTANT_TYPE_ASSIGNABLE318_tree = (CommonTree)adaptor.dupNode(CONSTANT_TYPE_ASSIGNABLE318);


                    adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE318_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exceptionTableEntryValue"


    public static class lineNumberTable_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lineNumberTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:586:1: lineNumberTable : ( lineNumberTableLine )+ ;
    public final JVMScramblingInformationGatherer.lineNumberTable_return lineNumberTable() throws RecognitionException {
        JVMScramblingInformationGatherer.lineNumberTable_return retval = new JVMScramblingInformationGatherer.lineNumberTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.lineNumberTableLine_return lineNumberTableLine319 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:587:3: ( ( lineNumberTableLine )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:587:5: ( lineNumberTableLine )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:587:5: ( lineNumberTableLine )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==IDENTIFIER) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:587:5: lineNumberTableLine
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable2979);
            	    lineNumberTableLine319=lineNumberTableLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lineNumberTableLine319.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lineNumberTable"


    public static class lineNumberTableLine_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lineNumberTableLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:590:1: lineNumberTableLine : ^( IDENTIFIER pc INTLITERAL ) ;
    public final JVMScramblingInformationGatherer.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        JVMScramblingInformationGatherer.lineNumberTableLine_return retval = new JVMScramblingInformationGatherer.lineNumberTableLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER320=null;
        CommonTree INTLITERAL322=null;
        JVMScramblingInformationGatherer.pc_return pc321 =null;


        CommonTree IDENTIFIER320_tree=null;
        CommonTree INTLITERAL322_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:591:3: ( ^( IDENTIFIER pc INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:591:5: ^( IDENTIFIER pc INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER320=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine2994); 
            IDENTIFIER320_tree = (CommonTree)adaptor.dupNode(IDENTIFIER320);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER320_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_lineNumberTableLine2996);
            pc321=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc321.getTree());


            _last = (CommonTree)input.LT(1);
            INTLITERAL322=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine2998); 
            INTLITERAL322_tree = (CommonTree)adaptor.dupNode(INTLITERAL322);


            adaptor.addChild(root_1, INTLITERAL322_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lineNumberTableLine"


    public static class localVariableTable_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:598:1: localVariableTable : ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) ;
    public final JVMScramblingInformationGatherer.localVariableTable_return localVariableTable() throws RecognitionException {
        JVMScramblingInformationGatherer.localVariableTable_return retval = new JVMScramblingInformationGatherer.localVariableTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LVHEADER323=null;
        CommonTree IDENTIFIER324=null;
        CommonTree IDENTIFIER325=null;
        CommonTree IDENTIFIER326=null;
        CommonTree IDENTIFIER327=null;
        CommonTree IDENTIFIER328=null;
        CommonTree LVENTRY329=null;
        JVMScramblingInformationGatherer.localVariableTableLine_return localVariableTableLine330 =null;


        CommonTree LVHEADER323_tree=null;
        CommonTree IDENTIFIER324_tree=null;
        CommonTree IDENTIFIER325_tree=null;
        CommonTree IDENTIFIER326_tree=null;
        CommonTree IDENTIFIER327_tree=null;
        CommonTree IDENTIFIER328_tree=null;
        CommonTree LVENTRY329_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:599:3: ( ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:599:5: ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            LVHEADER323=(CommonTree)match(input,LVHEADER,FOLLOW_LVHEADER_in_localVariableTable3021); 
            LVHEADER323_tree = (CommonTree)adaptor.dupNode(LVHEADER323);


            root_1 = (CommonTree)adaptor.becomeRoot(LVHEADER323_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER324=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable3023); 
            IDENTIFIER324_tree = (CommonTree)adaptor.dupNode(IDENTIFIER324);


            adaptor.addChild(root_1, IDENTIFIER324_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER325=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable3025); 
            IDENTIFIER325_tree = (CommonTree)adaptor.dupNode(IDENTIFIER325);


            adaptor.addChild(root_1, IDENTIFIER325_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER326=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable3027); 
            IDENTIFIER326_tree = (CommonTree)adaptor.dupNode(IDENTIFIER326);


            adaptor.addChild(root_1, IDENTIFIER326_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER327=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable3029); 
            IDENTIFIER327_tree = (CommonTree)adaptor.dupNode(IDENTIFIER327);


            adaptor.addChild(root_1, IDENTIFIER327_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER328=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable3031); 
            IDENTIFIER328_tree = (CommonTree)adaptor.dupNode(IDENTIFIER328);


            adaptor.addChild(root_1, IDENTIFIER328_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            LVENTRY329=(CommonTree)match(input,LVENTRY,FOLLOW_LVENTRY_in_localVariableTable3035); 
            LVENTRY329_tree = (CommonTree)adaptor.dupNode(LVENTRY329);


            root_1 = (CommonTree)adaptor.becomeRoot(LVENTRY329_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:599:82: ( localVariableTableLine )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==INTLITERAL) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:599:82: localVariableTableLine
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable3037);
                	    localVariableTableLine330=localVariableTableLine();

                	    state._fsp--;

                	    adaptor.addChild(root_1, localVariableTableLine330.getTree());


                	    }
                	    break;

                	default :
                	    break loop73;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableTable"


    public static class localVariableTableLine_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableTableLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:602:1: localVariableTableLine : INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType ;
    public final JVMScramblingInformationGatherer.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        JVMScramblingInformationGatherer.localVariableTableLine_return retval = new JVMScramblingInformationGatherer.localVariableTableLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL331=null;
        CommonTree INTLITERAL332=null;
        CommonTree INTLITERAL333=null;
        JVMScramblingInformationGatherer.localVariableTableLineIdentifier_return localVariableTableLineIdentifier334 =null;

        JVMScramblingInformationGatherer.bytecodeType_return bytecodeType335 =null;


        CommonTree INTLITERAL331_tree=null;
        CommonTree INTLITERAL332_tree=null;
        CommonTree INTLITERAL333_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:603:3: ( INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:603:5: INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL331=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine3054); 
            INTLITERAL331_tree = (CommonTree)adaptor.dupNode(INTLITERAL331);


            adaptor.addChild(root_0, INTLITERAL331_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL332=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine3056); 
            INTLITERAL332_tree = (CommonTree)adaptor.dupNode(INTLITERAL332);


            adaptor.addChild(root_0, INTLITERAL332_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL333=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine3058); 
            INTLITERAL333_tree = (CommonTree)adaptor.dupNode(INTLITERAL333);


            adaptor.addChild(root_0, INTLITERAL333_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine3060);
            localVariableTableLineIdentifier334=localVariableTableLineIdentifier();

            state._fsp--;

            adaptor.addChild(root_0, localVariableTableLineIdentifier334.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine3062);
            bytecodeType335=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeType335.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableTableLine"


    public static class localVariableTableLineIdentifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableTableLineIdentifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:606:1: localVariableTableLineIdentifier : IDENTIFIER ;
    public final JVMScramblingInformationGatherer.localVariableTableLineIdentifier_return localVariableTableLineIdentifier() throws RecognitionException {
        JVMScramblingInformationGatherer.localVariableTableLineIdentifier_return retval = new JVMScramblingInformationGatherer.localVariableTableLineIdentifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER336=null;

        CommonTree IDENTIFIER336_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:607:3: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:607:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER336=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier3076); 
            IDENTIFIER336_tree = (CommonTree)adaptor.dupNode(IDENTIFIER336);


            adaptor.addChild(root_0, IDENTIFIER336_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableTableLineIdentifier"


    public static class stackMapTypeTable_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTypeTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:614:1: stackMapTypeTable : ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) ;
    public final JVMScramblingInformationGatherer.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTypeTable_return retval = new JVMScramblingInformationGatherer.stackMapTypeTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMTHEADER337=null;
        CommonTree IDENTIFIER338=null;
        CommonTree ASSIGN339=null;
        CommonTree INTLITERAL340=null;
        CommonTree SMTENTRY341=null;
        JVMScramblingInformationGatherer.stackMapTypeTableEntry_return stackMapTypeTableEntry342 =null;


        CommonTree SMTHEADER337_tree=null;
        CommonTree IDENTIFIER338_tree=null;
        CommonTree ASSIGN339_tree=null;
        CommonTree INTLITERAL340_tree=null;
        CommonTree SMTENTRY341_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:615:3: ( ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:615:5: ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMTHEADER337=(CommonTree)match(input,SMTHEADER,FOLLOW_SMTHEADER_in_stackMapTypeTable3096); 
            SMTHEADER337_tree = (CommonTree)adaptor.dupNode(SMTHEADER337);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTHEADER337_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER338=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable3098); 
            IDENTIFIER338_tree = (CommonTree)adaptor.dupNode(IDENTIFIER338);


            adaptor.addChild(root_1, IDENTIFIER338_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN339=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable3100); 
            ASSIGN339_tree = (CommonTree)adaptor.dupNode(ASSIGN339);


            adaptor.addChild(root_1, ASSIGN339_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL340=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable3102); 
            INTLITERAL340_tree = (CommonTree)adaptor.dupNode(INTLITERAL340);


            adaptor.addChild(root_1, INTLITERAL340_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMTENTRY341=(CommonTree)match(input,SMTENTRY,FOLLOW_SMTENTRY_in_stackMapTypeTable3106); 
            SMTENTRY341_tree = (CommonTree)adaptor.dupNode(SMTENTRY341);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTENTRY341_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:615:58: ( stackMapTypeTableEntry )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==IDENTIFIER) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:615:58: stackMapTypeTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable3108);
            	    stackMapTypeTableEntry342=stackMapTypeTableEntry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, stackMapTypeTableEntry342.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTypeTable"


    public static class stackMapTypeTableEntry_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTypeTableEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:618:1: stackMapTypeTableEntry : IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer ;
    public final JVMScramblingInformationGatherer.stackMapTypeTableEntry_return stackMapTypeTableEntry() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTypeTableEntry_return retval = new JVMScramblingInformationGatherer.stackMapTypeTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER343=null;
        CommonTree ASSIGN344=null;
        CommonTree INTLITERAL345=null;
        CommonTree IDENTIFIER346=null;
        CommonTree ASSIGN347=null;
        CommonTree INTLITERAL348=null;
        CommonTree IDENTIFIER349=null;
        CommonTree ASSIGN350=null;
        CommonTree IDENTIFIER352=null;
        CommonTree ASSIGN353=null;
        JVMScramblingInformationGatherer.stackMapTableTypesContainer_return stackMapTableTypesContainer351 =null;

        JVMScramblingInformationGatherer.stackMapTableTypesContainer_return stackMapTableTypesContainer354 =null;


        CommonTree IDENTIFIER343_tree=null;
        CommonTree ASSIGN344_tree=null;
        CommonTree INTLITERAL345_tree=null;
        CommonTree IDENTIFIER346_tree=null;
        CommonTree ASSIGN347_tree=null;
        CommonTree INTLITERAL348_tree=null;
        CommonTree IDENTIFIER349_tree=null;
        CommonTree ASSIGN350_tree=null;
        CommonTree IDENTIFIER352_tree=null;
        CommonTree ASSIGN353_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:619:3: ( IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:619:5: IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER343=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry3123); 
            IDENTIFIER343_tree = (CommonTree)adaptor.dupNode(IDENTIFIER343);


            adaptor.addChild(root_0, IDENTIFIER343_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN344=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry3125); 
            ASSIGN344_tree = (CommonTree)adaptor.dupNode(ASSIGN344);


            adaptor.addChild(root_0, ASSIGN344_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL345=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry3127); 
            INTLITERAL345_tree = (CommonTree)adaptor.dupNode(INTLITERAL345);


            adaptor.addChild(root_0, INTLITERAL345_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER346=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry3129); 
            IDENTIFIER346_tree = (CommonTree)adaptor.dupNode(IDENTIFIER346);


            adaptor.addChild(root_0, IDENTIFIER346_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN347=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry3131); 
            ASSIGN347_tree = (CommonTree)adaptor.dupNode(ASSIGN347);


            adaptor.addChild(root_0, ASSIGN347_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL348=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry3133); 
            INTLITERAL348_tree = (CommonTree)adaptor.dupNode(INTLITERAL348);


            adaptor.addChild(root_0, INTLITERAL348_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER349=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry3140); 
            IDENTIFIER349_tree = (CommonTree)adaptor.dupNode(IDENTIFIER349);


            adaptor.addChild(root_0, IDENTIFIER349_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN350=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry3142); 
            ASSIGN350_tree = (CommonTree)adaptor.dupNode(ASSIGN350);


            adaptor.addChild(root_0, ASSIGN350_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry3144);
            stackMapTableTypesContainer351=stackMapTableTypesContainer();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypesContainer351.getTree());


            _last = (CommonTree)input.LT(1);
            IDENTIFIER352=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry3151); 
            IDENTIFIER352_tree = (CommonTree)adaptor.dupNode(IDENTIFIER352);


            adaptor.addChild(root_0, IDENTIFIER352_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN353=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry3153); 
            ASSIGN353_tree = (CommonTree)adaptor.dupNode(ASSIGN353);


            adaptor.addChild(root_0, ASSIGN353_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry3155);
            stackMapTableTypesContainer354=stackMapTableTypesContainer();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypesContainer354.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTypeTableEntry"


    public static class stackMapTable_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:628:1: stackMapTable : ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) ;
    public final JVMScramblingInformationGatherer.stackMapTable_return stackMapTable() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTable_return retval = new JVMScramblingInformationGatherer.stackMapTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMHEADER355=null;
        CommonTree IDENTIFIER356=null;
        CommonTree ASSIGN357=null;
        CommonTree INTLITERAL358=null;
        CommonTree SMENTRY359=null;
        JVMScramblingInformationGatherer.stackMapTableEntry_return stackMapTableEntry360 =null;


        CommonTree SMHEADER355_tree=null;
        CommonTree IDENTIFIER356_tree=null;
        CommonTree ASSIGN357_tree=null;
        CommonTree INTLITERAL358_tree=null;
        CommonTree SMENTRY359_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:629:3: ( ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:629:5: ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMHEADER355=(CommonTree)match(input,SMHEADER,FOLLOW_SMHEADER_in_stackMapTable3174); 
            SMHEADER355_tree = (CommonTree)adaptor.dupNode(SMHEADER355);


            root_1 = (CommonTree)adaptor.becomeRoot(SMHEADER355_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER356=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable3176); 
            IDENTIFIER356_tree = (CommonTree)adaptor.dupNode(IDENTIFIER356);


            adaptor.addChild(root_1, IDENTIFIER356_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN357=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable3178); 
            ASSIGN357_tree = (CommonTree)adaptor.dupNode(ASSIGN357);


            adaptor.addChild(root_1, ASSIGN357_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL358=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable3180); 
            INTLITERAL358_tree = (CommonTree)adaptor.dupNode(INTLITERAL358);


            adaptor.addChild(root_1, INTLITERAL358_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMENTRY359=(CommonTree)match(input,SMENTRY,FOLLOW_SMENTRY_in_stackMapTable3184); 
            SMENTRY359_tree = (CommonTree)adaptor.dupNode(SMENTRY359);


            root_1 = (CommonTree)adaptor.becomeRoot(SMENTRY359_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:629:56: ( stackMapTableEntry )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==ASSIGN) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:629:56: stackMapTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable3186);
            	    stackMapTableEntry360=stackMapTableEntry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, stackMapTableEntry360.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTable"


    public static class stackMapTableEntry_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:631:1: stackMapTableEntry : ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) ;
    public final JVMScramblingInformationGatherer.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTableEntry_return retval = new JVMScramblingInformationGatherer.stackMapTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN361=null;
        CommonTree IDENTIFIER362=null;
        JVMScramblingInformationGatherer.stackMapTableEntryValue_return stackMapTableEntryValue363 =null;


        CommonTree ASSIGN361_tree=null;
        CommonTree IDENTIFIER362_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:632:3: ( ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:632:5: ^( ASSIGN IDENTIFIER stackMapTableEntryValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN361=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry3201); 
            ASSIGN361_tree = (CommonTree)adaptor.dupNode(ASSIGN361);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN361_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER362=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry3203); 
            IDENTIFIER362_tree = (CommonTree)adaptor.dupNode(IDENTIFIER362);


            adaptor.addChild(root_1, IDENTIFIER362_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry3205);
            stackMapTableEntryValue363=stackMapTableEntryValue();

            state._fsp--;

            adaptor.addChild(root_1, stackMapTableEntryValue363.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableEntry"


    public static class stackMapTableEntryValue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableEntryValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:634:1: stackMapTableEntryValue : ( INTLITERAL | stackMapTableTypesContainer );
    public final JVMScramblingInformationGatherer.stackMapTableEntryValue_return stackMapTableEntryValue() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTableEntryValue_return retval = new JVMScramblingInformationGatherer.stackMapTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL364=null;
        JVMScramblingInformationGatherer.stackMapTableTypesContainer_return stackMapTableTypesContainer365 =null;


        CommonTree INTLITERAL364_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:635:3: ( INTLITERAL | stackMapTableTypesContainer )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==INTLITERAL) ) {
                alt76=1;
            }
            else if ( (LA76_0==SMTTYPES) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:635:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL364=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntryValue3218); 
                    INTLITERAL364_tree = (CommonTree)adaptor.dupNode(INTLITERAL364);


                    adaptor.addChild(root_0, INTLITERAL364_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:635:18: stackMapTableTypesContainer
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue3222);
                    stackMapTableTypesContainer365=stackMapTableTypesContainer();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypesContainer365.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableEntryValue"


    public static class stackMapTableTypesContainer_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypesContainer"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:637:1: stackMapTableTypesContainer : stackMapTableTypes ;
    public final JVMScramblingInformationGatherer.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTableTypesContainer_return retval = new JVMScramblingInformationGatherer.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.stackMapTableTypes_return stackMapTableTypes366 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:638:3: ( stackMapTableTypes )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:638:5: stackMapTableTypes
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer3234);
            stackMapTableTypes366=stackMapTableTypes();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypes366.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableTypesContainer"


    public static class stackMapTableTypes_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypes"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:640:1: stackMapTableTypes : ^( SMTTYPES ( stackMapTableType )* ) ;
    public final JVMScramblingInformationGatherer.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTableTypes_return retval = new JVMScramblingInformationGatherer.stackMapTableTypes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMTTYPES367=null;
        JVMScramblingInformationGatherer.stackMapTableType_return stackMapTableType368 =null;


        CommonTree SMTTYPES367_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:641:3: ( ^( SMTTYPES ( stackMapTableType )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:641:5: ^( SMTTYPES ( stackMapTableType )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMTTYPES367=(CommonTree)match(input,SMTTYPES,FOLLOW_SMTTYPES_in_stackMapTableTypes3258); 
            SMTTYPES367_tree = (CommonTree)adaptor.dupNode(SMTTYPES367);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTTYPES367_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:641:16: ( stackMapTableType )*
                loop77:
                do {
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==BOOLEAN||LA77_0==BYTE||LA77_0==CHAR||LA77_0==CLASS||LA77_0==DOUBLE||LA77_0==FLOAT||LA77_0==IDENTIFIER||LA77_0==INT||LA77_0==LONG||LA77_0==SHORT||LA77_0==VOID) ) {
                        alt77=1;
                    }


                    switch (alt77) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:641:16: stackMapTableType
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes3260);
                	    stackMapTableType368=stackMapTableType();

                	    state._fsp--;

                	    adaptor.addChild(root_1, stackMapTableType368.getTree());


                	    }
                	    break;

                	default :
                	    break loop77;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableTypes"


    public static class stackMapTableType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:643:1: stackMapTableType : ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? );
    public final JVMScramblingInformationGatherer.stackMapTableType_return stackMapTableType() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTableType_return retval = new JVMScramblingInformationGatherer.stackMapTableType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER372=null;
        CommonTree INTLITERAL373=null;
        JVMScramblingInformationGatherer.stackMapTableTypeObject_return stackMapTableTypeObject369 =null;

        JVMScramblingInformationGatherer.stackMapTableTypePlainObject_return stackMapTableTypePlainObject370 =null;

        JVMScramblingInformationGatherer.primitiveType_return primitiveType371 =null;


        CommonTree IDENTIFIER372_tree=null;
        CommonTree INTLITERAL373_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:644:3: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
            int alt79=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==STRINGLITERAL) ) {
                    alt79=1;
                }
                else if ( (LA79_1==INTERNALTYPE) ) {
                    alt79=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
            case VOID:
                {
                alt79=3;
                }
                break;
            case IDENTIFIER:
                {
                alt79=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }

            switch (alt79) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:644:5: stackMapTableTypeObject
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType3274);
                    stackMapTableTypeObject369=stackMapTableTypeObject();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypeObject369.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:644:29: stackMapTableTypePlainObject
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType3276);
                    stackMapTableTypePlainObject370=stackMapTableTypePlainObject();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypePlainObject370.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:644:58: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType3278);
                    primitiveType371=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType371.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:644:72: IDENTIFIER ( INTLITERAL )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER372=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableType3280); 
                    IDENTIFIER372_tree = (CommonTree)adaptor.dupNode(IDENTIFIER372);


                    adaptor.addChild(root_0, IDENTIFIER372_tree);


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:644:83: ( INTLITERAL )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==INTLITERAL) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:644:83: INTLITERAL
                            {
                            _last = (CommonTree)input.LT(1);
                            INTLITERAL373=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableType3282); 
                            INTLITERAL373_tree = (CommonTree)adaptor.dupNode(INTLITERAL373);


                            adaptor.addChild(root_0, INTLITERAL373_tree);


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableType"


    public static class stackMapTableTypePlainObject_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypePlainObject"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:646:1: stackMapTableTypePlainObject : CLASS INTERNALTYPE ;
    public final JVMScramblingInformationGatherer.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTableTypePlainObject_return retval = new JVMScramblingInformationGatherer.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS374=null;
        CommonTree INTERNALTYPE375=null;

        CommonTree CLASS374_tree=null;
        CommonTree INTERNALTYPE375_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:647:3: ( CLASS INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:647:5: CLASS INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CLASS374=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject3295); 
            CLASS374_tree = (CommonTree)adaptor.dupNode(CLASS374);


            adaptor.addChild(root_0, CLASS374_tree);


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE375=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject3297); 
            INTERNALTYPE375_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE375);


            adaptor.addChild(root_0, INTERNALTYPE375_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableTypePlainObject"


    public static class stackMapTableTypeObject_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypeObject"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:649:1: stackMapTableTypeObject : CLASS STRINGLITERAL ;
    public final JVMScramblingInformationGatherer.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        JVMScramblingInformationGatherer.stackMapTableTypeObject_return retval = new JVMScramblingInformationGatherer.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS376=null;
        CommonTree STRINGLITERAL377=null;

        CommonTree CLASS376_tree=null;
        CommonTree STRINGLITERAL377_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:650:3: ( CLASS STRINGLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:650:5: CLASS STRINGLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CLASS376=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject3309); 
            CLASS376_tree = (CommonTree)adaptor.dupNode(CLASS376);


            adaptor.addChild(root_0, CLASS376_tree);


            _last = (CommonTree)input.LT(1);
            STRINGLITERAL377=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject3311); 
            STRINGLITERAL377_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL377);


            adaptor.addChild(root_0, STRINGLITERAL377_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableTypeObject"


    public static class typeList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:660:1: typeList : ( type )+ ;
    public final JVMScramblingInformationGatherer.typeList_return typeList() throws RecognitionException {
        JVMScramblingInformationGatherer.typeList_return retval = new JVMScramblingInformationGatherer.typeList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.type_return type378 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:661:3: ( ( type )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:661:5: ( type )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:661:5: ( type )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==BOOLEAN||LA80_0==BYTE||LA80_0==CHAR||LA80_0==DOUBLE||LA80_0==FLOAT||LA80_0==INT||LA80_0==LONG||LA80_0==SHORT||LA80_0==UNITNAME||LA80_0==VOID) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:661:5: type
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_type_in_typeList3331);
            	    type378=type();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type378.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeList"


    public static class type_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:663:1: type : combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) ;
    public final JVMScramblingInformationGatherer.type_return type() throws RecognitionException {
        JVMScramblingInformationGatherer.type_return retval = new JVMScramblingInformationGatherer.type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARRAYBRACKS380=null;
        CommonTree LBRACK381=null;
        CommonTree RBRACK382=null;
        JVMScramblingInformationGatherer.combinedJavaType_return combinedJavaType379 =null;


        CommonTree ARRAYBRACKS380_tree=null;
        CommonTree LBRACK381_tree=null;
        CommonTree RBRACK382_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:664:3: ( combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:664:5: combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_combinedJavaType_in_type3344);
            combinedJavaType379=combinedJavaType();

            state._fsp--;

            adaptor.addChild(root_0, combinedJavaType379.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ARRAYBRACKS380=(CommonTree)match(input,ARRAYBRACKS,FOLLOW_ARRAYBRACKS_in_type3347); 
            ARRAYBRACKS380_tree = (CommonTree)adaptor.dupNode(ARRAYBRACKS380);


            root_1 = (CommonTree)adaptor.becomeRoot(ARRAYBRACKS380_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:664:36: ( LBRACK RBRACK )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==LBRACK) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:664:37: LBRACK RBRACK
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    LBRACK381=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_type3350); 
                	    LBRACK381_tree = (CommonTree)adaptor.dupNode(LBRACK381);


                	    adaptor.addChild(root_1, LBRACK381_tree);


                	    _last = (CommonTree)input.LT(1);
                	    RBRACK382=(CommonTree)match(input,RBRACK,FOLLOW_RBRACK_in_type3352); 
                	    RBRACK382_tree = (CommonTree)adaptor.dupNode(RBRACK382);


                	    adaptor.addChild(root_1, RBRACK382_tree);


                	    }
                	    break;

                	default :
                	    break loop81;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class combinedJavaType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "combinedJavaType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:666:1: combinedJavaType : ( primitiveType | referenceType );
    public final JVMScramblingInformationGatherer.combinedJavaType_return combinedJavaType() throws RecognitionException {
        JVMScramblingInformationGatherer.combinedJavaType_return retval = new JVMScramblingInformationGatherer.combinedJavaType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.primitiveType_return primitiveType383 =null;

        JVMScramblingInformationGatherer.referenceType_return referenceType384 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:667:3: ( primitiveType | referenceType )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==BOOLEAN||LA82_0==BYTE||LA82_0==CHAR||LA82_0==DOUBLE||LA82_0==FLOAT||LA82_0==INT||LA82_0==LONG||LA82_0==SHORT||LA82_0==VOID) ) {
                alt82=1;
            }
            else if ( (LA82_0==UNITNAME) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:667:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_combinedJavaType3367);
                    primitiveType383=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType383.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:668:5: referenceType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_referenceType_in_combinedJavaType3373);
                    referenceType384=referenceType();

                    state._fsp--;

                    adaptor.addChild(root_0, referenceType384.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "combinedJavaType"


    public static class referenceType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "referenceType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:670:1: referenceType : ^( UNITNAME ( typeDeclSpecifier )+ ) ;
    public final JVMScramblingInformationGatherer.referenceType_return referenceType() throws RecognitionException {
        JVMScramblingInformationGatherer.referenceType_return retval = new JVMScramblingInformationGatherer.referenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITNAME385=null;
        JVMScramblingInformationGatherer.typeDeclSpecifier_return typeDeclSpecifier386 =null;


        CommonTree UNITNAME385_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:671:3: ( ^( UNITNAME ( typeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:671:5: ^( UNITNAME ( typeDeclSpecifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME385=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_referenceType3386); 
            UNITNAME385_tree = (CommonTree)adaptor.dupNode(UNITNAME385);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITNAME385_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:671:16: ( typeDeclSpecifier )+
            int cnt83=0;
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==QualifiedType) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:671:16: typeDeclSpecifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType3388);
            	    typeDeclSpecifier386=typeDeclSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_1, typeDeclSpecifier386.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt83 >= 1 ) break loop83;
                        EarlyExitException eee =
                            new EarlyExitException(83, input);
                        throw eee;
                }
                cnt83++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "referenceType"


    public static class typeDeclSpecifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeDeclSpecifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:673:1: typeDeclSpecifier : ^( typeName ^( TYPEARGS ( typeArguments )? ) ) ;
    public final JVMScramblingInformationGatherer.typeDeclSpecifier_return typeDeclSpecifier() throws RecognitionException {
        JVMScramblingInformationGatherer.typeDeclSpecifier_return retval = new JVMScramblingInformationGatherer.typeDeclSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS388=null;
        JVMScramblingInformationGatherer.typeName_return typeName387 =null;

        JVMScramblingInformationGatherer.typeArguments_return typeArguments389 =null;


        CommonTree TYPEARGS388_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:674:3: ( ^( typeName ^( TYPEARGS ( typeArguments )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:674:5: ^( typeName ^( TYPEARGS ( typeArguments )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeName_in_typeDeclSpecifier3403);
            typeName387=typeName();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(typeName387.getTree(), root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS388=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_typeDeclSpecifier3406); 
            TYPEARGS388_tree = (CommonTree)adaptor.dupNode(TYPEARGS388);


            root_2 = (CommonTree)adaptor.becomeRoot(TYPEARGS388_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:674:27: ( typeArguments )?
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==BOOLEAN||LA84_0==BYTE||LA84_0==CHAR||LA84_0==DOUBLE||LA84_0==FLOAT||LA84_0==INT||LA84_0==LONG||LA84_0==QUESTION||LA84_0==SHORT||LA84_0==UNITNAME||LA84_0==VOID) ) {
                    alt84=1;
                }
                switch (alt84) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:674:27: typeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeArguments_in_typeDeclSpecifier3408);
                        typeArguments389=typeArguments();

                        state._fsp--;

                        adaptor.addChild(root_2, typeArguments389.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeDeclSpecifier"


    public static class typeName_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeName"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:676:1: typeName : QualifiedType ;
    public final JVMScramblingInformationGatherer.typeName_return typeName() throws RecognitionException {
        JVMScramblingInformationGatherer.typeName_return retval = new JVMScramblingInformationGatherer.typeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QualifiedType390=null;

        CommonTree QualifiedType390_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:677:3: ( QualifiedType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:677:5: QualifiedType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            QualifiedType390=(CommonTree)match(input,QualifiedType,FOLLOW_QualifiedType_in_typeName3423); 
            QualifiedType390_tree = (CommonTree)adaptor.dupNode(QualifiedType390);


            adaptor.addChild(root_0, QualifiedType390_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeName"


    public static class typeArguments_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeArguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:679:1: typeArguments : typeArgumentList ;
    public final JVMScramblingInformationGatherer.typeArguments_return typeArguments() throws RecognitionException {
        JVMScramblingInformationGatherer.typeArguments_return retval = new JVMScramblingInformationGatherer.typeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.typeArgumentList_return typeArgumentList391 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:680:3: ( typeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:680:5: typeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeArgumentList_in_typeArguments3435);
            typeArgumentList391=typeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, typeArgumentList391.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeArguments"


    public static class typeArgumentList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeArgumentList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:682:1: typeArgumentList : ( typeArgument )+ ;
    public final JVMScramblingInformationGatherer.typeArgumentList_return typeArgumentList() throws RecognitionException {
        JVMScramblingInformationGatherer.typeArgumentList_return retval = new JVMScramblingInformationGatherer.typeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.typeArgument_return typeArgument392 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:683:3: ( ( typeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:683:5: ( typeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:683:5: ( typeArgument )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==BOOLEAN||LA85_0==BYTE||LA85_0==CHAR||LA85_0==DOUBLE||LA85_0==FLOAT||LA85_0==INT||LA85_0==LONG||LA85_0==QUESTION||LA85_0==SHORT||LA85_0==UNITNAME||LA85_0==VOID) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:683:5: typeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeArgument_in_typeArgumentList3448);
            	    typeArgument392=typeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeArgument392.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeArgumentList"


    public static class typeArgument_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeArgument"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:685:1: typeArgument : ( type | wildcard );
    public final JVMScramblingInformationGatherer.typeArgument_return typeArgument() throws RecognitionException {
        JVMScramblingInformationGatherer.typeArgument_return retval = new JVMScramblingInformationGatherer.typeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.type_return type393 =null;

        JVMScramblingInformationGatherer.wildcard_return wildcard394 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:686:3: ( type | wildcard )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==BOOLEAN||LA86_0==BYTE||LA86_0==CHAR||LA86_0==DOUBLE||LA86_0==FLOAT||LA86_0==INT||LA86_0==LONG||LA86_0==SHORT||LA86_0==UNITNAME||LA86_0==VOID) ) {
                alt86=1;
            }
            else if ( (LA86_0==QUESTION) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }
            switch (alt86) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:686:5: type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_typeArgument3461);
                    type393=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type393.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:687:5: wildcard
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wildcard_in_typeArgument3467);
                    wildcard394=wildcard();

                    state._fsp--;

                    adaptor.addChild(root_0, wildcard394.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeArgument"


    public static class wildcard_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wildcard"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:689:1: wildcard : ^( QUESTION ( wildcardBounds )? ) ;
    public final JVMScramblingInformationGatherer.wildcard_return wildcard() throws RecognitionException {
        JVMScramblingInformationGatherer.wildcard_return retval = new JVMScramblingInformationGatherer.wildcard_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUESTION395=null;
        JVMScramblingInformationGatherer.wildcardBounds_return wildcardBounds396 =null;


        CommonTree QUESTION395_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:690:3: ( ^( QUESTION ( wildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:690:5: ^( QUESTION ( wildcardBounds )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUESTION395=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_wildcard3480); 
            QUESTION395_tree = (CommonTree)adaptor.dupNode(QUESTION395);


            root_1 = (CommonTree)adaptor.becomeRoot(QUESTION395_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:690:16: ( wildcardBounds )?
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==EXTENDS||LA87_0==SUPER) ) {
                    alt87=1;
                }
                switch (alt87) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:690:16: wildcardBounds
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_wildcardBounds_in_wildcard3482);
                        wildcardBounds396=wildcardBounds();

                        state._fsp--;

                        adaptor.addChild(root_1, wildcardBounds396.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "wildcard"


    public static class wildcardBounds_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wildcardBounds"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:692:1: wildcardBounds : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final JVMScramblingInformationGatherer.wildcardBounds_return wildcardBounds() throws RecognitionException {
        JVMScramblingInformationGatherer.wildcardBounds_return retval = new JVMScramblingInformationGatherer.wildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS397=null;
        CommonTree SUPER399=null;
        JVMScramblingInformationGatherer.type_return type398 =null;

        JVMScramblingInformationGatherer.type_return type400 =null;


        CommonTree EXTENDS397_tree=null;
        CommonTree SUPER399_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:693:3: ( ^( EXTENDS type ) | ^( SUPER type ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==EXTENDS) ) {
                alt88=1;
            }
            else if ( (LA88_0==SUPER) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }
            switch (alt88) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:693:5: ^( EXTENDS type )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXTENDS397=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_wildcardBounds3497); 
                    EXTENDS397_tree = (CommonTree)adaptor.dupNode(EXTENDS397);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS397_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_wildcardBounds3499);
                    type398=type();

                    state._fsp--;

                    adaptor.addChild(root_1, type398.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:694:5: ^( SUPER type )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUPER399=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_wildcardBounds3507); 
                    SUPER399_tree = (CommonTree)adaptor.dupNode(SUPER399);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER399_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_wildcardBounds3509);
                    type400=type();

                    state._fsp--;

                    adaptor.addChild(root_1, type400.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "wildcardBounds"


    public static class typeParameters_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParameters"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:696:1: typeParameters : ( typeParameter )+ ;
    public final JVMScramblingInformationGatherer.typeParameters_return typeParameters() throws RecognitionException {
        JVMScramblingInformationGatherer.typeParameters_return retval = new JVMScramblingInformationGatherer.typeParameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.typeParameter_return typeParameter401 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:697:3: ( ( typeParameter )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:697:5: ( typeParameter )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:697:5: ( typeParameter )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==IDENTIFIER) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:697:5: typeParameter
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeParameter_in_typeParameters3522);
            	    typeParameter401=typeParameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeParameter401.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeParameters"


    public static class typeParameter_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParameter"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:699:1: typeParameter : ^( identifier ( typeBound )? ) ;
    public final JVMScramblingInformationGatherer.typeParameter_return typeParameter() throws RecognitionException {
        JVMScramblingInformationGatherer.typeParameter_return retval = new JVMScramblingInformationGatherer.typeParameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.identifier_return identifier402 =null;

        JVMScramblingInformationGatherer.typeBound_return typeBound403 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:700:3: ( ^( identifier ( typeBound )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:700:5: ^( identifier ( typeBound )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_typeParameter3536);
            identifier402=identifier();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(identifier402.getTree(), root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:700:18: ( typeBound )?
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==EXTENDS) ) {
                    alt90=1;
                }
                switch (alt90) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:700:18: typeBound
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeBound_in_typeParameter3538);
                        typeBound403=typeBound();

                        state._fsp--;

                        adaptor.addChild(root_1, typeBound403.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeParameter"


    public static class typeBound_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeBound"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:702:1: typeBound : ^( EXTENDS ( referenceType )+ ) ;
    public final JVMScramblingInformationGatherer.typeBound_return typeBound() throws RecognitionException {
        JVMScramblingInformationGatherer.typeBound_return retval = new JVMScramblingInformationGatherer.typeBound_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS404=null;
        JVMScramblingInformationGatherer.referenceType_return referenceType405 =null;


        CommonTree EXTENDS404_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:703:3: ( ^( EXTENDS ( referenceType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:703:5: ^( EXTENDS ( referenceType )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXTENDS404=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeBound3553); 
            EXTENDS404_tree = (CommonTree)adaptor.dupNode(EXTENDS404);


            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS404_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:703:15: ( referenceType )+
            int cnt91=0;
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==UNITNAME) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:703:15: referenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_referenceType_in_typeBound3555);
            	    referenceType405=referenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_1, referenceType405.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt91 >= 1 ) break loop91;
                        EarlyExitException eee =
                            new EarlyExitException(91, input);
                        throw eee;
                }
                cnt91++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeBound"


    public static class genericDescriptor_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:708:1: genericDescriptor : ( genericReturnDescriptor )+ ;
    public final JVMScramblingInformationGatherer.genericDescriptor_return genericDescriptor() throws RecognitionException {
        JVMScramblingInformationGatherer.genericDescriptor_return retval = new JVMScramblingInformationGatherer.genericDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.genericReturnDescriptor_return genericReturnDescriptor406 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:709:3: ( ( genericReturnDescriptor )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:709:5: ( genericReturnDescriptor )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:709:5: ( genericReturnDescriptor )+
            int cnt92=0;
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==EXTENDS) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:709:5: genericReturnDescriptor
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor3572);
            	    genericReturnDescriptor406=genericReturnDescriptor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, genericReturnDescriptor406.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt92 >= 1 ) break loop92;
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "genericDescriptor"


    public static class genericReturnDescriptor_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericReturnDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:711:1: genericReturnDescriptor : ^( EXTENDS identifier bytecodeReferenceTypeList ) ;
    public final JVMScramblingInformationGatherer.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        JVMScramblingInformationGatherer.genericReturnDescriptor_return retval = new JVMScramblingInformationGatherer.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS407=null;
        JVMScramblingInformationGatherer.identifier_return identifier408 =null;

        JVMScramblingInformationGatherer.bytecodeReferenceTypeList_return bytecodeReferenceTypeList409 =null;


        CommonTree EXTENDS407_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:712:3: ( ^( EXTENDS identifier bytecodeReferenceTypeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:712:5: ^( EXTENDS identifier bytecodeReferenceTypeList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXTENDS407=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor3586); 
            EXTENDS407_tree = (CommonTree)adaptor.dupNode(EXTENDS407);


            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS407_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor3588);
            identifier408=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier408.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor3590);
            bytecodeReferenceTypeList409=bytecodeReferenceTypeList();

            state._fsp--;

            adaptor.addChild(root_1, bytecodeReferenceTypeList409.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "genericReturnDescriptor"


    public static class bytecodeReferenceTypeList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeReferenceTypeList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:714:1: bytecodeReferenceTypeList : ( bytecodeReferenceType )+ ;
    public final JVMScramblingInformationGatherer.bytecodeReferenceTypeList_return bytecodeReferenceTypeList() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeReferenceTypeList_return retval = new JVMScramblingInformationGatherer.bytecodeReferenceTypeList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.bytecodeReferenceType_return bytecodeReferenceType410 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:715:3: ( ( bytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:715:5: ( bytecodeReferenceType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:715:5: ( bytecodeReferenceType )+
            int cnt93=0;
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==UNITNAME) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:715:5: bytecodeReferenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList3604);
            	    bytecodeReferenceType410=bytecodeReferenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bytecodeReferenceType410.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt93 >= 1 ) break loop93;
                        EarlyExitException eee =
                            new EarlyExitException(93, input);
                        throw eee;
                }
                cnt93++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeReferenceTypeList"


    public static class bytecodeReferenceType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeReferenceType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:717:1: bytecodeReferenceType : ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) ;
    public final JVMScramblingInformationGatherer.bytecodeReferenceType_return bytecodeReferenceType() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeReferenceType_return retval = new JVMScramblingInformationGatherer.bytecodeReferenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITNAME411=null;
        JVMScramblingInformationGatherer.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier412 =null;


        CommonTree UNITNAME411_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:718:3: ( ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:718:5: ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME411=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_bytecodeReferenceType3618); 
            UNITNAME411_tree = (CommonTree)adaptor.dupNode(UNITNAME411);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITNAME411_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:718:16: ( bytecodeTypeDeclSpecifier )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==INTERNALTYPE) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:718:16: bytecodeTypeDeclSpecifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType3620);
            	    bytecodeTypeDeclSpecifier412=bytecodeTypeDeclSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_1, bytecodeTypeDeclSpecifier412.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeReferenceType"


    public static class bytecodeTypeDeclSpecifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeDeclSpecifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:720:1: bytecodeTypeDeclSpecifier : bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) ;
    public final JVMScramblingInformationGatherer.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeTypeDeclSpecifier_return retval = new JVMScramblingInformationGatherer.bytecodeTypeDeclSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS414=null;
        JVMScramblingInformationGatherer.bytecodeTypeName_return bytecodeTypeName413 =null;

        JVMScramblingInformationGatherer.bytecodeTypeArguments_return bytecodeTypeArguments415 =null;


        CommonTree TYPEARGS414_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:721:3: ( bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:721:5: bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier3634);
            bytecodeTypeName413=bytecodeTypeName();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeTypeName413.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS414=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier3637); 
            TYPEARGS414_tree = (CommonTree)adaptor.dupNode(TYPEARGS414);


            root_1 = (CommonTree)adaptor.becomeRoot(TYPEARGS414_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:721:33: ( bytecodeTypeArguments )?
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==QUESTION||LA95_0==UNITNAME) ) {
                    alt95=1;
                }
                switch (alt95) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:721:33: bytecodeTypeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier3639);
                        bytecodeTypeArguments415=bytecodeTypeArguments();

                        state._fsp--;

                        adaptor.addChild(root_1, bytecodeTypeArguments415.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeDeclSpecifier"


    public static class bytecodeTypeName_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeName"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:723:1: bytecodeTypeName : INTERNALTYPE ;
    public final JVMScramblingInformationGatherer.bytecodeTypeName_return bytecodeTypeName() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeTypeName_return retval = new JVMScramblingInformationGatherer.bytecodeTypeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERNALTYPE416=null;

        CommonTree INTERNALTYPE416_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:724:3: ( INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:724:5: INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE416=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeTypeName3653); 
            INTERNALTYPE416_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE416);


            adaptor.addChild(root_0, INTERNALTYPE416_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeName"


    public static class bytecodeTypeArguments_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeArguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:726:1: bytecodeTypeArguments : bytecodeTypeArgumentList ;
    public final JVMScramblingInformationGatherer.bytecodeTypeArguments_return bytecodeTypeArguments() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeTypeArguments_return retval = new JVMScramblingInformationGatherer.bytecodeTypeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.bytecodeTypeArgumentList_return bytecodeTypeArgumentList417 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:727:3: ( bytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:727:5: bytecodeTypeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments3665);
            bytecodeTypeArgumentList417=bytecodeTypeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeTypeArgumentList417.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeArguments"


    public static class bytecodeTypeArgumentList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeArgumentList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:729:1: bytecodeTypeArgumentList : ( bytecodeTypeArgument )+ ;
    public final JVMScramblingInformationGatherer.bytecodeTypeArgumentList_return bytecodeTypeArgumentList() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeTypeArgumentList_return retval = new JVMScramblingInformationGatherer.bytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.bytecodeTypeArgument_return bytecodeTypeArgument418 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:730:3: ( ( bytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:730:5: ( bytecodeTypeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:730:5: ( bytecodeTypeArgument )+
            int cnt96=0;
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==QUESTION||LA96_0==UNITNAME) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:730:5: bytecodeTypeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList3678);
            	    bytecodeTypeArgument418=bytecodeTypeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bytecodeTypeArgument418.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeArgumentList"


    public static class bytecodeTypeArgument_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeArgument"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:732:1: bytecodeTypeArgument : ( bytecodeReferenceType | bytecodeWildcard );
    public final JVMScramblingInformationGatherer.bytecodeTypeArgument_return bytecodeTypeArgument() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeTypeArgument_return retval = new JVMScramblingInformationGatherer.bytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.bytecodeReferenceType_return bytecodeReferenceType419 =null;

        JVMScramblingInformationGatherer.bytecodeWildcard_return bytecodeWildcard420 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:733:3: ( bytecodeReferenceType | bytecodeWildcard )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==UNITNAME) ) {
                alt97=1;
            }
            else if ( (LA97_0==QUESTION) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;

            }
            switch (alt97) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:733:5: bytecodeReferenceType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument3691);
                    bytecodeReferenceType419=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeReferenceType419.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:734:5: bytecodeWildcard
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument3697);
                    bytecodeWildcard420=bytecodeWildcard();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeWildcard420.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeArgument"


    public static class bytecodeWildcard_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeWildcard"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:736:1: bytecodeWildcard : ^( QUESTION ( bytecodeWildcardBounds )? ) ;
    public final JVMScramblingInformationGatherer.bytecodeWildcard_return bytecodeWildcard() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeWildcard_return retval = new JVMScramblingInformationGatherer.bytecodeWildcard_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUESTION421=null;
        JVMScramblingInformationGatherer.bytecodeWildcardBounds_return bytecodeWildcardBounds422 =null;


        CommonTree QUESTION421_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:737:3: ( ^( QUESTION ( bytecodeWildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:737:5: ^( QUESTION ( bytecodeWildcardBounds )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUESTION421=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_bytecodeWildcard3710); 
            QUESTION421_tree = (CommonTree)adaptor.dupNode(QUESTION421);


            root_1 = (CommonTree)adaptor.becomeRoot(QUESTION421_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:737:16: ( bytecodeWildcardBounds )?
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==EXTENDS||LA98_0==SUPER) ) {
                    alt98=1;
                }
                switch (alt98) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:737:16: bytecodeWildcardBounds
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard3712);
                        bytecodeWildcardBounds422=bytecodeWildcardBounds();

                        state._fsp--;

                        adaptor.addChild(root_1, bytecodeWildcardBounds422.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeWildcard"


    public static class bytecodeWildcardBounds_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeWildcardBounds"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:739:1: bytecodeWildcardBounds : ( ^( EXTENDS bytecodeReferenceType ) | ^( SUPER bytecodeReferenceType ) );
    public final JVMScramblingInformationGatherer.bytecodeWildcardBounds_return bytecodeWildcardBounds() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeWildcardBounds_return retval = new JVMScramblingInformationGatherer.bytecodeWildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS423=null;
        CommonTree SUPER425=null;
        JVMScramblingInformationGatherer.bytecodeReferenceType_return bytecodeReferenceType424 =null;

        JVMScramblingInformationGatherer.bytecodeReferenceType_return bytecodeReferenceType426 =null;


        CommonTree EXTENDS423_tree=null;
        CommonTree SUPER425_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:740:3: ( ^( EXTENDS bytecodeReferenceType ) | ^( SUPER bytecodeReferenceType ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==EXTENDS) ) {
                alt99=1;
            }
            else if ( (LA99_0==SUPER) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }
            switch (alt99) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:740:5: ^( EXTENDS bytecodeReferenceType )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXTENDS423=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_bytecodeWildcardBounds3727); 
                    EXTENDS423_tree = (CommonTree)adaptor.dupNode(EXTENDS423);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS423_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3729);
                    bytecodeReferenceType424=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_1, bytecodeReferenceType424.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:741:5: ^( SUPER bytecodeReferenceType )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUPER425=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_bytecodeWildcardBounds3737); 
                    SUPER425_tree = (CommonTree)adaptor.dupNode(SUPER425);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER425_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3739);
                    bytecodeReferenceType426=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_1, bytecodeReferenceType426.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeWildcardBounds"


    public static class bytecodeType_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:748:1: bytecodeType returns [String value] : ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER );
    public final JVMScramblingInformationGatherer.bytecodeType_return bytecodeType() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeType_return retval = new JVMScramblingInformationGatherer.bytecodeType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BaseType428=null;
        CommonTree SEMI430=null;
        CommonTree IDENTIFIER431=null;
        JVMScramblingInformationGatherer.bytecodeArrayType_return bytecodeArrayType427 =null;

        JVMScramblingInformationGatherer.simpleBytecodeObjectType_return simpleBytecodeObjectType429 =null;


        CommonTree BaseType428_tree=null;
        CommonTree SEMI430_tree=null;
        CommonTree IDENTIFIER431_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:749:3: ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER )
            int alt100=4;
            switch ( input.LA(1) ) {
            case LBRACK:
                {
                alt100=1;
                }
                break;
            case BaseType:
                {
                alt100=2;
                }
                break;
            case INTERNALTYPE:
                {
                alt100=3;
                }
                break;
            case IDENTIFIER:
                {
                alt100=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }

            switch (alt100) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:749:5: bytecodeArrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType3761);
                    bytecodeArrayType427=bytecodeArrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeArrayType427.getTree());


                    retval.value = (bytecodeArrayType427!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(bytecodeArrayType427.start),input.getTreeAdaptor().getTokenStopIndex(bytecodeArrayType427.start))):null);

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:750:5: BaseType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BaseType428=(CommonTree)match(input,BaseType,FOLLOW_BaseType_in_bytecodeType3769); 
                    BaseType428_tree = (CommonTree)adaptor.dupNode(BaseType428);


                    adaptor.addChild(root_0, BaseType428_tree);


                    retval.value = (BaseType428!=null?BaseType428.getText():null);

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:751:5: simpleBytecodeObjectType SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_bytecodeType3777);
                    simpleBytecodeObjectType429=simpleBytecodeObjectType();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleBytecodeObjectType429.getTree());


                    _last = (CommonTree)input.LT(1);
                    SEMI430=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType3779); 
                    SEMI430_tree = (CommonTree)adaptor.dupNode(SEMI430);


                    adaptor.addChild(root_0, SEMI430_tree);


                    retval.value = (simpleBytecodeObjectType429!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(simpleBytecodeObjectType429.start),input.getTreeAdaptor().getTokenStopIndex(simpleBytecodeObjectType429.start))):null) + (SEMI430!=null?SEMI430.getText():null);

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:752:5: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER431=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType3787); 
                    IDENTIFIER431_tree = (CommonTree)adaptor.dupNode(IDENTIFIER431);


                    adaptor.addChild(root_0, IDENTIFIER431_tree);


                    retval.value = (IDENTIFIER431!=null?IDENTIFIER431.getText():null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeType"


    public static class bytecodeArrayType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeArrayType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:754:1: bytecodeArrayType : LBRACK bytecodeType ;
    public final JVMScramblingInformationGatherer.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        JVMScramblingInformationGatherer.bytecodeArrayType_return retval = new JVMScramblingInformationGatherer.bytecodeArrayType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LBRACK432=null;
        JVMScramblingInformationGatherer.bytecodeType_return bytecodeType433 =null;


        CommonTree LBRACK432_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:755:3: ( LBRACK bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:755:5: LBRACK bytecodeType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            LBRACK432=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType3802); 
            LBRACK432_tree = (CommonTree)adaptor.dupNode(LBRACK432);


            adaptor.addChild(root_0, LBRACK432_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType3804);
            bytecodeType433=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeType433.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeArrayType"


    public static class simpleBytecodeObjectType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeObjectType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:757:1: simpleBytecodeObjectType : ( simpleBytecodeReferenceType )+ ;
    public final JVMScramblingInformationGatherer.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        JVMScramblingInformationGatherer.simpleBytecodeObjectType_return retval = new JVMScramblingInformationGatherer.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.simpleBytecodeReferenceType_return simpleBytecodeReferenceType434 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:758:3: ( ( simpleBytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:758:5: ( simpleBytecodeReferenceType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:758:5: ( simpleBytecodeReferenceType )+
            int cnt101=0;
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==INTERNALTYPE) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:758:5: simpleBytecodeReferenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType3817);
            	    simpleBytecodeReferenceType434=simpleBytecodeReferenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simpleBytecodeReferenceType434.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt101 >= 1 ) break loop101;
                        EarlyExitException eee =
                            new EarlyExitException(101, input);
                        throw eee;
                }
                cnt101++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeObjectType"


    public static class simpleBytecodeReferenceType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeReferenceType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:760:1: simpleBytecodeReferenceType : simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) ;
    public final JVMScramblingInformationGatherer.simpleBytecodeReferenceType_return simpleBytecodeReferenceType() throws RecognitionException {
        JVMScramblingInformationGatherer.simpleBytecodeReferenceType_return retval = new JVMScramblingInformationGatherer.simpleBytecodeReferenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS436=null;
        JVMScramblingInformationGatherer.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName435 =null;

        JVMScramblingInformationGatherer.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments437 =null;


        CommonTree TYPEARGS436_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:761:3: ( simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:761:5: simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType3830);
            simpleBytecodeReferenceTypeName435=simpleBytecodeReferenceTypeName();

            state._fsp--;

            adaptor.addChild(root_0, simpleBytecodeReferenceTypeName435.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS436=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType3833); 
            TYPEARGS436_tree = (CommonTree)adaptor.dupNode(TYPEARGS436);


            root_1 = (CommonTree)adaptor.becomeRoot(TYPEARGS436_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:761:48: ( simpleBytecodeTypeArguments )?
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==BaseType||LA102_0==IDENTIFIER||LA102_0==INTERNALTYPE||LA102_0==LBRACK||LA102_0==MINUS||LA102_0==PLUS||LA102_0==STAR) ) {
                    alt102=1;
                }
                switch (alt102) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:761:48: simpleBytecodeTypeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType3835);
                        simpleBytecodeTypeArguments437=simpleBytecodeTypeArguments();

                        state._fsp--;

                        adaptor.addChild(root_1, simpleBytecodeTypeArguments437.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeReferenceType"


    public static class simpleBytecodeReferenceTypeName_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeReferenceTypeName"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:763:1: simpleBytecodeReferenceTypeName : INTERNALTYPE ;
    public final JVMScramblingInformationGatherer.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName() throws RecognitionException {
        JVMScramblingInformationGatherer.simpleBytecodeReferenceTypeName_return retval = new JVMScramblingInformationGatherer.simpleBytecodeReferenceTypeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERNALTYPE438=null;

        CommonTree INTERNALTYPE438_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:764:3: ( INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:764:5: INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE438=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName3849); 
            INTERNALTYPE438_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE438);


            adaptor.addChild(root_0, INTERNALTYPE438_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeReferenceTypeName"


    public static class simpleBytecodeTypeArguments_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeTypeArguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:766:1: simpleBytecodeTypeArguments : simpleBytecodeTypeArgumentList ;
    public final JVMScramblingInformationGatherer.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments() throws RecognitionException {
        JVMScramblingInformationGatherer.simpleBytecodeTypeArguments_return retval = new JVMScramblingInformationGatherer.simpleBytecodeTypeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList439 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:767:3: ( simpleBytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:767:5: simpleBytecodeTypeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments3861);
            simpleBytecodeTypeArgumentList439=simpleBytecodeTypeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, simpleBytecodeTypeArgumentList439.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeTypeArguments"


    public static class simpleBytecodeTypeArgumentList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeTypeArgumentList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:769:1: simpleBytecodeTypeArgumentList : ( simpleBytecodeTypeArgument )+ ;
    public final JVMScramblingInformationGatherer.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList() throws RecognitionException {
        JVMScramblingInformationGatherer.simpleBytecodeTypeArgumentList_return retval = new JVMScramblingInformationGatherer.simpleBytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument440 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:770:3: ( ( simpleBytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:770:5: ( simpleBytecodeTypeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:770:5: ( simpleBytecodeTypeArgument )+
            int cnt103=0;
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==BaseType||LA103_0==IDENTIFIER||LA103_0==INTERNALTYPE||LA103_0==LBRACK||LA103_0==MINUS||LA103_0==PLUS||LA103_0==STAR) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:770:5: simpleBytecodeTypeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList3873);
            	    simpleBytecodeTypeArgument440=simpleBytecodeTypeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simpleBytecodeTypeArgument440.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt103 >= 1 ) break loop103;
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeTypeArgumentList"


    public static class simpleBytecodeTypeArgument_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeTypeArgument"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:772:1: simpleBytecodeTypeArgument : ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR );
    public final JVMScramblingInformationGatherer.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument() throws RecognitionException {
        JVMScramblingInformationGatherer.simpleBytecodeTypeArgument_return retval = new JVMScramblingInformationGatherer.simpleBytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MINUS442=null;
        CommonTree PLUS444=null;
        CommonTree STAR446=null;
        JVMScramblingInformationGatherer.bytecodeType_return bytecodeType441 =null;

        JVMScramblingInformationGatherer.bytecodeType_return bytecodeType443 =null;

        JVMScramblingInformationGatherer.bytecodeType_return bytecodeType445 =null;


        CommonTree MINUS442_tree=null;
        CommonTree PLUS444_tree=null;
        CommonTree STAR446_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:773:3: ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR )
            int alt104=4;
            switch ( input.LA(1) ) {
            case BaseType:
            case IDENTIFIER:
            case INTERNALTYPE:
            case LBRACK:
                {
                alt104=1;
                }
                break;
            case MINUS:
                {
                alt104=2;
                }
                break;
            case PLUS:
                {
                alt104=3;
                }
                break;
            case STAR:
                {
                alt104=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }

            switch (alt104) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:773:5: bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3886);
                    bytecodeType441=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType441.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:774:5: MINUS bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    MINUS442=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_simpleBytecodeTypeArgument3892); 
                    MINUS442_tree = (CommonTree)adaptor.dupNode(MINUS442);


                    adaptor.addChild(root_0, MINUS442_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3894);
                    bytecodeType443=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType443.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:775:5: PLUS bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    PLUS444=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_simpleBytecodeTypeArgument3900); 
                    PLUS444_tree = (CommonTree)adaptor.dupNode(PLUS444);


                    adaptor.addChild(root_0, PLUS444_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3902);
                    bytecodeType445=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType445.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:776:5: STAR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    STAR446=(CommonTree)match(input,STAR,FOLLOW_STAR_in_simpleBytecodeTypeArgument3908); 
                    STAR446_tree = (CommonTree)adaptor.dupNode(STAR446);


                    adaptor.addChild(root_0, STAR446_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeTypeArgument"


    public static class identifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:783:1: identifier : IDENTIFIER ;
    public final JVMScramblingInformationGatherer.identifier_return identifier() throws RecognitionException {
        JVMScramblingInformationGatherer.identifier_return retval = new JVMScramblingInformationGatherer.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER447=null;

        CommonTree IDENTIFIER447_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:783:11: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:783:13: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER447=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier3922); 
            IDENTIFIER447_tree = (CommonTree)adaptor.dupNode(IDENTIFIER447);


            adaptor.addChild(root_0, IDENTIFIER447_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class keywordAggregate_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keywordAggregate"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:785:1: keywordAggregate : IDENTIFIER ;
    public final JVMScramblingInformationGatherer.keywordAggregate_return keywordAggregate() throws RecognitionException {
        JVMScramblingInformationGatherer.keywordAggregate_return retval = new JVMScramblingInformationGatherer.keywordAggregate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER448=null;

        CommonTree IDENTIFIER448_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:786:3: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:786:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER448=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_keywordAggregate3932); 
            IDENTIFIER448_tree = (CommonTree)adaptor.dupNode(IDENTIFIER448);


            adaptor.addChild(root_0, IDENTIFIER448_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keywordAggregate"


    public static class primitiveType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:789:1: primitiveType : ( boolean_type | numeric_type | VOID );
    public final JVMScramblingInformationGatherer.primitiveType_return primitiveType() throws RecognitionException {
        JVMScramblingInformationGatherer.primitiveType_return retval = new JVMScramblingInformationGatherer.primitiveType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VOID451=null;
        JVMScramblingInformationGatherer.boolean_type_return boolean_type449 =null;

        JVMScramblingInformationGatherer.numeric_type_return numeric_type450 =null;


        CommonTree VOID451_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:790:3: ( boolean_type | numeric_type | VOID )
            int alt105=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt105=1;
                }
                break;
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                alt105=2;
                }
                break;
            case VOID:
                {
                alt105=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }

            switch (alt105) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:790:5: boolean_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_boolean_type_in_primitiveType3945);
                    boolean_type449=boolean_type();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_type449.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:791:5: numeric_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numeric_type_in_primitiveType3951);
                    numeric_type450=numeric_type();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_type450.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:792:5: VOID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VOID451=(CommonTree)match(input,VOID,FOLLOW_VOID_in_primitiveType3957); 
                    VOID451_tree = (CommonTree)adaptor.dupNode(VOID451);


                    adaptor.addChild(root_0, VOID451_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primitiveType"


    public static class boolean_type_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:795:1: boolean_type : BOOLEAN ;
    public final JVMScramblingInformationGatherer.boolean_type_return boolean_type() throws RecognitionException {
        JVMScramblingInformationGatherer.boolean_type_return retval = new JVMScramblingInformationGatherer.boolean_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BOOLEAN452=null;

        CommonTree BOOLEAN452_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:796:3: ( BOOLEAN )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:796:5: BOOLEAN
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            BOOLEAN452=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type3970); 
            BOOLEAN452_tree = (CommonTree)adaptor.dupNode(BOOLEAN452);


            adaptor.addChild(root_0, BOOLEAN452_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_type"


    public static class numeric_type_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numeric_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:799:1: numeric_type : ( floating_point_type | integral_type );
    public final JVMScramblingInformationGatherer.numeric_type_return numeric_type() throws RecognitionException {
        JVMScramblingInformationGatherer.numeric_type_return retval = new JVMScramblingInformationGatherer.numeric_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMScramblingInformationGatherer.floating_point_type_return floating_point_type453 =null;

        JVMScramblingInformationGatherer.integral_type_return integral_type454 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:800:3: ( floating_point_type | integral_type )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==DOUBLE||LA106_0==FLOAT) ) {
                alt106=1;
            }
            else if ( (LA106_0==BYTE||LA106_0==CHAR||LA106_0==INT||LA106_0==LONG||LA106_0==SHORT) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }
            switch (alt106) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:800:5: floating_point_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_floating_point_type_in_numeric_type3983);
                    floating_point_type453=floating_point_type();

                    state._fsp--;

                    adaptor.addChild(root_0, floating_point_type453.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:801:5: integral_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integral_type_in_numeric_type3989);
                    integral_type454=integral_type();

                    state._fsp--;

                    adaptor.addChild(root_0, integral_type454.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numeric_type"


    public static class integral_type_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integral_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:804:1: integral_type : ( BYTE | SHORT | INT | LONG | CHAR );
    public final JVMScramblingInformationGatherer.integral_type_return integral_type() throws RecognitionException {
        JVMScramblingInformationGatherer.integral_type_return retval = new JVMScramblingInformationGatherer.integral_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set455=null;

        CommonTree set455_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:805:3: ( BYTE | SHORT | INT | LONG | CHAR )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set455=(CommonTree)input.LT(1);

            if ( input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
                input.consume();
                set455_tree = (CommonTree)adaptor.dupNode(set455);


                adaptor.addChild(root_0, set455_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "integral_type"


    public static class floating_point_type_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "floating_point_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:812:1: floating_point_type : ( FLOAT | DOUBLE );
    public final JVMScramblingInformationGatherer.floating_point_type_return floating_point_type() throws RecognitionException {
        JVMScramblingInformationGatherer.floating_point_type_return retval = new JVMScramblingInformationGatherer.floating_point_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set456=null;

        CommonTree set456_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:813:3: ( FLOAT | DOUBLE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set456=(CommonTree)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT ) {
                input.consume();
                set456_tree = (CommonTree)adaptor.dupNode(set456);


                adaptor.addChild(root_0, set456_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "floating_point_type"


    public static class literals_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literals"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:817:1: literals : ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER );
    public final JVMScramblingInformationGatherer.literals_return literals() throws RecognitionException {
        JVMScramblingInformationGatherer.literals_return retval = new JVMScramblingInformationGatherer.literals_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LONGLITERAL457=null;
        CommonTree INTLITERAL458=null;
        CommonTree FLOATLITERAL459=null;
        CommonTree DOUBLELITERAL460=null;
        CommonTree CHARLITERAL461=null;
        CommonTree STRINGLITERAL462=null;
        CommonTree BOOLEANLITERAL463=null;
        CommonTree MINUS464=null;
        CommonTree IDENTIFIER465=null;

        CommonTree LONGLITERAL457_tree=null;
        CommonTree INTLITERAL458_tree=null;
        CommonTree FLOATLITERAL459_tree=null;
        CommonTree DOUBLELITERAL460_tree=null;
        CommonTree CHARLITERAL461_tree=null;
        CommonTree STRINGLITERAL462_tree=null;
        CommonTree BOOLEANLITERAL463_tree=null;
        CommonTree MINUS464_tree=null;
        CommonTree IDENTIFIER465_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:818:3: ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER )
            int alt108=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt108=1;
                }
                break;
            case INTLITERAL:
                {
                alt108=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt108=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt108=4;
                }
                break;
            case CHARLITERAL:
                {
                alt108=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt108=6;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt108=7;
                }
                break;
            case IDENTIFIER:
            case MINUS:
                {
                alt108=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }

            switch (alt108) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:818:5: LONGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LONGLITERAL457=(CommonTree)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literals4058); 
                    LONGLITERAL457_tree = (CommonTree)adaptor.dupNode(LONGLITERAL457);


                    adaptor.addChild(root_0, LONGLITERAL457_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:819:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL458=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literals4064); 
                    INTLITERAL458_tree = (CommonTree)adaptor.dupNode(INTLITERAL458);


                    adaptor.addChild(root_0, INTLITERAL458_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:820:5: FLOATLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FLOATLITERAL459=(CommonTree)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literals4070); 
                    FLOATLITERAL459_tree = (CommonTree)adaptor.dupNode(FLOATLITERAL459);


                    adaptor.addChild(root_0, FLOATLITERAL459_tree);


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:821:5: DOUBLELITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DOUBLELITERAL460=(CommonTree)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literals4076); 
                    DOUBLELITERAL460_tree = (CommonTree)adaptor.dupNode(DOUBLELITERAL460);


                    adaptor.addChild(root_0, DOUBLELITERAL460_tree);


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:822:5: CHARLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CHARLITERAL461=(CommonTree)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literals4082); 
                    CHARLITERAL461_tree = (CommonTree)adaptor.dupNode(CHARLITERAL461);


                    adaptor.addChild(root_0, CHARLITERAL461_tree);


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:823:5: STRINGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    STRINGLITERAL462=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literals4088); 
                    STRINGLITERAL462_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL462);


                    adaptor.addChild(root_0, STRINGLITERAL462_tree);


                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:824:5: BOOLEANLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL463=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literals4094); 
                    BOOLEANLITERAL463_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL463);


                    adaptor.addChild(root_0, BOOLEANLITERAL463_tree);


                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:825:5: ( MINUS )? IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:825:5: ( MINUS )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==MINUS) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:825:5: MINUS
                            {
                            _last = (CommonTree)input.LT(1);
                            MINUS464=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_literals4100); 
                            MINUS464_tree = (CommonTree)adaptor.dupNode(MINUS464);


                            adaptor.addChild(root_0, MINUS464_tree);


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER465=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literals4103); 
                    IDENTIFIER465_tree = (CommonTree)adaptor.dupNode(IDENTIFIER465);


                    adaptor.addChild(root_0, IDENTIFIER465_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literals"


    public static class pc_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pc"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:828:1: pc : INTLITERAL COLON ;
    public final JVMScramblingInformationGatherer.pc_return pc() throws RecognitionException {
        JVMScramblingInformationGatherer.pc_return retval = new JVMScramblingInformationGatherer.pc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL466=null;
        CommonTree COLON467=null;

        CommonTree INTLITERAL466_tree=null;
        CommonTree COLON467_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:829:3: ( INTLITERAL COLON )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMScramblingInformationGatherer.g:829:5: INTLITERAL COLON
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL466=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc4116); 
            INTLITERAL466_tree = (CommonTree)adaptor.dupNode(INTLITERAL466);


            adaptor.addChild(root_0, INTLITERAL466_tree);


            _last = (CommonTree)input.LT(1);
            COLON467=(CommonTree)match(input,COLON,FOLLOW_COLON_in_pc4118); 
            COLON467_tree = (CommonTree)adaptor.dupNode(COLON467);


            adaptor.addChild(root_0, COLON467_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pc"

    // Delegated rules


 

    public static final BitSet FOLLOW_class_file_in_program70 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_CLASSFILE_in_class_file82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CFHEADER_in_class_file85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_file_header_in_class_file87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDefinition_in_class_file90 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header125 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info166 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info193 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_HexDigits_in_checksum_file_info195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSDECL_in_classDefinition240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_classDefinition244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_classDefinition251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition253 = new BitSet(new long[]{0x0080000000200018L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeName_in_classDefinition257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TPARAMETERS_in_classDefinition262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeParameters_in_classDefinition264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEXTENDS_in_classDefinition269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CIMPLEMENTS_in_classDefinition276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_classDefinition299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_info_in_classDefinition301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPOOL_in_classDefinition321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_classDefinition343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classBody_in_classDefinition345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info429 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_minor_major_version_info_in_type_info435 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_flags_in_type_info441 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info447 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info454 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info460 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info466 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info472 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_deprecated_in_type_info478 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_synthetic_in_type_info484 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_scala_info_in_type_info490 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic508 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod540 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod542 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod544 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_sourcefile_info565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ScalaSig_in_scalaSig_info580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scalaSig_info594 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scalaSig_info596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Scala_in_scala_info633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scala_info635 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scala_info637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scala_info639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition659 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info677 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VMODIFIER_in_innerclass_info_line696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_innerclass_info_line698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_innerclass_info_line703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line705 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000114L});
    public static final BitSet FOLLOW_innerclass_info_data_in_innerclass_info_line709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INFODATA1_in_innerclass_info_data726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_data729 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFODATA2_in_innerclass_info_data737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_data740 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info766 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_minor_major_version_info768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_major_version_info770 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Flag_in_flags791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessFlagList_in_flags793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList810 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_IDENTIFIER_in_flagType826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_flagType832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info855 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem870 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem872 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem874 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList888 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign902 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign904 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_annotationValue_in_annotationAssign906 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationValue919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationValue926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATIONBRACKETS_in_brackedAnnotationAssign939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList955 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations986 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations988 = new BitSet(new long[]{0x0000000000000008L,0x0000040000000000L});
    public static final BitSet FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1005 = new BitSet(new long[]{0x0000000000000008L,0x0000040000000000L});
    public static final BitSet FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1022 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_PVI_in_parameterVisibilityInfo1037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_parameterVisibilityInfo1039 = new BitSet(new long[]{0x0000000010000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1041 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1044 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_RIAI_in_runtimeInvisibleAnnotationsItem1059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1061 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1063 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1069 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1103 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool1105 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line1127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line1131 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyEntryDecl_in_classBody1176 = new BitSet(new long[]{0x0020000040000002L,0x0000000008000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_methodDefinition_in_classBodyEntryDecl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBodyEntryDecl1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBodyEntryDecl1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELDDECL_in_fieldDefinition1232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_fieldDefinition1235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition1237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_fieldDefinition1242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition1244 = new BitSet(new long[]{0x0080000000000008L,0x0000000000000000L,0x0000000200080004L});
    public static final BitSet FOLLOW_RETVALUE_in_fieldDefinition1249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_fieldDefinition1251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_fieldDefinition1255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldDefinition1257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDVALUE_in_fieldDefinition1261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition1263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_fieldDefinition1280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition1282 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_fieldDefinition1298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition1300 = new BitSet(new long[]{0x0000040400000008L,0x0050000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo1451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfo1453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flags_in_fieldInfo1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_fieldAdditionalInfo1474 = new BitSet(new long[]{0x0200010000082000L,0x0000000010040202L,0x0000000000000020L});
    public static final BitSet FOLLOW_literals_in_fieldAdditionalInfo1476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo1486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo1494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldAdditionalInfo1496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo1504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo1514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATICCTORDECL_in_staticCtorDefinition1601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_staticCtorDefinition1604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition1606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_staticCtorDefinition1611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition1613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_staticCtorDefinition1617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition1619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CTORDECL_in_ctorDefinition1646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_ctorDefinition1649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition1651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERICDESC_in_ctorDefinition1656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_ctorDefinition1658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_ctorDefinition1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeName_in_ctorDefinition1665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition1668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_ctorDefinition1671 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition1673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_ctorDefinition1702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition1704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_ctorDefinition1732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_ctorDefinition1734 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_ctorDefinition1762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition1764 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODDECL_in_methodDefinition1814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_methodDefinition1817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_methodDefinition1819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_methodDefinition1824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition1826 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000114L});
    public static final BitSet FOLLOW_GENERICDESC_in_methodDefinition1831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_methodDefinition1833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETVALUE_in_methodDefinition1838 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_methodDefinition1840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_methodDefinition1844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDefinition1846 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition1849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_methodDefinition1852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClauseMethod_in_methodDefinition1854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_methodDefinition1883 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition1885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_methodDefinition1913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_methodDefinition1915 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_methodDefinition1944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition1946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STANDINTOKEN_in_methodInfo2234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo2236 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo2238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfo2256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfo2267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfo2269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo2276 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo2282 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo2288 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo2294 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfo2301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfo2304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfo2312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfo2321 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault2337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault2340 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_annotationValue_in_annotationDefault2342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_methodSignatureInfo2363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMDESC_in_methodSignatureInfo2366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo2368 = new BitSet(new long[]{0x0000000000008008L,0x0000000000008102L});
    public static final BitSet FOLLOW_RETDESC_in_methodSignatureInfo2373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo2375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITARGUMENTS_in_arguments2471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_arguments2473 = new BitSet(new long[]{0x0000004000000008L});
    public static final BitSet FOLLOW_DOT_in_arguments2477 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments2479 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments2481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_body2506 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_body2508 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Code_in_body2513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_codeBlock_in_body2515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bodyExtension_in_body2518 = new BitSet(new long[]{0x0002000000000002L,0x0000000003800000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension2539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension2542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension2550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension2553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension2562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension2565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension2573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension2576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension2584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension2586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension2594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension2596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARINFO_in_codeBlock2615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variables_in_codeBlock2617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_codeBlock2621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructionSet_in_codeBlock2623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock2626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeLine_in_instructionSet2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaSwitch_in_instructionSet2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine2658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeLine2660 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine2663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand1_in_codeLine2665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine2670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeLine2672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd2689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd2691 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeBlockEnd2693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPINDEX_in_operand12710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_operand12717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_operand12723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables2736 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables2738 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_variable2754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable2756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable2758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_javaSwitch2775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch2778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_javaSwitch2780 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch2782 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch2785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pc_in_switchLine2802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine2819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine2821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClause2841 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_throwClause2843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClauseMethod2860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod2862 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000102L});
    public static final BitSet FOLLOW_ETHEADER_in_exceptionTable2901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ETENTRY_in_exceptionTable2913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable2915 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2934 = new BitSet(new long[]{0x0100008008045000L,0x0200000000020042L,0x0000000100000000L});
    public static final BitSet FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntryValue2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntryValue2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable2979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine2994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine2996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine2998 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVHEADER_in_localVariableTable3021 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable3023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable3025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable3027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable3029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable3031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVENTRY_in_localVariableTable3035 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable3037 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine3054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine3056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine3058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine3060 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTHEADER_in_stackMapTypeTable3096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable3098 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable3100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable3102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMTENTRY_in_stackMapTypeTable3106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable3108 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry3123 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry3125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry3127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry3129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry3133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry3140 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry3142 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry3144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry3151 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry3153 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMHEADER_in_stackMapTable3174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable3176 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable3178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable3180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMENTRY_in_stackMapTable3184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable3186 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry3201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry3203 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000200L});
    public static final BitSet FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry3205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntryValue3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTTYPES_in_stackMapTableTypes3258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes3260 = new BitSet(new long[]{0x0100008000245008L,0x0200000000020042L,0x0000000100000000L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableType3280 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableType3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject3295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject3309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList3331 = new BitSet(new long[]{0x0100008000045002L,0x0200000000020040L,0x0000000110000000L});
    public static final BitSet FOLLOW_combinedJavaType_in_type3344 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARRAYBRACKS_in_type3347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACK_in_type3350 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type3352 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_combinedJavaType3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenceType_in_combinedJavaType3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITNAME_in_referenceType3386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType3388 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L});
    public static final BitSet FOLLOW_typeName_in_typeDeclSpecifier3403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPEARGS_in_typeDeclSpecifier3406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeArguments_in_typeDeclSpecifier3408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QualifiedType_in_typeName3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgumentList_in_typeArguments3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgument_in_typeArgumentList3448 = new BitSet(new long[]{0x0100008000045002L,0x0200080000020040L,0x0000000110000000L});
    public static final BitSet FOLLOW_type_in_typeArgument3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_typeArgument3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_wildcard3480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wildcardBounds_in_wildcard3482 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_wildcardBounds3497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds3499 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_wildcardBounds3507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds3509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters3522 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeParameter3536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter3538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_typeBound3553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_referenceType_in_typeBound3555 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor3572 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor3586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor3588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor3590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList3604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_UNITNAME_in_bytecodeReferenceType3618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType3620 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier3634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier3637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier3639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeTypeName3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList3678 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bytecodeWildcard3710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard3712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_bytecodeWildcardBounds3727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_bytecodeWildcardBounds3737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeType3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_bytecodeType3777 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType3802 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType3817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType3830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType3833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType3835 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList3873 = new BitSet(new long[]{0x0000000000008002L,0x0000004010008102L,0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleBytecodeTypeArgument3892 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleBytecodeTypeArgument3900 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_simpleBytecodeTypeArgument3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_keywordAggregate3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literals4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literals4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literals4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literals4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literals4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literals4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literals4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literals4100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literals4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc4116 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pc4118 = new BitSet(new long[]{0x0000000000000002L});

}