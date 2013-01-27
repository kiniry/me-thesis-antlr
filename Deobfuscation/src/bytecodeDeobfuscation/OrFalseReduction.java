// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g 2013-01-25 16:19:19

  package bytecodeDeobfuscation;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class OrFalseReduction extends TreeParser {
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


    public OrFalseReduction(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public OrFalseReduction(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return OrFalseReduction.tokenNames; }
    public String getGrammarFileName() { return "D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g"; }


    	public HashMap<CommonTree, ArrayList<CodeLine>> codeblocks = new HashMap<CommonTree, ArrayList<CodeLine>>();
    	
    	public class CodeLine {
    	  public int pc;
    	  public CommonTree token;
    	  public ArrayList<CommonTree> operands = new ArrayList<CommonTree>();
    	  public CodeLine(CommonTree t, int pc)
    	  { 
    	    this.token=t; this.pc=pc;
    	  }
    	  
    	  public CodeLine(CommonTree t, int pc, CommonTree op1)
    	  { 
    	    this.token=t; this.pc=pc;
    	    if(op1 != null)
    	    	operands.add(op1);
    	  }
    	  	  
    	  public CodeLine(CommonTree t, int pc, ArrayList<CommonTree> ops)
    	  { 
    	    this.token=t; this.pc=pc;
    	    this.operands = ops;
    	  }
    	  	  
    	  public CodeLine(CommonTree t, int pc, CommonTree op1, CommonTree op2)
    	  { 
    	    this.token=t; this.pc=pc;
    	    if(op1 != null)
    	    	operands.add(op1);
    	    if(op2 != null)
    	    	operands.add(op2);
    	  }
    	  
    	  public void AddOp(CommonTree op) {
    	    operands.add(op);
    	  }	  
    	  public String toString() {
    	    return (token!=null?token.getText():"")+pc;
    	  }
    	}


    public static class program_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:63:1: program : ( class_file )* ;
    public final OrFalseReduction.program_return program() throws RecognitionException {
        OrFalseReduction.program_return retval = new OrFalseReduction.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.class_file_return class_file1 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:63:9: ( ( class_file )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:63:11: ( class_file )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:63:11: ( class_file )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CLASSFILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:63:11: class_file
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_class_file_in_program69);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:65:1: class_file : ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) ;
    public final OrFalseReduction.class_file_return class_file() throws RecognitionException {
        OrFalseReduction.class_file_return retval = new OrFalseReduction.class_file_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASSFILE2=null;
        CommonTree CFHEADER3=null;
        OrFalseReduction.class_file_header_return class_file_header4 =null;

        OrFalseReduction.classDefinition_return classDefinition5 =null;


        CommonTree CLASSFILE2_tree=null;
        CommonTree CFHEADER3_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:66:3: ( ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:66:5: ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CLASSFILE2=(CommonTree)match(input,CLASSFILE,FOLLOW_CLASSFILE_in_class_file81); 
            CLASSFILE2_tree = (CommonTree)adaptor.dupNode(CLASSFILE2);


            root_1 = (CommonTree)adaptor.becomeRoot(CLASSFILE2_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CFHEADER3=(CommonTree)match(input,CFHEADER,FOLLOW_CFHEADER_in_class_file84); 
            CFHEADER3_tree = (CommonTree)adaptor.dupNode(CFHEADER3);


            root_2 = (CommonTree)adaptor.becomeRoot(CFHEADER3_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_class_file_header_in_class_file86);
            class_file_header4=class_file_header();

            state._fsp--;

            adaptor.addChild(root_2, class_file_header4.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_classDefinition_in_class_file89);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:70:1: class_file_header : class_file_info modified_file_info checksum_file_info ( compiled_file_info )? ;
    public final OrFalseReduction.class_file_header_return class_file_header() throws RecognitionException {
        OrFalseReduction.class_file_header_return retval = new OrFalseReduction.class_file_header_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.class_file_info_return class_file_info6 =null;

        OrFalseReduction.modified_file_info_return modified_file_info7 =null;

        OrFalseReduction.checksum_file_info_return checksum_file_info8 =null;

        OrFalseReduction.compiled_file_info_return compiled_file_info9 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:71:3: ( class_file_info modified_file_info checksum_file_info ( compiled_file_info )? )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:71:5: class_file_info modified_file_info checksum_file_info ( compiled_file_info )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_class_file_info_in_class_file_header108);
            class_file_info6=class_file_info();

            state._fsp--;

            adaptor.addChild(root_0, class_file_info6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_modified_file_info_in_class_file_header114);
            modified_file_info7=modified_file_info();

            state._fsp--;

            adaptor.addChild(root_0, modified_file_info7.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_checksum_file_info_in_class_file_header120);
            checksum_file_info8=checksum_file_info();

            state._fsp--;

            adaptor.addChild(root_0, checksum_file_info8.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:74:5: ( compiled_file_info )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:74:5: compiled_file_info
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_compiled_file_info_in_class_file_header126);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:76:1: class_file_info : ^( IDENTIFIER WINDOWSPATH ) ;
    public final OrFalseReduction.class_file_info_return class_file_info() throws RecognitionException {
        OrFalseReduction.class_file_info_return retval = new OrFalseReduction.class_file_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER10=null;
        CommonTree WINDOWSPATH11=null;

        CommonTree IDENTIFIER10_tree=null;
        CommonTree WINDOWSPATH11_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:77:3: ( ^( IDENTIFIER WINDOWSPATH ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:77:5: ^( IDENTIFIER WINDOWSPATH )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER10=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_file_info140); 
            IDENTIFIER10_tree = (CommonTree)adaptor.dupNode(IDENTIFIER10);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER10_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            WINDOWSPATH11=(CommonTree)match(input,WINDOWSPATH,FOLLOW_WINDOWSPATH_in_class_file_info142); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:80:1: modified_file_info : ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER ) ;
    public final OrFalseReduction.modified_file_info_return modified_file_info() throws RecognitionException {
        OrFalseReduction.modified_file_info_return retval = new OrFalseReduction.modified_file_info_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:81:3: ( ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:81:5: ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER12=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info159); 
            IDENTIFIER12_tree = (CommonTree)adaptor.dupNode(IDENTIFIER12);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER12_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER13=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info161); 
            IDENTIFIER13_tree = (CommonTree)adaptor.dupNode(IDENTIFIER13);


            adaptor.addChild(root_1, IDENTIFIER13_tree);


            _last = (CommonTree)input.LT(1);
            DATE14=(CommonTree)match(input,DATE,FOLLOW_DATE_in_modified_file_info163); 
            DATE14_tree = (CommonTree)adaptor.dupNode(DATE14);


            adaptor.addChild(root_1, DATE14_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER15=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info165); 
            IDENTIFIER15_tree = (CommonTree)adaptor.dupNode(IDENTIFIER15);


            adaptor.addChild(root_1, IDENTIFIER15_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL16=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_modified_file_info167); 
            INTLITERAL16_tree = (CommonTree)adaptor.dupNode(INTLITERAL16);


            adaptor.addChild(root_1, INTLITERAL16_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER17=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info169); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:84:1: checksum_file_info : ^( IDENTIFIER IDENTIFIER HexDigits ) ;
    public final OrFalseReduction.checksum_file_info_return checksum_file_info() throws RecognitionException {
        OrFalseReduction.checksum_file_info_return retval = new OrFalseReduction.checksum_file_info_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:85:3: ( ^( IDENTIFIER IDENTIFIER HexDigits ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:85:5: ^( IDENTIFIER IDENTIFIER HexDigits )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER18=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info186); 
            IDENTIFIER18_tree = (CommonTree)adaptor.dupNode(IDENTIFIER18);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER18_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER19=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info188); 
            IDENTIFIER19_tree = (CommonTree)adaptor.dupNode(IDENTIFIER19);


            adaptor.addChild(root_1, IDENTIFIER19_tree);


            _last = (CommonTree)input.LT(1);
            HexDigits20=(CommonTree)match(input,HexDigits,FOLLOW_HexDigits_in_checksum_file_info190); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:88:1: compiled_file_info : ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) ;
    public final OrFalseReduction.compiled_file_info_return compiled_file_info() throws RecognitionException {
        OrFalseReduction.compiled_file_info_return retval = new OrFalseReduction.compiled_file_info_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:89:3: ( ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:89:5: ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER21=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info209); 
            IDENTIFIER21_tree = (CommonTree)adaptor.dupNode(IDENTIFIER21);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER21_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER22=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info211); 
            IDENTIFIER22_tree = (CommonTree)adaptor.dupNode(IDENTIFIER22);


            adaptor.addChild(root_1, IDENTIFIER22_tree);


            _last = (CommonTree)input.LT(1);
            STRINGLITERAL23=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_compiled_file_info213); 
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


    public static class classDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:96:1: classDefinition : ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) t= typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) ;
    public final OrFalseReduction.classDefinition_return classDefinition() throws RecognitionException {
        OrFalseReduction.classDefinition_return retval = new OrFalseReduction.classDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASSDECL24=null;
        CommonTree VMODIFIER25=null;
        CommonTree MODIFIER27=null;
        CommonTree TPARAMETERS29=null;
        CommonTree CEXTENDS31=null;
        CommonTree CIMPLEMENTS33=null;
        CommonTree UNITHEADER35=null;
        CommonTree CPOOL37=null;
        CommonTree UNITBODY39=null;
        OrFalseReduction.typeName_return t =null;

        OrFalseReduction.class_visual_modifier_return class_visual_modifier26 =null;

        OrFalseReduction.class_modifier_return class_modifier28 =null;

        OrFalseReduction.typeParameters_return typeParameters30 =null;

        OrFalseReduction.typeList_return typeList32 =null;

        OrFalseReduction.typeList_return typeList34 =null;

        OrFalseReduction.type_info_return type_info36 =null;

        OrFalseReduction.constant_pool_return constant_pool38 =null;

        OrFalseReduction.classBody_return classBody40 =null;


        CommonTree CLASSDECL24_tree=null;
        CommonTree VMODIFIER25_tree=null;
        CommonTree MODIFIER27_tree=null;
        CommonTree TPARAMETERS29_tree=null;
        CommonTree CEXTENDS31_tree=null;
        CommonTree CIMPLEMENTS33_tree=null;
        CommonTree UNITHEADER35_tree=null;
        CommonTree CPOOL37_tree=null;
        CommonTree UNITBODY39_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:3: ( ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) t= typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:5: ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) t= typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CLASSDECL24=(CommonTree)match(input,CLASSDECL,FOLLOW_CLASSDECL_in_classDefinition232); 
            CLASSDECL24_tree = (CommonTree)adaptor.dupNode(CLASSDECL24);


            root_1 = (CommonTree)adaptor.becomeRoot(CLASSDECL24_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER25=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_classDefinition236); 
            VMODIFIER25_tree = (CommonTree)adaptor.dupNode(VMODIFIER25);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER25_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:30: ( class_visual_modifier )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:30: class_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_class_visual_modifier_in_classDefinition238);
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
            MODIFIER27=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_classDefinition243); 
            MODIFIER27_tree = (CommonTree)adaptor.dupNode(MODIFIER27);


            root_2 = (CommonTree)adaptor.becomeRoot(MODIFIER27_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:65: ( class_modifier )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ABSTRACT||LA4_0==CLASS||LA4_0==FINAL||LA4_0==INTERFACE) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:65: class_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_class_modifier_in_classDefinition245);
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
            pushFollow(FOLLOW_typeName_in_classDefinition251);
            t=typeName();

            state._fsp--;

            adaptor.addChild(root_1, t.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TPARAMETERS29=(CommonTree)match(input,TPARAMETERS,FOLLOW_TPARAMETERS_in_classDefinition254); 
            TPARAMETERS29_tree = (CommonTree)adaptor.dupNode(TPARAMETERS29);


            root_2 = (CommonTree)adaptor.becomeRoot(TPARAMETERS29_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:107: ( typeParameters )?
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENTIFIER) ) {
                    alt5=1;
                }
                switch (alt5) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:107: typeParameters
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeParameters_in_classDefinition256);
                        typeParameters30=typeParameters();

                        state._fsp--;

                        adaptor.addChild(root_2, typeParameters30.getTree());


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
            CEXTENDS31=(CommonTree)match(input,CEXTENDS,FOLLOW_CEXTENDS_in_classDefinition261); 
            CEXTENDS31_tree = (CommonTree)adaptor.dupNode(CEXTENDS31);


            root_2 = (CommonTree)adaptor.becomeRoot(CEXTENDS31_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:135: ( typeList )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOLEAN||LA6_0==BYTE||LA6_0==CHAR||LA6_0==DOUBLE||LA6_0==FLOAT||LA6_0==INT||LA6_0==LONG||LA6_0==SHORT||LA6_0==UNITNAME||LA6_0==VOID) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:135: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_classDefinition263);
                        typeList32=typeList();

                        state._fsp--;

                        adaptor.addChild(root_2, typeList32.getTree());


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
            CIMPLEMENTS33=(CommonTree)match(input,CIMPLEMENTS,FOLLOW_CIMPLEMENTS_in_classDefinition268); 
            CIMPLEMENTS33_tree = (CommonTree)adaptor.dupNode(CIMPLEMENTS33);


            root_2 = (CommonTree)adaptor.becomeRoot(CIMPLEMENTS33_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:160: ( typeList )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLEAN||LA7_0==BYTE||LA7_0==CHAR||LA7_0==DOUBLE||LA7_0==FLOAT||LA7_0==INT||LA7_0==LONG||LA7_0==SHORT||LA7_0==UNITNAME||LA7_0==VOID) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:97:160: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_classDefinition270);
                        typeList34=typeList();

                        state._fsp--;

                        adaptor.addChild(root_2, typeList34.getTree());


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
            UNITHEADER35=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_classDefinition291); 
            UNITHEADER35_tree = (CommonTree)adaptor.dupNode(UNITHEADER35);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER35_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_info_in_classDefinition293);
            type_info36=type_info();

            state._fsp--;

            adaptor.addChild(root_2, type_info36.getTree());


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
            CPOOL37=(CommonTree)match(input,CPOOL,FOLLOW_CPOOL_in_classDefinition313); 
            CPOOL37_tree = (CommonTree)adaptor.dupNode(CPOOL37);


            root_2 = (CommonTree)adaptor.becomeRoot(CPOOL37_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_constant_pool_in_classDefinition315);
            constant_pool38=constant_pool();

            state._fsp--;

            adaptor.addChild(root_2, constant_pool38.getTree());


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
            UNITBODY39=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_classDefinition335); 
            UNITBODY39_tree = (CommonTree)adaptor.dupNode(UNITBODY39);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY39_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:100:28: ( classBody )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CTORDECL||LA8_0==FIELDDECL||LA8_0==METHODDECL||LA8_0==STATICCTORDECL) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:100:28: classBody
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_classBody_in_classDefinition337);
                        classBody40=classBody();

                        state._fsp--;

                        adaptor.addChild(root_2, classBody40.getTree());


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


            System.out.println((t!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(t.start),input.getTreeAdaptor().getTokenStopIndex(t.start))):null));

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
    // $ANTLR end "classDefinition"


    public static class class_visual_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:104:1: class_visual_modifier : PUBLIC ;
    public final OrFalseReduction.class_visual_modifier_return class_visual_modifier() throws RecognitionException {
        OrFalseReduction.class_visual_modifier_return retval = new OrFalseReduction.class_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PUBLIC41=null;

        CommonTree PUBLIC41_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:105:3: ( PUBLIC )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:105:5: PUBLIC
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            PUBLIC41=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier376); 
            PUBLIC41_tree = (CommonTree)adaptor.dupNode(PUBLIC41);


            adaptor.addChild(root_0, PUBLIC41_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:108:1: class_modifier : ( ABSTRACT | FINAL | INTERFACE | CLASS );
    public final OrFalseReduction.class_modifier_return class_modifier() throws RecognitionException {
        OrFalseReduction.class_modifier_return retval = new OrFalseReduction.class_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set42=null;

        CommonTree set42_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:109:3: ( ABSTRACT | FINAL | INTERFACE | CLASS )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set42=(CommonTree)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==CLASS||input.LA(1)==FINAL||input.LA(1)==INTERFACE ) {
                input.consume();
                set42_tree = (CommonTree)adaptor.dupNode(set42);


                adaptor.addChild(root_0, set42_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:116:1: type_info : ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ ;
    public final OrFalseReduction.type_info_return type_info() throws RecognitionException {
        OrFalseReduction.type_info_return retval = new OrFalseReduction.type_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.sourcefile_info_return sourcefile_info43 =null;

        OrFalseReduction.minor_major_version_info_return minor_major_version_info44 =null;

        OrFalseReduction.flags_return flags45 =null;

        OrFalseReduction.scalaSig_info_return scalaSig_info46 =null;

        OrFalseReduction.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info47 =null;

        OrFalseReduction.innerclass_info_return innerclass_info48 =null;

        OrFalseReduction.enclosingMethod_return enclosingMethod49 =null;

        OrFalseReduction.signature_info_addition_return signature_info_addition50 =null;

        OrFalseReduction.deprecated_return deprecated51 =null;

        OrFalseReduction.synthetic_return synthetic52 =null;

        OrFalseReduction.scala_info_return scala_info53 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:117:3: ( ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:117:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:117:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:117:6: sourcefile_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sourcefile_info_in_type_info423);
            	    sourcefile_info43=sourcefile_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sourcefile_info43.getTree());


            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:118:5: minor_major_version_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_minor_major_version_info_in_type_info429);
            	    minor_major_version_info44=minor_major_version_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minor_major_version_info44.getTree());


            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:119:5: flags
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_flags_in_type_info435);
            	    flags45=flags();

            	    state._fsp--;

            	    adaptor.addChild(root_0, flags45.getTree());


            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:120:5: scalaSig_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_scalaSig_info_in_type_info441);
            	    scalaSig_info46=scalaSig_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, scalaSig_info46.getTree());


            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:121:5: runtimeVisibleAnnotations_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_type_info448);
            	    runtimeVisibleAnnotations_info47=runtimeVisibleAnnotations_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleAnnotations_info47.getTree());


            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:122:5: innerclass_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_innerclass_info_in_type_info454);
            	    innerclass_info48=innerclass_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, innerclass_info48.getTree());


            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:123:5: enclosingMethod
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_enclosingMethod_in_type_info460);
            	    enclosingMethod49=enclosingMethod();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enclosingMethod49.getTree());


            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:124:5: signature_info_addition
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_signature_info_addition_in_type_info466);
            	    signature_info_addition50=signature_info_addition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signature_info_addition50.getTree());


            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:125:5: deprecated
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_deprecated_in_type_info472);
            	    deprecated51=deprecated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, deprecated51.getTree());


            	    }
            	    break;
            	case 10 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:126:5: synthetic
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_synthetic_in_type_info478);
            	    synthetic52=synthetic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, synthetic52.getTree());


            	    }
            	    break;
            	case 11 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:127:5: scala_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_scala_info_in_type_info484);
            	    scala_info53=scala_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, scala_info53.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:130:1: synthetic : ^( Synthetic BOOLEANLITERAL ) ;
    public final OrFalseReduction.synthetic_return synthetic() throws RecognitionException {
        OrFalseReduction.synthetic_return retval = new OrFalseReduction.synthetic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Synthetic54=null;
        CommonTree BOOLEANLITERAL55=null;

        CommonTree Synthetic54_tree=null;
        CommonTree BOOLEANLITERAL55_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:131:3: ( ^( Synthetic BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:131:5: ^( Synthetic BOOLEANLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Synthetic54=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_synthetic500); 
            Synthetic54_tree = (CommonTree)adaptor.dupNode(Synthetic54);


            root_1 = (CommonTree)adaptor.becomeRoot(Synthetic54_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            BOOLEANLITERAL55=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_synthetic502); 
            BOOLEANLITERAL55_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL55);


            adaptor.addChild(root_1, BOOLEANLITERAL55_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:134:1: deprecated : ^( Deprecated BOOLEANLITERAL ) ;
    public final OrFalseReduction.deprecated_return deprecated() throws RecognitionException {
        OrFalseReduction.deprecated_return retval = new OrFalseReduction.deprecated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Deprecated56=null;
        CommonTree BOOLEANLITERAL57=null;

        CommonTree Deprecated56_tree=null;
        CommonTree BOOLEANLITERAL57_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:135:3: ( ^( Deprecated BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:135:5: ^( Deprecated BOOLEANLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Deprecated56=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_deprecated517); 
            Deprecated56_tree = (CommonTree)adaptor.dupNode(Deprecated56);


            root_1 = (CommonTree)adaptor.becomeRoot(Deprecated56_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            BOOLEANLITERAL57=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_deprecated519); 
            BOOLEANLITERAL57_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL57);


            adaptor.addChild(root_1, BOOLEANLITERAL57_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:138:1: enclosingMethod : ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) ;
    public final OrFalseReduction.enclosingMethod_return enclosingMethod() throws RecognitionException {
        OrFalseReduction.enclosingMethod_return retval = new OrFalseReduction.enclosingMethod_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EnclosingMethod58=null;
        CommonTree CPINDEX59=null;
        CommonTree DOT60=null;
        CommonTree CPINDEX61=null;

        CommonTree EnclosingMethod58_tree=null;
        CommonTree CPINDEX59_tree=null;
        CommonTree DOT60_tree=null;
        CommonTree CPINDEX61_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:139:3: ( ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:139:5: ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EnclosingMethod58=(CommonTree)match(input,EnclosingMethod,FOLLOW_EnclosingMethod_in_enclosingMethod534); 
            EnclosingMethod58_tree = (CommonTree)adaptor.dupNode(EnclosingMethod58);


            root_1 = (CommonTree)adaptor.becomeRoot(EnclosingMethod58_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX59=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod536); 
            CPINDEX59_tree = (CommonTree)adaptor.dupNode(CPINDEX59);


            adaptor.addChild(root_1, CPINDEX59_tree);


            _last = (CommonTree)input.LT(1);
            DOT60=(CommonTree)match(input,DOT,FOLLOW_DOT_in_enclosingMethod538); 
            DOT60_tree = (CommonTree)adaptor.dupNode(DOT60);


            adaptor.addChild(root_1, DOT60_tree);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:139:35: ( CPINDEX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CPINDEX) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:139:35: CPINDEX
                    {
                    _last = (CommonTree)input.LT(1);
                    CPINDEX61=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod540); 
                    CPINDEX61_tree = (CommonTree)adaptor.dupNode(CPINDEX61);


                    adaptor.addChild(root_1, CPINDEX61_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:142:1: sourcefile_info : ^( SourceFile STRINGLITERAL ) ;
    public final OrFalseReduction.sourcefile_info_return sourcefile_info() throws RecognitionException {
        OrFalseReduction.sourcefile_info_return retval = new OrFalseReduction.sourcefile_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SourceFile62=null;
        CommonTree STRINGLITERAL63=null;

        CommonTree SourceFile62_tree=null;
        CommonTree STRINGLITERAL63_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:143:3: ( ^( SourceFile STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:143:5: ^( SourceFile STRINGLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SourceFile62=(CommonTree)match(input,SourceFile,FOLLOW_SourceFile_in_sourcefile_info557); 
            SourceFile62_tree = (CommonTree)adaptor.dupNode(SourceFile62);


            root_1 = (CommonTree)adaptor.becomeRoot(SourceFile62_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            STRINGLITERAL63=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_sourcefile_info559); 
            STRINGLITERAL63_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL63);


            adaptor.addChild(root_1, STRINGLITERAL63_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:146:1: scalaSig_info : ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) ;
    public final OrFalseReduction.scalaSig_info_return scalaSig_info() throws RecognitionException {
        OrFalseReduction.scalaSig_info_return retval = new OrFalseReduction.scalaSig_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ScalaSig64=null;
        CommonTree IDENTIFIER65=null;
        CommonTree ASSIGN66=null;
        CommonTree INTLITERAL67=null;
        CommonTree INTLITERAL68=null;
        CommonTree INTLITERAL69=null;
        CommonTree INTLITERAL70=null;

        CommonTree ScalaSig64_tree=null;
        CommonTree IDENTIFIER65_tree=null;
        CommonTree ASSIGN66_tree=null;
        CommonTree INTLITERAL67_tree=null;
        CommonTree INTLITERAL68_tree=null;
        CommonTree INTLITERAL69_tree=null;
        CommonTree INTLITERAL70_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:147:3: ( ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:147:5: ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ScalaSig64=(CommonTree)match(input,ScalaSig,FOLLOW_ScalaSig_in_scalaSig_info574); 
            ScalaSig64_tree = (CommonTree)adaptor.dupNode(ScalaSig64);


            root_1 = (CommonTree)adaptor.becomeRoot(ScalaSig64_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER65=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scalaSig_info588); 
            IDENTIFIER65_tree = (CommonTree)adaptor.dupNode(IDENTIFIER65);


            adaptor.addChild(root_1, IDENTIFIER65_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN66=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_scalaSig_info590); 
            ASSIGN66_tree = (CommonTree)adaptor.dupNode(ASSIGN66);


            adaptor.addChild(root_1, ASSIGN66_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL67=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info592); 
            INTLITERAL67_tree = (CommonTree)adaptor.dupNode(INTLITERAL67);


            adaptor.addChild(root_1, INTLITERAL67_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL68=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info608); 
            INTLITERAL68_tree = (CommonTree)adaptor.dupNode(INTLITERAL68);


            adaptor.addChild(root_1, INTLITERAL68_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL69=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info610); 
            INTLITERAL69_tree = (CommonTree)adaptor.dupNode(INTLITERAL69);


            adaptor.addChild(root_1, INTLITERAL69_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL70=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info612); 
            INTLITERAL70_tree = (CommonTree)adaptor.dupNode(INTLITERAL70);


            adaptor.addChild(root_1, INTLITERAL70_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:152:1: scala_info : ^( Scala IDENTIFIER ASSIGN INTLITERAL ) ;
    public final OrFalseReduction.scala_info_return scala_info() throws RecognitionException {
        OrFalseReduction.scala_info_return retval = new OrFalseReduction.scala_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Scala71=null;
        CommonTree IDENTIFIER72=null;
        CommonTree ASSIGN73=null;
        CommonTree INTLITERAL74=null;

        CommonTree Scala71_tree=null;
        CommonTree IDENTIFIER72_tree=null;
        CommonTree ASSIGN73_tree=null;
        CommonTree INTLITERAL74_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:153:3: ( ^( Scala IDENTIFIER ASSIGN INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:153:5: ^( Scala IDENTIFIER ASSIGN INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Scala71=(CommonTree)match(input,Scala,FOLLOW_Scala_in_scala_info627); 
            Scala71_tree = (CommonTree)adaptor.dupNode(Scala71);


            root_1 = (CommonTree)adaptor.becomeRoot(Scala71_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER72=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scala_info629); 
            IDENTIFIER72_tree = (CommonTree)adaptor.dupNode(IDENTIFIER72);


            adaptor.addChild(root_1, IDENTIFIER72_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN73=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_scala_info631); 
            ASSIGN73_tree = (CommonTree)adaptor.dupNode(ASSIGN73);


            adaptor.addChild(root_1, ASSIGN73_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL74=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scala_info633); 
            INTLITERAL74_tree = (CommonTree)adaptor.dupNode(INTLITERAL74);


            adaptor.addChild(root_1, INTLITERAL74_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:156:1: signature_info_addition : ^( Signature ( CPINDEX )? ) ;
    public final OrFalseReduction.signature_info_addition_return signature_info_addition() throws RecognitionException {
        OrFalseReduction.signature_info_addition_return retval = new OrFalseReduction.signature_info_addition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature75=null;
        CommonTree CPINDEX76=null;

        CommonTree Signature75_tree=null;
        CommonTree CPINDEX76_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:157:3: ( ^( Signature ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:157:5: ^( Signature ( CPINDEX )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature75=(CommonTree)match(input,Signature,FOLLOW_Signature_in_signature_info_addition651); 
            Signature75_tree = (CommonTree)adaptor.dupNode(Signature75);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature75_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:157:17: ( CPINDEX )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CPINDEX) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:157:17: CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        CPINDEX76=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_signature_info_addition653); 
                        CPINDEX76_tree = (CommonTree)adaptor.dupNode(CPINDEX76);


                        adaptor.addChild(root_1, CPINDEX76_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:160:1: innerclass_info : ^( InnerClasses ( innerclass_info_line )+ ) ;
    public final OrFalseReduction.innerclass_info_return innerclass_info() throws RecognitionException {
        OrFalseReduction.innerclass_info_return retval = new OrFalseReduction.innerclass_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree InnerClasses77=null;
        OrFalseReduction.innerclass_info_line_return innerclass_info_line78 =null;


        CommonTree InnerClasses77_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:161:3: ( ^( InnerClasses ( innerclass_info_line )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:161:5: ^( InnerClasses ( innerclass_info_line )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            InnerClasses77=(CommonTree)match(input,InnerClasses,FOLLOW_InnerClasses_in_innerclass_info669); 
            InnerClasses77_tree = (CommonTree)adaptor.dupNode(InnerClasses77);


            root_1 = (CommonTree)adaptor.becomeRoot(InnerClasses77_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:161:20: ( innerclass_info_line )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:161:20: innerclass_info_line
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_innerclass_info_line_in_innerclass_info671);
            	    innerclass_info_line78=innerclass_info_line();

            	    state._fsp--;

            	    adaptor.addChild(root_1, innerclass_info_line78.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:164:1: innerclass_info_line : ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data ;
    public final OrFalseReduction.innerclass_info_line_return innerclass_info_line() throws RecognitionException {
        OrFalseReduction.innerclass_info_line_return retval = new OrFalseReduction.innerclass_info_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VMODIFIER79=null;
        CommonTree MODIFIER81=null;
        OrFalseReduction.method_visual_modifier_return method_visual_modifier80 =null;

        OrFalseReduction.method_modifier_return method_modifier82 =null;

        OrFalseReduction.innerclass_info_data_return innerclass_info_data83 =null;


        CommonTree VMODIFIER79_tree=null;
        CommonTree MODIFIER81_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:165:3: ( ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:165:6: ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER79=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_innerclass_info_line690); 
            VMODIFIER79_tree = (CommonTree)adaptor.dupNode(VMODIFIER79);


            root_1 = (CommonTree)adaptor.becomeRoot(VMODIFIER79_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:165:18: ( method_visual_modifier )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= PRIVATE && LA13_0 <= PUBLIC)) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:165:18: method_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_method_visual_modifier_in_innerclass_info_line692);
                        method_visual_modifier80=method_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_1, method_visual_modifier80.getTree());


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
            MODIFIER81=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_innerclass_info_line697); 
            MODIFIER81_tree = (CommonTree)adaptor.dupNode(MODIFIER81);


            root_1 = (CommonTree)adaptor.becomeRoot(MODIFIER81_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:165:54: ( method_modifier )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ABSTRACT||LA14_0==FINAL||LA14_0==NATIVE||LA14_0==STATIC||LA14_0==STRICTFP||LA14_0==SYNCHRONIZED) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:165:54: method_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_method_modifier_in_innerclass_info_line699);
                	    method_modifier82=method_modifier();

                	    state._fsp--;

                	    adaptor.addChild(root_1, method_modifier82.getTree());


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
            pushFollow(FOLLOW_innerclass_info_data_in_innerclass_info_line703);
            innerclass_info_data83=innerclass_info_data();

            state._fsp--;

            adaptor.addChild(root_0, innerclass_info_data83.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:168:1: innerclass_info_data : ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) ) ;
    public final OrFalseReduction.innerclass_info_data_return innerclass_info_data() throws RecognitionException {
        OrFalseReduction.innerclass_info_data_return retval = new OrFalseReduction.innerclass_info_data_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX84=null;
        CommonTree INFODATA185=null;
        CommonTree ASSIGN86=null;
        CommonTree CPINDEX87=null;
        CommonTree INFODATA288=null;
        CommonTree IDENTIFIER89=null;
        CommonTree CPINDEX90=null;

        CommonTree CPINDEX84_tree=null;
        CommonTree INFODATA185_tree=null;
        CommonTree ASSIGN86_tree=null;
        CommonTree CPINDEX87_tree=null;
        CommonTree INFODATA288_tree=null;
        CommonTree IDENTIFIER89_tree=null;
        CommonTree CPINDEX90_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:169:3: ( ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:169:5: ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX84=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data717); 
            CPINDEX84_tree = (CommonTree)adaptor.dupNode(CPINDEX84);


            root_1 = (CommonTree)adaptor.becomeRoot(CPINDEX84_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INFODATA185=(CommonTree)match(input,INFODATA1,FOLLOW_INFODATA1_in_innerclass_info_data720); 
            INFODATA185_tree = (CommonTree)adaptor.dupNode(INFODATA185);


            root_2 = (CommonTree)adaptor.becomeRoot(INFODATA185_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:169:27: ( ASSIGN CPINDEX )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ASSIGN) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:169:28: ASSIGN CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        ASSIGN86=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_innerclass_info_data723); 
                        ASSIGN86_tree = (CommonTree)adaptor.dupNode(ASSIGN86);


                        adaptor.addChild(root_2, ASSIGN86_tree);


                        _last = (CommonTree)input.LT(1);
                        CPINDEX87=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data725); 
                        CPINDEX87_tree = (CommonTree)adaptor.dupNode(CPINDEX87);


                        adaptor.addChild(root_2, CPINDEX87_tree);


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
            INFODATA288=(CommonTree)match(input,INFODATA2,FOLLOW_INFODATA2_in_innerclass_info_data731); 
            INFODATA288_tree = (CommonTree)adaptor.dupNode(INFODATA288);


            root_2 = (CommonTree)adaptor.becomeRoot(INFODATA288_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:169:58: ( IDENTIFIER CPINDEX )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==IDENTIFIER) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:169:59: IDENTIFIER CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        IDENTIFIER89=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_data734); 
                        IDENTIFIER89_tree = (CommonTree)adaptor.dupNode(IDENTIFIER89);


                        adaptor.addChild(root_2, IDENTIFIER89_tree);


                        _last = (CommonTree)input.LT(1);
                        CPINDEX90=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data736); 
                        CPINDEX90_tree = (CommonTree)adaptor.dupNode(CPINDEX90);


                        adaptor.addChild(root_2, CPINDEX90_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:172:1: minor_major_version_info : ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) ;
    public final OrFalseReduction.minor_major_version_info_return minor_major_version_info() throws RecognitionException {
        OrFalseReduction.minor_major_version_info_return retval = new OrFalseReduction.minor_major_version_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER91=null;
        CommonTree IDENTIFIER92=null;
        CommonTree COLON93=null;
        CommonTree INTLITERAL94=null;

        CommonTree IDENTIFIER91_tree=null;
        CommonTree IDENTIFIER92_tree=null;
        CommonTree COLON93_tree=null;
        CommonTree INTLITERAL94_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:173:3: ( ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:173:5: ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER91=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info758); 
            IDENTIFIER91_tree = (CommonTree)adaptor.dupNode(IDENTIFIER91);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER91_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER92=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info760); 
            IDENTIFIER92_tree = (CommonTree)adaptor.dupNode(IDENTIFIER92);


            adaptor.addChild(root_1, IDENTIFIER92_tree);


            _last = (CommonTree)input.LT(1);
            COLON93=(CommonTree)match(input,COLON,FOLLOW_COLON_in_minor_major_version_info762); 
            COLON93_tree = (CommonTree)adaptor.dupNode(COLON93);


            adaptor.addChild(root_1, COLON93_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL94=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_minor_major_version_info764); 
            INTLITERAL94_tree = (CommonTree)adaptor.dupNode(INTLITERAL94);


            adaptor.addChild(root_1, INTLITERAL94_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:176:1: flags : ^( Flag ( accessFlagList )? ) ;
    public final OrFalseReduction.flags_return flags() throws RecognitionException {
        OrFalseReduction.flags_return retval = new OrFalseReduction.flags_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Flag95=null;
        OrFalseReduction.accessFlagList_return accessFlagList96 =null;


        CommonTree Flag95_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:177:3: ( ^( Flag ( accessFlagList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:177:5: ^( Flag ( accessFlagList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Flag95=(CommonTree)match(input,Flag,FOLLOW_Flag_in_flags785); 
            Flag95_tree = (CommonTree)adaptor.dupNode(Flag95);


            root_1 = (CommonTree)adaptor.becomeRoot(Flag95_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:177:12: ( accessFlagList )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IDENTIFIER||LA17_0==INTLITERAL) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:177:12: accessFlagList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_accessFlagList_in_flags787);
                        accessFlagList96=accessFlagList();

                        state._fsp--;

                        adaptor.addChild(root_1, accessFlagList96.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:180:1: accessFlagList : ( flagType )+ ;
    public final OrFalseReduction.accessFlagList_return accessFlagList() throws RecognitionException {
        OrFalseReduction.accessFlagList_return retval = new OrFalseReduction.accessFlagList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.flagType_return flagType97 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:181:3: ( ( flagType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:181:5: ( flagType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:181:5: ( flagType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:181:5: flagType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_flagType_in_accessFlagList804);
            	    flagType97=flagType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, flagType97.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:184:1: flagType : (id= IDENTIFIER | INTLITERAL );
    public final OrFalseReduction.flagType_return flagType() throws RecognitionException {
        OrFalseReduction.flagType_return retval = new OrFalseReduction.flagType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree id=null;
        CommonTree INTLITERAL98=null;

        CommonTree id_tree=null;
        CommonTree INTLITERAL98_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:185:3: (id= IDENTIFIER | INTLITERAL )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:185:5: id= IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_flagType820); 
                    id_tree = (CommonTree)adaptor.dupNode(id);


                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:186:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL98=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_flagType826); 
                    INTLITERAL98_tree = (CommonTree)adaptor.dupNode(INTLITERAL98);


                    adaptor.addChild(root_0, INTLITERAL98_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:193:1: runtimeVisibleAnnotations_info : ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) ;
    public final OrFalseReduction.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        OrFalseReduction.runtimeVisibleAnnotations_info_return retval = new OrFalseReduction.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeVisibleAnnotations99=null;
        OrFalseReduction.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem100 =null;


        CommonTree RuntimeVisibleAnnotations99_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:194:3: ( ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:194:5: ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeVisibleAnnotations99=(CommonTree)match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info847); 
            RuntimeVisibleAnnotations99_tree = (CommonTree)adaptor.dupNode(RuntimeVisibleAnnotations99);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeVisibleAnnotations99_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:194:33: ( runtimeVisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:194:33: runtimeVisibleAnnotationsItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info849);
            	    runtimeVisibleAnnotationsItem100=runtimeVisibleAnnotationsItem();

            	    state._fsp--;

            	    adaptor.addChild(root_1, runtimeVisibleAnnotationsItem100.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:196:1: runtimeVisibleAnnotationsItem : ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) ;
    public final OrFalseReduction.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        OrFalseReduction.runtimeVisibleAnnotationsItem_return retval = new OrFalseReduction.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX101=null;
        OrFalseReduction.pc_return pc102 =null;

        OrFalseReduction.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList103 =null;


        CommonTree CPINDEX101_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:197:3: ( ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:197:5: ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX101=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem864); 
            CPINDEX101_tree = (CommonTree)adaptor.dupNode(CPINDEX101);


            root_1 = (CommonTree)adaptor.becomeRoot(CPINDEX101_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem866);
            pc102=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc102.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:197:18: ( runtimeVisibleAnnotationAssignList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ASSIGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:197:18: runtimeVisibleAnnotationAssignList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem868);
                    runtimeVisibleAnnotationAssignList103=runtimeVisibleAnnotationAssignList();

                    state._fsp--;

                    adaptor.addChild(root_1, runtimeVisibleAnnotationAssignList103.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:199:1: runtimeVisibleAnnotationAssignList : ( annotationAssign )+ ;
    public final OrFalseReduction.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        OrFalseReduction.runtimeVisibleAnnotationAssignList_return retval = new OrFalseReduction.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.annotationAssign_return annotationAssign104 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:200:3: ( ( annotationAssign )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:200:5: ( annotationAssign )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:200:5: ( annotationAssign )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:200:5: annotationAssign
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList882);
            	    annotationAssign104=annotationAssign();

            	    state._fsp--;

            	    adaptor.addChild(root_0, annotationAssign104.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:202:1: annotationAssign : ^( ASSIGN CPINDEX annotationValue ) ;
    public final OrFalseReduction.annotationAssign_return annotationAssign() throws RecognitionException {
        OrFalseReduction.annotationAssign_return retval = new OrFalseReduction.annotationAssign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN105=null;
        CommonTree CPINDEX106=null;
        OrFalseReduction.annotationValue_return annotationValue107 =null;


        CommonTree ASSIGN105_tree=null;
        CommonTree CPINDEX106_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:203:3: ( ^( ASSIGN CPINDEX annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:203:5: ^( ASSIGN CPINDEX annotationValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN105=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign896); 
            ASSIGN105_tree = (CommonTree)adaptor.dupNode(ASSIGN105);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN105_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX106=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign898); 
            CPINDEX106_tree = (CommonTree)adaptor.dupNode(CPINDEX106);


            adaptor.addChild(root_1, CPINDEX106_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationValue_in_annotationAssign900);
            annotationValue107=annotationValue();

            state._fsp--;

            adaptor.addChild(root_1, annotationValue107.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:205:1: annotationValue : ( brackedAnnotationAssign | AnnotationAssign );
    public final OrFalseReduction.annotationValue_return annotationValue() throws RecognitionException {
        OrFalseReduction.annotationValue_return retval = new OrFalseReduction.annotationValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationAssign109=null;
        OrFalseReduction.brackedAnnotationAssign_return brackedAnnotationAssign108 =null;


        CommonTree AnnotationAssign109_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:206:3: ( brackedAnnotationAssign | AnnotationAssign )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==AnnotationAssign) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==DOWN) ) {
                    alt23=1;
                }
                else if ( (LA23_1==UP) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA23_0==UP) ) {
                alt23=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:206:5: brackedAnnotationAssign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationValue913);
                    brackedAnnotationAssign108=brackedAnnotationAssign();

                    state._fsp--;

                    adaptor.addChild(root_0, brackedAnnotationAssign108.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:207:5: AnnotationAssign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    AnnotationAssign109=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationValue920); 
                    AnnotationAssign109_tree = (CommonTree)adaptor.dupNode(AnnotationAssign109);


                    adaptor.addChild(root_0, AnnotationAssign109_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:209:1: brackedAnnotationAssign : ( brackedAnnotationAssignList )? ;
    public final OrFalseReduction.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        OrFalseReduction.brackedAnnotationAssign_return retval = new OrFalseReduction.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.brackedAnnotationAssignList_return brackedAnnotationAssignList110 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:210:3: ( ( brackedAnnotationAssignList )? )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:210:5: ( brackedAnnotationAssignList )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:210:5: ( brackedAnnotationAssignList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==AnnotationAssign) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:210:5: brackedAnnotationAssignList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign932);
                    brackedAnnotationAssignList110=brackedAnnotationAssignList();

                    state._fsp--;

                    adaptor.addChild(root_0, brackedAnnotationAssignList110.getTree());


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
    // $ANTLR end "brackedAnnotationAssign"


    public static class brackedAnnotationAssignList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackedAnnotationAssignList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:212:1: brackedAnnotationAssignList : ( brackedAnnotationAssignValue )+ ;
    public final OrFalseReduction.brackedAnnotationAssignList_return brackedAnnotationAssignList() throws RecognitionException {
        OrFalseReduction.brackedAnnotationAssignList_return retval = new OrFalseReduction.brackedAnnotationAssignList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.brackedAnnotationAssignValue_return brackedAnnotationAssignValue111 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:213:3: ( ( brackedAnnotationAssignValue )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:213:5: ( brackedAnnotationAssignValue )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:213:5: ( brackedAnnotationAssignValue )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:213:5: brackedAnnotationAssignValue
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList945);
            	    brackedAnnotationAssignValue111=brackedAnnotationAssignValue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, brackedAnnotationAssignValue111.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:215:1: brackedAnnotationAssignValue : ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) ;
    public final OrFalseReduction.brackedAnnotationAssignValue_return brackedAnnotationAssignValue() throws RecognitionException {
        OrFalseReduction.brackedAnnotationAssignValue_return retval = new OrFalseReduction.brackedAnnotationAssignValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationAssign112=null;
        OrFalseReduction.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList113 =null;


        CommonTree AnnotationAssign112_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:216:3: ( ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:216:5: ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AnnotationAssign112=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue959); 
            AnnotationAssign112_tree = (CommonTree)adaptor.dupNode(AnnotationAssign112);


            root_1 = (CommonTree)adaptor.becomeRoot(AnnotationAssign112_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:216:24: ( runtimeVisibleAnnotationAssignList )?
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ASSIGN) ) {
                    alt26=1;
                }
                switch (alt26) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:216:24: runtimeVisibleAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue961);
                        runtimeVisibleAnnotationAssignList113=runtimeVisibleAnnotationAssignList();

                        state._fsp--;

                        adaptor.addChild(root_1, runtimeVisibleAnnotationAssignList113.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:218:1: runtimeVisibleParameterAnnotations : ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final OrFalseReduction.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations() throws RecognitionException {
        OrFalseReduction.runtimeVisibleParameterAnnotations_return retval = new OrFalseReduction.runtimeVisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeVisibleParameterAnnotations114=null;
        OrFalseReduction.parameterVisibilityInfo_return parameterVisibilityInfo115 =null;


        CommonTree RuntimeVisibleParameterAnnotations114_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:219:3: ( ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:219:5: ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeVisibleParameterAnnotations114=(CommonTree)match(input,RuntimeVisibleParameterAnnotations,FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations976); 
            RuntimeVisibleParameterAnnotations114_tree = (CommonTree)adaptor.dupNode(RuntimeVisibleParameterAnnotations114);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeVisibleParameterAnnotations114_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:219:42: ( parameterVisibilityInfo )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==INTLITERAL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:219:42: parameterVisibilityInfo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations978);
            	    parameterVisibilityInfo115=parameterVisibilityInfo();

            	    state._fsp--;

            	    adaptor.addChild(root_1, parameterVisibilityInfo115.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:221:1: runtimeInvisibleParameterAnnotations : ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final OrFalseReduction.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations() throws RecognitionException {
        OrFalseReduction.runtimeInvisibleParameterAnnotations_return retval = new OrFalseReduction.runtimeInvisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeInvisibleParameterAnnotations116=null;
        OrFalseReduction.parameterVisibilityInfo_return parameterVisibilityInfo117 =null;


        CommonTree RuntimeInvisibleParameterAnnotations116_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:222:3: ( ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:222:5: ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeInvisibleParameterAnnotations116=(CommonTree)match(input,RuntimeInvisibleParameterAnnotations,FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations993); 
            RuntimeInvisibleParameterAnnotations116_tree = (CommonTree)adaptor.dupNode(RuntimeInvisibleParameterAnnotations116);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeInvisibleParameterAnnotations116_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:222:44: ( parameterVisibilityInfo )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==INTLITERAL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:222:44: parameterVisibilityInfo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations995);
            	    parameterVisibilityInfo117=parameterVisibilityInfo();

            	    state._fsp--;

            	    adaptor.addChild(root_1, parameterVisibilityInfo117.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:224:1: runtimeInvisibleAnnotations : ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) ;
    public final OrFalseReduction.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations() throws RecognitionException {
        OrFalseReduction.runtimeInvisibleAnnotations_return retval = new OrFalseReduction.runtimeInvisibleAnnotations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeInvisibleAnnotations118=null;
        OrFalseReduction.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem119 =null;


        CommonTree RuntimeInvisibleAnnotations118_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:225:3: ( ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:225:5: ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeInvisibleAnnotations118=(CommonTree)match(input,RuntimeInvisibleAnnotations,FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1010); 
            RuntimeInvisibleAnnotations118_tree = (CommonTree)adaptor.dupNode(RuntimeInvisibleAnnotations118);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeInvisibleAnnotations118_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:225:35: ( runtimeInvisibleAnnotationsItem )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==INTLITERAL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:225:35: runtimeInvisibleAnnotationsItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1012);
            	    runtimeInvisibleAnnotationsItem119=runtimeInvisibleAnnotationsItem();

            	    state._fsp--;

            	    adaptor.addChild(root_1, runtimeInvisibleAnnotationsItem119.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:227:1: parameterVisibilityInfo : ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) ;
    public final OrFalseReduction.parameterVisibilityInfo_return parameterVisibilityInfo() throws RecognitionException {
        OrFalseReduction.parameterVisibilityInfo_return retval = new OrFalseReduction.parameterVisibilityInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER121=null;
        OrFalseReduction.pc_return pc120 =null;

        OrFalseReduction.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem122 =null;


        CommonTree IDENTIFIER121_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:228:3: ( ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:228:5: ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_parameterVisibilityInfo1027);
            pc120=pc();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(pc120.getTree(), root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:228:10: ( IDENTIFIER )?
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==IDENTIFIER) ) {
                    alt30=1;
                }
                switch (alt30) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:228:10: IDENTIFIER
                        {
                        _last = (CommonTree)input.LT(1);
                        IDENTIFIER121=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1029); 
                        IDENTIFIER121_tree = (CommonTree)adaptor.dupNode(IDENTIFIER121);


                        adaptor.addChild(root_1, IDENTIFIER121_tree);


                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:228:22: ( runtimeVisibleAnnotationsItem )*
                loop31:
                do {
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==CPINDEX) ) {
                        alt31=1;
                    }


                    switch (alt31) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:228:22: runtimeVisibleAnnotationsItem
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1032);
                	    runtimeVisibleAnnotationsItem122=runtimeVisibleAnnotationsItem();

                	    state._fsp--;

                	    adaptor.addChild(root_1, runtimeVisibleAnnotationsItem122.getTree());


                	    }
                	    break;

                	default :
                	    break loop31;
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
    // $ANTLR end "parameterVisibilityInfo"


    public static class runtimeInvisibleAnnotationsItem_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeInvisibleAnnotationsItem"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:230:1: runtimeInvisibleAnnotationsItem : ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) ;
    public final OrFalseReduction.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem() throws RecognitionException {
        OrFalseReduction.runtimeInvisibleAnnotationsItem_return retval = new OrFalseReduction.runtimeInvisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX125=null;
        OrFalseReduction.pc_return pc123 =null;

        OrFalseReduction.pc_return pc124 =null;

        OrFalseReduction.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList126 =null;


        CommonTree CPINDEX125_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:231:3: ( ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:231:5: ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1047);
            pc123=pc();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(pc123.getTree(), root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:231:10: ( pc )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INTLITERAL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:231:10: pc
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1049);
                    pc124=pc();

                    state._fsp--;

                    adaptor.addChild(root_1, pc124.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX125=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1053); 
            CPINDEX125_tree = (CommonTree)adaptor.dupNode(CPINDEX125);


            root_2 = (CommonTree)adaptor.becomeRoot(CPINDEX125_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:231:24: ( runtimeVisibleAnnotationAssignList )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ASSIGN) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:231:24: runtimeVisibleAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1055);
                        runtimeVisibleAnnotationAssignList126=runtimeVisibleAnnotationAssignList();

                        state._fsp--;

                        adaptor.addChild(root_2, runtimeVisibleAnnotationAssignList126.getTree());


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


    public static class constant_pool_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_pool"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:238:1: constant_pool : ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) ;
    public final OrFalseReduction.constant_pool_return constant_pool() throws RecognitionException {
        OrFalseReduction.constant_pool_return retval = new OrFalseReduction.constant_pool_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER127=null;
        CommonTree IDENTIFIER128=null;
        OrFalseReduction.contant_pool_line_return contant_pool_line129 =null;


        CommonTree IDENTIFIER127_tree=null;
        CommonTree IDENTIFIER128_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:239:3: ( ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:239:5: ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER127=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1076); 
            IDENTIFIER127_tree = (CommonTree)adaptor.dupNode(IDENTIFIER127);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER127_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER128=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1078); 
            IDENTIFIER128_tree = (CommonTree)adaptor.dupNode(IDENTIFIER128);


            adaptor.addChild(root_1, IDENTIFIER128_tree);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:239:29: ( contant_pool_line )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ASSIGN) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:239:29: contant_pool_line
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool1080);
            	    contant_pool_line129=contant_pool_line();

            	    state._fsp--;

            	    adaptor.addChild(root_1, contant_pool_line129.getTree());


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
    // $ANTLR end "constant_pool"


    public static class contant_pool_line_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "contant_pool_line"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:242:1: contant_pool_line : ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) ;
    public final OrFalseReduction.contant_pool_line_return contant_pool_line() throws RecognitionException {
        OrFalseReduction.contant_pool_line_return retval = new OrFalseReduction.contant_pool_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN130=null;
        CommonTree CPINDEX131=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE132=null;

        CommonTree ASSIGN130_tree=null;
        CommonTree CPINDEX131_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE132_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:243:3: ( ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:243:5: ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN130=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line1098); 
            ASSIGN130_tree = (CommonTree)adaptor.dupNode(ASSIGN130);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN130_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX131=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line1100); 
            CPINDEX131_tree = (CommonTree)adaptor.dupNode(CPINDEX131);


            adaptor.addChild(root_1, CPINDEX131_tree);


            _last = (CommonTree)input.LT(1);
            CONSTANT_TYPE_ASSIGNABLE132=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1102); 
            CONSTANT_TYPE_ASSIGNABLE132_tree = (CommonTree)adaptor.dupNode(CONSTANT_TYPE_ASSIGNABLE132);


            adaptor.addChild(root_1, CONSTANT_TYPE_ASSIGNABLE132_tree);


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
    // $ANTLR end "contant_pool_line"


    public static class classBody_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBody"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:250:1: classBody : ( classBodyEntryDecl )+ ;
    public final OrFalseReduction.classBody_return classBody() throws RecognitionException {
        OrFalseReduction.classBody_return retval = new OrFalseReduction.classBody_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.classBodyEntryDecl_return classBodyEntryDecl133 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:251:3: ( ( classBodyEntryDecl )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:251:5: ( classBodyEntryDecl )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:251:5: ( classBodyEntryDecl )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:251:5: classBodyEntryDecl
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_classBodyEntryDecl_in_classBody1122);
            	    classBodyEntryDecl133=classBodyEntryDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classBodyEntryDecl133.getTree());


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
        }
        return retval;
    }
    // $ANTLR end "classBody"


    public static class classBodyEntryDecl_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyEntryDecl"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:254:1: classBodyEntryDecl : ( methodDefinition | ctorDefinition | fieldDefinition | staticCtorDefinition );
    public final OrFalseReduction.classBodyEntryDecl_return classBodyEntryDecl() throws RecognitionException {
        OrFalseReduction.classBodyEntryDecl_return retval = new OrFalseReduction.classBodyEntryDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.methodDefinition_return methodDefinition134 =null;

        OrFalseReduction.ctorDefinition_return ctorDefinition135 =null;

        OrFalseReduction.fieldDefinition_return fieldDefinition136 =null;

        OrFalseReduction.staticCtorDefinition_return staticCtorDefinition137 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:255:3: ( methodDefinition | ctorDefinition | fieldDefinition | staticCtorDefinition )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:255:5: methodDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_methodDefinition_in_classBodyEntryDecl1138);
                    methodDefinition134=methodDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, methodDefinition134.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:256:5: ctorDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ctorDefinition_in_classBodyEntryDecl1144);
                    ctorDefinition135=ctorDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, ctorDefinition135.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:257:5: fieldDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_fieldDefinition_in_classBodyEntryDecl1150);
                    fieldDefinition136=fieldDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, fieldDefinition136.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:258:5: staticCtorDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1156);
                    staticCtorDefinition137=staticCtorDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, staticCtorDefinition137.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:265:1: fieldDefinition : ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) ;
    public final OrFalseReduction.fieldDefinition_return fieldDefinition() throws RecognitionException {
        OrFalseReduction.fieldDefinition_return retval = new OrFalseReduction.fieldDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FIELDDECL138=null;
        CommonTree VMODIFIER139=null;
        CommonTree MODIFIER141=null;
        CommonTree RETVALUE143=null;
        CommonTree UNITNAME145=null;
        CommonTree IDENTIFIER146=null;
        CommonTree FIELDVALUE147=null;
        CommonTree UNITHEADER149=null;
        CommonTree UNITATTR151=null;
        OrFalseReduction.field_visual_modifier_return field_visual_modifier140 =null;

        OrFalseReduction.field_modifier_return field_modifier142 =null;

        OrFalseReduction.type_return type144 =null;

        OrFalseReduction.literals_return literals148 =null;

        OrFalseReduction.fieldInfo_return fieldInfo150 =null;

        OrFalseReduction.fieldAdditionalInfo_return fieldAdditionalInfo152 =null;


        CommonTree FIELDDECL138_tree=null;
        CommonTree VMODIFIER139_tree=null;
        CommonTree MODIFIER141_tree=null;
        CommonTree RETVALUE143_tree=null;
        CommonTree UNITNAME145_tree=null;
        CommonTree IDENTIFIER146_tree=null;
        CommonTree FIELDVALUE147_tree=null;
        CommonTree UNITHEADER149_tree=null;
        CommonTree UNITATTR151_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:266:3: ( ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:266:5: ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FIELDDECL138=(CommonTree)match(input,FIELDDECL,FOLLOW_FIELDDECL_in_fieldDefinition1174); 
            FIELDDECL138_tree = (CommonTree)adaptor.dupNode(FIELDDECL138);


            root_1 = (CommonTree)adaptor.becomeRoot(FIELDDECL138_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER139=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_fieldDefinition1177); 
            VMODIFIER139_tree = (CommonTree)adaptor.dupNode(VMODIFIER139);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER139_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:266:29: ( field_visual_modifier )?
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= PRIVATE && LA37_0 <= PUBLIC)) ) {
                    alt37=1;
                }
                switch (alt37) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:266:29: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition1179);
                        field_visual_modifier140=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier140.getTree());


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
            MODIFIER141=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_fieldDefinition1184); 
            MODIFIER141_tree = (CommonTree)adaptor.dupNode(MODIFIER141);


            root_2 = (CommonTree)adaptor.becomeRoot(MODIFIER141_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:266:64: ( field_modifier )*
                loop38:
                do {
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==FINAL||LA38_0==STATIC||LA38_0==TRANSIENT||LA38_0==VOLATILE) ) {
                        alt38=1;
                    }


                    switch (alt38) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:266:64: field_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition1186);
                	    field_modifier142=field_modifier();

                	    state._fsp--;

                	    adaptor.addChild(root_2, field_modifier142.getTree());


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
            RETVALUE143=(CommonTree)match(input,RETVALUE,FOLLOW_RETVALUE_in_fieldDefinition1191); 
            RETVALUE143_tree = (CommonTree)adaptor.dupNode(RETVALUE143);


            root_2 = (CommonTree)adaptor.becomeRoot(RETVALUE143_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_fieldDefinition1193);
            type144=type();

            state._fsp--;

            adaptor.addChild(root_2, type144.getTree());


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
            UNITNAME145=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_fieldDefinition1197); 
            UNITNAME145_tree = (CommonTree)adaptor.dupNode(UNITNAME145);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME145_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER146=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldDefinition1199); 
            IDENTIFIER146_tree = (CommonTree)adaptor.dupNode(IDENTIFIER146);


            adaptor.addChild(root_2, IDENTIFIER146_tree);


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
            FIELDVALUE147=(CommonTree)match(input,FIELDVALUE,FOLLOW_FIELDVALUE_in_fieldDefinition1203); 
            FIELDVALUE147_tree = (CommonTree)adaptor.dupNode(FIELDVALUE147);


            root_2 = (CommonTree)adaptor.becomeRoot(FIELDVALUE147_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:266:134: ( literals )?
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==BOOLEANLITERAL||LA39_0==CHARLITERAL||LA39_0==DOUBLELITERAL||LA39_0==FLOATLITERAL||LA39_0==IDENTIFIER||LA39_0==INTLITERAL||LA39_0==LONGLITERAL||LA39_0==MINUS||LA39_0==STRINGLITERAL) ) {
                    alt39=1;
                }
                switch (alt39) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:266:134: literals
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_literals_in_fieldDefinition1205);
                        literals148=literals();

                        state._fsp--;

                        adaptor.addChild(root_2, literals148.getTree());


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
            UNITHEADER149=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_fieldDefinition1222); 
            UNITHEADER149_tree = (CommonTree)adaptor.dupNode(UNITHEADER149);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER149_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition1224);
            fieldInfo150=fieldInfo();

            state._fsp--;

            adaptor.addChild(root_2, fieldInfo150.getTree());


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
            UNITATTR151=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_fieldDefinition1240); 
            UNITATTR151_tree = (CommonTree)adaptor.dupNode(UNITATTR151);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR151_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:268:24: ( fieldAdditionalInfo )*
                loop40:
                do {
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Constant||LA40_0==Deprecated||LA40_0==RuntimeInvisibleAnnotations||LA40_0==RuntimeVisibleAnnotations||LA40_0==Signature||LA40_0==Synthetic) ) {
                        alt40=1;
                    }


                    switch (alt40) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:268:24: fieldAdditionalInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition1242);
                	    fieldAdditionalInfo152=fieldAdditionalInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_2, fieldAdditionalInfo152.getTree());


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
    // $ANTLR end "fieldDefinition"


    public static class fieldInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:272:1: fieldInfo : ^( Signature bytecodeType ) flags ;
    public final OrFalseReduction.fieldInfo_return fieldInfo() throws RecognitionException {
        OrFalseReduction.fieldInfo_return retval = new OrFalseReduction.fieldInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature153=null;
        OrFalseReduction.bytecodeType_return bytecodeType154 =null;

        OrFalseReduction.flags_return flags155 =null;


        CommonTree Signature153_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:273:3: ( ^( Signature bytecodeType ) flags )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:273:5: ^( Signature bytecodeType ) flags
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature153=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldInfo1272); 
            Signature153_tree = (CommonTree)adaptor.dupNode(Signature153);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature153_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_fieldInfo1274);
            bytecodeType154=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_1, bytecodeType154.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flags_in_fieldInfo1277);
            flags155=flags();

            state._fsp--;

            adaptor.addChild(root_0, flags155.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:276:1: fieldAdditionalInfo : ( ^( Constant primitiveType literals ) | ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | ^( Signature CPINDEX ) | ^( Deprecated BOOLEANLITERAL ) | ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations );
    public final OrFalseReduction.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        OrFalseReduction.fieldAdditionalInfo_return retval = new OrFalseReduction.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Constant156=null;
        CommonTree Constant159=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE160=null;
        CommonTree Signature161=null;
        CommonTree CPINDEX162=null;
        CommonTree Deprecated163=null;
        CommonTree BOOLEANLITERAL164=null;
        CommonTree Synthetic165=null;
        CommonTree BOOLEANLITERAL166=null;
        OrFalseReduction.primitiveType_return primitiveType157 =null;

        OrFalseReduction.literals_return literals158 =null;

        OrFalseReduction.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info167 =null;

        OrFalseReduction.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations168 =null;


        CommonTree Constant156_tree=null;
        CommonTree Constant159_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE160_tree=null;
        CommonTree Signature161_tree=null;
        CommonTree CPINDEX162_tree=null;
        CommonTree Deprecated163_tree=null;
        CommonTree BOOLEANLITERAL164_tree=null;
        CommonTree Synthetic165_tree=null;
        CommonTree BOOLEANLITERAL166_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:277:3: ( ^( Constant primitiveType literals ) | ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | ^( Signature CPINDEX ) | ^( Deprecated BOOLEANLITERAL ) | ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:277:5: ^( Constant primitiveType literals )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Constant156=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1291); 
                    Constant156_tree = (CommonTree)adaptor.dupNode(Constant156);


                    root_1 = (CommonTree)adaptor.becomeRoot(Constant156_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_fieldAdditionalInfo1293);
                    primitiveType157=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_1, primitiveType157.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_literals_in_fieldAdditionalInfo1295);
                    literals158=literals();

                    state._fsp--;

                    adaptor.addChild(root_1, literals158.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:278:5: ^( Constant CONSTANT_TYPE_ASSIGNABLE )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Constant159=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1303); 
                    Constant159_tree = (CommonTree)adaptor.dupNode(Constant159);


                    root_1 = (CommonTree)adaptor.becomeRoot(Constant159_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    CONSTANT_TYPE_ASSIGNABLE160=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo1305); 
                    CONSTANT_TYPE_ASSIGNABLE160_tree = (CommonTree)adaptor.dupNode(CONSTANT_TYPE_ASSIGNABLE160);


                    adaptor.addChild(root_1, CONSTANT_TYPE_ASSIGNABLE160_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:279:5: ^( Signature CPINDEX )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Signature161=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo1313); 
                    Signature161_tree = (CommonTree)adaptor.dupNode(Signature161);


                    root_1 = (CommonTree)adaptor.becomeRoot(Signature161_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    CPINDEX162=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldAdditionalInfo1315); 
                    CPINDEX162_tree = (CommonTree)adaptor.dupNode(CPINDEX162);


                    adaptor.addChild(root_1, CPINDEX162_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:280:5: ^( Deprecated BOOLEANLITERAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Deprecated163=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo1323); 
                    Deprecated163_tree = (CommonTree)adaptor.dupNode(Deprecated163);


                    root_1 = (CommonTree)adaptor.becomeRoot(Deprecated163_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL164=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1325); 
                    BOOLEANLITERAL164_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL164);


                    adaptor.addChild(root_1, BOOLEANLITERAL164_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:281:5: ^( Synthetic BOOLEANLITERAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Synthetic165=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo1333); 
                    Synthetic165_tree = (CommonTree)adaptor.dupNode(Synthetic165);


                    root_1 = (CommonTree)adaptor.becomeRoot(Synthetic165_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL166=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1335); 
                    BOOLEANLITERAL166_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL166);


                    adaptor.addChild(root_1, BOOLEANLITERAL166_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:282:5: runtimeVisibleAnnotations_info
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo1342);
                    runtimeVisibleAnnotations_info167=runtimeVisibleAnnotations_info();

                    state._fsp--;

                    adaptor.addChild(root_0, runtimeVisibleAnnotations_info167.getTree());


                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:283:5: runtimeInvisibleAnnotations
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo1348);
                    runtimeInvisibleAnnotations168=runtimeInvisibleAnnotations();

                    state._fsp--;

                    adaptor.addChild(root_0, runtimeInvisibleAnnotations168.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:286:1: field_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final OrFalseReduction.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        OrFalseReduction.field_visual_modifier_return retval = new OrFalseReduction.field_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set169=null;

        CommonTree set169_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:287:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set169=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                set169_tree = (CommonTree)adaptor.dupNode(set169);


                adaptor.addChild(root_0, set169_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:290:1: field_modifier : ( FINAL | STATIC | TRANSIENT | VOLATILE );
    public final OrFalseReduction.field_modifier_return field_modifier() throws RecognitionException {
        OrFalseReduction.field_modifier_return retval = new OrFalseReduction.field_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set170=null;

        CommonTree set170_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:291:3: ( FINAL | STATIC | TRANSIENT | VOLATILE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set170=(CommonTree)input.LT(1);

            if ( input.LA(1)==FINAL||input.LA(1)==STATIC||input.LA(1)==TRANSIENT||input.LA(1)==VOLATILE ) {
                input.consume();
                set170_tree = (CommonTree)adaptor.dupNode(set170);


                adaptor.addChild(root_0, set170_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:298:1: staticCtorDefinition : ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) ;
    public final OrFalseReduction.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        OrFalseReduction.staticCtorDefinition_return retval = new OrFalseReduction.staticCtorDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STATICCTORDECL171=null;
        CommonTree VMODIFIER172=null;
        CommonTree UNITHEADER174=null;
        CommonTree UNITBODY176=null;
        OrFalseReduction.field_visual_modifier_return field_visual_modifier173 =null;

        OrFalseReduction.methodInfo_return methodInfo175 =null;

        OrFalseReduction.body_return body177 =null;


        CommonTree STATICCTORDECL171_tree=null;
        CommonTree VMODIFIER172_tree=null;
        CommonTree UNITHEADER174_tree=null;
        CommonTree UNITBODY176_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:299:3: ( ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:299:5: ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STATICCTORDECL171=(CommonTree)match(input,STATICCTORDECL,FOLLOW_STATICCTORDECL_in_staticCtorDefinition1420); 
            STATICCTORDECL171_tree = (CommonTree)adaptor.dupNode(STATICCTORDECL171);


            root_1 = (CommonTree)adaptor.becomeRoot(STATICCTORDECL171_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER172=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_staticCtorDefinition1423); 
            VMODIFIER172_tree = (CommonTree)adaptor.dupNode(VMODIFIER172);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER172_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:299:34: ( field_visual_modifier )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0 >= PRIVATE && LA42_0 <= PUBLIC)) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:299:34: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition1425);
                        field_visual_modifier173=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier173.getTree());


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
            UNITHEADER174=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_staticCtorDefinition1430); 
            UNITHEADER174_tree = (CommonTree)adaptor.dupNode(UNITHEADER174);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER174_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition1432);
            methodInfo175=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo175.getTree());


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
            UNITBODY176=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_staticCtorDefinition1436); 
            UNITBODY176_tree = (CommonTree)adaptor.dupNode(UNITBODY176);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY176_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_body_in_staticCtorDefinition1438);
            body177=body();

            state._fsp--;

            adaptor.addChild(root_2, body177.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:307:1: ctorDefinition : ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final OrFalseReduction.ctorDefinition_return ctorDefinition() throws RecognitionException {
        OrFalseReduction.ctorDefinition_return retval = new OrFalseReduction.ctorDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CTORDECL178=null;
        CommonTree VMODIFIER179=null;
        CommonTree GENERICDESC181=null;
        CommonTree UNITNAME183=null;
        CommonTree THROWCLAUSE186=null;
        CommonTree UNITHEADER188=null;
        CommonTree UNITBODY190=null;
        CommonTree UNITATTR192=null;
        OrFalseReduction.field_visual_modifier_return field_visual_modifier180 =null;

        OrFalseReduction.genericDescriptor_return genericDescriptor182 =null;

        OrFalseReduction.typeName_return typeName184 =null;

        OrFalseReduction.arguments_return arguments185 =null;

        OrFalseReduction.throwClause_return throwClause187 =null;

        OrFalseReduction.methodInfo_return methodInfo189 =null;

        OrFalseReduction.body_return body191 =null;

        OrFalseReduction.afterMethodInfo_return afterMethodInfo193 =null;


        CommonTree CTORDECL178_tree=null;
        CommonTree VMODIFIER179_tree=null;
        CommonTree GENERICDESC181_tree=null;
        CommonTree UNITNAME183_tree=null;
        CommonTree THROWCLAUSE186_tree=null;
        CommonTree UNITHEADER188_tree=null;
        CommonTree UNITBODY190_tree=null;
        CommonTree UNITATTR192_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:308:3: ( ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:308:5: ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CTORDECL178=(CommonTree)match(input,CTORDECL,FOLLOW_CTORDECL_in_ctorDefinition1461); 
            CTORDECL178_tree = (CommonTree)adaptor.dupNode(CTORDECL178);


            root_1 = (CommonTree)adaptor.becomeRoot(CTORDECL178_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER179=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_ctorDefinition1464); 
            VMODIFIER179_tree = (CommonTree)adaptor.dupNode(VMODIFIER179);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER179_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:308:28: ( field_visual_modifier )?
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0 >= PRIVATE && LA43_0 <= PUBLIC)) ) {
                    alt43=1;
                }
                switch (alt43) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:308:28: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition1466);
                        field_visual_modifier180=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier180.getTree());


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
            GENERICDESC181=(CommonTree)match(input,GENERICDESC,FOLLOW_GENERICDESC_in_ctorDefinition1471); 
            GENERICDESC181_tree = (CommonTree)adaptor.dupNode(GENERICDESC181);


            root_2 = (CommonTree)adaptor.becomeRoot(GENERICDESC181_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:308:66: ( genericDescriptor )?
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==EXTENDS) ) {
                    alt44=1;
                }
                switch (alt44) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:308:66: genericDescriptor
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_genericDescriptor_in_ctorDefinition1473);
                        genericDescriptor182=genericDescriptor();

                        state._fsp--;

                        adaptor.addChild(root_2, genericDescriptor182.getTree());


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
            UNITNAME183=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_ctorDefinition1478); 
            UNITNAME183_tree = (CommonTree)adaptor.dupNode(UNITNAME183);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME183_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeName_in_ctorDefinition1480);
            typeName184=typeName();

            state._fsp--;

            adaptor.addChild(root_2, typeName184.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arguments_in_ctorDefinition1483);
            arguments185=arguments();

            state._fsp--;

            adaptor.addChild(root_1, arguments185.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWCLAUSE186=(CommonTree)match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_ctorDefinition1486); 
            THROWCLAUSE186_tree = (CommonTree)adaptor.dupNode(THROWCLAUSE186);


            root_2 = (CommonTree)adaptor.becomeRoot(THROWCLAUSE186_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:308:131: ( throwClause )?
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==THROWS) ) {
                    alt45=1;
                }
                switch (alt45) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:308:131: throwClause
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_throwClause_in_ctorDefinition1488);
                        throwClause187=throwClause();

                        state._fsp--;

                        adaptor.addChild(root_2, throwClause187.getTree());


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
            UNITHEADER188=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_ctorDefinition1517); 
            UNITHEADER188_tree = (CommonTree)adaptor.dupNode(UNITHEADER188);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER188_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_ctorDefinition1519);
            methodInfo189=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo189.getTree());


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
            UNITBODY190=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_ctorDefinition1547); 
            UNITBODY190_tree = (CommonTree)adaptor.dupNode(UNITBODY190);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY190_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_body_in_ctorDefinition1549);
            body191=body();

            state._fsp--;

            adaptor.addChild(root_2, body191.getTree());


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
            UNITATTR192=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_ctorDefinition1577); 
            UNITATTR192_tree = (CommonTree)adaptor.dupNode(UNITATTR192);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR192_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:311:36: ( afterMethodInfo )?
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AnnotationDefault||LA46_0==Deprecated||LA46_0==Exceptions||(LA46_0 >= RuntimeInvisibleAnnotations && LA46_0 <= RuntimeVisibleParameterAnnotations)||LA46_0==Signature||LA46_0==Synthetic) ) {
                    alt46=1;
                }
                switch (alt46) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:311:36: afterMethodInfo
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition1579);
                        afterMethodInfo193=afterMethodInfo();

                        state._fsp--;

                        adaptor.addChild(root_2, afterMethodInfo193.getTree());


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
    // $ANTLR end "ctorDefinition"


    public static class methodDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:319:1: methodDefinition : ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final OrFalseReduction.methodDefinition_return methodDefinition() throws RecognitionException {
        OrFalseReduction.methodDefinition_return retval = new OrFalseReduction.methodDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree METHODDECL194=null;
        CommonTree VMODIFIER195=null;
        CommonTree MODIFIER197=null;
        CommonTree GENERICDESC199=null;
        CommonTree RETVALUE201=null;
        CommonTree UNITNAME203=null;
        CommonTree IDENTIFIER204=null;
        CommonTree THROWCLAUSE206=null;
        CommonTree UNITHEADER208=null;
        CommonTree UNITBODY210=null;
        CommonTree UNITATTR212=null;
        OrFalseReduction.method_visual_modifier_return method_visual_modifier196 =null;

        OrFalseReduction.method_modifier_return method_modifier198 =null;

        OrFalseReduction.genericDescriptor_return genericDescriptor200 =null;

        OrFalseReduction.type_return type202 =null;

        OrFalseReduction.arguments_return arguments205 =null;

        OrFalseReduction.throwClauseMethod_return throwClauseMethod207 =null;

        OrFalseReduction.methodInfo_return methodInfo209 =null;

        OrFalseReduction.body_return body211 =null;

        OrFalseReduction.afterMethodInfo_return afterMethodInfo213 =null;


        CommonTree METHODDECL194_tree=null;
        CommonTree VMODIFIER195_tree=null;
        CommonTree MODIFIER197_tree=null;
        CommonTree GENERICDESC199_tree=null;
        CommonTree RETVALUE201_tree=null;
        CommonTree UNITNAME203_tree=null;
        CommonTree IDENTIFIER204_tree=null;
        CommonTree THROWCLAUSE206_tree=null;
        CommonTree UNITHEADER208_tree=null;
        CommonTree UNITBODY210_tree=null;
        CommonTree UNITATTR212_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:3: ( ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:5: ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            METHODDECL194=(CommonTree)match(input,METHODDECL,FOLLOW_METHODDECL_in_methodDefinition1625); 
            METHODDECL194_tree = (CommonTree)adaptor.dupNode(METHODDECL194);


            root_1 = (CommonTree)adaptor.becomeRoot(METHODDECL194_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER195=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_methodDefinition1628); 
            VMODIFIER195_tree = (CommonTree)adaptor.dupNode(VMODIFIER195);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER195_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:30: ( method_visual_modifier )?
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0 >= PRIVATE && LA47_0 <= PUBLIC)) ) {
                    alt47=1;
                }
                switch (alt47) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:30: method_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_method_visual_modifier_in_methodDefinition1630);
                        method_visual_modifier196=method_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, method_visual_modifier196.getTree());


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
            MODIFIER197=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_methodDefinition1635); 
            MODIFIER197_tree = (CommonTree)adaptor.dupNode(MODIFIER197);


            root_2 = (CommonTree)adaptor.becomeRoot(MODIFIER197_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:66: ( method_modifier )*
                loop48:
                do {
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==ABSTRACT||LA48_0==FINAL||LA48_0==NATIVE||LA48_0==STATIC||LA48_0==STRICTFP||LA48_0==SYNCHRONIZED) ) {
                        alt48=1;
                    }


                    switch (alt48) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:66: method_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_method_modifier_in_methodDefinition1637);
                	    method_modifier198=method_modifier();

                	    state._fsp--;

                	    adaptor.addChild(root_2, method_modifier198.getTree());


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
            GENERICDESC199=(CommonTree)match(input,GENERICDESC,FOLLOW_GENERICDESC_in_methodDefinition1642); 
            GENERICDESC199_tree = (CommonTree)adaptor.dupNode(GENERICDESC199);


            root_2 = (CommonTree)adaptor.becomeRoot(GENERICDESC199_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:98: ( genericDescriptor )?
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==EXTENDS) ) {
                    alt49=1;
                }
                switch (alt49) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:98: genericDescriptor
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_genericDescriptor_in_methodDefinition1644);
                        genericDescriptor200=genericDescriptor();

                        state._fsp--;

                        adaptor.addChild(root_2, genericDescriptor200.getTree());


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
            RETVALUE201=(CommonTree)match(input,RETVALUE,FOLLOW_RETVALUE_in_methodDefinition1649); 
            RETVALUE201_tree = (CommonTree)adaptor.dupNode(RETVALUE201);


            root_2 = (CommonTree)adaptor.becomeRoot(RETVALUE201_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_methodDefinition1651);
            type202=type();

            state._fsp--;

            adaptor.addChild(root_2, type202.getTree());


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
            UNITNAME203=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_methodDefinition1655); 
            UNITNAME203_tree = (CommonTree)adaptor.dupNode(UNITNAME203);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME203_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER204=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDefinition1657); 
            IDENTIFIER204_tree = (CommonTree)adaptor.dupNode(IDENTIFIER204);


            adaptor.addChild(root_2, IDENTIFIER204_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arguments_in_methodDefinition1660);
            arguments205=arguments();

            state._fsp--;

            adaptor.addChild(root_1, arguments205.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWCLAUSE206=(CommonTree)match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_methodDefinition1663); 
            THROWCLAUSE206_tree = (CommonTree)adaptor.dupNode(THROWCLAUSE206);


            root_2 = (CommonTree)adaptor.becomeRoot(THROWCLAUSE206_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:182: ( throwClauseMethod )?
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==THROWS) ) {
                    alt50=1;
                }
                switch (alt50) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:320:182: throwClauseMethod
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_throwClauseMethod_in_methodDefinition1665);
                        throwClauseMethod207=throwClauseMethod();

                        state._fsp--;

                        adaptor.addChild(root_2, throwClauseMethod207.getTree());


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
            UNITHEADER208=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_methodDefinition1694); 
            UNITHEADER208_tree = (CommonTree)adaptor.dupNode(UNITHEADER208);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER208_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_methodDefinition1696);
            methodInfo209=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo209.getTree());


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
            UNITBODY210=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_methodDefinition1724); 
            UNITBODY210_tree = (CommonTree)adaptor.dupNode(UNITBODY210);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY210_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:322:36: ( body )?
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Code||LA51_0==Synthetic) ) {
                    alt51=1;
                }
                switch (alt51) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:322:36: body
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_body_in_methodDefinition1726);
                        body211=body();

                        state._fsp--;

                        adaptor.addChild(root_2, body211.getTree());


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
            UNITATTR212=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_methodDefinition1755); 
            UNITATTR212_tree = (CommonTree)adaptor.dupNode(UNITATTR212);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR212_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:323:36: ( afterMethodInfo )?
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==AnnotationDefault||LA52_0==Deprecated||LA52_0==Exceptions||(LA52_0 >= RuntimeInvisibleAnnotations && LA52_0 <= RuntimeVisibleParameterAnnotations)||LA52_0==Signature||LA52_0==Synthetic) ) {
                    alt52=1;
                }
                switch (alt52) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:323:36: afterMethodInfo
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition1757);
                        afterMethodInfo213=afterMethodInfo();

                        state._fsp--;

                        adaptor.addChild(root_2, afterMethodInfo213.getTree());


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
    // $ANTLR end "methodDefinition"


    public static class methodInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:327:1: methodInfo : ^( STANDINTOKEN methodSignatureInfo flags ) ;
    public final OrFalseReduction.methodInfo_return methodInfo() throws RecognitionException {
        OrFalseReduction.methodInfo_return retval = new OrFalseReduction.methodInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STANDINTOKEN214=null;
        OrFalseReduction.methodSignatureInfo_return methodSignatureInfo215 =null;

        OrFalseReduction.flags_return flags216 =null;


        CommonTree STANDINTOKEN214_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:328:3: ( ^( STANDINTOKEN methodSignatureInfo flags ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:328:5: ^( STANDINTOKEN methodSignatureInfo flags )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STANDINTOKEN214=(CommonTree)match(input,STANDINTOKEN,FOLLOW_STANDINTOKEN_in_methodInfo1799); 
            STANDINTOKEN214_tree = (CommonTree)adaptor.dupNode(STANDINTOKEN214);


            root_1 = (CommonTree)adaptor.becomeRoot(STANDINTOKEN214_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo1801);
            methodSignatureInfo215=methodSignatureInfo();

            state._fsp--;

            adaptor.addChild(root_1, methodSignatureInfo215.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flags_in_methodInfo1803);
            flags216=flags();

            state._fsp--;

            adaptor.addChild(root_1, flags216.getTree());


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
    // $ANTLR end "methodInfo"


    public static class afterMethodInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "afterMethodInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:331:1: afterMethodInfo : ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ ;
    public final OrFalseReduction.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        OrFalseReduction.afterMethodInfo_return retval = new OrFalseReduction.afterMethodInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Deprecated217=null;
        CommonTree BOOLEANLITERAL218=null;
        CommonTree Signature219=null;
        CommonTree CPINDEX220=null;
        CommonTree Exceptions225=null;
        CommonTree Synthetic227=null;
        CommonTree BOOLEANLITERAL228=null;
        OrFalseReduction.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations221 =null;

        OrFalseReduction.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info222 =null;

        OrFalseReduction.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations223 =null;

        OrFalseReduction.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations224 =null;

        OrFalseReduction.throwClause_return throwClause226 =null;

        OrFalseReduction.annotationDefault_return annotationDefault229 =null;


        CommonTree Deprecated217_tree=null;
        CommonTree BOOLEANLITERAL218_tree=null;
        CommonTree Signature219_tree=null;
        CommonTree CPINDEX220_tree=null;
        CommonTree Exceptions225_tree=null;
        CommonTree Synthetic227_tree=null;
        CommonTree BOOLEANLITERAL228_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:332:3: ( ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:332:5: ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:332:5: ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:332:6: ^( Deprecated BOOLEANLITERAL )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Deprecated217=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfo1819); 
            	    Deprecated217_tree = (CommonTree)adaptor.dupNode(Deprecated217);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Deprecated217_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    BOOLEANLITERAL218=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1822); 
            	    BOOLEANLITERAL218_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL218);


            	    adaptor.addChild(root_1, BOOLEANLITERAL218_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:333:5: ^( Signature CPINDEX )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Signature219=(CommonTree)match(input,Signature,FOLLOW_Signature_in_afterMethodInfo1830); 
            	    Signature219_tree = (CommonTree)adaptor.dupNode(Signature219);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Signature219_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    CPINDEX220=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfo1832); 
            	    CPINDEX220_tree = (CommonTree)adaptor.dupNode(CPINDEX220);


            	    adaptor.addChild(root_1, CPINDEX220_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:334:5: runtimeInvisibleParameterAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo1839);
            	    runtimeInvisibleParameterAnnotations221=runtimeInvisibleParameterAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeInvisibleParameterAnnotations221.getTree());


            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:335:5: runtimeVisibleAnnotations_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1845);
            	    runtimeVisibleAnnotations_info222=runtimeVisibleAnnotations_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleAnnotations_info222.getTree());


            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:336:5: runtimeInvisibleAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo1851);
            	    runtimeInvisibleAnnotations223=runtimeInvisibleAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeInvisibleAnnotations223.getTree());


            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:337:5: runtimeVisibleParameterAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo1857);
            	    runtimeVisibleParameterAnnotations224=runtimeVisibleParameterAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleParameterAnnotations224.getTree());


            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:338:5: ^( Exceptions throwClause )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Exceptions225=(CommonTree)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfo1864); 
            	    Exceptions225_tree = (CommonTree)adaptor.dupNode(Exceptions225);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Exceptions225_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_throwClause_in_afterMethodInfo1867);
            	    throwClause226=throwClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, throwClause226.getTree());


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:339:5: ^( Synthetic BOOLEANLITERAL )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Synthetic227=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfo1875); 
            	    Synthetic227_tree = (CommonTree)adaptor.dupNode(Synthetic227);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Synthetic227_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    BOOLEANLITERAL228=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1877); 
            	    BOOLEANLITERAL228_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL228);


            	    adaptor.addChild(root_1, BOOLEANLITERAL228_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:340:5: annotationDefault
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_annotationDefault_in_afterMethodInfo1884);
            	    annotationDefault229=annotationDefault();

            	    state._fsp--;

            	    adaptor.addChild(root_0, annotationDefault229.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:343:1: annotationDefault : ^( AnnotationDefault DefaultValue annotationValue ) ;
    public final OrFalseReduction.annotationDefault_return annotationDefault() throws RecognitionException {
        OrFalseReduction.annotationDefault_return retval = new OrFalseReduction.annotationDefault_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationDefault230=null;
        CommonTree DefaultValue231=null;
        OrFalseReduction.annotationValue_return annotationValue232 =null;


        CommonTree AnnotationDefault230_tree=null;
        CommonTree DefaultValue231_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:344:3: ( ^( AnnotationDefault DefaultValue annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:344:5: ^( AnnotationDefault DefaultValue annotationValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AnnotationDefault230=(CommonTree)match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault1900); 
            AnnotationDefault230_tree = (CommonTree)adaptor.dupNode(AnnotationDefault230);


            root_1 = (CommonTree)adaptor.becomeRoot(AnnotationDefault230_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            DefaultValue231=(CommonTree)match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault1903); 
            DefaultValue231_tree = (CommonTree)adaptor.dupNode(DefaultValue231);


            adaptor.addChild(root_1, DefaultValue231_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationValue_in_annotationDefault1905);
            annotationValue232=annotationValue();

            state._fsp--;

            adaptor.addChild(root_1, annotationValue232.getTree());


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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodSignatureInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:347:1: methodSignatureInfo : ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) ;
    public final OrFalseReduction.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        OrFalseReduction.methodSignatureInfo_return retval = new OrFalseReduction.methodSignatureInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature233=null;
        CommonTree PARAMDESC234=null;
        CommonTree RETDESC236=null;
        OrFalseReduction.bytecodeType_return bytecodeType235 =null;

        OrFalseReduction.returnDescriptor_return returnDescriptor237 =null;


        CommonTree Signature233_tree=null;
        CommonTree PARAMDESC234_tree=null;
        CommonTree RETDESC236_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:348:3: ( ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:348:5: ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature233=(CommonTree)match(input,Signature,FOLLOW_Signature_in_methodSignatureInfo1922); 
            Signature233_tree = (CommonTree)adaptor.dupNode(Signature233);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature233_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PARAMDESC234=(CommonTree)match(input,PARAMDESC,FOLLOW_PARAMDESC_in_methodSignatureInfo1925); 
            PARAMDESC234_tree = (CommonTree)adaptor.dupNode(PARAMDESC234);


            root_2 = (CommonTree)adaptor.becomeRoot(PARAMDESC234_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:348:29: ( bytecodeType )*
                loop54:
                do {
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==BaseType||LA54_0==IDENTIFIER||LA54_0==INTERNALTYPE||LA54_0==LBRACK) ) {
                        alt54=1;
                    }


                    switch (alt54) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:348:29: bytecodeType
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo1927);
                	    bytecodeType235=bytecodeType();

                	    state._fsp--;

                	    adaptor.addChild(root_2, bytecodeType235.getTree());


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
            RETDESC236=(CommonTree)match(input,RETDESC,FOLLOW_RETDESC_in_methodSignatureInfo1932); 
            RETDESC236_tree = (CommonTree)adaptor.dupNode(RETDESC236);


            root_2 = (CommonTree)adaptor.becomeRoot(RETDESC236_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo1934);
            returnDescriptor237=returnDescriptor();

            state._fsp--;

            adaptor.addChild(root_2, returnDescriptor237.getTree());


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
    // $ANTLR end "methodSignatureInfo"


    public static class returnDescriptor_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:351:1: returnDescriptor : ( bytecodeType | VoidType );
    public final OrFalseReduction.returnDescriptor_return returnDescriptor() throws RecognitionException {
        OrFalseReduction.returnDescriptor_return retval = new OrFalseReduction.returnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VoidType239=null;
        OrFalseReduction.bytecodeType_return bytecodeType238 =null;


        CommonTree VoidType239_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:352:3: ( bytecodeType | VoidType )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:352:5: bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor1949);
                    bytecodeType238=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType238.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:352:20: VoidType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VoidType239=(CommonTree)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor1953); 
                    VoidType239_tree = (CommonTree)adaptor.dupNode(VoidType239);


                    adaptor.addChild(root_0, VoidType239_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:355:1: method_modifier : ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP );
    public final OrFalseReduction.method_modifier_return method_modifier() throws RecognitionException {
        OrFalseReduction.method_modifier_return retval = new OrFalseReduction.method_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set240=null;

        CommonTree set240_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:356:3: ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set240=(CommonTree)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL||input.LA(1)==NATIVE||input.LA(1)==STATIC||input.LA(1)==STRICTFP||input.LA(1)==SYNCHRONIZED ) {
                input.consume();
                set240_tree = (CommonTree)adaptor.dupNode(set240);


                adaptor.addChild(root_0, set240_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:359:1: method_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final OrFalseReduction.method_visual_modifier_return method_visual_modifier() throws RecognitionException {
        OrFalseReduction.method_visual_modifier_return retval = new OrFalseReduction.method_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set241=null;

        CommonTree set241_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:360:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set241=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                set241_tree = (CommonTree)adaptor.dupNode(set241);


                adaptor.addChild(root_0, set241_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:363:1: arguments : ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) ;
    public final OrFalseReduction.arguments_return arguments() throws RecognitionException {
        OrFalseReduction.arguments_return retval = new OrFalseReduction.arguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITARGUMENTS242=null;
        CommonTree DOT244=null;
        CommonTree DOT245=null;
        CommonTree DOT246=null;
        OrFalseReduction.typeList_return typeList243 =null;


        CommonTree UNITARGUMENTS242_tree=null;
        CommonTree DOT244_tree=null;
        CommonTree DOT245_tree=null;
        CommonTree DOT246_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:364:3: ( ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:364:5: ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITARGUMENTS242=(CommonTree)match(input,UNITARGUMENTS,FOLLOW_UNITARGUMENTS_in_arguments2025); 
            UNITARGUMENTS242_tree = (CommonTree)adaptor.dupNode(UNITARGUMENTS242);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITARGUMENTS242_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:364:21: ( typeList )?
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==BOOLEAN||LA56_0==BYTE||LA56_0==CHAR||LA56_0==DOUBLE||LA56_0==FLOAT||LA56_0==INT||LA56_0==LONG||LA56_0==SHORT||LA56_0==UNITNAME||LA56_0==VOID) ) {
                    alt56=1;
                }
                switch (alt56) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:364:21: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_arguments2027);
                        typeList243=typeList();

                        state._fsp--;

                        adaptor.addChild(root_1, typeList243.getTree());


                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:364:31: ( DOT DOT DOT )?
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==DOT) ) {
                    alt57=1;
                }
                switch (alt57) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:364:32: DOT DOT DOT
                        {
                        _last = (CommonTree)input.LT(1);
                        DOT244=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2031); 
                        DOT244_tree = (CommonTree)adaptor.dupNode(DOT244);


                        adaptor.addChild(root_1, DOT244_tree);


                        _last = (CommonTree)input.LT(1);
                        DOT245=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2033); 
                        DOT245_tree = (CommonTree)adaptor.dupNode(DOT245);


                        adaptor.addChild(root_1, DOT245_tree);


                        _last = (CommonTree)input.LT(1);
                        DOT246=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2035); 
                        DOT246_tree = (CommonTree)adaptor.dupNode(DOT246);


                        adaptor.addChild(root_1, DOT246_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:371:1: body : ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* ;
    public final OrFalseReduction.body_return body() throws RecognitionException {
        OrFalseReduction.body_return retval = new OrFalseReduction.body_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Synthetic247=null;
        CommonTree BOOLEANLITERAL248=null;
        CommonTree Code249=null;
        OrFalseReduction.codeBlock_return codeBlock250 =null;

        OrFalseReduction.bodyExtension_return bodyExtension251 =null;


        CommonTree Synthetic247_tree=null;
        CommonTree BOOLEANLITERAL248_tree=null;
        CommonTree Code249_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:372:3: ( ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:372:5: ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:372:5: ( Synthetic BOOLEANLITERAL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Synthetic) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:372:6: Synthetic BOOLEANLITERAL
                    {
                    _last = (CommonTree)input.LT(1);
                    Synthetic247=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_body2060); 
                    Synthetic247_tree = (CommonTree)adaptor.dupNode(Synthetic247);


                    adaptor.addChild(root_0, Synthetic247_tree);


                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL248=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_body2062); 
                    BOOLEANLITERAL248_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL248);


                    adaptor.addChild(root_0, BOOLEANLITERAL248_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Code249=(CommonTree)match(input,Code,FOLLOW_Code_in_body2067); 
            Code249_tree = (CommonTree)adaptor.dupNode(Code249);


            root_1 = (CommonTree)adaptor.becomeRoot(Code249_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_body2069);
            codeBlock250=codeBlock();

            state._fsp--;

            adaptor.addChild(root_1, codeBlock250.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:372:51: ( bodyExtension )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==ExceptionTable||(LA59_0 >= LineNumberTable && LA59_0 <= LocalVariableTypeTable)||(LA59_0 >= StackMap && LA59_0 <= StackMapTable)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:372:51: bodyExtension
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bodyExtension_in_body2072);
            	    bodyExtension251=bodyExtension();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bodyExtension251.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:375:1: bodyExtension : ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) ) ;
    public final OrFalseReduction.bodyExtension_return bodyExtension() throws RecognitionException {
        OrFalseReduction.bodyExtension_return retval = new OrFalseReduction.bodyExtension_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ExceptionTable252=null;
        CommonTree LineNumberTable254=null;
        CommonTree LocalVariableTable256=null;
        CommonTree LocalVariableTypeTable258=null;
        CommonTree StackMapTable260=null;
        CommonTree StackMap262=null;
        OrFalseReduction.exceptionTable_return exceptionTable253 =null;

        OrFalseReduction.lineNumberTable_return lineNumberTable255 =null;

        OrFalseReduction.localVariableTable_return localVariableTable257 =null;

        OrFalseReduction.localVariableTable_return localVariableTable259 =null;

        OrFalseReduction.stackMapTable_return stackMapTable261 =null;

        OrFalseReduction.stackMapTypeTable_return stackMapTypeTable263 =null;


        CommonTree ExceptionTable252_tree=null;
        CommonTree LineNumberTable254_tree=null;
        CommonTree LocalVariableTable256_tree=null;
        CommonTree LocalVariableTypeTable258_tree=null;
        CommonTree StackMapTable260_tree=null;
        CommonTree StackMap262_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:376:3: ( ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:377:3: ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:377:3: ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:377:5: ^( ExceptionTable exceptionTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ExceptionTable252=(CommonTree)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension2093); 
                    ExceptionTable252_tree = (CommonTree)adaptor.dupNode(ExceptionTable252);


                    root_1 = (CommonTree)adaptor.becomeRoot(ExceptionTable252_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension2096);
                    exceptionTable253=exceptionTable();

                    state._fsp--;

                    adaptor.addChild(root_1, exceptionTable253.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:378:5: ^( LineNumberTable ( lineNumberTable )? )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LineNumberTable254=(CommonTree)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension2104); 
                    LineNumberTable254_tree = (CommonTree)adaptor.dupNode(LineNumberTable254);


                    root_1 = (CommonTree)adaptor.becomeRoot(LineNumberTable254_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:378:24: ( lineNumberTable )?
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==IDENTIFIER) ) {
                            alt60=1;
                        }
                        switch (alt60) {
                            case 1 :
                                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:378:24: lineNumberTable
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_lineNumberTable_in_bodyExtension2107);
                                lineNumberTable255=lineNumberTable();

                                state._fsp--;

                                adaptor.addChild(root_1, lineNumberTable255.getTree());


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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:379:5: ^( LocalVariableTable localVariableTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LocalVariableTable256=(CommonTree)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension2116); 
                    LocalVariableTable256_tree = (CommonTree)adaptor.dupNode(LocalVariableTable256);


                    root_1 = (CommonTree)adaptor.becomeRoot(LocalVariableTable256_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension2119);
                    localVariableTable257=localVariableTable();

                    state._fsp--;

                    adaptor.addChild(root_1, localVariableTable257.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:380:5: ^( LocalVariableTypeTable localVariableTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LocalVariableTypeTable258=(CommonTree)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension2127); 
                    LocalVariableTypeTable258_tree = (CommonTree)adaptor.dupNode(LocalVariableTypeTable258);


                    root_1 = (CommonTree)adaptor.becomeRoot(LocalVariableTypeTable258_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension2130);
                    localVariableTable259=localVariableTable();

                    state._fsp--;

                    adaptor.addChild(root_1, localVariableTable259.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:381:5: ^( StackMapTable stackMapTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    StackMapTable260=(CommonTree)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension2138); 
                    StackMapTable260_tree = (CommonTree)adaptor.dupNode(StackMapTable260);


                    root_1 = (CommonTree)adaptor.becomeRoot(StackMapTable260_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension2140);
                    stackMapTable261=stackMapTable();

                    state._fsp--;

                    adaptor.addChild(root_1, stackMapTable261.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:382:5: ^( StackMap stackMapTypeTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    StackMap262=(CommonTree)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension2148); 
                    StackMap262_tree = (CommonTree)adaptor.dupNode(StackMap262);


                    root_1 = (CommonTree)adaptor.becomeRoot(StackMap262_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension2150);
                    stackMapTypeTable263=stackMapTypeTable();

                    state._fsp--;

                    adaptor.addChild(root_1, stackMapTypeTable263.getTree());


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


    protected static class codeBlock_scope {
        ArrayList<CodeLine> instructions;
        ArrayList<CommonTree> operands;
        CodeLine cLine;
    }
    protected Stack codeBlock_stack = new Stack();


    public static class codeBlock_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeBlock"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:386:1: codeBlock : ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) ;
    public final OrFalseReduction.codeBlock_return codeBlock() throws RecognitionException {
        codeBlock_stack.push(new codeBlock_scope());
        OrFalseReduction.codeBlock_return retval = new OrFalseReduction.codeBlock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VARINFO264=null;
        CommonTree INSTRUCTION266=null;
        OrFalseReduction.variables_return variables265 =null;

        OrFalseReduction.instructionSet_return instructionSet267 =null;

        OrFalseReduction.codeBlockEnd_return codeBlockEnd268 =null;


        CommonTree VARINFO264_tree=null;
        CommonTree INSTRUCTION266_tree=null;


        ((codeBlock_scope)codeBlock_stack.peek()).instructions = new ArrayList<CodeLine>();

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:395:3: ( ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:395:5: ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VARINFO264=(CommonTree)match(input,VARINFO,FOLLOW_VARINFO_in_codeBlock2178); 
            VARINFO264_tree = (CommonTree)adaptor.dupNode(VARINFO264);


            root_1 = (CommonTree)adaptor.becomeRoot(VARINFO264_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variables_in_codeBlock2180);
            variables265=variables();

            state._fsp--;

            adaptor.addChild(root_1, variables265.getTree());


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
            INSTRUCTION266=(CommonTree)match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_codeBlock2184); 
            INSTRUCTION266_tree = (CommonTree)adaptor.dupNode(INSTRUCTION266);


            root_1 = (CommonTree)adaptor.becomeRoot(INSTRUCTION266_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:395:40: ( instructionSet )*
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:395:40: instructionSet
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_instructionSet_in_codeBlock2186);
            	    instructionSet267=instructionSet();

            	    state._fsp--;

            	    adaptor.addChild(root_1, instructionSet267.getTree());


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock2189);
            codeBlockEnd268=codeBlockEnd();

            state._fsp--;

            adaptor.addChild(root_1, codeBlockEnd268.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            codeblocks.put(INSTRUCTION266, ((codeBlock_scope)codeBlock_stack.peek()).instructions);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            codeBlock_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "codeBlock"


    public static class instructionSet_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instructionSet"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:399:1: instructionSet : ( codeLine | javaSwitch );
    public final OrFalseReduction.instructionSet_return instructionSet() throws RecognitionException {
        OrFalseReduction.instructionSet_return retval = new OrFalseReduction.instructionSet_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.codeLine_return codeLine269 =null;

        OrFalseReduction.javaSwitch_return javaSwitch270 =null;




        ((codeBlock_scope)codeBlock_stack.peek()).operands = new ArrayList<CommonTree>();

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:403:3: ( codeLine | javaSwitch )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:403:5: codeLine
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_codeLine_in_instructionSet2212);
                    codeLine269=codeLine();

                    state._fsp--;

                    adaptor.addChild(root_0, codeLine269.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:404:5: javaSwitch
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_javaSwitch_in_instructionSet2219);
                    javaSwitch270=javaSwitch();

                    state._fsp--;

                    adaptor.addChild(root_0, javaSwitch270.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:407:1: codeLine : ^( IDENTIFIER pc ^( OPERAND (op1= operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) ;
    public final OrFalseReduction.codeLine_return codeLine() throws RecognitionException {
        OrFalseReduction.codeLine_return retval = new OrFalseReduction.codeLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER271=null;
        CommonTree OPERAND273=null;
        CommonTree OPERAND274=null;
        CommonTree INTLITERAL275=null;
        OrFalseReduction.operand1_return op1 =null;

        OrFalseReduction.pc_return pc272 =null;


        CommonTree IDENTIFIER271_tree=null;
        CommonTree OPERAND273_tree=null;
        CommonTree OPERAND274_tree=null;
        CommonTree INTLITERAL275_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:408:3: ( ^( IDENTIFIER pc ^( OPERAND (op1= operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:408:5: ^( IDENTIFIER pc ^( OPERAND (op1= operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER271=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine2233); 
            IDENTIFIER271_tree = (CommonTree)adaptor.dupNode(IDENTIFIER271);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER271_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_codeLine2235);
            pc272=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc272.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OPERAND273=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_codeLine2238); 
            OPERAND273_tree = (CommonTree)adaptor.dupNode(OPERAND273);


            root_2 = (CommonTree)adaptor.becomeRoot(OPERAND273_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:408:34: (op1= operand1 )?
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==BOOLEAN||LA64_0==BYTE||LA64_0==CHAR||LA64_0==CPINDEX||LA64_0==DOUBLE||LA64_0==FLOAT||LA64_0==INT||LA64_0==INTLITERAL||LA64_0==LONG||LA64_0==SHORT||LA64_0==VOID) ) {
                    alt64=1;
                }
                switch (alt64) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:408:34: op1= operand1
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_operand1_in_codeLine2242);
                        op1=operand1();

                        state._fsp--;

                        adaptor.addChild(root_2, op1.getTree());


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
            OPERAND274=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_codeLine2247); 
            OPERAND274_tree = (CommonTree)adaptor.dupNode(OPERAND274);


            root_2 = (CommonTree)adaptor.becomeRoot(OPERAND274_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:408:56: ( INTLITERAL )?
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==INTLITERAL) ) {
                    alt65=1;
                }
                switch (alt65) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:408:56: INTLITERAL
                        {
                        _last = (CommonTree)input.LT(1);
                        INTLITERAL275=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeLine2249); 
                        INTLITERAL275_tree = (CommonTree)adaptor.dupNode(INTLITERAL275);


                        adaptor.addChild(root_2, INTLITERAL275_tree);


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



                  	((codeBlock_scope)codeBlock_stack.peek()).cLine = new CodeLine(IDENTIFIER271, (pc272!=null?pc272.value:0), ((codeBlock_scope)codeBlock_stack.peek()).operands);
              	((codeBlock_scope)codeBlock_stack.peek()).instructions.add(((codeBlock_scope)codeBlock_stack.peek()).cLine);
              

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:415:1: codeBlockEnd : ^( IDENTIFIER pc ( INTLITERAL )? ) ;
    public final OrFalseReduction.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        OrFalseReduction.codeBlockEnd_return retval = new OrFalseReduction.codeBlockEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER276=null;
        CommonTree INTLITERAL278=null;
        OrFalseReduction.pc_return pc277 =null;


        CommonTree IDENTIFIER276_tree=null;
        CommonTree INTLITERAL278_tree=null;


        ((codeBlock_scope)codeBlock_stack.peek()).operands = new ArrayList<CommonTree>();

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:419:3: ( ^( IDENTIFIER pc ( INTLITERAL )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:419:5: ^( IDENTIFIER pc ( INTLITERAL )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER276=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd2277); 
            IDENTIFIER276_tree = (CommonTree)adaptor.dupNode(IDENTIFIER276);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER276_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_codeBlockEnd2279);
            pc277=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc277.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:419:21: ( INTLITERAL )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==INTLITERAL) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:419:21: INTLITERAL
                    {
                    _last = (CommonTree)input.LT(1);
                    INTLITERAL278=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeBlockEnd2281); 
                    INTLITERAL278_tree = (CommonTree)adaptor.dupNode(INTLITERAL278);


                    adaptor.addChild(root_1, INTLITERAL278_tree);


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



                	((codeBlock_scope)codeBlock_stack.peek()).cLine = new CodeLine(IDENTIFIER276, (pc277!=null?pc277.value:0));
                	((codeBlock_scope)codeBlock_stack.peek()).cLine.AddOp(INTLITERAL278);
              	((codeBlock_scope)codeBlock_stack.peek()).instructions.add(((codeBlock_scope)codeBlock_stack.peek()).cLine);
              

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:427:1: operand1 : ( CPINDEX | INTLITERAL | primitiveType );
    public final OrFalseReduction.operand1_return operand1() throws RecognitionException {
        OrFalseReduction.operand1_return retval = new OrFalseReduction.operand1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX279=null;
        CommonTree INTLITERAL280=null;
        OrFalseReduction.primitiveType_return primitiveType281 =null;


        CommonTree CPINDEX279_tree=null;
        CommonTree INTLITERAL280_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:428:3: ( CPINDEX | INTLITERAL | primitiveType )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:428:5: CPINDEX
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CPINDEX279=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_operand12303); 
                    CPINDEX279_tree = (CommonTree)adaptor.dupNode(CPINDEX279);


                    adaptor.addChild(root_0, CPINDEX279_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:429:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL280=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_operand12310); 
                    INTLITERAL280_tree = (CommonTree)adaptor.dupNode(INTLITERAL280);


                    adaptor.addChild(root_0, INTLITERAL280_tree);


                    ((codeBlock_scope)codeBlock_stack.peek()).operands.add(INTLITERAL280);

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:430:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_operand12318);
                    primitiveType281=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType281.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:433:1: variables : variable variable variable ;
    public final OrFalseReduction.variables_return variables() throws RecognitionException {
        OrFalseReduction.variables_return retval = new OrFalseReduction.variables_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.variable_return variable282 =null;

        OrFalseReduction.variable_return variable283 =null;

        OrFalseReduction.variable_return variable284 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:434:3: ( variable variable variable )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:434:5: variable variable variable
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2331);
            variable282=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable282.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2333);
            variable283=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable283.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2335);
            variable284=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable284.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:437:1: variable : ^( ASSIGN IDENTIFIER INTLITERAL ) ;
    public final OrFalseReduction.variable_return variable() throws RecognitionException {
        OrFalseReduction.variable_return retval = new OrFalseReduction.variable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN285=null;
        CommonTree IDENTIFIER286=null;
        CommonTree INTLITERAL287=null;

        CommonTree ASSIGN285_tree=null;
        CommonTree IDENTIFIER286_tree=null;
        CommonTree INTLITERAL287_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:438:3: ( ^( ASSIGN IDENTIFIER INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:438:5: ^( ASSIGN IDENTIFIER INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN285=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable2349); 
            ASSIGN285_tree = (CommonTree)adaptor.dupNode(ASSIGN285);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN285_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER286=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable2351); 
            IDENTIFIER286_tree = (CommonTree)adaptor.dupNode(IDENTIFIER286);


            adaptor.addChild(root_1, IDENTIFIER286_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL287=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable2353); 
            INTLITERAL287_tree = (CommonTree)adaptor.dupNode(INTLITERAL287);


            adaptor.addChild(root_1, INTLITERAL287_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:441:1: javaSwitch : ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) ;
    public final OrFalseReduction.javaSwitch_return javaSwitch() throws RecognitionException {
        OrFalseReduction.javaSwitch_return retval = new OrFalseReduction.javaSwitch_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SWITCH288=null;
        CommonTree IDENTIFIER289=null;
        OrFalseReduction.pc_return pc290 =null;

        OrFalseReduction.switchLine_return switchLine291 =null;

        OrFalseReduction.switchDefaultLine_return switchDefaultLine292 =null;


        CommonTree SWITCH288_tree=null;
        CommonTree IDENTIFIER289_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:442:3: ( ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:442:5: ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SWITCH288=(CommonTree)match(input,SWITCH,FOLLOW_SWITCH_in_javaSwitch2368); 
            SWITCH288_tree = (CommonTree)adaptor.dupNode(SWITCH288);


            root_1 = (CommonTree)adaptor.becomeRoot(SWITCH288_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER289=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch2371); 
            IDENTIFIER289_tree = (CommonTree)adaptor.dupNode(IDENTIFIER289);


            root_2 = (CommonTree)adaptor.becomeRoot(IDENTIFIER289_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_javaSwitch2373);
            pc290=pc();

            state._fsp--;

            adaptor.addChild(root_2, pc290.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:442:30: ( switchLine )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==INTLITERAL) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:442:30: switchLine
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch2375);
            	    switchLine291=switchLine();

            	    state._fsp--;

            	    adaptor.addChild(root_2, switchLine291.getTree());


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch2378);
            switchDefaultLine292=switchDefaultLine();

            state._fsp--;

            adaptor.addChild(root_2, switchDefaultLine292.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



              	((codeBlock_scope)codeBlock_stack.peek()).cLine = new CodeLine(IDENTIFIER289, (pc290!=null?pc290.value:0), ((codeBlock_scope)codeBlock_stack.peek()).operands);
              	((codeBlock_scope)codeBlock_stack.peek()).instructions.add(((codeBlock_scope)codeBlock_stack.peek()).cLine);
              

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:449:1: switchLine : pc INTLITERAL ;
    public final OrFalseReduction.switchLine_return switchLine() throws RecognitionException {
        OrFalseReduction.switchLine_return retval = new OrFalseReduction.switchLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL294=null;
        OrFalseReduction.pc_return pc293 =null;


        CommonTree INTLITERAL294_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:450:3: ( pc INTLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:450:5: pc INTLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_switchLine2399);
            pc293=pc();

            state._fsp--;

            adaptor.addChild(root_0, pc293.getTree());


            _last = (CommonTree)input.LT(1);
            INTLITERAL294=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine2401); 
            INTLITERAL294_tree = (CommonTree)adaptor.dupNode(INTLITERAL294);


            adaptor.addChild(root_0, INTLITERAL294_tree);


            ((codeBlock_scope)codeBlock_stack.peek()).operands.add(INTLITERAL294);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:453:1: switchDefaultLine : ^( DEFAULT INTLITERAL ) ;
    public final OrFalseReduction.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        OrFalseReduction.switchDefaultLine_return retval = new OrFalseReduction.switchDefaultLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT295=null;
        CommonTree INTLITERAL296=null;

        CommonTree DEFAULT295_tree=null;
        CommonTree INTLITERAL296_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:454:3: ( ^( DEFAULT INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:454:5: ^( DEFAULT INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DEFAULT295=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine2417); 
            DEFAULT295_tree = (CommonTree)adaptor.dupNode(DEFAULT295);


            root_1 = (CommonTree)adaptor.becomeRoot(DEFAULT295_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INTLITERAL296=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine2419); 
            INTLITERAL296_tree = (CommonTree)adaptor.dupNode(INTLITERAL296);


            adaptor.addChild(root_1, INTLITERAL296_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:461:1: throwClause : ^( THROWS typeList ) ;
    public final OrFalseReduction.throwClause_return throwClause() throws RecognitionException {
        OrFalseReduction.throwClause_return retval = new OrFalseReduction.throwClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROWS297=null;
        OrFalseReduction.typeList_return typeList298 =null;


        CommonTree THROWS297_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:462:3: ( ^( THROWS typeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:462:5: ^( THROWS typeList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWS297=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClause2439); 
            THROWS297_tree = (CommonTree)adaptor.dupNode(THROWS297);


            root_1 = (CommonTree)adaptor.becomeRoot(THROWS297_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeList_in_throwClause2441);
            typeList298=typeList();

            state._fsp--;

            adaptor.addChild(root_1, typeList298.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:465:1: throwClauseMethod : ^( THROWS ( throwType )+ ) ;
    public final OrFalseReduction.throwClauseMethod_return throwClauseMethod() throws RecognitionException {
        OrFalseReduction.throwClauseMethod_return retval = new OrFalseReduction.throwClauseMethod_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROWS299=null;
        OrFalseReduction.throwType_return throwType300 =null;


        CommonTree THROWS299_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:466:3: ( ^( THROWS ( throwType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:466:5: ^( THROWS ( throwType )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWS299=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClauseMethod2458); 
            THROWS299_tree = (CommonTree)adaptor.dupNode(THROWS299);


            root_1 = (CommonTree)adaptor.becomeRoot(THROWS299_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:466:14: ( throwType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:466:14: throwType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_throwType_in_throwClauseMethod2460);
            	    throwType300=throwType();

            	    state._fsp--;

            	    adaptor.addChild(root_1, throwType300.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:469:1: throwType : ( INTERNALTYPE | IDENTIFIER | QualifiedType );
    public final OrFalseReduction.throwType_return throwType() throws RecognitionException {
        OrFalseReduction.throwType_return retval = new OrFalseReduction.throwType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set301=null;

        CommonTree set301_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:470:3: ( INTERNALTYPE | IDENTIFIER | QualifiedType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set301=(CommonTree)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE||input.LA(1)==QualifiedType ) {
                input.consume();
                set301_tree = (CommonTree)adaptor.dupNode(set301);


                adaptor.addChild(root_0, set301_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:473:1: exceptionTable : ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) ;
    public final OrFalseReduction.exceptionTable_return exceptionTable() throws RecognitionException {
        OrFalseReduction.exceptionTable_return retval = new OrFalseReduction.exceptionTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ETHEADER302=null;
        CommonTree IDENTIFIER303=null;
        CommonTree IDENTIFIER304=null;
        CommonTree IDENTIFIER305=null;
        CommonTree IDENTIFIER306=null;
        CommonTree ETENTRY307=null;
        OrFalseReduction.exceptionTableEntry_return exceptionTableEntry308 =null;


        CommonTree ETHEADER302_tree=null;
        CommonTree IDENTIFIER303_tree=null;
        CommonTree IDENTIFIER304_tree=null;
        CommonTree IDENTIFIER305_tree=null;
        CommonTree IDENTIFIER306_tree=null;
        CommonTree ETENTRY307_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:474:3: ( ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:474:5: ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ETHEADER302=(CommonTree)match(input,ETHEADER,FOLLOW_ETHEADER_in_exceptionTable2499); 
            ETHEADER302_tree = (CommonTree)adaptor.dupNode(ETHEADER302);


            root_1 = (CommonTree)adaptor.becomeRoot(ETHEADER302_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER303=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2501); 
            IDENTIFIER303_tree = (CommonTree)adaptor.dupNode(IDENTIFIER303);


            adaptor.addChild(root_1, IDENTIFIER303_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER304=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2503); 
            IDENTIFIER304_tree = (CommonTree)adaptor.dupNode(IDENTIFIER304);


            adaptor.addChild(root_1, IDENTIFIER304_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER305=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2505); 
            IDENTIFIER305_tree = (CommonTree)adaptor.dupNode(IDENTIFIER305);


            adaptor.addChild(root_1, IDENTIFIER305_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER306=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2507); 
            IDENTIFIER306_tree = (CommonTree)adaptor.dupNode(IDENTIFIER306);


            adaptor.addChild(root_1, IDENTIFIER306_tree);


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
            ETENTRY307=(CommonTree)match(input,ETENTRY,FOLLOW_ETENTRY_in_exceptionTable2511); 
            ETENTRY307_tree = (CommonTree)adaptor.dupNode(ETENTRY307);


            root_1 = (CommonTree)adaptor.becomeRoot(ETENTRY307_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:474:71: ( exceptionTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:474:71: exceptionTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable2513);
            	    exceptionTableEntry308=exceptionTableEntry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, exceptionTableEntry308.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:477:1: exceptionTableEntry : INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue ;
    public final OrFalseReduction.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        OrFalseReduction.exceptionTableEntry_return retval = new OrFalseReduction.exceptionTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL309=null;
        CommonTree INTLITERAL310=null;
        CommonTree INTLITERAL311=null;
        OrFalseReduction.exceptionTableEntryValue_return exceptionTableEntryValue312 =null;


        CommonTree INTLITERAL309_tree=null;
        CommonTree INTLITERAL310_tree=null;
        CommonTree INTLITERAL311_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:478:3: ( INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:478:5: INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL309=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2528); 
            INTLITERAL309_tree = (CommonTree)adaptor.dupNode(INTLITERAL309);


            adaptor.addChild(root_0, INTLITERAL309_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL310=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2530); 
            INTLITERAL310_tree = (CommonTree)adaptor.dupNode(INTLITERAL310);


            adaptor.addChild(root_0, INTLITERAL310_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL311=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2532); 
            INTLITERAL311_tree = (CommonTree)adaptor.dupNode(INTLITERAL311);


            adaptor.addChild(root_0, INTLITERAL311_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry2534);
            exceptionTableEntryValue312=exceptionTableEntryValue();

            state._fsp--;

            adaptor.addChild(root_0, exceptionTableEntryValue312.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:480:1: exceptionTableEntryValue : ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE );
    public final OrFalseReduction.exceptionTableEntryValue_return exceptionTableEntryValue() throws RecognitionException {
        OrFalseReduction.exceptionTableEntryValue_return retval = new OrFalseReduction.exceptionTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER314=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE315=null;
        OrFalseReduction.primitiveType_return primitiveType313 =null;


        CommonTree IDENTIFIER314_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE315_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:481:3: ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:481:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntryValue2546);
                    primitiveType313=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType313.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:482:5: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER314=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntryValue2552); 
                    IDENTIFIER314_tree = (CommonTree)adaptor.dupNode(IDENTIFIER314);


                    adaptor.addChild(root_0, IDENTIFIER314_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:483:5: CONSTANT_TYPE_ASSIGNABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CONSTANT_TYPE_ASSIGNABLE315=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue2558); 
                    CONSTANT_TYPE_ASSIGNABLE315_tree = (CommonTree)adaptor.dupNode(CONSTANT_TYPE_ASSIGNABLE315);


                    adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE315_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:490:1: lineNumberTable : ( lineNumberTableLine )+ ;
    public final OrFalseReduction.lineNumberTable_return lineNumberTable() throws RecognitionException {
        OrFalseReduction.lineNumberTable_return retval = new OrFalseReduction.lineNumberTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.lineNumberTableLine_return lineNumberTableLine316 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:491:3: ( ( lineNumberTableLine )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:491:5: ( lineNumberTableLine )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:491:5: ( lineNumberTableLine )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:491:5: lineNumberTableLine
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable2577);
            	    lineNumberTableLine316=lineNumberTableLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lineNumberTableLine316.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:494:1: lineNumberTableLine : ^( IDENTIFIER pc INTLITERAL ) ;
    public final OrFalseReduction.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        OrFalseReduction.lineNumberTableLine_return retval = new OrFalseReduction.lineNumberTableLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER317=null;
        CommonTree INTLITERAL319=null;
        OrFalseReduction.pc_return pc318 =null;


        CommonTree IDENTIFIER317_tree=null;
        CommonTree INTLITERAL319_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:495:3: ( ^( IDENTIFIER pc INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:495:5: ^( IDENTIFIER pc INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER317=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine2592); 
            IDENTIFIER317_tree = (CommonTree)adaptor.dupNode(IDENTIFIER317);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER317_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_lineNumberTableLine2594);
            pc318=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc318.getTree());


            _last = (CommonTree)input.LT(1);
            INTLITERAL319=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine2596); 
            INTLITERAL319_tree = (CommonTree)adaptor.dupNode(INTLITERAL319);


            adaptor.addChild(root_1, INTLITERAL319_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:502:1: localVariableTable : ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) ;
    public final OrFalseReduction.localVariableTable_return localVariableTable() throws RecognitionException {
        OrFalseReduction.localVariableTable_return retval = new OrFalseReduction.localVariableTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LVHEADER320=null;
        CommonTree IDENTIFIER321=null;
        CommonTree IDENTIFIER322=null;
        CommonTree IDENTIFIER323=null;
        CommonTree IDENTIFIER324=null;
        CommonTree IDENTIFIER325=null;
        CommonTree LVENTRY326=null;
        OrFalseReduction.localVariableTableLine_return localVariableTableLine327 =null;


        CommonTree LVHEADER320_tree=null;
        CommonTree IDENTIFIER321_tree=null;
        CommonTree IDENTIFIER322_tree=null;
        CommonTree IDENTIFIER323_tree=null;
        CommonTree IDENTIFIER324_tree=null;
        CommonTree IDENTIFIER325_tree=null;
        CommonTree LVENTRY326_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:503:3: ( ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:503:5: ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            LVHEADER320=(CommonTree)match(input,LVHEADER,FOLLOW_LVHEADER_in_localVariableTable2619); 
            LVHEADER320_tree = (CommonTree)adaptor.dupNode(LVHEADER320);


            root_1 = (CommonTree)adaptor.becomeRoot(LVHEADER320_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER321=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2621); 
            IDENTIFIER321_tree = (CommonTree)adaptor.dupNode(IDENTIFIER321);


            adaptor.addChild(root_1, IDENTIFIER321_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER322=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2623); 
            IDENTIFIER322_tree = (CommonTree)adaptor.dupNode(IDENTIFIER322);


            adaptor.addChild(root_1, IDENTIFIER322_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER323=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2625); 
            IDENTIFIER323_tree = (CommonTree)adaptor.dupNode(IDENTIFIER323);


            adaptor.addChild(root_1, IDENTIFIER323_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER324=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2627); 
            IDENTIFIER324_tree = (CommonTree)adaptor.dupNode(IDENTIFIER324);


            adaptor.addChild(root_1, IDENTIFIER324_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER325=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2629); 
            IDENTIFIER325_tree = (CommonTree)adaptor.dupNode(IDENTIFIER325);


            adaptor.addChild(root_1, IDENTIFIER325_tree);


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
            LVENTRY326=(CommonTree)match(input,LVENTRY,FOLLOW_LVENTRY_in_localVariableTable2633); 
            LVENTRY326_tree = (CommonTree)adaptor.dupNode(LVENTRY326);


            root_1 = (CommonTree)adaptor.becomeRoot(LVENTRY326_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:503:82: ( localVariableTableLine )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==INTLITERAL) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:503:82: localVariableTableLine
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable2635);
                	    localVariableTableLine327=localVariableTableLine();

                	    state._fsp--;

                	    adaptor.addChild(root_1, localVariableTableLine327.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:506:1: localVariableTableLine : INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType ;
    public final OrFalseReduction.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        OrFalseReduction.localVariableTableLine_return retval = new OrFalseReduction.localVariableTableLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL328=null;
        CommonTree INTLITERAL329=null;
        CommonTree INTLITERAL330=null;
        OrFalseReduction.localVariableTableLineIdentifier_return localVariableTableLineIdentifier331 =null;

        OrFalseReduction.bytecodeType_return bytecodeType332 =null;


        CommonTree INTLITERAL328_tree=null;
        CommonTree INTLITERAL329_tree=null;
        CommonTree INTLITERAL330_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:507:3: ( INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:507:5: INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL328=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine2652); 
            INTLITERAL328_tree = (CommonTree)adaptor.dupNode(INTLITERAL328);


            adaptor.addChild(root_0, INTLITERAL328_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL329=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine2654); 
            INTLITERAL329_tree = (CommonTree)adaptor.dupNode(INTLITERAL329);


            adaptor.addChild(root_0, INTLITERAL329_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL330=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine2656); 
            INTLITERAL330_tree = (CommonTree)adaptor.dupNode(INTLITERAL330);


            adaptor.addChild(root_0, INTLITERAL330_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine2658);
            localVariableTableLineIdentifier331=localVariableTableLineIdentifier();

            state._fsp--;

            adaptor.addChild(root_0, localVariableTableLineIdentifier331.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine2660);
            bytecodeType332=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeType332.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:510:1: localVariableTableLineIdentifier : IDENTIFIER ;
    public final OrFalseReduction.localVariableTableLineIdentifier_return localVariableTableLineIdentifier() throws RecognitionException {
        OrFalseReduction.localVariableTableLineIdentifier_return retval = new OrFalseReduction.localVariableTableLineIdentifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER333=null;

        CommonTree IDENTIFIER333_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:511:3: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:511:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER333=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier2674); 
            IDENTIFIER333_tree = (CommonTree)adaptor.dupNode(IDENTIFIER333);


            adaptor.addChild(root_0, IDENTIFIER333_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:518:1: stackMapTypeTable : ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) ;
    public final OrFalseReduction.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        OrFalseReduction.stackMapTypeTable_return retval = new OrFalseReduction.stackMapTypeTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMTHEADER334=null;
        CommonTree IDENTIFIER335=null;
        CommonTree ASSIGN336=null;
        CommonTree INTLITERAL337=null;
        CommonTree SMTENTRY338=null;
        OrFalseReduction.stackMapTypeTableEntry_return stackMapTypeTableEntry339 =null;


        CommonTree SMTHEADER334_tree=null;
        CommonTree IDENTIFIER335_tree=null;
        CommonTree ASSIGN336_tree=null;
        CommonTree INTLITERAL337_tree=null;
        CommonTree SMTENTRY338_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:519:3: ( ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:519:5: ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMTHEADER334=(CommonTree)match(input,SMTHEADER,FOLLOW_SMTHEADER_in_stackMapTypeTable2694); 
            SMTHEADER334_tree = (CommonTree)adaptor.dupNode(SMTHEADER334);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTHEADER334_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER335=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable2696); 
            IDENTIFIER335_tree = (CommonTree)adaptor.dupNode(IDENTIFIER335);


            adaptor.addChild(root_1, IDENTIFIER335_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN336=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable2698); 
            ASSIGN336_tree = (CommonTree)adaptor.dupNode(ASSIGN336);


            adaptor.addChild(root_1, ASSIGN336_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL337=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable2700); 
            INTLITERAL337_tree = (CommonTree)adaptor.dupNode(INTLITERAL337);


            adaptor.addChild(root_1, INTLITERAL337_tree);


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
            SMTENTRY338=(CommonTree)match(input,SMTENTRY,FOLLOW_SMTENTRY_in_stackMapTypeTable2704); 
            SMTENTRY338_tree = (CommonTree)adaptor.dupNode(SMTENTRY338);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTENTRY338_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:519:58: ( stackMapTypeTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:519:58: stackMapTypeTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable2706);
            	    stackMapTypeTableEntry339=stackMapTypeTableEntry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, stackMapTypeTableEntry339.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:522:1: stackMapTypeTableEntry : IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer ;
    public final OrFalseReduction.stackMapTypeTableEntry_return stackMapTypeTableEntry() throws RecognitionException {
        OrFalseReduction.stackMapTypeTableEntry_return retval = new OrFalseReduction.stackMapTypeTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER340=null;
        CommonTree ASSIGN341=null;
        CommonTree INTLITERAL342=null;
        CommonTree IDENTIFIER343=null;
        CommonTree ASSIGN344=null;
        CommonTree INTLITERAL345=null;
        CommonTree IDENTIFIER346=null;
        CommonTree ASSIGN347=null;
        CommonTree IDENTIFIER349=null;
        CommonTree ASSIGN350=null;
        OrFalseReduction.stackMapTableTypesContainer_return stackMapTableTypesContainer348 =null;

        OrFalseReduction.stackMapTableTypesContainer_return stackMapTableTypesContainer351 =null;


        CommonTree IDENTIFIER340_tree=null;
        CommonTree ASSIGN341_tree=null;
        CommonTree INTLITERAL342_tree=null;
        CommonTree IDENTIFIER343_tree=null;
        CommonTree ASSIGN344_tree=null;
        CommonTree INTLITERAL345_tree=null;
        CommonTree IDENTIFIER346_tree=null;
        CommonTree ASSIGN347_tree=null;
        CommonTree IDENTIFIER349_tree=null;
        CommonTree ASSIGN350_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:523:3: ( IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:523:5: IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER340=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2721); 
            IDENTIFIER340_tree = (CommonTree)adaptor.dupNode(IDENTIFIER340);


            adaptor.addChild(root_0, IDENTIFIER340_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN341=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2723); 
            ASSIGN341_tree = (CommonTree)adaptor.dupNode(ASSIGN341);


            adaptor.addChild(root_0, ASSIGN341_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL342=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2725); 
            INTLITERAL342_tree = (CommonTree)adaptor.dupNode(INTLITERAL342);


            adaptor.addChild(root_0, INTLITERAL342_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER343=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2727); 
            IDENTIFIER343_tree = (CommonTree)adaptor.dupNode(IDENTIFIER343);


            adaptor.addChild(root_0, IDENTIFIER343_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN344=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2729); 
            ASSIGN344_tree = (CommonTree)adaptor.dupNode(ASSIGN344);


            adaptor.addChild(root_0, ASSIGN344_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL345=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2731); 
            INTLITERAL345_tree = (CommonTree)adaptor.dupNode(INTLITERAL345);


            adaptor.addChild(root_0, INTLITERAL345_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER346=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2738); 
            IDENTIFIER346_tree = (CommonTree)adaptor.dupNode(IDENTIFIER346);


            adaptor.addChild(root_0, IDENTIFIER346_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN347=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2740); 
            ASSIGN347_tree = (CommonTree)adaptor.dupNode(ASSIGN347);


            adaptor.addChild(root_0, ASSIGN347_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2742);
            stackMapTableTypesContainer348=stackMapTableTypesContainer();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypesContainer348.getTree());


            _last = (CommonTree)input.LT(1);
            IDENTIFIER349=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2749); 
            IDENTIFIER349_tree = (CommonTree)adaptor.dupNode(IDENTIFIER349);


            adaptor.addChild(root_0, IDENTIFIER349_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN350=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2751); 
            ASSIGN350_tree = (CommonTree)adaptor.dupNode(ASSIGN350);


            adaptor.addChild(root_0, ASSIGN350_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2753);
            stackMapTableTypesContainer351=stackMapTableTypesContainer();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypesContainer351.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:532:1: stackMapTable : ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) ;
    public final OrFalseReduction.stackMapTable_return stackMapTable() throws RecognitionException {
        OrFalseReduction.stackMapTable_return retval = new OrFalseReduction.stackMapTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMHEADER352=null;
        CommonTree IDENTIFIER353=null;
        CommonTree ASSIGN354=null;
        CommonTree INTLITERAL355=null;
        CommonTree SMENTRY356=null;
        OrFalseReduction.stackMapTableEntry_return stackMapTableEntry357 =null;


        CommonTree SMHEADER352_tree=null;
        CommonTree IDENTIFIER353_tree=null;
        CommonTree ASSIGN354_tree=null;
        CommonTree INTLITERAL355_tree=null;
        CommonTree SMENTRY356_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:533:3: ( ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:533:5: ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMHEADER352=(CommonTree)match(input,SMHEADER,FOLLOW_SMHEADER_in_stackMapTable2772); 
            SMHEADER352_tree = (CommonTree)adaptor.dupNode(SMHEADER352);


            root_1 = (CommonTree)adaptor.becomeRoot(SMHEADER352_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER353=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable2774); 
            IDENTIFIER353_tree = (CommonTree)adaptor.dupNode(IDENTIFIER353);


            adaptor.addChild(root_1, IDENTIFIER353_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN354=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable2776); 
            ASSIGN354_tree = (CommonTree)adaptor.dupNode(ASSIGN354);


            adaptor.addChild(root_1, ASSIGN354_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL355=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable2778); 
            INTLITERAL355_tree = (CommonTree)adaptor.dupNode(INTLITERAL355);


            adaptor.addChild(root_1, INTLITERAL355_tree);


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
            SMENTRY356=(CommonTree)match(input,SMENTRY,FOLLOW_SMENTRY_in_stackMapTable2782); 
            SMENTRY356_tree = (CommonTree)adaptor.dupNode(SMENTRY356);


            root_1 = (CommonTree)adaptor.becomeRoot(SMENTRY356_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:533:56: ( stackMapTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:533:56: stackMapTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable2784);
            	    stackMapTableEntry357=stackMapTableEntry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, stackMapTableEntry357.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:535:1: stackMapTableEntry : ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) ;
    public final OrFalseReduction.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        OrFalseReduction.stackMapTableEntry_return retval = new OrFalseReduction.stackMapTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN358=null;
        CommonTree IDENTIFIER359=null;
        OrFalseReduction.stackMapTableEntryValue_return stackMapTableEntryValue360 =null;


        CommonTree ASSIGN358_tree=null;
        CommonTree IDENTIFIER359_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:536:3: ( ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:536:5: ^( ASSIGN IDENTIFIER stackMapTableEntryValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN358=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry2799); 
            ASSIGN358_tree = (CommonTree)adaptor.dupNode(ASSIGN358);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN358_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER359=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry2801); 
            IDENTIFIER359_tree = (CommonTree)adaptor.dupNode(IDENTIFIER359);


            adaptor.addChild(root_1, IDENTIFIER359_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry2803);
            stackMapTableEntryValue360=stackMapTableEntryValue();

            state._fsp--;

            adaptor.addChild(root_1, stackMapTableEntryValue360.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:538:1: stackMapTableEntryValue : ( INTLITERAL | stackMapTableTypesContainer );
    public final OrFalseReduction.stackMapTableEntryValue_return stackMapTableEntryValue() throws RecognitionException {
        OrFalseReduction.stackMapTableEntryValue_return retval = new OrFalseReduction.stackMapTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL361=null;
        OrFalseReduction.stackMapTableTypesContainer_return stackMapTableTypesContainer362 =null;


        CommonTree INTLITERAL361_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:539:3: ( INTLITERAL | stackMapTableTypesContainer )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:539:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL361=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntryValue2816); 
                    INTLITERAL361_tree = (CommonTree)adaptor.dupNode(INTLITERAL361);


                    adaptor.addChild(root_0, INTLITERAL361_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:539:18: stackMapTableTypesContainer
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue2820);
                    stackMapTableTypesContainer362=stackMapTableTypesContainer();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypesContainer362.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:541:1: stackMapTableTypesContainer : stackMapTableTypes ;
    public final OrFalseReduction.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        OrFalseReduction.stackMapTableTypesContainer_return retval = new OrFalseReduction.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.stackMapTableTypes_return stackMapTableTypes363 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:542:3: ( stackMapTableTypes )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:542:5: stackMapTableTypes
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2832);
            stackMapTableTypes363=stackMapTableTypes();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypes363.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:544:1: stackMapTableTypes : ^( SMTTYPES ( stackMapTableType )* ) ;
    public final OrFalseReduction.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        OrFalseReduction.stackMapTableTypes_return retval = new OrFalseReduction.stackMapTableTypes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMTTYPES364=null;
        OrFalseReduction.stackMapTableType_return stackMapTableType365 =null;


        CommonTree SMTTYPES364_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:545:3: ( ^( SMTTYPES ( stackMapTableType )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:545:5: ^( SMTTYPES ( stackMapTableType )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMTTYPES364=(CommonTree)match(input,SMTTYPES,FOLLOW_SMTTYPES_in_stackMapTableTypes2856); 
            SMTTYPES364_tree = (CommonTree)adaptor.dupNode(SMTTYPES364);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTTYPES364_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:545:16: ( stackMapTableType )*
                loop77:
                do {
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==BOOLEAN||LA77_0==BYTE||LA77_0==CHAR||LA77_0==CLASS||LA77_0==DOUBLE||LA77_0==FLOAT||LA77_0==IDENTIFIER||LA77_0==INT||LA77_0==LONG||LA77_0==SHORT||LA77_0==VOID) ) {
                        alt77=1;
                    }


                    switch (alt77) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:545:16: stackMapTableType
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes2858);
                	    stackMapTableType365=stackMapTableType();

                	    state._fsp--;

                	    adaptor.addChild(root_1, stackMapTableType365.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:547:1: stackMapTableType : ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? );
    public final OrFalseReduction.stackMapTableType_return stackMapTableType() throws RecognitionException {
        OrFalseReduction.stackMapTableType_return retval = new OrFalseReduction.stackMapTableType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER369=null;
        CommonTree INTLITERAL370=null;
        OrFalseReduction.stackMapTableTypeObject_return stackMapTableTypeObject366 =null;

        OrFalseReduction.stackMapTableTypePlainObject_return stackMapTableTypePlainObject367 =null;

        OrFalseReduction.primitiveType_return primitiveType368 =null;


        CommonTree IDENTIFIER369_tree=null;
        CommonTree INTLITERAL370_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:548:3: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:548:5: stackMapTableTypeObject
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType2872);
                    stackMapTableTypeObject366=stackMapTableTypeObject();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypeObject366.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:548:29: stackMapTableTypePlainObject
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2874);
                    stackMapTableTypePlainObject367=stackMapTableTypePlainObject();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypePlainObject367.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:548:58: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType2876);
                    primitiveType368=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType368.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:548:72: IDENTIFIER ( INTLITERAL )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER369=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableType2878); 
                    IDENTIFIER369_tree = (CommonTree)adaptor.dupNode(IDENTIFIER369);


                    adaptor.addChild(root_0, IDENTIFIER369_tree);


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:548:83: ( INTLITERAL )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==INTLITERAL) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:548:83: INTLITERAL
                            {
                            _last = (CommonTree)input.LT(1);
                            INTLITERAL370=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableType2880); 
                            INTLITERAL370_tree = (CommonTree)adaptor.dupNode(INTLITERAL370);


                            adaptor.addChild(root_0, INTLITERAL370_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:550:1: stackMapTableTypePlainObject : CLASS INTERNALTYPE ;
    public final OrFalseReduction.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        OrFalseReduction.stackMapTableTypePlainObject_return retval = new OrFalseReduction.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS371=null;
        CommonTree INTERNALTYPE372=null;

        CommonTree CLASS371_tree=null;
        CommonTree INTERNALTYPE372_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:551:3: ( CLASS INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:551:5: CLASS INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CLASS371=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject2893); 
            CLASS371_tree = (CommonTree)adaptor.dupNode(CLASS371);


            adaptor.addChild(root_0, CLASS371_tree);


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE372=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject2895); 
            INTERNALTYPE372_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE372);


            adaptor.addChild(root_0, INTERNALTYPE372_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:553:1: stackMapTableTypeObject : CLASS STRINGLITERAL ;
    public final OrFalseReduction.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        OrFalseReduction.stackMapTableTypeObject_return retval = new OrFalseReduction.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS373=null;
        CommonTree STRINGLITERAL374=null;

        CommonTree CLASS373_tree=null;
        CommonTree STRINGLITERAL374_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:554:3: ( CLASS STRINGLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:554:5: CLASS STRINGLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CLASS373=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject2907); 
            CLASS373_tree = (CommonTree)adaptor.dupNode(CLASS373);


            adaptor.addChild(root_0, CLASS373_tree);


            _last = (CommonTree)input.LT(1);
            STRINGLITERAL374=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2909); 
            STRINGLITERAL374_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL374);


            adaptor.addChild(root_0, STRINGLITERAL374_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:564:1: typeList : ( type )+ ;
    public final OrFalseReduction.typeList_return typeList() throws RecognitionException {
        OrFalseReduction.typeList_return retval = new OrFalseReduction.typeList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.type_return type375 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:565:3: ( ( type )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:565:5: ( type )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:565:5: ( type )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:565:5: type
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_type_in_typeList2929);
            	    type375=type();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type375.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:567:1: type : combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) ;
    public final OrFalseReduction.type_return type() throws RecognitionException {
        OrFalseReduction.type_return retval = new OrFalseReduction.type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARRAYBRACKS377=null;
        CommonTree LBRACK378=null;
        CommonTree RBRACK379=null;
        OrFalseReduction.combinedJavaType_return combinedJavaType376 =null;


        CommonTree ARRAYBRACKS377_tree=null;
        CommonTree LBRACK378_tree=null;
        CommonTree RBRACK379_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:568:3: ( combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:568:5: combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_combinedJavaType_in_type2942);
            combinedJavaType376=combinedJavaType();

            state._fsp--;

            adaptor.addChild(root_0, combinedJavaType376.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ARRAYBRACKS377=(CommonTree)match(input,ARRAYBRACKS,FOLLOW_ARRAYBRACKS_in_type2945); 
            ARRAYBRACKS377_tree = (CommonTree)adaptor.dupNode(ARRAYBRACKS377);


            root_1 = (CommonTree)adaptor.becomeRoot(ARRAYBRACKS377_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:568:36: ( LBRACK RBRACK )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==LBRACK) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:568:37: LBRACK RBRACK
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    LBRACK378=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_type2948); 
                	    LBRACK378_tree = (CommonTree)adaptor.dupNode(LBRACK378);


                	    adaptor.addChild(root_1, LBRACK378_tree);


                	    _last = (CommonTree)input.LT(1);
                	    RBRACK379=(CommonTree)match(input,RBRACK,FOLLOW_RBRACK_in_type2950); 
                	    RBRACK379_tree = (CommonTree)adaptor.dupNode(RBRACK379);


                	    adaptor.addChild(root_1, RBRACK379_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:570:1: combinedJavaType : ( primitiveType | referenceType );
    public final OrFalseReduction.combinedJavaType_return combinedJavaType() throws RecognitionException {
        OrFalseReduction.combinedJavaType_return retval = new OrFalseReduction.combinedJavaType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.primitiveType_return primitiveType380 =null;

        OrFalseReduction.referenceType_return referenceType381 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:571:3: ( primitiveType | referenceType )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:571:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_combinedJavaType2965);
                    primitiveType380=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType380.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:572:5: referenceType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_referenceType_in_combinedJavaType2971);
                    referenceType381=referenceType();

                    state._fsp--;

                    adaptor.addChild(root_0, referenceType381.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:574:1: referenceType : ^( UNITNAME ( typeDeclSpecifier )+ ) ;
    public final OrFalseReduction.referenceType_return referenceType() throws RecognitionException {
        OrFalseReduction.referenceType_return retval = new OrFalseReduction.referenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITNAME382=null;
        OrFalseReduction.typeDeclSpecifier_return typeDeclSpecifier383 =null;


        CommonTree UNITNAME382_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:575:3: ( ^( UNITNAME ( typeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:575:5: ^( UNITNAME ( typeDeclSpecifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME382=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_referenceType2984); 
            UNITNAME382_tree = (CommonTree)adaptor.dupNode(UNITNAME382);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITNAME382_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:575:16: ( typeDeclSpecifier )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:575:16: typeDeclSpecifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType2986);
            	    typeDeclSpecifier383=typeDeclSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_1, typeDeclSpecifier383.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:577:1: typeDeclSpecifier : ^( typeName ^( TYPEARGS ( typeArguments )? ) ) ;
    public final OrFalseReduction.typeDeclSpecifier_return typeDeclSpecifier() throws RecognitionException {
        OrFalseReduction.typeDeclSpecifier_return retval = new OrFalseReduction.typeDeclSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS385=null;
        OrFalseReduction.typeName_return typeName384 =null;

        OrFalseReduction.typeArguments_return typeArguments386 =null;


        CommonTree TYPEARGS385_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:578:3: ( ^( typeName ^( TYPEARGS ( typeArguments )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:578:5: ^( typeName ^( TYPEARGS ( typeArguments )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeName_in_typeDeclSpecifier3001);
            typeName384=typeName();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(typeName384.getTree(), root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS385=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_typeDeclSpecifier3004); 
            TYPEARGS385_tree = (CommonTree)adaptor.dupNode(TYPEARGS385);


            root_2 = (CommonTree)adaptor.becomeRoot(TYPEARGS385_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:578:27: ( typeArguments )?
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==BOOLEAN||LA84_0==BYTE||LA84_0==CHAR||LA84_0==DOUBLE||LA84_0==FLOAT||LA84_0==INT||LA84_0==LONG||LA84_0==QUESTION||LA84_0==SHORT||LA84_0==UNITNAME||LA84_0==VOID) ) {
                    alt84=1;
                }
                switch (alt84) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:578:27: typeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeArguments_in_typeDeclSpecifier3006);
                        typeArguments386=typeArguments();

                        state._fsp--;

                        adaptor.addChild(root_2, typeArguments386.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:580:1: typeName : QualifiedType ;
    public final OrFalseReduction.typeName_return typeName() throws RecognitionException {
        OrFalseReduction.typeName_return retval = new OrFalseReduction.typeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QualifiedType387=null;

        CommonTree QualifiedType387_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:581:3: ( QualifiedType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:581:5: QualifiedType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            QualifiedType387=(CommonTree)match(input,QualifiedType,FOLLOW_QualifiedType_in_typeName3021); 
            QualifiedType387_tree = (CommonTree)adaptor.dupNode(QualifiedType387);


            adaptor.addChild(root_0, QualifiedType387_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:583:1: typeArguments : typeArgumentList ;
    public final OrFalseReduction.typeArguments_return typeArguments() throws RecognitionException {
        OrFalseReduction.typeArguments_return retval = new OrFalseReduction.typeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.typeArgumentList_return typeArgumentList388 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:584:3: ( typeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:584:5: typeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeArgumentList_in_typeArguments3033);
            typeArgumentList388=typeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, typeArgumentList388.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:586:1: typeArgumentList : ( typeArgument )+ ;
    public final OrFalseReduction.typeArgumentList_return typeArgumentList() throws RecognitionException {
        OrFalseReduction.typeArgumentList_return retval = new OrFalseReduction.typeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.typeArgument_return typeArgument389 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:587:3: ( ( typeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:587:5: ( typeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:587:5: ( typeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:587:5: typeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeArgument_in_typeArgumentList3046);
            	    typeArgument389=typeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeArgument389.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:589:1: typeArgument : ( type | wildcard );
    public final OrFalseReduction.typeArgument_return typeArgument() throws RecognitionException {
        OrFalseReduction.typeArgument_return retval = new OrFalseReduction.typeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.type_return type390 =null;

        OrFalseReduction.wildcard_return wildcard391 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:590:3: ( type | wildcard )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:590:5: type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_typeArgument3059);
                    type390=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type390.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:591:5: wildcard
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wildcard_in_typeArgument3065);
                    wildcard391=wildcard();

                    state._fsp--;

                    adaptor.addChild(root_0, wildcard391.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:593:1: wildcard : ^( QUESTION ( wildcardBounds )? ) ;
    public final OrFalseReduction.wildcard_return wildcard() throws RecognitionException {
        OrFalseReduction.wildcard_return retval = new OrFalseReduction.wildcard_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUESTION392=null;
        OrFalseReduction.wildcardBounds_return wildcardBounds393 =null;


        CommonTree QUESTION392_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:594:3: ( ^( QUESTION ( wildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:594:5: ^( QUESTION ( wildcardBounds )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUESTION392=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_wildcard3078); 
            QUESTION392_tree = (CommonTree)adaptor.dupNode(QUESTION392);


            root_1 = (CommonTree)adaptor.becomeRoot(QUESTION392_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:594:16: ( wildcardBounds )?
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==EXTENDS||LA87_0==SUPER) ) {
                    alt87=1;
                }
                switch (alt87) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:594:16: wildcardBounds
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_wildcardBounds_in_wildcard3080);
                        wildcardBounds393=wildcardBounds();

                        state._fsp--;

                        adaptor.addChild(root_1, wildcardBounds393.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:596:1: wildcardBounds : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final OrFalseReduction.wildcardBounds_return wildcardBounds() throws RecognitionException {
        OrFalseReduction.wildcardBounds_return retval = new OrFalseReduction.wildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS394=null;
        CommonTree SUPER396=null;
        OrFalseReduction.type_return type395 =null;

        OrFalseReduction.type_return type397 =null;


        CommonTree EXTENDS394_tree=null;
        CommonTree SUPER396_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:597:3: ( ^( EXTENDS type ) | ^( SUPER type ) )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:597:5: ^( EXTENDS type )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXTENDS394=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_wildcardBounds3095); 
                    EXTENDS394_tree = (CommonTree)adaptor.dupNode(EXTENDS394);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS394_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_wildcardBounds3097);
                    type395=type();

                    state._fsp--;

                    adaptor.addChild(root_1, type395.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:598:5: ^( SUPER type )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUPER396=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_wildcardBounds3105); 
                    SUPER396_tree = (CommonTree)adaptor.dupNode(SUPER396);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER396_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_wildcardBounds3107);
                    type397=type();

                    state._fsp--;

                    adaptor.addChild(root_1, type397.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:600:1: typeParameters : ( typeParameter )+ ;
    public final OrFalseReduction.typeParameters_return typeParameters() throws RecognitionException {
        OrFalseReduction.typeParameters_return retval = new OrFalseReduction.typeParameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.typeParameter_return typeParameter398 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:601:3: ( ( typeParameter )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:601:5: ( typeParameter )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:601:5: ( typeParameter )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:601:5: typeParameter
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeParameter_in_typeParameters3120);
            	    typeParameter398=typeParameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeParameter398.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:603:1: typeParameter : ^( identifier ( typeBound )? ) ;
    public final OrFalseReduction.typeParameter_return typeParameter() throws RecognitionException {
        OrFalseReduction.typeParameter_return retval = new OrFalseReduction.typeParameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.identifier_return identifier399 =null;

        OrFalseReduction.typeBound_return typeBound400 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:604:3: ( ^( identifier ( typeBound )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:604:5: ^( identifier ( typeBound )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_typeParameter3134);
            identifier399=identifier();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(identifier399.getTree(), root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:604:18: ( typeBound )?
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==EXTENDS) ) {
                    alt90=1;
                }
                switch (alt90) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:604:18: typeBound
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeBound_in_typeParameter3136);
                        typeBound400=typeBound();

                        state._fsp--;

                        adaptor.addChild(root_1, typeBound400.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:606:1: typeBound : ^( EXTENDS ( referenceType )+ ) ;
    public final OrFalseReduction.typeBound_return typeBound() throws RecognitionException {
        OrFalseReduction.typeBound_return retval = new OrFalseReduction.typeBound_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS401=null;
        OrFalseReduction.referenceType_return referenceType402 =null;


        CommonTree EXTENDS401_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:607:3: ( ^( EXTENDS ( referenceType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:607:5: ^( EXTENDS ( referenceType )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXTENDS401=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeBound3151); 
            EXTENDS401_tree = (CommonTree)adaptor.dupNode(EXTENDS401);


            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS401_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:607:15: ( referenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:607:15: referenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_referenceType_in_typeBound3153);
            	    referenceType402=referenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_1, referenceType402.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:612:1: genericDescriptor : ( genericReturnDescriptor )+ ;
    public final OrFalseReduction.genericDescriptor_return genericDescriptor() throws RecognitionException {
        OrFalseReduction.genericDescriptor_return retval = new OrFalseReduction.genericDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.genericReturnDescriptor_return genericReturnDescriptor403 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:613:3: ( ( genericReturnDescriptor )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:613:5: ( genericReturnDescriptor )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:613:5: ( genericReturnDescriptor )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:613:5: genericReturnDescriptor
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor3170);
            	    genericReturnDescriptor403=genericReturnDescriptor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, genericReturnDescriptor403.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:615:1: genericReturnDescriptor : ^( EXTENDS identifier bytecodeReferenceTypeList ) ;
    public final OrFalseReduction.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        OrFalseReduction.genericReturnDescriptor_return retval = new OrFalseReduction.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS404=null;
        OrFalseReduction.identifier_return identifier405 =null;

        OrFalseReduction.bytecodeReferenceTypeList_return bytecodeReferenceTypeList406 =null;


        CommonTree EXTENDS404_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:616:3: ( ^( EXTENDS identifier bytecodeReferenceTypeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:616:5: ^( EXTENDS identifier bytecodeReferenceTypeList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXTENDS404=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor3184); 
            EXTENDS404_tree = (CommonTree)adaptor.dupNode(EXTENDS404);


            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS404_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor3186);
            identifier405=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier405.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor3188);
            bytecodeReferenceTypeList406=bytecodeReferenceTypeList();

            state._fsp--;

            adaptor.addChild(root_1, bytecodeReferenceTypeList406.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:618:1: bytecodeReferenceTypeList : ( bytecodeReferenceType )+ ;
    public final OrFalseReduction.bytecodeReferenceTypeList_return bytecodeReferenceTypeList() throws RecognitionException {
        OrFalseReduction.bytecodeReferenceTypeList_return retval = new OrFalseReduction.bytecodeReferenceTypeList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.bytecodeReferenceType_return bytecodeReferenceType407 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:619:3: ( ( bytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:619:5: ( bytecodeReferenceType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:619:5: ( bytecodeReferenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:619:5: bytecodeReferenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList3202);
            	    bytecodeReferenceType407=bytecodeReferenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bytecodeReferenceType407.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:621:1: bytecodeReferenceType : ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) ;
    public final OrFalseReduction.bytecodeReferenceType_return bytecodeReferenceType() throws RecognitionException {
        OrFalseReduction.bytecodeReferenceType_return retval = new OrFalseReduction.bytecodeReferenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITNAME408=null;
        OrFalseReduction.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier409 =null;


        CommonTree UNITNAME408_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:622:3: ( ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:622:5: ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME408=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_bytecodeReferenceType3216); 
            UNITNAME408_tree = (CommonTree)adaptor.dupNode(UNITNAME408);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITNAME408_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:622:16: ( bytecodeTypeDeclSpecifier )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:622:16: bytecodeTypeDeclSpecifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType3218);
            	    bytecodeTypeDeclSpecifier409=bytecodeTypeDeclSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_1, bytecodeTypeDeclSpecifier409.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:624:1: bytecodeTypeDeclSpecifier : bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) ;
    public final OrFalseReduction.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier() throws RecognitionException {
        OrFalseReduction.bytecodeTypeDeclSpecifier_return retval = new OrFalseReduction.bytecodeTypeDeclSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS411=null;
        OrFalseReduction.bytecodeTypeName_return bytecodeTypeName410 =null;

        OrFalseReduction.bytecodeTypeArguments_return bytecodeTypeArguments412 =null;


        CommonTree TYPEARGS411_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:625:3: ( bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:625:5: bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier3232);
            bytecodeTypeName410=bytecodeTypeName();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeTypeName410.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS411=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier3235); 
            TYPEARGS411_tree = (CommonTree)adaptor.dupNode(TYPEARGS411);


            root_1 = (CommonTree)adaptor.becomeRoot(TYPEARGS411_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:625:33: ( bytecodeTypeArguments )?
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==QUESTION||LA95_0==UNITNAME) ) {
                    alt95=1;
                }
                switch (alt95) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:625:33: bytecodeTypeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier3237);
                        bytecodeTypeArguments412=bytecodeTypeArguments();

                        state._fsp--;

                        adaptor.addChild(root_1, bytecodeTypeArguments412.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:627:1: bytecodeTypeName : INTERNALTYPE ;
    public final OrFalseReduction.bytecodeTypeName_return bytecodeTypeName() throws RecognitionException {
        OrFalseReduction.bytecodeTypeName_return retval = new OrFalseReduction.bytecodeTypeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERNALTYPE413=null;

        CommonTree INTERNALTYPE413_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:628:3: ( INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:628:5: INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE413=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeTypeName3251); 
            INTERNALTYPE413_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE413);


            adaptor.addChild(root_0, INTERNALTYPE413_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:630:1: bytecodeTypeArguments : bytecodeTypeArgumentList ;
    public final OrFalseReduction.bytecodeTypeArguments_return bytecodeTypeArguments() throws RecognitionException {
        OrFalseReduction.bytecodeTypeArguments_return retval = new OrFalseReduction.bytecodeTypeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.bytecodeTypeArgumentList_return bytecodeTypeArgumentList414 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:631:3: ( bytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:631:5: bytecodeTypeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments3263);
            bytecodeTypeArgumentList414=bytecodeTypeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeTypeArgumentList414.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:633:1: bytecodeTypeArgumentList : ( bytecodeTypeArgument )+ ;
    public final OrFalseReduction.bytecodeTypeArgumentList_return bytecodeTypeArgumentList() throws RecognitionException {
        OrFalseReduction.bytecodeTypeArgumentList_return retval = new OrFalseReduction.bytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.bytecodeTypeArgument_return bytecodeTypeArgument415 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:634:3: ( ( bytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:634:5: ( bytecodeTypeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:634:5: ( bytecodeTypeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:634:5: bytecodeTypeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList3276);
            	    bytecodeTypeArgument415=bytecodeTypeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bytecodeTypeArgument415.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:636:1: bytecodeTypeArgument : ( bytecodeReferenceType | bytecodeWildcard );
    public final OrFalseReduction.bytecodeTypeArgument_return bytecodeTypeArgument() throws RecognitionException {
        OrFalseReduction.bytecodeTypeArgument_return retval = new OrFalseReduction.bytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.bytecodeReferenceType_return bytecodeReferenceType416 =null;

        OrFalseReduction.bytecodeWildcard_return bytecodeWildcard417 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:637:3: ( bytecodeReferenceType | bytecodeWildcard )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:637:5: bytecodeReferenceType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument3289);
                    bytecodeReferenceType416=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeReferenceType416.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:638:5: bytecodeWildcard
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument3295);
                    bytecodeWildcard417=bytecodeWildcard();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeWildcard417.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:640:1: bytecodeWildcard : ^( QUESTION ( bytecodeWildcardBounds )? ) ;
    public final OrFalseReduction.bytecodeWildcard_return bytecodeWildcard() throws RecognitionException {
        OrFalseReduction.bytecodeWildcard_return retval = new OrFalseReduction.bytecodeWildcard_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUESTION418=null;
        OrFalseReduction.bytecodeWildcardBounds_return bytecodeWildcardBounds419 =null;


        CommonTree QUESTION418_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:641:3: ( ^( QUESTION ( bytecodeWildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:641:5: ^( QUESTION ( bytecodeWildcardBounds )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUESTION418=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_bytecodeWildcard3308); 
            QUESTION418_tree = (CommonTree)adaptor.dupNode(QUESTION418);


            root_1 = (CommonTree)adaptor.becomeRoot(QUESTION418_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:641:16: ( bytecodeWildcardBounds )?
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==EXTENDS||LA98_0==SUPER) ) {
                    alt98=1;
                }
                switch (alt98) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:641:16: bytecodeWildcardBounds
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard3310);
                        bytecodeWildcardBounds419=bytecodeWildcardBounds();

                        state._fsp--;

                        adaptor.addChild(root_1, bytecodeWildcardBounds419.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:643:1: bytecodeWildcardBounds : ( ^( EXTENDS bytecodeReferenceType ) | ^( SUPER bytecodeReferenceType ) );
    public final OrFalseReduction.bytecodeWildcardBounds_return bytecodeWildcardBounds() throws RecognitionException {
        OrFalseReduction.bytecodeWildcardBounds_return retval = new OrFalseReduction.bytecodeWildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS420=null;
        CommonTree SUPER422=null;
        OrFalseReduction.bytecodeReferenceType_return bytecodeReferenceType421 =null;

        OrFalseReduction.bytecodeReferenceType_return bytecodeReferenceType423 =null;


        CommonTree EXTENDS420_tree=null;
        CommonTree SUPER422_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:644:3: ( ^( EXTENDS bytecodeReferenceType ) | ^( SUPER bytecodeReferenceType ) )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:644:5: ^( EXTENDS bytecodeReferenceType )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXTENDS420=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_bytecodeWildcardBounds3325); 
                    EXTENDS420_tree = (CommonTree)adaptor.dupNode(EXTENDS420);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS420_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3327);
                    bytecodeReferenceType421=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_1, bytecodeReferenceType421.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:645:5: ^( SUPER bytecodeReferenceType )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUPER422=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_bytecodeWildcardBounds3335); 
                    SUPER422_tree = (CommonTree)adaptor.dupNode(SUPER422);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER422_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3337);
                    bytecodeReferenceType423=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_1, bytecodeReferenceType423.getTree());


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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:652:1: bytecodeType : ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER );
    public final OrFalseReduction.bytecodeType_return bytecodeType() throws RecognitionException {
        OrFalseReduction.bytecodeType_return retval = new OrFalseReduction.bytecodeType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BaseType425=null;
        CommonTree SEMI427=null;
        CommonTree IDENTIFIER428=null;
        OrFalseReduction.bytecodeArrayType_return bytecodeArrayType424 =null;

        OrFalseReduction.simpleBytecodeObjectType_return simpleBytecodeObjectType426 =null;


        CommonTree BaseType425_tree=null;
        CommonTree SEMI427_tree=null;
        CommonTree IDENTIFIER428_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:653:3: ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:653:5: bytecodeArrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType3355);
                    bytecodeArrayType424=bytecodeArrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeArrayType424.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:653:25: BaseType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BaseType425=(CommonTree)match(input,BaseType,FOLLOW_BaseType_in_bytecodeType3359); 
                    BaseType425_tree = (CommonTree)adaptor.dupNode(BaseType425);


                    adaptor.addChild(root_0, BaseType425_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:653:36: simpleBytecodeObjectType SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_bytecodeType3363);
                    simpleBytecodeObjectType426=simpleBytecodeObjectType();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleBytecodeObjectType426.getTree());


                    _last = (CommonTree)input.LT(1);
                    SEMI427=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType3365); 
                    SEMI427_tree = (CommonTree)adaptor.dupNode(SEMI427);


                    adaptor.addChild(root_0, SEMI427_tree);


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:653:68: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER428=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType3369); 
                    IDENTIFIER428_tree = (CommonTree)adaptor.dupNode(IDENTIFIER428);


                    adaptor.addChild(root_0, IDENTIFIER428_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:655:1: bytecodeArrayType : LBRACK bytecodeType ;
    public final OrFalseReduction.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        OrFalseReduction.bytecodeArrayType_return retval = new OrFalseReduction.bytecodeArrayType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LBRACK429=null;
        OrFalseReduction.bytecodeType_return bytecodeType430 =null;


        CommonTree LBRACK429_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:656:3: ( LBRACK bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:656:5: LBRACK bytecodeType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            LBRACK429=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType3382); 
            LBRACK429_tree = (CommonTree)adaptor.dupNode(LBRACK429);


            adaptor.addChild(root_0, LBRACK429_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType3384);
            bytecodeType430=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeType430.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:658:1: simpleBytecodeObjectType : ( simpleBytecodeReferenceType )+ ;
    public final OrFalseReduction.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        OrFalseReduction.simpleBytecodeObjectType_return retval = new OrFalseReduction.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.simpleBytecodeReferenceType_return simpleBytecodeReferenceType431 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:659:3: ( ( simpleBytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:659:5: ( simpleBytecodeReferenceType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:659:5: ( simpleBytecodeReferenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:659:5: simpleBytecodeReferenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType3397);
            	    simpleBytecodeReferenceType431=simpleBytecodeReferenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simpleBytecodeReferenceType431.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:661:1: simpleBytecodeReferenceType : simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) ;
    public final OrFalseReduction.simpleBytecodeReferenceType_return simpleBytecodeReferenceType() throws RecognitionException {
        OrFalseReduction.simpleBytecodeReferenceType_return retval = new OrFalseReduction.simpleBytecodeReferenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS433=null;
        OrFalseReduction.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName432 =null;

        OrFalseReduction.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments434 =null;


        CommonTree TYPEARGS433_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:662:3: ( simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:662:5: simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType3410);
            simpleBytecodeReferenceTypeName432=simpleBytecodeReferenceTypeName();

            state._fsp--;

            adaptor.addChild(root_0, simpleBytecodeReferenceTypeName432.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS433=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType3413); 
            TYPEARGS433_tree = (CommonTree)adaptor.dupNode(TYPEARGS433);


            root_1 = (CommonTree)adaptor.becomeRoot(TYPEARGS433_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:662:48: ( simpleBytecodeTypeArguments )?
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==BaseType||LA102_0==IDENTIFIER||LA102_0==INTERNALTYPE||LA102_0==LBRACK||LA102_0==MINUS||LA102_0==PLUS||LA102_0==STAR) ) {
                    alt102=1;
                }
                switch (alt102) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:662:48: simpleBytecodeTypeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType3415);
                        simpleBytecodeTypeArguments434=simpleBytecodeTypeArguments();

                        state._fsp--;

                        adaptor.addChild(root_1, simpleBytecodeTypeArguments434.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:664:1: simpleBytecodeReferenceTypeName : INTERNALTYPE ;
    public final OrFalseReduction.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName() throws RecognitionException {
        OrFalseReduction.simpleBytecodeReferenceTypeName_return retval = new OrFalseReduction.simpleBytecodeReferenceTypeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERNALTYPE435=null;

        CommonTree INTERNALTYPE435_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:665:3: ( INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:665:5: INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE435=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName3429); 
            INTERNALTYPE435_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE435);


            adaptor.addChild(root_0, INTERNALTYPE435_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:667:1: simpleBytecodeTypeArguments : simpleBytecodeTypeArgumentList ;
    public final OrFalseReduction.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments() throws RecognitionException {
        OrFalseReduction.simpleBytecodeTypeArguments_return retval = new OrFalseReduction.simpleBytecodeTypeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList436 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:668:3: ( simpleBytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:668:5: simpleBytecodeTypeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments3441);
            simpleBytecodeTypeArgumentList436=simpleBytecodeTypeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, simpleBytecodeTypeArgumentList436.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:670:1: simpleBytecodeTypeArgumentList : ( simpleBytecodeTypeArgument )+ ;
    public final OrFalseReduction.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList() throws RecognitionException {
        OrFalseReduction.simpleBytecodeTypeArgumentList_return retval = new OrFalseReduction.simpleBytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument437 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:671:3: ( ( simpleBytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:671:5: ( simpleBytecodeTypeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:671:5: ( simpleBytecodeTypeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:671:5: simpleBytecodeTypeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList3453);
            	    simpleBytecodeTypeArgument437=simpleBytecodeTypeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simpleBytecodeTypeArgument437.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:673:1: simpleBytecodeTypeArgument : ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR );
    public final OrFalseReduction.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument() throws RecognitionException {
        OrFalseReduction.simpleBytecodeTypeArgument_return retval = new OrFalseReduction.simpleBytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MINUS439=null;
        CommonTree PLUS441=null;
        CommonTree STAR443=null;
        OrFalseReduction.bytecodeType_return bytecodeType438 =null;

        OrFalseReduction.bytecodeType_return bytecodeType440 =null;

        OrFalseReduction.bytecodeType_return bytecodeType442 =null;


        CommonTree MINUS439_tree=null;
        CommonTree PLUS441_tree=null;
        CommonTree STAR443_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:674:3: ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:674:5: bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3466);
                    bytecodeType438=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType438.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:675:5: MINUS bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    MINUS439=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_simpleBytecodeTypeArgument3472); 
                    MINUS439_tree = (CommonTree)adaptor.dupNode(MINUS439);


                    adaptor.addChild(root_0, MINUS439_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3474);
                    bytecodeType440=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType440.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:676:5: PLUS bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    PLUS441=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_simpleBytecodeTypeArgument3480); 
                    PLUS441_tree = (CommonTree)adaptor.dupNode(PLUS441);


                    adaptor.addChild(root_0, PLUS441_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3482);
                    bytecodeType442=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType442.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:677:5: STAR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    STAR443=(CommonTree)match(input,STAR,FOLLOW_STAR_in_simpleBytecodeTypeArgument3488); 
                    STAR443_tree = (CommonTree)adaptor.dupNode(STAR443);


                    adaptor.addChild(root_0, STAR443_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:684:1: identifier : IDENTIFIER ;
    public final OrFalseReduction.identifier_return identifier() throws RecognitionException {
        OrFalseReduction.identifier_return retval = new OrFalseReduction.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER444=null;

        CommonTree IDENTIFIER444_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:684:11: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:684:13: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER444=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier3502); 
            IDENTIFIER444_tree = (CommonTree)adaptor.dupNode(IDENTIFIER444);


            adaptor.addChild(root_0, IDENTIFIER444_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:686:1: keywordAggregate : IDENTIFIER ;
    public final OrFalseReduction.keywordAggregate_return keywordAggregate() throws RecognitionException {
        OrFalseReduction.keywordAggregate_return retval = new OrFalseReduction.keywordAggregate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER445=null;

        CommonTree IDENTIFIER445_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:687:3: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:687:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER445=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_keywordAggregate3512); 
            IDENTIFIER445_tree = (CommonTree)adaptor.dupNode(IDENTIFIER445);


            adaptor.addChild(root_0, IDENTIFIER445_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:690:1: primitiveType : ( boolean_type | numeric_type | VOID );
    public final OrFalseReduction.primitiveType_return primitiveType() throws RecognitionException {
        OrFalseReduction.primitiveType_return retval = new OrFalseReduction.primitiveType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VOID448=null;
        OrFalseReduction.boolean_type_return boolean_type446 =null;

        OrFalseReduction.numeric_type_return numeric_type447 =null;


        CommonTree VOID448_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:691:3: ( boolean_type | numeric_type | VOID )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:691:5: boolean_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_boolean_type_in_primitiveType3525);
                    boolean_type446=boolean_type();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_type446.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:692:5: numeric_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numeric_type_in_primitiveType3531);
                    numeric_type447=numeric_type();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_type447.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:693:5: VOID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VOID448=(CommonTree)match(input,VOID,FOLLOW_VOID_in_primitiveType3537); 
                    VOID448_tree = (CommonTree)adaptor.dupNode(VOID448);


                    adaptor.addChild(root_0, VOID448_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:696:1: boolean_type : BOOLEAN ;
    public final OrFalseReduction.boolean_type_return boolean_type() throws RecognitionException {
        OrFalseReduction.boolean_type_return retval = new OrFalseReduction.boolean_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BOOLEAN449=null;

        CommonTree BOOLEAN449_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:697:3: ( BOOLEAN )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:697:5: BOOLEAN
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            BOOLEAN449=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type3550); 
            BOOLEAN449_tree = (CommonTree)adaptor.dupNode(BOOLEAN449);


            adaptor.addChild(root_0, BOOLEAN449_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:700:1: numeric_type : ( floating_point_type | integral_type );
    public final OrFalseReduction.numeric_type_return numeric_type() throws RecognitionException {
        OrFalseReduction.numeric_type_return retval = new OrFalseReduction.numeric_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OrFalseReduction.floating_point_type_return floating_point_type450 =null;

        OrFalseReduction.integral_type_return integral_type451 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:701:3: ( floating_point_type | integral_type )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:701:5: floating_point_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_floating_point_type_in_numeric_type3563);
                    floating_point_type450=floating_point_type();

                    state._fsp--;

                    adaptor.addChild(root_0, floating_point_type450.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:702:5: integral_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integral_type_in_numeric_type3569);
                    integral_type451=integral_type();

                    state._fsp--;

                    adaptor.addChild(root_0, integral_type451.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:705:1: integral_type : ( BYTE | SHORT | INT | LONG | CHAR );
    public final OrFalseReduction.integral_type_return integral_type() throws RecognitionException {
        OrFalseReduction.integral_type_return retval = new OrFalseReduction.integral_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set452=null;

        CommonTree set452_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:706:3: ( BYTE | SHORT | INT | LONG | CHAR )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set452=(CommonTree)input.LT(1);

            if ( input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
                input.consume();
                set452_tree = (CommonTree)adaptor.dupNode(set452);


                adaptor.addChild(root_0, set452_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:713:1: floating_point_type : ( FLOAT | DOUBLE );
    public final OrFalseReduction.floating_point_type_return floating_point_type() throws RecognitionException {
        OrFalseReduction.floating_point_type_return retval = new OrFalseReduction.floating_point_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set453=null;

        CommonTree set453_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:714:3: ( FLOAT | DOUBLE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set453=(CommonTree)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT ) {
                input.consume();
                set453_tree = (CommonTree)adaptor.dupNode(set453);


                adaptor.addChild(root_0, set453_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:718:1: literals : ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER );
    public final OrFalseReduction.literals_return literals() throws RecognitionException {
        OrFalseReduction.literals_return retval = new OrFalseReduction.literals_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LONGLITERAL454=null;
        CommonTree INTLITERAL455=null;
        CommonTree FLOATLITERAL456=null;
        CommonTree DOUBLELITERAL457=null;
        CommonTree CHARLITERAL458=null;
        CommonTree STRINGLITERAL459=null;
        CommonTree BOOLEANLITERAL460=null;
        CommonTree MINUS461=null;
        CommonTree IDENTIFIER462=null;

        CommonTree LONGLITERAL454_tree=null;
        CommonTree INTLITERAL455_tree=null;
        CommonTree FLOATLITERAL456_tree=null;
        CommonTree DOUBLELITERAL457_tree=null;
        CommonTree CHARLITERAL458_tree=null;
        CommonTree STRINGLITERAL459_tree=null;
        CommonTree BOOLEANLITERAL460_tree=null;
        CommonTree MINUS461_tree=null;
        CommonTree IDENTIFIER462_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:719:3: ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:719:5: LONGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LONGLITERAL454=(CommonTree)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literals3638); 
                    LONGLITERAL454_tree = (CommonTree)adaptor.dupNode(LONGLITERAL454);


                    adaptor.addChild(root_0, LONGLITERAL454_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:720:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL455=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literals3644); 
                    INTLITERAL455_tree = (CommonTree)adaptor.dupNode(INTLITERAL455);


                    adaptor.addChild(root_0, INTLITERAL455_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:721:5: FLOATLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FLOATLITERAL456=(CommonTree)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literals3650); 
                    FLOATLITERAL456_tree = (CommonTree)adaptor.dupNode(FLOATLITERAL456);


                    adaptor.addChild(root_0, FLOATLITERAL456_tree);


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:722:5: DOUBLELITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DOUBLELITERAL457=(CommonTree)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literals3656); 
                    DOUBLELITERAL457_tree = (CommonTree)adaptor.dupNode(DOUBLELITERAL457);


                    adaptor.addChild(root_0, DOUBLELITERAL457_tree);


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:723:5: CHARLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CHARLITERAL458=(CommonTree)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literals3662); 
                    CHARLITERAL458_tree = (CommonTree)adaptor.dupNode(CHARLITERAL458);


                    adaptor.addChild(root_0, CHARLITERAL458_tree);


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:724:5: STRINGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    STRINGLITERAL459=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literals3668); 
                    STRINGLITERAL459_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL459);


                    adaptor.addChild(root_0, STRINGLITERAL459_tree);


                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:725:5: BOOLEANLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL460=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literals3674); 
                    BOOLEANLITERAL460_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL460);


                    adaptor.addChild(root_0, BOOLEANLITERAL460_tree);


                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:726:5: ( MINUS )? IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:726:5: ( MINUS )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==MINUS) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:726:5: MINUS
                            {
                            _last = (CommonTree)input.LT(1);
                            MINUS461=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_literals3680); 
                            MINUS461_tree = (CommonTree)adaptor.dupNode(MINUS461);


                            adaptor.addChild(root_0, MINUS461_tree);


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER462=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literals3683); 
                    IDENTIFIER462_tree = (CommonTree)adaptor.dupNode(IDENTIFIER462);


                    adaptor.addChild(root_0, IDENTIFIER462_tree);


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
        public int value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pc"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:729:1: pc returns [int value] : INTLITERAL COLON ;
    public final OrFalseReduction.pc_return pc() throws RecognitionException {
        OrFalseReduction.pc_return retval = new OrFalseReduction.pc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL463=null;
        CommonTree COLON464=null;

        CommonTree INTLITERAL463_tree=null;
        CommonTree COLON464_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:730:3: ( INTLITERAL COLON )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\OrFalseReduction.g:730:5: INTLITERAL COLON
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL463=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc3700); 
            INTLITERAL463_tree = (CommonTree)adaptor.dupNode(INTLITERAL463);


            adaptor.addChild(root_0, INTLITERAL463_tree);


            _last = (CommonTree)input.LT(1);
            COLON464=(CommonTree)match(input,COLON,FOLLOW_COLON_in_pc3702); 
            COLON464_tree = (CommonTree)adaptor.dupNode(COLON464);


            adaptor.addChild(root_0, COLON464_tree);


            retval.value = Integer.parseInt((INTLITERAL463!=null?INTLITERAL463.getText():null));

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


 

    public static final BitSet FOLLOW_class_file_in_program69 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_CLASSFILE_in_class_file81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CFHEADER_in_class_file84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_file_header_in_class_file86 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDefinition_in_class_file89 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header120 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info161 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info188 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_HexDigits_in_checksum_file_info190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSDECL_in_classDefinition232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_classDefinition236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_classDefinition243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition245 = new BitSet(new long[]{0x0080000000200018L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeName_in_classDefinition251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TPARAMETERS_in_classDefinition254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeParameters_in_classDefinition256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEXTENDS_in_classDefinition261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CIMPLEMENTS_in_classDefinition268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_classDefinition291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_info_in_classDefinition293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPOOL_in_classDefinition313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_classDefinition335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classBody_in_classDefinition337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info423 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_minor_major_version_info_in_type_info429 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_flags_in_type_info435 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info441 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info448 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info454 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info460 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info466 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_deprecated_in_type_info472 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_synthetic_in_type_info478 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_scala_info_in_type_info484 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod536 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod538 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_sourcefile_info559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ScalaSig_in_scalaSig_info574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scalaSig_info588 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scalaSig_info590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Scala_in_scala_info627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scala_info629 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scala_info631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scala_info633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info671 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VMODIFIER_in_innerclass_info_line690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_innerclass_info_line692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_innerclass_info_line697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line699 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000114L});
    public static final BitSet FOLLOW_innerclass_info_data_in_innerclass_info_line703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INFODATA1_in_innerclass_info_data720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_data723 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFODATA2_in_innerclass_info_data731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_data734 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data736 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info760 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_minor_major_version_info762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_major_version_info764 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Flag_in_flags785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessFlagList_in_flags787 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList804 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_IDENTIFIER_in_flagType820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_flagType826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info847 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info849 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem866 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem868 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList882 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign898 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_annotationValue_in_annotationAssign900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationValue913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationValue920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList945 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations976 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations978 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations993 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations995 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1012 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_parameterVisibilityInfo1027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1029 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1032 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1047 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1049 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1055 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1078 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool1080 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line1098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line1100 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyEntryDecl_in_classBody1122 = new BitSet(new long[]{0x0020000040000002L,0x0000000008000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_methodDefinition_in_classBodyEntryDecl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBodyEntryDecl1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBodyEntryDecl1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELDDECL_in_fieldDefinition1174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_fieldDefinition1177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition1179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_fieldDefinition1184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition1186 = new BitSet(new long[]{0x0080000000000008L,0x0000000000000000L,0x0000000200080004L});
    public static final BitSet FOLLOW_RETVALUE_in_fieldDefinition1191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_fieldDefinition1193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_fieldDefinition1197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldDefinition1199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDVALUE_in_fieldDefinition1203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition1205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_fieldDefinition1222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition1224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_fieldDefinition1240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition1242 = new BitSet(new long[]{0x0000040400000008L,0x0050000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo1272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfo1274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flags_in_fieldInfo1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_fieldAdditionalInfo1293 = new BitSet(new long[]{0x0200010000082000L,0x0000000010040202L,0x0000000000000020L});
    public static final BitSet FOLLOW_literals_in_fieldAdditionalInfo1295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo1305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo1313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldAdditionalInfo1315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo1323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo1333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATICCTORDECL_in_staticCtorDefinition1420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_staticCtorDefinition1423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition1425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_staticCtorDefinition1430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition1432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_staticCtorDefinition1436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition1438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CTORDECL_in_ctorDefinition1461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_ctorDefinition1464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition1466 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERICDESC_in_ctorDefinition1471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_ctorDefinition1473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_ctorDefinition1478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeName_in_ctorDefinition1480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_ctorDefinition1486 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition1488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_ctorDefinition1517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition1519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_ctorDefinition1547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_ctorDefinition1549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_ctorDefinition1577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition1579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODDECL_in_methodDefinition1625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_methodDefinition1628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_methodDefinition1630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_methodDefinition1635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition1637 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000114L});
    public static final BitSet FOLLOW_GENERICDESC_in_methodDefinition1642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_methodDefinition1644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETVALUE_in_methodDefinition1649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_methodDefinition1651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_methodDefinition1655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDefinition1657 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_methodDefinition1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClauseMethod_in_methodDefinition1665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_methodDefinition1694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition1696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_methodDefinition1724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_methodDefinition1726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_methodDefinition1755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition1757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STANDINTOKEN_in_methodInfo1799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo1801 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo1803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfo1819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfo1830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfo1832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo1839 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1845 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo1851 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo1857 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfo1864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfo1867 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfo1875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1877 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfo1884 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault1900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault1903 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_annotationValue_in_annotationDefault1905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_methodSignatureInfo1922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMDESC_in_methodSignatureInfo1925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo1927 = new BitSet(new long[]{0x0000000000008008L,0x0000000000008102L});
    public static final BitSet FOLLOW_RETDESC_in_methodSignatureInfo1932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo1934 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITARGUMENTS_in_arguments2025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_arguments2027 = new BitSet(new long[]{0x0000004000000008L});
    public static final BitSet FOLLOW_DOT_in_arguments2031 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments2033 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments2035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_body2060 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_body2062 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Code_in_body2067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_codeBlock_in_body2069 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bodyExtension_in_body2072 = new BitSet(new long[]{0x0002000000000002L,0x0000000003800000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension2093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension2096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension2104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension2107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension2116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension2119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension2127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension2130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension2138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension2140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension2148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension2150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARINFO_in_codeBlock2178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variables_in_codeBlock2180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_codeBlock2184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructionSet_in_codeBlock2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock2189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeLine_in_instructionSet2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaSwitch_in_instructionSet2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine2233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeLine2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine2238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand1_in_codeLine2242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine2247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeLine2249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd2277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd2279 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeBlockEnd2281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPINDEX_in_operand12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_operand12310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_operand12318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables2331 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables2333 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_variable2349 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable2353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_javaSwitch2368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch2371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_javaSwitch2373 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch2375 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch2378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pc_in_switchLine2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine2417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine2419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClause2439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_throwClause2441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClauseMethod2458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod2460 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000102L});
    public static final BitSet FOLLOW_ETHEADER_in_exceptionTable2499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ETENTRY_in_exceptionTable2511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable2513 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2532 = new BitSet(new long[]{0x0100008008045000L,0x0200000000020042L,0x0000000100000000L});
    public static final BitSet FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntryValue2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntryValue2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable2577 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine2592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine2596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVHEADER_in_localVariableTable2619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVENTRY_in_localVariableTable2633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable2635 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine2652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine2656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine2658 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTHEADER_in_stackMapTypeTable2694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable2696 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable2698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable2700 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMTENTRY_in_stackMapTypeTable2704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable2706 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2721 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2727 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2738 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2740 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2749 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2751 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMHEADER_in_stackMapTable2772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable2774 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable2776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable2778 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMENTRY_in_stackMapTable2782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable2784 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry2799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry2801 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000200L});
    public static final BitSet FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry2803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntryValue2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTTYPES_in_stackMapTableTypes2856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes2858 = new BitSet(new long[]{0x0100008000245008L,0x0200000000020042L,0x0000000100000000L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableType2878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableType2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject2893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject2907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList2929 = new BitSet(new long[]{0x0100008000045002L,0x0200000000020040L,0x0000000110000000L});
    public static final BitSet FOLLOW_combinedJavaType_in_type2942 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARRAYBRACKS_in_type2945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACK_in_type2948 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type2950 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_combinedJavaType2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenceType_in_combinedJavaType2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITNAME_in_referenceType2984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType2986 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L});
    public static final BitSet FOLLOW_typeName_in_typeDeclSpecifier3001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPEARGS_in_typeDeclSpecifier3004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeArguments_in_typeDeclSpecifier3006 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QualifiedType_in_typeName3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgumentList_in_typeArguments3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgument_in_typeArgumentList3046 = new BitSet(new long[]{0x0100008000045002L,0x0200080000020040L,0x0000000110000000L});
    public static final BitSet FOLLOW_type_in_typeArgument3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_typeArgument3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_wildcard3078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wildcardBounds_in_wildcard3080 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_wildcardBounds3095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds3097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_wildcardBounds3105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds3107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters3120 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeParameter3134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter3136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_typeBound3151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_referenceType_in_typeBound3153 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor3170 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor3184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor3186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor3188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList3202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_UNITNAME_in_bytecodeReferenceType3216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType3218 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier3232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier3235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier3237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeTypeName3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList3276 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bytecodeWildcard3308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard3310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_bytecodeWildcardBounds3325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_bytecodeWildcardBounds3335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeType3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_bytecodeType3363 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType3382 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType3397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType3413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType3415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList3453 = new BitSet(new long[]{0x0000000000008002L,0x0000004010008102L,0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleBytecodeTypeArgument3472 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleBytecodeTypeArgument3480 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_simpleBytecodeTypeArgument3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_keywordAggregate3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literals3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literals3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literals3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literals3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literals3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literals3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literals3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literals3680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literals3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc3700 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pc3702 = new BitSet(new long[]{0x0000000000000002L});

}