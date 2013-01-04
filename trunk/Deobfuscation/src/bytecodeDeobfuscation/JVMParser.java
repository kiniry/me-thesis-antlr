// $ANTLR 3.4 JVM.g 2013-01-04 16:18:18

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AND", "ANNOTATIONVALUE", "ARGNAME", "ASSIGN", "AnnotationAssign", "AnnotationDefault", "BOOLEAN", "BOOLEANLITERAL", "BYTE", "BaseType", "CFHEADER", "CHAR", "CHARLITERAL", "CLASS", "CLASSDECL", "CLASSFILE", "COLON", "COMMA", "COMMENT", "CONSTANT_TYPE_ASSIGNABLE", "CPINDEX", "CPOOL", "CTORDECL", "CharEscapeSequence", "CharUnicodeEscapeSequence", "Code", "Constant", "Constant_type", "DATE", "DEFAULT", "DOT", "DOUBLE", "DOUBLELITERAL", "DefaultValue", "Deprecated", "DoubleSuffix", "ETENTRY", "ETHEADER", "EXTENDS", "EnclosingMethod", "EscapeSequence", "ExceptionTable", "Exceptions", "Exponent", "FALSE", "FIELDDECL", "FINAL", "FLOAT", "FLOATLITERAL", "Flag", "FloatSuffix", "GENERICDESC", "HASH", "HexDigit", "HexDigits", "HexPrefix", "ICDATA", "IDENTIFIER", "IMPLEMENTS", "INSTRUCTION", "INT", "INTERFACE", "INTERNALTYPE", "INTLITERAL", "InnerClasses", "IntDigit", "IntegerNumber", "LARGET", "LBRACE", "LBRACK", "LESST", "LONG", "LONGLITERAL", "LPAREN", "LVENTRY", "LVHEADER", "Letter", "LineNumberTable", "LocalVariableTable", "LocalVariableTypeTable", "LongSuffix", "MINUS", "MODIFIER", "Marker", "NATIVE", "NL", "NORMALTYPE", "NonIntegerNumber", "Octal", "OctalEscape", "PLUS", "PRIVATE", "PROTECTED", "PUBLIC", "QUESTION", "QUOTE", "RBRACE", "RBRACK", "RETVALUE", "RPAREN", "RuntimeInvisibleAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleParameterAnnotations", "SEMI", "SHORT", "SLASH", "SMENTRY", "SMHEADER", "SMTENTRY", "SMTHEADER", "STAR", "STATIC", "STATICCTORDECL", "STRINGLITERAL", "SUPER", "SWITCH", "SYNCHRONIZED", "Scala", "ScalaSig", "Signature", "SourceFile", "StackMap", "StackMapTable", "Synthetic", "THROWS", "THROWVAL", "TRANSIENT", "TRUE", "Throws", "UNDERSCORE", "UNITARGUMENTS", "UNITBODY", "UNITHEADER", "UNITNAME", "UnicodeEscapeSequence", "VARINFO", "VMODIFIER", "VOID", "VOLATILE", "VoidType", "WINDOWSPATH", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AND=5;
    public static final int ANNOTATIONVALUE=6;
    public static final int ARGNAME=7;
    public static final int ASSIGN=8;
    public static final int AnnotationAssign=9;
    public static final int AnnotationDefault=10;
    public static final int BOOLEAN=11;
    public static final int BOOLEANLITERAL=12;
    public static final int BYTE=13;
    public static final int BaseType=14;
    public static final int CFHEADER=15;
    public static final int CHAR=16;
    public static final int CHARLITERAL=17;
    public static final int CLASS=18;
    public static final int CLASSDECL=19;
    public static final int CLASSFILE=20;
    public static final int COLON=21;
    public static final int COMMA=22;
    public static final int COMMENT=23;
    public static final int CONSTANT_TYPE_ASSIGNABLE=24;
    public static final int CPINDEX=25;
    public static final int CPOOL=26;
    public static final int CTORDECL=27;
    public static final int CharEscapeSequence=28;
    public static final int CharUnicodeEscapeSequence=29;
    public static final int Code=30;
    public static final int Constant=31;
    public static final int Constant_type=32;
    public static final int DATE=33;
    public static final int DEFAULT=34;
    public static final int DOT=35;
    public static final int DOUBLE=36;
    public static final int DOUBLELITERAL=37;
    public static final int DefaultValue=38;
    public static final int Deprecated=39;
    public static final int DoubleSuffix=40;
    public static final int ETENTRY=41;
    public static final int ETHEADER=42;
    public static final int EXTENDS=43;
    public static final int EnclosingMethod=44;
    public static final int EscapeSequence=45;
    public static final int ExceptionTable=46;
    public static final int Exceptions=47;
    public static final int Exponent=48;
    public static final int FALSE=49;
    public static final int FIELDDECL=50;
    public static final int FINAL=51;
    public static final int FLOAT=52;
    public static final int FLOATLITERAL=53;
    public static final int Flag=54;
    public static final int FloatSuffix=55;
    public static final int GENERICDESC=56;
    public static final int HASH=57;
    public static final int HexDigit=58;
    public static final int HexDigits=59;
    public static final int HexPrefix=60;
    public static final int ICDATA=61;
    public static final int IDENTIFIER=62;
    public static final int IMPLEMENTS=63;
    public static final int INSTRUCTION=64;
    public static final int INT=65;
    public static final int INTERFACE=66;
    public static final int INTERNALTYPE=67;
    public static final int INTLITERAL=68;
    public static final int InnerClasses=69;
    public static final int IntDigit=70;
    public static final int IntegerNumber=71;
    public static final int LARGET=72;
    public static final int LBRACE=73;
    public static final int LBRACK=74;
    public static final int LESST=75;
    public static final int LONG=76;
    public static final int LONGLITERAL=77;
    public static final int LPAREN=78;
    public static final int LVENTRY=79;
    public static final int LVHEADER=80;
    public static final int Letter=81;
    public static final int LineNumberTable=82;
    public static final int LocalVariableTable=83;
    public static final int LocalVariableTypeTable=84;
    public static final int LongSuffix=85;
    public static final int MINUS=86;
    public static final int MODIFIER=87;
    public static final int Marker=88;
    public static final int NATIVE=89;
    public static final int NL=90;
    public static final int NORMALTYPE=91;
    public static final int NonIntegerNumber=92;
    public static final int Octal=93;
    public static final int OctalEscape=94;
    public static final int PLUS=95;
    public static final int PRIVATE=96;
    public static final int PROTECTED=97;
    public static final int PUBLIC=98;
    public static final int QUESTION=99;
    public static final int QUOTE=100;
    public static final int RBRACE=101;
    public static final int RBRACK=102;
    public static final int RETVALUE=103;
    public static final int RPAREN=104;
    public static final int RuntimeInvisibleAnnotations=105;
    public static final int RuntimeInvisibleParameterAnnotations=106;
    public static final int RuntimeVisibleAnnotations=107;
    public static final int RuntimeVisibleParameterAnnotations=108;
    public static final int SEMI=109;
    public static final int SHORT=110;
    public static final int SLASH=111;
    public static final int SMENTRY=112;
    public static final int SMHEADER=113;
    public static final int SMTENTRY=114;
    public static final int SMTHEADER=115;
    public static final int STAR=116;
    public static final int STATIC=117;
    public static final int STATICCTORDECL=118;
    public static final int STRINGLITERAL=119;
    public static final int SUPER=120;
    public static final int SWITCH=121;
    public static final int SYNCHRONIZED=122;
    public static final int Scala=123;
    public static final int ScalaSig=124;
    public static final int Signature=125;
    public static final int SourceFile=126;
    public static final int StackMap=127;
    public static final int StackMapTable=128;
    public static final int Synthetic=129;
    public static final int THROWS=130;
    public static final int THROWVAL=131;
    public static final int TRANSIENT=132;
    public static final int TRUE=133;
    public static final int Throws=134;
    public static final int UNDERSCORE=135;
    public static final int UNITARGUMENTS=136;
    public static final int UNITBODY=137;
    public static final int UNITHEADER=138;
    public static final int UNITNAME=139;
    public static final int UnicodeEscapeSequence=140;
    public static final int VARINFO=141;
    public static final int VMODIFIER=142;
    public static final int VOID=143;
    public static final int VOLATILE=144;
    public static final int VoidType=145;
    public static final int WINDOWSPATH=146;
    public static final int WS=147;

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
    public String getGrammarFileName() { return "JVM.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // JVM.g:33:1: program : ( class_file )* ;
    public final JVMParser.program_return program() throws RecognitionException {
        JVMParser.program_return retval = new JVMParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_return class_file1 =null;



        try {
            // JVM.g:33:9: ( ( class_file )* )
            // JVM.g:33:11: ( class_file )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:33:11: ( class_file )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ABSTRACT||LA1_0==BOOLEAN||(LA1_0 >= BYTE && LA1_0 <= BaseType)||LA1_0==CHAR||LA1_0==CLASS||LA1_0==Constant_type||LA1_0==DEFAULT||LA1_0==DOUBLE||LA1_0==EXTENDS||(LA1_0 >= FINAL && LA1_0 <= FLOAT)||(LA1_0 >= IDENTIFIER && LA1_0 <= IMPLEMENTS)||(LA1_0 >= INT && LA1_0 <= INTERFACE)||LA1_0==LONG||LA1_0==NORMALTYPE||LA1_0==PUBLIC||LA1_0==SHORT||LA1_0==SUPER||LA1_0==THROWS||LA1_0==VOID||LA1_0==VoidType) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // JVM.g:33:11: class_file
            	    {
            	    pushFollow(FOLLOW_class_file_in_program149);
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
    // JVM.g:35:1: class_file : class_file_header classDefinition -> ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) ;
    public final JVMParser.class_file_return class_file() throws RecognitionException {
        JVMParser.class_file_return retval = new JVMParser.class_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_header_return class_file_header2 =null;

        JVMParser.classDefinition_return classDefinition3 =null;


        RewriteRuleSubtreeStream stream_class_file_header=new RewriteRuleSubtreeStream(adaptor,"rule class_file_header");
        RewriteRuleSubtreeStream stream_classDefinition=new RewriteRuleSubtreeStream(adaptor,"rule classDefinition");
        try {
            // JVM.g:36:3: ( class_file_header classDefinition -> ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition ) )
            // JVM.g:36:5: class_file_header classDefinition
            {
            pushFollow(FOLLOW_class_file_header_in_class_file160);
            class_file_header2=class_file_header();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_class_file_header.add(class_file_header2.getTree());

            pushFollow(FOLLOW_classDefinition_in_class_file162);
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
            // 36:39: -> ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
            {
                // JVM.g:36:42: ^( CLASSFILE ^( CFHEADER class_file_header ) classDefinition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASSFILE, "CLASSFILE")
                , root_1);

                // JVM.g:36:54: ^( CFHEADER class_file_header )
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
    // JVM.g:38:1: class_file_header : ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )* ;
    public final JVMParser.class_file_header_return class_file_header() throws RecognitionException {
        JVMParser.class_file_header_return retval = new JVMParser.class_file_header_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_info_return class_file_info4 =null;

        JVMParser.modified_file_info_return modified_file_info5 =null;

        JVMParser.checksum_file_info_return checksum_file_info6 =null;

        JVMParser.compiled_file_info_return compiled_file_info7 =null;



        try {
            // JVM.g:39:3: ( ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )* )
            // JVM.g:39:5: ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:39:5: ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENTIFIER) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==WINDOWSPATH) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==IDENTIFIER) ) {
                        switch ( input.LA(3) ) {
                        case DATE:
                            {
                            alt2=2;
                            }
                            break;
                        case STRINGLITERAL:
                            {
                            alt2=4;
                            }
                            break;
                        case IDENTIFIER:
                            {
                            int LA2_7 = input.LA(4);

                            if ( (LA2_7==ABSTRACT||LA2_7==BOOLEAN||(LA2_7 >= BYTE && LA2_7 <= BaseType)||LA2_7==CHAR||LA2_7==CLASS||LA2_7==Constant_type||LA2_7==DEFAULT||LA2_7==DOUBLE||LA2_7==EXTENDS||(LA2_7 >= FINAL && LA2_7 <= FLOAT)||(LA2_7 >= IDENTIFIER && LA2_7 <= IMPLEMENTS)||(LA2_7 >= INT && LA2_7 <= INTERFACE)||LA2_7==LONG||LA2_7==NORMALTYPE||LA2_7==PUBLIC||LA2_7==SHORT||LA2_7==SUPER||LA2_7==THROWS||LA2_7==VOID||LA2_7==VoidType) ) {
                                alt2=3;
                            }


                            }
                            break;
                        case HexDigits:
                            {
                            alt2=3;
                            }
                            break;

                        }

                    }


                }


                switch (alt2) {
            	case 1 :
            	    // JVM.g:39:6: class_file_info
            	    {
            	    pushFollow(FOLLOW_class_file_info_in_class_file_header189);
            	    class_file_info4=class_file_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_file_info4.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:40:5: modified_file_info
            	    {
            	    pushFollow(FOLLOW_modified_file_info_in_class_file_header195);
            	    modified_file_info5=modified_file_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modified_file_info5.getTree());

            	    }
            	    break;
            	case 3 :
            	    // JVM.g:41:5: checksum_file_info
            	    {
            	    pushFollow(FOLLOW_checksum_file_info_in_class_file_header201);
            	    checksum_file_info6=checksum_file_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, checksum_file_info6.getTree());

            	    }
            	    break;
            	case 4 :
            	    // JVM.g:42:5: compiled_file_info
            	    {
            	    pushFollow(FOLLOW_compiled_file_info_in_class_file_header207);
            	    compiled_file_info7=compiled_file_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, compiled_file_info7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "class_file_header"


    public static class class_file_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_file_info"
    // JVM.g:44:1: class_file_info : IDENTIFIER WINDOWSPATH -> ^( IDENTIFIER WINDOWSPATH ) ;
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
            // JVM.g:45:3: ( IDENTIFIER WINDOWSPATH -> ^( IDENTIFIER WINDOWSPATH ) )
            // JVM.g:45:5: IDENTIFIER WINDOWSPATH
            {
            IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_file_info221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER8);


            WINDOWSPATH9=(Token)match(input,WINDOWSPATH,FOLLOW_WINDOWSPATH_in_class_file_info223); if (state.failed) return retval; 
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
            // 45:28: -> ^( IDENTIFIER WINDOWSPATH )
            {
                // JVM.g:45:31: ^( IDENTIFIER WINDOWSPATH )
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
    // JVM.g:48:1: modified_file_info : i1= IDENTIFIER i2= IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER -> ^( IDENTIFIER[$i1.getText() + \" \" + $i2.getText()] DATE ^( IDENTIFIER INTLITERAL IDENTIFIER ) ) ;
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
            // JVM.g:49:3: (i1= IDENTIFIER i2= IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER -> ^( IDENTIFIER[$i1.getText() + \" \" + $i2.getText()] DATE ^( IDENTIFIER INTLITERAL IDENTIFIER ) ) )
            // JVM.g:49:5: i1= IDENTIFIER i2= IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER
            {
            i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i1);


            i2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i2);


            DATE10=(Token)match(input,DATE,FOLLOW_DATE_in_modified_file_info254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATE.add(DATE10);


            SEMI11=(Token)match(input,SEMI,FOLLOW_SEMI_in_modified_file_info256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI11);


            IDENTIFIER12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info258); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER12);


            INTLITERAL13=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_modified_file_info260); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL13);


            IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER14);


            // AST REWRITE
            // elements: INTLITERAL, IDENTIFIER, IDENTIFIER, DATE, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:76: -> ^( IDENTIFIER[$i1.getText() + \" \" + $i2.getText()] DATE ^( IDENTIFIER INTLITERAL IDENTIFIER ) )
            {
                // JVM.g:49:79: ^( IDENTIFIER[$i1.getText() + \" \" + $i2.getText()] DATE ^( IDENTIFIER INTLITERAL IDENTIFIER ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IDENTIFIER, i1.getText() + " " + i2.getText())
                , root_1);

                adaptor.addChild(root_1, 
                stream_DATE.nextNode()
                );

                // JVM.g:49:134: ^( IDENTIFIER INTLITERAL IDENTIFIER )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_2);

                adaptor.addChild(root_2, 
                stream_INTLITERAL.nextNode()
                );

                adaptor.addChild(root_2, 
                stream_IDENTIFIER.nextNode()
                );

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
    // $ANTLR end "modified_file_info"


    public static class checksum_file_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "checksum_file_info"
    // JVM.g:52:1: checksum_file_info : IDENTIFIER IDENTIFIER ( IDENTIFIER | HexDigits ) -> ^( IDENTIFIER IDENTIFIER ( IDENTIFIER )? ( HexDigits )? ) ;
    public final JVMParser.checksum_file_info_return checksum_file_info() throws RecognitionException {
        JVMParser.checksum_file_info_return retval = new JVMParser.checksum_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER15=null;
        Token IDENTIFIER16=null;
        Token IDENTIFIER17=null;
        Token HexDigits18=null;

        Object IDENTIFIER15_tree=null;
        Object IDENTIFIER16_tree=null;
        Object IDENTIFIER17_tree=null;
        Object HexDigits18_tree=null;
        RewriteRuleTokenStream stream_HexDigits=new RewriteRuleTokenStream(adaptor,"token HexDigits");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // JVM.g:53:3: ( IDENTIFIER IDENTIFIER ( IDENTIFIER | HexDigits ) -> ^( IDENTIFIER IDENTIFIER ( IDENTIFIER )? ( HexDigits )? ) )
            // JVM.g:53:5: IDENTIFIER IDENTIFIER ( IDENTIFIER | HexDigits )
            {
            IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER15);


            IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info296); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER16);


            // JVM.g:53:27: ( IDENTIFIER | HexDigits )
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
                    // JVM.g:53:28: IDENTIFIER
                    {
                    IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER17);


                    }
                    break;
                case 2 :
                    // JVM.g:53:41: HexDigits
                    {
                    HexDigits18=(Token)match(input,HexDigits,FOLLOW_HexDigits_in_checksum_file_info303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HexDigits.add(HexDigits18);


                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER, HexDigits, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:52: -> ^( IDENTIFIER IDENTIFIER ( IDENTIFIER )? ( HexDigits )? )
            {
                // JVM.g:53:55: ^( IDENTIFIER IDENTIFIER ( IDENTIFIER )? ( HexDigits )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                // JVM.g:53:79: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                // JVM.g:53:91: ( HexDigits )?
                if ( stream_HexDigits.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_HexDigits.nextNode()
                    );

                }
                stream_HexDigits.reset();

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
    // $ANTLR end "checksum_file_info"


    public static class compiled_file_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compiled_file_info"
    // JVM.g:56:1: compiled_file_info : IDENTIFIER IDENTIFIER STRINGLITERAL -> ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) ;
    public final JVMParser.compiled_file_info_return compiled_file_info() throws RecognitionException {
        JVMParser.compiled_file_info_return retval = new JVMParser.compiled_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER19=null;
        Token IDENTIFIER20=null;
        Token STRINGLITERAL21=null;

        Object IDENTIFIER19_tree=null;
        Object IDENTIFIER20_tree=null;
        Object STRINGLITERAL21_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");

        try {
            // JVM.g:57:3: ( IDENTIFIER IDENTIFIER STRINGLITERAL -> ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) )
            // JVM.g:57:5: IDENTIFIER IDENTIFIER STRINGLITERAL
            {
            IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER19);


            IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER20);


            STRINGLITERAL21=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_compiled_file_info339); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL21);


            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER, STRINGLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:41: -> ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
            {
                // JVM.g:57:44: ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
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
    // JVM.g:64:1: classDefinition : ( class_visual_modifier )? ( class_modifier )* javaTypeIdentifier ( superClass )? ( superInterface )? type_info constant_pool LBRACE ( classBody )? RBRACE -> ^( CLASSDECL ( ^( VMODIFIER class_visual_modifier ) )? ^( MODIFIER ( class_modifier )* ) javaTypeIdentifier ( superClass )? ( superInterface )? ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ( classBody )? ) ;
    public final JVMParser.classDefinition_return classDefinition() throws RecognitionException {
        JVMParser.classDefinition_return retval = new JVMParser.classDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACE29=null;
        Token RBRACE31=null;
        JVMParser.class_visual_modifier_return class_visual_modifier22 =null;

        JVMParser.class_modifier_return class_modifier23 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier24 =null;

        JVMParser.superClass_return superClass25 =null;

        JVMParser.superInterface_return superInterface26 =null;

        JVMParser.type_info_return type_info27 =null;

        JVMParser.constant_pool_return constant_pool28 =null;

        JVMParser.classBody_return classBody30 =null;


        Object LBRACE29_tree=null;
        Object RBRACE31_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_superClass=new RewriteRuleSubtreeStream(adaptor,"rule superClass");
        RewriteRuleSubtreeStream stream_type_info=new RewriteRuleSubtreeStream(adaptor,"rule type_info");
        RewriteRuleSubtreeStream stream_class_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule class_visual_modifier");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        RewriteRuleSubtreeStream stream_class_modifier=new RewriteRuleSubtreeStream(adaptor,"rule class_modifier");
        RewriteRuleSubtreeStream stream_javaTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule javaTypeIdentifier");
        RewriteRuleSubtreeStream stream_superInterface=new RewriteRuleSubtreeStream(adaptor,"rule superInterface");
        RewriteRuleSubtreeStream stream_constant_pool=new RewriteRuleSubtreeStream(adaptor,"rule constant_pool");
        try {
            // JVM.g:65:3: ( ( class_visual_modifier )? ( class_modifier )* javaTypeIdentifier ( superClass )? ( superInterface )? type_info constant_pool LBRACE ( classBody )? RBRACE -> ^( CLASSDECL ( ^( VMODIFIER class_visual_modifier ) )? ^( MODIFIER ( class_modifier )* ) javaTypeIdentifier ( superClass )? ( superInterface )? ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ( classBody )? ) )
            // JVM.g:65:5: ( class_visual_modifier )? ( class_modifier )* javaTypeIdentifier ( superClass )? ( superInterface )? type_info constant_pool LBRACE ( classBody )? RBRACE
            {
            // JVM.g:65:5: ( class_visual_modifier )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PUBLIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // JVM.g:65:5: class_visual_modifier
                    {
                    pushFollow(FOLLOW_class_visual_modifier_in_classDefinition366);
                    class_visual_modifier22=class_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_class_visual_modifier.add(class_visual_modifier22.getTree());

                    }
                    break;

            }


            // JVM.g:65:28: ( class_modifier )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CLASS) ) {
                    switch ( input.LA(2) ) {
                    case EXTENDS:
                        {
                        switch ( input.LA(3) ) {
                        case IDENTIFIER:
                            {
                            int LA5_7 = input.LA(4);

                            if ( (LA5_7==IDENTIFIER) ) {
                                int LA5_14 = input.LA(5);

                                if ( (LA5_14==COLON) ) {
                                    alt5=1;
                                }


                            }


                            }
                            break;
                        case EXTENDS:
                            {
                            switch ( input.LA(4) ) {
                            case IMPLEMENTS:
                                {
                                switch ( input.LA(5) ) {
                                case IDENTIFIER:
                                    {
                                    int LA5_10 = input.LA(6);

                                    if ( (LA5_10==IDENTIFIER) ) {
                                        int LA5_14 = input.LA(7);

                                        if ( (LA5_14==COLON) ) {
                                            alt5=1;
                                        }


                                    }


                                    }
                                    break;
                                case IMPLEMENTS:
                                    {
                                    int LA5_12 = input.LA(6);

                                    if ( (LA5_12==IDENTIFIER) ) {
                                        int LA5_18 = input.LA(7);

                                        if ( (LA5_18==IDENTIFIER) ) {
                                            int LA5_13 = input.LA(8);

                                            if ( (LA5_13==IDENTIFIER) ) {
                                                alt5=1;
                                            }


                                        }
                                        else if ( (LA5_18==COMMA||LA5_18==DOT||LA5_18==Deprecated||LA5_18==EnclosingMethod||LA5_18==Flag||LA5_18==InnerClasses||(LA5_18 >= LBRACK && LA5_18 <= LESST)||LA5_18==RuntimeVisibleAnnotations||(LA5_18 >= Scala && LA5_18 <= SourceFile)||LA5_18==Synthetic) ) {
                                            alt5=1;
                                        }


                                    }
                                    else if ( (LA5_12==BOOLEAN||(LA5_12 >= BYTE && LA5_12 <= BaseType)||LA5_12==CHAR||LA5_12==CLASS||LA5_12==Constant_type||LA5_12==DEFAULT||LA5_12==DOUBLE||LA5_12==EXTENDS||LA5_12==FLOAT||LA5_12==IMPLEMENTS||LA5_12==INT||LA5_12==LONG||LA5_12==NORMALTYPE||LA5_12==SHORT||LA5_12==SUPER||LA5_12==THROWS||LA5_12==VOID||LA5_12==VoidType) ) {
                                        alt5=1;
                                    }


                                    }
                                    break;
                                case COMMA:
                                case DOT:
                                case Deprecated:
                                case EnclosingMethod:
                                case Flag:
                                case InnerClasses:
                                case LBRACK:
                                case LESST:
                                case RuntimeVisibleAnnotations:
                                case Scala:
                                case ScalaSig:
                                case Signature:
                                case SourceFile:
                                case Synthetic:
                                    {
                                    alt5=1;
                                    }
                                    break;

                                }

                                }
                                break;
                            case IDENTIFIER:
                                {
                                int LA5_16 = input.LA(5);

                                if ( (LA5_16==IDENTIFIER) ) {
                                    int LA5_13 = input.LA(6);

                                    if ( (LA5_13==IDENTIFIER) ) {
                                        alt5=1;
                                    }


                                }
                                else if ( (LA5_16==COMMA||LA5_16==DOT||LA5_16==Deprecated||LA5_16==EnclosingMethod||LA5_16==Flag||LA5_16==IMPLEMENTS||LA5_16==InnerClasses||(LA5_16 >= LBRACK && LA5_16 <= LESST)||LA5_16==RuntimeVisibleAnnotations||(LA5_16 >= Scala && LA5_16 <= SourceFile)||LA5_16==Synthetic) ) {
                                    alt5=1;
                                }


                                }
                                break;
                            case BOOLEAN:
                            case BYTE:
                            case BaseType:
                            case CHAR:
                            case CLASS:
                            case Constant_type:
                            case DEFAULT:
                            case DOUBLE:
                            case EXTENDS:
                            case FLOAT:
                            case INT:
                            case LONG:
                            case NORMALTYPE:
                            case SHORT:
                            case SUPER:
                            case THROWS:
                            case VOID:
                            case VoidType:
                                {
                                alt5=1;
                                }
                                break;

                            }

                            }
                            break;
                        case IMPLEMENTS:
                            {
                            switch ( input.LA(4) ) {
                            case IMPLEMENTS:
                                {
                                int LA5_17 = input.LA(5);

                                if ( (LA5_17==IDENTIFIER) ) {
                                    int LA5_10 = input.LA(6);

                                    if ( (LA5_10==IDENTIFIER) ) {
                                        int LA5_14 = input.LA(7);

                                        if ( (LA5_14==COLON) ) {
                                            alt5=1;
                                        }


                                    }


                                }
                                else if ( (LA5_17==COMMA||LA5_17==DOT||LA5_17==Deprecated||LA5_17==EnclosingMethod||LA5_17==Flag||LA5_17==InnerClasses||(LA5_17 >= LBRACK && LA5_17 <= LESST)||LA5_17==RuntimeVisibleAnnotations||(LA5_17 >= Scala && LA5_17 <= SourceFile)||LA5_17==Synthetic) ) {
                                    alt5=1;
                                }


                                }
                                break;
                            case IDENTIFIER:
                                {
                                int LA5_18 = input.LA(5);

                                if ( (LA5_18==IDENTIFIER) ) {
                                    int LA5_13 = input.LA(6);

                                    if ( (LA5_13==IDENTIFIER) ) {
                                        alt5=1;
                                    }


                                }
                                else if ( (LA5_18==COMMA||LA5_18==DOT||LA5_18==Deprecated||LA5_18==EnclosingMethod||LA5_18==Flag||LA5_18==InnerClasses||(LA5_18 >= LBRACK && LA5_18 <= LESST)||LA5_18==RuntimeVisibleAnnotations||(LA5_18 >= Scala && LA5_18 <= SourceFile)||LA5_18==Synthetic) ) {
                                    alt5=1;
                                }


                                }
                                break;
                            case BOOLEAN:
                            case BYTE:
                            case BaseType:
                            case CHAR:
                            case CLASS:
                            case Constant_type:
                            case DEFAULT:
                            case DOUBLE:
                            case EXTENDS:
                            case FLOAT:
                            case INT:
                            case LONG:
                            case NORMALTYPE:
                            case SHORT:
                            case SUPER:
                            case THROWS:
                            case VOID:
                            case VoidType:
                                {
                                alt5=1;
                                }
                                break;

                            }

                            }
                            break;
                        case Deprecated:
                        case EnclosingMethod:
                        case Flag:
                        case InnerClasses:
                        case LESST:
                        case RuntimeVisibleAnnotations:
                        case Scala:
                        case ScalaSig:
                        case Signature:
                        case SourceFile:
                        case Synthetic:
                            {
                            alt5=1;
                            }
                            break;

                        }

                        }
                        break;
                    case IMPLEMENTS:
                        {
                        switch ( input.LA(3) ) {
                        case IDENTIFIER:
                            {
                            int LA5_10 = input.LA(4);

                            if ( (LA5_10==IDENTIFIER) ) {
                                int LA5_14 = input.LA(5);

                                if ( (LA5_14==COLON) ) {
                                    alt5=1;
                                }


                            }


                            }
                            break;
                        case EXTENDS:
                            {
                            int LA5_11 = input.LA(4);

                            if ( (LA5_11==IDENTIFIER) ) {
                                int LA5_16 = input.LA(5);

                                if ( (LA5_16==IDENTIFIER) ) {
                                    int LA5_13 = input.LA(6);

                                    if ( (LA5_13==IDENTIFIER) ) {
                                        alt5=1;
                                    }


                                }
                                else if ( (LA5_16==COMMA||LA5_16==DOT||LA5_16==Deprecated||LA5_16==EnclosingMethod||LA5_16==Flag||LA5_16==IMPLEMENTS||LA5_16==InnerClasses||(LA5_16 >= LBRACK && LA5_16 <= LESST)||LA5_16==RuntimeVisibleAnnotations||(LA5_16 >= Scala && LA5_16 <= SourceFile)||LA5_16==Synthetic) ) {
                                    alt5=1;
                                }


                            }
                            else if ( (LA5_11==BOOLEAN||(LA5_11 >= BYTE && LA5_11 <= BaseType)||LA5_11==CHAR||LA5_11==CLASS||LA5_11==Constant_type||LA5_11==DEFAULT||LA5_11==DOUBLE||LA5_11==EXTENDS||LA5_11==FLOAT||LA5_11==IMPLEMENTS||LA5_11==INT||LA5_11==LONG||LA5_11==NORMALTYPE||LA5_11==SHORT||LA5_11==SUPER||LA5_11==THROWS||LA5_11==VOID||LA5_11==VoidType) ) {
                                alt5=1;
                            }


                            }
                            break;
                        case IMPLEMENTS:
                            {
                            int LA5_12 = input.LA(4);

                            if ( (LA5_12==IDENTIFIER) ) {
                                int LA5_18 = input.LA(5);

                                if ( (LA5_18==IDENTIFIER) ) {
                                    int LA5_13 = input.LA(6);

                                    if ( (LA5_13==IDENTIFIER) ) {
                                        alt5=1;
                                    }


                                }
                                else if ( (LA5_18==COMMA||LA5_18==DOT||LA5_18==Deprecated||LA5_18==EnclosingMethod||LA5_18==Flag||LA5_18==InnerClasses||(LA5_18 >= LBRACK && LA5_18 <= LESST)||LA5_18==RuntimeVisibleAnnotations||(LA5_18 >= Scala && LA5_18 <= SourceFile)||LA5_18==Synthetic) ) {
                                    alt5=1;
                                }


                            }
                            else if ( (LA5_12==BOOLEAN||(LA5_12 >= BYTE && LA5_12 <= BaseType)||LA5_12==CHAR||LA5_12==CLASS||LA5_12==Constant_type||LA5_12==DEFAULT||LA5_12==DOUBLE||LA5_12==EXTENDS||LA5_12==FLOAT||LA5_12==IMPLEMENTS||LA5_12==INT||LA5_12==LONG||LA5_12==NORMALTYPE||LA5_12==SHORT||LA5_12==SUPER||LA5_12==THROWS||LA5_12==VOID||LA5_12==VoidType) ) {
                                alt5=1;
                            }


                            }
                            break;
                        case Deprecated:
                        case EnclosingMethod:
                        case Flag:
                        case InnerClasses:
                        case LESST:
                        case RuntimeVisibleAnnotations:
                        case Scala:
                        case ScalaSig:
                        case Signature:
                        case SourceFile:
                        case Synthetic:
                            {
                            alt5=1;
                            }
                            break;

                        }

                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA5_6 = input.LA(3);

                        if ( (LA5_6==IDENTIFIER) ) {
                            int LA5_13 = input.LA(4);

                            if ( (LA5_13==IDENTIFIER) ) {
                                alt5=1;
                            }


                        }
                        else if ( (LA5_6==Deprecated||(LA5_6 >= EXTENDS && LA5_6 <= EnclosingMethod)||LA5_6==Flag||LA5_6==IMPLEMENTS||LA5_6==InnerClasses||LA5_6==LESST||LA5_6==RuntimeVisibleAnnotations||(LA5_6 >= Scala && LA5_6 <= SourceFile)||LA5_6==Synthetic) ) {
                            alt5=1;
                        }


                        }
                        break;
                    case ABSTRACT:
                    case BOOLEAN:
                    case BYTE:
                    case BaseType:
                    case CHAR:
                    case CLASS:
                    case Constant_type:
                    case DEFAULT:
                    case DOUBLE:
                    case FINAL:
                    case FLOAT:
                    case INT:
                    case INTERFACE:
                    case LONG:
                    case NORMALTYPE:
                    case SHORT:
                    case SUPER:
                    case THROWS:
                    case VOID:
                    case VoidType:
                        {
                        alt5=1;
                        }
                        break;

                    }

                }
                else if ( (LA5_0==ABSTRACT||LA5_0==FINAL||LA5_0==INTERFACE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // JVM.g:65:28: class_modifier
            	    {
            	    pushFollow(FOLLOW_class_modifier_in_classDefinition369);
            	    class_modifier23=class_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_class_modifier.add(class_modifier23.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            pushFollow(FOLLOW_javaTypeIdentifier_in_classDefinition372);
            javaTypeIdentifier24=javaTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaTypeIdentifier.add(javaTypeIdentifier24.getTree());

            // JVM.g:65:63: ( superClass )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EXTENDS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // JVM.g:65:63: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_classDefinition374);
                    superClass25=superClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_superClass.add(superClass25.getTree());

                    }
                    break;

            }


            // JVM.g:65:75: ( superInterface )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IMPLEMENTS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // JVM.g:65:75: superInterface
                    {
                    pushFollow(FOLLOW_superInterface_in_classDefinition377);
                    superInterface26=superInterface();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_superInterface.add(superInterface26.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_type_info_in_classDefinition385);
            type_info27=type_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_info.add(type_info27.getTree());

            pushFollow(FOLLOW_constant_pool_in_classDefinition391);
            constant_pool28=constant_pool();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constant_pool.add(constant_pool28.getTree());

            LBRACE29=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDefinition397); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE29);


            // JVM.g:69:5: ( classBody )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ABSTRACT||LA8_0==BOOLEAN||(LA8_0 >= BYTE && LA8_0 <= BaseType)||LA8_0==CHAR||LA8_0==CLASS||LA8_0==Constant_type||LA8_0==DEFAULT||LA8_0==DOUBLE||LA8_0==EXTENDS||(LA8_0 >= FINAL && LA8_0 <= FLOAT)||(LA8_0 >= IDENTIFIER && LA8_0 <= IMPLEMENTS)||LA8_0==INT||(LA8_0 >= LESST && LA8_0 <= LONG)||LA8_0==NATIVE||LA8_0==NORMALTYPE||(LA8_0 >= PRIVATE && LA8_0 <= PUBLIC)||LA8_0==SHORT||LA8_0==STATIC||LA8_0==SUPER||LA8_0==SYNCHRONIZED||LA8_0==THROWS||LA8_0==TRANSIENT||(LA8_0 >= VOID && LA8_0 <= VoidType)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // JVM.g:69:5: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classDefinition404);
                    classBody30=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classBody.add(classBody30.getTree());

                    }
                    break;

            }


            RBRACE31=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDefinition411); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE31);


            // AST REWRITE
            // elements: superClass, javaTypeIdentifier, class_modifier, classBody, type_info, class_visual_modifier, constant_pool, superInterface
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:12: -> ^( CLASSDECL ( ^( VMODIFIER class_visual_modifier ) )? ^( MODIFIER ( class_modifier )* ) javaTypeIdentifier ( superClass )? ( superInterface )? ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ( classBody )? )
            {
                // JVM.g:70:15: ^( CLASSDECL ( ^( VMODIFIER class_visual_modifier ) )? ^( MODIFIER ( class_modifier )* ) javaTypeIdentifier ( superClass )? ( superInterface )? ^( UNITHEADER type_info ) ^( CPOOL constant_pool ) ( classBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASSDECL, "CLASSDECL")
                , root_1);

                // JVM.g:70:27: ( ^( VMODIFIER class_visual_modifier ) )?
                if ( stream_class_visual_modifier.hasNext() ) {
                    // JVM.g:70:27: ^( VMODIFIER class_visual_modifier )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                    , root_2);

                    adaptor.addChild(root_2, stream_class_visual_modifier.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_class_visual_modifier.reset();

                // JVM.g:70:63: ^( MODIFIER ( class_modifier )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_2);

                // JVM.g:70:74: ( class_modifier )*
                while ( stream_class_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_class_modifier.nextTree());

                }
                stream_class_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_javaTypeIdentifier.nextTree());

                // JVM.g:70:110: ( superClass )?
                if ( stream_superClass.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClass.nextTree());

                }
                stream_superClass.reset();

                // JVM.g:70:122: ( superInterface )?
                if ( stream_superInterface.hasNext() ) {
                    adaptor.addChild(root_1, stream_superInterface.nextTree());

                }
                stream_superInterface.reset();

                // JVM.g:71:17: ^( UNITHEADER type_info )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_type_info.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // JVM.g:72:17: ^( CPOOL constant_pool )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CPOOL, "CPOOL")
                , root_2);

                adaptor.addChild(root_2, stream_constant_pool.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // JVM.g:73:17: ( classBody )?
                if ( stream_classBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_classBody.nextTree());

                }
                stream_classBody.reset();

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


    public static class superClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superClass"
    // JVM.g:76:1: superClass : EXTENDS typeList -> ^( EXTENDS typeList ) ;
    public final JVMParser.superClass_return superClass() throws RecognitionException {
        JVMParser.superClass_return retval = new JVMParser.superClass_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS32=null;
        JVMParser.typeList_return typeList33 =null;


        Object EXTENDS32_tree=null;
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            // JVM.g:77:3: ( EXTENDS typeList -> ^( EXTENDS typeList ) )
            // JVM.g:77:5: EXTENDS typeList
            {
            EXTENDS32=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_superClass517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS32);


            pushFollow(FOLLOW_typeList_in_superClass519);
            typeList33=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList33.getTree());

            // AST REWRITE
            // elements: EXTENDS, typeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:22: -> ^( EXTENDS typeList )
            {
                // JVM.g:77:25: ^( EXTENDS typeList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EXTENDS.nextNode()
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
    // $ANTLR end "superClass"


    public static class superInterface_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superInterface"
    // JVM.g:80:1: superInterface : IMPLEMENTS typeList -> ^( IMPLEMENTS typeList ) ;
    public final JVMParser.superInterface_return superInterface() throws RecognitionException {
        JVMParser.superInterface_return retval = new JVMParser.superInterface_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLEMENTS34=null;
        JVMParser.typeList_return typeList35 =null;


        Object IMPLEMENTS34_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            // JVM.g:81:3: ( IMPLEMENTS typeList -> ^( IMPLEMENTS typeList ) )
            // JVM.g:81:5: IMPLEMENTS typeList
            {
            IMPLEMENTS34=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_superInterface542); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS34);


            pushFollow(FOLLOW_typeList_in_superInterface544);
            typeList35=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList35.getTree());

            // AST REWRITE
            // elements: typeList, IMPLEMENTS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:25: -> ^( IMPLEMENTS typeList )
            {
                // JVM.g:81:28: ^( IMPLEMENTS typeList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLEMENTS.nextNode()
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
    // $ANTLR end "superInterface"


    public static class class_visual_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_visual_modifier"
    // JVM.g:84:1: class_visual_modifier : PUBLIC ;
    public final JVMParser.class_visual_modifier_return class_visual_modifier() throws RecognitionException {
        JVMParser.class_visual_modifier_return retval = new JVMParser.class_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PUBLIC36=null;

        Object PUBLIC36_tree=null;

        try {
            // JVM.g:85:3: ( PUBLIC )
            // JVM.g:85:5: PUBLIC
            {
            root_0 = (Object)adaptor.nil();


            PUBLIC36=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier569); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PUBLIC36_tree = 
            (Object)adaptor.create(PUBLIC36)
            ;
            adaptor.addChild(root_0, PUBLIC36_tree);
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
    // JVM.g:88:1: class_modifier : ( ABSTRACT | FINAL | INTERFACE | CLASS );
    public final JVMParser.class_modifier_return class_modifier() throws RecognitionException {
        JVMParser.class_modifier_return retval = new JVMParser.class_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set37=null;

        Object set37_tree=null;

        try {
            // JVM.g:89:3: ( ABSTRACT | FINAL | INTERFACE | CLASS )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set37=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==CLASS||input.LA(1)==FINAL||input.LA(1)==INTERFACE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set37)
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
    // JVM.g:96:1: type_info : ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ ;
    public final JVMParser.type_info_return type_info() throws RecognitionException {
        JVMParser.type_info_return retval = new JVMParser.type_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.sourcefile_info_return sourcefile_info38 =null;

        JVMParser.minor_major_version_info_return minor_major_version_info39 =null;

        JVMParser.flags_return flags40 =null;

        JVMParser.scalaSig_info_return scalaSig_info41 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info42 =null;

        JVMParser.innerclass_info_return innerclass_info43 =null;

        JVMParser.enclosingMethod_return enclosingMethod44 =null;

        JVMParser.signature_info_addition_return signature_info_addition45 =null;

        JVMParser.deprecated_return deprecated46 =null;

        JVMParser.synthetic_return synthetic47 =null;

        JVMParser.scala_info_return scala_info48 =null;



        try {
            // JVM.g:97:3: ( ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+ )
            // JVM.g:97:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:97:5: ( sourcefile_info | minor_major_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic | scala_info )+
            int cnt9=0;
            loop9:
            do {
                int alt9=12;
                switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==IDENTIFIER) ) {
                        int LA9_12 = input.LA(3);

                        if ( (LA9_12==COLON) ) {
                            int LA9_13 = input.LA(4);

                            if ( (LA9_13==INTLITERAL) ) {
                                alt9=2;
                            }


                        }


                    }


                    }
                    break;
                case SourceFile:
                    {
                    alt9=1;
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
            	    // JVM.g:97:6: sourcefile_info
            	    {
            	    pushFollow(FOLLOW_sourcefile_info_in_type_info620);
            	    sourcefile_info38=sourcefile_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sourcefile_info38.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:98:5: minor_major_version_info
            	    {
            	    pushFollow(FOLLOW_minor_major_version_info_in_type_info626);
            	    minor_major_version_info39=minor_major_version_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, minor_major_version_info39.getTree());

            	    }
            	    break;
            	case 3 :
            	    // JVM.g:99:5: flags
            	    {
            	    pushFollow(FOLLOW_flags_in_type_info632);
            	    flags40=flags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, flags40.getTree());

            	    }
            	    break;
            	case 4 :
            	    // JVM.g:100:5: scalaSig_info
            	    {
            	    pushFollow(FOLLOW_scalaSig_info_in_type_info638);
            	    scalaSig_info41=scalaSig_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalaSig_info41.getTree());

            	    }
            	    break;
            	case 5 :
            	    // JVM.g:101:5: runtimeVisibleAnnotations_info
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_type_info645);
            	    runtimeVisibleAnnotations_info42=runtimeVisibleAnnotations_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotations_info42.getTree());

            	    }
            	    break;
            	case 6 :
            	    // JVM.g:102:5: innerclass_info
            	    {
            	    pushFollow(FOLLOW_innerclass_info_in_type_info651);
            	    innerclass_info43=innerclass_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, innerclass_info43.getTree());

            	    }
            	    break;
            	case 7 :
            	    // JVM.g:103:5: enclosingMethod
            	    {
            	    pushFollow(FOLLOW_enclosingMethod_in_type_info657);
            	    enclosingMethod44=enclosingMethod();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enclosingMethod44.getTree());

            	    }
            	    break;
            	case 8 :
            	    // JVM.g:104:5: signature_info_addition
            	    {
            	    pushFollow(FOLLOW_signature_info_addition_in_type_info663);
            	    signature_info_addition45=signature_info_addition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, signature_info_addition45.getTree());

            	    }
            	    break;
            	case 9 :
            	    // JVM.g:105:5: deprecated
            	    {
            	    pushFollow(FOLLOW_deprecated_in_type_info669);
            	    deprecated46=deprecated();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, deprecated46.getTree());

            	    }
            	    break;
            	case 10 :
            	    // JVM.g:106:5: synthetic
            	    {
            	    pushFollow(FOLLOW_synthetic_in_type_info675);
            	    synthetic47=synthetic();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, synthetic47.getTree());

            	    }
            	    break;
            	case 11 :
            	    // JVM.g:107:5: scala_info
            	    {
            	    pushFollow(FOLLOW_scala_info_in_type_info681);
            	    scala_info48=scala_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scala_info48.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // JVM.g:110:1: synthetic : Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) ;
    public final JVMParser.synthetic_return synthetic() throws RecognitionException {
        JVMParser.synthetic_return retval = new JVMParser.synthetic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Synthetic49=null;
        Token BOOLEANLITERAL50=null;

        Object Synthetic49_tree=null;
        Object BOOLEANLITERAL50_tree=null;
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");

        try {
            // JVM.g:111:3: ( Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) )
            // JVM.g:111:5: Synthetic BOOLEANLITERAL
            {
            Synthetic49=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_synthetic696); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic49);


            BOOLEANLITERAL50=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_synthetic698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL50);


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
            // 111:30: -> ^( Synthetic BOOLEANLITERAL )
            {
                // JVM.g:111:33: ^( Synthetic BOOLEANLITERAL )
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
    // JVM.g:114:1: deprecated : Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) ;
    public final JVMParser.deprecated_return deprecated() throws RecognitionException {
        JVMParser.deprecated_return retval = new JVMParser.deprecated_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Deprecated51=null;
        Token BOOLEANLITERAL52=null;

        Object Deprecated51_tree=null;
        Object BOOLEANLITERAL52_tree=null;
        RewriteRuleTokenStream stream_Deprecated=new RewriteRuleTokenStream(adaptor,"token Deprecated");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");

        try {
            // JVM.g:115:3: ( Deprecated BOOLEANLITERAL -> ^( Deprecated BOOLEANLITERAL ) )
            // JVM.g:115:5: Deprecated BOOLEANLITERAL
            {
            Deprecated51=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_deprecated719); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Deprecated.add(Deprecated51);


            BOOLEANLITERAL52=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_deprecated721); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL52);


            // AST REWRITE
            // elements: Deprecated, BOOLEANLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:31: -> ^( Deprecated BOOLEANLITERAL )
            {
                // JVM.g:115:34: ^( Deprecated BOOLEANLITERAL )
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
    // JVM.g:118:1: enclosingMethod : EnclosingMethod CPINDEX DOT ( CPINDEX )? -> ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) ;
    public final JVMParser.enclosingMethod_return enclosingMethod() throws RecognitionException {
        JVMParser.enclosingMethod_return retval = new JVMParser.enclosingMethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EnclosingMethod53=null;
        Token CPINDEX54=null;
        Token DOT55=null;
        Token CPINDEX56=null;

        Object EnclosingMethod53_tree=null;
        Object CPINDEX54_tree=null;
        Object DOT55_tree=null;
        Object CPINDEX56_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_EnclosingMethod=new RewriteRuleTokenStream(adaptor,"token EnclosingMethod");

        try {
            // JVM.g:119:3: ( EnclosingMethod CPINDEX DOT ( CPINDEX )? -> ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? ) )
            // JVM.g:119:5: EnclosingMethod CPINDEX DOT ( CPINDEX )?
            {
            EnclosingMethod53=(Token)match(input,EnclosingMethod,FOLLOW_EnclosingMethod_in_enclosingMethod742); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EnclosingMethod.add(EnclosingMethod53);


            CPINDEX54=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod744); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX54);


            DOT55=(Token)match(input,DOT,FOLLOW_DOT_in_enclosingMethod746); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT55);


            // JVM.g:119:33: ( CPINDEX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CPINDEX) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // JVM.g:119:33: CPINDEX
                    {
                    CPINDEX56=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX56);


                    }
                    break;

            }


            // AST REWRITE
            // elements: EnclosingMethod, CPINDEX, DOT, CPINDEX
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 119:43: -> ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
            {
                // JVM.g:119:46: ^( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
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

                // JVM.g:119:76: ( CPINDEX )?
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
    // JVM.g:122:1: sourcefile_info : SourceFile STRINGLITERAL -> ^( SourceFile STRINGLITERAL ) ;
    public final JVMParser.sourcefile_info_return sourcefile_info() throws RecognitionException {
        JVMParser.sourcefile_info_return retval = new JVMParser.sourcefile_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SourceFile57=null;
        Token STRINGLITERAL58=null;

        Object SourceFile57_tree=null;
        Object STRINGLITERAL58_tree=null;
        RewriteRuleTokenStream stream_SourceFile=new RewriteRuleTokenStream(adaptor,"token SourceFile");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");

        try {
            // JVM.g:123:3: ( SourceFile STRINGLITERAL -> ^( SourceFile STRINGLITERAL ) )
            // JVM.g:123:5: SourceFile STRINGLITERAL
            {
            SourceFile57=(Token)match(input,SourceFile,FOLLOW_SourceFile_in_sourcefile_info777); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SourceFile.add(SourceFile57);


            STRINGLITERAL58=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_sourcefile_info779); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL58);


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
            // 123:31: -> ^( SourceFile STRINGLITERAL )
            {
                // JVM.g:123:34: ^( SourceFile STRINGLITERAL )
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
    // JVM.g:126:1: scalaSig_info : ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL -> ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) ;
    public final JVMParser.scalaSig_info_return scalaSig_info() throws RecognitionException {
        JVMParser.scalaSig_info_return retval = new JVMParser.scalaSig_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ScalaSig59=null;
        Token IDENTIFIER60=null;
        Token ASSIGN61=null;
        Token INTLITERAL62=null;
        Token INTLITERAL63=null;
        Token INTLITERAL64=null;
        Token INTLITERAL65=null;

        Object ScalaSig59_tree=null;
        Object IDENTIFIER60_tree=null;
        Object ASSIGN61_tree=null;
        Object INTLITERAL62_tree=null;
        Object INTLITERAL63_tree=null;
        Object INTLITERAL64_tree=null;
        Object INTLITERAL65_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ScalaSig=new RewriteRuleTokenStream(adaptor,"token ScalaSig");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // JVM.g:127:3: ( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL -> ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL ) )
            // JVM.g:127:5: ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL
            {
            ScalaSig59=(Token)match(input,ScalaSig,FOLLOW_ScalaSig_in_scalaSig_info801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ScalaSig.add(ScalaSig59);


            IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scalaSig_info807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER60);


            ASSIGN61=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_scalaSig_info809); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN61);


            INTLITERAL62=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL62);


            INTLITERAL63=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL63);


            INTLITERAL64=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL64);


            INTLITERAL65=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info823); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL65);


            // AST REWRITE
            // elements: INTLITERAL, INTLITERAL, IDENTIFIER, INTLITERAL, INTLITERAL, ASSIGN, ScalaSig
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:9: -> ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
            {
                // JVM.g:130:12: ^( ScalaSig IDENTIFIER ASSIGN INTLITERAL INTLITERAL INTLITERAL INTLITERAL )
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
    // JVM.g:135:1: scala_info : Scala IDENTIFIER ASSIGN INTLITERAL -> ^( Scala IDENTIFIER ASSIGN INTLITERAL ) ;
    public final JVMParser.scala_info_return scala_info() throws RecognitionException {
        JVMParser.scala_info_return retval = new JVMParser.scala_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Scala66=null;
        Token IDENTIFIER67=null;
        Token ASSIGN68=null;
        Token INTLITERAL69=null;

        Object Scala66_tree=null;
        Object IDENTIFIER67_tree=null;
        Object ASSIGN68_tree=null;
        Object INTLITERAL69_tree=null;
        RewriteRuleTokenStream stream_Scala=new RewriteRuleTokenStream(adaptor,"token Scala");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // JVM.g:136:3: ( Scala IDENTIFIER ASSIGN INTLITERAL -> ^( Scala IDENTIFIER ASSIGN INTLITERAL ) )
            // JVM.g:136:5: Scala IDENTIFIER ASSIGN INTLITERAL
            {
            Scala66=(Token)match(input,Scala,FOLLOW_Scala_in_scala_info881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Scala.add(Scala66);


            IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scala_info887); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER67);


            ASSIGN68=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_scala_info889); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN68);


            INTLITERAL69=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scala_info891); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL69);


            // AST REWRITE
            // elements: ASSIGN, Scala, IDENTIFIER, INTLITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 138:9: -> ^( Scala IDENTIFIER ASSIGN INTLITERAL )
            {
                // JVM.g:138:12: ^( Scala IDENTIFIER ASSIGN INTLITERAL )
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
    // JVM.g:141:1: signature_info_addition : Signature ( CPINDEX )? -> ^( Signature ( CPINDEX )? ) ;
    public final JVMParser.signature_info_addition_return signature_info_addition() throws RecognitionException {
        JVMParser.signature_info_addition_return retval = new JVMParser.signature_info_addition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature70=null;
        Token CPINDEX71=null;

        Object Signature70_tree=null;
        Object CPINDEX71_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");

        try {
            // JVM.g:142:3: ( Signature ( CPINDEX )? -> ^( Signature ( CPINDEX )? ) )
            // JVM.g:142:5: Signature ( CPINDEX )?
            {
            Signature70=(Token)match(input,Signature,FOLLOW_Signature_in_signature_info_addition927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Signature.add(Signature70);


            // JVM.g:142:15: ( CPINDEX )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CPINDEX) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // JVM.g:142:15: CPINDEX
                    {
                    CPINDEX71=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_signature_info_addition929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX71);


                    }
                    break;

            }


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
            // 142:25: -> ^( Signature ( CPINDEX )? )
            {
                // JVM.g:142:28: ^( Signature ( CPINDEX )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Signature.nextNode()
                , root_1);

                // JVM.g:142:40: ( CPINDEX )?
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
    // JVM.g:145:1: innerclass_info : InnerClasses ( innerclass_info_line )+ -> ^( InnerClasses ( innerclass_info_line )+ ) ;
    public final JVMParser.innerclass_info_return innerclass_info() throws RecognitionException {
        JVMParser.innerclass_info_return retval = new JVMParser.innerclass_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token InnerClasses72=null;
        JVMParser.innerclass_info_line_return innerclass_info_line73 =null;


        Object InnerClasses72_tree=null;
        RewriteRuleTokenStream stream_InnerClasses=new RewriteRuleTokenStream(adaptor,"token InnerClasses");
        RewriteRuleSubtreeStream stream_innerclass_info_line=new RewriteRuleSubtreeStream(adaptor,"rule innerclass_info_line");
        try {
            // JVM.g:146:3: ( InnerClasses ( innerclass_info_line )+ -> ^( InnerClasses ( innerclass_info_line )+ ) )
            // JVM.g:146:5: InnerClasses ( innerclass_info_line )+
            {
            InnerClasses72=(Token)match(input,InnerClasses,FOLLOW_InnerClasses_in_innerclass_info953); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_InnerClasses.add(InnerClasses72);


            // JVM.g:146:18: ( innerclass_info_line )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ABSTRACT||LA12_0==CPINDEX||LA12_0==FINAL||LA12_0==NATIVE||(LA12_0 >= PRIVATE && LA12_0 <= PUBLIC)||LA12_0==STATIC||LA12_0==SYNCHRONIZED) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // JVM.g:146:18: innerclass_info_line
            	    {
            	    pushFollow(FOLLOW_innerclass_info_line_in_innerclass_info955);
            	    innerclass_info_line73=innerclass_info_line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_innerclass_info_line.add(innerclass_info_line73.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // 146:40: -> ^( InnerClasses ( innerclass_info_line )+ )
            {
                // JVM.g:146:43: ^( InnerClasses ( innerclass_info_line )+ )
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
    // JVM.g:149:1: innerclass_info_line : ( method_visual_modifier )? ( method_modifier )* innerclass_info_data ( SEMI )? -> ( ^( VMODIFIER method_visual_modifier ) )? ^( MODIFIER ( method_modifier )* ^( ICDATA CPINDEX ( innerclass_info_data )? ) ) ;
    public final JVMParser.innerclass_info_line_return innerclass_info_line() throws RecognitionException {
        JVMParser.innerclass_info_line_return retval = new JVMParser.innerclass_info_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI77=null;
        JVMParser.method_visual_modifier_return method_visual_modifier74 =null;

        JVMParser.method_modifier_return method_modifier75 =null;

        JVMParser.innerclass_info_data_return innerclass_info_data76 =null;


        Object SEMI77_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_innerclass_info_data=new RewriteRuleSubtreeStream(adaptor,"rule innerclass_info_data");
        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        RewriteRuleSubtreeStream stream_method_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_visual_modifier");
        try {
            // JVM.g:150:3: ( ( method_visual_modifier )? ( method_modifier )* innerclass_info_data ( SEMI )? -> ( ^( VMODIFIER method_visual_modifier ) )? ^( MODIFIER ( method_modifier )* ^( ICDATA CPINDEX ( innerclass_info_data )? ) ) )
            // JVM.g:150:6: ( method_visual_modifier )? ( method_modifier )* innerclass_info_data ( SEMI )?
            {
            // JVM.g:150:6: ( method_visual_modifier )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= PRIVATE && LA13_0 <= PUBLIC)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // JVM.g:150:6: method_visual_modifier
                    {
                    pushFollow(FOLLOW_method_visual_modifier_in_innerclass_info_line981);
                    method_visual_modifier74=method_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_method_visual_modifier.add(method_visual_modifier74.getTree());

                    }
                    break;

            }


            // JVM.g:150:30: ( method_modifier )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ABSTRACT||LA14_0==FINAL||LA14_0==NATIVE||LA14_0==STATIC||LA14_0==SYNCHRONIZED) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // JVM.g:150:30: method_modifier
            	    {
            	    pushFollow(FOLLOW_method_modifier_in_innerclass_info_line984);
            	    method_modifier75=method_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_method_modifier.add(method_modifier75.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            pushFollow(FOLLOW_innerclass_info_data_in_innerclass_info_line987);
            innerclass_info_data76=innerclass_info_data();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_innerclass_info_data.add(innerclass_info_data76.getTree());

            // JVM.g:150:68: ( SEMI )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SEMI) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // JVM.g:150:68: SEMI
                    {
                    SEMI77=(Token)match(input,SEMI,FOLLOW_SEMI_in_innerclass_info_line989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI77);


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
            // 151:7: -> ( ^( VMODIFIER method_visual_modifier ) )? ^( MODIFIER ( method_modifier )* ^( ICDATA CPINDEX ( innerclass_info_data )? ) )
            {
                // JVM.g:151:10: ( ^( VMODIFIER method_visual_modifier ) )?
                if ( stream_method_visual_modifier.hasNext() ) {
                    // JVM.g:151:10: ^( VMODIFIER method_visual_modifier )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                    , root_1);

                    adaptor.addChild(root_1, stream_method_visual_modifier.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_method_visual_modifier.reset();

                // JVM.g:151:47: ^( MODIFIER ( method_modifier )* ^( ICDATA CPINDEX ( innerclass_info_data )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_1);

                // JVM.g:151:58: ( method_modifier )*
                while ( stream_method_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_modifier.nextTree());

                }
                stream_method_modifier.reset();

                // JVM.g:151:75: ^( ICDATA CPINDEX ( innerclass_info_data )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ICDATA, "ICDATA")
                , root_2);

                adaptor.addChild(root_2, 
                (Object)adaptor.create(CPINDEX, "CPINDEX")
                );

                // JVM.g:151:92: ( innerclass_info_data )?
                if ( stream_innerclass_info_data.hasNext() ) {
                    adaptor.addChild(root_2, stream_innerclass_info_data.nextTree());

                }
                stream_innerclass_info_data.reset();

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
    // $ANTLR end "innerclass_info_line"


    public static class innerclass_info_data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "innerclass_info_data"
    // JVM.g:154:1: innerclass_info_data : CPINDEX ( ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) -> ^( CPINDEX ^( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) ) | IDENTIFIER CPINDEX -> ^( CPINDEX IDENTIFIER CPINDEX ) | -> ^( CPINDEX ) ) ;
    public final JVMParser.innerclass_info_data_return innerclass_info_data() throws RecognitionException {
        JVMParser.innerclass_info_data_return retval = new JVMParser.innerclass_info_data_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX78=null;
        Token ASSIGN79=null;
        Token CPINDEX80=null;
        Token IDENTIFIER81=null;
        Token CPINDEX82=null;
        Token IDENTIFIER83=null;
        Token CPINDEX84=null;

        Object CPINDEX78_tree=null;
        Object ASSIGN79_tree=null;
        Object CPINDEX80_tree=null;
        Object IDENTIFIER81_tree=null;
        Object CPINDEX82_tree=null;
        Object IDENTIFIER83_tree=null;
        Object CPINDEX84_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // JVM.g:155:3: ( CPINDEX ( ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) -> ^( CPINDEX ^( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) ) | IDENTIFIER CPINDEX -> ^( CPINDEX IDENTIFIER CPINDEX ) | -> ^( CPINDEX ) ) )
            // JVM.g:155:5: CPINDEX ( ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) -> ^( CPINDEX ^( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) ) | IDENTIFIER CPINDEX -> ^( CPINDEX IDENTIFIER CPINDEX ) | -> ^( CPINDEX ) )
            {
            CPINDEX78=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1034); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX78);


            // JVM.g:155:13: ( ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) -> ^( CPINDEX ^( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) ) | IDENTIFIER CPINDEX -> ^( CPINDEX IDENTIFIER CPINDEX ) | -> ^( CPINDEX ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt17=1;
                }
                break;
            case IDENTIFIER:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==CPINDEX) ) {
                    alt17=2;
                }
                else if ( (LA17_2==IDENTIFIER) ) {
                    alt17=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }
                }
                break;
            case ABSTRACT:
            case CPINDEX:
            case Deprecated:
            case EnclosingMethod:
            case FINAL:
            case Flag:
            case InnerClasses:
            case NATIVE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case RuntimeVisibleAnnotations:
            case SEMI:
            case STATIC:
            case SYNCHRONIZED:
            case Scala:
            case ScalaSig:
            case Signature:
            case SourceFile:
            case Synthetic:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // JVM.g:156:5: ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? )
                    {
                    // JVM.g:156:5: ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? )
                    // JVM.g:156:7: ASSIGN CPINDEX ( IDENTIFIER CPINDEX )?
                    {
                    ASSIGN79=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_innerclass_info_data1044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN79);


                    CPINDEX80=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1046); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX80);


                    // JVM.g:156:22: ( IDENTIFIER CPINDEX )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==IDENTIFIER) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==CPINDEX) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // JVM.g:156:23: IDENTIFIER CPINDEX
                            {
                            IDENTIFIER81=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_data1049); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER81);


                            CPINDEX82=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1051); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX82);


                            }
                            break;

                    }


                    }


                    // AST REWRITE
                    // elements: CPINDEX, CPINDEX, IDENTIFIER, ASSIGN, CPINDEX
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:45: -> ^( CPINDEX ^( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) )
                    {
                        // JVM.g:156:48: ^( CPINDEX ^( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CPINDEX.nextNode()
                        , root_1);

                        // JVM.g:156:58: ^( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_ASSIGN.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_CPINDEX.nextNode()
                        );

                        // JVM.g:156:75: ( IDENTIFIER CPINDEX )?
                        if ( stream_CPINDEX.hasNext()||stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_IDENTIFIER.nextNode()
                            );

                            adaptor.addChild(root_2, 
                            stream_CPINDEX.nextNode()
                            );

                        }
                        stream_CPINDEX.reset();
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:157:7: IDENTIFIER CPINDEX
                    {
                    IDENTIFIER83=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_data1081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER83);


                    CPINDEX84=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1083); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX84);


                    // AST REWRITE
                    // elements: CPINDEX, IDENTIFIER, CPINDEX
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:45: -> ^( CPINDEX IDENTIFIER CPINDEX )
                    {
                        // JVM.g:157:48: ^( CPINDEX IDENTIFIER CPINDEX )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CPINDEX.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

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
                    // JVM.g:158:45: 
                    {
                    // AST REWRITE
                    // elements: CPINDEX
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:45: -> ^( CPINDEX )
                    {
                        // JVM.g:158:48: ^( CPINDEX )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CPINDEX.nextNode()
                        , root_1);

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
    // $ANTLR end "innerclass_info_data"


    public static class minor_major_version_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minor_major_version_info"
    // JVM.g:162:1: minor_major_version_info : IDENTIFIER IDENTIFIER COLON INTLITERAL -> ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) ;
    public final JVMParser.minor_major_version_info_return minor_major_version_info() throws RecognitionException {
        JVMParser.minor_major_version_info_return retval = new JVMParser.minor_major_version_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER85=null;
        Token IDENTIFIER86=null;
        Token COLON87=null;
        Token INTLITERAL88=null;

        Object IDENTIFIER85_tree=null;
        Object IDENTIFIER86_tree=null;
        Object COLON87_tree=null;
        Object INTLITERAL88_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // JVM.g:163:3: ( IDENTIFIER IDENTIFIER COLON INTLITERAL -> ^( IDENTIFIER IDENTIFIER COLON INTLITERAL ) )
            // JVM.g:163:5: IDENTIFIER IDENTIFIER COLON INTLITERAL
            {
            IDENTIFIER85=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info1186); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER85);


            IDENTIFIER86=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info1188); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER86);


            COLON87=(Token)match(input,COLON,FOLLOW_COLON_in_minor_major_version_info1190); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON87);


            INTLITERAL88=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_minor_major_version_info1192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL88);


            // AST REWRITE
            // elements: COLON, IDENTIFIER, INTLITERAL, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:45: -> ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
            {
                // JVM.g:163:48: ^( IDENTIFIER IDENTIFIER COLON INTLITERAL )
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
    // JVM.g:166:1: flags : Flag ( accessFlagList )? Marker -> ^( Flag ( accessFlagList )? ) ;
    public final JVMParser.flags_return flags() throws RecognitionException {
        JVMParser.flags_return retval = new JVMParser.flags_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Flag89=null;
        Token Marker91=null;
        JVMParser.accessFlagList_return accessFlagList90 =null;


        Object Flag89_tree=null;
        Object Marker91_tree=null;
        RewriteRuleTokenStream stream_Flag=new RewriteRuleTokenStream(adaptor,"token Flag");
        RewriteRuleTokenStream stream_Marker=new RewriteRuleTokenStream(adaptor,"token Marker");
        RewriteRuleSubtreeStream stream_accessFlagList=new RewriteRuleSubtreeStream(adaptor,"rule accessFlagList");
        try {
            // JVM.g:167:3: ( Flag ( accessFlagList )? Marker -> ^( Flag ( accessFlagList )? ) )
            // JVM.g:167:5: Flag ( accessFlagList )? Marker
            {
            Flag89=(Token)match(input,Flag,FOLLOW_Flag_in_flags1224); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Flag.add(Flag89);


            // JVM.g:167:10: ( accessFlagList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER||LA18_0==INTLITERAL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // JVM.g:167:10: accessFlagList
                    {
                    pushFollow(FOLLOW_accessFlagList_in_flags1226);
                    accessFlagList90=accessFlagList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_accessFlagList.add(accessFlagList90.getTree());

                    }
                    break;

            }


            Marker91=(Token)match(input,Marker,FOLLOW_Marker_in_flags1229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Marker.add(Marker91);


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
            // 167:33: -> ^( Flag ( accessFlagList )? )
            {
                // JVM.g:167:36: ^( Flag ( accessFlagList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Flag.nextNode()
                , root_1);

                // JVM.g:167:43: ( accessFlagList )?
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
    // JVM.g:170:1: accessFlagList : flagType ( COMMA flagType )* -> ( flagType )+ ;
    public final JVMParser.accessFlagList_return accessFlagList() throws RecognitionException {
        JVMParser.accessFlagList_return retval = new JVMParser.accessFlagList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA93=null;
        JVMParser.flagType_return flagType92 =null;

        JVMParser.flagType_return flagType94 =null;


        Object COMMA93_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_flagType=new RewriteRuleSubtreeStream(adaptor,"rule flagType");
        try {
            // JVM.g:171:3: ( flagType ( COMMA flagType )* -> ( flagType )+ )
            // JVM.g:171:5: flagType ( COMMA flagType )*
            {
            pushFollow(FOLLOW_flagType_in_accessFlagList1253);
            flagType92=flagType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flagType.add(flagType92.getTree());

            // JVM.g:171:14: ( COMMA flagType )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // JVM.g:171:15: COMMA flagType
            	    {
            	    COMMA93=(Token)match(input,COMMA,FOLLOW_COMMA_in_accessFlagList1256); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA93);


            	    pushFollow(FOLLOW_flagType_in_accessFlagList1258);
            	    flagType94=flagType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_flagType.add(flagType94.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // 171:32: -> ( flagType )+
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
    // JVM.g:174:1: flagType : ( IDENTIFIER | INTLITERAL );
    public final JVMParser.flagType_return flagType() throws RecognitionException {
        JVMParser.flagType_return retval = new JVMParser.flagType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set95=null;

        Object set95_tree=null;

        try {
            // JVM.g:175:3: ( IDENTIFIER | INTLITERAL )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set95=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTLITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set95)
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
    // JVM.g:182:1: runtimeVisibleAnnotations_info : RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ -> ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) ;
    public final JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotations_info_return retval = new JVMParser.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeVisibleAnnotations96=null;
        JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem97 =null;


        Object RuntimeVisibleAnnotations96_tree=null;
        RewriteRuleTokenStream stream_RuntimeVisibleAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeVisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationsItem=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationsItem");
        try {
            // JVM.g:183:3: ( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ -> ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) )
            // JVM.g:183:5: RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+
            {
            RuntimeVisibleAnnotations96=(Token)match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info1301); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeVisibleAnnotations.add(RuntimeVisibleAnnotations96);


            // JVM.g:184:5: ( runtimeVisibleAnnotationsItem )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==INTLITERAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // JVM.g:184:5: runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1308);
            	    runtimeVisibleAnnotationsItem97=runtimeVisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationsItem.add(runtimeVisibleAnnotationsItem97.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // 184:36: -> ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
            {
                // JVM.g:184:39: ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
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
    // JVM.g:186:1: runtimeVisibleAnnotationsItem : pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> pc CPINDEX ( runtimeVisibleAnnotationAssignList )? ;
    public final JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotationsItem_return retval = new JVMParser.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX99=null;
        Token LPAREN100=null;
        Token RPAREN102=null;
        JVMParser.pc_return pc98 =null;

        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList101 =null;


        Object CPINDEX99_tree=null;
        Object LPAREN100_tree=null;
        Object RPAREN102_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationAssignList");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // JVM.g:187:3: ( pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> pc CPINDEX ( runtimeVisibleAnnotationAssignList )? )
            // JVM.g:187:5: pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN
            {
            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem1330);
            pc98=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc98.getTree());

            CPINDEX99=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1332); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX99);


            LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_runtimeVisibleAnnotationsItem1334); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN100);


            // JVM.g:187:23: ( runtimeVisibleAnnotationAssignList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CPINDEX) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // JVM.g:187:23: runtimeVisibleAnnotationAssignList
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1336);
                    runtimeVisibleAnnotationAssignList101=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationAssignList.add(runtimeVisibleAnnotationAssignList101.getTree());

                    }
                    break;

            }


            RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_runtimeVisibleAnnotationsItem1339); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN102);


            // AST REWRITE
            // elements: CPINDEX, runtimeVisibleAnnotationAssignList, pc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:66: -> pc CPINDEX ( runtimeVisibleAnnotationAssignList )?
            {
                adaptor.addChild(root_0, stream_pc.nextTree());

                adaptor.addChild(root_0, 
                stream_CPINDEX.nextNode()
                );

                // JVM.g:187:80: ( runtimeVisibleAnnotationAssignList )?
                if ( stream_runtimeVisibleAnnotationAssignList.hasNext() ) {
                    adaptor.addChild(root_0, stream_runtimeVisibleAnnotationAssignList.nextTree());

                }
                stream_runtimeVisibleAnnotationAssignList.reset();

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
    // JVM.g:189:1: runtimeVisibleAnnotationAssignList : annotationAssign ( COMMA annotationAssign )* -> ( annotationAssign )+ ;
    public final JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotationAssignList_return retval = new JVMParser.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA104=null;
        JVMParser.annotationAssign_return annotationAssign103 =null;

        JVMParser.annotationAssign_return annotationAssign105 =null;


        Object COMMA104_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_annotationAssign=new RewriteRuleSubtreeStream(adaptor,"rule annotationAssign");
        try {
            // JVM.g:190:3: ( annotationAssign ( COMMA annotationAssign )* -> ( annotationAssign )+ )
            // JVM.g:190:5: annotationAssign ( COMMA annotationAssign )*
            {
            pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1360);
            annotationAssign103=annotationAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_annotationAssign.add(annotationAssign103.getTree());

            // JVM.g:190:22: ( COMMA annotationAssign )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // JVM.g:190:23: COMMA annotationAssign
            	    {
            	    COMMA104=(Token)match(input,COMMA,FOLLOW_COMMA_in_runtimeVisibleAnnotationAssignList1363); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA104);


            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1365);
            	    annotationAssign105=annotationAssign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotationAssign.add(annotationAssign105.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // 190:48: -> ( annotationAssign )+
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
    // JVM.g:192:1: annotationAssign : CPINDEX ASSIGN (v1= brackedAnnotationAssign -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v1.getTree().toString()] ) |v2= AnnotationAssign -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v2.getText()] ) ) ;
    public final JVMParser.annotationAssign_return annotationAssign() throws RecognitionException {
        JVMParser.annotationAssign_return retval = new JVMParser.annotationAssign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token v2=null;
        Token CPINDEX106=null;
        Token ASSIGN107=null;
        JVMParser.brackedAnnotationAssign_return v1 =null;


        Object v2_tree=null;
        Object CPINDEX106_tree=null;
        Object ASSIGN107_tree=null;
        RewriteRuleTokenStream stream_AnnotationAssign=new RewriteRuleTokenStream(adaptor,"token AnnotationAssign");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_brackedAnnotationAssign=new RewriteRuleSubtreeStream(adaptor,"rule brackedAnnotationAssign");
        try {
            // JVM.g:193:3: ( CPINDEX ASSIGN (v1= brackedAnnotationAssign -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v1.getTree().toString()] ) |v2= AnnotationAssign -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v2.getText()] ) ) )
            // JVM.g:193:5: CPINDEX ASSIGN (v1= brackedAnnotationAssign -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v1.getTree().toString()] ) |v2= AnnotationAssign -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v2.getText()] ) )
            {
            CPINDEX106=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign1384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX106);


            ASSIGN107=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign1386); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN107);


            // JVM.g:194:3: (v1= brackedAnnotationAssign -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v1.getTree().toString()] ) |v2= AnnotationAssign -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v2.getText()] ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LBRACK) ) {
                alt23=1;
            }
            else if ( (LA23_0==AnnotationAssign) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // JVM.g:194:5: v1= brackedAnnotationAssign
                    {
                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationAssign1395);
                    v1=brackedAnnotationAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_brackedAnnotationAssign.add(v1.getTree());

                    // AST REWRITE
                    // elements: CPINDEX, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:32: -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v1.getTree().toString()] )
                    {
                        // JVM.g:194:35: ^( ASSIGN CPINDEX ANNOTATIONVALUE[v1.getTree().toString()] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ASSIGN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CPINDEX.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(ANNOTATIONVALUE, v1.getTree().toString())
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:195:5: v2= AnnotationAssign
                    {
                    v2=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationAssign1415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AnnotationAssign.add(v2);


                    // AST REWRITE
                    // elements: CPINDEX, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:25: -> ^( ASSIGN CPINDEX ANNOTATIONVALUE[v2.getText()] )
                    {
                        // JVM.g:195:28: ^( ASSIGN CPINDEX ANNOTATIONVALUE[v2.getText()] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ASSIGN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CPINDEX.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(ANNOTATIONVALUE, v2.getText())
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
    // $ANTLR end "annotationAssign"


    public static class brackedAnnotationAssign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackedAnnotationAssign"
    // JVM.g:198:1: brackedAnnotationAssign : LBRACK ( brackedAnnotationAssignList )? RBRACK ;
    public final JVMParser.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        JVMParser.brackedAnnotationAssign_return retval = new JVMParser.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK108=null;
        Token RBRACK110=null;
        JVMParser.brackedAnnotationAssignList_return brackedAnnotationAssignList109 =null;


        Object LBRACK108_tree=null;
        Object RBRACK110_tree=null;

        try {
            // JVM.g:199:3: ( LBRACK ( brackedAnnotationAssignList )? RBRACK )
            // JVM.g:199:5: LBRACK ( brackedAnnotationAssignList )? RBRACK
            {
            root_0 = (Object)adaptor.nil();


            LBRACK108=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_brackedAnnotationAssign1442); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK108_tree = 
            (Object)adaptor.create(LBRACK108)
            ;
            adaptor.addChild(root_0, LBRACK108_tree);
            }

            // JVM.g:199:12: ( brackedAnnotationAssignList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==AnnotationAssign) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // JVM.g:199:12: brackedAnnotationAssignList
                    {
                    pushFollow(FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign1444);
                    brackedAnnotationAssignList109=brackedAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, brackedAnnotationAssignList109.getTree());

                    }
                    break;

            }


            RBRACK110=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_brackedAnnotationAssign1447); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACK110_tree = 
            (Object)adaptor.create(RBRACK110)
            ;
            adaptor.addChild(root_0, RBRACK110_tree);
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
    // JVM.g:201:1: brackedAnnotationAssignList : brackedAnnotationAssignValue ( COMMA brackedAnnotationAssignValue )* -> ( brackedAnnotationAssignValue )+ ;
    public final JVMParser.brackedAnnotationAssignList_return brackedAnnotationAssignList() throws RecognitionException {
        JVMParser.brackedAnnotationAssignList_return retval = new JVMParser.brackedAnnotationAssignList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA112=null;
        JVMParser.brackedAnnotationAssignValue_return brackedAnnotationAssignValue111 =null;

        JVMParser.brackedAnnotationAssignValue_return brackedAnnotationAssignValue113 =null;


        Object COMMA112_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_brackedAnnotationAssignValue=new RewriteRuleSubtreeStream(adaptor,"rule brackedAnnotationAssignValue");
        try {
            // JVM.g:202:3: ( brackedAnnotationAssignValue ( COMMA brackedAnnotationAssignValue )* -> ( brackedAnnotationAssignValue )+ )
            // JVM.g:202:5: brackedAnnotationAssignValue ( COMMA brackedAnnotationAssignValue )*
            {
            pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1459);
            brackedAnnotationAssignValue111=brackedAnnotationAssignValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_brackedAnnotationAssignValue.add(brackedAnnotationAssignValue111.getTree());

            // JVM.g:202:34: ( COMMA brackedAnnotationAssignValue )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // JVM.g:202:35: COMMA brackedAnnotationAssignValue
            	    {
            	    COMMA112=(Token)match(input,COMMA,FOLLOW_COMMA_in_brackedAnnotationAssignList1462); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA112);


            	    pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1464);
            	    brackedAnnotationAssignValue113=brackedAnnotationAssignValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_brackedAnnotationAssignValue.add(brackedAnnotationAssignValue113.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
            // 202:72: -> ( brackedAnnotationAssignValue )+
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
    // JVM.g:204:1: brackedAnnotationAssignValue : AnnotationAssign ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )? ;
    public final JVMParser.brackedAnnotationAssignValue_return brackedAnnotationAssignValue() throws RecognitionException {
        JVMParser.brackedAnnotationAssignValue_return retval = new JVMParser.brackedAnnotationAssignValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AnnotationAssign114=null;
        Token LPAREN115=null;
        Token RPAREN117=null;
        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList116 =null;


        Object AnnotationAssign114_tree=null;
        Object LPAREN115_tree=null;
        Object RPAREN117_tree=null;

        try {
            // JVM.g:205:3: ( AnnotationAssign ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )? )
            // JVM.g:205:5: AnnotationAssign ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )?
            {
            root_0 = (Object)adaptor.nil();


            AnnotationAssign114=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue1483); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AnnotationAssign114_tree = 
            (Object)adaptor.create(AnnotationAssign114)
            ;
            adaptor.addChild(root_0, AnnotationAssign114_tree);
            }

            // JVM.g:205:22: ( LPAREN runtimeVisibleAnnotationAssignList RPAREN )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LPAREN) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // JVM.g:205:23: LPAREN runtimeVisibleAnnotationAssignList RPAREN
                    {
                    LPAREN115=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_brackedAnnotationAssignValue1486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN115_tree = 
                    (Object)adaptor.create(LPAREN115)
                    ;
                    adaptor.addChild(root_0, LPAREN115_tree);
                    }

                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue1488);
                    runtimeVisibleAnnotationAssignList116=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotationAssignList116.getTree());

                    RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_brackedAnnotationAssignValue1490); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN117_tree = 
                    (Object)adaptor.create(RPAREN117)
                    ;
                    adaptor.addChild(root_0, RPAREN117_tree);
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
    // $ANTLR end "brackedAnnotationAssignValue"


    public static class runtimeVisibleParameterAnnotations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleParameterAnnotations"
    // JVM.g:207:1: runtimeVisibleParameterAnnotations : RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMParser.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations() throws RecognitionException {
        JVMParser.runtimeVisibleParameterAnnotations_return retval = new JVMParser.runtimeVisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeVisibleParameterAnnotations118=null;
        JVMParser.parameterVisibilityInfo_return parameterVisibilityInfo119 =null;


        Object RuntimeVisibleParameterAnnotations118_tree=null;
        RewriteRuleTokenStream stream_RuntimeVisibleParameterAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeVisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_parameterVisibilityInfo=new RewriteRuleSubtreeStream(adaptor,"rule parameterVisibilityInfo");
        try {
            // JVM.g:208:3: ( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // JVM.g:208:5: RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+
            {
            RuntimeVisibleParameterAnnotations118=(Token)match(input,RuntimeVisibleParameterAnnotations,FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations1504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeVisibleParameterAnnotations.add(RuntimeVisibleParameterAnnotations118);


            // JVM.g:209:5: ( parameterVisibilityInfo )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENTIFIER) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==INTLITERAL) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==INTLITERAL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JVM.g:209:5: parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations1511);
            	    parameterVisibilityInfo119=parameterVisibilityInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameterVisibilityInfo.add(parameterVisibilityInfo119.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
            // 209:30: -> ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
                // JVM.g:209:33: ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
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
    // JVM.g:211:1: runtimeInvisibleParameterAnnotations : RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMParser.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations() throws RecognitionException {
        JVMParser.runtimeInvisibleParameterAnnotations_return retval = new JVMParser.runtimeInvisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeInvisibleParameterAnnotations120=null;
        JVMParser.parameterVisibilityInfo_return parameterVisibilityInfo121 =null;


        Object RuntimeInvisibleParameterAnnotations120_tree=null;
        RewriteRuleTokenStream stream_RuntimeInvisibleParameterAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeInvisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_parameterVisibilityInfo=new RewriteRuleSubtreeStream(adaptor,"rule parameterVisibilityInfo");
        try {
            // JVM.g:212:3: ( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ -> ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // JVM.g:212:5: RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+
            {
            RuntimeInvisibleParameterAnnotations120=(Token)match(input,RuntimeInvisibleParameterAnnotations,FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1533); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeInvisibleParameterAnnotations.add(RuntimeInvisibleParameterAnnotations120);


            // JVM.g:213:5: ( parameterVisibilityInfo )+
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
            	    // JVM.g:213:5: parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1540);
            	    parameterVisibilityInfo121=parameterVisibilityInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameterVisibilityInfo.add(parameterVisibilityInfo121.getTree());

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
            // elements: RuntimeInvisibleParameterAnnotations, parameterVisibilityInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:30: -> ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
                // JVM.g:213:33: ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
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
    // JVM.g:215:1: runtimeInvisibleAnnotations : RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ -> ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) ;
    public final JVMParser.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations() throws RecognitionException {
        JVMParser.runtimeInvisibleAnnotations_return retval = new JVMParser.runtimeInvisibleAnnotations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeInvisibleAnnotations122=null;
        JVMParser.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem123 =null;


        Object RuntimeInvisibleAnnotations122_tree=null;
        RewriteRuleTokenStream stream_RuntimeInvisibleAnnotations=new RewriteRuleTokenStream(adaptor,"token RuntimeInvisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeInvisibleAnnotationsItem=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleAnnotationsItem");
        try {
            // JVM.g:216:3: ( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ -> ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) )
            // JVM.g:216:5: RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+
            {
            RuntimeInvisibleAnnotations122=(Token)match(input,RuntimeInvisibleAnnotations,FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RuntimeInvisibleAnnotations.add(RuntimeInvisibleAnnotations122);


            // JVM.g:217:5: ( runtimeInvisibleAnnotationsItem )+
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
            	    // JVM.g:217:5: runtimeInvisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1569);
            	    runtimeInvisibleAnnotationsItem123=runtimeInvisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeInvisibleAnnotationsItem.add(runtimeInvisibleAnnotationsItem123.getTree());

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
            // 217:38: -> ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
            {
                // JVM.g:217:41: ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
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
    // JVM.g:219:1: parameterVisibilityInfo : ( IDENTIFIER )? pc ( runtimeVisibleAnnotationsItem )* -> ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) ;
    public final JVMParser.parameterVisibilityInfo_return parameterVisibilityInfo() throws RecognitionException {
        JVMParser.parameterVisibilityInfo_return retval = new JVMParser.parameterVisibilityInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER124=null;
        JVMParser.pc_return pc125 =null;

        JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem126 =null;


        Object IDENTIFIER124_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationsItem=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationsItem");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // JVM.g:220:3: ( ( IDENTIFIER )? pc ( runtimeVisibleAnnotationsItem )* -> ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) )
            // JVM.g:220:5: ( IDENTIFIER )? pc ( runtimeVisibleAnnotationsItem )*
            {
            // JVM.g:220:5: ( IDENTIFIER )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENTIFIER) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // JVM.g:220:5: IDENTIFIER
                    {
                    IDENTIFIER124=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER124);


                    }
                    break;

            }


            pushFollow(FOLLOW_pc_in_parameterVisibilityInfo1594);
            pc125=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc125.getTree());

            // JVM.g:221:5: ( runtimeVisibleAnnotationsItem )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==INTLITERAL) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==COLON) ) {
                        int LA31_3 = input.LA(3);

                        if ( (LA31_3==CPINDEX) ) {
                            alt31=1;
                        }


                    }


                }


                switch (alt31) {
            	case 1 :
            	    // JVM.g:221:5: runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1600);
            	    runtimeVisibleAnnotationsItem126=runtimeVisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationsItem.add(runtimeVisibleAnnotationsItem126.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER, pc, runtimeVisibleAnnotationsItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 221:36: -> ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
            {
                // JVM.g:221:39: ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_pc.nextNode(), root_1);

                // JVM.g:221:44: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                // JVM.g:221:56: ( runtimeVisibleAnnotationsItem )*
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
    // JVM.g:223:1: runtimeInvisibleAnnotationsItem : pc ( pc )? CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) ;
    public final JVMParser.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem() throws RecognitionException {
        JVMParser.runtimeInvisibleAnnotationsItem_return retval = new JVMParser.runtimeInvisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX129=null;
        Token LPAREN130=null;
        Token RPAREN132=null;
        JVMParser.pc_return pc127 =null;

        JVMParser.pc_return pc128 =null;

        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList131 =null;


        Object CPINDEX129_tree=null;
        Object LPAREN130_tree=null;
        Object RPAREN132_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotationAssignList=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotationAssignList");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        try {
            // JVM.g:224:3: ( pc ( pc )? CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN -> ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) )
            // JVM.g:224:5: pc ( pc )? CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN
            {
            pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1625);
            pc127=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc127.getTree());

            // JVM.g:224:8: ( pc )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INTLITERAL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // JVM.g:224:8: pc
                    {
                    pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1627);
                    pc128=pc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pc.add(pc128.getTree());

                    }
                    break;

            }


            CPINDEX129=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1630); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX129);


            LPAREN130=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_runtimeInvisibleAnnotationsItem1632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN130);


            // JVM.g:224:27: ( runtimeVisibleAnnotationAssignList )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==CPINDEX) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // JVM.g:224:27: runtimeVisibleAnnotationAssignList
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1634);
                    runtimeVisibleAnnotationAssignList131=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotationAssignList.add(runtimeVisibleAnnotationAssignList131.getTree());

                    }
                    break;

            }


            RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_runtimeInvisibleAnnotationsItem1637); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN132);


            // AST REWRITE
            // elements: CPINDEX, pc, pc, runtimeVisibleAnnotationAssignList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:70: -> ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
            {
                // JVM.g:224:73: ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_pc.nextNode(), root_1);

                // JVM.g:224:78: ( pc )?
                if ( stream_pc.hasNext() ) {
                    adaptor.addChild(root_1, stream_pc.nextTree());

                }
                stream_pc.reset();

                // JVM.g:224:82: ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_CPINDEX.nextNode()
                , root_2);

                // JVM.g:224:92: ( runtimeVisibleAnnotationAssignList )?
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
    // JVM.g:231:1: constant_pool : i1= IDENTIFIER i2= IDENTIFIER COLON ( contant_pool_line )* -> ^( IDENTIFIER[i1.getText() + \" \" + i2.getText()] ( contant_pool_line )* ) ;
    public final JVMParser.constant_pool_return constant_pool() throws RecognitionException {
        JVMParser.constant_pool_return retval = new JVMParser.constant_pool_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token COLON133=null;
        JVMParser.contant_pool_line_return contant_pool_line134 =null;


        Object i1_tree=null;
        Object i2_tree=null;
        Object COLON133_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_contant_pool_line=new RewriteRuleSubtreeStream(adaptor,"rule contant_pool_line");
        try {
            // JVM.g:232:3: (i1= IDENTIFIER i2= IDENTIFIER COLON ( contant_pool_line )* -> ^( IDENTIFIER[i1.getText() + \" \" + i2.getText()] ( contant_pool_line )* ) )
            // JVM.g:232:5: i1= IDENTIFIER i2= IDENTIFIER COLON ( contant_pool_line )*
            {
            i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1672); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i1);


            i2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool1676); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i2);


            COLON133=(Token)match(input,COLON,FOLLOW_COLON_in_constant_pool1678); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON133);


            // JVM.g:233:5: ( contant_pool_line )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==CPINDEX) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // JVM.g:233:5: contant_pool_line
            	    {
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool1685);
            	    contant_pool_line134=contant_pool_line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_contant_pool_line.add(contant_pool_line134.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // AST REWRITE
            // elements: contant_pool_line, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 233:24: -> ^( IDENTIFIER[i1.getText() + \" \" + i2.getText()] ( contant_pool_line )* )
            {
                // JVM.g:233:27: ^( IDENTIFIER[i1.getText() + \" \" + i2.getText()] ( contant_pool_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IDENTIFIER, i1.getText() + " " + i2.getText())
                , root_1);

                // JVM.g:233:75: ( contant_pool_line )*
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
    // JVM.g:236:1: contant_pool_line : CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE -> ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) ;
    public final JVMParser.contant_pool_line_return contant_pool_line() throws RecognitionException {
        JVMParser.contant_pool_line_return retval = new JVMParser.contant_pool_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX135=null;
        Token ASSIGN136=null;
        Token CONSTANT_TYPE_ASSIGNABLE137=null;

        Object CPINDEX135_tree=null;
        Object ASSIGN136_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE137_tree=null;
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleTokenStream stream_CONSTANT_TYPE_ASSIGNABLE=new RewriteRuleTokenStream(adaptor,"token CONSTANT_TYPE_ASSIGNABLE");

        try {
            // JVM.g:237:3: ( CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE -> ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE ) )
            // JVM.g:237:5: CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE
            {
            CPINDEX135=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line1711); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX135);


            ASSIGN136=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line1713); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN136);


            CONSTANT_TYPE_ASSIGNABLE137=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTANT_TYPE_ASSIGNABLE.add(CONSTANT_TYPE_ASSIGNABLE137);


            // AST REWRITE
            // elements: CONSTANT_TYPE_ASSIGNABLE, CPINDEX, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 237:45: -> ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE )
            {
                // JVM.g:237:48: ^( ASSIGN CPINDEX CONSTANT_TYPE_ASSIGNABLE )
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
    // JVM.g:244:1: classBody : ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+ ;
    public final JVMParser.classBody_return classBody() throws RecognitionException {
        JVMParser.classBody_return retval = new JVMParser.classBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.methodDefinition_return methodDefinition138 =null;

        JVMParser.ctorDefinition_return ctorDefinition139 =null;

        JVMParser.fieldDefinition_return fieldDefinition140 =null;

        JVMParser.staticCtorDefinition_return staticCtorDefinition141 =null;



        try {
            // JVM.g:245:3: ( ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+ )
            // JVM.g:246:3: ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:246:3: ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+
            int cnt35=0;
            loop35:
            do {
                int alt35=5;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0 >= PRIVATE && LA35_0 <= PUBLIC)) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }
                    else if ( (true) ) {
                        alt35=4;
                    }


                }
                else if ( (LA35_0==STATIC) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }
                    else if ( (true) ) {
                        alt35=4;
                    }


                }
                else if ( (LA35_0==LESST) ) {
                    int LA35_4 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }


                }
                else if ( (LA35_0==IDENTIFIER) ) {
                    int LA35_5 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==BaseType) ) {
                    int LA35_6 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==VoidType) ) {
                    int LA35_7 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==BOOLEAN) ) {
                    int LA35_8 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==DOUBLE||LA35_0==FLOAT) ) {
                    int LA35_9 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==BYTE||LA35_0==CHAR||LA35_0==INT||LA35_0==LONG||LA35_0==SHORT) ) {
                    int LA35_10 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==VOID) ) {
                    int LA35_11 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==Constant_type) ) {
                    int LA35_12 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==EXTENDS) ) {
                    int LA35_13 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==IMPLEMENTS) ) {
                    int LA35_14 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==DEFAULT) ) {
                    int LA35_15 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==CLASS) ) {
                    int LA35_16 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==THROWS) ) {
                    int LA35_17 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==SUPER) ) {
                    int LA35_18 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==NORMALTYPE) ) {
                    int LA35_19 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt35=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }
                else if ( (LA35_0==ABSTRACT||LA35_0==NATIVE||LA35_0==SYNCHRONIZED) && (synpred1_JVM())) {
                    alt35=1;
                }
                else if ( (LA35_0==TRANSIENT||LA35_0==VOLATILE) && (synpred3_JVM())) {
                    alt35=3;
                }
                else if ( (LA35_0==FINAL) ) {
                    int LA35_22 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt35=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt35=3;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // JVM.g:247:5: ( methodDefinition )=> methodDefinition
            	    {
            	    pushFollow(FOLLOW_methodDefinition_in_classBody1759);
            	    methodDefinition138=methodDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDefinition138.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:248:5: ( ctorDefinition )=> ctorDefinition
            	    {
            	    pushFollow(FOLLOW_ctorDefinition_in_classBody1771);
            	    ctorDefinition139=ctorDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDefinition139.getTree());

            	    }
            	    break;
            	case 3 :
            	    // JVM.g:249:5: ( fieldDefinition )=> fieldDefinition
            	    {
            	    pushFollow(FOLLOW_fieldDefinition_in_classBody1783);
            	    fieldDefinition140=fieldDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDefinition140.getTree());

            	    }
            	    break;
            	case 4 :
            	    // JVM.g:250:5: staticCtorDefinition
            	    {
            	    pushFollow(FOLLOW_staticCtorDefinition_in_classBody1789);
            	    staticCtorDefinition141=staticCtorDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCtorDefinition141.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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


    public static class fieldDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldDefinition"
    // JVM.g:266:1: fieldDefinition : ( field_visual_modifier )? ( field_modifier )* ret= aggregatedJavaType n= identifier ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )* -> ^( FIELDDECL ( ^( VMODIFIER field_visual_modifier ) )? ^( MODIFIER ( field_modifier )* ) ^( RETVALUE $ret) ^( UNITNAME $n) ( ^( ASSIGN literals ) )? ^( UNITHEADER fieldInfo ) ) ;
    public final JVMParser.fieldDefinition_return fieldDefinition() throws RecognitionException {
        JVMParser.fieldDefinition_return retval = new JVMParser.fieldDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSIGN144=null;
        Token SEMI146=null;
        JVMParser.aggregatedJavaType_return ret =null;

        JVMParser.identifier_return n =null;

        JVMParser.field_visual_modifier_return field_visual_modifier142 =null;

        JVMParser.field_modifier_return field_modifier143 =null;

        JVMParser.literals_return literals145 =null;

        JVMParser.fieldInfo_return fieldInfo147 =null;

        JVMParser.fieldAdditionalInfo_return fieldAdditionalInfo148 =null;


        Object ASSIGN144_tree=null;
        Object SEMI146_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_field_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_visual_modifier");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_fieldInfo=new RewriteRuleSubtreeStream(adaptor,"rule fieldInfo");
        RewriteRuleSubtreeStream stream_aggregatedJavaType=new RewriteRuleSubtreeStream(adaptor,"rule aggregatedJavaType");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_fieldAdditionalInfo=new RewriteRuleSubtreeStream(adaptor,"rule fieldAdditionalInfo");
        try {
            // JVM.g:267:3: ( ( field_visual_modifier )? ( field_modifier )* ret= aggregatedJavaType n= identifier ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )* -> ^( FIELDDECL ( ^( VMODIFIER field_visual_modifier ) )? ^( MODIFIER ( field_modifier )* ) ^( RETVALUE $ret) ^( UNITNAME $n) ( ^( ASSIGN literals ) )? ^( UNITHEADER fieldInfo ) ) )
            // JVM.g:267:5: ( field_visual_modifier )? ( field_modifier )* ret= aggregatedJavaType n= identifier ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )*
            {
            // JVM.g:267:5: ( field_visual_modifier )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0 >= PRIVATE && LA36_0 <= PUBLIC)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // JVM.g:267:5: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition1819);
                    field_visual_modifier142=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_field_visual_modifier.add(field_visual_modifier142.getTree());

                    }
                    break;

            }


            // JVM.g:267:28: ( field_modifier )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==FINAL||LA37_0==STATIC||LA37_0==TRANSIENT||LA37_0==VOLATILE) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // JVM.g:267:28: field_modifier
            	    {
            	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition1822);
            	    field_modifier143=field_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_modifier.add(field_modifier143.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            pushFollow(FOLLOW_aggregatedJavaType_in_fieldDefinition1827);
            ret=aggregatedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_aggregatedJavaType.add(ret.getTree());

            pushFollow(FOLLOW_identifier_in_fieldDefinition1831);
            n=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(n.getTree());

            // JVM.g:267:80: ( ASSIGN literals )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ASSIGN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // JVM.g:267:81: ASSIGN literals
                    {
                    ASSIGN144=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefinition1834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN144);


                    pushFollow(FOLLOW_literals_in_fieldDefinition1836);
                    literals145=literals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literals.add(literals145.getTree());

                    }
                    break;

            }


            SEMI146=(Token)match(input,SEMI,FOLLOW_SEMI_in_fieldDefinition1840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI146);


            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition1847);
            fieldInfo147=fieldInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldInfo.add(fieldInfo147.getTree());

            // JVM.g:269:5: ( fieldAdditionalInfo )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Constant||LA39_0==Deprecated||LA39_0==RuntimeInvisibleAnnotations||LA39_0==RuntimeVisibleAnnotations||LA39_0==Signature||LA39_0==Synthetic) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // JVM.g:269:5: fieldAdditionalInfo
            	    {
            	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition1853);
            	    fieldAdditionalInfo148=fieldAdditionalInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldAdditionalInfo.add(fieldAdditionalInfo148.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            // AST REWRITE
            // elements: field_modifier, fieldInfo, n, field_visual_modifier, literals, ASSIGN, ret
            // token labels: 
            // rule labels: ret, retval, n
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_ret=new RewriteRuleSubtreeStream(adaptor,"rule ret",ret!=null?ret.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n",n!=null?n.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:13: -> ^( FIELDDECL ( ^( VMODIFIER field_visual_modifier ) )? ^( MODIFIER ( field_modifier )* ) ^( RETVALUE $ret) ^( UNITNAME $n) ( ^( ASSIGN literals ) )? ^( UNITHEADER fieldInfo ) )
            {
                // JVM.g:270:16: ^( FIELDDECL ( ^( VMODIFIER field_visual_modifier ) )? ^( MODIFIER ( field_modifier )* ) ^( RETVALUE $ret) ^( UNITNAME $n) ( ^( ASSIGN literals ) )? ^( UNITHEADER fieldInfo ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELDDECL, "FIELDDECL")
                , root_1);

                // JVM.g:270:28: ( ^( VMODIFIER field_visual_modifier ) )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    // JVM.g:270:28: ^( VMODIFIER field_visual_modifier )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                    , root_2);

                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_field_visual_modifier.reset();

                // JVM.g:270:64: ^( MODIFIER ( field_modifier )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_2);

                // JVM.g:270:75: ( field_modifier )*
                while ( stream_field_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_field_modifier.nextTree());

                }
                stream_field_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // JVM.g:270:92: ^( RETVALUE $ret)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETVALUE, "RETVALUE")
                , root_2);

                adaptor.addChild(root_2, stream_ret.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // JVM.g:270:109: ^( UNITNAME $n)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_2);

                adaptor.addChild(root_2, stream_n.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // JVM.g:270:124: ( ^( ASSIGN literals ) )?
                if ( stream_literals.hasNext()||stream_ASSIGN.hasNext() ) {
                    // JVM.g:270:124: ^( ASSIGN literals )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_ASSIGN.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_literals.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_literals.reset();
                stream_ASSIGN.reset();

                // JVM.g:271:13: ^( UNITHEADER fieldInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_fieldInfo.nextTree());

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
    // JVM.g:275:1: fieldInfo : Signature fieldInfoOption1 flags -> ^( Signature fieldInfoOption1 ) flags ;
    public final JVMParser.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMParser.fieldInfo_return retval = new JVMParser.fieldInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature149=null;
        JVMParser.fieldInfoOption1_return fieldInfoOption1150 =null;

        JVMParser.flags_return flags151 =null;


        Object Signature149_tree=null;
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleSubtreeStream stream_flags=new RewriteRuleSubtreeStream(adaptor,"rule flags");
        RewriteRuleSubtreeStream stream_fieldInfoOption1=new RewriteRuleSubtreeStream(adaptor,"rule fieldInfoOption1");
        try {
            // JVM.g:276:3: ( Signature fieldInfoOption1 flags -> ^( Signature fieldInfoOption1 ) flags )
            // JVM.g:276:5: Signature fieldInfoOption1 flags
            {
            Signature149=(Token)match(input,Signature,FOLLOW_Signature_in_fieldInfo1951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Signature.add(Signature149);


            pushFollow(FOLLOW_fieldInfoOption1_in_fieldInfo1953);
            fieldInfoOption1150=fieldInfoOption1();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldInfoOption1.add(fieldInfoOption1150.getTree());

            pushFollow(FOLLOW_flags_in_fieldInfo1959);
            flags151=flags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flags.add(flags151.getTree());

            // AST REWRITE
            // elements: fieldInfoOption1, Signature, flags
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:11: -> ^( Signature fieldInfoOption1 ) flags
            {
                // JVM.g:277:14: ^( Signature fieldInfoOption1 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Signature.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_fieldInfoOption1.nextTree());

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
    // JVM.g:280:1: fieldAdditionalInfo : ( Constant fieldInfoOption3 -> ^( Constant fieldInfoOption3 ) | Constant fieldInfoOption4 -> ^( Constant fieldInfoOption4 ) | Signature fieldInfoOption5 -> ^( Signature fieldInfoOption5 ) | Deprecated fieldInfoOption6 -> ^( Deprecated fieldInfoOption6 ) | Synthetic fieldInfoOption6 -> ^( Synthetic fieldInfoOption6 ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations ) ;
    public final JVMParser.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        JVMParser.fieldAdditionalInfo_return retval = new JVMParser.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Constant152=null;
        Token Constant154=null;
        Token Signature156=null;
        Token Deprecated158=null;
        Token Synthetic160=null;
        JVMParser.fieldInfoOption3_return fieldInfoOption3153 =null;

        JVMParser.fieldInfoOption4_return fieldInfoOption4155 =null;

        JVMParser.fieldInfoOption5_return fieldInfoOption5157 =null;

        JVMParser.fieldInfoOption6_return fieldInfoOption6159 =null;

        JVMParser.fieldInfoOption6_return fieldInfoOption6161 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info162 =null;

        JVMParser.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations163 =null;


        Object Constant152_tree=null;
        Object Constant154_tree=null;
        Object Signature156_tree=null;
        Object Deprecated158_tree=null;
        Object Synthetic160_tree=null;
        RewriteRuleTokenStream stream_Deprecated=new RewriteRuleTokenStream(adaptor,"token Deprecated");
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleTokenStream stream_Constant=new RewriteRuleTokenStream(adaptor,"token Constant");
        RewriteRuleSubtreeStream stream_fieldInfoOption3=new RewriteRuleSubtreeStream(adaptor,"rule fieldInfoOption3");
        RewriteRuleSubtreeStream stream_fieldInfoOption4=new RewriteRuleSubtreeStream(adaptor,"rule fieldInfoOption4");
        RewriteRuleSubtreeStream stream_runtimeInvisibleAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleAnnotations");
        RewriteRuleSubtreeStream stream_fieldInfoOption5=new RewriteRuleSubtreeStream(adaptor,"rule fieldInfoOption5");
        RewriteRuleSubtreeStream stream_fieldInfoOption6=new RewriteRuleSubtreeStream(adaptor,"rule fieldInfoOption6");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotations_info=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotations_info");
        try {
            // JVM.g:281:3: ( ( Constant fieldInfoOption3 -> ^( Constant fieldInfoOption3 ) | Constant fieldInfoOption4 -> ^( Constant fieldInfoOption4 ) | Signature fieldInfoOption5 -> ^( Signature fieldInfoOption5 ) | Deprecated fieldInfoOption6 -> ^( Deprecated fieldInfoOption6 ) | Synthetic fieldInfoOption6 -> ^( Synthetic fieldInfoOption6 ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations ) )
            // JVM.g:281:5: ( Constant fieldInfoOption3 -> ^( Constant fieldInfoOption3 ) | Constant fieldInfoOption4 -> ^( Constant fieldInfoOption4 ) | Signature fieldInfoOption5 -> ^( Signature fieldInfoOption5 ) | Deprecated fieldInfoOption6 -> ^( Deprecated fieldInfoOption6 ) | Synthetic fieldInfoOption6 -> ^( Synthetic fieldInfoOption6 ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations )
            {
            // JVM.g:281:5: ( Constant fieldInfoOption3 -> ^( Constant fieldInfoOption3 ) | Constant fieldInfoOption4 -> ^( Constant fieldInfoOption4 ) | Signature fieldInfoOption5 -> ^( Signature fieldInfoOption5 ) | Deprecated fieldInfoOption6 -> ^( Deprecated fieldInfoOption6 ) | Synthetic fieldInfoOption6 -> ^( Synthetic fieldInfoOption6 ) | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations )
            int alt40=7;
            switch ( input.LA(1) ) {
            case Constant:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==BOOLEAN||LA40_1==BYTE||LA40_1==CHAR||LA40_1==DOUBLE||LA40_1==FLOAT||LA40_1==INT||LA40_1==LONG||LA40_1==SHORT||LA40_1==VOID) ) {
                    alt40=1;
                }
                else if ( (LA40_1==CONSTANT_TYPE_ASSIGNABLE) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;

                }
                }
                break;
            case Signature:
                {
                alt40=3;
                }
                break;
            case Deprecated:
                {
                alt40=4;
                }
                break;
            case Synthetic:
                {
                alt40=5;
                }
                break;
            case RuntimeVisibleAnnotations:
                {
                alt40=6;
                }
                break;
            case RuntimeInvisibleAnnotations:
                {
                alt40=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // JVM.g:281:6: Constant fieldInfoOption3
                    {
                    Constant152=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constant.add(Constant152);


                    pushFollow(FOLLOW_fieldInfoOption3_in_fieldAdditionalInfo1985);
                    fieldInfoOption3153=fieldInfoOption3();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldInfoOption3.add(fieldInfoOption3153.getTree());

                    // AST REWRITE
                    // elements: Constant, fieldInfoOption3
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 281:32: -> ^( Constant fieldInfoOption3 )
                    {
                        // JVM.g:281:35: ^( Constant fieldInfoOption3 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Constant.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_fieldInfoOption3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:282:5: Constant fieldInfoOption4
                    {
                    Constant154=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo1999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constant.add(Constant154);


                    pushFollow(FOLLOW_fieldInfoOption4_in_fieldAdditionalInfo2001);
                    fieldInfoOption4155=fieldInfoOption4();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldInfoOption4.add(fieldInfoOption4155.getTree());

                    // AST REWRITE
                    // elements: Constant, fieldInfoOption4
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 282:31: -> ^( Constant fieldInfoOption4 )
                    {
                        // JVM.g:282:34: ^( Constant fieldInfoOption4 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Constant.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_fieldInfoOption4.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:283:5: Signature fieldInfoOption5
                    {
                    Signature156=(Token)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo2015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Signature.add(Signature156);


                    pushFollow(FOLLOW_fieldInfoOption5_in_fieldAdditionalInfo2017);
                    fieldInfoOption5157=fieldInfoOption5();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldInfoOption5.add(fieldInfoOption5157.getTree());

                    // AST REWRITE
                    // elements: fieldInfoOption5, Signature
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 283:32: -> ^( Signature fieldInfoOption5 )
                    {
                        // JVM.g:283:35: ^( Signature fieldInfoOption5 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Signature.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_fieldInfoOption5.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // JVM.g:284:5: Deprecated fieldInfoOption6
                    {
                    Deprecated158=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo2031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Deprecated.add(Deprecated158);


                    pushFollow(FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo2033);
                    fieldInfoOption6159=fieldInfoOption6();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldInfoOption6.add(fieldInfoOption6159.getTree());

                    // AST REWRITE
                    // elements: fieldInfoOption6, Deprecated
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 284:33: -> ^( Deprecated fieldInfoOption6 )
                    {
                        // JVM.g:284:36: ^( Deprecated fieldInfoOption6 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Deprecated.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_fieldInfoOption6.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // JVM.g:285:5: Synthetic fieldInfoOption6
                    {
                    Synthetic160=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo2047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic160);


                    pushFollow(FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo2049);
                    fieldInfoOption6161=fieldInfoOption6();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldInfoOption6.add(fieldInfoOption6161.getTree());

                    // AST REWRITE
                    // elements: fieldInfoOption6, Synthetic
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 285:32: -> ^( Synthetic fieldInfoOption6 )
                    {
                        // JVM.g:285:35: ^( Synthetic fieldInfoOption6 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_Synthetic.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_fieldInfoOption6.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // JVM.g:286:5: runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo2063);
                    runtimeVisibleAnnotations_info162=runtimeVisibleAnnotations_info();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotations_info.add(runtimeVisibleAnnotations_info162.getTree());

                    }
                    break;
                case 7 :
                    // JVM.g:287:5: runtimeInvisibleAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo2069);
                    runtimeInvisibleAnnotations163=runtimeInvisibleAnnotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_runtimeInvisibleAnnotations.add(runtimeInvisibleAnnotations163.getTree());

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


    public static class fieldInfoOption1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfoOption1"
    // JVM.g:291:1: fieldInfoOption1 : bytecodeType ;
    public final JVMParser.fieldInfoOption1_return fieldInfoOption1() throws RecognitionException {
        JVMParser.fieldInfoOption1_return retval = new JVMParser.fieldInfoOption1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.bytecodeType_return bytecodeType164 =null;



        try {
            // JVM.g:292:3: ( bytecodeType )
            // JVM.g:292:5: bytecodeType
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bytecodeType_in_fieldInfoOption12088);
            bytecodeType164=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType164.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldInfoOption1"


    public static class fieldInfoOption2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfoOption2"
    // JVM.g:295:1: fieldInfoOption2 : IDENTIFIER ( COMMA IDENTIFIER )* -> ( IDENTIFIER )+ ;
    public final JVMParser.fieldInfoOption2_return fieldInfoOption2() throws RecognitionException {
        JVMParser.fieldInfoOption2_return retval = new JVMParser.fieldInfoOption2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER165=null;
        Token COMMA166=null;
        Token IDENTIFIER167=null;

        Object IDENTIFIER165_tree=null;
        Object COMMA166_tree=null;
        Object IDENTIFIER167_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // JVM.g:296:3: ( IDENTIFIER ( COMMA IDENTIFIER )* -> ( IDENTIFIER )+ )
            // JVM.g:296:5: IDENTIFIER ( COMMA IDENTIFIER )*
            {
            IDENTIFIER165=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldInfoOption22104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER165);


            // JVM.g:296:16: ( COMMA IDENTIFIER )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // JVM.g:296:17: COMMA IDENTIFIER
            	    {
            	    COMMA166=(Token)match(input,COMMA,FOLLOW_COMMA_in_fieldInfoOption22107); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA166);


            	    IDENTIFIER167=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldInfoOption22109); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER167);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 296:36: -> ( IDENTIFIER )+
            {
                if ( !(stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_0, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

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
    // $ANTLR end "fieldInfoOption2"


    public static class fieldInfoOption3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfoOption3"
    // JVM.g:299:1: fieldInfoOption3 : primitiveType literals ;
    public final JVMParser.fieldInfoOption3_return fieldInfoOption3() throws RecognitionException {
        JVMParser.fieldInfoOption3_return retval = new JVMParser.fieldInfoOption3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.primitiveType_return primitiveType168 =null;

        JVMParser.literals_return literals169 =null;



        try {
            // JVM.g:300:3: ( primitiveType literals )
            // JVM.g:300:5: primitiveType literals
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_primitiveType_in_fieldInfoOption32130);
            primitiveType168=primitiveType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType168.getTree());

            pushFollow(FOLLOW_literals_in_fieldInfoOption32132);
            literals169=literals();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, literals169.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldInfoOption3"


    public static class fieldInfoOption4_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfoOption4"
    // JVM.g:303:1: fieldInfoOption4 : CONSTANT_TYPE_ASSIGNABLE ;
    public final JVMParser.fieldInfoOption4_return fieldInfoOption4() throws RecognitionException {
        JVMParser.fieldInfoOption4_return retval = new JVMParser.fieldInfoOption4_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTANT_TYPE_ASSIGNABLE170=null;

        Object CONSTANT_TYPE_ASSIGNABLE170_tree=null;

        try {
            // JVM.g:304:3: ( CONSTANT_TYPE_ASSIGNABLE )
            // JVM.g:304:5: CONSTANT_TYPE_ASSIGNABLE
            {
            root_0 = (Object)adaptor.nil();


            CONSTANT_TYPE_ASSIGNABLE170=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldInfoOption42146); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTANT_TYPE_ASSIGNABLE170_tree = 
            (Object)adaptor.create(CONSTANT_TYPE_ASSIGNABLE170)
            ;
            adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE170_tree);
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
    // $ANTLR end "fieldInfoOption4"


    public static class fieldInfoOption5_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfoOption5"
    // JVM.g:307:1: fieldInfoOption5 : CPINDEX ;
    public final JVMParser.fieldInfoOption5_return fieldInfoOption5() throws RecognitionException {
        JVMParser.fieldInfoOption5_return retval = new JVMParser.fieldInfoOption5_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX171=null;

        Object CPINDEX171_tree=null;

        try {
            // JVM.g:308:3: ( CPINDEX )
            // JVM.g:308:6: CPINDEX
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX171=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldInfoOption52161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX171_tree = 
            (Object)adaptor.create(CPINDEX171)
            ;
            adaptor.addChild(root_0, CPINDEX171_tree);
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
    // $ANTLR end "fieldInfoOption5"


    public static class fieldInfoOption6_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfoOption6"
    // JVM.g:311:1: fieldInfoOption6 : BOOLEANLITERAL ;
    public final JVMParser.fieldInfoOption6_return fieldInfoOption6() throws RecognitionException {
        JVMParser.fieldInfoOption6_return retval = new JVMParser.fieldInfoOption6_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEANLITERAL172=null;

        Object BOOLEANLITERAL172_tree=null;

        try {
            // JVM.g:312:3: ( BOOLEANLITERAL )
            // JVM.g:312:6: BOOLEANLITERAL
            {
            root_0 = (Object)adaptor.nil();


            BOOLEANLITERAL172=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldInfoOption62176); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEANLITERAL172_tree = 
            (Object)adaptor.create(BOOLEANLITERAL172)
            ;
            adaptor.addChild(root_0, BOOLEANLITERAL172_tree);
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
    // $ANTLR end "fieldInfoOption6"


    public static class field_visual_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_visual_modifier"
    // JVM.g:315:1: field_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMParser.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        JVMParser.field_visual_modifier_return retval = new JVMParser.field_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set173=null;

        Object set173_tree=null;

        try {
            // JVM.g:316:3: ( PUBLIC | PRIVATE | PROTECTED )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set173=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set173)
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
    // JVM.g:319:1: field_modifier : ( FINAL | STATIC | TRANSIENT | VOLATILE );
    public final JVMParser.field_modifier_return field_modifier() throws RecognitionException {
        JVMParser.field_modifier_return retval = new JVMParser.field_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set174=null;

        Object set174_tree=null;

        try {
            // JVM.g:320:3: ( FINAL | STATIC | TRANSIENT | VOLATILE )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set174=(Token)input.LT(1);

            if ( input.LA(1)==FINAL||input.LA(1)==STATIC||input.LA(1)==TRANSIENT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set174)
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
    // JVM.g:327:1: staticCtorDefinition : ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body -> ^( STATICCTORDECL ( ^( VMODIFIER field_visual_modifier ) )? ^( UNITHEADER methodInfo ) body ) ;
    public final JVMParser.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        JVMParser.staticCtorDefinition_return retval = new JVMParser.staticCtorDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC176=null;
        Token LBRACE177=null;
        Token RBRACE178=null;
        Token SEMI179=null;
        JVMParser.field_visual_modifier_return field_visual_modifier175 =null;

        JVMParser.methodInfo_return methodInfo180 =null;

        JVMParser.body_return body181 =null;


        Object STATIC176_tree=null;
        Object LBRACE177_tree=null;
        Object RBRACE178_tree=null;
        Object SEMI179_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_field_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_visual_modifier");
        RewriteRuleSubtreeStream stream_methodInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodInfo");
        try {
            // JVM.g:328:3: ( ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body -> ^( STATICCTORDECL ( ^( VMODIFIER field_visual_modifier ) )? ^( UNITHEADER methodInfo ) body ) )
            // JVM.g:328:5: ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body
            {
            // JVM.g:328:5: ( field_visual_modifier )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0 >= PRIVATE && LA42_0 <= PUBLIC)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // JVM.g:328:5: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition2247);
                    field_visual_modifier175=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_field_visual_modifier.add(field_visual_modifier175.getTree());

                    }
                    break;

            }


            STATIC176=(Token)match(input,STATIC,FOLLOW_STATIC_in_staticCtorDefinition2250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STATIC.add(STATIC176);


            LBRACE177=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_staticCtorDefinition2252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE177);


            RBRACE178=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_staticCtorDefinition2254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE178);


            SEMI179=(Token)match(input,SEMI,FOLLOW_SEMI_in_staticCtorDefinition2256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI179);


            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition2263);
            methodInfo180=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodInfo.add(methodInfo180.getTree());

            pushFollow(FOLLOW_body_in_staticCtorDefinition2269);
            body181=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body181.getTree());

            // AST REWRITE
            // elements: field_visual_modifier, methodInfo, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 330:10: -> ^( STATICCTORDECL ( ^( VMODIFIER field_visual_modifier ) )? ^( UNITHEADER methodInfo ) body )
            {
                // JVM.g:330:13: ^( STATICCTORDECL ( ^( VMODIFIER field_visual_modifier ) )? ^( UNITHEADER methodInfo ) body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATICCTORDECL, "STATICCTORDECL")
                , root_1);

                // JVM.g:330:30: ( ^( VMODIFIER field_visual_modifier ) )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    // JVM.g:330:30: ^( VMODIFIER field_visual_modifier )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                    , root_2);

                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_field_visual_modifier.reset();

                // JVM.g:330:66: ^( UNITHEADER methodInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_body.nextTree());

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
    // JVM.g:337:1: ctorDefinition : ( field_visual_modifier )? ( genericDescriptor )? javaType arguments ( throwClause )? SEMI methodInfo body ( afterMethodInfo )? -> ^( CTORDECL ( ^( VMODIFIER field_visual_modifier ) )? ( ^( GENERICDESC genericDescriptor ) )? ^( UNITNAME javaType ) arguments ( throwClause )? ^( UNITHEADER methodInfo ) body ( afterMethodInfo )? ) ;
    public final JVMParser.ctorDefinition_return ctorDefinition() throws RecognitionException {
        JVMParser.ctorDefinition_return retval = new JVMParser.ctorDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI187=null;
        JVMParser.field_visual_modifier_return field_visual_modifier182 =null;

        JVMParser.genericDescriptor_return genericDescriptor183 =null;

        JVMParser.javaType_return javaType184 =null;

        JVMParser.arguments_return arguments185 =null;

        JVMParser.throwClause_return throwClause186 =null;

        JVMParser.methodInfo_return methodInfo188 =null;

        JVMParser.body_return body189 =null;

        JVMParser.afterMethodInfo_return afterMethodInfo190 =null;


        Object SEMI187_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_throwClause=new RewriteRuleSubtreeStream(adaptor,"rule throwClause");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_genericDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule genericDescriptor");
        RewriteRuleSubtreeStream stream_field_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_visual_modifier");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_afterMethodInfo=new RewriteRuleSubtreeStream(adaptor,"rule afterMethodInfo");
        RewriteRuleSubtreeStream stream_javaType=new RewriteRuleSubtreeStream(adaptor,"rule javaType");
        RewriteRuleSubtreeStream stream_methodInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodInfo");
        try {
            // JVM.g:338:3: ( ( field_visual_modifier )? ( genericDescriptor )? javaType arguments ( throwClause )? SEMI methodInfo body ( afterMethodInfo )? -> ^( CTORDECL ( ^( VMODIFIER field_visual_modifier ) )? ( ^( GENERICDESC genericDescriptor ) )? ^( UNITNAME javaType ) arguments ( throwClause )? ^( UNITHEADER methodInfo ) body ( afterMethodInfo )? ) )
            // JVM.g:338:5: ( field_visual_modifier )? ( genericDescriptor )? javaType arguments ( throwClause )? SEMI methodInfo body ( afterMethodInfo )?
            {
            // JVM.g:338:5: ( field_visual_modifier )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0 >= PRIVATE && LA43_0 <= PUBLIC)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // JVM.g:338:5: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition2309);
                    field_visual_modifier182=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_field_visual_modifier.add(field_visual_modifier182.getTree());

                    }
                    break;

            }


            // JVM.g:338:28: ( genericDescriptor )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==LESST) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // JVM.g:338:28: genericDescriptor
                    {
                    pushFollow(FOLLOW_genericDescriptor_in_ctorDefinition2312);
                    genericDescriptor183=genericDescriptor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_genericDescriptor.add(genericDescriptor183.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_javaType_in_ctorDefinition2315);
            javaType184=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaType.add(javaType184.getTree());

            pushFollow(FOLLOW_arguments_in_ctorDefinition2317);
            arguments185=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments185.getTree());

            // JVM.g:338:66: ( throwClause )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==THROWS) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // JVM.g:338:66: throwClause
                    {
                    pushFollow(FOLLOW_throwClause_in_ctorDefinition2319);
                    throwClause186=throwClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_throwClause.add(throwClause186.getTree());

                    }
                    break;

            }


            SEMI187=(Token)match(input,SEMI,FOLLOW_SEMI_in_ctorDefinition2322); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI187);


            pushFollow(FOLLOW_methodInfo_in_ctorDefinition2329);
            methodInfo188=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodInfo.add(methodInfo188.getTree());

            pushFollow(FOLLOW_body_in_ctorDefinition2335);
            body189=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body189.getTree());

            // JVM.g:341:5: ( afterMethodInfo )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AnnotationDefault||LA46_0==Deprecated||LA46_0==Exceptions||(LA46_0 >= RuntimeInvisibleAnnotations && LA46_0 <= RuntimeVisibleParameterAnnotations)||LA46_0==Signature||LA46_0==Synthetic) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // JVM.g:341:5: afterMethodInfo
                    {
                    pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition2341);
                    afterMethodInfo190=afterMethodInfo();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_afterMethodInfo.add(afterMethodInfo190.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: throwClause, body, methodInfo, javaType, genericDescriptor, afterMethodInfo, field_visual_modifier, arguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 341:22: -> ^( CTORDECL ( ^( VMODIFIER field_visual_modifier ) )? ( ^( GENERICDESC genericDescriptor ) )? ^( UNITNAME javaType ) arguments ( throwClause )? ^( UNITHEADER methodInfo ) body ( afterMethodInfo )? )
            {
                // JVM.g:341:25: ^( CTORDECL ( ^( VMODIFIER field_visual_modifier ) )? ( ^( GENERICDESC genericDescriptor ) )? ^( UNITNAME javaType ) arguments ( throwClause )? ^( UNITHEADER methodInfo ) body ( afterMethodInfo )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CTORDECL, "CTORDECL")
                , root_1);

                // JVM.g:341:36: ( ^( VMODIFIER field_visual_modifier ) )?
                if ( stream_field_visual_modifier.hasNext() ) {
                    // JVM.g:341:36: ^( VMODIFIER field_visual_modifier )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                    , root_2);

                    adaptor.addChild(root_2, stream_field_visual_modifier.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_field_visual_modifier.reset();

                // JVM.g:341:72: ( ^( GENERICDESC genericDescriptor ) )?
                if ( stream_genericDescriptor.hasNext() ) {
                    // JVM.g:341:72: ^( GENERICDESC genericDescriptor )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(GENERICDESC, "GENERICDESC")
                    , root_2);

                    adaptor.addChild(root_2, stream_genericDescriptor.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_genericDescriptor.reset();

                // JVM.g:341:106: ^( UNITNAME javaType )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_2);

                adaptor.addChild(root_2, stream_javaType.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_arguments.nextTree());

                // JVM.g:341:137: ( throwClause )?
                if ( stream_throwClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_throwClause.nextTree());

                }
                stream_throwClause.reset();

                // JVM.g:342:25: ^( UNITHEADER methodInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_body.nextTree());

                // JVM.g:344:25: ( afterMethodInfo )?
                if ( stream_afterMethodInfo.hasNext() ) {
                    adaptor.addChild(root_1, stream_afterMethodInfo.nextTree());

                }
                stream_afterMethodInfo.reset();

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
    // JVM.g:352:1: methodDefinition : ( method_visual_modifier )? ( method_modifier )* ( genericDescriptor )? aggregatedJavaType javaTypeIdentifier arguments ( throwClauseMethod )? SEMI methodInfo ( body )? ( afterMethodInfo )? -> ^( CTORDECL ( ^( VMODIFIER method_visual_modifier ) )? ^( MODIFIER ( method_modifier )* ) ( ^( GENERICDESC genericDescriptor ) )? ^( RETVALUE aggregatedJavaType ) ^( UNITNAME javaTypeIdentifier ) arguments ( throwClauseMethod )? ^( UNITHEADER methodInfo ) ( body )? ( afterMethodInfo )? ) ;
    public final JVMParser.methodDefinition_return methodDefinition() throws RecognitionException {
        JVMParser.methodDefinition_return retval = new JVMParser.methodDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI198=null;
        JVMParser.method_visual_modifier_return method_visual_modifier191 =null;

        JVMParser.method_modifier_return method_modifier192 =null;

        JVMParser.genericDescriptor_return genericDescriptor193 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType194 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier195 =null;

        JVMParser.arguments_return arguments196 =null;

        JVMParser.throwClauseMethod_return throwClauseMethod197 =null;

        JVMParser.methodInfo_return methodInfo199 =null;

        JVMParser.body_return body200 =null;

        JVMParser.afterMethodInfo_return afterMethodInfo201 =null;


        Object SEMI198_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_genericDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule genericDescriptor");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_afterMethodInfo=new RewriteRuleSubtreeStream(adaptor,"rule afterMethodInfo");
        RewriteRuleSubtreeStream stream_methodInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodInfo");
        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        RewriteRuleSubtreeStream stream_aggregatedJavaType=new RewriteRuleSubtreeStream(adaptor,"rule aggregatedJavaType");
        RewriteRuleSubtreeStream stream_throwClauseMethod=new RewriteRuleSubtreeStream(adaptor,"rule throwClauseMethod");
        RewriteRuleSubtreeStream stream_method_visual_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_visual_modifier");
        RewriteRuleSubtreeStream stream_javaTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule javaTypeIdentifier");
        try {
            // JVM.g:353:3: ( ( method_visual_modifier )? ( method_modifier )* ( genericDescriptor )? aggregatedJavaType javaTypeIdentifier arguments ( throwClauseMethod )? SEMI methodInfo ( body )? ( afterMethodInfo )? -> ^( CTORDECL ( ^( VMODIFIER method_visual_modifier ) )? ^( MODIFIER ( method_modifier )* ) ( ^( GENERICDESC genericDescriptor ) )? ^( RETVALUE aggregatedJavaType ) ^( UNITNAME javaTypeIdentifier ) arguments ( throwClauseMethod )? ^( UNITHEADER methodInfo ) ( body )? ( afterMethodInfo )? ) )
            // JVM.g:353:5: ( method_visual_modifier )? ( method_modifier )* ( genericDescriptor )? aggregatedJavaType javaTypeIdentifier arguments ( throwClauseMethod )? SEMI methodInfo ( body )? ( afterMethodInfo )?
            {
            // JVM.g:353:5: ( method_visual_modifier )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0 >= PRIVATE && LA47_0 <= PUBLIC)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // JVM.g:353:5: method_visual_modifier
                    {
                    pushFollow(FOLLOW_method_visual_modifier_in_methodDefinition2498);
                    method_visual_modifier191=method_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_method_visual_modifier.add(method_visual_modifier191.getTree());

                    }
                    break;

            }


            // JVM.g:353:29: ( method_modifier )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==ABSTRACT||LA48_0==FINAL||LA48_0==NATIVE||LA48_0==STATIC||LA48_0==SYNCHRONIZED) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // JVM.g:353:29: method_modifier
            	    {
            	    pushFollow(FOLLOW_method_modifier_in_methodDefinition2501);
            	    method_modifier192=method_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_method_modifier.add(method_modifier192.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            // JVM.g:353:46: ( genericDescriptor )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LESST) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // JVM.g:353:46: genericDescriptor
                    {
                    pushFollow(FOLLOW_genericDescriptor_in_methodDefinition2504);
                    genericDescriptor193=genericDescriptor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_genericDescriptor.add(genericDescriptor193.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_aggregatedJavaType_in_methodDefinition2507);
            aggregatedJavaType194=aggregatedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_aggregatedJavaType.add(aggregatedJavaType194.getTree());

            pushFollow(FOLLOW_javaTypeIdentifier_in_methodDefinition2509);
            javaTypeIdentifier195=javaTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaTypeIdentifier.add(javaTypeIdentifier195.getTree());

            pushFollow(FOLLOW_arguments_in_methodDefinition2511);
            arguments196=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments196.getTree());

            // JVM.g:353:113: ( throwClauseMethod )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==THROWS) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // JVM.g:353:113: throwClauseMethod
                    {
                    pushFollow(FOLLOW_throwClauseMethod_in_methodDefinition2513);
                    throwClauseMethod197=throwClauseMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_throwClauseMethod.add(throwClauseMethod197.getTree());

                    }
                    break;

            }


            SEMI198=(Token)match(input,SEMI,FOLLOW_SEMI_in_methodDefinition2516); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI198);


            pushFollow(FOLLOW_methodInfo_in_methodDefinition2523);
            methodInfo199=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodInfo.add(methodInfo199.getTree());

            // JVM.g:355:5: ( body )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Synthetic) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==BOOLEANLITERAL) ) {
                    int LA51_4 = input.LA(3);

                    if ( (LA51_4==Code) ) {
                        alt51=1;
                    }
                }
            }
            else if ( (LA51_0==Code) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // JVM.g:355:5: body
                    {
                    pushFollow(FOLLOW_body_in_methodDefinition2529);
                    body200=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_body.add(body200.getTree());

                    }
                    break;

            }


            // JVM.g:356:5: ( afterMethodInfo )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==AnnotationDefault||LA52_0==Deprecated||LA52_0==Exceptions||(LA52_0 >= RuntimeInvisibleAnnotations && LA52_0 <= RuntimeVisibleParameterAnnotations)||LA52_0==Signature||LA52_0==Synthetic) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // JVM.g:356:5: afterMethodInfo
                    {
                    pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition2536);
                    afterMethodInfo201=afterMethodInfo();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_afterMethodInfo.add(afterMethodInfo201.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: afterMethodInfo, genericDescriptor, method_modifier, methodInfo, javaTypeIdentifier, arguments, aggregatedJavaType, method_visual_modifier, body, throwClauseMethod
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 356:22: -> ^( CTORDECL ( ^( VMODIFIER method_visual_modifier ) )? ^( MODIFIER ( method_modifier )* ) ( ^( GENERICDESC genericDescriptor ) )? ^( RETVALUE aggregatedJavaType ) ^( UNITNAME javaTypeIdentifier ) arguments ( throwClauseMethod )? ^( UNITHEADER methodInfo ) ( body )? ( afterMethodInfo )? )
            {
                // JVM.g:356:25: ^( CTORDECL ( ^( VMODIFIER method_visual_modifier ) )? ^( MODIFIER ( method_modifier )* ) ( ^( GENERICDESC genericDescriptor ) )? ^( RETVALUE aggregatedJavaType ) ^( UNITNAME javaTypeIdentifier ) arguments ( throwClauseMethod )? ^( UNITHEADER methodInfo ) ( body )? ( afterMethodInfo )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CTORDECL, "CTORDECL")
                , root_1);

                // JVM.g:356:36: ( ^( VMODIFIER method_visual_modifier ) )?
                if ( stream_method_visual_modifier.hasNext() ) {
                    // JVM.g:356:36: ^( VMODIFIER method_visual_modifier )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(VMODIFIER, "VMODIFIER")
                    , root_2);

                    adaptor.addChild(root_2, stream_method_visual_modifier.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_method_visual_modifier.reset();

                // JVM.g:356:73: ^( MODIFIER ( method_modifier )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_2);

                // JVM.g:356:84: ( method_modifier )*
                while ( stream_method_modifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_method_modifier.nextTree());

                }
                stream_method_modifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                // JVM.g:356:102: ( ^( GENERICDESC genericDescriptor ) )?
                if ( stream_genericDescriptor.hasNext() ) {
                    // JVM.g:356:102: ^( GENERICDESC genericDescriptor )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(GENERICDESC, "GENERICDESC")
                    , root_2);

                    adaptor.addChild(root_2, stream_genericDescriptor.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_genericDescriptor.reset();

                // JVM.g:356:136: ^( RETVALUE aggregatedJavaType )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETVALUE, "RETVALUE")
                , root_2);

                adaptor.addChild(root_2, stream_aggregatedJavaType.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // JVM.g:356:167: ^( UNITNAME javaTypeIdentifier )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITNAME, "UNITNAME")
                , root_2);

                adaptor.addChild(root_2, stream_javaTypeIdentifier.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_arguments.nextTree());

                // JVM.g:356:208: ( throwClauseMethod )?
                if ( stream_throwClauseMethod.hasNext() ) {
                    adaptor.addChild(root_1, stream_throwClauseMethod.nextTree());

                }
                stream_throwClauseMethod.reset();

                // JVM.g:357:25: ^( UNITHEADER methodInfo )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITHEADER, "UNITHEADER")
                , root_2);

                adaptor.addChild(root_2, stream_methodInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // JVM.g:358:25: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_1, stream_body.nextTree());

                }
                stream_body.reset();

                // JVM.g:359:25: ( afterMethodInfo )?
                if ( stream_afterMethodInfo.hasNext() ) {
                    adaptor.addChild(root_1, stream_afterMethodInfo.nextTree());

                }
                stream_afterMethodInfo.reset();

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
    // JVM.g:363:1: methodInfo : Signature methodSignatureInfo flags -> ^( Signature methodSignatureInfo ) flags ;
    public final JVMParser.methodInfo_return methodInfo() throws RecognitionException {
        JVMParser.methodInfo_return retval = new JVMParser.methodInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature202=null;
        JVMParser.methodSignatureInfo_return methodSignatureInfo203 =null;

        JVMParser.flags_return flags204 =null;


        Object Signature202_tree=null;
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleSubtreeStream stream_flags=new RewriteRuleSubtreeStream(adaptor,"rule flags");
        RewriteRuleSubtreeStream stream_methodSignatureInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodSignatureInfo");
        try {
            // JVM.g:364:3: ( Signature methodSignatureInfo flags -> ^( Signature methodSignatureInfo ) flags )
            // JVM.g:364:5: Signature methodSignatureInfo flags
            {
            Signature202=(Token)match(input,Signature,FOLLOW_Signature_in_methodInfo2703); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Signature.add(Signature202);


            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo2705);
            methodSignatureInfo203=methodSignatureInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodSignatureInfo.add(methodSignatureInfo203.getTree());

            pushFollow(FOLLOW_flags_in_methodInfo2712);
            flags204=flags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flags.add(flags204.getTree());

            // AST REWRITE
            // elements: flags, methodSignatureInfo, Signature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 365:11: -> ^( Signature methodSignatureInfo ) flags
            {
                // JVM.g:365:14: ^( Signature methodSignatureInfo )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Signature.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_methodSignatureInfo.nextTree());

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
    // $ANTLR end "methodInfo"


    public static class afterMethodInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "afterMethodInfo"
    // JVM.g:368:1: afterMethodInfo : ( Deprecated methodDeprecatedInfo -> ^( Deprecated methodDeprecatedInfo ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ ;
    public final JVMParser.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        JVMParser.afterMethodInfo_return retval = new JVMParser.afterMethodInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Deprecated205=null;
        Token Signature207=null;
        Token CPINDEX208=null;
        Token Exceptions213=null;
        Token Synthetic215=null;
        Token BOOLEANLITERAL216=null;
        JVMParser.methodDeprecatedInfo_return methodDeprecatedInfo206 =null;

        JVMParser.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations209 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info210 =null;

        JVMParser.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations211 =null;

        JVMParser.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations212 =null;

        JVMParser.throwClause_return throwClause214 =null;

        JVMParser.annotationDefault_return annotationDefault217 =null;


        Object Deprecated205_tree=null;
        Object Signature207_tree=null;
        Object CPINDEX208_tree=null;
        Object Exceptions213_tree=null;
        Object Synthetic215_tree=null;
        Object BOOLEANLITERAL216_tree=null;
        RewriteRuleTokenStream stream_Deprecated=new RewriteRuleTokenStream(adaptor,"token Deprecated");
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");
        RewriteRuleTokenStream stream_Exceptions=new RewriteRuleTokenStream(adaptor,"token Exceptions");
        RewriteRuleTokenStream stream_CPINDEX=new RewriteRuleTokenStream(adaptor,"token CPINDEX");
        RewriteRuleTokenStream stream_Signature=new RewriteRuleTokenStream(adaptor,"token Signature");
        RewriteRuleSubtreeStream stream_methodDeprecatedInfo=new RewriteRuleSubtreeStream(adaptor,"rule methodDeprecatedInfo");
        RewriteRuleSubtreeStream stream_runtimeVisibleParameterAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_throwClause=new RewriteRuleSubtreeStream(adaptor,"rule throwClause");
        RewriteRuleSubtreeStream stream_runtimeInvisibleParameterAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleParameterAnnotations");
        RewriteRuleSubtreeStream stream_runtimeInvisibleAnnotations=new RewriteRuleSubtreeStream(adaptor,"rule runtimeInvisibleAnnotations");
        RewriteRuleSubtreeStream stream_runtimeVisibleAnnotations_info=new RewriteRuleSubtreeStream(adaptor,"rule runtimeVisibleAnnotations_info");
        RewriteRuleSubtreeStream stream_annotationDefault=new RewriteRuleSubtreeStream(adaptor,"rule annotationDefault");
        try {
            // JVM.g:369:3: ( ( Deprecated methodDeprecatedInfo -> ^( Deprecated methodDeprecatedInfo ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+ )
            // JVM.g:369:5: ( Deprecated methodDeprecatedInfo -> ^( Deprecated methodDeprecatedInfo ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
            {
            // JVM.g:369:5: ( Deprecated methodDeprecatedInfo -> ^( Deprecated methodDeprecatedInfo ) | Signature CPINDEX -> ^( Signature CPINDEX ) | runtimeInvisibleParameterAnnotations | runtimeVisibleAnnotations_info | runtimeInvisibleAnnotations | runtimeVisibleParameterAnnotations | Exceptions throwClause -> ^( Exceptions throwClause ) | Synthetic BOOLEANLITERAL -> ^( Synthetic BOOLEANLITERAL ) | annotationDefault )+
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
            	    // JVM.g:369:6: Deprecated methodDeprecatedInfo
            	    {
            	    Deprecated205=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfo2736); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Deprecated.add(Deprecated205);


            	    pushFollow(FOLLOW_methodDeprecatedInfo_in_afterMethodInfo2739);
            	    methodDeprecatedInfo206=methodDeprecatedInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_methodDeprecatedInfo.add(methodDeprecatedInfo206.getTree());

            	    // AST REWRITE
            	    // elements: Deprecated, methodDeprecatedInfo
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 369:41: -> ^( Deprecated methodDeprecatedInfo )
            	    {
            	        // JVM.g:369:44: ^( Deprecated methodDeprecatedInfo )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        stream_Deprecated.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_methodDeprecatedInfo.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:370:5: Signature CPINDEX
            	    {
            	    Signature207=(Token)match(input,Signature,FOLLOW_Signature_in_afterMethodInfo2756); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Signature.add(Signature207);


            	    CPINDEX208=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfo2758); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CPINDEX.add(CPINDEX208);


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
            	    // 370:41: -> ^( Signature CPINDEX )
            	    {
            	        // JVM.g:370:44: ^( Signature CPINDEX )
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
            	    // JVM.g:371:5: runtimeInvisibleParameterAnnotations
            	    {
            	    pushFollow(FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo2790);
            	    runtimeInvisibleParameterAnnotations209=runtimeInvisibleParameterAnnotations();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeInvisibleParameterAnnotations.add(runtimeInvisibleParameterAnnotations209.getTree());

            	    }
            	    break;
            	case 4 :
            	    // JVM.g:372:5: runtimeVisibleAnnotations_info
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo2796);
            	    runtimeVisibleAnnotations_info210=runtimeVisibleAnnotations_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleAnnotations_info.add(runtimeVisibleAnnotations_info210.getTree());

            	    }
            	    break;
            	case 5 :
            	    // JVM.g:373:5: runtimeInvisibleAnnotations
            	    {
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo2802);
            	    runtimeInvisibleAnnotations211=runtimeInvisibleAnnotations();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeInvisibleAnnotations.add(runtimeInvisibleAnnotations211.getTree());

            	    }
            	    break;
            	case 6 :
            	    // JVM.g:374:5: runtimeVisibleParameterAnnotations
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo2808);
            	    runtimeVisibleParameterAnnotations212=runtimeVisibleParameterAnnotations();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_runtimeVisibleParameterAnnotations.add(runtimeVisibleParameterAnnotations212.getTree());

            	    }
            	    break;
            	case 7 :
            	    // JVM.g:375:5: Exceptions throwClause
            	    {
            	    Exceptions213=(Token)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfo2814); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Exceptions.add(Exceptions213);


            	    pushFollow(FOLLOW_throwClause_in_afterMethodInfo2817);
            	    throwClause214=throwClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_throwClause.add(throwClause214.getTree());

            	    // AST REWRITE
            	    // elements: Exceptions, throwClause
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 375:41: -> ^( Exceptions throwClause )
            	    {
            	        // JVM.g:375:44: ^( Exceptions throwClause )
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
            	    // JVM.g:376:5: Synthetic BOOLEANLITERAL
            	    {
            	    Synthetic215=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfo2844); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic215);


            	    BOOLEANLITERAL216=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2846); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL216);


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
            	    // 376:41: -> ^( Synthetic BOOLEANLITERAL )
            	    {
            	        // JVM.g:376:44: ^( Synthetic BOOLEANLITERAL )
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
            	    // JVM.g:377:5: annotationDefault
            	    {
            	    pushFollow(FOLLOW_annotationDefault_in_afterMethodInfo2871);
            	    annotationDefault217=annotationDefault();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotationDefault.add(annotationDefault217.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
    // JVM.g:380:1: annotationDefault : AnnotationDefault DefaultValue ( AnnotationAssign -> ^( AnnotationDefault DefaultValue AnnotationAssign ) | brackedAnnotationAssign -> ^( AnnotationDefault DefaultValue brackedAnnotationAssign ) ) ;
    public final JVMParser.annotationDefault_return annotationDefault() throws RecognitionException {
        JVMParser.annotationDefault_return retval = new JVMParser.annotationDefault_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AnnotationDefault218=null;
        Token DefaultValue219=null;
        Token AnnotationAssign220=null;
        JVMParser.brackedAnnotationAssign_return brackedAnnotationAssign221 =null;


        Object AnnotationDefault218_tree=null;
        Object DefaultValue219_tree=null;
        Object AnnotationAssign220_tree=null;
        RewriteRuleTokenStream stream_AnnotationDefault=new RewriteRuleTokenStream(adaptor,"token AnnotationDefault");
        RewriteRuleTokenStream stream_AnnotationAssign=new RewriteRuleTokenStream(adaptor,"token AnnotationAssign");
        RewriteRuleTokenStream stream_DefaultValue=new RewriteRuleTokenStream(adaptor,"token DefaultValue");
        RewriteRuleSubtreeStream stream_brackedAnnotationAssign=new RewriteRuleSubtreeStream(adaptor,"rule brackedAnnotationAssign");
        try {
            // JVM.g:381:3: ( AnnotationDefault DefaultValue ( AnnotationAssign -> ^( AnnotationDefault DefaultValue AnnotationAssign ) | brackedAnnotationAssign -> ^( AnnotationDefault DefaultValue brackedAnnotationAssign ) ) )
            // JVM.g:381:5: AnnotationDefault DefaultValue ( AnnotationAssign -> ^( AnnotationDefault DefaultValue AnnotationAssign ) | brackedAnnotationAssign -> ^( AnnotationDefault DefaultValue brackedAnnotationAssign ) )
            {
            AnnotationDefault218=(Token)match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault2886); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AnnotationDefault.add(AnnotationDefault218);


            DefaultValue219=(Token)match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault2889); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DefaultValue.add(DefaultValue219);


            // JVM.g:382:3: ( AnnotationAssign -> ^( AnnotationDefault DefaultValue AnnotationAssign ) | brackedAnnotationAssign -> ^( AnnotationDefault DefaultValue brackedAnnotationAssign ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==AnnotationAssign) ) {
                alt54=1;
            }
            else if ( (LA54_0==LBRACK) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // JVM.g:382:5: AnnotationAssign
                    {
                    AnnotationAssign220=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationDefault2896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AnnotationAssign.add(AnnotationAssign220);


                    // AST REWRITE
                    // elements: AnnotationDefault, DefaultValue, AnnotationAssign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 382:41: -> ^( AnnotationDefault DefaultValue AnnotationAssign )
                    {
                        // JVM.g:382:44: ^( AnnotationDefault DefaultValue AnnotationAssign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_AnnotationDefault.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_DefaultValue.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_AnnotationAssign.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:383:5: brackedAnnotationAssign
                    {
                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationDefault2932);
                    brackedAnnotationAssign221=brackedAnnotationAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_brackedAnnotationAssign.add(brackedAnnotationAssign221.getTree());

                    // AST REWRITE
                    // elements: brackedAnnotationAssign, AnnotationDefault, DefaultValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 383:41: -> ^( AnnotationDefault DefaultValue brackedAnnotationAssign )
                    {
                        // JVM.g:383:44: ^( AnnotationDefault DefaultValue brackedAnnotationAssign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_AnnotationDefault.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_DefaultValue.nextNode()
                        );

                        adaptor.addChild(root_1, stream_brackedAnnotationAssign.nextTree());

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
    // $ANTLR end "annotationDefault"


    public static class methodSignatureInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodSignatureInfo"
    // JVM.g:387:1: methodSignatureInfo : LPAREN ( bytecodeType )* RPAREN returnDescriptor -> ( ^( ARGNAME bytecodeType ) )* ^( RETVALUE returnDescriptor ) ;
    public final JVMParser.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        JVMParser.methodSignatureInfo_return retval = new JVMParser.methodSignatureInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN222=null;
        Token RPAREN224=null;
        JVMParser.bytecodeType_return bytecodeType223 =null;

        JVMParser.returnDescriptor_return returnDescriptor225 =null;


        Object LPAREN222_tree=null;
        Object RPAREN224_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_bytecodeType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeType");
        RewriteRuleSubtreeStream stream_returnDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule returnDescriptor");
        try {
            // JVM.g:388:3: ( LPAREN ( bytecodeType )* RPAREN returnDescriptor -> ( ^( ARGNAME bytecodeType ) )* ^( RETVALUE returnDescriptor ) )
            // JVM.g:388:5: LPAREN ( bytecodeType )* RPAREN returnDescriptor
            {
            LPAREN222=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodSignatureInfo2974); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN222);


            // JVM.g:388:12: ( bytecodeType )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==BaseType||LA55_0==IDENTIFIER||LA55_0==INTERNALTYPE||LA55_0==LBRACK) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // JVM.g:388:12: bytecodeType
            	    {
            	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo2976);
            	    bytecodeType223=bytecodeType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeType.add(bytecodeType223.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            RPAREN224=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodSignatureInfo2979); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN224);


            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo2981);
            returnDescriptor225=returnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_returnDescriptor.add(returnDescriptor225.getTree());

            // AST REWRITE
            // elements: bytecodeType, returnDescriptor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 388:51: -> ( ^( ARGNAME bytecodeType ) )* ^( RETVALUE returnDescriptor )
            {
                // JVM.g:388:54: ( ^( ARGNAME bytecodeType ) )*
                while ( stream_bytecodeType.hasNext() ) {
                    // JVM.g:388:54: ^( ARGNAME bytecodeType )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(ARGNAME, "ARGNAME")
                    , root_1);

                    adaptor.addChild(root_1, stream_bytecodeType.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_bytecodeType.reset();

                // JVM.g:388:79: ^( RETVALUE returnDescriptor )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETVALUE, "RETVALUE")
                , root_1);

                adaptor.addChild(root_1, stream_returnDescriptor.nextTree());

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
    // JVM.g:391:1: returnDescriptor : ( bytecodeType | VoidType );
    public final JVMParser.returnDescriptor_return returnDescriptor() throws RecognitionException {
        JVMParser.returnDescriptor_return retval = new JVMParser.returnDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VoidType227=null;
        JVMParser.bytecodeType_return bytecodeType226 =null;


        Object VoidType227_tree=null;

        try {
            // JVM.g:392:3: ( bytecodeType | VoidType )
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
                    // JVM.g:392:5: bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor3010);
                    bytecodeType226=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType226.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:392:20: VoidType
                    {
                    root_0 = (Object)adaptor.nil();


                    VoidType227=(Token)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor3014); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VoidType227_tree = 
                    (Object)adaptor.create(VoidType227)
                    ;
                    adaptor.addChild(root_0, VoidType227_tree);
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


    public static class methodDeprecatedInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDeprecatedInfo"
    // JVM.g:395:1: methodDeprecatedInfo : BOOLEANLITERAL ;
    public final JVMParser.methodDeprecatedInfo_return methodDeprecatedInfo() throws RecognitionException {
        JVMParser.methodDeprecatedInfo_return retval = new JVMParser.methodDeprecatedInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEANLITERAL228=null;

        Object BOOLEANLITERAL228_tree=null;

        try {
            // JVM.g:396:3: ( BOOLEANLITERAL )
            // JVM.g:396:5: BOOLEANLITERAL
            {
            root_0 = (Object)adaptor.nil();


            BOOLEANLITERAL228=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_methodDeprecatedInfo3029); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEANLITERAL228_tree = 
            (Object)adaptor.create(BOOLEANLITERAL228)
            ;
            adaptor.addChild(root_0, BOOLEANLITERAL228_tree);
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
    // $ANTLR end "methodDeprecatedInfo"


    public static class method_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_modifier"
    // JVM.g:399:1: method_modifier : ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE );
    public final JVMParser.method_modifier_return method_modifier() throws RecognitionException {
        JVMParser.method_modifier_return retval = new JVMParser.method_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set229=null;

        Object set229_tree=null;

        try {
            // JVM.g:400:3: ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set229=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL||input.LA(1)==NATIVE||input.LA(1)==STATIC||input.LA(1)==SYNCHRONIZED ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set229)
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
    // JVM.g:403:1: method_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMParser.method_visual_modifier_return method_visual_modifier() throws RecognitionException {
        JVMParser.method_visual_modifier_return retval = new JVMParser.method_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set230=null;

        Object set230_tree=null;

        try {
            // JVM.g:404:3: ( PUBLIC | PRIVATE | PROTECTED )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set230=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set230)
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
    // JVM.g:407:1: arguments : LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN -> ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) ;
    public final JVMParser.arguments_return arguments() throws RecognitionException {
        JVMParser.arguments_return retval = new JVMParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN231=null;
        Token DOT233=null;
        Token DOT234=null;
        Token DOT235=null;
        Token RPAREN236=null;
        JVMParser.typeList_return typeList232 =null;


        Object LPAREN231_tree=null;
        Object DOT233_tree=null;
        Object DOT234_tree=null;
        Object DOT235_tree=null;
        Object RPAREN236_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            // JVM.g:408:3: ( LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN -> ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? ) )
            // JVM.g:408:5: LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN
            {
            LPAREN231=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments3100); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN231);


            // JVM.g:408:12: ( typeList )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==BOOLEAN||(LA57_0 >= BYTE && LA57_0 <= BaseType)||LA57_0==CHAR||LA57_0==CLASS||LA57_0==Constant_type||LA57_0==DEFAULT||LA57_0==DOUBLE||LA57_0==EXTENDS||LA57_0==FLOAT||(LA57_0 >= IDENTIFIER && LA57_0 <= IMPLEMENTS)||LA57_0==INT||LA57_0==LONG||LA57_0==NORMALTYPE||LA57_0==SHORT||LA57_0==SUPER||LA57_0==THROWS||LA57_0==VOID||LA57_0==VoidType) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // JVM.g:408:12: typeList
                    {
                    pushFollow(FOLLOW_typeList_in_arguments3102);
                    typeList232=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList232.getTree());

                    }
                    break;

            }


            // JVM.g:408:22: ( DOT DOT DOT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==DOT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // JVM.g:408:23: DOT DOT DOT
                    {
                    DOT233=(Token)match(input,DOT,FOLLOW_DOT_in_arguments3106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT233);


                    DOT234=(Token)match(input,DOT,FOLLOW_DOT_in_arguments3108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT234);


                    DOT235=(Token)match(input,DOT,FOLLOW_DOT_in_arguments3110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT235);


                    }
                    break;

            }


            RPAREN236=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments3114); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN236);


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
            // 408:44: -> ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
            {
                // JVM.g:408:47: ^( UNITARGUMENTS ( typeList )? ( DOT DOT DOT )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITARGUMENTS, "UNITARGUMENTS")
                , root_1);

                // JVM.g:408:63: ( typeList )?
                if ( stream_typeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeList.nextTree());

                }
                stream_typeList.reset();

                // JVM.g:408:73: ( DOT DOT DOT )?
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
    // JVM.g:415:1: body : ( Synthetic BOOLEANLITERAL )? Code codeBlock ( bodyExtension )* -> ^( UNITBODY ( ^( Synthetic BOOLEANLITERAL ) )? ^( Code codeBlock ) ( bodyExtension )* ) ;
    public final JVMParser.body_return body() throws RecognitionException {
        JVMParser.body_return retval = new JVMParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Synthetic237=null;
        Token BOOLEANLITERAL238=null;
        Token Code239=null;
        JVMParser.codeBlock_return codeBlock240 =null;

        JVMParser.bodyExtension_return bodyExtension241 =null;


        Object Synthetic237_tree=null;
        Object BOOLEANLITERAL238_tree=null;
        Object Code239_tree=null;
        RewriteRuleTokenStream stream_Synthetic=new RewriteRuleTokenStream(adaptor,"token Synthetic");
        RewriteRuleTokenStream stream_BOOLEANLITERAL=new RewriteRuleTokenStream(adaptor,"token BOOLEANLITERAL");
        RewriteRuleTokenStream stream_Code=new RewriteRuleTokenStream(adaptor,"token Code");
        RewriteRuleSubtreeStream stream_bodyExtension=new RewriteRuleSubtreeStream(adaptor,"rule bodyExtension");
        RewriteRuleSubtreeStream stream_codeBlock=new RewriteRuleSubtreeStream(adaptor,"rule codeBlock");
        try {
            // JVM.g:416:3: ( ( Synthetic BOOLEANLITERAL )? Code codeBlock ( bodyExtension )* -> ^( UNITBODY ( ^( Synthetic BOOLEANLITERAL ) )? ^( Code codeBlock ) ( bodyExtension )* ) )
            // JVM.g:417:5: ( Synthetic BOOLEANLITERAL )? Code codeBlock ( bodyExtension )*
            {
            // JVM.g:417:5: ( Synthetic BOOLEANLITERAL )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Synthetic) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // JVM.g:417:6: Synthetic BOOLEANLITERAL
                    {
                    Synthetic237=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_body3159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Synthetic.add(Synthetic237);


                    BOOLEANLITERAL238=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_body3161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEANLITERAL.add(BOOLEANLITERAL238);


                    }
                    break;

            }


            Code239=(Token)match(input,Code,FOLLOW_Code_in_body3169); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Code.add(Code239);


            pushFollow(FOLLOW_codeBlock_in_body3176);
            codeBlock240=codeBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_codeBlock.add(codeBlock240.getTree());

            // JVM.g:420:5: ( bodyExtension )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==ExceptionTable||(LA60_0 >= LineNumberTable && LA60_0 <= LocalVariableTypeTable)||(LA60_0 >= StackMap && LA60_0 <= StackMapTable)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // JVM.g:420:5: bodyExtension
            	    {
            	    pushFollow(FOLLOW_bodyExtension_in_body3182);
            	    bodyExtension241=bodyExtension();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bodyExtension.add(bodyExtension241.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            // AST REWRITE
            // elements: bodyExtension, codeBlock, BOOLEANLITERAL, Code, Synthetic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 420:20: -> ^( UNITBODY ( ^( Synthetic BOOLEANLITERAL ) )? ^( Code codeBlock ) ( bodyExtension )* )
            {
                // JVM.g:420:23: ^( UNITBODY ( ^( Synthetic BOOLEANLITERAL ) )? ^( Code codeBlock ) ( bodyExtension )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNITBODY, "UNITBODY")
                , root_1);

                // JVM.g:420:34: ( ^( Synthetic BOOLEANLITERAL ) )?
                if ( stream_BOOLEANLITERAL.hasNext()||stream_Synthetic.hasNext() ) {
                    // JVM.g:420:34: ^( Synthetic BOOLEANLITERAL )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_Synthetic.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, 
                    stream_BOOLEANLITERAL.nextNode()
                    );

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_BOOLEANLITERAL.reset();
                stream_Synthetic.reset();

                // JVM.g:420:63: ^( Code codeBlock )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_Code.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_codeBlock.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // JVM.g:420:81: ( bodyExtension )*
                while ( stream_bodyExtension.hasNext() ) {
                    adaptor.addChild(root_1, stream_bodyExtension.nextTree());

                }
                stream_bodyExtension.reset();

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
    // $ANTLR end "body"


    public static class bodyExtension_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bodyExtension"
    // JVM.g:423:1: bodyExtension : ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable lineNumberTable -> ^( LineNumberTable lineNumberTable ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) ) ;
    public final JVMParser.bodyExtension_return bodyExtension() throws RecognitionException {
        JVMParser.bodyExtension_return retval = new JVMParser.bodyExtension_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ExceptionTable242=null;
        Token LineNumberTable244=null;
        Token LocalVariableTable246=null;
        Token LocalVariableTypeTable248=null;
        Token StackMapTable250=null;
        Token StackMap252=null;
        JVMParser.exceptionTable_return exceptionTable243 =null;

        JVMParser.lineNumberTable_return lineNumberTable245 =null;

        JVMParser.localVariableTable_return localVariableTable247 =null;

        JVMParser.localVariableTable_return localVariableTable249 =null;

        JVMParser.stackMapTable_return stackMapTable251 =null;

        JVMParser.stackMapTypeTable_return stackMapTypeTable253 =null;


        Object ExceptionTable242_tree=null;
        Object LineNumberTable244_tree=null;
        Object LocalVariableTable246_tree=null;
        Object LocalVariableTypeTable248_tree=null;
        Object StackMapTable250_tree=null;
        Object StackMap252_tree=null;
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
            // JVM.g:424:3: ( ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable lineNumberTable -> ^( LineNumberTable lineNumberTable ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) ) )
            // JVM.g:425:3: ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable lineNumberTable -> ^( LineNumberTable lineNumberTable ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) )
            {
            // JVM.g:425:3: ( ExceptionTable exceptionTable -> ^( ExceptionTable exceptionTable ) | LineNumberTable lineNumberTable -> ^( LineNumberTable lineNumberTable ) | LocalVariableTable localVariableTable -> ^( LocalVariableTable localVariableTable ) | LocalVariableTypeTable localVariableTable -> ^( LocalVariableTypeTable localVariableTable ) | StackMapTable stackMapTable -> ^( StackMapTable stackMapTable ) | StackMap stackMapTypeTable -> ^( StackMap stackMapTypeTable ) )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // JVM.g:425:5: ExceptionTable exceptionTable
                    {
                    ExceptionTable242=(Token)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension3224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ExceptionTable.add(ExceptionTable242);


                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension3227);
                    exceptionTable243=exceptionTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exceptionTable.add(exceptionTable243.getTree());

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
                    // 425:49: -> ^( ExceptionTable exceptionTable )
                    {
                        // JVM.g:425:52: ^( ExceptionTable exceptionTable )
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
                    // JVM.g:426:5: LineNumberTable lineNumberTable
                    {
                    LineNumberTable244=(Token)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension3255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LineNumberTable.add(LineNumberTable244);


                    pushFollow(FOLLOW_lineNumberTable_in_bodyExtension3258);
                    lineNumberTable245=lineNumberTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lineNumberTable.add(lineNumberTable245.getTree());

                    // AST REWRITE
                    // elements: lineNumberTable, LineNumberTable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 426:49: -> ^( LineNumberTable lineNumberTable )
                    {
                        // JVM.g:426:52: ^( LineNumberTable lineNumberTable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LineNumberTable.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_lineNumberTable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:427:5: LocalVariableTable localVariableTable
                    {
                    LocalVariableTable246=(Token)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension3284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LocalVariableTable.add(LocalVariableTable246);


                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension3287);
                    localVariableTable247=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_localVariableTable.add(localVariableTable247.getTree());

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
                    // 427:49: -> ^( LocalVariableTable localVariableTable )
                    {
                        // JVM.g:427:52: ^( LocalVariableTable localVariableTable )
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
                    // JVM.g:428:5: LocalVariableTypeTable localVariableTable
                    {
                    LocalVariableTypeTable248=(Token)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension3307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LocalVariableTypeTable.add(LocalVariableTypeTable248);


                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension3310);
                    localVariableTable249=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_localVariableTable.add(localVariableTable249.getTree());

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
                    // 428:49: -> ^( LocalVariableTypeTable localVariableTable )
                    {
                        // JVM.g:428:52: ^( LocalVariableTypeTable localVariableTable )
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
                    // JVM.g:429:5: StackMapTable stackMapTable
                    {
                    StackMapTable250=(Token)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension3326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StackMapTable.add(StackMapTable250);


                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension3328);
                    stackMapTable251=stackMapTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stackMapTable.add(stackMapTable251.getTree());

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
                    // 429:49: -> ^( StackMapTable stackMapTable )
                    {
                        // JVM.g:429:52: ^( StackMapTable stackMapTable )
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
                    // JVM.g:430:5: StackMap stackMapTypeTable
                    {
                    StackMap252=(Token)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension3358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StackMap.add(StackMap252);


                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension3360);
                    stackMapTypeTable253=stackMapTypeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stackMapTypeTable.add(stackMapTypeTable253.getTree());

                    // AST REWRITE
                    // elements: stackMapTypeTable, StackMap
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 430:49: -> ^( StackMap stackMapTypeTable )
                    {
                        // JVM.g:430:52: ^( StackMap stackMapTypeTable )
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
    // JVM.g:434:1: codeBlock : variables ( instructionSet )* codeBlockEnd -> ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) ;
    public final JVMParser.codeBlock_return codeBlock() throws RecognitionException {
        JVMParser.codeBlock_return retval = new JVMParser.codeBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.variables_return variables254 =null;

        JVMParser.instructionSet_return instructionSet255 =null;

        JVMParser.codeBlockEnd_return codeBlockEnd256 =null;


        RewriteRuleSubtreeStream stream_codeBlockEnd=new RewriteRuleSubtreeStream(adaptor,"rule codeBlockEnd");
        RewriteRuleSubtreeStream stream_instructionSet=new RewriteRuleSubtreeStream(adaptor,"rule instructionSet");
        RewriteRuleSubtreeStream stream_variables=new RewriteRuleSubtreeStream(adaptor,"rule variables");
        try {
            // JVM.g:435:3: ( variables ( instructionSet )* codeBlockEnd -> ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd ) )
            // JVM.g:435:5: variables ( instructionSet )* codeBlockEnd
            {
            pushFollow(FOLLOW_variables_in_codeBlock3402);
            variables254=variables();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variables.add(variables254.getTree());

            // JVM.g:436:5: ( instructionSet )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==INTLITERAL) ) {
                    int LA62_1 = input.LA(2);

                    if ( (LA62_1==COLON) ) {
                        int LA62_2 = input.LA(3);

                        if ( (LA62_2==IDENTIFIER) ) {
                            switch ( input.LA(4) ) {
                            case CPINDEX:
                            case LBRACE:
                                {
                                alt62=1;
                                }
                                break;
                            case INTLITERAL:
                                {
                                int LA62_5 = input.LA(5);

                                if ( ((LA62_5 >= COLON && LA62_5 <= COMMA)||LA62_5==INTLITERAL) ) {
                                    alt62=1;
                                }


                                }
                                break;
                            case BOOLEAN:
                                {
                                int LA62_7 = input.LA(5);

                                if ( (LA62_7==INTLITERAL) ) {
                                    alt62=1;
                                }


                                }
                                break;
                            case DOUBLE:
                            case FLOAT:
                                {
                                int LA62_8 = input.LA(5);

                                if ( (LA62_8==INTLITERAL) ) {
                                    alt62=1;
                                }


                                }
                                break;
                            case BYTE:
                            case CHAR:
                            case INT:
                            case LONG:
                            case SHORT:
                                {
                                int LA62_9 = input.LA(5);

                                if ( (LA62_9==INTLITERAL) ) {
                                    alt62=1;
                                }


                                }
                                break;
                            case VOID:
                                {
                                int LA62_10 = input.LA(5);

                                if ( (LA62_10==INTLITERAL) ) {
                                    alt62=1;
                                }


                                }
                                break;

                            }

                        }


                    }


                }


                switch (alt62) {
            	case 1 :
            	    // JVM.g:436:5: instructionSet
            	    {
            	    pushFollow(FOLLOW_instructionSet_in_codeBlock3409);
            	    instructionSet255=instructionSet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_instructionSet.add(instructionSet255.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock3416);
            codeBlockEnd256=codeBlockEnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_codeBlockEnd.add(codeBlockEnd256.getTree());

            // AST REWRITE
            // elements: codeBlockEnd, instructionSet, variables
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 437:49: -> ^( VARINFO variables ) ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
            {
                // JVM.g:437:52: ^( VARINFO variables )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VARINFO, "VARINFO")
                , root_1);

                adaptor.addChild(root_1, stream_variables.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // JVM.g:437:73: ^( INSTRUCTION ( instructionSet )* codeBlockEnd )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INSTRUCTION, "INSTRUCTION")
                , root_1);

                // JVM.g:437:87: ( instructionSet )*
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
    // JVM.g:440:1: instructionSet : ( codeLine | javaSwitch );
    public final JVMParser.instructionSet_return instructionSet() throws RecognitionException {
        JVMParser.instructionSet_return retval = new JVMParser.instructionSet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.codeLine_return codeLine257 =null;

        JVMParser.javaSwitch_return javaSwitch258 =null;



        try {
            // JVM.g:441:3: ( codeLine | javaSwitch )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==INTLITERAL) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==COLON) ) {
                    int LA63_2 = input.LA(3);

                    if ( (LA63_2==IDENTIFIER) ) {
                        int LA63_3 = input.LA(4);

                        if ( (LA63_3==LBRACE) ) {
                            alt63=2;
                        }
                        else if ( (LA63_3==BOOLEAN||LA63_3==BYTE||LA63_3==CHAR||LA63_3==CPINDEX||LA63_3==DOUBLE||LA63_3==FLOAT||LA63_3==INT||LA63_3==INTLITERAL||LA63_3==LONG||LA63_3==SHORT||LA63_3==VOID) ) {
                            alt63=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 63, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // JVM.g:441:5: codeLine
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_codeLine_in_instructionSet3477);
                    codeLine257=codeLine();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, codeLine257.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:441:16: javaSwitch
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_javaSwitch_in_instructionSet3481);
                    javaSwitch258=javaSwitch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaSwitch258.getTree());

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
    // JVM.g:444:1: codeLine : pc IDENTIFIER ( codeValue )? -> ^( IDENTIFIER pc ( codeValue )? ) ;
    public final JVMParser.codeLine_return codeLine() throws RecognitionException {
        JVMParser.codeLine_return retval = new JVMParser.codeLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER260=null;
        JVMParser.pc_return pc259 =null;

        JVMParser.codeValue_return codeValue261 =null;


        Object IDENTIFIER260_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        RewriteRuleSubtreeStream stream_codeValue=new RewriteRuleSubtreeStream(adaptor,"rule codeValue");
        try {
            // JVM.g:445:3: ( pc IDENTIFIER ( codeValue )? -> ^( IDENTIFIER pc ( codeValue )? ) )
            // JVM.g:445:5: pc IDENTIFIER ( codeValue )?
            {
            pushFollow(FOLLOW_pc_in_codeLine3494);
            pc259=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc259.getTree());

            IDENTIFIER260=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine3496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER260);


            // JVM.g:445:19: ( codeValue )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==BOOLEAN||LA64_0==BYTE||LA64_0==CHAR||LA64_0==CPINDEX||LA64_0==DOUBLE||LA64_0==FLOAT||LA64_0==INT||LA64_0==LONG||LA64_0==SHORT||LA64_0==VOID) ) {
                alt64=1;
            }
            else if ( (LA64_0==INTLITERAL) ) {
                int LA64_2 = input.LA(2);

                if ( (LA64_2==COMMA||LA64_2==INTLITERAL) ) {
                    alt64=1;
                }
            }
            switch (alt64) {
                case 1 :
                    // JVM.g:445:19: codeValue
                    {
                    pushFollow(FOLLOW_codeValue_in_codeLine3498);
                    codeValue261=codeValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_codeValue.add(codeValue261.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENTIFIER, pc, codeValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 445:30: -> ^( IDENTIFIER pc ( codeValue )? )
            {
                // JVM.g:445:33: ^( IDENTIFIER pc ( codeValue )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                // JVM.g:445:49: ( codeValue )?
                if ( stream_codeValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_codeValue.nextTree());

                }
                stream_codeValue.reset();

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
    // JVM.g:448:1: codeBlockEnd : pc IDENTIFIER ( logic3 )? -> ^( IDENTIFIER pc ( logic3 )? ) ;
    public final JVMParser.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        JVMParser.codeBlockEnd_return retval = new JVMParser.codeBlockEnd_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER263=null;
        JVMParser.pc_return pc262 =null;

        JVMParser.logic3_return logic3264 =null;


        Object IDENTIFIER263_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        RewriteRuleSubtreeStream stream_logic3=new RewriteRuleSubtreeStream(adaptor,"rule logic3");
        try {
            // JVM.g:449:3: ( pc IDENTIFIER ( logic3 )? -> ^( IDENTIFIER pc ( logic3 )? ) )
            // JVM.g:449:5: pc IDENTIFIER ( logic3 )?
            {
            pushFollow(FOLLOW_pc_in_codeBlockEnd3523);
            pc262=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc262.getTree());

            IDENTIFIER263=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd3525); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER263);


            // JVM.g:449:19: ( logic3 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==INTLITERAL) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // JVM.g:449:19: logic3
                    {
                    pushFollow(FOLLOW_logic3_in_codeBlockEnd3527);
                    logic3264=logic3();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logic3.add(logic3264.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: pc, IDENTIFIER, logic3
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 449:31: -> ^( IDENTIFIER pc ( logic3 )? )
            {
                // JVM.g:449:34: ^( IDENTIFIER pc ( logic3 )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_pc.nextTree());

                // JVM.g:449:50: ( logic3 )?
                if ( stream_logic3.hasNext() ) {
                    adaptor.addChild(root_1, stream_logic3.nextTree());

                }
                stream_logic3.reset();

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


    public static class codeValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeValue"
    // JVM.g:452:1: codeValue : ( logic | logic2 | logic3 | logic4 | primitiveType );
    public final JVMParser.codeValue_return codeValue() throws RecognitionException {
        JVMParser.codeValue_return retval = new JVMParser.codeValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.logic_return logic265 =null;

        JVMParser.logic2_return logic2266 =null;

        JVMParser.logic3_return logic3267 =null;

        JVMParser.logic4_return logic4268 =null;

        JVMParser.primitiveType_return primitiveType269 =null;



        try {
            // JVM.g:453:3: ( logic | logic2 | logic3 | logic4 | primitiveType )
            int alt66=5;
            switch ( input.LA(1) ) {
            case CPINDEX:
                {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==COMMA) ) {
                    alt66=1;
                }
                else if ( (LA66_1==INTLITERAL) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA66_2 = input.LA(2);

                if ( (LA66_2==COMMA) ) {
                    alt66=4;
                }
                else if ( (LA66_2==INTLITERAL) ) {
                    alt66=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 2, input);

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
                alt66=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }

            switch (alt66) {
                case 1 :
                    // JVM.g:453:5: logic
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic_in_codeValue3558);
                    logic265=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic265.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:454:5: logic2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic2_in_codeValue3565);
                    logic2266=logic2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic2266.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:455:5: logic3
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic3_in_codeValue3572);
                    logic3267=logic3();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic3267.getTree());

                    }
                    break;
                case 4 :
                    // JVM.g:456:5: logic4
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic4_in_codeValue3578);
                    logic4268=logic4();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic4268.getTree());

                    }
                    break;
                case 5 :
                    // JVM.g:457:5: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_codeValue3584);
                    primitiveType269=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType269.getTree());

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
    // $ANTLR end "codeValue"


    public static class logic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic"
    // JVM.g:460:1: logic : CPINDEX COMMA INTLITERAL ;
    public final JVMParser.logic_return logic() throws RecognitionException {
        JVMParser.logic_return retval = new JVMParser.logic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX270=null;
        Token COMMA271=null;
        Token INTLITERAL272=null;

        Object CPINDEX270_tree=null;
        Object COMMA271_tree=null;
        Object INTLITERAL272_tree=null;

        try {
            // JVM.g:461:3: ( CPINDEX COMMA INTLITERAL )
            // JVM.g:461:5: CPINDEX COMMA INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX270=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_logic3599); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX270_tree = 
            (Object)adaptor.create(CPINDEX270)
            ;
            adaptor.addChild(root_0, CPINDEX270_tree);
            }

            COMMA271=(Token)match(input,COMMA,FOLLOW_COMMA_in_logic3601); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA271_tree = 
            (Object)adaptor.create(COMMA271)
            ;
            adaptor.addChild(root_0, COMMA271_tree);
            }

            INTLITERAL272=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic3603); if (state.failed) return retval;
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
    // $ANTLR end "logic"


    public static class logic2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic2"
    // JVM.g:464:1: logic2 : CPINDEX ;
    public final JVMParser.logic2_return logic2() throws RecognitionException {
        JVMParser.logic2_return retval = new JVMParser.logic2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX273=null;

        Object CPINDEX273_tree=null;

        try {
            // JVM.g:465:3: ( CPINDEX )
            // JVM.g:465:5: CPINDEX
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX273=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_logic23618); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX273_tree = 
            (Object)adaptor.create(CPINDEX273)
            ;
            adaptor.addChild(root_0, CPINDEX273_tree);
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
    // $ANTLR end "logic2"


    public static class logic3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic3"
    // JVM.g:468:1: logic3 : INTLITERAL ;
    public final JVMParser.logic3_return logic3() throws RecognitionException {
        JVMParser.logic3_return retval = new JVMParser.logic3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL274=null;

        Object INTLITERAL274_tree=null;

        try {
            // JVM.g:469:3: ( INTLITERAL )
            // JVM.g:469:5: INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL274=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic33633); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL274_tree = 
            (Object)adaptor.create(INTLITERAL274)
            ;
            adaptor.addChild(root_0, INTLITERAL274_tree);
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
    // $ANTLR end "logic3"


    public static class logic4_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic4"
    // JVM.g:472:1: logic4 : INTLITERAL COMMA INTLITERAL ;
    public final JVMParser.logic4_return logic4() throws RecognitionException {
        JVMParser.logic4_return retval = new JVMParser.logic4_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL275=null;
        Token COMMA276=null;
        Token INTLITERAL277=null;

        Object INTLITERAL275_tree=null;
        Object COMMA276_tree=null;
        Object INTLITERAL277_tree=null;

        try {
            // JVM.g:473:3: ( INTLITERAL COMMA INTLITERAL )
            // JVM.g:473:5: INTLITERAL COMMA INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL275=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic43648); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL275_tree = 
            (Object)adaptor.create(INTLITERAL275)
            ;
            adaptor.addChild(root_0, INTLITERAL275_tree);
            }

            COMMA276=(Token)match(input,COMMA,FOLLOW_COMMA_in_logic43650); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA276_tree = 
            (Object)adaptor.create(COMMA276)
            ;
            adaptor.addChild(root_0, COMMA276_tree);
            }

            INTLITERAL277=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic43652); if (state.failed) return retval;
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
    // $ANTLR end "logic4"


    public static class variables_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variables"
    // JVM.g:476:1: variables : variable COMMA variable COMMA variable -> variable variable variable ;
    public final JVMParser.variables_return variables() throws RecognitionException {
        JVMParser.variables_return retval = new JVMParser.variables_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA279=null;
        Token COMMA281=null;
        JVMParser.variable_return variable278 =null;

        JVMParser.variable_return variable280 =null;

        JVMParser.variable_return variable282 =null;


        Object COMMA279_tree=null;
        Object COMMA281_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // JVM.g:477:3: ( variable COMMA variable COMMA variable -> variable variable variable )
            // JVM.g:477:5: variable COMMA variable COMMA variable
            {
            pushFollow(FOLLOW_variable_in_variables3665);
            variable278=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable278.getTree());

            COMMA279=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables3667); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA279);


            pushFollow(FOLLOW_variable_in_variables3669);
            variable280=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable280.getTree());

            COMMA281=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables3671); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA281);


            pushFollow(FOLLOW_variable_in_variables3673);
            variable282=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable282.getTree());

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
            // 477:44: -> variable variable variable
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
    // JVM.g:480:1: variable : IDENTIFIER ASSIGN INTLITERAL -> ^( ASSIGN IDENTIFIER INTLITERAL ) ;
    public final JVMParser.variable_return variable() throws RecognitionException {
        JVMParser.variable_return retval = new JVMParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER283=null;
        Token ASSIGN284=null;
        Token INTLITERAL285=null;

        Object IDENTIFIER283_tree=null;
        Object ASSIGN284_tree=null;
        Object INTLITERAL285_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // JVM.g:481:3: ( IDENTIFIER ASSIGN INTLITERAL -> ^( ASSIGN IDENTIFIER INTLITERAL ) )
            // JVM.g:481:5: IDENTIFIER ASSIGN INTLITERAL
            {
            IDENTIFIER283=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable3694); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER283);


            ASSIGN284=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable3696); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN284);


            INTLITERAL285=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable3698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL285);


            // AST REWRITE
            // elements: IDENTIFIER, INTLITERAL, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 481:44: -> ^( ASSIGN IDENTIFIER INTLITERAL )
            {
                // JVM.g:481:47: ^( ASSIGN IDENTIFIER INTLITERAL )
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
    // JVM.g:484:1: javaSwitch : pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE -> ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) ;
    public final JVMParser.javaSwitch_return javaSwitch() throws RecognitionException {
        JVMParser.javaSwitch_return retval = new JVMParser.javaSwitch_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER287=null;
        Token LBRACE288=null;
        Token RBRACE291=null;
        JVMParser.pc_return pc286 =null;

        JVMParser.switchLine_return switchLine289 =null;

        JVMParser.switchDefaultLine_return switchDefaultLine290 =null;


        Object IDENTIFIER287_tree=null;
        Object LBRACE288_tree=null;
        Object RBRACE291_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_switchDefaultLine=new RewriteRuleSubtreeStream(adaptor,"rule switchDefaultLine");
        RewriteRuleSubtreeStream stream_pc=new RewriteRuleSubtreeStream(adaptor,"rule pc");
        RewriteRuleSubtreeStream stream_switchLine=new RewriteRuleSubtreeStream(adaptor,"rule switchLine");
        try {
            // JVM.g:485:3: ( pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE -> ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) ) )
            // JVM.g:485:5: pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE
            {
            pushFollow(FOLLOW_pc_in_javaSwitch3733);
            pc286=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pc.add(pc286.getTree());

            IDENTIFIER287=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch3735); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER287);


            LBRACE288=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_javaSwitch3741); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE288);


            // JVM.g:487:5: ( switchLine )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==INTLITERAL) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // JVM.g:487:5: switchLine
            	    {
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch3748);
            	    switchLine289=switchLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_switchLine.add(switchLine289.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch3755);
            switchDefaultLine290=switchDefaultLine();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_switchDefaultLine.add(switchDefaultLine290.getTree());

            RBRACE291=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_javaSwitch3761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE291);


            // AST REWRITE
            // elements: switchDefaultLine, pc, switchLine, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 489:45: -> ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
            {
                // JVM.g:489:48: ^( SWITCH ^( IDENTIFIER pc ( switchLine )* switchDefaultLine ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SWITCH, "SWITCH")
                , root_1);

                // JVM.g:489:57: ^( IDENTIFIER pc ( switchLine )* switchDefaultLine )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_pc.nextTree());

                // JVM.g:489:73: ( switchLine )*
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
    // JVM.g:492:1: switchLine : pc INTLITERAL ;
    public final JVMParser.switchLine_return switchLine() throws RecognitionException {
        JVMParser.switchLine_return retval = new JVMParser.switchLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL293=null;
        JVMParser.pc_return pc292 =null;


        Object INTLITERAL293_tree=null;

        try {
            // JVM.g:493:3: ( pc INTLITERAL )
            // JVM.g:493:5: pc INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_switchLine3826);
            pc292=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc292.getTree());

            INTLITERAL293=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine3828); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL293_tree = 
            (Object)adaptor.create(INTLITERAL293)
            ;
            adaptor.addChild(root_0, INTLITERAL293_tree);
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
    // JVM.g:496:1: switchDefaultLine : DEFAULT COLON INTLITERAL -> ^( DEFAULT INTLITERAL ) ;
    public final JVMParser.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        JVMParser.switchDefaultLine_return retval = new JVMParser.switchDefaultLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT294=null;
        Token COLON295=null;
        Token INTLITERAL296=null;

        Object DEFAULT294_tree=null;
        Object COLON295_tree=null;
        Object INTLITERAL296_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");

        try {
            // JVM.g:497:3: ( DEFAULT COLON INTLITERAL -> ^( DEFAULT INTLITERAL ) )
            // JVM.g:497:5: DEFAULT COLON INTLITERAL
            {
            DEFAULT294=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine3842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT294);


            COLON295=(Token)match(input,COLON,FOLLOW_COLON_in_switchDefaultLine3844); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON295);


            INTLITERAL296=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine3846); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL296);


            // AST REWRITE
            // elements: INTLITERAL, DEFAULT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 497:45: -> ^( DEFAULT INTLITERAL )
            {
                // JVM.g:497:48: ^( DEFAULT INTLITERAL )
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
    // JVM.g:504:1: throwClause : THROWS javaTypeList -> ^( THROWS javaTypeList ) ;
    public final JVMParser.throwClause_return throwClause() throws RecognitionException {
        JVMParser.throwClause_return retval = new JVMParser.throwClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token THROWS297=null;
        JVMParser.javaTypeList_return javaTypeList298 =null;


        Object THROWS297_tree=null;
        RewriteRuleTokenStream stream_THROWS=new RewriteRuleTokenStream(adaptor,"token THROWS");
        RewriteRuleSubtreeStream stream_javaTypeList=new RewriteRuleSubtreeStream(adaptor,"rule javaTypeList");
        try {
            // JVM.g:505:3: ( THROWS javaTypeList -> ^( THROWS javaTypeList ) )
            // JVM.g:505:5: THROWS javaTypeList
            {
            THROWS297=(Token)match(input,THROWS,FOLLOW_THROWS_in_throwClause3887); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THROWS.add(THROWS297);


            pushFollow(FOLLOW_javaTypeList_in_throwClause3889);
            javaTypeList298=javaTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaTypeList.add(javaTypeList298.getTree());

            // AST REWRITE
            // elements: THROWS, javaTypeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 505:45: -> ^( THROWS javaTypeList )
            {
                // JVM.g:505:49: ^( THROWS javaTypeList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_THROWS.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_javaTypeList.nextTree());

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
    // JVM.g:508:1: throwClauseMethod : THROWS throwType ( COMMA throwType )* -> ^( THROWS ( throwType )+ ) ;
    public final JVMParser.throwClauseMethod_return throwClauseMethod() throws RecognitionException {
        JVMParser.throwClauseMethod_return retval = new JVMParser.throwClauseMethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token THROWS299=null;
        Token COMMA301=null;
        JVMParser.throwType_return throwType300 =null;

        JVMParser.throwType_return throwType302 =null;


        Object THROWS299_tree=null;
        Object COMMA301_tree=null;
        RewriteRuleTokenStream stream_THROWS=new RewriteRuleTokenStream(adaptor,"token THROWS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_throwType=new RewriteRuleSubtreeStream(adaptor,"rule throwType");
        try {
            // JVM.g:509:3: ( THROWS throwType ( COMMA throwType )* -> ^( THROWS ( throwType )+ ) )
            // JVM.g:509:5: THROWS throwType ( COMMA throwType )*
            {
            THROWS299=(Token)match(input,THROWS,FOLLOW_THROWS_in_throwClauseMethod3933); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THROWS.add(THROWS299);


            pushFollow(FOLLOW_throwType_in_throwClauseMethod3935);
            throwType300=throwType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_throwType.add(throwType300.getTree());

            // JVM.g:509:22: ( COMMA throwType )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // JVM.g:509:23: COMMA throwType
            	    {
            	    COMMA301=(Token)match(input,COMMA,FOLLOW_COMMA_in_throwClauseMethod3938); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA301);


            	    pushFollow(FOLLOW_throwType_in_throwClauseMethod3940);
            	    throwType302=throwType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_throwType.add(throwType302.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
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
            // 510:45: -> ^( THROWS ( throwType )+ )
            {
                // JVM.g:510:48: ^( THROWS ( throwType )+ )
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
    // JVM.g:513:1: throwType : ( INTERNALTYPE | IDENTIFIER | NORMALTYPE );
    public final JVMParser.throwType_return throwType() throws RecognitionException {
        JVMParser.throwType_return retval = new JVMParser.throwType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set303=null;

        Object set303_tree=null;

        try {
            // JVM.g:514:3: ( INTERNALTYPE | IDENTIFIER | NORMALTYPE )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set303=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE||input.LA(1)==NORMALTYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set303)
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
    // JVM.g:517:1: exceptionTable : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+ -> ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ( ^( ETENTRY exceptionTableEntry ) )+ ;
    public final JVMParser.exceptionTable_return exceptionTable() throws RecognitionException {
        JVMParser.exceptionTable_return retval = new JVMParser.exceptionTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER304=null;
        Token IDENTIFIER305=null;
        Token IDENTIFIER306=null;
        Token IDENTIFIER307=null;
        JVMParser.exceptionTableEntry_return exceptionTableEntry308 =null;


        Object IDENTIFIER304_tree=null;
        Object IDENTIFIER305_tree=null;
        Object IDENTIFIER306_tree=null;
        Object IDENTIFIER307_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_exceptionTableEntry=new RewriteRuleSubtreeStream(adaptor,"rule exceptionTableEntry");
        try {
            // JVM.g:518:3: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+ -> ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ( ^( ETENTRY exceptionTableEntry ) )+ )
            // JVM.g:518:5: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+
            {
            IDENTIFIER304=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable4031); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER304);


            IDENTIFIER305=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable4033); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER305);


            IDENTIFIER306=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable4035); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER306);


            IDENTIFIER307=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable4037); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER307);


            // JVM.g:519:5: ( exceptionTableEntry )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==INTLITERAL) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // JVM.g:519:5: exceptionTableEntry
            	    {
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable4044);
            	    exceptionTableEntry308=exceptionTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exceptionTableEntry.add(exceptionTableEntry308.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
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
            // 519:26: -> ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ( ^( ETENTRY exceptionTableEntry ) )+
            {
                // JVM.g:519:29: ^( ETHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER )
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

                if ( !(stream_exceptionTableEntry.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exceptionTableEntry.hasNext() ) {
                    // JVM.g:519:85: ^( ETENTRY exceptionTableEntry )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(ETENTRY, "ETENTRY")
                    , root_1);

                    adaptor.addChild(root_1, stream_exceptionTableEntry.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_exceptionTableEntry.reset();

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
    // JVM.g:522:1: exceptionTableEntry : INTLITERAL INTLITERAL INTLITERAL ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE ) ;
    public final JVMParser.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        JVMParser.exceptionTableEntry_return retval = new JVMParser.exceptionTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL309=null;
        Token INTLITERAL310=null;
        Token INTLITERAL311=null;
        Token IDENTIFIER313=null;
        Token CONSTANT_TYPE_ASSIGNABLE314=null;
        JVMParser.primitiveType_return primitiveType312 =null;


        Object INTLITERAL309_tree=null;
        Object INTLITERAL310_tree=null;
        Object INTLITERAL311_tree=null;
        Object IDENTIFIER313_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE314_tree=null;

        try {
            // JVM.g:523:3: ( INTLITERAL INTLITERAL INTLITERAL ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE ) )
            // JVM.g:523:5: INTLITERAL INTLITERAL INTLITERAL ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL309=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry4079); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL309_tree = 
            (Object)adaptor.create(INTLITERAL309)
            ;
            adaptor.addChild(root_0, INTLITERAL309_tree);
            }

            INTLITERAL310=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry4081); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL310_tree = 
            (Object)adaptor.create(INTLITERAL310)
            ;
            adaptor.addChild(root_0, INTLITERAL310_tree);
            }

            INTLITERAL311=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry4083); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL311_tree = 
            (Object)adaptor.create(INTLITERAL311)
            ;
            adaptor.addChild(root_0, INTLITERAL311_tree);
            }

            // JVM.g:523:38: ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
            int alt70=3;
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
                alt70=1;
                }
                break;
            case IDENTIFIER:
                {
                alt70=2;
                }
                break;
            case CONSTANT_TYPE_ASSIGNABLE:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }

            switch (alt70) {
                case 1 :
                    // JVM.g:523:39: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntry4086);
                    primitiveType312=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType312.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:523:56: IDENTIFIER
                    {
                    IDENTIFIER313=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntry4091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER313_tree = 
                    (Object)adaptor.create(IDENTIFIER313)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER313_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:523:71: CONSTANT_TYPE_ASSIGNABLE
                    {
                    CONSTANT_TYPE_ASSIGNABLE314=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntry4097); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT_TYPE_ASSIGNABLE314_tree = 
                    (Object)adaptor.create(CONSTANT_TYPE_ASSIGNABLE314)
                    ;
                    adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE314_tree);
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
    // $ANTLR end "exceptionTableEntry"


    public static class lineNumberTable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lineNumberTable"
    // JVM.g:530:1: lineNumberTable : ( lineNumberTableLine )* ;
    public final JVMParser.lineNumberTable_return lineNumberTable() throws RecognitionException {
        JVMParser.lineNumberTable_return retval = new JVMParser.lineNumberTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.lineNumberTableLine_return lineNumberTableLine315 =null;



        try {
            // JVM.g:531:3: ( ( lineNumberTableLine )* )
            // JVM.g:531:5: ( lineNumberTableLine )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:531:5: ( lineNumberTableLine )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==IDENTIFIER) ) {
                    int LA71_2 = input.LA(2);

                    if ( (LA71_2==INTLITERAL) ) {
                        alt71=1;
                    }


                }


                switch (alt71) {
            	case 1 :
            	    // JVM.g:531:5: lineNumberTableLine
            	    {
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable4118);
            	    lineNumberTableLine315=lineNumberTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lineNumberTableLine315.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
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
    // $ANTLR end "lineNumberTable"


    public static class lineNumberTableLine_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lineNumberTableLine"
    // JVM.g:534:1: lineNumberTableLine : IDENTIFIER pc INTLITERAL ;
    public final JVMParser.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        JVMParser.lineNumberTableLine_return retval = new JVMParser.lineNumberTableLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER316=null;
        Token INTLITERAL318=null;
        JVMParser.pc_return pc317 =null;


        Object IDENTIFIER316_tree=null;
        Object INTLITERAL318_tree=null;

        try {
            // JVM.g:535:3: ( IDENTIFIER pc INTLITERAL )
            // JVM.g:535:5: IDENTIFIER pc INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER316=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine4132); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER316_tree = 
            (Object)adaptor.create(IDENTIFIER316)
            ;
            adaptor.addChild(root_0, IDENTIFIER316_tree);
            }

            pushFollow(FOLLOW_pc_in_lineNumberTableLine4134);
            pc317=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc317.getTree());

            INTLITERAL318=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine4136); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL318_tree = 
            (Object)adaptor.create(INTLITERAL318)
            ;
            adaptor.addChild(root_0, INTLITERAL318_tree);
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
    // JVM.g:542:1: localVariableTable : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )* -> ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ( ^( LVENTRY localVariableTableLine ) )* ;
    public final JVMParser.localVariableTable_return localVariableTable() throws RecognitionException {
        JVMParser.localVariableTable_return retval = new JVMParser.localVariableTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER319=null;
        Token IDENTIFIER320=null;
        Token IDENTIFIER321=null;
        Token IDENTIFIER322=null;
        Token IDENTIFIER323=null;
        JVMParser.localVariableTableLine_return localVariableTableLine324 =null;


        Object IDENTIFIER319_tree=null;
        Object IDENTIFIER320_tree=null;
        Object IDENTIFIER321_tree=null;
        Object IDENTIFIER322_tree=null;
        Object IDENTIFIER323_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_localVariableTableLine=new RewriteRuleSubtreeStream(adaptor,"rule localVariableTableLine");
        try {
            // JVM.g:543:3: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )* -> ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ( ^( LVENTRY localVariableTableLine ) )* )
            // JVM.g:543:5: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )*
            {
            IDENTIFIER319=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4158); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER319);


            IDENTIFIER320=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4160); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER320);


            IDENTIFIER321=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4162); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER321);


            IDENTIFIER322=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4164); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER322);


            IDENTIFIER323=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable4166); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER323);


            // JVM.g:544:5: ( localVariableTableLine )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==INTLITERAL) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // JVM.g:544:5: localVariableTableLine
            	    {
            	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable4173);
            	    localVariableTableLine324=localVariableTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_localVariableTableLine.add(localVariableTableLine324.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER, IDENTIFIER, IDENTIFIER, localVariableTableLine, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 544:39: -> ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ) ( ^( LVENTRY localVariableTableLine ) )*
            {
                // JVM.g:544:42: ^( LVHEADER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER )
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

                // JVM.g:544:109: ( ^( LVENTRY localVariableTableLine ) )*
                while ( stream_localVariableTableLine.hasNext() ) {
                    // JVM.g:544:109: ^( LVENTRY localVariableTableLine )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(LVENTRY, "LVENTRY")
                    , root_1);

                    adaptor.addChild(root_1, stream_localVariableTableLine.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_localVariableTableLine.reset();

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
    // JVM.g:547:1: localVariableTableLine : INTLITERAL INTLITERAL INTLITERAL ( identifier | STATIC ) bytecodeType ;
    public final JVMParser.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        JVMParser.localVariableTableLine_return retval = new JVMParser.localVariableTableLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL325=null;
        Token INTLITERAL326=null;
        Token INTLITERAL327=null;
        Token STATIC329=null;
        JVMParser.identifier_return identifier328 =null;

        JVMParser.bytecodeType_return bytecodeType330 =null;


        Object INTLITERAL325_tree=null;
        Object INTLITERAL326_tree=null;
        Object INTLITERAL327_tree=null;
        Object STATIC329_tree=null;

        try {
            // JVM.g:548:3: ( INTLITERAL INTLITERAL INTLITERAL ( identifier | STATIC ) bytecodeType )
            // JVM.g:548:5: INTLITERAL INTLITERAL INTLITERAL ( identifier | STATIC ) bytecodeType
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL325=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine4222); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL325_tree = 
            (Object)adaptor.create(INTLITERAL325)
            ;
            adaptor.addChild(root_0, INTLITERAL325_tree);
            }

            INTLITERAL326=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine4224); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL326_tree = 
            (Object)adaptor.create(INTLITERAL326)
            ;
            adaptor.addChild(root_0, INTLITERAL326_tree);
            }

            INTLITERAL327=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine4226); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL327_tree = 
            (Object)adaptor.create(INTLITERAL327)
            ;
            adaptor.addChild(root_0, INTLITERAL327_tree);
            }

            // JVM.g:548:38: ( identifier | STATIC )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==BOOLEAN||(LA73_0 >= BYTE && LA73_0 <= BaseType)||LA73_0==CHAR||LA73_0==CLASS||LA73_0==Constant_type||LA73_0==DEFAULT||LA73_0==DOUBLE||LA73_0==EXTENDS||LA73_0==FLOAT||(LA73_0 >= IDENTIFIER && LA73_0 <= IMPLEMENTS)||LA73_0==INT||LA73_0==LONG||LA73_0==SHORT||LA73_0==SUPER||LA73_0==THROWS||LA73_0==VOID||LA73_0==VoidType) ) {
                alt73=1;
            }
            else if ( (LA73_0==STATIC) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // JVM.g:548:39: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_localVariableTableLine4229);
                    identifier328=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier328.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:548:52: STATIC
                    {
                    STATIC329=(Token)match(input,STATIC,FOLLOW_STATIC_in_localVariableTableLine4233); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC329_tree = 
                    (Object)adaptor.create(STATIC329)
                    ;
                    adaptor.addChild(root_0, STATIC329_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine4236);
            bytecodeType330=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType330.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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


    public static class stackMapTypeTable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTypeTable"
    // JVM.g:554:1: stackMapTypeTable : IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+ -> ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ( ^( SMTENTRY stackMapTypeTableEntry ) )+ ;
    public final JVMParser.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        JVMParser.stackMapTypeTable_return retval = new JVMParser.stackMapTypeTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER331=null;
        Token ASSIGN332=null;
        Token INTLITERAL333=null;
        JVMParser.stackMapTypeTableEntry_return stackMapTypeTableEntry334 =null;


        Object IDENTIFIER331_tree=null;
        Object ASSIGN332_tree=null;
        Object INTLITERAL333_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_stackMapTypeTableEntry=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTypeTableEntry");
        try {
            // JVM.g:555:3: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+ -> ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ( ^( SMTENTRY stackMapTypeTableEntry ) )+ )
            // JVM.g:555:5: IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+
            {
            IDENTIFIER331=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable4253); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER331);


            ASSIGN332=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable4255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN332);


            INTLITERAL333=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable4257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL333);


            // JVM.g:556:5: ( stackMapTypeTableEntry )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==IDENTIFIER) ) {
                    int LA74_2 = input.LA(2);

                    if ( (LA74_2==ASSIGN) ) {
                        alt74=1;
                    }


                }


                switch (alt74) {
            	case 1 :
            	    // JVM.g:556:5: stackMapTypeTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable4264);
            	    stackMapTypeTableEntry334=stackMapTypeTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTypeTableEntry.add(stackMapTypeTableEntry334.getTree());

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


            // AST REWRITE
            // elements: INTLITERAL, ASSIGN, IDENTIFIER, stackMapTypeTableEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 556:41: -> ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ( ^( SMTENTRY stackMapTypeTableEntry ) )+
            {
                // JVM.g:556:45: ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL )
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

                if ( !(stream_stackMapTypeTableEntry.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stackMapTypeTableEntry.hasNext() ) {
                    // JVM.g:556:87: ^( SMTENTRY stackMapTypeTableEntry )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(SMTENTRY, "SMTENTRY")
                    , root_1);

                    adaptor.addChild(root_1, stream_stackMapTypeTableEntry.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_stackMapTypeTableEntry.reset();

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
    // JVM.g:559:1: stackMapTypeTableEntry : IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer ;
    public final JVMParser.stackMapTypeTableEntry_return stackMapTypeTableEntry() throws RecognitionException {
        JVMParser.stackMapTypeTableEntry_return retval = new JVMParser.stackMapTypeTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER335=null;
        Token ASSIGN336=null;
        Token INTLITERAL337=null;
        Token IDENTIFIER338=null;
        Token ASSIGN339=null;
        Token INTLITERAL340=null;
        Token IDENTIFIER341=null;
        Token ASSIGN342=null;
        Token IDENTIFIER344=null;
        Token ASSIGN345=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer343 =null;

        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer346 =null;


        Object IDENTIFIER335_tree=null;
        Object ASSIGN336_tree=null;
        Object INTLITERAL337_tree=null;
        Object IDENTIFIER338_tree=null;
        Object ASSIGN339_tree=null;
        Object INTLITERAL340_tree=null;
        Object IDENTIFIER341_tree=null;
        Object ASSIGN342_tree=null;
        Object IDENTIFIER344_tree=null;
        Object ASSIGN345_tree=null;

        try {
            // JVM.g:560:3: ( IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer )
            // JVM.g:560:5: IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER335=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4310); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER335_tree = 
            (Object)adaptor.create(IDENTIFIER335)
            ;
            adaptor.addChild(root_0, IDENTIFIER335_tree);
            }

            ASSIGN336=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4312); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN336_tree = 
            (Object)adaptor.create(ASSIGN336)
            ;
            adaptor.addChild(root_0, ASSIGN336_tree);
            }

            INTLITERAL337=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4314); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL337_tree = 
            (Object)adaptor.create(INTLITERAL337)
            ;
            adaptor.addChild(root_0, INTLITERAL337_tree);
            }

            IDENTIFIER338=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4316); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER338_tree = 
            (Object)adaptor.create(IDENTIFIER338)
            ;
            adaptor.addChild(root_0, IDENTIFIER338_tree);
            }

            ASSIGN339=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4318); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN339_tree = 
            (Object)adaptor.create(ASSIGN339)
            ;
            adaptor.addChild(root_0, ASSIGN339_tree);
            }

            INTLITERAL340=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4320); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL340_tree = 
            (Object)adaptor.create(INTLITERAL340)
            ;
            adaptor.addChild(root_0, INTLITERAL340_tree);
            }

            IDENTIFIER341=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4327); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER341_tree = 
            (Object)adaptor.create(IDENTIFIER341)
            ;
            adaptor.addChild(root_0, IDENTIFIER341_tree);
            }

            ASSIGN342=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4329); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN342_tree = 
            (Object)adaptor.create(ASSIGN342)
            ;
            adaptor.addChild(root_0, ASSIGN342_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4331);
            stackMapTableTypesContainer343=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer343.getTree());

            IDENTIFIER344=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4338); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER344_tree = 
            (Object)adaptor.create(IDENTIFIER344)
            ;
            adaptor.addChild(root_0, IDENTIFIER344_tree);
            }

            ASSIGN345=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry4340); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN345_tree = 
            (Object)adaptor.create(ASSIGN345)
            ;
            adaptor.addChild(root_0, ASSIGN345_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4342);
            stackMapTableTypesContainer346=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer346.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:569:1: stackMapTable : IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+ ;
    public final JVMParser.stackMapTable_return stackMapTable() throws RecognitionException {
        JVMParser.stackMapTable_return retval = new JVMParser.stackMapTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER347=null;
        Token ASSIGN348=null;
        Token INTLITERAL349=null;
        JVMParser.stackMapTableEntry_return stackMapTableEntry350 =null;


        Object IDENTIFIER347_tree=null;
        Object ASSIGN348_tree=null;
        Object INTLITERAL349_tree=null;

        try {
            // JVM.g:570:3: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+ )
            // JVM.g:570:5: IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER347=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable4360); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER347_tree = 
            (Object)adaptor.create(IDENTIFIER347)
            ;
            adaptor.addChild(root_0, IDENTIFIER347_tree);
            }

            ASSIGN348=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable4362); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN348_tree = 
            (Object)adaptor.create(ASSIGN348)
            ;
            adaptor.addChild(root_0, ASSIGN348_tree);
            }

            INTLITERAL349=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable4364); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL349_tree = 
            (Object)adaptor.create(INTLITERAL349)
            ;
            adaptor.addChild(root_0, INTLITERAL349_tree);
            }

            // JVM.g:571:5: ( stackMapTableEntry )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==IDENTIFIER) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==ASSIGN) ) {
                        alt75=1;
                    }


                }


                switch (alt75) {
            	case 1 :
            	    // JVM.g:571:5: stackMapTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable4371);
            	    stackMapTableEntry350=stackMapTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableEntry350.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
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
    // $ANTLR end "stackMapTable"


    public static class stackMapTableEntry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableEntry"
    // JVM.g:573:1: stackMapTableEntry : IDENTIFIER ASSIGN ( INTLITERAL | stackMapTableTypesContainer ) ;
    public final JVMParser.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        JVMParser.stackMapTableEntry_return retval = new JVMParser.stackMapTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER351=null;
        Token ASSIGN352=null;
        Token INTLITERAL353=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer354 =null;


        Object IDENTIFIER351_tree=null;
        Object ASSIGN352_tree=null;
        Object INTLITERAL353_tree=null;

        try {
            // JVM.g:574:3: ( IDENTIFIER ASSIGN ( INTLITERAL | stackMapTableTypesContainer ) )
            // JVM.g:574:5: IDENTIFIER ASSIGN ( INTLITERAL | stackMapTableTypesContainer )
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER351=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry4384); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER351_tree = 
            (Object)adaptor.create(IDENTIFIER351)
            ;
            adaptor.addChild(root_0, IDENTIFIER351_tree);
            }

            ASSIGN352=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry4386); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN352_tree = 
            (Object)adaptor.create(ASSIGN352)
            ;
            adaptor.addChild(root_0, ASSIGN352_tree);
            }

            // JVM.g:574:23: ( INTLITERAL | stackMapTableTypesContainer )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==INTLITERAL) ) {
                alt76=1;
            }
            else if ( (LA76_0==LBRACK) ) {
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
                    // JVM.g:574:24: INTLITERAL
                    {
                    INTLITERAL353=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntry4389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL353_tree = 
                    (Object)adaptor.create(INTLITERAL353)
                    ;
                    adaptor.addChild(root_0, INTLITERAL353_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:574:37: stackMapTableTypesContainer
                    {
                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntry4393);
                    stackMapTableTypesContainer354=stackMapTableTypesContainer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer354.getTree());

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
    // $ANTLR end "stackMapTableEntry"


    public static class stackMapTableTypesContainer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypesContainer"
    // JVM.g:577:1: stackMapTableTypesContainer : LBRACK ( stackMapTableTypes )? RBRACK ;
    public final JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        JVMParser.stackMapTableTypesContainer_return retval = new JVMParser.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK355=null;
        Token RBRACK357=null;
        JVMParser.stackMapTableTypes_return stackMapTableTypes356 =null;


        Object LBRACK355_tree=null;
        Object RBRACK357_tree=null;

        try {
            // JVM.g:578:3: ( LBRACK ( stackMapTableTypes )? RBRACK )
            // JVM.g:578:5: LBRACK ( stackMapTableTypes )? RBRACK
            {
            root_0 = (Object)adaptor.nil();


            LBRACK355=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_stackMapTableTypesContainer4408); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK355_tree = 
            (Object)adaptor.create(LBRACK355)
            ;
            adaptor.addChild(root_0, LBRACK355_tree);
            }

            // JVM.g:578:12: ( stackMapTableTypes )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==BOOLEAN||LA77_0==BYTE||LA77_0==CHAR||LA77_0==CLASS||LA77_0==DOUBLE||LA77_0==FLOAT||LA77_0==IDENTIFIER||LA77_0==INT||LA77_0==LONG||LA77_0==SHORT||LA77_0==VOID) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // JVM.g:578:12: stackMapTableTypes
                    {
                    pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer4410);
                    stackMapTableTypes356=stackMapTableTypes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypes356.getTree());

                    }
                    break;

            }


            RBRACK357=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_stackMapTableTypesContainer4413); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACK357_tree = 
            (Object)adaptor.create(RBRACK357)
            ;
            adaptor.addChild(root_0, RBRACK357_tree);
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
    // JVM.g:581:1: stackMapTableTypes : stackMapTableType ( COMMA stackMapTableType )* -> ( stackMapTableType )+ ;
    public final JVMParser.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        JVMParser.stackMapTableTypes_return retval = new JVMParser.stackMapTableTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA359=null;
        JVMParser.stackMapTableType_return stackMapTableType358 =null;

        JVMParser.stackMapTableType_return stackMapTableType360 =null;


        Object COMMA359_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_stackMapTableType=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableType");
        try {
            // JVM.g:582:3: ( stackMapTableType ( COMMA stackMapTableType )* -> ( stackMapTableType )+ )
            // JVM.g:582:5: stackMapTableType ( COMMA stackMapTableType )*
            {
            pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes4428);
            stackMapTableType358=stackMapTableType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType358.getTree());

            // JVM.g:582:23: ( COMMA stackMapTableType )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==COMMA) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // JVM.g:582:24: COMMA stackMapTableType
            	    {
            	    COMMA359=(Token)match(input,COMMA,FOLLOW_COMMA_in_stackMapTableTypes4431); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA359);


            	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes4433);
            	    stackMapTableType360=stackMapTableType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType360.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
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
            // 582:50: -> ( stackMapTableType )+
            {
                if ( !(stream_stackMapTableType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stackMapTableType.hasNext() ) {
                    adaptor.addChild(root_0, stream_stackMapTableType.nextTree());

                }
                stream_stackMapTableType.reset();

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
    // JVM.g:585:1: stackMapTableType : ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? ) ;
    public final JVMParser.stackMapTableType_return stackMapTableType() throws RecognitionException {
        JVMParser.stackMapTableType_return retval = new JVMParser.stackMapTableType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER364=null;
        Token INTLITERAL365=null;
        JVMParser.stackMapTableTypeObject_return stackMapTableTypeObject361 =null;

        JVMParser.stackMapTableTypePlainObject_return stackMapTableTypePlainObject362 =null;

        JVMParser.primitiveType_return primitiveType363 =null;


        Object IDENTIFIER364_tree=null;
        Object INTLITERAL365_tree=null;

        try {
            // JVM.g:586:3: ( ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? ) )
            // JVM.g:586:5: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:586:5: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType | IDENTIFIER ( INTLITERAL )? )
            int alt80=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==STRINGLITERAL) ) {
                    alt80=1;
                }
                else if ( (LA80_1==IDENTIFIER||LA80_1==INTERNALTYPE) ) {
                    alt80=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

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
                alt80=3;
                }
                break;
            case IDENTIFIER:
                {
                alt80=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }

            switch (alt80) {
                case 1 :
                    // JVM.g:586:6: stackMapTableTypeObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType4454);
                    stackMapTableTypeObject361=stackMapTableTypeObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypeObject361.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:586:30: stackMapTableTypePlainObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType4456);
                    stackMapTableTypePlainObject362=stackMapTableTypePlainObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypePlainObject362.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:586:59: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType4458);
                    primitiveType363=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType363.getTree());

                    }
                    break;
                case 4 :
                    // JVM.g:586:73: IDENTIFIER ( INTLITERAL )?
                    {
                    IDENTIFIER364=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableType4460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER364_tree = 
                    (Object)adaptor.create(IDENTIFIER364)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER364_tree);
                    }

                    // JVM.g:586:84: ( INTLITERAL )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==INTLITERAL) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // JVM.g:586:84: INTLITERAL
                            {
                            INTLITERAL365=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableType4462); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INTLITERAL365_tree = 
                            (Object)adaptor.create(INTLITERAL365)
                            ;
                            adaptor.addChild(root_0, INTLITERAL365_tree);
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
    // JVM.g:588:1: stackMapTableTypePlainObject : CLASS ( INTERNALTYPE | IDENTIFIER ) ;
    public final JVMParser.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        JVMParser.stackMapTableTypePlainObject_return retval = new JVMParser.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS366=null;
        Token set367=null;

        Object CLASS366_tree=null;
        Object set367_tree=null;

        try {
            // JVM.g:589:3: ( CLASS ( INTERNALTYPE | IDENTIFIER ) )
            // JVM.g:589:5: CLASS ( INTERNALTYPE | IDENTIFIER )
            {
            root_0 = (Object)adaptor.nil();


            CLASS366=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject4476); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS366_tree = 
            (Object)adaptor.create(CLASS366)
            ;
            adaptor.addChild(root_0, CLASS366_tree);
            }

            set367=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set367)
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
    // $ANTLR end "stackMapTableTypePlainObject"


    public static class stackMapTableTypeObject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTableTypeObject"
    // JVM.g:591:1: stackMapTableTypeObject : CLASS STRINGLITERAL ;
    public final JVMParser.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        JVMParser.stackMapTableTypeObject_return retval = new JVMParser.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS368=null;
        Token STRINGLITERAL369=null;

        Object CLASS368_tree=null;
        Object STRINGLITERAL369_tree=null;

        try {
            // JVM.g:592:3: ( CLASS STRINGLITERAL )
            // JVM.g:592:5: CLASS STRINGLITERAL
            {
            root_0 = (Object)adaptor.nil();


            CLASS368=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject4496); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS368_tree = 
            (Object)adaptor.create(CLASS368)
            ;
            adaptor.addChild(root_0, CLASS368_tree);
            }

            STRINGLITERAL369=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject4498); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLITERAL369_tree = 
            (Object)adaptor.create(STRINGLITERAL369)
            ;
            adaptor.addChild(root_0, STRINGLITERAL369_tree);
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
    // JVM.g:603:1: typeList : aggregatedJavaType ( COMMA aggregatedJavaType )* -> ( aggregatedJavaType )+ ;
    public final JVMParser.typeList_return typeList() throws RecognitionException {
        JVMParser.typeList_return retval = new JVMParser.typeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA371=null;
        JVMParser.aggregatedJavaType_return aggregatedJavaType370 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType372 =null;


        Object COMMA371_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_aggregatedJavaType=new RewriteRuleSubtreeStream(adaptor,"rule aggregatedJavaType");
        try {
            // JVM.g:604:3: ( aggregatedJavaType ( COMMA aggregatedJavaType )* -> ( aggregatedJavaType )+ )
            // JVM.g:604:5: aggregatedJavaType ( COMMA aggregatedJavaType )*
            {
            pushFollow(FOLLOW_aggregatedJavaType_in_typeList4519);
            aggregatedJavaType370=aggregatedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_aggregatedJavaType.add(aggregatedJavaType370.getTree());

            // JVM.g:604:24: ( COMMA aggregatedJavaType )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // JVM.g:604:25: COMMA aggregatedJavaType
            	    {
            	    COMMA371=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList4522); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA371);


            	    pushFollow(FOLLOW_aggregatedJavaType_in_typeList4524);
            	    aggregatedJavaType372=aggregatedJavaType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_aggregatedJavaType.add(aggregatedJavaType372.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            // AST REWRITE
            // elements: aggregatedJavaType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 604:52: -> ( aggregatedJavaType )+
            {
                if ( !(stream_aggregatedJavaType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_aggregatedJavaType.hasNext() ) {
                    adaptor.addChild(root_0, stream_aggregatedJavaType.nextTree());

                }
                stream_aggregatedJavaType.reset();

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


    public static class aggregatedJavaType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aggregatedJavaType"
    // JVM.g:607:1: aggregatedJavaType : ( javaTypeIdentifier ( DOT javaTypeIdentifier )* ) ( LBRACK RBRACK )* ;
    public final JVMParser.aggregatedJavaType_return aggregatedJavaType() throws RecognitionException {
        JVMParser.aggregatedJavaType_return retval = new JVMParser.aggregatedJavaType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT374=null;
        Token LBRACK376=null;
        Token RBRACK377=null;
        JVMParser.javaTypeIdentifier_return javaTypeIdentifier373 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier375 =null;


        Object DOT374_tree=null;
        Object LBRACK376_tree=null;
        Object RBRACK377_tree=null;

        try {
            // JVM.g:608:3: ( ( javaTypeIdentifier ( DOT javaTypeIdentifier )* ) ( LBRACK RBRACK )* )
            // JVM.g:608:5: ( javaTypeIdentifier ( DOT javaTypeIdentifier )* ) ( LBRACK RBRACK )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:608:5: ( javaTypeIdentifier ( DOT javaTypeIdentifier )* )
            // JVM.g:608:6: javaTypeIdentifier ( DOT javaTypeIdentifier )*
            {
            pushFollow(FOLLOW_javaTypeIdentifier_in_aggregatedJavaType4549);
            javaTypeIdentifier373=javaTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier373.getTree());

            // JVM.g:608:25: ( DOT javaTypeIdentifier )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==DOT) ) {
                    int LA82_2 = input.LA(2);

                    if ( (LA82_2==BOOLEAN||(LA82_2 >= BYTE && LA82_2 <= BaseType)||LA82_2==CHAR||LA82_2==CLASS||LA82_2==Constant_type||LA82_2==DEFAULT||LA82_2==DOUBLE||LA82_2==EXTENDS||LA82_2==FLOAT||(LA82_2 >= IDENTIFIER && LA82_2 <= IMPLEMENTS)||LA82_2==INT||LA82_2==LONG||LA82_2==NORMALTYPE||LA82_2==SHORT||LA82_2==SUPER||LA82_2==THROWS||LA82_2==VOID||LA82_2==VoidType) ) {
                        alt82=1;
                    }


                }


                switch (alt82) {
            	case 1 :
            	    // JVM.g:608:26: DOT javaTypeIdentifier
            	    {
            	    DOT374=(Token)match(input,DOT,FOLLOW_DOT_in_aggregatedJavaType4552); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT374_tree = 
            	    (Object)adaptor.create(DOT374)
            	    ;
            	    adaptor.addChild(root_0, DOT374_tree);
            	    }

            	    pushFollow(FOLLOW_javaTypeIdentifier_in_aggregatedJavaType4554);
            	    javaTypeIdentifier375=javaTypeIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier375.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            // JVM.g:608:52: ( LBRACK RBRACK )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==LBRACK) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // JVM.g:608:53: LBRACK RBRACK
            	    {
            	    LBRACK376=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_aggregatedJavaType4560); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LBRACK376_tree = 
            	    (Object)adaptor.create(LBRACK376)
            	    ;
            	    adaptor.addChild(root_0, LBRACK376_tree);
            	    }

            	    RBRACK377=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_aggregatedJavaType4562); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RBRACK377_tree = 
            	    (Object)adaptor.create(RBRACK377)
            	    ;
            	    adaptor.addChild(root_0, RBRACK377_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop83;
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
    // $ANTLR end "aggregatedJavaType"


    public static class javaTypeIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "javaTypeIdentifier"
    // JVM.g:611:1: javaTypeIdentifier : javaType ( genericConstraintList | genericList )? ;
    public final JVMParser.javaTypeIdentifier_return javaTypeIdentifier() throws RecognitionException {
        JVMParser.javaTypeIdentifier_return retval = new JVMParser.javaTypeIdentifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.javaType_return javaType378 =null;

        JVMParser.genericConstraintList_return genericConstraintList379 =null;

        JVMParser.genericList_return genericList380 =null;



        try {
            // JVM.g:612:3: ( javaType ( genericConstraintList | genericList )? )
            // JVM.g:612:5: javaType ( genericConstraintList | genericList )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_javaType_in_javaTypeIdentifier4579);
            javaType378=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType378.getTree());

            // JVM.g:612:14: ( genericConstraintList | genericList )?
            int alt84=3;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==LESST) ) {
                switch ( input.LA(2) ) {
                    case IDENTIFIER:
                        {
                        int LA84_3 = input.LA(3);

                        if ( (LA84_3==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_3==COMMA||LA84_3==DOT||LA84_3==LARGET||(LA84_3 >= LBRACK && LA84_3 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case BaseType:
                        {
                        int LA84_4 = input.LA(3);

                        if ( (LA84_4==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_4==COMMA||LA84_4==DOT||LA84_4==LARGET||(LA84_4 >= LBRACK && LA84_4 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case VoidType:
                        {
                        int LA84_5 = input.LA(3);

                        if ( (LA84_5==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_5==COMMA||LA84_5==DOT||LA84_5==LARGET||(LA84_5 >= LBRACK && LA84_5 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case BOOLEAN:
                        {
                        int LA84_6 = input.LA(3);

                        if ( (LA84_6==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_6==COMMA||LA84_6==DOT||LA84_6==LARGET||(LA84_6 >= LBRACK && LA84_6 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case DOUBLE:
                    case FLOAT:
                        {
                        int LA84_7 = input.LA(3);

                        if ( (LA84_7==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_7==COMMA||LA84_7==DOT||LA84_7==LARGET||(LA84_7 >= LBRACK && LA84_7 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case BYTE:
                    case CHAR:
                    case INT:
                    case LONG:
                    case SHORT:
                        {
                        int LA84_8 = input.LA(3);

                        if ( (LA84_8==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_8==COMMA||LA84_8==DOT||LA84_8==LARGET||(LA84_8 >= LBRACK && LA84_8 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case VOID:
                        {
                        int LA84_9 = input.LA(3);

                        if ( (LA84_9==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_9==COMMA||LA84_9==DOT||LA84_9==LARGET||(LA84_9 >= LBRACK && LA84_9 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case Constant_type:
                        {
                        int LA84_10 = input.LA(3);

                        if ( (LA84_10==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_10==COMMA||LA84_10==DOT||LA84_10==LARGET||(LA84_10 >= LBRACK && LA84_10 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case EXTENDS:
                        {
                        int LA84_11 = input.LA(3);

                        if ( (LA84_11==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_11==COMMA||LA84_11==DOT||LA84_11==LARGET||(LA84_11 >= LBRACK && LA84_11 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case IMPLEMENTS:
                        {
                        int LA84_12 = input.LA(3);

                        if ( (LA84_12==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_12==COMMA||LA84_12==DOT||LA84_12==LARGET||(LA84_12 >= LBRACK && LA84_12 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case DEFAULT:
                        {
                        int LA84_13 = input.LA(3);

                        if ( (LA84_13==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_13==COMMA||LA84_13==DOT||LA84_13==LARGET||(LA84_13 >= LBRACK && LA84_13 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case CLASS:
                        {
                        int LA84_14 = input.LA(3);

                        if ( (LA84_14==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_14==COMMA||LA84_14==DOT||LA84_14==LARGET||(LA84_14 >= LBRACK && LA84_14 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case THROWS:
                        {
                        int LA84_15 = input.LA(3);

                        if ( (LA84_15==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_15==COMMA||LA84_15==DOT||LA84_15==LARGET||(LA84_15 >= LBRACK && LA84_15 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case SUPER:
                        {
                        int LA84_16 = input.LA(3);

                        if ( (LA84_16==EXTENDS) ) {
                            alt84=1;
                        }
                        else if ( (LA84_16==COMMA||LA84_16==DOT||LA84_16==LARGET||(LA84_16 >= LBRACK && LA84_16 <= LESST)) ) {
                            alt84=2;
                        }
                        }
                        break;
                    case NORMALTYPE:
                    case QUESTION:
                        {
                        alt84=2;
                        }
                        break;
                }

            }
            switch (alt84) {
                case 1 :
                    // JVM.g:612:15: genericConstraintList
                    {
                    pushFollow(FOLLOW_genericConstraintList_in_javaTypeIdentifier4582);
                    genericConstraintList379=genericConstraintList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraintList379.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:612:39: genericList
                    {
                    pushFollow(FOLLOW_genericList_in_javaTypeIdentifier4586);
                    genericList380=genericList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericList380.getTree());

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
    // $ANTLR end "javaTypeIdentifier"


    public static class genericConstraintList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericConstraintList"
    // JVM.g:615:1: genericConstraintList : LESST genericConstraints ( COMMA genericConstraints )* LARGET -> ( genericConstraints )+ ;
    public final JVMParser.genericConstraintList_return genericConstraintList() throws RecognitionException {
        JVMParser.genericConstraintList_return retval = new JVMParser.genericConstraintList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST381=null;
        Token COMMA383=null;
        Token LARGET385=null;
        JVMParser.genericConstraints_return genericConstraints382 =null;

        JVMParser.genericConstraints_return genericConstraints384 =null;


        Object LESST381_tree=null;
        Object COMMA383_tree=null;
        Object LARGET385_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_genericConstraints=new RewriteRuleSubtreeStream(adaptor,"rule genericConstraints");
        try {
            // JVM.g:616:3: ( LESST genericConstraints ( COMMA genericConstraints )* LARGET -> ( genericConstraints )+ )
            // JVM.g:616:5: LESST genericConstraints ( COMMA genericConstraints )* LARGET
            {
            LESST381=(Token)match(input,LESST,FOLLOW_LESST_in_genericConstraintList4601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST381);


            pushFollow(FOLLOW_genericConstraints_in_genericConstraintList4603);
            genericConstraints382=genericConstraints();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_genericConstraints.add(genericConstraints382.getTree());

            // JVM.g:616:30: ( COMMA genericConstraints )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==COMMA) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // JVM.g:616:31: COMMA genericConstraints
            	    {
            	    COMMA383=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericConstraintList4606); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA383);


            	    pushFollow(FOLLOW_genericConstraints_in_genericConstraintList4608);
            	    genericConstraints384=genericConstraints();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_genericConstraints.add(genericConstraints384.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            LARGET385=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericConstraintList4612); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET385);


            // AST REWRITE
            // elements: genericConstraints
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 616:65: -> ( genericConstraints )+
            {
                if ( !(stream_genericConstraints.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_genericConstraints.hasNext() ) {
                    adaptor.addChild(root_0, stream_genericConstraints.nextTree());

                }
                stream_genericConstraints.reset();

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
    // $ANTLR end "genericConstraintList"


    public static class genericConstraints_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericConstraints"
    // JVM.g:619:1: genericConstraints : identifier EXTENDS javaTypeIdentifier ( AND javaTypeIdentifier )* -> ^( EXTENDS identifier ( javaTypeIdentifier )+ ) ;
    public final JVMParser.genericConstraints_return genericConstraints() throws RecognitionException {
        JVMParser.genericConstraints_return retval = new JVMParser.genericConstraints_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS387=null;
        Token AND389=null;
        JVMParser.identifier_return identifier386 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier388 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier390 =null;


        Object EXTENDS387_tree=null;
        Object AND389_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_javaTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule javaTypeIdentifier");
        try {
            // JVM.g:620:3: ( identifier EXTENDS javaTypeIdentifier ( AND javaTypeIdentifier )* -> ^( EXTENDS identifier ( javaTypeIdentifier )+ ) )
            // JVM.g:620:5: identifier EXTENDS javaTypeIdentifier ( AND javaTypeIdentifier )*
            {
            pushFollow(FOLLOW_identifier_in_genericConstraints4630);
            identifier386=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier386.getTree());

            EXTENDS387=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericConstraints4632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS387);


            pushFollow(FOLLOW_javaTypeIdentifier_in_genericConstraints4634);
            javaTypeIdentifier388=javaTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaTypeIdentifier.add(javaTypeIdentifier388.getTree());

            // JVM.g:620:43: ( AND javaTypeIdentifier )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==AND) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // JVM.g:620:44: AND javaTypeIdentifier
            	    {
            	    AND389=(Token)match(input,AND,FOLLOW_AND_in_genericConstraints4637); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND389);


            	    pushFollow(FOLLOW_javaTypeIdentifier_in_genericConstraints4639);
            	    javaTypeIdentifier390=javaTypeIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaTypeIdentifier.add(javaTypeIdentifier390.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            // AST REWRITE
            // elements: javaTypeIdentifier, EXTENDS, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 620:69: -> ^( EXTENDS identifier ( javaTypeIdentifier )+ )
            {
                // JVM.g:620:72: ^( EXTENDS identifier ( javaTypeIdentifier )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EXTENDS.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                if ( !(stream_javaTypeIdentifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_javaTypeIdentifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_javaTypeIdentifier.nextTree());

                }
                stream_javaTypeIdentifier.reset();

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
    // $ANTLR end "genericConstraints"


    public static class genericList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericList"
    // JVM.g:623:1: genericList : LESST ( genericConstraint | aggregatedJavaType ) ( COMMA ( genericConstraint | aggregatedJavaType ) )* LARGET ;
    public final JVMParser.genericList_return genericList() throws RecognitionException {
        JVMParser.genericList_return retval = new JVMParser.genericList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST391=null;
        Token COMMA394=null;
        Token LARGET397=null;
        JVMParser.genericConstraint_return genericConstraint392 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType393 =null;

        JVMParser.genericConstraint_return genericConstraint395 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType396 =null;


        Object LESST391_tree=null;
        Object COMMA394_tree=null;
        Object LARGET397_tree=null;

        try {
            // JVM.g:624:3: ( LESST ( genericConstraint | aggregatedJavaType ) ( COMMA ( genericConstraint | aggregatedJavaType ) )* LARGET )
            // JVM.g:624:5: LESST ( genericConstraint | aggregatedJavaType ) ( COMMA ( genericConstraint | aggregatedJavaType ) )* LARGET
            {
            root_0 = (Object)adaptor.nil();


            LESST391=(Token)match(input,LESST,FOLLOW_LESST_in_genericList4667); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST391_tree = 
            (Object)adaptor.create(LESST391)
            ;
            adaptor.addChild(root_0, LESST391_tree);
            }

            // JVM.g:624:11: ( genericConstraint | aggregatedJavaType )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==QUESTION) ) {
                alt87=1;
            }
            else if ( (LA87_0==BOOLEAN||(LA87_0 >= BYTE && LA87_0 <= BaseType)||LA87_0==CHAR||LA87_0==CLASS||LA87_0==Constant_type||LA87_0==DEFAULT||LA87_0==DOUBLE||LA87_0==EXTENDS||LA87_0==FLOAT||(LA87_0 >= IDENTIFIER && LA87_0 <= IMPLEMENTS)||LA87_0==INT||LA87_0==LONG||LA87_0==NORMALTYPE||LA87_0==SHORT||LA87_0==SUPER||LA87_0==THROWS||LA87_0==VOID||LA87_0==VoidType) ) {
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
                    // JVM.g:624:12: genericConstraint
                    {
                    pushFollow(FOLLOW_genericConstraint_in_genericList4670);
                    genericConstraint392=genericConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraint392.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:624:30: aggregatedJavaType
                    {
                    pushFollow(FOLLOW_aggregatedJavaType_in_genericList4672);
                    aggregatedJavaType393=aggregatedJavaType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType393.getTree());

                    }
                    break;

            }


            // JVM.g:624:50: ( COMMA ( genericConstraint | aggregatedJavaType ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==COMMA) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // JVM.g:624:51: COMMA ( genericConstraint | aggregatedJavaType )
            	    {
            	    COMMA394=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericList4676); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA394_tree = 
            	    (Object)adaptor.create(COMMA394)
            	    ;
            	    adaptor.addChild(root_0, COMMA394_tree);
            	    }

            	    // JVM.g:624:57: ( genericConstraint | aggregatedJavaType )
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==QUESTION) ) {
            	        alt88=1;
            	    }
            	    else if ( (LA88_0==BOOLEAN||(LA88_0 >= BYTE && LA88_0 <= BaseType)||LA88_0==CHAR||LA88_0==CLASS||LA88_0==Constant_type||LA88_0==DEFAULT||LA88_0==DOUBLE||LA88_0==EXTENDS||LA88_0==FLOAT||(LA88_0 >= IDENTIFIER && LA88_0 <= IMPLEMENTS)||LA88_0==INT||LA88_0==LONG||LA88_0==NORMALTYPE||LA88_0==SHORT||LA88_0==SUPER||LA88_0==THROWS||LA88_0==VOID||LA88_0==VoidType) ) {
            	        alt88=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 88, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // JVM.g:624:58: genericConstraint
            	            {
            	            pushFollow(FOLLOW_genericConstraint_in_genericList4679);
            	            genericConstraint395=genericConstraint();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraint395.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // JVM.g:624:76: aggregatedJavaType
            	            {
            	            pushFollow(FOLLOW_aggregatedJavaType_in_genericList4681);
            	            aggregatedJavaType396=aggregatedJavaType();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType396.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            LARGET397=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericList4686); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET397_tree = 
            (Object)adaptor.create(LARGET397)
            ;
            adaptor.addChild(root_0, LARGET397_tree);
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
    // $ANTLR end "genericList"


    public static class genericConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericConstraint"
    // JVM.g:627:1: genericConstraint : QUESTION ( ( SUPER | EXTENDS ) aggregatedJavaType )? ;
    public final JVMParser.genericConstraint_return genericConstraint() throws RecognitionException {
        JVMParser.genericConstraint_return retval = new JVMParser.genericConstraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QUESTION398=null;
        Token set399=null;
        JVMParser.aggregatedJavaType_return aggregatedJavaType400 =null;


        Object QUESTION398_tree=null;
        Object set399_tree=null;

        try {
            // JVM.g:628:3: ( QUESTION ( ( SUPER | EXTENDS ) aggregatedJavaType )? )
            // JVM.g:628:5: QUESTION ( ( SUPER | EXTENDS ) aggregatedJavaType )?
            {
            root_0 = (Object)adaptor.nil();


            QUESTION398=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_genericConstraint4701); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUESTION398_tree = 
            (Object)adaptor.create(QUESTION398)
            ;
            adaptor.addChild(root_0, QUESTION398_tree);
            }

            // JVM.g:628:14: ( ( SUPER | EXTENDS ) aggregatedJavaType )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==EXTENDS||LA90_0==SUPER) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // JVM.g:628:15: ( SUPER | EXTENDS ) aggregatedJavaType
                    {
                    set399=(Token)input.LT(1);

                    if ( input.LA(1)==EXTENDS||input.LA(1)==SUPER ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set399)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_aggregatedJavaType_in_genericConstraint4713);
                    aggregatedJavaType400=aggregatedJavaType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType400.getTree());

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
    // $ANTLR end "genericConstraint"


    public static class javaTypeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "javaTypeList"
    // JVM.g:631:1: javaTypeList : javaType ( COMMA javaType )* -> ( javaType )+ ;
    public final JVMParser.javaTypeList_return javaTypeList() throws RecognitionException {
        JVMParser.javaTypeList_return retval = new JVMParser.javaTypeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA402=null;
        JVMParser.javaType_return javaType401 =null;

        JVMParser.javaType_return javaType403 =null;


        Object COMMA402_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_javaType=new RewriteRuleSubtreeStream(adaptor,"rule javaType");
        try {
            // JVM.g:632:3: ( javaType ( COMMA javaType )* -> ( javaType )+ )
            // JVM.g:632:5: javaType ( COMMA javaType )*
            {
            pushFollow(FOLLOW_javaType_in_javaTypeList4728);
            javaType401=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaType.add(javaType401.getTree());

            // JVM.g:632:14: ( COMMA javaType )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==COMMA) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // JVM.g:632:15: COMMA javaType
            	    {
            	    COMMA402=(Token)match(input,COMMA,FOLLOW_COMMA_in_javaTypeList4731); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA402);


            	    pushFollow(FOLLOW_javaType_in_javaTypeList4733);
            	    javaType403=javaType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaType.add(javaType403.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            // AST REWRITE
            // elements: javaType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 632:32: -> ( javaType )+
            {
                if ( !(stream_javaType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_javaType.hasNext() ) {
                    adaptor.addChild(root_0, stream_javaType.nextTree());

                }
                stream_javaType.reset();

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
    // $ANTLR end "javaTypeList"


    public static class javaType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "javaType"
    // JVM.g:635:1: javaType : ( identifier | NORMALTYPE );
    public final JVMParser.javaType_return javaType() throws RecognitionException {
        JVMParser.javaType_return retval = new JVMParser.javaType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NORMALTYPE405=null;
        JVMParser.identifier_return identifier404 =null;


        Object NORMALTYPE405_tree=null;

        try {
            // JVM.g:636:3: ( identifier | NORMALTYPE )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==BOOLEAN||(LA92_0 >= BYTE && LA92_0 <= BaseType)||LA92_0==CHAR||LA92_0==CLASS||LA92_0==Constant_type||LA92_0==DEFAULT||LA92_0==DOUBLE||LA92_0==EXTENDS||LA92_0==FLOAT||(LA92_0 >= IDENTIFIER && LA92_0 <= IMPLEMENTS)||LA92_0==INT||LA92_0==LONG||LA92_0==SHORT||LA92_0==SUPER||LA92_0==THROWS||LA92_0==VOID||LA92_0==VoidType) ) {
                alt92=1;
            }
            else if ( (LA92_0==NORMALTYPE) ) {
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
                    // JVM.g:636:5: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_javaType4753);
                    identifier404=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier404.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:636:18: NORMALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    NORMALTYPE405=(Token)match(input,NORMALTYPE,FOLLOW_NORMALTYPE_in_javaType4757); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NORMALTYPE405_tree = 
                    (Object)adaptor.create(NORMALTYPE405)
                    ;
                    adaptor.addChild(root_0, NORMALTYPE405_tree);
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
    // $ANTLR end "javaType"


    public static class genericDescriptor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericDescriptor"
    // JVM.g:643:1: genericDescriptor : LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET -> ( genericReturnDescriptor )+ ;
    public final JVMParser.genericDescriptor_return genericDescriptor() throws RecognitionException {
        JVMParser.genericDescriptor_return retval = new JVMParser.genericDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST406=null;
        Token COMMA408=null;
        Token LARGET410=null;
        JVMParser.genericReturnDescriptor_return genericReturnDescriptor407 =null;

        JVMParser.genericReturnDescriptor_return genericReturnDescriptor409 =null;


        Object LESST406_tree=null;
        Object COMMA408_tree=null;
        Object LARGET410_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_genericReturnDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule genericReturnDescriptor");
        try {
            // JVM.g:644:3: ( LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET -> ( genericReturnDescriptor )+ )
            // JVM.g:644:5: LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET
            {
            LESST406=(Token)match(input,LESST,FOLLOW_LESST_in_genericDescriptor4776); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST406);


            pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor4778);
            genericReturnDescriptor407=genericReturnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor407.getTree());

            // JVM.g:644:35: ( COMMA genericReturnDescriptor )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==COMMA) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // JVM.g:644:36: COMMA genericReturnDescriptor
            	    {
            	    COMMA408=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericDescriptor4781); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA408);


            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor4783);
            	    genericReturnDescriptor409=genericReturnDescriptor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor409.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            LARGET410=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericDescriptor4787); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET410);


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
            // 644:75: -> ( genericReturnDescriptor )+
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
    // JVM.g:647:1: genericReturnDescriptor : identifier EXTENDS bytecodeObjectTypeList ;
    public final JVMParser.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        JVMParser.genericReturnDescriptor_return retval = new JVMParser.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS412=null;
        JVMParser.identifier_return identifier411 =null;

        JVMParser.bytecodeObjectTypeList_return bytecodeObjectTypeList413 =null;


        Object EXTENDS412_tree=null;

        try {
            // JVM.g:648:3: ( identifier EXTENDS bytecodeObjectTypeList )
            // JVM.g:648:5: identifier EXTENDS bytecodeObjectTypeList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor4805);
            identifier411=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier411.getTree());

            EXTENDS412=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor4807); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS412_tree = 
            (Object)adaptor.create(EXTENDS412)
            ;
            adaptor.addChild(root_0, EXTENDS412_tree);
            }

            pushFollow(FOLLOW_bytecodeObjectTypeList_in_genericReturnDescriptor4809);
            bytecodeObjectTypeList413=bytecodeObjectTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectTypeList413.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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


    public static class bytecodeObjectTypeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeObjectTypeList"
    // JVM.g:651:1: bytecodeObjectTypeList : bytecodeObjectType ( AND bytecodeObjectType )* -> ( bytecodeObjectType )+ ;
    public final JVMParser.bytecodeObjectTypeList_return bytecodeObjectTypeList() throws RecognitionException {
        JVMParser.bytecodeObjectTypeList_return retval = new JVMParser.bytecodeObjectTypeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND415=null;
        JVMParser.bytecodeObjectType_return bytecodeObjectType414 =null;

        JVMParser.bytecodeObjectType_return bytecodeObjectType416 =null;


        Object AND415_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_bytecodeObjectType=new RewriteRuleSubtreeStream(adaptor,"rule bytecodeObjectType");
        try {
            // JVM.g:652:3: ( bytecodeObjectType ( AND bytecodeObjectType )* -> ( bytecodeObjectType )+ )
            // JVM.g:652:5: bytecodeObjectType ( AND bytecodeObjectType )*
            {
            pushFollow(FOLLOW_bytecodeObjectType_in_bytecodeObjectTypeList4823);
            bytecodeObjectType414=bytecodeObjectType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bytecodeObjectType.add(bytecodeObjectType414.getTree());

            // JVM.g:652:24: ( AND bytecodeObjectType )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==AND) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // JVM.g:652:25: AND bytecodeObjectType
            	    {
            	    AND415=(Token)match(input,AND,FOLLOW_AND_in_bytecodeObjectTypeList4826); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND415);


            	    pushFollow(FOLLOW_bytecodeObjectType_in_bytecodeObjectTypeList4828);
            	    bytecodeObjectType416=bytecodeObjectType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bytecodeObjectType.add(bytecodeObjectType416.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            // AST REWRITE
            // elements: bytecodeObjectType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 652:50: -> ( bytecodeObjectType )+
            {
                if ( !(stream_bytecodeObjectType.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_bytecodeObjectType.hasNext() ) {
                    adaptor.addChild(root_0, stream_bytecodeObjectType.nextTree());

                }
                stream_bytecodeObjectType.reset();

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
    // $ANTLR end "bytecodeObjectTypeList"


    public static class bytecodeObjectType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeObjectType"
    // JVM.g:655:1: bytecodeObjectType : ( INTERNALTYPE | identifier | genericBydecodeObjectType ) ( DOT bytecodeObjectType )? ;
    public final JVMParser.bytecodeObjectType_return bytecodeObjectType() throws RecognitionException {
        JVMParser.bytecodeObjectType_return retval = new JVMParser.bytecodeObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERNALTYPE417=null;
        Token DOT420=null;
        JVMParser.identifier_return identifier418 =null;

        JVMParser.genericBydecodeObjectType_return genericBydecodeObjectType419 =null;

        JVMParser.bytecodeObjectType_return bytecodeObjectType421 =null;


        Object INTERNALTYPE417_tree=null;
        Object DOT420_tree=null;

        try {
            // JVM.g:656:3: ( ( INTERNALTYPE | identifier | genericBydecodeObjectType ) ( DOT bytecodeObjectType )? )
            // JVM.g:656:5: ( INTERNALTYPE | identifier | genericBydecodeObjectType ) ( DOT bytecodeObjectType )?
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:656:5: ( INTERNALTYPE | identifier | genericBydecodeObjectType )
            int alt95=3;
            switch ( input.LA(1) ) {
            case INTERNALTYPE:
                {
                int LA95_1 = input.LA(2);

                if ( (LA95_1==LESST) ) {
                    alt95=3;
                }
                else if ( (LA95_1==AND||LA95_1==COMMA||LA95_1==DOT||LA95_1==LARGET) ) {
                    alt95=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA95_2 = input.LA(2);

                if ( (LA95_2==LESST) ) {
                    alt95=3;
                }
                else if ( (LA95_2==AND||LA95_2==COMMA||LA95_2==DOT||LA95_2==LARGET) ) {
                    alt95=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case BaseType:
            case CHAR:
            case CLASS:
            case Constant_type:
            case DEFAULT:
            case DOUBLE:
            case EXTENDS:
            case FLOAT:
            case IMPLEMENTS:
            case INT:
            case LONG:
            case SHORT:
            case SUPER:
            case THROWS:
            case VOID:
            case VoidType:
                {
                alt95=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // JVM.g:656:6: INTERNALTYPE
                    {
                    INTERNALTYPE417=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeObjectType4850); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE417_tree = 
                    (Object)adaptor.create(INTERNALTYPE417)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE417_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:657:5: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_bytecodeObjectType4856);
                    identifier418=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier418.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:658:5: genericBydecodeObjectType
                    {
                    pushFollow(FOLLOW_genericBydecodeObjectType_in_bytecodeObjectType4862);
                    genericBydecodeObjectType419=genericBydecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericBydecodeObjectType419.getTree());

                    }
                    break;

            }


            // JVM.g:658:32: ( DOT bytecodeObjectType )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==DOT) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // JVM.g:658:33: DOT bytecodeObjectType
                    {
                    DOT420=(Token)match(input,DOT,FOLLOW_DOT_in_bytecodeObjectType4866); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT420_tree = 
                    (Object)adaptor.create(DOT420)
                    ;
                    adaptor.addChild(root_0, DOT420_tree);
                    }

                    pushFollow(FOLLOW_bytecodeObjectType_in_bytecodeObjectType4868);
                    bytecodeObjectType421=bytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectType421.getTree());

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
    // $ANTLR end "bytecodeObjectType"


    public static class genericBydecodeObjectType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericBydecodeObjectType"
    // JVM.g:661:1: genericBydecodeObjectType : ( INTERNALTYPE | IDENTIFIER ) LESST ( bytecodeObjectType ( COMMA bytecodeObjectType )* | genericGenericReturnDescriptor ) LARGET ;
    public final JVMParser.genericBydecodeObjectType_return genericBydecodeObjectType() throws RecognitionException {
        JVMParser.genericBydecodeObjectType_return retval = new JVMParser.genericBydecodeObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set422=null;
        Token LESST423=null;
        Token COMMA425=null;
        Token LARGET428=null;
        JVMParser.bytecodeObjectType_return bytecodeObjectType424 =null;

        JVMParser.bytecodeObjectType_return bytecodeObjectType426 =null;

        JVMParser.genericGenericReturnDescriptor_return genericGenericReturnDescriptor427 =null;


        Object set422_tree=null;
        Object LESST423_tree=null;
        Object COMMA425_tree=null;
        Object LARGET428_tree=null;

        try {
            // JVM.g:662:3: ( ( INTERNALTYPE | IDENTIFIER ) LESST ( bytecodeObjectType ( COMMA bytecodeObjectType )* | genericGenericReturnDescriptor ) LARGET )
            // JVM.g:662:5: ( INTERNALTYPE | IDENTIFIER ) LESST ( bytecodeObjectType ( COMMA bytecodeObjectType )* | genericGenericReturnDescriptor ) LARGET
            {
            root_0 = (Object)adaptor.nil();


            set422=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set422)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            LESST423=(Token)match(input,LESST,FOLLOW_LESST_in_genericBydecodeObjectType4891); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST423_tree = 
            (Object)adaptor.create(LESST423)
            ;
            adaptor.addChild(root_0, LESST423_tree);
            }

            // JVM.g:662:39: ( bytecodeObjectType ( COMMA bytecodeObjectType )* | genericGenericReturnDescriptor )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==BOOLEAN||(LA98_0 >= BYTE && LA98_0 <= BaseType)||LA98_0==CHAR||LA98_0==CLASS||LA98_0==Constant_type||LA98_0==DEFAULT||LA98_0==DOUBLE||LA98_0==EXTENDS||LA98_0==FLOAT||(LA98_0 >= IDENTIFIER && LA98_0 <= IMPLEMENTS)||LA98_0==INT||LA98_0==INTERNALTYPE||LA98_0==LONG||LA98_0==SHORT||LA98_0==SUPER||LA98_0==THROWS||LA98_0==VOID||LA98_0==VoidType) ) {
                alt98=1;
            }
            else if ( (LA98_0==QUESTION) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }
            switch (alt98) {
                case 1 :
                    // JVM.g:662:40: bytecodeObjectType ( COMMA bytecodeObjectType )*
                    {
                    pushFollow(FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType4894);
                    bytecodeObjectType424=bytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectType424.getTree());

                    // JVM.g:662:59: ( COMMA bytecodeObjectType )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==COMMA) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // JVM.g:662:60: COMMA bytecodeObjectType
                    	    {
                    	    COMMA425=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericBydecodeObjectType4897); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    COMMA425_tree = 
                    	    (Object)adaptor.create(COMMA425)
                    	    ;
                    	    adaptor.addChild(root_0, COMMA425_tree);
                    	    }

                    	    pushFollow(FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType4899);
                    	    bytecodeObjectType426=bytecodeObjectType();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectType426.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // JVM.g:662:89: genericGenericReturnDescriptor
                    {
                    pushFollow(FOLLOW_genericGenericReturnDescriptor_in_genericBydecodeObjectType4905);
                    genericGenericReturnDescriptor427=genericGenericReturnDescriptor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericGenericReturnDescriptor427.getTree());

                    }
                    break;

            }


            LARGET428=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericBydecodeObjectType4908); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET428_tree = 
            (Object)adaptor.create(LARGET428)
            ;
            adaptor.addChild(root_0, LARGET428_tree);
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
    // $ANTLR end "genericBydecodeObjectType"


    public static class genericGenericReturnDescriptor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericGenericReturnDescriptor"
    // JVM.g:665:1: genericGenericReturnDescriptor : QUESTION ( ( SUPER | EXTENDS ) identifier )? ;
    public final JVMParser.genericGenericReturnDescriptor_return genericGenericReturnDescriptor() throws RecognitionException {
        JVMParser.genericGenericReturnDescriptor_return retval = new JVMParser.genericGenericReturnDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QUESTION429=null;
        Token set430=null;
        JVMParser.identifier_return identifier431 =null;


        Object QUESTION429_tree=null;
        Object set430_tree=null;

        try {
            // JVM.g:666:3: ( QUESTION ( ( SUPER | EXTENDS ) identifier )? )
            // JVM.g:666:5: QUESTION ( ( SUPER | EXTENDS ) identifier )?
            {
            root_0 = (Object)adaptor.nil();


            QUESTION429=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_genericGenericReturnDescriptor4921); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUESTION429_tree = 
            (Object)adaptor.create(QUESTION429)
            ;
            adaptor.addChild(root_0, QUESTION429_tree);
            }

            // JVM.g:666:14: ( ( SUPER | EXTENDS ) identifier )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==EXTENDS||LA99_0==SUPER) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // JVM.g:666:15: ( SUPER | EXTENDS ) identifier
                    {
                    set430=(Token)input.LT(1);

                    if ( input.LA(1)==EXTENDS||input.LA(1)==SUPER ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set430)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_identifier_in_genericGenericReturnDescriptor4933);
                    identifier431=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier431.getTree());

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
    // $ANTLR end "genericGenericReturnDescriptor"


    public static class bytecodeType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeType"
    // JVM.g:673:1: bytecodeType : ( bytecodeArrayType | bytecodeBaseType | simpleBytecodeObjectType SEMI | IDENTIFIER );
    public final JVMParser.bytecodeType_return bytecodeType() throws RecognitionException {
        JVMParser.bytecodeType_return retval = new JVMParser.bytecodeType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI435=null;
        Token IDENTIFIER436=null;
        JVMParser.bytecodeArrayType_return bytecodeArrayType432 =null;

        JVMParser.bytecodeBaseType_return bytecodeBaseType433 =null;

        JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType434 =null;


        Object SEMI435_tree=null;
        Object IDENTIFIER436_tree=null;

        try {
            // JVM.g:674:3: ( bytecodeArrayType | bytecodeBaseType | simpleBytecodeObjectType SEMI | IDENTIFIER )
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
                        alt100=3;
                        }
                        break;
                    case BaseType:
                        {
                        int LA100_7 = input.LA(4);

                        if ( (LA100_7==BaseType||LA100_7==IDENTIFIER||LA100_7==INTERNALTYPE||LA100_7==LARGET||LA100_7==LBRACK||LA100_7==MINUS||LA100_7==PLUS||LA100_7==STAR) ) {
                            alt100=3;
                        }
                        else if ( (LA100_7==EXTENDS) ) {
                            alt100=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 100, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA100_8 = input.LA(4);

                        if ( (LA100_8==BaseType||LA100_8==DOT||LA100_8==IDENTIFIER||LA100_8==INTERNALTYPE||LA100_8==LARGET||(LA100_8 >= LBRACK && LA100_8 <= LESST)||LA100_8==MINUS||LA100_8==PLUS||LA100_8==SEMI||LA100_8==STAR) ) {
                            alt100=3;
                        }
                        else if ( (LA100_8==EXTENDS) ) {
                            alt100=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 100, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case CLASS:
                    case Constant_type:
                    case DEFAULT:
                    case DOUBLE:
                    case EXTENDS:
                    case FLOAT:
                    case IMPLEMENTS:
                    case INT:
                    case LONG:
                    case SHORT:
                    case SUPER:
                    case THROWS:
                    case VOID:
                    case VoidType:
                        {
                        alt100=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case DOT:
                case SEMI:
                    {
                    alt100=3;
                    }
                    break;
                case EOF:
                case ABSTRACT:
                case AnnotationDefault:
                case BOOLEAN:
                case BYTE:
                case BaseType:
                case CHAR:
                case CLASS:
                case Constant_type:
                case DEFAULT:
                case DOUBLE:
                case Deprecated:
                case EXTENDS:
                case ExceptionTable:
                case Exceptions:
                case FINAL:
                case FLOAT:
                case Flag:
                case IDENTIFIER:
                case IMPLEMENTS:
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
                case NORMALTYPE:
                case PLUS:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case RBRACE:
                case RPAREN:
                case RuntimeInvisibleAnnotations:
                case RuntimeInvisibleParameterAnnotations:
                case RuntimeVisibleAnnotations:
                case RuntimeVisibleParameterAnnotations:
                case SHORT:
                case STAR:
                case STATIC:
                case SUPER:
                case SYNCHRONIZED:
                case Signature:
                case StackMap:
                case StackMapTable:
                case Synthetic:
                case THROWS:
                case TRANSIENT:
                case VOID:
                case VOLATILE:
                case VoidType:
                    {
                    alt100=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }

            switch (alt100) {
                case 1 :
                    // JVM.g:674:5: bytecodeArrayType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType4954);
                    bytecodeArrayType432=bytecodeArrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeArrayType432.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:674:25: bytecodeBaseType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeBaseType_in_bytecodeType4958);
                    bytecodeBaseType433=bytecodeBaseType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeBaseType433.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:674:44: simpleBytecodeObjectType SEMI
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_bytecodeType4962);
                    simpleBytecodeObjectType434=simpleBytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleBytecodeObjectType434.getTree());

                    SEMI435=(Token)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType4964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI435_tree = 
                    (Object)adaptor.create(SEMI435)
                    ;
                    adaptor.addChild(root_0, SEMI435_tree);
                    }

                    }
                    break;
                case 4 :
                    // JVM.g:674:76: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER436=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType4968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER436_tree = 
                    (Object)adaptor.create(IDENTIFIER436)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER436_tree);
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
    // JVM.g:677:1: bytecodeArrayType : LBRACK ( bytecodeType ) ;
    public final JVMParser.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        JVMParser.bytecodeArrayType_return retval = new JVMParser.bytecodeArrayType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK437=null;
        JVMParser.bytecodeType_return bytecodeType438 =null;


        Object LBRACK437_tree=null;

        try {
            // JVM.g:678:3: ( LBRACK ( bytecodeType ) )
            // JVM.g:678:5: LBRACK ( bytecodeType )
            {
            root_0 = (Object)adaptor.nil();


            LBRACK437=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType4982); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK437_tree = 
            (Object)adaptor.create(LBRACK437)
            ;
            adaptor.addChild(root_0, LBRACK437_tree);
            }

            // JVM.g:678:12: ( bytecodeType )
            // JVM.g:678:13: bytecodeType
            {
            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType4985);
            bytecodeType438=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType438.getTree());

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
    // $ANTLR end "bytecodeArrayType"


    public static class bytecodeBaseType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeBaseType"
    // JVM.g:681:2: bytecodeBaseType : BaseType ;
    public final JVMParser.bytecodeBaseType_return bytecodeBaseType() throws RecognitionException {
        JVMParser.bytecodeBaseType_return retval = new JVMParser.bytecodeBaseType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BaseType439=null;

        Object BaseType439_tree=null;

        try {
            // JVM.g:682:3: ( BaseType )
            // JVM.g:682:5: BaseType
            {
            root_0 = (Object)adaptor.nil();


            BaseType439=(Token)match(input,BaseType,FOLLOW_BaseType_in_bytecodeBaseType5001); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BaseType439_tree = 
            (Object)adaptor.create(BaseType439)
            ;
            adaptor.addChild(root_0, BaseType439_tree);
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
    // $ANTLR end "bytecodeBaseType"


    public static class simpleBytecodeObjectType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleBytecodeObjectType"
    // JVM.g:685:2: simpleBytecodeObjectType : ( INTERNALTYPE | IDENTIFIER | genericObjectType ) ( DOT simpleBytecodeObjectType )? ;
    public final JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        JVMParser.simpleBytecodeObjectType_return retval = new JVMParser.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERNALTYPE440=null;
        Token IDENTIFIER441=null;
        Token DOT443=null;
        JVMParser.genericObjectType_return genericObjectType442 =null;

        JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType444 =null;


        Object INTERNALTYPE440_tree=null;
        Object IDENTIFIER441_tree=null;
        Object DOT443_tree=null;

        try {
            // JVM.g:686:3: ( ( INTERNALTYPE | IDENTIFIER | genericObjectType ) ( DOT simpleBytecodeObjectType )? )
            // JVM.g:686:5: ( INTERNALTYPE | IDENTIFIER | genericObjectType ) ( DOT simpleBytecodeObjectType )?
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:686:5: ( INTERNALTYPE | IDENTIFIER | genericObjectType )
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==INTERNALTYPE) ) {
                int LA101_1 = input.LA(2);

                if ( (LA101_1==LESST) ) {
                    alt101=3;
                }
                else if ( (LA101_1==DOT||LA101_1==SEMI) ) {
                    alt101=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA101_0==IDENTIFIER) ) {
                int LA101_2 = input.LA(2);

                if ( (LA101_2==LESST) ) {
                    alt101=3;
                }
                else if ( (LA101_2==DOT||LA101_2==SEMI) ) {
                    alt101=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }
            switch (alt101) {
                case 1 :
                    // JVM.g:686:6: INTERNALTYPE
                    {
                    INTERNALTYPE440=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeObjectType5017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE440_tree = 
                    (Object)adaptor.create(INTERNALTYPE440)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE440_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:687:5: IDENTIFIER
                    {
                    IDENTIFIER441=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleBytecodeObjectType5023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER441_tree = 
                    (Object)adaptor.create(IDENTIFIER441)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER441_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:688:5: genericObjectType
                    {
                    pushFollow(FOLLOW_genericObjectType_in_simpleBytecodeObjectType5029);
                    genericObjectType442=genericObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericObjectType442.getTree());

                    }
                    break;

            }


            // JVM.g:688:24: ( DOT simpleBytecodeObjectType )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==DOT) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // JVM.g:688:25: DOT simpleBytecodeObjectType
                    {
                    DOT443=(Token)match(input,DOT,FOLLOW_DOT_in_simpleBytecodeObjectType5033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT443_tree = 
                    (Object)adaptor.create(DOT443)
                    ;
                    adaptor.addChild(root_0, DOT443_tree);
                    }

                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_simpleBytecodeObjectType5035);
                    simpleBytecodeObjectType444=simpleBytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleBytecodeObjectType444.getTree());

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
    // $ANTLR end "simpleBytecodeObjectType"


    public static class genericObjectType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericObjectType"
    // JVM.g:691:1: genericObjectType : ( INTERNALTYPE | IDENTIFIER ) LESST ( ( MINUS | PLUS )? bytecodeType | STAR )+ LARGET ;
    public final JVMParser.genericObjectType_return genericObjectType() throws RecognitionException {
        JVMParser.genericObjectType_return retval = new JVMParser.genericObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set445=null;
        Token LESST446=null;
        Token set447=null;
        Token STAR449=null;
        Token LARGET450=null;
        JVMParser.bytecodeType_return bytecodeType448 =null;


        Object set445_tree=null;
        Object LESST446_tree=null;
        Object set447_tree=null;
        Object STAR449_tree=null;
        Object LARGET450_tree=null;

        try {
            // JVM.g:691:18: ( ( INTERNALTYPE | IDENTIFIER ) LESST ( ( MINUS | PLUS )? bytecodeType | STAR )+ LARGET )
            // JVM.g:691:21: ( INTERNALTYPE | IDENTIFIER ) LESST ( ( MINUS | PLUS )? bytecodeType | STAR )+ LARGET
            {
            root_0 = (Object)adaptor.nil();


            set445=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set445)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            LESST446=(Token)match(input,LESST,FOLLOW_LESST_in_genericObjectType5056); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST446_tree = 
            (Object)adaptor.create(LESST446)
            ;
            adaptor.addChild(root_0, LESST446_tree);
            }

            // JVM.g:691:55: ( ( MINUS | PLUS )? bytecodeType | STAR )+
            int cnt104=0;
            loop104:
            do {
                int alt104=3;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==BaseType||LA104_0==IDENTIFIER||LA104_0==INTERNALTYPE||LA104_0==LBRACK||LA104_0==MINUS||LA104_0==PLUS) ) {
                    alt104=1;
                }
                else if ( (LA104_0==STAR) ) {
                    alt104=2;
                }


                switch (alt104) {
            	case 1 :
            	    // JVM.g:691:56: ( MINUS | PLUS )? bytecodeType
            	    {
            	    // JVM.g:691:56: ( MINUS | PLUS )?
            	    int alt103=2;
            	    int LA103_0 = input.LA(1);

            	    if ( (LA103_0==MINUS||LA103_0==PLUS) ) {
            	        alt103=1;
            	    }
            	    switch (alt103) {
            	        case 1 :
            	            // JVM.g:
            	            {
            	            set447=(Token)input.LT(1);

            	            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	                input.consume();
            	                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	                (Object)adaptor.create(set447)
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
            	            break;

            	    }


            	    pushFollow(FOLLOW_bytecodeType_in_genericObjectType5066);
            	    bytecodeType448=bytecodeType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType448.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:691:85: STAR
            	    {
            	    STAR449=(Token)match(input,STAR,FOLLOW_STAR_in_genericObjectType5070); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    STAR449_tree = 
            	    (Object)adaptor.create(STAR449)
            	    ;
            	    adaptor.addChild(root_0, STAR449_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt104 >= 1 ) break loop104;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(104, input);
                        throw eee;
                }
                cnt104++;
            } while (true);


            LARGET450=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericObjectType5074); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET450_tree = 
            (Object)adaptor.create(LARGET450)
            ;
            adaptor.addChild(root_0, LARGET450_tree);
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
    // $ANTLR end "genericObjectType"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // JVM.g:697:1: identifier : ( IDENTIFIER | keywordAggregate );
    public final JVMParser.identifier_return identifier() throws RecognitionException {
        JVMParser.identifier_return retval = new JVMParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER451=null;
        JVMParser.keywordAggregate_return keywordAggregate452 =null;


        Object IDENTIFIER451_tree=null;

        try {
            // JVM.g:697:11: ( IDENTIFIER | keywordAggregate )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==IDENTIFIER) ) {
                alt105=1;
            }
            else if ( (LA105_0==BOOLEAN||(LA105_0 >= BYTE && LA105_0 <= BaseType)||LA105_0==CHAR||LA105_0==CLASS||LA105_0==Constant_type||LA105_0==DEFAULT||LA105_0==DOUBLE||LA105_0==EXTENDS||LA105_0==FLOAT||LA105_0==IMPLEMENTS||LA105_0==INT||LA105_0==LONG||LA105_0==SHORT||LA105_0==SUPER||LA105_0==THROWS||LA105_0==VOID||LA105_0==VoidType) ) {
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
                    // JVM.g:697:13: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER451=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier5085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER451_tree = 
                    (Object)adaptor.create(IDENTIFIER451)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER451_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:697:26: keywordAggregate
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_keywordAggregate_in_identifier5089);
                    keywordAggregate452=keywordAggregate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keywordAggregate452.getTree());

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
    // JVM.g:699:1: keywordAggregate : ( BaseType | VoidType | primitiveType | Constant_type | EXTENDS | IMPLEMENTS | DEFAULT | CLASS | THROWS | SUPER );
    public final JVMParser.keywordAggregate_return keywordAggregate() throws RecognitionException {
        JVMParser.keywordAggregate_return retval = new JVMParser.keywordAggregate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BaseType453=null;
        Token VoidType454=null;
        Token Constant_type456=null;
        Token EXTENDS457=null;
        Token IMPLEMENTS458=null;
        Token DEFAULT459=null;
        Token CLASS460=null;
        Token THROWS461=null;
        Token SUPER462=null;
        JVMParser.primitiveType_return primitiveType455 =null;


        Object BaseType453_tree=null;
        Object VoidType454_tree=null;
        Object Constant_type456_tree=null;
        Object EXTENDS457_tree=null;
        Object IMPLEMENTS458_tree=null;
        Object DEFAULT459_tree=null;
        Object CLASS460_tree=null;
        Object THROWS461_tree=null;
        Object SUPER462_tree=null;

        try {
            // JVM.g:700:3: ( BaseType | VoidType | primitiveType | Constant_type | EXTENDS | IMPLEMENTS | DEFAULT | CLASS | THROWS | SUPER )
            int alt106=10;
            switch ( input.LA(1) ) {
            case BaseType:
                {
                alt106=1;
                }
                break;
            case VoidType:
                {
                alt106=2;
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
                alt106=3;
                }
                break;
            case Constant_type:
                {
                alt106=4;
                }
                break;
            case EXTENDS:
                {
                alt106=5;
                }
                break;
            case IMPLEMENTS:
                {
                alt106=6;
                }
                break;
            case DEFAULT:
                {
                alt106=7;
                }
                break;
            case CLASS:
                {
                alt106=8;
                }
                break;
            case THROWS:
                {
                alt106=9;
                }
                break;
            case SUPER:
                {
                alt106=10;
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
                    // JVM.g:700:5: BaseType
                    {
                    root_0 = (Object)adaptor.nil();


                    BaseType453=(Token)match(input,BaseType,FOLLOW_BaseType_in_keywordAggregate5099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BaseType453_tree = 
                    (Object)adaptor.create(BaseType453)
                    ;
                    adaptor.addChild(root_0, BaseType453_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:700:16: VoidType
                    {
                    root_0 = (Object)adaptor.nil();


                    VoidType454=(Token)match(input,VoidType,FOLLOW_VoidType_in_keywordAggregate5103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VoidType454_tree = 
                    (Object)adaptor.create(VoidType454)
                    ;
                    adaptor.addChild(root_0, VoidType454_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:700:27: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_keywordAggregate5107);
                    primitiveType455=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType455.getTree());

                    }
                    break;
                case 4 :
                    // JVM.g:700:43: Constant_type
                    {
                    root_0 = (Object)adaptor.nil();


                    Constant_type456=(Token)match(input,Constant_type,FOLLOW_Constant_type_in_keywordAggregate5111); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constant_type456_tree = 
                    (Object)adaptor.create(Constant_type456)
                    ;
                    adaptor.addChild(root_0, Constant_type456_tree);
                    }

                    }
                    break;
                case 5 :
                    // JVM.g:701:5: EXTENDS
                    {
                    root_0 = (Object)adaptor.nil();


                    EXTENDS457=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_keywordAggregate5117); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS457_tree = 
                    (Object)adaptor.create(EXTENDS457)
                    ;
                    adaptor.addChild(root_0, EXTENDS457_tree);
                    }

                    }
                    break;
                case 6 :
                    // JVM.g:701:15: IMPLEMENTS
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPLEMENTS458=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_keywordAggregate5121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS458_tree = 
                    (Object)adaptor.create(IMPLEMENTS458)
                    ;
                    adaptor.addChild(root_0, IMPLEMENTS458_tree);
                    }

                    }
                    break;
                case 7 :
                    // JVM.g:701:29: DEFAULT
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT459=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_keywordAggregate5126); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT459_tree = 
                    (Object)adaptor.create(DEFAULT459)
                    ;
                    adaptor.addChild(root_0, DEFAULT459_tree);
                    }

                    }
                    break;
                case 8 :
                    // JVM.g:701:40: CLASS
                    {
                    root_0 = (Object)adaptor.nil();


                    CLASS460=(Token)match(input,CLASS,FOLLOW_CLASS_in_keywordAggregate5131); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS460_tree = 
                    (Object)adaptor.create(CLASS460)
                    ;
                    adaptor.addChild(root_0, CLASS460_tree);
                    }

                    }
                    break;
                case 9 :
                    // JVM.g:701:49: THROWS
                    {
                    root_0 = (Object)adaptor.nil();


                    THROWS461=(Token)match(input,THROWS,FOLLOW_THROWS_in_keywordAggregate5136); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROWS461_tree = 
                    (Object)adaptor.create(THROWS461)
                    ;
                    adaptor.addChild(root_0, THROWS461_tree);
                    }

                    }
                    break;
                case 10 :
                    // JVM.g:701:59: SUPER
                    {
                    root_0 = (Object)adaptor.nil();


                    SUPER462=(Token)match(input,SUPER,FOLLOW_SUPER_in_keywordAggregate5141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER462_tree = 
                    (Object)adaptor.create(SUPER462)
                    ;
                    adaptor.addChild(root_0, SUPER462_tree);
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
    // JVM.g:704:1: primitiveType : ( boolean_type | numeric_type | VOID );
    public final JVMParser.primitiveType_return primitiveType() throws RecognitionException {
        JVMParser.primitiveType_return retval = new JVMParser.primitiveType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID465=null;
        JVMParser.boolean_type_return boolean_type463 =null;

        JVMParser.numeric_type_return numeric_type464 =null;


        Object VOID465_tree=null;

        try {
            // JVM.g:705:3: ( boolean_type | numeric_type | VOID )
            int alt107=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt107=1;
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
                alt107=2;
                }
                break;
            case VOID:
                {
                alt107=3;
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
                    // JVM.g:705:5: boolean_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_boolean_type_in_primitiveType5154);
                    boolean_type463=boolean_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_type463.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:706:5: numeric_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numeric_type_in_primitiveType5160);
                    numeric_type464=numeric_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_type464.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:707:5: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID465=(Token)match(input,VOID,FOLLOW_VOID_in_primitiveType5166); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID465_tree = 
                    (Object)adaptor.create(VOID465)
                    ;
                    adaptor.addChild(root_0, VOID465_tree);
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
    // JVM.g:710:1: boolean_type : BOOLEAN ;
    public final JVMParser.boolean_type_return boolean_type() throws RecognitionException {
        JVMParser.boolean_type_return retval = new JVMParser.boolean_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN466=null;

        Object BOOLEAN466_tree=null;

        try {
            // JVM.g:711:3: ( BOOLEAN )
            // JVM.g:711:5: BOOLEAN
            {
            root_0 = (Object)adaptor.nil();


            BOOLEAN466=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type5179); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN466_tree = 
            (Object)adaptor.create(BOOLEAN466)
            ;
            adaptor.addChild(root_0, BOOLEAN466_tree);
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
    // JVM.g:714:1: numeric_type : ( floating_point_type | integral_type );
    public final JVMParser.numeric_type_return numeric_type() throws RecognitionException {
        JVMParser.numeric_type_return retval = new JVMParser.numeric_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.floating_point_type_return floating_point_type467 =null;

        JVMParser.integral_type_return integral_type468 =null;



        try {
            // JVM.g:715:3: ( floating_point_type | integral_type )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==DOUBLE||LA108_0==FLOAT) ) {
                alt108=1;
            }
            else if ( (LA108_0==BYTE||LA108_0==CHAR||LA108_0==INT||LA108_0==LONG||LA108_0==SHORT) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }
            switch (alt108) {
                case 1 :
                    // JVM.g:715:5: floating_point_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_floating_point_type_in_numeric_type5192);
                    floating_point_type467=floating_point_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, floating_point_type467.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:716:5: integral_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_integral_type_in_numeric_type5198);
                    integral_type468=integral_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integral_type468.getTree());

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
    // JVM.g:719:1: integral_type : ( BYTE | SHORT | INT | LONG | CHAR );
    public final JVMParser.integral_type_return integral_type() throws RecognitionException {
        JVMParser.integral_type_return retval = new JVMParser.integral_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set469=null;

        Object set469_tree=null;

        try {
            // JVM.g:720:3: ( BYTE | SHORT | INT | LONG | CHAR )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set469=(Token)input.LT(1);

            if ( input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set469)
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
    // JVM.g:727:1: floating_point_type : ( FLOAT | DOUBLE );
    public final JVMParser.floating_point_type_return floating_point_type() throws RecognitionException {
        JVMParser.floating_point_type_return retval = new JVMParser.floating_point_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set470=null;

        Object set470_tree=null;

        try {
            // JVM.g:728:3: ( FLOAT | DOUBLE )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set470=(Token)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set470)
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
    // JVM.g:732:1: literals : ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER );
    public final JVMParser.literals_return literals() throws RecognitionException {
        JVMParser.literals_return retval = new JVMParser.literals_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LONGLITERAL471=null;
        Token INTLITERAL472=null;
        Token FLOATLITERAL473=null;
        Token DOUBLELITERAL474=null;
        Token CHARLITERAL475=null;
        Token STRINGLITERAL476=null;
        Token BOOLEANLITERAL477=null;
        Token MINUS478=null;
        Token IDENTIFIER479=null;

        Object LONGLITERAL471_tree=null;
        Object INTLITERAL472_tree=null;
        Object FLOATLITERAL473_tree=null;
        Object DOUBLELITERAL474_tree=null;
        Object CHARLITERAL475_tree=null;
        Object STRINGLITERAL476_tree=null;
        Object BOOLEANLITERAL477_tree=null;
        Object MINUS478_tree=null;
        Object IDENTIFIER479_tree=null;

        try {
            // JVM.g:733:3: ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL | ( MINUS )? IDENTIFIER )
            int alt110=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt110=1;
                }
                break;
            case INTLITERAL:
                {
                alt110=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt110=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt110=4;
                }
                break;
            case CHARLITERAL:
                {
                alt110=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt110=6;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt110=7;
                }
                break;
            case IDENTIFIER:
            case MINUS:
                {
                alt110=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }

            switch (alt110) {
                case 1 :
                    // JVM.g:733:5: LONGLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    LONGLITERAL471=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literals5267); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LONGLITERAL471_tree = 
                    (Object)adaptor.create(LONGLITERAL471)
                    ;
                    adaptor.addChild(root_0, LONGLITERAL471_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:734:5: INTLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    INTLITERAL472=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literals5273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL472_tree = 
                    (Object)adaptor.create(INTLITERAL472)
                    ;
                    adaptor.addChild(root_0, INTLITERAL472_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:735:5: FLOATLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOATLITERAL473=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literals5279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOATLITERAL473_tree = 
                    (Object)adaptor.create(FLOATLITERAL473)
                    ;
                    adaptor.addChild(root_0, FLOATLITERAL473_tree);
                    }

                    }
                    break;
                case 4 :
                    // JVM.g:736:5: DOUBLELITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLELITERAL474=(Token)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literals5285); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLELITERAL474_tree = 
                    (Object)adaptor.create(DOUBLELITERAL474)
                    ;
                    adaptor.addChild(root_0, DOUBLELITERAL474_tree);
                    }

                    }
                    break;
                case 5 :
                    // JVM.g:737:5: CHARLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHARLITERAL475=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literals5291); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARLITERAL475_tree = 
                    (Object)adaptor.create(CHARLITERAL475)
                    ;
                    adaptor.addChild(root_0, CHARLITERAL475_tree);
                    }

                    }
                    break;
                case 6 :
                    // JVM.g:738:5: STRINGLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRINGLITERAL476=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literals5297); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRINGLITERAL476_tree = 
                    (Object)adaptor.create(STRINGLITERAL476)
                    ;
                    adaptor.addChild(root_0, STRINGLITERAL476_tree);
                    }

                    }
                    break;
                case 7 :
                    // JVM.g:739:5: BOOLEANLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    BOOLEANLITERAL477=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literals5303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEANLITERAL477_tree = 
                    (Object)adaptor.create(BOOLEANLITERAL477)
                    ;
                    adaptor.addChild(root_0, BOOLEANLITERAL477_tree);
                    }

                    }
                    break;
                case 8 :
                    // JVM.g:740:5: ( MINUS )? IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    // JVM.g:740:5: ( MINUS )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==MINUS) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // JVM.g:740:5: MINUS
                            {
                            MINUS478=(Token)match(input,MINUS,FOLLOW_MINUS_in_literals5309); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            MINUS478_tree = 
                            (Object)adaptor.create(MINUS478)
                            ;
                            adaptor.addChild(root_0, MINUS478_tree);
                            }

                            }
                            break;

                    }


                    IDENTIFIER479=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literals5312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER479_tree = 
                    (Object)adaptor.create(IDENTIFIER479)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER479_tree);
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
    // JVM.g:743:1: pc : INTLITERAL COLON ;
    public final JVMParser.pc_return pc() throws RecognitionException {
        JVMParser.pc_return retval = new JVMParser.pc_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL480=null;
        Token COLON481=null;

        Object INTLITERAL480_tree=null;
        Object COLON481_tree=null;

        try {
            // JVM.g:744:3: ( INTLITERAL COLON )
            // JVM.g:744:5: INTLITERAL COLON
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL480=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc5325); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL480_tree = 
            (Object)adaptor.create(INTLITERAL480)
            ;
            adaptor.addChild(root_0, INTLITERAL480_tree);
            }

            COLON481=(Token)match(input,COLON,FOLLOW_COLON_in_pc5327); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON481_tree = 
            (Object)adaptor.create(COLON481)
            ;
            adaptor.addChild(root_0, COLON481_tree);
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
        // JVM.g:247:5: ( methodDefinition )
        // JVM.g:247:6: methodDefinition
        {
        pushFollow(FOLLOW_methodDefinition_in_synpred1_JVM1754);
        methodDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_JVM

    // $ANTLR start synpred2_JVM
    public final void synpred2_JVM_fragment() throws RecognitionException {
        // JVM.g:248:5: ( ctorDefinition )
        // JVM.g:248:6: ctorDefinition
        {
        pushFollow(FOLLOW_ctorDefinition_in_synpred2_JVM1766);
        ctorDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_JVM

    // $ANTLR start synpred3_JVM
    public final void synpred3_JVM_fragment() throws RecognitionException {
        // JVM.g:249:5: ( fieldDefinition )
        // JVM.g:249:6: fieldDefinition
        {
        pushFollow(FOLLOW_fieldDefinition_in_synpred3_JVM1778);
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


 

    public static final BitSet FOLLOW_class_file_in_program149 = new BitSet(new long[]{0xC018081500056812L,0x0100400408001006L,0x0000000000028004L});
    public static final BitSet FOLLOW_class_file_header_in_class_file160 = new BitSet(new long[]{0xC018081500056810L,0x0100400408001006L,0x0000000000028004L});
    public static final BitSet FOLLOW_classDefinition_in_class_file162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header189 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header195 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header201 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header207 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info248 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info252 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info254 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_modified_file_info256 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info260 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info294 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info296 = new BitSet(new long[]{0x4800000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexDigits_in_checksum_file_info303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info335 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info337 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition366 = new BitSet(new long[]{0xC018081500056810L,0x0100400008001006L,0x0000000000028004L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition369 = new BitSet(new long[]{0xC018081500056810L,0x0100400008001006L,0x0000000000028004L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_classDefinition372 = new BitSet(new long[]{0xC040188000000000L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_superClass_in_classDefinition374 = new BitSet(new long[]{0xC040108000000000L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_superInterface_in_classDefinition377 = new BitSet(new long[]{0x4040108000000000L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_type_info_in_classDefinition385 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LBRACE_in_classDefinition397 = new BitSet(new long[]{0xC018081500056810L,0x052040270A001802L,0x0000000000038014L});
    public static final BitSet FOLLOW_classBody_in_classDefinition404 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_RBRACE_in_classDefinition411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_superClass517 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_typeList_in_superClass519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_superInterface542 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_typeList_in_superInterface544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info620 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_minor_major_version_info_in_type_info626 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_flags_in_type_info632 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info638 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info645 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info651 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info657 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info663 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_deprecated_in_type_info669 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_synthetic_in_type_info675 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_scala_info_in_type_info681 = new BitSet(new long[]{0x4040108000000002L,0x7800080000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic696 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated719 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod742 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod744 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod746 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info777 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_sourcefile_info779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ScalaSig_in_scalaSig_info801 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scalaSig_info807 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scalaSig_info809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Scala_in_scala_info881 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scala_info887 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scala_info889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_scala_info891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition927 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info953 = new BitSet(new long[]{0x0008000002000010L,0x0420000702000000L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info955 = new BitSet(new long[]{0x0008000002000012L,0x0420000702000000L});
    public static final BitSet FOLLOW_method_visual_modifier_in_innerclass_info_line981 = new BitSet(new long[]{0x0008000002000010L,0x0420000002000000L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line984 = new BitSet(new long[]{0x0008000002000010L,0x0420000002000000L});
    public static final BitSet FOLLOW_innerclass_info_data_in_innerclass_info_line987 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_innerclass_info_line989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1034 = new BitSet(new long[]{0x4000000000000102L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_data1044 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1046 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_data1049 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_data1081 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info1186 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info1188 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_minor_major_version_info1190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_major_version_info1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Flag_in_flags1224 = new BitSet(new long[]{0x4000000000000000L,0x0000000001000010L});
    public static final BitSet FOLLOW_accessFlagList_in_flags1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_Marker_in_flags1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList1253 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_accessFlagList1256 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList1258 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem1330 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_runtimeVisibleAnnotationsItem1334 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1336 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_runtimeVisibleAnnotationsItem1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1360 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_runtimeVisibleAnnotationAssignList1363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1365 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign1384 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign1386 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000400L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationAssign1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationAssign1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_brackedAnnotationAssign1442 = new BitSet(new long[]{0x0000000000000200L,0x0000004000000000L});
    public static final BitSet FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign1444 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_RBRACK_in_brackedAnnotationAssign1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1459 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_brackedAnnotationAssignList1462 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1464 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue1483 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_brackedAnnotationAssignValue1486 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue1488 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_brackedAnnotationAssignValue1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations1504 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations1511 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1533 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1540 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pc_in_parameterVisibilityInfo1594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo1600 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1625 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem1627 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem1630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_runtimeInvisibleAnnotationsItem1632 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem1634 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_runtimeInvisibleAnnotationsItem1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1672 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool1676 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_constant_pool1678 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool1685 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line1711 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line1713 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_classBody1759 = new BitSet(new long[]{0xC018081500056812L,0x052040070A001802L,0x0000000000038014L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBody1771 = new BitSet(new long[]{0xC018081500056812L,0x052040070A001802L,0x0000000000038014L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBody1783 = new BitSet(new long[]{0xC018081500056812L,0x052040070A001802L,0x0000000000038014L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBody1789 = new BitSet(new long[]{0xC018081500056812L,0x052040070A001802L,0x0000000000038014L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition1819 = new BitSet(new long[]{0xC018081500056800L,0x0120400008001002L,0x0000000000038014L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition1822 = new BitSet(new long[]{0xC018081500056800L,0x0120400008001002L,0x0000000000038014L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_fieldDefinition1827 = new BitSet(new long[]{0xC010081500056800L,0x0100400000001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_identifier_in_fieldDefinition1831 = new BitSet(new long[]{0x0000000000000100L,0x0000200000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_fieldDefinition1834 = new BitSet(new long[]{0x4020002000021000L,0x0080000000402010L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition1836 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_fieldDefinition1840 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition1847 = new BitSet(new long[]{0x0000008080000002L,0x20000A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition1853 = new BitSet(new long[]{0x0000008080000002L,0x20000A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo1951 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000408L});
    public static final BitSet FOLLOW_fieldInfoOption1_in_fieldInfo1953 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_flags_in_fieldInfo1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1983 = new BitSet(new long[]{0x0010001000012800L,0x0000400000001002L,0x0000000000008000L});
    public static final BitSet FOLLOW_fieldInfoOption3_in_fieldAdditionalInfo1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo1999 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_fieldInfoOption4_in_fieldAdditionalInfo2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo2015 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_fieldInfoOption5_in_fieldAdditionalInfo2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo2031 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo2047 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfoOption12088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldInfoOption22104 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_fieldInfoOption22107 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldInfoOption22109 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_primitiveType_in_fieldInfoOption32130 = new BitSet(new long[]{0x4020002000021000L,0x0080000000402010L});
    public static final BitSet FOLLOW_literals_in_fieldInfoOption32132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldInfoOption42146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldInfoOption52161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldInfoOption62176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition2247 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_STATIC_in_staticCtorDefinition2250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LBRACE_in_staticCtorDefinition2252 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_RBRACE_in_staticCtorDefinition2254 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_staticCtorDefinition2256 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition2263 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition2309 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001802L,0x0000000000028004L});
    public static final BitSet FOLLOW_genericDescriptor_in_ctorDefinition2312 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_javaType_in_ctorDefinition2315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition2317 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition2319 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_ctorDefinition2322 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition2329 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_ctorDefinition2335 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_visual_modifier_in_methodDefinition2498 = new BitSet(new long[]{0xC018081500056810L,0x052040000A001802L,0x0000000000028004L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition2501 = new BitSet(new long[]{0xC018081500056810L,0x052040000A001802L,0x0000000000028004L});
    public static final BitSet FOLLOW_genericDescriptor_in_methodDefinition2504 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_methodDefinition2507 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_methodDefinition2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition2511 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_throwClauseMethod_in_methodDefinition2513 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_methodDefinition2516 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition2523 = new BitSet(new long[]{0x0000808040000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_body_in_methodDefinition2529 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_methodInfo2703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo2705 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfo2736 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_methodDeprecatedInfo_in_afterMethodInfo2739 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfo2756 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfo2758 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfo2790 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo2796 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfo2802 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfo2808 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfo2814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfo2817 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfo2844 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo2846 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfo2871 = new BitSet(new long[]{0x0000808000000402L,0x20001E0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault2886 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault2889 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000400L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationDefault2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationDefault2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodSignatureInfo2974 = new BitSet(new long[]{0x4000000000004000L,0x0000010000000408L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo2976 = new BitSet(new long[]{0x4000000000004000L,0x0000010000000408L});
    public static final BitSet FOLLOW_RPAREN_in_methodSignatureInfo2979 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000408L,0x0000000000020000L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_methodDeprecatedInfo3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3100 = new BitSet(new long[]{0xC010081D00056800L,0x0100410008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_typeList_in_arguments3102 = new BitSet(new long[]{0x0000000800000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments3106 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_arguments3108 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_arguments3110 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_body3159 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_body3161 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_Code_in_body3169 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_codeBlock_in_body3176 = new BitSet(new long[]{0x0000400000000002L,0x80000000001C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bodyExtension_in_body3182 = new BitSet(new long[]{0x0000400000000002L,0x80000000001C0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension3224 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension3255 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension3284 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension3307 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension3326 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension3358 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_codeBlock3402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_instructionSet_in_codeBlock3409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_codeLine_in_instructionSet3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaSwitch_in_instructionSet3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeLine3494 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine3496 = new BitSet(new long[]{0x0010001002012802L,0x0000400000001012L,0x0000000000008000L});
    public static final BitSet FOLLOW_codeValue_in_codeLine3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd3523 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd3525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_logic3_in_codeBlockEnd3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_codeValue3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic2_in_codeValue3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic3_in_codeValue3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic4_in_codeValue3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_codeValue3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_logic3599 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_logic3601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_logic23618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic33633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic43648 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_logic43650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic43652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables3665 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_variables3667 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_variable_in_variables3669 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_variables3671 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_variable_in_variables3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable3694 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_variable3696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_javaSwitch3733 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch3735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LBRACE_in_javaSwitch3741 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch3748 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch3755 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_RBRACE_in_javaSwitch3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_switchLine3826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine3842 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_switchDefaultLine3844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_throwClause3887 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_javaTypeList_in_throwClause3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_throwClauseMethod3933 = new BitSet(new long[]{0x4000000000000000L,0x0000000008000008L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod3935 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_throwClauseMethod3938 = new BitSet(new long[]{0x4000000000000000L,0x0000000008000008L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod3940 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable4031 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable4033 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable4035 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable4037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable4044 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry4079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry4081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry4083 = new BitSet(new long[]{0x4010001001012800L,0x0000400000001002L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntry4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntry4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntry4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable4118 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine4132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine4134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4158 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4160 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4162 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4164 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable4166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable4173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine4222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine4226 = new BitSet(new long[]{0xC010081500056800L,0x0120400000001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_identifier_in_localVariableTableLine4229 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000408L});
    public static final BitSet FOLLOW_STATIC_in_localVariableTableLine4233 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000408L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable4253 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable4255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable4257 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable4264 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4310 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4314 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4316 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry4320 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4327 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4331 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry4338 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry4340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable4360 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable4362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable4364 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable4371 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry4384 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry4386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntry4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntry4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_stackMapTableTypesContainer4408 = new BitSet(new long[]{0x4010001000052800L,0x0000404000001002L,0x0000000000008000L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer4410 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_RBRACK_in_stackMapTableTypesContainer4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes4428 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_stackMapTableTypes4431 = new BitSet(new long[]{0x4010001000052800L,0x0000400000001002L,0x0000000000008000L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes4433 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableType4460 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableType4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject4476 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_stackMapTableTypePlainObject4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject4496 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_typeList4519 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_typeList4522 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_typeList4524 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_aggregatedJavaType4549 = new BitSet(new long[]{0x0000000800000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_DOT_in_aggregatedJavaType4552 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_aggregatedJavaType4554 = new BitSet(new long[]{0x0000000800000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_LBRACK_in_aggregatedJavaType4560 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_RBRACK_in_aggregatedJavaType4562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_javaType_in_javaTypeIdentifier4579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_genericConstraintList_in_javaTypeIdentifier4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericList_in_javaTypeIdentifier4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_genericConstraintList4601 = new BitSet(new long[]{0xC010081500056800L,0x0100400000001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_genericConstraints_in_genericConstraintList4603 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_genericConstraintList4606 = new BitSet(new long[]{0xC010081500056800L,0x0100400000001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_genericConstraints_in_genericConstraintList4608 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LARGET_in_genericConstraintList4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_genericConstraints4630 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_EXTENDS_in_genericConstraints4632 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_genericConstraints4634 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_genericConstraints4637 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_genericConstraints4639 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_LESST_in_genericList4667 = new BitSet(new long[]{0xC010081500056800L,0x0100400808001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_genericConstraint_in_genericList4670 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_genericList4672 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_genericList4676 = new BitSet(new long[]{0xC010081500056800L,0x0100400808001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_genericConstraint_in_genericList4679 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_genericList4681 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LARGET_in_genericList4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericConstraint4701 = new BitSet(new long[]{0x0000080000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_set_in_genericConstraint4704 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_genericConstraint4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_javaTypeList4728 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COMMA_in_javaTypeList4731 = new BitSet(new long[]{0xC010081500056800L,0x0100400008001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_javaType_in_javaTypeList4733 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_identifier_in_javaType4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMALTYPE_in_javaType4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_genericDescriptor4776 = new BitSet(new long[]{0xC010081500056800L,0x0100400000001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor4778 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_genericDescriptor4781 = new BitSet(new long[]{0xC010081500056800L,0x0100400000001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor4783 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LARGET_in_genericDescriptor4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor4805 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor4807 = new BitSet(new long[]{0xC010081500056800L,0x010040000000100AL,0x0000000000028004L});
    public static final BitSet FOLLOW_bytecodeObjectTypeList_in_genericReturnDescriptor4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_bytecodeObjectTypeList4823 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_bytecodeObjectTypeList4826 = new BitSet(new long[]{0xC010081500056800L,0x010040000000100AL,0x0000000000028004L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_bytecodeObjectTypeList4828 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeObjectType4850 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_identifier_in_bytecodeObjectType4856 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_genericBydecodeObjectType_in_bytecodeObjectType4862 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_bytecodeObjectType4866 = new BitSet(new long[]{0xC010081500056800L,0x010040000000100AL,0x0000000000028004L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_bytecodeObjectType4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_genericBydecodeObjectType4883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LESST_in_genericBydecodeObjectType4891 = new BitSet(new long[]{0xC010081500056800L,0x010040080000100AL,0x0000000000028004L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType4894 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_genericBydecodeObjectType4897 = new BitSet(new long[]{0xC010081500056800L,0x010040000000100AL,0x0000000000028004L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType4899 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_genericGenericReturnDescriptor_in_genericBydecodeObjectType4905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LARGET_in_genericBydecodeObjectType4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericGenericReturnDescriptor4921 = new BitSet(new long[]{0x0000080000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_set_in_genericGenericReturnDescriptor4924 = new BitSet(new long[]{0xC010081500056800L,0x0100400000001002L,0x0000000000028004L});
    public static final BitSet FOLLOW_identifier_in_genericGenericReturnDescriptor4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeBaseType_in_bytecodeType4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_bytecodeType4962 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType4982 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000408L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeBaseType5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeObjectType5017 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleBytecodeObjectType5023 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_genericObjectType_in_simpleBytecodeObjectType5029 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_simpleBytecodeObjectType5033 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_simpleBytecodeObjectType5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_genericObjectType5048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LESST_in_genericObjectType5056 = new BitSet(new long[]{0x4000000000004000L,0x0010000080400408L});
    public static final BitSet FOLLOW_bytecodeType_in_genericObjectType5066 = new BitSet(new long[]{0x4000000000004000L,0x0010000080400508L});
    public static final BitSet FOLLOW_STAR_in_genericObjectType5070 = new BitSet(new long[]{0x4000000000004000L,0x0010000080400508L});
    public static final BitSet FOLLOW_LARGET_in_genericObjectType5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keywordAggregate_in_identifier5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_keywordAggregate5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_keywordAggregate5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_keywordAggregate5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_type_in_keywordAggregate5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_keywordAggregate5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_keywordAggregate5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_keywordAggregate5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_keywordAggregate5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_keywordAggregate5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_keywordAggregate5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literals5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literals5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literals5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literals5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literals5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literals5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literals5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literals5309 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literals5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc5325 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_in_pc5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_synpred1_JVM1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_synpred2_JVM1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_synpred3_JVM1778 = new BitSet(new long[]{0x0000000000000002L});

}