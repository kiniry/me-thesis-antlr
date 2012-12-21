// $ANTLR 3.4 JVM.g 2012-12-21 11:56:55

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AND", "ASSIGN", "AnnotationAssign", "AnnotationDefault", "BOOLEAN", "BOOLEANLITERAL", "BYTE", "BaseType", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONSTANT_TYPE_ASSIGNABLE", "CPINDEX", "Code", "Constant", "Constant_type", "DATE", "DEFAULT", "DOT", "DOUBLE", "DOUBLELITERAL", "DefaultValue", "Deprecated", "DoubleSuffix", "EXTENDS", "EnclosingMethod", "EscapeSequence", "ExceptionTable", "Exceptions", "Exponent", "FALSE", "FINAL", "FLOAT", "FLOATLITERAL", "Flag", "FloatSuffix", "HASH", "HexDigit", "HexDigits", "HexPrefix", "IDENTIFIER", "IMPLEMENTS", "INT", "INTERFACE", "INTERNALTYPE", "INTLITERAL", "InnerClasses", "IntDigit", "IntegerNumber", "LARGET", "LBRACE", "LBRACK", "LESST", "LONG", "LONGLITERAL", "LPAREN", "Letter", "LineNumberTable", "LocalVariableTable", "LocalVariableTypeTable", "LongSuffix", "MAJOR_VERSION", "MINOR_VERSION", "MINUS", "Marker", "NATIVE", "NL", "NORMALTYPE", "NonIntegerNumber", "Octal", "OctalEscape", "PLUS", "PRIVATE", "PROTECTED", "PUBLIC", "QUESTION", "QUOTE", "RBRACE", "RBRACK", "RPAREN", "RuntimeVisibleAnnotations", "SEMI", "SHORT", "SLASH", "STAR", "STATIC", "STRINGLITERAL", "SUPER", "SYNCHRONIZED", "Scala", "ScalaSig", "Signature", "SourceFile", "StackMap", "StackMapTable", "Synthetic", "THROWS", "TRANSIENT", "TRUE", "Throws", "UNDERSCORE", "UnicodeEscapeSequence", "VOID", "VOLATILE", "VersionedInternalType", "VoidType", "WINDOWSPATH", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AND=5;
    public static final int ASSIGN=6;
    public static final int AnnotationAssign=7;
    public static final int AnnotationDefault=8;
    public static final int BOOLEAN=9;
    public static final int BOOLEANLITERAL=10;
    public static final int BYTE=11;
    public static final int BaseType=12;
    public static final int CHAR=13;
    public static final int CHARLITERAL=14;
    public static final int CLASS=15;
    public static final int COLON=16;
    public static final int COMMA=17;
    public static final int COMMENT=18;
    public static final int CONSTANT_TYPE_ASSIGNABLE=19;
    public static final int CPINDEX=20;
    public static final int Code=21;
    public static final int Constant=22;
    public static final int Constant_type=23;
    public static final int DATE=24;
    public static final int DEFAULT=25;
    public static final int DOT=26;
    public static final int DOUBLE=27;
    public static final int DOUBLELITERAL=28;
    public static final int DefaultValue=29;
    public static final int Deprecated=30;
    public static final int DoubleSuffix=31;
    public static final int EXTENDS=32;
    public static final int EnclosingMethod=33;
    public static final int EscapeSequence=34;
    public static final int ExceptionTable=35;
    public static final int Exceptions=36;
    public static final int Exponent=37;
    public static final int FALSE=38;
    public static final int FINAL=39;
    public static final int FLOAT=40;
    public static final int FLOATLITERAL=41;
    public static final int Flag=42;
    public static final int FloatSuffix=43;
    public static final int HASH=44;
    public static final int HexDigit=45;
    public static final int HexDigits=46;
    public static final int HexPrefix=47;
    public static final int IDENTIFIER=48;
    public static final int IMPLEMENTS=49;
    public static final int INT=50;
    public static final int INTERFACE=51;
    public static final int INTERNALTYPE=52;
    public static final int INTLITERAL=53;
    public static final int InnerClasses=54;
    public static final int IntDigit=55;
    public static final int IntegerNumber=56;
    public static final int LARGET=57;
    public static final int LBRACE=58;
    public static final int LBRACK=59;
    public static final int LESST=60;
    public static final int LONG=61;
    public static final int LONGLITERAL=62;
    public static final int LPAREN=63;
    public static final int Letter=64;
    public static final int LineNumberTable=65;
    public static final int LocalVariableTable=66;
    public static final int LocalVariableTypeTable=67;
    public static final int LongSuffix=68;
    public static final int MAJOR_VERSION=69;
    public static final int MINOR_VERSION=70;
    public static final int MINUS=71;
    public static final int Marker=72;
    public static final int NATIVE=73;
    public static final int NL=74;
    public static final int NORMALTYPE=75;
    public static final int NonIntegerNumber=76;
    public static final int Octal=77;
    public static final int OctalEscape=78;
    public static final int PLUS=79;
    public static final int PRIVATE=80;
    public static final int PROTECTED=81;
    public static final int PUBLIC=82;
    public static final int QUESTION=83;
    public static final int QUOTE=84;
    public static final int RBRACE=85;
    public static final int RBRACK=86;
    public static final int RPAREN=87;
    public static final int RuntimeVisibleAnnotations=88;
    public static final int SEMI=89;
    public static final int SHORT=90;
    public static final int SLASH=91;
    public static final int STAR=92;
    public static final int STATIC=93;
    public static final int STRINGLITERAL=94;
    public static final int SUPER=95;
    public static final int SYNCHRONIZED=96;
    public static final int Scala=97;
    public static final int ScalaSig=98;
    public static final int Signature=99;
    public static final int SourceFile=100;
    public static final int StackMap=101;
    public static final int StackMapTable=102;
    public static final int Synthetic=103;
    public static final int THROWS=104;
    public static final int TRANSIENT=105;
    public static final int TRUE=106;
    public static final int Throws=107;
    public static final int UNDERSCORE=108;
    public static final int UnicodeEscapeSequence=109;
    public static final int VOID=110;
    public static final int VOLATILE=111;
    public static final int VersionedInternalType=112;
    public static final int VoidType=113;
    public static final int WINDOWSPATH=114;
    public static final int WS=115;

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
    // JVM.g:20:1: program : ( class_file )* ;
    public final JVMParser.program_return program() throws RecognitionException {
        JVMParser.program_return retval = new JVMParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_return class_file1 =null;



        try {
            // JVM.g:20:9: ( ( class_file )* )
            // JVM.g:20:11: ( class_file )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:20:11: ( class_file )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ABSTRACT||LA1_0==BaseType||LA1_0==CLASS||LA1_0==DEFAULT||LA1_0==FINAL||LA1_0==IDENTIFIER||LA1_0==INTERFACE||LA1_0==NORMALTYPE||LA1_0==PUBLIC||LA1_0==VoidType) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // JVM.g:20:11: class_file
            	    {
            	    pushFollow(FOLLOW_class_file_in_program51);
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
    // JVM.g:22:1: class_file : class_file_header classDefinition ;
    public final JVMParser.class_file_return class_file() throws RecognitionException {
        JVMParser.class_file_return retval = new JVMParser.class_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_header_return class_file_header2 =null;

        JVMParser.classDefinition_return classDefinition3 =null;



        try {
            // JVM.g:23:2: ( class_file_header classDefinition )
            // JVM.g:23:4: class_file_header classDefinition
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_class_file_header_in_class_file61);
            class_file_header2=class_file_header();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, class_file_header2.getTree());

            pushFollow(FOLLOW_classDefinition_in_class_file63);
            classDefinition3=classDefinition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition3.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:25:1: class_file_header : ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )* ;
    public final JVMParser.class_file_header_return class_file_header() throws RecognitionException {
        JVMParser.class_file_header_return retval = new JVMParser.class_file_header_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.class_file_info_return class_file_info4 =null;

        JVMParser.modified_file_info_return modified_file_info5 =null;

        JVMParser.checksum_file_info_return checksum_file_info6 =null;

        JVMParser.compiled_file_info_return compiled_file_info7 =null;



        try {
            // JVM.g:26:2: ( ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )* )
            // JVM.g:26:4: ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:26:4: ( class_file_info | modified_file_info | checksum_file_info | compiled_file_info )*
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
                        case HexDigits:
                        case IDENTIFIER:
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


                switch (alt2) {
            	case 1 :
            	    // JVM.g:26:5: class_file_info
            	    {
            	    pushFollow(FOLLOW_class_file_info_in_class_file_header74);
            	    class_file_info4=class_file_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_file_info4.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:27:4: modified_file_info
            	    {
            	    pushFollow(FOLLOW_modified_file_info_in_class_file_header79);
            	    modified_file_info5=modified_file_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modified_file_info5.getTree());

            	    }
            	    break;
            	case 3 :
            	    // JVM.g:28:4: checksum_file_info
            	    {
            	    pushFollow(FOLLOW_checksum_file_info_in_class_file_header84);
            	    checksum_file_info6=checksum_file_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, checksum_file_info6.getTree());

            	    }
            	    break;
            	case 4 :
            	    // JVM.g:29:4: compiled_file_info
            	    {
            	    pushFollow(FOLLOW_compiled_file_info_in_class_file_header89);
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
    // JVM.g:31:1: class_file_info : IDENTIFIER WINDOWSPATH ;
    public final JVMParser.class_file_info_return class_file_info() throws RecognitionException {
        JVMParser.class_file_info_return retval = new JVMParser.class_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER8=null;
        Token WINDOWSPATH9=null;

        Object IDENTIFIER8_tree=null;
        Object WINDOWSPATH9_tree=null;

        try {
            // JVM.g:32:2: ( IDENTIFIER WINDOWSPATH )
            // JVM.g:32:4: IDENTIFIER WINDOWSPATH
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_file_info102); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER8_tree = 
            (Object)adaptor.create(IDENTIFIER8)
            ;
            adaptor.addChild(root_0, IDENTIFIER8_tree);
            }

            WINDOWSPATH9=(Token)match(input,WINDOWSPATH,FOLLOW_WINDOWSPATH_in_class_file_info104); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WINDOWSPATH9_tree = 
            (Object)adaptor.create(WINDOWSPATH9)
            ;
            adaptor.addChild(root_0, WINDOWSPATH9_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:35:1: modified_file_info : IDENTIFIER IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER ;
    public final JVMParser.modified_file_info_return modified_file_info() throws RecognitionException {
        JVMParser.modified_file_info_return retval = new JVMParser.modified_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER10=null;
        Token IDENTIFIER11=null;
        Token DATE12=null;
        Token SEMI13=null;
        Token IDENTIFIER14=null;
        Token INTLITERAL15=null;
        Token IDENTIFIER16=null;

        Object IDENTIFIER10_tree=null;
        Object IDENTIFIER11_tree=null;
        Object DATE12_tree=null;
        Object SEMI13_tree=null;
        Object IDENTIFIER14_tree=null;
        Object INTLITERAL15_tree=null;
        Object IDENTIFIER16_tree=null;

        try {
            // JVM.g:36:2: ( IDENTIFIER IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER )
            // JVM.g:36:4: IDENTIFIER IDENTIFIER DATE SEMI IDENTIFIER INTLITERAL IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info117); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER10_tree = 
            (Object)adaptor.create(IDENTIFIER10)
            ;
            adaptor.addChild(root_0, IDENTIFIER10_tree);
            }

            IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info119); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER11_tree = 
            (Object)adaptor.create(IDENTIFIER11)
            ;
            adaptor.addChild(root_0, IDENTIFIER11_tree);
            }

            DATE12=(Token)match(input,DATE,FOLLOW_DATE_in_modified_file_info121); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE12_tree = 
            (Object)adaptor.create(DATE12)
            ;
            adaptor.addChild(root_0, DATE12_tree);
            }

            SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_modified_file_info123); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI13_tree = 
            (Object)adaptor.create(SEMI13)
            ;
            adaptor.addChild(root_0, SEMI13_tree);
            }

            IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info125); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER14_tree = 
            (Object)adaptor.create(IDENTIFIER14)
            ;
            adaptor.addChild(root_0, IDENTIFIER14_tree);
            }

            INTLITERAL15=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_modified_file_info127); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL15_tree = 
            (Object)adaptor.create(INTLITERAL15)
            ;
            adaptor.addChild(root_0, INTLITERAL15_tree);
            }

            IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info129); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER16_tree = 
            (Object)adaptor.create(IDENTIFIER16)
            ;
            adaptor.addChild(root_0, IDENTIFIER16_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:39:1: checksum_file_info : IDENTIFIER IDENTIFIER ( IDENTIFIER | HexDigits ) ;
    public final JVMParser.checksum_file_info_return checksum_file_info() throws RecognitionException {
        JVMParser.checksum_file_info_return retval = new JVMParser.checksum_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER17=null;
        Token IDENTIFIER18=null;
        Token set19=null;

        Object IDENTIFIER17_tree=null;
        Object IDENTIFIER18_tree=null;
        Object set19_tree=null;

        try {
            // JVM.g:40:2: ( IDENTIFIER IDENTIFIER ( IDENTIFIER | HexDigits ) )
            // JVM.g:40:4: IDENTIFIER IDENTIFIER ( IDENTIFIER | HexDigits )
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info142); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER17_tree = 
            (Object)adaptor.create(IDENTIFIER17)
            ;
            adaptor.addChild(root_0, IDENTIFIER17_tree);
            }

            IDENTIFIER18=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info144); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER18_tree = 
            (Object)adaptor.create(IDENTIFIER18)
            ;
            adaptor.addChild(root_0, IDENTIFIER18_tree);
            }

            set19=(Token)input.LT(1);

            if ( input.LA(1)==HexDigits||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set19)
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
    // $ANTLR end "checksum_file_info"


    public static class compiled_file_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compiled_file_info"
    // JVM.g:43:1: compiled_file_info : IDENTIFIER IDENTIFIER STRINGLITERAL ;
    public final JVMParser.compiled_file_info_return compiled_file_info() throws RecognitionException {
        JVMParser.compiled_file_info_return retval = new JVMParser.compiled_file_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER20=null;
        Token IDENTIFIER21=null;
        Token STRINGLITERAL22=null;

        Object IDENTIFIER20_tree=null;
        Object IDENTIFIER21_tree=null;
        Object STRINGLITERAL22_tree=null;

        try {
            // JVM.g:44:2: ( IDENTIFIER IDENTIFIER STRINGLITERAL )
            // JVM.g:44:4: IDENTIFIER IDENTIFIER STRINGLITERAL
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER20_tree = 
            (Object)adaptor.create(IDENTIFIER20)
            ;
            adaptor.addChild(root_0, IDENTIFIER20_tree);
            }

            IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info168); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER21_tree = 
            (Object)adaptor.create(IDENTIFIER21)
            ;
            adaptor.addChild(root_0, IDENTIFIER21_tree);
            }

            STRINGLITERAL22=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_compiled_file_info170); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLITERAL22_tree = 
            (Object)adaptor.create(STRINGLITERAL22)
            ;
            adaptor.addChild(root_0, STRINGLITERAL22_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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


    public static class type_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_info"
    // JVM.g:51:1: type_info : ( sourcefile_info | major_version_info | minor_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic )+ ;
    public final JVMParser.type_info_return type_info() throws RecognitionException {
        JVMParser.type_info_return retval = new JVMParser.type_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.sourcefile_info_return sourcefile_info23 =null;

        JVMParser.major_version_info_return major_version_info24 =null;

        JVMParser.minor_version_info_return minor_version_info25 =null;

        JVMParser.flags_return flags26 =null;

        JVMParser.scalaSig_info_return scalaSig_info27 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info28 =null;

        JVMParser.innerclass_info_return innerclass_info29 =null;

        JVMParser.enclosingMethod_return enclosingMethod30 =null;

        JVMParser.signature_info_addition_return signature_info_addition31 =null;

        JVMParser.deprecated_return deprecated32 =null;

        JVMParser.synthetic_return synthetic33 =null;



        try {
            // JVM.g:52:2: ( ( sourcefile_info | major_version_info | minor_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic )+ )
            // JVM.g:52:4: ( sourcefile_info | major_version_info | minor_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic )+
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:52:4: ( sourcefile_info | major_version_info | minor_version_info | flags | scalaSig_info | runtimeVisibleAnnotations_info | innerclass_info | enclosingMethod | signature_info_addition | deprecated | synthetic )+
            int cnt3=0;
            loop3:
            do {
                int alt3=12;
                switch ( input.LA(1) ) {
                case SourceFile:
                    {
                    alt3=1;
                    }
                    break;
                case MAJOR_VERSION:
                    {
                    alt3=2;
                    }
                    break;
                case MINOR_VERSION:
                    {
                    alt3=3;
                    }
                    break;
                case Flag:
                    {
                    alt3=4;
                    }
                    break;
                case Scala:
                case ScalaSig:
                    {
                    alt3=5;
                    }
                    break;
                case RuntimeVisibleAnnotations:
                    {
                    alt3=6;
                    }
                    break;
                case InnerClasses:
                    {
                    alt3=7;
                    }
                    break;
                case EnclosingMethod:
                    {
                    alt3=8;
                    }
                    break;
                case Signature:
                    {
                    alt3=9;
                    }
                    break;
                case Deprecated:
                    {
                    alt3=10;
                    }
                    break;
                case Synthetic:
                    {
                    alt3=11;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // JVM.g:52:5: sourcefile_info
            	    {
            	    pushFollow(FOLLOW_sourcefile_info_in_type_info189);
            	    sourcefile_info23=sourcefile_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sourcefile_info23.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:53:4: major_version_info
            	    {
            	    pushFollow(FOLLOW_major_version_info_in_type_info194);
            	    major_version_info24=major_version_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, major_version_info24.getTree());

            	    }
            	    break;
            	case 3 :
            	    // JVM.g:54:4: minor_version_info
            	    {
            	    pushFollow(FOLLOW_minor_version_info_in_type_info199);
            	    minor_version_info25=minor_version_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, minor_version_info25.getTree());

            	    }
            	    break;
            	case 4 :
            	    // JVM.g:55:4: flags
            	    {
            	    pushFollow(FOLLOW_flags_in_type_info204);
            	    flags26=flags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, flags26.getTree());

            	    }
            	    break;
            	case 5 :
            	    // JVM.g:56:4: scalaSig_info
            	    {
            	    pushFollow(FOLLOW_scalaSig_info_in_type_info209);
            	    scalaSig_info27=scalaSig_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalaSig_info27.getTree());

            	    }
            	    break;
            	case 6 :
            	    // JVM.g:57:4: runtimeVisibleAnnotations_info
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_type_info215);
            	    runtimeVisibleAnnotations_info28=runtimeVisibleAnnotations_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotations_info28.getTree());

            	    }
            	    break;
            	case 7 :
            	    // JVM.g:58:4: innerclass_info
            	    {
            	    pushFollow(FOLLOW_innerclass_info_in_type_info220);
            	    innerclass_info29=innerclass_info();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, innerclass_info29.getTree());

            	    }
            	    break;
            	case 8 :
            	    // JVM.g:59:4: enclosingMethod
            	    {
            	    pushFollow(FOLLOW_enclosingMethod_in_type_info225);
            	    enclosingMethod30=enclosingMethod();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enclosingMethod30.getTree());

            	    }
            	    break;
            	case 9 :
            	    // JVM.g:60:4: signature_info_addition
            	    {
            	    pushFollow(FOLLOW_signature_info_addition_in_type_info230);
            	    signature_info_addition31=signature_info_addition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, signature_info_addition31.getTree());

            	    }
            	    break;
            	case 10 :
            	    // JVM.g:61:4: deprecated
            	    {
            	    pushFollow(FOLLOW_deprecated_in_type_info235);
            	    deprecated32=deprecated();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, deprecated32.getTree());

            	    }
            	    break;
            	case 11 :
            	    // JVM.g:62:4: synthetic
            	    {
            	    pushFollow(FOLLOW_synthetic_in_type_info240);
            	    synthetic33=synthetic();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, synthetic33.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // JVM.g:65:1: synthetic : Synthetic BOOLEANLITERAL ;
    public final JVMParser.synthetic_return synthetic() throws RecognitionException {
        JVMParser.synthetic_return retval = new JVMParser.synthetic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Synthetic34=null;
        Token BOOLEANLITERAL35=null;

        Object Synthetic34_tree=null;
        Object BOOLEANLITERAL35_tree=null;

        try {
            // JVM.g:66:2: ( Synthetic BOOLEANLITERAL )
            // JVM.g:66:4: Synthetic BOOLEANLITERAL
            {
            root_0 = (Object)adaptor.nil();


            Synthetic34=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_synthetic253); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Synthetic34_tree = 
            (Object)adaptor.create(Synthetic34)
            ;
            adaptor.addChild(root_0, Synthetic34_tree);
            }

            BOOLEANLITERAL35=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_synthetic255); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEANLITERAL35_tree = 
            (Object)adaptor.create(BOOLEANLITERAL35)
            ;
            adaptor.addChild(root_0, BOOLEANLITERAL35_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:69:1: deprecated : Deprecated BOOLEANLITERAL ;
    public final JVMParser.deprecated_return deprecated() throws RecognitionException {
        JVMParser.deprecated_return retval = new JVMParser.deprecated_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Deprecated36=null;
        Token BOOLEANLITERAL37=null;

        Object Deprecated36_tree=null;
        Object BOOLEANLITERAL37_tree=null;

        try {
            // JVM.g:70:2: ( Deprecated BOOLEANLITERAL )
            // JVM.g:70:4: Deprecated BOOLEANLITERAL
            {
            root_0 = (Object)adaptor.nil();


            Deprecated36=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_deprecated267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Deprecated36_tree = 
            (Object)adaptor.create(Deprecated36)
            ;
            adaptor.addChild(root_0, Deprecated36_tree);
            }

            BOOLEANLITERAL37=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_deprecated269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEANLITERAL37_tree = 
            (Object)adaptor.create(BOOLEANLITERAL37)
            ;
            adaptor.addChild(root_0, BOOLEANLITERAL37_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:73:1: enclosingMethod : EnclosingMethod CPINDEX DOT ( CPINDEX )? ;
    public final JVMParser.enclosingMethod_return enclosingMethod() throws RecognitionException {
        JVMParser.enclosingMethod_return retval = new JVMParser.enclosingMethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EnclosingMethod38=null;
        Token CPINDEX39=null;
        Token DOT40=null;
        Token CPINDEX41=null;

        Object EnclosingMethod38_tree=null;
        Object CPINDEX39_tree=null;
        Object DOT40_tree=null;
        Object CPINDEX41_tree=null;

        try {
            // JVM.g:74:2: ( EnclosingMethod CPINDEX DOT ( CPINDEX )? )
            // JVM.g:74:4: EnclosingMethod CPINDEX DOT ( CPINDEX )?
            {
            root_0 = (Object)adaptor.nil();


            EnclosingMethod38=(Token)match(input,EnclosingMethod,FOLLOW_EnclosingMethod_in_enclosingMethod281); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EnclosingMethod38_tree = 
            (Object)adaptor.create(EnclosingMethod38)
            ;
            adaptor.addChild(root_0, EnclosingMethod38_tree);
            }

            CPINDEX39=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod283); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX39_tree = 
            (Object)adaptor.create(CPINDEX39)
            ;
            adaptor.addChild(root_0, CPINDEX39_tree);
            }

            DOT40=(Token)match(input,DOT,FOLLOW_DOT_in_enclosingMethod285); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT40_tree = 
            (Object)adaptor.create(DOT40)
            ;
            adaptor.addChild(root_0, DOT40_tree);
            }

            // JVM.g:74:32: ( CPINDEX )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CPINDEX) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // JVM.g:74:32: CPINDEX
                    {
                    CPINDEX41=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CPINDEX41_tree = 
                    (Object)adaptor.create(CPINDEX41)
                    ;
                    adaptor.addChild(root_0, CPINDEX41_tree);
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
    // $ANTLR end "enclosingMethod"


    public static class sourcefile_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sourcefile_info"
    // JVM.g:77:1: sourcefile_info : SourceFile STRINGLITERAL ;
    public final JVMParser.sourcefile_info_return sourcefile_info() throws RecognitionException {
        JVMParser.sourcefile_info_return retval = new JVMParser.sourcefile_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SourceFile42=null;
        Token STRINGLITERAL43=null;

        Object SourceFile42_tree=null;
        Object STRINGLITERAL43_tree=null;

        try {
            // JVM.g:78:2: ( SourceFile STRINGLITERAL )
            // JVM.g:78:4: SourceFile STRINGLITERAL
            {
            root_0 = (Object)adaptor.nil();


            SourceFile42=(Token)match(input,SourceFile,FOLLOW_SourceFile_in_sourcefile_info300); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SourceFile42_tree = 
            (Object)adaptor.create(SourceFile42)
            ;
            adaptor.addChild(root_0, SourceFile42_tree);
            }

            STRINGLITERAL43=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_sourcefile_info302); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLITERAL43_tree = 
            (Object)adaptor.create(STRINGLITERAL43)
            ;
            adaptor.addChild(root_0, STRINGLITERAL43_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:81:1: scalaSig_info : ( ScalaSig | Scala ) IDENTIFIER ASSIGN INTLITERAL ( INTLITERAL INTLITERAL INTLITERAL )? ;
    public final JVMParser.scalaSig_info_return scalaSig_info() throws RecognitionException {
        JVMParser.scalaSig_info_return retval = new JVMParser.scalaSig_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set44=null;
        Token IDENTIFIER45=null;
        Token ASSIGN46=null;
        Token INTLITERAL47=null;
        Token INTLITERAL48=null;
        Token INTLITERAL49=null;
        Token INTLITERAL50=null;

        Object set44_tree=null;
        Object IDENTIFIER45_tree=null;
        Object ASSIGN46_tree=null;
        Object INTLITERAL47_tree=null;
        Object INTLITERAL48_tree=null;
        Object INTLITERAL49_tree=null;
        Object INTLITERAL50_tree=null;

        try {
            // JVM.g:82:2: ( ( ScalaSig | Scala ) IDENTIFIER ASSIGN INTLITERAL ( INTLITERAL INTLITERAL INTLITERAL )? )
            // JVM.g:82:4: ( ScalaSig | Scala ) IDENTIFIER ASSIGN INTLITERAL ( INTLITERAL INTLITERAL INTLITERAL )?
            {
            root_0 = (Object)adaptor.nil();


            set44=(Token)input.LT(1);

            if ( (input.LA(1) >= Scala && input.LA(1) <= ScalaSig) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set44)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scalaSig_info323); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER45_tree = 
            (Object)adaptor.create(IDENTIFIER45)
            ;
            adaptor.addChild(root_0, IDENTIFIER45_tree);
            }

            ASSIGN46=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_scalaSig_info325); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN46_tree = 
            (Object)adaptor.create(ASSIGN46)
            ;
            adaptor.addChild(root_0, ASSIGN46_tree);
            }

            INTLITERAL47=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info327); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL47_tree = 
            (Object)adaptor.create(INTLITERAL47)
            ;
            adaptor.addChild(root_0, INTLITERAL47_tree);
            }

            // JVM.g:84:3: ( INTLITERAL INTLITERAL INTLITERAL )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INTLITERAL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // JVM.g:84:4: INTLITERAL INTLITERAL INTLITERAL
                    {
                    INTLITERAL48=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL48_tree = 
                    (Object)adaptor.create(INTLITERAL48)
                    ;
                    adaptor.addChild(root_0, INTLITERAL48_tree);
                    }

                    INTLITERAL49=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL49_tree = 
                    (Object)adaptor.create(INTLITERAL49)
                    ;
                    adaptor.addChild(root_0, INTLITERAL49_tree);
                    }

                    INTLITERAL50=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL50_tree = 
                    (Object)adaptor.create(INTLITERAL50)
                    ;
                    adaptor.addChild(root_0, INTLITERAL50_tree);
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
    // $ANTLR end "scalaSig_info"


    public static class runtimeVisibleAnnotations_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleAnnotations_info"
    // JVM.g:87:1: runtimeVisibleAnnotations_info : RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ;
    public final JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotations_info_return retval = new JVMParser.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RuntimeVisibleAnnotations51=null;
        JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem52 =null;


        Object RuntimeVisibleAnnotations51_tree=null;

        try {
            // JVM.g:88:2: ( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
            // JVM.g:88:4: RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+
            {
            root_0 = (Object)adaptor.nil();


            RuntimeVisibleAnnotations51=(Token)match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RuntimeVisibleAnnotations51_tree = 
            (Object)adaptor.create(RuntimeVisibleAnnotations51)
            ;
            adaptor.addChild(root_0, RuntimeVisibleAnnotations51_tree);
            }

            // JVM.g:89:4: ( runtimeVisibleAnnotationsItem )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==INTLITERAL) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // JVM.g:89:4: runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info358);
            	    runtimeVisibleAnnotationsItem52=runtimeVisibleAnnotationsItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotationsItem52.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "runtimeVisibleAnnotations_info"


    public static class runtimeVisibleAnnotationsItem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "runtimeVisibleAnnotationsItem"
    // JVM.g:92:1: runtimeVisibleAnnotationsItem : pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN ;
    public final JVMParser.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotationsItem_return retval = new JVMParser.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX54=null;
        Token LPAREN55=null;
        Token RPAREN57=null;
        JVMParser.pc_return pc53 =null;

        JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList56 =null;


        Object CPINDEX54_tree=null;
        Object LPAREN55_tree=null;
        Object RPAREN57_tree=null;

        try {
            // JVM.g:93:2: ( pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN )
            // JVM.g:93:4: pc CPINDEX LPAREN ( runtimeVisibleAnnotationAssignList )? RPAREN
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem371);
            pc53=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc53.getTree());

            CPINDEX54=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem373); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX54_tree = 
            (Object)adaptor.create(CPINDEX54)
            ;
            adaptor.addChild(root_0, CPINDEX54_tree);
            }

            LPAREN55=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_runtimeVisibleAnnotationsItem375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN55_tree = 
            (Object)adaptor.create(LPAREN55)
            ;
            adaptor.addChild(root_0, LPAREN55_tree);
            }

            // JVM.g:93:22: ( runtimeVisibleAnnotationAssignList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CPINDEX) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // JVM.g:93:22: runtimeVisibleAnnotationAssignList
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem377);
                    runtimeVisibleAnnotationAssignList56=runtimeVisibleAnnotationAssignList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotationAssignList56.getTree());

                    }
                    break;

            }


            RPAREN57=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_runtimeVisibleAnnotationsItem380); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN57_tree = 
            (Object)adaptor.create(RPAREN57)
            ;
            adaptor.addChild(root_0, RPAREN57_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:96:1: runtimeVisibleAnnotationAssignList : annotationAssign ( COMMA annotationAssign )* -> ( annotationAssign )+ ;
    public final JVMParser.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        JVMParser.runtimeVisibleAnnotationAssignList_return retval = new JVMParser.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA59=null;
        JVMParser.annotationAssign_return annotationAssign58 =null;

        JVMParser.annotationAssign_return annotationAssign60 =null;


        Object COMMA59_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_annotationAssign=new RewriteRuleSubtreeStream(adaptor,"rule annotationAssign");
        try {
            // JVM.g:97:2: ( annotationAssign ( COMMA annotationAssign )* -> ( annotationAssign )+ )
            // JVM.g:97:4: annotationAssign ( COMMA annotationAssign )*
            {
            pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList392);
            annotationAssign58=annotationAssign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_annotationAssign.add(annotationAssign58.getTree());

            // JVM.g:97:21: ( COMMA annotationAssign )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // JVM.g:97:22: COMMA annotationAssign
            	    {
            	    COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_runtimeVisibleAnnotationAssignList395); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA59);


            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList397);
            	    annotationAssign60=annotationAssign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotationAssign.add(annotationAssign60.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // 97:47: -> ( annotationAssign )+
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
    // JVM.g:100:1: annotationAssign : CPINDEX ASSIGN ( brackedAnnotationAssign | AnnotationAssign ) ;
    public final JVMParser.annotationAssign_return annotationAssign() throws RecognitionException {
        JVMParser.annotationAssign_return retval = new JVMParser.annotationAssign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX61=null;
        Token ASSIGN62=null;
        Token AnnotationAssign64=null;
        JVMParser.brackedAnnotationAssign_return brackedAnnotationAssign63 =null;


        Object CPINDEX61_tree=null;
        Object ASSIGN62_tree=null;
        Object AnnotationAssign64_tree=null;

        try {
            // JVM.g:101:2: ( CPINDEX ASSIGN ( brackedAnnotationAssign | AnnotationAssign ) )
            // JVM.g:101:4: CPINDEX ASSIGN ( brackedAnnotationAssign | AnnotationAssign )
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX61=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign415); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX61_tree = 
            (Object)adaptor.create(CPINDEX61)
            ;
            adaptor.addChild(root_0, CPINDEX61_tree);
            }

            ASSIGN62=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign417); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN62_tree = 
            (Object)adaptor.create(ASSIGN62)
            ;
            adaptor.addChild(root_0, ASSIGN62_tree);
            }

            // JVM.g:101:19: ( brackedAnnotationAssign | AnnotationAssign )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LBRACK) ) {
                alt9=1;
            }
            else if ( (LA9_0==AnnotationAssign) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // JVM.g:101:20: brackedAnnotationAssign
                    {
                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationAssign420);
                    brackedAnnotationAssign63=brackedAnnotationAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, brackedAnnotationAssign63.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:101:46: AnnotationAssign
                    {
                    AnnotationAssign64=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationAssign424); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AnnotationAssign64_tree = 
                    (Object)adaptor.create(AnnotationAssign64)
                    ;
                    adaptor.addChild(root_0, AnnotationAssign64_tree);
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
    // JVM.g:104:1: brackedAnnotationAssign : LBRACK AnnotationAssign ( COMMA AnnotationAssign )* RBRACK -> ( AnnotationAssign )+ ;
    public final JVMParser.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        JVMParser.brackedAnnotationAssign_return retval = new JVMParser.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK65=null;
        Token AnnotationAssign66=null;
        Token COMMA67=null;
        Token AnnotationAssign68=null;
        Token RBRACK69=null;

        Object LBRACK65_tree=null;
        Object AnnotationAssign66_tree=null;
        Object COMMA67_tree=null;
        Object AnnotationAssign68_tree=null;
        Object RBRACK69_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_AnnotationAssign=new RewriteRuleTokenStream(adaptor,"token AnnotationAssign");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // JVM.g:105:2: ( LBRACK AnnotationAssign ( COMMA AnnotationAssign )* RBRACK -> ( AnnotationAssign )+ )
            // JVM.g:105:4: LBRACK AnnotationAssign ( COMMA AnnotationAssign )* RBRACK
            {
            LBRACK65=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_brackedAnnotationAssign436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK65);


            AnnotationAssign66=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssign438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AnnotationAssign.add(AnnotationAssign66);


            // JVM.g:105:28: ( COMMA AnnotationAssign )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // JVM.g:105:29: COMMA AnnotationAssign
            	    {
            	    COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_brackedAnnotationAssign441); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA67);


            	    AnnotationAssign68=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssign443); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AnnotationAssign.add(AnnotationAssign68);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            RBRACK69=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_brackedAnnotationAssign447); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK69);


            // AST REWRITE
            // elements: AnnotationAssign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 105:61: -> ( AnnotationAssign )+
            {
                if ( !(stream_AnnotationAssign.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_AnnotationAssign.hasNext() ) {
                    adaptor.addChild(root_0, 
                    stream_AnnotationAssign.nextNode()
                    );

                }
                stream_AnnotationAssign.reset();

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


    public static class signature_info_addition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signature_info_addition"
    // JVM.g:108:1: signature_info_addition : Signature ( CPINDEX )? ;
    public final JVMParser.signature_info_addition_return signature_info_addition() throws RecognitionException {
        JVMParser.signature_info_addition_return retval = new JVMParser.signature_info_addition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature70=null;
        Token CPINDEX71=null;

        Object Signature70_tree=null;
        Object CPINDEX71_tree=null;

        try {
            // JVM.g:109:2: ( Signature ( CPINDEX )? )
            // JVM.g:109:4: Signature ( CPINDEX )?
            {
            root_0 = (Object)adaptor.nil();


            Signature70=(Token)match(input,Signature,FOLLOW_Signature_in_signature_info_addition465); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Signature70_tree = 
            (Object)adaptor.create(Signature70)
            ;
            adaptor.addChild(root_0, Signature70_tree);
            }

            // JVM.g:109:14: ( CPINDEX )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CPINDEX) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // JVM.g:109:14: CPINDEX
                    {
                    CPINDEX71=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_signature_info_addition467); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CPINDEX71_tree = 
                    (Object)adaptor.create(CPINDEX71)
                    ;
                    adaptor.addChild(root_0, CPINDEX71_tree);
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
    // $ANTLR end "signature_info_addition"


    public static class innerclass_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "innerclass_info"
    // JVM.g:112:1: innerclass_info : InnerClasses ( innerclass_info_line )+ ;
    public final JVMParser.innerclass_info_return innerclass_info() throws RecognitionException {
        JVMParser.innerclass_info_return retval = new JVMParser.innerclass_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token InnerClasses72=null;
        JVMParser.innerclass_info_line_return innerclass_info_line73 =null;


        Object InnerClasses72_tree=null;

        try {
            // JVM.g:113:2: ( InnerClasses ( innerclass_info_line )+ )
            // JVM.g:113:4: InnerClasses ( innerclass_info_line )+
            {
            root_0 = (Object)adaptor.nil();


            InnerClasses72=(Token)match(input,InnerClasses,FOLLOW_InnerClasses_in_innerclass_info480); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            InnerClasses72_tree = 
            (Object)adaptor.create(InnerClasses72)
            ;
            adaptor.addChild(root_0, InnerClasses72_tree);
            }

            // JVM.g:114:3: ( innerclass_info_line )+
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
            	    // JVM.g:114:3: innerclass_info_line
            	    {
            	    pushFollow(FOLLOW_innerclass_info_line_in_innerclass_info486);
            	    innerclass_info_line73=innerclass_info_line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, innerclass_info_line73.getTree());

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


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:117:1: innerclass_info_line : ( method_modifier )* CPINDEX ( ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) | ( IDENTIFIER CPINDEX ) )? ( SEMI )? ;
    public final JVMParser.innerclass_info_line_return innerclass_info_line() throws RecognitionException {
        JVMParser.innerclass_info_line_return retval = new JVMParser.innerclass_info_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX75=null;
        Token ASSIGN76=null;
        Token CPINDEX77=null;
        Token IDENTIFIER78=null;
        Token CPINDEX79=null;
        Token IDENTIFIER80=null;
        Token CPINDEX81=null;
        Token SEMI82=null;
        JVMParser.method_modifier_return method_modifier74 =null;


        Object CPINDEX75_tree=null;
        Object ASSIGN76_tree=null;
        Object CPINDEX77_tree=null;
        Object IDENTIFIER78_tree=null;
        Object CPINDEX79_tree=null;
        Object IDENTIFIER80_tree=null;
        Object CPINDEX81_tree=null;
        Object SEMI82_tree=null;

        try {
            // JVM.g:118:2: ( ( method_modifier )* CPINDEX ( ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) | ( IDENTIFIER CPINDEX ) )? ( SEMI )? )
            // JVM.g:118:5: ( method_modifier )* CPINDEX ( ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) | ( IDENTIFIER CPINDEX ) )? ( SEMI )?
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:118:5: ( method_modifier )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ABSTRACT||LA13_0==FINAL||LA13_0==NATIVE||(LA13_0 >= PRIVATE && LA13_0 <= PUBLIC)||LA13_0==STATIC||LA13_0==SYNCHRONIZED) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // JVM.g:118:5: method_modifier
            	    {
            	    pushFollow(FOLLOW_method_modifier_in_innerclass_info_line500);
            	    method_modifier74=method_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, method_modifier74.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            CPINDEX75=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_line503); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX75_tree = 
            (Object)adaptor.create(CPINDEX75)
            ;
            adaptor.addChild(root_0, CPINDEX75_tree);
            }

            // JVM.g:118:30: ( ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? ) | ( IDENTIFIER CPINDEX ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ASSIGN) ) {
                alt15=1;
            }
            else if ( (LA15_0==IDENTIFIER) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==CPINDEX) ) {
                    alt15=2;
                }
            }
            switch (alt15) {
                case 1 :
                    // JVM.g:118:31: ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? )
                    {
                    // JVM.g:118:31: ( ASSIGN CPINDEX ( IDENTIFIER CPINDEX )? )
                    // JVM.g:118:32: ASSIGN CPINDEX ( IDENTIFIER CPINDEX )?
                    {
                    ASSIGN76=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_innerclass_info_line507); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN76_tree = 
                    (Object)adaptor.create(ASSIGN76)
                    ;
                    adaptor.addChild(root_0, ASSIGN76_tree);
                    }

                    CPINDEX77=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_line509); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CPINDEX77_tree = 
                    (Object)adaptor.create(CPINDEX77)
                    ;
                    adaptor.addChild(root_0, CPINDEX77_tree);
                    }

                    // JVM.g:118:47: ( IDENTIFIER CPINDEX )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==IDENTIFIER) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==CPINDEX) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // JVM.g:118:48: IDENTIFIER CPINDEX
                            {
                            IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_line512); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            IDENTIFIER78_tree = 
                            (Object)adaptor.create(IDENTIFIER78)
                            ;
                            adaptor.addChild(root_0, IDENTIFIER78_tree);
                            }

                            CPINDEX79=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_line514); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CPINDEX79_tree = 
                            (Object)adaptor.create(CPINDEX79)
                            ;
                            adaptor.addChild(root_0, CPINDEX79_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // JVM.g:118:72: ( IDENTIFIER CPINDEX )
                    {
                    // JVM.g:118:72: ( IDENTIFIER CPINDEX )
                    // JVM.g:118:73: IDENTIFIER CPINDEX
                    {
                    IDENTIFIER80=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_line522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER80_tree = 
                    (Object)adaptor.create(IDENTIFIER80)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER80_tree);
                    }

                    CPINDEX81=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_line524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CPINDEX81_tree = 
                    (Object)adaptor.create(CPINDEX81)
                    ;
                    adaptor.addChild(root_0, CPINDEX81_tree);
                    }

                    }


                    }
                    break;

            }


            // JVM.g:118:95: ( SEMI )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==SEMI) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // JVM.g:118:95: SEMI
                    {
                    SEMI82=(Token)match(input,SEMI,FOLLOW_SEMI_in_innerclass_info_line529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI82_tree = 
                    (Object)adaptor.create(SEMI82)
                    ;
                    adaptor.addChild(root_0, SEMI82_tree);
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
    // $ANTLR end "innerclass_info_line"


    public static class major_version_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "major_version_info"
    // JVM.g:121:1: major_version_info : MAJOR_VERSION INTLITERAL ;
    public final JVMParser.major_version_info_return major_version_info() throws RecognitionException {
        JVMParser.major_version_info_return retval = new JVMParser.major_version_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MAJOR_VERSION83=null;
        Token INTLITERAL84=null;

        Object MAJOR_VERSION83_tree=null;
        Object INTLITERAL84_tree=null;

        try {
            // JVM.g:122:2: ( MAJOR_VERSION INTLITERAL )
            // JVM.g:122:4: MAJOR_VERSION INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            MAJOR_VERSION83=(Token)match(input,MAJOR_VERSION,FOLLOW_MAJOR_VERSION_in_major_version_info544); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MAJOR_VERSION83_tree = 
            (Object)adaptor.create(MAJOR_VERSION83)
            ;
            adaptor.addChild(root_0, MAJOR_VERSION83_tree);
            }

            INTLITERAL84=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_major_version_info546); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL84_tree = 
            (Object)adaptor.create(INTLITERAL84)
            ;
            adaptor.addChild(root_0, INTLITERAL84_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "major_version_info"


    public static class minor_version_info_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minor_version_info"
    // JVM.g:125:1: minor_version_info : MINOR_VERSION INTLITERAL ;
    public final JVMParser.minor_version_info_return minor_version_info() throws RecognitionException {
        JVMParser.minor_version_info_return retval = new JVMParser.minor_version_info_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MINOR_VERSION85=null;
        Token INTLITERAL86=null;

        Object MINOR_VERSION85_tree=null;
        Object INTLITERAL86_tree=null;

        try {
            // JVM.g:126:2: ( MINOR_VERSION INTLITERAL )
            // JVM.g:126:4: MINOR_VERSION INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            MINOR_VERSION85=(Token)match(input,MINOR_VERSION,FOLLOW_MINOR_VERSION_in_minor_version_info560); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MINOR_VERSION85_tree = 
            (Object)adaptor.create(MINOR_VERSION85)
            ;
            adaptor.addChild(root_0, MINOR_VERSION85_tree);
            }

            INTLITERAL86=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_minor_version_info562); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL86_tree = 
            (Object)adaptor.create(INTLITERAL86)
            ;
            adaptor.addChild(root_0, INTLITERAL86_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "minor_version_info"


    public static class flags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flags"
    // JVM.g:129:1: flags : Flag ( accessFlagList )? Marker ;
    public final JVMParser.flags_return flags() throws RecognitionException {
        JVMParser.flags_return retval = new JVMParser.flags_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Flag87=null;
        Token Marker89=null;
        JVMParser.accessFlagList_return accessFlagList88 =null;


        Object Flag87_tree=null;
        Object Marker89_tree=null;

        try {
            // JVM.g:130:2: ( Flag ( accessFlagList )? Marker )
            // JVM.g:130:4: Flag ( accessFlagList )? Marker
            {
            root_0 = (Object)adaptor.nil();


            Flag87=(Token)match(input,Flag,FOLLOW_Flag_in_flags577); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Flag87_tree = 
            (Object)adaptor.create(Flag87)
            ;
            adaptor.addChild(root_0, Flag87_tree);
            }

            // JVM.g:130:9: ( accessFlagList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENTIFIER||LA17_0==INTLITERAL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // JVM.g:130:9: accessFlagList
                    {
                    pushFollow(FOLLOW_accessFlagList_in_flags579);
                    accessFlagList88=accessFlagList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, accessFlagList88.getTree());

                    }
                    break;

            }


            Marker89=(Token)match(input,Marker,FOLLOW_Marker_in_flags582); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Marker89_tree = 
            (Object)adaptor.create(Marker89)
            ;
            adaptor.addChild(root_0, Marker89_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:133:1: accessFlagList : flagType ( COMMA flagType )* -> ( flagType )+ ;
    public final JVMParser.accessFlagList_return accessFlagList() throws RecognitionException {
        JVMParser.accessFlagList_return retval = new JVMParser.accessFlagList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA91=null;
        JVMParser.flagType_return flagType90 =null;

        JVMParser.flagType_return flagType92 =null;


        Object COMMA91_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_flagType=new RewriteRuleSubtreeStream(adaptor,"rule flagType");
        try {
            // JVM.g:134:2: ( flagType ( COMMA flagType )* -> ( flagType )+ )
            // JVM.g:134:4: flagType ( COMMA flagType )*
            {
            pushFollow(FOLLOW_flagType_in_accessFlagList594);
            flagType90=flagType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flagType.add(flagType90.getTree());

            // JVM.g:134:13: ( COMMA flagType )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // JVM.g:134:14: COMMA flagType
            	    {
            	    COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_accessFlagList597); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA91);


            	    pushFollow(FOLLOW_flagType_in_accessFlagList599);
            	    flagType92=flagType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_flagType.add(flagType92.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // 134:31: -> ( flagType )+
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
    // JVM.g:137:1: flagType : ( IDENTIFIER | INTLITERAL );
    public final JVMParser.flagType_return flagType() throws RecognitionException {
        JVMParser.flagType_return retval = new JVMParser.flagType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set93=null;

        Object set93_tree=null;

        try {
            // JVM.g:138:2: ( IDENTIFIER | INTLITERAL )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set93=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTLITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set93)
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


    public static class constant_pool_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_pool"
    // JVM.g:145:1: constant_pool : IDENTIFIER IDENTIFIER COLON ( contant_pool_line )* ;
    public final JVMParser.constant_pool_return constant_pool() throws RecognitionException {
        JVMParser.constant_pool_return retval = new JVMParser.constant_pool_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER94=null;
        Token IDENTIFIER95=null;
        Token COLON96=null;
        JVMParser.contant_pool_line_return contant_pool_line97 =null;


        Object IDENTIFIER94_tree=null;
        Object IDENTIFIER95_tree=null;
        Object COLON96_tree=null;

        try {
            // JVM.g:146:2: ( IDENTIFIER IDENTIFIER COLON ( contant_pool_line )* )
            // JVM.g:146:4: IDENTIFIER IDENTIFIER COLON ( contant_pool_line )*
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER94=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool636); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER94_tree = 
            (Object)adaptor.create(IDENTIFIER94)
            ;
            adaptor.addChild(root_0, IDENTIFIER94_tree);
            }

            IDENTIFIER95=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool638); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER95_tree = 
            (Object)adaptor.create(IDENTIFIER95)
            ;
            adaptor.addChild(root_0, IDENTIFIER95_tree);
            }

            COLON96=(Token)match(input,COLON,FOLLOW_COLON_in_constant_pool640); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON96_tree = 
            (Object)adaptor.create(COLON96)
            ;
            adaptor.addChild(root_0, COLON96_tree);
            }

            // JVM.g:147:3: ( contant_pool_line )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==CPINDEX) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // JVM.g:147:3: contant_pool_line
            	    {
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool645);
            	    contant_pool_line97=contant_pool_line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, contant_pool_line97.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "constant_pool"


    public static class contant_pool_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "contant_pool_line"
    // JVM.g:150:1: contant_pool_line : CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE ;
    public final JVMParser.contant_pool_line_return contant_pool_line() throws RecognitionException {
        JVMParser.contant_pool_line_return retval = new JVMParser.contant_pool_line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX98=null;
        Token ASSIGN99=null;
        Token CONSTANT_TYPE_ASSIGNABLE100=null;

        Object CPINDEX98_tree=null;
        Object ASSIGN99_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE100_tree=null;

        try {
            // JVM.g:151:2: ( CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE )
            // JVM.g:151:4: CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX98=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line658); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX98_tree = 
            (Object)adaptor.create(CPINDEX98)
            ;
            adaptor.addChild(root_0, CPINDEX98_tree);
            }

            ASSIGN99=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line660); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN99_tree = 
            (Object)adaptor.create(ASSIGN99)
            ;
            adaptor.addChild(root_0, ASSIGN99_tree);
            }

            CONSTANT_TYPE_ASSIGNABLE100=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line662); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTANT_TYPE_ASSIGNABLE100_tree = 
            (Object)adaptor.create(CONSTANT_TYPE_ASSIGNABLE100)
            ;
            adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE100_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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


    public static class classDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // JVM.g:158:1: classDefinition : ( class_visual_modifier )? ( class_modifier )* javaTypeIdentifier ( superClass )? ( superInterface )? type_info constant_pool LBRACE ( classBody )? RBRACE ;
    public final JVMParser.classDefinition_return classDefinition() throws RecognitionException {
        JVMParser.classDefinition_return retval = new JVMParser.classDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACE108=null;
        Token RBRACE110=null;
        JVMParser.class_visual_modifier_return class_visual_modifier101 =null;

        JVMParser.class_modifier_return class_modifier102 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier103 =null;

        JVMParser.superClass_return superClass104 =null;

        JVMParser.superInterface_return superInterface105 =null;

        JVMParser.type_info_return type_info106 =null;

        JVMParser.constant_pool_return constant_pool107 =null;

        JVMParser.classBody_return classBody109 =null;


        Object LBRACE108_tree=null;
        Object RBRACE110_tree=null;

        try {
            // JVM.g:159:2: ( ( class_visual_modifier )? ( class_modifier )* javaTypeIdentifier ( superClass )? ( superInterface )? type_info constant_pool LBRACE ( classBody )? RBRACE )
            // JVM.g:159:4: ( class_visual_modifier )? ( class_modifier )* javaTypeIdentifier ( superClass )? ( superInterface )? type_info constant_pool LBRACE ( classBody )? RBRACE
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:159:4: ( class_visual_modifier )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==PUBLIC) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // JVM.g:159:4: class_visual_modifier
                    {
                    pushFollow(FOLLOW_class_visual_modifier_in_classDefinition677);
                    class_visual_modifier101=class_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_visual_modifier101.getTree());

                    }
                    break;

            }


            // JVM.g:159:27: ( class_modifier )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ABSTRACT||LA21_0==CLASS||LA21_0==FINAL||LA21_0==INTERFACE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // JVM.g:159:27: class_modifier
            	    {
            	    pushFollow(FOLLOW_class_modifier_in_classDefinition680);
            	    class_modifier102=class_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_modifier102.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            pushFollow(FOLLOW_javaTypeIdentifier_in_classDefinition683);
            javaTypeIdentifier103=javaTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier103.getTree());

            // JVM.g:159:62: ( superClass )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EXTENDS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // JVM.g:159:62: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_classDefinition685);
                    superClass104=superClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superClass104.getTree());

                    }
                    break;

            }


            // JVM.g:159:74: ( superInterface )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IMPLEMENTS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // JVM.g:159:74: superInterface
                    {
                    pushFollow(FOLLOW_superInterface_in_classDefinition688);
                    superInterface105=superInterface();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superInterface105.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_type_info_in_classDefinition694);
            type_info106=type_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_info106.getTree());

            pushFollow(FOLLOW_constant_pool_in_classDefinition698);
            constant_pool107=constant_pool();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_pool107.getTree());

            LBRACE108=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDefinition702); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE108_tree = 
            (Object)adaptor.create(LBRACE108)
            ;
            adaptor.addChild(root_0, LBRACE108_tree);
            }

            // JVM.g:163:3: ( classBody )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ABSTRACT||LA24_0==BOOLEAN||(LA24_0 >= BYTE && LA24_0 <= CHAR)||LA24_0==DEFAULT||LA24_0==DOUBLE||(LA24_0 >= FINAL && LA24_0 <= FLOAT)||LA24_0==IDENTIFIER||LA24_0==INT||(LA24_0 >= LESST && LA24_0 <= LONG)||LA24_0==NATIVE||LA24_0==NORMALTYPE||(LA24_0 >= PRIVATE && LA24_0 <= PUBLIC)||LA24_0==SHORT||LA24_0==STATIC||LA24_0==SYNCHRONIZED||LA24_0==TRANSIENT||(LA24_0 >= VOID && LA24_0 <= VOLATILE)||LA24_0==VoidType) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // JVM.g:163:3: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classDefinition707);
                    classBody109=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody109.getTree());

                    }
                    break;

            }


            RBRACE110=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDefinition712); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE110_tree = 
            (Object)adaptor.create(RBRACE110)
            ;
            adaptor.addChild(root_0, RBRACE110_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:167:1: superClass : EXTENDS typeList ;
    public final JVMParser.superClass_return superClass() throws RecognitionException {
        JVMParser.superClass_return retval = new JVMParser.superClass_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS111=null;
        JVMParser.typeList_return typeList112 =null;


        Object EXTENDS111_tree=null;

        try {
            // JVM.g:168:2: ( EXTENDS typeList )
            // JVM.g:168:4: EXTENDS typeList
            {
            root_0 = (Object)adaptor.nil();


            EXTENDS111=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_superClass725); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS111_tree = 
            (Object)adaptor.create(EXTENDS111)
            ;
            adaptor.addChild(root_0, EXTENDS111_tree);
            }

            pushFollow(FOLLOW_typeList_in_superClass727);
            typeList112=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList112.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:171:1: superInterface : IMPLEMENTS typeList ;
    public final JVMParser.superInterface_return superInterface() throws RecognitionException {
        JVMParser.superInterface_return retval = new JVMParser.superInterface_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLEMENTS113=null;
        JVMParser.typeList_return typeList114 =null;


        Object IMPLEMENTS113_tree=null;

        try {
            // JVM.g:172:2: ( IMPLEMENTS typeList )
            // JVM.g:172:4: IMPLEMENTS typeList
            {
            root_0 = (Object)adaptor.nil();


            IMPLEMENTS113=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_superInterface739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPLEMENTS113_tree = 
            (Object)adaptor.create(IMPLEMENTS113)
            ;
            adaptor.addChild(root_0, IMPLEMENTS113_tree);
            }

            pushFollow(FOLLOW_typeList_in_superInterface741);
            typeList114=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList114.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:175:1: class_visual_modifier : PUBLIC ;
    public final JVMParser.class_visual_modifier_return class_visual_modifier() throws RecognitionException {
        JVMParser.class_visual_modifier_return retval = new JVMParser.class_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PUBLIC115=null;

        Object PUBLIC115_tree=null;

        try {
            // JVM.g:176:2: ( PUBLIC )
            // JVM.g:176:4: PUBLIC
            {
            root_0 = (Object)adaptor.nil();


            PUBLIC115=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier754); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PUBLIC115_tree = 
            (Object)adaptor.create(PUBLIC115)
            ;
            adaptor.addChild(root_0, PUBLIC115_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:179:1: class_modifier : ( ABSTRACT | FINAL | INTERFACE | CLASS );
    public final JVMParser.class_modifier_return class_modifier() throws RecognitionException {
        JVMParser.class_modifier_return retval = new JVMParser.class_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set116=null;

        Object set116_tree=null;

        try {
            // JVM.g:180:2: ( ABSTRACT | FINAL | INTERFACE | CLASS )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set116=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==CLASS||input.LA(1)==FINAL||input.LA(1)==INTERFACE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set116)
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


    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBody"
    // JVM.g:187:1: classBody : ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+ ;
    public final JVMParser.classBody_return classBody() throws RecognitionException {
        JVMParser.classBody_return retval = new JVMParser.classBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.methodDefinition_return methodDefinition117 =null;

        JVMParser.ctorDefinition_return ctorDefinition118 =null;

        JVMParser.fieldDefinition_return fieldDefinition119 =null;

        JVMParser.staticCtorDefinition_return staticCtorDefinition120 =null;



        try {
            // JVM.g:188:2: ( ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+ )
            // JVM.g:189:2: ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:189:2: ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+
            int cnt25=0;
            loop25:
            do {
                int alt25=5;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0 >= PRIVATE && LA25_0 <= PUBLIC)) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt25=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt25=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt25=3;
                    }
                    else if ( (true) ) {
                        alt25=4;
                    }


                }
                else if ( (LA25_0==LESST) && (synpred1_JVM())) {
                    alt25=1;
                }
                else if ( (LA25_0==BOOLEAN) ) {
                    int LA25_4 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt25=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt25=3;
                    }


                }
                else if ( (LA25_0==DOUBLE||LA25_0==FLOAT) ) {
                    int LA25_5 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt25=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt25=3;
                    }


                }
                else if ( (LA25_0==BYTE||LA25_0==CHAR||LA25_0==INT||LA25_0==LONG||LA25_0==SHORT) ) {
                    int LA25_6 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt25=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt25=3;
                    }


                }
                else if ( (LA25_0==VOID) ) {
                    int LA25_7 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt25=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt25=3;
                    }


                }
                else if ( (LA25_0==NORMALTYPE) ) {
                    int LA25_8 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt25=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt25=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt25=3;
                    }


                }
                else if ( (LA25_0==BaseType||LA25_0==DEFAULT||LA25_0==IDENTIFIER||LA25_0==VoidType) ) {
                    int LA25_9 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt25=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt25=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt25=3;
                    }


                }
                else if ( (LA25_0==STATIC) ) {
                    int LA25_10 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt25=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt25=3;
                    }
                    else if ( (true) ) {
                        alt25=4;
                    }


                }
                else if ( (LA25_0==ABSTRACT||LA25_0==NATIVE||LA25_0==SYNCHRONIZED) && (synpred1_JVM())) {
                    alt25=1;
                }
                else if ( (LA25_0==TRANSIENT||LA25_0==VOLATILE) && (synpred3_JVM())) {
                    alt25=3;
                }
                else if ( (LA25_0==FINAL) ) {
                    int LA25_13 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt25=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt25=3;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // JVM.g:190:3: ( methodDefinition )=> methodDefinition
            	    {
            	    pushFollow(FOLLOW_methodDefinition_in_classBody807);
            	    methodDefinition117=methodDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDefinition117.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:191:4: ( ctorDefinition )=> ctorDefinition
            	    {
            	    pushFollow(FOLLOW_ctorDefinition_in_classBody818);
            	    ctorDefinition118=ctorDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDefinition118.getTree());

            	    }
            	    break;
            	case 3 :
            	    // JVM.g:192:4: ( fieldDefinition )=> fieldDefinition
            	    {
            	    pushFollow(FOLLOW_fieldDefinition_in_classBody829);
            	    fieldDefinition119=fieldDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDefinition119.getTree());

            	    }
            	    break;
            	case 4 :
            	    // JVM.g:193:4: staticCtorDefinition
            	    {
            	    pushFollow(FOLLOW_staticCtorDefinition_in_classBody834);
            	    staticCtorDefinition120=staticCtorDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCtorDefinition120.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // JVM.g:201:1: fieldDefinition : ( field_visual_modifier )? ( field_modifier )* aggregatedJavaType identifier ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )* ;
    public final JVMParser.fieldDefinition_return fieldDefinition() throws RecognitionException {
        JVMParser.fieldDefinition_return retval = new JVMParser.fieldDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSIGN125=null;
        Token SEMI127=null;
        JVMParser.field_visual_modifier_return field_visual_modifier121 =null;

        JVMParser.field_modifier_return field_modifier122 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType123 =null;

        JVMParser.identifier_return identifier124 =null;

        JVMParser.literals_return literals126 =null;

        JVMParser.fieldInfo_return fieldInfo128 =null;

        JVMParser.fieldAdditionalInfo_return fieldAdditionalInfo129 =null;


        Object ASSIGN125_tree=null;
        Object SEMI127_tree=null;

        try {
            // JVM.g:202:2: ( ( field_visual_modifier )? ( field_modifier )* aggregatedJavaType identifier ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )* )
            // JVM.g:202:4: ( field_visual_modifier )? ( field_modifier )* aggregatedJavaType identifier ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:202:4: ( field_visual_modifier )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0 >= PRIVATE && LA26_0 <= PUBLIC)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // JVM.g:202:4: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition853);
                    field_visual_modifier121=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_visual_modifier121.getTree());

                    }
                    break;

            }


            // JVM.g:202:27: ( field_modifier )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==FINAL||LA27_0==STATIC||LA27_0==TRANSIENT||LA27_0==VOLATILE) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // JVM.g:202:27: field_modifier
            	    {
            	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition856);
            	    field_modifier122=field_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_modifier122.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            pushFollow(FOLLOW_aggregatedJavaType_in_fieldDefinition859);
            aggregatedJavaType123=aggregatedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType123.getTree());

            pushFollow(FOLLOW_identifier_in_fieldDefinition861);
            identifier124=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier124.getTree());

            // JVM.g:202:73: ( ASSIGN literals )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ASSIGN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // JVM.g:202:74: ASSIGN literals
                    {
                    ASSIGN125=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefinition864); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN125_tree = 
                    (Object)adaptor.create(ASSIGN125)
                    ;
                    adaptor.addChild(root_0, ASSIGN125_tree);
                    }

                    pushFollow(FOLLOW_literals_in_fieldDefinition866);
                    literals126=literals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literals126.getTree());

                    }
                    break;

            }


            SEMI127=(Token)match(input,SEMI,FOLLOW_SEMI_in_fieldDefinition870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI127_tree = 
            (Object)adaptor.create(SEMI127)
            ;
            adaptor.addChild(root_0, SEMI127_tree);
            }

            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition875);
            fieldInfo128=fieldInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfo128.getTree());

            // JVM.g:204:3: ( fieldAdditionalInfo )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Constant||LA29_0==Deprecated||LA29_0==RuntimeVisibleAnnotations||LA29_0==Signature||LA29_0==Synthetic) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // JVM.g:204:3: fieldAdditionalInfo
            	    {
            	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition879);
            	    fieldAdditionalInfo129=fieldAdditionalInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldAdditionalInfo129.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "fieldDefinition"


    public static class fieldInfo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldInfo"
    // JVM.g:207:1: fieldInfo : Signature fieldInfoOption1 flags ;
    public final JVMParser.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMParser.fieldInfo_return retval = new JVMParser.fieldInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature130=null;
        JVMParser.fieldInfoOption1_return fieldInfoOption1131 =null;

        JVMParser.flags_return flags132 =null;


        Object Signature130_tree=null;

        try {
            // JVM.g:208:2: ( Signature fieldInfoOption1 flags )
            // JVM.g:208:4: Signature fieldInfoOption1 flags
            {
            root_0 = (Object)adaptor.nil();


            Signature130=(Token)match(input,Signature,FOLLOW_Signature_in_fieldInfo891); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Signature130_tree = 
            (Object)adaptor.create(Signature130)
            ;
            adaptor.addChild(root_0, Signature130_tree);
            }

            pushFollow(FOLLOW_fieldInfoOption1_in_fieldInfo893);
            fieldInfoOption1131=fieldInfoOption1();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption1131.getTree());

            pushFollow(FOLLOW_flags_in_fieldInfo898);
            flags132=flags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, flags132.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:212:1: fieldAdditionalInfo : ( Constant fieldInfoOption3 | Constant fieldInfoOption4 | Signature fieldInfoOption5 | Deprecated fieldInfoOption6 | Synthetic fieldInfoOption6 | runtimeVisibleAnnotations_info ) ;
    public final JVMParser.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        JVMParser.fieldAdditionalInfo_return retval = new JVMParser.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Constant133=null;
        Token Constant135=null;
        Token Signature137=null;
        Token Deprecated139=null;
        Token Synthetic141=null;
        JVMParser.fieldInfoOption3_return fieldInfoOption3134 =null;

        JVMParser.fieldInfoOption4_return fieldInfoOption4136 =null;

        JVMParser.fieldInfoOption5_return fieldInfoOption5138 =null;

        JVMParser.fieldInfoOption6_return fieldInfoOption6140 =null;

        JVMParser.fieldInfoOption6_return fieldInfoOption6142 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info143 =null;


        Object Constant133_tree=null;
        Object Constant135_tree=null;
        Object Signature137_tree=null;
        Object Deprecated139_tree=null;
        Object Synthetic141_tree=null;

        try {
            // JVM.g:213:2: ( ( Constant fieldInfoOption3 | Constant fieldInfoOption4 | Signature fieldInfoOption5 | Deprecated fieldInfoOption6 | Synthetic fieldInfoOption6 | runtimeVisibleAnnotations_info ) )
            // JVM.g:213:4: ( Constant fieldInfoOption3 | Constant fieldInfoOption4 | Signature fieldInfoOption5 | Deprecated fieldInfoOption6 | Synthetic fieldInfoOption6 | runtimeVisibleAnnotations_info )
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:213:4: ( Constant fieldInfoOption3 | Constant fieldInfoOption4 | Signature fieldInfoOption5 | Deprecated fieldInfoOption6 | Synthetic fieldInfoOption6 | runtimeVisibleAnnotations_info )
            int alt30=6;
            switch ( input.LA(1) ) {
            case Constant:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==BOOLEAN||LA30_1==BYTE||LA30_1==CHAR||LA30_1==DOUBLE||LA30_1==FLOAT||LA30_1==INT||LA30_1==LONG||LA30_1==SHORT||LA30_1==VOID) ) {
                    alt30=1;
                }
                else if ( (LA30_1==CONSTANT_TYPE_ASSIGNABLE) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
                }
                break;
            case Signature:
                {
                alt30=3;
                }
                break;
            case Deprecated:
                {
                alt30=4;
                }
                break;
            case Synthetic:
                {
                alt30=5;
                }
                break;
            case RuntimeVisibleAnnotations:
                {
                alt30=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // JVM.g:213:5: Constant fieldInfoOption3
                    {
                    Constant133=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo911); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constant133_tree = 
                    (Object)adaptor.create(Constant133)
                    ;
                    adaptor.addChild(root_0, Constant133_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption3_in_fieldAdditionalInfo913);
                    fieldInfoOption3134=fieldInfoOption3();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption3134.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:214:4: Constant fieldInfoOption4
                    {
                    Constant135=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constant135_tree = 
                    (Object)adaptor.create(Constant135)
                    ;
                    adaptor.addChild(root_0, Constant135_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption4_in_fieldAdditionalInfo920);
                    fieldInfoOption4136=fieldInfoOption4();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption4136.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:215:4: Signature fieldInfoOption5
                    {
                    Signature137=(Token)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo925); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Signature137_tree = 
                    (Object)adaptor.create(Signature137)
                    ;
                    adaptor.addChild(root_0, Signature137_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption5_in_fieldAdditionalInfo927);
                    fieldInfoOption5138=fieldInfoOption5();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption5138.getTree());

                    }
                    break;
                case 4 :
                    // JVM.g:216:4: Deprecated fieldInfoOption6
                    {
                    Deprecated139=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Deprecated139_tree = 
                    (Object)adaptor.create(Deprecated139)
                    ;
                    adaptor.addChild(root_0, Deprecated139_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo934);
                    fieldInfoOption6140=fieldInfoOption6();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption6140.getTree());

                    }
                    break;
                case 5 :
                    // JVM.g:217:4: Synthetic fieldInfoOption6
                    {
                    Synthetic141=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Synthetic141_tree = 
                    (Object)adaptor.create(Synthetic141)
                    ;
                    adaptor.addChild(root_0, Synthetic141_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo941);
                    fieldInfoOption6142=fieldInfoOption6();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption6142.getTree());

                    }
                    break;
                case 6 :
                    // JVM.g:218:4: runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo946);
                    runtimeVisibleAnnotations_info143=runtimeVisibleAnnotations_info();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotations_info143.getTree());

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
    // JVM.g:221:1: fieldInfoOption1 : bytecodeType ;
    public final JVMParser.fieldInfoOption1_return fieldInfoOption1() throws RecognitionException {
        JVMParser.fieldInfoOption1_return retval = new JVMParser.fieldInfoOption1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.bytecodeType_return bytecodeType144 =null;



        try {
            // JVM.g:222:2: ( bytecodeType )
            // JVM.g:222:4: bytecodeType
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bytecodeType_in_fieldInfoOption1960);
            bytecodeType144=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType144.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:225:1: fieldInfoOption2 : IDENTIFIER ( COMMA IDENTIFIER )* -> ( IDENTIFIER )+ ;
    public final JVMParser.fieldInfoOption2_return fieldInfoOption2() throws RecognitionException {
        JVMParser.fieldInfoOption2_return retval = new JVMParser.fieldInfoOption2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER145=null;
        Token COMMA146=null;
        Token IDENTIFIER147=null;

        Object IDENTIFIER145_tree=null;
        Object COMMA146_tree=null;
        Object IDENTIFIER147_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // JVM.g:226:2: ( IDENTIFIER ( COMMA IDENTIFIER )* -> ( IDENTIFIER )+ )
            // JVM.g:226:4: IDENTIFIER ( COMMA IDENTIFIER )*
            {
            IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldInfoOption2973); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER145);


            // JVM.g:226:15: ( COMMA IDENTIFIER )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // JVM.g:226:16: COMMA IDENTIFIER
            	    {
            	    COMMA146=(Token)match(input,COMMA,FOLLOW_COMMA_in_fieldInfoOption2976); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA146);


            	    IDENTIFIER147=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldInfoOption2978); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER147);


            	    }
            	    break;

            	default :
            	    break loop31;
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
            // 226:35: -> ( IDENTIFIER )+
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
    // JVM.g:229:1: fieldInfoOption3 : primitiveType literals ;
    public final JVMParser.fieldInfoOption3_return fieldInfoOption3() throws RecognitionException {
        JVMParser.fieldInfoOption3_return retval = new JVMParser.fieldInfoOption3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.primitiveType_return primitiveType148 =null;

        JVMParser.literals_return literals149 =null;



        try {
            // JVM.g:230:2: ( primitiveType literals )
            // JVM.g:230:4: primitiveType literals
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_primitiveType_in_fieldInfoOption3997);
            primitiveType148=primitiveType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType148.getTree());

            pushFollow(FOLLOW_literals_in_fieldInfoOption3999);
            literals149=literals();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, literals149.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:233:1: fieldInfoOption4 : CONSTANT_TYPE_ASSIGNABLE ;
    public final JVMParser.fieldInfoOption4_return fieldInfoOption4() throws RecognitionException {
        JVMParser.fieldInfoOption4_return retval = new JVMParser.fieldInfoOption4_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTANT_TYPE_ASSIGNABLE150=null;

        Object CONSTANT_TYPE_ASSIGNABLE150_tree=null;

        try {
            // JVM.g:234:2: ( CONSTANT_TYPE_ASSIGNABLE )
            // JVM.g:234:4: CONSTANT_TYPE_ASSIGNABLE
            {
            root_0 = (Object)adaptor.nil();


            CONSTANT_TYPE_ASSIGNABLE150=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldInfoOption41011); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTANT_TYPE_ASSIGNABLE150_tree = 
            (Object)adaptor.create(CONSTANT_TYPE_ASSIGNABLE150)
            ;
            adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE150_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:237:1: fieldInfoOption5 : CPINDEX ;
    public final JVMParser.fieldInfoOption5_return fieldInfoOption5() throws RecognitionException {
        JVMParser.fieldInfoOption5_return retval = new JVMParser.fieldInfoOption5_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX151=null;

        Object CPINDEX151_tree=null;

        try {
            // JVM.g:238:2: ( CPINDEX )
            // JVM.g:238:5: CPINDEX
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX151=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldInfoOption51024); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX151_tree = 
            (Object)adaptor.create(CPINDEX151)
            ;
            adaptor.addChild(root_0, CPINDEX151_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:241:1: fieldInfoOption6 : BOOLEANLITERAL ;
    public final JVMParser.fieldInfoOption6_return fieldInfoOption6() throws RecognitionException {
        JVMParser.fieldInfoOption6_return retval = new JVMParser.fieldInfoOption6_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEANLITERAL152=null;

        Object BOOLEANLITERAL152_tree=null;

        try {
            // JVM.g:242:2: ( BOOLEANLITERAL )
            // JVM.g:242:5: BOOLEANLITERAL
            {
            root_0 = (Object)adaptor.nil();


            BOOLEANLITERAL152=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldInfoOption61037); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEANLITERAL152_tree = 
            (Object)adaptor.create(BOOLEANLITERAL152)
            ;
            adaptor.addChild(root_0, BOOLEANLITERAL152_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:245:1: field_visual_modifier : ( PUBLIC | PRIVATE | PROTECTED );
    public final JVMParser.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        JVMParser.field_visual_modifier_return retval = new JVMParser.field_visual_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set153=null;

        Object set153_tree=null;

        try {
            // JVM.g:246:2: ( PUBLIC | PRIVATE | PROTECTED )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set153=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set153)
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
    // JVM.g:249:1: field_modifier : ( FINAL | STATIC | TRANSIENT | VOLATILE );
    public final JVMParser.field_modifier_return field_modifier() throws RecognitionException {
        JVMParser.field_modifier_return retval = new JVMParser.field_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set154=null;

        Object set154_tree=null;

        try {
            // JVM.g:250:2: ( FINAL | STATIC | TRANSIENT | VOLATILE )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set154=(Token)input.LT(1);

            if ( input.LA(1)==FINAL||input.LA(1)==STATIC||input.LA(1)==TRANSIENT||input.LA(1)==VOLATILE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set154)
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
    // JVM.g:257:1: staticCtorDefinition : ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body ;
    public final JVMParser.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        JVMParser.staticCtorDefinition_return retval = new JVMParser.staticCtorDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC156=null;
        Token LBRACE157=null;
        Token RBRACE158=null;
        Token SEMI159=null;
        JVMParser.field_visual_modifier_return field_visual_modifier155 =null;

        JVMParser.methodInfo_return methodInfo160 =null;

        JVMParser.body_return body161 =null;


        Object STATIC156_tree=null;
        Object LBRACE157_tree=null;
        Object RBRACE158_tree=null;
        Object SEMI159_tree=null;

        try {
            // JVM.g:258:2: ( ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body )
            // JVM.g:258:4: ( field_visual_modifier )? STATIC LBRACE RBRACE SEMI methodInfo body
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:258:4: ( field_visual_modifier )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= PRIVATE && LA32_0 <= PUBLIC)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // JVM.g:258:4: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition1097);
                    field_visual_modifier155=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_visual_modifier155.getTree());

                    }
                    break;

            }


            STATIC156=(Token)match(input,STATIC,FOLLOW_STATIC_in_staticCtorDefinition1100); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STATIC156_tree = 
            (Object)adaptor.create(STATIC156)
            ;
            adaptor.addChild(root_0, STATIC156_tree);
            }

            LBRACE157=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_staticCtorDefinition1102); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE157_tree = 
            (Object)adaptor.create(LBRACE157)
            ;
            adaptor.addChild(root_0, LBRACE157_tree);
            }

            RBRACE158=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_staticCtorDefinition1104); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE158_tree = 
            (Object)adaptor.create(RBRACE158)
            ;
            adaptor.addChild(root_0, RBRACE158_tree);
            }

            SEMI159=(Token)match(input,SEMI,FOLLOW_SEMI_in_staticCtorDefinition1106); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI159_tree = 
            (Object)adaptor.create(SEMI159)
            ;
            adaptor.addChild(root_0, SEMI159_tree);
            }

            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition1111);
            methodInfo160=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodInfo160.getTree());

            pushFollow(FOLLOW_body_in_staticCtorDefinition1115);
            body161=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body161.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:267:1: ctorDefinition : ( field_visual_modifier )? javaType arguments ( throwClause )? SEMI methodInfo body afterMethodInfo ;
    public final JVMParser.ctorDefinition_return ctorDefinition() throws RecognitionException {
        JVMParser.ctorDefinition_return retval = new JVMParser.ctorDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI166=null;
        JVMParser.field_visual_modifier_return field_visual_modifier162 =null;

        JVMParser.javaType_return javaType163 =null;

        JVMParser.arguments_return arguments164 =null;

        JVMParser.throwClause_return throwClause165 =null;

        JVMParser.methodInfo_return methodInfo167 =null;

        JVMParser.body_return body168 =null;

        JVMParser.afterMethodInfo_return afterMethodInfo169 =null;


        Object SEMI166_tree=null;

        try {
            // JVM.g:268:2: ( ( field_visual_modifier )? javaType arguments ( throwClause )? SEMI methodInfo body afterMethodInfo )
            // JVM.g:268:4: ( field_visual_modifier )? javaType arguments ( throwClause )? SEMI methodInfo body afterMethodInfo
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:268:4: ( field_visual_modifier )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0 >= PRIVATE && LA33_0 <= PUBLIC)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // JVM.g:268:4: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition1131);
                    field_visual_modifier162=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_visual_modifier162.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_javaType_in_ctorDefinition1134);
            javaType163=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType163.getTree());

            pushFollow(FOLLOW_arguments_in_ctorDefinition1136);
            arguments164=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments164.getTree());

            // JVM.g:268:46: ( throwClause )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==THROWS) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // JVM.g:268:46: throwClause
                    {
                    pushFollow(FOLLOW_throwClause_in_ctorDefinition1138);
                    throwClause165=throwClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, throwClause165.getTree());

                    }
                    break;

            }


            SEMI166=(Token)match(input,SEMI,FOLLOW_SEMI_in_ctorDefinition1141); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI166_tree = 
            (Object)adaptor.create(SEMI166)
            ;
            adaptor.addChild(root_0, SEMI166_tree);
            }

            pushFollow(FOLLOW_methodInfo_in_ctorDefinition1146);
            methodInfo167=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodInfo167.getTree());

            pushFollow(FOLLOW_body_in_ctorDefinition1150);
            body168=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body168.getTree());

            pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition1154);
            afterMethodInfo169=afterMethodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, afterMethodInfo169.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:278:1: methodDefinition : ( method_modifier )* ( genericReturn )? aggregatedJavaType javaTypeIdentifier arguments ( throwClause )? SEMI methodInfo ( body )? afterMethodInfo ;
    public final JVMParser.methodDefinition_return methodDefinition() throws RecognitionException {
        JVMParser.methodDefinition_return retval = new JVMParser.methodDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI176=null;
        JVMParser.method_modifier_return method_modifier170 =null;

        JVMParser.genericReturn_return genericReturn171 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType172 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier173 =null;

        JVMParser.arguments_return arguments174 =null;

        JVMParser.throwClause_return throwClause175 =null;

        JVMParser.methodInfo_return methodInfo177 =null;

        JVMParser.body_return body178 =null;

        JVMParser.afterMethodInfo_return afterMethodInfo179 =null;


        Object SEMI176_tree=null;

        try {
            // JVM.g:279:2: ( ( method_modifier )* ( genericReturn )? aggregatedJavaType javaTypeIdentifier arguments ( throwClause )? SEMI methodInfo ( body )? afterMethodInfo )
            // JVM.g:279:4: ( method_modifier )* ( genericReturn )? aggregatedJavaType javaTypeIdentifier arguments ( throwClause )? SEMI methodInfo ( body )? afterMethodInfo
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:279:4: ( method_modifier )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ABSTRACT||LA35_0==FINAL||LA35_0==NATIVE||(LA35_0 >= PRIVATE && LA35_0 <= PUBLIC)||LA35_0==STATIC||LA35_0==SYNCHRONIZED) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // JVM.g:279:4: method_modifier
            	    {
            	    pushFollow(FOLLOW_method_modifier_in_methodDefinition1169);
            	    method_modifier170=method_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, method_modifier170.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // JVM.g:279:21: ( genericReturn )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LESST) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // JVM.g:279:21: genericReturn
                    {
                    pushFollow(FOLLOW_genericReturn_in_methodDefinition1172);
                    genericReturn171=genericReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericReturn171.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_aggregatedJavaType_in_methodDefinition1175);
            aggregatedJavaType172=aggregatedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType172.getTree());

            pushFollow(FOLLOW_javaTypeIdentifier_in_methodDefinition1177);
            javaTypeIdentifier173=javaTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier173.getTree());

            pushFollow(FOLLOW_arguments_in_methodDefinition1179);
            arguments174=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments174.getTree());

            // JVM.g:279:84: ( throwClause )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==THROWS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // JVM.g:279:84: throwClause
                    {
                    pushFollow(FOLLOW_throwClause_in_methodDefinition1181);
                    throwClause175=throwClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, throwClause175.getTree());

                    }
                    break;

            }


            SEMI176=(Token)match(input,SEMI,FOLLOW_SEMI_in_methodDefinition1184); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI176_tree = 
            (Object)adaptor.create(SEMI176)
            ;
            adaptor.addChild(root_0, SEMI176_tree);
            }

            pushFollow(FOLLOW_methodInfo_in_methodDefinition1189);
            methodInfo177=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodInfo177.getTree());

            // JVM.g:281:3: ( body )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Code) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // JVM.g:281:3: body
                    {
                    pushFollow(FOLLOW_body_in_methodDefinition1193);
                    body178=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, body178.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition1198);
            afterMethodInfo179=afterMethodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, afterMethodInfo179.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:285:1: methodInfo : Signature methodSignatureInfo flags ;
    public final JVMParser.methodInfo_return methodInfo() throws RecognitionException {
        JVMParser.methodInfo_return retval = new JVMParser.methodInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature180=null;
        JVMParser.methodSignatureInfo_return methodSignatureInfo181 =null;

        JVMParser.flags_return flags182 =null;


        Object Signature180_tree=null;

        try {
            // JVM.g:286:2: ( Signature methodSignatureInfo flags )
            // JVM.g:286:4: Signature methodSignatureInfo flags
            {
            root_0 = (Object)adaptor.nil();


            Signature180=(Token)match(input,Signature,FOLLOW_Signature_in_methodInfo1209); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Signature180_tree = 
            (Object)adaptor.create(Signature180)
            ;
            adaptor.addChild(root_0, Signature180_tree);
            }

            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo1211);
            methodSignatureInfo181=methodSignatureInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodSignatureInfo181.getTree());

            pushFollow(FOLLOW_flags_in_methodInfo1216);
            flags182=flags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, flags182.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:290:1: afterMethodInfo : ( ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault ) )* ;
    public final JVMParser.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        JVMParser.afterMethodInfo_return retval = new JVMParser.afterMethodInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Deprecated183=null;
        Token Signature185=null;
        Token CPINDEX186=null;
        Token Exceptions188=null;
        Token Synthetic190=null;
        Token BOOLEANLITERAL191=null;
        JVMParser.methodDeprecatedInfo_return methodDeprecatedInfo184 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info187 =null;

        JVMParser.throwClause_return throwClause189 =null;

        JVMParser.annotationDefault_return annotationDefault192 =null;


        Object Deprecated183_tree=null;
        Object Signature185_tree=null;
        Object CPINDEX186_tree=null;
        Object Exceptions188_tree=null;
        Object Synthetic190_tree=null;
        Object BOOLEANLITERAL191_tree=null;

        try {
            // JVM.g:291:2: ( ( ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault ) )* )
            // JVM.g:291:4: ( ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault ) )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:291:4: ( ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==AnnotationDefault||LA40_0==Deprecated||LA40_0==Exceptions||LA40_0==RuntimeVisibleAnnotations||LA40_0==Signature||LA40_0==Synthetic) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // JVM.g:291:5: ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault )
            	    {
            	    // JVM.g:291:5: ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault )
            	    int alt39=6;
            	    switch ( input.LA(1) ) {
            	    case Deprecated:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case Signature:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case RuntimeVisibleAnnotations:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    case Exceptions:
            	        {
            	        alt39=4;
            	        }
            	        break;
            	    case Synthetic:
            	        {
            	        alt39=5;
            	        }
            	        break;
            	    case AnnotationDefault:
            	        {
            	        alt39=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // JVM.g:291:6: Deprecated methodDeprecatedInfo
            	            {
            	            Deprecated183=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfo1229); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            Deprecated183_tree = 
            	            (Object)adaptor.create(Deprecated183)
            	            ;
            	            adaptor.addChild(root_0, Deprecated183_tree);
            	            }

            	            pushFollow(FOLLOW_methodDeprecatedInfo_in_afterMethodInfo1231);
            	            methodDeprecatedInfo184=methodDeprecatedInfo();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeprecatedInfo184.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // JVM.g:292:4: Signature CPINDEX
            	            {
            	            Signature185=(Token)match(input,Signature,FOLLOW_Signature_in_afterMethodInfo1236); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            Signature185_tree = 
            	            (Object)adaptor.create(Signature185)
            	            ;
            	            adaptor.addChild(root_0, Signature185_tree);
            	            }

            	            CPINDEX186=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfo1238); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CPINDEX186_tree = 
            	            (Object)adaptor.create(CPINDEX186)
            	            ;
            	            adaptor.addChild(root_0, CPINDEX186_tree);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // JVM.g:293:4: runtimeVisibleAnnotations_info
            	            {
            	            pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1243);
            	            runtimeVisibleAnnotations_info187=runtimeVisibleAnnotations_info();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotations_info187.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // JVM.g:294:4: Exceptions throwClause
            	            {
            	            Exceptions188=(Token)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfo1248); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            Exceptions188_tree = 
            	            (Object)adaptor.create(Exceptions188)
            	            ;
            	            adaptor.addChild(root_0, Exceptions188_tree);
            	            }

            	            pushFollow(FOLLOW_throwClause_in_afterMethodInfo1251);
            	            throwClause189=throwClause();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, throwClause189.getTree());

            	            }
            	            break;
            	        case 5 :
            	            // JVM.g:295:4: Synthetic BOOLEANLITERAL
            	            {
            	            Synthetic190=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfo1256); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            Synthetic190_tree = 
            	            (Object)adaptor.create(Synthetic190)
            	            ;
            	            adaptor.addChild(root_0, Synthetic190_tree);
            	            }

            	            BOOLEANLITERAL191=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1258); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BOOLEANLITERAL191_tree = 
            	            (Object)adaptor.create(BOOLEANLITERAL191)
            	            ;
            	            adaptor.addChild(root_0, BOOLEANLITERAL191_tree);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // JVM.g:296:4: annotationDefault
            	            {
            	            pushFollow(FOLLOW_annotationDefault_in_afterMethodInfo1263);
            	            annotationDefault192=annotationDefault();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationDefault192.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "afterMethodInfo"


    public static class annotationDefault_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotationDefault"
    // JVM.g:299:1: annotationDefault : AnnotationDefault DefaultValue ( AnnotationAssign | LBRACK RBRACK ) ;
    public final JVMParser.annotationDefault_return annotationDefault() throws RecognitionException {
        JVMParser.annotationDefault_return retval = new JVMParser.annotationDefault_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AnnotationDefault193=null;
        Token DefaultValue194=null;
        Token AnnotationAssign195=null;
        Token LBRACK196=null;
        Token RBRACK197=null;

        Object AnnotationDefault193_tree=null;
        Object DefaultValue194_tree=null;
        Object AnnotationAssign195_tree=null;
        Object LBRACK196_tree=null;
        Object RBRACK197_tree=null;

        try {
            // JVM.g:300:2: ( AnnotationDefault DefaultValue ( AnnotationAssign | LBRACK RBRACK ) )
            // JVM.g:300:4: AnnotationDefault DefaultValue ( AnnotationAssign | LBRACK RBRACK )
            {
            root_0 = (Object)adaptor.nil();


            AnnotationDefault193=(Token)match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault1278); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AnnotationDefault193_tree = 
            (Object)adaptor.create(AnnotationDefault193)
            ;
            adaptor.addChild(root_0, AnnotationDefault193_tree);
            }

            DefaultValue194=(Token)match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault1281); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DefaultValue194_tree = 
            (Object)adaptor.create(DefaultValue194)
            ;
            adaptor.addChild(root_0, DefaultValue194_tree);
            }

            // JVM.g:300:36: ( AnnotationAssign | LBRACK RBRACK )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==AnnotationAssign) ) {
                alt41=1;
            }
            else if ( (LA41_0==LBRACK) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // JVM.g:300:37: AnnotationAssign
                    {
                    AnnotationAssign195=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationDefault1284); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AnnotationAssign195_tree = 
                    (Object)adaptor.create(AnnotationAssign195)
                    ;
                    adaptor.addChild(root_0, AnnotationAssign195_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:300:56: LBRACK RBRACK
                    {
                    LBRACK196=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_annotationDefault1288); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACK196_tree = 
                    (Object)adaptor.create(LBRACK196)
                    ;
                    adaptor.addChild(root_0, LBRACK196_tree);
                    }

                    RBRACK197=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_annotationDefault1290); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACK197_tree = 
                    (Object)adaptor.create(RBRACK197)
                    ;
                    adaptor.addChild(root_0, RBRACK197_tree);
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
    // JVM.g:303:1: methodSignatureInfo : LPAREN ( bytecodeType )* RPAREN returnDescriptor ;
    public final JVMParser.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        JVMParser.methodSignatureInfo_return retval = new JVMParser.methodSignatureInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN198=null;
        Token RPAREN200=null;
        JVMParser.bytecodeType_return bytecodeType199 =null;

        JVMParser.returnDescriptor_return returnDescriptor201 =null;


        Object LPAREN198_tree=null;
        Object RPAREN200_tree=null;

        try {
            // JVM.g:304:2: ( LPAREN ( bytecodeType )* RPAREN returnDescriptor )
            // JVM.g:304:4: LPAREN ( bytecodeType )* RPAREN returnDescriptor
            {
            root_0 = (Object)adaptor.nil();


            LPAREN198=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodSignatureInfo1303); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN198_tree = 
            (Object)adaptor.create(LPAREN198)
            ;
            adaptor.addChild(root_0, LPAREN198_tree);
            }

            // JVM.g:304:11: ( bytecodeType )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==BaseType||LA42_0==IDENTIFIER||LA42_0==INTERNALTYPE||LA42_0==LBRACK||LA42_0==VersionedInternalType) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // JVM.g:304:11: bytecodeType
            	    {
            	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo1305);
            	    bytecodeType199=bytecodeType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType199.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            RPAREN200=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodSignatureInfo1308); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN200_tree = 
            (Object)adaptor.create(RPAREN200)
            ;
            adaptor.addChild(root_0, RPAREN200_tree);
            }

            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo1310);
            returnDescriptor201=returnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, returnDescriptor201.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:307:1: returnDescriptor : ( bytecodeType | VoidType );
    public final JVMParser.returnDescriptor_return returnDescriptor() throws RecognitionException {
        JVMParser.returnDescriptor_return retval = new JVMParser.returnDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VoidType203=null;
        JVMParser.bytecodeType_return bytecodeType202 =null;


        Object VoidType203_tree=null;

        try {
            // JVM.g:308:2: ( bytecodeType | VoidType )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==BaseType||LA43_0==IDENTIFIER||LA43_0==INTERNALTYPE||LA43_0==LBRACK||LA43_0==VersionedInternalType) ) {
                alt43=1;
            }
            else if ( (LA43_0==VoidType) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // JVM.g:308:4: bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor1321);
                    bytecodeType202=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType202.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:308:19: VoidType
                    {
                    root_0 = (Object)adaptor.nil();


                    VoidType203=(Token)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor1325); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VoidType203_tree = 
                    (Object)adaptor.create(VoidType203)
                    ;
                    adaptor.addChild(root_0, VoidType203_tree);
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
    // JVM.g:311:1: methodDeprecatedInfo : BOOLEANLITERAL ;
    public final JVMParser.methodDeprecatedInfo_return methodDeprecatedInfo() throws RecognitionException {
        JVMParser.methodDeprecatedInfo_return retval = new JVMParser.methodDeprecatedInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEANLITERAL204=null;

        Object BOOLEANLITERAL204_tree=null;

        try {
            // JVM.g:312:2: ( BOOLEANLITERAL )
            // JVM.g:312:4: BOOLEANLITERAL
            {
            root_0 = (Object)adaptor.nil();


            BOOLEANLITERAL204=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_methodDeprecatedInfo1337); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEANLITERAL204_tree = 
            (Object)adaptor.create(BOOLEANLITERAL204)
            ;
            adaptor.addChild(root_0, BOOLEANLITERAL204_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:315:1: method_modifier : ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | PUBLIC | PRIVATE | PROTECTED );
    public final JVMParser.method_modifier_return method_modifier() throws RecognitionException {
        JVMParser.method_modifier_return retval = new JVMParser.method_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set205=null;

        Object set205_tree=null;

        try {
            // JVM.g:316:2: ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | PUBLIC | PRIVATE | PROTECTED )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set205=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL||input.LA(1)==NATIVE||(input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC)||input.LA(1)==STATIC||input.LA(1)==SYNCHRONIZED ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set205)
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


    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // JVM.g:319:1: arguments : LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN ;
    public final JVMParser.arguments_return arguments() throws RecognitionException {
        JVMParser.arguments_return retval = new JVMParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN206=null;
        Token DOT208=null;
        Token DOT209=null;
        Token DOT210=null;
        Token RPAREN211=null;
        JVMParser.typeList_return typeList207 =null;


        Object LPAREN206_tree=null;
        Object DOT208_tree=null;
        Object DOT209_tree=null;
        Object DOT210_tree=null;
        Object RPAREN211_tree=null;

        try {
            // JVM.g:320:2: ( LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN )
            // JVM.g:320:4: LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN
            {
            root_0 = (Object)adaptor.nil();


            LPAREN206=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments1389); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN206_tree = 
            (Object)adaptor.create(LPAREN206)
            ;
            adaptor.addChild(root_0, LPAREN206_tree);
            }

            // JVM.g:320:11: ( typeList )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==BOOLEAN||(LA44_0 >= BYTE && LA44_0 <= CHAR)||LA44_0==DEFAULT||LA44_0==DOUBLE||LA44_0==FLOAT||LA44_0==IDENTIFIER||LA44_0==INT||LA44_0==LONG||LA44_0==NORMALTYPE||LA44_0==SHORT||LA44_0==VOID||LA44_0==VoidType) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // JVM.g:320:11: typeList
                    {
                    pushFollow(FOLLOW_typeList_in_arguments1391);
                    typeList207=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList207.getTree());

                    }
                    break;

            }


            // JVM.g:320:21: ( DOT DOT DOT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==DOT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // JVM.g:320:22: DOT DOT DOT
                    {
                    DOT208=(Token)match(input,DOT,FOLLOW_DOT_in_arguments1395); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT208_tree = 
                    (Object)adaptor.create(DOT208)
                    ;
                    adaptor.addChild(root_0, DOT208_tree);
                    }

                    DOT209=(Token)match(input,DOT,FOLLOW_DOT_in_arguments1397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT209_tree = 
                    (Object)adaptor.create(DOT209)
                    ;
                    adaptor.addChild(root_0, DOT209_tree);
                    }

                    DOT210=(Token)match(input,DOT,FOLLOW_DOT_in_arguments1399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT210_tree = 
                    (Object)adaptor.create(DOT210)
                    ;
                    adaptor.addChild(root_0, DOT210_tree);
                    }

                    }
                    break;

            }


            RPAREN211=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments1403); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN211_tree = 
            (Object)adaptor.create(RPAREN211)
            ;
            adaptor.addChild(root_0, RPAREN211_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:327:1: body : Code codeBlock ( bodyExtension )* ;
    public final JVMParser.body_return body() throws RecognitionException {
        JVMParser.body_return retval = new JVMParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Code212=null;
        JVMParser.codeBlock_return codeBlock213 =null;

        JVMParser.bodyExtension_return bodyExtension214 =null;


        Object Code212_tree=null;

        try {
            // JVM.g:328:2: ( Code codeBlock ( bodyExtension )* )
            // JVM.g:329:3: Code codeBlock ( bodyExtension )*
            {
            root_0 = (Object)adaptor.nil();


            Code212=(Token)match(input,Code,FOLLOW_Code_in_body1424); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Code212_tree = 
            (Object)adaptor.create(Code212)
            ;
            adaptor.addChild(root_0, Code212_tree);
            }

            pushFollow(FOLLOW_codeBlock_in_body1429);
            codeBlock213=codeBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, codeBlock213.getTree());

            // JVM.g:331:3: ( bodyExtension )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==ExceptionTable||(LA46_0 >= LineNumberTable && LA46_0 <= LocalVariableTypeTable)||(LA46_0 >= StackMap && LA46_0 <= StackMapTable)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // JVM.g:331:4: bodyExtension
            	    {
            	    pushFollow(FOLLOW_bodyExtension_in_body1434);
            	    bodyExtension214=bodyExtension();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bodyExtension214.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // $ANTLR end "body"


    public static class bodyExtension_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bodyExtension"
    // JVM.g:334:1: bodyExtension : ( ExceptionTable exceptionTable | LineNumberTable lineNumberTable | LocalVariableTable localVariableTable | LocalVariableTypeTable localVariableTable | StackMapTable stackMapTable | StackMap stackMapTypeTable ) ;
    public final JVMParser.bodyExtension_return bodyExtension() throws RecognitionException {
        JVMParser.bodyExtension_return retval = new JVMParser.bodyExtension_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ExceptionTable215=null;
        Token LineNumberTable217=null;
        Token LocalVariableTable219=null;
        Token LocalVariableTypeTable221=null;
        Token StackMapTable223=null;
        Token StackMap225=null;
        JVMParser.exceptionTable_return exceptionTable216 =null;

        JVMParser.lineNumberTable_return lineNumberTable218 =null;

        JVMParser.localVariableTable_return localVariableTable220 =null;

        JVMParser.localVariableTable_return localVariableTable222 =null;

        JVMParser.stackMapTable_return stackMapTable224 =null;

        JVMParser.stackMapTypeTable_return stackMapTypeTable226 =null;


        Object ExceptionTable215_tree=null;
        Object LineNumberTable217_tree=null;
        Object LocalVariableTable219_tree=null;
        Object LocalVariableTypeTable221_tree=null;
        Object StackMapTable223_tree=null;
        Object StackMap225_tree=null;

        try {
            // JVM.g:335:2: ( ( ExceptionTable exceptionTable | LineNumberTable lineNumberTable | LocalVariableTable localVariableTable | LocalVariableTypeTable localVariableTable | StackMapTable stackMapTable | StackMap stackMapTypeTable ) )
            // JVM.g:336:2: ( ExceptionTable exceptionTable | LineNumberTable lineNumberTable | LocalVariableTable localVariableTable | LocalVariableTypeTable localVariableTable | StackMapTable stackMapTable | StackMap stackMapTypeTable )
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:336:2: ( ExceptionTable exceptionTable | LineNumberTable lineNumberTable | LocalVariableTable localVariableTable | LocalVariableTypeTable localVariableTable | StackMapTable stackMapTable | StackMap stackMapTypeTable )
            int alt47=6;
            switch ( input.LA(1) ) {
            case ExceptionTable:
                {
                alt47=1;
                }
                break;
            case LineNumberTable:
                {
                alt47=2;
                }
                break;
            case LocalVariableTable:
                {
                alt47=3;
                }
                break;
            case LocalVariableTypeTable:
                {
                alt47=4;
                }
                break;
            case StackMapTable:
                {
                alt47=5;
                }
                break;
            case StackMap:
                {
                alt47=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // JVM.g:336:4: ExceptionTable exceptionTable
                    {
                    ExceptionTable215=(Token)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension1452); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ExceptionTable215_tree = 
                    (Object)adaptor.create(ExceptionTable215)
                    ;
                    adaptor.addChild(root_0, ExceptionTable215_tree);
                    }

                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension1455);
                    exceptionTable216=exceptionTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exceptionTable216.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:337:4: LineNumberTable lineNumberTable
                    {
                    LineNumberTable217=(Token)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension1460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LineNumberTable217_tree = 
                    (Object)adaptor.create(LineNumberTable217)
                    ;
                    adaptor.addChild(root_0, LineNumberTable217_tree);
                    }

                    pushFollow(FOLLOW_lineNumberTable_in_bodyExtension1463);
                    lineNumberTable218=lineNumberTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lineNumberTable218.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:338:4: LocalVariableTable localVariableTable
                    {
                    LocalVariableTable219=(Token)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension1468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LocalVariableTable219_tree = 
                    (Object)adaptor.create(LocalVariableTable219)
                    ;
                    adaptor.addChild(root_0, LocalVariableTable219_tree);
                    }

                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension1471);
                    localVariableTable220=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableTable220.getTree());

                    }
                    break;
                case 4 :
                    // JVM.g:339:4: LocalVariableTypeTable localVariableTable
                    {
                    LocalVariableTypeTable221=(Token)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension1477); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LocalVariableTypeTable221_tree = 
                    (Object)adaptor.create(LocalVariableTypeTable221)
                    ;
                    adaptor.addChild(root_0, LocalVariableTypeTable221_tree);
                    }

                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension1480);
                    localVariableTable222=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableTable222.getTree());

                    }
                    break;
                case 5 :
                    // JVM.g:340:4: StackMapTable stackMapTable
                    {
                    StackMapTable223=(Token)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension1486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StackMapTable223_tree = 
                    (Object)adaptor.create(StackMapTable223)
                    ;
                    adaptor.addChild(root_0, StackMapTable223_tree);
                    }

                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension1488);
                    stackMapTable224=stackMapTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTable224.getTree());

                    }
                    break;
                case 6 :
                    // JVM.g:341:4: StackMap stackMapTypeTable
                    {
                    StackMap225=(Token)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension1493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StackMap225_tree = 
                    (Object)adaptor.create(StackMap225)
                    ;
                    adaptor.addChild(root_0, StackMap225_tree);
                    }

                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension1495);
                    stackMapTypeTable226=stackMapTypeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTypeTable226.getTree());

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
    // JVM.g:344:1: codeBlock : variables ( codeLine | javaSwitch )* codeBlockEnd ;
    public final JVMParser.codeBlock_return codeBlock() throws RecognitionException {
        JVMParser.codeBlock_return retval = new JVMParser.codeBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.variables_return variables227 =null;

        JVMParser.codeLine_return codeLine228 =null;

        JVMParser.javaSwitch_return javaSwitch229 =null;

        JVMParser.codeBlockEnd_return codeBlockEnd230 =null;



        try {
            // JVM.g:345:2: ( variables ( codeLine | javaSwitch )* codeBlockEnd )
            // JVM.g:345:4: variables ( codeLine | javaSwitch )* codeBlockEnd
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variables_in_codeBlock1507);
            variables227=variables();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variables227.getTree());

            // JVM.g:346:3: ( codeLine | javaSwitch )*
            loop48:
            do {
                int alt48=3;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==INTLITERAL) ) {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==COLON) ) {
                        int LA48_2 = input.LA(3);

                        if ( (LA48_2==IDENTIFIER) ) {
                            switch ( input.LA(4) ) {
                            case LBRACE:
                                {
                                alt48=2;
                                }
                                break;
                            case INTLITERAL:
                                {
                                int LA48_5 = input.LA(5);

                                if ( ((LA48_5 >= COLON && LA48_5 <= COMMA)||LA48_5==INTLITERAL) ) {
                                    alt48=1;
                                }


                                }
                                break;
                            case BOOLEAN:
                                {
                                int LA48_7 = input.LA(5);

                                if ( (LA48_7==INTLITERAL) ) {
                                    alt48=1;
                                }


                                }
                                break;
                            case DOUBLE:
                            case FLOAT:
                                {
                                int LA48_8 = input.LA(5);

                                if ( (LA48_8==INTLITERAL) ) {
                                    alt48=1;
                                }


                                }
                                break;
                            case BYTE:
                            case CHAR:
                            case INT:
                            case LONG:
                            case SHORT:
                                {
                                int LA48_9 = input.LA(5);

                                if ( (LA48_9==INTLITERAL) ) {
                                    alt48=1;
                                }


                                }
                                break;
                            case VOID:
                                {
                                int LA48_10 = input.LA(5);

                                if ( (LA48_10==INTLITERAL) ) {
                                    alt48=1;
                                }


                                }
                                break;
                            case CPINDEX:
                                {
                                alt48=1;
                                }
                                break;

                            }

                        }


                    }


                }


                switch (alt48) {
            	case 1 :
            	    // JVM.g:346:4: codeLine
            	    {
            	    pushFollow(FOLLOW_codeLine_in_codeBlock1513);
            	    codeLine228=codeLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, codeLine228.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:346:15: javaSwitch
            	    {
            	    pushFollow(FOLLOW_javaSwitch_in_codeBlock1517);
            	    javaSwitch229=javaSwitch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaSwitch229.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock1523);
            codeBlockEnd230=codeBlockEnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, codeBlockEnd230.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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


    public static class codeLine_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeLine"
    // JVM.g:350:1: codeLine : pc IDENTIFIER ( codeValues )? ;
    public final JVMParser.codeLine_return codeLine() throws RecognitionException {
        JVMParser.codeLine_return retval = new JVMParser.codeLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER232=null;
        JVMParser.pc_return pc231 =null;

        JVMParser.codeValues_return codeValues233 =null;


        Object IDENTIFIER232_tree=null;

        try {
            // JVM.g:351:2: ( pc IDENTIFIER ( codeValues )? )
            // JVM.g:351:4: pc IDENTIFIER ( codeValues )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_codeLine1534);
            pc231=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc231.getTree());

            IDENTIFIER232=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine1536); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER232_tree = 
            (Object)adaptor.create(IDENTIFIER232)
            ;
            adaptor.addChild(root_0, IDENTIFIER232_tree);
            }

            // JVM.g:351:18: ( codeValues )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==BOOLEAN||LA49_0==BYTE||LA49_0==CHAR||LA49_0==CPINDEX||LA49_0==DOUBLE||LA49_0==FLOAT||LA49_0==INT||LA49_0==LONG||LA49_0==SHORT||LA49_0==VOID) ) {
                alt49=1;
            }
            else if ( (LA49_0==INTLITERAL) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==COMMA||LA49_2==INTLITERAL) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // JVM.g:351:18: codeValues
                    {
                    pushFollow(FOLLOW_codeValues_in_codeLine1538);
                    codeValues233=codeValues();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, codeValues233.getTree());

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
    // $ANTLR end "codeLine"


    public static class codeBlockEnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeBlockEnd"
    // JVM.g:354:1: codeBlockEnd : pc IDENTIFIER ( logic3 )? ;
    public final JVMParser.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        JVMParser.codeBlockEnd_return retval = new JVMParser.codeBlockEnd_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER235=null;
        JVMParser.pc_return pc234 =null;

        JVMParser.logic3_return logic3236 =null;


        Object IDENTIFIER235_tree=null;

        try {
            // JVM.g:355:2: ( pc IDENTIFIER ( logic3 )? )
            // JVM.g:355:4: pc IDENTIFIER ( logic3 )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_codeBlockEnd1550);
            pc234=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc234.getTree());

            IDENTIFIER235=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd1552); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER235_tree = 
            (Object)adaptor.create(IDENTIFIER235)
            ;
            adaptor.addChild(root_0, IDENTIFIER235_tree);
            }

            // JVM.g:355:18: ( logic3 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==INTLITERAL) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // JVM.g:355:18: logic3
                    {
                    pushFollow(FOLLOW_logic3_in_codeBlockEnd1554);
                    logic3236=logic3();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic3236.getTree());

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
    // $ANTLR end "codeBlockEnd"


    public static class codeValues_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "codeValues"
    // JVM.g:358:1: codeValues : ( logic | logic2 | logic3 | logic4 | primitiveType );
    public final JVMParser.codeValues_return codeValues() throws RecognitionException {
        JVMParser.codeValues_return retval = new JVMParser.codeValues_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.logic_return logic237 =null;

        JVMParser.logic2_return logic2238 =null;

        JVMParser.logic3_return logic3239 =null;

        JVMParser.logic4_return logic4240 =null;

        JVMParser.primitiveType_return primitiveType241 =null;



        try {
            // JVM.g:359:2: ( logic | logic2 | logic3 | logic4 | primitiveType )
            int alt51=5;
            switch ( input.LA(1) ) {
            case CPINDEX:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==COMMA) ) {
                    alt51=1;
                }
                else if ( (LA51_1==INTLITERAL) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==COMMA) ) {
                    alt51=4;
                }
                else if ( (LA51_2==INTLITERAL) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

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
                alt51=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // JVM.g:359:4: logic
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic_in_codeValues1568);
                    logic237=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic237.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:360:4: logic2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic2_in_codeValues1574);
                    logic2238=logic2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic2238.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:361:4: logic3
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic3_in_codeValues1580);
                    logic3239=logic3();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic3239.getTree());

                    }
                    break;
                case 4 :
                    // JVM.g:362:4: logic4
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic4_in_codeValues1585);
                    logic4240=logic4();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic4240.getTree());

                    }
                    break;
                case 5 :
                    // JVM.g:363:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_codeValues1590);
                    primitiveType241=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType241.getTree());

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
    // $ANTLR end "codeValues"


    public static class logic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic"
    // JVM.g:366:1: logic : CPINDEX COMMA INTLITERAL ;
    public final JVMParser.logic_return logic() throws RecognitionException {
        JVMParser.logic_return retval = new JVMParser.logic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX242=null;
        Token COMMA243=null;
        Token INTLITERAL244=null;

        Object CPINDEX242_tree=null;
        Object COMMA243_tree=null;
        Object INTLITERAL244_tree=null;

        try {
            // JVM.g:367:2: ( CPINDEX COMMA INTLITERAL )
            // JVM.g:367:4: CPINDEX COMMA INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX242=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_logic1602); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX242_tree = 
            (Object)adaptor.create(CPINDEX242)
            ;
            adaptor.addChild(root_0, CPINDEX242_tree);
            }

            COMMA243=(Token)match(input,COMMA,FOLLOW_COMMA_in_logic1604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA243_tree = 
            (Object)adaptor.create(COMMA243)
            ;
            adaptor.addChild(root_0, COMMA243_tree);
            }

            INTLITERAL244=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic1606); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL244_tree = 
            (Object)adaptor.create(INTLITERAL244)
            ;
            adaptor.addChild(root_0, INTLITERAL244_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:370:1: logic2 : CPINDEX ;
    public final JVMParser.logic2_return logic2() throws RecognitionException {
        JVMParser.logic2_return retval = new JVMParser.logic2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CPINDEX245=null;

        Object CPINDEX245_tree=null;

        try {
            // JVM.g:371:2: ( CPINDEX )
            // JVM.g:371:4: CPINDEX
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX245=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_logic21618); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX245_tree = 
            (Object)adaptor.create(CPINDEX245)
            ;
            adaptor.addChild(root_0, CPINDEX245_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:374:1: logic3 : INTLITERAL ;
    public final JVMParser.logic3_return logic3() throws RecognitionException {
        JVMParser.logic3_return retval = new JVMParser.logic3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL246=null;

        Object INTLITERAL246_tree=null;

        try {
            // JVM.g:375:2: ( INTLITERAL )
            // JVM.g:375:4: INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL246=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic31630); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL246_tree = 
            (Object)adaptor.create(INTLITERAL246)
            ;
            adaptor.addChild(root_0, INTLITERAL246_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:378:1: logic4 : INTLITERAL COMMA INTLITERAL ;
    public final JVMParser.logic4_return logic4() throws RecognitionException {
        JVMParser.logic4_return retval = new JVMParser.logic4_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL247=null;
        Token COMMA248=null;
        Token INTLITERAL249=null;

        Object INTLITERAL247_tree=null;
        Object COMMA248_tree=null;
        Object INTLITERAL249_tree=null;

        try {
            // JVM.g:379:2: ( INTLITERAL COMMA INTLITERAL )
            // JVM.g:379:4: INTLITERAL COMMA INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL247=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic41642); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL247_tree = 
            (Object)adaptor.create(INTLITERAL247)
            ;
            adaptor.addChild(root_0, INTLITERAL247_tree);
            }

            COMMA248=(Token)match(input,COMMA,FOLLOW_COMMA_in_logic41644); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA248_tree = 
            (Object)adaptor.create(COMMA248)
            ;
            adaptor.addChild(root_0, COMMA248_tree);
            }

            INTLITERAL249=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic41646); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL249_tree = 
            (Object)adaptor.create(INTLITERAL249)
            ;
            adaptor.addChild(root_0, INTLITERAL249_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:382:1: variables : variable COMMA variable COMMA variable ;
    public final JVMParser.variables_return variables() throws RecognitionException {
        JVMParser.variables_return retval = new JVMParser.variables_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA251=null;
        Token COMMA253=null;
        JVMParser.variable_return variable250 =null;

        JVMParser.variable_return variable252 =null;

        JVMParser.variable_return variable254 =null;


        Object COMMA251_tree=null;
        Object COMMA253_tree=null;

        try {
            // JVM.g:383:2: ( variable COMMA variable COMMA variable )
            // JVM.g:383:4: variable COMMA variable COMMA variable
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variable_in_variables1657);
            variable250=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable250.getTree());

            COMMA251=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables1659); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA251_tree = 
            (Object)adaptor.create(COMMA251)
            ;
            adaptor.addChild(root_0, COMMA251_tree);
            }

            pushFollow(FOLLOW_variable_in_variables1661);
            variable252=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable252.getTree());

            COMMA253=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables1663); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA253_tree = 
            (Object)adaptor.create(COMMA253)
            ;
            adaptor.addChild(root_0, COMMA253_tree);
            }

            pushFollow(FOLLOW_variable_in_variables1665);
            variable254=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable254.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:386:1: variable : IDENTIFIER ASSIGN INTLITERAL ;
    public final JVMParser.variable_return variable() throws RecognitionException {
        JVMParser.variable_return retval = new JVMParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER255=null;
        Token ASSIGN256=null;
        Token INTLITERAL257=null;

        Object IDENTIFIER255_tree=null;
        Object ASSIGN256_tree=null;
        Object INTLITERAL257_tree=null;

        try {
            // JVM.g:387:2: ( IDENTIFIER ASSIGN INTLITERAL )
            // JVM.g:387:4: IDENTIFIER ASSIGN INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER255=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable1676); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER255_tree = 
            (Object)adaptor.create(IDENTIFIER255)
            ;
            adaptor.addChild(root_0, IDENTIFIER255_tree);
            }

            ASSIGN256=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable1678); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN256_tree = 
            (Object)adaptor.create(ASSIGN256)
            ;
            adaptor.addChild(root_0, ASSIGN256_tree);
            }

            INTLITERAL257=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable1680); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL257_tree = 
            (Object)adaptor.create(INTLITERAL257)
            ;
            adaptor.addChild(root_0, INTLITERAL257_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:390:1: javaSwitch : pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE ;
    public final JVMParser.javaSwitch_return javaSwitch() throws RecognitionException {
        JVMParser.javaSwitch_return retval = new JVMParser.javaSwitch_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER259=null;
        Token LBRACE260=null;
        Token RBRACE263=null;
        JVMParser.pc_return pc258 =null;

        JVMParser.switchLine_return switchLine261 =null;

        JVMParser.switchDefaultLine_return switchDefaultLine262 =null;


        Object IDENTIFIER259_tree=null;
        Object LBRACE260_tree=null;
        Object RBRACE263_tree=null;

        try {
            // JVM.g:391:2: ( pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE )
            // JVM.g:391:4: pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_javaSwitch1692);
            pc258=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc258.getTree());

            IDENTIFIER259=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch1694); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER259_tree = 
            (Object)adaptor.create(IDENTIFIER259)
            ;
            adaptor.addChild(root_0, IDENTIFIER259_tree);
            }

            LBRACE260=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_javaSwitch1698); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE260_tree = 
            (Object)adaptor.create(LBRACE260)
            ;
            adaptor.addChild(root_0, LBRACE260_tree);
            }

            // JVM.g:393:3: ( switchLine )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==INTLITERAL) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // JVM.g:393:3: switchLine
            	    {
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch1703);
            	    switchLine261=switchLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchLine261.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch1708);
            switchDefaultLine262=switchDefaultLine();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, switchDefaultLine262.getTree());

            RBRACE263=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_javaSwitch1712); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE263_tree = 
            (Object)adaptor.create(RBRACE263)
            ;
            adaptor.addChild(root_0, RBRACE263_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:398:1: switchLine : pc INTLITERAL ;
    public final JVMParser.switchLine_return switchLine() throws RecognitionException {
        JVMParser.switchLine_return retval = new JVMParser.switchLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL265=null;
        JVMParser.pc_return pc264 =null;


        Object INTLITERAL265_tree=null;

        try {
            // JVM.g:399:2: ( pc INTLITERAL )
            // JVM.g:399:4: pc INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_switchLine1725);
            pc264=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc264.getTree());

            INTLITERAL265=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine1727); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL265_tree = 
            (Object)adaptor.create(INTLITERAL265)
            ;
            adaptor.addChild(root_0, INTLITERAL265_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:402:1: switchDefaultLine : DEFAULT COLON INTLITERAL ;
    public final JVMParser.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        JVMParser.switchDefaultLine_return retval = new JVMParser.switchDefaultLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT266=null;
        Token COLON267=null;
        Token INTLITERAL268=null;

        Object DEFAULT266_tree=null;
        Object COLON267_tree=null;
        Object INTLITERAL268_tree=null;

        try {
            // JVM.g:403:2: ( DEFAULT COLON INTLITERAL )
            // JVM.g:403:4: DEFAULT COLON INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            DEFAULT266=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine1739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT266_tree = 
            (Object)adaptor.create(DEFAULT266)
            ;
            adaptor.addChild(root_0, DEFAULT266_tree);
            }

            COLON267=(Token)match(input,COLON,FOLLOW_COLON_in_switchDefaultLine1741); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON267_tree = 
            (Object)adaptor.create(COLON267)
            ;
            adaptor.addChild(root_0, COLON267_tree);
            }

            INTLITERAL268=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine1743); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL268_tree = 
            (Object)adaptor.create(INTLITERAL268)
            ;
            adaptor.addChild(root_0, INTLITERAL268_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:410:1: throwClause : THROWS javaTypeList ;
    public final JVMParser.throwClause_return throwClause() throws RecognitionException {
        JVMParser.throwClause_return retval = new JVMParser.throwClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token THROWS269=null;
        JVMParser.javaTypeList_return javaTypeList270 =null;


        Object THROWS269_tree=null;

        try {
            // JVM.g:411:2: ( THROWS javaTypeList )
            // JVM.g:411:4: THROWS javaTypeList
            {
            root_0 = (Object)adaptor.nil();


            THROWS269=(Token)match(input,THROWS,FOLLOW_THROWS_in_throwClause1759); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            THROWS269_tree = 
            (Object)adaptor.create(THROWS269)
            ;
            adaptor.addChild(root_0, THROWS269_tree);
            }

            pushFollow(FOLLOW_javaTypeList_in_throwClause1761);
            javaTypeList270=javaTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeList270.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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


    public static class exceptionTable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exceptionTable"
    // JVM.g:414:1: exceptionTable : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+ ;
    public final JVMParser.exceptionTable_return exceptionTable() throws RecognitionException {
        JVMParser.exceptionTable_return retval = new JVMParser.exceptionTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER271=null;
        Token IDENTIFIER272=null;
        Token IDENTIFIER273=null;
        Token IDENTIFIER274=null;
        JVMParser.exceptionTableEntry_return exceptionTableEntry275 =null;


        Object IDENTIFIER271_tree=null;
        Object IDENTIFIER272_tree=null;
        Object IDENTIFIER273_tree=null;
        Object IDENTIFIER274_tree=null;

        try {
            // JVM.g:415:2: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+ )
            // JVM.g:415:4: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER271=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable1772); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER271_tree = 
            (Object)adaptor.create(IDENTIFIER271)
            ;
            adaptor.addChild(root_0, IDENTIFIER271_tree);
            }

            IDENTIFIER272=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable1774); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER272_tree = 
            (Object)adaptor.create(IDENTIFIER272)
            ;
            adaptor.addChild(root_0, IDENTIFIER272_tree);
            }

            IDENTIFIER273=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable1776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER273_tree = 
            (Object)adaptor.create(IDENTIFIER273)
            ;
            adaptor.addChild(root_0, IDENTIFIER273_tree);
            }

            IDENTIFIER274=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable1778); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER274_tree = 
            (Object)adaptor.create(IDENTIFIER274)
            ;
            adaptor.addChild(root_0, IDENTIFIER274_tree);
            }

            // JVM.g:416:3: ( exceptionTableEntry )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==INTLITERAL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // JVM.g:416:3: exceptionTableEntry
            	    {
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable1783);
            	    exceptionTableEntry275=exceptionTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exceptionTableEntry275.getTree());

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
    // $ANTLR end "exceptionTable"


    public static class exceptionTableEntry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exceptionTableEntry"
    // JVM.g:419:1: exceptionTableEntry : INTLITERAL INTLITERAL INTLITERAL ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE ) ;
    public final JVMParser.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        JVMParser.exceptionTableEntry_return retval = new JVMParser.exceptionTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL276=null;
        Token INTLITERAL277=null;
        Token INTLITERAL278=null;
        Token IDENTIFIER280=null;
        Token CONSTANT_TYPE_ASSIGNABLE281=null;
        JVMParser.primitiveType_return primitiveType279 =null;


        Object INTLITERAL276_tree=null;
        Object INTLITERAL277_tree=null;
        Object INTLITERAL278_tree=null;
        Object IDENTIFIER280_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE281_tree=null;

        try {
            // JVM.g:420:2: ( INTLITERAL INTLITERAL INTLITERAL ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE ) )
            // JVM.g:420:4: INTLITERAL INTLITERAL INTLITERAL ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL276=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry1795); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL276_tree = 
            (Object)adaptor.create(INTLITERAL276)
            ;
            adaptor.addChild(root_0, INTLITERAL276_tree);
            }

            INTLITERAL277=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry1797); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL277_tree = 
            (Object)adaptor.create(INTLITERAL277)
            ;
            adaptor.addChild(root_0, INTLITERAL277_tree);
            }

            INTLITERAL278=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry1799); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL278_tree = 
            (Object)adaptor.create(INTLITERAL278)
            ;
            adaptor.addChild(root_0, INTLITERAL278_tree);
            }

            // JVM.g:420:37: ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
            int alt54=3;
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
                alt54=1;
                }
                break;
            case IDENTIFIER:
                {
                alt54=2;
                }
                break;
            case CONSTANT_TYPE_ASSIGNABLE:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // JVM.g:420:38: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntry1802);
                    primitiveType279=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType279.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:420:55: IDENTIFIER
                    {
                    IDENTIFIER280=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntry1807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER280_tree = 
                    (Object)adaptor.create(IDENTIFIER280)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER280_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:420:69: CONSTANT_TYPE_ASSIGNABLE
                    {
                    CONSTANT_TYPE_ASSIGNABLE281=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntry1812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT_TYPE_ASSIGNABLE281_tree = 
                    (Object)adaptor.create(CONSTANT_TYPE_ASSIGNABLE281)
                    ;
                    adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE281_tree);
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
    // JVM.g:427:1: lineNumberTable : ( lineNumberTableLine )* ;
    public final JVMParser.lineNumberTable_return lineNumberTable() throws RecognitionException {
        JVMParser.lineNumberTable_return retval = new JVMParser.lineNumberTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.lineNumberTableLine_return lineNumberTableLine282 =null;



        try {
            // JVM.g:428:2: ( ( lineNumberTableLine )* )
            // JVM.g:428:4: ( lineNumberTableLine )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:428:4: ( lineNumberTableLine )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==IDENTIFIER) ) {
                    int LA55_2 = input.LA(2);

                    if ( (LA55_2==INTLITERAL) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // JVM.g:428:4: lineNumberTableLine
            	    {
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable1830);
            	    lineNumberTableLine282=lineNumberTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lineNumberTableLine282.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // JVM.g:431:1: lineNumberTableLine : IDENTIFIER pc INTLITERAL ;
    public final JVMParser.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        JVMParser.lineNumberTableLine_return retval = new JVMParser.lineNumberTableLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER283=null;
        Token INTLITERAL285=null;
        JVMParser.pc_return pc284 =null;


        Object IDENTIFIER283_tree=null;
        Object INTLITERAL285_tree=null;

        try {
            // JVM.g:432:2: ( IDENTIFIER pc INTLITERAL )
            // JVM.g:432:4: IDENTIFIER pc INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER283=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine1842); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER283_tree = 
            (Object)adaptor.create(IDENTIFIER283)
            ;
            adaptor.addChild(root_0, IDENTIFIER283_tree);
            }

            pushFollow(FOLLOW_pc_in_lineNumberTableLine1844);
            pc284=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc284.getTree());

            INTLITERAL285=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine1846); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL285_tree = 
            (Object)adaptor.create(INTLITERAL285)
            ;
            adaptor.addChild(root_0, INTLITERAL285_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:439:1: localVariableTable : IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )* ;
    public final JVMParser.localVariableTable_return localVariableTable() throws RecognitionException {
        JVMParser.localVariableTable_return retval = new JVMParser.localVariableTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER286=null;
        Token IDENTIFIER287=null;
        Token IDENTIFIER288=null;
        Token IDENTIFIER289=null;
        Token IDENTIFIER290=null;
        JVMParser.localVariableTableLine_return localVariableTableLine291 =null;


        Object IDENTIFIER286_tree=null;
        Object IDENTIFIER287_tree=null;
        Object IDENTIFIER288_tree=null;
        Object IDENTIFIER289_tree=null;
        Object IDENTIFIER290_tree=null;

        try {
            // JVM.g:440:2: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )* )
            // JVM.g:440:4: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )*
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1864); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER286_tree = 
            (Object)adaptor.create(IDENTIFIER286)
            ;
            adaptor.addChild(root_0, IDENTIFIER286_tree);
            }

            IDENTIFIER287=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1866); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER287_tree = 
            (Object)adaptor.create(IDENTIFIER287)
            ;
            adaptor.addChild(root_0, IDENTIFIER287_tree);
            }

            IDENTIFIER288=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1868); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER288_tree = 
            (Object)adaptor.create(IDENTIFIER288)
            ;
            adaptor.addChild(root_0, IDENTIFIER288_tree);
            }

            IDENTIFIER289=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER289_tree = 
            (Object)adaptor.create(IDENTIFIER289)
            ;
            adaptor.addChild(root_0, IDENTIFIER289_tree);
            }

            IDENTIFIER290=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1872); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER290_tree = 
            (Object)adaptor.create(IDENTIFIER290)
            ;
            adaptor.addChild(root_0, IDENTIFIER290_tree);
            }

            // JVM.g:441:3: ( localVariableTableLine )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==INTLITERAL) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // JVM.g:441:3: localVariableTableLine
            	    {
            	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable1877);
            	    localVariableTableLine291=localVariableTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableTableLine291.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "localVariableTable"


    public static class localVariableTableLine_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableTableLine"
    // JVM.g:444:1: localVariableTableLine : INTLITERAL INTLITERAL INTLITERAL ( IDENTIFIER | primitiveType | DEFAULT ) bytecodeType ;
    public final JVMParser.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        JVMParser.localVariableTableLine_return retval = new JVMParser.localVariableTableLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL292=null;
        Token INTLITERAL293=null;
        Token INTLITERAL294=null;
        Token IDENTIFIER295=null;
        Token DEFAULT297=null;
        JVMParser.primitiveType_return primitiveType296 =null;

        JVMParser.bytecodeType_return bytecodeType298 =null;


        Object INTLITERAL292_tree=null;
        Object INTLITERAL293_tree=null;
        Object INTLITERAL294_tree=null;
        Object IDENTIFIER295_tree=null;
        Object DEFAULT297_tree=null;

        try {
            // JVM.g:445:2: ( INTLITERAL INTLITERAL INTLITERAL ( IDENTIFIER | primitiveType | DEFAULT ) bytecodeType )
            // JVM.g:445:4: INTLITERAL INTLITERAL INTLITERAL ( IDENTIFIER | primitiveType | DEFAULT ) bytecodeType
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL292=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine1890); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL292_tree = 
            (Object)adaptor.create(INTLITERAL292)
            ;
            adaptor.addChild(root_0, INTLITERAL292_tree);
            }

            INTLITERAL293=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine1892); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL293_tree = 
            (Object)adaptor.create(INTLITERAL293)
            ;
            adaptor.addChild(root_0, INTLITERAL293_tree);
            }

            INTLITERAL294=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine1894); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL294_tree = 
            (Object)adaptor.create(INTLITERAL294)
            ;
            adaptor.addChild(root_0, INTLITERAL294_tree);
            }

            // JVM.g:445:37: ( IDENTIFIER | primitiveType | DEFAULT )
            int alt57=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt57=1;
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
                alt57=2;
                }
                break;
            case DEFAULT:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // JVM.g:445:38: IDENTIFIER
                    {
                    IDENTIFIER295=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTableLine1897); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER295_tree = 
                    (Object)adaptor.create(IDENTIFIER295)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER295_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:445:51: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_localVariableTableLine1901);
                    primitiveType296=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType296.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:445:67: DEFAULT
                    {
                    DEFAULT297=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_localVariableTableLine1905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT297_tree = 
                    (Object)adaptor.create(DEFAULT297)
                    ;
                    adaptor.addChild(root_0, DEFAULT297_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine1908);
            bytecodeType298=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType298.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:451:1: stackMapTypeTable : IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+ ;
    public final JVMParser.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        JVMParser.stackMapTypeTable_return retval = new JVMParser.stackMapTypeTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER299=null;
        Token ASSIGN300=null;
        Token INTLITERAL301=null;
        JVMParser.stackMapTypeTableEntry_return stackMapTypeTableEntry302 =null;


        Object IDENTIFIER299_tree=null;
        Object ASSIGN300_tree=null;
        Object INTLITERAL301_tree=null;

        try {
            // JVM.g:452:2: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+ )
            // JVM.g:452:4: IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER299=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable1923); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER299_tree = 
            (Object)adaptor.create(IDENTIFIER299)
            ;
            adaptor.addChild(root_0, IDENTIFIER299_tree);
            }

            ASSIGN300=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable1925); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN300_tree = 
            (Object)adaptor.create(ASSIGN300)
            ;
            adaptor.addChild(root_0, ASSIGN300_tree);
            }

            INTLITERAL301=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable1927); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL301_tree = 
            (Object)adaptor.create(INTLITERAL301)
            ;
            adaptor.addChild(root_0, INTLITERAL301_tree);
            }

            // JVM.g:453:3: ( stackMapTypeTableEntry )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==IDENTIFIER) ) {
                    int LA58_2 = input.LA(2);

                    if ( (LA58_2==ASSIGN) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // JVM.g:453:3: stackMapTypeTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable1932);
            	    stackMapTypeTableEntry302=stackMapTypeTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTypeTableEntry302.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // $ANTLR end "stackMapTypeTable"


    public static class stackMapTypeTableEntry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stackMapTypeTableEntry"
    // JVM.g:456:1: stackMapTypeTableEntry : IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer ;
    public final JVMParser.stackMapTypeTableEntry_return stackMapTypeTableEntry() throws RecognitionException {
        JVMParser.stackMapTypeTableEntry_return retval = new JVMParser.stackMapTypeTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER303=null;
        Token ASSIGN304=null;
        Token INTLITERAL305=null;
        Token IDENTIFIER306=null;
        Token ASSIGN307=null;
        Token INTLITERAL308=null;
        Token IDENTIFIER309=null;
        Token ASSIGN310=null;
        Token IDENTIFIER312=null;
        Token ASSIGN313=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer311 =null;

        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer314 =null;


        Object IDENTIFIER303_tree=null;
        Object ASSIGN304_tree=null;
        Object INTLITERAL305_tree=null;
        Object IDENTIFIER306_tree=null;
        Object ASSIGN307_tree=null;
        Object INTLITERAL308_tree=null;
        Object IDENTIFIER309_tree=null;
        Object ASSIGN310_tree=null;
        Object IDENTIFIER312_tree=null;
        Object ASSIGN313_tree=null;

        try {
            // JVM.g:457:2: ( IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer )
            // JVM.g:457:4: IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER303=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1944); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER303_tree = 
            (Object)adaptor.create(IDENTIFIER303)
            ;
            adaptor.addChild(root_0, IDENTIFIER303_tree);
            }

            ASSIGN304=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry1946); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN304_tree = 
            (Object)adaptor.create(ASSIGN304)
            ;
            adaptor.addChild(root_0, ASSIGN304_tree);
            }

            INTLITERAL305=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry1948); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL305_tree = 
            (Object)adaptor.create(INTLITERAL305)
            ;
            adaptor.addChild(root_0, INTLITERAL305_tree);
            }

            IDENTIFIER306=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1950); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER306_tree = 
            (Object)adaptor.create(IDENTIFIER306)
            ;
            adaptor.addChild(root_0, IDENTIFIER306_tree);
            }

            ASSIGN307=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry1952); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN307_tree = 
            (Object)adaptor.create(ASSIGN307)
            ;
            adaptor.addChild(root_0, ASSIGN307_tree);
            }

            INTLITERAL308=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry1954); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL308_tree = 
            (Object)adaptor.create(INTLITERAL308)
            ;
            adaptor.addChild(root_0, INTLITERAL308_tree);
            }

            IDENTIFIER309=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1959); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER309_tree = 
            (Object)adaptor.create(IDENTIFIER309)
            ;
            adaptor.addChild(root_0, IDENTIFIER309_tree);
            }

            ASSIGN310=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry1961); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN310_tree = 
            (Object)adaptor.create(ASSIGN310)
            ;
            adaptor.addChild(root_0, ASSIGN310_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry1963);
            stackMapTableTypesContainer311=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer311.getTree());

            IDENTIFIER312=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1968); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER312_tree = 
            (Object)adaptor.create(IDENTIFIER312)
            ;
            adaptor.addChild(root_0, IDENTIFIER312_tree);
            }

            ASSIGN313=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry1970); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN313_tree = 
            (Object)adaptor.create(ASSIGN313)
            ;
            adaptor.addChild(root_0, ASSIGN313_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry1972);
            stackMapTableTypesContainer314=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer314.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:466:1: stackMapTable : IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+ ;
    public final JVMParser.stackMapTable_return stackMapTable() throws RecognitionException {
        JVMParser.stackMapTable_return retval = new JVMParser.stackMapTable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER315=null;
        Token ASSIGN316=null;
        Token INTLITERAL317=null;
        JVMParser.stackMapTableEntry_return stackMapTableEntry318 =null;


        Object IDENTIFIER315_tree=null;
        Object ASSIGN316_tree=null;
        Object INTLITERAL317_tree=null;

        try {
            // JVM.g:467:2: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+ )
            // JVM.g:467:4: IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER315=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable1988); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER315_tree = 
            (Object)adaptor.create(IDENTIFIER315)
            ;
            adaptor.addChild(root_0, IDENTIFIER315_tree);
            }

            ASSIGN316=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable1990); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN316_tree = 
            (Object)adaptor.create(ASSIGN316)
            ;
            adaptor.addChild(root_0, ASSIGN316_tree);
            }

            INTLITERAL317=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable1992); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL317_tree = 
            (Object)adaptor.create(INTLITERAL317)
            ;
            adaptor.addChild(root_0, INTLITERAL317_tree);
            }

            // JVM.g:468:3: ( stackMapTableEntry )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==IDENTIFIER) ) {
                    int LA59_2 = input.LA(2);

                    if ( (LA59_2==ASSIGN) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // JVM.g:468:3: stackMapTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable1997);
            	    stackMapTableEntry318=stackMapTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableEntry318.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
    // JVM.g:470:1: stackMapTableEntry : IDENTIFIER ASSIGN ( INTLITERAL | stackMapTableTypesContainer ) ;
    public final JVMParser.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        JVMParser.stackMapTableEntry_return retval = new JVMParser.stackMapTableEntry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER319=null;
        Token ASSIGN320=null;
        Token INTLITERAL321=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer322 =null;


        Object IDENTIFIER319_tree=null;
        Object ASSIGN320_tree=null;
        Object INTLITERAL321_tree=null;

        try {
            // JVM.g:471:2: ( IDENTIFIER ASSIGN ( INTLITERAL | stackMapTableTypesContainer ) )
            // JVM.g:471:4: IDENTIFIER ASSIGN ( INTLITERAL | stackMapTableTypesContainer )
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER319=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry2008); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER319_tree = 
            (Object)adaptor.create(IDENTIFIER319)
            ;
            adaptor.addChild(root_0, IDENTIFIER319_tree);
            }

            ASSIGN320=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry2010); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN320_tree = 
            (Object)adaptor.create(ASSIGN320)
            ;
            adaptor.addChild(root_0, ASSIGN320_tree);
            }

            // JVM.g:471:22: ( INTLITERAL | stackMapTableTypesContainer )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==INTLITERAL) ) {
                alt60=1;
            }
            else if ( (LA60_0==LBRACK) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // JVM.g:471:23: INTLITERAL
                    {
                    INTLITERAL321=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntry2013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL321_tree = 
                    (Object)adaptor.create(INTLITERAL321)
                    ;
                    adaptor.addChild(root_0, INTLITERAL321_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:471:36: stackMapTableTypesContainer
                    {
                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntry2017);
                    stackMapTableTypesContainer322=stackMapTableTypesContainer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer322.getTree());

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
    // JVM.g:474:1: stackMapTableTypesContainer : LBRACK ( stackMapTableTypes )? RBRACK ;
    public final JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        JVMParser.stackMapTableTypesContainer_return retval = new JVMParser.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK323=null;
        Token RBRACK325=null;
        JVMParser.stackMapTableTypes_return stackMapTableTypes324 =null;


        Object LBRACK323_tree=null;
        Object RBRACK325_tree=null;

        try {
            // JVM.g:475:2: ( LBRACK ( stackMapTableTypes )? RBRACK )
            // JVM.g:475:4: LBRACK ( stackMapTableTypes )? RBRACK
            {
            root_0 = (Object)adaptor.nil();


            LBRACK323=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_stackMapTableTypesContainer2030); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK323_tree = 
            (Object)adaptor.create(LBRACK323)
            ;
            adaptor.addChild(root_0, LBRACK323_tree);
            }

            // JVM.g:475:11: ( stackMapTableTypes )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==BOOLEAN||LA61_0==BYTE||LA61_0==CHAR||LA61_0==CLASS||LA61_0==DOUBLE||LA61_0==FLOAT||LA61_0==INT||LA61_0==LONG||LA61_0==SHORT||LA61_0==VOID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // JVM.g:475:11: stackMapTableTypes
                    {
                    pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2032);
                    stackMapTableTypes324=stackMapTableTypes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypes324.getTree());

                    }
                    break;

            }


            RBRACK325=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_stackMapTableTypesContainer2035); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACK325_tree = 
            (Object)adaptor.create(RBRACK325)
            ;
            adaptor.addChild(root_0, RBRACK325_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:478:1: stackMapTableTypes : stackMapTableType ( COMMA stackMapTableType )* -> ( stackMapTableType )+ ;
    public final JVMParser.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        JVMParser.stackMapTableTypes_return retval = new JVMParser.stackMapTableTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA327=null;
        JVMParser.stackMapTableType_return stackMapTableType326 =null;

        JVMParser.stackMapTableType_return stackMapTableType328 =null;


        Object COMMA327_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_stackMapTableType=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableType");
        try {
            // JVM.g:479:2: ( stackMapTableType ( COMMA stackMapTableType )* -> ( stackMapTableType )+ )
            // JVM.g:479:4: stackMapTableType ( COMMA stackMapTableType )*
            {
            pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes2047);
            stackMapTableType326=stackMapTableType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType326.getTree());

            // JVM.g:479:22: ( COMMA stackMapTableType )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==COMMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // JVM.g:479:23: COMMA stackMapTableType
            	    {
            	    COMMA327=(Token)match(input,COMMA,FOLLOW_COMMA_in_stackMapTableTypes2050); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA327);


            	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes2052);
            	    stackMapTableType328=stackMapTableType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType328.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
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
            // 479:49: -> ( stackMapTableType )+
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
    // JVM.g:482:1: stackMapTableType : ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType ) ;
    public final JVMParser.stackMapTableType_return stackMapTableType() throws RecognitionException {
        JVMParser.stackMapTableType_return retval = new JVMParser.stackMapTableType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.stackMapTableTypeObject_return stackMapTableTypeObject329 =null;

        JVMParser.stackMapTableTypePlainObject_return stackMapTableTypePlainObject330 =null;

        JVMParser.primitiveType_return primitiveType331 =null;



        try {
            // JVM.g:483:2: ( ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType ) )
            // JVM.g:483:4: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType )
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:483:4: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType )
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==CLASS) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==STRINGLITERAL) ) {
                    alt63=1;
                }
                else if ( (LA63_1==IDENTIFIER||LA63_1==INTERNALTYPE) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA63_0==BOOLEAN||LA63_0==BYTE||LA63_0==CHAR||LA63_0==DOUBLE||LA63_0==FLOAT||LA63_0==INT||LA63_0==LONG||LA63_0==SHORT||LA63_0==VOID) ) {
                alt63=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // JVM.g:483:5: stackMapTableTypeObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType2071);
                    stackMapTableTypeObject329=stackMapTableTypeObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypeObject329.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:483:29: stackMapTableTypePlainObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2073);
                    stackMapTableTypePlainObject330=stackMapTableTypePlainObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypePlainObject330.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:483:58: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType2075);
                    primitiveType331=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType331.getTree());

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
    // JVM.g:485:1: stackMapTableTypePlainObject : CLASS ( INTERNALTYPE | IDENTIFIER ) ;
    public final JVMParser.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        JVMParser.stackMapTableTypePlainObject_return retval = new JVMParser.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS332=null;
        Token set333=null;

        Object CLASS332_tree=null;
        Object set333_tree=null;

        try {
            // JVM.g:486:2: ( CLASS ( INTERNALTYPE | IDENTIFIER ) )
            // JVM.g:486:4: CLASS ( INTERNALTYPE | IDENTIFIER )
            {
            root_0 = (Object)adaptor.nil();


            CLASS332=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject2086); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS332_tree = 
            (Object)adaptor.create(CLASS332)
            ;
            adaptor.addChild(root_0, CLASS332_tree);
            }

            set333=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set333)
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
    // JVM.g:488:1: stackMapTableTypeObject : CLASS STRINGLITERAL ;
    public final JVMParser.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        JVMParser.stackMapTableTypeObject_return retval = new JVMParser.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS334=null;
        Token STRINGLITERAL335=null;

        Object CLASS334_tree=null;
        Object STRINGLITERAL335_tree=null;

        try {
            // JVM.g:489:2: ( CLASS STRINGLITERAL )
            // JVM.g:489:4: CLASS STRINGLITERAL
            {
            root_0 = (Object)adaptor.nil();


            CLASS334=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject2104); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS334_tree = 
            (Object)adaptor.create(CLASS334)
            ;
            adaptor.addChild(root_0, CLASS334_tree);
            }

            STRINGLITERAL335=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2106); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLITERAL335_tree = 
            (Object)adaptor.create(STRINGLITERAL335)
            ;
            adaptor.addChild(root_0, STRINGLITERAL335_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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


    public static class genericConstraintType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericConstraintType"
    // JVM.g:500:1: genericConstraintType : javaType genericConstraintList ;
    public final JVMParser.genericConstraintType_return genericConstraintType() throws RecognitionException {
        JVMParser.genericConstraintType_return retval = new JVMParser.genericConstraintType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.javaType_return javaType336 =null;

        JVMParser.genericConstraintList_return genericConstraintList337 =null;



        try {
            // JVM.g:501:2: ( javaType genericConstraintList )
            // JVM.g:501:4: javaType genericConstraintList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_javaType_in_genericConstraintType2125);
            javaType336=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType336.getTree());

            pushFollow(FOLLOW_genericConstraintList_in_genericConstraintType2127);
            genericConstraintList337=genericConstraintList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraintList337.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "genericConstraintType"


    public static class genericConstraintList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericConstraintList"
    // JVM.g:504:1: genericConstraintList : LESST genericConstraints ( COMMA genericConstraints )* LARGET -> ( genericConstraints )+ ;
    public final JVMParser.genericConstraintList_return genericConstraintList() throws RecognitionException {
        JVMParser.genericConstraintList_return retval = new JVMParser.genericConstraintList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST338=null;
        Token COMMA340=null;
        Token LARGET342=null;
        JVMParser.genericConstraints_return genericConstraints339 =null;

        JVMParser.genericConstraints_return genericConstraints341 =null;


        Object LESST338_tree=null;
        Object COMMA340_tree=null;
        Object LARGET342_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_genericConstraints=new RewriteRuleSubtreeStream(adaptor,"rule genericConstraints");
        try {
            // JVM.g:505:2: ( LESST genericConstraints ( COMMA genericConstraints )* LARGET -> ( genericConstraints )+ )
            // JVM.g:505:4: LESST genericConstraints ( COMMA genericConstraints )* LARGET
            {
            LESST338=(Token)match(input,LESST,FOLLOW_LESST_in_genericConstraintList2139); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST338);


            pushFollow(FOLLOW_genericConstraints_in_genericConstraintList2141);
            genericConstraints339=genericConstraints();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_genericConstraints.add(genericConstraints339.getTree());

            // JVM.g:505:29: ( COMMA genericConstraints )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==COMMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // JVM.g:505:30: COMMA genericConstraints
            	    {
            	    COMMA340=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericConstraintList2144); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA340);


            	    pushFollow(FOLLOW_genericConstraints_in_genericConstraintList2146);
            	    genericConstraints341=genericConstraints();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_genericConstraints.add(genericConstraints341.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            LARGET342=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericConstraintList2150); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET342);


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
            // 505:64: -> ( genericConstraints )+
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
    // JVM.g:508:1: genericConstraints : identifier EXTENDS ( genericType | javaType ) ( AND ( genericType | javaType ) )* ;
    public final JVMParser.genericConstraints_return genericConstraints() throws RecognitionException {
        JVMParser.genericConstraints_return retval = new JVMParser.genericConstraints_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS344=null;
        Token AND347=null;
        JVMParser.identifier_return identifier343 =null;

        JVMParser.genericType_return genericType345 =null;

        JVMParser.javaType_return javaType346 =null;

        JVMParser.genericType_return genericType348 =null;

        JVMParser.javaType_return javaType349 =null;


        Object EXTENDS344_tree=null;
        Object AND347_tree=null;

        try {
            // JVM.g:509:2: ( identifier EXTENDS ( genericType | javaType ) ( AND ( genericType | javaType ) )* )
            // JVM.g:509:4: identifier EXTENDS ( genericType | javaType ) ( AND ( genericType | javaType ) )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_genericConstraints2166);
            identifier343=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier343.getTree());

            EXTENDS344=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericConstraints2168); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS344_tree = 
            (Object)adaptor.create(EXTENDS344)
            ;
            adaptor.addChild(root_0, EXTENDS344_tree);
            }

            // JVM.g:509:23: ( genericType | javaType )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==NORMALTYPE) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==LESST) ) {
                    alt65=1;
                }
                else if ( (LA65_1==AND||LA65_1==COMMA||LA65_1==LARGET) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA65_0==BaseType||LA65_0==DEFAULT||LA65_0==IDENTIFIER||LA65_0==VoidType) ) {
                int LA65_2 = input.LA(2);

                if ( (LA65_2==LESST) ) {
                    alt65=1;
                }
                else if ( (LA65_2==AND||LA65_2==COMMA||LA65_2==LARGET) ) {
                    alt65=2;
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
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // JVM.g:509:24: genericType
                    {
                    pushFollow(FOLLOW_genericType_in_genericConstraints2171);
                    genericType345=genericType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericType345.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:509:38: javaType
                    {
                    pushFollow(FOLLOW_javaType_in_genericConstraints2175);
                    javaType346=javaType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType346.getTree());

                    }
                    break;

            }


            // JVM.g:509:48: ( AND ( genericType | javaType ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==AND) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // JVM.g:509:49: AND ( genericType | javaType )
            	    {
            	    AND347=(Token)match(input,AND,FOLLOW_AND_in_genericConstraints2179); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND347_tree = 
            	    (Object)adaptor.create(AND347)
            	    ;
            	    adaptor.addChild(root_0, AND347_tree);
            	    }

            	    // JVM.g:509:53: ( genericType | javaType )
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==NORMALTYPE) ) {
            	        int LA66_1 = input.LA(2);

            	        if ( (LA66_1==LESST) ) {
            	            alt66=1;
            	        }
            	        else if ( (LA66_1==AND||LA66_1==COMMA||LA66_1==LARGET) ) {
            	            alt66=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 66, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else if ( (LA66_0==BaseType||LA66_0==DEFAULT||LA66_0==IDENTIFIER||LA66_0==VoidType) ) {
            	        int LA66_2 = input.LA(2);

            	        if ( (LA66_2==LESST) ) {
            	            alt66=1;
            	        }
            	        else if ( (LA66_2==AND||LA66_2==COMMA||LA66_2==LARGET) ) {
            	            alt66=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 66, 2, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 66, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // JVM.g:509:54: genericType
            	            {
            	            pushFollow(FOLLOW_genericType_in_genericConstraints2182);
            	            genericType348=genericType();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericType348.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // JVM.g:509:68: javaType
            	            {
            	            pushFollow(FOLLOW_javaType_in_genericConstraints2186);
            	            javaType349=javaType();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType349.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
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
    // $ANTLR end "genericConstraints"


    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeList"
    // JVM.g:512:1: typeList : aggregatedJavaType ( COMMA aggregatedJavaType )* -> ( aggregatedJavaType )+ ;
    public final JVMParser.typeList_return typeList() throws RecognitionException {
        JVMParser.typeList_return retval = new JVMParser.typeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA351=null;
        JVMParser.aggregatedJavaType_return aggregatedJavaType350 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType352 =null;


        Object COMMA351_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_aggregatedJavaType=new RewriteRuleSubtreeStream(adaptor,"rule aggregatedJavaType");
        try {
            // JVM.g:513:3: ( aggregatedJavaType ( COMMA aggregatedJavaType )* -> ( aggregatedJavaType )+ )
            // JVM.g:513:5: aggregatedJavaType ( COMMA aggregatedJavaType )*
            {
            pushFollow(FOLLOW_aggregatedJavaType_in_typeList2201);
            aggregatedJavaType350=aggregatedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_aggregatedJavaType.add(aggregatedJavaType350.getTree());

            // JVM.g:513:24: ( COMMA aggregatedJavaType )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // JVM.g:513:25: COMMA aggregatedJavaType
            	    {
            	    COMMA351=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList2204); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA351);


            	    pushFollow(FOLLOW_aggregatedJavaType_in_typeList2206);
            	    aggregatedJavaType352=aggregatedJavaType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_aggregatedJavaType.add(aggregatedJavaType352.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
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
            // 513:52: -> ( aggregatedJavaType )+
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
    // JVM.g:516:1: aggregatedJavaType : ( primitiveType | javaTypeIdentifier ( DOT javaTypeIdentifier )? ) ( LBRACK RBRACK )* ;
    public final JVMParser.aggregatedJavaType_return aggregatedJavaType() throws RecognitionException {
        JVMParser.aggregatedJavaType_return retval = new JVMParser.aggregatedJavaType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT355=null;
        Token LBRACK357=null;
        Token RBRACK358=null;
        JVMParser.primitiveType_return primitiveType353 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier354 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier356 =null;


        Object DOT355_tree=null;
        Object LBRACK357_tree=null;
        Object RBRACK358_tree=null;

        try {
            // JVM.g:517:2: ( ( primitiveType | javaTypeIdentifier ( DOT javaTypeIdentifier )? ) ( LBRACK RBRACK )* )
            // JVM.g:517:4: ( primitiveType | javaTypeIdentifier ( DOT javaTypeIdentifier )? ) ( LBRACK RBRACK )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:517:4: ( primitiveType | javaTypeIdentifier ( DOT javaTypeIdentifier )? )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==BOOLEAN||LA70_0==BYTE||LA70_0==CHAR||LA70_0==DOUBLE||LA70_0==FLOAT||LA70_0==INT||LA70_0==LONG||LA70_0==SHORT||LA70_0==VOID) ) {
                alt70=1;
            }
            else if ( (LA70_0==BaseType||LA70_0==DEFAULT||LA70_0==IDENTIFIER||LA70_0==NORMALTYPE||LA70_0==VoidType) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // JVM.g:517:5: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_aggregatedJavaType2229);
                    primitiveType353=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType353.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:517:21: javaTypeIdentifier ( DOT javaTypeIdentifier )?
                    {
                    pushFollow(FOLLOW_javaTypeIdentifier_in_aggregatedJavaType2233);
                    javaTypeIdentifier354=javaTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier354.getTree());

                    // JVM.g:517:40: ( DOT javaTypeIdentifier )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DOT) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==BaseType||LA69_1==DEFAULT||LA69_1==IDENTIFIER||LA69_1==NORMALTYPE||LA69_1==VoidType) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // JVM.g:517:41: DOT javaTypeIdentifier
                            {
                            DOT355=(Token)match(input,DOT,FOLLOW_DOT_in_aggregatedJavaType2236); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DOT355_tree = 
                            (Object)adaptor.create(DOT355)
                            ;
                            adaptor.addChild(root_0, DOT355_tree);
                            }

                            pushFollow(FOLLOW_javaTypeIdentifier_in_aggregatedJavaType2238);
                            javaTypeIdentifier356=javaTypeIdentifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier356.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // JVM.g:517:67: ( LBRACK RBRACK )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==LBRACK) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // JVM.g:517:68: LBRACK RBRACK
            	    {
            	    LBRACK357=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_aggregatedJavaType2244); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LBRACK357_tree = 
            	    (Object)adaptor.create(LBRACK357)
            	    ;
            	    adaptor.addChild(root_0, LBRACK357_tree);
            	    }

            	    RBRACK358=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_aggregatedJavaType2246); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RBRACK358_tree = 
            	    (Object)adaptor.create(RBRACK358)
            	    ;
            	    adaptor.addChild(root_0, RBRACK358_tree);
            	    }

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
    // $ANTLR end "aggregatedJavaType"


    public static class javaTypeIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "javaTypeIdentifier"
    // JVM.g:520:1: javaTypeIdentifier : ( javaType | genericConstraintType | genericType );
    public final JVMParser.javaTypeIdentifier_return javaTypeIdentifier() throws RecognitionException {
        JVMParser.javaTypeIdentifier_return retval = new JVMParser.javaTypeIdentifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.javaType_return javaType359 =null;

        JVMParser.genericConstraintType_return genericConstraintType360 =null;

        JVMParser.genericType_return genericType361 =null;



        try {
            // JVM.g:521:2: ( javaType | genericConstraintType | genericType )
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==NORMALTYPE) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==BaseType||LA72_1==COMMA||(LA72_1 >= DEFAULT && LA72_1 <= DOT)||LA72_1==Deprecated||(LA72_1 >= EXTENDS && LA72_1 <= EnclosingMethod)||LA72_1==Flag||(LA72_1 >= IDENTIFIER && LA72_1 <= IMPLEMENTS)||LA72_1==InnerClasses||LA72_1==LARGET||LA72_1==LBRACK||LA72_1==LPAREN||(LA72_1 >= MAJOR_VERSION && LA72_1 <= MINOR_VERSION)||LA72_1==NORMALTYPE||(LA72_1 >= RPAREN && LA72_1 <= RuntimeVisibleAnnotations)||(LA72_1 >= Scala && LA72_1 <= SourceFile)||LA72_1==Synthetic||LA72_1==VoidType) ) {
                    alt72=1;
                }
                else if ( (LA72_1==LESST) ) {
                    int LA72_4 = input.LA(3);

                    if ( (LA72_4==BaseType||LA72_4==DEFAULT||LA72_4==IDENTIFIER||LA72_4==VoidType) ) {
                        int LA72_5 = input.LA(4);

                        if ( (LA72_5==EXTENDS) ) {
                            alt72=2;
                        }
                        else if ( (LA72_5==COMMA||LA72_5==DOT||LA72_5==LARGET||(LA72_5 >= LBRACK && LA72_5 <= LESST)) ) {
                            alt72=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 72, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA72_4==BOOLEAN||LA72_4==BYTE||LA72_4==CHAR||LA72_4==DOUBLE||LA72_4==FLOAT||LA72_4==INT||LA72_4==LONG||LA72_4==NORMALTYPE||LA72_4==QUESTION||LA72_4==SHORT||LA72_4==VOID) ) {
                        alt72=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA72_0==BaseType||LA72_0==DEFAULT||LA72_0==IDENTIFIER||LA72_0==VoidType) ) {
                int LA72_2 = input.LA(2);

                if ( (LA72_2==BaseType||LA72_2==COMMA||(LA72_2 >= DEFAULT && LA72_2 <= DOT)||LA72_2==Deprecated||(LA72_2 >= EXTENDS && LA72_2 <= EnclosingMethod)||LA72_2==Flag||(LA72_2 >= IDENTIFIER && LA72_2 <= IMPLEMENTS)||LA72_2==InnerClasses||LA72_2==LARGET||LA72_2==LBRACK||LA72_2==LPAREN||(LA72_2 >= MAJOR_VERSION && LA72_2 <= MINOR_VERSION)||LA72_2==NORMALTYPE||(LA72_2 >= RPAREN && LA72_2 <= RuntimeVisibleAnnotations)||(LA72_2 >= Scala && LA72_2 <= SourceFile)||LA72_2==Synthetic||LA72_2==VoidType) ) {
                    alt72=1;
                }
                else if ( (LA72_2==LESST) ) {
                    int LA72_4 = input.LA(3);

                    if ( (LA72_4==BaseType||LA72_4==DEFAULT||LA72_4==IDENTIFIER||LA72_4==VoidType) ) {
                        int LA72_5 = input.LA(4);

                        if ( (LA72_5==EXTENDS) ) {
                            alt72=2;
                        }
                        else if ( (LA72_5==COMMA||LA72_5==DOT||LA72_5==LARGET||(LA72_5 >= LBRACK && LA72_5 <= LESST)) ) {
                            alt72=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 72, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA72_4==BOOLEAN||LA72_4==BYTE||LA72_4==CHAR||LA72_4==DOUBLE||LA72_4==FLOAT||LA72_4==INT||LA72_4==LONG||LA72_4==NORMALTYPE||LA72_4==QUESTION||LA72_4==SHORT||LA72_4==VOID) ) {
                        alt72=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }
            switch (alt72) {
                case 1 :
                    // JVM.g:521:4: javaType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_javaType_in_javaTypeIdentifier2260);
                    javaType359=javaType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType359.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:521:15: genericConstraintType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_genericConstraintType_in_javaTypeIdentifier2264);
                    genericConstraintType360=genericConstraintType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraintType360.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:521:39: genericType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_genericType_in_javaTypeIdentifier2268);
                    genericType361=genericType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericType361.getTree());

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
    // $ANTLR end "javaTypeIdentifier"


    public static class genericType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericType"
    // JVM.g:524:1: genericType : javaType genericList ;
    public final JVMParser.genericType_return genericType() throws RecognitionException {
        JVMParser.genericType_return retval = new JVMParser.genericType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.javaType_return javaType362 =null;

        JVMParser.genericList_return genericList363 =null;



        try {
            // JVM.g:525:2: ( javaType genericList )
            // JVM.g:525:4: javaType genericList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_javaType_in_genericType2280);
            javaType362=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType362.getTree());

            pushFollow(FOLLOW_genericList_in_genericType2282);
            genericList363=genericList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericList363.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "genericType"


    public static class genericList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericList"
    // JVM.g:528:1: genericList : LESST ( genericConstraint | aggregatedJavaType ) ( COMMA ( genericConstraint | aggregatedJavaType ) )* LARGET ;
    public final JVMParser.genericList_return genericList() throws RecognitionException {
        JVMParser.genericList_return retval = new JVMParser.genericList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST364=null;
        Token COMMA367=null;
        Token LARGET370=null;
        JVMParser.genericConstraint_return genericConstraint365 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType366 =null;

        JVMParser.genericConstraint_return genericConstraint368 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType369 =null;


        Object LESST364_tree=null;
        Object COMMA367_tree=null;
        Object LARGET370_tree=null;

        try {
            // JVM.g:529:2: ( LESST ( genericConstraint | aggregatedJavaType ) ( COMMA ( genericConstraint | aggregatedJavaType ) )* LARGET )
            // JVM.g:529:4: LESST ( genericConstraint | aggregatedJavaType ) ( COMMA ( genericConstraint | aggregatedJavaType ) )* LARGET
            {
            root_0 = (Object)adaptor.nil();


            LESST364=(Token)match(input,LESST,FOLLOW_LESST_in_genericList2294); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST364_tree = 
            (Object)adaptor.create(LESST364)
            ;
            adaptor.addChild(root_0, LESST364_tree);
            }

            // JVM.g:529:10: ( genericConstraint | aggregatedJavaType )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==QUESTION) ) {
                alt73=1;
            }
            else if ( (LA73_0==BOOLEAN||(LA73_0 >= BYTE && LA73_0 <= CHAR)||LA73_0==DEFAULT||LA73_0==DOUBLE||LA73_0==FLOAT||LA73_0==IDENTIFIER||LA73_0==INT||LA73_0==LONG||LA73_0==NORMALTYPE||LA73_0==SHORT||LA73_0==VOID||LA73_0==VoidType) ) {
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
                    // JVM.g:529:11: genericConstraint
                    {
                    pushFollow(FOLLOW_genericConstraint_in_genericList2297);
                    genericConstraint365=genericConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraint365.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:529:29: aggregatedJavaType
                    {
                    pushFollow(FOLLOW_aggregatedJavaType_in_genericList2299);
                    aggregatedJavaType366=aggregatedJavaType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType366.getTree());

                    }
                    break;

            }


            // JVM.g:529:49: ( COMMA ( genericConstraint | aggregatedJavaType ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==COMMA) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // JVM.g:529:50: COMMA ( genericConstraint | aggregatedJavaType )
            	    {
            	    COMMA367=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericList2303); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA367_tree = 
            	    (Object)adaptor.create(COMMA367)
            	    ;
            	    adaptor.addChild(root_0, COMMA367_tree);
            	    }

            	    // JVM.g:529:56: ( genericConstraint | aggregatedJavaType )
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==QUESTION) ) {
            	        alt74=1;
            	    }
            	    else if ( (LA74_0==BOOLEAN||(LA74_0 >= BYTE && LA74_0 <= CHAR)||LA74_0==DEFAULT||LA74_0==DOUBLE||LA74_0==FLOAT||LA74_0==IDENTIFIER||LA74_0==INT||LA74_0==LONG||LA74_0==NORMALTYPE||LA74_0==SHORT||LA74_0==VOID||LA74_0==VoidType) ) {
            	        alt74=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 74, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // JVM.g:529:57: genericConstraint
            	            {
            	            pushFollow(FOLLOW_genericConstraint_in_genericList2306);
            	            genericConstraint368=genericConstraint();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraint368.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // JVM.g:529:75: aggregatedJavaType
            	            {
            	            pushFollow(FOLLOW_aggregatedJavaType_in_genericList2308);
            	            aggregatedJavaType369=aggregatedJavaType();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType369.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            LARGET370=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericList2313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET370_tree = 
            (Object)adaptor.create(LARGET370)
            ;
            adaptor.addChild(root_0, LARGET370_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:532:1: genericConstraint : QUESTION ( ( SUPER | EXTENDS ) ( genericType | javaType ) )? ;
    public final JVMParser.genericConstraint_return genericConstraint() throws RecognitionException {
        JVMParser.genericConstraint_return retval = new JVMParser.genericConstraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QUESTION371=null;
        Token set372=null;
        JVMParser.genericType_return genericType373 =null;

        JVMParser.javaType_return javaType374 =null;


        Object QUESTION371_tree=null;
        Object set372_tree=null;

        try {
            // JVM.g:533:2: ( QUESTION ( ( SUPER | EXTENDS ) ( genericType | javaType ) )? )
            // JVM.g:533:4: QUESTION ( ( SUPER | EXTENDS ) ( genericType | javaType ) )?
            {
            root_0 = (Object)adaptor.nil();


            QUESTION371=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_genericConstraint2325); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUESTION371_tree = 
            (Object)adaptor.create(QUESTION371)
            ;
            adaptor.addChild(root_0, QUESTION371_tree);
            }

            // JVM.g:533:13: ( ( SUPER | EXTENDS ) ( genericType | javaType ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==EXTENDS||LA77_0==SUPER) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // JVM.g:533:14: ( SUPER | EXTENDS ) ( genericType | javaType )
                    {
                    set372=(Token)input.LT(1);

                    if ( input.LA(1)==EXTENDS||input.LA(1)==SUPER ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set372)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // JVM.g:533:33: ( genericType | javaType )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NORMALTYPE) ) {
                        int LA76_1 = input.LA(2);

                        if ( (LA76_1==LESST) ) {
                            alt76=1;
                        }
                        else if ( (LA76_1==COMMA||LA76_1==LARGET) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 1, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA76_0==BaseType||LA76_0==DEFAULT||LA76_0==IDENTIFIER||LA76_0==VoidType) ) {
                        int LA76_2 = input.LA(2);

                        if ( (LA76_2==LESST) ) {
                            alt76=1;
                        }
                        else if ( (LA76_2==COMMA||LA76_2==LARGET) ) {
                            alt76=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 2, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;

                    }
                    switch (alt76) {
                        case 1 :
                            // JVM.g:533:34: genericType
                            {
                            pushFollow(FOLLOW_genericType_in_genericConstraint2338);
                            genericType373=genericType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericType373.getTree());

                            }
                            break;
                        case 2 :
                            // JVM.g:533:48: javaType
                            {
                            pushFollow(FOLLOW_javaType_in_genericConstraint2342);
                            javaType374=javaType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType374.getTree());

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
    // $ANTLR end "genericConstraint"


    public static class genericGeneric_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericGeneric"
    // JVM.g:536:1: genericGeneric : javaType LESST ( javaType ) ( COMMA ( javaType ) )* LARGET ;
    public final JVMParser.genericGeneric_return genericGeneric() throws RecognitionException {
        JVMParser.genericGeneric_return retval = new JVMParser.genericGeneric_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST376=null;
        Token COMMA378=null;
        Token LARGET380=null;
        JVMParser.javaType_return javaType375 =null;

        JVMParser.javaType_return javaType377 =null;

        JVMParser.javaType_return javaType379 =null;


        Object LESST376_tree=null;
        Object COMMA378_tree=null;
        Object LARGET380_tree=null;

        try {
            // JVM.g:537:2: ( javaType LESST ( javaType ) ( COMMA ( javaType ) )* LARGET )
            // JVM.g:537:4: javaType LESST ( javaType ) ( COMMA ( javaType ) )* LARGET
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_javaType_in_genericGeneric2356);
            javaType375=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType375.getTree());

            LESST376=(Token)match(input,LESST,FOLLOW_LESST_in_genericGeneric2358); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST376_tree = 
            (Object)adaptor.create(LESST376)
            ;
            adaptor.addChild(root_0, LESST376_tree);
            }

            // JVM.g:537:19: ( javaType )
            // JVM.g:537:20: javaType
            {
            pushFollow(FOLLOW_javaType_in_genericGeneric2361);
            javaType377=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType377.getTree());

            }


            // JVM.g:537:30: ( COMMA ( javaType ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==COMMA) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // JVM.g:537:31: COMMA ( javaType )
            	    {
            	    COMMA378=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericGeneric2365); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA378_tree = 
            	    (Object)adaptor.create(COMMA378)
            	    ;
            	    adaptor.addChild(root_0, COMMA378_tree);
            	    }

            	    // JVM.g:537:37: ( javaType )
            	    // JVM.g:537:38: javaType
            	    {
            	    pushFollow(FOLLOW_javaType_in_genericGeneric2368);
            	    javaType379=javaType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType379.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            LARGET380=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericGeneric2373); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET380_tree = 
            (Object)adaptor.create(LARGET380)
            ;
            adaptor.addChild(root_0, LARGET380_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "genericGeneric"


    public static class javaTypeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "javaTypeList"
    // JVM.g:540:1: javaTypeList : javaType ( COMMA javaType )* -> ( javaType )+ ;
    public final JVMParser.javaTypeList_return javaTypeList() throws RecognitionException {
        JVMParser.javaTypeList_return retval = new JVMParser.javaTypeList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA382=null;
        JVMParser.javaType_return javaType381 =null;

        JVMParser.javaType_return javaType383 =null;


        Object COMMA382_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_javaType=new RewriteRuleSubtreeStream(adaptor,"rule javaType");
        try {
            // JVM.g:541:2: ( javaType ( COMMA javaType )* -> ( javaType )+ )
            // JVM.g:541:4: javaType ( COMMA javaType )*
            {
            pushFollow(FOLLOW_javaType_in_javaTypeList2384);
            javaType381=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaType.add(javaType381.getTree());

            // JVM.g:541:13: ( COMMA javaType )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==COMMA) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // JVM.g:541:14: COMMA javaType
            	    {
            	    COMMA382=(Token)match(input,COMMA,FOLLOW_COMMA_in_javaTypeList2387); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA382);


            	    pushFollow(FOLLOW_javaType_in_javaTypeList2389);
            	    javaType383=javaType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaType.add(javaType383.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
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
            // 541:31: -> ( javaType )+
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
    // JVM.g:544:1: javaType : ( NORMALTYPE | identifier );
    public final JVMParser.javaType_return javaType() throws RecognitionException {
        JVMParser.javaType_return retval = new JVMParser.javaType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NORMALTYPE384=null;
        JVMParser.identifier_return identifier385 =null;


        Object NORMALTYPE384_tree=null;

        try {
            // JVM.g:545:2: ( NORMALTYPE | identifier )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==NORMALTYPE) ) {
                alt80=1;
            }
            else if ( (LA80_0==BaseType||LA80_0==DEFAULT||LA80_0==IDENTIFIER||LA80_0==VoidType) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // JVM.g:545:4: NORMALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    NORMALTYPE384=(Token)match(input,NORMALTYPE,FOLLOW_NORMALTYPE_in_javaType2407); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NORMALTYPE384_tree = 
                    (Object)adaptor.create(NORMALTYPE384)
                    ;
                    adaptor.addChild(root_0, NORMALTYPE384_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:545:17: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_javaType2411);
                    identifier385=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier385.getTree());

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


    public static class genericReturn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericReturn"
    // JVM.g:552:1: genericReturn : LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET -> ( genericReturnDescriptor )+ ;
    public final JVMParser.genericReturn_return genericReturn() throws RecognitionException {
        JVMParser.genericReturn_return retval = new JVMParser.genericReturn_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESST386=null;
        Token COMMA388=null;
        Token LARGET390=null;
        JVMParser.genericReturnDescriptor_return genericReturnDescriptor387 =null;

        JVMParser.genericReturnDescriptor_return genericReturnDescriptor389 =null;


        Object LESST386_tree=null;
        Object COMMA388_tree=null;
        Object LARGET390_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_genericReturnDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule genericReturnDescriptor");
        try {
            // JVM.g:553:2: ( LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET -> ( genericReturnDescriptor )+ )
            // JVM.g:553:4: LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET
            {
            LESST386=(Token)match(input,LESST,FOLLOW_LESST_in_genericReturn2427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST386);


            pushFollow(FOLLOW_genericReturnDescriptor_in_genericReturn2429);
            genericReturnDescriptor387=genericReturnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor387.getTree());

            // JVM.g:553:34: ( COMMA genericReturnDescriptor )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // JVM.g:553:35: COMMA genericReturnDescriptor
            	    {
            	    COMMA388=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericReturn2432); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA388);


            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericReturn2434);
            	    genericReturnDescriptor389=genericReturnDescriptor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor389.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            LARGET390=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericReturn2438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET390);


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
            // 553:74: -> ( genericReturnDescriptor )+
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
    // $ANTLR end "genericReturn"


    public static class genericReturnDescriptor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericReturnDescriptor"
    // JVM.g:556:1: genericReturnDescriptor : identifier EXTENDS ( bytecodeObjectType | BaseType ) ;
    public final JVMParser.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        JVMParser.genericReturnDescriptor_return retval = new JVMParser.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS392=null;
        Token BaseType394=null;
        JVMParser.identifier_return identifier391 =null;

        JVMParser.bytecodeObjectType_return bytecodeObjectType393 =null;


        Object EXTENDS392_tree=null;
        Object BaseType394_tree=null;

        try {
            // JVM.g:557:2: ( identifier EXTENDS ( bytecodeObjectType | BaseType ) )
            // JVM.g:557:4: identifier EXTENDS ( bytecodeObjectType | BaseType )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor2454);
            identifier391=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier391.getTree());

            EXTENDS392=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor2456); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS392_tree = 
            (Object)adaptor.create(EXTENDS392)
            ;
            adaptor.addChild(root_0, EXTENDS392_tree);
            }

            // JVM.g:557:23: ( bytecodeObjectType | BaseType )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==IDENTIFIER||LA82_0==INTERNALTYPE) ) {
                alt82=1;
            }
            else if ( (LA82_0==BaseType) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // JVM.g:557:24: bytecodeObjectType
                    {
                    pushFollow(FOLLOW_bytecodeObjectType_in_genericReturnDescriptor2459);
                    bytecodeObjectType393=bytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectType393.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:557:45: BaseType
                    {
                    BaseType394=(Token)match(input,BaseType,FOLLOW_BaseType_in_genericReturnDescriptor2463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BaseType394_tree = 
                    (Object)adaptor.create(BaseType394)
                    ;
                    adaptor.addChild(root_0, BaseType394_tree);
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
    // $ANTLR end "genericReturnDescriptor"


    public static class bytecodeObjectType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeObjectType"
    // JVM.g:560:1: bytecodeObjectType : ( INTERNALTYPE | IDENTIFIER | genericBydecodeObjectType );
    public final JVMParser.bytecodeObjectType_return bytecodeObjectType() throws RecognitionException {
        JVMParser.bytecodeObjectType_return retval = new JVMParser.bytecodeObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERNALTYPE395=null;
        Token IDENTIFIER396=null;
        JVMParser.genericBydecodeObjectType_return genericBydecodeObjectType397 =null;


        Object INTERNALTYPE395_tree=null;
        Object IDENTIFIER396_tree=null;

        try {
            // JVM.g:561:3: ( INTERNALTYPE | IDENTIFIER | genericBydecodeObjectType )
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==INTERNALTYPE) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==LESST) ) {
                    alt83=3;
                }
                else if ( (LA83_1==COMMA||LA83_1==LARGET) ) {
                    alt83=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA83_0==IDENTIFIER) ) {
                int LA83_2 = input.LA(2);

                if ( (LA83_2==LESST) ) {
                    alt83=3;
                }
                else if ( (LA83_2==COMMA||LA83_2==LARGET) ) {
                    alt83=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }
            switch (alt83) {
                case 1 :
                    // JVM.g:561:5: INTERNALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERNALTYPE395=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeObjectType2477); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE395_tree = 
                    (Object)adaptor.create(INTERNALTYPE395)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE395_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:562:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER396=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeObjectType2483); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER396_tree = 
                    (Object)adaptor.create(IDENTIFIER396)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER396_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:563:5: genericBydecodeObjectType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_genericBydecodeObjectType_in_bytecodeObjectType2489);
                    genericBydecodeObjectType397=genericBydecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericBydecodeObjectType397.getTree());

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
    // $ANTLR end "bytecodeObjectType"


    public static class genericBydecodeObjectType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericBydecodeObjectType"
    // JVM.g:566:1: genericBydecodeObjectType : ( INTERNALTYPE | IDENTIFIER ) LESST bytecodeObjectType ( COMMA bytecodeObjectType )* LARGET ;
    public final JVMParser.genericBydecodeObjectType_return genericBydecodeObjectType() throws RecognitionException {
        JVMParser.genericBydecodeObjectType_return retval = new JVMParser.genericBydecodeObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set398=null;
        Token LESST399=null;
        Token COMMA401=null;
        Token LARGET403=null;
        JVMParser.bytecodeObjectType_return bytecodeObjectType400 =null;

        JVMParser.bytecodeObjectType_return bytecodeObjectType402 =null;


        Object set398_tree=null;
        Object LESST399_tree=null;
        Object COMMA401_tree=null;
        Object LARGET403_tree=null;

        try {
            // JVM.g:567:2: ( ( INTERNALTYPE | IDENTIFIER ) LESST bytecodeObjectType ( COMMA bytecodeObjectType )* LARGET )
            // JVM.g:567:4: ( INTERNALTYPE | IDENTIFIER ) LESST bytecodeObjectType ( COMMA bytecodeObjectType )* LARGET
            {
            root_0 = (Object)adaptor.nil();


            set398=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set398)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            LESST399=(Token)match(input,LESST,FOLLOW_LESST_in_genericBydecodeObjectType2509); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST399_tree = 
            (Object)adaptor.create(LESST399)
            ;
            adaptor.addChild(root_0, LESST399_tree);
            }

            pushFollow(FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType2511);
            bytecodeObjectType400=bytecodeObjectType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectType400.getTree());

            // JVM.g:567:57: ( COMMA bytecodeObjectType )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // JVM.g:567:58: COMMA bytecodeObjectType
            	    {
            	    COMMA401=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericBydecodeObjectType2514); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA401_tree = 
            	    (Object)adaptor.create(COMMA401)
            	    ;
            	    adaptor.addChild(root_0, COMMA401_tree);
            	    }

            	    pushFollow(FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType2516);
            	    bytecodeObjectType402=bytecodeObjectType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectType402.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            LARGET403=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericBydecodeObjectType2520); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET403_tree = 
            (Object)adaptor.create(LARGET403)
            ;
            adaptor.addChild(root_0, LARGET403_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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


    public static class bytecodeType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bytecodeType"
    // JVM.g:574:1: bytecodeType : ( bytecodeArrayType | bytecodeBaseType | combinedBytecodeObjectType SEMI | IDENTIFIER );
    public final JVMParser.bytecodeType_return bytecodeType() throws RecognitionException {
        JVMParser.bytecodeType_return retval = new JVMParser.bytecodeType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI407=null;
        Token IDENTIFIER408=null;
        JVMParser.bytecodeArrayType_return bytecodeArrayType404 =null;

        JVMParser.bytecodeBaseType_return bytecodeBaseType405 =null;

        JVMParser.combinedBytecodeObjectType_return combinedBytecodeObjectType406 =null;


        Object SEMI407_tree=null;
        Object IDENTIFIER408_tree=null;

        try {
            // JVM.g:575:2: ( bytecodeArrayType | bytecodeBaseType | combinedBytecodeObjectType SEMI | IDENTIFIER )
            int alt85=4;
            switch ( input.LA(1) ) {
            case LBRACK:
                {
                alt85=1;
                }
                break;
            case BaseType:
                {
                alt85=2;
                }
                break;
            case INTERNALTYPE:
            case VersionedInternalType:
                {
                alt85=3;
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
                    case VersionedInternalType:
                        {
                        alt85=3;
                        }
                        break;
                    case BaseType:
                        {
                        int LA85_7 = input.LA(4);

                        if ( (LA85_7==BaseType||LA85_7==IDENTIFIER||LA85_7==INTERNALTYPE||LA85_7==LARGET||LA85_7==LBRACK||LA85_7==MINUS||LA85_7==PLUS||LA85_7==STAR||LA85_7==VersionedInternalType) ) {
                            alt85=3;
                        }
                        else if ( (LA85_7==EXTENDS) ) {
                            alt85=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 85, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA85_8 = input.LA(4);

                        if ( (LA85_8==BaseType||LA85_8==IDENTIFIER||LA85_8==INTERNALTYPE||LA85_8==LARGET||(LA85_8 >= LBRACK && LA85_8 <= LESST)||LA85_8==MINUS||LA85_8==PLUS||LA85_8==SEMI||LA85_8==STAR||LA85_8==VersionedInternalType) ) {
                            alt85=3;
                        }
                        else if ( (LA85_8==EXTENDS) ) {
                            alt85=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 85, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case DEFAULT:
                    case VoidType:
                        {
                        alt85=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case SEMI:
                    {
                    alt85=3;
                    }
                    break;
                case EOF:
                case ABSTRACT:
                case AnnotationDefault:
                case BOOLEAN:
                case BYTE:
                case BaseType:
                case CHAR:
                case DEFAULT:
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
                case NORMALTYPE:
                case PLUS:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case RBRACE:
                case RPAREN:
                case RuntimeVisibleAnnotations:
                case SHORT:
                case STAR:
                case STATIC:
                case SYNCHRONIZED:
                case Signature:
                case StackMap:
                case StackMapTable:
                case Synthetic:
                case TRANSIENT:
                case VOID:
                case VOLATILE:
                case VersionedInternalType:
                case VoidType:
                    {
                    alt85=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }

            switch (alt85) {
                case 1 :
                    // JVM.g:575:4: bytecodeArrayType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType2536);
                    bytecodeArrayType404=bytecodeArrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeArrayType404.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:575:24: bytecodeBaseType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeBaseType_in_bytecodeType2540);
                    bytecodeBaseType405=bytecodeBaseType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeBaseType405.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:575:43: combinedBytecodeObjectType SEMI
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_combinedBytecodeObjectType_in_bytecodeType2544);
                    combinedBytecodeObjectType406=combinedBytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, combinedBytecodeObjectType406.getTree());

                    SEMI407=(Token)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType2546); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI407_tree = 
                    (Object)adaptor.create(SEMI407)
                    ;
                    adaptor.addChild(root_0, SEMI407_tree);
                    }

                    }
                    break;
                case 4 :
                    // JVM.g:575:77: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER408=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType2550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER408_tree = 
                    (Object)adaptor.create(IDENTIFIER408)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER408_tree);
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
    // JVM.g:578:1: bytecodeArrayType : LBRACK ( bytecodeType ) ;
    public final JVMParser.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        JVMParser.bytecodeArrayType_return retval = new JVMParser.bytecodeArrayType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK409=null;
        JVMParser.bytecodeType_return bytecodeType410 =null;


        Object LBRACK409_tree=null;

        try {
            // JVM.g:579:2: ( LBRACK ( bytecodeType ) )
            // JVM.g:579:4: LBRACK ( bytecodeType )
            {
            root_0 = (Object)adaptor.nil();


            LBRACK409=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType2562); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK409_tree = 
            (Object)adaptor.create(LBRACK409)
            ;
            adaptor.addChild(root_0, LBRACK409_tree);
            }

            // JVM.g:579:11: ( bytecodeType )
            // JVM.g:579:12: bytecodeType
            {
            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType2565);
            bytecodeType410=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType410.getTree());

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:582:2: bytecodeBaseType : BaseType ;
    public final JVMParser.bytecodeBaseType_return bytecodeBaseType() throws RecognitionException {
        JVMParser.bytecodeBaseType_return retval = new JVMParser.bytecodeBaseType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BaseType411=null;

        Object BaseType411_tree=null;

        try {
            // JVM.g:583:3: ( BaseType )
            // JVM.g:583:5: BaseType
            {
            root_0 = (Object)adaptor.nil();


            BaseType411=(Token)match(input,BaseType,FOLLOW_BaseType_in_bytecodeBaseType2581); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BaseType411_tree = 
            (Object)adaptor.create(BaseType411)
            ;
            adaptor.addChild(root_0, BaseType411_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:586:2: simpleBytecodeObjectType : ( INTERNALTYPE | IDENTIFIER | genericObjectType );
    public final JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        JVMParser.simpleBytecodeObjectType_return retval = new JVMParser.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERNALTYPE412=null;
        Token IDENTIFIER413=null;
        JVMParser.genericObjectType_return genericObjectType414 =null;


        Object INTERNALTYPE412_tree=null;
        Object IDENTIFIER413_tree=null;

        try {
            // JVM.g:587:3: ( INTERNALTYPE | IDENTIFIER | genericObjectType )
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==INTERNALTYPE) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==LESST) ) {
                    alt86=3;
                }
                else if ( (LA86_1==SEMI) ) {
                    alt86=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA86_0==IDENTIFIER) ) {
                int LA86_2 = input.LA(2);

                if ( (LA86_2==LESST) ) {
                    alt86=3;
                }
                else if ( (LA86_2==SEMI) ) {
                    alt86=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }
            switch (alt86) {
                case 1 :
                    // JVM.g:587:5: INTERNALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERNALTYPE412=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeObjectType2596); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE412_tree = 
                    (Object)adaptor.create(INTERNALTYPE412)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE412_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:588:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER413=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleBytecodeObjectType2602); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER413_tree = 
                    (Object)adaptor.create(IDENTIFIER413)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER413_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:589:5: genericObjectType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_genericObjectType_in_simpleBytecodeObjectType2608);
                    genericObjectType414=genericObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericObjectType414.getTree());

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
    // $ANTLR end "simpleBytecodeObjectType"


    public static class combinedBytecodeObjectType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "combinedBytecodeObjectType"
    // JVM.g:592:1: combinedBytecodeObjectType : ( VersionedInternalType | simpleBytecodeObjectType );
    public final JVMParser.combinedBytecodeObjectType_return combinedBytecodeObjectType() throws RecognitionException {
        JVMParser.combinedBytecodeObjectType_return retval = new JVMParser.combinedBytecodeObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VersionedInternalType415=null;
        JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType416 =null;


        Object VersionedInternalType415_tree=null;

        try {
            // JVM.g:593:3: ( VersionedInternalType | simpleBytecodeObjectType )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==VersionedInternalType) ) {
                alt87=1;
            }
            else if ( (LA87_0==IDENTIFIER||LA87_0==INTERNALTYPE) ) {
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
                    // JVM.g:593:5: VersionedInternalType
                    {
                    root_0 = (Object)adaptor.nil();


                    VersionedInternalType415=(Token)match(input,VersionedInternalType,FOLLOW_VersionedInternalType_in_combinedBytecodeObjectType2622); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VersionedInternalType415_tree = 
                    (Object)adaptor.create(VersionedInternalType415)
                    ;
                    adaptor.addChild(root_0, VersionedInternalType415_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:594:5: simpleBytecodeObjectType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_combinedBytecodeObjectType2628);
                    simpleBytecodeObjectType416=simpleBytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleBytecodeObjectType416.getTree());

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
    // $ANTLR end "combinedBytecodeObjectType"


    public static class genericObjectType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "genericObjectType"
    // JVM.g:597:1: genericObjectType : ( INTERNALTYPE | IDENTIFIER ) LESST ( ( MINUS | PLUS )? bytecodeType | STAR )+ LARGET ;
    public final JVMParser.genericObjectType_return genericObjectType() throws RecognitionException {
        JVMParser.genericObjectType_return retval = new JVMParser.genericObjectType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set417=null;
        Token LESST418=null;
        Token set419=null;
        Token STAR421=null;
        Token LARGET422=null;
        JVMParser.bytecodeType_return bytecodeType420 =null;


        Object set417_tree=null;
        Object LESST418_tree=null;
        Object set419_tree=null;
        Object STAR421_tree=null;
        Object LARGET422_tree=null;

        try {
            // JVM.g:597:18: ( ( INTERNALTYPE | IDENTIFIER ) LESST ( ( MINUS | PLUS )? bytecodeType | STAR )+ LARGET )
            // JVM.g:597:20: ( INTERNALTYPE | IDENTIFIER ) LESST ( ( MINUS | PLUS )? bytecodeType | STAR )+ LARGET
            {
            root_0 = (Object)adaptor.nil();


            set417=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set417)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            LESST418=(Token)match(input,LESST,FOLLOW_LESST_in_genericObjectType2646); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST418_tree = 
            (Object)adaptor.create(LESST418)
            ;
            adaptor.addChild(root_0, LESST418_tree);
            }

            // JVM.g:597:54: ( ( MINUS | PLUS )? bytecodeType | STAR )+
            int cnt89=0;
            loop89:
            do {
                int alt89=3;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==BaseType||LA89_0==IDENTIFIER||LA89_0==INTERNALTYPE||LA89_0==LBRACK||LA89_0==MINUS||LA89_0==PLUS||LA89_0==VersionedInternalType) ) {
                    alt89=1;
                }
                else if ( (LA89_0==STAR) ) {
                    alt89=2;
                }


                switch (alt89) {
            	case 1 :
            	    // JVM.g:597:55: ( MINUS | PLUS )? bytecodeType
            	    {
            	    // JVM.g:597:55: ( MINUS | PLUS )?
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==MINUS||LA88_0==PLUS) ) {
            	        alt88=1;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // JVM.g:
            	            {
            	            set419=(Token)input.LT(1);

            	            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	                input.consume();
            	                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	                (Object)adaptor.create(set419)
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


            	    pushFollow(FOLLOW_bytecodeType_in_genericObjectType2656);
            	    bytecodeType420=bytecodeType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType420.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:597:84: STAR
            	    {
            	    STAR421=(Token)match(input,STAR,FOLLOW_STAR_in_genericObjectType2660); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    STAR421_tree = 
            	    (Object)adaptor.create(STAR421)
            	    ;
            	    adaptor.addChild(root_0, STAR421_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);


            LARGET422=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericObjectType2664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET422_tree = 
            (Object)adaptor.create(LARGET422)
            ;
            adaptor.addChild(root_0, LARGET422_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:603:1: identifier : ( IDENTIFIER | BaseType | VoidType | DEFAULT );
    public final JVMParser.identifier_return identifier() throws RecognitionException {
        JVMParser.identifier_return retval = new JVMParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set423=null;

        Object set423_tree=null;

        try {
            // JVM.g:603:11: ( IDENTIFIER | BaseType | VoidType | DEFAULT )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set423=(Token)input.LT(1);

            if ( input.LA(1)==BaseType||input.LA(1)==DEFAULT||input.LA(1)==IDENTIFIER||input.LA(1)==VoidType ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set423)
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
    // $ANTLR end "identifier"


    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // JVM.g:605:1: primitiveType : ( boolean_type | numeric_type | VOID );
    public final JVMParser.primitiveType_return primitiveType() throws RecognitionException {
        JVMParser.primitiveType_return retval = new JVMParser.primitiveType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID426=null;
        JVMParser.boolean_type_return boolean_type424 =null;

        JVMParser.numeric_type_return numeric_type425 =null;


        Object VOID426_tree=null;

        try {
            // JVM.g:606:2: ( boolean_type | numeric_type | VOID )
            int alt90=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt90=1;
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
                alt90=2;
                }
                break;
            case VOID:
                {
                alt90=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }

            switch (alt90) {
                case 1 :
                    // JVM.g:606:4: boolean_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_boolean_type_in_primitiveType2696);
                    boolean_type424=boolean_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_type424.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:607:4: numeric_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numeric_type_in_primitiveType2701);
                    numeric_type425=numeric_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_type425.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:608:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID426=(Token)match(input,VOID,FOLLOW_VOID_in_primitiveType2706); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID426_tree = 
                    (Object)adaptor.create(VOID426)
                    ;
                    adaptor.addChild(root_0, VOID426_tree);
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
    // JVM.g:611:1: boolean_type : BOOLEAN ;
    public final JVMParser.boolean_type_return boolean_type() throws RecognitionException {
        JVMParser.boolean_type_return retval = new JVMParser.boolean_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN427=null;

        Object BOOLEAN427_tree=null;

        try {
            // JVM.g:612:2: ( BOOLEAN )
            // JVM.g:612:4: BOOLEAN
            {
            root_0 = (Object)adaptor.nil();


            BOOLEAN427=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type2717); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN427_tree = 
            (Object)adaptor.create(BOOLEAN427)
            ;
            adaptor.addChild(root_0, BOOLEAN427_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:615:1: numeric_type : ( floating_point_type | integral_type );
    public final JVMParser.numeric_type_return numeric_type() throws RecognitionException {
        JVMParser.numeric_type_return retval = new JVMParser.numeric_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        JVMParser.floating_point_type_return floating_point_type428 =null;

        JVMParser.integral_type_return integral_type429 =null;



        try {
            // JVM.g:616:2: ( floating_point_type | integral_type )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==DOUBLE||LA91_0==FLOAT) ) {
                alt91=1;
            }
            else if ( (LA91_0==BYTE||LA91_0==CHAR||LA91_0==INT||LA91_0==LONG||LA91_0==SHORT) ) {
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
                    // JVM.g:616:4: floating_point_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_floating_point_type_in_numeric_type2728);
                    floating_point_type428=floating_point_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, floating_point_type428.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:617:4: integral_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_integral_type_in_numeric_type2733);
                    integral_type429=integral_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integral_type429.getTree());

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
    // JVM.g:620:1: integral_type : ( BYTE | SHORT | INT | LONG | CHAR );
    public final JVMParser.integral_type_return integral_type() throws RecognitionException {
        JVMParser.integral_type_return retval = new JVMParser.integral_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set430=null;

        Object set430_tree=null;

        try {
            // JVM.g:621:2: ( BYTE | SHORT | INT | LONG | CHAR )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set430=(Token)input.LT(1);

            if ( input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
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


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
    // JVM.g:628:1: floating_point_type : ( FLOAT | DOUBLE );
    public final JVMParser.floating_point_type_return floating_point_type() throws RecognitionException {
        JVMParser.floating_point_type_return retval = new JVMParser.floating_point_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set431=null;

        Object set431_tree=null;

        try {
            // JVM.g:629:2: ( FLOAT | DOUBLE )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set431=(Token)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set431)
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
    // JVM.g:633:1: literals : ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL );
    public final JVMParser.literals_return literals() throws RecognitionException {
        JVMParser.literals_return retval = new JVMParser.literals_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set432=null;

        Object set432_tree=null;

        try {
            // JVM.g:634:2: ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set432=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEANLITERAL||input.LA(1)==CHARLITERAL||input.LA(1)==DOUBLELITERAL||input.LA(1)==FLOATLITERAL||input.LA(1)==INTLITERAL||input.LA(1)==LONGLITERAL||input.LA(1)==STRINGLITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set432)
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
    // $ANTLR end "literals"


    public static class pc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pc"
    // JVM.g:643:1: pc : INTLITERAL COLON ;
    public final JVMParser.pc_return pc() throws RecognitionException {
        JVMParser.pc_return retval = new JVMParser.pc_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTLITERAL433=null;
        Token COLON434=null;

        Object INTLITERAL433_tree=null;
        Object COLON434_tree=null;

        try {
            // JVM.g:644:2: ( INTLITERAL COLON )
            // JVM.g:644:4: INTLITERAL COLON
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL433=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc2832); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL433_tree = 
            (Object)adaptor.create(INTLITERAL433)
            ;
            adaptor.addChild(root_0, INTLITERAL433_tree);
            }

            COLON434=(Token)match(input,COLON,FOLLOW_COLON_in_pc2834); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON434_tree = 
            (Object)adaptor.create(COLON434)
            ;
            adaptor.addChild(root_0, COLON434_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
        // JVM.g:190:3: ( methodDefinition )
        // JVM.g:190:4: methodDefinition
        {
        pushFollow(FOLLOW_methodDefinition_in_synpred1_JVM802);
        methodDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_JVM

    // $ANTLR start synpred2_JVM
    public final void synpred2_JVM_fragment() throws RecognitionException {
        // JVM.g:191:4: ( ctorDefinition )
        // JVM.g:191:5: ctorDefinition
        {
        pushFollow(FOLLOW_ctorDefinition_in_synpred2_JVM813);
        ctorDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_JVM

    // $ANTLR start synpred3_JVM
    public final void synpred3_JVM_fragment() throws RecognitionException {
        // JVM.g:192:4: ( fieldDefinition )
        // JVM.g:192:5: fieldDefinition
        {
        pushFollow(FOLLOW_fieldDefinition_in_synpred3_JVM824);
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


 

    public static final BitSet FOLLOW_class_file_in_program51 = new BitSet(new long[]{0x0009008002009012L,0x0002000000040800L});
    public static final BitSet FOLLOW_class_file_header_in_class_file61 = new BitSet(new long[]{0x0009008002009010L,0x0002000000040800L});
    public static final BitSet FOLLOW_classDefinition_in_class_file63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header74 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header79 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header84 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header89 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info102 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info117 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info119 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info121 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SEMI_in_modified_file_info123 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info125 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info127 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info142 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info144 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_set_in_checksum_file_info146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info166 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info168 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info189 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_major_version_info_in_type_info194 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_minor_version_info_in_type_info199 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_flags_in_type_info204 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info209 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info215 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info220 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info225 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info230 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_deprecated_in_type_info235 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_synthetic_in_type_info240 = new BitSet(new long[]{0x0040040240000002L,0x0000009E01000060L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic253 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated267 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod281 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod283 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod285 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info300 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_sourcefile_info302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_scalaSig_info314 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scalaSig_info323 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_scalaSig_info325 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info327 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info334 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info336 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info352 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info358 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem371 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem373 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_runtimeVisibleAnnotationsItem375 = new BitSet(new long[]{0x0000000000100000L,0x0000000000800000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_runtimeVisibleAnnotationsItem380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList392 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_runtimeVisibleAnnotationAssignList395 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList397 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign417 = new BitSet(new long[]{0x0800000000000080L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationAssign420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationAssign424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_brackedAnnotationAssign436 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssign438 = new BitSet(new long[]{0x0000000000020000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_brackedAnnotationAssign441 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssign443 = new BitSet(new long[]{0x0000000000020000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_in_brackedAnnotationAssign447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition465 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info480 = new BitSet(new long[]{0x0000008000100010L,0x0000000120070200L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info486 = new BitSet(new long[]{0x0000008000100012L,0x0000000120070200L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line500 = new BitSet(new long[]{0x0000008000100010L,0x0000000120070200L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_line503 = new BitSet(new long[]{0x0001000000000042L,0x0000000002000000L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_line507 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_line509 = new BitSet(new long[]{0x0001000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_line512 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_line514 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_line522 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_line524 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SEMI_in_innerclass_info_line529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAJOR_VERSION_in_major_version_info544 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_major_version_info546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINOR_VERSION_in_minor_version_info560 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_version_info562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Flag_in_flags577 = new BitSet(new long[]{0x0021000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_accessFlagList_in_flags579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_Marker_in_flags582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList594 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_accessFlagList597 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList599 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool636 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool638 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_constant_pool640 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool645 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line658 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line660 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition677 = new BitSet(new long[]{0x0009008002009010L,0x0002000000000800L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition680 = new BitSet(new long[]{0x0009008002009010L,0x0002000000000800L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_classDefinition683 = new BitSet(new long[]{0x0042040340000000L,0x0000009E01000060L});
    public static final BitSet FOLLOW_superClass_in_classDefinition685 = new BitSet(new long[]{0x0042040240000000L,0x0000009E01000060L});
    public static final BitSet FOLLOW_superInterface_in_classDefinition688 = new BitSet(new long[]{0x0040040240000000L,0x0000009E01000060L});
    public static final BitSet FOLLOW_type_info_in_classDefinition694 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition698 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_classDefinition702 = new BitSet(new long[]{0x300501800A003A10L,0x0002C20124270A00L});
    public static final BitSet FOLLOW_classBody_in_classDefinition707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_classDefinition712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_superClass725 = new BitSet(new long[]{0x200501000A003A00L,0x0002400004000800L});
    public static final BitSet FOLLOW_typeList_in_superClass727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_superInterface739 = new BitSet(new long[]{0x200501000A003A00L,0x0002400004000800L});
    public static final BitSet FOLLOW_typeList_in_superInterface741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_classBody807 = new BitSet(new long[]{0x300501800A003A12L,0x0002C20124070A00L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBody818 = new BitSet(new long[]{0x300501800A003A12L,0x0002C20124070A00L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBody829 = new BitSet(new long[]{0x300501800A003A12L,0x0002C20124070A00L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBody834 = new BitSet(new long[]{0x300501800A003A12L,0x0002C20124070A00L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition853 = new BitSet(new long[]{0x200501800A003A00L,0x0002C20024000800L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition856 = new BitSet(new long[]{0x200501800A003A00L,0x0002C20024000800L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_fieldDefinition859 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_fieldDefinition861 = new BitSet(new long[]{0x0000000000000040L,0x0000000002000000L});
    public static final BitSet FOLLOW_ASSIGN_in_fieldDefinition864 = new BitSet(new long[]{0x4020020010004400L,0x0000000040000000L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition866 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SEMI_in_fieldDefinition870 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition875 = new BitSet(new long[]{0x0000000040400002L,0x0000008801000000L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition879 = new BitSet(new long[]{0x0000000040400002L,0x0000008801000000L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo891 = new BitSet(new long[]{0x0811000000001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_fieldInfoOption1_in_fieldInfo893 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_flags_in_fieldInfo898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo911 = new BitSet(new long[]{0x2004010008002A00L,0x0000400004000000L});
    public static final BitSet FOLLOW_fieldInfoOption3_in_fieldAdditionalInfo913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo918 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_fieldInfoOption4_in_fieldAdditionalInfo920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo925 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_fieldInfoOption5_in_fieldAdditionalInfo927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo932 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo939 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfoOption1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldInfoOption2973 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_fieldInfoOption2976 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldInfoOption2978 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_primitiveType_in_fieldInfoOption3997 = new BitSet(new long[]{0x4020020010004400L,0x0000000040000000L});
    public static final BitSet FOLLOW_literals_in_fieldInfoOption3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldInfoOption41011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldInfoOption51024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldInfoOption61037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_STATIC_in_staticCtorDefinition1100 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_staticCtorDefinition1102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_staticCtorDefinition1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SEMI_in_staticCtorDefinition1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition1111 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition1131 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_javaType_in_ctorDefinition1134 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition1136 = new BitSet(new long[]{0x0000000000000000L,0x0000010002000000L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SEMI_in_ctorDefinition1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition1146 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_body_in_ctorDefinition1150 = new BitSet(new long[]{0x0000001040000100L,0x0000008801000000L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition1169 = new BitSet(new long[]{0x300501800A003A10L,0x0002400124070A00L});
    public static final BitSet FOLLOW_genericReturn_in_methodDefinition1172 = new BitSet(new long[]{0x200501000A003A00L,0x0002400004000800L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_methodDefinition1175 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_methodDefinition1177 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition1179 = new BitSet(new long[]{0x0000000000000000L,0x0000010002000000L});
    public static final BitSet FOLLOW_throwClause_in_methodDefinition1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SEMI_in_methodDefinition1184 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition1189 = new BitSet(new long[]{0x0000001040200100L,0x0000008801000000L});
    public static final BitSet FOLLOW_body_in_methodDefinition1193 = new BitSet(new long[]{0x0000001040000100L,0x0000008801000000L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_methodInfo1209 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo1211 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfo1229 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_methodDeprecatedInfo_in_afterMethodInfo1231 = new BitSet(new long[]{0x0000001040000102L,0x0000008801000000L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfo1236 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfo1238 = new BitSet(new long[]{0x0000001040000102L,0x0000008801000000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1243 = new BitSet(new long[]{0x0000001040000102L,0x0000008801000000L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfo1248 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfo1251 = new BitSet(new long[]{0x0000001040000102L,0x0000008801000000L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfo1256 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1258 = new BitSet(new long[]{0x0000001040000102L,0x0000008801000000L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfo1263 = new BitSet(new long[]{0x0000001040000102L,0x0000008801000000L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault1278 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault1281 = new BitSet(new long[]{0x0800000000000080L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationDefault1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_annotationDefault1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_in_annotationDefault1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodSignatureInfo1303 = new BitSet(new long[]{0x0811000000001000L,0x0001000000800000L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo1305 = new BitSet(new long[]{0x0811000000001000L,0x0001000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_methodSignatureInfo1308 = new BitSet(new long[]{0x0811000000001000L,0x0003000000000000L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_methodDeprecatedInfo1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments1389 = new BitSet(new long[]{0x200501000E003A00L,0x0002400004800800L});
    public static final BitSet FOLLOW_typeList_in_arguments1391 = new BitSet(new long[]{0x0000000004000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_DOT_in_arguments1395 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_arguments1397 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_arguments1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RPAREN_in_arguments1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Code_in_body1424 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_codeBlock_in_body1429 = new BitSet(new long[]{0x0000000800000002L,0x000000600000000EL});
    public static final BitSet FOLLOW_bodyExtension_in_body1434 = new BitSet(new long[]{0x0000000800000002L,0x000000600000000EL});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension1452 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension1460 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension1468 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension1477 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension1486 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension1493 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_codeBlock1507 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_codeLine_in_codeBlock1513 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_javaSwitch_in_codeBlock1517 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeLine1534 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine1536 = new BitSet(new long[]{0x2024010008102A02L,0x0000400004000000L});
    public static final BitSet FOLLOW_codeValues_in_codeLine1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd1550 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd1552 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_logic3_in_codeBlockEnd1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_codeValues1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic2_in_codeValues1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic3_in_codeValues1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic4_in_codeValues1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_codeValues1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_logic1602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_logic1604 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_logic21618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic31630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic41642 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_logic41644 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic41646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables1657 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_variables1659 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_variable_in_variables1661 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_variables1663 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_variable_in_variables1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable1676 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_variable1678 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_javaSwitch1692 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch1694 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_javaSwitch1698 = new BitSet(new long[]{0x0020000002000000L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch1703 = new BitSet(new long[]{0x0020000002000000L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch1708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACE_in_javaSwitch1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_switchLine1725 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine1739 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_switchDefaultLine1741 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_throwClause1759 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_javaTypeList_in_throwClause1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable1772 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable1774 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable1776 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable1778 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable1783 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry1795 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry1797 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry1799 = new BitSet(new long[]{0x2005010008082A00L,0x0000400004000000L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntry1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntry1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntry1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable1830 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine1842 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine1844 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1864 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1866 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1868 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1870 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1872 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable1877 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine1890 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine1892 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine1894 = new BitSet(new long[]{0x200501000A002A00L,0x0000400004000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTableLine1897 = new BitSet(new long[]{0x0811000000001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_primitiveType_in_localVariableTableLine1901 = new BitSet(new long[]{0x0811000000001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_localVariableTableLine1905 = new BitSet(new long[]{0x0811000000001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable1923 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable1925 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable1927 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable1932 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1944 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry1946 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry1948 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1950 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry1952 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry1954 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1959 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry1961 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry1963 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1968 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry1970 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable1988 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable1990 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable1992 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable1997 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry2008 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry2010 = new BitSet(new long[]{0x0820000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntry2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntry2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_stackMapTableTypesContainer2030 = new BitSet(new long[]{0x200401000800AA00L,0x0000400004400000L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_in_stackMapTableTypesContainer2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes2047 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_stackMapTableTypes2050 = new BitSet(new long[]{0x200401000800AA00L,0x0000400004000000L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes2052 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject2086 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_set_in_stackMapTableTypePlainObject2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_genericConstraintType2125 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_genericConstraintList_in_genericConstraintType2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_genericConstraintList2139 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000000L});
    public static final BitSet FOLLOW_genericConstraints_in_genericConstraintList2141 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericConstraintList2144 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000000L});
    public static final BitSet FOLLOW_genericConstraints_in_genericConstraintList2146 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericConstraintList2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_genericConstraints2166 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_EXTENDS_in_genericConstraints2168 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_genericType_in_genericConstraints2171 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_javaType_in_genericConstraints2175 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_genericConstraints2179 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_genericType_in_genericConstraints2182 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_javaType_in_genericConstraints2186 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_typeList2201 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_typeList2204 = new BitSet(new long[]{0x200501000A003A00L,0x0002400004000800L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_typeList2206 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_primitiveType_in_aggregatedJavaType2229 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_aggregatedJavaType2233 = new BitSet(new long[]{0x0800000004000002L});
    public static final BitSet FOLLOW_DOT_in_aggregatedJavaType2236 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_aggregatedJavaType2238 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_aggregatedJavaType2244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_in_aggregatedJavaType2246 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_javaType_in_javaTypeIdentifier2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericConstraintType_in_javaTypeIdentifier2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericType_in_javaTypeIdentifier2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_genericType2280 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_genericList_in_genericType2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_genericList2294 = new BitSet(new long[]{0x200501000A003A00L,0x0002400004080800L});
    public static final BitSet FOLLOW_genericConstraint_in_genericList2297 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_genericList2299 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericList2303 = new BitSet(new long[]{0x200501000A003A00L,0x0002400004080800L});
    public static final BitSet FOLLOW_genericConstraint_in_genericList2306 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_genericList2308 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericList2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericConstraint2325 = new BitSet(new long[]{0x0000000100000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_set_in_genericConstraint2328 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_genericType_in_genericConstraint2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_genericConstraint2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_genericGeneric2356 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LESST_in_genericGeneric2358 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_javaType_in_genericGeneric2361 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericGeneric2365 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_javaType_in_genericGeneric2368 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericGeneric2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_javaTypeList2384 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_javaTypeList2387 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000800L});
    public static final BitSet FOLLOW_javaType_in_javaTypeList2389 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_NORMALTYPE_in_javaType2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_javaType2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_genericReturn2427 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericReturn2429 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericReturn2432 = new BitSet(new long[]{0x0001000002001000L,0x0002000000000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericReturn2434 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericReturn2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor2454 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor2456 = new BitSet(new long[]{0x0011000000001000L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_genericReturnDescriptor2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_genericReturnDescriptor2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeObjectType2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeObjectType2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericBydecodeObjectType_in_bytecodeObjectType2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_genericBydecodeObjectType2501 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LESST_in_genericBydecodeObjectType2509 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType2511 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericBydecodeObjectType2514 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType2516 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericBydecodeObjectType2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeBaseType_in_bytecodeType2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_combinedBytecodeObjectType_in_bytecodeType2544 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType2562 = new BitSet(new long[]{0x0811000000001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeBaseType2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeObjectType2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleBytecodeObjectType2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericObjectType_in_simpleBytecodeObjectType2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VersionedInternalType_in_combinedBytecodeObjectType2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_combinedBytecodeObjectType2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_genericObjectType2638 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LESST_in_genericObjectType2646 = new BitSet(new long[]{0x0811000000001000L,0x0001000010008080L});
    public static final BitSet FOLLOW_bytecodeType_in_genericObjectType2656 = new BitSet(new long[]{0x0A11000000001000L,0x0001000010008080L});
    public static final BitSet FOLLOW_STAR_in_genericObjectType2660 = new BitSet(new long[]{0x0A11000000001000L,0x0001000010008080L});
    public static final BitSet FOLLOW_LARGET_in_genericObjectType2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc2832 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_pc2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_synpred1_JVM802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_synpred2_JVM813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_synpred3_JVM824 = new BitSet(new long[]{0x0000000000000002L});

}