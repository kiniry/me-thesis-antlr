// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g 2013-01-18 12:17:22

  package bytecodeDeobfuscation;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JVMWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AND", "ANNOTATIONBRACKETS", "ARRAYBRACKS", "ASSIGN", "AnnotationAssign", "AnnotationDefault", "BANNOTATION", "BOOLEAN", "BOOLEANLITERAL", "BYTE", "BaseType", "CEXTENDS", "CFHEADER", "CHAR", "CHARLITERAL", "CIMPLEMENTS", "CLASS", "CLASSDECL", "CLASSFILE", "COLON", "COMMA", "COMMENT", "CONSTANT_TYPE_ASSIGNABLE", "CPINDEX", "CPOOL", "CTORDECL", "CharEscapeSequence", "CharUnicodeEscapeSequence", "Code", "Constant", "Constant_type", "DATE", "DEFAULT", "DOT", "DOUBLE", "DOUBLELITERAL", "DefaultValue", "Deprecated", "DoubleSuffix", "ETENTRY", "ETHEADER", "EXTENDS", "EnclosingMethod", "EscapeSequence", "ExceptionTable", "Exceptions", "Exponent", "FALSE", "FIELDDECL", "FIELDVALUE", "FINAL", "FLOAT", "FLOATLITERAL", "Flag", "FloatSuffix", "GENERICDESC", "HASH", "HexDigit", "HexDigits", "HexPrefix", "IDENTIFIER", "IMPLEMENTS", "INFODATA1", "INFODATA2", "INSTRUCTION", "INT", "INTERFACE", "INTERNALTYPE", "INTLITERAL", "InnerClasses", "IntDigit", "IntegerNumber", "LARGET", "LBRACE", "LBRACK", "LESST", "LONG", "LONGLITERAL", "LPAREN", "LVENTRY", "LVHEADER", "Letter", "LineNumberTable", "LocalVariableTable", "LocalVariableTypeTable", "LongSuffix", "METHODDECL", "MINUS", "MODIFIER", "Marker", "NATIVE", "NL", "NonIntegerNumber", "OPERAND", "Octal", "OctalEscape", "PARAMDESC", "PLUS", "PRIVATE", "PROTECTED", "PUBLIC", "QUESTION", "QUOTE", "QualifiedType", "RBRACE", "RBRACK", "RETDESC", "RETVALUE", "RPAREN", "RuntimeInvisibleAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleParameterAnnotations", "SEMI", "SHORT", "SLASH", "SMENTRY", "SMHEADER", "SMTENTRY", "SMTHEADER", "SMTTYPES", "STANDINTOKEN", "STAR", "STATIC", "STATICCTORDECL", "STRICTFP", "STRINGLITERAL", "SUPER", "SWITCH", "SYNCHRONIZED", "Scala", "ScalaSig", "Signature", "SourceFile", "StackMap", "StackMapTable", "Synthetic", "THROWCLAUSE", "THROWS", "TPARAMETERS", "TRANSIENT", "TRUE", "TYPEARGS", "Throws", "UNDERSCORE", "UNITARGUMENTS", "UNITATTR", "UNITBODY", "UNITHEADER", "UNITNAME", "UnicodeEscapeSequence", "VARINFO", "VMODIFIER", "VOID", "VOLATILE", "VoidType", "WINDOWSPATH", "WS"
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
    public static final int QUESTION=106;
    public static final int QUOTE=107;
    public static final int QualifiedType=108;
    public static final int RBRACE=109;
    public static final int RBRACK=110;
    public static final int RETDESC=111;
    public static final int RETVALUE=112;
    public static final int RPAREN=113;
    public static final int RuntimeInvisibleAnnotations=114;
    public static final int RuntimeInvisibleParameterAnnotations=115;
    public static final int RuntimeVisibleAnnotations=116;
    public static final int RuntimeVisibleParameterAnnotations=117;
    public static final int SEMI=118;
    public static final int SHORT=119;
    public static final int SLASH=120;
    public static final int SMENTRY=121;
    public static final int SMHEADER=122;
    public static final int SMTENTRY=123;
    public static final int SMTHEADER=124;
    public static final int SMTTYPES=125;
    public static final int STANDINTOKEN=126;
    public static final int STAR=127;
    public static final int STATIC=128;
    public static final int STATICCTORDECL=129;
    public static final int STRICTFP=130;
    public static final int STRINGLITERAL=131;
    public static final int SUPER=132;
    public static final int SWITCH=133;
    public static final int SYNCHRONIZED=134;
    public static final int Scala=135;
    public static final int ScalaSig=136;
    public static final int Signature=137;
    public static final int SourceFile=138;
    public static final int StackMap=139;
    public static final int StackMapTable=140;
    public static final int Synthetic=141;
    public static final int THROWCLAUSE=142;
    public static final int THROWS=143;
    public static final int TPARAMETERS=144;
    public static final int TRANSIENT=145;
    public static final int TRUE=146;
    public static final int TYPEARGS=147;
    public static final int Throws=148;
    public static final int UNDERSCORE=149;
    public static final int UNITARGUMENTS=150;
    public static final int UNITATTR=151;
    public static final int UNITBODY=152;
    public static final int UNITHEADER=153;
    public static final int UNITNAME=154;
    public static final int UnicodeEscapeSequence=155;
    public static final int VARINFO=156;
    public static final int VMODIFIER=157;
    public static final int VOID=158;
    public static final int VOLATILE=159;
    public static final int VoidType=160;
    public static final int WINDOWSPATH=161;
    public static final int WS=162;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public JVMWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public JVMWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return JVMWalker.tokenNames; }
    public String getGrammarFileName() { return "D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g"; }


    public static class program_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:19:1: program : ( class_file )* ;
    public final JVMWalker.program_return program() throws RecognitionException {
        JVMWalker.program_return retval = new JVMWalker.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.class_file_return class_file1 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:19:9: ( ( class_file )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:19:11: ( class_file )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:19:11: ( class_file )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CLASSFILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:19:11: class_file
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_class_file_in_program64);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:21:1: class_file : ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) ;
    public final JVMWalker.class_file_return class_file() throws RecognitionException {
        JVMWalker.class_file_return retval = new JVMWalker.class_file_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASSFILE2=null;
        CommonTree CFHEADER3=null;
        JVMWalker.class_file_header_return class_file_header4 =null;

        JVMWalker.classDefinition_return classDefinition5 =null;


        CommonTree CLASSFILE2_tree=null;
        CommonTree CFHEADER3_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:22:3: ( ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:22:5: ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CLASSFILE2=(CommonTree)match(input,CLASSFILE,FOLLOW_CLASSFILE_in_class_file76); 
            CLASSFILE2_tree = (CommonTree)adaptor.dupNode(CLASSFILE2);


            root_1 = (CommonTree)adaptor.becomeRoot(CLASSFILE2_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CFHEADER3=(CommonTree)match(input,CFHEADER,FOLLOW_CFHEADER_in_class_file79); 
            CFHEADER3_tree = (CommonTree)adaptor.dupNode(CFHEADER3);


            root_2 = (CommonTree)adaptor.becomeRoot(CFHEADER3_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_class_file_header_in_class_file81);
            class_file_header4=class_file_header();

            state._fsp--;

            adaptor.addChild(root_2, class_file_header4.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_classDefinition_in_class_file84);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:26:3: class_file_header : class_file_info modified_file_info checksum_file_info ( compiled_file_info )? ;
    public final JVMWalker.class_file_header_return class_file_header() throws RecognitionException {
        JVMWalker.class_file_header_return retval = new JVMWalker.class_file_header_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.class_file_info_return class_file_info6 =null;

        JVMWalker.modified_file_info_return modified_file_info7 =null;

        JVMWalker.checksum_file_info_return checksum_file_info8 =null;

        JVMWalker.compiled_file_info_return compiled_file_info9 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:27:5: ( class_file_info modified_file_info checksum_file_info ( compiled_file_info )? )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:27:7: class_file_info modified_file_info checksum_file_info ( compiled_file_info )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_class_file_info_in_class_file_header107);
            class_file_info6=class_file_info();

            state._fsp--;

            adaptor.addChild(root_0, class_file_info6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_modified_file_info_in_class_file_header113);
            modified_file_info7=modified_file_info();

            state._fsp--;

            adaptor.addChild(root_0, modified_file_info7.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_checksum_file_info_in_class_file_header119);
            checksum_file_info8=checksum_file_info();

            state._fsp--;

            adaptor.addChild(root_0, checksum_file_info8.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:30:5: ( compiled_file_info )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:30:5: compiled_file_info
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_compiled_file_info_in_class_file_header125);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:32:1: class_file_info : ^( IDENTIFIER WINDOWSPATH ) ;
    public final JVMWalker.class_file_info_return class_file_info() throws RecognitionException {
        JVMWalker.class_file_info_return retval = new JVMWalker.class_file_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER10=null;
        CommonTree WINDOWSPATH11=null;

        CommonTree IDENTIFIER10_tree=null;
        CommonTree WINDOWSPATH11_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:33:3: ( ^( IDENTIFIER WINDOWSPATH ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:33:5: ^( IDENTIFIER WINDOWSPATH )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER10=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_file_info139); 
            IDENTIFIER10_tree = (CommonTree)adaptor.dupNode(IDENTIFIER10);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER10_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            WINDOWSPATH11=(CommonTree)match(input,WINDOWSPATH,FOLLOW_WINDOWSPATH_in_class_file_info141); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:36:1: modified_file_info : ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER ) ;
    public final JVMWalker.modified_file_info_return modified_file_info() throws RecognitionException {
        JVMWalker.modified_file_info_return retval = new JVMWalker.modified_file_info_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:37:3: ( ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:37:5: ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER12=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info158); 
            IDENTIFIER12_tree = (CommonTree)adaptor.dupNode(IDENTIFIER12);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER12_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER13=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info160); 
            IDENTIFIER13_tree = (CommonTree)adaptor.dupNode(IDENTIFIER13);


            adaptor.addChild(root_1, IDENTIFIER13_tree);


            _last = (CommonTree)input.LT(1);
            DATE14=(CommonTree)match(input,DATE,FOLLOW_DATE_in_modified_file_info162); 
            DATE14_tree = (CommonTree)adaptor.dupNode(DATE14);


            adaptor.addChild(root_1, DATE14_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER15=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info164); 
            IDENTIFIER15_tree = (CommonTree)adaptor.dupNode(IDENTIFIER15);


            adaptor.addChild(root_1, IDENTIFIER15_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL16=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_modified_file_info166); 
            INTLITERAL16_tree = (CommonTree)adaptor.dupNode(INTLITERAL16);


            adaptor.addChild(root_1, INTLITERAL16_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER17=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info168); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:40:1: checksum_file_info : ^( IDENTIFIER IDENTIFIER HexDigits ) ;
    public final JVMWalker.checksum_file_info_return checksum_file_info() throws RecognitionException {
        JVMWalker.checksum_file_info_return retval = new JVMWalker.checksum_file_info_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:41:3: ( ^( IDENTIFIER IDENTIFIER HexDigits ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:41:5: ^( IDENTIFIER IDENTIFIER HexDigits )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER18=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info185); 
            IDENTIFIER18_tree = (CommonTree)adaptor.dupNode(IDENTIFIER18);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER18_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER19=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info187); 
            IDENTIFIER19_tree = (CommonTree)adaptor.dupNode(IDENTIFIER19);


            adaptor.addChild(root_1, IDENTIFIER19_tree);


            _last = (CommonTree)input.LT(1);
            HexDigits20=(CommonTree)match(input,HexDigits,FOLLOW_HexDigits_in_checksum_file_info189); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:44:1: compiled_file_info : ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) ;
    public final JVMWalker.compiled_file_info_return compiled_file_info() throws RecognitionException {
        JVMWalker.compiled_file_info_return retval = new JVMWalker.compiled_file_info_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:45:3: ( ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:45:5: ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER21=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info208); 
            IDENTIFIER21_tree = (CommonTree)adaptor.dupNode(IDENTIFIER21);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER21_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER22=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info210); 
            IDENTIFIER22_tree = (CommonTree)adaptor.dupNode(IDENTIFIER22);


            adaptor.addChild(root_1, IDENTIFIER22_tree);


            _last = (CommonTree)input.LT(1);
            STRINGLITERAL23=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_compiled_file_info212); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:52:1: classDefinition : ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) t= typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) ;
    public final JVMWalker.classDefinition_return classDefinition() throws RecognitionException {
        JVMWalker.classDefinition_return retval = new JVMWalker.classDefinition_return();
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
        JVMWalker.typeName_return t =null;

        JVMWalker.class_visual_modifier_return class_visual_modifier26 =null;

        JVMWalker.class_modifier_return class_modifier28 =null;

        JVMWalker.typeParameters_return typeParameters30 =null;

        JVMWalker.typeList_return typeList32 =null;

        JVMWalker.typeList_return typeList34 =null;

        JVMWalker.type_info_return type_info36 =null;

        JVMWalker.constant_pool_return constant_pool38 =null;

        JVMWalker.classBody_return classBody40 =null;


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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:3: ( ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) t= typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:5: ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) t= typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CLASSDECL24=(CommonTree)match(input,CLASSDECL,FOLLOW_CLASSDECL_in_classDefinition231); 
            CLASSDECL24_tree = (CommonTree)adaptor.dupNode(CLASSDECL24);


            root_1 = (CommonTree)adaptor.becomeRoot(CLASSDECL24_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER25=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_classDefinition235); 
            VMODIFIER25_tree = (CommonTree)adaptor.dupNode(VMODIFIER25);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER25_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:30: ( class_visual_modifier )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:30: class_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_class_visual_modifier_in_classDefinition237);
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
            MODIFIER27=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_classDefinition242); 
            MODIFIER27_tree = (CommonTree)adaptor.dupNode(MODIFIER27);


            root_2 = (CommonTree)adaptor.becomeRoot(MODIFIER27_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:65: ( class_modifier )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ABSTRACT||LA4_0==CLASS||LA4_0==FINAL||LA4_0==INTERFACE) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:65: class_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_class_modifier_in_classDefinition244);
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
            pushFollow(FOLLOW_typeName_in_classDefinition250);
            t=typeName();

            state._fsp--;

            adaptor.addChild(root_1, t.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TPARAMETERS29=(CommonTree)match(input,TPARAMETERS,FOLLOW_TPARAMETERS_in_classDefinition253); 
            TPARAMETERS29_tree = (CommonTree)adaptor.dupNode(TPARAMETERS29);


            root_2 = (CommonTree)adaptor.becomeRoot(TPARAMETERS29_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:107: ( typeParameters )?
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENTIFIER) ) {
                    alt5=1;
                }
                switch (alt5) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:107: typeParameters
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeParameters_in_classDefinition255);
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
            CEXTENDS31=(CommonTree)match(input,CEXTENDS,FOLLOW_CEXTENDS_in_classDefinition260); 
            CEXTENDS31_tree = (CommonTree)adaptor.dupNode(CEXTENDS31);


            root_2 = (CommonTree)adaptor.becomeRoot(CEXTENDS31_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:135: ( typeList )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOLEAN||LA6_0==BYTE||LA6_0==CHAR||LA6_0==DOUBLE||LA6_0==FLOAT||LA6_0==INT||LA6_0==LONG||LA6_0==SHORT||LA6_0==UNITNAME||LA6_0==VOID) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:135: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_classDefinition262);
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
            CIMPLEMENTS33=(CommonTree)match(input,CIMPLEMENTS,FOLLOW_CIMPLEMENTS_in_classDefinition267); 
            CIMPLEMENTS33_tree = (CommonTree)adaptor.dupNode(CIMPLEMENTS33);


            root_2 = (CommonTree)adaptor.becomeRoot(CIMPLEMENTS33_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:160: ( typeList )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLEAN||LA7_0==BYTE||LA7_0==CHAR||LA7_0==DOUBLE||LA7_0==FLOAT||LA7_0==INT||LA7_0==LONG||LA7_0==SHORT||LA7_0==UNITNAME||LA7_0==VOID) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:53:160: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_classDefinition269);
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
            UNITHEADER35=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_classDefinition290); 
            UNITHEADER35_tree = (CommonTree)adaptor.dupNode(UNITHEADER35);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER35_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_info_in_classDefinition292);
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
            CPOOL37=(CommonTree)match(input,CPOOL,FOLLOW_CPOOL_in_classDefinition312); 
            CPOOL37_tree = (CommonTree)adaptor.dupNode(CPOOL37);


            root_2 = (CommonTree)adaptor.becomeRoot(CPOOL37_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_constant_pool_in_classDefinition314);
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
            UNITBODY39=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_classDefinition334); 
            UNITBODY39_tree = (CommonTree)adaptor.dupNode(UNITBODY39);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY39_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:56:28: ( classBody )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CTORDECL||LA8_0==FIELDDECL||LA8_0==METHODDECL||LA8_0==STATICCTORDECL) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:56:28: classBody
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_classBody_in_classDefinition336);
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


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:60:1: class_visual_modifier : PUBLIC ;
    public final JVMWalker.class_visual_modifier_return class_visual_modifier() throws RecognitionException {
        JVMWalker.class_visual_modifier_return retval = new JVMWalker.class_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PUBLIC41=null;

        CommonTree PUBLIC41_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:61:3: ( PUBLIC )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:61:5: PUBLIC
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            PUBLIC41=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier373); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:64:1: class_modifier : ( ABSTRACT | FINAL | INTERFACE | CLASS );
    public final JVMWalker.class_modifier_return class_modifier() throws RecognitionException {
        JVMWalker.class_modifier_return retval = new JVMWalker.class_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set42=null;

        CommonTree set42_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:65:3: ( ABSTRACT | FINAL | INTERFACE | CLASS )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:72:1: type_info : ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ ;
    public final JVMWalker.type_info_return type_info() throws RecognitionException {
        JVMWalker.type_info_return retval = new JVMWalker.type_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.sourcefile_info_return sourcefile_info43 =null;

        JVMWalker.minor_major_version_info_return minor_major_version_info44 =null;

        JVMWalker.flags_return flags45 =null;

        JVMWalker.scalaSig_info_return scalaSig_info46 =null;

        JVMWalker.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info47 =null;

        JVMWalker.innerclass_info_return innerclass_info48 =null;

        JVMWalker.enclosingMethod_return enclosingMethod49 =null;

        JVMWalker.signature_info_addition_return signature_info_addition50 =null;

        JVMWalker.deprecated_return deprecated51 =null;

        JVMWalker.synthetic_return synthetic52 =null;

        JVMWalker.scala_info_return scala_info53 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:73:3: ( ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:73:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:73:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:73:6: sourcefile_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sourcefile_info_in_type_info420);
            	    sourcefile_info43=sourcefile_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sourcefile_info43.getTree());


            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:74:5: minor_major_version_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_minor_major_version_info_in_type_info426);
            	    minor_major_version_info44=minor_major_version_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minor_major_version_info44.getTree());


            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:75:5: flags
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_flags_in_type_info432);
            	    flags45=flags();

            	    state._fsp--;

            	    adaptor.addChild(root_0, flags45.getTree());


            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:76:5: scalaSig_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_scalaSig_info_in_type_info438);
            	    scalaSig_info46=scalaSig_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, scalaSig_info46.getTree());


            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:77:5: runtimeVisibleAnnotations_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_type_info445);
            	    runtimeVisibleAnnotations_info47=runtimeVisibleAnnotations_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleAnnotations_info47.getTree());


            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:78:5: innerclass_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_innerclass_info_in_type_info451);
            	    innerclass_info48=innerclass_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, innerclass_info48.getTree());


            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:79:5: enclosingMethod
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_enclosingMethod_in_type_info457);
            	    enclosingMethod49=enclosingMethod();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enclosingMethod49.getTree());


            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:80:5: signature_info_addition
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_signature_info_addition_in_type_info463);
            	    signature_info_addition50=signature_info_addition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signature_info_addition50.getTree());


            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:81:5: deprecated
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_deprecated_in_type_info469);
            	    deprecated51=deprecated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, deprecated51.getTree());


            	    }
            	    break;
            	case 10 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:82:5: synthetic
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_synthetic_in_type_info475);
            	    synthetic52=synthetic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, synthetic52.getTree());


            	    }
            	    break;
            	case 11 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:83:5: scala_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_scala_info_in_type_info481);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:86:1: synthetic : ^( Synthetic BOOLEANLITERAL ) ;
    public final JVMWalker.synthetic_return synthetic() throws RecognitionException {
        JVMWalker.synthetic_return retval = new JVMWalker.synthetic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Synthetic54=null;
        CommonTree BOOLEANLITERAL55=null;

        CommonTree Synthetic54_tree=null;
        CommonTree BOOLEANLITERAL55_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:87:3: ( ^( Synthetic BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:87:5: ^( Synthetic BOOLEANLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Synthetic54=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_synthetic497); 
            Synthetic54_tree = (CommonTree)adaptor.dupNode(Synthetic54);


            root_1 = (CommonTree)adaptor.becomeRoot(Synthetic54_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            BOOLEANLITERAL55=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_synthetic499); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:90:1: deprecated : ^( Deprecated BOOLEANLITERAL ) ;
    public final JVMWalker.deprecated_return deprecated() throws RecognitionException {
        JVMWalker.deprecated_return retval = new JVMWalker.deprecated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Deprecated56=null;
        CommonTree BOOLEANLITERAL57=null;

        CommonTree Deprecated56_tree=null;
        CommonTree BOOLEANLITERAL57_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:91:3: ( ^( Deprecated BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:91:5: ^( Deprecated BOOLEANLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Deprecated56=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_deprecated514); 
            Deprecated56_tree = (CommonTree)adaptor.dupNode(Deprecated56);


            root_1 = (CommonTree)adaptor.becomeRoot(Deprecated56_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            BOOLEANLITERAL57=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_deprecated516); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:94:1: enclosingMethod : ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) ;
    public final JVMWalker.enclosingMethod_return enclosingMethod() throws RecognitionException {
        JVMWalker.enclosingMethod_return retval = new JVMWalker.enclosingMethod_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:95:3: ( ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:95:5: ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EnclosingMethod58=(CommonTree)match(input,EnclosingMethod,FOLLOW_EnclosingMethod_in_enclosingMethod531); 
            EnclosingMethod58_tree = (CommonTree)adaptor.dupNode(EnclosingMethod58);


            root_1 = (CommonTree)adaptor.becomeRoot(EnclosingMethod58_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX59=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod533); 
            CPINDEX59_tree = (CommonTree)adaptor.dupNode(CPINDEX59);


            adaptor.addChild(root_1, CPINDEX59_tree);


            _last = (CommonTree)input.LT(1);
            DOT60=(CommonTree)match(input,DOT,FOLLOW_DOT_in_enclosingMethod535); 
            DOT60_tree = (CommonTree)adaptor.dupNode(DOT60);


            adaptor.addChild(root_1, DOT60_tree);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:95:35: ( CPINDEX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CPINDEX) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:95:35: CPINDEX
                    {
                    _last = (CommonTree)input.LT(1);
                    CPINDEX61=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod537); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:98:1: sourcefile_info : ^( SourceFile STRINGLITERAL ) ;
    public final JVMWalker.sourcefile_info_return sourcefile_info() throws RecognitionException {
        JVMWalker.sourcefile_info_return retval = new JVMWalker.sourcefile_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SourceFile62=null;
        CommonTree STRINGLITERAL63=null;

        CommonTree SourceFile62_tree=null;
        CommonTree STRINGLITERAL63_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:99:3: ( ^( SourceFile STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:99:5: ^( SourceFile STRINGLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SourceFile62=(CommonTree)match(input,SourceFile,FOLLOW_SourceFile_in_sourcefile_info554); 
            SourceFile62_tree = (CommonTree)adaptor.dupNode(SourceFile62);


            root_1 = (CommonTree)adaptor.becomeRoot(SourceFile62_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            STRINGLITERAL63=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_sourcefile_info556); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:102:1: scalaSig_info : ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) ;
    public final JVMWalker.scalaSig_info_return scalaSig_info() throws RecognitionException {
        JVMWalker.scalaSig_info_return retval = new JVMWalker.scalaSig_info_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:103:3: ( ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:103:5: ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ScalaSig64=(CommonTree)match(input,ScalaSig,FOLLOW_ScalaSig_in_scalaSig_info571); 
            ScalaSig64_tree = (CommonTree)adaptor.dupNode(ScalaSig64);


            root_1 = (CommonTree)adaptor.becomeRoot(ScalaSig64_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER65=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scalaSig_info585); 
            IDENTIFIER65_tree = (CommonTree)adaptor.dupNode(IDENTIFIER65);


            adaptor.addChild(root_1, IDENTIFIER65_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN66=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_scalaSig_info587); 
            ASSIGN66_tree = (CommonTree)adaptor.dupNode(ASSIGN66);


            adaptor.addChild(root_1, ASSIGN66_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL67=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info589); 
            INTLITERAL67_tree = (CommonTree)adaptor.dupNode(INTLITERAL67);


            adaptor.addChild(root_1, INTLITERAL67_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL68=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info605); 
            INTLITERAL68_tree = (CommonTree)adaptor.dupNode(INTLITERAL68);


            adaptor.addChild(root_1, INTLITERAL68_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL69=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info607); 
            INTLITERAL69_tree = (CommonTree)adaptor.dupNode(INTLITERAL69);


            adaptor.addChild(root_1, INTLITERAL69_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL70=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info609); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:108:1: scala_info : ^( Scala IDENTIFIER ASSIGN INTLITERAL ) ;
    public final JVMWalker.scala_info_return scala_info() throws RecognitionException {
        JVMWalker.scala_info_return retval = new JVMWalker.scala_info_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:109:3: ( ^( Scala IDENTIFIER ASSIGN INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:109:5: ^( Scala IDENTIFIER ASSIGN INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Scala71=(CommonTree)match(input,Scala,FOLLOW_Scala_in_scala_info624); 
            Scala71_tree = (CommonTree)adaptor.dupNode(Scala71);


            root_1 = (CommonTree)adaptor.becomeRoot(Scala71_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER72=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scala_info626); 
            IDENTIFIER72_tree = (CommonTree)adaptor.dupNode(IDENTIFIER72);


            adaptor.addChild(root_1, IDENTIFIER72_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN73=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_scala_info628); 
            ASSIGN73_tree = (CommonTree)adaptor.dupNode(ASSIGN73);


            adaptor.addChild(root_1, ASSIGN73_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL74=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scala_info630); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:112:1: signature_info_addition : ^( Signature ( CPINDEX )? ) ;
    public final JVMWalker.signature_info_addition_return signature_info_addition() throws RecognitionException {
        JVMWalker.signature_info_addition_return retval = new JVMWalker.signature_info_addition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature75=null;
        CommonTree CPINDEX76=null;

        CommonTree Signature75_tree=null;
        CommonTree CPINDEX76_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:113:3: ( ^( Signature ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:113:5: ^( Signature ( CPINDEX )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature75=(CommonTree)match(input,Signature,FOLLOW_Signature_in_signature_info_addition648); 
            Signature75_tree = (CommonTree)adaptor.dupNode(Signature75);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature75_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:113:17: ( CPINDEX )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CPINDEX) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:113:17: CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        CPINDEX76=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_signature_info_addition650); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:116:1: innerclass_info : ^( InnerClasses ( innerclass_info_line )+ ) ;
    public final JVMWalker.innerclass_info_return innerclass_info() throws RecognitionException {
        JVMWalker.innerclass_info_return retval = new JVMWalker.innerclass_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree InnerClasses77=null;
        JVMWalker.innerclass_info_line_return innerclass_info_line78 =null;


        CommonTree InnerClasses77_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:117:3: ( ^( InnerClasses ( innerclass_info_line )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:117:5: ^( InnerClasses ( innerclass_info_line )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            InnerClasses77=(CommonTree)match(input,InnerClasses,FOLLOW_InnerClasses_in_innerclass_info666); 
            InnerClasses77_tree = (CommonTree)adaptor.dupNode(InnerClasses77);


            root_1 = (CommonTree)adaptor.becomeRoot(InnerClasses77_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:117:20: ( innerclass_info_line )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:117:20: innerclass_info_line
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_innerclass_info_line_in_innerclass_info668);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:120:1: innerclass_info_line : ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data ;
    public final JVMWalker.innerclass_info_line_return innerclass_info_line() throws RecognitionException {
        JVMWalker.innerclass_info_line_return retval = new JVMWalker.innerclass_info_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VMODIFIER79=null;
        CommonTree MODIFIER81=null;
        JVMWalker.method_visual_modifier_return method_visual_modifier80 =null;

        JVMWalker.method_modifier_return method_modifier82 =null;

        JVMWalker.innerclass_info_data_return innerclass_info_data83 =null;


        CommonTree VMODIFIER79_tree=null;
        CommonTree MODIFIER81_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:121:3: ( ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:121:6: ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER79=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_innerclass_info_line687); 
            VMODIFIER79_tree = (CommonTree)adaptor.dupNode(VMODIFIER79);


            root_1 = (CommonTree)adaptor.becomeRoot(VMODIFIER79_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:121:18: ( method_visual_modifier )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= PRIVATE && LA13_0 <= PUBLIC)) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:121:18: method_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_method_visual_modifier_in_innerclass_info_line689);
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
            MODIFIER81=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_innerclass_info_line694); 
            MODIFIER81_tree = (CommonTree)adaptor.dupNode(MODIFIER81);


            root_1 = (CommonTree)adaptor.becomeRoot(MODIFIER81_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:121:54: ( method_modifier )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ABSTRACT||LA14_0==FINAL||LA14_0==NATIVE||LA14_0==STATIC||LA14_0==STRICTFP||LA14_0==SYNCHRONIZED) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:121:54: method_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_method_modifier_in_innerclass_info_line696);
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
            pushFollow(FOLLOW_innerclass_info_data_in_innerclass_info_line700);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:124:1: innerclass_info_data : ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) ) ;
    public final JVMWalker.innerclass_info_data_return innerclass_info_data() throws RecognitionException {
        JVMWalker.innerclass_info_data_return retval = new JVMWalker.innerclass_info_data_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:125:3: ( ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:125:5: ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX84=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data714); 
            CPINDEX84_tree = (CommonTree)adaptor.dupNode(CPINDEX84);


            root_1 = (CommonTree)adaptor.becomeRoot(CPINDEX84_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INFODATA185=(CommonTree)match(input,INFODATA1,FOLLOW_INFODATA1_in_innerclass_info_data717); 
            INFODATA185_tree = (CommonTree)adaptor.dupNode(INFODATA185);


            root_2 = (CommonTree)adaptor.becomeRoot(INFODATA185_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:125:27: ( ASSIGN CPINDEX )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ASSIGN) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:125:28: ASSIGN CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        ASSIGN86=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_innerclass_info_data720); 
                        ASSIGN86_tree = (CommonTree)adaptor.dupNode(ASSIGN86);


                        adaptor.addChild(root_2, ASSIGN86_tree);


                        _last = (CommonTree)input.LT(1);
                        CPINDEX87=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data722); 
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
            INFODATA288=(CommonTree)match(input,INFODATA2,FOLLOW_INFODATA2_in_innerclass_info_data728); 
            INFODATA288_tree = (CommonTree)adaptor.dupNode(INFODATA288);


            root_2 = (CommonTree)adaptor.becomeRoot(INFODATA288_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:125:58: ( IDENTIFIER CPINDEX )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==IDENTIFIER) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:125:59: IDENTIFIER CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        IDENTIFIER89=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_data731); 
                        IDENTIFIER89_tree = (CommonTree)adaptor.dupNode(IDENTIFIER89);


                        adaptor.addChild(root_2, IDENTIFIER89_tree);


                        _last = (CommonTree)input.LT(1);
                        CPINDEX90=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data733); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:128:1: minor_major_version_info : ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) ;
    public final JVMWalker.minor_major_version_info_return minor_major_version_info() throws RecognitionException {
        JVMWalker.minor_major_version_info_return retval = new JVMWalker.minor_major_version_info_return();
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:129:3: ( ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:129:5: ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER91=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info755); 
            IDENTIFIER91_tree = (CommonTree)adaptor.dupNode(IDENTIFIER91);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER91_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER92=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info757); 
            IDENTIFIER92_tree = (CommonTree)adaptor.dupNode(IDENTIFIER92);


            adaptor.addChild(root_1, IDENTIFIER92_tree);


            _last = (CommonTree)input.LT(1);
            COLON93=(CommonTree)match(input,COLON,FOLLOW_COLON_in_minor_major_version_info759); 
            COLON93_tree = (CommonTree)adaptor.dupNode(COLON93);


            adaptor.addChild(root_1, COLON93_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL94=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_minor_major_version_info761); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:132:1: flags : ^( Flag ( accessFlagList )? ) ;
    public final JVMWalker.flags_return flags() throws RecognitionException {
        JVMWalker.flags_return retval = new JVMWalker.flags_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Flag95=null;
        JVMWalker.accessFlagList_return accessFlagList96 =null;


        CommonTree Flag95_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:133:3: ( ^( Flag ( accessFlagList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:133:5: ^( Flag ( accessFlagList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Flag95=(CommonTree)match(input,Flag,FOLLOW_Flag_in_flags782); 
            Flag95_tree = (CommonTree)adaptor.dupNode(Flag95);


            root_1 = (CommonTree)adaptor.becomeRoot(Flag95_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:133:12: ( accessFlagList )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IDENTIFIER||LA17_0==INTLITERAL) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:133:12: accessFlagList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_accessFlagList_in_flags784);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:136:1: accessFlagList : ( flagType )+ ;
    public final JVMWalker.accessFlagList_return accessFlagList() throws RecognitionException {
        JVMWalker.accessFlagList_return retval = new JVMWalker.accessFlagList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.flagType_return flagType97 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:137:3: ( ( flagType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:137:5: ( flagType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:137:5: ( flagType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:137:5: flagType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_flagType_in_accessFlagList801);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:140:1: flagType : (id= IDENTIFIER | INTLITERAL );
    public final JVMWalker.flagType_return flagType() throws RecognitionException {
        JVMWalker.flagType_return retval = new JVMWalker.flagType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree id=null;
        CommonTree INTLITERAL98=null;

        CommonTree id_tree=null;
        CommonTree INTLITERAL98_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:141:3: (id= IDENTIFIER | INTLITERAL )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:141:5: id= IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_flagType817); 
                    id_tree = (CommonTree)adaptor.dupNode(id);


                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:142:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL98=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_flagType823); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:149:1: runtimeVisibleAnnotations_info : ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) ;
    public final JVMWalker.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        JVMWalker.runtimeVisibleAnnotations_info_return retval = new JVMWalker.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeVisibleAnnotations99=null;
        JVMWalker.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem100 =null;


        CommonTree RuntimeVisibleAnnotations99_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:150:3: ( ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:150:5: ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeVisibleAnnotations99=(CommonTree)match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info844); 
            RuntimeVisibleAnnotations99_tree = (CommonTree)adaptor.dupNode(RuntimeVisibleAnnotations99);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeVisibleAnnotations99_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:150:33: ( runtimeVisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:150:33: runtimeVisibleAnnotationsItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info846);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:152:1: runtimeVisibleAnnotationsItem : ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMWalker.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        JVMWalker.runtimeVisibleAnnotationsItem_return retval = new JVMWalker.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX101=null;
        JVMWalker.pc_return pc102 =null;

        JVMWalker.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList103 =null;


        CommonTree CPINDEX101_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:153:3: ( ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:153:5: ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX101=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem861); 
            CPINDEX101_tree = (CommonTree)adaptor.dupNode(CPINDEX101);


            root_1 = (CommonTree)adaptor.becomeRoot(CPINDEX101_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem863);
            pc102=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc102.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:153:18: ( runtimeVisibleAnnotationAssignList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ASSIGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:153:18: runtimeVisibleAnnotationAssignList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem865);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:155:1: runtimeVisibleAnnotationAssignList : ( annotationAssign )+ ;
    public final JVMWalker.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        JVMWalker.runtimeVisibleAnnotationAssignList_return retval = new JVMWalker.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.annotationAssign_return annotationAssign104 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:156:3: ( ( annotationAssign )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:156:5: ( annotationAssign )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:156:5: ( annotationAssign )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:156:5: annotationAssign
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList879);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:158:1: annotationAssign : ^( ASSIGN CPINDEX annotationValue ) ;
    public final JVMWalker.annotationAssign_return annotationAssign() throws RecognitionException {
        JVMWalker.annotationAssign_return retval = new JVMWalker.annotationAssign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN105=null;
        CommonTree CPINDEX106=null;
        JVMWalker.annotationValue_return annotationValue107 =null;


        CommonTree ASSIGN105_tree=null;
        CommonTree CPINDEX106_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:159:3: ( ^( ASSIGN CPINDEX annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:159:5: ^( ASSIGN CPINDEX annotationValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN105=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign893); 
            ASSIGN105_tree = (CommonTree)adaptor.dupNode(ASSIGN105);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN105_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX106=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign895); 
            CPINDEX106_tree = (CommonTree)adaptor.dupNode(CPINDEX106);


            adaptor.addChild(root_1, CPINDEX106_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationValue_in_annotationAssign897);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:161:1: annotationValue : ( brackedAnnotationAssign | AnnotationAssign );
    public final JVMWalker.annotationValue_return annotationValue() throws RecognitionException {
        JVMWalker.annotationValue_return retval = new JVMWalker.annotationValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationAssign109=null;
        JVMWalker.brackedAnnotationAssign_return brackedAnnotationAssign108 =null;


        CommonTree AnnotationAssign109_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:162:3: ( brackedAnnotationAssign | AnnotationAssign )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:162:5: brackedAnnotationAssign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationValue910);
                    brackedAnnotationAssign108=brackedAnnotationAssign();

                    state._fsp--;

                    adaptor.addChild(root_0, brackedAnnotationAssign108.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:163:5: AnnotationAssign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    AnnotationAssign109=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationValue917); 
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:165:1: brackedAnnotationAssign : ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? ) ;
    public final JVMWalker.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        JVMWalker.brackedAnnotationAssign_return retval = new JVMWalker.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ANNOTATIONBRACKETS110=null;
        JVMWalker.brackedAnnotationAssignList_return brackedAnnotationAssignList111 =null;


        CommonTree ANNOTATIONBRACKETS110_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:166:3: ( ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:166:5: ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ANNOTATIONBRACKETS110=(CommonTree)match(input,ANNOTATIONBRACKETS,FOLLOW_ANNOTATIONBRACKETS_in_brackedAnnotationAssign930); 
            ANNOTATIONBRACKETS110_tree = (CommonTree)adaptor.dupNode(ANNOTATIONBRACKETS110);


            root_1 = (CommonTree)adaptor.becomeRoot(ANNOTATIONBRACKETS110_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:166:26: ( brackedAnnotationAssignList )?
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AnnotationAssign) ) {
                    alt24=1;
                }
                switch (alt24) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:166:26: brackedAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign932);
                        brackedAnnotationAssignList111=brackedAnnotationAssignList();

                        state._fsp--;

                        adaptor.addChild(root_1, brackedAnnotationAssignList111.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:168:1: brackedAnnotationAssignList : ( brackedAnnotationAssignValue )+ ;
    public final JVMWalker.brackedAnnotationAssignList_return brackedAnnotationAssignList() throws RecognitionException {
        JVMWalker.brackedAnnotationAssignList_return retval = new JVMWalker.brackedAnnotationAssignList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.brackedAnnotationAssignValue_return brackedAnnotationAssignValue112 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:169:3: ( ( brackedAnnotationAssignValue )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:169:5: ( brackedAnnotationAssignValue )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:169:5: ( brackedAnnotationAssignValue )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:169:5: brackedAnnotationAssignValue
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList946);
            	    brackedAnnotationAssignValue112=brackedAnnotationAssignValue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, brackedAnnotationAssignValue112.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:171:1: brackedAnnotationAssignValue : ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMWalker.brackedAnnotationAssignValue_return brackedAnnotationAssignValue() throws RecognitionException {
        JVMWalker.brackedAnnotationAssignValue_return retval = new JVMWalker.brackedAnnotationAssignValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationAssign113=null;
        JVMWalker.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList114 =null;


        CommonTree AnnotationAssign113_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:172:3: ( ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:172:5: ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AnnotationAssign113=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue960); 
            AnnotationAssign113_tree = (CommonTree)adaptor.dupNode(AnnotationAssign113);


            root_1 = (CommonTree)adaptor.becomeRoot(AnnotationAssign113_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:172:24: ( runtimeVisibleAnnotationAssignList )?
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ASSIGN) ) {
                    alt26=1;
                }
                switch (alt26) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:172:24: runtimeVisibleAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue962);
                        runtimeVisibleAnnotationAssignList114=runtimeVisibleAnnotationAssignList();

                        state._fsp--;

                        adaptor.addChild(root_1, runtimeVisibleAnnotationAssignList114.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:174:1: runtimeVisibleParameterAnnotations : ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMWalker.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations() throws RecognitionException {
        JVMWalker.runtimeVisibleParameterAnnotations_return retval = new JVMWalker.runtimeVisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeVisibleParameterAnnotations115=null;
        JVMWalker.parameterVisibilityInfo_return parameterVisibilityInfo116 =null;


        CommonTree RuntimeVisibleParameterAnnotations115_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:175:3: ( ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:175:5: ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeVisibleParameterAnnotations115=(CommonTree)match(input,RuntimeVisibleParameterAnnotations,FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations977); 
            RuntimeVisibleParameterAnnotations115_tree = (CommonTree)adaptor.dupNode(RuntimeVisibleParameterAnnotations115);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeVisibleParameterAnnotations115_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:175:42: ( parameterVisibilityInfo )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:175:42: parameterVisibilityInfo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations979);
            	    parameterVisibilityInfo116=parameterVisibilityInfo();

            	    state._fsp--;

            	    adaptor.addChild(root_1, parameterVisibilityInfo116.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:177:1: runtimeInvisibleParameterAnnotations : ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMWalker.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations() throws RecognitionException {
        JVMWalker.runtimeInvisibleParameterAnnotations_return retval = new JVMWalker.runtimeInvisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeInvisibleParameterAnnotations117=null;
        JVMWalker.parameterVisibilityInfo_return parameterVisibilityInfo118 =null;


        CommonTree RuntimeInvisibleParameterAnnotations117_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:178:3: ( ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:178:5: ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeInvisibleParameterAnnotations117=(CommonTree)match(input,RuntimeInvisibleParameterAnnotations,FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations994); 
            RuntimeInvisibleParameterAnnotations117_tree = (CommonTree)adaptor.dupNode(RuntimeInvisibleParameterAnnotations117);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeInvisibleParameterAnnotations117_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:178:44: ( parameterVisibilityInfo )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:178:44: parameterVisibilityInfo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations996);
            	    parameterVisibilityInfo118=parameterVisibilityInfo();

            	    state._fsp--;

            	    adaptor.addChild(root_1, parameterVisibilityInfo118.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:180:1: runtimeInvisibleAnnotations : ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) ;
    public final JVMWalker.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations() throws RecognitionException {
        JVMWalker.runtimeInvisibleAnnotations_return retval = new JVMWalker.runtimeInvisibleAnnotations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeInvisibleAnnotations119=null;
        JVMWalker.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem120 =null;


        CommonTree RuntimeInvisibleAnnotations119_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:181:3: ( ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:181:5: ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeInvisibleAnnotations119=(CommonTree)match(input,RuntimeInvisibleAnnotations,FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1011); 
            RuntimeInvisibleAnnotations119_tree = (CommonTree)adaptor.dupNode(RuntimeInvisibleAnnotations119);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeInvisibleAnnotations119_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:181:35: ( runtimeInvisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:181:35: runtimeInvisibleAnnotationsItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1013);
            	    runtimeInvisibleAnnotationsItem120=runtimeInvisibleAnnotationsItem();

            	    state._fsp--;

            	    adaptor.addChild(root_1, runtimeInvisibleAnnotationsItem120.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:183:1: parameterVisibilityInfo : ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) ;
    public final JVMWalker.parameterVisibilityInfo_return parameterVisibilityInfo() throws RecognitionException {
        JVMWalker.parameterVisibilityInfo_return retval = new JVMWalker.parameterVisibilityInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER122=null;
        JVMWalker.pc_return pc121 =null;

        JVMWalker.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem123 =null;


        CommonTree IDENTIFIER122_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:184:3: ( ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:184:5: ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_parameterVisibilityInfo1028);
            pc121=pc();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(pc121.getTree(), root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:184:10: ( IDENTIFIER )?
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==IDENTIFIER) ) {
                    alt30=1;
                }
                switch (alt30) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:184:10: IDENTIFIER
                        {
                        _last = (CommonTree)input.LT(1);
                        IDENTIFIER122=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1030); 
                        IDENTIFIER122_tree = (CommonTree)adaptor.dupNode(IDENTIFIER122);


                        adaptor.addChild(root_1, IDENTIFIER122_tree);


                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:184:22: ( runtimeVisibleAnnotationsItem )*
                loop31:
                do {
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==CPINDEX) ) {
                        alt31=1;
                    }


                    switch (alt31) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:184:22: runtimeVisibleAnnotationsItem
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1033);
                	    runtimeVisibleAnnotationsItem123=runtimeVisibleAnnotationsItem();

                	    state._fsp--;

                	    adaptor.addChild(root_1, runtimeVisibleAnnotationsItem123.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:186:1: runtimeInvisibleAnnotationsItem : ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) ;
    public final JVMWalker.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem() throws RecognitionException {
        JVMWalker.runtimeInvisibleAnnotationsItem_return retval = new JVMWalker.runtimeInvisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX126=null;
        JVMWalker.pc_return pc124 =null;

        JVMWalker.pc_return pc125 =null;

        JVMWalker.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList127 =null;


        CommonTree CPINDEX126_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:187:3: ( ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:187:5: ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1048);
            pc124=pc();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(pc124.getTree(), root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:187:10: ( pc )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INTLITERAL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:187:10: pc
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1050);
                    pc125=pc();

                    state._fsp--;

                    adaptor.addChild(root_1, pc125.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX126=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1054); 
            CPINDEX126_tree = (CommonTree)adaptor.dupNode(CPINDEX126);


            root_2 = (CommonTree)adaptor.becomeRoot(CPINDEX126_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:187:24: ( runtimeVisibleAnnotationAssignList )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ASSIGN) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:187:24: runtimeVisibleAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1056);
                        runtimeVisibleAnnotationAssignList127=runtimeVisibleAnnotationAssignList();

                        state._fsp--;

                        adaptor.addChild(root_2, runtimeVisibleAnnotationAssignList127.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:194:1: constant_pool : ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) ;
    public final JVMWalker.constant_pool_return constant_pool() throws RecognitionException {
        JVMWalker.constant_pool_return retval = new JVMWalker.constant_pool_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER128=null;
        CommonTree IDENTIFIER129=null;
        JVMWalker.contant_pool_line_return contant_pool_line130 =null;


        CommonTree IDENTIFIER128_tree=null;
        CommonTree IDENTIFIER129_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:195:3: ( ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:195:5: ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER128=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1077); 
            IDENTIFIER128_tree = (CommonTree)adaptor.dupNode(IDENTIFIER128);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER128_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER129=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1079); 
            IDENTIFIER129_tree = (CommonTree)adaptor.dupNode(IDENTIFIER129);


            adaptor.addChild(root_1, IDENTIFIER129_tree);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:195:29: ( contant_pool_line )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ASSIGN) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:195:29: contant_pool_line
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool1081);
            	    contant_pool_line130=contant_pool_line();

            	    state._fsp--;

            	    adaptor.addChild(root_1, contant_pool_line130.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:198:1: contant_pool_line : ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) ;
    public final JVMWalker.contant_pool_line_return contant_pool_line() throws RecognitionException {
        JVMWalker.contant_pool_line_return retval = new JVMWalker.contant_pool_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN131=null;
        CommonTree CPINDEX132=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE133=null;

        CommonTree ASSIGN131_tree=null;
        CommonTree CPINDEX132_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE133_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:199:3: ( ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:199:5: ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN131=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line1099); 
            ASSIGN131_tree = (CommonTree)adaptor.dupNode(ASSIGN131);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN131_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX132=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line1101); 
            CPINDEX132_tree = (CommonTree)adaptor.dupNode(CPINDEX132);


            adaptor.addChild(root_1, CPINDEX132_tree);


            _last = (CommonTree)input.LT(1);
            CONSTANT_TYPE_ASSIGNABLE133=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1103); 
            CONSTANT_TYPE_ASSIGNABLE133_tree = (CommonTree)adaptor.dupNode(CONSTANT_TYPE_ASSIGNABLE133);


            adaptor.addChild(root_1, CONSTANT_TYPE_ASSIGNABLE133_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:206:1: classBody : ( classBodyEntryDecl )+ ;
    public final JVMWalker.classBody_return classBody() throws RecognitionException {
        JVMWalker.classBody_return retval = new JVMWalker.classBody_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.classBodyEntryDecl_return classBodyEntryDecl134 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:207:3: ( ( classBodyEntryDecl )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:207:5: ( classBodyEntryDecl )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:207:5: ( classBodyEntryDecl )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:207:5: classBodyEntryDecl
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_classBodyEntryDecl_in_classBody1123);
            	    classBodyEntryDecl134=classBodyEntryDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classBodyEntryDecl134.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:210:1: classBodyEntryDecl : ( methodDefinition | ctorDefinition | fieldDefinition | staticCtorDefinition );
    public final JVMWalker.classBodyEntryDecl_return classBodyEntryDecl() throws RecognitionException {
        JVMWalker.classBodyEntryDecl_return retval = new JVMWalker.classBodyEntryDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.methodDefinition_return methodDefinition135 =null;

        JVMWalker.ctorDefinition_return ctorDefinition136 =null;

        JVMWalker.fieldDefinition_return fieldDefinition137 =null;

        JVMWalker.staticCtorDefinition_return staticCtorDefinition138 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:211:3: ( methodDefinition | ctorDefinition | fieldDefinition | staticCtorDefinition )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:211:5: methodDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_methodDefinition_in_classBodyEntryDecl1139);
                    methodDefinition135=methodDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, methodDefinition135.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:212:5: ctorDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ctorDefinition_in_classBodyEntryDecl1145);
                    ctorDefinition136=ctorDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, ctorDefinition136.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:213:5: fieldDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_fieldDefinition_in_classBodyEntryDecl1151);
                    fieldDefinition137=fieldDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, fieldDefinition137.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:214:5: staticCtorDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1157);
                    staticCtorDefinition138=staticCtorDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, staticCtorDefinition138.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:221:1: fieldDefinition : ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) ;
    public final JVMWalker.fieldDefinition_return fieldDefinition() throws RecognitionException {
        JVMWalker.fieldDefinition_return retval = new JVMWalker.fieldDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FIELDDECL139=null;
        CommonTree VMODIFIER140=null;
        CommonTree MODIFIER142=null;
        CommonTree RETVALUE144=null;
        CommonTree UNITNAME146=null;
        CommonTree FIELDVALUE148=null;
        CommonTree UNITHEADER150=null;
        CommonTree UNITATTR152=null;
        JVMWalker.field_visual_modifier_return field_visual_modifier141 =null;

        JVMWalker.field_modifier_return field_modifier143 =null;

        JVMWalker.type_return type145 =null;

        JVMWalker.keywordAggregate_return keywordAggregate147 =null;

        JVMWalker.literals_return literals149 =null;

        JVMWalker.fieldInfo_return fieldInfo151 =null;

        JVMWalker.fieldAdditionalInfo_return fieldAdditionalInfo153 =null;


        CommonTree FIELDDECL139_tree=null;
        CommonTree VMODIFIER140_tree=null;
        CommonTree MODIFIER142_tree=null;
        CommonTree RETVALUE144_tree=null;
        CommonTree UNITNAME146_tree=null;
        CommonTree FIELDVALUE148_tree=null;
        CommonTree UNITHEADER150_tree=null;
        CommonTree UNITATTR152_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:222:3: ( ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:222:5: ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FIELDDECL139=(CommonTree)match(input,FIELDDECL,FOLLOW_FIELDDECL_in_fieldDefinition1175); 
            FIELDDECL139_tree = (CommonTree)adaptor.dupNode(FIELDDECL139);


            root_1 = (CommonTree)adaptor.becomeRoot(FIELDDECL139_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER140=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_fieldDefinition1178); 
            VMODIFIER140_tree = (CommonTree)adaptor.dupNode(VMODIFIER140);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER140_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:222:29: ( field_visual_modifier )?
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= PRIVATE && LA37_0 <= PUBLIC)) ) {
                    alt37=1;
                }
                switch (alt37) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:222:29: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition1180);
                        field_visual_modifier141=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier141.getTree());


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
            MODIFIER142=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_fieldDefinition1185); 
            MODIFIER142_tree = (CommonTree)adaptor.dupNode(MODIFIER142);


            root_2 = (CommonTree)adaptor.becomeRoot(MODIFIER142_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:222:64: ( field_modifier )*
                loop38:
                do {
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==FINAL||LA38_0==STATIC||LA38_0==TRANSIENT||LA38_0==VOLATILE) ) {
                        alt38=1;
                    }


                    switch (alt38) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:222:64: field_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition1187);
                	    field_modifier143=field_modifier();

                	    state._fsp--;

                	    adaptor.addChild(root_2, field_modifier143.getTree());


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
            RETVALUE144=(CommonTree)match(input,RETVALUE,FOLLOW_RETVALUE_in_fieldDefinition1192); 
            RETVALUE144_tree = (CommonTree)adaptor.dupNode(RETVALUE144);


            root_2 = (CommonTree)adaptor.becomeRoot(RETVALUE144_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_fieldDefinition1194);
            type145=type();

            state._fsp--;

            adaptor.addChild(root_2, type145.getTree());


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
            UNITNAME146=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_fieldDefinition1198); 
            UNITNAME146_tree = (CommonTree)adaptor.dupNode(UNITNAME146);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME146_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_keywordAggregate_in_fieldDefinition1200);
            keywordAggregate147=keywordAggregate();

            state._fsp--;

            adaptor.addChild(root_2, keywordAggregate147.getTree());


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
            FIELDVALUE148=(CommonTree)match(input,FIELDVALUE,FOLLOW_FIELDVALUE_in_fieldDefinition1204); 
            FIELDVALUE148_tree = (CommonTree)adaptor.dupNode(FIELDVALUE148);


            root_2 = (CommonTree)adaptor.becomeRoot(FIELDVALUE148_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:222:140: ( literals )?
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==BOOLEANLITERAL||LA39_0==CHARLITERAL||LA39_0==DOUBLELITERAL||LA39_0==FLOATLITERAL||LA39_0==IDENTIFIER||LA39_0==INTLITERAL||LA39_0==LONGLITERAL||LA39_0==MINUS||LA39_0==STRINGLITERAL) ) {
                    alt39=1;
                }
                switch (alt39) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:222:140: literals
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_literals_in_fieldDefinition1206);
                        literals149=literals();

                        state._fsp--;

                        adaptor.addChild(root_2, literals149.getTree());


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
            UNITHEADER150=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_fieldDefinition1223); 
            UNITHEADER150_tree = (CommonTree)adaptor.dupNode(UNITHEADER150);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER150_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition1225);
            fieldInfo151=fieldInfo();

            state._fsp--;

            adaptor.addChild(root_2, fieldInfo151.getTree());


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
            UNITATTR152=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_fieldDefinition1241); 
            UNITATTR152_tree = (CommonTree)adaptor.dupNode(UNITATTR152);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR152_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:224:24: ( fieldAdditionalInfo )*
                loop40:
                do {
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Constant||LA40_0==Deprecated||LA40_0==RuntimeInvisibleAnnotations||LA40_0==RuntimeVisibleAnnotations||LA40_0==Signature||LA40_0==Synthetic) ) {
                        alt40=1;
                    }


                    switch (alt40) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:224:24: fieldAdditionalInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition1243);
                	    fieldAdditionalInfo153=fieldAdditionalInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_2, fieldAdditionalInfo153.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:228:1: fieldInfo : ^( Signature bytecodeType ) flags ;
    public final JVMWalker.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMWalker.fieldInfo_return retval = new JVMWalker.fieldInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature154=null;
        JVMWalker.bytecodeType_return bytecodeType155 =null;

        JVMWalker.flags_return flags156 =null;


        CommonTree Signature154_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:229:3: ( ^( Signature bytecodeType ) flags )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:229:5: ^( Signature bytecodeType ) flags
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature154=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldInfo1273); 
            Signature154_tree = (CommonTree)adaptor.dupNode(Signature154);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature154_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_fieldInfo1275);
            bytecodeType155=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_1, bytecodeType155.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flags_in_fieldInfo1278);
            flags156=flags();

            state._fsp--;

            adaptor.addChild(root_0, flags156.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:232:1: fieldAdditionalInfo : ( ^( Constant primitiveType literals ) | ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | ^( Signature CPINDEX ) | ^( Deprecated BOOLEANLITERAL ) | ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations );
    public final JVMWalker.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        JVMWalker.fieldAdditionalInfo_return retval = new JVMWalker.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Constant157=null;
        CommonTree Constant160=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE161=null;
        CommonTree Signature162=null;
        CommonTree CPINDEX163=null;
        CommonTree Deprecated164=null;
        CommonTree BOOLEANLITERAL165=null;
        CommonTree Synthetic166=null;
        CommonTree BOOLEANLITERAL167=null;
        JVMWalker.primitiveType_return primitiveType158 =null;

        JVMWalker.literals_return literals159 =null;

        JVMWalker.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info168 =null;

        JVMWalker.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations169 =null;


        CommonTree Constant157_tree=null;
        CommonTree Constant160_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE161_tree=null;
        CommonTree Signature162_tree=null;
        CommonTree CPINDEX163_tree=null;
        CommonTree Deprecated164_tree=null;
        CommonTree BOOLEANLITERAL165_tree=null;
        CommonTree Synthetic166_tree=null;
        CommonTree BOOLEANLITERAL167_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:233:3: ( ^( Constant primitiveType literals ) | ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | ^( Signature CPINDEX ) | ^( Deprecated BOOLEANLITERAL ) | ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:233:5: ^( Constant primitiveType literals )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Constant157=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1292); 
                    Constant157_tree = (CommonTree)adaptor.dupNode(Constant157);


                    root_1 = (CommonTree)adaptor.becomeRoot(Constant157_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_fieldAdditionalInfo1294);
                    primitiveType158=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_1, primitiveType158.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_literals_in_fieldAdditionalInfo1296);
                    literals159=literals();

                    state._fsp--;

                    adaptor.addChild(root_1, literals159.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:234:5: ^( Constant CONSTANT_TYPE_ASSIGNABLE )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Constant160=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1304); 
                    Constant160_tree = (CommonTree)adaptor.dupNode(Constant160);


                    root_1 = (CommonTree)adaptor.becomeRoot(Constant160_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    CONSTANT_TYPE_ASSIGNABLE161=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo1306); 
                    CONSTANT_TYPE_ASSIGNABLE161_tree = (CommonTree)adaptor.dupNode(CONSTANT_TYPE_ASSIGNABLE161);


                    adaptor.addChild(root_1, CONSTANT_TYPE_ASSIGNABLE161_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:235:5: ^( Signature CPINDEX )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Signature162=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo1314); 
                    Signature162_tree = (CommonTree)adaptor.dupNode(Signature162);


                    root_1 = (CommonTree)adaptor.becomeRoot(Signature162_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    CPINDEX163=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldAdditionalInfo1316); 
                    CPINDEX163_tree = (CommonTree)adaptor.dupNode(CPINDEX163);


                    adaptor.addChild(root_1, CPINDEX163_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:236:5: ^( Deprecated BOOLEANLITERAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Deprecated164=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo1324); 
                    Deprecated164_tree = (CommonTree)adaptor.dupNode(Deprecated164);


                    root_1 = (CommonTree)adaptor.becomeRoot(Deprecated164_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL165=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1326); 
                    BOOLEANLITERAL165_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL165);


                    adaptor.addChild(root_1, BOOLEANLITERAL165_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:237:5: ^( Synthetic BOOLEANLITERAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Synthetic166=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo1334); 
                    Synthetic166_tree = (CommonTree)adaptor.dupNode(Synthetic166);


                    root_1 = (CommonTree)adaptor.becomeRoot(Synthetic166_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL167=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1336); 
                    BOOLEANLITERAL167_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL167);


                    adaptor.addChild(root_1, BOOLEANLITERAL167_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:238:5: runtimeVisibleAnnotations_info
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo1343);
                    runtimeVisibleAnnotations_info168=runtimeVisibleAnnotations_info();

                    state._fsp--;

                    adaptor.addChild(root_0, runtimeVisibleAnnotations_info168.getTree());


                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:239:5: runtimeInvisibleAnnotations
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo1349);
                    runtimeInvisibleAnnotations169=runtimeInvisibleAnnotations();

                    state._fsp--;

                    adaptor.addChild(root_0, runtimeInvisibleAnnotations169.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:242:1: field_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMWalker.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        JVMWalker.field_visual_modifier_return retval = new JVMWalker.field_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set170=null;

        CommonTree set170_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:243:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set170=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
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
    // $ANTLR end "field_visual_modifier"


    public static class field_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:246:1: field_modifier : ( FINAL | STATIC | TRANSIENT | VOLATILE );
    public final JVMWalker.field_modifier_return field_modifier() throws RecognitionException {
        JVMWalker.field_modifier_return retval = new JVMWalker.field_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set171=null;

        CommonTree set171_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:247:3: ( FINAL | STATIC | TRANSIENT | VOLATILE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set171=(CommonTree)input.LT(1);

            if ( input.LA(1)==FINAL||input.LA(1)==STATIC||input.LA(1)==TRANSIENT||input.LA(1)==VOLATILE ) {
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
    // $ANTLR end "field_modifier"


    public static class staticCtorDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "staticCtorDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:254:1: staticCtorDefinition : ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) ;
    public final JVMWalker.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        JVMWalker.staticCtorDefinition_return retval = new JVMWalker.staticCtorDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STATICCTORDECL172=null;
        CommonTree VMODIFIER173=null;
        CommonTree UNITHEADER175=null;
        CommonTree UNITBODY177=null;
        JVMWalker.field_visual_modifier_return field_visual_modifier174 =null;

        JVMWalker.methodInfo_return methodInfo176 =null;

        JVMWalker.body_return body178 =null;


        CommonTree STATICCTORDECL172_tree=null;
        CommonTree VMODIFIER173_tree=null;
        CommonTree UNITHEADER175_tree=null;
        CommonTree UNITBODY177_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:255:3: ( ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:255:5: ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STATICCTORDECL172=(CommonTree)match(input,STATICCTORDECL,FOLLOW_STATICCTORDECL_in_staticCtorDefinition1421); 
            STATICCTORDECL172_tree = (CommonTree)adaptor.dupNode(STATICCTORDECL172);


            root_1 = (CommonTree)adaptor.becomeRoot(STATICCTORDECL172_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER173=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_staticCtorDefinition1424); 
            VMODIFIER173_tree = (CommonTree)adaptor.dupNode(VMODIFIER173);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER173_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:255:34: ( field_visual_modifier )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0 >= PRIVATE && LA42_0 <= PUBLIC)) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:255:34: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition1426);
                        field_visual_modifier174=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier174.getTree());


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
            UNITHEADER175=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_staticCtorDefinition1431); 
            UNITHEADER175_tree = (CommonTree)adaptor.dupNode(UNITHEADER175);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER175_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition1433);
            methodInfo176=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo176.getTree());


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
            UNITBODY177=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_staticCtorDefinition1437); 
            UNITBODY177_tree = (CommonTree)adaptor.dupNode(UNITBODY177);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY177_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_body_in_staticCtorDefinition1439);
            body178=body();

            state._fsp--;

            adaptor.addChild(root_2, body178.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:263:1: ctorDefinition : ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMWalker.ctorDefinition_return ctorDefinition() throws RecognitionException {
        JVMWalker.ctorDefinition_return retval = new JVMWalker.ctorDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CTORDECL179=null;
        CommonTree VMODIFIER180=null;
        CommonTree GENERICDESC182=null;
        CommonTree UNITNAME184=null;
        CommonTree THROWCLAUSE187=null;
        CommonTree UNITHEADER189=null;
        CommonTree UNITBODY191=null;
        CommonTree UNITATTR193=null;
        JVMWalker.field_visual_modifier_return field_visual_modifier181 =null;

        JVMWalker.genericDescriptor_return genericDescriptor183 =null;

        JVMWalker.typeName_return typeName185 =null;

        JVMWalker.arguments_return arguments186 =null;

        JVMWalker.throwClause_return throwClause188 =null;

        JVMWalker.methodInfo_return methodInfo190 =null;

        JVMWalker.body_return body192 =null;

        JVMWalker.afterMethodInfo_return afterMethodInfo194 =null;


        CommonTree CTORDECL179_tree=null;
        CommonTree VMODIFIER180_tree=null;
        CommonTree GENERICDESC182_tree=null;
        CommonTree UNITNAME184_tree=null;
        CommonTree THROWCLAUSE187_tree=null;
        CommonTree UNITHEADER189_tree=null;
        CommonTree UNITBODY191_tree=null;
        CommonTree UNITATTR193_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:264:3: ( ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:264:5: ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CTORDECL179=(CommonTree)match(input,CTORDECL,FOLLOW_CTORDECL_in_ctorDefinition1462); 
            CTORDECL179_tree = (CommonTree)adaptor.dupNode(CTORDECL179);


            root_1 = (CommonTree)adaptor.becomeRoot(CTORDECL179_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER180=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_ctorDefinition1465); 
            VMODIFIER180_tree = (CommonTree)adaptor.dupNode(VMODIFIER180);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER180_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:264:28: ( field_visual_modifier )?
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0 >= PRIVATE && LA43_0 <= PUBLIC)) ) {
                    alt43=1;
                }
                switch (alt43) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:264:28: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition1467);
                        field_visual_modifier181=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier181.getTree());


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
            GENERICDESC182=(CommonTree)match(input,GENERICDESC,FOLLOW_GENERICDESC_in_ctorDefinition1472); 
            GENERICDESC182_tree = (CommonTree)adaptor.dupNode(GENERICDESC182);


            root_2 = (CommonTree)adaptor.becomeRoot(GENERICDESC182_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:264:66: ( genericDescriptor )?
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==EXTENDS) ) {
                    alt44=1;
                }
                switch (alt44) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:264:66: genericDescriptor
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_genericDescriptor_in_ctorDefinition1474);
                        genericDescriptor183=genericDescriptor();

                        state._fsp--;

                        adaptor.addChild(root_2, genericDescriptor183.getTree());


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
            UNITNAME184=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_ctorDefinition1479); 
            UNITNAME184_tree = (CommonTree)adaptor.dupNode(UNITNAME184);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME184_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeName_in_ctorDefinition1481);
            typeName185=typeName();

            state._fsp--;

            adaptor.addChild(root_2, typeName185.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arguments_in_ctorDefinition1484);
            arguments186=arguments();

            state._fsp--;

            adaptor.addChild(root_1, arguments186.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWCLAUSE187=(CommonTree)match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_ctorDefinition1487); 
            THROWCLAUSE187_tree = (CommonTree)adaptor.dupNode(THROWCLAUSE187);


            root_2 = (CommonTree)adaptor.becomeRoot(THROWCLAUSE187_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:264:131: ( throwClause )?
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==THROWS) ) {
                    alt45=1;
                }
                switch (alt45) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:264:131: throwClause
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_throwClause_in_ctorDefinition1489);
                        throwClause188=throwClause();

                        state._fsp--;

                        adaptor.addChild(root_2, throwClause188.getTree());


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
            UNITHEADER189=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_ctorDefinition1518); 
            UNITHEADER189_tree = (CommonTree)adaptor.dupNode(UNITHEADER189);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER189_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_ctorDefinition1520);
            methodInfo190=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo190.getTree());


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
            UNITBODY191=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_ctorDefinition1548); 
            UNITBODY191_tree = (CommonTree)adaptor.dupNode(UNITBODY191);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY191_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_body_in_ctorDefinition1550);
            body192=body();

            state._fsp--;

            adaptor.addChild(root_2, body192.getTree());


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
            UNITATTR193=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_ctorDefinition1578); 
            UNITATTR193_tree = (CommonTree)adaptor.dupNode(UNITATTR193);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR193_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:267:36: ( afterMethodInfo )?
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AnnotationDefault||LA46_0==Deprecated||LA46_0==Exceptions||(LA46_0 >= RuntimeInvisibleAnnotations && LA46_0 <= RuntimeVisibleParameterAnnotations)||LA46_0==Signature||LA46_0==Synthetic) ) {
                    alt46=1;
                }
                switch (alt46) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:267:36: afterMethodInfo
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition1580);
                        afterMethodInfo194=afterMethodInfo();

                        state._fsp--;

                        adaptor.addChild(root_2, afterMethodInfo194.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:275:1: methodDefinition : ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMWalker.methodDefinition_return methodDefinition() throws RecognitionException {
        JVMWalker.methodDefinition_return retval = new JVMWalker.methodDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree METHODDECL195=null;
        CommonTree VMODIFIER196=null;
        CommonTree MODIFIER198=null;
        CommonTree GENERICDESC200=null;
        CommonTree RETVALUE202=null;
        CommonTree UNITNAME204=null;
        CommonTree THROWCLAUSE207=null;
        CommonTree UNITHEADER209=null;
        CommonTree UNITBODY211=null;
        CommonTree UNITATTR213=null;
        JVMWalker.method_visual_modifier_return method_visual_modifier197 =null;

        JVMWalker.method_modifier_return method_modifier199 =null;

        JVMWalker.genericDescriptor_return genericDescriptor201 =null;

        JVMWalker.type_return type203 =null;

        JVMWalker.keywordAggregate_return keywordAggregate205 =null;

        JVMWalker.arguments_return arguments206 =null;

        JVMWalker.throwClauseMethod_return throwClauseMethod208 =null;

        JVMWalker.methodInfo_return methodInfo210 =null;

        JVMWalker.body_return body212 =null;

        JVMWalker.afterMethodInfo_return afterMethodInfo214 =null;


        CommonTree METHODDECL195_tree=null;
        CommonTree VMODIFIER196_tree=null;
        CommonTree MODIFIER198_tree=null;
        CommonTree GENERICDESC200_tree=null;
        CommonTree RETVALUE202_tree=null;
        CommonTree UNITNAME204_tree=null;
        CommonTree THROWCLAUSE207_tree=null;
        CommonTree UNITHEADER209_tree=null;
        CommonTree UNITBODY211_tree=null;
        CommonTree UNITATTR213_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:3: ( ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:5: ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            METHODDECL195=(CommonTree)match(input,METHODDECL,FOLLOW_METHODDECL_in_methodDefinition1626); 
            METHODDECL195_tree = (CommonTree)adaptor.dupNode(METHODDECL195);


            root_1 = (CommonTree)adaptor.becomeRoot(METHODDECL195_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER196=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_methodDefinition1629); 
            VMODIFIER196_tree = (CommonTree)adaptor.dupNode(VMODIFIER196);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER196_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:30: ( method_visual_modifier )?
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0 >= PRIVATE && LA47_0 <= PUBLIC)) ) {
                    alt47=1;
                }
                switch (alt47) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:30: method_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_method_visual_modifier_in_methodDefinition1631);
                        method_visual_modifier197=method_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, method_visual_modifier197.getTree());


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
            MODIFIER198=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_methodDefinition1636); 
            MODIFIER198_tree = (CommonTree)adaptor.dupNode(MODIFIER198);


            root_2 = (CommonTree)adaptor.becomeRoot(MODIFIER198_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:66: ( method_modifier )*
                loop48:
                do {
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==ABSTRACT||LA48_0==FINAL||LA48_0==NATIVE||LA48_0==STATIC||LA48_0==STRICTFP||LA48_0==SYNCHRONIZED) ) {
                        alt48=1;
                    }


                    switch (alt48) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:66: method_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_method_modifier_in_methodDefinition1638);
                	    method_modifier199=method_modifier();

                	    state._fsp--;

                	    adaptor.addChild(root_2, method_modifier199.getTree());


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
            GENERICDESC200=(CommonTree)match(input,GENERICDESC,FOLLOW_GENERICDESC_in_methodDefinition1643); 
            GENERICDESC200_tree = (CommonTree)adaptor.dupNode(GENERICDESC200);


            root_2 = (CommonTree)adaptor.becomeRoot(GENERICDESC200_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:98: ( genericDescriptor )?
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==EXTENDS) ) {
                    alt49=1;
                }
                switch (alt49) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:98: genericDescriptor
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_genericDescriptor_in_methodDefinition1645);
                        genericDescriptor201=genericDescriptor();

                        state._fsp--;

                        adaptor.addChild(root_2, genericDescriptor201.getTree());


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
            RETVALUE202=(CommonTree)match(input,RETVALUE,FOLLOW_RETVALUE_in_methodDefinition1650); 
            RETVALUE202_tree = (CommonTree)adaptor.dupNode(RETVALUE202);


            root_2 = (CommonTree)adaptor.becomeRoot(RETVALUE202_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_methodDefinition1652);
            type203=type();

            state._fsp--;

            adaptor.addChild(root_2, type203.getTree());


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
            UNITNAME204=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_methodDefinition1656); 
            UNITNAME204_tree = (CommonTree)adaptor.dupNode(UNITNAME204);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME204_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_keywordAggregate_in_methodDefinition1658);
            keywordAggregate205=keywordAggregate();

            state._fsp--;

            adaptor.addChild(root_2, keywordAggregate205.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arguments_in_methodDefinition1661);
            arguments206=arguments();

            state._fsp--;

            adaptor.addChild(root_1, arguments206.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWCLAUSE207=(CommonTree)match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_methodDefinition1664); 
            THROWCLAUSE207_tree = (CommonTree)adaptor.dupNode(THROWCLAUSE207);


            root_2 = (CommonTree)adaptor.becomeRoot(THROWCLAUSE207_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:188: ( throwClauseMethod )?
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==THROWS) ) {
                    alt50=1;
                }
                switch (alt50) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:276:188: throwClauseMethod
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_throwClauseMethod_in_methodDefinition1666);
                        throwClauseMethod208=throwClauseMethod();

                        state._fsp--;

                        adaptor.addChild(root_2, throwClauseMethod208.getTree());


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
            UNITHEADER209=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_methodDefinition1695); 
            UNITHEADER209_tree = (CommonTree)adaptor.dupNode(UNITHEADER209);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER209_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_methodDefinition1697);
            methodInfo210=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo210.getTree());


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
            UNITBODY211=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_methodDefinition1725); 
            UNITBODY211_tree = (CommonTree)adaptor.dupNode(UNITBODY211);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY211_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:278:36: ( body )?
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Code||LA51_0==Synthetic) ) {
                    alt51=1;
                }
                switch (alt51) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:278:36: body
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_body_in_methodDefinition1727);
                        body212=body();

                        state._fsp--;

                        adaptor.addChild(root_2, body212.getTree());


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
            UNITATTR213=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_methodDefinition1756); 
            UNITATTR213_tree = (CommonTree)adaptor.dupNode(UNITATTR213);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR213_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:279:36: ( afterMethodInfo )?
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==AnnotationDefault||LA52_0==Deprecated||LA52_0==Exceptions||(LA52_0 >= RuntimeInvisibleAnnotations && LA52_0 <= RuntimeVisibleParameterAnnotations)||LA52_0==Signature||LA52_0==Synthetic) ) {
                    alt52=1;
                }
                switch (alt52) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:279:36: afterMethodInfo
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition1758);
                        afterMethodInfo214=afterMethodInfo();

                        state._fsp--;

                        adaptor.addChild(root_2, afterMethodInfo214.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:283:1: methodInfo : ^( STANDINTOKEN methodSignatureInfo flags ) ;
    public final JVMWalker.methodInfo_return methodInfo() throws RecognitionException {
        JVMWalker.methodInfo_return retval = new JVMWalker.methodInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STANDINTOKEN215=null;
        JVMWalker.methodSignatureInfo_return methodSignatureInfo216 =null;

        JVMWalker.flags_return flags217 =null;


        CommonTree STANDINTOKEN215_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:284:3: ( ^( STANDINTOKEN methodSignatureInfo flags ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:284:5: ^( STANDINTOKEN methodSignatureInfo flags )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STANDINTOKEN215=(CommonTree)match(input,STANDINTOKEN,FOLLOW_STANDINTOKEN_in_methodInfo1800); 
            STANDINTOKEN215_tree = (CommonTree)adaptor.dupNode(STANDINTOKEN215);


            root_1 = (CommonTree)adaptor.becomeRoot(STANDINTOKEN215_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo1802);
            methodSignatureInfo216=methodSignatureInfo();

            state._fsp--;

            adaptor.addChild(root_1, methodSignatureInfo216.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flags_in_methodInfo1804);
            flags217=flags();

            state._fsp--;

            adaptor.addChild(root_1, flags217.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:287:1: afterMethodInfo : ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ ;
    public final JVMWalker.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        JVMWalker.afterMethodInfo_return retval = new JVMWalker.afterMethodInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Deprecated218=null;
        CommonTree BOOLEANLITERAL219=null;
        CommonTree Signature220=null;
        CommonTree CPINDEX221=null;
        CommonTree Exceptions226=null;
        CommonTree Synthetic228=null;
        CommonTree BOOLEANLITERAL229=null;
        JVMWalker.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations222 =null;

        JVMWalker.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info223 =null;

        JVMWalker.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations224 =null;

        JVMWalker.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations225 =null;

        JVMWalker.throwClause_return throwClause227 =null;

        JVMWalker.annotationDefault_return annotationDefault230 =null;


        CommonTree Deprecated218_tree=null;
        CommonTree BOOLEANLITERAL219_tree=null;
        CommonTree Signature220_tree=null;
        CommonTree CPINDEX221_tree=null;
        CommonTree Exceptions226_tree=null;
        CommonTree Synthetic228_tree=null;
        CommonTree BOOLEANLITERAL229_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:288:3: ( ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:288:5: ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:288:5: ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:288:6: ^( Deprecated BOOLEANLITERAL )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Deprecated218=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfo1820); 
            	    Deprecated218_tree = (CommonTree)adaptor.dupNode(Deprecated218);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Deprecated218_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    BOOLEANLITERAL219=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1823); 
            	    BOOLEANLITERAL219_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL219);


            	    adaptor.addChild(root_1, BOOLEANLITERAL219_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:289:5: ^( Signature CPINDEX )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Signature220=(CommonTree)match(input,Signature,FOLLOW_Signature_in_afterMethodInfo1831); 
            	    Signature220_tree = (CommonTree)adaptor.dupNode(Signature220);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Signature220_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    CPINDEX221=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfo1833); 
            	    CPINDEX221_tree = (CommonTree)adaptor.dupNode(CPINDEX221);


            	    adaptor.addChild(root_1, CPINDEX221_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:290:5: runtimeInvisibleParameterAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo1840);
            	    runtimeInvisibleParameterAnnotations222=runtimeInvisibleParameterAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeInvisibleParameterAnnotations222.getTree());


            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:291:5: runtimeVisibleAnnotations_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1846);
            	    runtimeVisibleAnnotations_info223=runtimeVisibleAnnotations_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleAnnotations_info223.getTree());


            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:292:5: runtimeInvisibleAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo1852);
            	    runtimeInvisibleAnnotations224=runtimeInvisibleAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeInvisibleAnnotations224.getTree());


            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:293:5: runtimeVisibleParameterAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo1858);
            	    runtimeVisibleParameterAnnotations225=runtimeVisibleParameterAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleParameterAnnotations225.getTree());


            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:294:5: ^( Exceptions throwClause )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Exceptions226=(CommonTree)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfo1865); 
            	    Exceptions226_tree = (CommonTree)adaptor.dupNode(Exceptions226);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Exceptions226_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_throwClause_in_afterMethodInfo1868);
            	    throwClause227=throwClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, throwClause227.getTree());


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:295:5: ^( Synthetic BOOLEANLITERAL )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Synthetic228=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfo1876); 
            	    Synthetic228_tree = (CommonTree)adaptor.dupNode(Synthetic228);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Synthetic228_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    BOOLEANLITERAL229=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1878); 
            	    BOOLEANLITERAL229_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL229);


            	    adaptor.addChild(root_1, BOOLEANLITERAL229_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:296:5: annotationDefault
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_annotationDefault_in_afterMethodInfo1885);
            	    annotationDefault230=annotationDefault();

            	    state._fsp--;

            	    adaptor.addChild(root_0, annotationDefault230.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:299:1: annotationDefault : ^( AnnotationDefault DefaultValue annotationValue ) ;
    public final JVMWalker.annotationDefault_return annotationDefault() throws RecognitionException {
        JVMWalker.annotationDefault_return retval = new JVMWalker.annotationDefault_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationDefault231=null;
        CommonTree DefaultValue232=null;
        JVMWalker.annotationValue_return annotationValue233 =null;


        CommonTree AnnotationDefault231_tree=null;
        CommonTree DefaultValue232_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:300:3: ( ^( AnnotationDefault DefaultValue annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:300:5: ^( AnnotationDefault DefaultValue annotationValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AnnotationDefault231=(CommonTree)match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault1901); 
            AnnotationDefault231_tree = (CommonTree)adaptor.dupNode(AnnotationDefault231);


            root_1 = (CommonTree)adaptor.becomeRoot(AnnotationDefault231_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            DefaultValue232=(CommonTree)match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault1904); 
            DefaultValue232_tree = (CommonTree)adaptor.dupNode(DefaultValue232);


            adaptor.addChild(root_1, DefaultValue232_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationValue_in_annotationDefault1906);
            annotationValue233=annotationValue();

            state._fsp--;

            adaptor.addChild(root_1, annotationValue233.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:303:1: methodSignatureInfo : ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) ;
    public final JVMWalker.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        JVMWalker.methodSignatureInfo_return retval = new JVMWalker.methodSignatureInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature234=null;
        CommonTree PARAMDESC235=null;
        CommonTree RETDESC237=null;
        JVMWalker.bytecodeType_return bytecodeType236 =null;

        JVMWalker.returnDescriptor_return returnDescriptor238 =null;


        CommonTree Signature234_tree=null;
        CommonTree PARAMDESC235_tree=null;
        CommonTree RETDESC237_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:304:3: ( ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:304:5: ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature234=(CommonTree)match(input,Signature,FOLLOW_Signature_in_methodSignatureInfo1923); 
            Signature234_tree = (CommonTree)adaptor.dupNode(Signature234);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature234_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PARAMDESC235=(CommonTree)match(input,PARAMDESC,FOLLOW_PARAMDESC_in_methodSignatureInfo1926); 
            PARAMDESC235_tree = (CommonTree)adaptor.dupNode(PARAMDESC235);


            root_2 = (CommonTree)adaptor.becomeRoot(PARAMDESC235_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:304:29: ( bytecodeType )*
                loop54:
                do {
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==BaseType||LA54_0==IDENTIFIER||LA54_0==INTERNALTYPE||LA54_0==LBRACK) ) {
                        alt54=1;
                    }


                    switch (alt54) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:304:29: bytecodeType
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo1928);
                	    bytecodeType236=bytecodeType();

                	    state._fsp--;

                	    adaptor.addChild(root_2, bytecodeType236.getTree());


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
            RETDESC237=(CommonTree)match(input,RETDESC,FOLLOW_RETDESC_in_methodSignatureInfo1933); 
            RETDESC237_tree = (CommonTree)adaptor.dupNode(RETDESC237);


            root_2 = (CommonTree)adaptor.becomeRoot(RETDESC237_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo1935);
            returnDescriptor238=returnDescriptor();

            state._fsp--;

            adaptor.addChild(root_2, returnDescriptor238.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:307:1: returnDescriptor : ( bytecodeType | VoidType );
    public final JVMWalker.returnDescriptor_return returnDescriptor() throws RecognitionException {
        JVMWalker.returnDescriptor_return retval = new JVMWalker.returnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VoidType240=null;
        JVMWalker.bytecodeType_return bytecodeType239 =null;


        CommonTree VoidType240_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:308:3: ( bytecodeType | VoidType )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:308:5: bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor1950);
                    bytecodeType239=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType239.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:308:20: VoidType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VoidType240=(CommonTree)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor1954); 
                    VoidType240_tree = (CommonTree)adaptor.dupNode(VoidType240);


                    adaptor.addChild(root_0, VoidType240_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:311:1: method_modifier : ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP );
    public final JVMWalker.method_modifier_return method_modifier() throws RecognitionException {
        JVMWalker.method_modifier_return retval = new JVMWalker.method_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set241=null;

        CommonTree set241_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:312:3: ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set241=(CommonTree)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL||input.LA(1)==NATIVE||input.LA(1)==STATIC||input.LA(1)==STRICTFP||input.LA(1)==SYNCHRONIZED ) {
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
    // $ANTLR end "method_modifier"


    public static class method_visual_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:315:1: method_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMWalker.method_visual_modifier_return method_visual_modifier() throws RecognitionException {
        JVMWalker.method_visual_modifier_return retval = new JVMWalker.method_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set242=null;

        CommonTree set242_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:316:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set242=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
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
    // $ANTLR end "method_visual_modifier"


    public static class arguments_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:319:1: arguments : ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) ;
    public final JVMWalker.arguments_return arguments() throws RecognitionException {
        JVMWalker.arguments_return retval = new JVMWalker.arguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITARGUMENTS243=null;
        CommonTree DOT245=null;
        CommonTree DOT246=null;
        CommonTree DOT247=null;
        JVMWalker.typeList_return typeList244 =null;


        CommonTree UNITARGUMENTS243_tree=null;
        CommonTree DOT245_tree=null;
        CommonTree DOT246_tree=null;
        CommonTree DOT247_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:320:3: ( ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:320:5: ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITARGUMENTS243=(CommonTree)match(input,UNITARGUMENTS,FOLLOW_UNITARGUMENTS_in_arguments2026); 
            UNITARGUMENTS243_tree = (CommonTree)adaptor.dupNode(UNITARGUMENTS243);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITARGUMENTS243_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:320:21: ( typeList )?
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==BOOLEAN||LA56_0==BYTE||LA56_0==CHAR||LA56_0==DOUBLE||LA56_0==FLOAT||LA56_0==INT||LA56_0==LONG||LA56_0==SHORT||LA56_0==UNITNAME||LA56_0==VOID) ) {
                    alt56=1;
                }
                switch (alt56) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:320:21: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_arguments2028);
                        typeList244=typeList();

                        state._fsp--;

                        adaptor.addChild(root_1, typeList244.getTree());


                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:320:31: ( DOT DOT DOT )?
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==DOT) ) {
                    alt57=1;
                }
                switch (alt57) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:320:32: DOT DOT DOT
                        {
                        _last = (CommonTree)input.LT(1);
                        DOT245=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2032); 
                        DOT245_tree = (CommonTree)adaptor.dupNode(DOT245);


                        adaptor.addChild(root_1, DOT245_tree);


                        _last = (CommonTree)input.LT(1);
                        DOT246=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2034); 
                        DOT246_tree = (CommonTree)adaptor.dupNode(DOT246);


                        adaptor.addChild(root_1, DOT246_tree);


                        _last = (CommonTree)input.LT(1);
                        DOT247=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2036); 
                        DOT247_tree = (CommonTree)adaptor.dupNode(DOT247);


                        adaptor.addChild(root_1, DOT247_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:327:1: body : ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* ;
    public final JVMWalker.body_return body() throws RecognitionException {
        JVMWalker.body_return retval = new JVMWalker.body_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Synthetic248=null;
        CommonTree BOOLEANLITERAL249=null;
        CommonTree Code250=null;
        JVMWalker.codeBlock_return codeBlock251 =null;

        JVMWalker.bodyExtension_return bodyExtension252 =null;


        CommonTree Synthetic248_tree=null;
        CommonTree BOOLEANLITERAL249_tree=null;
        CommonTree Code250_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:328:3: ( ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:328:5: ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:328:5: ( Synthetic BOOLEANLITERAL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Synthetic) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:328:6: Synthetic BOOLEANLITERAL
                    {
                    _last = (CommonTree)input.LT(1);
                    Synthetic248=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_body2061); 
                    Synthetic248_tree = (CommonTree)adaptor.dupNode(Synthetic248);


                    adaptor.addChild(root_0, Synthetic248_tree);


                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL249=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_body2063); 
                    BOOLEANLITERAL249_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL249);


                    adaptor.addChild(root_0, BOOLEANLITERAL249_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Code250=(CommonTree)match(input,Code,FOLLOW_Code_in_body2068); 
            Code250_tree = (CommonTree)adaptor.dupNode(Code250);


            root_1 = (CommonTree)adaptor.becomeRoot(Code250_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_body2070);
            codeBlock251=codeBlock();

            state._fsp--;

            adaptor.addChild(root_1, codeBlock251.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:328:51: ( bodyExtension )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==ExceptionTable||(LA59_0 >= LineNumberTable && LA59_0 <= LocalVariableTypeTable)||(LA59_0 >= StackMap && LA59_0 <= StackMapTable)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:328:51: bodyExtension
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bodyExtension_in_body2073);
            	    bodyExtension252=bodyExtension();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bodyExtension252.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:331:1: bodyExtension : ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) ) ;
    public final JVMWalker.bodyExtension_return bodyExtension() throws RecognitionException {
        JVMWalker.bodyExtension_return retval = new JVMWalker.bodyExtension_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ExceptionTable253=null;
        CommonTree LineNumberTable255=null;
        CommonTree LocalVariableTable257=null;
        CommonTree LocalVariableTypeTable259=null;
        CommonTree StackMapTable261=null;
        CommonTree StackMap263=null;
        JVMWalker.exceptionTable_return exceptionTable254 =null;

        JVMWalker.lineNumberTable_return lineNumberTable256 =null;

        JVMWalker.localVariableTable_return localVariableTable258 =null;

        JVMWalker.localVariableTable_return localVariableTable260 =null;

        JVMWalker.stackMapTable_return stackMapTable262 =null;

        JVMWalker.stackMapTypeTable_return stackMapTypeTable264 =null;


        CommonTree ExceptionTable253_tree=null;
        CommonTree LineNumberTable255_tree=null;
        CommonTree LocalVariableTable257_tree=null;
        CommonTree LocalVariableTypeTable259_tree=null;
        CommonTree StackMapTable261_tree=null;
        CommonTree StackMap263_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:332:3: ( ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:333:3: ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:333:3: ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:333:5: ^( ExceptionTable exceptionTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ExceptionTable253=(CommonTree)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension2094); 
                    ExceptionTable253_tree = (CommonTree)adaptor.dupNode(ExceptionTable253);


                    root_1 = (CommonTree)adaptor.becomeRoot(ExceptionTable253_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension2097);
                    exceptionTable254=exceptionTable();

                    state._fsp--;

                    adaptor.addChild(root_1, exceptionTable254.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:334:5: ^( LineNumberTable ( lineNumberTable )? )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LineNumberTable255=(CommonTree)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension2105); 
                    LineNumberTable255_tree = (CommonTree)adaptor.dupNode(LineNumberTable255);


                    root_1 = (CommonTree)adaptor.becomeRoot(LineNumberTable255_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:334:24: ( lineNumberTable )?
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==IDENTIFIER) ) {
                            alt60=1;
                        }
                        switch (alt60) {
                            case 1 :
                                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:334:24: lineNumberTable
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_lineNumberTable_in_bodyExtension2108);
                                lineNumberTable256=lineNumberTable();

                                state._fsp--;

                                adaptor.addChild(root_1, lineNumberTable256.getTree());


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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:335:5: ^( LocalVariableTable localVariableTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LocalVariableTable257=(CommonTree)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension2117); 
                    LocalVariableTable257_tree = (CommonTree)adaptor.dupNode(LocalVariableTable257);


                    root_1 = (CommonTree)adaptor.becomeRoot(LocalVariableTable257_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension2120);
                    localVariableTable258=localVariableTable();

                    state._fsp--;

                    adaptor.addChild(root_1, localVariableTable258.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:336:5: ^( LocalVariableTypeTable localVariableTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LocalVariableTypeTable259=(CommonTree)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension2128); 
                    LocalVariableTypeTable259_tree = (CommonTree)adaptor.dupNode(LocalVariableTypeTable259);


                    root_1 = (CommonTree)adaptor.becomeRoot(LocalVariableTypeTable259_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension2131);
                    localVariableTable260=localVariableTable();

                    state._fsp--;

                    adaptor.addChild(root_1, localVariableTable260.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:337:5: ^( StackMapTable stackMapTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    StackMapTable261=(CommonTree)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension2139); 
                    StackMapTable261_tree = (CommonTree)adaptor.dupNode(StackMapTable261);


                    root_1 = (CommonTree)adaptor.becomeRoot(StackMapTable261_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension2141);
                    stackMapTable262=stackMapTable();

                    state._fsp--;

                    adaptor.addChild(root_1, stackMapTable262.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:338:5: ^( StackMap stackMapTypeTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    StackMap263=(CommonTree)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension2149); 
                    StackMap263_tree = (CommonTree)adaptor.dupNode(StackMap263);


                    root_1 = (CommonTree)adaptor.becomeRoot(StackMap263_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension2151);
                    stackMapTypeTable264=stackMapTypeTable();

                    state._fsp--;

                    adaptor.addChild(root_1, stackMapTypeTable264.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:342:1: codeBlock : ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) ;
    public final JVMWalker.codeBlock_return codeBlock() throws RecognitionException {
        JVMWalker.codeBlock_return retval = new JVMWalker.codeBlock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VARINFO265=null;
        CommonTree INSTRUCTION267=null;
        JVMWalker.variables_return variables266 =null;

        JVMWalker.instructionSet_return instructionSet268 =null;

        JVMWalker.codeBlockEnd_return codeBlockEnd269 =null;


        CommonTree VARINFO265_tree=null;
        CommonTree INSTRUCTION267_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:343:3: ( ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:343:5: ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VARINFO265=(CommonTree)match(input,VARINFO,FOLLOW_VARINFO_in_codeBlock2170); 
            VARINFO265_tree = (CommonTree)adaptor.dupNode(VARINFO265);


            root_1 = (CommonTree)adaptor.becomeRoot(VARINFO265_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variables_in_codeBlock2172);
            variables266=variables();

            state._fsp--;

            adaptor.addChild(root_1, variables266.getTree());


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
            INSTRUCTION267=(CommonTree)match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_codeBlock2176); 
            INSTRUCTION267_tree = (CommonTree)adaptor.dupNode(INSTRUCTION267);


            root_1 = (CommonTree)adaptor.becomeRoot(INSTRUCTION267_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:343:40: ( instructionSet )*
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:343:40: instructionSet
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_instructionSet_in_codeBlock2178);
            	    instructionSet268=instructionSet();

            	    state._fsp--;

            	    adaptor.addChild(root_1, instructionSet268.getTree());


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock2181);
            codeBlockEnd269=codeBlockEnd();

            state._fsp--;

            adaptor.addChild(root_1, codeBlockEnd269.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:346:1: instructionSet : ( codeLine | javaSwitch );
    public final JVMWalker.instructionSet_return instructionSet() throws RecognitionException {
        JVMWalker.instructionSet_return retval = new JVMWalker.instructionSet_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.codeLine_return codeLine270 =null;

        JVMWalker.javaSwitch_return javaSwitch271 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:347:3: ( codeLine | javaSwitch )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:347:5: codeLine
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_codeLine_in_instructionSet2195);
                    codeLine270=codeLine();

                    state._fsp--;

                    adaptor.addChild(root_0, codeLine270.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:347:16: javaSwitch
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_javaSwitch_in_instructionSet2199);
                    javaSwitch271=javaSwitch();

                    state._fsp--;

                    adaptor.addChild(root_0, javaSwitch271.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:350:1: codeLine : ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) ;
    public final JVMWalker.codeLine_return codeLine() throws RecognitionException {
        JVMWalker.codeLine_return retval = new JVMWalker.codeLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER272=null;
        CommonTree OPERAND274=null;
        CommonTree OPERAND276=null;
        CommonTree INTLITERAL277=null;
        JVMWalker.pc_return pc273 =null;

        JVMWalker.operand1_return operand1275 =null;


        CommonTree IDENTIFIER272_tree=null;
        CommonTree OPERAND274_tree=null;
        CommonTree OPERAND276_tree=null;
        CommonTree INTLITERAL277_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:351:3: ( ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:351:5: ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER272=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine2213); 
            IDENTIFIER272_tree = (CommonTree)adaptor.dupNode(IDENTIFIER272);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER272_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_codeLine2215);
            pc273=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc273.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OPERAND274=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_codeLine2218); 
            OPERAND274_tree = (CommonTree)adaptor.dupNode(OPERAND274);


            root_2 = (CommonTree)adaptor.becomeRoot(OPERAND274_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:351:31: ( operand1 )?
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==BOOLEAN||LA64_0==BYTE||LA64_0==CHAR||LA64_0==CPINDEX||LA64_0==DOUBLE||LA64_0==FLOAT||LA64_0==INT||LA64_0==INTLITERAL||LA64_0==LONG||LA64_0==SHORT||LA64_0==VOID) ) {
                    alt64=1;
                }
                switch (alt64) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:351:31: operand1
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_operand1_in_codeLine2220);
                        operand1275=operand1();

                        state._fsp--;

                        adaptor.addChild(root_2, operand1275.getTree());


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
            OPERAND276=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_codeLine2225); 
            OPERAND276_tree = (CommonTree)adaptor.dupNode(OPERAND276);


            root_2 = (CommonTree)adaptor.becomeRoot(OPERAND276_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:351:52: ( INTLITERAL )?
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==INTLITERAL) ) {
                    alt65=1;
                }
                switch (alt65) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:351:52: INTLITERAL
                        {
                        _last = (CommonTree)input.LT(1);
                        INTLITERAL277=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeLine2227); 
                        INTLITERAL277_tree = (CommonTree)adaptor.dupNode(INTLITERAL277);


                        adaptor.addChild(root_2, INTLITERAL277_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:354:1: codeBlockEnd : ^( IDENTIFIER pc ( INTLITERAL )? ) ;
    public final JVMWalker.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        JVMWalker.codeBlockEnd_return retval = new JVMWalker.codeBlockEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER278=null;
        CommonTree INTLITERAL280=null;
        JVMWalker.pc_return pc279 =null;


        CommonTree IDENTIFIER278_tree=null;
        CommonTree INTLITERAL280_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:355:3: ( ^( IDENTIFIER pc ( INTLITERAL )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:355:5: ^( IDENTIFIER pc ( INTLITERAL )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER278=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd2244); 
            IDENTIFIER278_tree = (CommonTree)adaptor.dupNode(IDENTIFIER278);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER278_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_codeBlockEnd2246);
            pc279=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc279.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:355:21: ( INTLITERAL )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==INTLITERAL) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:355:21: INTLITERAL
                    {
                    _last = (CommonTree)input.LT(1);
                    INTLITERAL280=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeBlockEnd2248); 
                    INTLITERAL280_tree = (CommonTree)adaptor.dupNode(INTLITERAL280);


                    adaptor.addChild(root_1, INTLITERAL280_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:358:1: operand1 : ( CPINDEX | INTLITERAL | primitiveType );
    public final JVMWalker.operand1_return operand1() throws RecognitionException {
        JVMWalker.operand1_return retval = new JVMWalker.operand1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX281=null;
        CommonTree INTLITERAL282=null;
        JVMWalker.primitiveType_return primitiveType283 =null;


        CommonTree CPINDEX281_tree=null;
        CommonTree INTLITERAL282_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:359:3: ( CPINDEX | INTLITERAL | primitiveType )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:359:5: CPINDEX
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CPINDEX281=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_operand12265); 
                    CPINDEX281_tree = (CommonTree)adaptor.dupNode(CPINDEX281);


                    adaptor.addChild(root_0, CPINDEX281_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:360:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL282=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_operand12272); 
                    INTLITERAL282_tree = (CommonTree)adaptor.dupNode(INTLITERAL282);


                    adaptor.addChild(root_0, INTLITERAL282_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:361:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_operand12278);
                    primitiveType283=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType283.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:364:1: variables : variable variable variable ;
    public final JVMWalker.variables_return variables() throws RecognitionException {
        JVMWalker.variables_return retval = new JVMWalker.variables_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.variable_return variable284 =null;

        JVMWalker.variable_return variable285 =null;

        JVMWalker.variable_return variable286 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:365:3: ( variable variable variable )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:365:5: variable variable variable
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2291);
            variable284=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable284.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2293);
            variable285=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable285.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2295);
            variable286=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable286.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:368:1: variable : ^( ASSIGN IDENTIFIER INTLITERAL ) ;
    public final JVMWalker.variable_return variable() throws RecognitionException {
        JVMWalker.variable_return retval = new JVMWalker.variable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN287=null;
        CommonTree IDENTIFIER288=null;
        CommonTree INTLITERAL289=null;

        CommonTree ASSIGN287_tree=null;
        CommonTree IDENTIFIER288_tree=null;
        CommonTree INTLITERAL289_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:369:3: ( ^( ASSIGN IDENTIFIER INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:369:5: ^( ASSIGN IDENTIFIER INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN287=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable2309); 
            ASSIGN287_tree = (CommonTree)adaptor.dupNode(ASSIGN287);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN287_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER288=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable2311); 
            IDENTIFIER288_tree = (CommonTree)adaptor.dupNode(IDENTIFIER288);


            adaptor.addChild(root_1, IDENTIFIER288_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL289=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable2313); 
            INTLITERAL289_tree = (CommonTree)adaptor.dupNode(INTLITERAL289);


            adaptor.addChild(root_1, INTLITERAL289_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:372:1: javaSwitch : ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) ;
    public final JVMWalker.javaSwitch_return javaSwitch() throws RecognitionException {
        JVMWalker.javaSwitch_return retval = new JVMWalker.javaSwitch_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SWITCH290=null;
        CommonTree IDENTIFIER291=null;
        JVMWalker.pc_return pc292 =null;

        JVMWalker.switchLine_return switchLine293 =null;

        JVMWalker.switchDefaultLine_return switchDefaultLine294 =null;


        CommonTree SWITCH290_tree=null;
        CommonTree IDENTIFIER291_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:373:3: ( ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:373:5: ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SWITCH290=(CommonTree)match(input,SWITCH,FOLLOW_SWITCH_in_javaSwitch2330); 
            SWITCH290_tree = (CommonTree)adaptor.dupNode(SWITCH290);


            root_1 = (CommonTree)adaptor.becomeRoot(SWITCH290_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER291=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch2333); 
            IDENTIFIER291_tree = (CommonTree)adaptor.dupNode(IDENTIFIER291);


            root_2 = (CommonTree)adaptor.becomeRoot(IDENTIFIER291_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_javaSwitch2335);
            pc292=pc();

            state._fsp--;

            adaptor.addChild(root_2, pc292.getTree());


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:373:30: ( switchLine )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==INTLITERAL) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:373:30: switchLine
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch2337);
            	    switchLine293=switchLine();

            	    state._fsp--;

            	    adaptor.addChild(root_2, switchLine293.getTree());


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch2340);
            switchDefaultLine294=switchDefaultLine();

            state._fsp--;

            adaptor.addChild(root_2, switchDefaultLine294.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:376:1: switchLine : pc INTLITERAL ;
    public final JVMWalker.switchLine_return switchLine() throws RecognitionException {
        JVMWalker.switchLine_return retval = new JVMWalker.switchLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL296=null;
        JVMWalker.pc_return pc295 =null;


        CommonTree INTLITERAL296_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:377:3: ( pc INTLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:377:5: pc INTLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_switchLine2357);
            pc295=pc();

            state._fsp--;

            adaptor.addChild(root_0, pc295.getTree());


            _last = (CommonTree)input.LT(1);
            INTLITERAL296=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine2359); 
            INTLITERAL296_tree = (CommonTree)adaptor.dupNode(INTLITERAL296);


            adaptor.addChild(root_0, INTLITERAL296_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:380:1: switchDefaultLine : ^( DEFAULT INTLITERAL ) ;
    public final JVMWalker.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        JVMWalker.switchDefaultLine_return retval = new JVMWalker.switchDefaultLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT297=null;
        CommonTree INTLITERAL298=null;

        CommonTree DEFAULT297_tree=null;
        CommonTree INTLITERAL298_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:381:3: ( ^( DEFAULT INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:381:5: ^( DEFAULT INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DEFAULT297=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine2374); 
            DEFAULT297_tree = (CommonTree)adaptor.dupNode(DEFAULT297);


            root_1 = (CommonTree)adaptor.becomeRoot(DEFAULT297_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INTLITERAL298=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine2376); 
            INTLITERAL298_tree = (CommonTree)adaptor.dupNode(INTLITERAL298);


            adaptor.addChild(root_1, INTLITERAL298_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:388:1: throwClause : ^( THROWS typeList ) ;
    public final JVMWalker.throwClause_return throwClause() throws RecognitionException {
        JVMWalker.throwClause_return retval = new JVMWalker.throwClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROWS299=null;
        JVMWalker.typeList_return typeList300 =null;


        CommonTree THROWS299_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:389:3: ( ^( THROWS typeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:389:5: ^( THROWS typeList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWS299=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClause2396); 
            THROWS299_tree = (CommonTree)adaptor.dupNode(THROWS299);


            root_1 = (CommonTree)adaptor.becomeRoot(THROWS299_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeList_in_throwClause2398);
            typeList300=typeList();

            state._fsp--;

            adaptor.addChild(root_1, typeList300.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:392:1: throwClauseMethod : ^( THROWS ( throwType )+ ) ;
    public final JVMWalker.throwClauseMethod_return throwClauseMethod() throws RecognitionException {
        JVMWalker.throwClauseMethod_return retval = new JVMWalker.throwClauseMethod_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROWS301=null;
        JVMWalker.throwType_return throwType302 =null;


        CommonTree THROWS301_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:393:3: ( ^( THROWS ( throwType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:393:5: ^( THROWS ( throwType )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWS301=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClauseMethod2415); 
            THROWS301_tree = (CommonTree)adaptor.dupNode(THROWS301);


            root_1 = (CommonTree)adaptor.becomeRoot(THROWS301_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:393:14: ( throwType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:393:14: throwType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_throwType_in_throwClauseMethod2417);
            	    throwType302=throwType();

            	    state._fsp--;

            	    adaptor.addChild(root_1, throwType302.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:396:1: throwType : ( INTERNALTYPE | IDENTIFIER | QualifiedType );
    public final JVMWalker.throwType_return throwType() throws RecognitionException {
        JVMWalker.throwType_return retval = new JVMWalker.throwType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set303=null;

        CommonTree set303_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:397:3: ( INTERNALTYPE | IDENTIFIER | QualifiedType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set303=(CommonTree)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE||input.LA(1)==QualifiedType ) {
                input.consume();
                set303_tree = (CommonTree)adaptor.dupNode(set303);


                adaptor.addChild(root_0, set303_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:400:1: exceptionTable : ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) ;
    public final JVMWalker.exceptionTable_return exceptionTable() throws RecognitionException {
        JVMWalker.exceptionTable_return retval = new JVMWalker.exceptionTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ETHEADER304=null;
        CommonTree IDENTIFIER305=null;
        CommonTree IDENTIFIER306=null;
        CommonTree IDENTIFIER307=null;
        CommonTree IDENTIFIER308=null;
        CommonTree ETENTRY309=null;
        JVMWalker.exceptionTableEntry_return exceptionTableEntry310 =null;


        CommonTree ETHEADER304_tree=null;
        CommonTree IDENTIFIER305_tree=null;
        CommonTree IDENTIFIER306_tree=null;
        CommonTree IDENTIFIER307_tree=null;
        CommonTree IDENTIFIER308_tree=null;
        CommonTree ETENTRY309_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:401:3: ( ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:401:5: ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ETHEADER304=(CommonTree)match(input,ETHEADER,FOLLOW_ETHEADER_in_exceptionTable2456); 
            ETHEADER304_tree = (CommonTree)adaptor.dupNode(ETHEADER304);


            root_1 = (CommonTree)adaptor.becomeRoot(ETHEADER304_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER305=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2458); 
            IDENTIFIER305_tree = (CommonTree)adaptor.dupNode(IDENTIFIER305);


            adaptor.addChild(root_1, IDENTIFIER305_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER306=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2460); 
            IDENTIFIER306_tree = (CommonTree)adaptor.dupNode(IDENTIFIER306);


            adaptor.addChild(root_1, IDENTIFIER306_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER307=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2462); 
            IDENTIFIER307_tree = (CommonTree)adaptor.dupNode(IDENTIFIER307);


            adaptor.addChild(root_1, IDENTIFIER307_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER308=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2464); 
            IDENTIFIER308_tree = (CommonTree)adaptor.dupNode(IDENTIFIER308);


            adaptor.addChild(root_1, IDENTIFIER308_tree);


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
            ETENTRY309=(CommonTree)match(input,ETENTRY,FOLLOW_ETENTRY_in_exceptionTable2468); 
            ETENTRY309_tree = (CommonTree)adaptor.dupNode(ETENTRY309);


            root_1 = (CommonTree)adaptor.becomeRoot(ETENTRY309_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:401:71: ( exceptionTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:401:71: exceptionTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable2470);
            	    exceptionTableEntry310=exceptionTableEntry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, exceptionTableEntry310.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:404:1: exceptionTableEntry : INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue ;
    public final JVMWalker.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        JVMWalker.exceptionTableEntry_return retval = new JVMWalker.exceptionTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL311=null;
        CommonTree INTLITERAL312=null;
        CommonTree INTLITERAL313=null;
        JVMWalker.exceptionTableEntryValue_return exceptionTableEntryValue314 =null;


        CommonTree INTLITERAL311_tree=null;
        CommonTree INTLITERAL312_tree=null;
        CommonTree INTLITERAL313_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:405:3: ( INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:405:5: INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL311=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2485); 
            INTLITERAL311_tree = (CommonTree)adaptor.dupNode(INTLITERAL311);


            adaptor.addChild(root_0, INTLITERAL311_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL312=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2487); 
            INTLITERAL312_tree = (CommonTree)adaptor.dupNode(INTLITERAL312);


            adaptor.addChild(root_0, INTLITERAL312_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL313=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2489); 
            INTLITERAL313_tree = (CommonTree)adaptor.dupNode(INTLITERAL313);


            adaptor.addChild(root_0, INTLITERAL313_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry2491);
            exceptionTableEntryValue314=exceptionTableEntryValue();

            state._fsp--;

            adaptor.addChild(root_0, exceptionTableEntryValue314.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:407:1: exceptionTableEntryValue : ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE );
    public final JVMWalker.exceptionTableEntryValue_return exceptionTableEntryValue() throws RecognitionException {
        JVMWalker.exceptionTableEntryValue_return retval = new JVMWalker.exceptionTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER316=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE317=null;
        JVMWalker.primitiveType_return primitiveType315 =null;


        CommonTree IDENTIFIER316_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE317_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:408:3: ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:408:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntryValue2503);
                    primitiveType315=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType315.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:409:5: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER316=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntryValue2509); 
                    IDENTIFIER316_tree = (CommonTree)adaptor.dupNode(IDENTIFIER316);


                    adaptor.addChild(root_0, IDENTIFIER316_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:410:5: CONSTANT_TYPE_ASSIGNABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CONSTANT_TYPE_ASSIGNABLE317=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue2515); 
                    CONSTANT_TYPE_ASSIGNABLE317_tree = (CommonTree)adaptor.dupNode(CONSTANT_TYPE_ASSIGNABLE317);


                    adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE317_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:417:1: lineNumberTable : ( lineNumberTableLine )+ ;
    public final JVMWalker.lineNumberTable_return lineNumberTable() throws RecognitionException {
        JVMWalker.lineNumberTable_return retval = new JVMWalker.lineNumberTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.lineNumberTableLine_return lineNumberTableLine318 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:418:3: ( ( lineNumberTableLine )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:418:5: ( lineNumberTableLine )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:418:5: ( lineNumberTableLine )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:418:5: lineNumberTableLine
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable2534);
            	    lineNumberTableLine318=lineNumberTableLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lineNumberTableLine318.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:421:1: lineNumberTableLine : ^( IDENTIFIER pc INTLITERAL ) ;
    public final JVMWalker.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        JVMWalker.lineNumberTableLine_return retval = new JVMWalker.lineNumberTableLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER319=null;
        CommonTree INTLITERAL321=null;
        JVMWalker.pc_return pc320 =null;


        CommonTree IDENTIFIER319_tree=null;
        CommonTree INTLITERAL321_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:422:3: ( ^( IDENTIFIER pc INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:422:5: ^( IDENTIFIER pc INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER319=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine2549); 
            IDENTIFIER319_tree = (CommonTree)adaptor.dupNode(IDENTIFIER319);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER319_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_lineNumberTableLine2551);
            pc320=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc320.getTree());


            _last = (CommonTree)input.LT(1);
            INTLITERAL321=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine2553); 
            INTLITERAL321_tree = (CommonTree)adaptor.dupNode(INTLITERAL321);


            adaptor.addChild(root_1, INTLITERAL321_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:429:1: localVariableTable : ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) ;
    public final JVMWalker.localVariableTable_return localVariableTable() throws RecognitionException {
        JVMWalker.localVariableTable_return retval = new JVMWalker.localVariableTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LVHEADER322=null;
        CommonTree IDENTIFIER323=null;
        CommonTree IDENTIFIER324=null;
        CommonTree IDENTIFIER325=null;
        CommonTree IDENTIFIER326=null;
        CommonTree IDENTIFIER327=null;
        CommonTree LVENTRY328=null;
        JVMWalker.localVariableTableLine_return localVariableTableLine329 =null;


        CommonTree LVHEADER322_tree=null;
        CommonTree IDENTIFIER323_tree=null;
        CommonTree IDENTIFIER324_tree=null;
        CommonTree IDENTIFIER325_tree=null;
        CommonTree IDENTIFIER326_tree=null;
        CommonTree IDENTIFIER327_tree=null;
        CommonTree LVENTRY328_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:430:3: ( ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:430:5: ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            LVHEADER322=(CommonTree)match(input,LVHEADER,FOLLOW_LVHEADER_in_localVariableTable2576); 
            LVHEADER322_tree = (CommonTree)adaptor.dupNode(LVHEADER322);


            root_1 = (CommonTree)adaptor.becomeRoot(LVHEADER322_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER323=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2578); 
            IDENTIFIER323_tree = (CommonTree)adaptor.dupNode(IDENTIFIER323);


            adaptor.addChild(root_1, IDENTIFIER323_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER324=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2580); 
            IDENTIFIER324_tree = (CommonTree)adaptor.dupNode(IDENTIFIER324);


            adaptor.addChild(root_1, IDENTIFIER324_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER325=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2582); 
            IDENTIFIER325_tree = (CommonTree)adaptor.dupNode(IDENTIFIER325);


            adaptor.addChild(root_1, IDENTIFIER325_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER326=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2584); 
            IDENTIFIER326_tree = (CommonTree)adaptor.dupNode(IDENTIFIER326);


            adaptor.addChild(root_1, IDENTIFIER326_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER327=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2586); 
            IDENTIFIER327_tree = (CommonTree)adaptor.dupNode(IDENTIFIER327);


            adaptor.addChild(root_1, IDENTIFIER327_tree);


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
            LVENTRY328=(CommonTree)match(input,LVENTRY,FOLLOW_LVENTRY_in_localVariableTable2590); 
            LVENTRY328_tree = (CommonTree)adaptor.dupNode(LVENTRY328);


            root_1 = (CommonTree)adaptor.becomeRoot(LVENTRY328_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:430:82: ( localVariableTableLine )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==INTLITERAL) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:430:82: localVariableTableLine
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable2592);
                	    localVariableTableLine329=localVariableTableLine();

                	    state._fsp--;

                	    adaptor.addChild(root_1, localVariableTableLine329.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:433:1: localVariableTableLine : INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType ;
    public final JVMWalker.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        JVMWalker.localVariableTableLine_return retval = new JVMWalker.localVariableTableLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL330=null;
        CommonTree INTLITERAL331=null;
        CommonTree INTLITERAL332=null;
        JVMWalker.localVariableTableLineIdentifier_return localVariableTableLineIdentifier333 =null;

        JVMWalker.bytecodeType_return bytecodeType334 =null;


        CommonTree INTLITERAL330_tree=null;
        CommonTree INTLITERAL331_tree=null;
        CommonTree INTLITERAL332_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:434:3: ( INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:434:5: INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL330=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine2609); 
            INTLITERAL330_tree = (CommonTree)adaptor.dupNode(INTLITERAL330);


            adaptor.addChild(root_0, INTLITERAL330_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL331=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine2611); 
            INTLITERAL331_tree = (CommonTree)adaptor.dupNode(INTLITERAL331);


            adaptor.addChild(root_0, INTLITERAL331_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL332=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine2613); 
            INTLITERAL332_tree = (CommonTree)adaptor.dupNode(INTLITERAL332);


            adaptor.addChild(root_0, INTLITERAL332_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine2615);
            localVariableTableLineIdentifier333=localVariableTableLineIdentifier();

            state._fsp--;

            adaptor.addChild(root_0, localVariableTableLineIdentifier333.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine2617);
            bytecodeType334=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeType334.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:437:1: localVariableTableLineIdentifier : IDENTIFIER ;
    public final JVMWalker.localVariableTableLineIdentifier_return localVariableTableLineIdentifier() throws RecognitionException {
        JVMWalker.localVariableTableLineIdentifier_return retval = new JVMWalker.localVariableTableLineIdentifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER335=null;

        CommonTree IDENTIFIER335_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:438:3: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:438:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER335=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier2631); 
            IDENTIFIER335_tree = (CommonTree)adaptor.dupNode(IDENTIFIER335);


            adaptor.addChild(root_0, IDENTIFIER335_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:445:1: stackMapTypeTable : ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) ;
    public final JVMWalker.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        JVMWalker.stackMapTypeTable_return retval = new JVMWalker.stackMapTypeTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMTHEADER336=null;
        CommonTree IDENTIFIER337=null;
        CommonTree ASSIGN338=null;
        CommonTree INTLITERAL339=null;
        CommonTree SMTENTRY340=null;
        JVMWalker.stackMapTypeTableEntry_return stackMapTypeTableEntry341 =null;


        CommonTree SMTHEADER336_tree=null;
        CommonTree IDENTIFIER337_tree=null;
        CommonTree ASSIGN338_tree=null;
        CommonTree INTLITERAL339_tree=null;
        CommonTree SMTENTRY340_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:446:3: ( ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:446:5: ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMTHEADER336=(CommonTree)match(input,SMTHEADER,FOLLOW_SMTHEADER_in_stackMapTypeTable2651); 
            SMTHEADER336_tree = (CommonTree)adaptor.dupNode(SMTHEADER336);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTHEADER336_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER337=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable2653); 
            IDENTIFIER337_tree = (CommonTree)adaptor.dupNode(IDENTIFIER337);


            adaptor.addChild(root_1, IDENTIFIER337_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN338=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable2655); 
            ASSIGN338_tree = (CommonTree)adaptor.dupNode(ASSIGN338);


            adaptor.addChild(root_1, ASSIGN338_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL339=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable2657); 
            INTLITERAL339_tree = (CommonTree)adaptor.dupNode(INTLITERAL339);


            adaptor.addChild(root_1, INTLITERAL339_tree);


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
            SMTENTRY340=(CommonTree)match(input,SMTENTRY,FOLLOW_SMTENTRY_in_stackMapTypeTable2661); 
            SMTENTRY340_tree = (CommonTree)adaptor.dupNode(SMTENTRY340);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTENTRY340_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:446:58: ( stackMapTypeTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:446:58: stackMapTypeTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable2663);
            	    stackMapTypeTableEntry341=stackMapTypeTableEntry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, stackMapTypeTableEntry341.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:449:1: stackMapTypeTableEntry : IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer ;
    public final JVMWalker.stackMapTypeTableEntry_return stackMapTypeTableEntry() throws RecognitionException {
        JVMWalker.stackMapTypeTableEntry_return retval = new JVMWalker.stackMapTypeTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER342=null;
        CommonTree ASSIGN343=null;
        CommonTree INTLITERAL344=null;
        CommonTree IDENTIFIER345=null;
        CommonTree ASSIGN346=null;
        CommonTree INTLITERAL347=null;
        CommonTree IDENTIFIER348=null;
        CommonTree ASSIGN349=null;
        CommonTree IDENTIFIER351=null;
        CommonTree ASSIGN352=null;
        JVMWalker.stackMapTableTypesContainer_return stackMapTableTypesContainer350 =null;

        JVMWalker.stackMapTableTypesContainer_return stackMapTableTypesContainer353 =null;


        CommonTree IDENTIFIER342_tree=null;
        CommonTree ASSIGN343_tree=null;
        CommonTree INTLITERAL344_tree=null;
        CommonTree IDENTIFIER345_tree=null;
        CommonTree ASSIGN346_tree=null;
        CommonTree INTLITERAL347_tree=null;
        CommonTree IDENTIFIER348_tree=null;
        CommonTree ASSIGN349_tree=null;
        CommonTree IDENTIFIER351_tree=null;
        CommonTree ASSIGN352_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:450:3: ( IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:450:5: IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER342=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2678); 
            IDENTIFIER342_tree = (CommonTree)adaptor.dupNode(IDENTIFIER342);


            adaptor.addChild(root_0, IDENTIFIER342_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN343=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2680); 
            ASSIGN343_tree = (CommonTree)adaptor.dupNode(ASSIGN343);


            adaptor.addChild(root_0, ASSIGN343_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL344=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2682); 
            INTLITERAL344_tree = (CommonTree)adaptor.dupNode(INTLITERAL344);


            adaptor.addChild(root_0, INTLITERAL344_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER345=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2684); 
            IDENTIFIER345_tree = (CommonTree)adaptor.dupNode(IDENTIFIER345);


            adaptor.addChild(root_0, IDENTIFIER345_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN346=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2686); 
            ASSIGN346_tree = (CommonTree)adaptor.dupNode(ASSIGN346);


            adaptor.addChild(root_0, ASSIGN346_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL347=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2688); 
            INTLITERAL347_tree = (CommonTree)adaptor.dupNode(INTLITERAL347);


            adaptor.addChild(root_0, INTLITERAL347_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER348=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2695); 
            IDENTIFIER348_tree = (CommonTree)adaptor.dupNode(IDENTIFIER348);


            adaptor.addChild(root_0, IDENTIFIER348_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN349=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2697); 
            ASSIGN349_tree = (CommonTree)adaptor.dupNode(ASSIGN349);


            adaptor.addChild(root_0, ASSIGN349_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2699);
            stackMapTableTypesContainer350=stackMapTableTypesContainer();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypesContainer350.getTree());


            _last = (CommonTree)input.LT(1);
            IDENTIFIER351=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2706); 
            IDENTIFIER351_tree = (CommonTree)adaptor.dupNode(IDENTIFIER351);


            adaptor.addChild(root_0, IDENTIFIER351_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN352=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2708); 
            ASSIGN352_tree = (CommonTree)adaptor.dupNode(ASSIGN352);


            adaptor.addChild(root_0, ASSIGN352_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2710);
            stackMapTableTypesContainer353=stackMapTableTypesContainer();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypesContainer353.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:459:1: stackMapTable : ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) ;
    public final JVMWalker.stackMapTable_return stackMapTable() throws RecognitionException {
        JVMWalker.stackMapTable_return retval = new JVMWalker.stackMapTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMHEADER354=null;
        CommonTree IDENTIFIER355=null;
        CommonTree ASSIGN356=null;
        CommonTree INTLITERAL357=null;
        CommonTree SMENTRY358=null;
        JVMWalker.stackMapTableEntry_return stackMapTableEntry359 =null;


        CommonTree SMHEADER354_tree=null;
        CommonTree IDENTIFIER355_tree=null;
        CommonTree ASSIGN356_tree=null;
        CommonTree INTLITERAL357_tree=null;
        CommonTree SMENTRY358_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:460:3: ( ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:460:5: ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMHEADER354=(CommonTree)match(input,SMHEADER,FOLLOW_SMHEADER_in_stackMapTable2729); 
            SMHEADER354_tree = (CommonTree)adaptor.dupNode(SMHEADER354);


            root_1 = (CommonTree)adaptor.becomeRoot(SMHEADER354_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER355=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable2731); 
            IDENTIFIER355_tree = (CommonTree)adaptor.dupNode(IDENTIFIER355);


            adaptor.addChild(root_1, IDENTIFIER355_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN356=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable2733); 
            ASSIGN356_tree = (CommonTree)adaptor.dupNode(ASSIGN356);


            adaptor.addChild(root_1, ASSIGN356_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL357=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable2735); 
            INTLITERAL357_tree = (CommonTree)adaptor.dupNode(INTLITERAL357);


            adaptor.addChild(root_1, INTLITERAL357_tree);


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
            SMENTRY358=(CommonTree)match(input,SMENTRY,FOLLOW_SMENTRY_in_stackMapTable2739); 
            SMENTRY358_tree = (CommonTree)adaptor.dupNode(SMENTRY358);


            root_1 = (CommonTree)adaptor.becomeRoot(SMENTRY358_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:460:56: ( stackMapTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:460:56: stackMapTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable2741);
            	    stackMapTableEntry359=stackMapTableEntry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, stackMapTableEntry359.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:462:1: stackMapTableEntry : ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) ;
    public final JVMWalker.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        JVMWalker.stackMapTableEntry_return retval = new JVMWalker.stackMapTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN360=null;
        CommonTree IDENTIFIER361=null;
        JVMWalker.stackMapTableEntryValue_return stackMapTableEntryValue362 =null;


        CommonTree ASSIGN360_tree=null;
        CommonTree IDENTIFIER361_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:463:3: ( ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:463:5: ^( ASSIGN IDENTIFIER stackMapTableEntryValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN360=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry2756); 
            ASSIGN360_tree = (CommonTree)adaptor.dupNode(ASSIGN360);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN360_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER361=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry2758); 
            IDENTIFIER361_tree = (CommonTree)adaptor.dupNode(IDENTIFIER361);


            adaptor.addChild(root_1, IDENTIFIER361_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry2760);
            stackMapTableEntryValue362=stackMapTableEntryValue();

            state._fsp--;

            adaptor.addChild(root_1, stackMapTableEntryValue362.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:465:1: stackMapTableEntryValue : ( INTLITERAL | stackMapTableTypesContainer );
    public final JVMWalker.stackMapTableEntryValue_return stackMapTableEntryValue() throws RecognitionException {
        JVMWalker.stackMapTableEntryValue_return retval = new JVMWalker.stackMapTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL363=null;
        JVMWalker.stackMapTableTypesContainer_return stackMapTableTypesContainer364 =null;


        CommonTree INTLITERAL363_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:466:3: ( INTLITERAL | stackMapTableTypesContainer )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:466:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL363=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntryValue2773); 
                    INTLITERAL363_tree = (CommonTree)adaptor.dupNode(INTLITERAL363);


                    adaptor.addChild(root_0, INTLITERAL363_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:466:18: stackMapTableTypesContainer
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue2777);
                    stackMapTableTypesContainer364=stackMapTableTypesContainer();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypesContainer364.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:468:1: stackMapTableTypesContainer : stackMapTableTypes ;
    public final JVMWalker.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        JVMWalker.stackMapTableTypesContainer_return retval = new JVMWalker.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.stackMapTableTypes_return stackMapTableTypes365 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:469:3: ( stackMapTableTypes )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:469:5: stackMapTableTypes
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2789);
            stackMapTableTypes365=stackMapTableTypes();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypes365.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:471:1: stackMapTableTypes : ^( SMTTYPES ( stackMapTableType )* ) ;
    public final JVMWalker.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        JVMWalker.stackMapTableTypes_return retval = new JVMWalker.stackMapTableTypes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMTTYPES366=null;
        JVMWalker.stackMapTableType_return stackMapTableType367 =null;


        CommonTree SMTTYPES366_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:472:3: ( ^( SMTTYPES ( stackMapTableType )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:472:5: ^( SMTTYPES ( stackMapTableType )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMTTYPES366=(CommonTree)match(input,SMTTYPES,FOLLOW_SMTTYPES_in_stackMapTableTypes2813); 
            SMTTYPES366_tree = (CommonTree)adaptor.dupNode(SMTTYPES366);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTTYPES366_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:472:16: ( stackMapTableType )*
                loop77:
                do {
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==BOOLEAN||LA77_0==BYTE||LA77_0==CHAR||LA77_0==CLASS||LA77_0==DOUBLE||LA77_0==FLOAT||LA77_0==IDENTIFIER||LA77_0==INT||LA77_0==LONG||LA77_0==SHORT||LA77_0==VOID) ) {
                        alt77=1;
                    }


                    switch (alt77) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:472:16: stackMapTableType
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes2815);
                	    stackMapTableType367=stackMapTableType();

                	    state._fsp--;

                	    adaptor.addChild(root_1, stackMapTableType367.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:474:1: stackMapTableType : ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? );
    public final JVMWalker.stackMapTableType_return stackMapTableType() throws RecognitionException {
        JVMWalker.stackMapTableType_return retval = new JVMWalker.stackMapTableType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER371=null;
        CommonTree INTLITERAL372=null;
        JVMWalker.stackMapTableTypeObject_return stackMapTableTypeObject368 =null;

        JVMWalker.stackMapTableTypePlainObject_return stackMapTableTypePlainObject369 =null;

        JVMWalker.primitiveType_return primitiveType370 =null;


        CommonTree IDENTIFIER371_tree=null;
        CommonTree INTLITERAL372_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:475:3: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:475:5: stackMapTableTypeObject
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType2829);
                    stackMapTableTypeObject368=stackMapTableTypeObject();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypeObject368.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:475:29: stackMapTableTypePlainObject
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2831);
                    stackMapTableTypePlainObject369=stackMapTableTypePlainObject();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypePlainObject369.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:475:58: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType2833);
                    primitiveType370=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType370.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:475:72: IDENTIFIER ( INTLITERAL )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER371=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableType2835); 
                    IDENTIFIER371_tree = (CommonTree)adaptor.dupNode(IDENTIFIER371);


                    adaptor.addChild(root_0, IDENTIFIER371_tree);


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:475:83: ( INTLITERAL )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==INTLITERAL) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:475:83: INTLITERAL
                            {
                            _last = (CommonTree)input.LT(1);
                            INTLITERAL372=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableType2837); 
                            INTLITERAL372_tree = (CommonTree)adaptor.dupNode(INTLITERAL372);


                            adaptor.addChild(root_0, INTLITERAL372_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:477:1: stackMapTableTypePlainObject : CLASS INTERNALTYPE ;
    public final JVMWalker.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        JVMWalker.stackMapTableTypePlainObject_return retval = new JVMWalker.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS373=null;
        CommonTree INTERNALTYPE374=null;

        CommonTree CLASS373_tree=null;
        CommonTree INTERNALTYPE374_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:478:3: ( CLASS INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:478:5: CLASS INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CLASS373=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject2850); 
            CLASS373_tree = (CommonTree)adaptor.dupNode(CLASS373);


            adaptor.addChild(root_0, CLASS373_tree);


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE374=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject2852); 
            INTERNALTYPE374_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE374);


            adaptor.addChild(root_0, INTERNALTYPE374_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:480:1: stackMapTableTypeObject : CLASS STRINGLITERAL ;
    public final JVMWalker.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        JVMWalker.stackMapTableTypeObject_return retval = new JVMWalker.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS375=null;
        CommonTree STRINGLITERAL376=null;

        CommonTree CLASS375_tree=null;
        CommonTree STRINGLITERAL376_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:481:3: ( CLASS STRINGLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:481:5: CLASS STRINGLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CLASS375=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject2864); 
            CLASS375_tree = (CommonTree)adaptor.dupNode(CLASS375);


            adaptor.addChild(root_0, CLASS375_tree);


            _last = (CommonTree)input.LT(1);
            STRINGLITERAL376=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2866); 
            STRINGLITERAL376_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL376);


            adaptor.addChild(root_0, STRINGLITERAL376_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:491:1: typeList : ( type )+ ;
    public final JVMWalker.typeList_return typeList() throws RecognitionException {
        JVMWalker.typeList_return retval = new JVMWalker.typeList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.type_return type377 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:492:3: ( ( type )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:492:5: ( type )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:492:5: ( type )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:492:5: type
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_type_in_typeList2886);
            	    type377=type();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type377.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:494:1: type : combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) ;
    public final JVMWalker.type_return type() throws RecognitionException {
        JVMWalker.type_return retval = new JVMWalker.type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARRAYBRACKS379=null;
        CommonTree LBRACK380=null;
        CommonTree RBRACK381=null;
        JVMWalker.combinedJavaType_return combinedJavaType378 =null;


        CommonTree ARRAYBRACKS379_tree=null;
        CommonTree LBRACK380_tree=null;
        CommonTree RBRACK381_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:495:3: ( combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:495:5: combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_combinedJavaType_in_type2899);
            combinedJavaType378=combinedJavaType();

            state._fsp--;

            adaptor.addChild(root_0, combinedJavaType378.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ARRAYBRACKS379=(CommonTree)match(input,ARRAYBRACKS,FOLLOW_ARRAYBRACKS_in_type2902); 
            ARRAYBRACKS379_tree = (CommonTree)adaptor.dupNode(ARRAYBRACKS379);


            root_1 = (CommonTree)adaptor.becomeRoot(ARRAYBRACKS379_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:495:36: ( LBRACK RBRACK )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==LBRACK) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:495:37: LBRACK RBRACK
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    LBRACK380=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_type2905); 
                	    LBRACK380_tree = (CommonTree)adaptor.dupNode(LBRACK380);


                	    adaptor.addChild(root_1, LBRACK380_tree);


                	    _last = (CommonTree)input.LT(1);
                	    RBRACK381=(CommonTree)match(input,RBRACK,FOLLOW_RBRACK_in_type2907); 
                	    RBRACK381_tree = (CommonTree)adaptor.dupNode(RBRACK381);


                	    adaptor.addChild(root_1, RBRACK381_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:497:1: combinedJavaType : ( primitiveType | referenceType );
    public final JVMWalker.combinedJavaType_return combinedJavaType() throws RecognitionException {
        JVMWalker.combinedJavaType_return retval = new JVMWalker.combinedJavaType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.primitiveType_return primitiveType382 =null;

        JVMWalker.referenceType_return referenceType383 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:498:3: ( primitiveType | referenceType )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:498:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_combinedJavaType2922);
                    primitiveType382=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType382.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:499:5: referenceType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_referenceType_in_combinedJavaType2928);
                    referenceType383=referenceType();

                    state._fsp--;

                    adaptor.addChild(root_0, referenceType383.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:501:1: referenceType : ^( UNITNAME ( typeDeclSpecifier )+ ) ;
    public final JVMWalker.referenceType_return referenceType() throws RecognitionException {
        JVMWalker.referenceType_return retval = new JVMWalker.referenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITNAME384=null;
        JVMWalker.typeDeclSpecifier_return typeDeclSpecifier385 =null;


        CommonTree UNITNAME384_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:502:3: ( ^( UNITNAME ( typeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:502:5: ^( UNITNAME ( typeDeclSpecifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME384=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_referenceType2941); 
            UNITNAME384_tree = (CommonTree)adaptor.dupNode(UNITNAME384);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITNAME384_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:502:16: ( typeDeclSpecifier )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:502:16: typeDeclSpecifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType2943);
            	    typeDeclSpecifier385=typeDeclSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_1, typeDeclSpecifier385.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:504:1: typeDeclSpecifier : ^( typeName ^( TYPEARGS ( typeArguments )? ) ) ;
    public final JVMWalker.typeDeclSpecifier_return typeDeclSpecifier() throws RecognitionException {
        JVMWalker.typeDeclSpecifier_return retval = new JVMWalker.typeDeclSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS387=null;
        JVMWalker.typeName_return typeName386 =null;

        JVMWalker.typeArguments_return typeArguments388 =null;


        CommonTree TYPEARGS387_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:505:3: ( ^( typeName ^( TYPEARGS ( typeArguments )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:505:5: ^( typeName ^( TYPEARGS ( typeArguments )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeName_in_typeDeclSpecifier2958);
            typeName386=typeName();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(typeName386.getTree(), root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS387=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_typeDeclSpecifier2961); 
            TYPEARGS387_tree = (CommonTree)adaptor.dupNode(TYPEARGS387);


            root_2 = (CommonTree)adaptor.becomeRoot(TYPEARGS387_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:505:27: ( typeArguments )?
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==BOOLEAN||LA84_0==BYTE||LA84_0==CHAR||LA84_0==DOUBLE||LA84_0==FLOAT||LA84_0==INT||LA84_0==LONG||LA84_0==QUESTION||LA84_0==SHORT||LA84_0==UNITNAME||LA84_0==VOID) ) {
                    alt84=1;
                }
                switch (alt84) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:505:27: typeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeArguments_in_typeDeclSpecifier2963);
                        typeArguments388=typeArguments();

                        state._fsp--;

                        adaptor.addChild(root_2, typeArguments388.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:507:1: typeName : QualifiedType ;
    public final JVMWalker.typeName_return typeName() throws RecognitionException {
        JVMWalker.typeName_return retval = new JVMWalker.typeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QualifiedType389=null;

        CommonTree QualifiedType389_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:508:3: ( QualifiedType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:508:5: QualifiedType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            QualifiedType389=(CommonTree)match(input,QualifiedType,FOLLOW_QualifiedType_in_typeName2978); 
            QualifiedType389_tree = (CommonTree)adaptor.dupNode(QualifiedType389);


            adaptor.addChild(root_0, QualifiedType389_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:510:1: typeArguments : typeArgumentList ;
    public final JVMWalker.typeArguments_return typeArguments() throws RecognitionException {
        JVMWalker.typeArguments_return retval = new JVMWalker.typeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.typeArgumentList_return typeArgumentList390 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:511:3: ( typeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:511:5: typeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeArgumentList_in_typeArguments2990);
            typeArgumentList390=typeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, typeArgumentList390.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:513:1: typeArgumentList : ( typeArgument )+ ;
    public final JVMWalker.typeArgumentList_return typeArgumentList() throws RecognitionException {
        JVMWalker.typeArgumentList_return retval = new JVMWalker.typeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.typeArgument_return typeArgument391 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:514:3: ( ( typeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:514:5: ( typeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:514:5: ( typeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:514:5: typeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeArgument_in_typeArgumentList3003);
            	    typeArgument391=typeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeArgument391.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:516:1: typeArgument : ( type | wildcard );
    public final JVMWalker.typeArgument_return typeArgument() throws RecognitionException {
        JVMWalker.typeArgument_return retval = new JVMWalker.typeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.type_return type392 =null;

        JVMWalker.wildcard_return wildcard393 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:517:3: ( type | wildcard )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:517:5: type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_typeArgument3016);
                    type392=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type392.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:518:5: wildcard
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wildcard_in_typeArgument3022);
                    wildcard393=wildcard();

                    state._fsp--;

                    adaptor.addChild(root_0, wildcard393.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:520:1: wildcard : ^( QUESTION ( wildcardBounds )? ) ;
    public final JVMWalker.wildcard_return wildcard() throws RecognitionException {
        JVMWalker.wildcard_return retval = new JVMWalker.wildcard_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUESTION394=null;
        JVMWalker.wildcardBounds_return wildcardBounds395 =null;


        CommonTree QUESTION394_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:521:3: ( ^( QUESTION ( wildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:521:5: ^( QUESTION ( wildcardBounds )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUESTION394=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_wildcard3035); 
            QUESTION394_tree = (CommonTree)adaptor.dupNode(QUESTION394);


            root_1 = (CommonTree)adaptor.becomeRoot(QUESTION394_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:521:16: ( wildcardBounds )?
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==EXTENDS||LA87_0==SUPER) ) {
                    alt87=1;
                }
                switch (alt87) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:521:16: wildcardBounds
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_wildcardBounds_in_wildcard3037);
                        wildcardBounds395=wildcardBounds();

                        state._fsp--;

                        adaptor.addChild(root_1, wildcardBounds395.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:523:1: wildcardBounds : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final JVMWalker.wildcardBounds_return wildcardBounds() throws RecognitionException {
        JVMWalker.wildcardBounds_return retval = new JVMWalker.wildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS396=null;
        CommonTree SUPER398=null;
        JVMWalker.type_return type397 =null;

        JVMWalker.type_return type399 =null;


        CommonTree EXTENDS396_tree=null;
        CommonTree SUPER398_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:524:3: ( ^( EXTENDS type ) | ^( SUPER type ) )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:524:5: ^( EXTENDS type )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXTENDS396=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_wildcardBounds3052); 
                    EXTENDS396_tree = (CommonTree)adaptor.dupNode(EXTENDS396);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS396_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_wildcardBounds3054);
                    type397=type();

                    state._fsp--;

                    adaptor.addChild(root_1, type397.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:525:5: ^( SUPER type )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUPER398=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_wildcardBounds3062); 
                    SUPER398_tree = (CommonTree)adaptor.dupNode(SUPER398);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER398_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_wildcardBounds3064);
                    type399=type();

                    state._fsp--;

                    adaptor.addChild(root_1, type399.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:527:1: typeParameters : ( typeParameter )+ ;
    public final JVMWalker.typeParameters_return typeParameters() throws RecognitionException {
        JVMWalker.typeParameters_return retval = new JVMWalker.typeParameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.typeParameter_return typeParameter400 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:528:3: ( ( typeParameter )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:528:5: ( typeParameter )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:528:5: ( typeParameter )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:528:5: typeParameter
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeParameter_in_typeParameters3077);
            	    typeParameter400=typeParameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeParameter400.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:530:1: typeParameter : ^( identifier ( typeBound )? ) ;
    public final JVMWalker.typeParameter_return typeParameter() throws RecognitionException {
        JVMWalker.typeParameter_return retval = new JVMWalker.typeParameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.identifier_return identifier401 =null;

        JVMWalker.typeBound_return typeBound402 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:531:3: ( ^( identifier ( typeBound )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:531:5: ^( identifier ( typeBound )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_typeParameter3091);
            identifier401=identifier();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(identifier401.getTree(), root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:531:18: ( typeBound )?
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==EXTENDS) ) {
                    alt90=1;
                }
                switch (alt90) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:531:18: typeBound
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeBound_in_typeParameter3093);
                        typeBound402=typeBound();

                        state._fsp--;

                        adaptor.addChild(root_1, typeBound402.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:533:1: typeBound : ^( EXTENDS ( referenceType )+ ) ;
    public final JVMWalker.typeBound_return typeBound() throws RecognitionException {
        JVMWalker.typeBound_return retval = new JVMWalker.typeBound_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS403=null;
        JVMWalker.referenceType_return referenceType404 =null;


        CommonTree EXTENDS403_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:534:3: ( ^( EXTENDS ( referenceType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:534:5: ^( EXTENDS ( referenceType )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXTENDS403=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeBound3108); 
            EXTENDS403_tree = (CommonTree)adaptor.dupNode(EXTENDS403);


            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS403_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:534:15: ( referenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:534:15: referenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_referenceType_in_typeBound3110);
            	    referenceType404=referenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_1, referenceType404.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:539:1: genericDescriptor : ( genericReturnDescriptor )+ ;
    public final JVMWalker.genericDescriptor_return genericDescriptor() throws RecognitionException {
        JVMWalker.genericDescriptor_return retval = new JVMWalker.genericDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.genericReturnDescriptor_return genericReturnDescriptor405 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:540:3: ( ( genericReturnDescriptor )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:540:5: ( genericReturnDescriptor )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:540:5: ( genericReturnDescriptor )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:540:5: genericReturnDescriptor
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor3127);
            	    genericReturnDescriptor405=genericReturnDescriptor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, genericReturnDescriptor405.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:542:1: genericReturnDescriptor : ^( EXTENDS identifier bytecodeReferenceTypeList ) ;
    public final JVMWalker.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        JVMWalker.genericReturnDescriptor_return retval = new JVMWalker.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS406=null;
        JVMWalker.identifier_return identifier407 =null;

        JVMWalker.bytecodeReferenceTypeList_return bytecodeReferenceTypeList408 =null;


        CommonTree EXTENDS406_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:543:3: ( ^( EXTENDS identifier bytecodeReferenceTypeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:543:5: ^( EXTENDS identifier bytecodeReferenceTypeList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXTENDS406=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor3141); 
            EXTENDS406_tree = (CommonTree)adaptor.dupNode(EXTENDS406);


            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS406_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor3143);
            identifier407=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier407.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor3145);
            bytecodeReferenceTypeList408=bytecodeReferenceTypeList();

            state._fsp--;

            adaptor.addChild(root_1, bytecodeReferenceTypeList408.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:545:1: bytecodeReferenceTypeList : ( bytecodeReferenceType )+ ;
    public final JVMWalker.bytecodeReferenceTypeList_return bytecodeReferenceTypeList() throws RecognitionException {
        JVMWalker.bytecodeReferenceTypeList_return retval = new JVMWalker.bytecodeReferenceTypeList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.bytecodeReferenceType_return bytecodeReferenceType409 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:546:3: ( ( bytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:546:5: ( bytecodeReferenceType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:546:5: ( bytecodeReferenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:546:5: bytecodeReferenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList3159);
            	    bytecodeReferenceType409=bytecodeReferenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bytecodeReferenceType409.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:548:1: bytecodeReferenceType : ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) ;
    public final JVMWalker.bytecodeReferenceType_return bytecodeReferenceType() throws RecognitionException {
        JVMWalker.bytecodeReferenceType_return retval = new JVMWalker.bytecodeReferenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITNAME410=null;
        JVMWalker.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier411 =null;


        CommonTree UNITNAME410_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:549:3: ( ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:549:5: ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME410=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_bytecodeReferenceType3173); 
            UNITNAME410_tree = (CommonTree)adaptor.dupNode(UNITNAME410);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITNAME410_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:549:16: ( bytecodeTypeDeclSpecifier )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:549:16: bytecodeTypeDeclSpecifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType3175);
            	    bytecodeTypeDeclSpecifier411=bytecodeTypeDeclSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_1, bytecodeTypeDeclSpecifier411.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:551:1: bytecodeTypeDeclSpecifier : bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) ;
    public final JVMWalker.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier() throws RecognitionException {
        JVMWalker.bytecodeTypeDeclSpecifier_return retval = new JVMWalker.bytecodeTypeDeclSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS413=null;
        JVMWalker.bytecodeTypeName_return bytecodeTypeName412 =null;

        JVMWalker.bytecodeTypeArguments_return bytecodeTypeArguments414 =null;


        CommonTree TYPEARGS413_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:552:3: ( bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:552:5: bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier3189);
            bytecodeTypeName412=bytecodeTypeName();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeTypeName412.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS413=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier3192); 
            TYPEARGS413_tree = (CommonTree)adaptor.dupNode(TYPEARGS413);


            root_1 = (CommonTree)adaptor.becomeRoot(TYPEARGS413_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:552:33: ( bytecodeTypeArguments )?
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==QUESTION||LA95_0==UNITNAME) ) {
                    alt95=1;
                }
                switch (alt95) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:552:33: bytecodeTypeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier3194);
                        bytecodeTypeArguments414=bytecodeTypeArguments();

                        state._fsp--;

                        adaptor.addChild(root_1, bytecodeTypeArguments414.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:554:1: bytecodeTypeName : INTERNALTYPE ;
    public final JVMWalker.bytecodeTypeName_return bytecodeTypeName() throws RecognitionException {
        JVMWalker.bytecodeTypeName_return retval = new JVMWalker.bytecodeTypeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERNALTYPE415=null;

        CommonTree INTERNALTYPE415_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:555:3: ( INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:555:5: INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE415=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeTypeName3208); 
            INTERNALTYPE415_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE415);


            adaptor.addChild(root_0, INTERNALTYPE415_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:557:1: bytecodeTypeArguments : bytecodeTypeArgumentList ;
    public final JVMWalker.bytecodeTypeArguments_return bytecodeTypeArguments() throws RecognitionException {
        JVMWalker.bytecodeTypeArguments_return retval = new JVMWalker.bytecodeTypeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.bytecodeTypeArgumentList_return bytecodeTypeArgumentList416 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:558:3: ( bytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:558:5: bytecodeTypeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments3220);
            bytecodeTypeArgumentList416=bytecodeTypeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeTypeArgumentList416.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:560:1: bytecodeTypeArgumentList : ( bytecodeTypeArgument )+ ;
    public final JVMWalker.bytecodeTypeArgumentList_return bytecodeTypeArgumentList() throws RecognitionException {
        JVMWalker.bytecodeTypeArgumentList_return retval = new JVMWalker.bytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.bytecodeTypeArgument_return bytecodeTypeArgument417 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:561:3: ( ( bytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:561:5: ( bytecodeTypeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:561:5: ( bytecodeTypeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:561:5: bytecodeTypeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList3233);
            	    bytecodeTypeArgument417=bytecodeTypeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bytecodeTypeArgument417.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:563:1: bytecodeTypeArgument : ( bytecodeReferenceType | bytecodeWildcard );
    public final JVMWalker.bytecodeTypeArgument_return bytecodeTypeArgument() throws RecognitionException {
        JVMWalker.bytecodeTypeArgument_return retval = new JVMWalker.bytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.bytecodeReferenceType_return bytecodeReferenceType418 =null;

        JVMWalker.bytecodeWildcard_return bytecodeWildcard419 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:564:3: ( bytecodeReferenceType | bytecodeWildcard )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:564:5: bytecodeReferenceType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument3246);
                    bytecodeReferenceType418=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeReferenceType418.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:565:5: bytecodeWildcard
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument3252);
                    bytecodeWildcard419=bytecodeWildcard();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeWildcard419.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:567:1: bytecodeWildcard : ^( QUESTION ( bytecodeWildcardBounds )? ) ;
    public final JVMWalker.bytecodeWildcard_return bytecodeWildcard() throws RecognitionException {
        JVMWalker.bytecodeWildcard_return retval = new JVMWalker.bytecodeWildcard_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUESTION420=null;
        JVMWalker.bytecodeWildcardBounds_return bytecodeWildcardBounds421 =null;


        CommonTree QUESTION420_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:568:3: ( ^( QUESTION ( bytecodeWildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:568:5: ^( QUESTION ( bytecodeWildcardBounds )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUESTION420=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_bytecodeWildcard3265); 
            QUESTION420_tree = (CommonTree)adaptor.dupNode(QUESTION420);


            root_1 = (CommonTree)adaptor.becomeRoot(QUESTION420_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:568:16: ( bytecodeWildcardBounds )?
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==EXTENDS||LA98_0==SUPER) ) {
                    alt98=1;
                }
                switch (alt98) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:568:16: bytecodeWildcardBounds
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard3267);
                        bytecodeWildcardBounds421=bytecodeWildcardBounds();

                        state._fsp--;

                        adaptor.addChild(root_1, bytecodeWildcardBounds421.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:570:1: bytecodeWildcardBounds : ( ^( EXTENDS bytecodeReferenceType ) | ^( SUPER bytecodeReferenceType ) );
    public final JVMWalker.bytecodeWildcardBounds_return bytecodeWildcardBounds() throws RecognitionException {
        JVMWalker.bytecodeWildcardBounds_return retval = new JVMWalker.bytecodeWildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS422=null;
        CommonTree SUPER424=null;
        JVMWalker.bytecodeReferenceType_return bytecodeReferenceType423 =null;

        JVMWalker.bytecodeReferenceType_return bytecodeReferenceType425 =null;


        CommonTree EXTENDS422_tree=null;
        CommonTree SUPER424_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:571:3: ( ^( EXTENDS bytecodeReferenceType ) | ^( SUPER bytecodeReferenceType ) )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:571:5: ^( EXTENDS bytecodeReferenceType )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXTENDS422=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_bytecodeWildcardBounds3282); 
                    EXTENDS422_tree = (CommonTree)adaptor.dupNode(EXTENDS422);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS422_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3284);
                    bytecodeReferenceType423=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_1, bytecodeReferenceType423.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:572:5: ^( SUPER bytecodeReferenceType )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUPER424=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_bytecodeWildcardBounds3292); 
                    SUPER424_tree = (CommonTree)adaptor.dupNode(SUPER424);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER424_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3294);
                    bytecodeReferenceType425=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_1, bytecodeReferenceType425.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:579:1: bytecodeType : ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER );
    public final JVMWalker.bytecodeType_return bytecodeType() throws RecognitionException {
        JVMWalker.bytecodeType_return retval = new JVMWalker.bytecodeType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BaseType427=null;
        CommonTree SEMI429=null;
        CommonTree IDENTIFIER430=null;
        JVMWalker.bytecodeArrayType_return bytecodeArrayType426 =null;

        JVMWalker.simpleBytecodeObjectType_return simpleBytecodeObjectType428 =null;


        CommonTree BaseType427_tree=null;
        CommonTree SEMI429_tree=null;
        CommonTree IDENTIFIER430_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:580:3: ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:580:5: bytecodeArrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType3312);
                    bytecodeArrayType426=bytecodeArrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeArrayType426.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:580:25: BaseType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BaseType427=(CommonTree)match(input,BaseType,FOLLOW_BaseType_in_bytecodeType3316); 
                    BaseType427_tree = (CommonTree)adaptor.dupNode(BaseType427);


                    adaptor.addChild(root_0, BaseType427_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:580:36: simpleBytecodeObjectType SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_bytecodeType3320);
                    simpleBytecodeObjectType428=simpleBytecodeObjectType();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleBytecodeObjectType428.getTree());


                    _last = (CommonTree)input.LT(1);
                    SEMI429=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType3322); 
                    SEMI429_tree = (CommonTree)adaptor.dupNode(SEMI429);


                    adaptor.addChild(root_0, SEMI429_tree);


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:580:68: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER430=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType3326); 
                    IDENTIFIER430_tree = (CommonTree)adaptor.dupNode(IDENTIFIER430);


                    adaptor.addChild(root_0, IDENTIFIER430_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:582:1: bytecodeArrayType : LBRACK bytecodeType ;
    public final JVMWalker.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        JVMWalker.bytecodeArrayType_return retval = new JVMWalker.bytecodeArrayType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LBRACK431=null;
        JVMWalker.bytecodeType_return bytecodeType432 =null;


        CommonTree LBRACK431_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:583:3: ( LBRACK bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:583:5: LBRACK bytecodeType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            LBRACK431=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType3339); 
            LBRACK431_tree = (CommonTree)adaptor.dupNode(LBRACK431);


            adaptor.addChild(root_0, LBRACK431_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType3341);
            bytecodeType432=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeType432.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:585:1: simpleBytecodeObjectType : ( simpleBytecodeReferenceType )+ ;
    public final JVMWalker.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        JVMWalker.simpleBytecodeObjectType_return retval = new JVMWalker.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.simpleBytecodeReferenceType_return simpleBytecodeReferenceType433 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:586:3: ( ( simpleBytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:586:5: ( simpleBytecodeReferenceType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:586:5: ( simpleBytecodeReferenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:586:5: simpleBytecodeReferenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType3354);
            	    simpleBytecodeReferenceType433=simpleBytecodeReferenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simpleBytecodeReferenceType433.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:588:1: simpleBytecodeReferenceType : simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) ;
    public final JVMWalker.simpleBytecodeReferenceType_return simpleBytecodeReferenceType() throws RecognitionException {
        JVMWalker.simpleBytecodeReferenceType_return retval = new JVMWalker.simpleBytecodeReferenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS435=null;
        JVMWalker.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName434 =null;

        JVMWalker.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments436 =null;


        CommonTree TYPEARGS435_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:589:3: ( simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:589:5: simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType3367);
            simpleBytecodeReferenceTypeName434=simpleBytecodeReferenceTypeName();

            state._fsp--;

            adaptor.addChild(root_0, simpleBytecodeReferenceTypeName434.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS435=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType3370); 
            TYPEARGS435_tree = (CommonTree)adaptor.dupNode(TYPEARGS435);


            root_1 = (CommonTree)adaptor.becomeRoot(TYPEARGS435_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:589:48: ( simpleBytecodeTypeArguments )?
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==BaseType||LA102_0==IDENTIFIER||LA102_0==INTERNALTYPE||LA102_0==LBRACK||LA102_0==MINUS||LA102_0==PLUS||LA102_0==STAR) ) {
                    alt102=1;
                }
                switch (alt102) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:589:48: simpleBytecodeTypeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType3372);
                        simpleBytecodeTypeArguments436=simpleBytecodeTypeArguments();

                        state._fsp--;

                        adaptor.addChild(root_1, simpleBytecodeTypeArguments436.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:591:1: simpleBytecodeReferenceTypeName : INTERNALTYPE ;
    public final JVMWalker.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName() throws RecognitionException {
        JVMWalker.simpleBytecodeReferenceTypeName_return retval = new JVMWalker.simpleBytecodeReferenceTypeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERNALTYPE437=null;

        CommonTree INTERNALTYPE437_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:592:3: ( INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:592:5: INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE437=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName3386); 
            INTERNALTYPE437_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE437);


            adaptor.addChild(root_0, INTERNALTYPE437_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:594:1: simpleBytecodeTypeArguments : simpleBytecodeTypeArgumentList ;
    public final JVMWalker.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments() throws RecognitionException {
        JVMWalker.simpleBytecodeTypeArguments_return retval = new JVMWalker.simpleBytecodeTypeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList438 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:595:3: ( simpleBytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:595:5: simpleBytecodeTypeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments3398);
            simpleBytecodeTypeArgumentList438=simpleBytecodeTypeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, simpleBytecodeTypeArgumentList438.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:597:1: simpleBytecodeTypeArgumentList : ( simpleBytecodeTypeArgument )+ ;
    public final JVMWalker.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList() throws RecognitionException {
        JVMWalker.simpleBytecodeTypeArgumentList_return retval = new JVMWalker.simpleBytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument439 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:598:3: ( ( simpleBytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:598:5: ( simpleBytecodeTypeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:598:5: ( simpleBytecodeTypeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:598:5: simpleBytecodeTypeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList3410);
            	    simpleBytecodeTypeArgument439=simpleBytecodeTypeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simpleBytecodeTypeArgument439.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:600:1: simpleBytecodeTypeArgument : ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR );
    public final JVMWalker.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument() throws RecognitionException {
        JVMWalker.simpleBytecodeTypeArgument_return retval = new JVMWalker.simpleBytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MINUS441=null;
        CommonTree PLUS443=null;
        CommonTree STAR445=null;
        JVMWalker.bytecodeType_return bytecodeType440 =null;

        JVMWalker.bytecodeType_return bytecodeType442 =null;

        JVMWalker.bytecodeType_return bytecodeType444 =null;


        CommonTree MINUS441_tree=null;
        CommonTree PLUS443_tree=null;
        CommonTree STAR445_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:601:3: ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:601:5: bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3423);
                    bytecodeType440=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType440.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:602:5: MINUS bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    MINUS441=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_simpleBytecodeTypeArgument3429); 
                    MINUS441_tree = (CommonTree)adaptor.dupNode(MINUS441);


                    adaptor.addChild(root_0, MINUS441_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3431);
                    bytecodeType442=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType442.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:603:5: PLUS bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    PLUS443=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_simpleBytecodeTypeArgument3437); 
                    PLUS443_tree = (CommonTree)adaptor.dupNode(PLUS443);


                    adaptor.addChild(root_0, PLUS443_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3439);
                    bytecodeType444=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType444.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:604:5: STAR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    STAR445=(CommonTree)match(input,STAR,FOLLOW_STAR_in_simpleBytecodeTypeArgument3445); 
                    STAR445_tree = (CommonTree)adaptor.dupNode(STAR445);


                    adaptor.addChild(root_0, STAR445_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:611:1: identifier : IDENTIFIER ;
    public final JVMWalker.identifier_return identifier() throws RecognitionException {
        JVMWalker.identifier_return retval = new JVMWalker.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER446=null;

        CommonTree IDENTIFIER446_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:611:11: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:611:13: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER446=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier3459); 
            IDENTIFIER446_tree = (CommonTree)adaptor.dupNode(IDENTIFIER446);


            adaptor.addChild(root_0, IDENTIFIER446_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:613:1: keywordAggregate : IDENTIFIER ;
    public final JVMWalker.keywordAggregate_return keywordAggregate() throws RecognitionException {
        JVMWalker.keywordAggregate_return retval = new JVMWalker.keywordAggregate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER447=null;

        CommonTree IDENTIFIER447_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:614:3: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:614:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER447=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_keywordAggregate3469); 
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
    // $ANTLR end "keywordAggregate"


    public static class primitiveType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:617:1: primitiveType : ( boolean_type | numeric_type | VOID );
    public final JVMWalker.primitiveType_return primitiveType() throws RecognitionException {
        JVMWalker.primitiveType_return retval = new JVMWalker.primitiveType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VOID450=null;
        JVMWalker.boolean_type_return boolean_type448 =null;

        JVMWalker.numeric_type_return numeric_type449 =null;


        CommonTree VOID450_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:618:3: ( boolean_type | numeric_type | VOID )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:618:5: boolean_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_boolean_type_in_primitiveType3482);
                    boolean_type448=boolean_type();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_type448.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:619:5: numeric_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numeric_type_in_primitiveType3488);
                    numeric_type449=numeric_type();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_type449.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:620:5: VOID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VOID450=(CommonTree)match(input,VOID,FOLLOW_VOID_in_primitiveType3494); 
                    VOID450_tree = (CommonTree)adaptor.dupNode(VOID450);


                    adaptor.addChild(root_0, VOID450_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:623:1: boolean_type : BOOLEAN ;
    public final JVMWalker.boolean_type_return boolean_type() throws RecognitionException {
        JVMWalker.boolean_type_return retval = new JVMWalker.boolean_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BOOLEAN451=null;

        CommonTree BOOLEAN451_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:624:3: ( BOOLEAN )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:624:5: BOOLEAN
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            BOOLEAN451=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type3507); 
            BOOLEAN451_tree = (CommonTree)adaptor.dupNode(BOOLEAN451);


            adaptor.addChild(root_0, BOOLEAN451_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:627:1: numeric_type : ( floating_point_type | integral_type );
    public final JVMWalker.numeric_type_return numeric_type() throws RecognitionException {
        JVMWalker.numeric_type_return retval = new JVMWalker.numeric_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.floating_point_type_return floating_point_type452 =null;

        JVMWalker.integral_type_return integral_type453 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:628:3: ( floating_point_type | integral_type )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:628:5: floating_point_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_floating_point_type_in_numeric_type3520);
                    floating_point_type452=floating_point_type();

                    state._fsp--;

                    adaptor.addChild(root_0, floating_point_type452.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:629:5: integral_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integral_type_in_numeric_type3526);
                    integral_type453=integral_type();

                    state._fsp--;

                    adaptor.addChild(root_0, integral_type453.getTree());


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:632:1: integral_type : ( BYTE | SHORT | INT | LONG | CHAR );
    public final JVMWalker.integral_type_return integral_type() throws RecognitionException {
        JVMWalker.integral_type_return retval = new JVMWalker.integral_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set454=null;

        CommonTree set454_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:633:3: ( BYTE | SHORT | INT | LONG | CHAR )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set454=(CommonTree)input.LT(1);

            if ( input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
                input.consume();
                set454_tree = (CommonTree)adaptor.dupNode(set454);


                adaptor.addChild(root_0, set454_tree);

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:640:1: floating_point_type : ( FLOAT | DOUBLE );
    public final JVMWalker.floating_point_type_return floating_point_type() throws RecognitionException {
        JVMWalker.floating_point_type_return retval = new JVMWalker.floating_point_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set455=null;

        CommonTree set455_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:641:3: ( FLOAT | DOUBLE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set455=(CommonTree)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT ) {
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
    // $ANTLR end "floating_point_type"


    public static class literals_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literals"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:645:1: literals : ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER );
    public final JVMWalker.literals_return literals() throws RecognitionException {
        JVMWalker.literals_return retval = new JVMWalker.literals_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LONGLITERAL456=null;
        CommonTree INTLITERAL457=null;
        CommonTree FLOATLITERAL458=null;
        CommonTree DOUBLELITERAL459=null;
        CommonTree CHARLITERAL460=null;
        CommonTree STRINGLITERAL461=null;
        CommonTree BOOLEANLITERAL462=null;
        CommonTree MINUS463=null;
        CommonTree IDENTIFIER464=null;

        CommonTree LONGLITERAL456_tree=null;
        CommonTree INTLITERAL457_tree=null;
        CommonTree FLOATLITERAL458_tree=null;
        CommonTree DOUBLELITERAL459_tree=null;
        CommonTree CHARLITERAL460_tree=null;
        CommonTree STRINGLITERAL461_tree=null;
        CommonTree BOOLEANLITERAL462_tree=null;
        CommonTree MINUS463_tree=null;
        CommonTree IDENTIFIER464_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:646:3: ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:646:5: LONGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LONGLITERAL456=(CommonTree)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literals3595); 
                    LONGLITERAL456_tree = (CommonTree)adaptor.dupNode(LONGLITERAL456);


                    adaptor.addChild(root_0, LONGLITERAL456_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:647:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL457=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literals3601); 
                    INTLITERAL457_tree = (CommonTree)adaptor.dupNode(INTLITERAL457);


                    adaptor.addChild(root_0, INTLITERAL457_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:648:5: FLOATLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FLOATLITERAL458=(CommonTree)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literals3607); 
                    FLOATLITERAL458_tree = (CommonTree)adaptor.dupNode(FLOATLITERAL458);


                    adaptor.addChild(root_0, FLOATLITERAL458_tree);


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:649:5: DOUBLELITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DOUBLELITERAL459=(CommonTree)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literals3613); 
                    DOUBLELITERAL459_tree = (CommonTree)adaptor.dupNode(DOUBLELITERAL459);


                    adaptor.addChild(root_0, DOUBLELITERAL459_tree);


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:650:5: CHARLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CHARLITERAL460=(CommonTree)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literals3619); 
                    CHARLITERAL460_tree = (CommonTree)adaptor.dupNode(CHARLITERAL460);


                    adaptor.addChild(root_0, CHARLITERAL460_tree);


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:651:5: STRINGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    STRINGLITERAL461=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literals3625); 
                    STRINGLITERAL461_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL461);


                    adaptor.addChild(root_0, STRINGLITERAL461_tree);


                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:652:5: BOOLEANLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL462=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literals3631); 
                    BOOLEANLITERAL462_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL462);


                    adaptor.addChild(root_0, BOOLEANLITERAL462_tree);


                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:653:5: ( MINUS )? IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:653:5: ( MINUS )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==MINUS) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:653:5: MINUS
                            {
                            _last = (CommonTree)input.LT(1);
                            MINUS463=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_literals3637); 
                            MINUS463_tree = (CommonTree)adaptor.dupNode(MINUS463);


                            adaptor.addChild(root_0, MINUS463_tree);


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER464=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literals3640); 
                    IDENTIFIER464_tree = (CommonTree)adaptor.dupNode(IDENTIFIER464);


                    adaptor.addChild(root_0, IDENTIFIER464_tree);


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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:656:1: pc : INTLITERAL COLON ;
    public final JVMWalker.pc_return pc() throws RecognitionException {
        JVMWalker.pc_return retval = new JVMWalker.pc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL465=null;
        CommonTree COLON466=null;

        CommonTree INTLITERAL465_tree=null;
        CommonTree COLON466_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:657:3: ( INTLITERAL COLON )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMWalker.g:657:5: INTLITERAL COLON
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL465=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc3653); 
            INTLITERAL465_tree = (CommonTree)adaptor.dupNode(INTLITERAL465);


            adaptor.addChild(root_0, INTLITERAL465_tree);


            _last = (CommonTree)input.LT(1);
            COLON466=(CommonTree)match(input,COLON,FOLLOW_COLON_in_pc3655); 
            COLON466_tree = (CommonTree)adaptor.dupNode(COLON466);


            adaptor.addChild(root_0, COLON466_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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


 

    public static final BitSet FOLLOW_class_file_in_program64 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_CLASSFILE_in_class_file76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CFHEADER_in_class_file79 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_file_header_in_class_file81 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDefinition_in_class_file84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info160 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info187 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_HexDigits_in_checksum_file_info189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSDECL_in_classDefinition231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_classDefinition235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_classDefinition242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition244 = new BitSet(new long[]{0x0080000000200018L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeName_in_classDefinition250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_TPARAMETERS_in_classDefinition253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeParameters_in_classDefinition255 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEXTENDS_in_classDefinition260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CIMPLEMENTS_in_classDefinition267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_classDefinition290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_info_in_classDefinition292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPOOL_in_classDefinition312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_classDefinition334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classBody_in_classDefinition336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info420 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_minor_major_version_info_in_type_info426 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_flags_in_type_info432 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info438 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info445 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info451 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info457 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info463 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_deprecated_in_type_info469 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_synthetic_in_type_info475 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_scala_info_in_type_info481 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic499 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod531 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod533 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod535 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_sourcefile_info556 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ScalaSig_in_scalaSig_info571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scalaSig_info585 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scalaSig_info587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info609 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Scala_in_scala_info624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scala_info626 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scala_info628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scala_info630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info668 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_VMODIFIER_in_innerclass_info_line687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_innerclass_info_line689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_innerclass_info_line694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line696 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000045L});
    public static final BitSet FOLLOW_innerclass_info_data_in_innerclass_info_line700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INFODATA1_in_innerclass_info_data717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_data720 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFODATA2_in_innerclass_info_data728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_data731 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info757 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_minor_major_version_info759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_major_version_info761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Flag_in_flags782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessFlagList_in_flags784 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_IDENTIFIER_in_flagType817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_flagType823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info846 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem863 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList879 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign895 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_annotationValue_in_annotationAssign897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationValue910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationValue917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATIONBRACKETS_in_brackedAnnotationAssign930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign932 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList946 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue962 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations977 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations979 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations996 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1013 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_parameterVisibilityInfo1028 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1030 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1033 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1050 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1056 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1079 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool1081 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line1099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line1101 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyEntryDecl_in_classBody1123 = new BitSet(new long[]{0x0020000040000002L,0x0000000008000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_classBodyEntryDecl1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBodyEntryDecl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBodyEntryDecl1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELDDECL_in_fieldDefinition1175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_fieldDefinition1178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition1180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_fieldDefinition1185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition1187 = new BitSet(new long[]{0x0080000000000008L,0x0000000000000000L,0x0000000080020001L});
    public static final BitSet FOLLOW_RETVALUE_in_fieldDefinition1192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_fieldDefinition1194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_fieldDefinition1198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keywordAggregate_in_fieldDefinition1200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDVALUE_in_fieldDefinition1204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition1206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_fieldDefinition1223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition1225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_fieldDefinition1241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition1243 = new BitSet(new long[]{0x0000040400000008L,0x0014000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo1273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfo1275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flags_in_fieldInfo1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_fieldAdditionalInfo1294 = new BitSet(new long[]{0x0200010000082000L,0x0000000010040202L,0x0000000000000008L});
    public static final BitSet FOLLOW_literals_in_fieldAdditionalInfo1296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo1306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo1314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldAdditionalInfo1316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo1324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo1334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATICCTORDECL_in_staticCtorDefinition1421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_staticCtorDefinition1424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition1426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_staticCtorDefinition1431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition1433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_staticCtorDefinition1437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition1439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CTORDECL_in_ctorDefinition1462 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_ctorDefinition1465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition1467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERICDESC_in_ctorDefinition1472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_ctorDefinition1474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_ctorDefinition1479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeName_in_ctorDefinition1481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_ctorDefinition1487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition1489 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_ctorDefinition1518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition1520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_ctorDefinition1548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_ctorDefinition1550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_ctorDefinition1578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition1580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODDECL_in_methodDefinition1626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_methodDefinition1629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_methodDefinition1631 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_methodDefinition1636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition1638 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000045L});
    public static final BitSet FOLLOW_GENERICDESC_in_methodDefinition1643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_methodDefinition1645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETVALUE_in_methodDefinition1650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_methodDefinition1652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_methodDefinition1656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keywordAggregate_in_methodDefinition1658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_methodDefinition1664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClauseMethod_in_methodDefinition1666 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_methodDefinition1695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition1697 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_methodDefinition1725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_methodDefinition1727 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_methodDefinition1756 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition1758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STANDINTOKEN_in_methodInfo1800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo1802 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo1804 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfo1820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfo1831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfo1833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo1840 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1846 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo1852 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo1858 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfo1865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfo1868 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfo1876 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfo1885 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault1901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault1904 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_annotationValue_in_annotationDefault1906 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_methodSignatureInfo1923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMDESC_in_methodSignatureInfo1926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo1928 = new BitSet(new long[]{0x0000000000008008L,0x0000000000008102L});
    public static final BitSet FOLLOW_RETDESC_in_methodSignatureInfo1933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo1935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITARGUMENTS_in_arguments2026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_arguments2028 = new BitSet(new long[]{0x0000004000000008L});
    public static final BitSet FOLLOW_DOT_in_arguments2032 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments2034 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments2036 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_body2061 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_body2063 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Code_in_body2068 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_codeBlock_in_body2070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bodyExtension_in_body2073 = new BitSet(new long[]{0x0002000000000002L,0x0000000003800000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension2094 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension2097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension2105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension2108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension2117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension2120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension2128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension2131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension2139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension2141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension2149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension2151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARINFO_in_codeBlock2170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variables_in_codeBlock2172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_codeBlock2176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructionSet_in_codeBlock2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock2181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeLine_in_instructionSet2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaSwitch_in_instructionSet2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine2213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeLine2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine2218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand1_in_codeLine2220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine2225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeLine2227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd2244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd2246 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeBlockEnd2248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPINDEX_in_operand12265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_operand12272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_operand12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables2291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables2293 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_variable2309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable2311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable2313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_javaSwitch2330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch2333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_javaSwitch2335 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch2337 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch2340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pc_in_switchLine2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine2374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine2376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClause2396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_throwClause2398 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClauseMethod2415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod2417 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000102L});
    public static final BitSet FOLLOW_ETHEADER_in_exceptionTable2456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ETENTRY_in_exceptionTable2468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable2470 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2489 = new BitSet(new long[]{0x0100008008045000L,0x0080000000020042L,0x0000000040000000L});
    public static final BitSet FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntryValue2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntryValue2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable2534 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine2549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine2551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine2553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVHEADER_in_localVariableTable2576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVENTRY_in_localVariableTable2590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable2592 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine2609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine2613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine2615 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTHEADER_in_stackMapTypeTable2651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable2653 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable2655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable2657 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMTENTRY_in_stackMapTypeTable2661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable2663 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2678 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2684 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2695 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2697 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2706 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2708 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMHEADER_in_stackMapTable2729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable2731 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable2735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMENTRY_in_stackMapTable2739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable2741 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry2756 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry2758 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000200L});
    public static final BitSet FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry2760 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntryValue2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTTYPES_in_stackMapTableTypes2813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes2815 = new BitSet(new long[]{0x0100008000245008L,0x0080000000020042L,0x0000000040000000L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableType2835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableType2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject2850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList2886 = new BitSet(new long[]{0x0100008000045002L,0x0080000000020040L,0x0000000044000000L});
    public static final BitSet FOLLOW_combinedJavaType_in_type2899 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARRAYBRACKS_in_type2902 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACK_in_type2905 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type2907 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_combinedJavaType2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenceType_in_combinedJavaType2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITNAME_in_referenceType2941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType2943 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
    public static final BitSet FOLLOW_typeName_in_typeDeclSpecifier2958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPEARGS_in_typeDeclSpecifier2961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeArguments_in_typeDeclSpecifier2963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QualifiedType_in_typeName2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgumentList_in_typeArguments2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgument_in_typeArgumentList3003 = new BitSet(new long[]{0x0100008000045002L,0x0080040000020040L,0x0000000044000000L});
    public static final BitSet FOLLOW_type_in_typeArgument3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_typeArgument3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_wildcard3035 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wildcardBounds_in_wildcard3037 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_wildcardBounds3052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds3054 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_wildcardBounds3062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds3064 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters3077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeParameter3091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter3093 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_typeBound3108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_referenceType_in_typeBound3110 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor3127 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor3141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor3143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor3145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList3159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_UNITNAME_in_bytecodeReferenceType3173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType3175 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier3189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier3192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier3194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeTypeName3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList3233 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bytecodeWildcard3265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard3267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_bytecodeWildcardBounds3282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_bytecodeWildcardBounds3292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeType3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_bytecodeType3320 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType3339 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType3354 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType3370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType3372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList3410 = new BitSet(new long[]{0x0000000000008002L,0x8000004010008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleBytecodeTypeArgument3429 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleBytecodeTypeArgument3437 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_simpleBytecodeTypeArgument3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_keywordAggregate3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literals3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literals3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literals3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literals3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literals3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literals3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literals3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literals3637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literals3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc3653 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pc3655 = new BitSet(new long[]{0x0000000000000002L});

}