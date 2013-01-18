// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g 2013-01-18 12:17:06

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:42:1: program : ( class_file )* ;
    public final JVMParser.program_return program() throws RecognitionException {
        JVMParser.program_return retval = new JVMParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_return class_file1 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:42:9: ( ( class_file )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:42:11: ( class_file )*
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:42:11: ( class_file )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:42:11: class_file
            	    {
            	    pushFollow(FOLLOW_class_file_in_program190);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:44:1: class_file : class_file_header classDefinition -> ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) ;
    public final JVMParser.class_file_return class_file() throws RecognitionException {
        JVMParser.class_file_return retval = new JVMParser.class_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_header_return class_file_header2 =null;

        JVMParser.classDefinition_return classDefinition3 =null;


        RewriteRuleSubtreeStream stream_class_file_header=new RewriteRuleSubtreeStream(adaptor,"rule class_file_header");
        RewriteRuleSubtreeStream stream_classDefinition=new RewriteRuleSubtreeStream(adaptor,"rule classDefinition");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:45:3: ( class_file_header classDefinition -> ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:45:5: class_file_header classDefinition
            {
            pushFollow(FOLLOW_class_file_header_in_class_file201);
            class_file_header2=class_file_header();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_class_file_header.add(class_file_header2.getTree());

            pushFollow(FOLLOW_classDefinition_in_class_file203);
            classDefinition3=classDefinition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classDefinition.add(classDefinition3.getTree());

            // AST REWRITE
            // elements: classDefinition, class_file_header
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:39: -> ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:45:42: ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASSFILE, "CLASSFILE")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:45:54: ^( CFHEADER class_file_header )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:47:1: class_file_header : class_file_info modified_file_info checksum_file_info ( compiled_file_info )? ;
    public final JVMParser.class_file_header_return class_file_header() throws RecognitionException {
        JVMParser.class_file_header_return retval = new JVMParser.class_file_header_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_info_return class_file_info4 =null;

        JVMParser.modified_file_info_return modified_file_info5 =null;

        JVMParser.checksum_file_info_return checksum_file_info6 =null;

        JVMParser.compiled_file_info_return compiled_file_info7 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:48:3: ( class_file_info modified_file_info checksum_file_info ( compiled_file_info )? )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:48:5: class_file_info modified_file_info checksum_file_info ( compiled_file_info )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_class_file_info_in_class_file_header229);
            class_file_info4=class_file_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, class_file_info4.getTree());

            pushFollow(FOLLOW_modified_file_info_in_class_file_header235);
            modified_file_info5=modified_file_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modified_file_info5.getTree());

            pushFollow(FOLLOW_checksum_file_info_in_class_file_header241);
            checksum_file_info6=checksum_file_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, checksum_file_info6.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:51:5: ( compiled_file_info )?
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:51:5: compiled_file_info
                    {
                    pushFollow(FOLLOW_compiled_file_info_in_class_file_header247);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:53:1: class_file_info : IDENTIFIER WINDOWSPATH -> ^( IDENTIFIER WINDOWSPATH ) ;
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:54:3: ( IDENTIFIER WINDOWSPATH -> ^( IDENTIFIER WINDOWSPATH ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:54:5: IDENTIFIER WINDOWSPATH
            {
            IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_file_info260); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER8);


            WINDOWSPATH9=(Token)match(input,WINDOWSPATH,FOLLOW_WINDOWSPATH_in_class_file_info262); if (state.failed) return retval; 
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
            // 54:28: -> ^( IDENTIFIER WINDOWSPATH )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:54:31: ^( IDENTIFIER WINDOWSPATH )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:57:1: modified_file_info : i1= IDENTIFIER i2= IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER -> ^( $i1 $i2 DATE IDENTIFIER INTLITERAL IDENTIFIER ) ;
    public final JVMParser.modified_file_info_return modified_file_info() throws RecognitionException {
        JVMParser.modified_file_info_return retval = new JVMParser.modified_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token DATE10=null;
        Token SEMI11=null;
        Token IDENTIFIER12=null;
        Token INTLITERAL13=null;
        Token IDENTIFIER14=null;

        Object i1_tree=null;
        Object i2_tree=null;
        Object DATE10_tree=null;
        Object SEMI11_tree=null;
        Object IDENTIFIER12_tree=null;
        Object INTLITERAL13_tree=null;
        Object IDENTIFIER14_tree=null;
        RewriteRuleTokenStream stream_DATE=new RewriteRuleTokenStream(adaptor,"token DATE");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:58:3: (i1= IDENTIFIER i2= IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER -> ^( $i1 $i2 DATE IDENTIFIER INTLITERAL IDENTIFIER ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:58:5: i1= IDENTIFIER i2= IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER
            {
            i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i1);


            i2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i2);


            DATE10=(Token)match(input,DATE,FOLLOW_DATE_in_modified_file_info293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATE.add(DATE10);


            SEMI11=(Token)match(input,SEMI,FOLLOW_SEMI_in_modified_file_info295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI11);


            IDENTIFIER12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER12);


            INTLITERAL13=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_modified_file_info299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL13);


            IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info301); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER14);


            // AST REWRITE
            // elements: IDENTIFIER, i1, DATE, IDENTIFIER, INTLITERAL, i2
            // token labels: i2, i1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_i2=new RewriteRuleTokenStream(adaptor,"token i2",i2);
            RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:76: -> ^( $i1 $i2 DATE IDENTIFIER INTLITERAL IDENTIFIER )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:58:79: ^( $i1 $i2 DATE IDENTIFIER INTLITERAL IDENTIFIER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_i1.nextNode(), root_1);

                adaptor.addChild(root_1, stream_i2.nextNode());

                adaptor.addChild(root_1, 
                stream_DATE.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
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
    // $ANTLR end "modified_file_info"


    public static class checksum_file_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "checksum_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:61:1: checksum_file_info : IDENTIFIER IDENTIFIER (id= IDENTIFIER -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] ) | HexDigits -> ^( IDENTIFIER IDENTIFIER HexDigits ) ) ;
    public final JVMParser.checksum_file_info_return checksum_file_info() throws RecognitionException {
        JVMParser.checksum_file_info_return retval = new JVMParser.checksum_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token IDENTIFIER15=null;
        Token IDENTIFIER16=null;
        Token HexDigits17=null;

        Object id_tree=null;
        Object IDENTIFIER15_tree=null;
        Object IDENTIFIER16_tree=null;
        Object HexDigits17_tree=null;
        RewriteRuleTokenStream stream_HexDigits=new RewriteRuleTokenStream(adaptor,"token HexDigits");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:62:3: ( IDENTIFIER IDENTIFIER (id= IDENTIFIER -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] ) | HexDigits -> ^( IDENTIFIER IDENTIFIER HexDigits ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:62:5: IDENTIFIER IDENTIFIER (id= IDENTIFIER -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] ) | HexDigits -> ^( IDENTIFIER IDENTIFIER HexDigits ) )
            {
            IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info334); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER15);


            IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER16);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:63:3: (id= IDENTIFIER -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] ) | HexDigits -> ^( IDENTIFIER IDENTIFIER HexDigits ) )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:63:4: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info344); if (state.failed) return retval; 
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
                    // 63:19: -> ^( IDENTIFIER IDENTIFIER HexDigits[$id] )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:63:22: ^( IDENTIFIER IDENTIFIER HexDigits[$id] )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:64:5: HexDigits
                    {
                    HexDigits17=(Token)match(input,HexDigits,FOLLOW_HexDigits_in_checksum_file_info363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HexDigits.add(HexDigits17);


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
                    // 64:19: -> ^( IDENTIFIER IDENTIFIER HexDigits )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:64:22: ^( IDENTIFIER IDENTIFIER HexDigits )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:68:1: compiled_file_info : IDENTIFIER IDENTIFIER STRINGLITERAL -> ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) ;
    public final JVMParser.compiled_file_info_return compiled_file_info() throws RecognitionException {
        JVMParser.compiled_file_info_return retval = new JVMParser.compiled_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER18=null;
        Token IDENTIFIER19=null;
        Token STRINGLITERAL20=null;

        Object IDENTIFIER18_tree=null;
        Object IDENTIFIER19_tree=null;
        Object STRINGLITERAL20_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:69:3: ( IDENTIFIER IDENTIFIER STRINGLITERAL -> ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:69:5: IDENTIFIER IDENTIFIER STRINGLITERAL
            {
            IDENTIFIER18=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info398); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER18);


            IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info400); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER19);


            STRINGLITERAL20=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_compiled_file_info402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL20);


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
            // 69:41: -> ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:69:44: ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:76:1: classDefinition : ( class_visual_modifier )? ( class_modifier )* typeName ( typeParameters )? ( EXTENDS typeList )? ( IMPLEMENTS typeList )? type_info constant_pool LBRACE ( classBody )? RBRACE -> ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) ;
    public final JVMParser.classDefinition_return classDefinition() throws RecognitionException {
        JVMParser.classDefinition_return retval = new JVMParser.classDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS25=null;
        Token IMPLEMENTS27=null;
        Token LBRACE31=null;
        Token RBRACE33=null;
        JVMParser.class_visual_modifier_return class_visual_modifier21 =null;

        JVMParser.class_modifier_return class_modifier22 =null;

        JVMParser.typeName_return typeName23 =null;

        JVMParser.typeParameters_return typeParameters24 =null;

        JVMParser.typeList_return typeList26 =null;

        JVMParser.typeList_return typeList28 =null;

        JVMParser.type_info_return type_info29 =null;

        JVMParser.constant_pool_return constant_pool30 =null;

        JVMParser.classBody_return classBody32 =null;


        Object EXTENDS25_tree=null;
        Object IMPLEMENTS27_tree=null;
        Object LBRACE31_tree=null;
        Object RBRACE33_tree=null;
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:3: ( ( class_visual_modifier )? ( class_modifier )* typeName ( typeParameters )? ( EXTENDS typeList )? ( IMPLEMENTS typeList )? type_info constant_pool LBRACE ( classBody )? RBRACE -> ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:5: ( class_visual_modifier )? ( class_modifier )* typeName ( typeParameters )? ( EXTENDS typeList )? ( IMPLEMENTS typeList )? type_info constant_pool LBRACE ( classBody )? RBRACE
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:5: ( class_visual_modifier )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PUBLIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:5: class_visual_modifier
                    {
                    pushFollow(FOLLOW_class_visual_modifier_in_classDefinition429);
                    class_visual_modifier21=class_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_class_visual_modifier.add(class_visual_modifier21.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:28: ( class_modifier )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ABSTRACT||LA5_0==CLASS||LA5_0==FINAL||LA5_0==INTERFACE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:28: class_modifier
            	    {
            	    pushFollow(FOLLOW_class_modifier_in_classDefinition432);
            	    class_modifier22=class_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_class_modifier.add(class_modifier22.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            pushFollow(FOLLOW_typeName_in_classDefinition435);
            typeName23=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName23.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:53: ( typeParameters )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LESST) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:53: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_classDefinition437);
                    typeParameters24=typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParameters.add(typeParameters24.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:69: ( EXTENDS typeList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EXTENDS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:70: EXTENDS typeList
                    {
                    EXTENDS25=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classDefinition441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS25);


                    pushFollow(FOLLOW_typeList_in_classDefinition443);
                    typeList26=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList26.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:89: ( IMPLEMENTS typeList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IMPLEMENTS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:77:90: IMPLEMENTS typeList
                    {
                    IMPLEMENTS27=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_classDefinition448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS27);


                    pushFollow(FOLLOW_typeList_in_classDefinition450);
                    typeList28=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList28.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_type_info_in_classDefinition459);
            type_info29=type_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_info.add(type_info29.getTree());

            pushFollow(FOLLOW_constant_pool_in_classDefinition465);
            constant_pool30=constant_pool();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constant_pool.add(constant_pool30.getTree());

            LBRACE31=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDefinition471); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE31);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:81:5: ( classBody )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ABSTRACT||LA9_0==BOOLEAN||(LA9_0 >= BYTE && LA9_0 <= BaseType)||LA9_0==CHAR||LA9_0==Constant_type||LA9_0==DOUBLE||(LA9_0 >= FINAL && LA9_0 <= FLOAT)||LA9_0==IDENTIFIER||LA9_0==INT||(LA9_0 >= LESST && LA9_0 <= LONG)||LA9_0==NATIVE||(LA9_0 >= PRIVATE && LA9_0 <= PUBLIC)||LA9_0==QualifiedType||LA9_0==SHORT||LA9_0==STATIC||LA9_0==STRICTFP||LA9_0==SYNCHRONIZED||LA9_0==TRANSIENT||(LA9_0 >= VOID && LA9_0 <= VoidType)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:81:5: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classDefinition478);
                    classBody32=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classBody.add(classBody32.getTree());

                    }
                    break;

            }


            RBRACE33=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDefinition485); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE33);


            // AST REWRITE
            // elements: class_modifier, class_visual_modifier, typeList, classBody, constant_pool, typeList, type_info, typeName, typeParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:12: -> ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:17: ^( CLASSDECL ^( VMODIFIER ( class_visual_modifier )? ) ^( MODIFIER ( class_modifier )* ) typeName ^( TPARAMETERS ( typeParameters )? ) ^( CEXTENDS ( typeList )? ) ^( CIMPLEMENTS ( typeList )? ) ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ^( UNITBODY ( classBody )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASSDECL, "CLASSDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:29: ^( VMODIFIER ( class_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:41: ( class_visual_modifier )?
                if ( stream_class_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_class_visual_modifier.nextTree());

                }
                stream_class_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:65: ^( MODIFIER ( class_modifier )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:76: ( class_modifier )*
                while ( stream_class_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_class_modifier.nextTree());

                }
                stream_class_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_typeName.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:102: ^( TPARAMETERS ( typeParameters )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TPARAMETERS, "TPARAMETERS")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:116: ( typeParameters )?
                if ( stream_typeParameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_typeParameters.nextTree());

                }
                stream_typeParameters.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:133: ^( CEXTENDS ( typeList )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CEXTENDS, "CEXTENDS")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:144: ( typeList )?
                if ( stream_typeList.hasNext() ) {
                    adaptor.addChild(root_2, stream_typeList.nextTree());

                }
                stream_typeList.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:155: ^( CIMPLEMENTS ( typeList )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CIMPLEMENTS, "CIMPLEMENTS")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:82:169: ( typeList )?
                if ( stream_typeList.hasNext() ) {
                    adaptor.addChild(root_2, stream_typeList.nextTree());

                }
                stream_typeList.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:83:17: ^( UNITHEADER type_info )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_type_info.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:84:17: ^( CPOOL constant_pool )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CPOOL, "CPOOL")
                , root_2);

                adaptor.addChild(root_2, stream_constant_pool.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:85:17: ^( UNITBODY ( classBody )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITBODY, "UNITBODY")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:85:28: ( classBody )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:89:1: class_visual_modifier : PUBLIC ;
    public final JVMParser.class_visual_modifier_return class_visual_modifier() throws RecognitionException {
        JVMParser.class_visual_modifier_return retval = new JVMParser.class_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PUBLIC34=null;

        Object PUBLIC34_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:90:3: ( PUBLIC )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:90:5: PUBLIC
            {
            root_0 = (Object)adaptor.nil();


            PUBLIC34=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier631); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PUBLIC34_tree = 
            (Object)adaptor.create(PUBLIC34)
            ;
            adaptor.addChild(root_0, PUBLIC34_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:93:1: class_modifier : ( ABSTRACT | FINAL | INTERFACE | CLASS );
    public final JVMParser.class_modifier_return class_modifier() throws RecognitionException {
        JVMParser.class_modifier_return retval = new JVMParser.class_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set35=null;

        Object set35_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:94:3: ( ABSTRACT | FINAL | INTERFACE | CLASS )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set35=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==CLASS||input.LA(1)==FINAL||input.LA(1)==INTERFACE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set35)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:101:1: type_info : ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ ;
    public final JVMParser.type_info_return type_info() throws RecognitionException {
        JVMParser.type_info_return retval = new JVMParser.type_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.sourcefile_info_return sourcefile_info36 =null;

        JVMParser.minor_major_version_info_return minor_major_version_info37 =null;

        JVMParser.flags_return flags38 =null;

        JVMParser.scalaSig_info_return scalaSig_info39 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info40 =null;

        JVMParser.innerclass_info_return innerclass_info41 =null;

        JVMParser.enclosingMethod_return enclosingMethod42 =null;

        JVMParser.signature_info_addition_return signature_info_addition43 =null;

        JVMParser.deprecated_return deprecated44 =null;

        JVMParser.synthetic_return synthetic45 =null;

        JVMParser.scala_info_return scala_info46 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:102:3: ( ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:102:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:102:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:102:6: sourcefile_info
            	    {
            	    pushFollow(FOLLOW_sourcefile_info_in_type_info682);
            	    sourcefile_info36=sourcefile_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sourcefile_info36.getTree());

            	    }
            	    break;
            	case 2 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:103:5: minor_major_version_info
            	    {
            	    pushFollow(FOLLOW_minor_major_version_info_in_type_info688);
            	    minor_major_version_info37=minor_major_version_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, minor_major_version_info37.getTree());

            	    }
            	    break;
            	case 3 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:104:5: flags
            	    {
            	    pushFollow(FOLLOW_flags_in_type_info694);
            	    flags38=flags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, flags38.getTree());

            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:105:5: scalaSig_info
            	    {
            	    pushFollow(FOLLOW_scalaSig_info_in_type_info700);
            	    scalaSig_info39=scalaSig_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalaSig_info39.getTree());

            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:106:5: runtimeVisibleAnnotations_info
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_type_info707);
            	    runtimeVisibleAnnotations_info40=runtimeVisibleAnnotations_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotations_info40.getTree());

            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:107:5: innerclass_info
            	    {
            	    pushFollow(FOLLOW_innerclass_info_in_type_info713);
            	    innerclass_info41=innerclass_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, innerclass_info41.getTree());

            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:108:5: enclosingMethod
            	    {
            	    pushFollow(FOLLOW_enclosingMethod_in_type_info719);
            	    enclosingMethod42=enclosingMethod();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enclosingMethod42.getTree());

            	    }
            	    break;
            	case 8 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:109:5: signature_info_addition
            	    {
            	    pushFollow(FOLLOW_signature_info_addition_in_type_info725);
            	    signature_info_addition43=signature_info_addition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, signature_info_addition43.getTree());

            	    }
            	    break;
            	case 9 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:110:5: deprecated
            	    {
            	    pushFollow(FOLLOW_deprecated_in_type_info731);
            	    deprecated44=deprecated();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, deprecated44.getTree());

            	    }
            	    break;
            	case 10 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:111:5: synthetic
            	    {
            	    pushFollow(FOLLOW_synthetic_in_type_info737);
            	    synthetic45=synthetic();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, synthetic45.getTree());

            	    }
            	    break;
            	case 11 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:112:5: scala_info
            	    {
            	    pushFollow(FOLLOW_scala_info_in_type_info743);
            	    scala_info46=scala_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scala_info46.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:115:1: synthetic : Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) ;
    public final JVMParser.synthetic_return synthetic() throws RecognitionException {
        JVMParser.synthetic_return retval = new JVMParser.synthetic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Synthetic47=null;
        Token BOOLEANLITERAL48=null;

        Object Synthetic47_tree=null;
        Object BOOLEANLITERAL48_tree=null;
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:116:3: ( Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:116:5: Synthetic BOOLEANLITERAL
            {
            Synthetic47=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_synthetic758); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic47);


            BOOLEANLITERAL48=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_synthetic760); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL48);


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
            // 116:30: -> ^( Synthetic BOOLEANLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:116:33: ^( Synthetic BOOLEANLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:119:1: deprecated : Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) ;
    public final JVMParser.deprecated_return deprecated() throws RecognitionException {
        JVMParser.deprecated_return retval = new JVMParser.deprecated_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Deprecated49=null;
        Token BOOLEANLITERAL50=null;

        Object Deprecated49_tree=null;
        Object BOOLEANLITERAL50_tree=null;
        RewriteRuleTokenStream stream_Deprecated=new RewriteRuleTokenStream(adaptor,"token Deprecated");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:120:3: ( Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:120:5: Deprecated BOOLEANLITERAL
            {
            Deprecated49=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_deprecated781); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Deprecated.add(Deprecated49);


            BOOLEANLITERAL50=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_deprecated783); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL50);


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
            // 120:31: -> ^( Deprecated BOOLEANLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:120:34: ^( Deprecated BOOLEANLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:123:1: enclosingMethod : EnclosingMethod CPINDEX DOT ( CPINDEX )? -> ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) ;
    public final JVMParser.enclosingMethod_return enclosingMethod() throws RecognitionException {
        JVMParser.enclosingMethod_return retval = new JVMParser.enclosingMethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EnclosingMethod51=null;
        Token CPINDEX52=null;
        Token DOT53=null;
        Token CPINDEX54=null;

        Object EnclosingMethod51_tree=null;
        Object CPINDEX52_tree=null;
        Object DOT53_tree=null;
        Object CPINDEX54_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_EnclosingMethod=new RewriteRuleTokenStream(adaptor,"token EnclosingMethod");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:124:3: ( EnclosingMethod CPINDEX DOT ( CPINDEX )? -> ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:124:5: EnclosingMethod CPINDEX DOT ( CPINDEX )?
            {
            EnclosingMethod51=(Token)match(input,EnclosingMethod,FOLLOW_EnclosingMethod_in_enclosingMethod804); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EnclosingMethod.add(EnclosingMethod51);


            CPINDEX52=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod806); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX52);


            DOT53=(Token)match(input,DOT,FOLLOW_DOT_in_enclosingMethod808); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT53);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:124:33: ( CPINDEX )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CPINDEX) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:124:33: CPINDEX
                    {
                    CPINDEX54=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX54);


                    }
                    break;

            }


            // AST REWRITE
            // elements: CPINDEX, CPINDEX, EnclosingMethod, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 124:43: -> ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:124:46: ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
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

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:124:76: ( CPINDEX )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:127:1: sourcefile_info : SourceFile STRINGLITERAL -> ^( SourceFile STRINGLITERAL ) ;
    public final JVMParser.sourcefile_info_return sourcefile_info() throws RecognitionException {
        JVMParser.sourcefile_info_return retval = new JVMParser.sourcefile_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SourceFile55=null;
        Token STRINGLITERAL56=null;

        Object SourceFile55_tree=null;
        Object STRINGLITERAL56_tree=null;
        RewriteRuleTokenStream stream_SourceFile=new RewriteRuleTokenStream(adaptor,"token SourceFile");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:128:3: ( SourceFile STRINGLITERAL -> ^( SourceFile STRINGLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:128:5: SourceFile STRINGLITERAL
            {
            SourceFile55=(Token)match(input,SourceFile,FOLLOW_SourceFile_in_sourcefile_info839); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SourceFile.add(SourceFile55);


            STRINGLITERAL56=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_sourcefile_info841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL56);


            // AST REWRITE
            // elements: STRINGLITERAL, SourceFile
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:31: -> ^( SourceFile STRINGLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:128:34: ^( SourceFile STRINGLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:131:1: scalaSig_info : ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL -> ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) ;
    public final JVMParser.scalaSig_info_return scalaSig_info() throws RecognitionException {
        JVMParser.scalaSig_info_return retval = new JVMParser.scalaSig_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ScalaSig57=null;
        Token IDENTIFIER58=null;
        Token ASSIGN59=null;
        Token INTLITERAL60=null;
        Token INTLITERAL61=null;
        Token INTLITERAL62=null;
        Token INTLITERAL63=null;

        Object ScalaSig57_tree=null;
        Object IDENTIFIER58_tree=null;
        Object ASSIGN59_tree=null;
        Object INTLITERAL60_tree=null;
        Object INTLITERAL61_tree=null;
        Object INTLITERAL62_tree=null;
        Object INTLITERAL63_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ScalaSig=new RewriteRuleTokenStream(adaptor,"token ScalaSig");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:132:3: ( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL -> ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:132:5: ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL
            {
            ScalaSig57=(Token)match(input,ScalaSig,FOLLOW_ScalaSig_in_scalaSig_info863); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ScalaSig.add(ScalaSig57);


            IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scalaSig_info869); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER58);


            ASSIGN59=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_scalaSig_info871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN59);


            INTLITERAL60=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info873); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL60);


            INTLITERAL61=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL61);


            INTLITERAL62=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info883); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL62);


            INTLITERAL63=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL63);


            // AST REWRITE
            // elements: INTLITERAL, INTLITERAL, IDENTIFIER, ASSIGN, INTLITERAL, INTLITERAL, ScalaSig
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:9: -> ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:135:13: ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:140:1: scala_info : Scala IDENTIFIER ASSIGN INTLITERAL -> ^( Scala IDENTIFIER ASSIGN INTLITERAL ) ;
    public final JVMParser.scala_info_return scala_info() throws RecognitionException {
        JVMParser.scala_info_return retval = new JVMParser.scala_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Scala64=null;
        Token IDENTIFIER65=null;
        Token ASSIGN66=null;
        Token INTLITERAL67=null;

        Object Scala64_tree=null;
        Object IDENTIFIER65_tree=null;
        Object ASSIGN66_tree=null;
        Object INTLITERAL67_tree=null;
        RewriteRuleTokenStream stream_Scala=new RewriteRuleTokenStream(adaptor,"token Scala");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:141:3: ( Scala IDENTIFIER ASSIGN INTLITERAL -> ^( Scala IDENTIFIER ASSIGN INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:141:5: Scala IDENTIFIER ASSIGN INTLITERAL
            {
            Scala64=(Token)match(input,Scala,FOLLOW_Scala_in_scala_info952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Scala.add(Scala64);


            IDENTIFIER65=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scala_info958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER65);


            ASSIGN66=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_scala_info960); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN66);


            INTLITERAL67=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scala_info962); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL67);


            // AST REWRITE
            // elements: Scala, ASSIGN, IDENTIFIER, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 143:9: -> ^( Scala IDENTIFIER ASSIGN INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:143:13: ^( Scala IDENTIFIER ASSIGN INTLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:146:1: signature_info_addition : Signature ( CPINDEX )? -> ^( Signature ( CPINDEX )? ) ;
    public final JVMParser.signature_info_addition_return signature_info_addition() throws RecognitionException {
        JVMParser.signature_info_addition_return retval = new JVMParser.signature_info_addition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature68=null;
        Token CPINDEX69=null;

        Object Signature68_tree=null;
        Object CPINDEX69_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:147:3: ( Signature ( CPINDEX )? -> ^( Signature ( CPINDEX )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:147:5: Signature ( CPINDEX )?
            {
            Signature68=(Token)match(input,Signature,FOLLOW_Signature_in_signature_info_addition999); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Signature.add(Signature68);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:147:15: ( CPINDEX )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CPINDEX) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:147:15: CPINDEX
                    {
                    CPINDEX69=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_signature_info_addition1001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX69);


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
            // 147:24: -> ^( Signature ( CPINDEX )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:147:27: ^( Signature ( CPINDEX )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Signature.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:147:39: ( CPINDEX )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:150:1: innerclass_info : InnerClasses ( innerclass_info_line )+ -> ^( InnerClasses ( innerclass_info_line )+ ) ;
    public final JVMParser.innerclass_info_return innerclass_info() throws RecognitionException {
        JVMParser.innerclass_info_return retval = new JVMParser.innerclass_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token InnerClasses70=null;
        JVMParser.innerclass_info_line_return innerclass_info_line71 =null;


        Object InnerClasses70_tree=null;
        RewriteRuleTokenStream stream_InnerClasses=new RewriteRuleTokenStream(adaptor,"token InnerClasses");
        RewriteRuleSubtreeStream stream_innerclass_info_line=new RewriteRuleSubtreeStream(adaptor,"rule innerclass_info_line");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:151:3: ( InnerClasses ( innerclass_info_line )+ -> ^( InnerClasses ( innerclass_info_line )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:151:5: InnerClasses ( innerclass_info_line )+
            {
            InnerClasses70=(Token)match(input,InnerClasses,FOLLOW_InnerClasses_in_innerclass_info1024); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_InnerClasses.add(InnerClasses70);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:151:18: ( innerclass_info_line )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:151:18: innerclass_info_line
            	    {
            	    pushFollow(FOLLOW_innerclass_info_line_in_innerclass_info1026);
            	    innerclass_info_line71=innerclass_info_line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_innerclass_info_line.add(innerclass_info_line71.getTree());

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
            // 151:40: -> ^( InnerClasses ( innerclass_info_line )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:151:43: ^( InnerClasses ( innerclass_info_line )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:154:1: innerclass_info_line : ( method_visual_modifier )? ( method_modifier )* innerclass_info_data ( SEMI )? -> ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data ;
    public final JVMParser.innerclass_info_line_return innerclass_info_line() throws RecognitionException {
        JVMParser.innerclass_info_line_return retval = new JVMParser.innerclass_info_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI75=null;
        JVMParser.method_visual_modifier_return method_visual_modifier72 =null;

        JVMParser.method_modifier_return method_modifier73 =null;

        JVMParser.innerclass_info_data_return innerclass_info_data74 =null;


        Object SEMI75_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_innerclass_info_data=new RewriteRuleSubtreeStream(adaptor,"rule innerclass_info_data");
        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        RewriteRuleSubtreeStream stream_method_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_visual_modifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:155:3: ( ( method_visual_modifier )? ( method_modifier )* innerclass_info_data ( SEMI )? -> ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:155:6: ( method_visual_modifier )? ( method_modifier )* innerclass_info_data ( SEMI )?
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:155:6: ( method_visual_modifier )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= PRIVATE && LA14_0 <= PUBLIC)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:155:6: method_visual_modifier
                    {
                    pushFollow(FOLLOW_method_visual_modifier_in_innerclass_info_line1052);
                    method_visual_modifier72=method_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_method_visual_modifier.add(method_visual_modifier72.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:155:30: ( method_modifier )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ABSTRACT||LA15_0==FINAL||LA15_0==NATIVE||LA15_0==STATIC||LA15_0==STRICTFP||LA15_0==SYNCHRONIZED) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:155:30: method_modifier
            	    {
            	    pushFollow(FOLLOW_method_modifier_in_innerclass_info_line1055);
            	    method_modifier73=method_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_method_modifier.add(method_modifier73.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            pushFollow(FOLLOW_innerclass_info_data_in_innerclass_info_line1058);
            innerclass_info_data74=innerclass_info_data();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_innerclass_info_data.add(innerclass_info_data74.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:155:68: ( SEMI )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==SEMI) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:155:68: SEMI
                    {
                    SEMI75=(Token)match(input,SEMI,FOLLOW_SEMI_in_innerclass_info_line1060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI75);


                    }
                    break;

            }


            // AST REWRITE
            // elements: method_visual_modifier, method_modifier, innerclass_info_data
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 156:7: -> ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) innerclass_info_data
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:156:10: ^( VMODIFIER ( method_visual_modifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:156:22: ( method_visual_modifier )?
                if ( stream_method_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_visual_modifier.nextTree());

                }
                stream_method_visual_modifier.reset();

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:156:47: ^( MODIFIER ( method_modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:156:58: ( method_modifier )*
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:159:1: innerclass_info_data : CPINDEX ( ASSIGN cp1= CPINDEX )? ( IDENTIFIER cp2= CPINDEX )? -> ^( CPINDEX ^( INFODATA1 ( ASSIGN $cp1)? ) ^( INFODATA2 ( IDENTIFIER $cp2)? ) ) ;
    public final JVMParser.innerclass_info_data_return innerclass_info_data() throws RecognitionException {
        JVMParser.innerclass_info_data_return retval = new JVMParser.innerclass_info_data_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token cp1=null;
        Token cp2=null;
        Token CPINDEX76=null;
        Token ASSIGN77=null;
        Token IDENTIFIER78=null;

        Object cp1_tree=null;
        Object cp2_tree=null;
        Object CPINDEX76_tree=null;
        Object ASSIGN77_tree=null;
        Object IDENTIFIER78_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:160:3: ( CPINDEX ( ASSIGN cp1= CPINDEX )? ( IDENTIFIER cp2= CPINDEX )? -> ^( CPINDEX ^( INFODATA1 ( ASSIGN $cp1)? ) ^( INFODATA2 ( IDENTIFIER $cp2)? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:160:5: CPINDEX ( ASSIGN cp1= CPINDEX )? ( IDENTIFIER cp2= CPINDEX )?
            {
            CPINDEX76=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1098); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX76);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:160:13: ( ASSIGN cp1= CPINDEX )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ASSIGN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:160:14: ASSIGN cp1= CPINDEX
                    {
                    ASSIGN77=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_innerclass_info_data1101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN77);


                    cp1=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(cp1);


                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:160:35: ( IDENTIFIER cp2= CPINDEX )?
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:160:36: IDENTIFIER cp2= CPINDEX
                    {
                    IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_data1110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER78);


                    cp2=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(cp2);


                    }
                    break;

            }


            // AST REWRITE
            // elements: cp1, IDENTIFIER, ASSIGN, CPINDEX, cp2
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
            // 161:44: -> ^( CPINDEX ^( INFODATA1 ( ASSIGN $cp1)? ) ^( INFODATA2 ( IDENTIFIER $cp2)? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:161:47: ^( CPINDEX ^( INFODATA1 ( ASSIGN $cp1)? ) ^( INFODATA2 ( IDENTIFIER $cp2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CPINDEX.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:161:57: ^( INFODATA1 ( ASSIGN $cp1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INFODATA1, "INFODATA1")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:161:69: ( ASSIGN $cp1)?
                if ( stream_cp1.hasNext()||stream_ASSIGN.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_ASSIGN.nextNode()
                    );

                    adaptor.addChild(root_2, stream_cp1.nextNode());

                }
                stream_cp1.reset();
                stream_ASSIGN.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:161:85: ^( INFODATA2 ( IDENTIFIER $cp2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INFODATA2, "INFODATA2")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:161:97: ( IDENTIFIER $cp2)?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:164:1: minor_major_version_info : IDENTIFIER IDENTIFIER COLON INTLITERAL -> ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) ;
    public final JVMParser.minor_major_version_info_return minor_major_version_info() throws RecognitionException {
        JVMParser.minor_major_version_info_return retval = new JVMParser.minor_major_version_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER79=null;
        Token IDENTIFIER80=null;
        Token COLON81=null;
        Token INTLITERAL82=null;

        Object IDENTIFIER79_tree=null;
        Object IDENTIFIER80_tree=null;
        Object COLON81_tree=null;
        Object INTLITERAL82_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:165:3: ( IDENTIFIER IDENTIFIER COLON INTLITERAL -> ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:165:5: IDENTIFIER IDENTIFIER COLON INTLITERAL
            {
            IDENTIFIER79=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info1206); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER79);


            IDENTIFIER80=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info1208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER80);


            COLON81=(Token)match(input,COLON,FOLLOW_COLON_in_minor_major_version_info1210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON81);


            INTLITERAL82=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_minor_major_version_info1212); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL82);


            // AST REWRITE
            // elements: COLON, IDENTIFIER, IDENTIFIER, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 165:45: -> ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:165:48: ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:168:1: flags : Flag ( accessFlagList )? Marker -> ^( Flag ( accessFlagList )? ) ;
    public final JVMParser.flags_return flags() throws RecognitionException {
        JVMParser.flags_return retval = new JVMParser.flags_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Flag83=null;
        Token Marker85=null;
        JVMParser.accessFlagList_return accessFlagList84 =null;


        Object Flag83_tree=null;
        Object Marker85_tree=null;
        RewriteRuleTokenStream stream_Flag=new RewriteRuleTokenStream(adaptor,"token Flag");
        RewriteRuleTokenStream stream_Marker=new RewriteRuleTokenStream(adaptor,"token Marker");
        RewriteRuleSubtreeStream stream_accessFlagList=new RewriteRuleSubtreeStream(adaptor,"rule accessFlagList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:169:3: ( Flag ( accessFlagList )? Marker -> ^( Flag ( accessFlagList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:169:5: Flag ( accessFlagList )? Marker
            {
            Flag83=(Token)match(input,Flag,FOLLOW_Flag_in_flags1244); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Flag.add(Flag83);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:169:10: ( accessFlagList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER||LA19_0==INTLITERAL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:169:10: accessFlagList
                    {
                    pushFollow(FOLLOW_accessFlagList_in_flags1246);
                    accessFlagList84=accessFlagList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_accessFlagList.add(accessFlagList84.getTree());

                    }
                    break;

            }


            Marker85=(Token)match(input,Marker,FOLLOW_Marker_in_flags1249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Marker.add(Marker85);


            // AST REWRITE
            // elements: Flag, accessFlagList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:33: -> ^( Flag ( accessFlagList )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:169:36: ^( Flag ( accessFlagList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Flag.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:169:43: ( accessFlagList )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:172:1: accessFlagList : flagType ( COMMA flagType )* -> ( flagType )+ ;
    public final JVMParser.accessFlagList_return accessFlagList() throws RecognitionException {
        JVMParser.accessFlagList_return retval = new JVMParser.accessFlagList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA87=null;
        JVMParser.flagType_return flagType86 =null;

        JVMParser.flagType_return flagType88 =null;


        Object COMMA87_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_flagType=new RewriteRuleSubtreeStream(adaptor,"rule flagType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:173:3: ( flagType ( COMMA flagType )* -> ( flagType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:173:5: flagType ( COMMA flagType )*
            {
            pushFollow(FOLLOW_flagType_in_accessFlagList1273);
            flagType86=flagType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flagType.add(flagType86.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:173:14: ( COMMA flagType )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:173:15: COMMA flagType
            	    {
            	    COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_accessFlagList1276); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA87);


            	    pushFollow(FOLLOW_flagType_in_accessFlagList1278);
            	    flagType88=flagType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_flagType.add(flagType88.getTree());

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
            // 173:32: -> ( flagType )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:176:1: flagType : ( IDENTIFIER | INTLITERAL );
    public final JVMParser.flagType_return flagType() throws RecognitionException {
        JVMParser.flagType_return retval = new JVMParser.flagType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set89=null;

        Object set89_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:177:3: ( IDENTIFIER | INTLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set89=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTLITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set89)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:184:1: runtimeVisibleAnnotations_info : RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ -> ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) ;
    public final JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotations_info_return retval = new JVMParser.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeVisibleAnnotations90=null;
        JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem91 =null;


        Object RuntimeVisibleAnnotations90_tree=null;
        RewriteRuleTokenStream stream_RuntimeVisibleAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeVisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationsItem=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationsItem");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:185:3: ( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ -> ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:185:5: RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+
            {
            RuntimeVisibleAnnotations90=(Token)match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info1322); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeVisibleAnnotations.add(RuntimeVisibleAnnotations90);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:186:5: ( runtimeVisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:186:5: runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1329);
            	    runtimeVisibleAnnotationsItem91=runtimeVisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationsItem.add(runtimeVisibleAnnotationsItem91.getTree());

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
            // elements: RuntimeVisibleAnnotations, runtimeVisibleAnnotationsItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 186:36: -> ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:186:39: ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:188:1: runtimeVisibleAnnotationsItem : pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotationsItem_return retval = new JVMParser.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX93=null;
        Token LPAREN94=null;
        Token RPAREN96=null;
        JVMParser.pc_return pc92 =null;

        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList95 =null;


        Object CPINDEX93_tree=null;
        Object LPAREN94_tree=null;
        Object RPAREN96_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationAssignList");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:189:3: ( pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:189:5: pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN
            {
            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem1351);
            pc92=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc92.getTree());

            CPINDEX93=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1353); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX93);


            LPAREN94=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_runtimeVisibleAnnotationsItem1355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN94);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:189:23: ( runtimeVisibleAnnotationAssignList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CPINDEX) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:189:23: runtimeVisibleAnnotationAssignList
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1357);
                    runtimeVisibleAnnotationAssignList95=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationAssignList.add(runtimeVisibleAnnotationAssignList95.getTree());

                    }
                    break;

            }


            RPAREN96=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_runtimeVisibleAnnotationsItem1360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN96);


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
            // 189:66: -> ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:189:69: ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CPINDEX.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:189:82: ( runtimeVisibleAnnotationAssignList )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:191:1: runtimeVisibleAnnotationAssignList : annotationAssign ( COMMA annotationAssign )* -> ( annotationAssign )+ ;
    public final JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotationAssignList_return retval = new JVMParser.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA98=null;
        JVMParser.annotationAssign_return annotationAssign97 =null;

        JVMParser.annotationAssign_return annotationAssign99 =null;


        Object COMMA98_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_annotationAssign=new RewriteRuleSubtreeStream(adaptor,"rule annotationAssign");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:192:3: ( annotationAssign ( COMMA annotationAssign )* -> ( annotationAssign )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:192:5: annotationAssign ( COMMA annotationAssign )*
            {
            pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1383);
            annotationAssign97=annotationAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_annotationAssign.add(annotationAssign97.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:192:22: ( COMMA annotationAssign )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:192:23: COMMA annotationAssign
            	    {
            	    COMMA98=(Token)match(input,COMMA,FOLLOW_COMMA_in_runtimeVisibleAnnotationAssignList1386); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA98);


            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1388);
            	    annotationAssign99=annotationAssign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotationAssign.add(annotationAssign99.getTree());

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
            // 192:48: -> ( annotationAssign )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:194:1: annotationAssign : CPINDEX ASSIGN annotationValue -> ^( ASSIGN CPINDEX annotationValue ) ;
    public final JVMParser.annotationAssign_return annotationAssign() throws RecognitionException {
        JVMParser.annotationAssign_return retval = new JVMParser.annotationAssign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX100=null;
        Token ASSIGN101=null;
        JVMParser.annotationValue_return annotationValue102 =null;


        Object CPINDEX100_tree=null;
        Object ASSIGN101_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_annotationValue=new RewriteRuleSubtreeStream(adaptor,"rule annotationValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:195:3: ( CPINDEX ASSIGN annotationValue -> ^( ASSIGN CPINDEX annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:195:5: CPINDEX ASSIGN annotationValue
            {
            CPINDEX100=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign1407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX100);


            ASSIGN101=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign1409); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN101);


            pushFollow(FOLLOW_annotationValue_in_annotationAssign1411);
            annotationValue102=annotationValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_annotationValue.add(annotationValue102.getTree());

            // AST REWRITE
            // elements: CPINDEX, annotationValue, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 195:36: -> ^( ASSIGN CPINDEX annotationValue )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:195:39: ^( ASSIGN CPINDEX annotationValue )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:197:1: annotationValue : ( brackedAnnotationAssign | AnnotationAssign );
    public final JVMParser.annotationValue_return annotationValue() throws RecognitionException {
        JVMParser.annotationValue_return retval = new JVMParser.annotationValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AnnotationAssign104=null;
        JVMParser.brackedAnnotationAssign_return brackedAnnotationAssign103 =null;


        Object AnnotationAssign104_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:198:3: ( brackedAnnotationAssign | AnnotationAssign )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:198:5: brackedAnnotationAssign
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationValue1433);
                    brackedAnnotationAssign103=brackedAnnotationAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, brackedAnnotationAssign103.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:199:5: AnnotationAssign
                    {
                    root_0 = (Object)adaptor.nil();


                    AnnotationAssign104=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationValue1440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AnnotationAssign104_tree = 
                    (Object)adaptor.create(AnnotationAssign104)
                    ;
                    adaptor.addChild(root_0, AnnotationAssign104_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:201:1: brackedAnnotationAssign : LBRACK ( brackedAnnotationAssignList )? RBRACK -> ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? ) ;
    public final JVMParser.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        JVMParser.brackedAnnotationAssign_return retval = new JVMParser.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK105=null;
        Token RBRACK107=null;
        JVMParser.brackedAnnotationAssignList_return brackedAnnotationAssignList106 =null;


        Object LBRACK105_tree=null;
        Object RBRACK107_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_brackedAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule brackedAnnotationAssignList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:202:3: ( LBRACK ( brackedAnnotationAssignList )? RBRACK -> ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:202:5: LBRACK ( brackedAnnotationAssignList )? RBRACK
            {
            LBRACK105=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_brackedAnnotationAssign1452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK105);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:202:12: ( brackedAnnotationAssignList )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AnnotationAssign) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:202:12: brackedAnnotationAssignList
                    {
                    pushFollow(FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign1454);
                    brackedAnnotationAssignList106=brackedAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_brackedAnnotationAssignList.add(brackedAnnotationAssignList106.getTree());

                    }
                    break;

            }


            RBRACK107=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_brackedAnnotationAssign1457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK107);


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
            // 202:75: -> ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:202:78: ^( ANNOTATIONBRACKETS ( brackedAnnotationAssignList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ANNOTATIONBRACKETS, "ANNOTATIONBRACKETS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:202:99: ( brackedAnnotationAssignList )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:204:1: brackedAnnotationAssignList : brackedAnnotationAssignValue ( COMMA brackedAnnotationAssignValue )* -> ( brackedAnnotationAssignValue )+ ;
    public final JVMParser.brackedAnnotationAssignList_return brackedAnnotationAssignList() throws RecognitionException {
        JVMParser.brackedAnnotationAssignList_return retval = new JVMParser.brackedAnnotationAssignList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA109=null;
        JVMParser.brackedAnnotationAssignValue_return brackedAnnotationAssignValue108 =null;

        JVMParser.brackedAnnotationAssignValue_return brackedAnnotationAssignValue110 =null;


        Object COMMA109_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_brackedAnnotationAssignValue=new RewriteRuleSubtreeStream(adaptor,"rule brackedAnnotationAssignValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:205:3: ( brackedAnnotationAssignValue ( COMMA brackedAnnotationAssignValue )* -> ( brackedAnnotationAssignValue )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:205:5: brackedAnnotationAssignValue ( COMMA brackedAnnotationAssignValue )*
            {
            pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1505);
            brackedAnnotationAssignValue108=brackedAnnotationAssignValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_brackedAnnotationAssignValue.add(brackedAnnotationAssignValue108.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:205:34: ( COMMA brackedAnnotationAssignValue )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:205:35: COMMA brackedAnnotationAssignValue
            	    {
            	    COMMA109=(Token)match(input,COMMA,FOLLOW_COMMA_in_brackedAnnotationAssignList1508); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA109);


            	    pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1510);
            	    brackedAnnotationAssignValue110=brackedAnnotationAssignValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_brackedAnnotationAssignValue.add(brackedAnnotationAssignValue110.getTree());

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
            // 205:75: -> ( brackedAnnotationAssignValue )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:207:1: brackedAnnotationAssignValue : AnnotationAssign ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )? -> ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMParser.brackedAnnotationAssignValue_return brackedAnnotationAssignValue() throws RecognitionException {
        JVMParser.brackedAnnotationAssignValue_return retval = new JVMParser.brackedAnnotationAssignValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AnnotationAssign111=null;
        Token LPAREN112=null;
        Token RPAREN114=null;
        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList113 =null;


        Object AnnotationAssign111_tree=null;
        Object LPAREN112_tree=null;
        Object RPAREN114_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_AnnotationAssign=new RewriteRuleTokenStream(adaptor,"token AnnotationAssign");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationAssignList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:208:3: ( AnnotationAssign ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )? -> ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:208:5: AnnotationAssign ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )?
            {
            AnnotationAssign111=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue1532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AnnotationAssign.add(AnnotationAssign111);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:208:22: ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LPAREN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:208:23: LPAREN runtimeVisibleAnnotationAssignList RPAREN
                    {
                    LPAREN112=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_brackedAnnotationAssignValue1535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN112);


                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue1537);
                    runtimeVisibleAnnotationAssignList113=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationAssignList.add(runtimeVisibleAnnotationAssignList113.getTree());

                    RPAREN114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_brackedAnnotationAssignValue1539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN114);


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
            // 208:75: -> ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:208:78: ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_AnnotationAssign.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:208:97: ( runtimeVisibleAnnotationAssignList )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:210:1: runtimeVisibleParameterAnnotations : RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMParser.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations() throws RecognitionException {
        JVMParser.runtimeVisibleParameterAnnotations_return retval = new JVMParser.runtimeVisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeVisibleParameterAnnotations115=null;
        JVMParser.parameterVisibilityInfo_return parameterVisibilityInfo116 =null;


        Object RuntimeVisibleParameterAnnotations115_tree=null;
        RewriteRuleTokenStream stream_RuntimeVisibleParameterAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeVisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_parameterVisibilityInfo=new RewriteRuleSubtreeStream(adaptor,"rule parameterVisibilityInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:211:3: ( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:211:5: RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+
            {
            RuntimeVisibleParameterAnnotations115=(Token)match(input,RuntimeVisibleParameterAnnotations,FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations1563); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeVisibleParameterAnnotations.add(RuntimeVisibleParameterAnnotations115);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:212:5: ( parameterVisibilityInfo )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:212:5: parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations1570);
            	    parameterVisibilityInfo116=parameterVisibilityInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameterVisibilityInfo.add(parameterVisibilityInfo116.getTree());

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
            // elements: parameterVisibilityInfo, RuntimeVisibleParameterAnnotations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 212:45: -> ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:212:48: ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:214:1: runtimeInvisibleParameterAnnotations : RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMParser.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations() throws RecognitionException {
        JVMParser.runtimeInvisibleParameterAnnotations_return retval = new JVMParser.runtimeInvisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeInvisibleParameterAnnotations117=null;
        JVMParser.parameterVisibilityInfo_return parameterVisibilityInfo118 =null;


        Object RuntimeInvisibleParameterAnnotations117_tree=null;
        RewriteRuleTokenStream stream_RuntimeInvisibleParameterAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeInvisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_parameterVisibilityInfo=new RewriteRuleSubtreeStream(adaptor,"rule parameterVisibilityInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:215:3: ( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:215:5: RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+
            {
            RuntimeInvisibleParameterAnnotations117=(Token)match(input,RuntimeInvisibleParameterAnnotations,FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1607); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeInvisibleParameterAnnotations.add(RuntimeInvisibleParameterAnnotations117);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:216:5: ( parameterVisibilityInfo )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:216:5: parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1614);
            	    parameterVisibilityInfo118=parameterVisibilityInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameterVisibilityInfo.add(parameterVisibilityInfo118.getTree());

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
            // 216:45: -> ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:216:48: ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:218:1: runtimeInvisibleAnnotations : RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ -> ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) ;
    public final JVMParser.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations() throws RecognitionException {
        JVMParser.runtimeInvisibleAnnotations_return retval = new JVMParser.runtimeInvisibleAnnotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeInvisibleAnnotations119=null;
        JVMParser.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem120 =null;


        Object RuntimeInvisibleAnnotations119_tree=null;
        RewriteRuleTokenStream stream_RuntimeInvisibleAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeInvisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeInvisibleAnnotationsItem=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleAnnotationsItem");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:219:3: ( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ -> ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:219:5: RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+
            {
            RuntimeInvisibleAnnotations119=(Token)match(input,RuntimeInvisibleAnnotations,FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeInvisibleAnnotations.add(RuntimeInvisibleAnnotations119);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:220:5: ( runtimeInvisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:220:5: runtimeInvisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1658);
            	    runtimeInvisibleAnnotationsItem120=runtimeInvisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeInvisibleAnnotationsItem.add(runtimeInvisibleAnnotationsItem120.getTree());

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
            // 220:45: -> ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:220:48: ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:222:1: parameterVisibilityInfo : ( IDENTIFIER )? pc ( runtimeVisibleAnnotationsItem )* -> ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) ;
    public final JVMParser.parameterVisibilityInfo_return parameterVisibilityInfo() throws RecognitionException {
        JVMParser.parameterVisibilityInfo_return retval = new JVMParser.parameterVisibilityInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER121=null;
        JVMParser.pc_return pc122 =null;

        JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem123 =null;


        Object IDENTIFIER121_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationsItem=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationsItem");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:223:3: ( ( IDENTIFIER )? pc ( runtimeVisibleAnnotationsItem )* -> ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:223:5: ( IDENTIFIER )? pc ( runtimeVisibleAnnotationsItem )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:223:5: ( IDENTIFIER )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENTIFIER) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:223:5: IDENTIFIER
                    {
                    IDENTIFIER121=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER121);


                    }
                    break;

            }


            pushFollow(FOLLOW_pc_in_parameterVisibilityInfo1690);
            pc122=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc122.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:224:5: ( runtimeVisibleAnnotationsItem )*
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:224:5: runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1696);
            	    runtimeVisibleAnnotationsItem123=runtimeVisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationsItem.add(runtimeVisibleAnnotationsItem123.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER, runtimeVisibleAnnotationsItem, pc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:45: -> ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:224:48: ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_pc.nextNode(), root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:224:53: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:224:65: ( runtimeVisibleAnnotationsItem )*
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:226:1: runtimeInvisibleAnnotationsItem : pc ( pc )? CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) ;
    public final JVMParser.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem() throws RecognitionException {
        JVMParser.runtimeInvisibleAnnotationsItem_return retval = new JVMParser.runtimeInvisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX126=null;
        Token LPAREN127=null;
        Token RPAREN129=null;
        JVMParser.pc_return pc124 =null;

        JVMParser.pc_return pc125 =null;

        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList128 =null;


        Object CPINDEX126_tree=null;
        Object LPAREN127_tree=null;
        Object RPAREN129_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationAssignList");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:3: ( pc ( pc )? CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:5: pc ( pc )? CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN
            {
            pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1730);
            pc124=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc124.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:8: ( pc )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==INTLITERAL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:8: pc
                    {
                    pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1732);
                    pc125=pc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pc.add(pc125.getTree());

                    }
                    break;

            }


            CPINDEX126=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1735); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX126);


            LPAREN127=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_runtimeInvisibleAnnotationsItem1737); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN127);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:27: ( runtimeVisibleAnnotationAssignList )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==CPINDEX) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:27: runtimeVisibleAnnotationAssignList
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1739);
                    runtimeVisibleAnnotationAssignList128=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationAssignList.add(runtimeVisibleAnnotationAssignList128.getTree());

                    }
                    break;

            }


            RPAREN129=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_runtimeInvisibleAnnotationsItem1742); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN129);


            // AST REWRITE
            // elements: runtimeVisibleAnnotationAssignList, pc, pc, CPINDEX
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 227:70: -> ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:73: ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_pc.nextNode(), root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:78: ( pc )?
                if ( stream_pc.hasNext() ) {
                    adaptor.addChild(root_1, stream_pc.nextTree());

                }
                stream_pc.reset();

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:82: ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_CPINDEX.nextNode()
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:227:92: ( runtimeVisibleAnnotationAssignList )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:234:1: constant_pool : IDENTIFIER IDENTIFIER COLON ( contant_pool_line )* -> ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) ;
    public final JVMParser.constant_pool_return constant_pool() throws RecognitionException {
        JVMParser.constant_pool_return retval = new JVMParser.constant_pool_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER130=null;
        Token IDENTIFIER131=null;
        Token COLON132=null;
        JVMParser.contant_pool_line_return contant_pool_line133 =null;


        Object IDENTIFIER130_tree=null;
        Object IDENTIFIER131_tree=null;
        Object COLON132_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_contant_pool_line=new RewriteRuleSubtreeStream(adaptor,"rule contant_pool_line");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:235:3: ( IDENTIFIER IDENTIFIER COLON ( contant_pool_line )* -> ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:235:5: IDENTIFIER IDENTIFIER COLON ( contant_pool_line )*
            {
            IDENTIFIER130=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1775); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER130);


            IDENTIFIER131=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1777); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER131);


            COLON132=(Token)match(input,COLON,FOLLOW_COLON_in_constant_pool1779); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON132);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:236:5: ( contant_pool_line )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==CPINDEX) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:236:5: contant_pool_line
            	    {
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool1786);
            	    contant_pool_line133=contant_pool_line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_contant_pool_line.add(contant_pool_line133.getTree());

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
            // 236:24: -> ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:236:27: ^( IDENTIFIER IDENTIFIER ( contant_pool_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:236:51: ( contant_pool_line )*
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:239:1: contant_pool_line : CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE -> ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) ;
    public final JVMParser.contant_pool_line_return contant_pool_line() throws RecognitionException {
        JVMParser.contant_pool_line_return retval = new JVMParser.contant_pool_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX134=null;
        Token ASSIGN135=null;
        Token CONSTANT_TYPE_ASSIGNABLE136=null;

        Object CPINDEX134_tree=null;
        Object ASSIGN135_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE136_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleTokenStream stream_CONSTANT_TYPE_ASSIGNABLE=new RewriteRuleTokenStream(adaptor,"token CONSTANT_TYPE_ASSIGNABLE");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:240:3: ( CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE -> ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:240:5: CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE
            {
            CPINDEX134=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line1813); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX134);


            ASSIGN135=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line1815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN135);


            CONSTANT_TYPE_ASSIGNABLE136=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1817); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT_TYPE_ASSIGNABLE.add(CONSTANT_TYPE_ASSIGNABLE136);


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
            // 240:45: -> ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:240:48: ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:247:1: classBody : ( classBodyEntryDecl )+ ;
    public final JVMParser.classBody_return classBody() throws RecognitionException {
        JVMParser.classBody_return retval = new JVMParser.classBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.classBodyEntryDecl_return classBodyEntryDecl137 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:248:3: ( ( classBodyEntryDecl )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:248:5: ( classBodyEntryDecl )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:248:5: ( classBodyEntryDecl )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:248:5: classBodyEntryDecl
            	    {
            	    pushFollow(FOLLOW_classBodyEntryDecl_in_classBody1846);
            	    classBodyEntryDecl137=classBodyEntryDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyEntryDecl137.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:251:1: classBodyEntryDecl : ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition );
    public final JVMParser.classBodyEntryDecl_return classBodyEntryDecl() throws RecognitionException {
        JVMParser.classBodyEntryDecl_return retval = new JVMParser.classBodyEntryDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.methodDefinition_return methodDefinition138 =null;

        JVMParser.ctorDefinition_return ctorDefinition139 =null;

        JVMParser.fieldDefinition_return fieldDefinition140 =null;

        JVMParser.staticCtorDefinition_return staticCtorDefinition141 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:252:3: ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:252:5: ( methodDefinition )=> methodDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodDefinition_in_classBodyEntryDecl1868);
                    methodDefinition138=methodDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDefinition138.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:253:5: ( ctorDefinition )=> ctorDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ctorDefinition_in_classBodyEntryDecl1880);
                    ctorDefinition139=ctorDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDefinition139.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:254:5: ( fieldDefinition )=> fieldDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fieldDefinition_in_classBodyEntryDecl1892);
                    fieldDefinition140=fieldDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDefinition140.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:255:5: staticCtorDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1898);
                    staticCtorDefinition141=staticCtorDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCtorDefinition141.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:262:1: fieldDefinition : ( field_visual_modifier )? ( field_modifier )* type keywordAggregate ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )* -> ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) ;
    public final JVMParser.fieldDefinition_return fieldDefinition() throws RecognitionException {
        JVMParser.fieldDefinition_return retval = new JVMParser.fieldDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSIGN146=null;
        Token SEMI148=null;
        JVMParser.field_visual_modifier_return field_visual_modifier142 =null;

        JVMParser.field_modifier_return field_modifier143 =null;

        JVMParser.type_return type144 =null;

        JVMParser.keywordAggregate_return keywordAggregate145 =null;

        JVMParser.literals_return literals147 =null;

        JVMParser.fieldInfo_return fieldInfo149 =null;

        JVMParser.fieldAdditionalInfo_return fieldAdditionalInfo150 =null;


        Object ASSIGN146_tree=null;
        Object SEMI148_tree=null;
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:263:3: ( ( field_visual_modifier )? ( field_modifier )* type keywordAggregate ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )* -> ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:263:5: ( field_visual_modifier )? ( field_modifier )* type keywordAggregate ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:263:5: ( field_visual_modifier )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0 >= PRIVATE && LA38_0 <= PUBLIC)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:263:5: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition1915);
                    field_visual_modifier142=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_field_visual_modifier.add(field_visual_modifier142.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:263:28: ( field_modifier )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==FINAL||LA39_0==STATIC||LA39_0==TRANSIENT||LA39_0==VOLATILE) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:263:28: field_modifier
            	    {
            	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition1918);
            	    field_modifier143=field_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_modifier.add(field_modifier143.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            pushFollow(FOLLOW_type_in_fieldDefinition1921);
            type144=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type144.getTree());

            pushFollow(FOLLOW_keywordAggregate_in_fieldDefinition1923);
            keywordAggregate145=keywordAggregate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keywordAggregate.add(keywordAggregate145.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:263:66: ( ASSIGN literals )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ASSIGN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:263:67: ASSIGN literals
                    {
                    ASSIGN146=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefinition1926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN146);


                    pushFollow(FOLLOW_literals_in_fieldDefinition1928);
                    literals147=literals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literals.add(literals147.getTree());

                    }
                    break;

            }


            SEMI148=(Token)match(input,SEMI,FOLLOW_SEMI_in_fieldDefinition1932); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI148);


            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition1939);
            fieldInfo149=fieldInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldInfo.add(fieldInfo149.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:5: ( fieldAdditionalInfo )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Constant||LA41_0==Deprecated||LA41_0==RuntimeInvisibleAnnotations||LA41_0==RuntimeVisibleAnnotations||LA41_0==Signature||LA41_0==Synthetic) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:265:5: fieldAdditionalInfo
            	    {
            	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition1945);
            	    fieldAdditionalInfo150=fieldAdditionalInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldAdditionalInfo.add(fieldAdditionalInfo150.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // AST REWRITE
            // elements: type, fieldInfo, keywordAggregate, field_modifier, field_visual_modifier, fieldAdditionalInfo, literals
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 266:13: -> ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:266:16: ^( FIELDDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( MODIFIER ( field_modifier )* ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) ^( FIELDVALUE ( literals )? ) ^( UNITHEADER fieldInfo ) ^( UNITATTR ( fieldAdditionalInfo )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELDDECL, "FIELDDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:266:28: ^( VMODIFIER ( field_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:266:40: ( field_visual_modifier )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                }
                stream_field_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:266:64: ^( MODIFIER ( field_modifier )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:266:75: ( field_modifier )*
                while ( stream_field_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_modifier.nextTree());

                }
                stream_field_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:266:92: ^( RETVALUE type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETVALUE, "RETVALUE")
                , root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:266:109: ^( UNITNAME keywordAggregate )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_2);

                adaptor.addChild(root_2, stream_keywordAggregate.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:266:138: ^( FIELDVALUE ( literals )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELDVALUE, "FIELDVALUE")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:266:151: ( literals )?
                if ( stream_literals.hasNext() ) {
                    adaptor.addChild(root_2, stream_literals.nextTree());

                }
                stream_literals.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:267:13: ^( UNITHEADER fieldInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_fieldInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:13: ^( UNITATTR ( fieldAdditionalInfo )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITATTR, "UNITATTR")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:268:24: ( fieldAdditionalInfo )*
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:272:1: fieldInfo : Signature bytecodeType flags -> ^( Signature bytecodeType ) flags ;
    public final JVMParser.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMParser.fieldInfo_return retval = new JVMParser.fieldInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature151=null;
        JVMParser.bytecodeType_return bytecodeType152 =null;

        JVMParser.flags_return flags153 =null;


        Object Signature151_tree=null;
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleSubtreeStream stream_flags=new RewriteRuleSubtreeStream(adaptor,"rule flags");
        RewriteRuleSubtreeStream stream_bytecodeType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:273:3: ( Signature bytecodeType flags -> ^( Signature bytecodeType ) flags )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:273:5: Signature bytecodeType flags
            {
            Signature151=(Token)match(input,Signature,FOLLOW_Signature_in_fieldInfo2060); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Signature.add(Signature151);


            pushFollow(FOLLOW_bytecodeType_in_fieldInfo2062);
            bytecodeType152=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeType.add(bytecodeType152.getTree());

            pushFollow(FOLLOW_flags_in_fieldInfo2068);
            flags153=flags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flags.add(flags153.getTree());

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
            // 274:11: -> ^( Signature bytecodeType ) flags
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:274:14: ^( Signature bytecodeType )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:277:1: fieldAdditionalInfo : ( Constant primitiveType literals -> ^( Constant primitiveType literals ) | Constant CONSTANT_TYPE_ASSIGNABLE -> ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | Signature CPINDEX -> ^( Signature CPINDEX ) | Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations ) ;
    public final JVMParser.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        JVMParser.fieldAdditionalInfo_return retval = new JVMParser.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Constant154=null;
        Token Constant157=null;
        Token CONSTANT_TYPE_ASSIGNABLE158=null;
        Token Signature159=null;
        Token CPINDEX160=null;
        Token Deprecated161=null;
        Token BOOLEANLITERAL162=null;
        Token Synthetic163=null;
        Token BOOLEANLITERAL164=null;
        JVMParser.primitiveType_return primitiveType155 =null;

        JVMParser.literals_return literals156 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info165 =null;

        JVMParser.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations166 =null;


        Object Constant154_tree=null;
        Object Constant157_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE158_tree=null;
        Object Signature159_tree=null;
        Object CPINDEX160_tree=null;
        Object Deprecated161_tree=null;
        Object BOOLEANLITERAL162_tree=null;
        Object Synthetic163_tree=null;
        Object BOOLEANLITERAL164_tree=null;
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:278:3: ( ( Constant primitiveType literals -> ^( Constant primitiveType literals ) | Constant CONSTANT_TYPE_ASSIGNABLE -> ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | Signature CPINDEX -> ^( Signature CPINDEX ) | Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:278:5: ( Constant primitiveType literals -> ^( Constant primitiveType literals ) | Constant CONSTANT_TYPE_ASSIGNABLE -> ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | Signature CPINDEX -> ^( Signature CPINDEX ) | Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations )
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:278:5: ( Constant primitiveType literals -> ^( Constant primitiveType literals ) | Constant CONSTANT_TYPE_ASSIGNABLE -> ^( Constant CONSTANT_TYPE_ASSIGNABLE ) | Signature CPINDEX -> ^( Signature CPINDEX ) | Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:278:6: Constant primitiveType literals
                    {
                    Constant154=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo2092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constant.add(Constant154);


                    pushFollow(FOLLOW_primitiveType_in_fieldAdditionalInfo2094);
                    primitiveType155=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType155.getTree());

                    pushFollow(FOLLOW_literals_in_fieldAdditionalInfo2096);
                    literals156=literals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literals.add(literals156.getTree());

                    // AST REWRITE
                    // elements: literals, Constant, primitiveType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 278:38: -> ^( Constant primitiveType literals )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:278:41: ^( Constant primitiveType literals )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:279:5: Constant CONSTANT_TYPE_ASSIGNABLE
                    {
                    Constant157=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo2112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constant.add(Constant157);


                    CONSTANT_TYPE_ASSIGNABLE158=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo2114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSTANT_TYPE_ASSIGNABLE.add(CONSTANT_TYPE_ASSIGNABLE158);


                    // AST REWRITE
                    // elements: CONSTANT_TYPE_ASSIGNABLE, Constant
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 279:39: -> ^( Constant CONSTANT_TYPE_ASSIGNABLE )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:279:42: ^( Constant CONSTANT_TYPE_ASSIGNABLE )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:280:5: Signature CPINDEX
                    {
                    Signature159=(Token)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo2128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Signature.add(Signature159);


                    CPINDEX160=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldAdditionalInfo2130); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX160);


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
                    // 280:23: -> ^( Signature CPINDEX )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:280:26: ^( Signature CPINDEX )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:281:5: Deprecated BOOLEANLITERAL
                    {
                    Deprecated161=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo2144); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Deprecated.add(Deprecated161);


                    BOOLEANLITERAL162=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL162);


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
                    // 281:31: -> ^( Deprecated BOOLEANLITERAL )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:281:34: ^( Deprecated BOOLEANLITERAL )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:282:5: Synthetic BOOLEANLITERAL
                    {
                    Synthetic163=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo2160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic163);


                    BOOLEANLITERAL164=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL164);


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
                    // 282:30: -> ^( Synthetic BOOLEANLITERAL )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:282:33: ^( Synthetic BOOLEANLITERAL )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:283:5: runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo2176);
                    runtimeVisibleAnnotations_info165=runtimeVisibleAnnotations_info();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotations_info.add(runtimeVisibleAnnotations_info165.getTree());

                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:284:5: runtimeInvisibleAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo2182);
                    runtimeInvisibleAnnotations166=runtimeInvisibleAnnotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeInvisibleAnnotations.add(runtimeInvisibleAnnotations166.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:288:1: field_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMParser.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        JVMParser.field_visual_modifier_return retval = new JVMParser.field_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set167=null;

        Object set167_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:289:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set167=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set167)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:292:1: field_modifier : ( FINAL | STATIC | TRANSIENT | VOLATILE );
    public final JVMParser.field_modifier_return field_modifier() throws RecognitionException {
        JVMParser.field_modifier_return retval = new JVMParser.field_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set168=null;

        Object set168_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:293:3: ( FINAL | STATIC | TRANSIENT | VOLATILE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set168=(Token)input.LT(1);

            if ( input.LA(1)==FINAL||input.LA(1)==STATIC||input.LA(1)==TRANSIENT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set168)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:300:1: staticCtorDefinition : ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body -> ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) ;
    public final JVMParser.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        JVMParser.staticCtorDefinition_return retval = new JVMParser.staticCtorDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC170=null;
        Token LBRACE171=null;
        Token RBRACE172=null;
        Token SEMI173=null;
        JVMParser.field_visual_modifier_return field_visual_modifier169 =null;

        JVMParser.methodInfo_return methodInfo174 =null;

        JVMParser.body_return body175 =null;


        Object STATIC170_tree=null;
        Object LBRACE171_tree=null;
        Object RBRACE172_tree=null;
        Object SEMI173_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_field_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_visual_modifier");
        RewriteRuleSubtreeStream stream_methodInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:301:3: ( ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body -> ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:301:5: ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:301:5: ( field_visual_modifier )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0 >= PRIVATE && LA43_0 <= PUBLIC)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:301:5: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition2258);
                    field_visual_modifier169=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_field_visual_modifier.add(field_visual_modifier169.getTree());

                    }
                    break;

            }


            STATIC170=(Token)match(input,STATIC,FOLLOW_STATIC_in_staticCtorDefinition2261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STATIC.add(STATIC170);


            LBRACE171=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_staticCtorDefinition2263); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE171);


            RBRACE172=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_staticCtorDefinition2265); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE172);


            SEMI173=(Token)match(input,SEMI,FOLLOW_SEMI_in_staticCtorDefinition2267); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI173);


            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition2274);
            methodInfo174=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodInfo.add(methodInfo174.getTree());

            pushFollow(FOLLOW_body_in_staticCtorDefinition2280);
            body175=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body175.getTree());

            // AST REWRITE
            // elements: body, methodInfo, field_visual_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 303:10: -> ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:303:13: ^( STATICCTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATICCTORDECL, "STATICCTORDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:303:30: ^( VMODIFIER ( field_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:303:42: ( field_visual_modifier )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                }
                stream_field_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:303:66: ^( UNITHEADER methodInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:303:91: ^( UNITBODY body )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:310:1: ctorDefinition : ( field_visual_modifier )? ( genericDescriptor )? typeName arguments ( throwClause )? SEMI methodInfo body ( afterMethodInfo )? -> ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMParser.ctorDefinition_return ctorDefinition() throws RecognitionException {
        JVMParser.ctorDefinition_return retval = new JVMParser.ctorDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI181=null;
        JVMParser.field_visual_modifier_return field_visual_modifier176 =null;

        JVMParser.genericDescriptor_return genericDescriptor177 =null;

        JVMParser.typeName_return typeName178 =null;

        JVMParser.arguments_return arguments179 =null;

        JVMParser.throwClause_return throwClause180 =null;

        JVMParser.methodInfo_return methodInfo182 =null;

        JVMParser.body_return body183 =null;

        JVMParser.afterMethodInfo_return afterMethodInfo184 =null;


        Object SEMI181_tree=null;
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:311:3: ( ( field_visual_modifier )? ( genericDescriptor )? typeName arguments ( throwClause )? SEMI methodInfo body ( afterMethodInfo )? -> ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:311:5: ( field_visual_modifier )? ( genericDescriptor )? typeName arguments ( throwClause )? SEMI methodInfo body ( afterMethodInfo )?
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:311:5: ( field_visual_modifier )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0 >= PRIVATE && LA44_0 <= PUBLIC)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:311:5: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition2324);
                    field_visual_modifier176=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_field_visual_modifier.add(field_visual_modifier176.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:311:28: ( genericDescriptor )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==LESST) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:311:28: genericDescriptor
                    {
                    pushFollow(FOLLOW_genericDescriptor_in_ctorDefinition2327);
                    genericDescriptor177=genericDescriptor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_genericDescriptor.add(genericDescriptor177.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeName_in_ctorDefinition2330);
            typeName178=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName178.getTree());

            pushFollow(FOLLOW_arguments_in_ctorDefinition2332);
            arguments179=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments179.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:311:66: ( throwClause )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==THROWS) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:311:66: throwClause
                    {
                    pushFollow(FOLLOW_throwClause_in_ctorDefinition2334);
                    throwClause180=throwClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_throwClause.add(throwClause180.getTree());

                    }
                    break;

            }


            SEMI181=(Token)match(input,SEMI,FOLLOW_SEMI_in_ctorDefinition2337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI181);


            pushFollow(FOLLOW_methodInfo_in_ctorDefinition2344);
            methodInfo182=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodInfo.add(methodInfo182.getTree());

            pushFollow(FOLLOW_body_in_ctorDefinition2350);
            body183=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body183.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:5: ( afterMethodInfo )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==AnnotationDefault||LA47_0==Deprecated||LA47_0==Exceptions||(LA47_0 >= RuntimeInvisibleAnnotations && LA47_0 <= RuntimeVisibleParameterAnnotations)||LA47_0==Signature||LA47_0==Synthetic) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:5: afterMethodInfo
                    {
                    pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition2356);
                    afterMethodInfo184=afterMethodInfo();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_afterMethodInfo.add(afterMethodInfo184.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: arguments, methodInfo, genericDescriptor, typeName, afterMethodInfo, body, throwClause, field_visual_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 314:22: -> ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:25: ^( CTORDECL ^( VMODIFIER ( field_visual_modifier )? ) ^( GENERICDESC ( genericDescriptor )? ) ^( UNITNAME typeName ) arguments ^( THROWCLAUSE ( throwClause )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY body ) ^( UNITATTR ( afterMethodInfo )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CTORDECL, "CTORDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:36: ^( VMODIFIER ( field_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:48: ( field_visual_modifier )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                }
                stream_field_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:72: ^( GENERICDESC ( genericDescriptor )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(GENERICDESC, "GENERICDESC")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:86: ( genericDescriptor )?
                if ( stream_genericDescriptor.hasNext() ) {
                    adaptor.addChild(root_2, stream_genericDescriptor.nextTree());

                }
                stream_genericDescriptor.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:106: ^( UNITNAME typeName )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_2);

                adaptor.addChild(root_2, stream_typeName.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_arguments.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:137: ^( THROWCLAUSE ( throwClause )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(THROWCLAUSE, "THROWCLAUSE")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:314:151: ( throwClause )?
                if ( stream_throwClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_throwClause.nextTree());

                }
                stream_throwClause.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:315:25: ^( UNITHEADER methodInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:316:25: ^( UNITBODY body )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITBODY, "UNITBODY")
                , root_2);

                adaptor.addChild(root_2, stream_body.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:317:25: ^( UNITATTR ( afterMethodInfo )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITATTR, "UNITATTR")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:317:36: ( afterMethodInfo )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:325:1: methodDefinition : ( method_visual_modifier )? ( method_modifier )* ( genericDescriptor )? type keywordAggregate arguments ( throwClauseMethod )? SEMI methodInfo ( body )? ( afterMethodInfo )? -> ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) ;
    public final JVMParser.methodDefinition_return methodDefinition() throws RecognitionException {
        JVMParser.methodDefinition_return retval = new JVMParser.methodDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI192=null;
        JVMParser.method_visual_modifier_return method_visual_modifier185 =null;

        JVMParser.method_modifier_return method_modifier186 =null;

        JVMParser.genericDescriptor_return genericDescriptor187 =null;

        JVMParser.type_return type188 =null;

        JVMParser.keywordAggregate_return keywordAggregate189 =null;

        JVMParser.arguments_return arguments190 =null;

        JVMParser.throwClauseMethod_return throwClauseMethod191 =null;

        JVMParser.methodInfo_return methodInfo193 =null;

        JVMParser.body_return body194 =null;

        JVMParser.afterMethodInfo_return afterMethodInfo195 =null;


        Object SEMI192_tree=null;
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:3: ( ( method_visual_modifier )? ( method_modifier )* ( genericDescriptor )? type keywordAggregate arguments ( throwClauseMethod )? SEMI methodInfo ( body )? ( afterMethodInfo )? -> ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:5: ( method_visual_modifier )? ( method_modifier )* ( genericDescriptor )? type keywordAggregate arguments ( throwClauseMethod )? SEMI methodInfo ( body )? ( afterMethodInfo )?
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:5: ( method_visual_modifier )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0 >= PRIVATE && LA48_0 <= PUBLIC)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:5: method_visual_modifier
                    {
                    pushFollow(FOLLOW_method_visual_modifier_in_methodDefinition2525);
                    method_visual_modifier185=method_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_method_visual_modifier.add(method_visual_modifier185.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:29: ( method_modifier )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ABSTRACT||LA49_0==FINAL||LA49_0==NATIVE||LA49_0==STATIC||LA49_0==STRICTFP||LA49_0==SYNCHRONIZED) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:29: method_modifier
            	    {
            	    pushFollow(FOLLOW_method_modifier_in_methodDefinition2528);
            	    method_modifier186=method_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_method_modifier.add(method_modifier186.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:46: ( genericDescriptor )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LESST) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:46: genericDescriptor
                    {
                    pushFollow(FOLLOW_genericDescriptor_in_methodDefinition2531);
                    genericDescriptor187=genericDescriptor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_genericDescriptor.add(genericDescriptor187.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_type_in_methodDefinition2534);
            type188=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type188.getTree());

            pushFollow(FOLLOW_keywordAggregate_in_methodDefinition2536);
            keywordAggregate189=keywordAggregate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keywordAggregate.add(keywordAggregate189.getTree());

            pushFollow(FOLLOW_arguments_in_methodDefinition2538);
            arguments190=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments190.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:97: ( throwClauseMethod )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==THROWS) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:326:97: throwClauseMethod
                    {
                    pushFollow(FOLLOW_throwClauseMethod_in_methodDefinition2540);
                    throwClauseMethod191=throwClauseMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_throwClauseMethod.add(throwClauseMethod191.getTree());

                    }
                    break;

            }


            SEMI192=(Token)match(input,SEMI,FOLLOW_SEMI_in_methodDefinition2543); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI192);


            pushFollow(FOLLOW_methodInfo_in_methodDefinition2550);
            methodInfo193=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodInfo.add(methodInfo193.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:5: ( body )?
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:328:5: body
                    {
                    pushFollow(FOLLOW_body_in_methodDefinition2556);
                    body194=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_body.add(body194.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:5: ( afterMethodInfo )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==AnnotationDefault||LA53_0==Deprecated||LA53_0==Exceptions||(LA53_0 >= RuntimeInvisibleAnnotations && LA53_0 <= RuntimeVisibleParameterAnnotations)||LA53_0==Signature||LA53_0==Synthetic) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:5: afterMethodInfo
                    {
                    pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition2563);
                    afterMethodInfo195=afterMethodInfo();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_afterMethodInfo.add(afterMethodInfo195.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: throwClauseMethod, keywordAggregate, arguments, genericDescriptor, methodInfo, method_modifier, body, type, method_visual_modifier, afterMethodInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 329:22: -> ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:25: ^( METHODDECL ^( VMODIFIER ( method_visual_modifier )? ) ^( MODIFIER ( method_modifier )* ) ^( GENERICDESC ( genericDescriptor )? ) ^( RETVALUE type ) ^( UNITNAME keywordAggregate ) arguments ^( THROWCLAUSE ( throwClauseMethod )? ) ^( UNITHEADER methodInfo ) ^( UNITBODY ( body )? ) ^( UNITATTR ( afterMethodInfo )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHODDECL, "METHODDECL")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:38: ^( VMODIFIER ( method_visual_modifier )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:50: ( method_visual_modifier )?
                if ( stream_method_visual_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_method_visual_modifier.nextTree());

                }
                stream_method_visual_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:75: ^( MODIFIER ( method_modifier )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:86: ( method_modifier )*
                while ( stream_method_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_method_modifier.nextTree());

                }
                stream_method_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:104: ^( GENERICDESC ( genericDescriptor )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(GENERICDESC, "GENERICDESC")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:118: ( genericDescriptor )?
                if ( stream_genericDescriptor.hasNext() ) {
                    adaptor.addChild(root_2, stream_genericDescriptor.nextTree());

                }
                stream_genericDescriptor.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:138: ^( RETVALUE type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETVALUE, "RETVALUE")
                , root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:155: ^( UNITNAME keywordAggregate )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_2);

                adaptor.addChild(root_2, stream_keywordAggregate.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_arguments.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:194: ^( THROWCLAUSE ( throwClauseMethod )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(THROWCLAUSE, "THROWCLAUSE")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:329:208: ( throwClauseMethod )?
                if ( stream_throwClauseMethod.hasNext() ) {
                    adaptor.addChild(root_2, stream_throwClauseMethod.nextTree());

                }
                stream_throwClauseMethod.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:330:25: ^( UNITHEADER methodInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:25: ^( UNITBODY ( body )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITBODY, "UNITBODY")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:331:36: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_2, stream_body.nextTree());

                }
                stream_body.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:332:25: ^( UNITATTR ( afterMethodInfo )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITATTR, "UNITATTR")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:332:36: ( afterMethodInfo )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:336:1: methodInfo : methodSignatureInfo flags -> ^( STANDINTOKEN methodSignatureInfo flags ) ;
    public final JVMParser.methodInfo_return methodInfo() throws RecognitionException {
        JVMParser.methodInfo_return retval = new JVMParser.methodInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.methodSignatureInfo_return methodSignatureInfo196 =null;

        JVMParser.flags_return flags197 =null;


        RewriteRuleSubtreeStream stream_flags=new RewriteRuleSubtreeStream(adaptor,"rule flags");
        RewriteRuleSubtreeStream stream_methodSignatureInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodSignatureInfo");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:337:3: ( methodSignatureInfo flags -> ^( STANDINTOKEN methodSignatureInfo flags ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:337:5: methodSignatureInfo flags
            {
            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo2742);
            methodSignatureInfo196=methodSignatureInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodSignatureInfo.add(methodSignatureInfo196.getTree());

            pushFollow(FOLLOW_flags_in_methodInfo2744);
            flags197=flags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flags.add(flags197.getTree());

            // AST REWRITE
            // elements: methodSignatureInfo, flags
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 337:31: -> ^( STANDINTOKEN methodSignatureInfo flags )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:337:34: ^( STANDINTOKEN methodSignatureInfo flags )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:340:1: afterMethodInfo : ( Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ ;
    public final JVMParser.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        JVMParser.afterMethodInfo_return retval = new JVMParser.afterMethodInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Deprecated198=null;
        Token BOOLEANLITERAL199=null;
        Token Signature200=null;
        Token CPINDEX201=null;
        Token Exceptions206=null;
        Token Synthetic208=null;
        Token BOOLEANLITERAL209=null;
        JVMParser.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations202 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info203 =null;

        JVMParser.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations204 =null;

        JVMParser.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations205 =null;

        JVMParser.throwClause_return throwClause207 =null;

        JVMParser.annotationDefault_return annotationDefault210 =null;


        Object Deprecated198_tree=null;
        Object BOOLEANLITERAL199_tree=null;
        Object Signature200_tree=null;
        Object CPINDEX201_tree=null;
        Object Exceptions206_tree=null;
        Object Synthetic208_tree=null;
        Object BOOLEANLITERAL209_tree=null;
        RewriteRuleTokenStream stream_Deprecated=new RewriteRuleTokenStream(adaptor,"token Deprecated");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_Exceptions=new RewriteRuleTokenStream(adaptor,"token Exceptions");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleSubtreeStream stream_runtimeVisibleParameterAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_throwClause=new RewriteRuleSubtreeStream(adaptor,"rule throwClause");
        RewriteRuleSubtreeStream stream_runtimeInvisibleParameterAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_runtimeInvisibleAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotations_info=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotations_info");
        RewriteRuleSubtreeStream stream_annotationDefault=new RewriteRuleSubtreeStream(adaptor,"rule annotationDefault");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:341:3: ( ( Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:341:5: ( Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:341:5: ( Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
            int cnt54=0;
            loop54:
            do {
                int alt54=10;
                switch ( input.LA(1) ) {
                case Deprecated:
                    {
                    alt54=1;
                    }
                    break;
                case Signature:
                    {
                    alt54=2;
                    }
                    break;
                case RuntimeInvisibleParameterAnnotations:
                    {
                    alt54=3;
                    }
                    break;
                case RuntimeVisibleAnnotations:
                    {
                    alt54=4;
                    }
                    break;
                case RuntimeInvisibleAnnotations:
                    {
                    alt54=5;
                    }
                    break;
                case RuntimeVisibleParameterAnnotations:
                    {
                    alt54=6;
                    }
                    break;
                case Exceptions:
                    {
                    alt54=7;
                    }
                    break;
                case Synthetic:
                    {
                    alt54=8;
                    }
                    break;
                case AnnotationDefault:
                    {
                    alt54=9;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:341:6: Deprecated BOOLEANLITERAL
            	    {
            	    Deprecated198=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfo2768); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Deprecated.add(Deprecated198);


            	    BOOLEANLITERAL199=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2771); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL199);


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
            	    // 341:35: -> ^( Deprecated BOOLEANLITERAL )
            	    {
            	        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:341:38: ^( Deprecated BOOLEANLITERAL )
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:342:5: Signature CPINDEX
            	    {
            	    Signature200=(Token)match(input,Signature,FOLLOW_Signature_in_afterMethodInfo2788); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Signature.add(Signature200);


            	    CPINDEX201=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfo2790); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX201);


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
            	    // 342:41: -> ^( Signature CPINDEX )
            	    {
            	        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:342:44: ^( Signature CPINDEX )
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:343:5: runtimeInvisibleParameterAnnotations
            	    {
            	    pushFollow(FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo2822);
            	    runtimeInvisibleParameterAnnotations202=runtimeInvisibleParameterAnnotations();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeInvisibleParameterAnnotations.add(runtimeInvisibleParameterAnnotations202.getTree());

            	    }
            	    break;
            	case 4 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:344:5: runtimeVisibleAnnotations_info
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo2828);
            	    runtimeVisibleAnnotations_info203=runtimeVisibleAnnotations_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotations_info.add(runtimeVisibleAnnotations_info203.getTree());

            	    }
            	    break;
            	case 5 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:345:5: runtimeInvisibleAnnotations
            	    {
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo2834);
            	    runtimeInvisibleAnnotations204=runtimeInvisibleAnnotations();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeInvisibleAnnotations.add(runtimeInvisibleAnnotations204.getTree());

            	    }
            	    break;
            	case 6 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:346:5: runtimeVisibleParameterAnnotations
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo2840);
            	    runtimeVisibleParameterAnnotations205=runtimeVisibleParameterAnnotations();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleParameterAnnotations.add(runtimeVisibleParameterAnnotations205.getTree());

            	    }
            	    break;
            	case 7 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:347:5: Exceptions throwClause
            	    {
            	    Exceptions206=(Token)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfo2846); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Exceptions.add(Exceptions206);


            	    pushFollow(FOLLOW_throwClause_in_afterMethodInfo2849);
            	    throwClause207=throwClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_throwClause.add(throwClause207.getTree());

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
            	    // 347:41: -> ^( Exceptions throwClause )
            	    {
            	        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:347:44: ^( Exceptions throwClause )
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:348:5: Synthetic BOOLEANLITERAL
            	    {
            	    Synthetic208=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfo2876); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic208);


            	    BOOLEANLITERAL209=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2878); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL209);


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
            	    // 348:41: -> ^( Synthetic BOOLEANLITERAL )
            	    {
            	        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:348:44: ^( Synthetic BOOLEANLITERAL )
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:349:5: annotationDefault
            	    {
            	    pushFollow(FOLLOW_annotationDefault_in_afterMethodInfo2903);
            	    annotationDefault210=annotationDefault();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotationDefault.add(annotationDefault210.getTree());

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


    public static class annotationDefault_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationDefault"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:352:1: annotationDefault : AnnotationDefault DefaultValue annotationValue -> ^( AnnotationDefault DefaultValue annotationValue ) ;
    public final JVMParser.annotationDefault_return annotationDefault() throws RecognitionException {
        JVMParser.annotationDefault_return retval = new JVMParser.annotationDefault_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AnnotationDefault211=null;
        Token DefaultValue212=null;
        JVMParser.annotationValue_return annotationValue213 =null;


        Object AnnotationDefault211_tree=null;
        Object DefaultValue212_tree=null;
        RewriteRuleTokenStream stream_AnnotationDefault=new RewriteRuleTokenStream(adaptor,"token AnnotationDefault");
        RewriteRuleTokenStream stream_DefaultValue=new RewriteRuleTokenStream(adaptor,"token DefaultValue");
        RewriteRuleSubtreeStream stream_annotationValue=new RewriteRuleSubtreeStream(adaptor,"rule annotationValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:353:3: ( AnnotationDefault DefaultValue annotationValue -> ^( AnnotationDefault DefaultValue annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:353:5: AnnotationDefault DefaultValue annotationValue
            {
            AnnotationDefault211=(Token)match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault2918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AnnotationDefault.add(AnnotationDefault211);


            DefaultValue212=(Token)match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault2921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DefaultValue.add(DefaultValue212);


            pushFollow(FOLLOW_annotationValue_in_annotationDefault2923);
            annotationValue213=annotationValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_annotationValue.add(annotationValue213.getTree());

            // AST REWRITE
            // elements: DefaultValue, AnnotationDefault, annotationValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 353:53: -> ^( AnnotationDefault DefaultValue annotationValue )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:353:56: ^( AnnotationDefault DefaultValue annotationValue )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:356:1: methodSignatureInfo : Signature LPAREN ( bytecodeType )* RPAREN returnDescriptor -> ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) ;
    public final JVMParser.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        JVMParser.methodSignatureInfo_return retval = new JVMParser.methodSignatureInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature214=null;
        Token LPAREN215=null;
        Token RPAREN217=null;
        JVMParser.bytecodeType_return bytecodeType216 =null;

        JVMParser.returnDescriptor_return returnDescriptor218 =null;


        Object Signature214_tree=null;
        Object LPAREN215_tree=null;
        Object RPAREN217_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleSubtreeStream stream_bytecodeType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeType");
        RewriteRuleSubtreeStream stream_returnDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule returnDescriptor");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:357:3: ( Signature LPAREN ( bytecodeType )* RPAREN returnDescriptor -> ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:357:5: Signature LPAREN ( bytecodeType )* RPAREN returnDescriptor
            {
            Signature214=(Token)match(input,Signature,FOLLOW_Signature_in_methodSignatureInfo2949); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Signature.add(Signature214);


            LPAREN215=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodSignatureInfo2951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN215);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:357:22: ( bytecodeType )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==BaseType||LA55_0==IDENTIFIER||LA55_0==INTERNALTYPE||LA55_0==LBRACK) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:357:22: bytecodeType
            	    {
            	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo2953);
            	    bytecodeType216=bytecodeType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeType.add(bytecodeType216.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            RPAREN217=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodSignatureInfo2956); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN217);


            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo2958);
            returnDescriptor218=returnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_returnDescriptor.add(returnDescriptor218.getTree());

            // AST REWRITE
            // elements: returnDescriptor, bytecodeType, Signature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 357:61: -> ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:357:64: ^( Signature ^( PARAMDESC ( bytecodeType )* ) ^( RETDESC returnDescriptor ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Signature.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:357:76: ^( PARAMDESC ( bytecodeType )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMDESC, "PARAMDESC")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:357:88: ( bytecodeType )*
                while ( stream_bytecodeType.hasNext() ) {
                    adaptor.addChild(root_2, stream_bytecodeType.nextTree());

                }
                stream_bytecodeType.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:357:103: ^( RETDESC returnDescriptor )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:360:1: returnDescriptor : ( bytecodeType | VoidType );
    public final JVMParser.returnDescriptor_return returnDescriptor() throws RecognitionException {
        JVMParser.returnDescriptor_return retval = new JVMParser.returnDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VoidType220=null;
        JVMParser.bytecodeType_return bytecodeType219 =null;


        Object VoidType220_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:361:3: ( bytecodeType | VoidType )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==BaseType||LA56_0==IDENTIFIER||LA56_0==INTERNALTYPE||LA56_0==LBRACK) ) {
                alt56=1;
            }
            else if ( (LA56_0==VoidType) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:361:5: bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor2991);
                    bytecodeType219=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType219.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:361:20: VoidType
                    {
                    root_0 = (Object)adaptor.nil();


                    VoidType220=(Token)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor2995); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VoidType220_tree = 
                    (Object)adaptor.create(VoidType220)
                    ;
                    adaptor.addChild(root_0, VoidType220_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:364:1: method_modifier : ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP );
    public final JVMParser.method_modifier_return method_modifier() throws RecognitionException {
        JVMParser.method_modifier_return retval = new JVMParser.method_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set221=null;

        Object set221_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:365:3: ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | STRICTFP )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set221=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL||input.LA(1)==NATIVE||input.LA(1)==STATIC||input.LA(1)==STRICTFP||input.LA(1)==SYNCHRONIZED ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set221)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:368:1: method_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMParser.method_visual_modifier_return method_visual_modifier() throws RecognitionException {
        JVMParser.method_visual_modifier_return retval = new JVMParser.method_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set222=null;

        Object set222_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:369:3: ( PUBLIC | PRIVATE | PROTECTED )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set222=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set222)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:372:1: arguments : LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN -> ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) ;
    public final JVMParser.arguments_return arguments() throws RecognitionException {
        JVMParser.arguments_return retval = new JVMParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN223=null;
        Token DOT225=null;
        Token DOT226=null;
        Token DOT227=null;
        Token RPAREN228=null;
        JVMParser.typeList_return typeList224 =null;


        Object LPAREN223_tree=null;
        Object DOT225_tree=null;
        Object DOT226_tree=null;
        Object DOT227_tree=null;
        Object RPAREN228_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:373:3: ( LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN -> ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:373:5: LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN
            {
            LPAREN223=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments3070); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN223);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:373:12: ( typeList )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==BOOLEAN||(LA57_0 >= BYTE && LA57_0 <= BaseType)||LA57_0==CHAR||LA57_0==Constant_type||LA57_0==DOUBLE||LA57_0==FLOAT||LA57_0==IDENTIFIER||LA57_0==INT||LA57_0==LONG||LA57_0==QualifiedType||LA57_0==SHORT||LA57_0==VOID||LA57_0==VoidType) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:373:12: typeList
                    {
                    pushFollow(FOLLOW_typeList_in_arguments3072);
                    typeList224=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList224.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:373:22: ( DOT DOT DOT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==DOT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:373:23: DOT DOT DOT
                    {
                    DOT225=(Token)match(input,DOT,FOLLOW_DOT_in_arguments3076); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT225);


                    DOT226=(Token)match(input,DOT,FOLLOW_DOT_in_arguments3078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT226);


                    DOT227=(Token)match(input,DOT,FOLLOW_DOT_in_arguments3080); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT227);


                    }
                    break;

            }


            RPAREN228=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments3084); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN228);


            // AST REWRITE
            // elements: DOT, DOT, DOT, typeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 373:44: -> ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:373:47: ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITARGUMENTS, "UNITARGUMENTS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:373:63: ( typeList )?
                if ( stream_typeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeList.nextTree());

                }
                stream_typeList.reset();

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:373:73: ( DOT DOT DOT )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:380:1: body : ( Synthetic BOOLEANLITERAL )? Code codeBlock ( bodyExtension )* -> ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* ;
    public final JVMParser.body_return body() throws RecognitionException {
        JVMParser.body_return retval = new JVMParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Synthetic229=null;
        Token BOOLEANLITERAL230=null;
        Token Code231=null;
        JVMParser.codeBlock_return codeBlock232 =null;

        JVMParser.bodyExtension_return bodyExtension233 =null;


        Object Synthetic229_tree=null;
        Object BOOLEANLITERAL230_tree=null;
        Object Code231_tree=null;
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");
        RewriteRuleTokenStream stream_Code=new RewriteRuleTokenStream(adaptor,"token Code");
        RewriteRuleSubtreeStream stream_bodyExtension=new RewriteRuleSubtreeStream(adaptor,"rule bodyExtension");
        RewriteRuleSubtreeStream stream_codeBlock=new RewriteRuleSubtreeStream(adaptor,"rule codeBlock");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:381:3: ( ( Synthetic BOOLEANLITERAL )? Code codeBlock ( bodyExtension )* -> ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )* )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:382:5: ( Synthetic BOOLEANLITERAL )? Code codeBlock ( bodyExtension )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:382:5: ( Synthetic BOOLEANLITERAL )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Synthetic) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:382:6: Synthetic BOOLEANLITERAL
                    {
                    Synthetic229=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_body3129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic229);


                    BOOLEANLITERAL230=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_body3131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL230);


                    }
                    break;

            }


            Code231=(Token)match(input,Code,FOLLOW_Code_in_body3139); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Code.add(Code231);


            pushFollow(FOLLOW_codeBlock_in_body3146);
            codeBlock232=codeBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_codeBlock.add(codeBlock232.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:385:5: ( bodyExtension )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==ExceptionTable||(LA60_0 >= LineNumberTable && LA60_0 <= LocalVariableTypeTable)||(LA60_0 >= StackMap && LA60_0 <= StackMapTable)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:385:5: bodyExtension
            	    {
            	    pushFollow(FOLLOW_bodyExtension_in_body3152);
            	    bodyExtension233=bodyExtension();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bodyExtension.add(bodyExtension233.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            // AST REWRITE
            // elements: Synthetic, codeBlock, bodyExtension, Code, BOOLEANLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 385:20: -> ( Synthetic BOOLEANLITERAL )? ^( Code codeBlock ) ( bodyExtension )*
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:385:23: ( Synthetic BOOLEANLITERAL )?
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

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:385:51: ^( Code codeBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Code.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_codeBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:385:69: ( bodyExtension )*
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:388:1: bodyExtension : ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable ( lineNumberTable )? -> ^( LineNumberTable ( lineNumberTable )? ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) ) ;
    public final JVMParser.bodyExtension_return bodyExtension() throws RecognitionException {
        JVMParser.bodyExtension_return retval = new JVMParser.bodyExtension_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ExceptionTable234=null;
        Token LineNumberTable236=null;
        Token LocalVariableTable238=null;
        Token LocalVariableTypeTable240=null;
        Token StackMapTable242=null;
        Token StackMap244=null;
        JVMParser.exceptionTable_return exceptionTable235 =null;

        JVMParser.lineNumberTable_return lineNumberTable237 =null;

        JVMParser.localVariableTable_return localVariableTable239 =null;

        JVMParser.localVariableTable_return localVariableTable241 =null;

        JVMParser.stackMapTable_return stackMapTable243 =null;

        JVMParser.stackMapTypeTable_return stackMapTypeTable245 =null;


        Object ExceptionTable234_tree=null;
        Object LineNumberTable236_tree=null;
        Object LocalVariableTable238_tree=null;
        Object LocalVariableTypeTable240_tree=null;
        Object StackMapTable242_tree=null;
        Object StackMap244_tree=null;
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:389:3: ( ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable ( lineNumberTable )? -> ^( LineNumberTable ( lineNumberTable )? ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:390:3: ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable ( lineNumberTable )? -> ^( LineNumberTable ( lineNumberTable )? ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) )
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:390:3: ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable ( lineNumberTable )? -> ^( LineNumberTable ( lineNumberTable )? ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) )
            int alt62=6;
            switch ( input.LA(1) ) {
            case ExceptionTable:
                {
                alt62=1;
                }
                break;
            case LineNumberTable:
                {
                alt62=2;
                }
                break;
            case LocalVariableTable:
                {
                alt62=3;
                }
                break;
            case LocalVariableTypeTable:
                {
                alt62=4;
                }
                break;
            case StackMapTable:
                {
                alt62=5;
                }
                break;
            case StackMap:
                {
                alt62=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:390:5: ExceptionTable exceptionTable
                    {
                    ExceptionTable234=(Token)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension3190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ExceptionTable.add(ExceptionTable234);


                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension3193);
                    exceptionTable235=exceptionTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exceptionTable.add(exceptionTable235.getTree());

                    // AST REWRITE
                    // elements: exceptionTable, ExceptionTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 390:49: -> ^( ExceptionTable exceptionTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:390:52: ^( ExceptionTable exceptionTable )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:5: LineNumberTable ( lineNumberTable )?
                    {
                    LineNumberTable236=(Token)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension3221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LineNumberTable.add(LineNumberTable236);


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:22: ( lineNumberTable )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==IDENTIFIER) ) {
                        int LA61_1 = input.LA(2);

                        if ( (LA61_1==INTLITERAL) ) {
                            alt61=1;
                        }
                    }
                    switch (alt61) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:22: lineNumberTable
                            {
                            pushFollow(FOLLOW_lineNumberTable_in_bodyExtension3224);
                            lineNumberTable237=lineNumberTable();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_lineNumberTable.add(lineNumberTable237.getTree());

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
                    // 391:50: -> ^( LineNumberTable ( lineNumberTable )? )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:53: ^( LineNumberTable ( lineNumberTable )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LineNumberTable.nextNode()
                        , root_1);

                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:391:72: ( lineNumberTable )?
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:392:5: LocalVariableTable localVariableTable
                    {
                    LocalVariableTable238=(Token)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension3252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LocalVariableTable.add(LocalVariableTable238);


                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension3255);
                    localVariableTable239=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_localVariableTable.add(localVariableTable239.getTree());

                    // AST REWRITE
                    // elements: localVariableTable, LocalVariableTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 392:49: -> ^( LocalVariableTable localVariableTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:392:52: ^( LocalVariableTable localVariableTable )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:393:5: LocalVariableTypeTable localVariableTable
                    {
                    LocalVariableTypeTable240=(Token)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension3275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LocalVariableTypeTable.add(LocalVariableTypeTable240);


                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension3278);
                    localVariableTable241=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_localVariableTable.add(localVariableTable241.getTree());

                    // AST REWRITE
                    // elements: LocalVariableTypeTable, localVariableTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 393:49: -> ^( LocalVariableTypeTable localVariableTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:393:52: ^( LocalVariableTypeTable localVariableTable )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:394:5: StackMapTable stackMapTable
                    {
                    StackMapTable242=(Token)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension3294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StackMapTable.add(StackMapTable242);


                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension3296);
                    stackMapTable243=stackMapTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stackMapTable.add(stackMapTable243.getTree());

                    // AST REWRITE
                    // elements: stackMapTable, StackMapTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 394:49: -> ^( StackMapTable stackMapTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:394:52: ^( StackMapTable stackMapTable )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:395:5: StackMap stackMapTypeTable
                    {
                    StackMap244=(Token)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension3326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StackMap.add(StackMap244);


                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension3328);
                    stackMapTypeTable245=stackMapTypeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stackMapTypeTable.add(stackMapTypeTable245.getTree());

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
                    // 395:49: -> ^( StackMap stackMapTypeTable )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:395:52: ^( StackMap stackMapTypeTable )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:399:1: codeBlock : variables ( instructionSet )* codeBlockEnd -> ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) ;
    public final JVMParser.codeBlock_return codeBlock() throws RecognitionException {
        JVMParser.codeBlock_return retval = new JVMParser.codeBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.variables_return variables246 =null;

        JVMParser.instructionSet_return instructionSet247 =null;

        JVMParser.codeBlockEnd_return codeBlockEnd248 =null;


        RewriteRuleSubtreeStream stream_codeBlockEnd=new RewriteRuleSubtreeStream(adaptor,"rule codeBlockEnd");
        RewriteRuleSubtreeStream stream_instructionSet=new RewriteRuleSubtreeStream(adaptor,"rule instructionSet");
        RewriteRuleSubtreeStream stream_variables=new RewriteRuleSubtreeStream(adaptor,"rule variables");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:400:3: ( variables ( instructionSet )* codeBlockEnd -> ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:400:5: variables ( instructionSet )* codeBlockEnd
            {
            pushFollow(FOLLOW_variables_in_codeBlock3370);
            variables246=variables();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variables.add(variables246.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:401:5: ( instructionSet )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==INTLITERAL) ) {
                    int LA63_1 = input.LA(2);

                    if ( (LA63_1==COLON) ) {
                        int LA63_2 = input.LA(3);

                        if ( (LA63_2==IDENTIFIER) ) {
                            switch ( input.LA(4) ) {
                            case COMMA:
                            case CPINDEX:
                            case LBRACE:
                                {
                                alt63=1;
                                }
                                break;
                            case INTLITERAL:
                                {
                                int LA63_5 = input.LA(5);

                                if ( ((LA63_5 >= COLON && LA63_5 <= COMMA)||LA63_5==INTLITERAL) ) {
                                    alt63=1;
                                }


                                }
                                break;
                            case BOOLEAN:
                                {
                                int LA63_7 = input.LA(5);

                                if ( (LA63_7==COMMA||LA63_7==INTLITERAL) ) {
                                    alt63=1;
                                }


                                }
                                break;
                            case DOUBLE:
                            case FLOAT:
                                {
                                int LA63_8 = input.LA(5);

                                if ( (LA63_8==COMMA||LA63_8==INTLITERAL) ) {
                                    alt63=1;
                                }


                                }
                                break;
                            case BYTE:
                            case CHAR:
                            case INT:
                            case LONG:
                            case SHORT:
                                {
                                int LA63_9 = input.LA(5);

                                if ( (LA63_9==COMMA||LA63_9==INTLITERAL) ) {
                                    alt63=1;
                                }


                                }
                                break;
                            case VOID:
                                {
                                int LA63_10 = input.LA(5);

                                if ( (LA63_10==COMMA||LA63_10==INTLITERAL) ) {
                                    alt63=1;
                                }


                                }
                                break;

                            }

                        }


                    }


                }


                switch (alt63) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:401:5: instructionSet
            	    {
            	    pushFollow(FOLLOW_instructionSet_in_codeBlock3377);
            	    instructionSet247=instructionSet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_instructionSet.add(instructionSet247.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock3384);
            codeBlockEnd248=codeBlockEnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_codeBlockEnd.add(codeBlockEnd248.getTree());

            // AST REWRITE
            // elements: instructionSet, variables, codeBlockEnd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 402:49: -> ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:402:52: ^( VARINFO variables )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VARINFO, "VARINFO")
                , root_1);

                adaptor.addChild(root_1, stream_variables.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:402:73: ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INSTRUCTION, "INSTRUCTION")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:402:87: ( instructionSet )*
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:405:1: instructionSet : ( codeLine | javaSwitch );
    public final JVMParser.instructionSet_return instructionSet() throws RecognitionException {
        JVMParser.instructionSet_return retval = new JVMParser.instructionSet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.codeLine_return codeLine249 =null;

        JVMParser.javaSwitch_return javaSwitch250 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:406:3: ( codeLine | javaSwitch )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==INTLITERAL) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==COLON) ) {
                    int LA64_2 = input.LA(3);

                    if ( (LA64_2==IDENTIFIER) ) {
                        int LA64_3 = input.LA(4);

                        if ( (LA64_3==LBRACE) ) {
                            alt64=2;
                        }
                        else if ( (LA64_3==BOOLEAN||LA64_3==BYTE||LA64_3==CHAR||LA64_3==COMMA||LA64_3==CPINDEX||LA64_3==DOUBLE||LA64_3==FLOAT||LA64_3==INT||LA64_3==INTLITERAL||LA64_3==LONG||LA64_3==SHORT||LA64_3==VOID) ) {
                            alt64=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:406:5: codeLine
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_codeLine_in_instructionSet3445);
                    codeLine249=codeLine();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, codeLine249.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:406:16: javaSwitch
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_javaSwitch_in_instructionSet3449);
                    javaSwitch250=javaSwitch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaSwitch250.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:409:1: codeLine : pc IDENTIFIER ( operand1 )? ( COMMA INTLITERAL )? -> ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) ;
    public final JVMParser.codeLine_return codeLine() throws RecognitionException {
        JVMParser.codeLine_return retval = new JVMParser.codeLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER252=null;
        Token COMMA254=null;
        Token INTLITERAL255=null;
        JVMParser.pc_return pc251 =null;

        JVMParser.operand1_return operand1253 =null;


        Object IDENTIFIER252_tree=null;
        Object COMMA254_tree=null;
        Object INTLITERAL255_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_operand1=new RewriteRuleSubtreeStream(adaptor,"rule operand1");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:3: ( pc IDENTIFIER ( operand1 )? ( COMMA INTLITERAL )? -> ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:5: pc IDENTIFIER ( operand1 )? ( COMMA INTLITERAL )?
            {
            pushFollow(FOLLOW_pc_in_codeLine3462);
            pc251=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc251.getTree());

            IDENTIFIER252=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine3464); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER252);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:19: ( operand1 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==BOOLEAN||LA65_0==BYTE||LA65_0==CHAR||LA65_0==CPINDEX||LA65_0==DOUBLE||LA65_0==FLOAT||LA65_0==INT||LA65_0==LONG||LA65_0==SHORT||LA65_0==VOID) ) {
                alt65=1;
            }
            else if ( (LA65_0==INTLITERAL) ) {
                int LA65_2 = input.LA(2);

                if ( (LA65_2==COMMA||LA65_2==INTLITERAL) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:19: operand1
                    {
                    pushFollow(FOLLOW_operand1_in_codeLine3466);
                    operand1253=operand1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand1.add(operand1253.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:29: ( COMMA INTLITERAL )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==COMMA) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:30: COMMA INTLITERAL
                    {
                    COMMA254=(Token)match(input,COMMA,FOLLOW_COMMA_in_codeLine3470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA254);


                    INTLITERAL255=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeLine3472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL255);


                    }
                    break;

            }


            // AST REWRITE
            // elements: pc, IDENTIFIER, INTLITERAL, operand1
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 410:49: -> ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:52: ^( IDENTIFIER pc ^( OPERAND ( operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:68: ^( OPERAND ( operand1 )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPERAND, "OPERAND")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:78: ( operand1 )?
                if ( stream_operand1.hasNext() ) {
                    adaptor.addChild(root_2, stream_operand1.nextTree());

                }
                stream_operand1.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:89: ^( OPERAND ( INTLITERAL )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPERAND, "OPERAND")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:410:99: ( INTLITERAL )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:413:1: codeBlockEnd : pc IDENTIFIER ( INTLITERAL )? -> ^( IDENTIFIER pc ( INTLITERAL )? ) ;
    public final JVMParser.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        JVMParser.codeBlockEnd_return retval = new JVMParser.codeBlockEnd_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER257=null;
        Token INTLITERAL258=null;
        JVMParser.pc_return pc256 =null;


        Object IDENTIFIER257_tree=null;
        Object INTLITERAL258_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:414:3: ( pc IDENTIFIER ( INTLITERAL )? -> ^( IDENTIFIER pc ( INTLITERAL )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:414:5: pc IDENTIFIER ( INTLITERAL )?
            {
            pushFollow(FOLLOW_pc_in_codeBlockEnd3509);
            pc256=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc256.getTree());

            IDENTIFIER257=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd3511); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER257);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:414:19: ( INTLITERAL )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==INTLITERAL) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:414:19: INTLITERAL
                    {
                    INTLITERAL258=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeBlockEnd3513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL258);


                    }
                    break;

            }


            // AST REWRITE
            // elements: pc, INTLITERAL, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 414:45: -> ^( IDENTIFIER pc ( INTLITERAL )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:414:48: ^( IDENTIFIER pc ( INTLITERAL )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:414:64: ( INTLITERAL )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:417:1: operand1 : ( CPINDEX | INTLITERAL | primitiveType );
    public final JVMParser.operand1_return operand1() throws RecognitionException {
        JVMParser.operand1_return retval = new JVMParser.operand1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX259=null;
        Token INTLITERAL260=null;
        JVMParser.primitiveType_return primitiveType261 =null;


        Object CPINDEX259_tree=null;
        Object INTLITERAL260_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:418:3: ( CPINDEX | INTLITERAL | primitiveType )
            int alt68=3;
            switch ( input.LA(1) ) {
            case CPINDEX:
                {
                alt68=1;
                }
                break;
            case INTLITERAL:
                {
                alt68=2;
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
                alt68=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }

            switch (alt68) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:418:5: CPINDEX
                    {
                    root_0 = (Object)adaptor.nil();


                    CPINDEX259=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_operand13554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CPINDEX259_tree = 
                    (Object)adaptor.create(CPINDEX259)
                    ;
                    adaptor.addChild(root_0, CPINDEX259_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:419:5: INTLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    INTLITERAL260=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_operand13561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL260_tree = 
                    (Object)adaptor.create(INTLITERAL260)
                    ;
                    adaptor.addChild(root_0, INTLITERAL260_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:420:5: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_operand13567);
                    primitiveType261=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType261.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:423:1: variables : variable COMMA variable COMMA variable -> variable variable variable ;
    public final JVMParser.variables_return variables() throws RecognitionException {
        JVMParser.variables_return retval = new JVMParser.variables_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA263=null;
        Token COMMA265=null;
        JVMParser.variable_return variable262 =null;

        JVMParser.variable_return variable264 =null;

        JVMParser.variable_return variable266 =null;


        Object COMMA263_tree=null;
        Object COMMA265_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:424:3: ( variable COMMA variable COMMA variable -> variable variable variable )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:424:5: variable COMMA variable COMMA variable
            {
            pushFollow(FOLLOW_variable_in_variables3580);
            variable262=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable262.getTree());

            COMMA263=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables3582); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA263);


            pushFollow(FOLLOW_variable_in_variables3584);
            variable264=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable264.getTree());

            COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables3586); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA265);


            pushFollow(FOLLOW_variable_in_variables3588);
            variable266=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable266.getTree());

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
            // 424:44: -> variable variable variable
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:427:1: variable : IDENTIFIER ASSIGN INTLITERAL -> ^( ASSIGN IDENTIFIER INTLITERAL ) ;
    public final JVMParser.variable_return variable() throws RecognitionException {
        JVMParser.variable_return retval = new JVMParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER267=null;
        Token ASSIGN268=null;
        Token INTLITERAL269=null;

        Object IDENTIFIER267_tree=null;
        Object ASSIGN268_tree=null;
        Object INTLITERAL269_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:428:3: ( IDENTIFIER ASSIGN INTLITERAL -> ^( ASSIGN IDENTIFIER INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:428:5: IDENTIFIER ASSIGN INTLITERAL
            {
            IDENTIFIER267=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable3609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER267);


            ASSIGN268=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable3611); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN268);


            INTLITERAL269=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable3613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL269);


            // AST REWRITE
            // elements: INTLITERAL, ASSIGN, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 428:44: -> ^( ASSIGN IDENTIFIER INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:428:47: ^( ASSIGN IDENTIFIER INTLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:431:1: javaSwitch : pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE -> ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) ;
    public final JVMParser.javaSwitch_return javaSwitch() throws RecognitionException {
        JVMParser.javaSwitch_return retval = new JVMParser.javaSwitch_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER271=null;
        Token LBRACE272=null;
        Token RBRACE275=null;
        JVMParser.pc_return pc270 =null;

        JVMParser.switchLine_return switchLine273 =null;

        JVMParser.switchDefaultLine_return switchDefaultLine274 =null;


        Object IDENTIFIER271_tree=null;
        Object LBRACE272_tree=null;
        Object RBRACE275_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_switchDefaultLine=new RewriteRuleSubtreeStream(adaptor,"rule switchDefaultLine");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        RewriteRuleSubtreeStream stream_switchLine=new RewriteRuleSubtreeStream(adaptor,"rule switchLine");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:432:3: ( pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE -> ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:432:5: pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE
            {
            pushFollow(FOLLOW_pc_in_javaSwitch3648);
            pc270=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc270.getTree());

            IDENTIFIER271=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch3650); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER271);


            LBRACE272=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_javaSwitch3656); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE272);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:434:5: ( switchLine )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==INTLITERAL) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:434:5: switchLine
            	    {
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch3663);
            	    switchLine273=switchLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_switchLine.add(switchLine273.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch3670);
            switchDefaultLine274=switchDefaultLine();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchDefaultLine.add(switchDefaultLine274.getTree());

            RBRACE275=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_javaSwitch3676); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE275);


            // AST REWRITE
            // elements: switchLine, IDENTIFIER, pc, switchDefaultLine
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 436:45: -> ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:436:48: ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SWITCH, "SWITCH")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:436:57: ^( IDENTIFIER pc ( switchLine )* switchDefaultLine )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_pc.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:436:73: ( switchLine )*
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:439:1: switchLine : pc INTLITERAL ;
    public final JVMParser.switchLine_return switchLine() throws RecognitionException {
        JVMParser.switchLine_return retval = new JVMParser.switchLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL277=null;
        JVMParser.pc_return pc276 =null;


        Object INTLITERAL277_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:440:3: ( pc INTLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:440:5: pc INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_switchLine3741);
            pc276=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc276.getTree());

            INTLITERAL277=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine3743); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL277_tree = 
            (Object)adaptor.create(INTLITERAL277)
            ;
            adaptor.addChild(root_0, INTLITERAL277_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:443:1: switchDefaultLine : DEFAULT COLON INTLITERAL -> ^( DEFAULT INTLITERAL ) ;
    public final JVMParser.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        JVMParser.switchDefaultLine_return retval = new JVMParser.switchDefaultLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT278=null;
        Token COLON279=null;
        Token INTLITERAL280=null;

        Object DEFAULT278_tree=null;
        Object COLON279_tree=null;
        Object INTLITERAL280_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:444:3: ( DEFAULT COLON INTLITERAL -> ^( DEFAULT INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:444:5: DEFAULT COLON INTLITERAL
            {
            DEFAULT278=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine3757); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT278);


            COLON279=(Token)match(input,COLON,FOLLOW_COLON_in_switchDefaultLine3759); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON279);


            INTLITERAL280=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine3761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL280);


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
            // 444:45: -> ^( DEFAULT INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:444:48: ^( DEFAULT INTLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:451:1: throwClause : THROWS typeList -> ^( THROWS typeList ) ;
    public final JVMParser.throwClause_return throwClause() throws RecognitionException {
        JVMParser.throwClause_return retval = new JVMParser.throwClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token THROWS281=null;
        JVMParser.typeList_return typeList282 =null;


        Object THROWS281_tree=null;
        RewriteRuleTokenStream stream_THROWS=new RewriteRuleTokenStream(adaptor,"token THROWS");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:452:3: ( THROWS typeList -> ^( THROWS typeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:452:5: THROWS typeList
            {
            THROWS281=(Token)match(input,THROWS,FOLLOW_THROWS_in_throwClause3802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THROWS.add(THROWS281);


            pushFollow(FOLLOW_typeList_in_throwClause3804);
            typeList282=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList282.getTree());

            // AST REWRITE
            // elements: typeList, THROWS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 452:41: -> ^( THROWS typeList )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:452:44: ^( THROWS typeList )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:455:1: throwClauseMethod : THROWS throwType ( COMMA throwType )* -> ^( THROWS ( throwType )+ ) ;
    public final JVMParser.throwClauseMethod_return throwClauseMethod() throws RecognitionException {
        JVMParser.throwClauseMethod_return retval = new JVMParser.throwClauseMethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token THROWS283=null;
        Token COMMA285=null;
        JVMParser.throwType_return throwType284 =null;

        JVMParser.throwType_return throwType286 =null;


        Object THROWS283_tree=null;
        Object COMMA285_tree=null;
        RewriteRuleTokenStream stream_THROWS=new RewriteRuleTokenStream(adaptor,"token THROWS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_throwType=new RewriteRuleSubtreeStream(adaptor,"rule throwType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:456:3: ( THROWS throwType ( COMMA throwType )* -> ^( THROWS ( throwType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:456:5: THROWS throwType ( COMMA throwType )*
            {
            THROWS283=(Token)match(input,THROWS,FOLLOW_THROWS_in_throwClauseMethod3847); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THROWS.add(THROWS283);


            pushFollow(FOLLOW_throwType_in_throwClauseMethod3849);
            throwType284=throwType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_throwType.add(throwType284.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:456:22: ( COMMA throwType )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:456:23: COMMA throwType
            	    {
            	    COMMA285=(Token)match(input,COMMA,FOLLOW_COMMA_in_throwClauseMethod3852); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA285);


            	    pushFollow(FOLLOW_throwType_in_throwClauseMethod3854);
            	    throwType286=throwType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_throwType.add(throwType286.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            // AST REWRITE
            // elements: throwType, THROWS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 457:45: -> ^( THROWS ( throwType )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:457:48: ^( THROWS ( throwType )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:460:1: throwType : ( INTERNALTYPE | IDENTIFIER | QualifiedType );
    public final JVMParser.throwType_return throwType() throws RecognitionException {
        JVMParser.throwType_return retval = new JVMParser.throwType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set287=null;

        Object set287_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:461:3: ( INTERNALTYPE | IDENTIFIER | QualifiedType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set287=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE||input.LA(1)==QualifiedType ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set287)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:464:1: exceptionTable : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+ -> ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) ;
    public final JVMParser.exceptionTable_return exceptionTable() throws RecognitionException {
        JVMParser.exceptionTable_return retval = new JVMParser.exceptionTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER288=null;
        Token IDENTIFIER289=null;
        Token IDENTIFIER290=null;
        Token IDENTIFIER291=null;
        JVMParser.exceptionTableEntry_return exceptionTableEntry292 =null;


        Object IDENTIFIER288_tree=null;
        Object IDENTIFIER289_tree=null;
        Object IDENTIFIER290_tree=null;
        Object IDENTIFIER291_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_exceptionTableEntry=new RewriteRuleSubtreeStream(adaptor,"rule exceptionTableEntry");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:465:3: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+ -> ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:465:5: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+
            {
            IDENTIFIER288=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable3945); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER288);


            IDENTIFIER289=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable3947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER289);


            IDENTIFIER290=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable3949); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER290);


            IDENTIFIER291=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable3951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER291);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:466:5: ( exceptionTableEntry )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==INTLITERAL) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:466:5: exceptionTableEntry
            	    {
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable3958);
            	    exceptionTableEntry292=exceptionTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exceptionTableEntry.add(exceptionTableEntry292.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER, exceptionTableEntry, IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 466:29: -> ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( ETENTRY ( exceptionTableEntry )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:466:32: ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER )
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

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:466:88: ^( ETENTRY ( exceptionTableEntry )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:469:1: exceptionTableEntry : INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue -> INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue ;
    public final JVMParser.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        JVMParser.exceptionTableEntry_return retval = new JVMParser.exceptionTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL293=null;
        Token INTLITERAL294=null;
        Token INTLITERAL295=null;
        JVMParser.exceptionTableEntryValue_return exceptionTableEntryValue296 =null;


        Object INTLITERAL293_tree=null;
        Object INTLITERAL294_tree=null;
        Object INTLITERAL295_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleSubtreeStream stream_exceptionTableEntryValue=new RewriteRuleSubtreeStream(adaptor,"rule exceptionTableEntryValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:470:3: ( INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue -> INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:470:5: INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
            {
            INTLITERAL293=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry3996); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL293);


            INTLITERAL294=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry3998); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL294);


            INTLITERAL295=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry4000); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL295);


            pushFollow(FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry4002);
            exceptionTableEntryValue296=exceptionTableEntryValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exceptionTableEntryValue.add(exceptionTableEntryValue296.getTree());

            // AST REWRITE
            // elements: INTLITERAL, exceptionTableEntryValue, INTLITERAL, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 471:29: -> INTLITERAL INTLITERAL INTLITERAL exceptionTableEntryValue
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:473:1: exceptionTableEntryValue : ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE );
    public final JVMParser.exceptionTableEntryValue_return exceptionTableEntryValue() throws RecognitionException {
        JVMParser.exceptionTableEntryValue_return retval = new JVMParser.exceptionTableEntryValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER298=null;
        Token CONSTANT_TYPE_ASSIGNABLE299=null;
        JVMParser.primitiveType_return primitiveType297 =null;


        Object IDENTIFIER298_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE299_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:474:3: ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
            int alt72=3;
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
                alt72=1;
                }
                break;
            case IDENTIFIER:
                {
                alt72=2;
                }
                break;
            case CONSTANT_TYPE_ASSIGNABLE:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:474:5: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntryValue4052);
                    primitiveType297=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType297.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:475:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER298=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntryValue4058); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER298_tree = 
                    (Object)adaptor.create(IDENTIFIER298)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER298_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:476:5: CONSTANT_TYPE_ASSIGNABLE
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANT_TYPE_ASSIGNABLE299=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue4064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT_TYPE_ASSIGNABLE299_tree = 
                    (Object)adaptor.create(CONSTANT_TYPE_ASSIGNABLE299)
                    ;
                    adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE299_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:483:1: lineNumberTable : ( lineNumberTableLine )+ ;
    public final JVMParser.lineNumberTable_return lineNumberTable() throws RecognitionException {
        JVMParser.lineNumberTable_return retval = new JVMParser.lineNumberTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.lineNumberTableLine_return lineNumberTableLine300 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:484:3: ( ( lineNumberTableLine )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:484:5: ( lineNumberTableLine )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:484:5: ( lineNumberTableLine )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==IDENTIFIER) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==INTLITERAL) ) {
                        alt73=1;
                    }


                }


                switch (alt73) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:484:5: lineNumberTableLine
            	    {
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable4083);
            	    lineNumberTableLine300=lineNumberTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lineNumberTableLine300.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:487:1: lineNumberTableLine : IDENTIFIER pc INTLITERAL -> ^( IDENTIFIER pc INTLITERAL ) ;
    public final JVMParser.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        JVMParser.lineNumberTableLine_return retval = new JVMParser.lineNumberTableLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER301=null;
        Token INTLITERAL303=null;
        JVMParser.pc_return pc302 =null;


        Object IDENTIFIER301_tree=null;
        Object INTLITERAL303_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:488:3: ( IDENTIFIER pc INTLITERAL -> ^( IDENTIFIER pc INTLITERAL ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:488:5: IDENTIFIER pc INTLITERAL
            {
            IDENTIFIER301=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine4097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER301);


            pushFollow(FOLLOW_pc_in_lineNumberTableLine4099);
            pc302=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc302.getTree());

            INTLITERAL303=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine4101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL303);


            // AST REWRITE
            // elements: pc, INTLITERAL, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 488:30: -> ^( IDENTIFIER pc INTLITERAL )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:488:33: ^( IDENTIFIER pc INTLITERAL )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:495:1: localVariableTable : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )* -> ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) ;
    public final JVMParser.localVariableTable_return localVariableTable() throws RecognitionException {
        JVMParser.localVariableTable_return retval = new JVMParser.localVariableTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER304=null;
        Token IDENTIFIER305=null;
        Token IDENTIFIER306=null;
        Token IDENTIFIER307=null;
        Token IDENTIFIER308=null;
        JVMParser.localVariableTableLine_return localVariableTableLine309 =null;


        Object IDENTIFIER304_tree=null;
        Object IDENTIFIER305_tree=null;
        Object IDENTIFIER306_tree=null;
        Object IDENTIFIER307_tree=null;
        Object IDENTIFIER308_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_localVariableTableLine=new RewriteRuleSubtreeStream(adaptor,"rule localVariableTableLine");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:496:3: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )* -> ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:496:5: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )*
            {
            IDENTIFIER304=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4132); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER304);


            IDENTIFIER305=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4134); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER305);


            IDENTIFIER306=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER306);


            IDENTIFIER307=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4138); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER307);


            IDENTIFIER308=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4140); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER308);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:497:5: ( localVariableTableLine )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==INTLITERAL) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:497:5: localVariableTableLine
            	    {
            	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable4147);
            	    localVariableTableLine309=localVariableTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_localVariableTableLine.add(localVariableTableLine309.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER, localVariableTableLine, IDENTIFIER, IDENTIFIER, IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 497:39: -> ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ^( LVENTRY ( localVariableTableLine )* )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:497:42: ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER )
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

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:497:109: ^( LVENTRY ( localVariableTableLine )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LVENTRY, "LVENTRY")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:497:119: ( localVariableTableLine )*
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:500:1: localVariableTableLine : INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType ;
    public final JVMParser.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        JVMParser.localVariableTableLine_return retval = new JVMParser.localVariableTableLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL310=null;
        Token INTLITERAL311=null;
        Token INTLITERAL312=null;
        JVMParser.localVariableTableLineIdentifier_return localVariableTableLineIdentifier313 =null;

        JVMParser.bytecodeType_return bytecodeType314 =null;


        Object INTLITERAL310_tree=null;
        Object INTLITERAL311_tree=null;
        Object INTLITERAL312_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:501:3: ( INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:501:5: INTLITERAL INTLITERAL INTLITERAL localVariableTableLineIdentifier bytecodeType
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL310=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine4196); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL310_tree = 
            (Object)adaptor.create(INTLITERAL310)
            ;
            adaptor.addChild(root_0, INTLITERAL310_tree);
            }

            INTLITERAL311=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine4198); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL311_tree = 
            (Object)adaptor.create(INTLITERAL311)
            ;
            adaptor.addChild(root_0, INTLITERAL311_tree);
            }

            INTLITERAL312=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine4200); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL312_tree = 
            (Object)adaptor.create(INTLITERAL312)
            ;
            adaptor.addChild(root_0, INTLITERAL312_tree);
            }

            pushFollow(FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine4202);
            localVariableTableLineIdentifier313=localVariableTableLineIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableTableLineIdentifier313.getTree());

            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine4204);
            bytecodeType314=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType314.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:504:1: localVariableTableLineIdentifier : (id1= keywordAggregate -> IDENTIFIER[$id1.text] |id2= STATIC -> IDENTIFIER[$id2] ) ;
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:505:3: ( (id1= keywordAggregate -> IDENTIFIER[$id1.text] |id2= STATIC -> IDENTIFIER[$id2] ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:506:3: (id1= keywordAggregate -> IDENTIFIER[$id1.text] |id2= STATIC -> IDENTIFIER[$id2] )
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:506:3: (id1= keywordAggregate -> IDENTIFIER[$id1.text] |id2= STATIC -> IDENTIFIER[$id2] )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==BOOLEAN||(LA75_0 >= BYTE && LA75_0 <= BaseType)||LA75_0==CHAR||LA75_0==CLASS||LA75_0==Constant_type||LA75_0==DEFAULT||LA75_0==DOUBLE||LA75_0==EXTENDS||LA75_0==FLOAT||(LA75_0 >= IDENTIFIER && LA75_0 <= IMPLEMENTS)||LA75_0==INT||LA75_0==LONG||LA75_0==NATIVE||LA75_0==SHORT||LA75_0==SUPER||LA75_0==THROWS||LA75_0==VOID||LA75_0==VoidType) ) {
                alt75=1;
            }
            else if ( (LA75_0==STATIC) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:506:5: id1= keywordAggregate
                    {
                    pushFollow(FOLLOW_keywordAggregate_in_localVariableTableLineIdentifier4224);
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
                    // 506:27: -> IDENTIFIER[$id1.text]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:507:5: id2= STATIC
                    {
                    id2=(Token)match(input,STATIC,FOLLOW_STATIC_in_localVariableTableLineIdentifier4238); if (state.failed) return retval; 
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
                    // 507:27: -> IDENTIFIER[$id2]
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:515:1: stackMapTypeTable : IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+ -> ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) ;
    public final JVMParser.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        JVMParser.stackMapTypeTable_return retval = new JVMParser.stackMapTypeTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER315=null;
        Token ASSIGN316=null;
        Token INTLITERAL317=null;
        JVMParser.stackMapTypeTableEntry_return stackMapTypeTableEntry318 =null;


        Object IDENTIFIER315_tree=null;
        Object ASSIGN316_tree=null;
        Object INTLITERAL317_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_stackMapTypeTableEntry=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTypeTableEntry");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:516:3: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+ -> ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:516:5: IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+
            {
            IDENTIFIER315=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable4277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER315);


            ASSIGN316=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable4279); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN316);


            INTLITERAL317=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable4281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL317);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:517:5: ( stackMapTypeTableEntry )+
            int cnt76=0;
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==IDENTIFIER) ) {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==ASSIGN) ) {
                        alt76=1;
                    }


                }


                switch (alt76) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:517:5: stackMapTypeTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable4288);
            	    stackMapTypeTableEntry318=stackMapTypeTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTypeTableEntry.add(stackMapTypeTableEntry318.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
            } while (true);


            // AST REWRITE
            // elements: ASSIGN, stackMapTypeTableEntry, IDENTIFIER, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 517:41: -> ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY ( stackMapTypeTableEntry )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:517:45: ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL )
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

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:517:87: ^( SMTENTRY ( stackMapTypeTableEntry )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:520:1: stackMapTypeTableEntry : IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer ;
    public final JVMParser.stackMapTypeTableEntry_return stackMapTypeTableEntry() throws RecognitionException {
        JVMParser.stackMapTypeTableEntry_return retval = new JVMParser.stackMapTypeTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER319=null;
        Token ASSIGN320=null;
        Token INTLITERAL321=null;
        Token IDENTIFIER322=null;
        Token ASSIGN323=null;
        Token INTLITERAL324=null;
        Token IDENTIFIER325=null;
        Token ASSIGN326=null;
        Token IDENTIFIER328=null;
        Token ASSIGN329=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer327 =null;

        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer330 =null;


        Object IDENTIFIER319_tree=null;
        Object ASSIGN320_tree=null;
        Object INTLITERAL321_tree=null;
        Object IDENTIFIER322_tree=null;
        Object ASSIGN323_tree=null;
        Object INTLITERAL324_tree=null;
        Object IDENTIFIER325_tree=null;
        Object ASSIGN326_tree=null;
        Object IDENTIFIER328_tree=null;
        Object ASSIGN329_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:521:3: ( IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:521:5: IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER319=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4334); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER319_tree = 
            (Object)adaptor.create(IDENTIFIER319)
            ;
            adaptor.addChild(root_0, IDENTIFIER319_tree);
            }

            ASSIGN320=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN320_tree = 
            (Object)adaptor.create(ASSIGN320)
            ;
            adaptor.addChild(root_0, ASSIGN320_tree);
            }

            INTLITERAL321=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4338); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL321_tree = 
            (Object)adaptor.create(INTLITERAL321)
            ;
            adaptor.addChild(root_0, INTLITERAL321_tree);
            }

            IDENTIFIER322=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4340); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER322_tree = 
            (Object)adaptor.create(IDENTIFIER322)
            ;
            adaptor.addChild(root_0, IDENTIFIER322_tree);
            }

            ASSIGN323=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4342); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN323_tree = 
            (Object)adaptor.create(ASSIGN323)
            ;
            adaptor.addChild(root_0, ASSIGN323_tree);
            }

            INTLITERAL324=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4344); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL324_tree = 
            (Object)adaptor.create(INTLITERAL324)
            ;
            adaptor.addChild(root_0, INTLITERAL324_tree);
            }

            IDENTIFIER325=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4351); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER325_tree = 
            (Object)adaptor.create(IDENTIFIER325)
            ;
            adaptor.addChild(root_0, IDENTIFIER325_tree);
            }

            ASSIGN326=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4353); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN326_tree = 
            (Object)adaptor.create(ASSIGN326)
            ;
            adaptor.addChild(root_0, ASSIGN326_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4355);
            stackMapTableTypesContainer327=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer327.getTree());

            IDENTIFIER328=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4362); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER328_tree = 
            (Object)adaptor.create(IDENTIFIER328)
            ;
            adaptor.addChild(root_0, IDENTIFIER328_tree);
            }

            ASSIGN329=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4364); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN329_tree = 
            (Object)adaptor.create(ASSIGN329)
            ;
            adaptor.addChild(root_0, ASSIGN329_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4366);
            stackMapTableTypesContainer330=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer330.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:530:1: stackMapTable : IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+ -> ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) ;
    public final JVMParser.stackMapTable_return stackMapTable() throws RecognitionException {
        JVMParser.stackMapTable_return retval = new JVMParser.stackMapTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER331=null;
        Token ASSIGN332=null;
        Token INTLITERAL333=null;
        JVMParser.stackMapTableEntry_return stackMapTableEntry334 =null;


        Object IDENTIFIER331_tree=null;
        Object ASSIGN332_tree=null;
        Object INTLITERAL333_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_stackMapTableEntry=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableEntry");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:531:3: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+ -> ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:531:5: IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+
            {
            IDENTIFIER331=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable4384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER331);


            ASSIGN332=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable4386); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN332);


            INTLITERAL333=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable4388); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL333);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:532:5: ( stackMapTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:532:5: stackMapTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable4395);
            	    stackMapTableEntry334=stackMapTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTableEntry.add(stackMapTableEntry334.getTree());

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
            // elements: stackMapTableEntry, INTLITERAL, ASSIGN, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 532:49: -> ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY ( stackMapTableEntry )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:532:52: ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL )
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

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:532:93: ^( SMENTRY ( stackMapTableEntry )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:534:1: stackMapTableEntry : IDENTIFIER ASSIGN stackMapTableEntryValue -> ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) ;
    public final JVMParser.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        JVMParser.stackMapTableEntry_return retval = new JVMParser.stackMapTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER335=null;
        Token ASSIGN336=null;
        JVMParser.stackMapTableEntryValue_return stackMapTableEntryValue337 =null;


        Object IDENTIFIER335_tree=null;
        Object ASSIGN336_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_stackMapTableEntryValue=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableEntryValue");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:535:3: ( IDENTIFIER ASSIGN stackMapTableEntryValue -> ^( ASSIGN IDENTIFIER stackMapTableEntryValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:535:5: IDENTIFIER ASSIGN stackMapTableEntryValue
            {
            IDENTIFIER335=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry4451); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER335);


            ASSIGN336=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry4453); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN336);


            pushFollow(FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry4455);
            stackMapTableEntryValue337=stackMapTableEntryValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stackMapTableEntryValue.add(stackMapTableEntryValue337.getTree());

            // AST REWRITE
            // elements: IDENTIFIER, ASSIGN, stackMapTableEntryValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 535:49: -> ^( ASSIGN IDENTIFIER stackMapTableEntryValue )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:535:52: ^( ASSIGN IDENTIFIER stackMapTableEntryValue )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:537:1: stackMapTableEntryValue : ( INTLITERAL | stackMapTableTypesContainer );
    public final JVMParser.stackMapTableEntryValue_return stackMapTableEntryValue() throws RecognitionException {
        JVMParser.stackMapTableEntryValue_return retval = new JVMParser.stackMapTableEntryValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL338=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer339 =null;


        Object INTLITERAL338_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:538:3: ( INTLITERAL | stackMapTableTypesContainer )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==INTLITERAL) ) {
                alt78=1;
            }
            else if ( (LA78_0==LBRACK) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:538:5: INTLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    INTLITERAL338=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntryValue4479); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL338_tree = 
                    (Object)adaptor.create(INTLITERAL338)
                    ;
                    adaptor.addChild(root_0, INTLITERAL338_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:538:18: stackMapTableTypesContainer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue4483);
                    stackMapTableTypesContainer339=stackMapTableTypesContainer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer339.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:541:1: stackMapTableTypesContainer : LBRACK stackMapTableTypes RBRACK -> stackMapTableTypes ;
    public final JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        JVMParser.stackMapTableTypesContainer_return retval = new JVMParser.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK340=null;
        Token RBRACK342=null;
        JVMParser.stackMapTableTypes_return stackMapTableTypes341 =null;


        Object LBRACK340_tree=null;
        Object RBRACK342_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_stackMapTableTypes=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableTypes");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:542:3: ( LBRACK stackMapTableTypes RBRACK -> stackMapTableTypes )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:542:5: LBRACK stackMapTableTypes RBRACK
            {
            LBRACK340=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_stackMapTableTypesContainer4496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK340);


            pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer4498);
            stackMapTableTypes341=stackMapTableTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stackMapTableTypes.add(stackMapTableTypes341.getTree());

            RBRACK342=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_stackMapTableTypesContainer4500); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK342);


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
            // 542:51: -> stackMapTableTypes
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:545:1: stackMapTableTypes : ( stackMapTableType )? ( COMMA stackMapTableType )* -> ^( SMTTYPES ( stackMapTableType )* ) ;
    public final JVMParser.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        JVMParser.stackMapTableTypes_return retval = new JVMParser.stackMapTableTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA344=null;
        JVMParser.stackMapTableType_return stackMapTableType343 =null;

        JVMParser.stackMapTableType_return stackMapTableType345 =null;


        Object COMMA344_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_stackMapTableType=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:546:3: ( ( stackMapTableType )? ( COMMA stackMapTableType )* -> ^( SMTTYPES ( stackMapTableType )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:546:5: ( stackMapTableType )? ( COMMA stackMapTableType )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:546:5: ( stackMapTableType )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==BOOLEAN||LA79_0==BYTE||LA79_0==CHAR||LA79_0==CLASS||LA79_0==DOUBLE||LA79_0==FLOAT||LA79_0==IDENTIFIER||LA79_0==INT||LA79_0==LONG||LA79_0==SHORT||LA79_0==VOID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:546:5: stackMapTableType
                    {
                    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes4532);
                    stackMapTableType343=stackMapTableType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType343.getTree());

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:546:24: ( COMMA stackMapTableType )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:546:25: COMMA stackMapTableType
            	    {
            	    COMMA344=(Token)match(input,COMMA,FOLLOW_COMMA_in_stackMapTableTypes4536); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA344);


            	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes4538);
            	    stackMapTableType345=stackMapTableType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType345.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
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
            // 546:51: -> ^( SMTTYPES ( stackMapTableType )* )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:546:54: ^( SMTTYPES ( stackMapTableType )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SMTTYPES, "SMTTYPES")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:546:65: ( stackMapTableType )*
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:549:1: stackMapTableType : ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? ) ;
    public final JVMParser.stackMapTableType_return stackMapTableType() throws RecognitionException {
        JVMParser.stackMapTableType_return retval = new JVMParser.stackMapTableType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER349=null;
        Token INTLITERAL350=null;
        JVMParser.stackMapTableTypeObject_return stackMapTableTypeObject346 =null;

        JVMParser.stackMapTableTypePlainObject_return stackMapTableTypePlainObject347 =null;

        JVMParser.primitiveType_return primitiveType348 =null;


        Object IDENTIFIER349_tree=null;
        Object INTLITERAL350_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:550:3: ( ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:550:5: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:550:5: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
            int alt82=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==STRINGLITERAL) ) {
                    alt82=1;
                }
                else if ( (LA82_1==IDENTIFIER||LA82_1==INTERNALTYPE) ) {
                    alt82=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

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
                alt82=3;
                }
                break;
            case IDENTIFIER:
                {
                alt82=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:550:6: stackMapTableTypeObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType4563);
                    stackMapTableTypeObject346=stackMapTableTypeObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypeObject346.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:550:30: stackMapTableTypePlainObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType4565);
                    stackMapTableTypePlainObject347=stackMapTableTypePlainObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypePlainObject347.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:550:59: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType4567);
                    primitiveType348=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType348.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:550:73: IDENTIFIER ( INTLITERAL )?
                    {
                    IDENTIFIER349=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableType4569); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER349_tree = 
                    (Object)adaptor.create(IDENTIFIER349)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER349_tree);
                    }

                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:550:84: ( INTLITERAL )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==INTLITERAL) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:550:84: INTLITERAL
                            {
                            INTLITERAL350=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableType4571); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INTLITERAL350_tree = 
                            (Object)adaptor.create(INTLITERAL350)
                            ;
                            adaptor.addChild(root_0, INTLITERAL350_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:552:1: stackMapTableTypePlainObject : CLASS ( INTERNALTYPE -> CLASS INTERNALTYPE |id= IDENTIFIER -> CLASS INTERNALTYPE[$id] ) ;
    public final JVMParser.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        JVMParser.stackMapTableTypePlainObject_return retval = new JVMParser.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token CLASS351=null;
        Token INTERNALTYPE352=null;

        Object id_tree=null;
        Object CLASS351_tree=null;
        Object INTERNALTYPE352_tree=null;
        RewriteRuleTokenStream stream_INTERNALTYPE=new RewriteRuleTokenStream(adaptor,"token INTERNALTYPE");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:553:3: ( CLASS ( INTERNALTYPE -> CLASS INTERNALTYPE |id= IDENTIFIER -> CLASS INTERNALTYPE[$id] ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:553:5: CLASS ( INTERNALTYPE -> CLASS INTERNALTYPE |id= IDENTIFIER -> CLASS INTERNALTYPE[$id] )
            {
            CLASS351=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject4585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS351);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:554:3: ( INTERNALTYPE -> CLASS INTERNALTYPE |id= IDENTIFIER -> CLASS INTERNALTYPE[$id] )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==INTERNALTYPE) ) {
                alt83=1;
            }
            else if ( (LA83_0==IDENTIFIER) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }
            switch (alt83) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:554:4: INTERNALTYPE
                    {
                    INTERNALTYPE352=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject4591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTERNALTYPE.add(INTERNALTYPE352);


                    // AST REWRITE
                    // elements: INTERNALTYPE, CLASS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 554:21: -> CLASS INTERNALTYPE
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:555:5: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableTypePlainObject4609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);


                    // AST REWRITE
                    // elements: INTERNALTYPE, CLASS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 555:21: -> CLASS INTERNALTYPE[$id]
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:558:1: stackMapTableTypeObject : CLASS STRINGLITERAL ;
    public final JVMParser.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        JVMParser.stackMapTableTypeObject_return retval = new JVMParser.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS353=null;
        Token STRINGLITERAL354=null;

        Object CLASS353_tree=null;
        Object STRINGLITERAL354_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:559:3: ( CLASS STRINGLITERAL )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:559:5: CLASS STRINGLITERAL
            {
            root_0 = (Object)adaptor.nil();


            CLASS353=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject4634); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS353_tree = 
            (Object)adaptor.create(CLASS353)
            ;
            adaptor.addChild(root_0, CLASS353_tree);
            }

            STRINGLITERAL354=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject4636); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLITERAL354_tree = 
            (Object)adaptor.create(STRINGLITERAL354)
            ;
            adaptor.addChild(root_0, STRINGLITERAL354_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:569:1: typeList : type ( COMMA type )* -> ( type )+ ;
    public final JVMParser.typeList_return typeList() throws RecognitionException {
        JVMParser.typeList_return retval = new JVMParser.typeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA356=null;
        JVMParser.type_return type355 =null;

        JVMParser.type_return type357 =null;


        Object COMMA356_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:570:3: ( type ( COMMA type )* -> ( type )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:570:5: type ( COMMA type )*
            {
            pushFollow(FOLLOW_type_in_typeList4656);
            type355=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type355.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:570:10: ( COMMA type )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:570:11: COMMA type
            	    {
            	    COMMA356=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList4659); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA356);


            	    pushFollow(FOLLOW_type_in_typeList4661);
            	    type357=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type357.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
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
            // 570:49: -> ( type )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:572:1: type : combinedJavaType ( LBRACK RBRACK )* -> combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) ;
    public final JVMParser.type_return type() throws RecognitionException {
        JVMParser.type_return retval = new JVMParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK359=null;
        Token RBRACK360=null;
        JVMParser.combinedJavaType_return combinedJavaType358 =null;


        Object LBRACK359_tree=null;
        Object RBRACK360_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_combinedJavaType=new RewriteRuleSubtreeStream(adaptor,"rule combinedJavaType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:573:3: ( combinedJavaType ( LBRACK RBRACK )* -> combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:573:5: combinedJavaType ( LBRACK RBRACK )*
            {
            pushFollow(FOLLOW_combinedJavaType_in_type4705);
            combinedJavaType358=combinedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_combinedJavaType.add(combinedJavaType358.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:573:22: ( LBRACK RBRACK )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==LBRACK) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:573:23: LBRACK RBRACK
            	    {
            	    LBRACK359=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_type4708); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK359);


            	    RBRACK360=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_type4710); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK360);


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            // AST REWRITE
            // elements: combinedJavaType, RBRACK, LBRACK
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 573:49: -> combinedJavaType ^( ARRAYBRACKS ( LBRACK RBRACK )* )
            {
                adaptor.addChild(root_0, stream_combinedJavaType.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:573:69: ^( ARRAYBRACKS ( LBRACK RBRACK )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARRAYBRACKS, "ARRAYBRACKS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:573:83: ( LBRACK RBRACK )*
                while ( stream_RBRACK.hasNext()||stream_LBRACK.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_LBRACK.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_RBRACK.nextNode()
                    );

                }
                stream_RBRACK.reset();
                stream_LBRACK.reset();

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:575:1: combinedJavaType : ( primitiveType | referenceType ) ;
    public final JVMParser.combinedJavaType_return combinedJavaType() throws RecognitionException {
        JVMParser.combinedJavaType_return retval = new JVMParser.combinedJavaType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.primitiveType_return primitiveType361 =null;

        JVMParser.referenceType_return referenceType362 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:576:3: ( ( primitiveType | referenceType ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:576:5: ( primitiveType | referenceType )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:576:5: ( primitiveType | referenceType )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==BOOLEAN||LA86_0==BYTE||LA86_0==CHAR||LA86_0==DOUBLE||LA86_0==FLOAT||LA86_0==INT||LA86_0==LONG||LA86_0==SHORT||LA86_0==VOID) ) {
                alt86=1;
            }
            else if ( (LA86_0==BaseType||LA86_0==Constant_type||LA86_0==IDENTIFIER||LA86_0==QualifiedType||LA86_0==VoidType) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }
            switch (alt86) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:576:6: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_combinedJavaType4750);
                    primitiveType361=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType361.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:577:5: referenceType
                    {
                    pushFollow(FOLLOW_referenceType_in_combinedJavaType4756);
                    referenceType362=referenceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, referenceType362.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:579:1: referenceType : typeDeclSpecifier ( DOT typeDeclSpecifier )* -> ^( UNITNAME ( typeDeclSpecifier )+ ) ;
    public final JVMParser.referenceType_return referenceType() throws RecognitionException {
        JVMParser.referenceType_return retval = new JVMParser.referenceType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT364=null;
        JVMParser.typeDeclSpecifier_return typeDeclSpecifier363 =null;

        JVMParser.typeDeclSpecifier_return typeDeclSpecifier365 =null;


        Object DOT364_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_typeDeclSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclSpecifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:580:3: ( typeDeclSpecifier ( DOT typeDeclSpecifier )* -> ^( UNITNAME ( typeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:580:5: typeDeclSpecifier ( DOT typeDeclSpecifier )*
            {
            pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType4769);
            typeDeclSpecifier363=typeDeclSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeDeclSpecifier.add(typeDeclSpecifier363.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:580:23: ( DOT typeDeclSpecifier )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==DOT) ) {
                    int LA87_2 = input.LA(2);

                    if ( (LA87_2==BaseType||LA87_2==Constant_type||LA87_2==IDENTIFIER||LA87_2==QualifiedType||LA87_2==VoidType) ) {
                        alt87=1;
                    }


                }


                switch (alt87) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:580:24: DOT typeDeclSpecifier
            	    {
            	    DOT364=(Token)match(input,DOT,FOLLOW_DOT_in_referenceType4772); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT364);


            	    pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType4774);
            	    typeDeclSpecifier365=typeDeclSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeDeclSpecifier.add(typeDeclSpecifier365.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
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
            // 580:49: -> ^( UNITNAME ( typeDeclSpecifier )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:580:52: ^( UNITNAME ( typeDeclSpecifier )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:582:1: typeDeclSpecifier : typeName ( typeArguments )? -> ^( typeName ^( TYPEARGS ( typeArguments )? ) ) ;
    public final JVMParser.typeDeclSpecifier_return typeDeclSpecifier() throws RecognitionException {
        JVMParser.typeDeclSpecifier_return retval = new JVMParser.typeDeclSpecifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.typeName_return typeName366 =null;

        JVMParser.typeArguments_return typeArguments367 =null;


        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_typeArguments=new RewriteRuleSubtreeStream(adaptor,"rule typeArguments");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:583:3: ( typeName ( typeArguments )? -> ^( typeName ^( TYPEARGS ( typeArguments )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:583:5: typeName ( typeArguments )?
            {
            pushFollow(FOLLOW_typeName_in_typeDeclSpecifier4798);
            typeName366=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName366.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:583:14: ( typeArguments )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==LESST) ) {
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
                        alt88=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA88_4 = input.LA(3);

                        if ( (LA88_4==COMMA||LA88_4==DOT||LA88_4==LARGET||(LA88_4 >= LBRACK && LA88_4 <= LESST)) ) {
                            alt88=1;
                        }
                        }
                        break;
                    case BaseType:
                        {
                        int LA88_5 = input.LA(3);

                        if ( (LA88_5==COMMA||LA88_5==DOT||LA88_5==LARGET||(LA88_5 >= LBRACK && LA88_5 <= LESST)) ) {
                            alt88=1;
                        }
                        }
                        break;
                    case VoidType:
                        {
                        int LA88_6 = input.LA(3);

                        if ( (LA88_6==COMMA||LA88_6==DOT||LA88_6==LARGET||(LA88_6 >= LBRACK && LA88_6 <= LESST)) ) {
                            alt88=1;
                        }
                        }
                        break;
                    case Constant_type:
                        {
                        int LA88_7 = input.LA(3);

                        if ( (LA88_7==COMMA||LA88_7==DOT||LA88_7==LARGET||(LA88_7 >= LBRACK && LA88_7 <= LESST)) ) {
                            alt88=1;
                        }
                        }
                        break;
                }

            }
            switch (alt88) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:583:14: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_typeDeclSpecifier4800);
                    typeArguments367=typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeArguments.add(typeArguments367.getTree());

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
            // 583:49: -> ^( typeName ^( TYPEARGS ( typeArguments )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:583:52: ^( typeName ^( TYPEARGS ( typeArguments )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_typeName.nextNode(), root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:583:63: ^( TYPEARGS ( typeArguments )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEARGS, "TYPEARGS")
                , root_2);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:583:74: ( typeArguments )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:585:1: typeName : (id= identifier -> QualifiedType[$id.text] | QualifiedType );
    public final JVMParser.typeName_return typeName() throws RecognitionException {
        JVMParser.typeName_return retval = new JVMParser.typeName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QualifiedType368=null;
        JVMParser.identifier_return id =null;


        Object QualifiedType368_tree=null;
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:586:3: (id= identifier -> QualifiedType[$id.text] | QualifiedType )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==BaseType||LA89_0==Constant_type||LA89_0==IDENTIFIER||LA89_0==VoidType) ) {
                alt89=1;
            }
            else if ( (LA89_0==QualifiedType) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }
            switch (alt89) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:586:5: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_typeName4848);
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
                    // 586:49: -> QualifiedType[$id.text]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:587:5: QualifiedType
                    {
                    root_0 = (Object)adaptor.nil();


                    QualifiedType368=(Token)match(input,QualifiedType,FOLLOW_QualifiedType_in_typeName4890); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QualifiedType368_tree = 
                    (Object)adaptor.create(QualifiedType368)
                    ;
                    adaptor.addChild(root_0, QualifiedType368_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:589:1: typeArguments : LESST typeArgumentList LARGET -> typeArgumentList ;
    public final JVMParser.typeArguments_return typeArguments() throws RecognitionException {
        JVMParser.typeArguments_return retval = new JVMParser.typeArguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST369=null;
        Token LARGET371=null;
        JVMParser.typeArgumentList_return typeArgumentList370 =null;


        Object LESST369_tree=null;
        Object LARGET371_tree=null;
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_typeArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule typeArgumentList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:590:3: ( LESST typeArgumentList LARGET -> typeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:590:5: LESST typeArgumentList LARGET
            {
            LESST369=(Token)match(input,LESST,FOLLOW_LESST_in_typeArguments4902); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST369);


            pushFollow(FOLLOW_typeArgumentList_in_typeArguments4904);
            typeArgumentList370=typeArgumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeArgumentList.add(typeArgumentList370.getTree());

            LARGET371=(Token)match(input,LARGET,FOLLOW_LARGET_in_typeArguments4906); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET371);


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
            // 590:49: -> typeArgumentList
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:592:1: typeArgumentList : typeArgument ( COMMA typeArgument )* -> ( typeArgument )+ ;
    public final JVMParser.typeArgumentList_return typeArgumentList() throws RecognitionException {
        JVMParser.typeArgumentList_return retval = new JVMParser.typeArgumentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA373=null;
        JVMParser.typeArgument_return typeArgument372 =null;

        JVMParser.typeArgument_return typeArgument374 =null;


        Object COMMA373_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_typeArgument=new RewriteRuleSubtreeStream(adaptor,"rule typeArgument");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:593:3: ( typeArgument ( COMMA typeArgument )* -> ( typeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:593:5: typeArgument ( COMMA typeArgument )*
            {
            pushFollow(FOLLOW_typeArgument_in_typeArgumentList4937);
            typeArgument372=typeArgument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeArgument.add(typeArgument372.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:593:18: ( COMMA typeArgument )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==COMMA) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:593:19: COMMA typeArgument
            	    {
            	    COMMA373=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeArgumentList4940); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA373);


            	    pushFollow(FOLLOW_typeArgument_in_typeArgumentList4942);
            	    typeArgument374=typeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeArgument.add(typeArgument374.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
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
            // 593:49: -> ( typeArgument )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:595:1: typeArgument : ( type | wildcard );
    public final JVMParser.typeArgument_return typeArgument() throws RecognitionException {
        JVMParser.typeArgument_return retval = new JVMParser.typeArgument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.type_return type375 =null;

        JVMParser.wildcard_return wildcard376 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:596:3: ( type | wildcard )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==BOOLEAN||(LA91_0 >= BYTE && LA91_0 <= BaseType)||LA91_0==CHAR||LA91_0==Constant_type||LA91_0==DOUBLE||LA91_0==FLOAT||LA91_0==IDENTIFIER||LA91_0==INT||LA91_0==LONG||LA91_0==QualifiedType||LA91_0==SHORT||LA91_0==VOID||LA91_0==VoidType) ) {
                alt91=1;
            }
            else if ( (LA91_0==QUESTION) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;

            }
            switch (alt91) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:596:5: type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_in_typeArgument4970);
                    type375=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type375.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:597:5: wildcard
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_wildcard_in_typeArgument4976);
                    wildcard376=wildcard();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, wildcard376.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:599:1: wildcard : QUESTION ( wildcardBounds )? -> ^( QUESTION ( wildcardBounds )? ) ;
    public final JVMParser.wildcard_return wildcard() throws RecognitionException {
        JVMParser.wildcard_return retval = new JVMParser.wildcard_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QUESTION377=null;
        JVMParser.wildcardBounds_return wildcardBounds378 =null;


        Object QUESTION377_tree=null;
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_wildcardBounds=new RewriteRuleSubtreeStream(adaptor,"rule wildcardBounds");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:600:3: ( QUESTION ( wildcardBounds )? -> ^( QUESTION ( wildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:600:5: QUESTION ( wildcardBounds )?
            {
            QUESTION377=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_wildcard4988); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION377);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:600:14: ( wildcardBounds )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==EXTENDS||LA92_0==SUPER) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:600:14: wildcardBounds
                    {
                    pushFollow(FOLLOW_wildcardBounds_in_wildcard4990);
                    wildcardBounds378=wildcardBounds();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_wildcardBounds.add(wildcardBounds378.getTree());

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
            // 600:49: -> ^( QUESTION ( wildcardBounds )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:600:52: ^( QUESTION ( wildcardBounds )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_QUESTION.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:600:63: ( wildcardBounds )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:602:1: wildcardBounds : ( EXTENDS type -> ^( EXTENDS type ) | SUPER type -> ^( SUPER type ) );
    public final JVMParser.wildcardBounds_return wildcardBounds() throws RecognitionException {
        JVMParser.wildcardBounds_return retval = new JVMParser.wildcardBounds_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS379=null;
        Token SUPER381=null;
        JVMParser.type_return type380 =null;

        JVMParser.type_return type382 =null;


        Object EXTENDS379_tree=null;
        Object SUPER381_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:603:3: ( EXTENDS type -> ^( EXTENDS type ) | SUPER type -> ^( SUPER type ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==EXTENDS) ) {
                alt93=1;
            }
            else if ( (LA93_0==SUPER) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }
            switch (alt93) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:603:5: EXTENDS type
                    {
                    EXTENDS379=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_wildcardBounds5031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS379);


                    pushFollow(FOLLOW_type_in_wildcardBounds5033);
                    type380=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type380.getTree());

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
                    // 603:49: -> ^( EXTENDS type )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:603:52: ^( EXTENDS type )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:604:5: SUPER type
                    {
                    SUPER381=(Token)match(input,SUPER,FOLLOW_SUPER_in_wildcardBounds5078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(SUPER381);


                    pushFollow(FOLLOW_type_in_wildcardBounds5080);
                    type382=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type382.getTree());

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
                    // 604:49: -> ^( SUPER type )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:604:52: ^( SUPER type )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:606:1: typeParameters : LESST typeParameter ( COMMA typeParameter )* LARGET -> ( typeParameter )+ ;
    public final JVMParser.typeParameters_return typeParameters() throws RecognitionException {
        JVMParser.typeParameters_return retval = new JVMParser.typeParameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST383=null;
        Token COMMA385=null;
        Token LARGET387=null;
        JVMParser.typeParameter_return typeParameter384 =null;

        JVMParser.typeParameter_return typeParameter386 =null;


        Object LESST383_tree=null;
        Object COMMA385_tree=null;
        Object LARGET387_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_typeParameter=new RewriteRuleSubtreeStream(adaptor,"rule typeParameter");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:607:3: ( LESST typeParameter ( COMMA typeParameter )* LARGET -> ( typeParameter )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:607:5: LESST typeParameter ( COMMA typeParameter )* LARGET
            {
            LESST383=(Token)match(input,LESST,FOLLOW_LESST_in_typeParameters5133); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST383);


            pushFollow(FOLLOW_typeParameter_in_typeParameters5135);
            typeParameter384=typeParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParameter.add(typeParameter384.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:607:25: ( COMMA typeParameter )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==COMMA) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:607:26: COMMA typeParameter
            	    {
            	    COMMA385=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeParameters5138); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA385);


            	    pushFollow(FOLLOW_typeParameter_in_typeParameters5140);
            	    typeParameter386=typeParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeParameter.add(typeParameter386.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            LARGET387=(Token)match(input,LARGET,FOLLOW_LARGET_in_typeParameters5144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET387);


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
            // 607:55: -> ( typeParameter )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:609:1: typeParameter : identifier ( typeBound )? -> ^( identifier ( typeBound )? ) ;
    public final JVMParser.typeParameter_return typeParameter() throws RecognitionException {
        JVMParser.typeParameter_return retval = new JVMParser.typeParameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.identifier_return identifier388 =null;

        JVMParser.typeBound_return typeBound389 =null;


        RewriteRuleSubtreeStream stream_typeBound=new RewriteRuleSubtreeStream(adaptor,"rule typeBound");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:610:3: ( identifier ( typeBound )? -> ^( identifier ( typeBound )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:610:5: identifier ( typeBound )?
            {
            pushFollow(FOLLOW_identifier_in_typeParameter5161);
            identifier388=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier388.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:610:16: ( typeBound )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==EXTENDS) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:610:16: typeBound
                    {
                    pushFollow(FOLLOW_typeBound_in_typeParameter5163);
                    typeBound389=typeBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeBound.add(typeBound389.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, typeBound
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 610:49: -> ^( identifier ( typeBound )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:610:52: ^( identifier ( typeBound )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_identifier.nextNode(), root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:610:65: ( typeBound )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:612:1: typeBound : EXTENDS referenceType ( AND referenceType )* -> ^( EXTENDS ( referenceType )+ ) ;
    public final JVMParser.typeBound_return typeBound() throws RecognitionException {
        JVMParser.typeBound_return retval = new JVMParser.typeBound_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS390=null;
        Token AND392=null;
        JVMParser.referenceType_return referenceType391 =null;

        JVMParser.referenceType_return referenceType393 =null;


        Object EXTENDS390_tree=null;
        Object AND392_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_referenceType=new RewriteRuleSubtreeStream(adaptor,"rule referenceType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:613:3: ( EXTENDS referenceType ( AND referenceType )* -> ^( EXTENDS ( referenceType )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:613:5: EXTENDS referenceType ( AND referenceType )*
            {
            EXTENDS390=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeBound5207); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS390);


            pushFollow(FOLLOW_referenceType_in_typeBound5209);
            referenceType391=referenceType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_referenceType.add(referenceType391.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:613:27: ( AND referenceType )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==AND) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:613:28: AND referenceType
            	    {
            	    AND392=(Token)match(input,AND,FOLLOW_AND_in_typeBound5212); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND392);


            	    pushFollow(FOLLOW_referenceType_in_typeBound5214);
            	    referenceType393=referenceType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_referenceType.add(referenceType393.getTree());

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            // AST REWRITE
            // elements: referenceType, EXTENDS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 613:49: -> ^( EXTENDS ( referenceType )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:613:52: ^( EXTENDS ( referenceType )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:619:1: genericDescriptor : LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET -> ( genericReturnDescriptor )+ ;
    public final JVMParser.genericDescriptor_return genericDescriptor() throws RecognitionException {
        JVMParser.genericDescriptor_return retval = new JVMParser.genericDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST394=null;
        Token COMMA396=null;
        Token LARGET398=null;
        JVMParser.genericReturnDescriptor_return genericReturnDescriptor395 =null;

        JVMParser.genericReturnDescriptor_return genericReturnDescriptor397 =null;


        Object LESST394_tree=null;
        Object COMMA396_tree=null;
        Object LARGET398_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_genericReturnDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule genericReturnDescriptor");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:620:3: ( LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET -> ( genericReturnDescriptor )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:620:5: LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET
            {
            LESST394=(Token)match(input,LESST,FOLLOW_LESST_in_genericDescriptor5242); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST394);


            pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor5244);
            genericReturnDescriptor395=genericReturnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor395.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:620:35: ( COMMA genericReturnDescriptor )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==COMMA) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:620:36: COMMA genericReturnDescriptor
            	    {
            	    COMMA396=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericDescriptor5247); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA396);


            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor5249);
            	    genericReturnDescriptor397=genericReturnDescriptor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor397.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            LARGET398=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericDescriptor5253); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET398);


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
            // 620:75: -> ( genericReturnDescriptor )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:622:1: genericReturnDescriptor : identifier EXTENDS bytecodeReferenceTypeList -> ^( EXTENDS identifier bytecodeReferenceTypeList ) ;
    public final JVMParser.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        JVMParser.genericReturnDescriptor_return retval = new JVMParser.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS400=null;
        JVMParser.identifier_return identifier399 =null;

        JVMParser.bytecodeReferenceTypeList_return bytecodeReferenceTypeList401 =null;


        Object EXTENDS400_tree=null;
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_bytecodeReferenceTypeList=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeReferenceTypeList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:623:3: ( identifier EXTENDS bytecodeReferenceTypeList -> ^( EXTENDS identifier bytecodeReferenceTypeList ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:623:5: identifier EXTENDS bytecodeReferenceTypeList
            {
            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor5270);
            identifier399=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier399.getTree());

            EXTENDS400=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor5272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS400);


            pushFollow(FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor5274);
            bytecodeReferenceTypeList401=bytecodeReferenceTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeReferenceTypeList.add(bytecodeReferenceTypeList401.getTree());

            // AST REWRITE
            // elements: bytecodeReferenceTypeList, identifier, EXTENDS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 623:65: -> ^( EXTENDS identifier bytecodeReferenceTypeList )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:623:69: ^( EXTENDS identifier bytecodeReferenceTypeList )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:625:1: bytecodeReferenceTypeList : bytecodeReferenceType ( AND bytecodeReferenceType )* -> ( bytecodeReferenceType )+ ;
    public final JVMParser.bytecodeReferenceTypeList_return bytecodeReferenceTypeList() throws RecognitionException {
        JVMParser.bytecodeReferenceTypeList_return retval = new JVMParser.bytecodeReferenceTypeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND403=null;
        JVMParser.bytecodeReferenceType_return bytecodeReferenceType402 =null;

        JVMParser.bytecodeReferenceType_return bytecodeReferenceType404 =null;


        Object AND403_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_bytecodeReferenceType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeReferenceType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:626:3: ( bytecodeReferenceType ( AND bytecodeReferenceType )* -> ( bytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:626:5: bytecodeReferenceType ( AND bytecodeReferenceType )*
            {
            pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList5313);
            bytecodeReferenceType402=bytecodeReferenceType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeReferenceType.add(bytecodeReferenceType402.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:626:27: ( AND bytecodeReferenceType )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==AND) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:626:28: AND bytecodeReferenceType
            	    {
            	    AND403=(Token)match(input,AND,FOLLOW_AND_in_bytecodeReferenceTypeList5316); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND403);


            	    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList5318);
            	    bytecodeReferenceType404=bytecodeReferenceType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeReferenceType.add(bytecodeReferenceType404.getTree());

            	    }
            	    break;

            	default :
            	    break loop98;
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
            // 626:65: -> ( bytecodeReferenceType )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:628:1: bytecodeReferenceType : bytecodeTypeDeclSpecifier ( DOT bytecodeTypeDeclSpecifier )* -> ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) ;
    public final JVMParser.bytecodeReferenceType_return bytecodeReferenceType() throws RecognitionException {
        JVMParser.bytecodeReferenceType_return retval = new JVMParser.bytecodeReferenceType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT406=null;
        JVMParser.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier405 =null;

        JVMParser.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier407 =null;


        Object DOT406_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_bytecodeTypeDeclSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeDeclSpecifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:629:3: ( bytecodeTypeDeclSpecifier ( DOT bytecodeTypeDeclSpecifier )* -> ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:629:5: bytecodeTypeDeclSpecifier ( DOT bytecodeTypeDeclSpecifier )*
            {
            pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType5346);
            bytecodeTypeDeclSpecifier405=bytecodeTypeDeclSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeTypeDeclSpecifier.add(bytecodeTypeDeclSpecifier405.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:629:31: ( DOT bytecodeTypeDeclSpecifier )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==DOT) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:629:32: DOT bytecodeTypeDeclSpecifier
            	    {
            	    DOT406=(Token)match(input,DOT,FOLLOW_DOT_in_bytecodeReferenceType5349); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT406);


            	    pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType5351);
            	    bytecodeTypeDeclSpecifier407=bytecodeTypeDeclSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeTypeDeclSpecifier.add(bytecodeTypeDeclSpecifier407.getTree());

            	    }
            	    break;

            	default :
            	    break loop99;
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
            // 629:65: -> ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:629:68: ^( UNITNAME ( bytecodeTypeDeclSpecifier )+ )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:631:1: bytecodeTypeDeclSpecifier : bytecodeTypeName ( bytecodeTypeArguments )? -> bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) ;
    public final JVMParser.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier() throws RecognitionException {
        JVMParser.bytecodeTypeDeclSpecifier_return retval = new JVMParser.bytecodeTypeDeclSpecifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.bytecodeTypeName_return bytecodeTypeName408 =null;

        JVMParser.bytecodeTypeArguments_return bytecodeTypeArguments409 =null;


        RewriteRuleSubtreeStream stream_bytecodeTypeName=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeName");
        RewriteRuleSubtreeStream stream_bytecodeTypeArguments=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeArguments");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:3: ( bytecodeTypeName ( bytecodeTypeArguments )? -> bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:5: bytecodeTypeName ( bytecodeTypeArguments )?
            {
            pushFollow(FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier5375);
            bytecodeTypeName408=bytecodeTypeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeTypeName.add(bytecodeTypeName408.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:22: ( bytecodeTypeArguments )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==LESST) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:22: bytecodeTypeArguments
                    {
                    pushFollow(FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier5377);
                    bytecodeTypeArguments409=bytecodeTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bytecodeTypeArguments.add(bytecodeTypeArguments409.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: bytecodeTypeArguments, bytecodeTypeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 632:65: -> bytecodeTypeName ^( TYPEARGS ( bytecodeTypeArguments )? )
            {
                adaptor.addChild(root_0, stream_bytecodeTypeName.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:85: ^( TYPEARGS ( bytecodeTypeArguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEARGS, "TYPEARGS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:632:96: ( bytecodeTypeArguments )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:634:1: bytecodeTypeName : (id= identifier -> INTERNALTYPE[$id.text] | INTERNALTYPE );
    public final JVMParser.bytecodeTypeName_return bytecodeTypeName() throws RecognitionException {
        JVMParser.bytecodeTypeName_return retval = new JVMParser.bytecodeTypeName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERNALTYPE410=null;
        JVMParser.identifier_return id =null;


        Object INTERNALTYPE410_tree=null;
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:635:3: (id= identifier -> INTERNALTYPE[$id.text] | INTERNALTYPE )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==BaseType||LA101_0==Constant_type||LA101_0==IDENTIFIER||LA101_0==VoidType) ) {
                alt101=1;
            }
            else if ( (LA101_0==INTERNALTYPE) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }
            switch (alt101) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:635:5: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_bytecodeTypeName5423);
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
                    // 635:65: -> INTERNALTYPE[$id.text]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:636:5: INTERNALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERNALTYPE410=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeTypeName5480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE410_tree = 
                    (Object)adaptor.create(INTERNALTYPE410)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE410_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:638:1: bytecodeTypeArguments : LESST bytecodeTypeArgumentList LARGET -> bytecodeTypeArgumentList ;
    public final JVMParser.bytecodeTypeArguments_return bytecodeTypeArguments() throws RecognitionException {
        JVMParser.bytecodeTypeArguments_return retval = new JVMParser.bytecodeTypeArguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST411=null;
        Token LARGET413=null;
        JVMParser.bytecodeTypeArgumentList_return bytecodeTypeArgumentList412 =null;


        Object LESST411_tree=null;
        Object LARGET413_tree=null;
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_bytecodeTypeArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeArgumentList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:639:3: ( LESST bytecodeTypeArgumentList LARGET -> bytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:639:5: LESST bytecodeTypeArgumentList LARGET
            {
            LESST411=(Token)match(input,LESST,FOLLOW_LESST_in_bytecodeTypeArguments5492); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST411);


            pushFollow(FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments5494);
            bytecodeTypeArgumentList412=bytecodeTypeArgumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeTypeArgumentList.add(bytecodeTypeArgumentList412.getTree());

            LARGET413=(Token)match(input,LARGET,FOLLOW_LARGET_in_bytecodeTypeArguments5496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET413);


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
            // 639:57: -> bytecodeTypeArgumentList
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:641:1: bytecodeTypeArgumentList : bytecodeTypeArgument ( COMMA bytecodeTypeArgument )* -> ( bytecodeTypeArgument )+ ;
    public final JVMParser.bytecodeTypeArgumentList_return bytecodeTypeArgumentList() throws RecognitionException {
        JVMParser.bytecodeTypeArgumentList_return retval = new JVMParser.bytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA415=null;
        JVMParser.bytecodeTypeArgument_return bytecodeTypeArgument414 =null;

        JVMParser.bytecodeTypeArgument_return bytecodeTypeArgument416 =null;


        Object COMMA415_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_bytecodeTypeArgument=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeTypeArgument");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:642:3: ( bytecodeTypeArgument ( COMMA bytecodeTypeArgument )* -> ( bytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:642:5: bytecodeTypeArgument ( COMMA bytecodeTypeArgument )*
            {
            pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList5527);
            bytecodeTypeArgument414=bytecodeTypeArgument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeTypeArgument.add(bytecodeTypeArgument414.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:642:26: ( COMMA bytecodeTypeArgument )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==COMMA) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:642:27: COMMA bytecodeTypeArgument
            	    {
            	    COMMA415=(Token)match(input,COMMA,FOLLOW_COMMA_in_bytecodeTypeArgumentList5530); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA415);


            	    pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList5532);
            	    bytecodeTypeArgument416=bytecodeTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeTypeArgument.add(bytecodeTypeArgument416.getTree());

            	    }
            	    break;

            	default :
            	    break loop102;
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
            // 642:57: -> ( bytecodeTypeArgument )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:644:1: bytecodeTypeArgument : ( bytecodeReferenceType | bytecodeWildcard );
    public final JVMParser.bytecodeTypeArgument_return bytecodeTypeArgument() throws RecognitionException {
        JVMParser.bytecodeTypeArgument_return retval = new JVMParser.bytecodeTypeArgument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.bytecodeReferenceType_return bytecodeReferenceType417 =null;

        JVMParser.bytecodeWildcard_return bytecodeWildcard418 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:645:3: ( bytecodeReferenceType | bytecodeWildcard )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==BaseType||LA103_0==Constant_type||LA103_0==IDENTIFIER||LA103_0==INTERNALTYPE||LA103_0==VoidType) ) {
                alt103=1;
            }
            else if ( (LA103_0==QUESTION) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:645:5: bytecodeReferenceType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument5552);
                    bytecodeReferenceType417=bytecodeReferenceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeReferenceType417.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:646:5: bytecodeWildcard
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument5558);
                    bytecodeWildcard418=bytecodeWildcard();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeWildcard418.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:648:1: bytecodeWildcard : QUESTION ( bytecodeWildcardBounds )? -> ^( QUESTION ( bytecodeWildcardBounds )? ) ;
    public final JVMParser.bytecodeWildcard_return bytecodeWildcard() throws RecognitionException {
        JVMParser.bytecodeWildcard_return retval = new JVMParser.bytecodeWildcard_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QUESTION419=null;
        JVMParser.bytecodeWildcardBounds_return bytecodeWildcardBounds420 =null;


        Object QUESTION419_tree=null;
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_bytecodeWildcardBounds=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeWildcardBounds");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:649:3: ( QUESTION ( bytecodeWildcardBounds )? -> ^( QUESTION ( bytecodeWildcardBounds )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:649:5: QUESTION ( bytecodeWildcardBounds )?
            {
            QUESTION419=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bytecodeWildcard5570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION419);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:649:14: ( bytecodeWildcardBounds )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==EXTENDS||LA104_0==SUPER) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:649:14: bytecodeWildcardBounds
                    {
                    pushFollow(FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard5572);
                    bytecodeWildcardBounds420=bytecodeWildcardBounds();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bytecodeWildcardBounds.add(bytecodeWildcardBounds420.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: QUESTION, bytecodeWildcardBounds
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 649:57: -> ^( QUESTION ( bytecodeWildcardBounds )? )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:649:60: ^( QUESTION ( bytecodeWildcardBounds )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_QUESTION.nextNode()
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:649:71: ( bytecodeWildcardBounds )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:651:1: bytecodeWildcardBounds : ( EXTENDS bytecodeReferenceType -> ^( EXTENDS bytecodeReferenceType ) | SUPER bytecodeReferenceType -> ^( SUPER bytecodeReferenceType ) );
    public final JVMParser.bytecodeWildcardBounds_return bytecodeWildcardBounds() throws RecognitionException {
        JVMParser.bytecodeWildcardBounds_return retval = new JVMParser.bytecodeWildcardBounds_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS421=null;
        Token SUPER423=null;
        JVMParser.bytecodeReferenceType_return bytecodeReferenceType422 =null;

        JVMParser.bytecodeReferenceType_return bytecodeReferenceType424 =null;


        Object EXTENDS421_tree=null;
        Object SUPER423_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_bytecodeReferenceType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeReferenceType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:652:3: ( EXTENDS bytecodeReferenceType -> ^( EXTENDS bytecodeReferenceType ) | SUPER bytecodeReferenceType -> ^( SUPER bytecodeReferenceType ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==EXTENDS) ) {
                alt105=1;
            }
            else if ( (LA105_0==SUPER) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }
            switch (alt105) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:652:5: EXTENDS bytecodeReferenceType
                    {
                    EXTENDS421=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_bytecodeWildcardBounds5613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS421);


                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds5615);
                    bytecodeReferenceType422=bytecodeReferenceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bytecodeReferenceType.add(bytecodeReferenceType422.getTree());

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
                    // 652:57: -> ^( EXTENDS bytecodeReferenceType )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:652:60: ^( EXTENDS bytecodeReferenceType )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:653:5: SUPER bytecodeReferenceType
                    {
                    SUPER423=(Token)match(input,SUPER,FOLLOW_SUPER_in_bytecodeWildcardBounds5651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(SUPER423);


                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds5653);
                    bytecodeReferenceType424=bytecodeReferenceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bytecodeReferenceType.add(bytecodeReferenceType424.getTree());

                    // AST REWRITE
                    // elements: bytecodeReferenceType, SUPER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 653:57: -> ^( SUPER bytecodeReferenceType )
                    {
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:653:60: ^( SUPER bytecodeReferenceType )
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:660:1: bytecodeType : ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER );
    public final JVMParser.bytecodeType_return bytecodeType() throws RecognitionException {
        JVMParser.bytecodeType_return retval = new JVMParser.bytecodeType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BaseType426=null;
        Token SEMI428=null;
        Token IDENTIFIER429=null;
        JVMParser.bytecodeArrayType_return bytecodeArrayType425 =null;

        JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType427 =null;


        Object BaseType426_tree=null;
        Object SEMI428_tree=null;
        Object IDENTIFIER429_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:661:3: ( bytecodeArrayType | BaseType | simpleBytecodeObjectType SEMI | IDENTIFIER )
            int alt106=4;
            switch ( input.LA(1) ) {
            case LBRACK:
                {
                alt106=1;
                }
                break;
            case BaseType:
                {
                alt106=2;
                }
                break;
            case INTERNALTYPE:
                {
                alt106=3;
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
                        alt106=3;
                        }
                        break;
                    case BaseType:
                        {
                        int LA106_7 = input.LA(4);

                        if ( (LA106_7==BaseType||LA106_7==IDENTIFIER||LA106_7==INTERNALTYPE||LA106_7==LARGET||LA106_7==LBRACK||LA106_7==MINUS||LA106_7==PLUS||LA106_7==STAR) ) {
                            alt106=3;
                        }
                        else if ( (LA106_7==EXTENDS) ) {
                            alt106=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 106, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA106_8 = input.LA(4);

                        if ( (LA106_8==BaseType||LA106_8==DOT||LA106_8==IDENTIFIER||LA106_8==INTERNALTYPE||LA106_8==LARGET||(LA106_8 >= LBRACK && LA106_8 <= LESST)||LA106_8==MINUS||LA106_8==PLUS||LA106_8==SEMI||LA106_8==STAR) ) {
                            alt106=3;
                        }
                        else if ( (LA106_8==EXTENDS) ) {
                            alt106=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 106, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case Constant_type:
                    case VoidType:
                        {
                        alt106=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case DOT:
                case SEMI:
                    {
                    alt106=3;
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
                    alt106=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }

            switch (alt106) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:661:5: bytecodeArrayType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType5704);
                    bytecodeArrayType425=bytecodeArrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeArrayType425.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:661:25: BaseType
                    {
                    root_0 = (Object)adaptor.nil();


                    BaseType426=(Token)match(input,BaseType,FOLLOW_BaseType_in_bytecodeType5708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BaseType426_tree = 
                    (Object)adaptor.create(BaseType426)
                    ;
                    adaptor.addChild(root_0, BaseType426_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:661:36: simpleBytecodeObjectType SEMI
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_bytecodeType5712);
                    simpleBytecodeObjectType427=simpleBytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleBytecodeObjectType427.getTree());

                    SEMI428=(Token)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType5714); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI428_tree = 
                    (Object)adaptor.create(SEMI428)
                    ;
                    adaptor.addChild(root_0, SEMI428_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:661:68: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER429=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType5718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER429_tree = 
                    (Object)adaptor.create(IDENTIFIER429)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER429_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:663:1: bytecodeArrayType : LBRACK bytecodeType ;
    public final JVMParser.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        JVMParser.bytecodeArrayType_return retval = new JVMParser.bytecodeArrayType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK430=null;
        JVMParser.bytecodeType_return bytecodeType431 =null;


        Object LBRACK430_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:664:3: ( LBRACK bytecodeType )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:664:5: LBRACK bytecodeType
            {
            root_0 = (Object)adaptor.nil();


            LBRACK430=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType5731); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK430_tree = 
            (Object)adaptor.create(LBRACK430)
            ;
            adaptor.addChild(root_0, LBRACK430_tree);
            }

            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType5733);
            bytecodeType431=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType431.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:666:1: simpleBytecodeObjectType : simpleBytecodeReferenceType ( DOT simpleBytecodeReferenceType )* -> ( simpleBytecodeReferenceType )+ ;
    public final JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        JVMParser.simpleBytecodeObjectType_return retval = new JVMParser.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT433=null;
        JVMParser.simpleBytecodeReferenceType_return simpleBytecodeReferenceType432 =null;

        JVMParser.simpleBytecodeReferenceType_return simpleBytecodeReferenceType434 =null;


        Object DOT433_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_simpleBytecodeReferenceType=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeReferenceType");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:667:3: ( simpleBytecodeReferenceType ( DOT simpleBytecodeReferenceType )* -> ( simpleBytecodeReferenceType )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:667:5: simpleBytecodeReferenceType ( DOT simpleBytecodeReferenceType )*
            {
            pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType5746);
            simpleBytecodeReferenceType432=simpleBytecodeReferenceType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleBytecodeReferenceType.add(simpleBytecodeReferenceType432.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:667:33: ( DOT simpleBytecodeReferenceType )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==DOT) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:667:34: DOT simpleBytecodeReferenceType
            	    {
            	    DOT433=(Token)match(input,DOT,FOLLOW_DOT_in_simpleBytecodeObjectType5749); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT433);


            	    pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType5751);
            	    simpleBytecodeReferenceType434=simpleBytecodeReferenceType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_simpleBytecodeReferenceType.add(simpleBytecodeReferenceType434.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
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
            // 667:68: -> ( simpleBytecodeReferenceType )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:669:1: simpleBytecodeReferenceType : simpleBytecodeReferenceTypeName ( simpleBytecodeTypeArguments )? -> simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) ;
    public final JVMParser.simpleBytecodeReferenceType_return simpleBytecodeReferenceType() throws RecognitionException {
        JVMParser.simpleBytecodeReferenceType_return retval = new JVMParser.simpleBytecodeReferenceType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName435 =null;

        JVMParser.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments436 =null;


        RewriteRuleSubtreeStream stream_simpleBytecodeTypeArguments=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeTypeArguments");
        RewriteRuleSubtreeStream stream_simpleBytecodeReferenceTypeName=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeReferenceTypeName");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:670:3: ( simpleBytecodeReferenceTypeName ( simpleBytecodeTypeArguments )? -> simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:670:5: simpleBytecodeReferenceTypeName ( simpleBytecodeTypeArguments )?
            {
            pushFollow(FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType5770);
            simpleBytecodeReferenceTypeName435=simpleBytecodeReferenceTypeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleBytecodeReferenceTypeName.add(simpleBytecodeReferenceTypeName435.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:670:37: ( simpleBytecodeTypeArguments )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==LESST) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:670:37: simpleBytecodeTypeArguments
                    {
                    pushFollow(FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType5772);
                    simpleBytecodeTypeArguments436=simpleBytecodeTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleBytecodeTypeArguments.add(simpleBytecodeTypeArguments436.getTree());

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
            // 670:67: -> simpleBytecodeReferenceTypeName ^( TYPEARGS ( simpleBytecodeTypeArguments )? )
            {
                adaptor.addChild(root_0, stream_simpleBytecodeReferenceTypeName.nextTree());

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:670:102: ^( TYPEARGS ( simpleBytecodeTypeArguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEARGS, "TYPEARGS")
                , root_1);

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:670:113: ( simpleBytecodeTypeArguments )?
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:672:1: simpleBytecodeReferenceTypeName : ( INTERNALTYPE |id= IDENTIFIER -> INTERNALTYPE[$id] );
    public final JVMParser.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName() throws RecognitionException {
        JVMParser.simpleBytecodeReferenceTypeName_return retval = new JVMParser.simpleBytecodeReferenceTypeName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token INTERNALTYPE437=null;

        Object id_tree=null;
        Object INTERNALTYPE437_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:673:3: ( INTERNALTYPE |id= IDENTIFIER -> INTERNALTYPE[$id] )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==INTERNALTYPE) ) {
                alt109=1;
            }
            else if ( (LA109_0==IDENTIFIER) ) {
                alt109=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;

            }
            switch (alt109) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:673:5: INTERNALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERNALTYPE437=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName5797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE437_tree = 
                    (Object)adaptor.create(INTERNALTYPE437)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE437_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:674:5: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleBytecodeReferenceTypeName5805); if (state.failed) return retval; 
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
                    // 674:66: -> INTERNALTYPE[$id]
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:676:1: simpleBytecodeTypeArguments : LESST simpleBytecodeTypeArgumentList LARGET -> simpleBytecodeTypeArgumentList ;
    public final JVMParser.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments() throws RecognitionException {
        JVMParser.simpleBytecodeTypeArguments_return retval = new JVMParser.simpleBytecodeTypeArguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST438=null;
        Token LARGET440=null;
        JVMParser.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList439 =null;


        Object LESST438_tree=null;
        Object LARGET440_tree=null;
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_simpleBytecodeTypeArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeTypeArgumentList");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:677:3: ( LESST simpleBytecodeTypeArgumentList LARGET -> simpleBytecodeTypeArgumentList )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:677:5: LESST simpleBytecodeTypeArgumentList LARGET
            {
            LESST438=(Token)match(input,LESST,FOLLOW_LESST_in_simpleBytecodeTypeArguments5869); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST438);


            pushFollow(FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments5871);
            simpleBytecodeTypeArgumentList439=simpleBytecodeTypeArgumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleBytecodeTypeArgumentList.add(simpleBytecodeTypeArgumentList439.getTree());

            LARGET440=(Token)match(input,LARGET,FOLLOW_LARGET_in_simpleBytecodeTypeArguments5873); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET440);


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
            // 677:63: -> simpleBytecodeTypeArgumentList
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:679:1: simpleBytecodeTypeArgumentList : simpleBytecodeTypeArgument ( simpleBytecodeTypeArgument )* -> ( simpleBytecodeTypeArgument )+ ;
    public final JVMParser.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList() throws RecognitionException {
        JVMParser.simpleBytecodeTypeArgumentList_return retval = new JVMParser.simpleBytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument441 =null;

        JVMParser.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument442 =null;


        RewriteRuleSubtreeStream stream_simpleBytecodeTypeArgument=new RewriteRuleSubtreeStream(adaptor,"rule simpleBytecodeTypeArgument");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:680:3: ( simpleBytecodeTypeArgument ( simpleBytecodeTypeArgument )* -> ( simpleBytecodeTypeArgument )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:680:5: simpleBytecodeTypeArgument ( simpleBytecodeTypeArgument )*
            {
            pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList5903);
            simpleBytecodeTypeArgument441=simpleBytecodeTypeArgument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleBytecodeTypeArgument.add(simpleBytecodeTypeArgument441.getTree());

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:680:32: ( simpleBytecodeTypeArgument )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==BaseType||LA110_0==IDENTIFIER||LA110_0==INTERNALTYPE||LA110_0==LBRACK||LA110_0==MINUS||LA110_0==PLUS||LA110_0==STAR) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:680:33: simpleBytecodeTypeArgument
            	    {
            	    pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList5906);
            	    simpleBytecodeTypeArgument442=simpleBytecodeTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_simpleBytecodeTypeArgument.add(simpleBytecodeTypeArgument442.getTree());

            	    }
            	    break;

            	default :
            	    break loop110;
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
            // 680:63: -> ( simpleBytecodeTypeArgument )+
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:682:1: simpleBytecodeTypeArgument : ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR );
    public final JVMParser.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument() throws RecognitionException {
        JVMParser.simpleBytecodeTypeArgument_return retval = new JVMParser.simpleBytecodeTypeArgument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MINUS444=null;
        Token PLUS446=null;
        Token STAR448=null;
        JVMParser.bytecodeType_return bytecodeType443 =null;

        JVMParser.bytecodeType_return bytecodeType445 =null;

        JVMParser.bytecodeType_return bytecodeType447 =null;


        Object MINUS444_tree=null;
        Object PLUS446_tree=null;
        Object STAR448_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:683:3: ( bytecodeType | MINUS bytecodeType | PLUS bytecodeType | STAR )
            int alt111=4;
            switch ( input.LA(1) ) {
            case BaseType:
            case IDENTIFIER:
            case INTERNALTYPE:
            case LBRACK:
                {
                alt111=1;
                }
                break;
            case MINUS:
                {
                alt111=2;
                }
                break;
            case PLUS:
                {
                alt111=3;
                }
                break;
            case STAR:
                {
                alt111=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;

            }

            switch (alt111) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:683:5: bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument5926);
                    bytecodeType443=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType443.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:684:5: MINUS bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    MINUS444=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleBytecodeTypeArgument5932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS444_tree = 
                    (Object)adaptor.create(MINUS444)
                    ;
                    adaptor.addChild(root_0, MINUS444_tree);
                    }

                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument5934);
                    bytecodeType445=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType445.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:685:5: PLUS bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    PLUS446=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleBytecodeTypeArgument5940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS446_tree = 
                    (Object)adaptor.create(PLUS446)
                    ;
                    adaptor.addChild(root_0, PLUS446_tree);
                    }

                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument5942);
                    bytecodeType447=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType447.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:686:5: STAR
                    {
                    root_0 = (Object)adaptor.nil();


                    STAR448=(Token)match(input,STAR,FOLLOW_STAR_in_simpleBytecodeTypeArgument5948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STAR448_tree = 
                    (Object)adaptor.create(STAR448)
                    ;
                    adaptor.addChild(root_0, STAR448_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:693:1: identifier : ( IDENTIFIER |v1= BaseType -> IDENTIFIER[$v1] |v2= VoidType -> IDENTIFIER[$v2] |v3= Constant_type -> IDENTIFIER[$v3] );
    public final JVMParser.identifier_return identifier() throws RecognitionException {
        JVMParser.identifier_return retval = new JVMParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token v1=null;
        Token v2=null;
        Token v3=null;
        Token IDENTIFIER449=null;

        Object v1_tree=null;
        Object v2_tree=null;
        Object v3_tree=null;
        Object IDENTIFIER449_tree=null;
        RewriteRuleTokenStream stream_VoidType=new RewriteRuleTokenStream(adaptor,"token VoidType");
        RewriteRuleTokenStream stream_BaseType=new RewriteRuleTokenStream(adaptor,"token BaseType");
        RewriteRuleTokenStream stream_Constant_type=new RewriteRuleTokenStream(adaptor,"token Constant_type");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:694:3: ( IDENTIFIER |v1= BaseType -> IDENTIFIER[$v1] |v2= VoidType -> IDENTIFIER[$v2] |v3= Constant_type -> IDENTIFIER[$v3] )
            int alt112=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt112=1;
                }
                break;
            case BaseType:
                {
                alt112=2;
                }
                break;
            case VoidType:
                {
                alt112=3;
                }
                break;
            case Constant_type:
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:694:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER449=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier5967); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER449_tree = 
                    (Object)adaptor.create(IDENTIFIER449)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER449_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:695:5: v1= BaseType
                    {
                    v1=(Token)match(input,BaseType,FOLLOW_BaseType_in_identifier5976); if (state.failed) return retval; 
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
                    // 695:21: -> IDENTIFIER[$v1]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:696:5: v2= VoidType
                    {
                    v2=(Token)match(input,VoidType,FOLLOW_VoidType_in_identifier5993); if (state.failed) return retval; 
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
                    // 696:21: -> IDENTIFIER[$v2]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:697:5: v3= Constant_type
                    {
                    v3=(Token)match(input,Constant_type,FOLLOW_Constant_type_in_identifier6010); if (state.failed) return retval; 
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
                    // 697:23: -> IDENTIFIER[$v3]
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:700:1: keywordAggregate : ( identifier |v1= primitiveType -> IDENTIFIER[$v1.text] |v2= EXTENDS -> IDENTIFIER[$v2] |v3= IMPLEMENTS -> IDENTIFIER[$v3] |v4= DEFAULT -> IDENTIFIER[$v4] |v5= CLASS -> IDENTIFIER[$v5] |v6= THROWS -> IDENTIFIER[$v6] |v7= SUPER -> IDENTIFIER[$v7] |v8= NATIVE -> IDENTIFIER[$v8] );
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

        JVMParser.identifier_return identifier450 =null;


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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:701:3: ( identifier |v1= primitiveType -> IDENTIFIER[$v1.text] |v2= EXTENDS -> IDENTIFIER[$v2] |v3= IMPLEMENTS -> IDENTIFIER[$v3] |v4= DEFAULT -> IDENTIFIER[$v4] |v5= CLASS -> IDENTIFIER[$v5] |v6= THROWS -> IDENTIFIER[$v6] |v7= SUPER -> IDENTIFIER[$v7] |v8= NATIVE -> IDENTIFIER[$v8] )
            int alt113=9;
            switch ( input.LA(1) ) {
            case BaseType:
            case Constant_type:
            case IDENTIFIER:
            case VoidType:
                {
                alt113=1;
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
                alt113=2;
                }
                break;
            case EXTENDS:
                {
                alt113=3;
                }
                break;
            case IMPLEMENTS:
                {
                alt113=4;
                }
                break;
            case DEFAULT:
                {
                alt113=5;
                }
                break;
            case CLASS:
                {
                alt113=6;
                }
                break;
            case THROWS:
                {
                alt113=7;
                }
                break;
            case SUPER:
                {
                alt113=8;
                }
                break;
            case NATIVE:
                {
                alt113=9;
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:701:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_keywordAggregate6029);
                    identifier450=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier450.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:702:5: v1= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_keywordAggregate6038);
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
                    // 702:23: -> IDENTIFIER[$v1.text]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:703:5: v2= EXTENDS
                    {
                    v2=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_keywordAggregate6052); if (state.failed) return retval; 
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
                    // 703:19: -> IDENTIFIER[$v2]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:704:5: v3= IMPLEMENTS
                    {
                    v3=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_keywordAggregate6068); if (state.failed) return retval; 
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
                    // 704:21: -> IDENTIFIER[$v3]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:705:5: v4= DEFAULT
                    {
                    v4=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_keywordAggregate6083); if (state.failed) return retval; 
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
                    // 705:19: -> IDENTIFIER[$v4]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:706:5: v5= CLASS
                    {
                    v5=(Token)match(input,CLASS,FOLLOW_CLASS_in_keywordAggregate6099); if (state.failed) return retval; 
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
                    // 706:19: -> IDENTIFIER[$v5]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:707:5: v6= THROWS
                    {
                    v6=(Token)match(input,THROWS,FOLLOW_THROWS_in_keywordAggregate6117); if (state.failed) return retval; 
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
                    // 707:19: -> IDENTIFIER[$v6]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:708:5: v7= SUPER
                    {
                    v7=(Token)match(input,SUPER,FOLLOW_SUPER_in_keywordAggregate6134); if (state.failed) return retval; 
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
                    // 708:17: -> IDENTIFIER[$v7]
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:709:5: v8= NATIVE
                    {
                    v8=(Token)match(input,NATIVE,FOLLOW_NATIVE_in_keywordAggregate6150); if (state.failed) return retval; 
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
                    // 709:17: -> IDENTIFIER[$v8]
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:712:1: primitiveType : ( boolean_type | numeric_type | VOID );
    public final JVMParser.primitiveType_return primitiveType() throws RecognitionException {
        JVMParser.primitiveType_return retval = new JVMParser.primitiveType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID453=null;
        JVMParser.boolean_type_return boolean_type451 =null;

        JVMParser.numeric_type_return numeric_type452 =null;


        Object VOID453_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:713:3: ( boolean_type | numeric_type | VOID )
            int alt114=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt114=1;
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
                alt114=2;
                }
                break;
            case VOID:
                {
                alt114=3;
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:713:5: boolean_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_boolean_type_in_primitiveType6170);
                    boolean_type451=boolean_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_type451.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:714:5: numeric_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numeric_type_in_primitiveType6176);
                    numeric_type452=numeric_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_type452.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:715:5: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID453=(Token)match(input,VOID,FOLLOW_VOID_in_primitiveType6182); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID453_tree = 
                    (Object)adaptor.create(VOID453)
                    ;
                    adaptor.addChild(root_0, VOID453_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:718:1: boolean_type : BOOLEAN ;
    public final JVMParser.boolean_type_return boolean_type() throws RecognitionException {
        JVMParser.boolean_type_return retval = new JVMParser.boolean_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN454=null;

        Object BOOLEAN454_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:719:3: ( BOOLEAN )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:719:5: BOOLEAN
            {
            root_0 = (Object)adaptor.nil();


            BOOLEAN454=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type6195); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN454_tree = 
            (Object)adaptor.create(BOOLEAN454)
            ;
            adaptor.addChild(root_0, BOOLEAN454_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:722:1: numeric_type : ( floating_point_type | integral_type );
    public final JVMParser.numeric_type_return numeric_type() throws RecognitionException {
        JVMParser.numeric_type_return retval = new JVMParser.numeric_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.floating_point_type_return floating_point_type455 =null;

        JVMParser.integral_type_return integral_type456 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:723:3: ( floating_point_type | integral_type )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==DOUBLE||LA115_0==FLOAT) ) {
                alt115=1;
            }
            else if ( (LA115_0==BYTE||LA115_0==CHAR||LA115_0==INT||LA115_0==LONG||LA115_0==SHORT) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }
            switch (alt115) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:723:5: floating_point_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_floating_point_type_in_numeric_type6208);
                    floating_point_type455=floating_point_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, floating_point_type455.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:724:5: integral_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_integral_type_in_numeric_type6214);
                    integral_type456=integral_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integral_type456.getTree());

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:727:1: integral_type : ( BYTE | SHORT | INT | LONG | CHAR );
    public final JVMParser.integral_type_return integral_type() throws RecognitionException {
        JVMParser.integral_type_return retval = new JVMParser.integral_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set457=null;

        Object set457_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:728:3: ( BYTE | SHORT | INT | LONG | CHAR )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set457=(Token)input.LT(1);

            if ( input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set457)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:735:1: floating_point_type : ( FLOAT | DOUBLE );
    public final JVMParser.floating_point_type_return floating_point_type() throws RecognitionException {
        JVMParser.floating_point_type_return retval = new JVMParser.floating_point_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set458=null;

        Object set458_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:736:3: ( FLOAT | DOUBLE )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set458=(Token)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set458)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:740:1: literals : ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER );
    public final JVMParser.literals_return literals() throws RecognitionException {
        JVMParser.literals_return retval = new JVMParser.literals_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LONGLITERAL459=null;
        Token INTLITERAL460=null;
        Token FLOATLITERAL461=null;
        Token DOUBLELITERAL462=null;
        Token CHARLITERAL463=null;
        Token STRINGLITERAL464=null;
        Token BOOLEANLITERAL465=null;
        Token MINUS466=null;
        Token IDENTIFIER467=null;

        Object LONGLITERAL459_tree=null;
        Object INTLITERAL460_tree=null;
        Object FLOATLITERAL461_tree=null;
        Object DOUBLELITERAL462_tree=null;
        Object CHARLITERAL463_tree=null;
        Object STRINGLITERAL464_tree=null;
        Object BOOLEANLITERAL465_tree=null;
        Object MINUS466_tree=null;
        Object IDENTIFIER467_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:741:3: ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER )
            int alt117=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt117=1;
                }
                break;
            case INTLITERAL:
                {
                alt117=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt117=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt117=4;
                }
                break;
            case CHARLITERAL:
                {
                alt117=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt117=6;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt117=7;
                }
                break;
            case IDENTIFIER:
            case MINUS:
                {
                alt117=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;

            }

            switch (alt117) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:741:5: LONGLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    LONGLITERAL459=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literals6283); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONGLITERAL459_tree = 
                    (Object)adaptor.create(LONGLITERAL459)
                    ;
                    adaptor.addChild(root_0, LONGLITERAL459_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:742:5: INTLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    INTLITERAL460=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literals6289); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL460_tree = 
                    (Object)adaptor.create(INTLITERAL460)
                    ;
                    adaptor.addChild(root_0, INTLITERAL460_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:743:5: FLOATLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOATLITERAL461=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literals6295); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOATLITERAL461_tree = 
                    (Object)adaptor.create(FLOATLITERAL461)
                    ;
                    adaptor.addChild(root_0, FLOATLITERAL461_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:744:5: DOUBLELITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLELITERAL462=(Token)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literals6301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLELITERAL462_tree = 
                    (Object)adaptor.create(DOUBLELITERAL462)
                    ;
                    adaptor.addChild(root_0, DOUBLELITERAL462_tree);
                    }

                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:745:5: CHARLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARLITERAL463=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literals6307); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARLITERAL463_tree = 
                    (Object)adaptor.create(CHARLITERAL463)
                    ;
                    adaptor.addChild(root_0, CHARLITERAL463_tree);
                    }

                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:746:5: STRINGLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRINGLITERAL464=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literals6313); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRINGLITERAL464_tree = 
                    (Object)adaptor.create(STRINGLITERAL464)
                    ;
                    adaptor.addChild(root_0, STRINGLITERAL464_tree);
                    }

                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:747:5: BOOLEANLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    BOOLEANLITERAL465=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literals6319); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEANLITERAL465_tree = 
                    (Object)adaptor.create(BOOLEANLITERAL465)
                    ;
                    adaptor.addChild(root_0, BOOLEANLITERAL465_tree);
                    }

                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:748:5: ( MINUS )? IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:748:5: ( MINUS )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==MINUS) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:748:5: MINUS
                            {
                            MINUS466=(Token)match(input,MINUS,FOLLOW_MINUS_in_literals6325); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            MINUS466_tree = 
                            (Object)adaptor.create(MINUS466)
                            ;
                            adaptor.addChild(root_0, MINUS466_tree);
                            }

                            }
                            break;

                    }


                    IDENTIFIER467=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literals6328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER467_tree = 
                    (Object)adaptor.create(IDENTIFIER467)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER467_tree);
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:751:1: pc : INTLITERAL COLON ;
    public final JVMParser.pc_return pc() throws RecognitionException {
        JVMParser.pc_return retval = new JVMParser.pc_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL468=null;
        Token COLON469=null;

        Object INTLITERAL468_tree=null;
        Object COLON469_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:752:3: ( INTLITERAL COLON )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:752:5: INTLITERAL COLON
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL468=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc6341); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL468_tree = 
            (Object)adaptor.create(INTLITERAL468)
            ;
            adaptor.addChild(root_0, INTLITERAL468_tree);
            }

            COLON469=(Token)match(input,COLON,FOLLOW_COLON_in_pc6343); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON469_tree = 
            (Object)adaptor.create(COLON469)
            ;
            adaptor.addChild(root_0, COLON469_tree);
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
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:252:5: ( methodDefinition )
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:252:6: methodDefinition
        {
        pushFollow(FOLLOW_methodDefinition_in_synpred1_JVM1863);
        methodDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_JVM

    // $ANTLR start synpred2_JVM
    public final void synpred2_JVM_fragment() throws RecognitionException {
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:253:5: ( ctorDefinition )
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:253:6: ctorDefinition
        {
        pushFollow(FOLLOW_ctorDefinition_in_synpred2_JVM1875);
        ctorDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_JVM

    // $ANTLR start synpred3_JVM
    public final void synpred3_JVM_fragment() throws RecognitionException {
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:254:5: ( fieldDefinition )
        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVM.g:254:6: fieldDefinition
        {
        pushFollow(FOLLOW_fieldDefinition_in_synpred3_JVM1887);
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


 

    public static final BitSet FOLLOW_class_file_in_program190 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_class_file_header_in_class_file201 = new BitSet(new long[]{0x0080000800208010L,0x0000120000000082L,0x0000000100000000L});
    public static final BitSet FOLLOW_classDefinition_in_class_file203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info291 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info293 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_modified_file_info295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info336 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexDigits_in_checksum_file_info363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition429 = new BitSet(new long[]{0x0080000800208010L,0x0000100000000082L,0x0000000100000000L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition432 = new BitSet(new long[]{0x0080000800208010L,0x0000100000000082L,0x0000000100000000L});
    public static final BitSet FOLLOW_typeName_in_classDefinition435 = new BitSet(new long[]{0x0400C40000000000L,0x0010000000010406L,0x0000000000002780L});
    public static final BitSet FOLLOW_typeParameters_in_classDefinition437 = new BitSet(new long[]{0x0400C40000000000L,0x0010000000000406L,0x0000000000002780L});
    public static final BitSet FOLLOW_EXTENDS_in_classDefinition441 = new BitSet(new long[]{0x010000880004D000L,0x0080100000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_typeList_in_classDefinition443 = new BitSet(new long[]{0x0400840000000000L,0x0010000000000406L,0x0000000000002780L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_classDefinition448 = new BitSet(new long[]{0x010000880004D000L,0x0080100000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_typeList_in_classDefinition450 = new BitSet(new long[]{0x0400840000000000L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_type_info_in_classDefinition459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_classDefinition471 = new BitSet(new long[]{0x018000880004D010L,0x0080338080030042L,0x00000001C0020045L});
    public static final BitSet FOLLOW_classBody_in_classDefinition478 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_classDefinition485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info682 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_minor_major_version_info_in_type_info688 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_flags_in_type_info694 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info700 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info707 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info713 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info719 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info725 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_deprecated_in_type_info731 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_synthetic_in_type_info737 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_scala_info_in_type_info743 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic758 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated781 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod804 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod806 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod808 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_sourcefile_info841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ScalaSig_in_scalaSig_info863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scalaSig_info869 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scalaSig_info871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Scala_in_scala_info952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scala_info958 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scala_info960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scala_info962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition999 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info1024 = new BitSet(new long[]{0x0080000010000010L,0x0000038080000000L,0x0000000000000045L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info1026 = new BitSet(new long[]{0x0080000010000012L,0x0000038080000000L,0x0000000000000045L});
    public static final BitSet FOLLOW_method_visual_modifier_in_innerclass_info_line1052 = new BitSet(new long[]{0x0080000010000010L,0x0000000080000000L,0x0000000000000045L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line1055 = new BitSet(new long[]{0x0080000010000010L,0x0000000080000000L,0x0000000000000045L});
    public static final BitSet FOLLOW_innerclass_info_data_in_innerclass_info_line1058 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_innerclass_info_line1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1098 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_data1101 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_data1110 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info1208 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_minor_major_version_info1210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_major_version_info1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Flag_in_flags1244 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000202L});
    public static final BitSet FOLLOW_accessFlagList_in_flags1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_Marker_in_flags1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList1273 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_accessFlagList1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList1278 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info1322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1329 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem1351 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_runtimeVisibleAnnotationsItem1355 = new BitSet(new long[]{0x0000000010000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1357 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_runtimeVisibleAnnotationsItem1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1383 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_runtimeVisibleAnnotationAssignList1386 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1388 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign1407 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign1409 = new BitSet(new long[]{0x0000000000000200L,0x0000000000008000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationAssign1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationValue1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationValue1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_brackedAnnotationAssign1452 = new BitSet(new long[]{0x0000000000000200L,0x0000400000000000L});
    public static final BitSet FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign1454 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACK_in_brackedAnnotationAssign1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1505 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_brackedAnnotationAssignList1508 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1510 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue1532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_brackedAnnotationAssignValue1535 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue1537 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_brackedAnnotationAssignValue1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations1563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations1570 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1614 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_parameterVisibilityInfo1690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1696 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1730 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1732 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_runtimeInvisibleAnnotationsItem1737 = new BitSet(new long[]{0x0000000010000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1739 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_runtimeInvisibleAnnotationsItem1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1777 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_constant_pool1779 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool1786 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line1813 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line1815 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classBodyEntryDecl_in_classBody1846 = new BitSet(new long[]{0x018000880004D012L,0x0080138080030042L,0x00000001C0020045L});
    public static final BitSet FOLLOW_methodDefinition_in_classBodyEntryDecl1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBodyEntryDecl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBodyEntryDecl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBodyEntryDecl1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition1915 = new BitSet(new long[]{0x018000880004D000L,0x0080100000020042L,0x00000001C0020001L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition1918 = new BitSet(new long[]{0x018000880004D000L,0x0080100000020042L,0x00000001C0020001L});
    public static final BitSet FOLLOW_type_in_fieldDefinition1921 = new BitSet(new long[]{0x010040A80024D000L,0x0080000080020046L,0x0000000140008010L});
    public static final BitSet FOLLOW_keywordAggregate_in_fieldDefinition1923 = new BitSet(new long[]{0x0000000000000100L,0x0040000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_fieldDefinition1926 = new BitSet(new long[]{0x0200010000082000L,0x0000000010040202L,0x0000000000000008L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition1928 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_fieldDefinition1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition1939 = new BitSet(new long[]{0x0000040400000002L,0x0014000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition1945 = new BitSet(new long[]{0x0000040400000002L,0x0014000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo2060 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfo2062 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_flags_in_fieldInfo2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo2092 = new BitSet(new long[]{0x0100008000045000L,0x0080000000020040L,0x0000000040000000L});
    public static final BitSet FOLLOW_primitiveType_in_fieldAdditionalInfo2094 = new BitSet(new long[]{0x0200010000082000L,0x0000000010040202L,0x0000000000000008L});
    public static final BitSet FOLLOW_literals_in_fieldAdditionalInfo2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo2112 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo2128 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldAdditionalInfo2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo2144 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo2160 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STATIC_in_staticCtorDefinition2261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_staticCtorDefinition2263 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_staticCtorDefinition2265 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_staticCtorDefinition2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition2274 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition2324 = new BitSet(new long[]{0x0000000800008000L,0x0000100000010002L,0x0000000100000000L});
    public static final BitSet FOLLOW_genericDescriptor_in_ctorDefinition2327 = new BitSet(new long[]{0x0000000800008000L,0x0000100000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_typeName_in_ctorDefinition2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition2332 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition2334 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_ctorDefinition2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition2344 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_body_in_ctorDefinition2350 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_visual_modifier_in_methodDefinition2525 = new BitSet(new long[]{0x018000880004D010L,0x0080100080030042L,0x0000000140000045L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition2528 = new BitSet(new long[]{0x018000880004D010L,0x0080100080030042L,0x0000000140000045L});
    public static final BitSet FOLLOW_genericDescriptor_in_methodDefinition2531 = new BitSet(new long[]{0x010000880004D000L,0x0080100000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_type_in_methodDefinition2534 = new BitSet(new long[]{0x010040A80024D000L,0x0080000080020046L,0x0000000140008010L});
    public static final BitSet FOLLOW_keywordAggregate_in_methodDefinition2536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition2538 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_throwClauseMethod_in_methodDefinition2540 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_methodDefinition2543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition2550 = new BitSet(new long[]{0x0004040200000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_body_in_methodDefinition2556 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo2742 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfo2768 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2771 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfo2788 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfo2790 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo2822 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo2828 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo2834 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo2840 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfo2846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfo2849 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfo2876 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2878 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfo2903 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault2918 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault2921 = new BitSet(new long[]{0x0000000000000200L,0x0000000000008000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationDefault2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_methodSignatureInfo2949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_methodSignatureInfo2951 = new BitSet(new long[]{0x0000000000008000L,0x0002000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo2953 = new BitSet(new long[]{0x0000000000008000L,0x0002000000008102L});
    public static final BitSet FOLLOW_RPAREN_in_methodSignatureInfo2956 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L,0x0000000100000000L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3070 = new BitSet(new long[]{0x010000C80004D000L,0x0082100000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_typeList_in_arguments3072 = new BitSet(new long[]{0x0000004000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments3076 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments3078 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments3080 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_body3129 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_body3131 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Code_in_body3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_codeBlock_in_body3146 = new BitSet(new long[]{0x0002000000000002L,0x0000000003800000L,0x0000000000001800L});
    public static final BitSet FOLLOW_bodyExtension_in_body3152 = new BitSet(new long[]{0x0002000000000002L,0x0000000003800000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension3190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension3221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension3252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension3294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension3326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_codeBlock3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_instructionSet_in_codeBlock3377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_codeLine_in_instructionSet3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaSwitch_in_instructionSet3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeLine3462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine3464 = new BitSet(new long[]{0x0100008012045002L,0x0080000000020240L,0x0000000040000000L});
    public static final BitSet FOLLOW_operand1_in_codeLine3466 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_codeLine3470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeLine3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd3509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd3511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeBlockEnd3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_operand13554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_operand13561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_operand13567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables3580 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_variables3582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables3584 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_variables3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable3609 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_variable3611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_javaSwitch3648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch3650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_javaSwitch3656 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch3663 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch3670 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACE_in_javaSwitch3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_switchLine3741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine3757 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_switchDefaultLine3759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_throwClause3802 = new BitSet(new long[]{0x010000880004D000L,0x0080100000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_typeList_in_throwClause3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_throwClauseMethod3847 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000102L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod3849 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_throwClauseMethod3852 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000102L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod3854 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable3945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable3947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable3949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable3958 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry3996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry4000 = new BitSet(new long[]{0x0100008008045000L,0x0080000000020042L,0x0000000040000000L});
    public static final BitSet FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntryValue4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntryValue4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable4083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine4097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine4099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4140 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable4147 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine4196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine4198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine4200 = new BitSet(new long[]{0x010040A80024D000L,0x0080000080020046L,0x0000000140008011L});
    public static final BitSet FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine4202 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keywordAggregate_in_localVariableTableLineIdentifier4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_localVariableTableLineIdentifier4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable4277 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable4279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable4281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable4288 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4334 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4340 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4351 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4362 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable4384 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable4386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable4388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable4395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry4451 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry4453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008200L});
    public static final BitSet FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntryValue4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_stackMapTableTypesContainer4496 = new BitSet(new long[]{0x0100008002245000L,0x0080400000020042L,0x0000000040000000L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer4498 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACK_in_stackMapTableTypesContainer4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes4532 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_stackMapTableTypes4536 = new BitSet(new long[]{0x0100008000245000L,0x0080000000020042L,0x0000000040000000L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes4538 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableType4569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableType4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject4585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableTypePlainObject4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject4634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList4656 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList4659 = new BitSet(new long[]{0x010000880004D000L,0x0080100000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_type_in_typeList4661 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_combinedJavaType_in_type4705 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_LBRACK_in_type4708 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type4710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_combinedJavaType4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenceType_in_combinedJavaType4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType4769 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_referenceType4772 = new BitSet(new long[]{0x0000000800008000L,0x0000100000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType4774 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_typeName_in_typeDeclSpecifier4798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_typeArguments_in_typeDeclSpecifier4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeName4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QualifiedType_in_typeName4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_typeArguments4902 = new BitSet(new long[]{0x010000880004D000L,0x0080140000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_typeArgumentList_in_typeArguments4904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_typeArguments4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgument_in_typeArgumentList4937 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeArgumentList4940 = new BitSet(new long[]{0x010000880004D000L,0x0080140000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_typeArgument_in_typeArgumentList4942 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_type_in_typeArgument4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_typeArgument4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_wildcard4988 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_wildcardBounds_in_wildcard4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_wildcardBounds5031 = new BitSet(new long[]{0x010000880004D000L,0x0080100000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_type_in_wildcardBounds5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_wildcardBounds5078 = new BitSet(new long[]{0x010000880004D000L,0x0080100000020042L,0x0000000140000000L});
    public static final BitSet FOLLOW_type_in_wildcardBounds5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_typeParameters5133 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters5135 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_typeParameters5138 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters5140 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_typeParameters5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeParameter5161 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_typeBound5207 = new BitSet(new long[]{0x0000000800008000L,0x0000100000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_referenceType_in_typeBound5209 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_typeBound5212 = new BitSet(new long[]{0x0000000800008000L,0x0000100000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_referenceType_in_typeBound5214 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_LESST_in_genericDescriptor5242 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor5244 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_genericDescriptor5247 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor5249 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_genericDescriptor5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor5270 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor5272 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000100000000L});
    public static final BitSet FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList5313 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_bytecodeReferenceTypeList5316 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000100000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList5318 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType5346 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_bytecodeReferenceType5349 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000100000000L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType5351 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier5375 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_bytecodeTypeName5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeTypeName5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_bytecodeTypeArguments5492 = new BitSet(new long[]{0x0000000800008000L,0x0000040000000102L,0x0000000100000000L});
    public static final BitSet FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments5494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_bytecodeTypeArguments5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList5527 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_bytecodeTypeArgumentList5530 = new BitSet(new long[]{0x0000000800008000L,0x0000040000000102L,0x0000000100000000L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList5532 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bytecodeWildcard5570 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_bytecodeWildcardBounds5613 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000100000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_bytecodeWildcardBounds5651 = new BitSet(new long[]{0x0000000800008000L,0x0000000000000102L,0x0000000100000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeType5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_bytecodeType5712 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType5718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType5731 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType5746 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_simpleBytecodeObjectType5749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType5751 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType5770 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleBytecodeReferenceTypeName5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_simpleBytecodeTypeArguments5869 = new BitSet(new long[]{0x0000000000008000L,0x8000004010008102L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments5871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LARGET_in_simpleBytecodeTypeArguments5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList5903 = new BitSet(new long[]{0x0000000000008002L,0x8000004010008102L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList5906 = new BitSet(new long[]{0x0000000000008002L,0x8000004010008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleBytecodeTypeArgument5932 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleBytecodeTypeArgument5940 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_simpleBytecodeTypeArgument5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier5967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_identifier5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_identifier5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_type_in_identifier6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_keywordAggregate6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_keywordAggregate6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_keywordAggregate6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_keywordAggregate6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_keywordAggregate6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_keywordAggregate6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_keywordAggregate6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_keywordAggregate6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_keywordAggregate6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literals6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literals6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literals6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literals6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literals6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literals6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literals6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literals6325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literals6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc6341 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pc6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_synpred1_JVM1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_synpred2_JVM1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_synpred3_JVM1887 = new BitSet(new long[]{0x0000000000000002L});

}