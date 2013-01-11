// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g 2013-01-11 04:03:25

  package bytecodeDeobfuscation;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JVMWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AND", "ARRAYBRACKS", "ASSIGN", "AnnotationAssign", "AnnotationDefault", "BANNOTATION", "BOOLEAN", "BOOLEANLITERAL", "BYTE", "BaseType", "CEXTENDS", "CFHEADER", "CHAR", "CHARLITERAL", "CIMPLEMENTS", "CLASS", "CLASSDECL", "CLASSFILE", "COLON", "COMMA", "COMMENT", "CONSTANT_TYPE_ASSIGNABLE", "CPINDEX", "CPOOL", "CTORDECL", "CharEscapeSequence", "CharUnicodeEscapeSequence", "Code", "Constant", "Constant_type", "DATE", "DEFAULT", "DOT", "DOUBLE", "DOUBLELITERAL", "DefaultValue", "Deprecated", "DoubleSuffix", "ETENTRY", "ETHEADER", "EXTENDS", "EnclosingMethod", "EscapeSequence", "ExceptionTable", "Exceptions", "Exponent", "FALSE", "FIELDDECL", "FIELDVALUE", "FINAL", "FLOAT", "FLOATLITERAL", "Flag", "FloatSuffix", "GENERICDESC", "HASH", "HexDigit", "HexDigits", "HexPrefix", "IDENTIFIER", "IMPLEMENTS", "INFODATA1", "INFODATA2", "INSTRUCTION", "INT", "INTERFACE", "INTERNALTYPE", "INTLITERAL", "InnerClasses", "IntDigit", "IntegerNumber", "LARGET", "LBRACE", "LBRACK", "LESST", "LONG", "LONGLITERAL", "LPAREN", "LVENTRY", "LVHEADER", "Letter", "LineNumberTable", "LocalVariableTable", "LocalVariableTypeTable", "LongSuffix", "MINUS", "MODIFIER", "Marker", "NATIVE", "NL", "NonIntegerNumber", "OPERAND", "Octal", "OctalEscape", "PARAMDESC", "PLUS", "PRIVATE", "PROTECTED", "PUBLIC", "QUESTION", "QUOTE", "QualifiedType", "RBRACE", "RBRACK", "RETDESC", "RETVALUE", "RPAREN", "RuntimeInvisibleAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleParameterAnnotations", "SEMI", "SHORT", "SLASH", "SMENTRY", "SMHEADER", "SMTENTRY", "SMTHEADER", "STANDINTOKEN", "STAR", "STATIC", "STATICCTORDECL", "STRICTFP", "STRINGLITERAL", "SUPER", "SWITCH", "SYNCHRONIZED", "Scala", "ScalaSig", "Signature", "SourceFile", "StackMap", "StackMapTable", "Synthetic", "THROWCLAUSE", "THROWS", "TPARAMETERS", "TRANSIENT", "TRUE", "TYPEARGS", "Throws", "UNDERSCORE", "UNITARGUMENTS", "UNITATTR", "UNITBODY", "UNITHEADER", "UNITNAME", "UnicodeEscapeSequence", "VARINFO", "VMODIFIER", "VOID", "VOLATILE", "VoidType", "WINDOWSPATH", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AND=5;
    public static final int ARRAYBRACKS=6;
    public static final int ASSIGN=7;
    public static final int AnnotationAssign=8;
    public static final int AnnotationDefault=9;
    public static final int BANNOTATION=10;
    public static final int BOOLEAN=11;
    public static final int BOOLEANLITERAL=12;
    public static final int BYTE=13;
    public static final int BaseType=14;
    public static final int CEXTENDS=15;
    public static final int CFHEADER=16;
    public static final int CHAR=17;
    public static final int CHARLITERAL=18;
    public static final int CIMPLEMENTS=19;
    public static final int CLASS=20;
    public static final int CLASSDECL=21;
    public static final int CLASSFILE=22;
    public static final int COLON=23;
    public static final int COMMA=24;
    public static final int COMMENT=25;
    public static final int CONSTANT_TYPE_ASSIGNABLE=26;
    public static final int CPINDEX=27;
    public static final int CPOOL=28;
    public static final int CTORDECL=29;
    public static final int CharEscapeSequence=30;
    public static final int CharUnicodeEscapeSequence=31;
    public static final int Code=32;
    public static final int Constant=33;
    public static final int Constant_type=34;
    public static final int DATE=35;
    public static final int DEFAULT=36;
    public static final int DOT=37;
    public static final int DOUBLE=38;
    public static final int DOUBLELITERAL=39;
    public static final int DefaultValue=40;
    public static final int Deprecated=41;
    public static final int DoubleSuffix=42;
    public static final int ETENTRY=43;
    public static final int ETHEADER=44;
    public static final int EXTENDS=45;
    public static final int EnclosingMethod=46;
    public static final int EscapeSequence=47;
    public static final int ExceptionTable=48;
    public static final int Exceptions=49;
    public static final int Exponent=50;
    public static final int FALSE=51;
    public static final int FIELDDECL=52;
    public static final int FIELDVALUE=53;
    public static final int FINAL=54;
    public static final int FLOAT=55;
    public static final int FLOATLITERAL=56;
    public static final int Flag=57;
    public static final int FloatSuffix=58;
    public static final int GENERICDESC=59;
    public static final int HASH=60;
    public static final int HexDigit=61;
    public static final int HexDigits=62;
    public static final int HexPrefix=63;
    public static final int IDENTIFIER=64;
    public static final int IMPLEMENTS=65;
    public static final int INFODATA1=66;
    public static final int INFODATA2=67;
    public static final int INSTRUCTION=68;
    public static final int INT=69;
    public static final int INTERFACE=70;
    public static final int INTERNALTYPE=71;
    public static final int INTLITERAL=72;
    public static final int InnerClasses=73;
    public static final int IntDigit=74;
    public static final int IntegerNumber=75;
    public static final int LARGET=76;
    public static final int LBRACE=77;
    public static final int LBRACK=78;
    public static final int LESST=79;
    public static final int LONG=80;
    public static final int LONGLITERAL=81;
    public static final int LPAREN=82;
    public static final int LVENTRY=83;
    public static final int LVHEADER=84;
    public static final int Letter=85;
    public static final int LineNumberTable=86;
    public static final int LocalVariableTable=87;
    public static final int LocalVariableTypeTable=88;
    public static final int LongSuffix=89;
    public static final int MINUS=90;
    public static final int MODIFIER=91;
    public static final int Marker=92;
    public static final int NATIVE=93;
    public static final int NL=94;
    public static final int NonIntegerNumber=95;
    public static final int OPERAND=96;
    public static final int Octal=97;
    public static final int OctalEscape=98;
    public static final int PARAMDESC=99;
    public static final int PLUS=100;
    public static final int PRIVATE=101;
    public static final int PROTECTED=102;
    public static final int PUBLIC=103;
    public static final int QUESTION=104;
    public static final int QUOTE=105;
    public static final int QualifiedType=106;
    public static final int RBRACE=107;
    public static final int RBRACK=108;
    public static final int RETDESC=109;
    public static final int RETVALUE=110;
    public static final int RPAREN=111;
    public static final int RuntimeInvisibleAnnotations=112;
    public static final int RuntimeInvisibleParameterAnnotations=113;
    public static final int RuntimeVisibleAnnotations=114;
    public static final int RuntimeVisibleParameterAnnotations=115;
    public static final int SEMI=116;
    public static final int SHORT=117;
    public static final int SLASH=118;
    public static final int SMENTRY=119;
    public static final int SMHEADER=120;
    public static final int SMTENTRY=121;
    public static final int SMTHEADER=122;
    public static final int STANDINTOKEN=123;
    public static final int STAR=124;
    public static final int STATIC=125;
    public static final int STATICCTORDECL=126;
    public static final int STRICTFP=127;
    public static final int STRINGLITERAL=128;
    public static final int SUPER=129;
    public static final int SWITCH=130;
    public static final int SYNCHRONIZED=131;
    public static final int Scala=132;
    public static final int ScalaSig=133;
    public static final int Signature=134;
    public static final int SourceFile=135;
    public static final int StackMap=136;
    public static final int StackMapTable=137;
    public static final int Synthetic=138;
    public static final int THROWCLAUSE=139;
    public static final int THROWS=140;
    public static final int TPARAMETERS=141;
    public static final int TRANSIENT=142;
    public static final int TRUE=143;
    public static final int TYPEARGS=144;
    public static final int Throws=145;
    public static final int UNDERSCORE=146;
    public static final int UNITARGUMENTS=147;
    public static final int UNITATTR=148;
    public static final int UNITBODY=149;
    public static final int UNITHEADER=150;
    public static final int UNITNAME=151;
    public static final int UnicodeEscapeSequence=152;
    public static final int VARINFO=153;
    public static final int VMODIFIER=154;
    public static final int VOID=155;
    public static final int VOLATILE=156;
    public static final int VoidType=157;
    public static final int WINDOWSPATH=158;
    public static final int WS=159;

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
    public String getGrammarFileName() { return "D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g"; }


    public static class program_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:19:1: program : ( class_file )* ;
    public final JVMWalker.program_return program() throws RecognitionException {
        JVMWalker.program_return retval = new JVMWalker.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.class_file_return class_file1 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:19:9: ( ( class_file )* )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:19:11: ( class_file )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:19:11: ( class_file )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CLASSFILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:19:11: class_file
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:21:1: class_file : ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:22:3: ( ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:22:5: ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
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


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_class_file_header_in_class_file81);
                class_file_header4=class_file_header();

                state._fsp--;

                adaptor.addChild(root_2, class_file_header4.getTree());


                match(input, Token.UP, null); 
            }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:26:1: class_file_header : ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )* ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:27:3: ( ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )* )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:27:5: ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:27:5: ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENTIFIER) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==DOWN) ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==WINDOWSPATH) ) {
                            alt2=1;
                        }
                        else if ( (LA2_3==IDENTIFIER) ) {
                            switch ( input.LA(4) ) {
                            case DATE:
                                {
                                alt2=2;
                                }
                                break;
                            case HexDigits:
                                {
                                alt2=3;
                                }
                                break;
                            case STRINGLITERAL:
                                {
                                alt2=4;
                                }
                                break;

                            }

                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:27:6: class_file_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_class_file_info_in_class_file_header104);
            	    class_file_info6=class_file_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, class_file_info6.getTree());


            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:28:5: modified_file_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_modified_file_info_in_class_file_header110);
            	    modified_file_info7=modified_file_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, modified_file_info7.getTree());


            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:29:5: checksum_file_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_checksum_file_info_in_class_file_header116);
            	    checksum_file_info8=checksum_file_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, checksum_file_info8.getTree());


            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:30:5: compiled_file_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_compiled_file_info_in_class_file_header122);
            	    compiled_file_info9=compiled_file_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compiled_file_info9.getTree());


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "class_file_header"


    public static class class_file_info_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_file_info"
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:33:1: class_file_info : ^( IDENTIFIER WINDOWSPATH ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:34:3: ( ^( IDENTIFIER WINDOWSPATH ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:34:5: ^( IDENTIFIER WINDOWSPATH )
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:37:1: modified_file_info : ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:38:3: ( ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:38:5: ^( IDENTIFIER IDENTIFIER DATE IDENTIFIER INTLITERAL IDENTIFIER )
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:41:1: checksum_file_info : ^( IDENTIFIER IDENTIFIER HexDigits ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:42:3: ( ^( IDENTIFIER IDENTIFIER HexDigits ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:42:5: ^( IDENTIFIER IDENTIFIER HexDigits )
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:45:1: compiled_file_info : ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:46:3: ( ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:46:5: ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:53:1: classDefinition : ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) ;
    public final JVMWalker.classDefinition_return classDefinition() throws RecognitionException {
        JVMWalker.classDefinition_return retval = new JVMWalker.classDefinition_return();
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
        JVMWalker.class_visual_modifier_return class_visual_modifier26 =null;

        JVMWalker.class_modifier_return class_modifier28 =null;

        JVMWalker.typeName_return typeName29 =null;

        JVMWalker.typeParameters_return typeParameters31 =null;

        JVMWalker.typeList_return typeList33 =null;

        JVMWalker.typeList_return typeList35 =null;

        JVMWalker.type_info_return type_info37 =null;

        JVMWalker.constant_pool_return constant_pool39 =null;

        JVMWalker.classBody_return classBody41 =null;


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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:3: ( ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:5: ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) )
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
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:30: ( class_visual_modifier )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:30: class_visual_modifier
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
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:65: ( class_modifier )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ABSTRACT||LA4_0==CLASS||LA4_0==FINAL||LA4_0==INTERFACE) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:65: class_modifier
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
            pushFollow(FOLLOW_typeName_in_classDefinition249);
            typeName29=typeName();

            state._fsp--;

            adaptor.addChild(root_1, typeName29.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TPARAMETERS30=(CommonTree)match(input,TPARAMETERS,FOLLOW_TPARAMETERS_in_classDefinition252); 
            TPARAMETERS30_tree = (CommonTree)adaptor.dupNode(TPARAMETERS30);


            root_2 = (CommonTree)adaptor.becomeRoot(TPARAMETERS30_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:105: ( typeParameters )?
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BaseType||LA5_0==Constant_type||LA5_0==IDENTIFIER||LA5_0==VoidType) ) {
                    alt5=1;
                }
                switch (alt5) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:105: typeParameters
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeParameters_in_classDefinition254);
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
            CEXTENDS32=(CommonTree)match(input,CEXTENDS,FOLLOW_CEXTENDS_in_classDefinition259); 
            CEXTENDS32_tree = (CommonTree)adaptor.dupNode(CEXTENDS32);


            root_2 = (CommonTree)adaptor.becomeRoot(CEXTENDS32_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:133: ( typeList )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOLEAN||LA6_0==BYTE||LA6_0==CHAR||LA6_0==DOUBLE||LA6_0==FLOAT||LA6_0==INT||LA6_0==LONG||LA6_0==SHORT||LA6_0==UNITNAME||LA6_0==VOID) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:133: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_classDefinition261);
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
            CIMPLEMENTS34=(CommonTree)match(input,CIMPLEMENTS,FOLLOW_CIMPLEMENTS_in_classDefinition266); 
            CIMPLEMENTS34_tree = (CommonTree)adaptor.dupNode(CIMPLEMENTS34);


            root_2 = (CommonTree)adaptor.becomeRoot(CIMPLEMENTS34_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:158: ( typeList )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLEAN||LA7_0==BYTE||LA7_0==CHAR||LA7_0==DOUBLE||LA7_0==FLOAT||LA7_0==INT||LA7_0==LONG||LA7_0==SHORT||LA7_0==UNITNAME||LA7_0==VOID) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:54:158: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_classDefinition268);
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
            UNITHEADER36=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_classDefinition289); 
            UNITHEADER36_tree = (CommonTree)adaptor.dupNode(UNITHEADER36);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER36_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_info_in_classDefinition291);
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
            CPOOL38=(CommonTree)match(input,CPOOL,FOLLOW_CPOOL_in_classDefinition311); 
            CPOOL38_tree = (CommonTree)adaptor.dupNode(CPOOL38);


            root_2 = (CommonTree)adaptor.becomeRoot(CPOOL38_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_constant_pool_in_classDefinition313);
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
            UNITBODY40=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_classDefinition333); 
            UNITBODY40_tree = (CommonTree)adaptor.dupNode(UNITBODY40);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY40_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:57:28: ( classBody )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==FIELDDECL||LA8_0==STATICCTORDECL) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:57:28: classBody
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_classBody_in_classDefinition335);
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
        }
        return retval;
    }
    // $ANTLR end "classDefinition"


    public static class class_visual_modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_visual_modifier"
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:61:1: class_visual_modifier : PUBLIC ;
    public final JVMWalker.class_visual_modifier_return class_visual_modifier() throws RecognitionException {
        JVMWalker.class_visual_modifier_return retval = new JVMWalker.class_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PUBLIC42=null;

        CommonTree PUBLIC42_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:62:3: ( PUBLIC )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:62:5: PUBLIC
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            PUBLIC42=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier372); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:65:1: class_modifier : ( ABSTRACT | FINAL | INTERFACE | CLASS );
    public final JVMWalker.class_modifier_return class_modifier() throws RecognitionException {
        JVMWalker.class_modifier_return retval = new JVMWalker.class_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set43=null;

        CommonTree set43_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:66:3: ( ABSTRACT | FINAL | INTERFACE | CLASS )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:73:1: type_info : ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ ;
    public final JVMWalker.type_info_return type_info() throws RecognitionException {
        JVMWalker.type_info_return retval = new JVMWalker.type_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.sourcefile_info_return sourcefile_info44 =null;

        JVMWalker.minor_major_version_info_return minor_major_version_info45 =null;

        JVMWalker.flags_return flags46 =null;

        JVMWalker.scalaSig_info_return scalaSig_info47 =null;

        JVMWalker.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info48 =null;

        JVMWalker.innerclass_info_return innerclass_info49 =null;

        JVMWalker.enclosingMethod_return enclosingMethod50 =null;

        JVMWalker.signature_info_addition_return signature_info_addition51 =null;

        JVMWalker.deprecated_return deprecated52 =null;

        JVMWalker.synthetic_return synthetic53 =null;

        JVMWalker.scala_info_return scala_info54 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:74:3: ( ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:74:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:74:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:74:6: sourcefile_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sourcefile_info_in_type_info421);
            	    sourcefile_info44=sourcefile_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sourcefile_info44.getTree());


            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:75:5: minor_major_version_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_minor_major_version_info_in_type_info427);
            	    minor_major_version_info45=minor_major_version_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minor_major_version_info45.getTree());


            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:76:5: flags
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_flags_in_type_info433);
            	    flags46=flags();

            	    state._fsp--;

            	    adaptor.addChild(root_0, flags46.getTree());


            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:77:5: scalaSig_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_scalaSig_info_in_type_info439);
            	    scalaSig_info47=scalaSig_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, scalaSig_info47.getTree());


            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:78:5: runtimeVisibleAnnotations_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_type_info446);
            	    runtimeVisibleAnnotations_info48=runtimeVisibleAnnotations_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleAnnotations_info48.getTree());


            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:79:5: innerclass_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_innerclass_info_in_type_info452);
            	    innerclass_info49=innerclass_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, innerclass_info49.getTree());


            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:80:5: enclosingMethod
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_enclosingMethod_in_type_info458);
            	    enclosingMethod50=enclosingMethod();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enclosingMethod50.getTree());


            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:81:5: signature_info_addition
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_signature_info_addition_in_type_info464);
            	    signature_info_addition51=signature_info_addition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signature_info_addition51.getTree());


            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:82:5: deprecated
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_deprecated_in_type_info470);
            	    deprecated52=deprecated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, deprecated52.getTree());


            	    }
            	    break;
            	case 10 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:83:5: synthetic
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_synthetic_in_type_info476);
            	    synthetic53=synthetic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, synthetic53.getTree());


            	    }
            	    break;
            	case 11 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:84:5: scala_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_scala_info_in_type_info482);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:87:1: synthetic : ^( Synthetic BOOLEANLITERAL ) ;
    public final JVMWalker.synthetic_return synthetic() throws RecognitionException {
        JVMWalker.synthetic_return retval = new JVMWalker.synthetic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Synthetic55=null;
        CommonTree BOOLEANLITERAL56=null;

        CommonTree Synthetic55_tree=null;
        CommonTree BOOLEANLITERAL56_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:88:3: ( ^( Synthetic BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:88:5: ^( Synthetic BOOLEANLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Synthetic55=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_synthetic498); 
            Synthetic55_tree = (CommonTree)adaptor.dupNode(Synthetic55);


            root_1 = (CommonTree)adaptor.becomeRoot(Synthetic55_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            BOOLEANLITERAL56=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_synthetic500); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:91:1: deprecated : ^( Deprecated BOOLEANLITERAL ) ;
    public final JVMWalker.deprecated_return deprecated() throws RecognitionException {
        JVMWalker.deprecated_return retval = new JVMWalker.deprecated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Deprecated57=null;
        CommonTree BOOLEANLITERAL58=null;

        CommonTree Deprecated57_tree=null;
        CommonTree BOOLEANLITERAL58_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:92:3: ( ^( Deprecated BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:92:5: ^( Deprecated BOOLEANLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Deprecated57=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_deprecated515); 
            Deprecated57_tree = (CommonTree)adaptor.dupNode(Deprecated57);


            root_1 = (CommonTree)adaptor.becomeRoot(Deprecated57_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            BOOLEANLITERAL58=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_deprecated517); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:95:1: enclosingMethod : ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) ;
    public final JVMWalker.enclosingMethod_return enclosingMethod() throws RecognitionException {
        JVMWalker.enclosingMethod_return retval = new JVMWalker.enclosingMethod_return();
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:96:3: ( ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:96:5: ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EnclosingMethod59=(CommonTree)match(input,EnclosingMethod,FOLLOW_EnclosingMethod_in_enclosingMethod532); 
            EnclosingMethod59_tree = (CommonTree)adaptor.dupNode(EnclosingMethod59);


            root_1 = (CommonTree)adaptor.becomeRoot(EnclosingMethod59_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX60=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod534); 
            CPINDEX60_tree = (CommonTree)adaptor.dupNode(CPINDEX60);


            adaptor.addChild(root_1, CPINDEX60_tree);


            _last = (CommonTree)input.LT(1);
            DOT61=(CommonTree)match(input,DOT,FOLLOW_DOT_in_enclosingMethod536); 
            DOT61_tree = (CommonTree)adaptor.dupNode(DOT61);


            adaptor.addChild(root_1, DOT61_tree);


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:96:35: ( CPINDEX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CPINDEX) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:96:35: CPINDEX
                    {
                    _last = (CommonTree)input.LT(1);
                    CPINDEX62=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod538); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:99:1: sourcefile_info : ^( SourceFile STRINGLITERAL ) ;
    public final JVMWalker.sourcefile_info_return sourcefile_info() throws RecognitionException {
        JVMWalker.sourcefile_info_return retval = new JVMWalker.sourcefile_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SourceFile63=null;
        CommonTree STRINGLITERAL64=null;

        CommonTree SourceFile63_tree=null;
        CommonTree STRINGLITERAL64_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:100:3: ( ^( SourceFile STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:100:5: ^( SourceFile STRINGLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SourceFile63=(CommonTree)match(input,SourceFile,FOLLOW_SourceFile_in_sourcefile_info555); 
            SourceFile63_tree = (CommonTree)adaptor.dupNode(SourceFile63);


            root_1 = (CommonTree)adaptor.becomeRoot(SourceFile63_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            STRINGLITERAL64=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_sourcefile_info557); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:103:1: scalaSig_info : ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) ;
    public final JVMWalker.scalaSig_info_return scalaSig_info() throws RecognitionException {
        JVMWalker.scalaSig_info_return retval = new JVMWalker.scalaSig_info_return();
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:104:3: ( ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:104:5: ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ScalaSig65=(CommonTree)match(input,ScalaSig,FOLLOW_ScalaSig_in_scalaSig_info572); 
            ScalaSig65_tree = (CommonTree)adaptor.dupNode(ScalaSig65);


            root_1 = (CommonTree)adaptor.becomeRoot(ScalaSig65_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER66=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scalaSig_info586); 
            IDENTIFIER66_tree = (CommonTree)adaptor.dupNode(IDENTIFIER66);


            adaptor.addChild(root_1, IDENTIFIER66_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN67=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_scalaSig_info588); 
            ASSIGN67_tree = (CommonTree)adaptor.dupNode(ASSIGN67);


            adaptor.addChild(root_1, ASSIGN67_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL68=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info590); 
            INTLITERAL68_tree = (CommonTree)adaptor.dupNode(INTLITERAL68);


            adaptor.addChild(root_1, INTLITERAL68_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL69=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info606); 
            INTLITERAL69_tree = (CommonTree)adaptor.dupNode(INTLITERAL69);


            adaptor.addChild(root_1, INTLITERAL69_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL70=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info608); 
            INTLITERAL70_tree = (CommonTree)adaptor.dupNode(INTLITERAL70);


            adaptor.addChild(root_1, INTLITERAL70_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL71=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info610); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:109:1: scala_info : ^( Scala IDENTIFIER ASSIGN INTLITERAL ) ;
    public final JVMWalker.scala_info_return scala_info() throws RecognitionException {
        JVMWalker.scala_info_return retval = new JVMWalker.scala_info_return();
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:110:3: ( ^( Scala IDENTIFIER ASSIGN INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:110:5: ^( Scala IDENTIFIER ASSIGN INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Scala72=(CommonTree)match(input,Scala,FOLLOW_Scala_in_scala_info625); 
            Scala72_tree = (CommonTree)adaptor.dupNode(Scala72);


            root_1 = (CommonTree)adaptor.becomeRoot(Scala72_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER73=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scala_info627); 
            IDENTIFIER73_tree = (CommonTree)adaptor.dupNode(IDENTIFIER73);


            adaptor.addChild(root_1, IDENTIFIER73_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN74=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_scala_info629); 
            ASSIGN74_tree = (CommonTree)adaptor.dupNode(ASSIGN74);


            adaptor.addChild(root_1, ASSIGN74_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL75=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scala_info631); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:113:1: signature_info_addition : ^( Signature ( CPINDEX )? ) ;
    public final JVMWalker.signature_info_addition_return signature_info_addition() throws RecognitionException {
        JVMWalker.signature_info_addition_return retval = new JVMWalker.signature_info_addition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature76=null;
        CommonTree CPINDEX77=null;

        CommonTree Signature76_tree=null;
        CommonTree CPINDEX77_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:114:3: ( ^( Signature ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:114:5: ^( Signature ( CPINDEX )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature76=(CommonTree)match(input,Signature,FOLLOW_Signature_in_signature_info_addition649); 
            Signature76_tree = (CommonTree)adaptor.dupNode(Signature76);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature76_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:114:17: ( CPINDEX )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CPINDEX) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:114:17: CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        CPINDEX77=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_signature_info_addition651); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:117:1: innerclass_info : ^( InnerClasses ( innerclass_info_line )+ ) ;
    public final JVMWalker.innerclass_info_return innerclass_info() throws RecognitionException {
        JVMWalker.innerclass_info_return retval = new JVMWalker.innerclass_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree InnerClasses78=null;
        JVMWalker.innerclass_info_line_return innerclass_info_line79 =null;


        CommonTree InnerClasses78_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:118:3: ( ^( InnerClasses ( innerclass_info_line )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:118:5: ^( InnerClasses ( innerclass_info_line )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            InnerClasses78=(CommonTree)match(input,InnerClasses,FOLLOW_InnerClasses_in_innerclass_info667); 
            InnerClasses78_tree = (CommonTree)adaptor.dupNode(InnerClasses78);


            root_1 = (CommonTree)adaptor.becomeRoot(InnerClasses78_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:118:20: ( innerclass_info_line )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:118:20: innerclass_info_line
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_innerclass_info_line_in_innerclass_info669);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:121:1: innerclass_info_line : ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data ;
    public final JVMWalker.innerclass_info_line_return innerclass_info_line() throws RecognitionException {
        JVMWalker.innerclass_info_line_return retval = new JVMWalker.innerclass_info_line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VMODIFIER80=null;
        CommonTree MODIFIER82=null;
        JVMWalker.method_visual_modifier_return method_visual_modifier81 =null;

        JVMWalker.method_modifier_return method_modifier83 =null;

        JVMWalker.innerclass_info_data_return innerclass_info_data84 =null;


        CommonTree VMODIFIER80_tree=null;
        CommonTree MODIFIER82_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:122:3: ( ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:122:6: ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER80=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_innerclass_info_line688); 
            VMODIFIER80_tree = (CommonTree)adaptor.dupNode(VMODIFIER80);


            root_1 = (CommonTree)adaptor.becomeRoot(VMODIFIER80_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:122:18: ( method_visual_modifier )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= PRIVATE && LA13_0 <= PUBLIC)) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:122:18: method_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_method_visual_modifier_in_innerclass_info_line690);
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
            MODIFIER82=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_innerclass_info_line695); 
            MODIFIER82_tree = (CommonTree)adaptor.dupNode(MODIFIER82);


            root_1 = (CommonTree)adaptor.becomeRoot(MODIFIER82_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:122:54: ( method_modifier )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ABSTRACT||LA14_0==FINAL||LA14_0==NATIVE||LA14_0==STATIC||LA14_0==STRICTFP||LA14_0==SYNCHRONIZED) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:122:54: method_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_method_modifier_in_innerclass_info_line697);
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
            pushFollow(FOLLOW_innerclass_info_data_in_innerclass_info_line701);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:125:1: innerclass_info_data : ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) ) ;
    public final JVMWalker.innerclass_info_data_return innerclass_info_data() throws RecognitionException {
        JVMWalker.innerclass_info_data_return retval = new JVMWalker.innerclass_info_data_return();
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:126:3: ( ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:126:5: ^( CPINDEX ^( INFODATA1 ( ASSIGN CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER CPINDEX )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX85=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data715); 
            CPINDEX85_tree = (CommonTree)adaptor.dupNode(CPINDEX85);


            root_1 = (CommonTree)adaptor.becomeRoot(CPINDEX85_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INFODATA186=(CommonTree)match(input,INFODATA1,FOLLOW_INFODATA1_in_innerclass_info_data718); 
            INFODATA186_tree = (CommonTree)adaptor.dupNode(INFODATA186);


            root_2 = (CommonTree)adaptor.becomeRoot(INFODATA186_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:126:27: ( ASSIGN CPINDEX )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ASSIGN) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:126:28: ASSIGN CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        ASSIGN87=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_innerclass_info_data721); 
                        ASSIGN87_tree = (CommonTree)adaptor.dupNode(ASSIGN87);


                        adaptor.addChild(root_2, ASSIGN87_tree);


                        _last = (CommonTree)input.LT(1);
                        CPINDEX88=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data723); 
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
            INFODATA289=(CommonTree)match(input,INFODATA2,FOLLOW_INFODATA2_in_innerclass_info_data729); 
            INFODATA289_tree = (CommonTree)adaptor.dupNode(INFODATA289);


            root_2 = (CommonTree)adaptor.becomeRoot(INFODATA289_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:126:58: ( IDENTIFIER CPINDEX )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==IDENTIFIER) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:126:59: IDENTIFIER CPINDEX
                        {
                        _last = (CommonTree)input.LT(1);
                        IDENTIFIER90=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_data732); 
                        IDENTIFIER90_tree = (CommonTree)adaptor.dupNode(IDENTIFIER90);


                        adaptor.addChild(root_2, IDENTIFIER90_tree);


                        _last = (CommonTree)input.LT(1);
                        CPINDEX91=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data734); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:129:1: minor_major_version_info : ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) ;
    public final JVMWalker.minor_major_version_info_return minor_major_version_info() throws RecognitionException {
        JVMWalker.minor_major_version_info_return retval = new JVMWalker.minor_major_version_info_return();
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:130:3: ( ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:130:5: ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER92=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info756); 
            IDENTIFIER92_tree = (CommonTree)adaptor.dupNode(IDENTIFIER92);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER92_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER93=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info758); 
            IDENTIFIER93_tree = (CommonTree)adaptor.dupNode(IDENTIFIER93);


            adaptor.addChild(root_1, IDENTIFIER93_tree);


            _last = (CommonTree)input.LT(1);
            COLON94=(CommonTree)match(input,COLON,FOLLOW_COLON_in_minor_major_version_info760); 
            COLON94_tree = (CommonTree)adaptor.dupNode(COLON94);


            adaptor.addChild(root_1, COLON94_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL95=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_minor_major_version_info762); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:133:1: flags : ^( Flag ( accessFlagList )? ) ;
    public final JVMWalker.flags_return flags() throws RecognitionException {
        JVMWalker.flags_return retval = new JVMWalker.flags_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Flag96=null;
        JVMWalker.accessFlagList_return accessFlagList97 =null;


        CommonTree Flag96_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:134:3: ( ^( Flag ( accessFlagList )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:134:5: ^( Flag ( accessFlagList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Flag96=(CommonTree)match(input,Flag,FOLLOW_Flag_in_flags783); 
            Flag96_tree = (CommonTree)adaptor.dupNode(Flag96);


            root_1 = (CommonTree)adaptor.becomeRoot(Flag96_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:134:12: ( accessFlagList )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IDENTIFIER||LA17_0==INTLITERAL) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:134:12: accessFlagList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_accessFlagList_in_flags785);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:137:1: accessFlagList : ( flagType )+ ;
    public final JVMWalker.accessFlagList_return accessFlagList() throws RecognitionException {
        JVMWalker.accessFlagList_return retval = new JVMWalker.accessFlagList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.flagType_return flagType98 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:138:3: ( ( flagType )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:138:5: ( flagType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:138:5: ( flagType )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:138:5: flagType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_flagType_in_accessFlagList802);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:141:1: flagType : (id= IDENTIFIER | INTLITERAL );
    public final JVMWalker.flagType_return flagType() throws RecognitionException {
        JVMWalker.flagType_return retval = new JVMWalker.flagType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree id=null;
        CommonTree INTLITERAL99=null;

        CommonTree id_tree=null;
        CommonTree INTLITERAL99_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:142:3: (id= IDENTIFIER | INTLITERAL )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:142:5: id= IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_flagType818); 
                    id_tree = (CommonTree)adaptor.dupNode(id);


                    adaptor.addChild(root_0, id_tree);


                    System.out.println("Id: '"+(id!=null?id.getText():null)+"'");

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:143:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL99=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_flagType826); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:150:1: runtimeVisibleAnnotations_info : ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) ;
    public final JVMWalker.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        JVMWalker.runtimeVisibleAnnotations_info_return retval = new JVMWalker.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RuntimeVisibleAnnotations100=null;
        JVMWalker.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem101 =null;


        CommonTree RuntimeVisibleAnnotations100_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:151:3: ( ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:151:5: ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeVisibleAnnotations100=(CommonTree)match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info847); 
            RuntimeVisibleAnnotations100_tree = (CommonTree)adaptor.dupNode(RuntimeVisibleAnnotations100);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeVisibleAnnotations100_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:151:33: ( runtimeVisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:151:33: runtimeVisibleAnnotationsItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info849);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:153:1: runtimeVisibleAnnotationsItem : ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMWalker.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        JVMWalker.runtimeVisibleAnnotationsItem_return retval = new JVMWalker.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX102=null;
        JVMWalker.pc_return pc103 =null;

        JVMWalker.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList104 =null;


        CommonTree CPINDEX102_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:154:3: ( ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:154:5: ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CPINDEX102=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem864); 
            CPINDEX102_tree = (CommonTree)adaptor.dupNode(CPINDEX102);


            root_1 = (CommonTree)adaptor.becomeRoot(CPINDEX102_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem866);
            pc103=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc103.getTree());


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:154:18: ( runtimeVisibleAnnotationAssignList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ASSIGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:154:18: runtimeVisibleAnnotationAssignList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem868);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:156:1: runtimeVisibleAnnotationAssignList : ( annotationAssign )+ ;
    public final JVMWalker.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        JVMWalker.runtimeVisibleAnnotationAssignList_return retval = new JVMWalker.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.annotationAssign_return annotationAssign105 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:157:3: ( ( annotationAssign )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:157:5: ( annotationAssign )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:157:5: ( annotationAssign )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:157:5: annotationAssign
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList882);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:159:1: annotationAssign : ^( ASSIGN CPINDEX annotationValue ) ;
    public final JVMWalker.annotationAssign_return annotationAssign() throws RecognitionException {
        JVMWalker.annotationAssign_return retval = new JVMWalker.annotationAssign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN106=null;
        CommonTree CPINDEX107=null;
        JVMWalker.annotationValue_return annotationValue108 =null;


        CommonTree ASSIGN106_tree=null;
        CommonTree CPINDEX107_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:160:3: ( ^( ASSIGN CPINDEX annotationValue ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:160:5: ^( ASSIGN CPINDEX annotationValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN106=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign896); 
            ASSIGN106_tree = (CommonTree)adaptor.dupNode(ASSIGN106);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN106_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX107=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign898); 
            CPINDEX107_tree = (CommonTree)adaptor.dupNode(CPINDEX107);


            adaptor.addChild(root_1, CPINDEX107_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationValue_in_annotationAssign900);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:162:1: annotationValue : ( brackedAnnotationAssign | AnnotationAssign );
    public final JVMWalker.annotationValue_return annotationValue() throws RecognitionException {
        JVMWalker.annotationValue_return retval = new JVMWalker.annotationValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationAssign110=null;
        JVMWalker.brackedAnnotationAssign_return brackedAnnotationAssign109 =null;


        CommonTree AnnotationAssign110_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:163:3: ( brackedAnnotationAssign | AnnotationAssign )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:163:5: brackedAnnotationAssign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationValue913);
                    brackedAnnotationAssign109=brackedAnnotationAssign();

                    state._fsp--;

                    adaptor.addChild(root_0, brackedAnnotationAssign109.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:164:5: AnnotationAssign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    AnnotationAssign110=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationValue920); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:166:1: brackedAnnotationAssign : ( brackedAnnotationAssignList )? ;
    public final JVMWalker.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        JVMWalker.brackedAnnotationAssign_return retval = new JVMWalker.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.brackedAnnotationAssignList_return brackedAnnotationAssignList111 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:167:3: ( ( brackedAnnotationAssignList )? )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:167:5: ( brackedAnnotationAssignList )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:167:5: ( brackedAnnotationAssignList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==AnnotationAssign) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:167:5: brackedAnnotationAssignList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign932);
                    brackedAnnotationAssignList111=brackedAnnotationAssignList();

                    state._fsp--;

                    adaptor.addChild(root_0, brackedAnnotationAssignList111.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:169:1: brackedAnnotationAssignList : ( brackedAnnotationAssignValue )+ ;
    public final JVMWalker.brackedAnnotationAssignList_return brackedAnnotationAssignList() throws RecognitionException {
        JVMWalker.brackedAnnotationAssignList_return retval = new JVMWalker.brackedAnnotationAssignList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.brackedAnnotationAssignValue_return brackedAnnotationAssignValue112 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:170:3: ( ( brackedAnnotationAssignValue )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:170:5: ( brackedAnnotationAssignValue )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:170:5: ( brackedAnnotationAssignValue )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:170:5: brackedAnnotationAssignValue
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList945);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:172:1: brackedAnnotationAssignValue : ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:173:3: ( ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:173:5: ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AnnotationAssign113=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue959); 
            AnnotationAssign113_tree = (CommonTree)adaptor.dupNode(AnnotationAssign113);


            root_1 = (CommonTree)adaptor.becomeRoot(AnnotationAssign113_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:173:24: ( runtimeVisibleAnnotationAssignList )?
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ASSIGN) ) {
                    alt26=1;
                }
                switch (alt26) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:173:24: runtimeVisibleAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue961);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:175:1: runtimeVisibleParameterAnnotations : ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:176:3: ( ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:176:5: ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeVisibleParameterAnnotations115=(CommonTree)match(input,RuntimeVisibleParameterAnnotations,FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations976); 
            RuntimeVisibleParameterAnnotations115_tree = (CommonTree)adaptor.dupNode(RuntimeVisibleParameterAnnotations115);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeVisibleParameterAnnotations115_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:176:42: ( parameterVisibilityInfo )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:176:42: parameterVisibilityInfo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations978);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:178:1: runtimeInvisibleParameterAnnotations : ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:179:3: ( ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:179:5: ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeInvisibleParameterAnnotations117=(CommonTree)match(input,RuntimeInvisibleParameterAnnotations,FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations993); 
            RuntimeInvisibleParameterAnnotations117_tree = (CommonTree)adaptor.dupNode(RuntimeInvisibleParameterAnnotations117);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeInvisibleParameterAnnotations117_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:179:44: ( parameterVisibilityInfo )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:179:44: parameterVisibilityInfo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations995);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:181:1: runtimeInvisibleAnnotations : ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:182:3: ( ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:182:5: ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RuntimeInvisibleAnnotations119=(CommonTree)match(input,RuntimeInvisibleAnnotations,FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1010); 
            RuntimeInvisibleAnnotations119_tree = (CommonTree)adaptor.dupNode(RuntimeInvisibleAnnotations119);


            root_1 = (CommonTree)adaptor.becomeRoot(RuntimeInvisibleAnnotations119_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:182:35: ( runtimeInvisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:182:35: runtimeInvisibleAnnotationsItem
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1012);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:184:1: parameterVisibilityInfo : ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:185:3: ( ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:185:5: ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_parameterVisibilityInfo1027);
            pc121=pc();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(pc121.getTree(), root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:185:10: ( IDENTIFIER )?
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==IDENTIFIER) ) {
                    alt30=1;
                }
                switch (alt30) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:185:10: IDENTIFIER
                        {
                        _last = (CommonTree)input.LT(1);
                        IDENTIFIER122=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1029); 
                        IDENTIFIER122_tree = (CommonTree)adaptor.dupNode(IDENTIFIER122);


                        adaptor.addChild(root_1, IDENTIFIER122_tree);


                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:185:22: ( runtimeVisibleAnnotationsItem )*
                loop31:
                do {
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==CPINDEX) ) {
                        alt31=1;
                    }


                    switch (alt31) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:185:22: runtimeVisibleAnnotationsItem
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1032);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:187:1: runtimeInvisibleAnnotationsItem : ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:188:3: ( ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:188:5: ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1047);
            pc124=pc();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(pc124.getTree(), root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:188:10: ( pc )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INTLITERAL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:188:10: pc
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1049);
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
            CPINDEX126=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1053); 
            CPINDEX126_tree = (CommonTree)adaptor.dupNode(CPINDEX126);


            root_2 = (CommonTree)adaptor.becomeRoot(CPINDEX126_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:188:24: ( runtimeVisibleAnnotationAssignList )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ASSIGN) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:188:24: runtimeVisibleAnnotationAssignList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1055);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:195:1: constant_pool : ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:196:3: ( ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:196:5: ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER128=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1076); 
            IDENTIFIER128_tree = (CommonTree)adaptor.dupNode(IDENTIFIER128);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER128_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER129=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1078); 
            IDENTIFIER129_tree = (CommonTree)adaptor.dupNode(IDENTIFIER129);


            adaptor.addChild(root_1, IDENTIFIER129_tree);


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:196:29: ( contant_pool_line )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ASSIGN) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:196:29: contant_pool_line
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool1080);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:199:1: contant_pool_line : ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) ;
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:200:3: ( ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:200:5: ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN131=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line1098); 
            ASSIGN131_tree = (CommonTree)adaptor.dupNode(ASSIGN131);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN131_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            CPINDEX132=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line1100); 
            CPINDEX132_tree = (CommonTree)adaptor.dupNode(CPINDEX132);


            adaptor.addChild(root_1, CPINDEX132_tree);


            _last = (CommonTree)input.LT(1);
            CONSTANT_TYPE_ASSIGNABLE133=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1102); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:207:1: classBody : ( classBodyEntryDecl )+ ;
    public final JVMWalker.classBody_return classBody() throws RecognitionException {
        JVMWalker.classBody_return retval = new JVMWalker.classBody_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.classBodyEntryDecl_return classBodyEntryDecl134 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:208:3: ( ( classBodyEntryDecl )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:208:5: ( classBodyEntryDecl )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:208:5: ( classBodyEntryDecl )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==FIELDDECL||LA35_0==STATICCTORDECL) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:208:5: classBodyEntryDecl
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_classBodyEntryDecl_in_classBody1122);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:211:1: classBodyEntryDecl : ( fieldDefinition | staticCtorDefinition );
    public final JVMWalker.classBodyEntryDecl_return classBodyEntryDecl() throws RecognitionException {
        JVMWalker.classBodyEntryDecl_return retval = new JVMWalker.classBodyEntryDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.fieldDefinition_return fieldDefinition135 =null;

        JVMWalker.staticCtorDefinition_return staticCtorDefinition136 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:212:3: ( fieldDefinition | staticCtorDefinition )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==FIELDDECL) ) {
                alt36=1;
            }
            else if ( (LA36_0==STATICCTORDECL) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:216:3: fieldDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_fieldDefinition_in_classBodyEntryDecl1149);
                    fieldDefinition135=fieldDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, fieldDefinition135.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:217:5: staticCtorDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1155);
                    staticCtorDefinition136=staticCtorDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, staticCtorDefinition136.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:224:1: fieldDefinition : ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) ;
    public final JVMWalker.fieldDefinition_return fieldDefinition() throws RecognitionException {
        JVMWalker.fieldDefinition_return retval = new JVMWalker.fieldDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FIELDDECL137=null;
        CommonTree VMODIFIER138=null;
        CommonTree MODIFIER140=null;
        CommonTree RETVALUE142=null;
        CommonTree UNITNAME144=null;
        CommonTree FIELDVALUE146=null;
        CommonTree UNITHEADER148=null;
        CommonTree UNITATTR150=null;
        JVMWalker.field_visual_modifier_return field_visual_modifier139 =null;

        JVMWalker.field_modifier_return field_modifier141 =null;

        JVMWalker.type_return type143 =null;

        JVMWalker.keywordAggregate_return keywordAggregate145 =null;

        JVMWalker.literals_return literals147 =null;

        JVMWalker.fieldInfo_return fieldInfo149 =null;

        JVMWalker.fieldAdditionalInfo_return fieldAdditionalInfo151 =null;


        CommonTree FIELDDECL137_tree=null;
        CommonTree VMODIFIER138_tree=null;
        CommonTree MODIFIER140_tree=null;
        CommonTree RETVALUE142_tree=null;
        CommonTree UNITNAME144_tree=null;
        CommonTree FIELDVALUE146_tree=null;
        CommonTree UNITHEADER148_tree=null;
        CommonTree UNITATTR150_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:225:3: ( ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:225:5: ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FIELDDECL137=(CommonTree)match(input,FIELDDECL,FOLLOW_FIELDDECL_in_fieldDefinition1173); 
            FIELDDECL137_tree = (CommonTree)adaptor.dupNode(FIELDDECL137);


            root_1 = (CommonTree)adaptor.becomeRoot(FIELDDECL137_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER138=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_fieldDefinition1176); 
            VMODIFIER138_tree = (CommonTree)adaptor.dupNode(VMODIFIER138);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER138_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:225:29: ( field_visual_modifier )?
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= PRIVATE && LA37_0 <= PUBLIC)) ) {
                    alt37=1;
                }
                switch (alt37) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:225:29: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition1178);
                        field_visual_modifier139=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier139.getTree());


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
            MODIFIER140=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_fieldDefinition1183); 
            MODIFIER140_tree = (CommonTree)adaptor.dupNode(MODIFIER140);


            root_2 = (CommonTree)adaptor.becomeRoot(MODIFIER140_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:225:64: ( field_modifier )*
                loop38:
                do {
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==FINAL||LA38_0==STATIC||LA38_0==TRANSIENT||LA38_0==VOLATILE) ) {
                        alt38=1;
                    }


                    switch (alt38) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:225:64: field_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition1185);
                	    field_modifier141=field_modifier();

                	    state._fsp--;

                	    adaptor.addChild(root_2, field_modifier141.getTree());


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
            RETVALUE142=(CommonTree)match(input,RETVALUE,FOLLOW_RETVALUE_in_fieldDefinition1190); 
            RETVALUE142_tree = (CommonTree)adaptor.dupNode(RETVALUE142);


            root_2 = (CommonTree)adaptor.becomeRoot(RETVALUE142_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_fieldDefinition1192);
            type143=type();

            state._fsp--;

            adaptor.addChild(root_2, type143.getTree());


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
            UNITNAME144=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_fieldDefinition1196); 
            UNITNAME144_tree = (CommonTree)adaptor.dupNode(UNITNAME144);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME144_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_keywordAggregate_in_fieldDefinition1198);
            keywordAggregate145=keywordAggregate();

            state._fsp--;

            adaptor.addChild(root_2, keywordAggregate145.getTree());


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
            FIELDVALUE146=(CommonTree)match(input,FIELDVALUE,FOLLOW_FIELDVALUE_in_fieldDefinition1202); 
            FIELDVALUE146_tree = (CommonTree)adaptor.dupNode(FIELDVALUE146);


            root_2 = (CommonTree)adaptor.becomeRoot(FIELDVALUE146_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:225:140: ( literals )?
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==BOOLEANLITERAL||LA39_0==CHARLITERAL||LA39_0==DOUBLELITERAL||LA39_0==FLOATLITERAL||LA39_0==IDENTIFIER||LA39_0==INTLITERAL||LA39_0==LONGLITERAL||LA39_0==MINUS||LA39_0==STRINGLITERAL) ) {
                    alt39=1;
                }
                switch (alt39) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:225:140: literals
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_literals_in_fieldDefinition1204);
                        literals147=literals();

                        state._fsp--;

                        adaptor.addChild(root_2, literals147.getTree());


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
            UNITHEADER148=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_fieldDefinition1221); 
            UNITHEADER148_tree = (CommonTree)adaptor.dupNode(UNITHEADER148);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER148_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition1223);
            fieldInfo149=fieldInfo();

            state._fsp--;

            adaptor.addChild(root_2, fieldInfo149.getTree());


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
            UNITATTR150=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_fieldDefinition1239); 
            UNITATTR150_tree = (CommonTree)adaptor.dupNode(UNITATTR150);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR150_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:227:24: ( fieldAdditionalInfo )*
                loop40:
                do {
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Constant||LA40_0==Deprecated||LA40_0==RuntimeInvisibleAnnotations||LA40_0==RuntimeVisibleAnnotations||LA40_0==Signature||LA40_0==Synthetic) ) {
                        alt40=1;
                    }


                    switch (alt40) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:227:24: fieldAdditionalInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition1241);
                	    fieldAdditionalInfo151=fieldAdditionalInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_2, fieldAdditionalInfo151.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:231:1: fieldInfo : ^( Signature bytecodeType ) flags ;
    public final JVMWalker.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMWalker.fieldInfo_return retval = new JVMWalker.fieldInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature152=null;
        JVMWalker.bytecodeType_return bytecodeType153 =null;

        JVMWalker.flags_return flags154 =null;


        CommonTree Signature152_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:232:3: ( ^( Signature bytecodeType ) flags )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:232:5: ^( Signature bytecodeType ) flags
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature152=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldInfo1271); 
            Signature152_tree = (CommonTree)adaptor.dupNode(Signature152);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature152_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_fieldInfo1273);
            bytecodeType153=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_1, bytecodeType153.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flags_in_fieldInfo1276);
            flags154=flags();

            state._fsp--;

            adaptor.addChild(root_0, flags154.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:235:1: fieldAdditionalInfo : ( ^( Constant primitiveType literals ) | ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | ^( Signature CPINDEX ) | ^( Deprecated BOOLEANLITERAL ) | ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations );
    public final JVMWalker.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        JVMWalker.fieldAdditionalInfo_return retval = new JVMWalker.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Constant155=null;
        CommonTree Constant158=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE159=null;
        CommonTree Signature160=null;
        CommonTree CPINDEX161=null;
        CommonTree Deprecated162=null;
        CommonTree BOOLEANLITERAL163=null;
        CommonTree Synthetic164=null;
        CommonTree BOOLEANLITERAL165=null;
        JVMWalker.primitiveType_return primitiveType156 =null;

        JVMWalker.literals_return literals157 =null;

        JVMWalker.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info166 =null;

        JVMWalker.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations167 =null;


        CommonTree Constant155_tree=null;
        CommonTree Constant158_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE159_tree=null;
        CommonTree Signature160_tree=null;
        CommonTree CPINDEX161_tree=null;
        CommonTree Deprecated162_tree=null;
        CommonTree BOOLEANLITERAL163_tree=null;
        CommonTree Synthetic164_tree=null;
        CommonTree BOOLEANLITERAL165_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:236:3: ( ^( Constant primitiveType literals ) | ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | ^( Signature CPINDEX ) | ^( Deprecated BOOLEANLITERAL ) | ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:236:5: ^( Constant primitiveType literals )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Constant155=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1290); 
                    Constant155_tree = (CommonTree)adaptor.dupNode(Constant155);


                    root_1 = (CommonTree)adaptor.becomeRoot(Constant155_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_fieldAdditionalInfo1292);
                    primitiveType156=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_1, primitiveType156.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_literals_in_fieldAdditionalInfo1294);
                    literals157=literals();

                    state._fsp--;

                    adaptor.addChild(root_1, literals157.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:237:5: ^( Constant CONSTANT_TYPE_ASSIGNABLE )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Constant158=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1302); 
                    Constant158_tree = (CommonTree)adaptor.dupNode(Constant158);


                    root_1 = (CommonTree)adaptor.becomeRoot(Constant158_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    CONSTANT_TYPE_ASSIGNABLE159=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo1304); 
                    CONSTANT_TYPE_ASSIGNABLE159_tree = (CommonTree)adaptor.dupNode(CONSTANT_TYPE_ASSIGNABLE159);


                    adaptor.addChild(root_1, CONSTANT_TYPE_ASSIGNABLE159_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:238:5: ^( Signature CPINDEX )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Signature160=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo1312); 
                    Signature160_tree = (CommonTree)adaptor.dupNode(Signature160);


                    root_1 = (CommonTree)adaptor.becomeRoot(Signature160_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    CPINDEX161=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldAdditionalInfo1314); 
                    CPINDEX161_tree = (CommonTree)adaptor.dupNode(CPINDEX161);


                    adaptor.addChild(root_1, CPINDEX161_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:239:5: ^( Deprecated BOOLEANLITERAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Deprecated162=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo1322); 
                    Deprecated162_tree = (CommonTree)adaptor.dupNode(Deprecated162);


                    root_1 = (CommonTree)adaptor.becomeRoot(Deprecated162_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL163=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1324); 
                    BOOLEANLITERAL163_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL163);


                    adaptor.addChild(root_1, BOOLEANLITERAL163_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:240:5: ^( Synthetic BOOLEANLITERAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Synthetic164=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo1332); 
                    Synthetic164_tree = (CommonTree)adaptor.dupNode(Synthetic164);


                    root_1 = (CommonTree)adaptor.becomeRoot(Synthetic164_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL165=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1334); 
                    BOOLEANLITERAL165_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL165);


                    adaptor.addChild(root_1, BOOLEANLITERAL165_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:241:5: runtimeVisibleAnnotations_info
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo1341);
                    runtimeVisibleAnnotations_info166=runtimeVisibleAnnotations_info();

                    state._fsp--;

                    adaptor.addChild(root_0, runtimeVisibleAnnotations_info166.getTree());


                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:242:5: runtimeInvisibleAnnotations
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo1347);
                    runtimeInvisibleAnnotations167=runtimeInvisibleAnnotations();

                    state._fsp--;

                    adaptor.addChild(root_0, runtimeInvisibleAnnotations167.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:245:1: field_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMWalker.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        JVMWalker.field_visual_modifier_return retval = new JVMWalker.field_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set168=null;

        CommonTree set168_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:246:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set168=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                set168_tree = (CommonTree)adaptor.dupNode(set168);


                adaptor.addChild(root_0, set168_tree);

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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:249:1: field_modifier : ( FINAL | STATIC | TRANSIENT | VOLATILE );
    public final JVMWalker.field_modifier_return field_modifier() throws RecognitionException {
        JVMWalker.field_modifier_return retval = new JVMWalker.field_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set169=null;

        CommonTree set169_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:250:3: ( FINAL | STATIC | TRANSIENT | VOLATILE )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set169=(CommonTree)input.LT(1);

            if ( input.LA(1)==FINAL||input.LA(1)==STATIC||input.LA(1)==TRANSIENT||input.LA(1)==VOLATILE ) {
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
    // $ANTLR end "field_modifier"


    public static class staticCtorDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "staticCtorDefinition"
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:257:1: staticCtorDefinition : ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) ;
    public final JVMWalker.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        JVMWalker.staticCtorDefinition_return retval = new JVMWalker.staticCtorDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STATICCTORDECL170=null;
        CommonTree VMODIFIER171=null;
        CommonTree UNITHEADER173=null;
        CommonTree UNITBODY175=null;
        JVMWalker.field_visual_modifier_return field_visual_modifier172 =null;

        JVMWalker.methodInfo_return methodInfo174 =null;

        JVMWalker.body_return body176 =null;


        CommonTree STATICCTORDECL170_tree=null;
        CommonTree VMODIFIER171_tree=null;
        CommonTree UNITHEADER173_tree=null;
        CommonTree UNITBODY175_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:258:3: ( ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:258:5: ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STATICCTORDECL170=(CommonTree)match(input,STATICCTORDECL,FOLLOW_STATICCTORDECL_in_staticCtorDefinition1419); 
            STATICCTORDECL170_tree = (CommonTree)adaptor.dupNode(STATICCTORDECL170);


            root_1 = (CommonTree)adaptor.becomeRoot(STATICCTORDECL170_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER171=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_staticCtorDefinition1422); 
            VMODIFIER171_tree = (CommonTree)adaptor.dupNode(VMODIFIER171);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER171_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:258:34: ( field_visual_modifier )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0 >= PRIVATE && LA42_0 <= PUBLIC)) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:258:34: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition1424);
                        field_visual_modifier172=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier172.getTree());


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
            UNITHEADER173=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_staticCtorDefinition1429); 
            UNITHEADER173_tree = (CommonTree)adaptor.dupNode(UNITHEADER173);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER173_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition1431);
            methodInfo174=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo174.getTree());


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
            UNITBODY175=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_staticCtorDefinition1435); 
            UNITBODY175_tree = (CommonTree)adaptor.dupNode(UNITBODY175);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY175_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_body_in_staticCtorDefinition1437);
            body176=body();

            state._fsp--;

            adaptor.addChild(root_2, body176.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:266:1: ctorDefinition : ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMWalker.ctorDefinition_return ctorDefinition() throws RecognitionException {
        JVMWalker.ctorDefinition_return retval = new JVMWalker.ctorDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CTORDECL177=null;
        CommonTree VMODIFIER178=null;
        CommonTree GENERICDESC180=null;
        CommonTree UNITNAME182=null;
        CommonTree THROWCLAUSE185=null;
        CommonTree UNITHEADER187=null;
        CommonTree UNITBODY189=null;
        CommonTree UNITATTR191=null;
        JVMWalker.field_visual_modifier_return field_visual_modifier179 =null;

        JVMWalker.genericDescriptor_return genericDescriptor181 =null;

        JVMWalker.typeName_return typeName183 =null;

        JVMWalker.arguments_return arguments184 =null;

        JVMWalker.throwClause_return throwClause186 =null;

        JVMWalker.methodInfo_return methodInfo188 =null;

        JVMWalker.body_return body190 =null;

        JVMWalker.afterMethodInfo_return afterMethodInfo192 =null;


        CommonTree CTORDECL177_tree=null;
        CommonTree VMODIFIER178_tree=null;
        CommonTree GENERICDESC180_tree=null;
        CommonTree UNITNAME182_tree=null;
        CommonTree THROWCLAUSE185_tree=null;
        CommonTree UNITHEADER187_tree=null;
        CommonTree UNITBODY189_tree=null;
        CommonTree UNITATTR191_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:267:3: ( ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:267:5: ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CTORDECL177=(CommonTree)match(input,CTORDECL,FOLLOW_CTORDECL_in_ctorDefinition1460); 
            CTORDECL177_tree = (CommonTree)adaptor.dupNode(CTORDECL177);


            root_1 = (CommonTree)adaptor.becomeRoot(CTORDECL177_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER178=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_ctorDefinition1463); 
            VMODIFIER178_tree = (CommonTree)adaptor.dupNode(VMODIFIER178);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER178_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:267:28: ( field_visual_modifier )?
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0 >= PRIVATE && LA43_0 <= PUBLIC)) ) {
                    alt43=1;
                }
                switch (alt43) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:267:28: field_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition1465);
                        field_visual_modifier179=field_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, field_visual_modifier179.getTree());


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
            GENERICDESC180=(CommonTree)match(input,GENERICDESC,FOLLOW_GENERICDESC_in_ctorDefinition1470); 
            GENERICDESC180_tree = (CommonTree)adaptor.dupNode(GENERICDESC180);


            root_2 = (CommonTree)adaptor.becomeRoot(GENERICDESC180_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:267:66: ( genericDescriptor )?
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==EXTENDS) ) {
                    alt44=1;
                }
                switch (alt44) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:267:66: genericDescriptor
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_genericDescriptor_in_ctorDefinition1472);
                        genericDescriptor181=genericDescriptor();

                        state._fsp--;

                        adaptor.addChild(root_2, genericDescriptor181.getTree());


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
            UNITNAME182=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_ctorDefinition1477); 
            UNITNAME182_tree = (CommonTree)adaptor.dupNode(UNITNAME182);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME182_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeName_in_ctorDefinition1479);
            typeName183=typeName();

            state._fsp--;

            adaptor.addChild(root_2, typeName183.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arguments_in_ctorDefinition1482);
            arguments184=arguments();

            state._fsp--;

            adaptor.addChild(root_1, arguments184.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWCLAUSE185=(CommonTree)match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_ctorDefinition1485); 
            THROWCLAUSE185_tree = (CommonTree)adaptor.dupNode(THROWCLAUSE185);


            root_2 = (CommonTree)adaptor.becomeRoot(THROWCLAUSE185_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:267:131: ( throwClause )?
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==THROWS) ) {
                    alt45=1;
                }
                switch (alt45) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:267:131: throwClause
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_throwClause_in_ctorDefinition1487);
                        throwClause186=throwClause();

                        state._fsp--;

                        adaptor.addChild(root_2, throwClause186.getTree());


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
            UNITHEADER187=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_ctorDefinition1516); 
            UNITHEADER187_tree = (CommonTree)adaptor.dupNode(UNITHEADER187);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER187_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_ctorDefinition1518);
            methodInfo188=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo188.getTree());


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
            UNITBODY189=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_ctorDefinition1546); 
            UNITBODY189_tree = (CommonTree)adaptor.dupNode(UNITBODY189);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY189_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_body_in_ctorDefinition1548);
            body190=body();

            state._fsp--;

            adaptor.addChild(root_2, body190.getTree());


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
            UNITATTR191=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_ctorDefinition1576); 
            UNITATTR191_tree = (CommonTree)adaptor.dupNode(UNITATTR191);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR191_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:270:36: ( afterMethodInfo )?
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AnnotationDefault||LA46_0==Deprecated||LA46_0==Exceptions||(LA46_0 >= RuntimeInvisibleAnnotations && LA46_0 <= RuntimeVisibleParameterAnnotations)||LA46_0==Signature||LA46_0==Synthetic) ) {
                    alt46=1;
                }
                switch (alt46) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:270:36: afterMethodInfo
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition1578);
                        afterMethodInfo192=afterMethodInfo();

                        state._fsp--;

                        adaptor.addChild(root_2, afterMethodInfo192.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:278:1: methodDefinition : ^( CTORDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMWalker.methodDefinition_return methodDefinition() throws RecognitionException {
        JVMWalker.methodDefinition_return retval = new JVMWalker.methodDefinition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CTORDECL193=null;
        CommonTree VMODIFIER194=null;
        CommonTree MODIFIER196=null;
        CommonTree GENERICDESC198=null;
        CommonTree RETVALUE200=null;
        CommonTree UNITNAME202=null;
        CommonTree THROWCLAUSE205=null;
        CommonTree UNITHEADER207=null;
        CommonTree UNITBODY209=null;
        CommonTree UNITATTR211=null;
        JVMWalker.method_visual_modifier_return method_visual_modifier195 =null;

        JVMWalker.method_modifier_return method_modifier197 =null;

        JVMWalker.genericDescriptor_return genericDescriptor199 =null;

        JVMWalker.type_return type201 =null;

        JVMWalker.keywordAggregate_return keywordAggregate203 =null;

        JVMWalker.arguments_return arguments204 =null;

        JVMWalker.throwClauseMethod_return throwClauseMethod206 =null;

        JVMWalker.methodInfo_return methodInfo208 =null;

        JVMWalker.body_return body210 =null;

        JVMWalker.afterMethodInfo_return afterMethodInfo212 =null;


        CommonTree CTORDECL193_tree=null;
        CommonTree VMODIFIER194_tree=null;
        CommonTree MODIFIER196_tree=null;
        CommonTree GENERICDESC198_tree=null;
        CommonTree RETVALUE200_tree=null;
        CommonTree UNITNAME202_tree=null;
        CommonTree THROWCLAUSE205_tree=null;
        CommonTree UNITHEADER207_tree=null;
        CommonTree UNITBODY209_tree=null;
        CommonTree UNITATTR211_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:3: ( ^( CTORDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:5: ^( CTORDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CTORDECL193=(CommonTree)match(input,CTORDECL,FOLLOW_CTORDECL_in_methodDefinition1624); 
            CTORDECL193_tree = (CommonTree)adaptor.dupNode(CTORDECL193);


            root_1 = (CommonTree)adaptor.becomeRoot(CTORDECL193_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VMODIFIER194=(CommonTree)match(input,VMODIFIER,FOLLOW_VMODIFIER_in_methodDefinition1627); 
            VMODIFIER194_tree = (CommonTree)adaptor.dupNode(VMODIFIER194);


            root_2 = (CommonTree)adaptor.becomeRoot(VMODIFIER194_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:28: ( method_visual_modifier )?
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0 >= PRIVATE && LA47_0 <= PUBLIC)) ) {
                    alt47=1;
                }
                switch (alt47) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:28: method_visual_modifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_method_visual_modifier_in_methodDefinition1629);
                        method_visual_modifier195=method_visual_modifier();

                        state._fsp--;

                        adaptor.addChild(root_2, method_visual_modifier195.getTree());


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
            MODIFIER196=(CommonTree)match(input,MODIFIER,FOLLOW_MODIFIER_in_methodDefinition1634); 
            MODIFIER196_tree = (CommonTree)adaptor.dupNode(MODIFIER196);


            root_2 = (CommonTree)adaptor.becomeRoot(MODIFIER196_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:64: ( method_modifier )*
                loop48:
                do {
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==ABSTRACT||LA48_0==FINAL||LA48_0==NATIVE||LA48_0==STATIC||LA48_0==STRICTFP||LA48_0==SYNCHRONIZED) ) {
                        alt48=1;
                    }


                    switch (alt48) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:64: method_modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_method_modifier_in_methodDefinition1636);
                	    method_modifier197=method_modifier();

                	    state._fsp--;

                	    adaptor.addChild(root_2, method_modifier197.getTree());


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
            GENERICDESC198=(CommonTree)match(input,GENERICDESC,FOLLOW_GENERICDESC_in_methodDefinition1641); 
            GENERICDESC198_tree = (CommonTree)adaptor.dupNode(GENERICDESC198);


            root_2 = (CommonTree)adaptor.becomeRoot(GENERICDESC198_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:96: ( genericDescriptor )?
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==EXTENDS) ) {
                    alt49=1;
                }
                switch (alt49) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:96: genericDescriptor
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_genericDescriptor_in_methodDefinition1643);
                        genericDescriptor199=genericDescriptor();

                        state._fsp--;

                        adaptor.addChild(root_2, genericDescriptor199.getTree());


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
            RETVALUE200=(CommonTree)match(input,RETVALUE,FOLLOW_RETVALUE_in_methodDefinition1648); 
            RETVALUE200_tree = (CommonTree)adaptor.dupNode(RETVALUE200);


            root_2 = (CommonTree)adaptor.becomeRoot(RETVALUE200_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_methodDefinition1650);
            type201=type();

            state._fsp--;

            adaptor.addChild(root_2, type201.getTree());


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
            UNITNAME202=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_methodDefinition1654); 
            UNITNAME202_tree = (CommonTree)adaptor.dupNode(UNITNAME202);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITNAME202_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_keywordAggregate_in_methodDefinition1656);
            keywordAggregate203=keywordAggregate();

            state._fsp--;

            adaptor.addChild(root_2, keywordAggregate203.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arguments_in_methodDefinition1659);
            arguments204=arguments();

            state._fsp--;

            adaptor.addChild(root_1, arguments204.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWCLAUSE205=(CommonTree)match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_methodDefinition1662); 
            THROWCLAUSE205_tree = (CommonTree)adaptor.dupNode(THROWCLAUSE205);


            root_2 = (CommonTree)adaptor.becomeRoot(THROWCLAUSE205_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:186: ( throwClauseMethod )?
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==THROWS) ) {
                    alt50=1;
                }
                switch (alt50) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:279:186: throwClauseMethod
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_throwClauseMethod_in_methodDefinition1664);
                        throwClauseMethod206=throwClauseMethod();

                        state._fsp--;

                        adaptor.addChild(root_2, throwClauseMethod206.getTree());


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
            UNITHEADER207=(CommonTree)match(input,UNITHEADER,FOLLOW_UNITHEADER_in_methodDefinition1693); 
            UNITHEADER207_tree = (CommonTree)adaptor.dupNode(UNITHEADER207);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITHEADER207_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodInfo_in_methodDefinition1695);
            methodInfo208=methodInfo();

            state._fsp--;

            adaptor.addChild(root_2, methodInfo208.getTree());


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
            UNITBODY209=(CommonTree)match(input,UNITBODY,FOLLOW_UNITBODY_in_methodDefinition1723); 
            UNITBODY209_tree = (CommonTree)adaptor.dupNode(UNITBODY209);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITBODY209_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:281:36: ( body )?
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Synthetic) ) {
                    alt51=1;
                }
                switch (alt51) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:281:36: body
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_body_in_methodDefinition1725);
                        body210=body();

                        state._fsp--;

                        adaptor.addChild(root_2, body210.getTree());


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
            UNITATTR211=(CommonTree)match(input,UNITATTR,FOLLOW_UNITATTR_in_methodDefinition1754); 
            UNITATTR211_tree = (CommonTree)adaptor.dupNode(UNITATTR211);


            root_2 = (CommonTree)adaptor.becomeRoot(UNITATTR211_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:282:36: ( afterMethodInfo )?
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==AnnotationDefault||LA52_0==Deprecated||LA52_0==Exceptions||(LA52_0 >= RuntimeInvisibleAnnotations && LA52_0 <= RuntimeVisibleParameterAnnotations)||LA52_0==Signature||LA52_0==Synthetic) ) {
                    alt52=1;
                }
                switch (alt52) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:282:36: afterMethodInfo
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition1756);
                        afterMethodInfo212=afterMethodInfo();

                        state._fsp--;

                        adaptor.addChild(root_2, afterMethodInfo212.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:286:1: methodInfo : ^( STANDINTOKEN methodSignatureInfo flags ) ;
    public final JVMWalker.methodInfo_return methodInfo() throws RecognitionException {
        JVMWalker.methodInfo_return retval = new JVMWalker.methodInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STANDINTOKEN213=null;
        JVMWalker.methodSignatureInfo_return methodSignatureInfo214 =null;

        JVMWalker.flags_return flags215 =null;


        CommonTree STANDINTOKEN213_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:287:3: ( ^( STANDINTOKEN methodSignatureInfo flags ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:287:5: ^( STANDINTOKEN methodSignatureInfo flags )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STANDINTOKEN213=(CommonTree)match(input,STANDINTOKEN,FOLLOW_STANDINTOKEN_in_methodInfo1798); 
            STANDINTOKEN213_tree = (CommonTree)adaptor.dupNode(STANDINTOKEN213);


            root_1 = (CommonTree)adaptor.becomeRoot(STANDINTOKEN213_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo1800);
            methodSignatureInfo214=methodSignatureInfo();

            state._fsp--;

            adaptor.addChild(root_1, methodSignatureInfo214.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flags_in_methodInfo1802);
            flags215=flags();

            state._fsp--;

            adaptor.addChild(root_1, flags215.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:290:1: afterMethodInfo : ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ ;
    public final JVMWalker.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        JVMWalker.afterMethodInfo_return retval = new JVMWalker.afterMethodInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Deprecated216=null;
        CommonTree BOOLEANLITERAL217=null;
        CommonTree Signature218=null;
        CommonTree CPINDEX219=null;
        CommonTree Exceptions224=null;
        CommonTree Synthetic226=null;
        CommonTree BOOLEANLITERAL227=null;
        JVMWalker.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations220 =null;

        JVMWalker.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info221 =null;

        JVMWalker.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations222 =null;

        JVMWalker.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations223 =null;

        JVMWalker.throwClause_return throwClause225 =null;

        JVMWalker.annotationDefault_return annotationDefault228 =null;


        CommonTree Deprecated216_tree=null;
        CommonTree BOOLEANLITERAL217_tree=null;
        CommonTree Signature218_tree=null;
        CommonTree CPINDEX219_tree=null;
        CommonTree Exceptions224_tree=null;
        CommonTree Synthetic226_tree=null;
        CommonTree BOOLEANLITERAL227_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:291:3: ( ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:291:5: ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:291:5: ( ^( Deprecated BOOLEANLITERAL ) | ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | ^( Exceptions throwClause ) | ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:291:6: ^( Deprecated BOOLEANLITERAL )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Deprecated216=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfo1818); 
            	    Deprecated216_tree = (CommonTree)adaptor.dupNode(Deprecated216);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Deprecated216_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    BOOLEANLITERAL217=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1821); 
            	    BOOLEANLITERAL217_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL217);


            	    adaptor.addChild(root_1, BOOLEANLITERAL217_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:292:5: ^( Signature CPINDEX )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Signature218=(CommonTree)match(input,Signature,FOLLOW_Signature_in_afterMethodInfo1829); 
            	    Signature218_tree = (CommonTree)adaptor.dupNode(Signature218);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Signature218_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    CPINDEX219=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfo1831); 
            	    CPINDEX219_tree = (CommonTree)adaptor.dupNode(CPINDEX219);


            	    adaptor.addChild(root_1, CPINDEX219_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:293:5: runtimeInvisibleParameterAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo1838);
            	    runtimeInvisibleParameterAnnotations220=runtimeInvisibleParameterAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeInvisibleParameterAnnotations220.getTree());


            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:294:5: runtimeVisibleAnnotations_info
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1844);
            	    runtimeVisibleAnnotations_info221=runtimeVisibleAnnotations_info();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleAnnotations_info221.getTree());


            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:295:5: runtimeInvisibleAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo1850);
            	    runtimeInvisibleAnnotations222=runtimeInvisibleAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeInvisibleAnnotations222.getTree());


            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:296:5: runtimeVisibleParameterAnnotations
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo1856);
            	    runtimeVisibleParameterAnnotations223=runtimeVisibleParameterAnnotations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, runtimeVisibleParameterAnnotations223.getTree());


            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:297:5: ^( Exceptions throwClause )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Exceptions224=(CommonTree)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfo1863); 
            	    Exceptions224_tree = (CommonTree)adaptor.dupNode(Exceptions224);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Exceptions224_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_throwClause_in_afterMethodInfo1866);
            	    throwClause225=throwClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, throwClause225.getTree());


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:298:5: ^( Synthetic BOOLEANLITERAL )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    Synthetic226=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfo1874); 
            	    Synthetic226_tree = (CommonTree)adaptor.dupNode(Synthetic226);


            	    root_1 = (CommonTree)adaptor.becomeRoot(Synthetic226_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    BOOLEANLITERAL227=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1876); 
            	    BOOLEANLITERAL227_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL227);


            	    adaptor.addChild(root_1, BOOLEANLITERAL227_tree);


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:299:5: annotationDefault
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_annotationDefault_in_afterMethodInfo1883);
            	    annotationDefault228=annotationDefault();

            	    state._fsp--;

            	    adaptor.addChild(root_0, annotationDefault228.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:302:1: annotationDefault : ^( AnnotationDefault DefaultValue annotationValue ) ;
    public final JVMWalker.annotationDefault_return annotationDefault() throws RecognitionException {
        JVMWalker.annotationDefault_return retval = new JVMWalker.annotationDefault_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AnnotationDefault229=null;
        CommonTree DefaultValue230=null;
        JVMWalker.annotationValue_return annotationValue231 =null;


        CommonTree AnnotationDefault229_tree=null;
        CommonTree DefaultValue230_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:303:3: ( ^( AnnotationDefault DefaultValue annotationValue ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:303:5: ^( AnnotationDefault DefaultValue annotationValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AnnotationDefault229=(CommonTree)match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault1899); 
            AnnotationDefault229_tree = (CommonTree)adaptor.dupNode(AnnotationDefault229);


            root_1 = (CommonTree)adaptor.becomeRoot(AnnotationDefault229_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            DefaultValue230=(CommonTree)match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault1902); 
            DefaultValue230_tree = (CommonTree)adaptor.dupNode(DefaultValue230);


            adaptor.addChild(root_1, DefaultValue230_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationValue_in_annotationDefault1904);
            annotationValue231=annotationValue();

            state._fsp--;

            adaptor.addChild(root_1, annotationValue231.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:306:1: methodSignatureInfo : ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) ;
    public final JVMWalker.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        JVMWalker.methodSignatureInfo_return retval = new JVMWalker.methodSignatureInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Signature232=null;
        CommonTree PARAMDESC233=null;
        CommonTree RETDESC235=null;
        JVMWalker.bytecodeType_return bytecodeType234 =null;

        JVMWalker.returnDescriptor_return returnDescriptor236 =null;


        CommonTree Signature232_tree=null;
        CommonTree PARAMDESC233_tree=null;
        CommonTree RETDESC235_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:307:3: ( ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:307:5: ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Signature232=(CommonTree)match(input,Signature,FOLLOW_Signature_in_methodSignatureInfo1921); 
            Signature232_tree = (CommonTree)adaptor.dupNode(Signature232);


            root_1 = (CommonTree)adaptor.becomeRoot(Signature232_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PARAMDESC233=(CommonTree)match(input,PARAMDESC,FOLLOW_PARAMDESC_in_methodSignatureInfo1924); 
            PARAMDESC233_tree = (CommonTree)adaptor.dupNode(PARAMDESC233);


            root_2 = (CommonTree)adaptor.becomeRoot(PARAMDESC233_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:307:29: ( bytecodeType )*
                loop54:
                do {
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==BaseType||LA54_0==IDENTIFIER||LA54_0==INTERNALTYPE||LA54_0==LBRACK) ) {
                        alt54=1;
                    }


                    switch (alt54) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:307:29: bytecodeType
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo1926);
                	    bytecodeType234=bytecodeType();

                	    state._fsp--;

                	    adaptor.addChild(root_2, bytecodeType234.getTree());


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
            RETDESC235=(CommonTree)match(input,RETDESC,FOLLOW_RETDESC_in_methodSignatureInfo1931); 
            RETDESC235_tree = (CommonTree)adaptor.dupNode(RETDESC235);


            root_2 = (CommonTree)adaptor.becomeRoot(RETDESC235_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo1933);
            returnDescriptor236=returnDescriptor();

            state._fsp--;

            adaptor.addChild(root_2, returnDescriptor236.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:310:1: returnDescriptor : ( bytecodeType | VoidType );
    public final JVMWalker.returnDescriptor_return returnDescriptor() throws RecognitionException {
        JVMWalker.returnDescriptor_return retval = new JVMWalker.returnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VoidType238=null;
        JVMWalker.bytecodeType_return bytecodeType237 =null;


        CommonTree VoidType238_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:311:3: ( bytecodeType | VoidType )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:311:5: bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor1948);
                    bytecodeType237=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType237.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:311:20: VoidType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VoidType238=(CommonTree)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor1952); 
                    VoidType238_tree = (CommonTree)adaptor.dupNode(VoidType238);


                    adaptor.addChild(root_0, VoidType238_tree);


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:314:1: method_modifier : ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP );
    public final JVMWalker.method_modifier_return method_modifier() throws RecognitionException {
        JVMWalker.method_modifier_return retval = new JVMWalker.method_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set239=null;

        CommonTree set239_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:315:3: ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set239=(CommonTree)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL||input.LA(1)==NATIVE||input.LA(1)==STATIC||input.LA(1)==STRICTFP||input.LA(1)==SYNCHRONIZED ) {
                input.consume();
                set239_tree = (CommonTree)adaptor.dupNode(set239);


                adaptor.addChild(root_0, set239_tree);

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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:318:1: method_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMWalker.method_visual_modifier_return method_visual_modifier() throws RecognitionException {
        JVMWalker.method_visual_modifier_return retval = new JVMWalker.method_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set240=null;

        CommonTree set240_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:319:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set240=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
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
    // $ANTLR end "method_visual_modifier"


    public static class arguments_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:322:1: arguments : ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) ;
    public final JVMWalker.arguments_return arguments() throws RecognitionException {
        JVMWalker.arguments_return retval = new JVMWalker.arguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITARGUMENTS241=null;
        CommonTree DOT243=null;
        CommonTree DOT244=null;
        CommonTree DOT245=null;
        JVMWalker.typeList_return typeList242 =null;


        CommonTree UNITARGUMENTS241_tree=null;
        CommonTree DOT243_tree=null;
        CommonTree DOT244_tree=null;
        CommonTree DOT245_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:323:3: ( ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:323:5: ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITARGUMENTS241=(CommonTree)match(input,UNITARGUMENTS,FOLLOW_UNITARGUMENTS_in_arguments2024); 
            UNITARGUMENTS241_tree = (CommonTree)adaptor.dupNode(UNITARGUMENTS241);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITARGUMENTS241_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:323:21: ( typeList )?
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==BOOLEAN||LA56_0==BYTE||LA56_0==CHAR||LA56_0==DOUBLE||LA56_0==FLOAT||LA56_0==INT||LA56_0==LONG||LA56_0==SHORT||LA56_0==UNITNAME||LA56_0==VOID) ) {
                    alt56=1;
                }
                switch (alt56) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:323:21: typeList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeList_in_arguments2026);
                        typeList242=typeList();

                        state._fsp--;

                        adaptor.addChild(root_1, typeList242.getTree());


                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:323:31: ( DOT DOT DOT )?
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==DOT) ) {
                    alt57=1;
                }
                switch (alt57) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:323:32: DOT DOT DOT
                        {
                        _last = (CommonTree)input.LT(1);
                        DOT243=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2030); 
                        DOT243_tree = (CommonTree)adaptor.dupNode(DOT243);


                        adaptor.addChild(root_1, DOT243_tree);


                        _last = (CommonTree)input.LT(1);
                        DOT244=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2032); 
                        DOT244_tree = (CommonTree)adaptor.dupNode(DOT244);


                        adaptor.addChild(root_1, DOT244_tree);


                        _last = (CommonTree)input.LT(1);
                        DOT245=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments2034); 
                        DOT245_tree = (CommonTree)adaptor.dupNode(DOT245);


                        adaptor.addChild(root_1, DOT245_tree);


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:330:1: body : ( Synthetic ( BOOLEANLITERAL )? ) ^( Code codeBlock ) ( bodyExtension )* ;
    public final JVMWalker.body_return body() throws RecognitionException {
        JVMWalker.body_return retval = new JVMWalker.body_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Synthetic246=null;
        CommonTree BOOLEANLITERAL247=null;
        CommonTree Code248=null;
        JVMWalker.codeBlock_return codeBlock249 =null;

        JVMWalker.bodyExtension_return bodyExtension250 =null;


        CommonTree Synthetic246_tree=null;
        CommonTree BOOLEANLITERAL247_tree=null;
        CommonTree Code248_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:331:3: ( ( Synthetic ( BOOLEANLITERAL )? ) ^( Code codeBlock ) ( bodyExtension )* )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:331:5: ( Synthetic ( BOOLEANLITERAL )? ) ^( Code codeBlock ) ( bodyExtension )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:331:5: ( Synthetic ( BOOLEANLITERAL )? )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:331:6: Synthetic ( BOOLEANLITERAL )?
            {
            _last = (CommonTree)input.LT(1);
            Synthetic246=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_body2059); 
            Synthetic246_tree = (CommonTree)adaptor.dupNode(Synthetic246);


            adaptor.addChild(root_0, Synthetic246_tree);


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:331:16: ( BOOLEANLITERAL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==BOOLEANLITERAL) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:331:16: BOOLEANLITERAL
                    {
                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL247=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_body2061); 
                    BOOLEANLITERAL247_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL247);


                    adaptor.addChild(root_0, BOOLEANLITERAL247_tree);


                    }
                    break;

            }


            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Code248=(CommonTree)match(input,Code,FOLLOW_Code_in_body2066); 
            Code248_tree = (CommonTree)adaptor.dupNode(Code248);


            root_1 = (CommonTree)adaptor.becomeRoot(Code248_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_body2068);
            codeBlock249=codeBlock();

            state._fsp--;

            adaptor.addChild(root_1, codeBlock249.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:331:51: ( bodyExtension )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==ExceptionTable||(LA59_0 >= LineNumberTable && LA59_0 <= LocalVariableTypeTable)||(LA59_0 >= StackMap && LA59_0 <= StackMapTable)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:331:51: bodyExtension
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bodyExtension_in_body2071);
            	    bodyExtension250=bodyExtension();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bodyExtension250.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:334:1: bodyExtension : ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) ) ;
    public final JVMWalker.bodyExtension_return bodyExtension() throws RecognitionException {
        JVMWalker.bodyExtension_return retval = new JVMWalker.bodyExtension_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ExceptionTable251=null;
        CommonTree LineNumberTable253=null;
        CommonTree LocalVariableTable255=null;
        CommonTree LocalVariableTypeTable257=null;
        CommonTree StackMapTable259=null;
        CommonTree StackMap261=null;
        JVMWalker.exceptionTable_return exceptionTable252 =null;

        JVMWalker.lineNumberTable_return lineNumberTable254 =null;

        JVMWalker.localVariableTable_return localVariableTable256 =null;

        JVMWalker.localVariableTable_return localVariableTable258 =null;

        JVMWalker.stackMapTable_return stackMapTable260 =null;

        JVMWalker.stackMapTypeTable_return stackMapTypeTable262 =null;


        CommonTree ExceptionTable251_tree=null;
        CommonTree LineNumberTable253_tree=null;
        CommonTree LocalVariableTable255_tree=null;
        CommonTree LocalVariableTypeTable257_tree=null;
        CommonTree StackMapTable259_tree=null;
        CommonTree StackMap261_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:335:3: ( ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:336:3: ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:336:3: ( ^( ExceptionTable exceptionTable ) | ^( LineNumberTable ( lineNumberTable )? ) | ^( LocalVariableTable localVariableTable ) | ^( LocalVariableTypeTable localVariableTable ) | ^( StackMapTable stackMapTable ) | ^( StackMap stackMapTypeTable ) )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:336:5: ^( ExceptionTable exceptionTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ExceptionTable251=(CommonTree)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension2092); 
                    ExceptionTable251_tree = (CommonTree)adaptor.dupNode(ExceptionTable251);


                    root_1 = (CommonTree)adaptor.becomeRoot(ExceptionTable251_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension2095);
                    exceptionTable252=exceptionTable();

                    state._fsp--;

                    adaptor.addChild(root_1, exceptionTable252.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:337:5: ^( LineNumberTable ( lineNumberTable )? )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LineNumberTable253=(CommonTree)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension2103); 
                    LineNumberTable253_tree = (CommonTree)adaptor.dupNode(LineNumberTable253);


                    root_1 = (CommonTree)adaptor.becomeRoot(LineNumberTable253_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:337:24: ( lineNumberTable )?
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==IDENTIFIER) ) {
                            alt60=1;
                        }
                        switch (alt60) {
                            case 1 :
                                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:337:24: lineNumberTable
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_lineNumberTable_in_bodyExtension2106);
                                lineNumberTable254=lineNumberTable();

                                state._fsp--;

                                adaptor.addChild(root_1, lineNumberTable254.getTree());


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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:338:5: ^( LocalVariableTable localVariableTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LocalVariableTable255=(CommonTree)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension2115); 
                    LocalVariableTable255_tree = (CommonTree)adaptor.dupNode(LocalVariableTable255);


                    root_1 = (CommonTree)adaptor.becomeRoot(LocalVariableTable255_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension2118);
                    localVariableTable256=localVariableTable();

                    state._fsp--;

                    adaptor.addChild(root_1, localVariableTable256.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:339:5: ^( LocalVariableTypeTable localVariableTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LocalVariableTypeTable257=(CommonTree)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension2126); 
                    LocalVariableTypeTable257_tree = (CommonTree)adaptor.dupNode(LocalVariableTypeTable257);


                    root_1 = (CommonTree)adaptor.becomeRoot(LocalVariableTypeTable257_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension2129);
                    localVariableTable258=localVariableTable();

                    state._fsp--;

                    adaptor.addChild(root_1, localVariableTable258.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:340:5: ^( StackMapTable stackMapTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    StackMapTable259=(CommonTree)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension2137); 
                    StackMapTable259_tree = (CommonTree)adaptor.dupNode(StackMapTable259);


                    root_1 = (CommonTree)adaptor.becomeRoot(StackMapTable259_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension2139);
                    stackMapTable260=stackMapTable();

                    state._fsp--;

                    adaptor.addChild(root_1, stackMapTable260.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:341:5: ^( StackMap stackMapTypeTable )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    StackMap261=(CommonTree)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension2147); 
                    StackMap261_tree = (CommonTree)adaptor.dupNode(StackMap261);


                    root_1 = (CommonTree)adaptor.becomeRoot(StackMap261_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension2149);
                    stackMapTypeTable262=stackMapTypeTable();

                    state._fsp--;

                    adaptor.addChild(root_1, stackMapTypeTable262.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:345:1: codeBlock : ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) ;
    public final JVMWalker.codeBlock_return codeBlock() throws RecognitionException {
        JVMWalker.codeBlock_return retval = new JVMWalker.codeBlock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VARINFO263=null;
        CommonTree INSTRUCTION265=null;
        JVMWalker.variables_return variables264 =null;

        JVMWalker.instructionSet_return instructionSet266 =null;

        JVMWalker.codeBlockEnd_return codeBlockEnd267 =null;


        CommonTree VARINFO263_tree=null;
        CommonTree INSTRUCTION265_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:346:3: ( ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:346:5: ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VARINFO263=(CommonTree)match(input,VARINFO,FOLLOW_VARINFO_in_codeBlock2168); 
            VARINFO263_tree = (CommonTree)adaptor.dupNode(VARINFO263);


            root_1 = (CommonTree)adaptor.becomeRoot(VARINFO263_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variables_in_codeBlock2170);
            variables264=variables();

            state._fsp--;

            adaptor.addChild(root_1, variables264.getTree());


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
            INSTRUCTION265=(CommonTree)match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_codeBlock2174); 
            INSTRUCTION265_tree = (CommonTree)adaptor.dupNode(INSTRUCTION265);


            root_1 = (CommonTree)adaptor.becomeRoot(INSTRUCTION265_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:346:40: ( instructionSet )*
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:346:40: instructionSet
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_instructionSet_in_codeBlock2176);
            	    instructionSet266=instructionSet();

            	    state._fsp--;

            	    adaptor.addChild(root_1, instructionSet266.getTree());


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock2179);
            codeBlockEnd267=codeBlockEnd();

            state._fsp--;

            adaptor.addChild(root_1, codeBlockEnd267.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:349:1: instructionSet : ( codeLine | javaSwitch );
    public final JVMWalker.instructionSet_return instructionSet() throws RecognitionException {
        JVMWalker.instructionSet_return retval = new JVMWalker.instructionSet_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.codeLine_return codeLine268 =null;

        JVMWalker.javaSwitch_return javaSwitch269 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:350:3: ( codeLine | javaSwitch )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:350:5: codeLine
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_codeLine_in_instructionSet2193);
                    codeLine268=codeLine();

                    state._fsp--;

                    adaptor.addChild(root_0, codeLine268.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:350:16: javaSwitch
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_javaSwitch_in_instructionSet2197);
                    javaSwitch269=javaSwitch();

                    state._fsp--;

                    adaptor.addChild(root_0, javaSwitch269.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:353:1: codeLine : ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) ;
    public final JVMWalker.codeLine_return codeLine() throws RecognitionException {
        JVMWalker.codeLine_return retval = new JVMWalker.codeLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER270=null;
        CommonTree OPERAND272=null;
        CommonTree OPERAND274=null;
        CommonTree INTLITERAL275=null;
        JVMWalker.pc_return pc271 =null;

        JVMWalker.operand1_return operand1273 =null;


        CommonTree IDENTIFIER270_tree=null;
        CommonTree OPERAND272_tree=null;
        CommonTree OPERAND274_tree=null;
        CommonTree INTLITERAL275_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:354:3: ( ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:354:5: ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER270=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine2211); 
            IDENTIFIER270_tree = (CommonTree)adaptor.dupNode(IDENTIFIER270);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER270_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_codeLine2213);
            pc271=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc271.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OPERAND272=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_codeLine2216); 
            OPERAND272_tree = (CommonTree)adaptor.dupNode(OPERAND272);


            root_2 = (CommonTree)adaptor.becomeRoot(OPERAND272_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:354:31: ( operand1 )?
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==BOOLEAN||LA64_0==BYTE||LA64_0==CHAR||LA64_0==CPINDEX||LA64_0==DOUBLE||LA64_0==FLOAT||LA64_0==INT||LA64_0==INTLITERAL||LA64_0==LONG||LA64_0==SHORT||LA64_0==VOID) ) {
                    alt64=1;
                }
                switch (alt64) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:354:31: operand1
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_operand1_in_codeLine2218);
                        operand1273=operand1();

                        state._fsp--;

                        adaptor.addChild(root_2, operand1273.getTree());


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
            OPERAND274=(CommonTree)match(input,OPERAND,FOLLOW_OPERAND_in_codeLine2223); 
            OPERAND274_tree = (CommonTree)adaptor.dupNode(OPERAND274);


            root_2 = (CommonTree)adaptor.becomeRoot(OPERAND274_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:354:52: ( INTLITERAL )?
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==INTLITERAL) ) {
                    alt65=1;
                }
                switch (alt65) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:354:52: INTLITERAL
                        {
                        _last = (CommonTree)input.LT(1);
                        INTLITERAL275=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeLine2225); 
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


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:357:1: codeBlockEnd : ^( IDENTIFIER pc ( INTLITERAL )? ) ;
    public final JVMWalker.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        JVMWalker.codeBlockEnd_return retval = new JVMWalker.codeBlockEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER276=null;
        CommonTree INTLITERAL278=null;
        JVMWalker.pc_return pc277 =null;


        CommonTree IDENTIFIER276_tree=null;
        CommonTree INTLITERAL278_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:358:3: ( ^( IDENTIFIER pc ( INTLITERAL )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:358:5: ^( IDENTIFIER pc ( INTLITERAL )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER276=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd2242); 
            IDENTIFIER276_tree = (CommonTree)adaptor.dupNode(IDENTIFIER276);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER276_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_codeBlockEnd2244);
            pc277=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc277.getTree());


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:358:21: ( INTLITERAL )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==INTLITERAL) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:358:21: INTLITERAL
                    {
                    _last = (CommonTree)input.LT(1);
                    INTLITERAL278=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeBlockEnd2246); 
                    INTLITERAL278_tree = (CommonTree)adaptor.dupNode(INTLITERAL278);


                    adaptor.addChild(root_1, INTLITERAL278_tree);


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:361:1: operand1 : ( CPINDEX | INTLITERAL | primitiveType );
    public final JVMWalker.operand1_return operand1() throws RecognitionException {
        JVMWalker.operand1_return retval = new JVMWalker.operand1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CPINDEX279=null;
        CommonTree INTLITERAL280=null;
        JVMWalker.primitiveType_return primitiveType281 =null;


        CommonTree CPINDEX279_tree=null;
        CommonTree INTLITERAL280_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:362:3: ( CPINDEX | INTLITERAL | primitiveType )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:362:5: CPINDEX
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CPINDEX279=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_operand12263); 
                    CPINDEX279_tree = (CommonTree)adaptor.dupNode(CPINDEX279);


                    adaptor.addChild(root_0, CPINDEX279_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:363:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL280=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_operand12270); 
                    INTLITERAL280_tree = (CommonTree)adaptor.dupNode(INTLITERAL280);


                    adaptor.addChild(root_0, INTLITERAL280_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:364:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_operand12276);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:367:1: variables : variable variable variable ;
    public final JVMWalker.variables_return variables() throws RecognitionException {
        JVMWalker.variables_return retval = new JVMWalker.variables_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.variable_return variable282 =null;

        JVMWalker.variable_return variable283 =null;

        JVMWalker.variable_return variable284 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:368:3: ( variable variable variable )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:368:5: variable variable variable
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2289);
            variable282=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable282.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2291);
            variable283=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable283.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_variables2293);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:371:1: variable : ^( ASSIGN IDENTIFIER INTLITERAL ) ;
    public final JVMWalker.variable_return variable() throws RecognitionException {
        JVMWalker.variable_return retval = new JVMWalker.variable_return();
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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:372:3: ( ^( ASSIGN IDENTIFIER INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:372:5: ^( ASSIGN IDENTIFIER INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN285=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable2307); 
            ASSIGN285_tree = (CommonTree)adaptor.dupNode(ASSIGN285);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN285_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER286=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable2309); 
            IDENTIFIER286_tree = (CommonTree)adaptor.dupNode(IDENTIFIER286);


            adaptor.addChild(root_1, IDENTIFIER286_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL287=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable2311); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:375:1: javaSwitch : ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) ;
    public final JVMWalker.javaSwitch_return javaSwitch() throws RecognitionException {
        JVMWalker.javaSwitch_return retval = new JVMWalker.javaSwitch_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SWITCH288=null;
        CommonTree IDENTIFIER289=null;
        JVMWalker.pc_return pc290 =null;

        JVMWalker.switchLine_return switchLine291 =null;

        JVMWalker.switchDefaultLine_return switchDefaultLine292 =null;


        CommonTree SWITCH288_tree=null;
        CommonTree IDENTIFIER289_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:376:3: ( ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:376:5: ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SWITCH288=(CommonTree)match(input,SWITCH,FOLLOW_SWITCH_in_javaSwitch2328); 
            SWITCH288_tree = (CommonTree)adaptor.dupNode(SWITCH288);


            root_1 = (CommonTree)adaptor.becomeRoot(SWITCH288_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER289=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch2331); 
            IDENTIFIER289_tree = (CommonTree)adaptor.dupNode(IDENTIFIER289);


            root_2 = (CommonTree)adaptor.becomeRoot(IDENTIFIER289_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_javaSwitch2333);
            pc290=pc();

            state._fsp--;

            adaptor.addChild(root_2, pc290.getTree());


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:376:30: ( switchLine )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==INTLITERAL) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:376:30: switchLine
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch2335);
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
            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch2338);
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


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:379:1: switchLine : pc INTLITERAL ;
    public final JVMWalker.switchLine_return switchLine() throws RecognitionException {
        JVMWalker.switchLine_return retval = new JVMWalker.switchLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL294=null;
        JVMWalker.pc_return pc293 =null;


        CommonTree INTLITERAL294_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:380:3: ( pc INTLITERAL )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:380:5: pc INTLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_switchLine2355);
            pc293=pc();

            state._fsp--;

            adaptor.addChild(root_0, pc293.getTree());


            _last = (CommonTree)input.LT(1);
            INTLITERAL294=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine2357); 
            INTLITERAL294_tree = (CommonTree)adaptor.dupNode(INTLITERAL294);


            adaptor.addChild(root_0, INTLITERAL294_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:383:1: switchDefaultLine : ^( DEFAULT INTLITERAL ) ;
    public final JVMWalker.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        JVMWalker.switchDefaultLine_return retval = new JVMWalker.switchDefaultLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT295=null;
        CommonTree INTLITERAL296=null;

        CommonTree DEFAULT295_tree=null;
        CommonTree INTLITERAL296_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:384:3: ( ^( DEFAULT INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:384:5: ^( DEFAULT INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DEFAULT295=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine2372); 
            DEFAULT295_tree = (CommonTree)adaptor.dupNode(DEFAULT295);


            root_1 = (CommonTree)adaptor.becomeRoot(DEFAULT295_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INTLITERAL296=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine2374); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:391:1: throwClause : ^( THROWS typeList ) ;
    public final JVMWalker.throwClause_return throwClause() throws RecognitionException {
        JVMWalker.throwClause_return retval = new JVMWalker.throwClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROWS297=null;
        JVMWalker.typeList_return typeList298 =null;


        CommonTree THROWS297_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:392:3: ( ^( THROWS typeList ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:392:5: ^( THROWS typeList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWS297=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClause2394); 
            THROWS297_tree = (CommonTree)adaptor.dupNode(THROWS297);


            root_1 = (CommonTree)adaptor.becomeRoot(THROWS297_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeList_in_throwClause2396);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:395:1: throwClauseMethod : ^( THROWS ( throwType )+ ) ;
    public final JVMWalker.throwClauseMethod_return throwClauseMethod() throws RecognitionException {
        JVMWalker.throwClauseMethod_return retval = new JVMWalker.throwClauseMethod_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROWS299=null;
        JVMWalker.throwType_return throwType300 =null;


        CommonTree THROWS299_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:396:3: ( ^( THROWS ( throwType )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:396:5: ^( THROWS ( throwType )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            THROWS299=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClauseMethod2413); 
            THROWS299_tree = (CommonTree)adaptor.dupNode(THROWS299);


            root_1 = (CommonTree)adaptor.becomeRoot(THROWS299_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:396:14: ( throwType )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:396:14: throwType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_throwType_in_throwClauseMethod2415);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:399:1: throwType : ( INTERNALTYPE | IDENTIFIER | QualifiedType );
    public final JVMWalker.throwType_return throwType() throws RecognitionException {
        JVMWalker.throwType_return retval = new JVMWalker.throwType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set301=null;

        CommonTree set301_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:400:3: ( INTERNALTYPE | IDENTIFIER | QualifiedType )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:403:1: exceptionTable : ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) ;
    public final JVMWalker.exceptionTable_return exceptionTable() throws RecognitionException {
        JVMWalker.exceptionTable_return retval = new JVMWalker.exceptionTable_return();
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
        JVMWalker.exceptionTableEntry_return exceptionTableEntry308 =null;


        CommonTree ETHEADER302_tree=null;
        CommonTree IDENTIFIER303_tree=null;
        CommonTree IDENTIFIER304_tree=null;
        CommonTree IDENTIFIER305_tree=null;
        CommonTree IDENTIFIER306_tree=null;
        CommonTree ETENTRY307_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:404:3: ( ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:404:5: ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ETHEADER302=(CommonTree)match(input,ETHEADER,FOLLOW_ETHEADER_in_exceptionTable2454); 
            ETHEADER302_tree = (CommonTree)adaptor.dupNode(ETHEADER302);


            root_1 = (CommonTree)adaptor.becomeRoot(ETHEADER302_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER303=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2456); 
            IDENTIFIER303_tree = (CommonTree)adaptor.dupNode(IDENTIFIER303);


            adaptor.addChild(root_1, IDENTIFIER303_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER304=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2458); 
            IDENTIFIER304_tree = (CommonTree)adaptor.dupNode(IDENTIFIER304);


            adaptor.addChild(root_1, IDENTIFIER304_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER305=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2460); 
            IDENTIFIER305_tree = (CommonTree)adaptor.dupNode(IDENTIFIER305);


            adaptor.addChild(root_1, IDENTIFIER305_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER306=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable2462); 
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
            ETENTRY307=(CommonTree)match(input,ETENTRY,FOLLOW_ETENTRY_in_exceptionTable2466); 
            ETENTRY307_tree = (CommonTree)adaptor.dupNode(ETENTRY307);


            root_1 = (CommonTree)adaptor.becomeRoot(ETENTRY307_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:404:71: ( exceptionTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:404:71: exceptionTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable2468);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:407:1: exceptionTableEntry : INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue ;
    public final JVMWalker.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        JVMWalker.exceptionTableEntry_return retval = new JVMWalker.exceptionTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL309=null;
        CommonTree INTLITERAL310=null;
        CommonTree INTLITERAL311=null;
        JVMWalker.exceptionTableEntryValue_return exceptionTableEntryValue312 =null;


        CommonTree INTLITERAL309_tree=null;
        CommonTree INTLITERAL310_tree=null;
        CommonTree INTLITERAL311_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:408:3: ( INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:408:5: INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL309=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2483); 
            INTLITERAL309_tree = (CommonTree)adaptor.dupNode(INTLITERAL309);


            adaptor.addChild(root_0, INTLITERAL309_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL310=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2485); 
            INTLITERAL310_tree = (CommonTree)adaptor.dupNode(INTLITERAL310);


            adaptor.addChild(root_0, INTLITERAL310_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL311=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry2487); 
            INTLITERAL311_tree = (CommonTree)adaptor.dupNode(INTLITERAL311);


            adaptor.addChild(root_0, INTLITERAL311_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry2489);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:410:1: exceptionTableEntryValue : ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE );
    public final JVMWalker.exceptionTableEntryValue_return exceptionTableEntryValue() throws RecognitionException {
        JVMWalker.exceptionTableEntryValue_return retval = new JVMWalker.exceptionTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER314=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE315=null;
        JVMWalker.primitiveType_return primitiveType313 =null;


        CommonTree IDENTIFIER314_tree=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE315_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:411:3: ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:411:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntryValue2501);
                    primitiveType313=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType313.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:412:5: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER314=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntryValue2507); 
                    IDENTIFIER314_tree = (CommonTree)adaptor.dupNode(IDENTIFIER314);


                    adaptor.addChild(root_0, IDENTIFIER314_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:413:5: CONSTANT_TYPE_ASSIGNABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CONSTANT_TYPE_ASSIGNABLE315=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue2513); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:420:1: lineNumberTable : ( lineNumberTableLine )+ ;
    public final JVMWalker.lineNumberTable_return lineNumberTable() throws RecognitionException {
        JVMWalker.lineNumberTable_return retval = new JVMWalker.lineNumberTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.lineNumberTableLine_return lineNumberTableLine316 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:421:3: ( ( lineNumberTableLine )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:421:5: ( lineNumberTableLine )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:421:5: ( lineNumberTableLine )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:421:5: lineNumberTableLine
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable2532);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:424:1: lineNumberTableLine : ^( IDENTIFIER pc INTLITERAL ) ;
    public final JVMWalker.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        JVMWalker.lineNumberTableLine_return retval = new JVMWalker.lineNumberTableLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER317=null;
        CommonTree INTLITERAL319=null;
        JVMWalker.pc_return pc318 =null;


        CommonTree IDENTIFIER317_tree=null;
        CommonTree INTLITERAL319_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:425:3: ( ^( IDENTIFIER pc INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:425:5: ^( IDENTIFIER pc INTLITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IDENTIFIER317=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine2547); 
            IDENTIFIER317_tree = (CommonTree)adaptor.dupNode(IDENTIFIER317);


            root_1 = (CommonTree)adaptor.becomeRoot(IDENTIFIER317_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pc_in_lineNumberTableLine2549);
            pc318=pc();

            state._fsp--;

            adaptor.addChild(root_1, pc318.getTree());


            _last = (CommonTree)input.LT(1);
            INTLITERAL319=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine2551); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:432:1: localVariableTable : ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) ;
    public final JVMWalker.localVariableTable_return localVariableTable() throws RecognitionException {
        JVMWalker.localVariableTable_return retval = new JVMWalker.localVariableTable_return();
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
        JVMWalker.localVariableTableLine_return localVariableTableLine327 =null;


        CommonTree LVHEADER320_tree=null;
        CommonTree IDENTIFIER321_tree=null;
        CommonTree IDENTIFIER322_tree=null;
        CommonTree IDENTIFIER323_tree=null;
        CommonTree IDENTIFIER324_tree=null;
        CommonTree IDENTIFIER325_tree=null;
        CommonTree LVENTRY326_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:433:3: ( ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:433:5: ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            LVHEADER320=(CommonTree)match(input,LVHEADER,FOLLOW_LVHEADER_in_localVariableTable2574); 
            LVHEADER320_tree = (CommonTree)adaptor.dupNode(LVHEADER320);


            root_1 = (CommonTree)adaptor.becomeRoot(LVHEADER320_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER321=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2576); 
            IDENTIFIER321_tree = (CommonTree)adaptor.dupNode(IDENTIFIER321);


            adaptor.addChild(root_1, IDENTIFIER321_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER322=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2578); 
            IDENTIFIER322_tree = (CommonTree)adaptor.dupNode(IDENTIFIER322);


            adaptor.addChild(root_1, IDENTIFIER322_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER323=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2580); 
            IDENTIFIER323_tree = (CommonTree)adaptor.dupNode(IDENTIFIER323);


            adaptor.addChild(root_1, IDENTIFIER323_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER324=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2582); 
            IDENTIFIER324_tree = (CommonTree)adaptor.dupNode(IDENTIFIER324);


            adaptor.addChild(root_1, IDENTIFIER324_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER325=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable2584); 
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
            LVENTRY326=(CommonTree)match(input,LVENTRY,FOLLOW_LVENTRY_in_localVariableTable2588); 
            LVENTRY326_tree = (CommonTree)adaptor.dupNode(LVENTRY326);


            root_1 = (CommonTree)adaptor.becomeRoot(LVENTRY326_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:433:82: ( localVariableTableLine )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==INTLITERAL) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:433:82: localVariableTableLine
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable2590);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:436:1: localVariableTableLine : INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType ;
    public final JVMWalker.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        JVMWalker.localVariableTableLine_return retval = new JVMWalker.localVariableTableLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL328=null;
        CommonTree INTLITERAL329=null;
        CommonTree INTLITERAL330=null;
        JVMWalker.localVariableTableLineIdentifier_return localVariableTableLineIdentifier331 =null;

        JVMWalker.bytecodeType_return bytecodeType332 =null;


        CommonTree INTLITERAL328_tree=null;
        CommonTree INTLITERAL329_tree=null;
        CommonTree INTLITERAL330_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:437:3: ( INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:437:5: INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL328=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine2607); 
            INTLITERAL328_tree = (CommonTree)adaptor.dupNode(INTLITERAL328);


            adaptor.addChild(root_0, INTLITERAL328_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL329=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine2609); 
            INTLITERAL329_tree = (CommonTree)adaptor.dupNode(INTLITERAL329);


            adaptor.addChild(root_0, INTLITERAL329_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL330=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine2611); 
            INTLITERAL330_tree = (CommonTree)adaptor.dupNode(INTLITERAL330);


            adaptor.addChild(root_0, INTLITERAL330_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine2613);
            localVariableTableLineIdentifier331=localVariableTableLineIdentifier();

            state._fsp--;

            adaptor.addChild(root_0, localVariableTableLineIdentifier331.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine2615);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:440:1: localVariableTableLineIdentifier : IDENTIFIER ;
    public final JVMWalker.localVariableTableLineIdentifier_return localVariableTableLineIdentifier() throws RecognitionException {
        JVMWalker.localVariableTableLineIdentifier_return retval = new JVMWalker.localVariableTableLineIdentifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER333=null;

        CommonTree IDENTIFIER333_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:441:3: ( IDENTIFIER )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:441:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER333=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier2629); 
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:448:1: stackMapTypeTable : ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) ;
    public final JVMWalker.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        JVMWalker.stackMapTypeTable_return retval = new JVMWalker.stackMapTypeTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMTHEADER334=null;
        CommonTree IDENTIFIER335=null;
        CommonTree ASSIGN336=null;
        CommonTree INTLITERAL337=null;
        CommonTree SMTENTRY338=null;
        JVMWalker.stackMapTypeTableEntry_return stackMapTypeTableEntry339 =null;


        CommonTree SMTHEADER334_tree=null;
        CommonTree IDENTIFIER335_tree=null;
        CommonTree ASSIGN336_tree=null;
        CommonTree INTLITERAL337_tree=null;
        CommonTree SMTENTRY338_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:449:3: ( ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:449:5: ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMTHEADER334=(CommonTree)match(input,SMTHEADER,FOLLOW_SMTHEADER_in_stackMapTypeTable2649); 
            SMTHEADER334_tree = (CommonTree)adaptor.dupNode(SMTHEADER334);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTHEADER334_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER335=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable2651); 
            IDENTIFIER335_tree = (CommonTree)adaptor.dupNode(IDENTIFIER335);


            adaptor.addChild(root_1, IDENTIFIER335_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN336=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable2653); 
            ASSIGN336_tree = (CommonTree)adaptor.dupNode(ASSIGN336);


            adaptor.addChild(root_1, ASSIGN336_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL337=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable2655); 
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
            SMTENTRY338=(CommonTree)match(input,SMTENTRY,FOLLOW_SMTENTRY_in_stackMapTypeTable2659); 
            SMTENTRY338_tree = (CommonTree)adaptor.dupNode(SMTENTRY338);


            root_1 = (CommonTree)adaptor.becomeRoot(SMTENTRY338_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:449:58: ( stackMapTypeTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:449:58: stackMapTypeTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable2661);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:452:1: stackMapTypeTableEntry : IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer ;
    public final JVMWalker.stackMapTypeTableEntry_return stackMapTypeTableEntry() throws RecognitionException {
        JVMWalker.stackMapTypeTableEntry_return retval = new JVMWalker.stackMapTypeTableEntry_return();
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
        JVMWalker.stackMapTableTypesContainer_return stackMapTableTypesContainer348 =null;

        JVMWalker.stackMapTableTypesContainer_return stackMapTableTypesContainer351 =null;


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
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:453:3: ( IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:453:5: IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER340=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2676); 
            IDENTIFIER340_tree = (CommonTree)adaptor.dupNode(IDENTIFIER340);


            adaptor.addChild(root_0, IDENTIFIER340_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN341=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2678); 
            ASSIGN341_tree = (CommonTree)adaptor.dupNode(ASSIGN341);


            adaptor.addChild(root_0, ASSIGN341_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL342=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2680); 
            INTLITERAL342_tree = (CommonTree)adaptor.dupNode(INTLITERAL342);


            adaptor.addChild(root_0, INTLITERAL342_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER343=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2682); 
            IDENTIFIER343_tree = (CommonTree)adaptor.dupNode(IDENTIFIER343);


            adaptor.addChild(root_0, IDENTIFIER343_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN344=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2684); 
            ASSIGN344_tree = (CommonTree)adaptor.dupNode(ASSIGN344);


            adaptor.addChild(root_0, ASSIGN344_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL345=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2686); 
            INTLITERAL345_tree = (CommonTree)adaptor.dupNode(INTLITERAL345);


            adaptor.addChild(root_0, INTLITERAL345_tree);


            _last = (CommonTree)input.LT(1);
            IDENTIFIER346=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2693); 
            IDENTIFIER346_tree = (CommonTree)adaptor.dupNode(IDENTIFIER346);


            adaptor.addChild(root_0, IDENTIFIER346_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN347=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2695); 
            ASSIGN347_tree = (CommonTree)adaptor.dupNode(ASSIGN347);


            adaptor.addChild(root_0, ASSIGN347_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2697);
            stackMapTableTypesContainer348=stackMapTableTypesContainer();

            state._fsp--;

            adaptor.addChild(root_0, stackMapTableTypesContainer348.getTree());


            _last = (CommonTree)input.LT(1);
            IDENTIFIER349=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2704); 
            IDENTIFIER349_tree = (CommonTree)adaptor.dupNode(IDENTIFIER349);


            adaptor.addChild(root_0, IDENTIFIER349_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN350=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry2706); 
            ASSIGN350_tree = (CommonTree)adaptor.dupNode(ASSIGN350);


            adaptor.addChild(root_0, ASSIGN350_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2708);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:462:1: stackMapTable : ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) ;
    public final JVMWalker.stackMapTable_return stackMapTable() throws RecognitionException {
        JVMWalker.stackMapTable_return retval = new JVMWalker.stackMapTable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SMHEADER352=null;
        CommonTree IDENTIFIER353=null;
        CommonTree ASSIGN354=null;
        CommonTree INTLITERAL355=null;
        CommonTree SMENTRY356=null;
        JVMWalker.stackMapTableEntry_return stackMapTableEntry357 =null;


        CommonTree SMHEADER352_tree=null;
        CommonTree IDENTIFIER353_tree=null;
        CommonTree ASSIGN354_tree=null;
        CommonTree INTLITERAL355_tree=null;
        CommonTree SMENTRY356_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:463:3: ( ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:463:5: ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SMHEADER352=(CommonTree)match(input,SMHEADER,FOLLOW_SMHEADER_in_stackMapTable2727); 
            SMHEADER352_tree = (CommonTree)adaptor.dupNode(SMHEADER352);


            root_1 = (CommonTree)adaptor.becomeRoot(SMHEADER352_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER353=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable2729); 
            IDENTIFIER353_tree = (CommonTree)adaptor.dupNode(IDENTIFIER353);


            adaptor.addChild(root_1, IDENTIFIER353_tree);


            _last = (CommonTree)input.LT(1);
            ASSIGN354=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable2731); 
            ASSIGN354_tree = (CommonTree)adaptor.dupNode(ASSIGN354);


            adaptor.addChild(root_1, ASSIGN354_tree);


            _last = (CommonTree)input.LT(1);
            INTLITERAL355=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable2733); 
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
            SMENTRY356=(CommonTree)match(input,SMENTRY,FOLLOW_SMENTRY_in_stackMapTable2737); 
            SMENTRY356_tree = (CommonTree)adaptor.dupNode(SMENTRY356);


            root_1 = (CommonTree)adaptor.becomeRoot(SMENTRY356_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:463:56: ( stackMapTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:463:56: stackMapTableEntry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable2739);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:465:1: stackMapTableEntry : ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) ;
    public final JVMWalker.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        JVMWalker.stackMapTableEntry_return retval = new JVMWalker.stackMapTableEntry_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN358=null;
        CommonTree IDENTIFIER359=null;
        JVMWalker.stackMapTableEntryValue_return stackMapTableEntryValue360 =null;


        CommonTree ASSIGN358_tree=null;
        CommonTree IDENTIFIER359_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:466:3: ( ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:466:5: ^( ASSIGN IDENTIFIER stackMapTableEntryValue )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASSIGN358=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry2754); 
            ASSIGN358_tree = (CommonTree)adaptor.dupNode(ASSIGN358);


            root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN358_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENTIFIER359=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry2756); 
            IDENTIFIER359_tree = (CommonTree)adaptor.dupNode(IDENTIFIER359);


            adaptor.addChild(root_1, IDENTIFIER359_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry2758);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:468:1: stackMapTableEntryValue : ( INTLITERAL | stackMapTableTypesContainer );
    public final JVMWalker.stackMapTableEntryValue_return stackMapTableEntryValue() throws RecognitionException {
        JVMWalker.stackMapTableEntryValue_return retval = new JVMWalker.stackMapTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL361=null;
        JVMWalker.stackMapTableTypesContainer_return stackMapTableTypesContainer362 =null;


        CommonTree INTLITERAL361_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:469:3: ( INTLITERAL | stackMapTableTypesContainer )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==INTLITERAL) ) {
                alt76=1;
            }
            else if ( (LA76_0==UP||LA76_0==BOOLEAN||LA76_0==BYTE||LA76_0==CHAR||LA76_0==CLASS||LA76_0==DOUBLE||LA76_0==FLOAT||LA76_0==IDENTIFIER||LA76_0==INT||LA76_0==LONG||LA76_0==SHORT||LA76_0==VOID) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:469:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL361=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntryValue2771); 
                    INTLITERAL361_tree = (CommonTree)adaptor.dupNode(INTLITERAL361);


                    adaptor.addChild(root_0, INTLITERAL361_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:469:18: stackMapTableTypesContainer
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue2775);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:471:1: stackMapTableTypesContainer : stackMapTableTypes ;
    public final JVMWalker.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        JVMWalker.stackMapTableTypesContainer_return retval = new JVMWalker.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.stackMapTableTypes_return stackMapTableTypes363 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:472:3: ( stackMapTableTypes )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:472:5: stackMapTableTypes
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2787);
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:474:1: stackMapTableTypes : ( stackMapTableType )* ;
    public final JVMWalker.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        JVMWalker.stackMapTableTypes_return retval = new JVMWalker.stackMapTableTypes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.stackMapTableType_return stackMapTableType364 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:475:3: ( ( stackMapTableType )* )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:475:5: ( stackMapTableType )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:475:5: ( stackMapTableType )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==IDENTIFIER) ) {
                    int LA77_1 = input.LA(2);

                    if ( (LA77_1==UP||LA77_1==BOOLEAN||LA77_1==BYTE||LA77_1==CHAR||LA77_1==CLASS||LA77_1==DOUBLE||LA77_1==FLOAT||LA77_1==IDENTIFIER||LA77_1==INT||LA77_1==INTLITERAL||LA77_1==LONG||LA77_1==SHORT||LA77_1==VOID) ) {
                        alt77=1;
                    }


                }
                else if ( (LA77_0==BOOLEAN||LA77_0==BYTE||LA77_0==CHAR||LA77_0==CLASS||LA77_0==DOUBLE||LA77_0==FLOAT||LA77_0==INT||LA77_0==LONG||LA77_0==SHORT||LA77_0==VOID) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:475:5: stackMapTableType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes2810);
            	    stackMapTableType364=stackMapTableType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stackMapTableType364.getTree());


            	    }
            	    break;

            	default :
            	    break loop77;
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
    // $ANTLR end "stackMapTableTypes"


    public static class stackMapTableType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableType"
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:477:1: stackMapTableType : ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? );
    public final JVMWalker.stackMapTableType_return stackMapTableType() throws RecognitionException {
        JVMWalker.stackMapTableType_return retval = new JVMWalker.stackMapTableType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER368=null;
        CommonTree INTLITERAL369=null;
        JVMWalker.stackMapTableTypeObject_return stackMapTableTypeObject365 =null;

        JVMWalker.stackMapTableTypePlainObject_return stackMapTableTypePlainObject366 =null;

        JVMWalker.primitiveType_return primitiveType367 =null;


        CommonTree IDENTIFIER368_tree=null;
        CommonTree INTLITERAL369_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:478:3: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:478:5: stackMapTableTypeObject
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType2823);
                    stackMapTableTypeObject365=stackMapTableTypeObject();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypeObject365.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:478:29: stackMapTableTypePlainObject
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2825);
                    stackMapTableTypePlainObject366=stackMapTableTypePlainObject();

                    state._fsp--;

                    adaptor.addChild(root_0, stackMapTableTypePlainObject366.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:478:58: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType2827);
                    primitiveType367=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType367.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:478:72: IDENTIFIER ( INTLITERAL )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER368=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableType2829); 
                    IDENTIFIER368_tree = (CommonTree)adaptor.dupNode(IDENTIFIER368);


                    adaptor.addChild(root_0, IDENTIFIER368_tree);


                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:478:83: ( INTLITERAL )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==INTLITERAL) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:478:83: INTLITERAL
                            {
                            _last = (CommonTree)input.LT(1);
                            INTLITERAL369=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableType2831); 
                            INTLITERAL369_tree = (CommonTree)adaptor.dupNode(INTLITERAL369);


                            adaptor.addChild(root_0, INTLITERAL369_tree);


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:480:1: stackMapTableTypePlainObject : CLASS INTERNALTYPE ;
    public final JVMWalker.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        JVMWalker.stackMapTableTypePlainObject_return retval = new JVMWalker.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS370=null;
        CommonTree INTERNALTYPE371=null;

        CommonTree CLASS370_tree=null;
        CommonTree INTERNALTYPE371_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:481:3: ( CLASS INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:481:5: CLASS INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CLASS370=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject2844); 
            CLASS370_tree = (CommonTree)adaptor.dupNode(CLASS370);


            adaptor.addChild(root_0, CLASS370_tree);


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE371=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject2846); 
            INTERNALTYPE371_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE371);


            adaptor.addChild(root_0, INTERNALTYPE371_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:483:1: stackMapTableTypeObject : CLASS STRINGLITERAL ;
    public final JVMWalker.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        JVMWalker.stackMapTableTypeObject_return retval = new JVMWalker.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS372=null;
        CommonTree STRINGLITERAL373=null;

        CommonTree CLASS372_tree=null;
        CommonTree STRINGLITERAL373_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:484:3: ( CLASS STRINGLITERAL )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:484:5: CLASS STRINGLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CLASS372=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject2858); 
            CLASS372_tree = (CommonTree)adaptor.dupNode(CLASS372);


            adaptor.addChild(root_0, CLASS372_tree);


            _last = (CommonTree)input.LT(1);
            STRINGLITERAL373=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2860); 
            STRINGLITERAL373_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL373);


            adaptor.addChild(root_0, STRINGLITERAL373_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:494:1: typeList : ( type )+ ;
    public final JVMWalker.typeList_return typeList() throws RecognitionException {
        JVMWalker.typeList_return retval = new JVMWalker.typeList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.type_return type374 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:495:3: ( ( type )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:495:5: ( type )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:495:5: ( type )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:495:5: type
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_type_in_typeList2880);
            	    type374=type();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type374.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:497:1: type : ^( combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) ) ;
    public final JVMWalker.type_return type() throws RecognitionException {
        JVMWalker.type_return retval = new JVMWalker.type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARRAYBRACKS376=null;
        CommonTree LBRACK377=null;
        CommonTree RBRACK378=null;
        JVMWalker.combinedJavaType_return combinedJavaType375 =null;


        CommonTree ARRAYBRACKS376_tree=null;
        CommonTree LBRACK377_tree=null;
        CommonTree RBRACK378_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:498:3: ( ^( combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:498:5: ^( combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_combinedJavaType_in_type2894);
            combinedJavaType375=combinedJavaType();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(combinedJavaType375.getTree(), root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ARRAYBRACKS376=(CommonTree)match(input,ARRAYBRACKS,FOLLOW_ARRAYBRACKS_in_type2897); 
            ARRAYBRACKS376_tree = (CommonTree)adaptor.dupNode(ARRAYBRACKS376);


            root_2 = (CommonTree)adaptor.becomeRoot(ARRAYBRACKS376_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:498:38: ( LBRACK RBRACK )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==LBRACK) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:498:39: LBRACK RBRACK
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    LBRACK377=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_type2900); 
                	    LBRACK377_tree = (CommonTree)adaptor.dupNode(LBRACK377);


                	    adaptor.addChild(root_2, LBRACK377_tree);


                	    _last = (CommonTree)input.LT(1);
                	    RBRACK378=(CommonTree)match(input,RBRACK,FOLLOW_RBRACK_in_type2902); 
                	    RBRACK378_tree = (CommonTree)adaptor.dupNode(RBRACK378);


                	    adaptor.addChild(root_2, RBRACK378_tree);


                	    }
                	    break;

                	default :
                	    break loop81;
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
    // $ANTLR end "type"


    public static class combinedJavaType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "combinedJavaType"
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:500:1: combinedJavaType : ( primitiveType | referenceType );
    public final JVMWalker.combinedJavaType_return combinedJavaType() throws RecognitionException {
        JVMWalker.combinedJavaType_return retval = new JVMWalker.combinedJavaType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.primitiveType_return primitiveType379 =null;

        JVMWalker.referenceType_return referenceType380 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:501:3: ( primitiveType | referenceType )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:501:5: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_combinedJavaType2918);
                    primitiveType379=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType379.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:502:5: referenceType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_referenceType_in_combinedJavaType2924);
                    referenceType380=referenceType();

                    state._fsp--;

                    adaptor.addChild(root_0, referenceType380.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:504:1: referenceType : ^( UNITNAME ( typeDeclSpecifier )+ ) ;
    public final JVMWalker.referenceType_return referenceType() throws RecognitionException {
        JVMWalker.referenceType_return retval = new JVMWalker.referenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITNAME381=null;
        JVMWalker.typeDeclSpecifier_return typeDeclSpecifier382 =null;


        CommonTree UNITNAME381_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:505:3: ( ^( UNITNAME ( typeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:505:5: ^( UNITNAME ( typeDeclSpecifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME381=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_referenceType2937); 
            UNITNAME381_tree = (CommonTree)adaptor.dupNode(UNITNAME381);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITNAME381_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:505:16: ( typeDeclSpecifier )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:505:16: typeDeclSpecifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType2939);
            	    typeDeclSpecifier382=typeDeclSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_1, typeDeclSpecifier382.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:507:1: typeDeclSpecifier : ^( typeName ^( TYPEARGS ( typeArguments )? ) ) ;
    public final JVMWalker.typeDeclSpecifier_return typeDeclSpecifier() throws RecognitionException {
        JVMWalker.typeDeclSpecifier_return retval = new JVMWalker.typeDeclSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS384=null;
        JVMWalker.typeName_return typeName383 =null;

        JVMWalker.typeArguments_return typeArguments385 =null;


        CommonTree TYPEARGS384_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:508:3: ( ^( typeName ^( TYPEARGS ( typeArguments )? ) ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:508:5: ^( typeName ^( TYPEARGS ( typeArguments )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeName_in_typeDeclSpecifier2954);
            typeName383=typeName();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(typeName383.getTree(), root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS384=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_typeDeclSpecifier2957); 
            TYPEARGS384_tree = (CommonTree)adaptor.dupNode(TYPEARGS384);


            root_2 = (CommonTree)adaptor.becomeRoot(TYPEARGS384_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:508:27: ( typeArguments )?
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==BOOLEAN||LA84_0==BYTE||LA84_0==CHAR||LA84_0==DOUBLE||LA84_0==FLOAT||LA84_0==INT||LA84_0==LONG||LA84_0==QUESTION||LA84_0==SHORT||LA84_0==UNITNAME||LA84_0==VOID) ) {
                    alt84=1;
                }
                switch (alt84) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:508:27: typeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeArguments_in_typeDeclSpecifier2959);
                        typeArguments385=typeArguments();

                        state._fsp--;

                        adaptor.addChild(root_2, typeArguments385.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:510:1: typeName : QualifiedType ;
    public final JVMWalker.typeName_return typeName() throws RecognitionException {
        JVMWalker.typeName_return retval = new JVMWalker.typeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QualifiedType386=null;

        CommonTree QualifiedType386_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:511:3: ( QualifiedType )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:511:5: QualifiedType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            QualifiedType386=(CommonTree)match(input,QualifiedType,FOLLOW_QualifiedType_in_typeName2974); 
            QualifiedType386_tree = (CommonTree)adaptor.dupNode(QualifiedType386);


            adaptor.addChild(root_0, QualifiedType386_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:513:1: typeArguments : typeArgumentList ;
    public final JVMWalker.typeArguments_return typeArguments() throws RecognitionException {
        JVMWalker.typeArguments_return retval = new JVMWalker.typeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.typeArgumentList_return typeArgumentList387 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:514:3: ( typeArgumentList )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:514:5: typeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_typeArgumentList_in_typeArguments2986);
            typeArgumentList387=typeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, typeArgumentList387.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:516:1: typeArgumentList : ( typeArgument )+ ;
    public final JVMWalker.typeArgumentList_return typeArgumentList() throws RecognitionException {
        JVMWalker.typeArgumentList_return retval = new JVMWalker.typeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.typeArgument_return typeArgument388 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:517:3: ( ( typeArgument )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:517:5: ( typeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:517:5: ( typeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:517:5: typeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeArgument_in_typeArgumentList2999);
            	    typeArgument388=typeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeArgument388.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:519:1: typeArgument : ( type | wildcard );
    public final JVMWalker.typeArgument_return typeArgument() throws RecognitionException {
        JVMWalker.typeArgument_return retval = new JVMWalker.typeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.type_return type389 =null;

        JVMWalker.wildcard_return wildcard390 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:520:3: ( type | wildcard )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:520:5: type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_typeArgument3012);
                    type389=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type389.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:521:5: wildcard
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wildcard_in_typeArgument3018);
                    wildcard390=wildcard();

                    state._fsp--;

                    adaptor.addChild(root_0, wildcard390.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:523:1: wildcard : ^( QUESTION ( wildcardBounds )? ) ;
    public final JVMWalker.wildcard_return wildcard() throws RecognitionException {
        JVMWalker.wildcard_return retval = new JVMWalker.wildcard_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUESTION391=null;
        JVMWalker.wildcardBounds_return wildcardBounds392 =null;


        CommonTree QUESTION391_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:524:3: ( ^( QUESTION ( wildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:524:5: ^( QUESTION ( wildcardBounds )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUESTION391=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_wildcard3031); 
            QUESTION391_tree = (CommonTree)adaptor.dupNode(QUESTION391);


            root_1 = (CommonTree)adaptor.becomeRoot(QUESTION391_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:524:16: ( wildcardBounds )?
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==EXTENDS||LA87_0==SUPER) ) {
                    alt87=1;
                }
                switch (alt87) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:524:16: wildcardBounds
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_wildcardBounds_in_wildcard3033);
                        wildcardBounds392=wildcardBounds();

                        state._fsp--;

                        adaptor.addChild(root_1, wildcardBounds392.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:526:1: wildcardBounds : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final JVMWalker.wildcardBounds_return wildcardBounds() throws RecognitionException {
        JVMWalker.wildcardBounds_return retval = new JVMWalker.wildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS393=null;
        CommonTree SUPER395=null;
        JVMWalker.type_return type394 =null;

        JVMWalker.type_return type396 =null;


        CommonTree EXTENDS393_tree=null;
        CommonTree SUPER395_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:527:3: ( ^( EXTENDS type ) | ^( SUPER type ) )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:527:5: ^( EXTENDS type )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXTENDS393=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_wildcardBounds3048); 
                    EXTENDS393_tree = (CommonTree)adaptor.dupNode(EXTENDS393);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS393_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_wildcardBounds3050);
                    type394=type();

                    state._fsp--;

                    adaptor.addChild(root_1, type394.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:528:5: ^( SUPER type )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUPER395=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_wildcardBounds3058); 
                    SUPER395_tree = (CommonTree)adaptor.dupNode(SUPER395);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER395_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_wildcardBounds3060);
                    type396=type();

                    state._fsp--;

                    adaptor.addChild(root_1, type396.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:530:1: typeParameters : ( typeParameter )+ ;
    public final JVMWalker.typeParameters_return typeParameters() throws RecognitionException {
        JVMWalker.typeParameters_return retval = new JVMWalker.typeParameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.typeParameter_return typeParameter397 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:531:3: ( ( typeParameter )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:531:5: ( typeParameter )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:531:5: ( typeParameter )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==BaseType||LA89_0==Constant_type||LA89_0==IDENTIFIER||LA89_0==VoidType) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:531:5: typeParameter
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeParameter_in_typeParameters3073);
            	    typeParameter397=typeParameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeParameter397.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:533:1: typeParameter : ^( identifier ( typeBound )? ) ;
    public final JVMWalker.typeParameter_return typeParameter() throws RecognitionException {
        JVMWalker.typeParameter_return retval = new JVMWalker.typeParameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.identifier_return identifier398 =null;

        JVMWalker.typeBound_return typeBound399 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:534:3: ( ^( identifier ( typeBound )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:534:5: ^( identifier ( typeBound )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_typeParameter3087);
            identifier398=identifier();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(identifier398.getTree(), root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:534:18: ( typeBound )?
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==EXTENDS) ) {
                    alt90=1;
                }
                switch (alt90) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:534:18: typeBound
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_typeBound_in_typeParameter3089);
                        typeBound399=typeBound();

                        state._fsp--;

                        adaptor.addChild(root_1, typeBound399.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:536:1: typeBound : ^( EXTENDS ( referenceType )+ ) ;
    public final JVMWalker.typeBound_return typeBound() throws RecognitionException {
        JVMWalker.typeBound_return retval = new JVMWalker.typeBound_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS400=null;
        JVMWalker.referenceType_return referenceType401 =null;


        CommonTree EXTENDS400_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:537:3: ( ^( EXTENDS ( referenceType )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:537:5: ^( EXTENDS ( referenceType )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXTENDS400=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeBound3104); 
            EXTENDS400_tree = (CommonTree)adaptor.dupNode(EXTENDS400);


            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS400_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:537:15: ( referenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:537:15: referenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_referenceType_in_typeBound3106);
            	    referenceType401=referenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_1, referenceType401.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:542:1: genericDescriptor : ( genericReturnDescriptor )+ ;
    public final JVMWalker.genericDescriptor_return genericDescriptor() throws RecognitionException {
        JVMWalker.genericDescriptor_return retval = new JVMWalker.genericDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.genericReturnDescriptor_return genericReturnDescriptor402 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:543:3: ( ( genericReturnDescriptor )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:543:5: ( genericReturnDescriptor )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:543:5: ( genericReturnDescriptor )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:543:5: genericReturnDescriptor
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor3123);
            	    genericReturnDescriptor402=genericReturnDescriptor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, genericReturnDescriptor402.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:545:1: genericReturnDescriptor : ^( EXTENDS identifier bytecodeReferenceTypeList ) ;
    public final JVMWalker.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        JVMWalker.genericReturnDescriptor_return retval = new JVMWalker.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS403=null;
        JVMWalker.identifier_return identifier404 =null;

        JVMWalker.bytecodeReferenceTypeList_return bytecodeReferenceTypeList405 =null;


        CommonTree EXTENDS403_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:546:3: ( ^( EXTENDS identifier bytecodeReferenceTypeList ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:546:5: ^( EXTENDS identifier bytecodeReferenceTypeList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXTENDS403=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor3137); 
            EXTENDS403_tree = (CommonTree)adaptor.dupNode(EXTENDS403);


            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS403_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor3139);
            identifier404=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier404.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor3141);
            bytecodeReferenceTypeList405=bytecodeReferenceTypeList();

            state._fsp--;

            adaptor.addChild(root_1, bytecodeReferenceTypeList405.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:548:1: bytecodeReferenceTypeList : ( bytecodeReferenceType )+ ;
    public final JVMWalker.bytecodeReferenceTypeList_return bytecodeReferenceTypeList() throws RecognitionException {
        JVMWalker.bytecodeReferenceTypeList_return retval = new JVMWalker.bytecodeReferenceTypeList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.bytecodeReferenceType_return bytecodeReferenceType406 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:549:3: ( ( bytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:549:5: ( bytecodeReferenceType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:549:5: ( bytecodeReferenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:549:5: bytecodeReferenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList3155);
            	    bytecodeReferenceType406=bytecodeReferenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bytecodeReferenceType406.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:551:1: bytecodeReferenceType : ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) ;
    public final JVMWalker.bytecodeReferenceType_return bytecodeReferenceType() throws RecognitionException {
        JVMWalker.bytecodeReferenceType_return retval = new JVMWalker.bytecodeReferenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNITNAME407=null;
        JVMWalker.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier408 =null;


        CommonTree UNITNAME407_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:552:3: ( ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:552:5: ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNITNAME407=(CommonTree)match(input,UNITNAME,FOLLOW_UNITNAME_in_bytecodeReferenceType3169); 
            UNITNAME407_tree = (CommonTree)adaptor.dupNode(UNITNAME407);


            root_1 = (CommonTree)adaptor.becomeRoot(UNITNAME407_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:552:16: ( bytecodeTypeDeclSpecifier )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:552:16: bytecodeTypeDeclSpecifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType3171);
            	    bytecodeTypeDeclSpecifier408=bytecodeTypeDeclSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_1, bytecodeTypeDeclSpecifier408.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:554:1: bytecodeTypeDeclSpecifier : bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) ;
    public final JVMWalker.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier() throws RecognitionException {
        JVMWalker.bytecodeTypeDeclSpecifier_return retval = new JVMWalker.bytecodeTypeDeclSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS410=null;
        JVMWalker.bytecodeTypeName_return bytecodeTypeName409 =null;

        JVMWalker.bytecodeTypeArguments_return bytecodeTypeArguments411 =null;


        CommonTree TYPEARGS410_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:555:3: ( bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:555:5: bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier3185);
            bytecodeTypeName409=bytecodeTypeName();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeTypeName409.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS410=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier3188); 
            TYPEARGS410_tree = (CommonTree)adaptor.dupNode(TYPEARGS410);


            root_1 = (CommonTree)adaptor.becomeRoot(TYPEARGS410_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:555:33: ( bytecodeTypeArguments )?
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==QUESTION||LA95_0==UNITNAME) ) {
                    alt95=1;
                }
                switch (alt95) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:555:33: bytecodeTypeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier3190);
                        bytecodeTypeArguments411=bytecodeTypeArguments();

                        state._fsp--;

                        adaptor.addChild(root_1, bytecodeTypeArguments411.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:557:1: bytecodeTypeName : INTERNALTYPE ;
    public final JVMWalker.bytecodeTypeName_return bytecodeTypeName() throws RecognitionException {
        JVMWalker.bytecodeTypeName_return retval = new JVMWalker.bytecodeTypeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERNALTYPE412=null;

        CommonTree INTERNALTYPE412_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:558:3: ( INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:558:5: INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE412=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeTypeName3204); 
            INTERNALTYPE412_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE412);


            adaptor.addChild(root_0, INTERNALTYPE412_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:560:1: bytecodeTypeArguments : bytecodeTypeArgumentList ;
    public final JVMWalker.bytecodeTypeArguments_return bytecodeTypeArguments() throws RecognitionException {
        JVMWalker.bytecodeTypeArguments_return retval = new JVMWalker.bytecodeTypeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.bytecodeTypeArgumentList_return bytecodeTypeArgumentList413 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:561:3: ( bytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:561:5: bytecodeTypeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments3216);
            bytecodeTypeArgumentList413=bytecodeTypeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeTypeArgumentList413.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:563:1: bytecodeTypeArgumentList : ( bytecodeTypeArgument )+ ;
    public final JVMWalker.bytecodeTypeArgumentList_return bytecodeTypeArgumentList() throws RecognitionException {
        JVMWalker.bytecodeTypeArgumentList_return retval = new JVMWalker.bytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.bytecodeTypeArgument_return bytecodeTypeArgument414 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:564:3: ( ( bytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:564:5: ( bytecodeTypeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:564:5: ( bytecodeTypeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:564:5: bytecodeTypeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList3229);
            	    bytecodeTypeArgument414=bytecodeTypeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bytecodeTypeArgument414.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:566:1: bytecodeTypeArgument : ( bytecodeReferenceType | bytecodeWildcard );
    public final JVMWalker.bytecodeTypeArgument_return bytecodeTypeArgument() throws RecognitionException {
        JVMWalker.bytecodeTypeArgument_return retval = new JVMWalker.bytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.bytecodeReferenceType_return bytecodeReferenceType415 =null;

        JVMWalker.bytecodeWildcard_return bytecodeWildcard416 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:567:3: ( bytecodeReferenceType | bytecodeWildcard )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:567:5: bytecodeReferenceType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument3242);
                    bytecodeReferenceType415=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeReferenceType415.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:568:5: bytecodeWildcard
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument3248);
                    bytecodeWildcard416=bytecodeWildcard();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeWildcard416.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:570:1: bytecodeWildcard : ^( QUESTION ( bytecodeWildcardBounds )? ) ;
    public final JVMWalker.bytecodeWildcard_return bytecodeWildcard() throws RecognitionException {
        JVMWalker.bytecodeWildcard_return retval = new JVMWalker.bytecodeWildcard_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUESTION417=null;
        JVMWalker.bytecodeWildcardBounds_return bytecodeWildcardBounds418 =null;


        CommonTree QUESTION417_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:571:3: ( ^( QUESTION ( bytecodeWildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:571:5: ^( QUESTION ( bytecodeWildcardBounds )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            QUESTION417=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_bytecodeWildcard3261); 
            QUESTION417_tree = (CommonTree)adaptor.dupNode(QUESTION417);


            root_1 = (CommonTree)adaptor.becomeRoot(QUESTION417_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:571:16: ( bytecodeWildcardBounds )?
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==EXTENDS||LA98_0==SUPER) ) {
                    alt98=1;
                }
                switch (alt98) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:571:16: bytecodeWildcardBounds
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard3263);
                        bytecodeWildcardBounds418=bytecodeWildcardBounds();

                        state._fsp--;

                        adaptor.addChild(root_1, bytecodeWildcardBounds418.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:573:1: bytecodeWildcardBounds : ( ^( EXTENDS bytecodeReferenceType ) | ^( SUPER bytecodeReferenceType ) );
    public final JVMWalker.bytecodeWildcardBounds_return bytecodeWildcardBounds() throws RecognitionException {
        JVMWalker.bytecodeWildcardBounds_return retval = new JVMWalker.bytecodeWildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS419=null;
        CommonTree SUPER421=null;
        JVMWalker.bytecodeReferenceType_return bytecodeReferenceType420 =null;

        JVMWalker.bytecodeReferenceType_return bytecodeReferenceType422 =null;


        CommonTree EXTENDS419_tree=null;
        CommonTree SUPER421_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:574:3: ( ^( EXTENDS bytecodeReferenceType ) | ^( SUPER bytecodeReferenceType ) )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:574:5: ^( EXTENDS bytecodeReferenceType )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXTENDS419=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_bytecodeWildcardBounds3278); 
                    EXTENDS419_tree = (CommonTree)adaptor.dupNode(EXTENDS419);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS419_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3280);
                    bytecodeReferenceType420=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_1, bytecodeReferenceType420.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:575:5: ^( SUPER bytecodeReferenceType )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUPER421=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_bytecodeWildcardBounds3288); 
                    SUPER421_tree = (CommonTree)adaptor.dupNode(SUPER421);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER421_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3290);
                    bytecodeReferenceType422=bytecodeReferenceType();

                    state._fsp--;

                    adaptor.addChild(root_1, bytecodeReferenceType422.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:582:1: bytecodeType : ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER );
    public final JVMWalker.bytecodeType_return bytecodeType() throws RecognitionException {
        JVMWalker.bytecodeType_return retval = new JVMWalker.bytecodeType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BaseType424=null;
        CommonTree SEMI426=null;
        CommonTree IDENTIFIER427=null;
        JVMWalker.bytecodeArrayType_return bytecodeArrayType423 =null;

        JVMWalker.simpleBytecodeObjectType_return simpleBytecodeObjectType425 =null;


        CommonTree BaseType424_tree=null;
        CommonTree SEMI426_tree=null;
        CommonTree IDENTIFIER427_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:583:3: ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:583:5: bytecodeArrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType3308);
                    bytecodeArrayType423=bytecodeArrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeArrayType423.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:583:25: BaseType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BaseType424=(CommonTree)match(input,BaseType,FOLLOW_BaseType_in_bytecodeType3312); 
                    BaseType424_tree = (CommonTree)adaptor.dupNode(BaseType424);


                    adaptor.addChild(root_0, BaseType424_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:583:36: simpleBytecodeObjectType SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_bytecodeType3316);
                    simpleBytecodeObjectType425=simpleBytecodeObjectType();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleBytecodeObjectType425.getTree());


                    _last = (CommonTree)input.LT(1);
                    SEMI426=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType3318); 
                    SEMI426_tree = (CommonTree)adaptor.dupNode(SEMI426);


                    adaptor.addChild(root_0, SEMI426_tree);


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:583:68: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER427=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType3322); 
                    IDENTIFIER427_tree = (CommonTree)adaptor.dupNode(IDENTIFIER427);


                    adaptor.addChild(root_0, IDENTIFIER427_tree);


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:585:1: bytecodeArrayType : LBRACK bytecodeType ;
    public final JVMWalker.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        JVMWalker.bytecodeArrayType_return retval = new JVMWalker.bytecodeArrayType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LBRACK428=null;
        JVMWalker.bytecodeType_return bytecodeType429 =null;


        CommonTree LBRACK428_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:586:3: ( LBRACK bytecodeType )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:586:5: LBRACK bytecodeType
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            LBRACK428=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType3335); 
            LBRACK428_tree = (CommonTree)adaptor.dupNode(LBRACK428);


            adaptor.addChild(root_0, LBRACK428_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType3337);
            bytecodeType429=bytecodeType();

            state._fsp--;

            adaptor.addChild(root_0, bytecodeType429.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:588:1: simpleBytecodeObjectType : ( simpleBytecodeReferenceType )+ ;
    public final JVMWalker.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        JVMWalker.simpleBytecodeObjectType_return retval = new JVMWalker.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.simpleBytecodeReferenceType_return simpleBytecodeReferenceType430 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:589:3: ( ( simpleBytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:589:5: ( simpleBytecodeReferenceType )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:589:5: ( simpleBytecodeReferenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:589:5: simpleBytecodeReferenceType
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType3350);
            	    simpleBytecodeReferenceType430=simpleBytecodeReferenceType();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simpleBytecodeReferenceType430.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:591:1: simpleBytecodeReferenceType : simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) ;
    public final JVMWalker.simpleBytecodeReferenceType_return simpleBytecodeReferenceType() throws RecognitionException {
        JVMWalker.simpleBytecodeReferenceType_return retval = new JVMWalker.simpleBytecodeReferenceType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPEARGS432=null;
        JVMWalker.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName431 =null;

        JVMWalker.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments433 =null;


        CommonTree TYPEARGS432_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:592:3: ( simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:592:5: simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType3363);
            simpleBytecodeReferenceTypeName431=simpleBytecodeReferenceTypeName();

            state._fsp--;

            adaptor.addChild(root_0, simpleBytecodeReferenceTypeName431.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TYPEARGS432=(CommonTree)match(input,TYPEARGS,FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType3366); 
            TYPEARGS432_tree = (CommonTree)adaptor.dupNode(TYPEARGS432);


            root_1 = (CommonTree)adaptor.becomeRoot(TYPEARGS432_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:592:48: ( simpleBytecodeTypeArguments )?
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==BaseType||LA102_0==IDENTIFIER||LA102_0==INTERNALTYPE||LA102_0==LBRACK||LA102_0==MINUS||LA102_0==PLUS||LA102_0==STAR) ) {
                    alt102=1;
                }
                switch (alt102) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:592:48: simpleBytecodeTypeArguments
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType3368);
                        simpleBytecodeTypeArguments433=simpleBytecodeTypeArguments();

                        state._fsp--;

                        adaptor.addChild(root_1, simpleBytecodeTypeArguments433.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:594:1: simpleBytecodeReferenceTypeName : INTERNALTYPE ;
    public final JVMWalker.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName() throws RecognitionException {
        JVMWalker.simpleBytecodeReferenceTypeName_return retval = new JVMWalker.simpleBytecodeReferenceTypeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERNALTYPE434=null;

        CommonTree INTERNALTYPE434_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:595:3: ( INTERNALTYPE )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:595:5: INTERNALTYPE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTERNALTYPE434=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName3382); 
            INTERNALTYPE434_tree = (CommonTree)adaptor.dupNode(INTERNALTYPE434);


            adaptor.addChild(root_0, INTERNALTYPE434_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:597:1: simpleBytecodeTypeArguments : simpleBytecodeTypeArgumentList ;
    public final JVMWalker.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments() throws RecognitionException {
        JVMWalker.simpleBytecodeTypeArguments_return retval = new JVMWalker.simpleBytecodeTypeArguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList435 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:598:3: ( simpleBytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:598:5: simpleBytecodeTypeArgumentList
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments3394);
            simpleBytecodeTypeArgumentList435=simpleBytecodeTypeArgumentList();

            state._fsp--;

            adaptor.addChild(root_0, simpleBytecodeTypeArgumentList435.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:600:1: simpleBytecodeTypeArgumentList : ( simpleBytecodeTypeArgument )+ ;
    public final JVMWalker.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList() throws RecognitionException {
        JVMWalker.simpleBytecodeTypeArgumentList_return retval = new JVMWalker.simpleBytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument436 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:601:3: ( ( simpleBytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:601:5: ( simpleBytecodeTypeArgument )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:601:5: ( simpleBytecodeTypeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:601:5: simpleBytecodeTypeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList3406);
            	    simpleBytecodeTypeArgument436=simpleBytecodeTypeArgument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simpleBytecodeTypeArgument436.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:603:1: simpleBytecodeTypeArgument : ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR );
    public final JVMWalker.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument() throws RecognitionException {
        JVMWalker.simpleBytecodeTypeArgument_return retval = new JVMWalker.simpleBytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MINUS438=null;
        CommonTree PLUS440=null;
        CommonTree STAR442=null;
        JVMWalker.bytecodeType_return bytecodeType437 =null;

        JVMWalker.bytecodeType_return bytecodeType439 =null;

        JVMWalker.bytecodeType_return bytecodeType441 =null;


        CommonTree MINUS438_tree=null;
        CommonTree PLUS440_tree=null;
        CommonTree STAR442_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:604:3: ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR )
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
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:604:5: bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3419);
                    bytecodeType437=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType437.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:605:5: MINUS bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    MINUS438=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_simpleBytecodeTypeArgument3425); 
                    MINUS438_tree = (CommonTree)adaptor.dupNode(MINUS438);


                    adaptor.addChild(root_0, MINUS438_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3427);
                    bytecodeType439=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType439.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:606:5: PLUS bytecodeType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    PLUS440=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_simpleBytecodeTypeArgument3433); 
                    PLUS440_tree = (CommonTree)adaptor.dupNode(PLUS440);


                    adaptor.addChild(root_0, PLUS440_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3435);
                    bytecodeType441=bytecodeType();

                    state._fsp--;

                    adaptor.addChild(root_0, bytecodeType441.getTree());


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:607:5: STAR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    STAR442=(CommonTree)match(input,STAR,FOLLOW_STAR_in_simpleBytecodeTypeArgument3441); 
                    STAR442_tree = (CommonTree)adaptor.dupNode(STAR442);


                    adaptor.addChild(root_0, STAR442_tree);


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:614:1: identifier : ( IDENTIFIER | BaseType | VoidType | Constant_type );
    public final JVMWalker.identifier_return identifier() throws RecognitionException {
        JVMWalker.identifier_return retval = new JVMWalker.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set443=null;

        CommonTree set443_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:614:11: ( IDENTIFIER | BaseType | VoidType | Constant_type )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set443=(CommonTree)input.LT(1);

            if ( input.LA(1)==BaseType||input.LA(1)==Constant_type||input.LA(1)==IDENTIFIER||input.LA(1)==VoidType ) {
                input.consume();
                set443_tree = (CommonTree)adaptor.dupNode(set443);


                adaptor.addChild(root_0, set443_tree);

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
    // $ANTLR end "identifier"


    public static class keywordAggregate_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keywordAggregate"
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:616:1: keywordAggregate : ( identifier | primitiveType | EXTENDS | IMPLEMENTS | DEFAULT | CLASS | THROWS | SUPER | NATIVE );
    public final JVMWalker.keywordAggregate_return keywordAggregate() throws RecognitionException {
        JVMWalker.keywordAggregate_return retval = new JVMWalker.keywordAggregate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS446=null;
        CommonTree IMPLEMENTS447=null;
        CommonTree DEFAULT448=null;
        CommonTree CLASS449=null;
        CommonTree THROWS450=null;
        CommonTree SUPER451=null;
        CommonTree NATIVE452=null;
        JVMWalker.identifier_return identifier444 =null;

        JVMWalker.primitiveType_return primitiveType445 =null;


        CommonTree EXTENDS446_tree=null;
        CommonTree IMPLEMENTS447_tree=null;
        CommonTree DEFAULT448_tree=null;
        CommonTree CLASS449_tree=null;
        CommonTree THROWS450_tree=null;
        CommonTree SUPER451_tree=null;
        CommonTree NATIVE452_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:617:3: ( identifier | primitiveType | EXTENDS | IMPLEMENTS | DEFAULT | CLASS | THROWS | SUPER | NATIVE )
            int alt105=9;
            switch ( input.LA(1) ) {
            case BaseType:
            case Constant_type:
            case IDENTIFIER:
            case VoidType:
                {
                alt105=1;
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
                alt105=2;
                }
                break;
            case EXTENDS:
                {
                alt105=3;
                }
                break;
            case IMPLEMENTS:
                {
                alt105=4;
                }
                break;
            case DEFAULT:
                {
                alt105=5;
                }
                break;
            case CLASS:
                {
                alt105=6;
                }
                break;
            case THROWS:
                {
                alt105=7;
                }
                break;
            case SUPER:
                {
                alt105=8;
                }
                break;
            case NATIVE:
                {
                alt105=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }

            switch (alt105) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:617:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_keywordAggregate3477);
                    identifier444=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier444.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:617:18: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_keywordAggregate3481);
                    primitiveType445=primitiveType();

                    state._fsp--;

                    adaptor.addChild(root_0, primitiveType445.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:618:5: EXTENDS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    EXTENDS446=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_keywordAggregate3487); 
                    EXTENDS446_tree = (CommonTree)adaptor.dupNode(EXTENDS446);


                    adaptor.addChild(root_0, EXTENDS446_tree);


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:618:15: IMPLEMENTS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IMPLEMENTS447=(CommonTree)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_keywordAggregate3491); 
                    IMPLEMENTS447_tree = (CommonTree)adaptor.dupNode(IMPLEMENTS447);


                    adaptor.addChild(root_0, IMPLEMENTS447_tree);


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:618:29: DEFAULT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DEFAULT448=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_keywordAggregate3496); 
                    DEFAULT448_tree = (CommonTree)adaptor.dupNode(DEFAULT448);


                    adaptor.addChild(root_0, DEFAULT448_tree);


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:618:40: CLASS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CLASS449=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_keywordAggregate3501); 
                    CLASS449_tree = (CommonTree)adaptor.dupNode(CLASS449);


                    adaptor.addChild(root_0, CLASS449_tree);


                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:618:49: THROWS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    THROWS450=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_keywordAggregate3506); 
                    THROWS450_tree = (CommonTree)adaptor.dupNode(THROWS450);


                    adaptor.addChild(root_0, THROWS450_tree);


                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:618:59: SUPER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    SUPER451=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_keywordAggregate3511); 
                    SUPER451_tree = (CommonTree)adaptor.dupNode(SUPER451);


                    adaptor.addChild(root_0, SUPER451_tree);


                    }
                    break;
                case 9 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:618:67: NATIVE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NATIVE452=(CommonTree)match(input,NATIVE,FOLLOW_NATIVE_in_keywordAggregate3515); 
                    NATIVE452_tree = (CommonTree)adaptor.dupNode(NATIVE452);


                    adaptor.addChild(root_0, NATIVE452_tree);


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
    // $ANTLR end "keywordAggregate"


    public static class primitiveType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:621:1: primitiveType : ( boolean_type | numeric_type | VOID );
    public final JVMWalker.primitiveType_return primitiveType() throws RecognitionException {
        JVMWalker.primitiveType_return retval = new JVMWalker.primitiveType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VOID455=null;
        JVMWalker.boolean_type_return boolean_type453 =null;

        JVMWalker.numeric_type_return numeric_type454 =null;


        CommonTree VOID455_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:622:3: ( boolean_type | numeric_type | VOID )
            int alt106=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt106=1;
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
                alt106=2;
                }
                break;
            case VOID:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }

            switch (alt106) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:622:5: boolean_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_boolean_type_in_primitiveType3528);
                    boolean_type453=boolean_type();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_type453.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:623:5: numeric_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numeric_type_in_primitiveType3534);
                    numeric_type454=numeric_type();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_type454.getTree());


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:624:5: VOID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VOID455=(CommonTree)match(input,VOID,FOLLOW_VOID_in_primitiveType3540); 
                    VOID455_tree = (CommonTree)adaptor.dupNode(VOID455);


                    adaptor.addChild(root_0, VOID455_tree);


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:627:1: boolean_type : BOOLEAN ;
    public final JVMWalker.boolean_type_return boolean_type() throws RecognitionException {
        JVMWalker.boolean_type_return retval = new JVMWalker.boolean_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BOOLEAN456=null;

        CommonTree BOOLEAN456_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:628:3: ( BOOLEAN )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:628:5: BOOLEAN
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            BOOLEAN456=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type3553); 
            BOOLEAN456_tree = (CommonTree)adaptor.dupNode(BOOLEAN456);


            adaptor.addChild(root_0, BOOLEAN456_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:631:1: numeric_type : ( floating_point_type | integral_type );
    public final JVMWalker.numeric_type_return numeric_type() throws RecognitionException {
        JVMWalker.numeric_type_return retval = new JVMWalker.numeric_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        JVMWalker.floating_point_type_return floating_point_type457 =null;

        JVMWalker.integral_type_return integral_type458 =null;



        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:632:3: ( floating_point_type | integral_type )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==DOUBLE||LA107_0==FLOAT) ) {
                alt107=1;
            }
            else if ( (LA107_0==BYTE||LA107_0==CHAR||LA107_0==INT||LA107_0==LONG||LA107_0==SHORT) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }
            switch (alt107) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:632:5: floating_point_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_floating_point_type_in_numeric_type3566);
                    floating_point_type457=floating_point_type();

                    state._fsp--;

                    adaptor.addChild(root_0, floating_point_type457.getTree());


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:633:5: integral_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integral_type_in_numeric_type3572);
                    integral_type458=integral_type();

                    state._fsp--;

                    adaptor.addChild(root_0, integral_type458.getTree());


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:636:1: integral_type : ( BYTE | SHORT | INT | LONG | CHAR );
    public final JVMWalker.integral_type_return integral_type() throws RecognitionException {
        JVMWalker.integral_type_return retval = new JVMWalker.integral_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set459=null;

        CommonTree set459_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:637:3: ( BYTE | SHORT | INT | LONG | CHAR )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set459=(CommonTree)input.LT(1);

            if ( input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
                input.consume();
                set459_tree = (CommonTree)adaptor.dupNode(set459);


                adaptor.addChild(root_0, set459_tree);

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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:644:1: floating_point_type : ( FLOAT | DOUBLE );
    public final JVMWalker.floating_point_type_return floating_point_type() throws RecognitionException {
        JVMWalker.floating_point_type_return retval = new JVMWalker.floating_point_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set460=null;

        CommonTree set460_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:645:3: ( FLOAT | DOUBLE )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set460=(CommonTree)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT ) {
                input.consume();
                set460_tree = (CommonTree)adaptor.dupNode(set460);


                adaptor.addChild(root_0, set460_tree);

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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:649:1: literals : ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER );
    public final JVMWalker.literals_return literals() throws RecognitionException {
        JVMWalker.literals_return retval = new JVMWalker.literals_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LONGLITERAL461=null;
        CommonTree INTLITERAL462=null;
        CommonTree FLOATLITERAL463=null;
        CommonTree DOUBLELITERAL464=null;
        CommonTree CHARLITERAL465=null;
        CommonTree STRINGLITERAL466=null;
        CommonTree BOOLEANLITERAL467=null;
        CommonTree MINUS468=null;
        CommonTree IDENTIFIER469=null;

        CommonTree LONGLITERAL461_tree=null;
        CommonTree INTLITERAL462_tree=null;
        CommonTree FLOATLITERAL463_tree=null;
        CommonTree DOUBLELITERAL464_tree=null;
        CommonTree CHARLITERAL465_tree=null;
        CommonTree STRINGLITERAL466_tree=null;
        CommonTree BOOLEANLITERAL467_tree=null;
        CommonTree MINUS468_tree=null;
        CommonTree IDENTIFIER469_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:650:3: ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER )
            int alt109=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt109=1;
                }
                break;
            case INTLITERAL:
                {
                alt109=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt109=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt109=4;
                }
                break;
            case CHARLITERAL:
                {
                alt109=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt109=6;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt109=7;
                }
                break;
            case IDENTIFIER:
            case MINUS:
                {
                alt109=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;

            }

            switch (alt109) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:650:5: LONGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LONGLITERAL461=(CommonTree)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literals3641); 
                    LONGLITERAL461_tree = (CommonTree)adaptor.dupNode(LONGLITERAL461);


                    adaptor.addChild(root_0, LONGLITERAL461_tree);


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:651:5: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INTLITERAL462=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literals3647); 
                    INTLITERAL462_tree = (CommonTree)adaptor.dupNode(INTLITERAL462);


                    adaptor.addChild(root_0, INTLITERAL462_tree);


                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:652:5: FLOATLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FLOATLITERAL463=(CommonTree)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literals3653); 
                    FLOATLITERAL463_tree = (CommonTree)adaptor.dupNode(FLOATLITERAL463);


                    adaptor.addChild(root_0, FLOATLITERAL463_tree);


                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:653:5: DOUBLELITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DOUBLELITERAL464=(CommonTree)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literals3659); 
                    DOUBLELITERAL464_tree = (CommonTree)adaptor.dupNode(DOUBLELITERAL464);


                    adaptor.addChild(root_0, DOUBLELITERAL464_tree);


                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:654:5: CHARLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CHARLITERAL465=(CommonTree)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literals3665); 
                    CHARLITERAL465_tree = (CommonTree)adaptor.dupNode(CHARLITERAL465);


                    adaptor.addChild(root_0, CHARLITERAL465_tree);


                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:655:5: STRINGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    STRINGLITERAL466=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literals3671); 
                    STRINGLITERAL466_tree = (CommonTree)adaptor.dupNode(STRINGLITERAL466);


                    adaptor.addChild(root_0, STRINGLITERAL466_tree);


                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:656:5: BOOLEANLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BOOLEANLITERAL467=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literals3677); 
                    BOOLEANLITERAL467_tree = (CommonTree)adaptor.dupNode(BOOLEANLITERAL467);


                    adaptor.addChild(root_0, BOOLEANLITERAL467_tree);


                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:657:5: ( MINUS )? IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:657:5: ( MINUS )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==MINUS) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:657:5: MINUS
                            {
                            _last = (CommonTree)input.LT(1);
                            MINUS468=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_literals3683); 
                            MINUS468_tree = (CommonTree)adaptor.dupNode(MINUS468);


                            adaptor.addChild(root_0, MINUS468_tree);


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    IDENTIFIER469=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literals3686); 
                    IDENTIFIER469_tree = (CommonTree)adaptor.dupNode(IDENTIFIER469);


                    adaptor.addChild(root_0, IDENTIFIER469_tree);


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
    // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:660:1: pc : INTLITERAL COLON ;
    public final JVMWalker.pc_return pc() throws RecognitionException {
        JVMWalker.pc_return retval = new JVMWalker.pc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTLITERAL470=null;
        CommonTree COLON471=null;

        CommonTree INTLITERAL470_tree=null;
        CommonTree COLON471_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:661:3: ( INTLITERAL COLON )
            // D:\\Work and Projects\\Speciale\\Repository\\AntlrWorksProj\\JVMWalker.g:661:5: INTLITERAL COLON
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTLITERAL470=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc3699); 
            INTLITERAL470_tree = (CommonTree)adaptor.dupNode(INTLITERAL470);


            adaptor.addChild(root_0, INTLITERAL470_tree);


            _last = (CommonTree)input.LT(1);
            COLON471=(CommonTree)match(input,COLON,FOLLOW_COLON_in_pc3701); 
            COLON471_tree = (CommonTree)adaptor.dupNode(COLON471);


            adaptor.addChild(root_0, COLON471_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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


 

    public static final BitSet FOLLOW_class_file_in_program64 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_CLASSFILE_in_class_file76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CFHEADER_in_class_file79 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_file_header_in_class_file81 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDefinition_in_class_file84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header110 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header116 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info161 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info188 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_HexDigits_in_checksum_file_info190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSDECL_in_classDefinition232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_classDefinition236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_classDefinition243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition245 = new BitSet(new long[]{0x0040000000100018L,0x0000000000000040L});
    public static final BitSet FOLLOW_typeName_in_classDefinition249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TPARAMETERS_in_classDefinition252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeParameters_in_classDefinition254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEXTENDS_in_classDefinition259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CIMPLEMENTS_in_classDefinition266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_classDefinition289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_info_in_classDefinition291 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPOOL_in_classDefinition311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_classDefinition333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classBody_in_classDefinition335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info421 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_minor_major_version_info_in_type_info427 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_flags_in_type_info433 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info439 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info446 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info452 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info458 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info464 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_deprecated_in_type_info470 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_synthetic_in_type_info476 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_scala_info_in_type_info482 = new BitSet(new long[]{0x0200420000000002L,0x0004000000000201L,0x00000000000004F0L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated517 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod532 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod534 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod536 = new BitSet(new long[]{0x0000000008000008L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_sourcefile_info557 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ScalaSig_in_scalaSig_info572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scalaSig_info586 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_scalaSig_info588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info610 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Scala_in_scala_info625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scala_info627 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_scala_info629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_scala_info631 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info669 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_VMODIFIER_in_innerclass_info_line688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_innerclass_info_line690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_innerclass_info_line695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line697 = new BitSet(new long[]{0x0040000000000018L,0xA000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_innerclass_info_data_in_innerclass_info_line701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INFODATA1_in_innerclass_info_data718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_data721 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data723 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFODATA2_in_innerclass_info_data729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_data732 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data734 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info756 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info758 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_minor_major_version_info760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_major_version_info762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Flag_in_flags783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessFlagList_in_flags785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000101L});
    public static final BitSet FOLLOW_IDENTIFIER_in_flagType818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_flagType826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info847 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info849 = new BitSet(new long[]{0x0000000008000008L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem866 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem868 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList882 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign898 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_annotationValue_in_annotationAssign900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationValue913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationValue920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList945 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations976 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations978 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations993 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations995 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1012 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_pc_in_parameterVisibilityInfo1027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1029 = new BitSet(new long[]{0x0000000008000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1032 = new BitSet(new long[]{0x0000000008000008L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1047 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1049 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1055 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1078 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool1080 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line1098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line1100 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyEntryDecl_in_classBody1122 = new BitSet(new long[]{0x0010000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBodyEntryDecl1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELDDECL_in_fieldDefinition1173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_fieldDefinition1176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition1178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_fieldDefinition1183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition1185 = new BitSet(new long[]{0x0040000000000008L,0x2000000000000000L,0x0000000010004000L});
    public static final BitSet FOLLOW_RETVALUE_in_fieldDefinition1190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_fieldDefinition1192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_fieldDefinition1196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keywordAggregate_in_fieldDefinition1198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDVALUE_in_fieldDefinition1202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition1204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_fieldDefinition1221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition1223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_fieldDefinition1239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition1241 = new BitSet(new long[]{0x0000020200000008L,0x0005000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo1271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfo1273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flags_in_fieldInfo1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_fieldAdditionalInfo1292 = new BitSet(new long[]{0x0100008000041000L,0x0000000004020101L,0x0000000000000001L});
    public static final BitSet FOLLOW_literals_in_fieldAdditionalInfo1294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo1304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo1312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldAdditionalInfo1314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo1322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo1332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo1334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATICCTORDECL_in_staticCtorDefinition1419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_staticCtorDefinition1422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition1424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_staticCtorDefinition1429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition1431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_staticCtorDefinition1435 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition1437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CTORDECL_in_ctorDefinition1460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_ctorDefinition1463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition1465 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERICDESC_in_ctorDefinition1470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_ctorDefinition1472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_ctorDefinition1477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeName_in_ctorDefinition1479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_ctorDefinition1485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition1487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_ctorDefinition1516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition1518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_ctorDefinition1546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_ctorDefinition1548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_ctorDefinition1576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition1578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CTORDECL_in_methodDefinition1624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_methodDefinition1627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_methodDefinition1629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_methodDefinition1634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition1636 = new BitSet(new long[]{0x0040000000000018L,0xA000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_GENERICDESC_in_methodDefinition1641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_methodDefinition1643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETVALUE_in_methodDefinition1648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_methodDefinition1650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_methodDefinition1654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keywordAggregate_in_methodDefinition1656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_methodDefinition1662 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClauseMethod_in_methodDefinition1664 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_methodDefinition1693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition1695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_methodDefinition1723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_methodDefinition1725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_methodDefinition1754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition1756 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STANDINTOKEN_in_methodInfo1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo1800 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo1802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfo1818 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfo1829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfo1831 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo1838 = new BitSet(new long[]{0x0002020000000202L,0x000F000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1844 = new BitSet(new long[]{0x0002020000000202L,0x000F000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo1850 = new BitSet(new long[]{0x0002020000000202L,0x000F000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo1856 = new BitSet(new long[]{0x0002020000000202L,0x000F000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfo1863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfo1866 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfo1874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfo1883 = new BitSet(new long[]{0x0002020000000202L,0x000F000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault1899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault1902 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_annotationValue_in_annotationDefault1904 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_methodSignatureInfo1921 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMDESC_in_methodSignatureInfo1924 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo1926 = new BitSet(new long[]{0x0000000000004008L,0x0000000000004081L});
    public static final BitSet FOLLOW_RETDESC_in_methodSignatureInfo1931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo1933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITARGUMENTS_in_arguments2024 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_arguments2026 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_DOT_in_arguments2030 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments2032 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments2034 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_body2059 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_body2061 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Code_in_body2066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_codeBlock_in_body2068 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bodyExtension_in_body2071 = new BitSet(new long[]{0x0001000000000002L,0x0000000001C00000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension2092 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension2095 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension2103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension2106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension2115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension2118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension2126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension2129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension2137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension2139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension2147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension2149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARINFO_in_codeBlock2168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variables_in_codeBlock2170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_codeBlock2174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructionSet_in_codeBlock2176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000000004L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock2179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeLine_in_instructionSet2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaSwitch_in_instructionSet2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine2211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeLine2213 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine2216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand1_in_codeLine2218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine2223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeLine2225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd2242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd2244 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeBlockEnd2246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPINDEX_in_operand12263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_operand12270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_operand12276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables2289 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variable_in_variables2291 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variable_in_variables2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_variable2307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable2309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable2311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_javaSwitch2328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch2331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_javaSwitch2333 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch2335 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch2338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pc_in_switchLine2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine2372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine2374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClause2394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_throwClause2396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClauseMethod2413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod2415 = new BitSet(new long[]{0x0000000000000008L,0x0000040000000081L});
    public static final BitSet FOLLOW_ETHEADER_in_exceptionTable2454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable2462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ETENTRY_in_exceptionTable2466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable2468 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry2487 = new BitSet(new long[]{0x0080004004022800L,0x0020000000010021L,0x0000000008000000L});
    public static final BitSet FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntryValue2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntryValue2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable2532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine2547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine2551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVHEADER_in_localVariableTable2574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable2584 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVENTRY_in_localVariableTable2588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable2590 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine2607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine2609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine2613 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004081L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTHEADER_in_stackMapTypeTable2649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable2651 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable2653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable2655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMTENTRY_in_stackMapTypeTable2659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable2661 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2676 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2682 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry2686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2693 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2695 = new BitSet(new long[]{0x0080004000122800L,0x0020000000010021L,0x0000000008000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry2704 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry2706 = new BitSet(new long[]{0x0080004000122800L,0x0020000000010021L,0x0000000008000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMHEADER_in_stackMapTable2727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable2729 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable2733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMENTRY_in_stackMapTable2737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable2739 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry2754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry2756 = new BitSet(new long[]{0x0080004000122800L,0x0020000000010121L,0x0000000008000000L});
    public static final BitSet FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry2758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntryValue2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes2810 = new BitSet(new long[]{0x0080004000122802L,0x0020000000010021L,0x0000000008000000L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableType2829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableType2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject2858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList2880 = new BitSet(new long[]{0x0080004000022802L,0x0020000000010020L,0x0000000008800000L});
    public static final BitSet FOLLOW_combinedJavaType_in_type2894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAYBRACKS_in_type2897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACK_in_type2900 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type2902 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_primitiveType_in_combinedJavaType2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenceType_in_combinedJavaType2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITNAME_in_referenceType2937 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType2939 = new BitSet(new long[]{0x0000000000000008L,0x0000040000000000L});
    public static final BitSet FOLLOW_typeName_in_typeDeclSpecifier2954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPEARGS_in_typeDeclSpecifier2957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeArguments_in_typeDeclSpecifier2959 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QualifiedType_in_typeName2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgumentList_in_typeArguments2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgument_in_typeArgumentList2999 = new BitSet(new long[]{0x0080004000022802L,0x0020010000010020L,0x0000000008800000L});
    public static final BitSet FOLLOW_type_in_typeArgument3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_typeArgument3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_wildcard3031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wildcardBounds_in_wildcard3033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_wildcardBounds3048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds3050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_wildcardBounds3058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds3060 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters3073 = new BitSet(new long[]{0x0000000400004002L,0x0000000000000001L,0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_typeParameter3087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter3089 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_typeBound3104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_referenceType_in_typeBound3106 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor3123 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor3137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor3141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList3155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_UNITNAME_in_bytecodeReferenceType3169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType3171 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000080L});
    public static final BitSet FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier3185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier3188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier3190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeTypeName3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList3229 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bytecodeWildcard3261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard3263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_bytecodeWildcardBounds3278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_bytecodeWildcardBounds3288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds3290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeType3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_bytecodeType3316 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType3335 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004081L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType3350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType3363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType3366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType3368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList3406 = new BitSet(new long[]{0x0000000000004002L,0x1000001004004081L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleBytecodeTypeArgument3425 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004081L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleBytecodeTypeArgument3433 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004081L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_simpleBytecodeTypeArgument3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_keywordAggregate3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_keywordAggregate3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_keywordAggregate3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_keywordAggregate3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_keywordAggregate3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_keywordAggregate3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_keywordAggregate3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_keywordAggregate3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_keywordAggregate3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literals3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literals3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literals3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literals3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literals3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literals3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literals3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literals3683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literals3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc3699 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_pc3701 = new BitSet(new long[]{0x0000000000000002L});

}