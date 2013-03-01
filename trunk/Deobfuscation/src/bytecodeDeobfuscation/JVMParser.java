// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g 2013-03-01 04:02:26

  package bytecodeDeobfuscation;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JVMParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public JVMParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JVMParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return JVMParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:44:1: program : ( class_file )* ;
    public final JVMParser.program_return program() throws RecognitionException {
        JVMParser.program_return retval = new JVMParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_return class_file1 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:44:9: ( ( class_file )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:44:11: ( class_file )*
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:44:11: ( class_file )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:44:11: class_file
            	    {
            	    pushFollow(FOLLOW_class_file_in_program196);
            	    class_file1=class_file();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_file1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class class_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_file"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:46:1: class_file : class_file_header classDefinition -> ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) ;
    public final JVMParser.class_file_return class_file() throws RecognitionException {
        JVMParser.class_file_return retval = new JVMParser.class_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_header_return class_file_header2 =null;

        JVMParser.classDefinition_return classDefinition3 =null;


        RewriteRuleSubtreeStream stream_class_file_header=new RewriteRuleSubtreeStream(adaptor,"rule class_file_header");
        RewriteRuleSubtreeStream stream_classDefinition=new RewriteRuleSubtreeStream(adaptor,"rule classDefinition");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:47:3: ( class_file_header classDefinition -> ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:47:5: class_file_header classDefinition
            {
            pushFollow(FOLLOW_class_file_header_in_class_file207);
            class_file_header2=class_file_header();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_class_file_header.add(class_file_header2.getTree());

            pushFollow(FOLLOW_classDefinition_in_class_file209);
            classDefinition3=classDefinition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classDefinition.add(classDefinition3.getTree());

            // AST REWRITE
            // elements: class_file_header, classDefinition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:39: -> ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:47:42: ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASSFILE, "CLASSFILE")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:47:54: ^( CFHEADER class_file_header )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CFHEADER, "CFHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_class_file_header.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_classDefinition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_file"


    public static class class_file_header_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_file_header"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:49:1: class_file_header : class_file_info modified_file_info checksum_file_info ( compiled_file_info )? ;
    public final JVMParser.class_file_header_return class_file_header() throws RecognitionException {
        JVMParser.class_file_header_return retval = new JVMParser.class_file_header_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_info_return class_file_info4 =null;

        JVMParser.modified_file_info_return modified_file_info5 =null;

        JVMParser.checksum_file_info_return checksum_file_info6 =null;

        JVMParser.compiled_file_info_return compiled_file_info7 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:50:3: ( class_file_info modified_file_info checksum_file_info ( compiled_file_info )? )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:50:5: class_file_info modified_file_info checksum_file_info ( compiled_file_info )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_class_file_info_in_class_file_header235);
            class_file_info4=class_file_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, class_file_info4.getTree());

            pushFollow(FOLLOW_modified_file_info_in_class_file_header241);
            modified_file_info5=modified_file_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modified_file_info5.getTree());

            pushFollow(FOLLOW_checksum_file_info_in_class_file_header247);
            checksum_file_info6=checksum_file_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, checksum_file_info6.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:53:5: ( compiled_file_info )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==IDENTIFIER) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==STRINGLITERAL) ) {
                        alt2=1;
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:53:5: compiled_file_info
                    {
                    pushFollow(FOLLOW_compiled_file_info_in_class_file_header253);
                    compiled_file_info7=compiled_file_info();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compiled_file_info7.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_file_header"


    public static class class_file_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:55:1: class_file_info : IDENTIFIER WINDOWSPATH -> ^( IDENTIFIER WINDOWSPATH ) ;
    public final JVMParser.class_file_info_return class_file_info() throws RecognitionException {
        JVMParser.class_file_info_return retval = new JVMParser.class_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER8=null;
        Token WINDOWSPATH9=null;

        Object IDENTIFIER8_tree=null;
        Object WINDOWSPATH9_tree=null;
        RewriteRuleTokenStream stream_WINDOWSPATH=new RewriteRuleTokenStream(adaptor,"token WINDOWSPATH");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:56:3: ( IDENTIFIER WINDOWSPATH -> ^( IDENTIFIER WINDOWSPATH ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:56:5: IDENTIFIER WINDOWSPATH
            {
            IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_file_info266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER8);


            WINDOWSPATH9=(Token)match(input,WINDOWSPATH,FOLLOW_WINDOWSPATH_in_class_file_info268); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WINDOWSPATH.add(WINDOWSPATH9);


            // AST REWRITE
            // elements: WINDOWSPATH, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:28: -> ^( IDENTIFIER WINDOWSPATH )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:56:31: ^( IDENTIFIER WINDOWSPATH )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_WINDOWSPATH.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_file_info"


    public static class modified_file_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modified_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:59:1: modified_file_info : i1= IDENTIFIER i2= IDENTIFIER DATE SEMI i3= IDENTIFIER INTLITERAL i4= IDENTIFIER -> ^( $i1 $i2 DATE $i3 INTLITERAL $i4) ;
    public final JVMParser.modified_file_info_return modified_file_info() throws RecognitionException {
        JVMParser.modified_file_info_return retval = new JVMParser.modified_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token i3=null;
        Token i4=null;
        Token DATE10=null;
        Token SEMI11=null;
        Token INTLITERAL12=null;

        Object i1_tree=null;
        Object i2_tree=null;
        Object i3_tree=null;
        Object i4_tree=null;
        Object DATE10_tree=null;
        Object SEMI11_tree=null;
        Object INTLITERAL12_tree=null;
        RewriteRuleTokenStream stream_DATE=new RewriteRuleTokenStream(adaptor,"token DATE");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:60:3: (i1= IDENTIFIER i2= IDENTIFIER DATE SEMI i3= IDENTIFIER INTLITERAL i4= IDENTIFIER -> ^( $i1 $i2 DATE $i3 INTLITERAL $i4) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:60:5: i1= IDENTIFIER i2= IDENTIFIER DATE SEMI i3= IDENTIFIER INTLITERAL i4= IDENTIFIER
            {
            i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i1);


            i2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i2);


            DATE10=(Token)match(input,DATE,FOLLOW_DATE_in_modified_file_info299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATE.add(DATE10);


            SEMI11=(Token)match(input,SEMI,FOLLOW_SEMI_in_modified_file_info301); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI11);


            i3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info305); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i3);


            INTLITERAL12=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_modified_file_info307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL12);


            i4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i4);


            // AST REWRITE
            // elements: i4, i3, INTLITERAL, DATE, i2, i1
            // token labels: i4, i3, i2, i1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_i4=new RewriteRuleTokenStream(adaptor,"token i4",i4);
            RewriteRuleTokenStream stream_i3=new RewriteRuleTokenStream(adaptor,"token i3",i3);
            RewriteRuleTokenStream stream_i2=new RewriteRuleTokenStream(adaptor,"token i2",i2);
            RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:82: -> ^( $i1 $i2 DATE $i3 INTLITERAL $i4)
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:60:85: ^( $i1 $i2 DATE $i3 INTLITERAL $i4)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_i1.nextNode(), root_1);

                adaptor.addChild(root_1, stream_i2.nextNode());

                adaptor.addChild(root_1, 
                stream_DATE.nextNode()
                );

                adaptor.addChild(root_1, stream_i3.nextNode());

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_1, stream_i4.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modified_file_info"


    public static class checksum_file_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "checksum_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:63:1: checksum_file_info : IDENTIFIER IDENTIFIER (id= IDENTIFIER -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] ) | HexDigits -> ^( IDENTIFIER IDENTIFIER HexDigits ) ) ;
    public final JVMParser.checksum_file_info_return checksum_file_info() throws RecognitionException {
        JVMParser.checksum_file_info_return retval = new JVMParser.checksum_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token IDENTIFIER13=null;
        Token IDENTIFIER14=null;
        Token HexDigits15=null;

        Object id_tree=null;
        Object IDENTIFIER13_tree=null;
        Object IDENTIFIER14_tree=null;
        Object HexDigits15_tree=null;
        RewriteRuleTokenStream stream_HexDigits=new RewriteRuleTokenStream(adaptor,"token HexDigits");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:64:3: ( IDENTIFIER IDENTIFIER (id= IDENTIFIER -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] ) | HexDigits -> ^( IDENTIFIER IDENTIFIER HexDigits ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:64:5: IDENTIFIER IDENTIFIER (id= IDENTIFIER -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] ) | HexDigits -> ^( IDENTIFIER IDENTIFIER HexDigits ) )
            {
            IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER13);


            IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info348); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER14);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:65:3: (id= IDENTIFIER -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] ) | HexDigits -> ^( IDENTIFIER IDENTIFIER HexDigits ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENTIFIER) ) {
                alt3=1;
            }
            else if ( (LA3_0==HexDigits) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:65:4: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);


                    // AST REWRITE
                    // elements: IDENTIFIER, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:19: -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:65:22: ^( IDENTIFIER IDENTIFIER HexDigits[$id] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IDENTIFIER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(HexDigits, id)
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:66:5: HexDigits
                    {
                    HexDigits15=(Token)match(input,HexDigits,FOLLOW_HexDigits_in_checksum_file_info375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HexDigits.add(HexDigits15);


                    // AST REWRITE
                    // elements: HexDigits, IDENTIFIER, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:19: -> ^( IDENTIFIER IDENTIFIER HexDigits )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:66:22: ^( IDENTIFIER IDENTIFIER HexDigits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IDENTIFIER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_HexDigits.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "checksum_file_info"


    public static class compiled_file_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compiled_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:70:1: compiled_file_info : IDENTIFIER IDENTIFIER STRINGLITERAL -> ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) ;
    public final JVMParser.compiled_file_info_return compiled_file_info() throws RecognitionException {
        JVMParser.compiled_file_info_return retval = new JVMParser.compiled_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER16=null;
        Token IDENTIFIER17=null;
        Token STRINGLITERAL18=null;

        Object IDENTIFIER16_tree=null;
        Object IDENTIFIER17_tree=null;
        Object STRINGLITERAL18_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:71:3: ( IDENTIFIER IDENTIFIER STRINGLITERAL -> ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:71:5: IDENTIFIER IDENTIFIER STRINGLITERAL
            {
            IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info410); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER16);


            IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info412); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER17);


            STRINGLITERAL18=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_compiled_file_info414); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL18);


            // AST REWRITE
            // elements: STRINGLITERAL, IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:41: -> ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:71:44: ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_STRINGLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compiled_file_info"


    public static class classDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:78:1: classDefinition : ( class_visual_modifier )? ( class_modifier )* typeName ( typeParameters )? ( EXTENDS ls1= typeList )? ( IMPLEMENTS ls2= typeList )? type_info constant_pool LBRACE ( classBody )? RBRACE -> ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( $ls1)? ) ^( CIMPLEMENTS ( $ls2)? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) ;
    public final JVMParser.classDefinition_return classDefinition() throws RecognitionException {
        JVMParser.classDefinition_return retval = new JVMParser.classDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS23=null;
        Token IMPLEMENTS24=null;
        Token LBRACE27=null;
        Token RBRACE29=null;
        JVMParser.typeList_return ls1 =null;

        JVMParser.typeList_return ls2 =null;

        JVMParser.class_visual_modifier_return class_visual_modifier19 =null;

        JVMParser.class_modifier_return class_modifier20 =null;

        JVMParser.typeName_return typeName21 =null;

        JVMParser.typeParameters_return typeParameters22 =null;

        JVMParser.type_info_return type_info25 =null;

        JVMParser.constant_pool_return constant_pool26 =null;

        JVMParser.classBody_return classBody28 =null;


        Object EXTENDS23_tree=null;
        Object IMPLEMENTS24_tree=null;
        Object LBRACE27_tree=null;
        Object RBRACE29_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_type_info=new RewriteRuleSubtreeStream(adaptor,"rule type_info");
        RewriteRuleSubtreeStream stream_typeParameters=new RewriteRuleSubtreeStream(adaptor,"rule typeParameters");
        RewriteRuleSubtreeStream stream_class_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule class_visual_modifier");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        RewriteRuleSubtreeStream stream_class_modifier=new RewriteRuleSubtreeStream(adaptor,"rule class_modifier");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        RewriteRuleSubtreeStream stream_constant_pool=new RewriteRuleSubtreeStream(adaptor,"rule constant_pool");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:3: ( ( class_visual_modifier )? ( class_modifier )* typeName ( typeParameters )? ( EXTENDS ls1= typeList )? ( IMPLEMENTS ls2= typeList )? type_info constant_pool LBRACE ( classBody )? RBRACE -> ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( $ls1)? ) ^( CIMPLEMENTS ( $ls2)? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:5: ( class_visual_modifier )? ( class_modifier )* typeName ( typeParameters )? ( EXTENDS ls1= typeList )? ( IMPLEMENTS ls2= typeList )? type_info constant_pool LBRACE ( classBody )? RBRACE
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:5: ( class_visual_modifier )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PUBLIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:5: class_visual_modifier
                    {
                    pushFollow(FOLLOW_class_visual_modifier_in_classDefinition441);
                    class_visual_modifier19=class_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_class_visual_modifier.add(class_visual_modifier19.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:28: ( class_modifier )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ABSTRACT||LA5_0==CLASS||LA5_0==FINAL||LA5_0==INTERFACE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:28: class_modifier
            	    {
            	    pushFollow(FOLLOW_class_modifier_in_classDefinition444);
            	    class_modifier20=class_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_class_modifier.add(class_modifier20.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            pushFollow(FOLLOW_typeName_in_classDefinition447);
            typeName21=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName21.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:53: ( typeParameters )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LESST) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:53: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_classDefinition449);
                    typeParameters22=typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParameters.add(typeParameters22.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:69: ( EXTENDS ls1= typeList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EXTENDS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:70: EXTENDS ls1= typeList
                    {
                    EXTENDS23=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classDefinition453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS23);


                    pushFollow(FOLLOW_typeList_in_classDefinition457);
                    ls1=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(ls1.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:93: ( IMPLEMENTS ls2= typeList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IMPLEMENTS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:79:94: IMPLEMENTS ls2= typeList
                    {
                    IMPLEMENTS24=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_classDefinition462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS24);


                    pushFollow(FOLLOW_typeList_in_classDefinition466);
                    ls2=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(ls2.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_type_info_in_classDefinition475);
            type_info25=type_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_info.add(type_info25.getTree());

            pushFollow(FOLLOW_constant_pool_in_classDefinition481);
            constant_pool26=constant_pool();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constant_pool.add(constant_pool26.getTree());

            LBRACE27=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDefinition487); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE27);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:83:5: ( classBody )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ABSTRACT||LA9_0==BOOLEAN||(LA9_0 >= BYTE && LA9_0 <= BaseType)||LA9_0==CHAR||LA9_0==Constant_type||LA9_0==DOUBLE||(LA9_0 >= FINAL && LA9_0 <= FLOAT)||LA9_0==IDENTIFIER||LA9_0==INT||(LA9_0 >= LESST && LA9_0 <= LONG)||LA9_0==NATIVE||(LA9_0 >= PRIVATE && LA9_0 <= PUBLIC)||LA9_0==QualifiedType||LA9_0==SHORT||LA9_0==STATIC||LA9_0==STRICTFP||LA9_0==SYNCHRONIZED||LA9_0==TRANSIENT||(LA9_0 >= VOID && LA9_0 <= VoidType)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:83:5: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classDefinition494);
                    classBody28=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classBody.add(classBody28.getTree());

                    }
                    break;

            }


            RBRACE29=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDefinition501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE29);


            // AST REWRITE
            // elements: constant_pool, typeParameters, classBody, typeName, class_visual_modifier, type_info, ls2, class_modifier, ls1
            // token labels: 
            // rule labels: retval, ls1, ls2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ls1=new RewriteRuleSubtreeStream(adaptor,"rule ls1",ls1!=null?ls1.tree:null);
            RewriteRuleSubtreeStream stream_ls2=new RewriteRuleSubtreeStream(adaptor,"rule ls2",ls2!=null?ls2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:12: -> ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( $ls1)? ) ^( CIMPLEMENTS ( $ls2)? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:17: ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( $ls1)? ) ^( CIMPLEMENTS ( $ls2)? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASSDECL, "CLASSDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:29: ^( VMODIFIER ( class_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:41: ( class_visual_modifier )?
                if ( stream_class_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_class_visual_modifier.nextTree());

                }
                stream_class_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:65: ^( MODIFIER ( class_modifier )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:76: ( class_modifier )*
                while ( stream_class_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_class_modifier.nextTree());

                }
                stream_class_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_typeName.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:102: ^( TPARAMETERS ( typeParameters )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TPARAMETERS, "TPARAMETERS")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:116: ( typeParameters )?
                if ( stream_typeParameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_typeParameters.nextTree());

                }
                stream_typeParameters.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:133: ^( CEXTENDS ( $ls1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CEXTENDS, "CEXTENDS")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:145: ( $ls1)?
                if ( stream_ls1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ls1.nextTree());

                }
                stream_ls1.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:151: ^( CIMPLEMENTS ( $ls2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CIMPLEMENTS, "CIMPLEMENTS")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:166: ( $ls2)?
                if ( stream_ls2.hasNext() ) {
                    adaptor.addChild(root_2, stream_ls2.nextTree());

                }
                stream_ls2.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:85:17: ^( UNITHEADER type_info )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_type_info.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:86:17: ^( CPOOL constant_pool )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CPOOL, "CPOOL")
                , root_2);

                adaptor.addChild(root_2, stream_constant_pool.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:87:17: ^( UNITBODY ( classBody )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITBODY, "UNITBODY")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:87:28: ( classBody )?
                if ( stream_classBody.hasNext() ) {
                    adaptor.addChild(root_2, stream_classBody.nextTree());

                }
                stream_classBody.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDefinition"


    public static class class_visual_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:91:1: class_visual_modifier : PUBLIC ;
    public final JVMParser.class_visual_modifier_return class_visual_modifier() throws RecognitionException {
        JVMParser.class_visual_modifier_return retval = new JVMParser.class_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PUBLIC30=null;

        Object PUBLIC30_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:92:3: ( PUBLIC )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:92:5: PUBLIC
            {
            root_0 = (Object)adaptor.nil();


            PUBLIC30=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier649); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PUBLIC30_tree = 
            (Object)adaptor.create(PUBLIC30)
            ;
            adaptor.addChild(root_0, PUBLIC30_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_visual_modifier"


    public static class class_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:95:1: class_modifier : ( ABSTRACT | FINAL | INTERFACE | CLASS );
    public final JVMParser.class_modifier_return class_modifier() throws RecognitionException {
        JVMParser.class_modifier_return retval = new JVMParser.class_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:96:3: ( ABSTRACT | FINAL | INTERFACE | CLASS )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set31=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==CLASS||input.LA(1)==FINAL||input.LA(1)==INTERFACE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set31)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_modifier"


    public static class type_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:103:1: type_info : ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ ;
    public final JVMParser.type_info_return type_info() throws RecognitionException {
        JVMParser.type_info_return retval = new JVMParser.type_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.sourcefile_info_return sourcefile_info32 =null;

        JVMParser.minor_major_version_info_return minor_major_version_info33 =null;

        JVMParser.flags_return flags34 =null;

        JVMParser.scalaSig_info_return scalaSig_info35 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info36 =null;

        JVMParser.innerclass_info_return innerclass_info37 =null;

        JVMParser.enclosingMethod_return enclosingMethod38 =null;

        JVMParser.signature_info_addition_return signature_info_addition39 =null;

        JVMParser.deprecated_return deprecated40 =null;

        JVMParser.synthetic_return synthetic41 =null;

        JVMParser.scala_info_return scala_info42 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:104:3: ( ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:104:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:104:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            int cnt10=0;
            loop10:
            do {
                int alt10=12;
                switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==IDENTIFIER) ) {
                        int LA10_12 = input.LA(3);

                        if ( (LA10_12==COLON) ) {
                            int LA10_13 = input.LA(4);

                            if ( (LA10_13==INTLITERAL) ) {
                                alt10=2;
                            }


                        }


                    }


                    }
                    break;
                case SourceFile:
                    {
                    alt10=1;
                    }
                    break;
                case Flag:
                    {
                    alt10=3;
                    }
                    break;
                case ScalaSig:
                    {
                    alt10=4;
                    }
                    break;
                case RuntimeVisibleAnnotations:
                    {
                    alt10=5;
                    }
                    break;
                case InnerClasses:
                    {
                    alt10=6;
                    }
                    break;
                case EnclosingMethod:
                    {
                    alt10=7;
                    }
                    break;
                case Signature:
                    {
                    alt10=8;
                    }
                    break;
                case Deprecated:
                    {
                    alt10=9;
                    }
                    break;
                case Synthetic:
                    {
                    alt10=10;
                    }
                    break;
                case Scala:
                    {
                    alt10=11;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:104:6: sourcefile_info
            	    {
            	    pushFollow(FOLLOW_sourcefile_info_in_type_info700);
            	    sourcefile_info32=sourcefile_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sourcefile_info32.getTree());

            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:105:5: minor_major_version_info
            	    {
            	    pushFollow(FOLLOW_minor_major_version_info_in_type_info706);
            	    minor_major_version_info33=minor_major_version_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, minor_major_version_info33.getTree());

            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:106:5: flags
            	    {
            	    pushFollow(FOLLOW_flags_in_type_info712);
            	    flags34=flags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, flags34.getTree());

            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:107:5: scalaSig_info
            	    {
            	    pushFollow(FOLLOW_scalaSig_info_in_type_info718);
            	    scalaSig_info35=scalaSig_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalaSig_info35.getTree());

            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:108:5: runtimeVisibleAnnotations_info
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_type_info725);
            	    runtimeVisibleAnnotations_info36=runtimeVisibleAnnotations_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotations_info36.getTree());

            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:109:5: innerclass_info
            	    {
            	    pushFollow(FOLLOW_innerclass_info_in_type_info731);
            	    innerclass_info37=innerclass_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, innerclass_info37.getTree());

            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:110:5: enclosingMethod
            	    {
            	    pushFollow(FOLLOW_enclosingMethod_in_type_info737);
            	    enclosingMethod38=enclosingMethod();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enclosingMethod38.getTree());

            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:111:5: signature_info_addition
            	    {
            	    pushFollow(FOLLOW_signature_info_addition_in_type_info743);
            	    signature_info_addition39=signature_info_addition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, signature_info_addition39.getTree());

            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:112:5: deprecated
            	    {
            	    pushFollow(FOLLOW_deprecated_in_type_info749);
            	    deprecated40=deprecated();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, deprecated40.getTree());

            	    }
            	    break;
            	case 10 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:113:5: synthetic
            	    {
            	    pushFollow(FOLLOW_synthetic_in_type_info755);
            	    synthetic41=synthetic();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, synthetic41.getTree());

            	    }
            	    break;
            	case 11 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:114:5: scala_info
            	    {
            	    pushFollow(FOLLOW_scala_info_in_type_info761);
            	    scala_info42=scala_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scala_info42.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_info"


    public static class synthetic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "synthetic"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:117:1: synthetic : Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) ;
    public final JVMParser.synthetic_return synthetic() throws RecognitionException {
        JVMParser.synthetic_return retval = new JVMParser.synthetic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Synthetic43=null;
        Token BOOLEANLITERAL44=null;

        Object Synthetic43_tree=null;
        Object BOOLEANLITERAL44_tree=null;
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:118:3: ( Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:118:5: Synthetic BOOLEANLITERAL
            {
            Synthetic43=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_synthetic776); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic43);


            BOOLEANLITERAL44=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_synthetic778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL44);


            // AST REWRITE
            // elements: Synthetic, BOOLEANLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:30: -> ^( Synthetic BOOLEANLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:118:33: ^( Synthetic BOOLEANLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Synthetic.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_BOOLEANLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "synthetic"


    public static class deprecated_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deprecated"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:121:1: deprecated : Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) ;
    public final JVMParser.deprecated_return deprecated() throws RecognitionException {
        JVMParser.deprecated_return retval = new JVMParser.deprecated_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Deprecated45=null;
        Token BOOLEANLITERAL46=null;

        Object Deprecated45_tree=null;
        Object BOOLEANLITERAL46_tree=null;
        RewriteRuleTokenStream stream_Deprecated=new RewriteRuleTokenStream(adaptor,"token Deprecated");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:122:3: ( Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:122:5: Deprecated BOOLEANLITERAL
            {
            Deprecated45=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_deprecated799); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Deprecated.add(Deprecated45);


            BOOLEANLITERAL46=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_deprecated801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL46);


            // AST REWRITE
            // elements: BOOLEANLITERAL, Deprecated
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:31: -> ^( Deprecated BOOLEANLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:122:34: ^( Deprecated BOOLEANLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Deprecated.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_BOOLEANLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "deprecated"


    public static class enclosingMethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enclosingMethod"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:125:1: enclosingMethod : EnclosingMethod CPINDEX DOT ( CPINDEX )? -> ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) ;
    public final JVMParser.enclosingMethod_return enclosingMethod() throws RecognitionException {
        JVMParser.enclosingMethod_return retval = new JVMParser.enclosingMethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EnclosingMethod47=null;
        Token CPINDEX48=null;
        Token DOT49=null;
        Token CPINDEX50=null;

        Object EnclosingMethod47_tree=null;
        Object CPINDEX48_tree=null;
        Object DOT49_tree=null;
        Object CPINDEX50_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_EnclosingMethod=new RewriteRuleTokenStream(adaptor,"token EnclosingMethod");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:126:3: ( EnclosingMethod CPINDEX DOT ( CPINDEX )? -> ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:126:5: EnclosingMethod CPINDEX DOT ( CPINDEX )?
            {
            EnclosingMethod47=(Token)match(input,EnclosingMethod,FOLLOW_EnclosingMethod_in_enclosingMethod822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EnclosingMethod.add(EnclosingMethod47);


            CPINDEX48=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod824); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX48);


            DOT49=(Token)match(input,DOT,FOLLOW_DOT_in_enclosingMethod826); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT49);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:126:33: ( CPINDEX )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CPINDEX) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:126:33: CPINDEX
                    {
                    CPINDEX50=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX50);


                    }
                    break;

            }


            // AST REWRITE
            // elements: CPINDEX, DOT, EnclosingMethod, CPINDEX
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 126:43: -> ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:126:46: ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EnclosingMethod.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_CPINDEX.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_DOT.nextNode()
                );

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:126:76: ( CPINDEX )?
                if ( stream_CPINDEX.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_CPINDEX.nextNode()
                    );

                }
                stream_CPINDEX.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enclosingMethod"


    public static class sourcefile_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sourcefile_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:129:1: sourcefile_info : SourceFile STRINGLITERAL -> ^( SourceFile STRINGLITERAL ) ;
    public final JVMParser.sourcefile_info_return sourcefile_info() throws RecognitionException {
        JVMParser.sourcefile_info_return retval = new JVMParser.sourcefile_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SourceFile51=null;
        Token STRINGLITERAL52=null;

        Object SourceFile51_tree=null;
        Object STRINGLITERAL52_tree=null;
        RewriteRuleTokenStream stream_SourceFile=new RewriteRuleTokenStream(adaptor,"token SourceFile");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:130:3: ( SourceFile STRINGLITERAL -> ^( SourceFile STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:130:5: SourceFile STRINGLITERAL
            {
            SourceFile51=(Token)match(input,SourceFile,FOLLOW_SourceFile_in_sourcefile_info857); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SourceFile.add(SourceFile51);


            STRINGLITERAL52=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_sourcefile_info859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL52);


            // AST REWRITE
            // elements: SourceFile, STRINGLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:31: -> ^( SourceFile STRINGLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:130:34: ^( SourceFile STRINGLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_SourceFile.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_STRINGLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sourcefile_info"


    public static class scalaSig_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scalaSig_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:133:1: scalaSig_info : ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL -> ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) ;
    public final JVMParser.scalaSig_info_return scalaSig_info() throws RecognitionException {
        JVMParser.scalaSig_info_return retval = new JVMParser.scalaSig_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ScalaSig53=null;
        Token IDENTIFIER54=null;
        Token ASSIGN55=null;
        Token INTLITERAL56=null;
        Token INTLITERAL57=null;
        Token INTLITERAL58=null;
        Token INTLITERAL59=null;

        Object ScalaSig53_tree=null;
        Object IDENTIFIER54_tree=null;
        Object ASSIGN55_tree=null;
        Object INTLITERAL56_tree=null;
        Object INTLITERAL57_tree=null;
        Object INTLITERAL58_tree=null;
        Object INTLITERAL59_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ScalaSig=new RewriteRuleTokenStream(adaptor,"token ScalaSig");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:134:3: ( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL -> ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:134:5: ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL
            {
            ScalaSig53=(Token)match(input,ScalaSig,FOLLOW_ScalaSig_in_scalaSig_info881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ScalaSig.add(ScalaSig53);


            IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scalaSig_info887); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER54);


            ASSIGN55=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_scalaSig_info889); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN55);


            INTLITERAL56=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info891); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL56);


            INTLITERAL57=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info899); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL57);


            INTLITERAL58=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info901); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL58);


            INTLITERAL59=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info903); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL59);


            // AST REWRITE
            // elements: ASSIGN, INTLITERAL, IDENTIFIER, INTLITERAL, INTLITERAL, INTLITERAL, ScalaSig
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 137:9: -> ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:137:13: ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ScalaSig.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ASSIGN.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scalaSig_info"


    public static class scala_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scala_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:142:1: scala_info : Scala IDENTIFIER ASSIGN INTLITERAL -> ^( Scala IDENTIFIER ASSIGN INTLITERAL ) ;
    public final JVMParser.scala_info_return scala_info() throws RecognitionException {
        JVMParser.scala_info_return retval = new JVMParser.scala_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Scala60=null;
        Token IDENTIFIER61=null;
        Token ASSIGN62=null;
        Token INTLITERAL63=null;

        Object Scala60_tree=null;
        Object IDENTIFIER61_tree=null;
        Object ASSIGN62_tree=null;
        Object INTLITERAL63_tree=null;
        RewriteRuleTokenStream stream_Scala=new RewriteRuleTokenStream(adaptor,"token Scala");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:143:3: ( Scala IDENTIFIER ASSIGN INTLITERAL -> ^( Scala IDENTIFIER ASSIGN INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:143:5: Scala IDENTIFIER ASSIGN INTLITERAL
            {
            Scala60=(Token)match(input,Scala,FOLLOW_Scala_in_scala_info970); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Scala.add(Scala60);


            IDENTIFIER61=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scala_info976); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER61);


            ASSIGN62=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_scala_info978); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN62);


            INTLITERAL63=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scala_info980); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL63);


            // AST REWRITE
            // elements: IDENTIFIER, INTLITERAL, ASSIGN, Scala
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 145:9: -> ^( Scala IDENTIFIER ASSIGN INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:145:13: ^( Scala IDENTIFIER ASSIGN INTLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Scala.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ASSIGN.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scala_info"


    public static class signature_info_addition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signature_info_addition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:148:1: signature_info_addition : Signature ( CPINDEX )? -> ^( Signature ( CPINDEX )? ) ;
    public final JVMParser.signature_info_addition_return signature_info_addition() throws RecognitionException {
        JVMParser.signature_info_addition_return retval = new JVMParser.signature_info_addition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature64=null;
        Token CPINDEX65=null;

        Object Signature64_tree=null;
        Object CPINDEX65_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:149:3: ( Signature ( CPINDEX )? -> ^( Signature ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:149:5: Signature ( CPINDEX )?
            {
            Signature64=(Token)match(input,Signature,FOLLOW_Signature_in_signature_info_addition1017); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Signature.add(Signature64);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:149:15: ( CPINDEX )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CPINDEX) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:149:15: CPINDEX
                    {
                    CPINDEX65=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_signature_info_addition1019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX65);


                    }
                    break;

            }


            // AST REWRITE
            // elements: Signature, CPINDEX
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 149:24: -> ^( Signature ( CPINDEX )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:149:27: ^( Signature ( CPINDEX )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Signature.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:149:39: ( CPINDEX )?
                if ( stream_CPINDEX.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_CPINDEX.nextNode()
                    );

                }
                stream_CPINDEX.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signature_info_addition"


    public static class innerclass_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "innerclass_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:152:1: innerclass_info : InnerClasses ( innerclass_info_line )+ -> ^( InnerClasses ( innerclass_info_line )+ ) ;
    public final JVMParser.innerclass_info_return innerclass_info() throws RecognitionException {
        JVMParser.innerclass_info_return retval = new JVMParser.innerclass_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token InnerClasses66=null;
        JVMParser.innerclass_info_line_return innerclass_info_line67 =null;


        Object InnerClasses66_tree=null;
        RewriteRuleTokenStream stream_InnerClasses=new RewriteRuleTokenStream(adaptor,"token InnerClasses");
        RewriteRuleSubtreeStream stream_innerclass_info_line=new RewriteRuleSubtreeStream(adaptor,"rule innerclass_info_line");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:153:3: ( InnerClasses ( innerclass_info_line )+ -> ^( InnerClasses ( innerclass_info_line )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:153:5: InnerClasses ( innerclass_info_line )+
            {
            InnerClasses66=(Token)match(input,InnerClasses,FOLLOW_InnerClasses_in_innerclass_info1042); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_InnerClasses.add(InnerClasses66);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:153:18: ( innerclass_info_line )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ABSTRACT||LA13_0==CPINDEX||LA13_0==FINAL||LA13_0==NATIVE||(LA13_0 >= PRIVATE && LA13_0 <= PUBLIC)||LA13_0==STATIC||LA13_0==STRICTFP||LA13_0==SYNCHRONIZED) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:153:18: innerclass_info_line
            	    {
            	    pushFollow(FOLLOW_innerclass_info_line_in_innerclass_info1044);
            	    innerclass_info_line67=innerclass_info_line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_innerclass_info_line.add(innerclass_info_line67.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            // AST REWRITE
            // elements: InnerClasses, innerclass_info_line
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 153:40: -> ^( InnerClasses ( innerclass_info_line )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:153:43: ^( InnerClasses ( innerclass_info_line )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_InnerClasses.nextNode()
                , root_1);

                if ( !(stream_innerclass_info_line.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_innerclass_info_line.hasNext() ) {
                    adaptor.addChild(root_1, stream_innerclass_info_line.nextTree());

                }
                stream_innerclass_info_line.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "innerclass_info"


    public static class innerclass_info_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "innerclass_info_line"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:156:1: innerclass_info_line : ( method_visual_modifier )? ( method_modifier )* innerclass_info_data ( SEMI )? -> ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data ;
    public final JVMParser.innerclass_info_line_return innerclass_info_line() throws RecognitionException {
        JVMParser.innerclass_info_line_return retval = new JVMParser.innerclass_info_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI71=null;
        JVMParser.method_visual_modifier_return method_visual_modifier68 =null;

        JVMParser.method_modifier_return method_modifier69 =null;

        JVMParser.innerclass_info_data_return innerclass_info_data70 =null;


        Object SEMI71_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_innerclass_info_data=new RewriteRuleSubtreeStream(adaptor,"rule innerclass_info_data");
        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        RewriteRuleSubtreeStream stream_method_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_visual_modifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:157:3: ( ( method_visual_modifier )? ( method_modifier )* innerclass_info_data ( SEMI )? -> ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:157:6: ( method_visual_modifier )? ( method_modifier )* innerclass_info_data ( SEMI )?
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:157:6: ( method_visual_modifier )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= PRIVATE && LA14_0 <= PUBLIC)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:157:6: method_visual_modifier
                    {
                    pushFollow(FOLLOW_method_visual_modifier_in_innerclass_info_line1070);
                    method_visual_modifier68=method_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_method_visual_modifier.add(method_visual_modifier68.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:157:30: ( method_modifier )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ABSTRACT||LA15_0==FINAL||LA15_0==NATIVE||LA15_0==STATIC||LA15_0==STRICTFP||LA15_0==SYNCHRONIZED) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:157:30: method_modifier
            	    {
            	    pushFollow(FOLLOW_method_modifier_in_innerclass_info_line1073);
            	    method_modifier69=method_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_method_modifier.add(method_modifier69.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            pushFollow(FOLLOW_innerclass_info_data_in_innerclass_info_line1076);
            innerclass_info_data70=innerclass_info_data();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_innerclass_info_data.add(innerclass_info_data70.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:157:68: ( SEMI )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==SEMI) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:157:68: SEMI
                    {
                    SEMI71=(Token)match(input,SEMI,FOLLOW_SEMI_in_innerclass_info_line1078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI71);


                    }
                    break;

            }


            // AST REWRITE
            // elements: innerclass_info_data, method_visual_modifier, method_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 158:7: -> ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:158:10: ^( VMODIFIER ( method_visual_modifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:158:22: ( method_visual_modifier )?
                if ( stream_method_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_visual_modifier.nextTree());

                }
                stream_method_visual_modifier.reset();

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:158:47: ^( MODIFIER ( method_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:158:58: ( method_modifier )*
                while ( stream_method_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_modifier.nextTree());

                }
                stream_method_modifier.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_innerclass_info_data.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "innerclass_info_line"


    public static class innerclass_info_data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "innerclass_info_data"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:161:1: innerclass_info_data : CPINDEX ( ASSIGN cp1= CPINDEX )? ( IDENTIFIER cp2= CPINDEX )? -> ^( CPINDEX ^( INFODATA1 ( ASSIGN $cp1)? ) ^( INFODATA2 ( IDENTIFIER $cp2)? ) ) ;
    public final JVMParser.innerclass_info_data_return innerclass_info_data() throws RecognitionException {
        JVMParser.innerclass_info_data_return retval = new JVMParser.innerclass_info_data_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token cp1=null;
        Token cp2=null;
        Token CPINDEX72=null;
        Token ASSIGN73=null;
        Token IDENTIFIER74=null;

        Object cp1_tree=null;
        Object cp2_tree=null;
        Object CPINDEX72_tree=null;
        Object ASSIGN73_tree=null;
        Object IDENTIFIER74_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:162:3: ( CPINDEX ( ASSIGN cp1= CPINDEX )? ( IDENTIFIER cp2= CPINDEX )? -> ^( CPINDEX ^( INFODATA1 ( ASSIGN $cp1)? ) ^( INFODATA2 ( IDENTIFIER $cp2)? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:162:5: CPINDEX ( ASSIGN cp1= CPINDEX )? ( IDENTIFIER cp2= CPINDEX )?
            {
            CPINDEX72=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1116); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX72);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:162:13: ( ASSIGN cp1= CPINDEX )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ASSIGN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:162:14: ASSIGN cp1= CPINDEX
                    {
                    ASSIGN73=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_innerclass_info_data1119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN73);


                    cp1=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(cp1);


                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:162:35: ( IDENTIFIER cp2= CPINDEX )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==CPINDEX) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:162:36: IDENTIFIER cp2= CPINDEX
                    {
                    IDENTIFIER74=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_data1128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER74);


                    cp2=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(cp2);


                    }
                    break;

            }


            // AST REWRITE
            // elements: CPINDEX, ASSIGN, IDENTIFIER, cp2, cp1
            // token labels: cp2, cp1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_cp2=new RewriteRuleTokenStream(adaptor,"token cp2",cp2);
            RewriteRuleTokenStream stream_cp1=new RewriteRuleTokenStream(adaptor,"token cp1",cp1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:44: -> ^( CPINDEX ^( INFODATA1 ( ASSIGN $cp1)? ) ^( INFODATA2 ( IDENTIFIER $cp2)? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:163:47: ^( CPINDEX ^( INFODATA1 ( ASSIGN $cp1)? ) ^( INFODATA2 ( IDENTIFIER $cp2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CPINDEX.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:163:57: ^( INFODATA1 ( ASSIGN $cp1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INFODATA1, "INFODATA1")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:163:69: ( ASSIGN $cp1)?
                if ( stream_ASSIGN.hasNext()||stream_cp1.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_ASSIGN.nextNode()
                    );

                    adaptor.addChild(root_2, stream_cp1.nextNode());

                }
                stream_ASSIGN.reset();
                stream_cp1.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:163:85: ^( INFODATA2 ( IDENTIFIER $cp2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INFODATA2, "INFODATA2")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:163:97: ( IDENTIFIER $cp2)?
                if ( stream_IDENTIFIER.hasNext()||stream_cp2.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_IDENTIFIER.nextNode()
                    );

                    adaptor.addChild(root_2, stream_cp2.nextNode());

                }
                stream_IDENTIFIER.reset();
                stream_cp2.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "innerclass_info_data"


    public static class minor_major_version_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minor_major_version_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:166:1: minor_major_version_info : IDENTIFIER IDENTIFIER COLON INTLITERAL -> ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) ;
    public final JVMParser.minor_major_version_info_return minor_major_version_info() throws RecognitionException {
        JVMParser.minor_major_version_info_return retval = new JVMParser.minor_major_version_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER75=null;
        Token IDENTIFIER76=null;
        Token COLON77=null;
        Token INTLITERAL78=null;

        Object IDENTIFIER75_tree=null;
        Object IDENTIFIER76_tree=null;
        Object COLON77_tree=null;
        Object INTLITERAL78_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:167:3: ( IDENTIFIER IDENTIFIER COLON INTLITERAL -> ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:167:5: IDENTIFIER IDENTIFIER COLON INTLITERAL
            {
            IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info1224); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER75);


            IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info1226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER76);


            COLON77=(Token)match(input,COLON,FOLLOW_COLON_in_minor_major_version_info1228); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON77);


            INTLITERAL78=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_minor_major_version_info1230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL78);


            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER, COLON, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 167:45: -> ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:167:48: ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_COLON.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "minor_major_version_info"


    public static class flags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flags"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:170:1: flags : Flag ( accessFlagList )? Marker -> ^( Flag ( accessFlagList )? ) ;
    public final JVMParser.flags_return flags() throws RecognitionException {
        JVMParser.flags_return retval = new JVMParser.flags_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Flag79=null;
        Token Marker81=null;
        JVMParser.accessFlagList_return accessFlagList80 =null;


        Object Flag79_tree=null;
        Object Marker81_tree=null;
        RewriteRuleTokenStream stream_Flag=new RewriteRuleTokenStream(adaptor,"token Flag");
        RewriteRuleTokenStream stream_Marker=new RewriteRuleTokenStream(adaptor,"token Marker");
        RewriteRuleSubtreeStream stream_accessFlagList=new RewriteRuleSubtreeStream(adaptor,"rule accessFlagList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:171:3: ( Flag ( accessFlagList )? Marker -> ^( Flag ( accessFlagList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:171:5: Flag ( accessFlagList )? Marker
            {
            Flag79=(Token)match(input,Flag,FOLLOW_Flag_in_flags1262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Flag.add(Flag79);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:171:10: ( accessFlagList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER||LA19_0==INTLITERAL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:171:10: accessFlagList
                    {
                    pushFollow(FOLLOW_accessFlagList_in_flags1264);
                    accessFlagList80=accessFlagList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_accessFlagList.add(accessFlagList80.getTree());

                    }
                    break;

            }


            Marker81=(Token)match(input,Marker,FOLLOW_Marker_in_flags1267); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Marker.add(Marker81);


            // AST REWRITE
            // elements: accessFlagList, Flag
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 171:33: -> ^( Flag ( accessFlagList )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:171:36: ^( Flag ( accessFlagList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Flag.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:171:43: ( accessFlagList )?
                if ( stream_accessFlagList.hasNext() ) {
                    adaptor.addChild(root_1, stream_accessFlagList.nextTree());

                }
                stream_accessFlagList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "flags"


    public static class accessFlagList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "accessFlagList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:174:1: accessFlagList : flagType ( COMMA flagType )* -> ( flagType )+ ;
    public final JVMParser.accessFlagList_return accessFlagList() throws RecognitionException {
        JVMParser.accessFlagList_return retval = new JVMParser.accessFlagList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA83=null;
        JVMParser.flagType_return flagType82 =null;

        JVMParser.flagType_return flagType84 =null;


        Object COMMA83_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_flagType=new RewriteRuleSubtreeStream(adaptor,"rule flagType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:175:3: ( flagType ( COMMA flagType )* -> ( flagType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:175:5: flagType ( COMMA flagType )*
            {
            pushFollow(FOLLOW_flagType_in_accessFlagList1291);
            flagType82=flagType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flagType.add(flagType82.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:175:14: ( COMMA flagType )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:175:15: COMMA flagType
            	    {
            	    COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_accessFlagList1294); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA83);


            	    pushFollow(FOLLOW_flagType_in_accessFlagList1296);
            	    flagType84=flagType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_flagType.add(flagType84.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // AST REWRITE
            // elements: flagType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 175:32: -> ( flagType )+
            {
                if ( !(stream_flagType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_flagType.hasNext() ) {
                    adaptor.addChild(root_0, stream_flagType.nextTree());

                }
                stream_flagType.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "accessFlagList"


    public static class flagType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flagType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:178:1: flagType : ( IDENTIFIER | INTLITERAL );
    public final JVMParser.flagType_return flagType() throws RecognitionException {
        JVMParser.flagType_return retval = new JVMParser.flagType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set85=null;

        Object set85_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:179:3: ( IDENTIFIER | INTLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set85=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTLITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set85)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "flagType"


    public static class runtimeVisibleAnnotations_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleAnnotations_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:186:1: runtimeVisibleAnnotations_info : RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ -> ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) ;
    public final JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotations_info_return retval = new JVMParser.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeVisibleAnnotations86=null;
        JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem87 =null;


        Object RuntimeVisibleAnnotations86_tree=null;
        RewriteRuleTokenStream stream_RuntimeVisibleAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeVisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationsItem=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationsItem");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:187:3: ( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ -> ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:187:5: RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+
            {
            RuntimeVisibleAnnotations86=(Token)match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info1340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeVisibleAnnotations.add(RuntimeVisibleAnnotations86);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:188:5: ( runtimeVisibleAnnotationsItem )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==INTLITERAL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:188:5: runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1347);
            	    runtimeVisibleAnnotationsItem87=runtimeVisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationsItem.add(runtimeVisibleAnnotationsItem87.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            // AST REWRITE
            // elements: runtimeVisibleAnnotationsItem, RuntimeVisibleAnnotations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:36: -> ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:188:39: ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_RuntimeVisibleAnnotations.nextNode()
                , root_1);

                if ( !(stream_runtimeVisibleAnnotationsItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_runtimeVisibleAnnotationsItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_runtimeVisibleAnnotationsItem.nextTree());

                }
                stream_runtimeVisibleAnnotationsItem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeVisibleAnnotations_info"


    public static class runtimeVisibleAnnotationsItem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleAnnotationsItem"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:190:1: runtimeVisibleAnnotationsItem : pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotationsItem_return retval = new JVMParser.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX89=null;
        Token LPAREN90=null;
        Token RPAREN92=null;
        JVMParser.pc_return pc88 =null;

        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList91 =null;


        Object CPINDEX89_tree=null;
        Object LPAREN90_tree=null;
        Object RPAREN92_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationAssignList");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:191:3: ( pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:191:5: pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN
            {
            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem1369);
            pc88=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc88.getTree());

            CPINDEX89=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1371); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX89);


            LPAREN90=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_runtimeVisibleAnnotationsItem1373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN90);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:191:23: ( runtimeVisibleAnnotationAssignList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CPINDEX) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:191:23: runtimeVisibleAnnotationAssignList
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1375);
                    runtimeVisibleAnnotationAssignList91=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationAssignList.add(runtimeVisibleAnnotationAssignList91.getTree());

                    }
                    break;

            }


            RPAREN92=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_runtimeVisibleAnnotationsItem1378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN92);


            // AST REWRITE
            // elements: CPINDEX, pc, runtimeVisibleAnnotationAssignList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 191:66: -> ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:191:69: ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CPINDEX.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:191:82: ( runtimeVisibleAnnotationAssignList )?
                if ( stream_runtimeVisibleAnnotationAssignList.hasNext() ) {
                    adaptor.addChild(root_1, stream_runtimeVisibleAnnotationAssignList.nextTree());

                }
                stream_runtimeVisibleAnnotationAssignList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeVisibleAnnotationsItem"


    public static class runtimeVisibleAnnotationAssignList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleAnnotationAssignList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:193:1: runtimeVisibleAnnotationAssignList : annotationAssign ( COMMA annotationAssign )* -> ( annotationAssign )+ ;
    public final JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotationAssignList_return retval = new JVMParser.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA94=null;
        JVMParser.annotationAssign_return annotationAssign93 =null;

        JVMParser.annotationAssign_return annotationAssign95 =null;


        Object COMMA94_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_annotationAssign=new RewriteRuleSubtreeStream(adaptor,"rule annotationAssign");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:194:3: ( annotationAssign ( COMMA annotationAssign )* -> ( annotationAssign )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:194:5: annotationAssign ( COMMA annotationAssign )*
            {
            pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1401);
            annotationAssign93=annotationAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_annotationAssign.add(annotationAssign93.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:194:22: ( COMMA annotationAssign )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:194:23: COMMA annotationAssign
            	    {
            	    COMMA94=(Token)match(input,COMMA,FOLLOW_COMMA_in_runtimeVisibleAnnotationAssignList1404); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA94);


            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1406);
            	    annotationAssign95=annotationAssign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotationAssign.add(annotationAssign95.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            // AST REWRITE
            // elements: annotationAssign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 194:48: -> ( annotationAssign )+
            {
                if ( !(stream_annotationAssign.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_annotationAssign.hasNext() ) {
                    adaptor.addChild(root_0, stream_annotationAssign.nextTree());

                }
                stream_annotationAssign.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeVisibleAnnotationAssignList"


    public static class annotationAssign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationAssign"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:196:1: annotationAssign : CPINDEX ASSIGN annotationValue -> ^( ASSIGN CPINDEX annotationValue ) ;
    public final JVMParser.annotationAssign_return annotationAssign() throws RecognitionException {
        JVMParser.annotationAssign_return retval = new JVMParser.annotationAssign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX96=null;
        Token ASSIGN97=null;
        JVMParser.annotationValue_return annotationValue98 =null;


        Object CPINDEX96_tree=null;
        Object ASSIGN97_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_annotationValue=new RewriteRuleSubtreeStream(adaptor,"rule annotationValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:197:3: ( CPINDEX ASSIGN annotationValue -> ^( ASSIGN CPINDEX annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:197:5: CPINDEX ASSIGN annotationValue
            {
            CPINDEX96=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign1425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX96);


            ASSIGN97=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign1427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN97);


            pushFollow(FOLLOW_annotationValue_in_annotationAssign1429);
            annotationValue98=annotationValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_annotationValue.add(annotationValue98.getTree());

            // AST REWRITE
            // elements: CPINDEX, ASSIGN, annotationValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 197:36: -> ^( ASSIGN CPINDEX annotationValue )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:197:39: ^( ASSIGN CPINDEX annotationValue )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ASSIGN.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_CPINDEX.nextNode()
                );

                adaptor.addChild(root_1, stream_annotationValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationAssign"


    public static class annotationValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:199:1: annotationValue : ( brackedAnnotationAssign | AnnotationAssign );
    public final JVMParser.annotationValue_return annotationValue() throws RecognitionException {
        JVMParser.annotationValue_return retval = new JVMParser.annotationValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AnnotationAssign100=null;
        JVMParser.brackedAnnotationAssign_return brackedAnnotationAssign99 =null;


        Object AnnotationAssign100_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:200:3: ( brackedAnnotationAssign | AnnotationAssign )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LBRACK) ) {
                alt24=1;
            }
            else if ( (LA24_0==AnnotationAssign) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:200:5: brackedAnnotationAssign
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationValue1451);
                    brackedAnnotationAssign99=brackedAnnotationAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, brackedAnnotationAssign99.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:201:5: AnnotationAssign
                    {
                    root_0 = (Object)adaptor.nil();


                    AnnotationAssign100=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationValue1458); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AnnotationAssign100_tree = 
                    (Object)adaptor.create(AnnotationAssign100)
                    ;
                    adaptor.addChild(root_0, AnnotationAssign100_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationValue"


    public static class brackedAnnotationAssign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackedAnnotationAssign"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:203:1: brackedAnnotationAssign : LBRACK ( brackedAnnotationAssignList )? RBRACK -> ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? ) ;
    public final JVMParser.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        JVMParser.brackedAnnotationAssign_return retval = new JVMParser.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK101=null;
        Token RBRACK103=null;
        JVMParser.brackedAnnotationAssignList_return brackedAnnotationAssignList102 =null;


        Object LBRACK101_tree=null;
        Object RBRACK103_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_brackedAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule brackedAnnotationAssignList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:204:3: ( LBRACK ( brackedAnnotationAssignList )? RBRACK -> ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:204:5: LBRACK ( brackedAnnotationAssignList )? RBRACK
            {
            LBRACK101=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_brackedAnnotationAssign1470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK101);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:204:12: ( brackedAnnotationAssignList )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AnnotationAssign) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:204:12: brackedAnnotationAssignList
                    {
                    pushFollow(FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign1472);
                    brackedAnnotationAssignList102=brackedAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_brackedAnnotationAssignList.add(brackedAnnotationAssignList102.getTree());

                    }
                    break;

            }


            RBRACK103=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_brackedAnnotationAssign1475); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK103);


            // AST REWRITE
            // elements: brackedAnnotationAssignList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 204:75: -> ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:204:78: ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ANNOTATIONBRACKETS, "ANNOTATIONBRACKETS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:204:99: ( brackedAnnotationAssignList )?
                if ( stream_brackedAnnotationAssignList.hasNext() ) {
                    adaptor.addChild(root_1, stream_brackedAnnotationAssignList.nextTree());

                }
                stream_brackedAnnotationAssignList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "brackedAnnotationAssign"


    public static class brackedAnnotationAssignList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackedAnnotationAssignList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:206:1: brackedAnnotationAssignList : brackedAnnotationAssignValue ( COMMA brackedAnnotationAssignValue )* -> ( brackedAnnotationAssignValue )+ ;
    public final JVMParser.brackedAnnotationAssignList_return brackedAnnotationAssignList() throws RecognitionException {
        JVMParser.brackedAnnotationAssignList_return retval = new JVMParser.brackedAnnotationAssignList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA105=null;
        JVMParser.brackedAnnotationAssignValue_return brackedAnnotationAssignValue104 =null;

        JVMParser.brackedAnnotationAssignValue_return brackedAnnotationAssignValue106 =null;


        Object COMMA105_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_brackedAnnotationAssignValue=new RewriteRuleSubtreeStream(adaptor,"rule brackedAnnotationAssignValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:207:3: ( brackedAnnotationAssignValue ( COMMA brackedAnnotationAssignValue )* -> ( brackedAnnotationAssignValue )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:207:5: brackedAnnotationAssignValue ( COMMA brackedAnnotationAssignValue )*
            {
            pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1523);
            brackedAnnotationAssignValue104=brackedAnnotationAssignValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_brackedAnnotationAssignValue.add(brackedAnnotationAssignValue104.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:207:34: ( COMMA brackedAnnotationAssignValue )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:207:35: COMMA brackedAnnotationAssignValue
            	    {
            	    COMMA105=(Token)match(input,COMMA,FOLLOW_COMMA_in_brackedAnnotationAssignList1526); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA105);


            	    pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1528);
            	    brackedAnnotationAssignValue106=brackedAnnotationAssignValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_brackedAnnotationAssignValue.add(brackedAnnotationAssignValue106.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // AST REWRITE
            // elements: brackedAnnotationAssignValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 207:75: -> ( brackedAnnotationAssignValue )+
            {
                if ( !(stream_brackedAnnotationAssignValue.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_brackedAnnotationAssignValue.hasNext() ) {
                    adaptor.addChild(root_0, stream_brackedAnnotationAssignValue.nextTree());

                }
                stream_brackedAnnotationAssignValue.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "brackedAnnotationAssignList"


    public static class brackedAnnotationAssignValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackedAnnotationAssignValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:209:1: brackedAnnotationAssignValue : AnnotationAssign ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )? -> ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMParser.brackedAnnotationAssignValue_return brackedAnnotationAssignValue() throws RecognitionException {
        JVMParser.brackedAnnotationAssignValue_return retval = new JVMParser.brackedAnnotationAssignValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AnnotationAssign107=null;
        Token LPAREN108=null;
        Token RPAREN110=null;
        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList109 =null;


        Object AnnotationAssign107_tree=null;
        Object LPAREN108_tree=null;
        Object RPAREN110_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_AnnotationAssign=new RewriteRuleTokenStream(adaptor,"token AnnotationAssign");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationAssignList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:210:3: ( AnnotationAssign ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )? -> ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:210:5: AnnotationAssign ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )?
            {
            AnnotationAssign107=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue1550); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AnnotationAssign.add(AnnotationAssign107);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:210:22: ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LPAREN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:210:23: LPAREN runtimeVisibleAnnotationAssignList RPAREN
                    {
                    LPAREN108=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_brackedAnnotationAssignValue1553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN108);


                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue1555);
                    runtimeVisibleAnnotationAssignList109=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationAssignList.add(runtimeVisibleAnnotationAssignList109.getTree());

                    RPAREN110=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_brackedAnnotationAssignValue1557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN110);


                    }
                    break;

            }


            // AST REWRITE
            // elements: AnnotationAssign, runtimeVisibleAnnotationAssignList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 210:75: -> ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:210:78: ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_AnnotationAssign.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:210:97: ( runtimeVisibleAnnotationAssignList )?
                if ( stream_runtimeVisibleAnnotationAssignList.hasNext() ) {
                    adaptor.addChild(root_1, stream_runtimeVisibleAnnotationAssignList.nextTree());

                }
                stream_runtimeVisibleAnnotationAssignList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "brackedAnnotationAssignValue"


    public static class runtimeVisibleParameterAnnotations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleParameterAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:212:1: runtimeVisibleParameterAnnotations : RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMParser.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations() throws RecognitionException {
        JVMParser.runtimeVisibleParameterAnnotations_return retval = new JVMParser.runtimeVisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeVisibleParameterAnnotations111=null;
        JVMParser.parameterVisibilityInfo_return parameterVisibilityInfo112 =null;


        Object RuntimeVisibleParameterAnnotations111_tree=null;
        RewriteRuleTokenStream stream_RuntimeVisibleParameterAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeVisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_parameterVisibilityInfo=new RewriteRuleSubtreeStream(adaptor,"rule parameterVisibilityInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:213:3: ( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:213:5: RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+
            {
            RuntimeVisibleParameterAnnotations111=(Token)match(input,RuntimeVisibleParameterAnnotations,FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations1581); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeVisibleParameterAnnotations.add(RuntimeVisibleParameterAnnotations111);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:214:5: ( parameterVisibilityInfo )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==IDENTIFIER) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==INTLITERAL) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==INTLITERAL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:214:5: parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations1588);
            	    parameterVisibilityInfo112=parameterVisibilityInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameterVisibilityInfo.add(parameterVisibilityInfo112.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            // AST REWRITE
            // elements: RuntimeVisibleParameterAnnotations, parameterVisibilityInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 214:45: -> ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:214:48: ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_RuntimeVisibleParameterAnnotations.nextNode()
                , root_1);

                if ( !(stream_parameterVisibilityInfo.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parameterVisibilityInfo.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterVisibilityInfo.nextTree());

                }
                stream_parameterVisibilityInfo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeVisibleParameterAnnotations"


    public static class runtimeInvisibleParameterAnnotations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeInvisibleParameterAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:216:1: runtimeInvisibleParameterAnnotations : RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMParser.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations() throws RecognitionException {
        JVMParser.runtimeInvisibleParameterAnnotations_return retval = new JVMParser.runtimeInvisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeInvisibleParameterAnnotations113=null;
        JVMParser.parameterVisibilityInfo_return parameterVisibilityInfo114 =null;


        Object RuntimeInvisibleParameterAnnotations113_tree=null;
        RewriteRuleTokenStream stream_RuntimeInvisibleParameterAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeInvisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_parameterVisibilityInfo=new RewriteRuleSubtreeStream(adaptor,"rule parameterVisibilityInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:217:3: ( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:217:5: RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+
            {
            RuntimeInvisibleParameterAnnotations113=(Token)match(input,RuntimeInvisibleParameterAnnotations,FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1625); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeInvisibleParameterAnnotations.add(RuntimeInvisibleParameterAnnotations113);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:218:5: ( parameterVisibilityInfo )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==IDENTIFIER) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==INTLITERAL) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==INTLITERAL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:218:5: parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1632);
            	    parameterVisibilityInfo114=parameterVisibilityInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameterVisibilityInfo.add(parameterVisibilityInfo114.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            // AST REWRITE
            // elements: parameterVisibilityInfo, RuntimeInvisibleParameterAnnotations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:45: -> ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:218:48: ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_RuntimeInvisibleParameterAnnotations.nextNode()
                , root_1);

                if ( !(stream_parameterVisibilityInfo.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parameterVisibilityInfo.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterVisibilityInfo.nextTree());

                }
                stream_parameterVisibilityInfo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeInvisibleParameterAnnotations"


    public static class runtimeInvisibleAnnotations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeInvisibleAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:220:1: runtimeInvisibleAnnotations : RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ -> ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) ;
    public final JVMParser.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations() throws RecognitionException {
        JVMParser.runtimeInvisibleAnnotations_return retval = new JVMParser.runtimeInvisibleAnnotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeInvisibleAnnotations115=null;
        JVMParser.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem116 =null;


        Object RuntimeInvisibleAnnotations115_tree=null;
        RewriteRuleTokenStream stream_RuntimeInvisibleAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeInvisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeInvisibleAnnotationsItem=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleAnnotationsItem");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:221:3: ( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ -> ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:221:5: RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+
            {
            RuntimeInvisibleAnnotations115=(Token)match(input,RuntimeInvisibleAnnotations,FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1669); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeInvisibleAnnotations.add(RuntimeInvisibleAnnotations115);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:222:5: ( runtimeInvisibleAnnotationsItem )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==INTLITERAL) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:222:5: runtimeInvisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1676);
            	    runtimeInvisibleAnnotationsItem116=runtimeInvisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeInvisibleAnnotationsItem.add(runtimeInvisibleAnnotationsItem116.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            // AST REWRITE
            // elements: runtimeInvisibleAnnotationsItem, RuntimeInvisibleAnnotations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 222:45: -> ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:222:48: ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_RuntimeInvisibleAnnotations.nextNode()
                , root_1);

                if ( !(stream_runtimeInvisibleAnnotationsItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_runtimeInvisibleAnnotationsItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_runtimeInvisibleAnnotationsItem.nextTree());

                }
                stream_runtimeInvisibleAnnotationsItem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeInvisibleAnnotations"


    public static class parameterVisibilityInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameterVisibilityInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:224:1: parameterVisibilityInfo : ( IDENTIFIER )? pc ( runtimeVisibleAnnotationsItem )* -> ^( PVI pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) ;
    public final JVMParser.parameterVisibilityInfo_return parameterVisibilityInfo() throws RecognitionException {
        JVMParser.parameterVisibilityInfo_return retval = new JVMParser.parameterVisibilityInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER117=null;
        JVMParser.pc_return pc118 =null;

        JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem119 =null;


        Object IDENTIFIER117_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationsItem=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationsItem");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:225:3: ( ( IDENTIFIER )? pc ( runtimeVisibleAnnotationsItem )* -> ^( PVI pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:225:5: ( IDENTIFIER )? pc ( runtimeVisibleAnnotationsItem )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:225:5: ( IDENTIFIER )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENTIFIER) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:225:5: IDENTIFIER
                    {
                    IDENTIFIER117=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER117);


                    }
                    break;

            }


            pushFollow(FOLLOW_pc_in_parameterVisibilityInfo1708);
            pc118=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc118.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:226:5: ( runtimeVisibleAnnotationsItem )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==INTLITERAL) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==COLON) ) {
                        int LA32_3 = input.LA(3);

                        if ( (LA32_3==CPINDEX) ) {
                            alt32=1;
                        }


                    }


                }


                switch (alt32) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:226:5: runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1714);
            	    runtimeVisibleAnnotationsItem119=runtimeVisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationsItem.add(runtimeVisibleAnnotationsItem119.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // AST REWRITE
            // elements: runtimeVisibleAnnotationsItem, pc, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 226:45: -> ^( PVI pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:226:48: ^( PVI pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PVI, "PVI")
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:226:57: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:226:69: ( runtimeVisibleAnnotationsItem )*
                while ( stream_runtimeVisibleAnnotationsItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_runtimeVisibleAnnotationsItem.nextTree());

                }
                stream_runtimeVisibleAnnotationsItem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameterVisibilityInfo"


    public static class runtimeInvisibleAnnotationsItem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeInvisibleAnnotationsItem"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:228:1: runtimeInvisibleAnnotationsItem : p1= pc (p2= pc )? CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( RIAI $p1 ( $p2)? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) ;
    public final JVMParser.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem() throws RecognitionException {
        JVMParser.runtimeInvisibleAnnotationsItem_return retval = new JVMParser.runtimeInvisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX120=null;
        Token LPAREN121=null;
        Token RPAREN123=null;
        JVMParser.pc_return p1 =null;

        JVMParser.pc_return p2 =null;

        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList122 =null;


        Object CPINDEX120_tree=null;
        Object LPAREN121_tree=null;
        Object RPAREN123_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationAssignList");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:3: (p1= pc (p2= pc )? CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( RIAI $p1 ( $p2)? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:5: p1= pc (p2= pc )? CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN
            {
            pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1752);
            p1=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(p1.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:13: (p2= pc )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==INTLITERAL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:13: p2= pc
                    {
                    pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1756);
                    p2=pc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pc.add(p2.getTree());

                    }
                    break;

            }


            CPINDEX120=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1759); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX120);


            LPAREN121=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_runtimeInvisibleAnnotationsItem1761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN121);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:33: ( runtimeVisibleAnnotationAssignList )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==CPINDEX) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:33: runtimeVisibleAnnotationAssignList
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1763);
                    runtimeVisibleAnnotationAssignList122=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationAssignList.add(runtimeVisibleAnnotationAssignList122.getTree());

                    }
                    break;

            }


            RPAREN123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_runtimeInvisibleAnnotationsItem1766); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN123);


            // AST REWRITE
            // elements: runtimeVisibleAnnotationAssignList, p1, CPINDEX, p2
            // token labels: 
            // rule labels: retval, p2, p1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_p2=new RewriteRuleSubtreeStream(adaptor,"rule p2",p2!=null?p2.tree:null);
            RewriteRuleSubtreeStream stream_p1=new RewriteRuleSubtreeStream(adaptor,"rule p1",p1!=null?p1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 229:76: -> ^( RIAI $p1 ( $p2)? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:79: ^( RIAI $p1 ( $p2)? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RIAI, "RIAI")
                , root_1);

                adaptor.addChild(root_1, stream_p1.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:91: ( $p2)?
                if ( stream_p2.hasNext() ) {
                    adaptor.addChild(root_1, stream_p2.nextTree());

                }
                stream_p2.reset();

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:95: ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_CPINDEX.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:229:105: ( runtimeVisibleAnnotationAssignList )?
                if ( stream_runtimeVisibleAnnotationAssignList.hasNext() ) {
                    adaptor.addChild(root_2, stream_runtimeVisibleAnnotationAssignList.nextTree());

                }
                stream_runtimeVisibleAnnotationAssignList.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "runtimeInvisibleAnnotationsItem"


    public static class constant_pool_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_pool"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:236:1: constant_pool : IDENTIFIER IDENTIFIER COLON ( contant_pool_line )* -> ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) ;
    public final JVMParser.constant_pool_return constant_pool() throws RecognitionException {
        JVMParser.constant_pool_return retval = new JVMParser.constant_pool_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER124=null;
        Token IDENTIFIER125=null;
        Token COLON126=null;
        JVMParser.contant_pool_line_return contant_pool_line127 =null;


        Object IDENTIFIER124_tree=null;
        Object IDENTIFIER125_tree=null;
        Object COLON126_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_contant_pool_line=new RewriteRuleSubtreeStream(adaptor,"rule contant_pool_line");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:237:3: ( IDENTIFIER IDENTIFIER COLON ( contant_pool_line )* -> ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:237:5: IDENTIFIER IDENTIFIER COLON ( contant_pool_line )*
            {
            IDENTIFIER124=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER124);


            IDENTIFIER125=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1805); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER125);


            COLON126=(Token)match(input,COLON,FOLLOW_COLON_in_constant_pool1807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON126);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:238:5: ( contant_pool_line )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==CPINDEX) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:238:5: contant_pool_line
            	    {
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool1814);
            	    contant_pool_line127=contant_pool_line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_contant_pool_line.add(contant_pool_line127.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // AST REWRITE
            // elements: contant_pool_line, IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 238:24: -> ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:238:27: ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:238:51: ( contant_pool_line )*
                while ( stream_contant_pool_line.hasNext() ) {
                    adaptor.addChild(root_1, stream_contant_pool_line.nextTree());

                }
                stream_contant_pool_line.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant_pool"


    public static class contant_pool_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "contant_pool_line"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:241:1: contant_pool_line : CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE -> ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) ;
    public final JVMParser.contant_pool_line_return contant_pool_line() throws RecognitionException {
        JVMParser.contant_pool_line_return retval = new JVMParser.contant_pool_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX128=null;
        Token ASSIGN129=null;
        Token CONSTANT_TYPE_ASSIGNABLE130=null;

        Object CPINDEX128_tree=null;
        Object ASSIGN129_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE130_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleTokenStream stream_CONSTANT_TYPE_ASSIGNABLE=new RewriteRuleTokenStream(adaptor,"token CONSTANT_TYPE_ASSIGNABLE");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:242:3: ( CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE -> ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:242:5: CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE
            {
            CPINDEX128=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line1841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX128);


            ASSIGN129=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line1843); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN129);


            CONSTANT_TYPE_ASSIGNABLE130=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT_TYPE_ASSIGNABLE.add(CONSTANT_TYPE_ASSIGNABLE130);


            // AST REWRITE
            // elements: CPINDEX, ASSIGN, CONSTANT_TYPE_ASSIGNABLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 242:45: -> ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:242:48: ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ASSIGN.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_CPINDEX.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_CONSTANT_TYPE_ASSIGNABLE.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "contant_pool_line"


    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBody"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:249:1: classBody : ( classBodyEntryDecl )+ ;
    public final JVMParser.classBody_return classBody() throws RecognitionException {
        JVMParser.classBody_return retval = new JVMParser.classBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.classBodyEntryDecl_return classBodyEntryDecl131 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:250:3: ( ( classBodyEntryDecl )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:250:5: ( classBodyEntryDecl )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:250:5: ( classBodyEntryDecl )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ABSTRACT||LA36_0==BOOLEAN||(LA36_0 >= BYTE && LA36_0 <= BaseType)||LA36_0==CHAR||LA36_0==Constant_type||LA36_0==DOUBLE||(LA36_0 >= FINAL && LA36_0 <= FLOAT)||LA36_0==IDENTIFIER||LA36_0==INT||(LA36_0 >= LESST && LA36_0 <= LONG)||LA36_0==NATIVE||(LA36_0 >= PRIVATE && LA36_0 <= PUBLIC)||LA36_0==QualifiedType||LA36_0==SHORT||LA36_0==STATIC||LA36_0==STRICTFP||LA36_0==SYNCHRONIZED||LA36_0==TRANSIENT||(LA36_0 >= VOID && LA36_0 <= VoidType)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:250:5: classBodyEntryDecl
            	    {
            	    pushFollow(FOLLOW_classBodyEntryDecl_in_classBody1874);
            	    classBodyEntryDecl131=classBodyEntryDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyEntryDecl131.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classBody"


    public static class classBodyEntryDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyEntryDecl"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:253:1: classBodyEntryDecl : ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition );
    public final JVMParser.classBodyEntryDecl_return classBodyEntryDecl() throws RecognitionException {
        JVMParser.classBodyEntryDecl_return retval = new JVMParser.classBodyEntryDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.methodDefinition_return methodDefinition132 =null;

        JVMParser.ctorDefinition_return ctorDefinition133 =null;

        JVMParser.fieldDefinition_return fieldDefinition134 =null;

        JVMParser.staticCtorDefinition_return staticCtorDefinition135 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:254:3: ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0 >= PRIVATE && LA37_0 <= PUBLIC)) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred2_JVM()) ) {
                    alt37=2;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else if ( (true) ) {
                    alt37=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==STATIC) ) {
                int LA37_2 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else if ( (true) ) {
                    alt37=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==LESST) ) {
                int LA37_3 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred2_JVM()) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==BOOLEAN) ) {
                int LA37_4 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==DOUBLE||LA37_0==FLOAT) ) {
                int LA37_5 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==BYTE||LA37_0==CHAR||LA37_0==INT||LA37_0==LONG||LA37_0==SHORT) ) {
                int LA37_6 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 6, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==VOID) ) {
                int LA37_7 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==IDENTIFIER) ) {
                int LA37_8 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred2_JVM()) ) {
                    alt37=2;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 8, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==BaseType) ) {
                int LA37_9 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred2_JVM()) ) {
                    alt37=2;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==VoidType) ) {
                int LA37_10 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred2_JVM()) ) {
                    alt37=2;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 10, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==Constant_type) ) {
                int LA37_11 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred2_JVM()) ) {
                    alt37=2;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 11, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==QualifiedType) ) {
                int LA37_12 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred2_JVM()) ) {
                    alt37=2;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 12, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==ABSTRACT||LA37_0==NATIVE||LA37_0==STRICTFP||LA37_0==SYNCHRONIZED) && (synpred1_JVM())) {
                alt37=1;
            }
            else if ( (LA37_0==TRANSIENT||LA37_0==VOLATILE) && (synpred3_JVM())) {
                alt37=3;
            }
            else if ( (LA37_0==FINAL) ) {
                int LA37_15 = input.LA(2);

                if ( (synpred1_JVM()) ) {
                    alt37=1;
                }
                else if ( (synpred3_JVM()) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 15, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:254:5: ( methodDefinition )=> methodDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodDefinition_in_classBodyEntryDecl1896);
                    methodDefinition132=methodDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDefinition132.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:255:5: ( ctorDefinition )=> ctorDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ctorDefinition_in_classBodyEntryDecl1908);
                    ctorDefinition133=ctorDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDefinition133.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:256:5: ( fieldDefinition )=> fieldDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fieldDefinition_in_classBodyEntryDecl1920);
                    fieldDefinition134=fieldDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDefinition134.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:257:5: staticCtorDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1926);
                    staticCtorDefinition135=staticCtorDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCtorDefinition135.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classBodyEntryDecl"


    public static class fieldDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:264:1: fieldDefinition : ( field_visual_modifier )? ( field_modifier )* type keywordAggregate ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )* -> ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[$keywordAggregate.text] ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) ;
    public final JVMParser.fieldDefinition_return fieldDefinition() throws RecognitionException {
        JVMParser.fieldDefinition_return retval = new JVMParser.fieldDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSIGN140=null;
        Token SEMI142=null;
        JVMParser.field_visual_modifier_return field_visual_modifier136 =null;

        JVMParser.field_modifier_return field_modifier137 =null;

        JVMParser.type_return type138 =null;

        JVMParser.keywordAggregate_return keywordAggregate139 =null;

        JVMParser.literals_return literals141 =null;

        JVMParser.fieldInfo_return fieldInfo143 =null;

        JVMParser.fieldAdditionalInfo_return fieldAdditionalInfo144 =null;


        Object ASSIGN140_tree=null;
        Object SEMI142_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_keywordAggregate=new RewriteRuleSubtreeStream(adaptor,"rule keywordAggregate");
        RewriteRuleSubtreeStream stream_field_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_visual_modifier");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_fieldInfo=new RewriteRuleSubtreeStream(adaptor,"rule fieldInfo");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_fieldAdditionalInfo=new RewriteRuleSubtreeStream(adaptor,"rule fieldAdditionalInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:3: ( ( field_visual_modifier )? ( field_modifier )* type keywordAggregate ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )* -> ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[$keywordAggregate.text] ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:5: ( field_visual_modifier )? ( field_modifier )* type keywordAggregate ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:5: ( field_visual_modifier )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0 >= PRIVATE && LA38_0 <= PUBLIC)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:5: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition1943);
                    field_visual_modifier136=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_field_visual_modifier.add(field_visual_modifier136.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:28: ( field_modifier )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==FINAL||LA39_0==STATIC||LA39_0==TRANSIENT||LA39_0==VOLATILE) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:28: field_modifier
            	    {
            	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition1946);
            	    field_modifier137=field_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_modifier.add(field_modifier137.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            pushFollow(FOLLOW_type_in_fieldDefinition1949);
            type138=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type138.getTree());

            pushFollow(FOLLOW_keywordAggregate_in_fieldDefinition1951);
            keywordAggregate139=keywordAggregate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keywordAggregate.add(keywordAggregate139.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:66: ( ASSIGN literals )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ASSIGN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:67: ASSIGN literals
                    {
                    ASSIGN140=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefinition1954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN140);


                    pushFollow(FOLLOW_literals_in_fieldDefinition1956);
                    literals141=literals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literals.add(literals141.getTree());

                    }
                    break;

            }


            SEMI142=(Token)match(input,SEMI,FOLLOW_SEMI_in_fieldDefinition1960); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI142);


            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition1967);
            fieldInfo143=fieldInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldInfo.add(fieldInfo143.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:267:5: ( fieldAdditionalInfo )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Constant||LA41_0==Deprecated||LA41_0==RuntimeInvisibleAnnotations||LA41_0==RuntimeVisibleAnnotations||LA41_0==Signature||LA41_0==Synthetic) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:267:5: fieldAdditionalInfo
            	    {
            	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition1973);
            	    fieldAdditionalInfo144=fieldAdditionalInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldAdditionalInfo.add(fieldAdditionalInfo144.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // AST REWRITE
            // elements: fieldAdditionalInfo, literals, fieldInfo, field_visual_modifier, field_modifier, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 268:13: -> ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[$keywordAggregate.text] ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:16: ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[$keywordAggregate.text] ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELDDECL, "FIELDDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:28: ^( VMODIFIER ( field_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:40: ( field_visual_modifier )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                }
                stream_field_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:64: ^( MODIFIER ( field_modifier )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:75: ( field_modifier )*
                while ( stream_field_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_modifier.nextTree());

                }
                stream_field_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:92: ^( RETVALUE type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETVALUE, "RETVALUE")
                , root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:109: ^( UNITNAME IDENTIFIER[$keywordAggregate.text] )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_2);

                adaptor.addChild(root_2, 
                (Object)adaptor.create(IDENTIFIER, (keywordAggregate139!=null?input.toString(keywordAggregate139.start,keywordAggregate139.stop):null))
                );

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:156: ^( FIELDVALUE ( literals )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELDVALUE, "FIELDVALUE")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:169: ( literals )?
                if ( stream_literals.hasNext() ) {
                    adaptor.addChild(root_2, stream_literals.nextTree());

                }
                stream_literals.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:269:13: ^( UNITHEADER fieldInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_fieldInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:270:13: ^( UNITATTR ( fieldAdditionalInfo )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITATTR, "UNITATTR")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:270:24: ( fieldAdditionalInfo )*
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

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldDefinition"


    public static class fieldInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:274:1: fieldInfo : Signature bytecodeType flags -> ^( Signature bytecodeType ) flags ;
    public final JVMParser.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMParser.fieldInfo_return retval = new JVMParser.fieldInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature145=null;
        JVMParser.bytecodeType_return bytecodeType146 =null;

        JVMParser.flags_return flags147 =null;


        Object Signature145_tree=null;
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleSubtreeStream stream_flags=new RewriteRuleSubtreeStream(adaptor,"rule flags");
        RewriteRuleSubtreeStream stream_bytecodeType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:275:3: ( Signature bytecodeType flags -> ^( Signature bytecodeType ) flags )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:275:5: Signature bytecodeType flags
            {
            Signature145=(Token)match(input,Signature,FOLLOW_Signature_in_fieldInfo2089); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Signature.add(Signature145);


            pushFollow(FOLLOW_bytecodeType_in_fieldInfo2091);
            bytecodeType146=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeType.add(bytecodeType146.getTree());

            pushFollow(FOLLOW_flags_in_fieldInfo2097);
            flags147=flags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flags.add(flags147.getTree());

            // AST REWRITE
            // elements: flags, Signature, bytecodeType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 276:11: -> ^( Signature bytecodeType ) flags
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:276:14: ^( Signature bytecodeType )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Signature.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_bytecodeType.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_flags.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldInfo"


    public static class fieldAdditionalInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldAdditionalInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:279:1: fieldAdditionalInfo : ( Constant primitiveType literals -> ^( Constant primitiveType literals ) | Constant CONSTANT_TYPE_ASSIGNABLE -> ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | Signature CPINDEX -> ^( Signature CPINDEX ) | Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info -> runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations -> runtimeInvisibleAnnotations ) ;
    public final JVMParser.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        JVMParser.fieldAdditionalInfo_return retval = new JVMParser.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Constant148=null;
        Token Constant151=null;
        Token CONSTANT_TYPE_ASSIGNABLE152=null;
        Token Signature153=null;
        Token CPINDEX154=null;
        Token Deprecated155=null;
        Token BOOLEANLITERAL156=null;
        Token Synthetic157=null;
        Token BOOLEANLITERAL158=null;
        JVMParser.primitiveType_return primitiveType149 =null;

        JVMParser.literals_return literals150 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info159 =null;

        JVMParser.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations160 =null;


        Object Constant148_tree=null;
        Object Constant151_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE152_tree=null;
        Object Signature153_tree=null;
        Object CPINDEX154_tree=null;
        Object Deprecated155_tree=null;
        Object BOOLEANLITERAL156_tree=null;
        Object Synthetic157_tree=null;
        Object BOOLEANLITERAL158_tree=null;
        RewriteRuleTokenStream stream_Deprecated=new RewriteRuleTokenStream(adaptor,"token Deprecated");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleTokenStream stream_Constant=new RewriteRuleTokenStream(adaptor,"token Constant");
        RewriteRuleTokenStream stream_CONSTANT_TYPE_ASSIGNABLE=new RewriteRuleTokenStream(adaptor,"token CONSTANT_TYPE_ASSIGNABLE");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        RewriteRuleSubtreeStream stream_runtimeInvisibleAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotations_info=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotations_info");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:280:3: ( ( Constant primitiveType literals -> ^( Constant primitiveType literals ) | Constant CONSTANT_TYPE_ASSIGNABLE -> ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | Signature CPINDEX -> ^( Signature CPINDEX ) | Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info -> runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations -> runtimeInvisibleAnnotations ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:280:5: ( Constant primitiveType literals -> ^( Constant primitiveType literals ) | Constant CONSTANT_TYPE_ASSIGNABLE -> ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | Signature CPINDEX -> ^( Signature CPINDEX ) | Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info -> runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations -> runtimeInvisibleAnnotations )
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:280:5: ( Constant primitiveType literals -> ^( Constant primitiveType literals ) | Constant CONSTANT_TYPE_ASSIGNABLE -> ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | Signature CPINDEX -> ^( Signature CPINDEX ) | Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info -> runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations -> runtimeInvisibleAnnotations )
            int alt42=7;
            switch ( input.LA(1) ) {
            case Constant:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==CONSTANT_TYPE_ASSIGNABLE) ) {
                    alt42=2;
                }
                else if ( (LA42_1==BOOLEAN||LA42_1==BYTE||LA42_1==CHAR||LA42_1==DOUBLE||LA42_1==FLOAT||LA42_1==INT||LA42_1==LONG||LA42_1==SHORT||LA42_1==VOID) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;

                }
                }
                break;
            case Signature:
                {
                alt42=3;
                }
                break;
            case Deprecated:
                {
                alt42=4;
                }
                break;
            case Synthetic:
                {
                alt42=5;
                }
                break;
            case RuntimeVisibleAnnotations:
                {
                alt42=6;
                }
                break;
            case RuntimeInvisibleAnnotations:
                {
                alt42=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:280:6: Constant primitiveType literals
                    {
                    Constant148=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo2121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constant.add(Constant148);


                    pushFollow(FOLLOW_primitiveType_in_fieldAdditionalInfo2123);
                    primitiveType149=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType149.getTree());

                    pushFollow(FOLLOW_literals_in_fieldAdditionalInfo2125);
                    literals150=literals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literals.add(literals150.getTree());

                    // AST REWRITE
                    // elements: Constant, literals, primitiveType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 280:38: -> ^( Constant primitiveType literals )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:280:41: ^( Constant primitiveType literals )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Constant.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_primitiveType.nextTree());

                        adaptor.addChild(root_1, stream_literals.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:281:5: Constant CONSTANT_TYPE_ASSIGNABLE
                    {
                    Constant151=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo2141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constant.add(Constant151);


                    CONSTANT_TYPE_ASSIGNABLE152=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo2143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSTANT_TYPE_ASSIGNABLE.add(CONSTANT_TYPE_ASSIGNABLE152);


                    // AST REWRITE
                    // elements: Constant, CONSTANT_TYPE_ASSIGNABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 281:39: -> ^( Constant CONSTANT_TYPE_ASSIGNABLE )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:281:42: ^( Constant CONSTANT_TYPE_ASSIGNABLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Constant.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CONSTANT_TYPE_ASSIGNABLE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:282:5: Signature CPINDEX
                    {
                    Signature153=(Token)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo2157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Signature.add(Signature153);


                    CPINDEX154=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldAdditionalInfo2159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX154);


                    // AST REWRITE
                    // elements: Signature, CPINDEX
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 282:23: -> ^( Signature CPINDEX )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:282:26: ^( Signature CPINDEX )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Signature.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CPINDEX.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:283:5: Deprecated BOOLEANLITERAL
                    {
                    Deprecated155=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo2173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Deprecated.add(Deprecated155);


                    BOOLEANLITERAL156=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL156);


                    // AST REWRITE
                    // elements: BOOLEANLITERAL, Deprecated
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 283:31: -> ^( Deprecated BOOLEANLITERAL )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:283:34: ^( Deprecated BOOLEANLITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Deprecated.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_BOOLEANLITERAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:284:5: Synthetic BOOLEANLITERAL
                    {
                    Synthetic157=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo2189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic157);


                    BOOLEANLITERAL158=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2191); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL158);


                    // AST REWRITE
                    // elements: BOOLEANLITERAL, Synthetic
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 284:30: -> ^( Synthetic BOOLEANLITERAL )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:284:33: ^( Synthetic BOOLEANLITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Synthetic.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_BOOLEANLITERAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:285:5: runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo2205);
                    runtimeVisibleAnnotations_info159=runtimeVisibleAnnotations_info();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotations_info.add(runtimeVisibleAnnotations_info159.getTree());

                    // AST REWRITE
                    // elements: runtimeVisibleAnnotations_info
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 285:36: -> runtimeVisibleAnnotations_info
                    {
                        adaptor.addChild(root_0, stream_runtimeVisibleAnnotations_info.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:286:5: runtimeInvisibleAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo2215);
                    runtimeInvisibleAnnotations160=runtimeInvisibleAnnotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeInvisibleAnnotations.add(runtimeInvisibleAnnotations160.getTree());

                    // AST REWRITE
                    // elements: runtimeInvisibleAnnotations
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 286:33: -> runtimeInvisibleAnnotations
                    {
                        adaptor.addChild(root_0, stream_runtimeInvisibleAnnotations.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldAdditionalInfo"


    public static class field_visual_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:290:1: field_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMParser.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        JVMParser.field_visual_modifier_return retval = new JVMParser.field_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set161=null;

        Object set161_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:291:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set161=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set161)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_visual_modifier"


    public static class field_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:294:1: field_modifier : ( FINAL | STATIC | TRANSIENT | VOLATILE );
    public final JVMParser.field_modifier_return field_modifier() throws RecognitionException {
        JVMParser.field_modifier_return retval = new JVMParser.field_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set162=null;

        Object set162_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:295:3: ( FINAL | STATIC | TRANSIENT | VOLATILE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set162=(Token)input.LT(1);

            if ( input.LA(1)==FINAL||input.LA(1)==STATIC||input.LA(1)==TRANSIENT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set162)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_modifier"


    public static class staticCtorDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "staticCtorDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:302:1: staticCtorDefinition : ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body -> ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) ;
    public final JVMParser.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        JVMParser.staticCtorDefinition_return retval = new JVMParser.staticCtorDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC164=null;
        Token LBRACE165=null;
        Token RBRACE166=null;
        Token SEMI167=null;
        JVMParser.field_visual_modifier_return field_visual_modifier163 =null;

        JVMParser.methodInfo_return methodInfo168 =null;

        JVMParser.body_return body169 =null;


        Object STATIC164_tree=null;
        Object LBRACE165_tree=null;
        Object RBRACE166_tree=null;
        Object SEMI167_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_field_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_visual_modifier");
        RewriteRuleSubtreeStream stream_methodInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:303:3: ( ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body -> ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:303:5: ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:303:5: ( field_visual_modifier )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0 >= PRIVATE && LA43_0 <= PUBLIC)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:303:5: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition2295);
                    field_visual_modifier163=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_field_visual_modifier.add(field_visual_modifier163.getTree());

                    }
                    break;

            }


            STATIC164=(Token)match(input,STATIC,FOLLOW_STATIC_in_staticCtorDefinition2298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STATIC.add(STATIC164);


            LBRACE165=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_staticCtorDefinition2300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE165);


            RBRACE166=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_staticCtorDefinition2302); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE166);


            SEMI167=(Token)match(input,SEMI,FOLLOW_SEMI_in_staticCtorDefinition2304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI167);


            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition2311);
            methodInfo168=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodInfo.add(methodInfo168.getTree());

            pushFollow(FOLLOW_body_in_staticCtorDefinition2317);
            body169=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body169.getTree());

            // AST REWRITE
            // elements: methodInfo, body, field_visual_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 305:10: -> ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:305:13: ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATICCTORDECL, "STATICCTORDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:305:30: ^( VMODIFIER ( field_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:305:42: ( field_visual_modifier )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                }
                stream_field_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:305:66: ^( UNITHEADER methodInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:305:91: ^( UNITBODY body )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITBODY, "UNITBODY")
                , root_2);

                adaptor.addChild(root_2, stream_body.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "staticCtorDefinition"


    public static class ctorDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctorDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:312:1: ctorDefinition : ( field_visual_modifier )? ( genericDescriptor )? typeName arguments ( throwClause )? SEMI methodInfo body ( afterMethodInfo )? -> ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMParser.ctorDefinition_return ctorDefinition() throws RecognitionException {
        JVMParser.ctorDefinition_return retval = new JVMParser.ctorDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI175=null;
        JVMParser.field_visual_modifier_return field_visual_modifier170 =null;

        JVMParser.genericDescriptor_return genericDescriptor171 =null;

        JVMParser.typeName_return typeName172 =null;

        JVMParser.arguments_return arguments173 =null;

        JVMParser.throwClause_return throwClause174 =null;

        JVMParser.methodInfo_return methodInfo176 =null;

        JVMParser.body_return body177 =null;

        JVMParser.afterMethodInfo_return afterMethodInfo178 =null;


        Object SEMI175_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_throwClause=new RewriteRuleSubtreeStream(adaptor,"rule throwClause");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_genericDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule genericDescriptor");
        RewriteRuleSubtreeStream stream_field_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_visual_modifier");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_afterMethodInfo=new RewriteRuleSubtreeStream(adaptor,"rule afterMethodInfo");
        RewriteRuleSubtreeStream stream_methodInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:313:3: ( ( field_visual_modifier )? ( genericDescriptor )? typeName arguments ( throwClause )? SEMI methodInfo body ( afterMethodInfo )? -> ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:313:5: ( field_visual_modifier )? ( genericDescriptor )? typeName arguments ( throwClause )? SEMI methodInfo body ( afterMethodInfo )?
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:313:5: ( field_visual_modifier )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0 >= PRIVATE && LA44_0 <= PUBLIC)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:313:5: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition2361);
                    field_visual_modifier170=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_field_visual_modifier.add(field_visual_modifier170.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:313:28: ( genericDescriptor )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==LESST) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:313:28: genericDescriptor
                    {
                    pushFollow(FOLLOW_genericDescriptor_in_ctorDefinition2364);
                    genericDescriptor171=genericDescriptor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_genericDescriptor.add(genericDescriptor171.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeName_in_ctorDefinition2367);
            typeName172=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName172.getTree());

            pushFollow(FOLLOW_arguments_in_ctorDefinition2369);
            arguments173=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments173.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:313:66: ( throwClause )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==THROWS) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:313:66: throwClause
                    {
                    pushFollow(FOLLOW_throwClause_in_ctorDefinition2371);
                    throwClause174=throwClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_throwClause.add(throwClause174.getTree());

                    }
                    break;

            }


            SEMI175=(Token)match(input,SEMI,FOLLOW_SEMI_in_ctorDefinition2374); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI175);


            pushFollow(FOLLOW_methodInfo_in_ctorDefinition2381);
            methodInfo176=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodInfo.add(methodInfo176.getTree());

            pushFollow(FOLLOW_body_in_ctorDefinition2387);
            body177=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body177.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:5: ( afterMethodInfo )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==AnnotationDefault||LA47_0==Deprecated||LA47_0==Exceptions||(LA47_0 >= RuntimeInvisibleAnnotations && LA47_0 <= RuntimeVisibleParameterAnnotations)||LA47_0==Signature||LA47_0==Synthetic) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:5: afterMethodInfo
                    {
                    pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition2393);
                    afterMethodInfo178=afterMethodInfo();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_afterMethodInfo.add(afterMethodInfo178.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: throwClause, genericDescriptor, arguments, body, methodInfo, afterMethodInfo, field_visual_modifier, typeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 316:22: -> ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:25: ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CTORDECL, "CTORDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:36: ^( VMODIFIER ( field_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:48: ( field_visual_modifier )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                }
                stream_field_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:72: ^( GENERICDESC ( genericDescriptor )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(GENERICDESC, "GENERICDESC")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:86: ( genericDescriptor )?
                if ( stream_genericDescriptor.hasNext() ) {
                    adaptor.addChild(root_2, stream_genericDescriptor.nextTree());

                }
                stream_genericDescriptor.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:106: ^( UNITNAME typeName )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_2);

                adaptor.addChild(root_2, stream_typeName.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_arguments.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:137: ^( THROWCLAUSE ( throwClause )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(THROWCLAUSE, "THROWCLAUSE")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:151: ( throwClause )?
                if ( stream_throwClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_throwClause.nextTree());

                }
                stream_throwClause.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:317:25: ^( UNITHEADER methodInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:318:25: ^( UNITBODY body )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITBODY, "UNITBODY")
                , root_2);

                adaptor.addChild(root_2, stream_body.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:319:25: ^( UNITATTR ( afterMethodInfo )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITATTR, "UNITATTR")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:319:36: ( afterMethodInfo )?
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

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctorDefinition"


    public static class methodDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:327:1: methodDefinition : ( method_visual_modifier )? ( method_modifier )* ( genericDescriptor )? type keywordAggregate arguments ( throwClauseMethod )? SEMI methodInfo ( body )? ( afterMethodInfo )? -> ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[$keywordAggregate.text] ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMParser.methodDefinition_return methodDefinition() throws RecognitionException {
        JVMParser.methodDefinition_return retval = new JVMParser.methodDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI186=null;
        JVMParser.method_visual_modifier_return method_visual_modifier179 =null;

        JVMParser.method_modifier_return method_modifier180 =null;

        JVMParser.genericDescriptor_return genericDescriptor181 =null;

        JVMParser.type_return type182 =null;

        JVMParser.keywordAggregate_return keywordAggregate183 =null;

        JVMParser.arguments_return arguments184 =null;

        JVMParser.throwClauseMethod_return throwClauseMethod185 =null;

        JVMParser.methodInfo_return methodInfo187 =null;

        JVMParser.body_return body188 =null;

        JVMParser.afterMethodInfo_return afterMethodInfo189 =null;


        Object SEMI186_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_keywordAggregate=new RewriteRuleSubtreeStream(adaptor,"rule keywordAggregate");
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:3: ( ( method_visual_modifier )? ( method_modifier )* ( genericDescriptor )? type keywordAggregate arguments ( throwClauseMethod )? SEMI methodInfo ( body )? ( afterMethodInfo )? -> ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[$keywordAggregate.text] ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:5: ( method_visual_modifier )? ( method_modifier )* ( genericDescriptor )? type keywordAggregate arguments ( throwClauseMethod )? SEMI methodInfo ( body )? ( afterMethodInfo )?
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:5: ( method_visual_modifier )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0 >= PRIVATE && LA48_0 <= PUBLIC)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:5: method_visual_modifier
                    {
                    pushFollow(FOLLOW_method_visual_modifier_in_methodDefinition2562);
                    method_visual_modifier179=method_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_method_visual_modifier.add(method_visual_modifier179.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:29: ( method_modifier )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ABSTRACT||LA49_0==FINAL||LA49_0==NATIVE||LA49_0==STATIC||LA49_0==STRICTFP||LA49_0==SYNCHRONIZED) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:29: method_modifier
            	    {
            	    pushFollow(FOLLOW_method_modifier_in_methodDefinition2565);
            	    method_modifier180=method_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_method_modifier.add(method_modifier180.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:46: ( genericDescriptor )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LESST) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:46: genericDescriptor
                    {
                    pushFollow(FOLLOW_genericDescriptor_in_methodDefinition2568);
                    genericDescriptor181=genericDescriptor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_genericDescriptor.add(genericDescriptor181.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_type_in_methodDefinition2571);
            type182=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type182.getTree());

            pushFollow(FOLLOW_keywordAggregate_in_methodDefinition2573);
            keywordAggregate183=keywordAggregate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keywordAggregate.add(keywordAggregate183.getTree());

            pushFollow(FOLLOW_arguments_in_methodDefinition2575);
            arguments184=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments184.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:97: ( throwClauseMethod )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==THROWS) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:97: throwClauseMethod
                    {
                    pushFollow(FOLLOW_throwClauseMethod_in_methodDefinition2577);
                    throwClauseMethod185=throwClauseMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_throwClauseMethod.add(throwClauseMethod185.getTree());

                    }
                    break;

            }


            SEMI186=(Token)match(input,SEMI,FOLLOW_SEMI_in_methodDefinition2580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI186);


            pushFollow(FOLLOW_methodInfo_in_methodDefinition2587);
            methodInfo187=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodInfo.add(methodInfo187.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:330:5: ( body )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Synthetic) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==BOOLEANLITERAL) ) {
                    int LA52_4 = input.LA(3);

                    if ( (LA52_4==Code) ) {
                        alt52=1;
                    }
                }
            }
            else if ( (LA52_0==Code) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:330:5: body
                    {
                    pushFollow(FOLLOW_body_in_methodDefinition2593);
                    body188=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_body.add(body188.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:5: ( afterMethodInfo )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==AnnotationDefault||LA53_0==Deprecated||LA53_0==Exceptions||(LA53_0 >= RuntimeInvisibleAnnotations && LA53_0 <= RuntimeVisibleParameterAnnotations)||LA53_0==Signature||LA53_0==Synthetic) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:5: afterMethodInfo
                    {
                    pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition2600);
                    afterMethodInfo189=afterMethodInfo();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_afterMethodInfo.add(afterMethodInfo189.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: afterMethodInfo, methodInfo, genericDescriptor, method_modifier, arguments, type, throwClauseMethod, method_visual_modifier, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 331:22: -> ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[$keywordAggregate.text] ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:25: ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME IDENTIFIER[$keywordAggregate.text] ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHODDECL, "METHODDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:38: ^( VMODIFIER ( method_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:50: ( method_visual_modifier )?
                if ( stream_method_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_method_visual_modifier.nextTree());

                }
                stream_method_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:75: ^( MODIFIER ( method_modifier )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:86: ( method_modifier )*
                while ( stream_method_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_method_modifier.nextTree());

                }
                stream_method_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:104: ^( GENERICDESC ( genericDescriptor )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(GENERICDESC, "GENERICDESC")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:118: ( genericDescriptor )?
                if ( stream_genericDescriptor.hasNext() ) {
                    adaptor.addChild(root_2, stream_genericDescriptor.nextTree());

                }
                stream_genericDescriptor.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:138: ^( RETVALUE type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETVALUE, "RETVALUE")
                , root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:155: ^( UNITNAME IDENTIFIER[$keywordAggregate.text] )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_2);

                adaptor.addChild(root_2, 
                (Object)adaptor.create(IDENTIFIER, (keywordAggregate183!=null?input.toString(keywordAggregate183.start,keywordAggregate183.stop):null))
                );

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_arguments.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:212: ^( THROWCLAUSE ( throwClauseMethod )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(THROWCLAUSE, "THROWCLAUSE")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:226: ( throwClauseMethod )?
                if ( stream_throwClauseMethod.hasNext() ) {
                    adaptor.addChild(root_2, stream_throwClauseMethod.nextTree());

                }
                stream_throwClauseMethod.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:332:25: ^( UNITHEADER methodInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:333:25: ^( UNITBODY ( body )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITBODY, "UNITBODY")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:333:36: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_2, stream_body.nextTree());

                }
                stream_body.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:334:25: ^( UNITATTR ( afterMethodInfo )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITATTR, "UNITATTR")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:334:36: ( afterMethodInfo )?
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

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDefinition"


    public static class methodInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:338:1: methodInfo : methodSignatureInfo flags -> ^( STANDINTOKEN methodSignatureInfo flags ) ;
    public final JVMParser.methodInfo_return methodInfo() throws RecognitionException {
        JVMParser.methodInfo_return retval = new JVMParser.methodInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.methodSignatureInfo_return methodSignatureInfo190 =null;

        JVMParser.flags_return flags191 =null;


        RewriteRuleSubtreeStream stream_flags=new RewriteRuleSubtreeStream(adaptor,"rule flags");
        RewriteRuleSubtreeStream stream_methodSignatureInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodSignatureInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:339:3: ( methodSignatureInfo flags -> ^( STANDINTOKEN methodSignatureInfo flags ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:339:5: methodSignatureInfo flags
            {
            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo2780);
            methodSignatureInfo190=methodSignatureInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodSignatureInfo.add(methodSignatureInfo190.getTree());

            pushFollow(FOLLOW_flags_in_methodInfo2782);
            flags191=flags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flags.add(flags191.getTree());

            // AST REWRITE
            // elements: flags, methodSignatureInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 339:31: -> ^( STANDINTOKEN methodSignatureInfo flags )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:339:34: ^( STANDINTOKEN methodSignatureInfo flags )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STANDINTOKEN, "STANDINTOKEN")
                , root_1);

                adaptor.addChild(root_1, stream_methodSignatureInfo.nextTree());

                adaptor.addChild(root_1, stream_flags.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodInfo"


    public static class afterMethodInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "afterMethodInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:342:1: afterMethodInfo : ( afterMethodInfoEntry )+ -> ( afterMethodInfoEntry )+ ;
    public final JVMParser.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        JVMParser.afterMethodInfo_return retval = new JVMParser.afterMethodInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.afterMethodInfoEntry_return afterMethodInfoEntry192 =null;


        RewriteRuleSubtreeStream stream_afterMethodInfoEntry=new RewriteRuleSubtreeStream(adaptor,"rule afterMethodInfoEntry");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:343:3: ( ( afterMethodInfoEntry )+ -> ( afterMethodInfoEntry )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:343:5: ( afterMethodInfoEntry )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:343:5: ( afterMethodInfoEntry )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AnnotationDefault||LA54_0==Deprecated||LA54_0==Exceptions||(LA54_0 >= RuntimeInvisibleAnnotations && LA54_0 <= RuntimeVisibleParameterAnnotations)||LA54_0==Signature||LA54_0==Synthetic) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:343:5: afterMethodInfoEntry
            	    {
            	    pushFollow(FOLLOW_afterMethodInfoEntry_in_afterMethodInfo2807);
            	    afterMethodInfoEntry192=afterMethodInfoEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_afterMethodInfoEntry.add(afterMethodInfoEntry192.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);


            // AST REWRITE
            // elements: afterMethodInfoEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 343:28: -> ( afterMethodInfoEntry )+
            {
                if ( !(stream_afterMethodInfoEntry.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_afterMethodInfoEntry.hasNext() ) {
                    adaptor.addChild(root_0, stream_afterMethodInfoEntry.nextTree());

                }
                stream_afterMethodInfoEntry.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "afterMethodInfo"


    public static class afterMethodInfoEntry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "afterMethodInfoEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:346:1: afterMethodInfoEntry : ( Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations -> runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info -> runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations -> runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations -> runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault );
    public final JVMParser.afterMethodInfoEntry_return afterMethodInfoEntry() throws RecognitionException {
        JVMParser.afterMethodInfoEntry_return retval = new JVMParser.afterMethodInfoEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Deprecated193=null;
        Token BOOLEANLITERAL194=null;
        Token Signature195=null;
        Token CPINDEX196=null;
        Token Exceptions201=null;
        Token Synthetic203=null;
        Token BOOLEANLITERAL204=null;
        JVMParser.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations197 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info198 =null;

        JVMParser.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations199 =null;

        JVMParser.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations200 =null;

        JVMParser.throwClause_return throwClause202 =null;

        JVMParser.annotationDefault_return annotationDefault205 =null;


        Object Deprecated193_tree=null;
        Object BOOLEANLITERAL194_tree=null;
        Object Signature195_tree=null;
        Object CPINDEX196_tree=null;
        Object Exceptions201_tree=null;
        Object Synthetic203_tree=null;
        Object BOOLEANLITERAL204_tree=null;
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_Deprecated=new RewriteRuleTokenStream(adaptor,"token Deprecated");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");
        RewriteRuleTokenStream stream_Exceptions=new RewriteRuleTokenStream(adaptor,"token Exceptions");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleSubtreeStream stream_runtimeVisibleParameterAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_throwClause=new RewriteRuleSubtreeStream(adaptor,"rule throwClause");
        RewriteRuleSubtreeStream stream_runtimeInvisibleAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeInvisibleParameterAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotations_info=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotations_info");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:347:3: ( Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations -> runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info -> runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations -> runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations -> runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault )
            int alt55=9;
            switch ( input.LA(1) ) {
            case Deprecated:
                {
                alt55=1;
                }
                break;
            case Signature:
                {
                alt55=2;
                }
                break;
            case RuntimeInvisibleParameterAnnotations:
                {
                alt55=3;
                }
                break;
            case RuntimeVisibleAnnotations:
                {
                alt55=4;
                }
                break;
            case RuntimeInvisibleAnnotations:
                {
                alt55=5;
                }
                break;
            case RuntimeVisibleParameterAnnotations:
                {
                alt55=6;
                }
                break;
            case Exceptions:
                {
                alt55=7;
                }
                break;
            case Synthetic:
                {
                alt55=8;
                }
                break;
            case AnnotationDefault:
                {
                alt55=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:347:5: Deprecated BOOLEANLITERAL
                    {
                    Deprecated193=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfoEntry2827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Deprecated.add(Deprecated193);


                    BOOLEANLITERAL194=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry2830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL194);


                    // AST REWRITE
                    // elements: BOOLEANLITERAL, Deprecated
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:35: -> ^( Deprecated BOOLEANLITERAL )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:347:38: ^( Deprecated BOOLEANLITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Deprecated.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_BOOLEANLITERAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:348:5: Signature CPINDEX
                    {
                    Signature195=(Token)match(input,Signature,FOLLOW_Signature_in_afterMethodInfoEntry2848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Signature.add(Signature195);


                    CPINDEX196=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfoEntry2850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX196);


                    // AST REWRITE
                    // elements: CPINDEX, Signature
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:41: -> ^( Signature CPINDEX )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:348:44: ^( Signature CPINDEX )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Signature.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CPINDEX.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:349:5: runtimeInvisibleParameterAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfoEntry2882);
                    runtimeInvisibleParameterAnnotations197=runtimeInvisibleParameterAnnotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeInvisibleParameterAnnotations.add(runtimeInvisibleParameterAnnotations197.getTree());

                    // AST REWRITE
                    // elements: runtimeInvisibleParameterAnnotations
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:41: -> runtimeInvisibleParameterAnnotations
                    {
                        adaptor.addChild(root_0, stream_runtimeInvisibleParameterAnnotations.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:350:5: runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfoEntry2891);
                    runtimeVisibleAnnotations_info198=runtimeVisibleAnnotations_info();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotations_info.add(runtimeVisibleAnnotations_info198.getTree());

                    // AST REWRITE
                    // elements: runtimeVisibleAnnotations_info
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 350:36: -> runtimeVisibleAnnotations_info
                    {
                        adaptor.addChild(root_0, stream_runtimeVisibleAnnotations_info.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:351:5: runtimeInvisibleAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfoEntry2901);
                    runtimeInvisibleAnnotations199=runtimeInvisibleAnnotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeInvisibleAnnotations.add(runtimeInvisibleAnnotations199.getTree());

                    // AST REWRITE
                    // elements: runtimeInvisibleAnnotations
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:34: -> runtimeInvisibleAnnotations
                    {
                        adaptor.addChild(root_0, stream_runtimeInvisibleAnnotations.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:352:5: runtimeVisibleParameterAnnotations
                    {
                    pushFollow(FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfoEntry2912);
                    runtimeVisibleParameterAnnotations200=runtimeVisibleParameterAnnotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleParameterAnnotations.add(runtimeVisibleParameterAnnotations200.getTree());

                    // AST REWRITE
                    // elements: runtimeVisibleParameterAnnotations
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 352:40: -> runtimeVisibleParameterAnnotations
                    {
                        adaptor.addChild(root_0, stream_runtimeVisibleParameterAnnotations.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:353:5: Exceptions throwClause
                    {
                    Exceptions201=(Token)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfoEntry2922); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Exceptions.add(Exceptions201);


                    pushFollow(FOLLOW_throwClause_in_afterMethodInfoEntry2925);
                    throwClause202=throwClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_throwClause.add(throwClause202.getTree());

                    // AST REWRITE
                    // elements: throwClause, Exceptions
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:41: -> ^( Exceptions throwClause )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:353:44: ^( Exceptions throwClause )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Exceptions.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_throwClause.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:354:5: Synthetic BOOLEANLITERAL
                    {
                    Synthetic203=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfoEntry2952); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic203);


                    BOOLEANLITERAL204=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry2954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL204);


                    // AST REWRITE
                    // elements: BOOLEANLITERAL, Synthetic
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:41: -> ^( Synthetic BOOLEANLITERAL )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:354:44: ^( Synthetic BOOLEANLITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Synthetic.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_BOOLEANLITERAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:355:5: annotationDefault
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_annotationDefault_in_afterMethodInfoEntry2979);
                    annotationDefault205=annotationDefault();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationDefault205.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "afterMethodInfoEntry"


    public static class annotationDefault_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationDefault"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:358:1: annotationDefault : AnnotationDefault DefaultValue annotationValue -> ^( AnnotationDefault DefaultValue annotationValue ) ;
    public final JVMParser.annotationDefault_return annotationDefault() throws RecognitionException {
        JVMParser.annotationDefault_return retval = new JVMParser.annotationDefault_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AnnotationDefault206=null;
        Token DefaultValue207=null;
        JVMParser.annotationValue_return annotationValue208 =null;


        Object AnnotationDefault206_tree=null;
        Object DefaultValue207_tree=null;
        RewriteRuleTokenStream stream_AnnotationDefault=new RewriteRuleTokenStream(adaptor,"token AnnotationDefault");
        RewriteRuleTokenStream stream_DefaultValue=new RewriteRuleTokenStream(adaptor,"token DefaultValue");
        RewriteRuleSubtreeStream stream_annotationValue=new RewriteRuleSubtreeStream(adaptor,"rule annotationValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:359:3: ( AnnotationDefault DefaultValue annotationValue -> ^( AnnotationDefault DefaultValue annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:359:5: AnnotationDefault DefaultValue annotationValue
            {
            AnnotationDefault206=(Token)match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault2992); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AnnotationDefault.add(AnnotationDefault206);


            DefaultValue207=(Token)match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault2995); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DefaultValue.add(DefaultValue207);


            pushFollow(FOLLOW_annotationValue_in_annotationDefault2997);
            annotationValue208=annotationValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_annotationValue.add(annotationValue208.getTree());

            // AST REWRITE
            // elements: DefaultValue, annotationValue, AnnotationDefault
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 359:53: -> ^( AnnotationDefault DefaultValue annotationValue )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:359:56: ^( AnnotationDefault DefaultValue annotationValue )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_AnnotationDefault.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_DefaultValue.nextNode()
                );

                adaptor.addChild(root_1, stream_annotationValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationDefault"


    public static class methodSignatureInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodSignatureInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:362:1: methodSignatureInfo : Signature LPAREN ( bytecodeType )* RPAREN returnDescriptor -> ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) ;
    public final JVMParser.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        JVMParser.methodSignatureInfo_return retval = new JVMParser.methodSignatureInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature209=null;
        Token LPAREN210=null;
        Token RPAREN212=null;
        JVMParser.bytecodeType_return bytecodeType211 =null;

        JVMParser.returnDescriptor_return returnDescriptor213 =null;


        Object Signature209_tree=null;
        Object LPAREN210_tree=null;
        Object RPAREN212_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleSubtreeStream stream_bytecodeType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeType");
        RewriteRuleSubtreeStream stream_returnDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule returnDescriptor");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:363:3: ( Signature LPAREN ( bytecodeType )* RPAREN returnDescriptor -> ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:363:5: Signature LPAREN ( bytecodeType )* RPAREN returnDescriptor
            {
            Signature209=(Token)match(input,Signature,FOLLOW_Signature_in_methodSignatureInfo3023); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Signature.add(Signature209);


            LPAREN210=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodSignatureInfo3025); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN210);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:363:22: ( bytecodeType )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==BaseType||LA56_0==IDENTIFIER||LA56_0==INTERNALTYPE||LA56_0==LBRACK) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:363:22: bytecodeType
            	    {
            	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo3027);
            	    bytecodeType211=bytecodeType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeType.add(bytecodeType211.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            RPAREN212=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodSignatureInfo3030); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN212);


            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo3032);
            returnDescriptor213=returnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_returnDescriptor.add(returnDescriptor213.getTree());

            // AST REWRITE
            // elements: returnDescriptor, Signature, bytecodeType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 363:61: -> ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:363:64: ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Signature.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:363:76: ^( PARAMDESC ( bytecodeType )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMDESC, "PARAMDESC")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:363:88: ( bytecodeType )*
                while ( stream_bytecodeType.hasNext() ) {
                    adaptor.addChild(root_2, stream_bytecodeType.nextTree());

                }
                stream_bytecodeType.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:363:103: ^( RETDESC returnDescriptor )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETDESC, "RETDESC")
                , root_2);

                adaptor.addChild(root_2, stream_returnDescriptor.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodSignatureInfo"


    public static class returnDescriptor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:366:1: returnDescriptor : ( bytecodeType | VoidType );
    public final JVMParser.returnDescriptor_return returnDescriptor() throws RecognitionException {
        JVMParser.returnDescriptor_return retval = new JVMParser.returnDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VoidType215=null;
        JVMParser.bytecodeType_return bytecodeType214 =null;


        Object VoidType215_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:367:3: ( bytecodeType | VoidType )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==BaseType||LA57_0==IDENTIFIER||LA57_0==INTERNALTYPE||LA57_0==LBRACK) ) {
                alt57=1;
            }
            else if ( (LA57_0==VoidType) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:367:5: bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor3065);
                    bytecodeType214=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType214.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:367:20: VoidType
                    {
                    root_0 = (Object)adaptor.nil();


                    VoidType215=(Token)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor3069); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VoidType215_tree = 
                    (Object)adaptor.create(VoidType215)
                    ;
                    adaptor.addChild(root_0, VoidType215_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnDescriptor"


    public static class method_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:370:1: method_modifier : ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP );
    public final JVMParser.method_modifier_return method_modifier() throws RecognitionException {
        JVMParser.method_modifier_return retval = new JVMParser.method_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set216=null;

        Object set216_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:371:3: ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set216=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL||input.LA(1)==NATIVE||input.LA(1)==STATIC||input.LA(1)==STRICTFP||input.LA(1)==SYNCHRONIZED ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set216)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_modifier"


    public static class method_visual_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:374:1: method_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMParser.method_visual_modifier_return method_visual_modifier() throws RecognitionException {
        JVMParser.method_visual_modifier_return retval = new JVMParser.method_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set217=null;

        Object set217_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:375:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set217=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set217)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_visual_modifier"


    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:378:1: arguments : LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN -> ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) ;
    public final JVMParser.arguments_return arguments() throws RecognitionException {
        JVMParser.arguments_return retval = new JVMParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN218=null;
        Token DOT220=null;
        Token DOT221=null;
        Token DOT222=null;
        Token RPAREN223=null;
        JVMParser.typeList_return typeList219 =null;


        Object LPAREN218_tree=null;
        Object DOT220_tree=null;
        Object DOT221_tree=null;
        Object DOT222_tree=null;
        Object RPAREN223_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:379:3: ( LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN -> ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:379:5: LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN
            {
            LPAREN218=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments3144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN218);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:379:12: ( typeList )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==BOOLEAN||(LA58_0 >= BYTE && LA58_0 <= BaseType)||LA58_0==CHAR||LA58_0==Constant_type||LA58_0==DOUBLE||LA58_0==FLOAT||LA58_0==IDENTIFIER||LA58_0==INT||LA58_0==LONG||LA58_0==QualifiedType||LA58_0==SHORT||LA58_0==VOID||LA58_0==VoidType) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:379:12: typeList
                    {
                    pushFollow(FOLLOW_typeList_in_arguments3146);
                    typeList219=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList219.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:379:22: ( DOT DOT DOT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==DOT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:379:23: DOT DOT DOT
                    {
                    DOT220=(Token)match(input,DOT,FOLLOW_DOT_in_arguments3150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT220);


                    DOT221=(Token)match(input,DOT,FOLLOW_DOT_in_arguments3152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT221);


                    DOT222=(Token)match(input,DOT,FOLLOW_DOT_in_arguments3154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT222);


                    }
                    break;

            }


            RPAREN223=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments3158); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN223);


            // AST REWRITE
            // elements: DOT, typeList, DOT, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 379:44: -> ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:379:47: ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITARGUMENTS, "UNITARGUMENTS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:379:63: ( typeList )?
                if ( stream_typeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeList.nextTree());

                }
                stream_typeList.reset();

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:379:73: ( DOT DOT DOT )?
                if ( stream_DOT.hasNext()||stream_DOT.hasNext()||stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();
                stream_DOT.reset();
                stream_DOT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:386:1: body : ( Synthetic BOOLEANLITERAL )? Code codeBlock ( bodyExtension )* -> ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* ;
    public final JVMParser.body_return body() throws RecognitionException {
        JVMParser.body_return retval = new JVMParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Synthetic224=null;
        Token BOOLEANLITERAL225=null;
        Token Code226=null;
        JVMParser.codeBlock_return codeBlock227 =null;

        JVMParser.bodyExtension_return bodyExtension228 =null;


        Object Synthetic224_tree=null;
        Object BOOLEANLITERAL225_tree=null;
        Object Code226_tree=null;
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");
        RewriteRuleTokenStream stream_Code=new RewriteRuleTokenStream(adaptor,"token Code");
        RewriteRuleSubtreeStream stream_bodyExtension=new RewriteRuleSubtreeStream(adaptor,"rule bodyExtension");
        RewriteRuleSubtreeStream stream_codeBlock=new RewriteRuleSubtreeStream(adaptor,"rule codeBlock");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:387:3: ( ( Synthetic BOOLEANLITERAL )? Code codeBlock ( bodyExtension )* -> ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:388:5: ( Synthetic BOOLEANLITERAL )? Code codeBlock ( bodyExtension )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:388:5: ( Synthetic BOOLEANLITERAL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Synthetic) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:388:6: Synthetic BOOLEANLITERAL
                    {
                    Synthetic224=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_body3203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic224);


                    BOOLEANLITERAL225=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_body3205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL225);


                    }
                    break;

            }


            Code226=(Token)match(input,Code,FOLLOW_Code_in_body3213); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Code.add(Code226);


            pushFollow(FOLLOW_codeBlock_in_body3220);
            codeBlock227=codeBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_codeBlock.add(codeBlock227.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:5: ( bodyExtension )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==ExceptionTable||(LA61_0 >= LineNumberTable && LA61_0 <= LocalVariableTypeTable)||(LA61_0 >= StackMap && LA61_0 <= StackMapTable)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:5: bodyExtension
            	    {
            	    pushFollow(FOLLOW_bodyExtension_in_body3226);
            	    bodyExtension228=bodyExtension();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bodyExtension.add(bodyExtension228.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            // AST REWRITE
            // elements: Code, Synthetic, codeBlock, BOOLEANLITERAL, bodyExtension
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 391:20: -> ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )*
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:23: ( Synthetic BOOLEANLITERAL )?
                if ( stream_Synthetic.hasNext()||stream_BOOLEANLITERAL.hasNext() ) {
                    adaptor.addChild(root_0, 
                    stream_Synthetic.nextNode()
                    );

                    adaptor.addChild(root_0, 
                    stream_BOOLEANLITERAL.nextNode()
                    );

                }
                stream_Synthetic.reset();
                stream_BOOLEANLITERAL.reset();

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:51: ^( Code codeBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Code.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_codeBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:69: ( bodyExtension )*
                while ( stream_bodyExtension.hasNext() ) {
                    adaptor.addChild(root_0, stream_bodyExtension.nextTree());

                }
                stream_bodyExtension.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "body"


    public static class bodyExtension_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bodyExtension"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:394:1: bodyExtension : ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable ( lineNumberTable )? -> ^( LineNumberTable ( lineNumberTable )? ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) ) ;
    public final JVMParser.bodyExtension_return bodyExtension() throws RecognitionException {
        JVMParser.bodyExtension_return retval = new JVMParser.bodyExtension_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ExceptionTable229=null;
        Token LineNumberTable231=null;
        Token LocalVariableTable233=null;
        Token LocalVariableTypeTable235=null;
        Token StackMapTable237=null;
        Token StackMap239=null;
        JVMParser.exceptionTable_return exceptionTable230 =null;

        JVMParser.lineNumberTable_return lineNumberTable232 =null;

        JVMParser.localVariableTable_return localVariableTable234 =null;

        JVMParser.localVariableTable_return localVariableTable236 =null;

        JVMParser.stackMapTable_return stackMapTable238 =null;

        JVMParser.stackMapTypeTable_return stackMapTypeTable240 =null;


        Object ExceptionTable229_tree=null;
        Object LineNumberTable231_tree=null;
        Object LocalVariableTable233_tree=null;
        Object LocalVariableTypeTable235_tree=null;
        Object StackMapTable237_tree=null;
        Object StackMap239_tree=null;
        RewriteRuleTokenStream stream_StackMap=new RewriteRuleTokenStream(adaptor,"token StackMap");
        RewriteRuleTokenStream stream_LocalVariableTypeTable=new RewriteRuleTokenStream(adaptor,"token LocalVariableTypeTable");
        RewriteRuleTokenStream stream_LocalVariableTable=new RewriteRuleTokenStream(adaptor,"token LocalVariableTable");
        RewriteRuleTokenStream stream_LineNumberTable=new RewriteRuleTokenStream(adaptor,"token LineNumberTable");
        RewriteRuleTokenStream stream_ExceptionTable=new RewriteRuleTokenStream(adaptor,"token ExceptionTable");
        RewriteRuleTokenStream stream_StackMapTable=new RewriteRuleTokenStream(adaptor,"token StackMapTable");
        RewriteRuleSubtreeStream stream_stackMapTable=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTable");
        RewriteRuleSubtreeStream stream_exceptionTable=new RewriteRuleSubtreeStream(adaptor,"rule exceptionTable");
        RewriteRuleSubtreeStream stream_stackMapTypeTable=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTypeTable");
        RewriteRuleSubtreeStream stream_localVariableTable=new RewriteRuleSubtreeStream(adaptor,"rule localVariableTable");
        RewriteRuleSubtreeStream stream_lineNumberTable=new RewriteRuleSubtreeStream(adaptor,"rule lineNumberTable");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:395:3: ( ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable ( lineNumberTable )? -> ^( LineNumberTable ( lineNumberTable )? ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:396:3: ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable ( lineNumberTable )? -> ^( LineNumberTable ( lineNumberTable )? ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) )
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:396:3: ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable ( lineNumberTable )? -> ^( LineNumberTable ( lineNumberTable )? ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) )
            int alt63=6;
            switch ( input.LA(1) ) {
            case ExceptionTable:
                {
                alt63=1;
                }
                break;
            case LineNumberTable:
                {
                alt63=2;
                }
                break;
            case LocalVariableTable:
                {
                alt63=3;
                }
                break;
            case LocalVariableTypeTable:
                {
                alt63=4;
                }
                break;
            case StackMapTable:
                {
                alt63=5;
                }
                break;
            case StackMap:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:396:5: ExceptionTable exceptionTable
                    {
                    ExceptionTable229=(Token)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension3264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ExceptionTable.add(ExceptionTable229);


                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension3267);
                    exceptionTable230=exceptionTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exceptionTable.add(exceptionTable230.getTree());

                    // AST REWRITE
                    // elements: ExceptionTable, exceptionTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 396:49: -> ^( ExceptionTable exceptionTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:396:52: ^( ExceptionTable exceptionTable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ExceptionTable.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_exceptionTable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:397:5: LineNumberTable ( lineNumberTable )?
                    {
                    LineNumberTable231=(Token)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension3295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LineNumberTable.add(LineNumberTable231);


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:397:22: ( lineNumberTable )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==IDENTIFIER) ) {
                        int LA62_1 = input.LA(2);

                        if ( (LA62_1==INTLITERAL) ) {
                            alt62=1;
                        }
                    }
                    switch (alt62) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:397:22: lineNumberTable
                            {
                            pushFollow(FOLLOW_lineNumberTable_in_bodyExtension3298);
                            lineNumberTable232=lineNumberTable();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_lineNumberTable.add(lineNumberTable232.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: LineNumberTable, lineNumberTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 397:50: -> ^( LineNumberTable ( lineNumberTable )? )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:397:53: ^( LineNumberTable ( lineNumberTable )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LineNumberTable.nextNode()
                        , root_1);

                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:397:72: ( lineNumberTable )?
                        if ( stream_lineNumberTable.hasNext() ) {
                            adaptor.addChild(root_1, stream_lineNumberTable.nextTree());

                        }
                        stream_lineNumberTable.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:398:5: LocalVariableTable localVariableTable
                    {
                    LocalVariableTable233=(Token)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension3326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LocalVariableTable.add(LocalVariableTable233);


                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension3329);
                    localVariableTable234=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_localVariableTable.add(localVariableTable234.getTree());

                    // AST REWRITE
                    // elements: LocalVariableTable, localVariableTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 398:49: -> ^( LocalVariableTable localVariableTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:398:52: ^( LocalVariableTable localVariableTable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LocalVariableTable.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_localVariableTable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:399:5: LocalVariableTypeTable localVariableTable
                    {
                    LocalVariableTypeTable235=(Token)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension3349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LocalVariableTypeTable.add(LocalVariableTypeTable235);


                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension3352);
                    localVariableTable236=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_localVariableTable.add(localVariableTable236.getTree());

                    // AST REWRITE
                    // elements: localVariableTable, LocalVariableTypeTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 399:49: -> ^( LocalVariableTypeTable localVariableTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:399:52: ^( LocalVariableTypeTable localVariableTable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LocalVariableTypeTable.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_localVariableTable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:400:5: StackMapTable stackMapTable
                    {
                    StackMapTable237=(Token)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension3368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StackMapTable.add(StackMapTable237);


                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension3370);
                    stackMapTable238=stackMapTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stackMapTable.add(stackMapTable238.getTree());

                    // AST REWRITE
                    // elements: StackMapTable, stackMapTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 400:49: -> ^( StackMapTable stackMapTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:400:52: ^( StackMapTable stackMapTable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_StackMapTable.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_stackMapTable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:401:5: StackMap stackMapTypeTable
                    {
                    StackMap239=(Token)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension3400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StackMap.add(StackMap239);


                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension3402);
                    stackMapTypeTable240=stackMapTypeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stackMapTypeTable.add(stackMapTypeTable240.getTree());

                    // AST REWRITE
                    // elements: StackMap, stackMapTypeTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 401:49: -> ^( StackMap stackMapTypeTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:401:52: ^( StackMap stackMapTypeTable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_StackMap.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_stackMapTypeTable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bodyExtension"


    public static class codeBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeBlock"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:405:1: codeBlock : variables ( instructionSet )* codeBlockEnd -> ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) ;
    public final JVMParser.codeBlock_return codeBlock() throws RecognitionException {
        JVMParser.codeBlock_return retval = new JVMParser.codeBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.variables_return variables241 =null;

        JVMParser.instructionSet_return instructionSet242 =null;

        JVMParser.codeBlockEnd_return codeBlockEnd243 =null;


        RewriteRuleSubtreeStream stream_codeBlockEnd=new RewriteRuleSubtreeStream(adaptor,"rule codeBlockEnd");
        RewriteRuleSubtreeStream stream_instructionSet=new RewriteRuleSubtreeStream(adaptor,"rule instructionSet");
        RewriteRuleSubtreeStream stream_variables=new RewriteRuleSubtreeStream(adaptor,"rule variables");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:406:3: ( variables ( instructionSet )* codeBlockEnd -> ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:406:5: variables ( instructionSet )* codeBlockEnd
            {
            pushFollow(FOLLOW_variables_in_codeBlock3444);
            variables241=variables();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variables.add(variables241.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:407:5: ( instructionSet )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==INTLITERAL) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==COLON) ) {
                        int LA64_2 = input.LA(3);

                        if ( (LA64_2==IDENTIFIER) ) {
                            switch ( input.LA(4) ) {
                            case COMMA:
                            case CPINDEX:
                            case LBRACE:
                                {
                                alt64=1;
                                }
                                break;
                            case INTLITERAL:
                                {
                                int LA64_5 = input.LA(5);

                                if ( ((LA64_5 >= COLON && LA64_5 <= COMMA)||LA64_5==INTLITERAL) ) {
                                    alt64=1;
                                }


                                }
                                break;
                            case BOOLEAN:
                                {
                                int LA64_7 = input.LA(5);

                                if ( (LA64_7==COMMA||LA64_7==INTLITERAL) ) {
                                    alt64=1;
                                }


                                }
                                break;
                            case DOUBLE:
                            case FLOAT:
                                {
                                int LA64_8 = input.LA(5);

                                if ( (LA64_8==COMMA||LA64_8==INTLITERAL) ) {
                                    alt64=1;
                                }


                                }
                                break;
                            case BYTE:
                            case CHAR:
                            case INT:
                            case LONG:
                            case SHORT:
                                {
                                int LA64_9 = input.LA(5);

                                if ( (LA64_9==COMMA||LA64_9==INTLITERAL) ) {
                                    alt64=1;
                                }


                                }
                                break;
                            case VOID:
                                {
                                int LA64_10 = input.LA(5);

                                if ( (LA64_10==COMMA||LA64_10==INTLITERAL) ) {
                                    alt64=1;
                                }


                                }
                                break;

                            }

                        }


                    }


                }


                switch (alt64) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:407:5: instructionSet
            	    {
            	    pushFollow(FOLLOW_instructionSet_in_codeBlock3451);
            	    instructionSet242=instructionSet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_instructionSet.add(instructionSet242.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock3458);
            codeBlockEnd243=codeBlockEnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_codeBlockEnd.add(codeBlockEnd243.getTree());

            // AST REWRITE
            // elements: variables, codeBlockEnd, instructionSet
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 408:49: -> ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:408:52: ^( VARINFO variables )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VARINFO, "VARINFO")
                , root_1);

                adaptor.addChild(root_1, stream_variables.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:408:73: ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INSTRUCTION, "INSTRUCTION")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:408:87: ( instructionSet )*
                while ( stream_instructionSet.hasNext() ) {
                    adaptor.addChild(root_1, stream_instructionSet.nextTree());

                }
                stream_instructionSet.reset();

                adaptor.addChild(root_1, stream_codeBlockEnd.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "codeBlock"


    public static class instructionSet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instructionSet"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:411:1: instructionSet : ( codeLine | javaSwitch );
    public final JVMParser.instructionSet_return instructionSet() throws RecognitionException {
        JVMParser.instructionSet_return retval = new JVMParser.instructionSet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.codeLine_return codeLine244 =null;

        JVMParser.javaSwitch_return javaSwitch245 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:412:3: ( codeLine | javaSwitch )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==INTLITERAL) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==COLON) ) {
                    int LA65_2 = input.LA(3);

                    if ( (LA65_2==IDENTIFIER) ) {
                        int LA65_3 = input.LA(4);

                        if ( (LA65_3==LBRACE) ) {
                            alt65=2;
                        }
                        else if ( (LA65_3==BOOLEAN||LA65_3==BYTE||LA65_3==CHAR||LA65_3==COMMA||LA65_3==CPINDEX||LA65_3==DOUBLE||LA65_3==FLOAT||LA65_3==INT||LA65_3==INTLITERAL||LA65_3==LONG||LA65_3==SHORT||LA65_3==VOID) ) {
                            alt65=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:412:5: codeLine
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_codeLine_in_instructionSet3519);
                    codeLine244=codeLine();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, codeLine244.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:412:16: javaSwitch
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_javaSwitch_in_instructionSet3523);
                    javaSwitch245=javaSwitch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaSwitch245.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instructionSet"


    public static class codeLine_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:415:1: codeLine : pc IDENTIFIER ( operand1 )? ( COMMA INTLITERAL )? -> ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) ;
    public final JVMParser.codeLine_return codeLine() throws RecognitionException {
        JVMParser.codeLine_return retval = new JVMParser.codeLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER247=null;
        Token COMMA249=null;
        Token INTLITERAL250=null;
        JVMParser.pc_return pc246 =null;

        JVMParser.operand1_return operand1248 =null;


        Object IDENTIFIER247_tree=null;
        Object COMMA249_tree=null;
        Object INTLITERAL250_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_operand1=new RewriteRuleSubtreeStream(adaptor,"rule operand1");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:3: ( pc IDENTIFIER ( operand1 )? ( COMMA INTLITERAL )? -> ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:5: pc IDENTIFIER ( operand1 )? ( COMMA INTLITERAL )?
            {
            pushFollow(FOLLOW_pc_in_codeLine3536);
            pc246=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc246.getTree());

            IDENTIFIER247=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine3538); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER247);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:19: ( operand1 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==BOOLEAN||LA66_0==BYTE||LA66_0==CHAR||LA66_0==CPINDEX||LA66_0==DOUBLE||LA66_0==FLOAT||LA66_0==INT||LA66_0==LONG||LA66_0==SHORT||LA66_0==VOID) ) {
                alt66=1;
            }
            else if ( (LA66_0==INTLITERAL) ) {
                int LA66_2 = input.LA(2);

                if ( (LA66_2==COMMA||LA66_2==INTLITERAL) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:19: operand1
                    {
                    pushFollow(FOLLOW_operand1_in_codeLine3540);
                    operand1248=operand1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand1.add(operand1248.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:29: ( COMMA INTLITERAL )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==COMMA) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:30: COMMA INTLITERAL
                    {
                    COMMA249=(Token)match(input,COMMA,FOLLOW_COMMA_in_codeLine3544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA249);


                    INTLITERAL250=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeLine3546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL250);


                    }
                    break;

            }


            // AST REWRITE
            // elements: INTLITERAL, operand1, IDENTIFIER, pc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 416:49: -> ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:52: ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:68: ^( OPERAND ( operand1 )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPERAND, "OPERAND")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:78: ( operand1 )?
                if ( stream_operand1.hasNext() ) {
                    adaptor.addChild(root_2, stream_operand1.nextTree());

                }
                stream_operand1.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:89: ^( OPERAND ( INTLITERAL )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPERAND, "OPERAND")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:416:99: ( INTLITERAL )?
                if ( stream_INTLITERAL.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_INTLITERAL.nextNode()
                    );

                }
                stream_INTLITERAL.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "codeLine"


    public static class codeBlockEnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeBlockEnd"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:419:1: codeBlockEnd : pc IDENTIFIER ( INTLITERAL )? -> ^( IDENTIFIER pc ( INTLITERAL )? ) ;
    public final JVMParser.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        JVMParser.codeBlockEnd_return retval = new JVMParser.codeBlockEnd_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER252=null;
        Token INTLITERAL253=null;
        JVMParser.pc_return pc251 =null;


        Object IDENTIFIER252_tree=null;
        Object INTLITERAL253_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:420:3: ( pc IDENTIFIER ( INTLITERAL )? -> ^( IDENTIFIER pc ( INTLITERAL )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:420:5: pc IDENTIFIER ( INTLITERAL )?
            {
            pushFollow(FOLLOW_pc_in_codeBlockEnd3583);
            pc251=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc251.getTree());

            IDENTIFIER252=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd3585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER252);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:420:19: ( INTLITERAL )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==INTLITERAL) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:420:19: INTLITERAL
                    {
                    INTLITERAL253=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeBlockEnd3587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL253);


                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENTIFIER, INTLITERAL, pc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 420:45: -> ^( IDENTIFIER pc ( INTLITERAL )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:420:48: ^( IDENTIFIER pc ( INTLITERAL )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:420:64: ( INTLITERAL )?
                if ( stream_INTLITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_INTLITERAL.nextNode()
                    );

                }
                stream_INTLITERAL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "codeBlockEnd"


    public static class operand1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operand1"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:423:1: operand1 : ( CPINDEX | INTLITERAL | primitiveType );
    public final JVMParser.operand1_return operand1() throws RecognitionException {
        JVMParser.operand1_return retval = new JVMParser.operand1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX254=null;
        Token INTLITERAL255=null;
        JVMParser.primitiveType_return primitiveType256 =null;


        Object CPINDEX254_tree=null;
        Object INTLITERAL255_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:424:3: ( CPINDEX | INTLITERAL | primitiveType )
            int alt69=3;
            switch ( input.LA(1) ) {
            case CPINDEX:
                {
                alt69=1;
                }
                break;
            case INTLITERAL:
                {
                alt69=2;
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
                alt69=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:424:5: CPINDEX
                    {
                    root_0 = (Object)adaptor.nil();


                    CPINDEX254=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_operand13628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CPINDEX254_tree = 
                    (Object)adaptor.create(CPINDEX254)
                    ;
                    adaptor.addChild(root_0, CPINDEX254_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:425:5: INTLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    INTLITERAL255=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_operand13635); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL255_tree = 
                    (Object)adaptor.create(INTLITERAL255)
                    ;
                    adaptor.addChild(root_0, INTLITERAL255_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:426:5: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_operand13641);
                    primitiveType256=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType256.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operand1"


    public static class variables_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variables"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:429:1: variables : variable COMMA variable COMMA variable -> variable variable variable ;
    public final JVMParser.variables_return variables() throws RecognitionException {
        JVMParser.variables_return retval = new JVMParser.variables_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA258=null;
        Token COMMA260=null;
        JVMParser.variable_return variable257 =null;

        JVMParser.variable_return variable259 =null;

        JVMParser.variable_return variable261 =null;


        Object COMMA258_tree=null;
        Object COMMA260_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:430:3: ( variable COMMA variable COMMA variable -> variable variable variable )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:430:5: variable COMMA variable COMMA variable
            {
            pushFollow(FOLLOW_variable_in_variables3654);
            variable257=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable257.getTree());

            COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables3656); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA258);


            pushFollow(FOLLOW_variable_in_variables3658);
            variable259=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable259.getTree());

            COMMA260=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables3660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA260);


            pushFollow(FOLLOW_variable_in_variables3662);
            variable261=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable261.getTree());

            // AST REWRITE
            // elements: variable, variable, variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 430:44: -> variable variable variable
            {
                adaptor.addChild(root_0, stream_variable.nextTree());

                adaptor.addChild(root_0, stream_variable.nextTree());

                adaptor.addChild(root_0, stream_variable.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variables"


    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:433:1: variable : IDENTIFIER ASSIGN INTLITERAL -> ^( ASSIGN IDENTIFIER INTLITERAL ) ;
    public final JVMParser.variable_return variable() throws RecognitionException {
        JVMParser.variable_return retval = new JVMParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER262=null;
        Token ASSIGN263=null;
        Token INTLITERAL264=null;

        Object IDENTIFIER262_tree=null;
        Object ASSIGN263_tree=null;
        Object INTLITERAL264_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:434:3: ( IDENTIFIER ASSIGN INTLITERAL -> ^( ASSIGN IDENTIFIER INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:434:5: IDENTIFIER ASSIGN INTLITERAL
            {
            IDENTIFIER262=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable3683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER262);


            ASSIGN263=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable3685); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN263);


            INTLITERAL264=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable3687); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL264);


            // AST REWRITE
            // elements: INTLITERAL, IDENTIFIER, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 434:44: -> ^( ASSIGN IDENTIFIER INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:434:47: ^( ASSIGN IDENTIFIER INTLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ASSIGN.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class javaSwitch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "javaSwitch"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:437:1: javaSwitch : pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE -> ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) ;
    public final JVMParser.javaSwitch_return javaSwitch() throws RecognitionException {
        JVMParser.javaSwitch_return retval = new JVMParser.javaSwitch_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER266=null;
        Token LBRACE267=null;
        Token RBRACE270=null;
        JVMParser.pc_return pc265 =null;

        JVMParser.switchLine_return switchLine268 =null;

        JVMParser.switchDefaultLine_return switchDefaultLine269 =null;


        Object IDENTIFIER266_tree=null;
        Object LBRACE267_tree=null;
        Object RBRACE270_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_switchDefaultLine=new RewriteRuleSubtreeStream(adaptor,"rule switchDefaultLine");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        RewriteRuleSubtreeStream stream_switchLine=new RewriteRuleSubtreeStream(adaptor,"rule switchLine");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:438:3: ( pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE -> ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:438:5: pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE
            {
            pushFollow(FOLLOW_pc_in_javaSwitch3722);
            pc265=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc265.getTree());

            IDENTIFIER266=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch3724); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER266);


            LBRACE267=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_javaSwitch3730); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE267);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:440:5: ( switchLine )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==INTLITERAL) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:440:5: switchLine
            	    {
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch3737);
            	    switchLine268=switchLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_switchLine.add(switchLine268.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch3744);
            switchDefaultLine269=switchDefaultLine();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchDefaultLine.add(switchDefaultLine269.getTree());

            RBRACE270=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_javaSwitch3750); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE270);


            // AST REWRITE
            // elements: pc, switchDefaultLine, IDENTIFIER, switchLine
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 442:45: -> ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:442:48: ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SWITCH, "SWITCH")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:442:57: ^( IDENTIFIER pc ( switchLine )* switchDefaultLine )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_pc.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:442:73: ( switchLine )*
                while ( stream_switchLine.hasNext() ) {
                    adaptor.addChild(root_2, stream_switchLine.nextTree());

                }
                stream_switchLine.reset();

                adaptor.addChild(root_2, stream_switchDefaultLine.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "javaSwitch"


    public static class switchLine_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:445:1: switchLine : pc INTLITERAL ;
    public final JVMParser.switchLine_return switchLine() throws RecognitionException {
        JVMParser.switchLine_return retval = new JVMParser.switchLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL272=null;
        JVMParser.pc_return pc271 =null;


        Object INTLITERAL272_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:446:3: ( pc INTLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:446:5: pc INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_switchLine3815);
            pc271=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc271.getTree());

            INTLITERAL272=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine3817); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL272_tree = 
            (Object)adaptor.create(INTLITERAL272)
            ;
            adaptor.addChild(root_0, INTLITERAL272_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switchLine"


    public static class switchDefaultLine_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchDefaultLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:449:1: switchDefaultLine : DEFAULT COLON INTLITERAL -> ^( DEFAULT INTLITERAL ) ;
    public final JVMParser.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        JVMParser.switchDefaultLine_return retval = new JVMParser.switchDefaultLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT273=null;
        Token COLON274=null;
        Token INTLITERAL275=null;

        Object DEFAULT273_tree=null;
        Object COLON274_tree=null;
        Object INTLITERAL275_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:450:3: ( DEFAULT COLON INTLITERAL -> ^( DEFAULT INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:450:5: DEFAULT COLON INTLITERAL
            {
            DEFAULT273=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine3831); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT273);


            COLON274=(Token)match(input,COLON,FOLLOW_COLON_in_switchDefaultLine3833); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON274);


            INTLITERAL275=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine3835); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL275);


            // AST REWRITE
            // elements: DEFAULT, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 450:45: -> ^( DEFAULT INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:450:48: ^( DEFAULT INTLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_DEFAULT.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switchDefaultLine"


    public static class throwClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "throwClause"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:457:1: throwClause : THROWS typeList -> ^( THROWS typeList ) ;
    public final JVMParser.throwClause_return throwClause() throws RecognitionException {
        JVMParser.throwClause_return retval = new JVMParser.throwClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token THROWS276=null;
        JVMParser.typeList_return typeList277 =null;


        Object THROWS276_tree=null;
        RewriteRuleTokenStream stream_THROWS=new RewriteRuleTokenStream(adaptor,"token THROWS");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:458:3: ( THROWS typeList -> ^( THROWS typeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:458:5: THROWS typeList
            {
            THROWS276=(Token)match(input,THROWS,FOLLOW_THROWS_in_throwClause3876); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THROWS.add(THROWS276);


            pushFollow(FOLLOW_typeList_in_throwClause3878);
            typeList277=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList277.getTree());

            // AST REWRITE
            // elements: THROWS, typeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 458:41: -> ^( THROWS typeList )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:458:44: ^( THROWS typeList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_THROWS.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_typeList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "throwClause"


    public static class throwClauseMethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "throwClauseMethod"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:461:1: throwClauseMethod : THROWS throwType ( COMMA throwType )* -> ^( THROWS ( throwType )+ ) ;
    public final JVMParser.throwClauseMethod_return throwClauseMethod() throws RecognitionException {
        JVMParser.throwClauseMethod_return retval = new JVMParser.throwClauseMethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token THROWS278=null;
        Token COMMA280=null;
        JVMParser.throwType_return throwType279 =null;

        JVMParser.throwType_return throwType281 =null;


        Object THROWS278_tree=null;
        Object COMMA280_tree=null;
        RewriteRuleTokenStream stream_THROWS=new RewriteRuleTokenStream(adaptor,"token THROWS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_throwType=new RewriteRuleSubtreeStream(adaptor,"rule throwType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:462:3: ( THROWS throwType ( COMMA throwType )* -> ^( THROWS ( throwType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:462:5: THROWS throwType ( COMMA throwType )*
            {
            THROWS278=(Token)match(input,THROWS,FOLLOW_THROWS_in_throwClauseMethod3921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THROWS.add(THROWS278);


            pushFollow(FOLLOW_throwType_in_throwClauseMethod3923);
            throwType279=throwType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_throwType.add(throwType279.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:462:22: ( COMMA throwType )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==COMMA) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:462:23: COMMA throwType
            	    {
            	    COMMA280=(Token)match(input,COMMA,FOLLOW_COMMA_in_throwClauseMethod3926); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA280);


            	    pushFollow(FOLLOW_throwType_in_throwClauseMethod3928);
            	    throwType281=throwType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_throwType.add(throwType281.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            // AST REWRITE
            // elements: THROWS, throwType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 463:45: -> ^( THROWS ( throwType )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:463:48: ^( THROWS ( throwType )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_THROWS.nextNode()
                , root_1);

                if ( !(stream_throwType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_throwType.hasNext() ) {
                    adaptor.addChild(root_1, stream_throwType.nextTree());

                }
                stream_throwType.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "throwClauseMethod"


    public static class throwType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "throwType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:466:1: throwType : ( INTERNALTYPE | IDENTIFIER | QualifiedType );
    public final JVMParser.throwType_return throwType() throws RecognitionException {
        JVMParser.throwType_return retval = new JVMParser.throwType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set282=null;

        Object set282_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:467:3: ( INTERNALTYPE | IDENTIFIER | QualifiedType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set282=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE||input.LA(1)==QualifiedType ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set282)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "throwType"


    public static class exceptionTable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exceptionTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:470:1: exceptionTable : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+ -> ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) ;
    public final JVMParser.exceptionTable_return exceptionTable() throws RecognitionException {
        JVMParser.exceptionTable_return retval = new JVMParser.exceptionTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER283=null;
        Token IDENTIFIER284=null;
        Token IDENTIFIER285=null;
        Token IDENTIFIER286=null;
        JVMParser.exceptionTableEntry_return exceptionTableEntry287 =null;


        Object IDENTIFIER283_tree=null;
        Object IDENTIFIER284_tree=null;
        Object IDENTIFIER285_tree=null;
        Object IDENTIFIER286_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_exceptionTableEntry=new RewriteRuleSubtreeStream(adaptor,"rule exceptionTableEntry");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:471:3: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+ -> ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:471:5: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+
            {
            IDENTIFIER283=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable4019); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER283);


            IDENTIFIER284=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable4021); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER284);


            IDENTIFIER285=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable4023); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER285);


            IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable4025); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER286);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:472:5: ( exceptionTableEntry )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==INTLITERAL) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:472:5: exceptionTableEntry
            	    {
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable4032);
            	    exceptionTableEntry287=exceptionTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exceptionTableEntry.add(exceptionTableEntry287.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER, IDENTIFIER, exceptionTableEntry, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 472:29: -> ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:472:32: ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ETHEADER, "ETHEADER")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:472:88: ^( ETENTRY ( exceptionTableEntry )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ETENTRY, "ETENTRY")
                , root_1);

                if ( !(stream_exceptionTableEntry.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exceptionTableEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_exceptionTableEntry.nextTree());

                }
                stream_exceptionTableEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exceptionTable"


    public static class exceptionTableEntry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exceptionTableEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:475:1: exceptionTableEntry : INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue -> INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue ;
    public final JVMParser.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        JVMParser.exceptionTableEntry_return retval = new JVMParser.exceptionTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL288=null;
        Token INTLITERAL289=null;
        Token INTLITERAL290=null;
        JVMParser.exceptionTableEntryValue_return exceptionTableEntryValue291 =null;


        Object INTLITERAL288_tree=null;
        Object INTLITERAL289_tree=null;
        Object INTLITERAL290_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleSubtreeStream stream_exceptionTableEntryValue=new RewriteRuleSubtreeStream(adaptor,"rule exceptionTableEntryValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:476:3: ( INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue -> INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:476:5: INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
            {
            INTLITERAL288=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry4070); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL288);


            INTLITERAL289=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry4072); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL289);


            INTLITERAL290=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry4074); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL290);


            pushFollow(FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry4076);
            exceptionTableEntryValue291=exceptionTableEntryValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exceptionTableEntryValue.add(exceptionTableEntryValue291.getTree());

            // AST REWRITE
            // elements: exceptionTableEntryValue, INTLITERAL, INTLITERAL, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 477:29: -> INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
            {
                adaptor.addChild(root_0, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, stream_exceptionTableEntryValue.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exceptionTableEntry"


    public static class exceptionTableEntryValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exceptionTableEntryValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:479:1: exceptionTableEntryValue : ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE );
    public final JVMParser.exceptionTableEntryValue_return exceptionTableEntryValue() throws RecognitionException {
        JVMParser.exceptionTableEntryValue_return retval = new JVMParser.exceptionTableEntryValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER293=null;
        Token CONSTANT_TYPE_ASSIGNABLE294=null;
        JVMParser.primitiveType_return primitiveType292 =null;


        Object IDENTIFIER293_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE294_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:480:3: ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
            int alt73=3;
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
                alt73=1;
                }
                break;
            case IDENTIFIER:
                {
                alt73=2;
                }
                break;
            case CONSTANT_TYPE_ASSIGNABLE:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:480:5: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntryValue4126);
                    primitiveType292=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType292.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:481:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER293=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntryValue4132); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER293_tree = 
                    (Object)adaptor.create(IDENTIFIER293)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER293_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:482:5: CONSTANT_TYPE_ASSIGNABLE
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT_TYPE_ASSIGNABLE294=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue4138); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT_TYPE_ASSIGNABLE294_tree = 
                    (Object)adaptor.create(CONSTANT_TYPE_ASSIGNABLE294)
                    ;
                    adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE294_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exceptionTableEntryValue"


    public static class lineNumberTable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lineNumberTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:489:1: lineNumberTable : ( lineNumberTableLine )+ ;
    public final JVMParser.lineNumberTable_return lineNumberTable() throws RecognitionException {
        JVMParser.lineNumberTable_return retval = new JVMParser.lineNumberTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.lineNumberTableLine_return lineNumberTableLine295 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:490:3: ( ( lineNumberTableLine )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:490:5: ( lineNumberTableLine )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:490:5: ( lineNumberTableLine )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==IDENTIFIER) ) {
                    int LA74_2 = input.LA(2);

                    if ( (LA74_2==INTLITERAL) ) {
                        alt74=1;
                    }


                }


                switch (alt74) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:490:5: lineNumberTableLine
            	    {
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable4157);
            	    lineNumberTableLine295=lineNumberTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lineNumberTableLine295.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lineNumberTable"


    public static class lineNumberTableLine_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lineNumberTableLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:493:1: lineNumberTableLine : IDENTIFIER pc INTLITERAL -> ^( IDENTIFIER pc INTLITERAL ) ;
    public final JVMParser.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        JVMParser.lineNumberTableLine_return retval = new JVMParser.lineNumberTableLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER296=null;
        Token INTLITERAL298=null;
        JVMParser.pc_return pc297 =null;


        Object IDENTIFIER296_tree=null;
        Object INTLITERAL298_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:494:3: ( IDENTIFIER pc INTLITERAL -> ^( IDENTIFIER pc INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:494:5: IDENTIFIER pc INTLITERAL
            {
            IDENTIFIER296=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine4171); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER296);


            pushFollow(FOLLOW_pc_in_lineNumberTableLine4173);
            pc297=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc297.getTree());

            INTLITERAL298=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine4175); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL298);


            // AST REWRITE
            // elements: IDENTIFIER, pc, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 494:30: -> ^( IDENTIFIER pc INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:494:33: ^( IDENTIFIER pc INTLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lineNumberTableLine"


    public static class localVariableTable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:501:1: localVariableTable : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )* -> ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) ;
    public final JVMParser.localVariableTable_return localVariableTable() throws RecognitionException {
        JVMParser.localVariableTable_return retval = new JVMParser.localVariableTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER299=null;
        Token IDENTIFIER300=null;
        Token IDENTIFIER301=null;
        Token IDENTIFIER302=null;
        Token IDENTIFIER303=null;
        JVMParser.localVariableTableLine_return localVariableTableLine304 =null;


        Object IDENTIFIER299_tree=null;
        Object IDENTIFIER300_tree=null;
        Object IDENTIFIER301_tree=null;
        Object IDENTIFIER302_tree=null;
        Object IDENTIFIER303_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_localVariableTableLine=new RewriteRuleSubtreeStream(adaptor,"rule localVariableTableLine");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:502:3: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )* -> ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:502:5: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )*
            {
            IDENTIFIER299=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4206); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER299);


            IDENTIFIER300=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER300);


            IDENTIFIER301=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER301);


            IDENTIFIER302=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4212); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER302);


            IDENTIFIER303=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER303);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:503:5: ( localVariableTableLine )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==INTLITERAL) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:503:5: localVariableTableLine
            	    {
            	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable4221);
            	    localVariableTableLine304=localVariableTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_localVariableTableLine.add(localVariableTableLine304.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            // AST REWRITE
            // elements: localVariableTableLine, IDENTIFIER, IDENTIFIER, IDENTIFIER, IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 503:39: -> ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:503:42: ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LVHEADER, "LVHEADER")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:503:109: ^( LVENTRY ( localVariableTableLine )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LVENTRY, "LVENTRY")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:503:119: ( localVariableTableLine )*
                while ( stream_localVariableTableLine.hasNext() ) {
                    adaptor.addChild(root_1, stream_localVariableTableLine.nextTree());

                }
                stream_localVariableTableLine.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableTable"


    public static class localVariableTableLine_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableTableLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:506:1: localVariableTableLine : INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType ;
    public final JVMParser.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        JVMParser.localVariableTableLine_return retval = new JVMParser.localVariableTableLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL305=null;
        Token INTLITERAL306=null;
        Token INTLITERAL307=null;
        JVMParser.localVariableTableLineIdentifier_return localVariableTableLineIdentifier308 =null;

        JVMParser.bytecodeType_return bytecodeType309 =null;


        Object INTLITERAL305_tree=null;
        Object INTLITERAL306_tree=null;
        Object INTLITERAL307_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:507:3: ( INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:507:5: INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL305=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine4270); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL305_tree = 
            (Object)adaptor.create(INTLITERAL305)
            ;
            adaptor.addChild(root_0, INTLITERAL305_tree);
            }

            INTLITERAL306=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine4272); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL306_tree = 
            (Object)adaptor.create(INTLITERAL306)
            ;
            adaptor.addChild(root_0, INTLITERAL306_tree);
            }

            INTLITERAL307=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine4274); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL307_tree = 
            (Object)adaptor.create(INTLITERAL307)
            ;
            adaptor.addChild(root_0, INTLITERAL307_tree);
            }

            pushFollow(FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine4276);
            localVariableTableLineIdentifier308=localVariableTableLineIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableTableLineIdentifier308.getTree());

            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine4278);
            bytecodeType309=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType309.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableTableLine"


    public static class localVariableTableLineIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableTableLineIdentifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:510:1: localVariableTableLineIdentifier : (id1= keywordAggregate -> IDENTIFIER[$id1.text] |id2= STATIC -> IDENTIFIER[$id2] ) ;
    public final JVMParser.localVariableTableLineIdentifier_return localVariableTableLineIdentifier() throws RecognitionException {
        JVMParser.localVariableTableLineIdentifier_return retval = new JVMParser.localVariableTableLineIdentifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id2=null;
        JVMParser.keywordAggregate_return id1 =null;


        Object id2_tree=null;
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleSubtreeStream stream_keywordAggregate=new RewriteRuleSubtreeStream(adaptor,"rule keywordAggregate");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:511:3: ( (id1= keywordAggregate -> IDENTIFIER[$id1.text] |id2= STATIC -> IDENTIFIER[$id2] ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:512:3: (id1= keywordAggregate -> IDENTIFIER[$id1.text] |id2= STATIC -> IDENTIFIER[$id2] )
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:512:3: (id1= keywordAggregate -> IDENTIFIER[$id1.text] |id2= STATIC -> IDENTIFIER[$id2] )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==BOOLEAN||(LA76_0 >= BYTE && LA76_0 <= BaseType)||LA76_0==CHAR||LA76_0==CLASS||LA76_0==Constant_type||LA76_0==DEFAULT||LA76_0==DOUBLE||LA76_0==EXTENDS||LA76_0==FLOAT||(LA76_0 >= IDENTIFIER && LA76_0 <= IMPLEMENTS)||LA76_0==INT||LA76_0==LONG||LA76_0==NATIVE||LA76_0==SHORT||LA76_0==SUPER||LA76_0==THROWS||LA76_0==VOID||LA76_0==VoidType) ) {
                alt76=1;
            }
            else if ( (LA76_0==STATIC) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:512:5: id1= keywordAggregate
                    {
                    pushFollow(FOLLOW_keywordAggregate_in_localVariableTableLineIdentifier4298);
                    id1=keywordAggregate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keywordAggregate.add(id1.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 512:27: -> IDENTIFIER[$id1.text]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, (id1!=null?input.toString(id1.start,id1.stop):null))
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:513:5: id2= STATIC
                    {
                    id2=(Token)match(input,STATIC,FOLLOW_STATIC_in_localVariableTableLineIdentifier4312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STATIC.add(id2);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 513:27: -> IDENTIFIER[$id2]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, id2)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableTableLineIdentifier"


    public static class stackMapTypeTable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTypeTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:521:1: stackMapTypeTable : IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+ -> ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) ;
    public final JVMParser.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        JVMParser.stackMapTypeTable_return retval = new JVMParser.stackMapTypeTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER310=null;
        Token ASSIGN311=null;
        Token INTLITERAL312=null;
        JVMParser.stackMapTypeTableEntry_return stackMapTypeTableEntry313 =null;


        Object IDENTIFIER310_tree=null;
        Object ASSIGN311_tree=null;
        Object INTLITERAL312_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_stackMapTypeTableEntry=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTypeTableEntry");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:522:3: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+ -> ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:522:5: IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+
            {
            IDENTIFIER310=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable4351); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER310);


            ASSIGN311=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable4353); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN311);


            INTLITERAL312=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable4355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL312);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:523:5: ( stackMapTypeTableEntry )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==IDENTIFIER) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==ASSIGN) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:523:5: stackMapTypeTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable4362);
            	    stackMapTypeTableEntry313=stackMapTypeTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTypeTableEntry.add(stackMapTypeTableEntry313.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER, stackMapTypeTableEntry, INTLITERAL, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 523:41: -> ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:523:45: ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SMTHEADER, "SMTHEADER")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ASSIGN.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:523:87: ^( SMTENTRY ( stackMapTypeTableEntry )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SMTENTRY, "SMTENTRY")
                , root_1);

                if ( !(stream_stackMapTypeTableEntry.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stackMapTypeTableEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_stackMapTypeTableEntry.nextTree());

                }
                stream_stackMapTypeTableEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTypeTable"


    public static class stackMapTypeTableEntry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTypeTableEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:526:1: stackMapTypeTableEntry : IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer ;
    public final JVMParser.stackMapTypeTableEntry_return stackMapTypeTableEntry() throws RecognitionException {
        JVMParser.stackMapTypeTableEntry_return retval = new JVMParser.stackMapTypeTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER314=null;
        Token ASSIGN315=null;
        Token INTLITERAL316=null;
        Token IDENTIFIER317=null;
        Token ASSIGN318=null;
        Token INTLITERAL319=null;
        Token IDENTIFIER320=null;
        Token ASSIGN321=null;
        Token IDENTIFIER323=null;
        Token ASSIGN324=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer322 =null;

        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer325 =null;


        Object IDENTIFIER314_tree=null;
        Object ASSIGN315_tree=null;
        Object INTLITERAL316_tree=null;
        Object IDENTIFIER317_tree=null;
        Object ASSIGN318_tree=null;
        Object INTLITERAL319_tree=null;
        Object IDENTIFIER320_tree=null;
        Object ASSIGN321_tree=null;
        Object IDENTIFIER323_tree=null;
        Object ASSIGN324_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:527:3: ( IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:527:5: IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER314=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4408); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER314_tree = 
            (Object)adaptor.create(IDENTIFIER314)
            ;
            adaptor.addChild(root_0, IDENTIFIER314_tree);
            }

            ASSIGN315=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4410); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN315_tree = 
            (Object)adaptor.create(ASSIGN315)
            ;
            adaptor.addChild(root_0, ASSIGN315_tree);
            }

            INTLITERAL316=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4412); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL316_tree = 
            (Object)adaptor.create(INTLITERAL316)
            ;
            adaptor.addChild(root_0, INTLITERAL316_tree);
            }

            IDENTIFIER317=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4414); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER317_tree = 
            (Object)adaptor.create(IDENTIFIER317)
            ;
            adaptor.addChild(root_0, IDENTIFIER317_tree);
            }

            ASSIGN318=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4416); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN318_tree = 
            (Object)adaptor.create(ASSIGN318)
            ;
            adaptor.addChild(root_0, ASSIGN318_tree);
            }

            INTLITERAL319=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL319_tree = 
            (Object)adaptor.create(INTLITERAL319)
            ;
            adaptor.addChild(root_0, INTLITERAL319_tree);
            }

            IDENTIFIER320=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4425); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER320_tree = 
            (Object)adaptor.create(IDENTIFIER320)
            ;
            adaptor.addChild(root_0, IDENTIFIER320_tree);
            }

            ASSIGN321=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN321_tree = 
            (Object)adaptor.create(ASSIGN321)
            ;
            adaptor.addChild(root_0, ASSIGN321_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4429);
            stackMapTableTypesContainer322=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer322.getTree());

            IDENTIFIER323=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4436); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER323_tree = 
            (Object)adaptor.create(IDENTIFIER323)
            ;
            adaptor.addChild(root_0, IDENTIFIER323_tree);
            }

            ASSIGN324=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4438); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN324_tree = 
            (Object)adaptor.create(ASSIGN324)
            ;
            adaptor.addChild(root_0, ASSIGN324_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4440);
            stackMapTableTypesContainer325=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer325.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTypeTableEntry"


    public static class stackMapTable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:536:1: stackMapTable : IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+ -> ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) ;
    public final JVMParser.stackMapTable_return stackMapTable() throws RecognitionException {
        JVMParser.stackMapTable_return retval = new JVMParser.stackMapTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER326=null;
        Token ASSIGN327=null;
        Token INTLITERAL328=null;
        JVMParser.stackMapTableEntry_return stackMapTableEntry329 =null;


        Object IDENTIFIER326_tree=null;
        Object ASSIGN327_tree=null;
        Object INTLITERAL328_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_stackMapTableEntry=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableEntry");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:537:3: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+ -> ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:537:5: IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+
            {
            IDENTIFIER326=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable4458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER326);


            ASSIGN327=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable4460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN327);


            INTLITERAL328=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable4462); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL328);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:538:5: ( stackMapTableEntry )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==IDENTIFIER) ) {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==ASSIGN) ) {
                        alt78=1;
                    }


                }


                switch (alt78) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:538:5: stackMapTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable4469);
            	    stackMapTableEntry329=stackMapTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTableEntry.add(stackMapTableEntry329.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt78 >= 1 ) break loop78;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER, stackMapTableEntry, ASSIGN, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 538:49: -> ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:538:52: ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SMHEADER, "SMHEADER")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ASSIGN.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:538:93: ^( SMENTRY ( stackMapTableEntry )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SMENTRY, "SMENTRY")
                , root_1);

                if ( !(stream_stackMapTableEntry.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stackMapTableEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_stackMapTableEntry.nextTree());

                }
                stream_stackMapTableEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTable"


    public static class stackMapTableEntry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:540:1: stackMapTableEntry : IDENTIFIER ASSIGN stackMapTableEntryValue -> ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) ;
    public final JVMParser.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        JVMParser.stackMapTableEntry_return retval = new JVMParser.stackMapTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER330=null;
        Token ASSIGN331=null;
        JVMParser.stackMapTableEntryValue_return stackMapTableEntryValue332 =null;


        Object IDENTIFIER330_tree=null;
        Object ASSIGN331_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_stackMapTableEntryValue=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableEntryValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:541:3: ( IDENTIFIER ASSIGN stackMapTableEntryValue -> ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:541:5: IDENTIFIER ASSIGN stackMapTableEntryValue
            {
            IDENTIFIER330=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry4525); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER330);


            ASSIGN331=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry4527); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN331);


            pushFollow(FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry4529);
            stackMapTableEntryValue332=stackMapTableEntryValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stackMapTableEntryValue.add(stackMapTableEntryValue332.getTree());

            // AST REWRITE
            // elements: stackMapTableEntryValue, IDENTIFIER, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 541:49: -> ^( ASSIGN IDENTIFIER stackMapTableEntryValue )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:541:52: ^( ASSIGN IDENTIFIER stackMapTableEntryValue )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ASSIGN.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, stream_stackMapTableEntryValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableEntry"


    public static class stackMapTableEntryValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableEntryValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:543:1: stackMapTableEntryValue : ( INTLITERAL | stackMapTableTypesContainer );
    public final JVMParser.stackMapTableEntryValue_return stackMapTableEntryValue() throws RecognitionException {
        JVMParser.stackMapTableEntryValue_return retval = new JVMParser.stackMapTableEntryValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL333=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer334 =null;


        Object INTLITERAL333_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:544:3: ( INTLITERAL | stackMapTableTypesContainer )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==INTLITERAL) ) {
                alt79=1;
            }
            else if ( (LA79_0==LBRACK) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:544:5: INTLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    INTLITERAL333=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntryValue4553); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL333_tree = 
                    (Object)adaptor.create(INTLITERAL333)
                    ;
                    adaptor.addChild(root_0, INTLITERAL333_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:544:18: stackMapTableTypesContainer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue4557);
                    stackMapTableTypesContainer334=stackMapTableTypesContainer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer334.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableEntryValue"


    public static class stackMapTableTypesContainer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypesContainer"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:547:1: stackMapTableTypesContainer : LBRACK stackMapTableTypes RBRACK -> stackMapTableTypes ;
    public final JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        JVMParser.stackMapTableTypesContainer_return retval = new JVMParser.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK335=null;
        Token RBRACK337=null;
        JVMParser.stackMapTableTypes_return stackMapTableTypes336 =null;


        Object LBRACK335_tree=null;
        Object RBRACK337_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_stackMapTableTypes=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableTypes");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:548:3: ( LBRACK stackMapTableTypes RBRACK -> stackMapTableTypes )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:548:5: LBRACK stackMapTableTypes RBRACK
            {
            LBRACK335=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_stackMapTableTypesContainer4570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK335);


            pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer4572);
            stackMapTableTypes336=stackMapTableTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stackMapTableTypes.add(stackMapTableTypes336.getTree());

            RBRACK337=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_stackMapTableTypesContainer4574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK337);


            // AST REWRITE
            // elements: stackMapTableTypes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 548:51: -> stackMapTableTypes
            {
                adaptor.addChild(root_0, stream_stackMapTableTypes.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableTypesContainer"


    public static class stackMapTableTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypes"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:551:1: stackMapTableTypes : ( stackMapTableType )? ( COMMA stackMapTableType )* -> ^( SMTTYPES ( stackMapTableType )* ) ;
    public final JVMParser.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        JVMParser.stackMapTableTypes_return retval = new JVMParser.stackMapTableTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA339=null;
        JVMParser.stackMapTableType_return stackMapTableType338 =null;

        JVMParser.stackMapTableType_return stackMapTableType340 =null;


        Object COMMA339_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_stackMapTableType=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:552:3: ( ( stackMapTableType )? ( COMMA stackMapTableType )* -> ^( SMTTYPES ( stackMapTableType )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:552:5: ( stackMapTableType )? ( COMMA stackMapTableType )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:552:5: ( stackMapTableType )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==BOOLEAN||LA80_0==BYTE||LA80_0==CHAR||LA80_0==CLASS||LA80_0==DOUBLE||LA80_0==FLOAT||LA80_0==IDENTIFIER||LA80_0==INT||LA80_0==LONG||LA80_0==SHORT||LA80_0==VOID) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:552:5: stackMapTableType
                    {
                    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes4606);
                    stackMapTableType338=stackMapTableType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType338.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:552:24: ( COMMA stackMapTableType )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:552:25: COMMA stackMapTableType
            	    {
            	    COMMA339=(Token)match(input,COMMA,FOLLOW_COMMA_in_stackMapTableTypes4610); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA339);


            	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes4612);
            	    stackMapTableType340=stackMapTableType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType340.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            // AST REWRITE
            // elements: stackMapTableType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 552:51: -> ^( SMTTYPES ( stackMapTableType )* )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:552:54: ^( SMTTYPES ( stackMapTableType )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SMTTYPES, "SMTTYPES")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:552:65: ( stackMapTableType )*
                while ( stream_stackMapTableType.hasNext() ) {
                    adaptor.addChild(root_1, stream_stackMapTableType.nextTree());

                }
                stream_stackMapTableType.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableTypes"


    public static class stackMapTableType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:555:1: stackMapTableType : ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? ) ;
    public final JVMParser.stackMapTableType_return stackMapTableType() throws RecognitionException {
        JVMParser.stackMapTableType_return retval = new JVMParser.stackMapTableType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER344=null;
        Token INTLITERAL345=null;
        JVMParser.stackMapTableTypeObject_return stackMapTableTypeObject341 =null;

        JVMParser.stackMapTableTypePlainObject_return stackMapTableTypePlainObject342 =null;

        JVMParser.primitiveType_return primitiveType343 =null;


        Object IDENTIFIER344_tree=null;
        Object INTLITERAL345_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:556:3: ( ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:556:5: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:556:5: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
            int alt83=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==STRINGLITERAL) ) {
                    alt83=1;
                }
                else if ( (LA83_1==IDENTIFIER||LA83_1==INTERNALTYPE) ) {
                    alt83=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

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
                alt83=3;
                }
                break;
            case IDENTIFIER:
                {
                alt83=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }

            switch (alt83) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:556:6: stackMapTableTypeObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType4637);
                    stackMapTableTypeObject341=stackMapTableTypeObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypeObject341.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:556:30: stackMapTableTypePlainObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType4639);
                    stackMapTableTypePlainObject342=stackMapTableTypePlainObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypePlainObject342.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:556:59: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType4641);
                    primitiveType343=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType343.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:556:73: IDENTIFIER ( INTLITERAL )?
                    {
                    IDENTIFIER344=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableType4643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER344_tree = 
                    (Object)adaptor.create(IDENTIFIER344)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER344_tree);
                    }

                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:556:84: ( INTLITERAL )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==INTLITERAL) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:556:84: INTLITERAL
                            {
                            INTLITERAL345=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableType4645); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INTLITERAL345_tree = 
                            (Object)adaptor.create(INTLITERAL345)
                            ;
                            adaptor.addChild(root_0, INTLITERAL345_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableType"


    public static class stackMapTableTypePlainObject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypePlainObject"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:558:1: stackMapTableTypePlainObject : CLASS ( INTERNALTYPE -> CLASS INTERNALTYPE |id= IDENTIFIER -> CLASS INTERNALTYPE[$id] ) ;
    public final JVMParser.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        JVMParser.stackMapTableTypePlainObject_return retval = new JVMParser.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token CLASS346=null;
        Token INTERNALTYPE347=null;

        Object id_tree=null;
        Object CLASS346_tree=null;
        Object INTERNALTYPE347_tree=null;
        RewriteRuleTokenStream stream_INTERNALTYPE=new RewriteRuleTokenStream(adaptor,"token INTERNALTYPE");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:559:3: ( CLASS ( INTERNALTYPE -> CLASS INTERNALTYPE |id= IDENTIFIER -> CLASS INTERNALTYPE[$id] ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:559:5: CLASS ( INTERNALTYPE -> CLASS INTERNALTYPE |id= IDENTIFIER -> CLASS INTERNALTYPE[$id] )
            {
            CLASS346=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject4659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS346);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:560:3: ( INTERNALTYPE -> CLASS INTERNALTYPE |id= IDENTIFIER -> CLASS INTERNALTYPE[$id] )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==INTERNALTYPE) ) {
                alt84=1;
            }
            else if ( (LA84_0==IDENTIFIER) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:560:4: INTERNALTYPE
                    {
                    INTERNALTYPE347=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject4665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTERNALTYPE.add(INTERNALTYPE347);


                    // AST REWRITE
                    // elements: CLASS, INTERNALTYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 560:21: -> CLASS INTERNALTYPE
                    {
                        adaptor.addChild(root_0, 
                        stream_CLASS.nextNode()
                        );

                        adaptor.addChild(root_0, 
                        stream_INTERNALTYPE.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:561:5: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableTypePlainObject4683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);


                    // AST REWRITE
                    // elements: CLASS, INTERNALTYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 561:21: -> CLASS INTERNALTYPE[$id]
                    {
                        adaptor.addChild(root_0, 
                        stream_CLASS.nextNode()
                        );

                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INTERNALTYPE, id)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableTypePlainObject"


    public static class stackMapTableTypeObject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypeObject"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:564:1: stackMapTableTypeObject : CLASS STRINGLITERAL ;
    public final JVMParser.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        JVMParser.stackMapTableTypeObject_return retval = new JVMParser.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS348=null;
        Token STRINGLITERAL349=null;

        Object CLASS348_tree=null;
        Object STRINGLITERAL349_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:565:3: ( CLASS STRINGLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:565:5: CLASS STRINGLITERAL
            {
            root_0 = (Object)adaptor.nil();


            CLASS348=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject4708); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS348_tree = 
            (Object)adaptor.create(CLASS348)
            ;
            adaptor.addChild(root_0, CLASS348_tree);
            }

            STRINGLITERAL349=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject4710); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLITERAL349_tree = 
            (Object)adaptor.create(STRINGLITERAL349)
            ;
            adaptor.addChild(root_0, STRINGLITERAL349_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stackMapTableTypeObject"


    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:575:1: typeList : type ( COMMA type )* -> ( type )+ ;
    public final JVMParser.typeList_return typeList() throws RecognitionException {
        JVMParser.typeList_return retval = new JVMParser.typeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA351=null;
        JVMParser.type_return type350 =null;

        JVMParser.type_return type352 =null;


        Object COMMA351_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:576:3: ( type ( COMMA type )* -> ( type )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:576:5: type ( COMMA type )*
            {
            pushFollow(FOLLOW_type_in_typeList4730);
            type350=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type350.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:576:10: ( COMMA type )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==COMMA) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:576:11: COMMA type
            	    {
            	    COMMA351=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList4733); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA351);


            	    pushFollow(FOLLOW_type_in_typeList4735);
            	    type352=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type352.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            // AST REWRITE
            // elements: type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 576:49: -> ( type )+
            {
                if ( !(stream_type.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_type.hasNext() ) {
                    adaptor.addChild(root_0, stream_type.nextTree());

                }
                stream_type.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeList"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:578:1: type : combinedJavaType ( LBRACK RBRACK )* -> combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) ;
    public final JVMParser.type_return type() throws RecognitionException {
        JVMParser.type_return retval = new JVMParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK354=null;
        Token RBRACK355=null;
        JVMParser.combinedJavaType_return combinedJavaType353 =null;


        Object LBRACK354_tree=null;
        Object RBRACK355_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_combinedJavaType=new RewriteRuleSubtreeStream(adaptor,"rule combinedJavaType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:579:3: ( combinedJavaType ( LBRACK RBRACK )* -> combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:579:5: combinedJavaType ( LBRACK RBRACK )*
            {
            pushFollow(FOLLOW_combinedJavaType_in_type4779);
            combinedJavaType353=combinedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_combinedJavaType.add(combinedJavaType353.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:579:22: ( LBRACK RBRACK )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==LBRACK) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:579:23: LBRACK RBRACK
            	    {
            	    LBRACK354=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_type4782); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK354);


            	    RBRACK355=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_type4784); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK355);


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            // AST REWRITE
            // elements: LBRACK, RBRACK, combinedJavaType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 579:49: -> combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* )
            {
                adaptor.addChild(root_0, stream_combinedJavaType.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:579:69: ^( ARRAYBRACKS ( LBRACK RBRACK )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARRAYBRACKS, "ARRAYBRACKS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:579:83: ( LBRACK RBRACK )*
                while ( stream_LBRACK.hasNext()||stream_RBRACK.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_LBRACK.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_RBRACK.nextNode()
                    );

                }
                stream_LBRACK.reset();
                stream_RBRACK.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class combinedJavaType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "combinedJavaType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:581:1: combinedJavaType : ( primitiveType | referenceType ) ;
    public final JVMParser.combinedJavaType_return combinedJavaType() throws RecognitionException {
        JVMParser.combinedJavaType_return retval = new JVMParser.combinedJavaType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.primitiveType_return primitiveType356 =null;

        JVMParser.referenceType_return referenceType357 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:582:3: ( ( primitiveType | referenceType ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:582:5: ( primitiveType | referenceType )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:582:5: ( primitiveType | referenceType )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==BOOLEAN||LA87_0==BYTE||LA87_0==CHAR||LA87_0==DOUBLE||LA87_0==FLOAT||LA87_0==INT||LA87_0==LONG||LA87_0==SHORT||LA87_0==VOID) ) {
                alt87=1;
            }
            else if ( (LA87_0==BaseType||LA87_0==Constant_type||LA87_0==IDENTIFIER||LA87_0==QualifiedType||LA87_0==VoidType) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:582:6: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_combinedJavaType4824);
                    primitiveType356=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType356.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:583:5: referenceType
                    {
                    pushFollow(FOLLOW_referenceType_in_combinedJavaType4830);
                    referenceType357=referenceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, referenceType357.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "combinedJavaType"


    public static class referenceType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "referenceType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:585:1: referenceType : typeDeclSpecifier ( DOT typeDeclSpecifier )* -> ^( UNITNAME ( typeDeclSpecifier )+ ) ;
    public final JVMParser.referenceType_return referenceType() throws RecognitionException {
        JVMParser.referenceType_return retval = new JVMParser.referenceType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT359=null;
        JVMParser.typeDeclSpecifier_return typeDeclSpecifier358 =null;

        JVMParser.typeDeclSpecifier_return typeDeclSpecifier360 =null;


        Object DOT359_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_typeDeclSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclSpecifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:586:3: ( typeDeclSpecifier ( DOT typeDeclSpecifier )* -> ^( UNITNAME ( typeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:586:5: typeDeclSpecifier ( DOT typeDeclSpecifier )*
            {
            pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType4843);
            typeDeclSpecifier358=typeDeclSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclSpecifier.add(typeDeclSpecifier358.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:586:23: ( DOT typeDeclSpecifier )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==DOT) ) {
                    int LA88_2 = input.LA(2);

                    if ( (LA88_2==BaseType||LA88_2==Constant_type||LA88_2==IDENTIFIER||LA88_2==QualifiedType||LA88_2==VoidType) ) {
                        alt88=1;
                    }


                }


                switch (alt88) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:586:24: DOT typeDeclSpecifier
            	    {
            	    DOT359=(Token)match(input,DOT,FOLLOW_DOT_in_referenceType4846); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT359);


            	    pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType4848);
            	    typeDeclSpecifier360=typeDeclSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeDeclSpecifier.add(typeDeclSpecifier360.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            // AST REWRITE
            // elements: typeDeclSpecifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 586:49: -> ^( UNITNAME ( typeDeclSpecifier )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:586:52: ^( UNITNAME ( typeDeclSpecifier )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_1);

                if ( !(stream_typeDeclSpecifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_typeDeclSpecifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclSpecifier.nextTree());

                }
                stream_typeDeclSpecifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "referenceType"


    public static class typeDeclSpecifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeDeclSpecifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:588:1: typeDeclSpecifier : typeName ( typeArguments )? -> ^( typeName ^( TYPEARGS ( typeArguments )? ) ) ;
    public final JVMParser.typeDeclSpecifier_return typeDeclSpecifier() throws RecognitionException {
        JVMParser.typeDeclSpecifier_return retval = new JVMParser.typeDeclSpecifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.typeName_return typeName361 =null;

        JVMParser.typeArguments_return typeArguments362 =null;


        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_typeArguments=new RewriteRuleSubtreeStream(adaptor,"rule typeArguments");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:589:3: ( typeName ( typeArguments )? -> ^( typeName ^( TYPEARGS ( typeArguments )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:589:5: typeName ( typeArguments )?
            {
            pushFollow(FOLLOW_typeName_in_typeDeclSpecifier4872);
            typeName361=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName361.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:589:14: ( typeArguments )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==LESST) ) {
                switch ( input.LA(2) ) {
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case QUESTION:
                    case QualifiedType:
                    case SHORT:
                    case VOID:
                        {
                        alt89=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA89_4 = input.LA(3);

                        if ( (LA89_4==COMMA||LA89_4==DOT||LA89_4==LARGET||(LA89_4 >= LBRACK && LA89_4 <= LESST)) ) {
                            alt89=1;
                        }
                        }
                        break;
                    case BaseType:
                        {
                        int LA89_5 = input.LA(3);

                        if ( (LA89_5==COMMA||LA89_5==DOT||LA89_5==LARGET||(LA89_5 >= LBRACK && LA89_5 <= LESST)) ) {
                            alt89=1;
                        }
                        }
                        break;
                    case VoidType:
                        {
                        int LA89_6 = input.LA(3);

                        if ( (LA89_6==COMMA||LA89_6==DOT||LA89_6==LARGET||(LA89_6 >= LBRACK && LA89_6 <= LESST)) ) {
                            alt89=1;
                        }
                        }
                        break;
                    case Constant_type:
                        {
                        int LA89_7 = input.LA(3);

                        if ( (LA89_7==COMMA||LA89_7==DOT||LA89_7==LARGET||(LA89_7 >= LBRACK && LA89_7 <= LESST)) ) {
                            alt89=1;
                        }
                        }
                        break;
                }

            }
            switch (alt89) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:589:14: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_typeDeclSpecifier4874);
                    typeArguments362=typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeArguments.add(typeArguments362.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: typeArguments, typeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 589:49: -> ^( typeName ^( TYPEARGS ( typeArguments )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:589:52: ^( typeName ^( TYPEARGS ( typeArguments )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_typeName.nextNode(), root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:589:63: ^( TYPEARGS ( typeArguments )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEARGS, "TYPEARGS")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:589:74: ( typeArguments )?
                if ( stream_typeArguments.hasNext() ) {
                    adaptor.addChild(root_2, stream_typeArguments.nextTree());

                }
                stream_typeArguments.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeDeclSpecifier"


    public static class typeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeName"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:591:1: typeName : (id= identifier -> QualifiedType[$id.text] | QualifiedType );
    public final JVMParser.typeName_return typeName() throws RecognitionException {
        JVMParser.typeName_return retval = new JVMParser.typeName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QualifiedType363=null;
        JVMParser.identifier_return id =null;


        Object QualifiedType363_tree=null;
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:592:3: (id= identifier -> QualifiedType[$id.text] | QualifiedType )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==BaseType||LA90_0==Constant_type||LA90_0==IDENTIFIER||LA90_0==VoidType) ) {
                alt90=1;
            }
            else if ( (LA90_0==QualifiedType) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }
            switch (alt90) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:592:5: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_typeName4922);
                    id=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(id.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 592:49: -> QualifiedType[$id.text]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(QualifiedType, (id!=null?input.toString(id.start,id.stop):null))
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:593:5: QualifiedType
                    {
                    root_0 = (Object)adaptor.nil();


                    QualifiedType363=(Token)match(input,QualifiedType,FOLLOW_QualifiedType_in_typeName4964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QualifiedType363_tree = 
                    (Object)adaptor.create(QualifiedType363)
                    ;
                    adaptor.addChild(root_0, QualifiedType363_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeName"


    public static class typeArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeArguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:595:1: typeArguments : LESST typeArgumentList LARGET -> typeArgumentList ;
    public final JVMParser.typeArguments_return typeArguments() throws RecognitionException {
        JVMParser.typeArguments_return retval = new JVMParser.typeArguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST364=null;
        Token LARGET366=null;
        JVMParser.typeArgumentList_return typeArgumentList365 =null;


        Object LESST364_tree=null;
        Object LARGET366_tree=null;
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_typeArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule typeArgumentList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:596:3: ( LESST typeArgumentList LARGET -> typeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:596:5: LESST typeArgumentList LARGET
            {
            LESST364=(Token)match(input,LESST,FOLLOW_LESST_in_typeArguments4976); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST364);


            pushFollow(FOLLOW_typeArgumentList_in_typeArguments4978);
            typeArgumentList365=typeArgumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeArgumentList.add(typeArgumentList365.getTree());

            LARGET366=(Token)match(input,LARGET,FOLLOW_LARGET_in_typeArguments4980); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET366);


            // AST REWRITE
            // elements: typeArgumentList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 596:49: -> typeArgumentList
            {
                adaptor.addChild(root_0, stream_typeArgumentList.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeArguments"


    public static class typeArgumentList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeArgumentList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:598:1: typeArgumentList : typeArgument ( COMMA typeArgument )* -> ( typeArgument )+ ;
    public final JVMParser.typeArgumentList_return typeArgumentList() throws RecognitionException {
        JVMParser.typeArgumentList_return retval = new JVMParser.typeArgumentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA368=null;
        JVMParser.typeArgument_return typeArgument367 =null;

        JVMParser.typeArgument_return typeArgument369 =null;


        Object COMMA368_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_typeArgument=new RewriteRuleSubtreeStream(adaptor,"rule typeArgument");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:599:3: ( typeArgument ( COMMA typeArgument )* -> ( typeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:599:5: typeArgument ( COMMA typeArgument )*
            {
            pushFollow(FOLLOW_typeArgument_in_typeArgumentList5011);
            typeArgument367=typeArgument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeArgument.add(typeArgument367.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:599:18: ( COMMA typeArgument )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==COMMA) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:599:19: COMMA typeArgument
            	    {
            	    COMMA368=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeArgumentList5014); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA368);


            	    pushFollow(FOLLOW_typeArgument_in_typeArgumentList5016);
            	    typeArgument369=typeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeArgument.add(typeArgument369.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            // AST REWRITE
            // elements: typeArgument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 599:49: -> ( typeArgument )+
            {
                if ( !(stream_typeArgument.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_typeArgument.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeArgument.nextTree());

                }
                stream_typeArgument.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeArgumentList"


    public static class typeArgument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeArgument"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:601:1: typeArgument : ( type | wildcard );
    public final JVMParser.typeArgument_return typeArgument() throws RecognitionException {
        JVMParser.typeArgument_return retval = new JVMParser.typeArgument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.type_return type370 =null;

        JVMParser.wildcard_return wildcard371 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:602:3: ( type | wildcard )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==BOOLEAN||(LA92_0 >= BYTE && LA92_0 <= BaseType)||LA92_0==CHAR||LA92_0==Constant_type||LA92_0==DOUBLE||LA92_0==FLOAT||LA92_0==IDENTIFIER||LA92_0==INT||LA92_0==LONG||LA92_0==QualifiedType||LA92_0==SHORT||LA92_0==VOID||LA92_0==VoidType) ) {
                alt92=1;
            }
            else if ( (LA92_0==QUESTION) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }
            switch (alt92) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:602:5: type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_in_typeArgument5044);
                    type370=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type370.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:603:5: wildcard
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_wildcard_in_typeArgument5050);
                    wildcard371=wildcard();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, wildcard371.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeArgument"


    public static class wildcard_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wildcard"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:605:1: wildcard : QUESTION ( wildcardBounds )? -> ^( QUESTION ( wildcardBounds )? ) ;
    public final JVMParser.wildcard_return wildcard() throws RecognitionException {
        JVMParser.wildcard_return retval = new JVMParser.wildcard_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QUESTION372=null;
        JVMParser.wildcardBounds_return wildcardBounds373 =null;


        Object QUESTION372_tree=null;
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_wildcardBounds=new RewriteRuleSubtreeStream(adaptor,"rule wildcardBounds");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:606:3: ( QUESTION ( wildcardBounds )? -> ^( QUESTION ( wildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:606:5: QUESTION ( wildcardBounds )?
            {
            QUESTION372=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_wildcard5062); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION372);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:606:14: ( wildcardBounds )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==EXTENDS||LA93_0==SUPER) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:606:14: wildcardBounds
                    {
                    pushFollow(FOLLOW_wildcardBounds_in_wildcard5064);
                    wildcardBounds373=wildcardBounds();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_wildcardBounds.add(wildcardBounds373.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: wildcardBounds, QUESTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 606:49: -> ^( QUESTION ( wildcardBounds )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:606:52: ^( QUESTION ( wildcardBounds )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_QUESTION.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:606:63: ( wildcardBounds )?
                if ( stream_wildcardBounds.hasNext() ) {
                    adaptor.addChild(root_1, stream_wildcardBounds.nextTree());

                }
                stream_wildcardBounds.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "wildcard"


    public static class wildcardBounds_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wildcardBounds"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:608:1: wildcardBounds : ( EXTENDS type -> ^( EXTENDS type ) | SUPER type -> ^( SUPER type ) );
    public final JVMParser.wildcardBounds_return wildcardBounds() throws RecognitionException {
        JVMParser.wildcardBounds_return retval = new JVMParser.wildcardBounds_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS374=null;
        Token SUPER376=null;
        JVMParser.type_return type375 =null;

        JVMParser.type_return type377 =null;


        Object EXTENDS374_tree=null;
        Object SUPER376_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:609:3: ( EXTENDS type -> ^( EXTENDS type ) | SUPER type -> ^( SUPER type ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==EXTENDS) ) {
                alt94=1;
            }
            else if ( (LA94_0==SUPER) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }
            switch (alt94) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:609:5: EXTENDS type
                    {
                    EXTENDS374=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_wildcardBounds5105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS374);


                    pushFollow(FOLLOW_type_in_wildcardBounds5107);
                    type375=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type375.getTree());

                    // AST REWRITE
                    // elements: type, EXTENDS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 609:49: -> ^( EXTENDS type )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:609:52: ^( EXTENDS type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EXTENDS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:610:5: SUPER type
                    {
                    SUPER376=(Token)match(input,SUPER,FOLLOW_SUPER_in_wildcardBounds5152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(SUPER376);


                    pushFollow(FOLLOW_type_in_wildcardBounds5154);
                    type377=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type377.getTree());

                    // AST REWRITE
                    // elements: SUPER, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 610:49: -> ^( SUPER type )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:610:52: ^( SUPER type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SUPER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "wildcardBounds"


    public static class typeParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParameters"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:612:1: typeParameters : LESST typeParameter ( COMMA typeParameter )* LARGET -> ( typeParameter )+ ;
    public final JVMParser.typeParameters_return typeParameters() throws RecognitionException {
        JVMParser.typeParameters_return retval = new JVMParser.typeParameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST378=null;
        Token COMMA380=null;
        Token LARGET382=null;
        JVMParser.typeParameter_return typeParameter379 =null;

        JVMParser.typeParameter_return typeParameter381 =null;


        Object LESST378_tree=null;
        Object COMMA380_tree=null;
        Object LARGET382_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_typeParameter=new RewriteRuleSubtreeStream(adaptor,"rule typeParameter");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:613:3: ( LESST typeParameter ( COMMA typeParameter )* LARGET -> ( typeParameter )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:613:5: LESST typeParameter ( COMMA typeParameter )* LARGET
            {
            LESST378=(Token)match(input,LESST,FOLLOW_LESST_in_typeParameters5207); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST378);


            pushFollow(FOLLOW_typeParameter_in_typeParameters5209);
            typeParameter379=typeParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParameter.add(typeParameter379.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:613:25: ( COMMA typeParameter )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==COMMA) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:613:26: COMMA typeParameter
            	    {
            	    COMMA380=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeParameters5212); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA380);


            	    pushFollow(FOLLOW_typeParameter_in_typeParameters5214);
            	    typeParameter381=typeParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeParameter.add(typeParameter381.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            LARGET382=(Token)match(input,LARGET,FOLLOW_LARGET_in_typeParameters5218); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET382);


            // AST REWRITE
            // elements: typeParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 613:55: -> ( typeParameter )+
            {
                if ( !(stream_typeParameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_typeParameter.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeParameter.nextTree());

                }
                stream_typeParameter.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeParameters"


    public static class typeParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParameter"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:615:1: typeParameter : identifier ( typeBound )? -> ^( identifier ( typeBound )? ) ;
    public final JVMParser.typeParameter_return typeParameter() throws RecognitionException {
        JVMParser.typeParameter_return retval = new JVMParser.typeParameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.identifier_return identifier383 =null;

        JVMParser.typeBound_return typeBound384 =null;


        RewriteRuleSubtreeStream stream_typeBound=new RewriteRuleSubtreeStream(adaptor,"rule typeBound");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:616:3: ( identifier ( typeBound )? -> ^( identifier ( typeBound )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:616:5: identifier ( typeBound )?
            {
            pushFollow(FOLLOW_identifier_in_typeParameter5235);
            identifier383=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier383.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:616:16: ( typeBound )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==EXTENDS) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:616:16: typeBound
                    {
                    pushFollow(FOLLOW_typeBound_in_typeParameter5237);
                    typeBound384=typeBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeBound.add(typeBound384.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: typeBound, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 616:49: -> ^( identifier ( typeBound )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:616:52: ^( identifier ( typeBound )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_identifier.nextNode(), root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:616:65: ( typeBound )?
                if ( stream_typeBound.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeBound.nextTree());

                }
                stream_typeBound.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeParameter"


    public static class typeBound_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeBound"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:618:1: typeBound : EXTENDS referenceType ( AND referenceType )* -> ^( EXTENDS ( referenceType )+ ) ;
    public final JVMParser.typeBound_return typeBound() throws RecognitionException {
        JVMParser.typeBound_return retval = new JVMParser.typeBound_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS385=null;
        Token AND387=null;
        JVMParser.referenceType_return referenceType386 =null;

        JVMParser.referenceType_return referenceType388 =null;


        Object EXTENDS385_tree=null;
        Object AND387_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_referenceType=new RewriteRuleSubtreeStream(adaptor,"rule referenceType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:619:3: ( EXTENDS referenceType ( AND referenceType )* -> ^( EXTENDS ( referenceType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:619:5: EXTENDS referenceType ( AND referenceType )*
            {
            EXTENDS385=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeBound5281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS385);


            pushFollow(FOLLOW_referenceType_in_typeBound5283);
            referenceType386=referenceType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_referenceType.add(referenceType386.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:619:27: ( AND referenceType )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==AND) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:619:28: AND referenceType
            	    {
            	    AND387=(Token)match(input,AND,FOLLOW_AND_in_typeBound5286); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND387);


            	    pushFollow(FOLLOW_referenceType_in_typeBound5288);
            	    referenceType388=referenceType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_referenceType.add(referenceType388.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            // AST REWRITE
            // elements: EXTENDS, referenceType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 619:49: -> ^( EXTENDS ( referenceType )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:619:52: ^( EXTENDS ( referenceType )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EXTENDS.nextNode()
                , root_1);

                if ( !(stream_referenceType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_referenceType.hasNext() ) {
                    adaptor.addChild(root_1, stream_referenceType.nextTree());

                }
                stream_referenceType.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeBound"


    public static class genericDescriptor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:625:1: genericDescriptor : LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET -> ( genericReturnDescriptor )+ ;
    public final JVMParser.genericDescriptor_return genericDescriptor() throws RecognitionException {
        JVMParser.genericDescriptor_return retval = new JVMParser.genericDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST389=null;
        Token COMMA391=null;
        Token LARGET393=null;
        JVMParser.genericReturnDescriptor_return genericReturnDescriptor390 =null;

        JVMParser.genericReturnDescriptor_return genericReturnDescriptor392 =null;


        Object LESST389_tree=null;
        Object COMMA391_tree=null;
        Object LARGET393_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_genericReturnDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule genericReturnDescriptor");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:626:3: ( LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET -> ( genericReturnDescriptor )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:626:5: LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET
            {
            LESST389=(Token)match(input,LESST,FOLLOW_LESST_in_genericDescriptor5316); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST389);


            pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor5318);
            genericReturnDescriptor390=genericReturnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor390.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:626:35: ( COMMA genericReturnDescriptor )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==COMMA) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:626:36: COMMA genericReturnDescriptor
            	    {
            	    COMMA391=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericDescriptor5321); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA391);


            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor5323);
            	    genericReturnDescriptor392=genericReturnDescriptor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor392.getTree());

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            LARGET393=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericDescriptor5327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET393);


            // AST REWRITE
            // elements: genericReturnDescriptor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 626:75: -> ( genericReturnDescriptor )+
            {
                if ( !(stream_genericReturnDescriptor.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_genericReturnDescriptor.hasNext() ) {
                    adaptor.addChild(root_0, stream_genericReturnDescriptor.nextTree());

                }
                stream_genericReturnDescriptor.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "genericDescriptor"


    public static class genericReturnDescriptor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericReturnDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:628:1: genericReturnDescriptor : identifier EXTENDS bytecodeReferenceTypeList -> ^( EXTENDS identifier bytecodeReferenceTypeList ) ;
    public final JVMParser.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        JVMParser.genericReturnDescriptor_return retval = new JVMParser.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS395=null;
        JVMParser.identifier_return identifier394 =null;

        JVMParser.bytecodeReferenceTypeList_return bytecodeReferenceTypeList396 =null;


        Object EXTENDS395_tree=null;
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_bytecodeReferenceTypeList=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeReferenceTypeList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:629:3: ( identifier EXTENDS bytecodeReferenceTypeList -> ^( EXTENDS identifier bytecodeReferenceTypeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:629:5: identifier EXTENDS bytecodeReferenceTypeList
            {
            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor5344);
            identifier394=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier394.getTree());

            EXTENDS395=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor5346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS395);


            pushFollow(FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor5348);
            bytecodeReferenceTypeList396=bytecodeReferenceTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeReferenceTypeList.add(bytecodeReferenceTypeList396.getTree());

            // AST REWRITE
            // elements: EXTENDS, bytecodeReferenceTypeList, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 629:65: -> ^( EXTENDS identifier bytecodeReferenceTypeList )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:629:69: ^( EXTENDS identifier bytecodeReferenceTypeList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EXTENDS.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_bytecodeReferenceTypeList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "genericReturnDescriptor"


    public static class bytecodeReferenceTypeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeReferenceTypeList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:631:1: bytecodeReferenceTypeList : bytecodeReferenceType ( AND bytecodeReferenceType )* -> ( bytecodeReferenceType )+ ;
    public final JVMParser.bytecodeReferenceTypeList_return bytecodeReferenceTypeList() throws RecognitionException {
        JVMParser.bytecodeReferenceTypeList_return retval = new JVMParser.bytecodeReferenceTypeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND398=null;
        JVMParser.bytecodeReferenceType_return bytecodeReferenceType397 =null;

        JVMParser.bytecodeReferenceType_return bytecodeReferenceType399 =null;


        Object AND398_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_bytecodeReferenceType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeReferenceType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:3: ( bytecodeReferenceType ( AND bytecodeReferenceType )* -> ( bytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:5: bytecodeReferenceType ( AND bytecodeReferenceType )*
            {
            pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList5387);
            bytecodeReferenceType397=bytecodeReferenceType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeReferenceType.add(bytecodeReferenceType397.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:27: ( AND bytecodeReferenceType )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==AND) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:28: AND bytecodeReferenceType
            	    {
            	    AND398=(Token)match(input,AND,FOLLOW_AND_in_bytecodeReferenceTypeList5390); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND398);


            	    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList5392);
            	    bytecodeReferenceType399=bytecodeReferenceType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeReferenceType.add(bytecodeReferenceType399.getTree());

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            // AST REWRITE
            // elements: bytecodeReferenceType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 632:65: -> ( bytecodeReferenceType )+
            {
                if ( !(stream_bytecodeReferenceType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_bytecodeReferenceType.hasNext() ) {
                    adaptor.addChild(root_0, stream_bytecodeReferenceType.nextTree());

                }
                stream_bytecodeReferenceType.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeReferenceTypeList"


    public static class bytecodeReferenceType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeReferenceType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:634:1: bytecodeReferenceType : bytecodeTypeDeclSpecifier ( DOT bytecodeTypeDeclSpecifier )* -> ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) ;
    public final JVMParser.bytecodeReferenceType_return bytecodeReferenceType() throws RecognitionException {
        JVMParser.bytecodeReferenceType_return retval = new JVMParser.bytecodeReferenceType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT401=null;
        JVMParser.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier400 =null;

        JVMParser.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier402 =null;


        Object DOT401_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_bytecodeTypeDeclSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeDeclSpecifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:635:3: ( bytecodeTypeDeclSpecifier ( DOT bytecodeTypeDeclSpecifier )* -> ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:635:5: bytecodeTypeDeclSpecifier ( DOT bytecodeTypeDeclSpecifier )*
            {
            pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType5420);
            bytecodeTypeDeclSpecifier400=bytecodeTypeDeclSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeTypeDeclSpecifier.add(bytecodeTypeDeclSpecifier400.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:635:31: ( DOT bytecodeTypeDeclSpecifier )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==DOT) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:635:32: DOT bytecodeTypeDeclSpecifier
            	    {
            	    DOT401=(Token)match(input,DOT,FOLLOW_DOT_in_bytecodeReferenceType5423); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT401);


            	    pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType5425);
            	    bytecodeTypeDeclSpecifier402=bytecodeTypeDeclSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeTypeDeclSpecifier.add(bytecodeTypeDeclSpecifier402.getTree());

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            // AST REWRITE
            // elements: bytecodeTypeDeclSpecifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 635:65: -> ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:635:68: ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_1);

                if ( !(stream_bytecodeTypeDeclSpecifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_bytecodeTypeDeclSpecifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_bytecodeTypeDeclSpecifier.nextTree());

                }
                stream_bytecodeTypeDeclSpecifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeReferenceType"


    public static class bytecodeTypeDeclSpecifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeDeclSpecifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:637:1: bytecodeTypeDeclSpecifier : bytecodeTypeName ( bytecodeTypeArguments )? -> bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) ;
    public final JVMParser.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier() throws RecognitionException {
        JVMParser.bytecodeTypeDeclSpecifier_return retval = new JVMParser.bytecodeTypeDeclSpecifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.bytecodeTypeName_return bytecodeTypeName403 =null;

        JVMParser.bytecodeTypeArguments_return bytecodeTypeArguments404 =null;


        RewriteRuleSubtreeStream stream_bytecodeTypeName=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeName");
        RewriteRuleSubtreeStream stream_bytecodeTypeArguments=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeArguments");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:638:3: ( bytecodeTypeName ( bytecodeTypeArguments )? -> bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:638:5: bytecodeTypeName ( bytecodeTypeArguments )?
            {
            pushFollow(FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier5449);
            bytecodeTypeName403=bytecodeTypeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeTypeName.add(bytecodeTypeName403.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:638:22: ( bytecodeTypeArguments )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LESST) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:638:22: bytecodeTypeArguments
                    {
                    pushFollow(FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier5451);
                    bytecodeTypeArguments404=bytecodeTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bytecodeTypeArguments.add(bytecodeTypeArguments404.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: bytecodeTypeName, bytecodeTypeArguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 638:65: -> bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? )
            {
                adaptor.addChild(root_0, stream_bytecodeTypeName.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:638:85: ^( TYPEARGS ( bytecodeTypeArguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEARGS, "TYPEARGS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:638:96: ( bytecodeTypeArguments )?
                if ( stream_bytecodeTypeArguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_bytecodeTypeArguments.nextTree());

                }
                stream_bytecodeTypeArguments.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeDeclSpecifier"


    public static class bytecodeTypeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeName"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:640:1: bytecodeTypeName : (id= identifier -> INTERNALTYPE[$id.text] | INTERNALTYPE );
    public final JVMParser.bytecodeTypeName_return bytecodeTypeName() throws RecognitionException {
        JVMParser.bytecodeTypeName_return retval = new JVMParser.bytecodeTypeName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERNALTYPE405=null;
        JVMParser.identifier_return id =null;


        Object INTERNALTYPE405_tree=null;
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:641:3: (id= identifier -> INTERNALTYPE[$id.text] | INTERNALTYPE )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==BaseType||LA102_0==Constant_type||LA102_0==IDENTIFIER||LA102_0==VoidType) ) {
                alt102=1;
            }
            else if ( (LA102_0==INTERNALTYPE) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:641:5: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_bytecodeTypeName5497);
                    id=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(id.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 641:65: -> INTERNALTYPE[$id.text]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INTERNALTYPE, (id!=null?input.toString(id.start,id.stop):null))
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:642:5: INTERNALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERNALTYPE405=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeTypeName5554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE405_tree = 
                    (Object)adaptor.create(INTERNALTYPE405)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE405_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeName"


    public static class bytecodeTypeArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeArguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:644:1: bytecodeTypeArguments : LESST bytecodeTypeArgumentList LARGET -> bytecodeTypeArgumentList ;
    public final JVMParser.bytecodeTypeArguments_return bytecodeTypeArguments() throws RecognitionException {
        JVMParser.bytecodeTypeArguments_return retval = new JVMParser.bytecodeTypeArguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST406=null;
        Token LARGET408=null;
        JVMParser.bytecodeTypeArgumentList_return bytecodeTypeArgumentList407 =null;


        Object LESST406_tree=null;
        Object LARGET408_tree=null;
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_bytecodeTypeArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeArgumentList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:645:3: ( LESST bytecodeTypeArgumentList LARGET -> bytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:645:5: LESST bytecodeTypeArgumentList LARGET
            {
            LESST406=(Token)match(input,LESST,FOLLOW_LESST_in_bytecodeTypeArguments5566); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST406);


            pushFollow(FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments5568);
            bytecodeTypeArgumentList407=bytecodeTypeArgumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeTypeArgumentList.add(bytecodeTypeArgumentList407.getTree());

            LARGET408=(Token)match(input,LARGET,FOLLOW_LARGET_in_bytecodeTypeArguments5570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET408);


            // AST REWRITE
            // elements: bytecodeTypeArgumentList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 645:57: -> bytecodeTypeArgumentList
            {
                adaptor.addChild(root_0, stream_bytecodeTypeArgumentList.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeArguments"


    public static class bytecodeTypeArgumentList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeArgumentList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:647:1: bytecodeTypeArgumentList : bytecodeTypeArgument ( COMMA bytecodeTypeArgument )* -> ( bytecodeTypeArgument )+ ;
    public final JVMParser.bytecodeTypeArgumentList_return bytecodeTypeArgumentList() throws RecognitionException {
        JVMParser.bytecodeTypeArgumentList_return retval = new JVMParser.bytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA410=null;
        JVMParser.bytecodeTypeArgument_return bytecodeTypeArgument409 =null;

        JVMParser.bytecodeTypeArgument_return bytecodeTypeArgument411 =null;


        Object COMMA410_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_bytecodeTypeArgument=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeArgument");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:648:3: ( bytecodeTypeArgument ( COMMA bytecodeTypeArgument )* -> ( bytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:648:5: bytecodeTypeArgument ( COMMA bytecodeTypeArgument )*
            {
            pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList5601);
            bytecodeTypeArgument409=bytecodeTypeArgument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeTypeArgument.add(bytecodeTypeArgument409.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:648:26: ( COMMA bytecodeTypeArgument )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==COMMA) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:648:27: COMMA bytecodeTypeArgument
            	    {
            	    COMMA410=(Token)match(input,COMMA,FOLLOW_COMMA_in_bytecodeTypeArgumentList5604); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA410);


            	    pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList5606);
            	    bytecodeTypeArgument411=bytecodeTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeTypeArgument.add(bytecodeTypeArgument411.getTree());

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            // AST REWRITE
            // elements: bytecodeTypeArgument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 648:57: -> ( bytecodeTypeArgument )+
            {
                if ( !(stream_bytecodeTypeArgument.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_bytecodeTypeArgument.hasNext() ) {
                    adaptor.addChild(root_0, stream_bytecodeTypeArgument.nextTree());

                }
                stream_bytecodeTypeArgument.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeArgumentList"


    public static class bytecodeTypeArgument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeTypeArgument"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:650:1: bytecodeTypeArgument : ( bytecodeReferenceType | bytecodeWildcard );
    public final JVMParser.bytecodeTypeArgument_return bytecodeTypeArgument() throws RecognitionException {
        JVMParser.bytecodeTypeArgument_return retval = new JVMParser.bytecodeTypeArgument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.bytecodeReferenceType_return bytecodeReferenceType412 =null;

        JVMParser.bytecodeWildcard_return bytecodeWildcard413 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:651:3: ( bytecodeReferenceType | bytecodeWildcard )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==BaseType||LA104_0==Constant_type||LA104_0==IDENTIFIER||LA104_0==INTERNALTYPE||LA104_0==VoidType) ) {
                alt104=1;
            }
            else if ( (LA104_0==QUESTION) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }
            switch (alt104) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:651:5: bytecodeReferenceType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument5626);
                    bytecodeReferenceType412=bytecodeReferenceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeReferenceType412.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:652:5: bytecodeWildcard
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument5632);
                    bytecodeWildcard413=bytecodeWildcard();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeWildcard413.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeTypeArgument"


    public static class bytecodeWildcard_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeWildcard"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:654:1: bytecodeWildcard : QUESTION ( bytecodeWildcardBounds )? -> ^( QUESTION ( bytecodeWildcardBounds )? ) ;
    public final JVMParser.bytecodeWildcard_return bytecodeWildcard() throws RecognitionException {
        JVMParser.bytecodeWildcard_return retval = new JVMParser.bytecodeWildcard_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QUESTION414=null;
        JVMParser.bytecodeWildcardBounds_return bytecodeWildcardBounds415 =null;


        Object QUESTION414_tree=null;
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_bytecodeWildcardBounds=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeWildcardBounds");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:655:3: ( QUESTION ( bytecodeWildcardBounds )? -> ^( QUESTION ( bytecodeWildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:655:5: QUESTION ( bytecodeWildcardBounds )?
            {
            QUESTION414=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bytecodeWildcard5644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION414);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:655:14: ( bytecodeWildcardBounds )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==EXTENDS||LA105_0==SUPER) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:655:14: bytecodeWildcardBounds
                    {
                    pushFollow(FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard5646);
                    bytecodeWildcardBounds415=bytecodeWildcardBounds();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bytecodeWildcardBounds.add(bytecodeWildcardBounds415.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: bytecodeWildcardBounds, QUESTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 655:57: -> ^( QUESTION ( bytecodeWildcardBounds )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:655:60: ^( QUESTION ( bytecodeWildcardBounds )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_QUESTION.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:655:71: ( bytecodeWildcardBounds )?
                if ( stream_bytecodeWildcardBounds.hasNext() ) {
                    adaptor.addChild(root_1, stream_bytecodeWildcardBounds.nextTree());

                }
                stream_bytecodeWildcardBounds.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeWildcard"


    public static class bytecodeWildcardBounds_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeWildcardBounds"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:657:1: bytecodeWildcardBounds : ( EXTENDS bytecodeReferenceType -> ^( EXTENDS bytecodeReferenceType ) | SUPER bytecodeReferenceType -> ^( SUPER bytecodeReferenceType ) );
    public final JVMParser.bytecodeWildcardBounds_return bytecodeWildcardBounds() throws RecognitionException {
        JVMParser.bytecodeWildcardBounds_return retval = new JVMParser.bytecodeWildcardBounds_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS416=null;
        Token SUPER418=null;
        JVMParser.bytecodeReferenceType_return bytecodeReferenceType417 =null;

        JVMParser.bytecodeReferenceType_return bytecodeReferenceType419 =null;


        Object EXTENDS416_tree=null;
        Object SUPER418_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_bytecodeReferenceType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeReferenceType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:658:3: ( EXTENDS bytecodeReferenceType -> ^( EXTENDS bytecodeReferenceType ) | SUPER bytecodeReferenceType -> ^( SUPER bytecodeReferenceType ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==EXTENDS) ) {
                alt106=1;
            }
            else if ( (LA106_0==SUPER) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }
            switch (alt106) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:658:5: EXTENDS bytecodeReferenceType
                    {
                    EXTENDS416=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_bytecodeWildcardBounds5687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS416);


                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds5689);
                    bytecodeReferenceType417=bytecodeReferenceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bytecodeReferenceType.add(bytecodeReferenceType417.getTree());

                    // AST REWRITE
                    // elements: bytecodeReferenceType, EXTENDS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 658:57: -> ^( EXTENDS bytecodeReferenceType )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:658:60: ^( EXTENDS bytecodeReferenceType )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EXTENDS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_bytecodeReferenceType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:659:5: SUPER bytecodeReferenceType
                    {
                    SUPER418=(Token)match(input,SUPER,FOLLOW_SUPER_in_bytecodeWildcardBounds5725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(SUPER418);


                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds5727);
                    bytecodeReferenceType419=bytecodeReferenceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bytecodeReferenceType.add(bytecodeReferenceType419.getTree());

                    // AST REWRITE
                    // elements: SUPER, bytecodeReferenceType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 659:57: -> ^( SUPER bytecodeReferenceType )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:659:60: ^( SUPER bytecodeReferenceType )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SUPER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_bytecodeReferenceType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeWildcardBounds"


    public static class bytecodeType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:666:1: bytecodeType : ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER );
    public final JVMParser.bytecodeType_return bytecodeType() throws RecognitionException {
        JVMParser.bytecodeType_return retval = new JVMParser.bytecodeType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BaseType421=null;
        Token SEMI423=null;
        Token IDENTIFIER424=null;
        JVMParser.bytecodeArrayType_return bytecodeArrayType420 =null;

        JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType422 =null;


        Object BaseType421_tree=null;
        Object SEMI423_tree=null;
        Object IDENTIFIER424_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:667:3: ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER )
            int alt107=4;
            switch ( input.LA(1) ) {
            case LBRACK:
                {
                alt107=1;
                }
                break;
            case BaseType:
                {
                alt107=2;
                }
                break;
            case INTERNALTYPE:
                {
                alt107=3;
                }
                break;
            case IDENTIFIER:
                {
                switch ( input.LA(2) ) {
                case LESST:
                    {
                    switch ( input.LA(3) ) {
                    case INTERNALTYPE:
                    case LBRACK:
                    case MINUS:
                    case PLUS:
                    case STAR:
                        {
                        alt107=3;
                        }
                        break;
                    case BaseType:
                        {
                        int LA107_7 = input.LA(4);

                        if ( (LA107_7==BaseType||LA107_7==IDENTIFIER||LA107_7==INTERNALTYPE||LA107_7==LARGET||LA107_7==LBRACK||LA107_7==MINUS||LA107_7==PLUS||LA107_7==STAR) ) {
                            alt107=3;
                        }
                        else if ( (LA107_7==EXTENDS) ) {
                            alt107=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 107, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA107_8 = input.LA(4);

                        if ( (LA107_8==BaseType||LA107_8==DOT||LA107_8==IDENTIFIER||LA107_8==INTERNALTYPE||LA107_8==LARGET||(LA107_8 >= LBRACK && LA107_8 <= LESST)||LA107_8==MINUS||LA107_8==PLUS||LA107_8==SEMI||LA107_8==STAR) ) {
                            alt107=3;
                        }
                        else if ( (LA107_8==EXTENDS) ) {
                            alt107=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 107, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case Constant_type:
                    case VoidType:
                        {
                        alt107=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case DOT:
                case SEMI:
                    {
                    alt107=3;
                    }
                    break;
                case EOF:
                case ABSTRACT:
                case AnnotationDefault:
                case BOOLEAN:
                case BYTE:
                case BaseType:
                case CHAR:
                case Constant_type:
                case DOUBLE:
                case Deprecated:
                case ExceptionTable:
                case Exceptions:
                case FINAL:
                case FLOAT:
                case Flag:
                case IDENTIFIER:
                case INT:
                case INTERNALTYPE:
                case INTLITERAL:
                case LARGET:
                case LBRACK:
                case LONG:
                case LineNumberTable:
                case LocalVariableTable:
                case LocalVariableTypeTable:
                case MINUS:
                case NATIVE:
                case PLUS:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case QualifiedType:
                case RBRACE:
                case RPAREN:
                case RuntimeInvisibleAnnotations:
                case RuntimeInvisibleParameterAnnotations:
                case RuntimeVisibleAnnotations:
                case RuntimeVisibleParameterAnnotations:
                case SHORT:
                case STAR:
                case STATIC:
                case STRICTFP:
                case SYNCHRONIZED:
                case Signature:
                case StackMap:
                case StackMapTable:
                case Synthetic:
                case TRANSIENT:
                case VOID:
                case VOLATILE:
                case VoidType:
                    {
                    alt107=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }

            switch (alt107) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:667:5: bytecodeArrayType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType5778);
                    bytecodeArrayType420=bytecodeArrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeArrayType420.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:667:25: BaseType
                    {
                    root_0 = (Object)adaptor.nil();


                    BaseType421=(Token)match(input,BaseType,FOLLOW_BaseType_in_bytecodeType5782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BaseType421_tree = 
                    (Object)adaptor.create(BaseType421)
                    ;
                    adaptor.addChild(root_0, BaseType421_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:667:36: simpleBytecodeObjectType SEMI
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_bytecodeType5786);
                    simpleBytecodeObjectType422=simpleBytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleBytecodeObjectType422.getTree());

                    SEMI423=(Token)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType5788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI423_tree = 
                    (Object)adaptor.create(SEMI423)
                    ;
                    adaptor.addChild(root_0, SEMI423_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:667:68: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER424=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType5792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER424_tree = 
                    (Object)adaptor.create(IDENTIFIER424)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER424_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeType"


    public static class bytecodeArrayType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeArrayType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:669:1: bytecodeArrayType : LBRACK bytecodeType ;
    public final JVMParser.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        JVMParser.bytecodeArrayType_return retval = new JVMParser.bytecodeArrayType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK425=null;
        JVMParser.bytecodeType_return bytecodeType426 =null;


        Object LBRACK425_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:670:3: ( LBRACK bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:670:5: LBRACK bytecodeType
            {
            root_0 = (Object)adaptor.nil();


            LBRACK425=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType5805); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK425_tree = 
            (Object)adaptor.create(LBRACK425)
            ;
            adaptor.addChild(root_0, LBRACK425_tree);
            }

            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType5807);
            bytecodeType426=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType426.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bytecodeArrayType"


    public static class simpleBytecodeObjectType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeObjectType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:672:1: simpleBytecodeObjectType : simpleBytecodeReferenceType ( DOT simpleBytecodeReferenceType )* -> ( simpleBytecodeReferenceType )+ ;
    public final JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        JVMParser.simpleBytecodeObjectType_return retval = new JVMParser.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT428=null;
        JVMParser.simpleBytecodeReferenceType_return simpleBytecodeReferenceType427 =null;

        JVMParser.simpleBytecodeReferenceType_return simpleBytecodeReferenceType429 =null;


        Object DOT428_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_simpleBytecodeReferenceType=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeReferenceType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:673:3: ( simpleBytecodeReferenceType ( DOT simpleBytecodeReferenceType )* -> ( simpleBytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:673:5: simpleBytecodeReferenceType ( DOT simpleBytecodeReferenceType )*
            {
            pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType5820);
            simpleBytecodeReferenceType427=simpleBytecodeReferenceType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleBytecodeReferenceType.add(simpleBytecodeReferenceType427.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:673:33: ( DOT simpleBytecodeReferenceType )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==DOT) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:673:34: DOT simpleBytecodeReferenceType
            	    {
            	    DOT428=(Token)match(input,DOT,FOLLOW_DOT_in_simpleBytecodeObjectType5823); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT428);


            	    pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType5825);
            	    simpleBytecodeReferenceType429=simpleBytecodeReferenceType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_simpleBytecodeReferenceType.add(simpleBytecodeReferenceType429.getTree());

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            // AST REWRITE
            // elements: simpleBytecodeReferenceType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 673:68: -> ( simpleBytecodeReferenceType )+
            {
                if ( !(stream_simpleBytecodeReferenceType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_simpleBytecodeReferenceType.hasNext() ) {
                    adaptor.addChild(root_0, stream_simpleBytecodeReferenceType.nextTree());

                }
                stream_simpleBytecodeReferenceType.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeObjectType"


    public static class simpleBytecodeReferenceType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeReferenceType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:675:1: simpleBytecodeReferenceType : simpleBytecodeReferenceTypeName ( simpleBytecodeTypeArguments )? -> simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) ;
    public final JVMParser.simpleBytecodeReferenceType_return simpleBytecodeReferenceType() throws RecognitionException {
        JVMParser.simpleBytecodeReferenceType_return retval = new JVMParser.simpleBytecodeReferenceType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName430 =null;

        JVMParser.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments431 =null;


        RewriteRuleSubtreeStream stream_simpleBytecodeTypeArguments=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeTypeArguments");
        RewriteRuleSubtreeStream stream_simpleBytecodeReferenceTypeName=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeReferenceTypeName");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:676:3: ( simpleBytecodeReferenceTypeName ( simpleBytecodeTypeArguments )? -> simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:676:5: simpleBytecodeReferenceTypeName ( simpleBytecodeTypeArguments )?
            {
            pushFollow(FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType5844);
            simpleBytecodeReferenceTypeName430=simpleBytecodeReferenceTypeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleBytecodeReferenceTypeName.add(simpleBytecodeReferenceTypeName430.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:676:37: ( simpleBytecodeTypeArguments )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==LESST) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:676:37: simpleBytecodeTypeArguments
                    {
                    pushFollow(FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType5846);
                    simpleBytecodeTypeArguments431=simpleBytecodeTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleBytecodeTypeArguments.add(simpleBytecodeTypeArguments431.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: simpleBytecodeReferenceTypeName, simpleBytecodeTypeArguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 676:67: -> simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? )
            {
                adaptor.addChild(root_0, stream_simpleBytecodeReferenceTypeName.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:676:102: ^( TYPEARGS ( simpleBytecodeTypeArguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEARGS, "TYPEARGS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:676:113: ( simpleBytecodeTypeArguments )?
                if ( stream_simpleBytecodeTypeArguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_simpleBytecodeTypeArguments.nextTree());

                }
                stream_simpleBytecodeTypeArguments.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeReferenceType"


    public static class simpleBytecodeReferenceTypeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeReferenceTypeName"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:678:1: simpleBytecodeReferenceTypeName : ( INTERNALTYPE |id= IDENTIFIER -> INTERNALTYPE[$id] );
    public final JVMParser.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName() throws RecognitionException {
        JVMParser.simpleBytecodeReferenceTypeName_return retval = new JVMParser.simpleBytecodeReferenceTypeName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token INTERNALTYPE432=null;

        Object id_tree=null;
        Object INTERNALTYPE432_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:679:3: ( INTERNALTYPE |id= IDENTIFIER -> INTERNALTYPE[$id] )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==INTERNALTYPE) ) {
                alt110=1;
            }
            else if ( (LA110_0==IDENTIFIER) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }
            switch (alt110) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:679:5: INTERNALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERNALTYPE432=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName5871); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE432_tree = 
                    (Object)adaptor.create(INTERNALTYPE432)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE432_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:680:5: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleBytecodeReferenceTypeName5879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 680:66: -> INTERNALTYPE[$id]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INTERNALTYPE, id)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeReferenceTypeName"


    public static class simpleBytecodeTypeArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeTypeArguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:682:1: simpleBytecodeTypeArguments : LESST simpleBytecodeTypeArgumentList LARGET -> simpleBytecodeTypeArgumentList ;
    public final JVMParser.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments() throws RecognitionException {
        JVMParser.simpleBytecodeTypeArguments_return retval = new JVMParser.simpleBytecodeTypeArguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST433=null;
        Token LARGET435=null;
        JVMParser.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList434 =null;


        Object LESST433_tree=null;
        Object LARGET435_tree=null;
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_simpleBytecodeTypeArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeTypeArgumentList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:683:3: ( LESST simpleBytecodeTypeArgumentList LARGET -> simpleBytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:683:5: LESST simpleBytecodeTypeArgumentList LARGET
            {
            LESST433=(Token)match(input,LESST,FOLLOW_LESST_in_simpleBytecodeTypeArguments5943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST433);


            pushFollow(FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments5945);
            simpleBytecodeTypeArgumentList434=simpleBytecodeTypeArgumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleBytecodeTypeArgumentList.add(simpleBytecodeTypeArgumentList434.getTree());

            LARGET435=(Token)match(input,LARGET,FOLLOW_LARGET_in_simpleBytecodeTypeArguments5947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET435);


            // AST REWRITE
            // elements: simpleBytecodeTypeArgumentList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 683:63: -> simpleBytecodeTypeArgumentList
            {
                adaptor.addChild(root_0, stream_simpleBytecodeTypeArgumentList.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeTypeArguments"


    public static class simpleBytecodeTypeArgumentList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeTypeArgumentList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:685:1: simpleBytecodeTypeArgumentList : simpleBytecodeTypeArgument ( simpleBytecodeTypeArgument )* -> ( simpleBytecodeTypeArgument )+ ;
    public final JVMParser.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList() throws RecognitionException {
        JVMParser.simpleBytecodeTypeArgumentList_return retval = new JVMParser.simpleBytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument436 =null;

        JVMParser.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument437 =null;


        RewriteRuleSubtreeStream stream_simpleBytecodeTypeArgument=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeTypeArgument");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:686:3: ( simpleBytecodeTypeArgument ( simpleBytecodeTypeArgument )* -> ( simpleBytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:686:5: simpleBytecodeTypeArgument ( simpleBytecodeTypeArgument )*
            {
            pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList5977);
            simpleBytecodeTypeArgument436=simpleBytecodeTypeArgument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleBytecodeTypeArgument.add(simpleBytecodeTypeArgument436.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:686:32: ( simpleBytecodeTypeArgument )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==BaseType||LA111_0==IDENTIFIER||LA111_0==INTERNALTYPE||LA111_0==LBRACK||LA111_0==MINUS||LA111_0==PLUS||LA111_0==STAR) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:686:33: simpleBytecodeTypeArgument
            	    {
            	    pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList5980);
            	    simpleBytecodeTypeArgument437=simpleBytecodeTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_simpleBytecodeTypeArgument.add(simpleBytecodeTypeArgument437.getTree());

            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            // AST REWRITE
            // elements: simpleBytecodeTypeArgument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 686:63: -> ( simpleBytecodeTypeArgument )+
            {
                if ( !(stream_simpleBytecodeTypeArgument.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_simpleBytecodeTypeArgument.hasNext() ) {
                    adaptor.addChild(root_0, stream_simpleBytecodeTypeArgument.nextTree());

                }
                stream_simpleBytecodeTypeArgument.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeTypeArgumentList"


    public static class simpleBytecodeTypeArgument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeTypeArgument"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:688:1: simpleBytecodeTypeArgument : ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR );
    public final JVMParser.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument() throws RecognitionException {
        JVMParser.simpleBytecodeTypeArgument_return retval = new JVMParser.simpleBytecodeTypeArgument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MINUS439=null;
        Token PLUS441=null;
        Token STAR443=null;
        JVMParser.bytecodeType_return bytecodeType438 =null;

        JVMParser.bytecodeType_return bytecodeType440 =null;

        JVMParser.bytecodeType_return bytecodeType442 =null;


        Object MINUS439_tree=null;
        Object PLUS441_tree=null;
        Object STAR443_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:689:3: ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR )
            int alt112=4;
            switch ( input.LA(1) ) {
            case BaseType:
            case IDENTIFIER:
            case INTERNALTYPE:
            case LBRACK:
                {
                alt112=1;
                }
                break;
            case MINUS:
                {
                alt112=2;
                }
                break;
            case PLUS:
                {
                alt112=3;
                }
                break;
            case STAR:
                {
                alt112=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }

            switch (alt112) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:689:5: bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument6000);
                    bytecodeType438=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType438.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:690:5: MINUS bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    MINUS439=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleBytecodeTypeArgument6006); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS439_tree = 
                    (Object)adaptor.create(MINUS439)
                    ;
                    adaptor.addChild(root_0, MINUS439_tree);
                    }

                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument6008);
                    bytecodeType440=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType440.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:691:5: PLUS bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    PLUS441=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleBytecodeTypeArgument6014); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS441_tree = 
                    (Object)adaptor.create(PLUS441)
                    ;
                    adaptor.addChild(root_0, PLUS441_tree);
                    }

                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument6016);
                    bytecodeType442=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType442.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:692:5: STAR
                    {
                    root_0 = (Object)adaptor.nil();


                    STAR443=(Token)match(input,STAR,FOLLOW_STAR_in_simpleBytecodeTypeArgument6022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STAR443_tree = 
                    (Object)adaptor.create(STAR443)
                    ;
                    adaptor.addChild(root_0, STAR443_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleBytecodeTypeArgument"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:699:1: identifier : ( IDENTIFIER |v1= BaseType -> IDENTIFIER[$v1] |v2= VoidType -> IDENTIFIER[$v2] |v3= Constant_type -> IDENTIFIER[$v3] );
    public final JVMParser.identifier_return identifier() throws RecognitionException {
        JVMParser.identifier_return retval = new JVMParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token v1=null;
        Token v2=null;
        Token v3=null;
        Token IDENTIFIER444=null;

        Object v1_tree=null;
        Object v2_tree=null;
        Object v3_tree=null;
        Object IDENTIFIER444_tree=null;
        RewriteRuleTokenStream stream_VoidType=new RewriteRuleTokenStream(adaptor,"token VoidType");
        RewriteRuleTokenStream stream_BaseType=new RewriteRuleTokenStream(adaptor,"token BaseType");
        RewriteRuleTokenStream stream_Constant_type=new RewriteRuleTokenStream(adaptor,"token Constant_type");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:700:3: ( IDENTIFIER |v1= BaseType -> IDENTIFIER[$v1] |v2= VoidType -> IDENTIFIER[$v2] |v3= Constant_type -> IDENTIFIER[$v3] )
            int alt113=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt113=1;
                }
                break;
            case BaseType:
                {
                alt113=2;
                }
                break;
            case VoidType:
                {
                alt113=3;
                }
                break;
            case Constant_type:
                {
                alt113=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }

            switch (alt113) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:700:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER444=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier6041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER444_tree = 
                    (Object)adaptor.create(IDENTIFIER444)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER444_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:701:5: v1= BaseType
                    {
                    v1=(Token)match(input,BaseType,FOLLOW_BaseType_in_identifier6050); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BaseType.add(v1);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 701:21: -> IDENTIFIER[$v1]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v1)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:702:5: v2= VoidType
                    {
                    v2=(Token)match(input,VoidType,FOLLOW_VoidType_in_identifier6067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VoidType.add(v2);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 702:21: -> IDENTIFIER[$v2]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v2)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:703:5: v3= Constant_type
                    {
                    v3=(Token)match(input,Constant_type,FOLLOW_Constant_type_in_identifier6084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constant_type.add(v3);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 703:23: -> IDENTIFIER[$v3]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v3)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class keywordAggregate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keywordAggregate"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:706:1: keywordAggregate : ( identifier |v1= primitiveType -> IDENTIFIER[$v1.text] |v2= EXTENDS -> IDENTIFIER[$v2] |v3= IMPLEMENTS -> IDENTIFIER[$v3] |v4= DEFAULT -> IDENTIFIER[$v4] |v5= CLASS -> IDENTIFIER[$v5] |v6= THROWS -> IDENTIFIER[$v6] |v7= SUPER -> IDENTIFIER[$v7] |v8= NATIVE -> IDENTIFIER[$v8] );
    public final JVMParser.keywordAggregate_return keywordAggregate() throws RecognitionException {
        JVMParser.keywordAggregate_return retval = new JVMParser.keywordAggregate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token v2=null;
        Token v3=null;
        Token v4=null;
        Token v5=null;
        Token v6=null;
        Token v7=null;
        Token v8=null;
        JVMParser.primitiveType_return v1 =null;

        JVMParser.identifier_return identifier445 =null;


        Object v2_tree=null;
        Object v3_tree=null;
        Object v4_tree=null;
        Object v5_tree=null;
        Object v6_tree=null;
        Object v7_tree=null;
        Object v8_tree=null;
        RewriteRuleTokenStream stream_NATIVE=new RewriteRuleTokenStream(adaptor,"token NATIVE");
        RewriteRuleTokenStream stream_THROWS=new RewriteRuleTokenStream(adaptor,"token THROWS");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:707:3: ( identifier |v1= primitiveType -> IDENTIFIER[$v1.text] |v2= EXTENDS -> IDENTIFIER[$v2] |v3= IMPLEMENTS -> IDENTIFIER[$v3] |v4= DEFAULT -> IDENTIFIER[$v4] |v5= CLASS -> IDENTIFIER[$v5] |v6= THROWS -> IDENTIFIER[$v6] |v7= SUPER -> IDENTIFIER[$v7] |v8= NATIVE -> IDENTIFIER[$v8] )
            int alt114=9;
            switch ( input.LA(1) ) {
            case BaseType:
            case Constant_type:
            case IDENTIFIER:
            case VoidType:
                {
                alt114=1;
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
                alt114=2;
                }
                break;
            case EXTENDS:
                {
                alt114=3;
                }
                break;
            case IMPLEMENTS:
                {
                alt114=4;
                }
                break;
            case DEFAULT:
                {
                alt114=5;
                }
                break;
            case CLASS:
                {
                alt114=6;
                }
                break;
            case THROWS:
                {
                alt114=7;
                }
                break;
            case SUPER:
                {
                alt114=8;
                }
                break;
            case NATIVE:
                {
                alt114=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }

            switch (alt114) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:707:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_keywordAggregate6103);
                    identifier445=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier445.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:708:5: v1= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_keywordAggregate6112);
                    v1=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(v1.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 708:23: -> IDENTIFIER[$v1.text]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, (v1!=null?input.toString(v1.start,v1.stop):null))
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:709:5: v2= EXTENDS
                    {
                    v2=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_keywordAggregate6126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(v2);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 709:19: -> IDENTIFIER[$v2]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v2)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:710:5: v3= IMPLEMENTS
                    {
                    v3=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_keywordAggregate6142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(v3);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 710:21: -> IDENTIFIER[$v3]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v3)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:711:5: v4= DEFAULT
                    {
                    v4=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_keywordAggregate6157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(v4);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 711:19: -> IDENTIFIER[$v4]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v4)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:712:5: v5= CLASS
                    {
                    v5=(Token)match(input,CLASS,FOLLOW_CLASS_in_keywordAggregate6173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS.add(v5);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 712:19: -> IDENTIFIER[$v5]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v5)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:713:5: v6= THROWS
                    {
                    v6=(Token)match(input,THROWS,FOLLOW_THROWS_in_keywordAggregate6191); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROWS.add(v6);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 713:19: -> IDENTIFIER[$v6]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v6)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:714:5: v7= SUPER
                    {
                    v7=(Token)match(input,SUPER,FOLLOW_SUPER_in_keywordAggregate6208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(v7);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 714:17: -> IDENTIFIER[$v7]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v7)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:715:5: v8= NATIVE
                    {
                    v8=(Token)match(input,NATIVE,FOLLOW_NATIVE_in_keywordAggregate6224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NATIVE.add(v8);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 715:17: -> IDENTIFIER[$v8]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(IDENTIFIER, v8)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keywordAggregate"


    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:718:1: primitiveType : ( boolean_type | numeric_type | VOID );
    public final JVMParser.primitiveType_return primitiveType() throws RecognitionException {
        JVMParser.primitiveType_return retval = new JVMParser.primitiveType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID448=null;
        JVMParser.boolean_type_return boolean_type446 =null;

        JVMParser.numeric_type_return numeric_type447 =null;


        Object VOID448_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:719:3: ( boolean_type | numeric_type | VOID )
            int alt115=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt115=1;
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
                alt115=2;
                }
                break;
            case VOID:
                {
                alt115=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }

            switch (alt115) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:719:5: boolean_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_boolean_type_in_primitiveType6244);
                    boolean_type446=boolean_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_type446.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:720:5: numeric_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numeric_type_in_primitiveType6250);
                    numeric_type447=numeric_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_type447.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:721:5: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID448=(Token)match(input,VOID,FOLLOW_VOID_in_primitiveType6256); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID448_tree = 
                    (Object)adaptor.create(VOID448)
                    ;
                    adaptor.addChild(root_0, VOID448_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primitiveType"


    public static class boolean_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:724:1: boolean_type : BOOLEAN ;
    public final JVMParser.boolean_type_return boolean_type() throws RecognitionException {
        JVMParser.boolean_type_return retval = new JVMParser.boolean_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN449=null;

        Object BOOLEAN449_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:725:3: ( BOOLEAN )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:725:5: BOOLEAN
            {
            root_0 = (Object)adaptor.nil();


            BOOLEAN449=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type6269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN449_tree = 
            (Object)adaptor.create(BOOLEAN449)
            ;
            adaptor.addChild(root_0, BOOLEAN449_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_type"


    public static class numeric_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numeric_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:728:1: numeric_type : ( floating_point_type | integral_type );
    public final JVMParser.numeric_type_return numeric_type() throws RecognitionException {
        JVMParser.numeric_type_return retval = new JVMParser.numeric_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.floating_point_type_return floating_point_type450 =null;

        JVMParser.integral_type_return integral_type451 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:729:3: ( floating_point_type | integral_type )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==DOUBLE||LA116_0==FLOAT) ) {
                alt116=1;
            }
            else if ( (LA116_0==BYTE||LA116_0==CHAR||LA116_0==INT||LA116_0==LONG||LA116_0==SHORT) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;

            }
            switch (alt116) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:729:5: floating_point_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_floating_point_type_in_numeric_type6282);
                    floating_point_type450=floating_point_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, floating_point_type450.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:730:5: integral_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_integral_type_in_numeric_type6288);
                    integral_type451=integral_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integral_type451.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numeric_type"


    public static class integral_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integral_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:733:1: integral_type : ( BYTE | SHORT | INT | LONG | CHAR );
    public final JVMParser.integral_type_return integral_type() throws RecognitionException {
        JVMParser.integral_type_return retval = new JVMParser.integral_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set452=null;

        Object set452_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:734:3: ( BYTE | SHORT | INT | LONG | CHAR )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set452=(Token)input.LT(1);

            if ( input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set452)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "integral_type"


    public static class floating_point_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "floating_point_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:741:1: floating_point_type : ( FLOAT | DOUBLE );
    public final JVMParser.floating_point_type_return floating_point_type() throws RecognitionException {
        JVMParser.floating_point_type_return retval = new JVMParser.floating_point_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set453=null;

        Object set453_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:742:3: ( FLOAT | DOUBLE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set453=(Token)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set453)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "floating_point_type"


    public static class literals_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literals"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:746:1: literals : ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER );
    public final JVMParser.literals_return literals() throws RecognitionException {
        JVMParser.literals_return retval = new JVMParser.literals_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LONGLITERAL454=null;
        Token INTLITERAL455=null;
        Token FLOATLITERAL456=null;
        Token DOUBLELITERAL457=null;
        Token CHARLITERAL458=null;
        Token STRINGLITERAL459=null;
        Token BOOLEANLITERAL460=null;
        Token MINUS461=null;
        Token IDENTIFIER462=null;

        Object LONGLITERAL454_tree=null;
        Object INTLITERAL455_tree=null;
        Object FLOATLITERAL456_tree=null;
        Object DOUBLELITERAL457_tree=null;
        Object CHARLITERAL458_tree=null;
        Object STRINGLITERAL459_tree=null;
        Object BOOLEANLITERAL460_tree=null;
        Object MINUS461_tree=null;
        Object IDENTIFIER462_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:747:3: ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER )
            int alt118=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt118=1;
                }
                break;
            case INTLITERAL:
                {
                alt118=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt118=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt118=4;
                }
                break;
            case CHARLITERAL:
                {
                alt118=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt118=6;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt118=7;
                }
                break;
            case IDENTIFIER:
            case MINUS:
                {
                alt118=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;

            }

            switch (alt118) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:747:5: LONGLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    LONGLITERAL454=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literals6357); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONGLITERAL454_tree = 
                    (Object)adaptor.create(LONGLITERAL454)
                    ;
                    adaptor.addChild(root_0, LONGLITERAL454_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:748:5: INTLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    INTLITERAL455=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literals6363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL455_tree = 
                    (Object)adaptor.create(INTLITERAL455)
                    ;
                    adaptor.addChild(root_0, INTLITERAL455_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:749:5: FLOATLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOATLITERAL456=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literals6369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOATLITERAL456_tree = 
                    (Object)adaptor.create(FLOATLITERAL456)
                    ;
                    adaptor.addChild(root_0, FLOATLITERAL456_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:750:5: DOUBLELITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLELITERAL457=(Token)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literals6375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLELITERAL457_tree = 
                    (Object)adaptor.create(DOUBLELITERAL457)
                    ;
                    adaptor.addChild(root_0, DOUBLELITERAL457_tree);
                    }

                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:751:5: CHARLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARLITERAL458=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literals6381); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARLITERAL458_tree = 
                    (Object)adaptor.create(CHARLITERAL458)
                    ;
                    adaptor.addChild(root_0, CHARLITERAL458_tree);
                    }

                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:752:5: STRINGLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRINGLITERAL459=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literals6387); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRINGLITERAL459_tree = 
                    (Object)adaptor.create(STRINGLITERAL459)
                    ;
                    adaptor.addChild(root_0, STRINGLITERAL459_tree);
                    }

                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:753:5: BOOLEANLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    BOOLEANLITERAL460=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literals6393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEANLITERAL460_tree = 
                    (Object)adaptor.create(BOOLEANLITERAL460)
                    ;
                    adaptor.addChild(root_0, BOOLEANLITERAL460_tree);
                    }

                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:754:5: ( MINUS )? IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:754:5: ( MINUS )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==MINUS) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:754:5: MINUS
                            {
                            MINUS461=(Token)match(input,MINUS,FOLLOW_MINUS_in_literals6399); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            MINUS461_tree = 
                            (Object)adaptor.create(MINUS461)
                            ;
                            adaptor.addChild(root_0, MINUS461_tree);
                            }

                            }
                            break;

                    }


                    IDENTIFIER462=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literals6402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER462_tree = 
                    (Object)adaptor.create(IDENTIFIER462)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER462_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literals"


    public static class pc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pc"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:757:1: pc : INTLITERAL COLON -> INTLITERAL COLON ;
    public final JVMParser.pc_return pc() throws RecognitionException {
        JVMParser.pc_return retval = new JVMParser.pc_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL463=null;
        Token COLON464=null;

        Object INTLITERAL463_tree=null;
        Object COLON464_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:758:3: ( INTLITERAL COLON -> INTLITERAL COLON )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:758:5: INTLITERAL COLON
            {
            INTLITERAL463=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc6415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL463);


            COLON464=(Token)match(input,COLON,FOLLOW_COLON_in_pc6417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON464);


            // AST REWRITE
            // elements: COLON, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 758:22: -> INTLITERAL COLON
            {
                adaptor.addChild(root_0, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_0, 
                stream_COLON.nextNode()
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pc"

    // $ANTLR start synpred1_JVM
    public final void synpred1_JVM_fragment() throws RecognitionException {
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:254:5: ( methodDefinition )
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:254:6: methodDefinition
        {
        pushFollow(FOLLOW_methodDefinition_in_synpred1_JVM1891);
        methodDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_JVM

    // $ANTLR start synpred2_JVM
    public final void synpred2_JVM_fragment() throws RecognitionException {
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:255:5: ( ctorDefinition )
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:255:6: ctorDefinition
        {
        pushFollow(FOLLOW_ctorDefinition_in_synpred2_JVM1903);
        ctorDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_JVM

    // $ANTLR start synpred3_JVM
    public final void synpred3_JVM_fragment() throws RecognitionException {
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:256:5: ( fieldDefinition )
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:256:6: fieldDefinition
        {
        pushFollow(FOLLOW_fieldDefinition_in_synpred3_JVM1915);
        fieldDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_JVM

    // Delegated rules

    public final boolean synpred3_JVM() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_JVM_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_JVM() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_JVM_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_JVM() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_JVM_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_class_file_in_program196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_class_file_header_in_class_file207 = new BitSet(new long[]{0x0080000800208010L,0x0000220000000082L,0x0000000400000000L});
    public static final BitSet FOLLOW_classDefinition_in_class_file209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header247 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info297 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info299 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_modified_file_info301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info348 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexDigits_in_checksum_file_info375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition441 = new BitSet(new long[]{0x0080000800208010L,0x0000200000000082L,0x0000000400000000L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition444 = new BitSet(new long[]{0x0080000800208010L,0x0000200000000082L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeName_in_classDefinition447 = new BitSet(new long[]{0x0400C40000000000L,0x0040000000010406L,0x0000000000009E00L});
    public static final BitSet FOLLOW_typeParameters_in_classDefinition449 = new BitSet(new long[]{0x0400C40000000000L,0x0040000000000406L,0x0000000000009E00L});
    public static final BitSet FOLLOW_EXTENDS_in_classDefinition453 = new BitSet(new long[]{0x010000880004D000L,0x0200200000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_typeList_in_classDefinition457 = new BitSet(new long[]{0x0400840000000000L,0x0040000000000406L,0x0000000000009E00L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_classDefinition462 = new BitSet(new long[]{0x010000880004D000L,0x0200200000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_typeList_in_classDefinition466 = new BitSet(new long[]{0x0400840000000000L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_type_info_in_classDefinition475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_classDefinition487 = new BitSet(new long[]{0x018000880004D010L,0x0200638080030042L,0x0000000700080114L});
    public static final BitSet FOLLOW_classBody_in_classDefinition494 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_classDefinition501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info700 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_minor_major_version_info_in_type_info706 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_flags_in_type_info712 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info718 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info725 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info731 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info737 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info743 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_deprecated_in_type_info749 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_synthetic_in_type_info755 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_scala_info_in_type_info761 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic776 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated799 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod822 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod824 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod826 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_sourcefile_info859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ScalaSig_in_scalaSig_info881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scalaSig_info887 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scalaSig_info889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Scala_in_scala_info970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scala_info976 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scala_info978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scala_info980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition1017 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info1042 = new BitSet(new long[]{0x0080000010000010L,0x0000038080000000L,0x0000000000000114L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info1044 = new BitSet(new long[]{0x0080000010000012L,0x0000038080000000L,0x0000000000000114L});
    public static final BitSet FOLLOW_method_visual_modifier_in_innerclass_info_line1070 = new BitSet(new long[]{0x0080000010000010L,0x0000000080000000L,0x0000000000000114L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line1073 = new BitSet(new long[]{0x0080000010000010L,0x0000000080000000L,0x0000000000000114L});
    public static final BitSet FOLLOW_innerclass_info_data_in_innerclass_info_line1076 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_innerclass_info_line1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1116 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_data1119 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_data1128 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info1224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info1226 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_minor_major_version_info1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_major_version_info1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Flag_in_flags1262 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000202L});
    public static final BitSet FOLLOW_accessFlagList_in_flags1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_Marker_in_flags1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList1291 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_accessFlagList1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList1296 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem1369 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_runtimeVisibleAnnotationsItem1373 = new BitSet(new long[]{0x0000000010000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1375 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_runtimeVisibleAnnotationsItem1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1401 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_runtimeVisibleAnnotationAssignList1404 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1406 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign1425 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign1427 = new BitSet(new long[]{0x0000000000000200L,0x0000000000008000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationAssign1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationValue1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationValue1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_brackedAnnotationAssign1470 = new BitSet(new long[]{0x0000000000000200L,0x0000800000000000L});
    public static final BitSet FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign1472 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACK_in_brackedAnnotationAssign1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1523 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_brackedAnnotationAssignList1526 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1528 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue1550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_brackedAnnotationAssignValue1553 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue1555 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_brackedAnnotationAssignValue1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations1588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1676 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_parameterVisibilityInfo1708 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1752 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1756 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_runtimeInvisibleAnnotationsItem1761 = new BitSet(new long[]{0x0000000010000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1763 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_runtimeInvisibleAnnotationsItem1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1805 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_constant_pool1807 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool1814 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line1841 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line1843 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classBodyEntryDecl_in_classBody1874 = new BitSet(new long[]{0x018000880004D012L,0x0200238080030042L,0x0000000700080114L});
    public static final BitSet FOLLOW_methodDefinition_in_classBodyEntryDecl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBodyEntryDecl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBodyEntryDecl1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition1943 = new BitSet(new long[]{0x018000880004D000L,0x0200200000020042L,0x0000000700080004L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition1946 = new BitSet(new long[]{0x018000880004D000L,0x0200200000020042L,0x0000000700080004L});
    public static final BitSet FOLLOW_type_in_fieldDefinition1949 = new BitSet(new long[]{0x010040A80024D000L,0x0200000080020046L,0x0000000500020040L});
    public static final BitSet FOLLOW_keywordAggregate_in_fieldDefinition1951 = new BitSet(new long[]{0x0000000000000100L,0x0100000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_fieldDefinition1954 = new BitSet(new long[]{0x0200010000082000L,0x0000000010040202L,0x0000000000000020L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition1956 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_fieldDefinition1960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition1967 = new BitSet(new long[]{0x0000040400000002L,0x0050000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition1973 = new BitSet(new long[]{0x0000040400000002L,0x0050000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo2089 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfo2091 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_flags_in_fieldInfo2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo2121 = new BitSet(new long[]{0x0100008000045000L,0x0200000000020040L,0x0000000100000000L});
    public static final BitSet FOLLOW_primitiveType_in_fieldAdditionalInfo2123 = new BitSet(new long[]{0x0200010000082000L,0x0000000010040202L,0x0000000000000020L});
    public static final BitSet FOLLOW_literals_in_fieldAdditionalInfo2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo2141 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo2157 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldAdditionalInfo2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo2173 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo2189 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition2295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_staticCtorDefinition2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_staticCtorDefinition2300 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_staticCtorDefinition2302 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_staticCtorDefinition2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition2311 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition2361 = new BitSet(new long[]{0x0000000800008000L,0x0000200000010002L,0x0000000400000000L});
    public static final BitSet FOLLOW_genericDescriptor_in_ctorDefinition2364 = new BitSet(new long[]{0x0000000800008000L,0x0000200000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeName_in_ctorDefinition2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition2369 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition2371 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_ctorDefinition2374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition2381 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_body_in_ctorDefinition2387 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_visual_modifier_in_methodDefinition2562 = new BitSet(new long[]{0x018000880004D010L,0x0200200080030042L,0x0000000500000114L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition2565 = new BitSet(new long[]{0x018000880004D010L,0x0200200080030042L,0x0000000500000114L});
    public static final BitSet FOLLOW_genericDescriptor_in_methodDefinition2568 = new BitSet(new long[]{0x010000880004D000L,0x0200200000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_type_in_methodDefinition2571 = new BitSet(new long[]{0x010040A80024D000L,0x0200000080020046L,0x0000000500020040L});
    public static final BitSet FOLLOW_keywordAggregate_in_methodDefinition2573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition2575 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_throwClauseMethod_in_methodDefinition2577 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_methodDefinition2580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition2587 = new BitSet(new long[]{0x0004040200000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_body_in_methodDefinition2593 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo2780 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_afterMethodInfoEntry_in_afterMethodInfo2807 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfoEntry2827 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfoEntry2848 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfoEntry2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfoEntry2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfoEntry2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfoEntry2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfoEntry2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfoEntry2922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfoEntry2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfoEntry2952 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfoEntry2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault2992 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault2995 = new BitSet(new long[]{0x0000000000000200L,0x0000000000008000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationDefault2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_methodSignatureInfo3023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_methodSignatureInfo3025 = new BitSet(new long[]{0x0000000000008000L,0x0008000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo3027 = new BitSet(new long[]{0x0000000000008000L,0x0008000000008102L});
    public static final BitSet FOLLOW_RPAREN_in_methodSignatureInfo3030 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L,0x0000000400000000L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3144 = new BitSet(new long[]{0x010000C80004D000L,0x0208200000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_typeList_in_arguments3146 = new BitSet(new long[]{0x0000004000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments3150 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments3152 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments3154 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_body3203 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_body3205 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Code_in_body3213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_codeBlock_in_body3220 = new BitSet(new long[]{0x0002000000000002L,0x0000000003800000L,0x0000000000006000L});
    public static final BitSet FOLLOW_bodyExtension_in_body3226 = new BitSet(new long[]{0x0002000000000002L,0x0000000003800000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension3264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension3295 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension3326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension3349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension3368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension3400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_codeBlock3444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_instructionSet_in_codeBlock3451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_codeLine_in_instructionSet3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaSwitch_in_instructionSet3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeLine3536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine3538 = new BitSet(new long[]{0x0100008012045002L,0x0200000000020240L,0x0000000100000000L});
    public static final BitSet FOLLOW_operand1_in_codeLine3540 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_codeLine3544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeLine3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd3583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd3585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeBlockEnd3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_operand13628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_operand13635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_operand13641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables3654 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_variables3656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables3658 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_variables3660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable3683 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_variable3685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_javaSwitch3722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch3724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_javaSwitch3730 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch3737 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch3744 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACE_in_javaSwitch3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_switchLine3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine3831 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_switchDefaultLine3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_throwClause3876 = new BitSet(new long[]{0x010000880004D000L,0x0200200000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_typeList_in_throwClause3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_throwClauseMethod3921 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000102L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod3923 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_throwClauseMethod3926 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000102L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod3928 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable4019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable4021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable4023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable4025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable4032 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry4070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry4072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry4074 = new BitSet(new long[]{0x0100008008045000L,0x0200000000020042L,0x0000000100000000L});
    public static final BitSet FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntryValue4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntryValue4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable4157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine4171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine4173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable4221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine4270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine4272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine4274 = new BitSet(new long[]{0x010040A80024D000L,0x0200000080020046L,0x0000000500020044L});
    public static final BitSet FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine4276 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keywordAggregate_in_localVariableTableLineIdentifier4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_localVariableTableLineIdentifier4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable4351 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable4353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable4355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable4362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4408 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4414 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4425 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4436 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable4458 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable4460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable4462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable4469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry4525 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry4527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008200L});
    public static final BitSet FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntryValue4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_stackMapTableTypesContainer4570 = new BitSet(new long[]{0x0100008002245000L,0x0200800000020042L,0x0000000100000000L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer4572 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACK_in_stackMapTableTypesContainer4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes4606 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_stackMapTableTypes4610 = new BitSet(new long[]{0x0100008000245000L,0x0200000000020042L,0x0000000100000000L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes4612 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableType4643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableType4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject4659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableTypePlainObject4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject4708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList4730 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList4733 = new BitSet(new long[]{0x010000880004D000L,0x0200200000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_type_in_typeList4735 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_combinedJavaType_in_type4779 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_LBRACK_in_type4782 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type4784 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_combinedJavaType4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenceType_in_combinedJavaType4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType4843 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_referenceType4846 = new BitSet(new long[]{0x0000000800008000L,0x0000200000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType4848 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_typeName_in_typeDeclSpecifier4872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_typeArguments_in_typeDeclSpecifier4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeName4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QualifiedType_in_typeName4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_typeArguments4976 = new BitSet(new long[]{0x010000880004D000L,0x0200280000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_typeArgumentList_in_typeArguments4978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_typeArguments4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgument_in_typeArgumentList5011 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeArgumentList5014 = new BitSet(new long[]{0x010000880004D000L,0x0200280000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_typeArgument_in_typeArgumentList5016 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_type_in_typeArgument5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_typeArgument5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_wildcard5062 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_wildcardBounds_in_wildcard5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_wildcardBounds5105 = new BitSet(new long[]{0x010000880004D000L,0x0200200000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_type_in_wildcardBounds5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_wildcardBounds5152 = new BitSet(new long[]{0x010000880004D000L,0x0200200000020042L,0x0000000500000000L});
    public static final BitSet FOLLOW_type_in_wildcardBounds5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_typeParameters5207 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters5209 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_typeParameters5212 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters5214 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_typeParameters5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeParameter5235 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_typeBound5281 = new BitSet(new long[]{0x0000000800008000L,0x0000200000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_referenceType_in_typeBound5283 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_typeBound5286 = new BitSet(new long[]{0x0000000800008000L,0x0000200000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_referenceType_in_typeBound5288 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_LESST_in_genericDescriptor5316 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor5318 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_genericDescriptor5321 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor5323 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_genericDescriptor5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor5344 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor5346 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000400000000L});
    public static final BitSet FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList5387 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_bytecodeReferenceTypeList5390 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000400000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList5392 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType5420 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_bytecodeReferenceType5423 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000400000000L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType5425 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier5449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_bytecodeTypeName5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeTypeName5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_bytecodeTypeArguments5566 = new BitSet(new long[]{0x0000000800008000L,0x0000080000000102L,0x0000000400000000L});
    public static final BitSet FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments5568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_bytecodeTypeArguments5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList5601 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_bytecodeTypeArgumentList5604 = new BitSet(new long[]{0x0000000800008000L,0x0000080000000102L,0x0000000400000000L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList5606 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bytecodeWildcard5644 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_bytecodeWildcardBounds5687 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000400000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_bytecodeWildcardBounds5725 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000400000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeType5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_bytecodeType5786 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType5805 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType5820 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_simpleBytecodeObjectType5823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType5825 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType5844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleBytecodeReferenceTypeName5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_simpleBytecodeTypeArguments5943 = new BitSet(new long[]{0x0000000000008000L,0x0000004010008102L,0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments5945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_simpleBytecodeTypeArguments5947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList5977 = new BitSet(new long[]{0x0000000000008002L,0x0000004010008102L,0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList5980 = new BitSet(new long[]{0x0000000000008002L,0x0000004010008102L,0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleBytecodeTypeArgument6006 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleBytecodeTypeArgument6014 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_simpleBytecodeTypeArgument6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_identifier6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_identifier6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_type_in_identifier6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_keywordAggregate6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_keywordAggregate6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_keywordAggregate6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_keywordAggregate6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_keywordAggregate6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_keywordAggregate6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_keywordAggregate6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_keywordAggregate6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_keywordAggregate6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literals6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literals6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literals6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literals6375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literals6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literals6387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literals6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literals6399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literals6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc6415 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pc6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_synpred1_JVM1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_synpred2_JVM1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_synpred3_JVM1915 = new BitSet(new long[]{0x0000000000000002L});

}